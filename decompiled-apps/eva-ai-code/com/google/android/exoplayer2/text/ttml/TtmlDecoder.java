package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.location.LocationRequestCompat;
import com.facebook.appevents.UserDataStore;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ColorParser;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* loaded from: classes2.dex */
public final class TtmlDecoder extends SimpleSubtitleDecoder {
    private static final String ATTR_BEGIN = "begin";
    private static final String ATTR_DURATION = "dur";
    private static final String ATTR_END = "end";
    private static final String ATTR_IMAGE = "backgroundImage";
    private static final String ATTR_REGION = "region";
    private static final String ATTR_STYLE = "style";
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final String TAG = "TtmlDecoder";
    private static final String TTP = "http://www.w3.org/ns/ttml#parameter";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern SIGNED_PERCENTAGE = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern PERCENTAGE_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern PIXEL_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern CELL_RESOLUTION = Pattern.compile("^(\\d+) (\\d+)$");
    private static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new FrameAndTickRate(30.0f, 1, 1);
    private static final CellResolution DEFAULT_CELL_RESOLUTION = new CellResolution(32, 15);

    public TtmlDecoder() {
        super(TAG);
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.xmlParserFactory = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    protected Subtitle decode(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        FrameAndTickRate frameAndTickRate;
        try {
            XmlPullParser newPullParser = this.xmlParserFactory.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new TtmlRegion(""));
            TtsExtent ttsExtent = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            FrameAndTickRate frameAndTickRate2 = DEFAULT_FRAME_AND_TICK_RATE;
            CellResolution cellResolution = DEFAULT_CELL_RESOLUTION;
            int i2 = 0;
            TtmlSubtitle ttmlSubtitle = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            frameAndTickRate2 = parseFrameAndTickRates(newPullParser);
                            cellResolution = parseCellResolution(newPullParser, DEFAULT_CELL_RESOLUTION);
                            ttsExtent = parseTtsExtent(newPullParser);
                        }
                        TtsExtent ttsExtent2 = ttsExtent;
                        FrameAndTickRate frameAndTickRate3 = frameAndTickRate2;
                        CellResolution cellResolution2 = cellResolution;
                        if (isSupportedTag(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                frameAndTickRate = frameAndTickRate3;
                                parseHeader(newPullParser, hashMap, cellResolution2, ttsExtent2, hashMap2, hashMap3);
                            } else {
                                frameAndTickRate = frameAndTickRate3;
                                try {
                                    TtmlNode parseNode = parseNode(newPullParser, ttmlNode, hashMap2, frameAndTickRate);
                                    arrayDeque.push(parseNode);
                                    if (ttmlNode != null) {
                                        ttmlNode.addChild(parseNode);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    Log.w(TAG, "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            frameAndTickRate2 = frameAndTickRate;
                        } else {
                            Log.i(TAG, "Ignoring unsupported tag: " + newPullParser.getName());
                            i2++;
                            frameAndTickRate2 = frameAndTickRate3;
                        }
                        ttsExtent = ttsExtent2;
                        cellResolution = cellResolution2;
                    } else if (eventType == 4) {
                        ((TtmlNode) Assertions.checkNotNull(ttmlNode)).addChild(TtmlNode.buildTextNode(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            ttmlSubtitle = new TtmlSubtitle((TtmlNode) Assertions.checkNotNull((TtmlNode) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            if (ttmlSubtitle != null) {
                return ttmlSubtitle;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new SubtitleDecoderException("Unable to decode source", e3);
        }
    }

    private static FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue(TTP, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] split = Util.split(attributeValue2, " ");
            if (split.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
        } else {
            f = 1.0f;
        }
        FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
        int i = frameAndTickRate.subFrameRate;
        String attributeValue3 = xmlPullParser.getAttributeValue(TTP, "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = frameAndTickRate.tickRate;
        String attributeValue4 = xmlPullParser.getAttributeValue(TTP, "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new FrameAndTickRate(parseInt * f, i, i2);
    }

    private static CellResolution parseCellResolution(XmlPullParser xmlPullParser, CellResolution cellResolution) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "cellResolution");
        if (attributeValue == null) {
            return cellResolution;
        }
        Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return cellResolution;
        }
        try {
            int parseInt = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2)));
            if (parseInt == 0 || parseInt2 == 0) {
                throw new SubtitleDecoderException("Invalid cell resolution " + parseInt + " " + parseInt2);
            }
            return new CellResolution(parseInt, parseInt2);
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return cellResolution;
        }
    }

    private static TtsExtent parseTtsExtent(XmlPullParser xmlPullParser) {
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = PIXEL_COORDINATES.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring non-pixel tts extent: " + attributeValue);
            return null;
        }
        try {
            return new TtsExtent(Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2))));
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed tts extent: " + attributeValue);
            return null;
        }
    }

    private static Map<String, TtmlStyle> parseHeader(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, CellResolution cellResolution, TtsExtent ttsExtent, Map<String, TtmlRegion> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "style")) {
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "style");
                TtmlStyle parseStyleAttributes = parseStyleAttributes(xmlPullParser, new TtmlStyle());
                if (attributeValue != null) {
                    for (String str : parseStyleIds(attributeValue)) {
                        parseStyleAttributes.chain(map.get(str));
                    }
                }
                String id = parseStyleAttributes.getId();
                if (id != null) {
                    map.put(id, parseStyleAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "region")) {
                TtmlRegion parseRegionAttributes = parseRegionAttributes(xmlPullParser, cellResolution, ttsExtent);
                if (parseRegionAttributes != null) {
                    map2.put(parseRegionAttributes.id, parseRegionAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, TtmlNode.TAG_METADATA)) {
                parseMetadata(xmlPullParser, map3);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    private static void parseMetadata(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
        String attributeValue;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "image") && (attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "id")) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_METADATA));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a1, code lost:
        if (r0.equals(com.google.android.exoplayer2.text.ttml.TtmlNode.VERTICAL) == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TtmlRegion parseRegionAttributes(XmlPullParser xmlPullParser, CellResolution cellResolution, TtsExtent ttsExtent) {
        float parseFloat;
        float f;
        float parseFloat2;
        float parseFloat3;
        CellResolution cellResolution2;
        int i;
        float f2;
        String attributeValue;
        int i2;
        String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, "id");
        if (attributeValue2 == null) {
            return null;
        }
        String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, "origin");
        if (attributeValue3 != null) {
            Pattern pattern = PERCENTAGE_COORDINATES;
            Matcher matcher = pattern.matcher(attributeValue3);
            Pattern pattern2 = PIXEL_COORDINATES;
            Matcher matcher2 = pattern2.matcher(attributeValue3);
            if (matcher.matches()) {
                try {
                    float parseFloat4 = Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))) / 100.0f;
                    parseFloat = Float.parseFloat((String) Assertions.checkNotNull(matcher.group(2))) / 100.0f;
                    f = parseFloat4;
                } catch (NumberFormatException unused) {
                    Log.w(TAG, "Ignoring region with malformed origin: " + attributeValue3);
                    return null;
                }
            } else if (!matcher2.matches()) {
                Log.w(TAG, "Ignoring region with unsupported origin: " + attributeValue3);
                return null;
            } else if (ttsExtent == null) {
                Log.w(TAG, "Ignoring region with missing tts:extent: " + attributeValue3);
                return null;
            } else {
                try {
                    int parseInt = Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(1)));
                    f = parseInt / ttsExtent.width;
                    parseFloat = Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(2))) / ttsExtent.height;
                } catch (NumberFormatException unused2) {
                    Log.w(TAG, "Ignoring region with malformed origin: " + attributeValue3);
                    return null;
                }
            }
            String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
            if (attributeValue4 != null) {
                Matcher matcher3 = pattern.matcher(attributeValue4);
                Matcher matcher4 = pattern2.matcher(attributeValue4);
                if (matcher3.matches()) {
                    try {
                        parseFloat2 = Float.parseFloat((String) Assertions.checkNotNull(matcher3.group(1))) / 100.0f;
                        parseFloat3 = Float.parseFloat((String) Assertions.checkNotNull(matcher3.group(2))) / 100.0f;
                    } catch (NumberFormatException unused3) {
                        Log.w(TAG, "Ignoring region with malformed extent: " + attributeValue3);
                        return null;
                    }
                } else if (!matcher4.matches()) {
                    Log.w(TAG, "Ignoring region with unsupported extent: " + attributeValue3);
                    return null;
                } else if (ttsExtent == null) {
                    Log.w(TAG, "Ignoring region with missing tts:extent: " + attributeValue3);
                    return null;
                } else {
                    try {
                        int parseInt2 = Integer.parseInt((String) Assertions.checkNotNull(matcher4.group(1)));
                        parseFloat2 = parseInt2 / ttsExtent.width;
                        parseFloat3 = Integer.parseInt((String) Assertions.checkNotNull(matcher4.group(2))) / ttsExtent.height;
                    } catch (NumberFormatException unused4) {
                        Log.w(TAG, "Ignoring region with malformed extent: " + attributeValue3);
                        return null;
                    }
                }
                String attributeValue5 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                boolean z = false;
                if (attributeValue5 != null) {
                    String lowerCase = Ascii.toLowerCase(attributeValue5);
                    lowerCase.hashCode();
                    if (lowerCase.equals(TtmlNode.CENTER)) {
                        cellResolution2 = cellResolution;
                        f2 = parseFloat + (parseFloat3 / 2.0f);
                        i = 1;
                    } else if (lowerCase.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                        cellResolution2 = cellResolution;
                        f2 = parseFloat + parseFloat3;
                        i = 2;
                    }
                    float f3 = 1.0f / cellResolution2.rows;
                    attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
                    if (attributeValue != null) {
                        String lowerCase2 = Ascii.toLowerCase(attributeValue);
                        lowerCase2.hashCode();
                        switch (lowerCase2.hashCode()) {
                            case 3694:
                                break;
                            case 3553396:
                                if (lowerCase2.equals(TtmlNode.VERTICAL_LR)) {
                                    z = true;
                                    break;
                                }
                                z = true;
                                break;
                            case 3553576:
                                if (lowerCase2.equals(TtmlNode.VERTICAL_RL)) {
                                    z = true;
                                    break;
                                }
                                z = true;
                                break;
                            default:
                                z = true;
                                break;
                        }
                        switch (z) {
                            case false:
                            case true:
                                i2 = 2;
                                break;
                            case true:
                                i2 = 1;
                                break;
                        }
                        return new TtmlRegion(attributeValue2, f, f2, 0, i, parseFloat2, parseFloat3, 1, f3, i2);
                    }
                    i2 = Integer.MIN_VALUE;
                    return new TtmlRegion(attributeValue2, f, f2, 0, i, parseFloat2, parseFloat3, 1, f3, i2);
                }
                cellResolution2 = cellResolution;
                i = 0;
                f2 = parseFloat;
                float f32 = 1.0f / cellResolution2.rows;
                attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
                if (attributeValue != null) {
                }
                i2 = Integer.MIN_VALUE;
                return new TtmlRegion(attributeValue2, f, f2, 0, i, parseFloat2, parseFloat3, 1, f32, i2);
            }
            Log.w(TAG, "Ignoring region without an extent");
            return null;
        }
        Log.w(TAG, "Ignoring region without an origin");
        return null;
    }

    private static String[] parseStyleIds(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : Util.split(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01dd, code lost:
        if (r3.equals("text") == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TtmlStyle parseStyleAttributes(XmlPullParser xmlPullParser, TtmlStyle ttmlStyle) {
        char c;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.hashCode();
            char c2 = 5;
            char c3 = 65535;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_STYLE)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_FAMILY)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_RUBY)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_SHEAR)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_COMBINE)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_SIZE)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_EMPHASIS)) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_RUBY_POSITION)) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals(TtmlNode.ATTR_EBUTTS_MULTI_ROW_ALIGN)) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    ttmlStyle = createIfNull(ttmlStyle).setItalic(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    ttmlStyle = createIfNull(ttmlStyle).setFontFamily(attributeValue);
                    break;
                case 2:
                    ttmlStyle = createIfNull(ttmlStyle).setTextAlign(parseAlignment(attributeValue));
                    break;
                case 3:
                    String lowerCase = Ascii.toLowerCase(attributeValue);
                    lowerCase.hashCode();
                    switch (lowerCase.hashCode()) {
                        case -1461280213:
                            if (lowerCase.equals(TtmlNode.NO_UNDERLINE)) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (lowerCase.equals(TtmlNode.UNDERLINE)) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 913457136:
                            if (lowerCase.equals(TtmlNode.NO_LINETHROUGH)) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (lowerCase.equals(TtmlNode.LINETHROUGH)) {
                                c3 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c3) {
                        case 0:
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(false);
                            continue;
                        case 1:
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(true);
                            continue;
                        case 2:
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(false);
                            continue;
                        case 3:
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(true);
                            continue;
                    }
                case 4:
                    ttmlStyle = createIfNull(ttmlStyle).setBold(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        ttmlStyle = createIfNull(ttmlStyle).setId(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String lowerCase2 = Ascii.toLowerCase(attributeValue);
                    lowerCase2.hashCode();
                    switch (lowerCase2.hashCode()) {
                        case -618561360:
                            if (lowerCase2.equals(TtmlNode.RUBY_BASE_CONTAINER)) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -410956671:
                            if (lowerCase2.equals(TtmlNode.RUBY_CONTAINER)) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -250518009:
                            if (lowerCase2.equals(TtmlNode.RUBY_DELIMITER)) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -136074796:
                            if (lowerCase2.equals(TtmlNode.RUBY_TEXT_CONTAINER)) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3016401:
                            if (lowerCase2.equals(TtmlNode.RUBY_BASE)) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3556653:
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                        case 4:
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(2);
                            continue;
                        case 1:
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(1);
                            continue;
                        case 2:
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(4);
                            continue;
                        case 3:
                        case 5:
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(3);
                            continue;
                    }
                case 7:
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setFontColor(ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        Log.w(TAG, "Failed parsing color value: " + attributeValue);
                        break;
                    }
                case '\b':
                    ttmlStyle = createIfNull(ttmlStyle).setShearPercentage(parseShear(attributeValue));
                    break;
                case '\t':
                    String lowerCase3 = Ascii.toLowerCase(attributeValue);
                    lowerCase3.hashCode();
                    if (lowerCase3.equals(TtmlNode.COMBINE_ALL)) {
                        ttmlStyle = createIfNull(ttmlStyle).setTextCombine(true);
                        break;
                    } else if (lowerCase3.equals("none")) {
                        ttmlStyle = createIfNull(ttmlStyle).setTextCombine(false);
                        break;
                    } else {
                        break;
                    }
                case '\n':
                    try {
                        ttmlStyle = createIfNull(ttmlStyle);
                        parseFontSize(attributeValue, ttmlStyle);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        Log.w(TAG, "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                case 11:
                    ttmlStyle = createIfNull(ttmlStyle).setTextEmphasis(TextEmphasis.parse(attributeValue));
                    break;
                case '\f':
                    String lowerCase4 = Ascii.toLowerCase(attributeValue);
                    lowerCase4.hashCode();
                    if (lowerCase4.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
                        ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(1);
                        break;
                    } else if (lowerCase4.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                        ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(2);
                        break;
                    } else {
                        break;
                    }
                case '\r':
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setBackgroundColor(ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        Log.w(TAG, "Failed parsing background value: " + attributeValue);
                        break;
                    }
                case 14:
                    ttmlStyle = createIfNull(ttmlStyle).setMultiRowAlign(parseAlignment(attributeValue));
                    break;
            }
        }
        return ttmlStyle;
    }

    private static TtmlStyle createIfNull(TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    private static Layout.Alignment parseAlignment(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.hashCode();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case -1364013995:
                if (lowerCase.equals(TtmlNode.CENTER)) {
                    c = 0;
                    break;
                }
                break;
            case 100571:
                if (lowerCase.equals("end")) {
                    c = 1;
                    break;
                }
                break;
            case 3317767:
                if (lowerCase.equals("left")) {
                    c = 2;
                    break;
                }
                break;
            case 108511772:
                if (lowerCase.equals(TtmlNode.RIGHT)) {
                    c = 3;
                    break;
                }
                break;
            case 109757538:
                if (lowerCase.equals(TtmlNode.START)) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static TtmlNode parseNode(XmlPullParser xmlPullParser, TtmlNode ttmlNode, Map<String, TtmlRegion> map, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
        long j;
        long j2;
        char c;
        int attributeCount = xmlPullParser.getAttributeCount();
        TtmlStyle parseStyleAttributes = parseStyleAttributes(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j3 = C.TIME_UNSET;
        long j4 = C.TIME_UNSET;
        long j5 = C.TIME_UNSET;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 99841:
                    if (attributeName.equals(ATTR_DURATION)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals(ATTR_BEGIN)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals(ATTR_IMAGE)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    if (map.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j5 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case 2:
                    j4 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case 3:
                    j3 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case 4:
                    String[] parseStyleIds = parseStyleIds(attributeValue);
                    if (parseStyleIds.length > 0) {
                        strArr = parseStyleIds;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (ttmlNode != null) {
            long j6 = ttmlNode.startTimeUs;
            j = C.TIME_UNSET;
            if (j6 != C.TIME_UNSET) {
                if (j3 != C.TIME_UNSET) {
                    j3 += ttmlNode.startTimeUs;
                }
                if (j4 != C.TIME_UNSET) {
                    j4 += ttmlNode.startTimeUs;
                }
            }
        } else {
            j = C.TIME_UNSET;
        }
        long j7 = j3;
        if (j4 == j) {
            if (j5 != j) {
                j2 = j7 + j5;
            } else if (ttmlNode != null && ttmlNode.endTimeUs != j) {
                j2 = ttmlNode.endTimeUs;
            }
            return TtmlNode.buildNode(xmlPullParser.getName(), j7, j2, parseStyleAttributes, strArr, str2, str, ttmlNode);
        }
        j2 = j4;
        return TtmlNode.buildNode(xmlPullParser.getName(), j7, j2, parseStyleAttributes, strArr, str2, str, ttmlNode);
    }

    private static boolean isSupportedTag(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals(TtmlNode.TAG_BODY) || str.equals(TtmlNode.TAG_DIV) || str.equals(TtmlNode.TAG_P) || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals("style") || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals("region") || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals(TtmlNode.TAG_INFORMATION);
    }

    private static void parseFontSize(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        String[] split = Util.split(str, "\\s+");
        if (split.length == 1) {
            matcher = FONT_SIZE.matcher(str);
        } else if (split.length == 2) {
            matcher = FONT_SIZE.matcher(split[1]);
            Log.w(TAG, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + split.length + ".");
        }
        if (matcher.matches()) {
            String str2 = (String) Assertions.checkNotNull(matcher.group(3));
            str2.hashCode();
            char c = 65535;
            switch (str2.hashCode()) {
                case 37:
                    if (str2.equals("%")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str2.equals(UserDataStore.EMAIL)) {
                        c = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str2.equals("px")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    ttmlStyle.setFontSizeUnit(3);
                    break;
                case 1:
                    ttmlStyle.setFontSizeUnit(2);
                    break;
                case 2:
                    ttmlStyle.setFontSizeUnit(1);
                    break;
                default:
                    throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
            }
            ttmlStyle.setFontSize(Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))));
            return;
        }
        throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
    }

    private static float parseShear(String str) {
        Matcher matcher = SIGNED_PERCENTAGE.matcher(str);
        if (!matcher.matches()) {
            Log.w(TAG, "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1)))));
        } catch (NumberFormatException e) {
            Log.w(TAG, "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bc, code lost:
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long parseTimeExpression(String str, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
        double d;
        double d2;
        String group;
        String group2;
        Matcher matcher = CLOCK_TIME.matcher(str);
        char c = 4;
        if (matcher.matches()) {
            double parseLong = (Long.parseLong((String) Assertions.checkNotNull(matcher.group(1))) * 3600) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))) * 60) + Long.parseLong((String) Assertions.checkNotNull(matcher.group(3)));
            String group3 = matcher.group(4);
            return (long) ((parseLong + (group3 != null ? Double.parseDouble(group3) : 0.0d) + (matcher.group(5) != null ? ((float) Long.parseLong(group)) / frameAndTickRate.effectiveFrameRate : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(group2) / frameAndTickRate.subFrameRate) / frameAndTickRate.effectiveFrameRate : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = OFFSET_TIME.matcher(str);
        if (matcher2.matches()) {
            double parseDouble = Double.parseDouble((String) Assertions.checkNotNull(matcher2.group(1)));
            String str2 = (String) Assertions.checkNotNull(matcher2.group(2));
            str2.hashCode();
            switch (str2.hashCode()) {
                case 102:
                    if (str2.equals("f")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case LocationRequestCompat.QUALITY_LOW_POWER /* 104 */:
                    if (str2.equals("h")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                    if (str2.equals("m")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                    if (str2.equals("t")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3494:
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    d = frameAndTickRate.effectiveFrameRate;
                    parseDouble /= d;
                    return (long) (parseDouble * 1000000.0d);
                case 1:
                    d2 = 3600.0d;
                    parseDouble *= d2;
                    return (long) (parseDouble * 1000000.0d);
                case 2:
                    d2 = 60.0d;
                    parseDouble *= d2;
                    return (long) (parseDouble * 1000000.0d);
                case 3:
                    d = frameAndTickRate.tickRate;
                    parseDouble /= d;
                    return (long) (parseDouble * 1000000.0d);
                case 4:
                    d = 1000.0d;
                    parseDouble /= d;
                    return (long) (parseDouble * 1000000.0d);
                default:
                    return (long) (parseDouble * 1000000.0d);
            }
        }
        throw new SubtitleDecoderException("Malformed time expression: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class FrameAndTickRate {
        final float effectiveFrameRate;
        final int subFrameRate;
        final int tickRate;

        FrameAndTickRate(float f, int i, int i2) {
            this.effectiveFrameRate = f;
            this.subFrameRate = i;
            this.tickRate = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class CellResolution {
        final int columns;
        final int rows;

        CellResolution(int i, int i2) {
            this.columns = i;
            this.rows = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class TtsExtent {
        final int height;
        final int width;

        TtsExtent(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }
}
