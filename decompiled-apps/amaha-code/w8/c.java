package w8;

import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import c9.w;
import com.appsflyer.R;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.common.collect.q0;
import com.google.common.collect.r0;
import com.google.common.collect.s0;
import com.google.common.collect.u;
import com.theinnerhour.b2b.utils.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: TtmlDecoder.java */
/* loaded from: classes.dex */
public final class c extends p8.e {

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f36597n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f36598o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f36599p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f36600q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f36601s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t  reason: collision with root package name */
    public static final Pattern f36602t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u  reason: collision with root package name */
    public static final b f36603u = new b(30.0f, 1, 1);

    /* renamed from: v  reason: collision with root package name */
    public static final a f36604v = new a(15);

    /* renamed from: m  reason: collision with root package name */
    public final XmlPullParserFactory f36605m;

    /* compiled from: TtmlDecoder.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f36606a;

        public a(int i6) {
            this.f36606a = i6;
        }
    }

    /* compiled from: TtmlDecoder.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final float f36607a;

        /* renamed from: b  reason: collision with root package name */
        public final int f36608b;

        /* renamed from: c  reason: collision with root package name */
        public final int f36609c;

        public b(float f, int i6, int i10) {
            this.f36607a = f;
            this.f36608b = i6;
            this.f36609c = i10;
        }
    }

    /* compiled from: TtmlDecoder.java */
    /* renamed from: w8.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0613c {

        /* renamed from: a  reason: collision with root package name */
        public final int f36610a;

        /* renamed from: b  reason: collision with root package name */
        public final int f36611b;

        public C0613c(int i6, int i10) {
            this.f36610a = i6;
            this.f36611b = i10;
        }
    }

    public c() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f36605m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static f i(f fVar) {
        if (fVar == null) {
            return new f();
        }
        return fVar;
    }

    public static boolean j(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals("p") && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static Layout.Alignment k(String str) {
        String h02 = sc.b.h0(str);
        h02.getClass();
        char c10 = 65535;
        switch (h02.hashCode()) {
            case -1364013995:
                if (h02.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case 100571:
                if (h02.equals("end")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3317767:
                if (h02.equals("left")) {
                    c10 = 2;
                    break;
                }
                break;
            case 108511772:
                if (h02.equals("right")) {
                    c10 = 3;
                    break;
                }
                break;
            case 109757538:
                if (h02.equals("start")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
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

    public static a l(XmlPullParser xmlPullParser, a aVar) {
        String str;
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f36602t.matcher(attributeValue);
        if (!matcher.matches()) {
            if (attributeValue.length() != 0) {
                str2 = "Ignoring malformed cell resolution: ".concat(attributeValue);
            } else {
                str2 = new String("Ignoring malformed cell resolution: ");
            }
            Log.w("TtmlDecoder", str2);
            return aVar;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt2);
            }
            StringBuilder sb2 = new StringBuilder(47);
            sb2.append("Invalid cell resolution ");
            sb2.append(parseInt);
            sb2.append(" ");
            sb2.append(parseInt2);
            throw new SubtitleDecoderException(sb2.toString());
        } catch (NumberFormatException unused) {
            if (attributeValue.length() != 0) {
                str = "Ignoring malformed cell resolution: ".concat(attributeValue);
            } else {
                str = new String("Ignoring malformed cell resolution: ");
            }
            Log.w("TtmlDecoder", str);
            return aVar;
        }
    }

    public static void m(String str, f fVar) {
        Matcher matcher;
        int i6 = w.f5205a;
        char c10 = 65535;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f36599p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            int length2 = split.length;
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Invalid number of entries for fontSize: ");
            sb2.append(length2);
            sb2.append(".");
            throw new SubtitleDecoderException(sb2.toString());
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            switch (group.hashCode()) {
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    if (group.equals("%")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    fVar.f36641j = 3;
                    break;
                case 1:
                    fVar.f36641j = 2;
                    break;
                case 2:
                    fVar.f36641j = 1;
                    break;
                default:
                    StringBuilder sb3 = new StringBuilder(group.length() + 30);
                    sb3.append("Invalid unit for fontSize: '");
                    sb3.append(group);
                    sb3.append("'.");
                    throw new SubtitleDecoderException(sb3.toString());
            }
            String group2 = matcher.group(1);
            group2.getClass();
            fVar.f36642k = Float.parseFloat(group2);
            return;
        }
        StringBuilder sb4 = new StringBuilder(str.length() + 36);
        sb4.append("Invalid expression for fontSize: '");
        sb4.append(str);
        sb4.append("'.");
        throw new SubtitleDecoderException(sb4.toString());
    }

    public static b n(XmlPullParser xmlPullParser) {
        int i6;
        float f;
        int i10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i6 = Integer.parseInt(attributeValue);
        } else {
            i6 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = w.f5205a;
            String[] split = attributeValue2.split(" ", -1);
            if (split.length == 2) {
                f = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
            } else {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f = 1.0f;
        }
        b bVar = f36603u;
        int i12 = bVar.f36608b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i10 = Integer.parseInt(attributeValue4);
        } else {
            i10 = bVar.f36609c;
        }
        return new b(i6 * f, i12, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x01fc, code lost:
        if (r7.equals("tb") == false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0201 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void o(XmlPullParser xmlPullParser, HashMap hashMap, a aVar, C0613c c0613c, HashMap hashMap2, HashMap hashMap3) {
        String J;
        e eVar;
        e eVar2;
        String str;
        float parseFloat;
        float parseFloat2;
        String str2;
        float parseFloat3;
        float parseFloat4;
        a aVar2;
        float f;
        int i6;
        String J2;
        int i10;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String[] split;
        do {
            xmlPullParser.next();
            int i11 = 0;
            if (sc.b.R(xmlPullParser, "style")) {
                String J3 = sc.b.J(xmlPullParser, "style");
                f q10 = q(xmlPullParser, new f());
                if (J3 != null) {
                    String trim = J3.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i12 = w.f5205a;
                        split = trim.split("\\s+", -1);
                    }
                    int length = split.length;
                    while (i11 < length) {
                        q10.a((f) hashMap.get(split[i11]));
                        i11++;
                    }
                }
                String str9 = q10.f36643l;
                if (str9 != null) {
                    hashMap.put(str9, q10);
                }
            } else if (sc.b.R(xmlPullParser, "region")) {
                String J4 = sc.b.J(xmlPullParser, "id");
                if (J4 != null) {
                    String J5 = sc.b.J(xmlPullParser, "origin");
                    if (J5 != null) {
                        Pattern pattern = r;
                        Matcher matcher = pattern.matcher(J5);
                        Pattern pattern2 = f36601s;
                        Matcher matcher2 = pattern2.matcher(J5);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                parseFloat = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                parseFloat2 = Float.parseFloat(group2) / 100.0f;
                            } catch (NumberFormatException unused) {
                                if (J5.length() != 0) {
                                    str = "Ignoring region with malformed origin: ".concat(J5);
                                } else {
                                    str = new String("Ignoring region with malformed origin: ");
                                }
                                Log.w("TtmlDecoder", str);
                            }
                        } else if (matcher2.matches()) {
                            if (c0613c == null) {
                                if (J5.length() != 0) {
                                    str8 = "Ignoring region with missing tts:extent: ".concat(J5);
                                } else {
                                    str8 = new String("Ignoring region with missing tts:extent: ");
                                }
                                Log.w("TtmlDecoder", str8);
                            } else {
                                try {
                                    String group3 = matcher2.group(1);
                                    group3.getClass();
                                    int parseInt = Integer.parseInt(group3);
                                    String group4 = matcher2.group(2);
                                    group4.getClass();
                                    int parseInt2 = Integer.parseInt(group4);
                                    float f2 = parseInt / c0613c.f36610a;
                                    float f10 = parseInt2 / c0613c.f36611b;
                                    parseFloat = f2;
                                    parseFloat2 = f10;
                                } catch (NumberFormatException unused2) {
                                    if (J5.length() != 0) {
                                        str7 = "Ignoring region with malformed origin: ".concat(J5);
                                    } else {
                                        str7 = new String("Ignoring region with malformed origin: ");
                                    }
                                    Log.w("TtmlDecoder", str7);
                                }
                            }
                        } else {
                            if (J5.length() != 0) {
                                str6 = "Ignoring region with unsupported origin: ".concat(J5);
                            } else {
                                str6 = new String("Ignoring region with unsupported origin: ");
                            }
                            Log.w("TtmlDecoder", str6);
                        }
                        String J6 = sc.b.J(xmlPullParser, "extent");
                        if (J6 != null) {
                            Matcher matcher3 = pattern.matcher(J6);
                            Matcher matcher4 = pattern2.matcher(J6);
                            if (matcher3.matches()) {
                                try {
                                    String group5 = matcher3.group(1);
                                    group5.getClass();
                                    parseFloat3 = Float.parseFloat(group5) / 100.0f;
                                    String group6 = matcher3.group(2);
                                    group6.getClass();
                                    parseFloat4 = Float.parseFloat(group6) / 100.0f;
                                } catch (NumberFormatException unused3) {
                                    if (J5.length() != 0) {
                                        str2 = "Ignoring region with malformed extent: ".concat(J5);
                                    } else {
                                        str2 = new String("Ignoring region with malformed extent: ");
                                    }
                                    Log.w("TtmlDecoder", str2);
                                }
                            } else if (matcher4.matches()) {
                                if (c0613c == null) {
                                    if (J5.length() != 0) {
                                        str5 = "Ignoring region with missing tts:extent: ".concat(J5);
                                    } else {
                                        str5 = new String("Ignoring region with missing tts:extent: ");
                                    }
                                    Log.w("TtmlDecoder", str5);
                                } else {
                                    try {
                                        String group7 = matcher4.group(1);
                                        group7.getClass();
                                        int parseInt3 = Integer.parseInt(group7);
                                        String group8 = matcher4.group(2);
                                        group8.getClass();
                                        int parseInt4 = Integer.parseInt(group8);
                                        parseFloat3 = parseInt3 / c0613c.f36610a;
                                        parseFloat4 = parseInt4 / c0613c.f36611b;
                                    } catch (NumberFormatException unused4) {
                                        if (J5.length() != 0) {
                                            str4 = "Ignoring region with malformed extent: ".concat(J5);
                                        } else {
                                            str4 = new String("Ignoring region with malformed extent: ");
                                        }
                                        Log.w("TtmlDecoder", str4);
                                    }
                                }
                            } else {
                                if (J5.length() != 0) {
                                    str3 = "Ignoring region with unsupported extent: ".concat(J5);
                                } else {
                                    str3 = new String("Ignoring region with unsupported extent: ");
                                }
                                Log.w("TtmlDecoder", str3);
                            }
                            String J7 = sc.b.J(xmlPullParser, "displayAlign");
                            if (J7 != null) {
                                String h02 = sc.b.h0(J7);
                                h02.getClass();
                                if (!h02.equals("center")) {
                                    if (h02.equals("after")) {
                                        aVar2 = aVar;
                                        f = parseFloat2 + parseFloat4;
                                        i6 = 2;
                                    }
                                } else {
                                    f = (parseFloat4 / 2.0f) + parseFloat2;
                                    i6 = 1;
                                    aVar2 = aVar;
                                }
                                float f11 = 1.0f / aVar2.f36606a;
                                J2 = sc.b.J(xmlPullParser, "writingMode");
                                if (J2 != null) {
                                    String h03 = sc.b.h0(J2);
                                    h03.getClass();
                                    int hashCode = h03.hashCode();
                                    if (hashCode != 3694) {
                                        if (hashCode != 3553396) {
                                            if (hashCode == 3553576 && h03.equals("tbrl")) {
                                                i11 = 2;
                                                if (i11 == 0 && i11 != 1) {
                                                    if (i11 == 2) {
                                                        i10 = 1;
                                                    }
                                                } else {
                                                    i10 = 2;
                                                }
                                                eVar = new e(J4, parseFloat, f, 0, i6, parseFloat3, parseFloat4, 1, f11, i10);
                                                eVar2 = eVar;
                                                if (eVar2 != null) {
                                                    hashMap2.put(eVar2.f36624a, eVar2);
                                                }
                                            }
                                            i11 = -1;
                                            if (i11 == 0) {
                                            }
                                            i10 = 2;
                                            eVar = new e(J4, parseFloat, f, 0, i6, parseFloat3, parseFloat4, 1, f11, i10);
                                            eVar2 = eVar;
                                            if (eVar2 != null) {
                                            }
                                        } else {
                                            if (h03.equals("tblr")) {
                                                i11 = 1;
                                                if (i11 == 0) {
                                                }
                                                i10 = 2;
                                                eVar = new e(J4, parseFloat, f, 0, i6, parseFloat3, parseFloat4, 1, f11, i10);
                                                eVar2 = eVar;
                                                if (eVar2 != null) {
                                                }
                                            }
                                            i11 = -1;
                                            if (i11 == 0) {
                                            }
                                            i10 = 2;
                                            eVar = new e(J4, parseFloat, f, 0, i6, parseFloat3, parseFloat4, 1, f11, i10);
                                            eVar2 = eVar;
                                            if (eVar2 != null) {
                                            }
                                        }
                                    }
                                }
                                i10 = LinearLayoutManager.INVALID_OFFSET;
                                eVar = new e(J4, parseFloat, f, 0, i6, parseFloat3, parseFloat4, 1, f11, i10);
                                eVar2 = eVar;
                                if (eVar2 != null) {
                                }
                            }
                            aVar2 = aVar;
                            f = parseFloat2;
                            i6 = 0;
                            float f112 = 1.0f / aVar2.f36606a;
                            J2 = sc.b.J(xmlPullParser, "writingMode");
                            if (J2 != null) {
                            }
                            i10 = LinearLayoutManager.INVALID_OFFSET;
                            eVar = new e(J4, parseFloat, f, 0, i6, parseFloat3, parseFloat4, 1, f112, i10);
                            eVar2 = eVar;
                            if (eVar2 != null) {
                            }
                        } else {
                            Log.w("TtmlDecoder", "Ignoring region without an extent");
                        }
                    } else {
                        Log.w("TtmlDecoder", "Ignoring region without an origin");
                    }
                }
                eVar = null;
                eVar2 = eVar;
                if (eVar2 != null) {
                }
            } else if (sc.b.R(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (sc.b.R(xmlPullParser, "image") && (J = sc.b.J(xmlPullParser, "id")) != null) {
                        hashMap3.put(J, xmlPullParser.nextText());
                    }
                } while (!sc.b.P(xmlPullParser, "metadata"));
            }
        } while (!sc.b.P(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static d p(XmlPullParser xmlPullParser, d dVar, HashMap hashMap, b bVar) {
        long j10;
        long j11;
        char c10;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        f q10 = q(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        long j14 = -9223372036854775807L;
        for (int i6 = 0; i6 < attributeCount; i6++) {
            String attributeName = xmlPullParser.getAttributeName(i6);
            String attributeValue = xmlPullParser.getAttributeValue(i6);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                if (c10 == 5 && attributeValue.startsWith("#")) {
                                    str = attributeValue.substring(1);
                                }
                            } else {
                                String trim = attributeValue.trim();
                                if (trim.isEmpty()) {
                                    split = new String[0];
                                } else {
                                    int i10 = w.f5205a;
                                    split = trim.split("\\s+", -1);
                                }
                                if (split.length > 0) {
                                    strArr = split;
                                }
                            }
                        } else {
                            j12 = r(attributeValue, bVar);
                        }
                    } else {
                        j13 = r(attributeValue, bVar);
                    }
                } else {
                    j14 = r(attributeValue, bVar);
                }
            } else if (hashMap.containsKey(attributeValue)) {
                str2 = attributeValue;
            }
        }
        if (dVar != null) {
            long j15 = dVar.f36615d;
            j10 = -9223372036854775807L;
            if (j15 != -9223372036854775807L) {
                if (j12 != -9223372036854775807L) {
                    j12 += j15;
                }
                if (j13 != -9223372036854775807L) {
                    j13 += j15;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (j13 == j10) {
            if (j14 != j10) {
                j11 = j12 + j14;
            } else if (dVar != null) {
                long j16 = dVar.f36616e;
                if (j16 != j10) {
                    j11 = j16;
                }
            }
            return new d(xmlPullParser.getName(), null, j12, j11, q10, strArr, str2, str, dVar);
        }
        j11 = j13;
        return new d(xmlPullParser.getName(), null, j12, j11, q10, strArr, str2, str, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01f0, code lost:
        if (r5.equals("auto") != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f q(XmlPullParser xmlPullParser, f fVar) {
        char c10;
        String str;
        String str2;
        String str3;
        float min;
        String str4;
        w8.b bVar;
        Object obj;
        char c11;
        int i6;
        r0 c12;
        Object obj2;
        char c13;
        int i10;
        q0 q0Var;
        Object obj3;
        int hashCode;
        int i11;
        String str5;
        int attributeCount = xmlPullParser.getAttributeCount();
        f fVar2 = fVar;
        for (int i12 = 0; i12 < attributeCount; i12++) {
            String attributeValue = xmlPullParser.getAttributeValue(i12);
            String attributeName = xmlPullParser.getAttributeName(i12);
            attributeName.getClass();
            int i13 = -1;
            char c14 = 1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c10 = '\r';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c10 = 14;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    fVar2 = i(fVar2);
                    fVar2.f36640i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    fVar2 = i(fVar2);
                    fVar2.f36633a = attributeValue;
                    break;
                case 2:
                    fVar2 = i(fVar2);
                    fVar2.f36646o = k(attributeValue);
                    break;
                case 3:
                    String h02 = sc.b.h0(attributeValue);
                    h02.getClass();
                    switch (h02.hashCode()) {
                        case -1461280213:
                            if (h02.equals("nounderline")) {
                                i13 = 0;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (h02.equals("underline")) {
                                i13 = 1;
                                break;
                            }
                            break;
                        case 913457136:
                            if (h02.equals("nolinethrough")) {
                                i13 = 2;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (h02.equals("linethrough")) {
                                i13 = 3;
                                break;
                            }
                            break;
                    }
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 != 3) {
                                    break;
                                } else {
                                    fVar2 = i(fVar2);
                                    fVar2.f = 1;
                                    break;
                                }
                            } else {
                                fVar2 = i(fVar2);
                                fVar2.f = 0;
                                break;
                            }
                        } else {
                            fVar2 = i(fVar2);
                            fVar2.f36638g = 1;
                            break;
                        }
                    } else {
                        fVar2 = i(fVar2);
                        fVar2.f36638g = 0;
                        break;
                    }
                case 4:
                    fVar2 = i(fVar2);
                    fVar2.f36639h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        fVar2 = i(fVar2);
                        fVar2.f36643l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String h03 = sc.b.h0(attributeValue);
                    h03.getClass();
                    switch (h03.hashCode()) {
                        case -618561360:
                            if (h03.equals("baseContainer")) {
                                i13 = 0;
                                break;
                            }
                            break;
                        case -410956671:
                            if (h03.equals("container")) {
                                i13 = 1;
                                break;
                            }
                            break;
                        case -250518009:
                            if (h03.equals("delimiter")) {
                                i13 = 2;
                                break;
                            }
                            break;
                        case -136074796:
                            if (h03.equals("textContainer")) {
                                i13 = 3;
                                break;
                            }
                            break;
                        case 3016401:
                            if (h03.equals("base")) {
                                i13 = 4;
                                break;
                            }
                            break;
                        case 3556653:
                            if (h03.equals("text")) {
                                i13 = 5;
                                break;
                            }
                            break;
                    }
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 != 3) {
                                    if (i13 != 4) {
                                        if (i13 != 5) {
                                            break;
                                        }
                                    }
                                }
                                fVar2 = i(fVar2);
                                fVar2.f36644m = 3;
                                break;
                            } else {
                                fVar2 = i(fVar2);
                                fVar2.f36644m = 4;
                                break;
                            }
                        } else {
                            fVar2 = i(fVar2);
                            fVar2.f36644m = 1;
                            break;
                        }
                    }
                    fVar2 = i(fVar2);
                    fVar2.f36644m = 2;
                    break;
                case 7:
                    fVar2 = i(fVar2);
                    try {
                        fVar2.f36634b = c9.c.a(attributeValue, false);
                        fVar2.f36635c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        String valueOf = String.valueOf(attributeValue);
                        if (valueOf.length() != 0) {
                            str2 = "Failed parsing color value: ".concat(valueOf);
                        } else {
                            str2 = new String("Failed parsing color value: ");
                        }
                        Log.w("TtmlDecoder", str2);
                        break;
                    }
                case '\b':
                    f i14 = i(fVar2);
                    Matcher matcher = f36600q.matcher(attributeValue);
                    if (!matcher.matches()) {
                        String valueOf2 = String.valueOf(attributeValue);
                        if (valueOf2.length() != 0) {
                            str4 = "Invalid value for shear: ".concat(valueOf2);
                        } else {
                            str4 = new String("Invalid value for shear: ");
                        }
                        Log.w("TtmlDecoder", str4);
                    } else {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            min = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e10) {
                            String valueOf3 = String.valueOf(attributeValue);
                            if (valueOf3.length() != 0) {
                                str3 = "Failed to parse shear: ".concat(valueOf3);
                            } else {
                                str3 = new String("Failed to parse shear: ");
                            }
                            ca.a.B1("TtmlDecoder", str3, e10);
                        }
                        i14.f36649s = min;
                        fVar2 = i14;
                        break;
                    }
                    min = Float.MAX_VALUE;
                    i14.f36649s = min;
                    fVar2 = i14;
                case '\t':
                    String h04 = sc.b.h0(attributeValue);
                    h04.getClass();
                    if (!h04.equals("all")) {
                        if (h04.equals(Constants.SUBSCRIPTION_NONE)) {
                            fVar2 = i(fVar2);
                            fVar2.f36648q = 0;
                            break;
                        } else {
                            break;
                        }
                    } else {
                        fVar2 = i(fVar2);
                        fVar2.f36648q = 1;
                        break;
                    }
                case '\n':
                    try {
                        fVar2 = i(fVar2);
                        m(attributeValue, fVar2);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        String valueOf4 = String.valueOf(attributeValue);
                        if (valueOf4.length() != 0) {
                            str = "Failed parsing fontSize value: ".concat(valueOf4);
                        } else {
                            str = new String("Failed parsing fontSize value: ");
                        }
                        Log.w("TtmlDecoder", str);
                        break;
                    }
                case 11:
                    fVar2 = i(fVar2);
                    Pattern pattern = w8.b.f36590d;
                    if (attributeValue != null) {
                        String h05 = sc.b.h0(attributeValue.trim());
                        if (!h05.isEmpty()) {
                            u C = u.C(TextUtils.split(h05, w8.b.f36590d));
                            q0 q0Var2 = new q0(s0.c(w8.b.f36593h, C));
                            if (!q0Var2.hasNext()) {
                                obj = "outside";
                            } else {
                                obj = q0Var2.next();
                            }
                            String str6 = (String) obj;
                            int hashCode2 = str6.hashCode();
                            if (hashCode2 != -1392885889) {
                                if (hashCode2 != -1106037339) {
                                    if (hashCode2 == 92734940 && str6.equals("after")) {
                                        c11 = 0;
                                        if (c11 == 0) {
                                            if (c11 != 1) {
                                                i6 = 1;
                                            } else {
                                                i6 = -2;
                                            }
                                        } else {
                                            i6 = 2;
                                        }
                                        c12 = s0.c(w8.b.f36591e, C);
                                        if (c12.isEmpty()) {
                                            String str7 = (String) new q0(c12).next();
                                            int hashCode3 = str7.hashCode();
                                            if (hashCode3 == 3005871) {
                                                break;
                                            } else {
                                                if (hashCode3 == 3387192 && str7.equals(Constants.SUBSCRIPTION_NONE)) {
                                                    c14 = 0;
                                                    if (c14 == 0) {
                                                        i13 = 0;
                                                    }
                                                    bVar = new w8.b(i13, 0, i6);
                                                }
                                                c14 = 65535;
                                                if (c14 == 0) {
                                                }
                                                bVar = new w8.b(i13, 0, i6);
                                            }
                                        } else {
                                            r0 c15 = s0.c(w8.b.f36592g, C);
                                            r0 c16 = s0.c(w8.b.f, C);
                                            if (c15.isEmpty() && c16.isEmpty()) {
                                                bVar = new w8.b(-1, 0, i6);
                                            } else {
                                                q0 q0Var3 = new q0(c15);
                                                if (!q0Var3.hasNext()) {
                                                    obj2 = "filled";
                                                } else {
                                                    obj2 = q0Var3.next();
                                                }
                                                String str8 = (String) obj2;
                                                int hashCode4 = str8.hashCode();
                                                if (hashCode4 != -1274499742) {
                                                    if (hashCode4 == 3417674 && str8.equals("open")) {
                                                        c13 = 0;
                                                        if (c13 == 0) {
                                                            i10 = 1;
                                                        } else {
                                                            i10 = 2;
                                                        }
                                                        q0Var = new q0(c16);
                                                        if (q0Var.hasNext()) {
                                                            obj3 = "circle";
                                                        } else {
                                                            obj3 = q0Var.next();
                                                        }
                                                        String str9 = (String) obj3;
                                                        hashCode = str9.hashCode();
                                                        if (hashCode == -1360216880) {
                                                            if (hashCode != -905816648) {
                                                                if (hashCode == 99657 && str9.equals("dot")) {
                                                                    i13 = 0;
                                                                }
                                                            } else if (str9.equals("sesame")) {
                                                                i13 = 1;
                                                            }
                                                        } else if (str9.equals("circle")) {
                                                            i13 = 2;
                                                        }
                                                        if (i13 == 0) {
                                                            if (i13 != 1) {
                                                                i11 = 1;
                                                            } else {
                                                                i11 = 3;
                                                            }
                                                        } else {
                                                            i11 = 2;
                                                        }
                                                        bVar = new w8.b(i11, i10, i6);
                                                    }
                                                    c13 = 65535;
                                                    if (c13 == 0) {
                                                    }
                                                    q0Var = new q0(c16);
                                                    if (q0Var.hasNext()) {
                                                    }
                                                    String str92 = (String) obj3;
                                                    hashCode = str92.hashCode();
                                                    if (hashCode == -1360216880) {
                                                    }
                                                    if (i13 == 0) {
                                                    }
                                                    bVar = new w8.b(i11, i10, i6);
                                                } else {
                                                    if (str8.equals("filled")) {
                                                        c13 = 1;
                                                        if (c13 == 0) {
                                                        }
                                                        q0Var = new q0(c16);
                                                        if (q0Var.hasNext()) {
                                                        }
                                                        String str922 = (String) obj3;
                                                        hashCode = str922.hashCode();
                                                        if (hashCode == -1360216880) {
                                                        }
                                                        if (i13 == 0) {
                                                        }
                                                        bVar = new w8.b(i11, i10, i6);
                                                    }
                                                    c13 = 65535;
                                                    if (c13 == 0) {
                                                    }
                                                    q0Var = new q0(c16);
                                                    if (q0Var.hasNext()) {
                                                    }
                                                    String str9222 = (String) obj3;
                                                    hashCode = str9222.hashCode();
                                                    if (hashCode == -1360216880) {
                                                    }
                                                    if (i13 == 0) {
                                                    }
                                                    bVar = new w8.b(i11, i10, i6);
                                                }
                                            }
                                        }
                                        fVar2.r = bVar;
                                        break;
                                    }
                                    c11 = 65535;
                                    if (c11 == 0) {
                                    }
                                    c12 = s0.c(w8.b.f36591e, C);
                                    if (c12.isEmpty()) {
                                    }
                                    fVar2.r = bVar;
                                } else {
                                    if (str6.equals("outside")) {
                                        c11 = 1;
                                        if (c11 == 0) {
                                        }
                                        c12 = s0.c(w8.b.f36591e, C);
                                        if (c12.isEmpty()) {
                                        }
                                        fVar2.r = bVar;
                                    }
                                    c11 = 65535;
                                    if (c11 == 0) {
                                    }
                                    c12 = s0.c(w8.b.f36591e, C);
                                    if (c12.isEmpty()) {
                                    }
                                    fVar2.r = bVar;
                                }
                            } else {
                                if (str6.equals("before")) {
                                    c11 = 2;
                                    if (c11 == 0) {
                                    }
                                    c12 = s0.c(w8.b.f36591e, C);
                                    if (c12.isEmpty()) {
                                    }
                                    fVar2.r = bVar;
                                }
                                c11 = 65535;
                                if (c11 == 0) {
                                }
                                c12 = s0.c(w8.b.f36591e, C);
                                if (c12.isEmpty()) {
                                }
                                fVar2.r = bVar;
                            }
                        }
                    }
                    bVar = null;
                    fVar2.r = bVar;
                    break;
                case '\f':
                    String h06 = sc.b.h0(attributeValue);
                    h06.getClass();
                    if (!h06.equals("before")) {
                        if (h06.equals("after")) {
                            fVar2 = i(fVar2);
                            fVar2.f36645n = 2;
                            break;
                        } else {
                            break;
                        }
                    } else {
                        fVar2 = i(fVar2);
                        fVar2.f36645n = 1;
                        break;
                    }
                case '\r':
                    fVar2 = i(fVar2);
                    try {
                        fVar2.f36636d = c9.c.a(attributeValue, false);
                        fVar2.f36637e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        String valueOf5 = String.valueOf(attributeValue);
                        if (valueOf5.length() != 0) {
                            str5 = "Failed parsing background value: ".concat(valueOf5);
                        } else {
                            str5 = new String("Failed parsing background value: ");
                        }
                        Log.w("TtmlDecoder", str5);
                        break;
                    }
                case 14:
                    fVar2 = i(fVar2);
                    fVar2.f36647p = k(attributeValue);
                    break;
            }
        }
        return fVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long r(String str, b bVar) {
        String str2;
        double d10;
        double d11;
        String group;
        String group2;
        String group3;
        double d12;
        double d13;
        String group4;
        Matcher matcher = f36597n.matcher(str);
        char c10 = 4;
        if (matcher.matches()) {
            matcher.group(1).getClass();
            matcher.group(2).getClass();
            matcher.group(3).getClass();
            double parseLong = (Long.parseLong(group) * 3600) + (Long.parseLong(group2) * 60) + Long.parseLong(group3);
            String group5 = matcher.group(4);
            double d14 = 0.0d;
            if (group5 != null) {
                d12 = Double.parseDouble(group5);
            } else {
                d12 = 0.0d;
            }
            double d15 = parseLong + d12;
            String group6 = matcher.group(5);
            if (group6 != null) {
                d13 = ((float) Long.parseLong(group6)) / bVar.f36607a;
            } else {
                d13 = 0.0d;
            }
            double d16 = d15 + d13;
            if (matcher.group(6) != null) {
                d14 = (Long.parseLong(group4) / bVar.f36608b) / bVar.f36607a;
            }
            return (long) ((d16 + d14) * 1000000.0d);
        }
        Matcher matcher2 = f36598o.matcher(str);
        if (matcher2.matches()) {
            String group7 = matcher2.group(1);
            group7.getClass();
            double parseDouble = Double.parseDouble(group7);
            String group8 = matcher2.group(2);
            group8.getClass();
            switch (group8.hashCode()) {
                case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                    if (group8.equals("f")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                    if (group8.equals("h")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                    if (group8.equals("m")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                    if (group8.equals("t")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3494:
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    d10 = bVar.f36607a;
                    parseDouble /= d10;
                    return (long) (parseDouble * 1000000.0d);
                case 1:
                    d11 = 3600.0d;
                    parseDouble *= d11;
                    return (long) (parseDouble * 1000000.0d);
                case 2:
                    d11 = 60.0d;
                    parseDouble *= d11;
                    return (long) (parseDouble * 1000000.0d);
                case 3:
                    d10 = bVar.f36609c;
                    parseDouble /= d10;
                    return (long) (parseDouble * 1000000.0d);
                case 4:
                    d10 = 1000.0d;
                    parseDouble /= d10;
                    return (long) (parseDouble * 1000000.0d);
                default:
                    return (long) (parseDouble * 1000000.0d);
            }
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Malformed time expression: ".concat(valueOf);
        } else {
            str2 = new String("Malformed time expression: ");
        }
        throw new SubtitleDecoderException(str2);
    }

    public static C0613c s(XmlPullParser xmlPullParser) {
        String str;
        String str2;
        String J = sc.b.J(xmlPullParser, "extent");
        if (J == null) {
            return null;
        }
        Matcher matcher = f36601s.matcher(J);
        if (!matcher.matches()) {
            if (J.length() != 0) {
                str2 = "Ignoring non-pixel tts extent: ".concat(J);
            } else {
                str2 = new String("Ignoring non-pixel tts extent: ");
            }
            Log.w("TtmlDecoder", str2);
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new C0613c(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            if (J.length() != 0) {
                str = "Ignoring malformed tts extent: ".concat(J);
            } else {
                str = new String("Ignoring malformed tts extent: ");
            }
            Log.w("TtmlDecoder", str);
            return null;
        }
    }

    @Override // p8.e
    public final p8.f h(byte[] bArr, int i6, boolean z10) {
        a aVar;
        b bVar;
        String str;
        try {
            XmlPullParser newPullParser = this.f36605m.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e("", -3.4028235E38f, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET));
            C0613c c0613c = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i6), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f36603u;
            a aVar2 = f36604v;
            g gVar = null;
            a aVar3 = aVar2;
            int i10 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i10 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = n(newPullParser);
                            aVar3 = l(newPullParser, aVar2);
                            c0613c = s(newPullParser);
                        }
                        a aVar4 = aVar3;
                        C0613c c0613c2 = c0613c;
                        b bVar3 = bVar2;
                        if (!j(name)) {
                            String valueOf = String.valueOf(newPullParser.getName());
                            if (valueOf.length() != 0) {
                                str = "Ignoring unsupported tag: ".concat(valueOf);
                            } else {
                                str = new String("Ignoring unsupported tag: ");
                            }
                            Log.i("TtmlDecoder", str);
                            i10++;
                            aVar = aVar4;
                            bVar = bVar3;
                        } else if ("head".equals(name)) {
                            aVar = aVar4;
                            bVar = bVar3;
                            o(newPullParser, hashMap, aVar4, c0613c2, hashMap2, hashMap3);
                        } else {
                            aVar = aVar4;
                            bVar = bVar3;
                            try {
                                d p10 = p(newPullParser, dVar, hashMap2, bVar);
                                arrayDeque.push(p10);
                                if (dVar != null) {
                                    if (dVar.f36623m == null) {
                                        dVar.f36623m = new ArrayList();
                                    }
                                    dVar.f36623m.add(p10);
                                }
                            } catch (SubtitleDecoderException e10) {
                                ca.a.B1("TtmlDecoder", "Suppressing parser error", e10);
                                i10++;
                            }
                        }
                        aVar3 = aVar;
                        bVar2 = bVar;
                        c0613c = c0613c2;
                    } else if (eventType == 4) {
                        dVar.getClass();
                        d a10 = d.a(newPullParser.getText());
                        if (dVar.f36623m == null) {
                            dVar.f36623m = new ArrayList();
                        }
                        dVar.f36623m.add(a10);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            d dVar2 = (d) arrayDeque.peek();
                            dVar2.getClass();
                            gVar = new g(dVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i10++;
                } else if (eventType == 3) {
                    i10--;
                }
                newPullParser.next();
            }
            if (gVar != null) {
                return gVar;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new SubtitleDecoderException("Unable to decode source", e12);
        }
    }
}
