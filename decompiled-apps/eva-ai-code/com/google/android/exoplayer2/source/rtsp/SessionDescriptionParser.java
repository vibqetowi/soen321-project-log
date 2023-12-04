package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.location.LocationRequestCompat;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.android.exoplayer2.source.rtsp.MediaDescription;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Strings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
final class SessionDescriptionParser {
    private static final String ATTRIBUTE_TYPE = "a";
    private static final String BANDWIDTH_TYPE = "b";
    private static final String CONNECTION_TYPE = "c";
    private static final String EMAIL_TYPE = "e";
    private static final String INFORMATION_TYPE = "i";
    private static final String KEY_TYPE = "k";
    private static final String MEDIA_TYPE = "m";
    private static final String ORIGIN_TYPE = "o";
    private static final String PHONE_NUMBER_TYPE = "p";
    private static final String REPEAT_TYPE = "r";
    private static final String SESSION_TYPE = "s";
    private static final String TIMING_TYPE = "t";
    private static final String URI_TYPE = "u";
    private static final String VERSION_TYPE = "v";
    private static final String ZONE_TYPE = "z";
    private static final Pattern SDP_LINE_PATTERN = Pattern.compile("([a-z])=\\s?(.+)");
    private static final Pattern ATTRIBUTE_PATTERN = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");
    private static final Pattern MEDIA_DESCRIPTION_PATTERN = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01b3, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SessionDescription parse(String str) throws ParserException {
        String[] splitRtspMessageBody;
        char c;
        SessionDescription.Builder builder = new SessionDescription.Builder();
        MediaDescription.Builder builder2 = null;
        for (String str2 : RtspMessageUtil.splitRtspMessageBody(str)) {
            if (!"".equals(str2)) {
                Matcher matcher = SDP_LINE_PATTERN.matcher(str2);
                if (!matcher.matches()) {
                    throw ParserException.createForMalformedManifest("Malformed SDP line: " + str2, null);
                }
                String str3 = (String) Assertions.checkNotNull(matcher.group(1));
                String str4 = (String) Assertions.checkNotNull(matcher.group(2));
                switch (str3.hashCode()) {
                    case 97:
                        if (str3.equals(ATTRIBUTE_TYPE)) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 98:
                        if (str3.equals(BANDWIDTH_TYPE)) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 99:
                        if (str3.equals(CONNECTION_TYPE)) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 100:
                    case 102:
                    case 103:
                    case LocationRequestCompat.QUALITY_LOW_POWER /* 104 */:
                    case 106:
                    case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                    case 110:
                    case 113:
                    case 119:
                    case 120:
                    case 121:
                    default:
                        c = 65535;
                        break;
                    case 101:
                        if (str3.equals(EMAIL_TYPE)) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 105:
                        if (str3.equals(INFORMATION_TYPE)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 107:
                        if (str3.equals(KEY_TYPE)) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                        if (str3.equals(MEDIA_TYPE)) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 111:
                        if (str3.equals(ORIGIN_TYPE)) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 112:
                        if (str3.equals("p")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 114:
                        if (str3.equals(REPEAT_TYPE)) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 115:
                        if (str3.equals(SESSION_TYPE)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                        if (str3.equals(TIMING_TYPE)) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 117:
                        if (str3.equals(URI_TYPE)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 118:
                        if (str3.equals(VERSION_TYPE)) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 122:
                        if (str3.equals(ZONE_TYPE)) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        if ("0".equals(str4)) {
                            continue;
                        } else {
                            throw ParserException.createForMalformedManifest(String.format("SDP version %s is not supported.", str4), null);
                        }
                    case 1:
                        builder.setOrigin(str4);
                        continue;
                    case 2:
                        builder.setSessionName(str4);
                        continue;
                    case 3:
                        if (builder2 == null) {
                            builder.setSessionInfo(str4);
                            continue;
                        } else {
                            builder2.setMediaTitle(str4);
                            break;
                        }
                    case 4:
                        builder.setUri(Uri.parse(str4));
                        continue;
                    case 5:
                        builder.setEmailAddress(str4);
                        continue;
                    case 6:
                        builder.setPhoneNumber(str4);
                        continue;
                    case 7:
                        if (builder2 == null) {
                            builder.setConnection(str4);
                            continue;
                        } else {
                            builder2.setConnection(str4);
                            break;
                        }
                    case '\b':
                        String[] split = Util.split(str4, ":\\s?");
                        Assertions.checkArgument(split.length == 2);
                        int parseInt = Integer.parseInt(split[1]);
                        if (builder2 == null) {
                            builder.setBitrate(parseInt * 1000);
                            continue;
                        } else {
                            builder2.setBitrate(parseInt * 1000);
                            break;
                        }
                    case '\t':
                        builder.setTiming(str4);
                        continue;
                    case '\n':
                        if (builder2 == null) {
                            builder.setKey(str4);
                            continue;
                        } else {
                            builder2.setKey(str4);
                            break;
                        }
                    case 11:
                        Matcher matcher2 = ATTRIBUTE_PATTERN.matcher(str4);
                        if (!matcher2.matches()) {
                            throw ParserException.createForMalformedManifest("Malformed Attribute line: " + str2, null);
                        }
                        String str5 = (String) Assertions.checkNotNull(matcher2.group(1));
                        String nullToEmpty = Strings.nullToEmpty(matcher2.group(2));
                        if (builder2 == null) {
                            builder.addAttribute(str5, nullToEmpty);
                            continue;
                        } else {
                            builder2.addAttribute(str5, nullToEmpty);
                            break;
                        }
                    case '\f':
                        if (builder2 != null) {
                            addMediaDescriptionToSession(builder, builder2);
                        }
                        builder2 = parseMediaDescriptionLine(str4);
                        continue;
                }
            }
        }
        if (builder2 != null) {
            addMediaDescriptionToSession(builder, builder2);
        }
        try {
            return builder.build();
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }

    private static void addMediaDescriptionToSession(SessionDescription.Builder builder, MediaDescription.Builder builder2) throws ParserException {
        try {
            builder.addMediaDescription(builder2.build());
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }

    private static MediaDescription.Builder parseMediaDescriptionLine(String str) throws ParserException {
        Matcher matcher = MEDIA_DESCRIPTION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.createForMalformedManifest("Malformed SDP media description line: " + str, null);
        }
        String str2 = (String) Assertions.checkNotNull(matcher.group(1));
        String str3 = (String) Assertions.checkNotNull(matcher.group(2));
        try {
            return new MediaDescription.Builder(str2, Integer.parseInt(str3), (String) Assertions.checkNotNull(matcher.group(3)), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(4))));
        } catch (NumberFormatException e) {
            throw ParserException.createForMalformedManifest("Malformed SDP media description line: " + str, e);
        }
    }

    private SessionDescriptionParser() {
    }
}
