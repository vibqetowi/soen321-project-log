package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
final class RtspSessionTiming {
    private static final long LIVE_START_TIME = 0;
    private static final String START_TIMING_NTP_FORMAT = "npt=%.3f-";
    public final long startTimeMs;
    public final long stopTimeMs;
    public static final RtspSessionTiming DEFAULT = new RtspSessionTiming(0, C.TIME_UNSET);
    private static final Pattern NPT_RANGE_PATTERN = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    public static RtspSessionTiming parseTiming(String str) throws ParserException {
        long parseFloat;
        Matcher matcher = NPT_RANGE_PATTERN.matcher(str);
        RtspMessageUtil.checkManifestExpression(matcher.matches(), str);
        String group = matcher.group(1);
        RtspMessageUtil.checkManifestExpression(group != null, str);
        long parseFloat2 = ((String) Util.castNonNull(group)).equals("now") ? 0L : Float.parseFloat(group) * 1000.0f;
        String group2 = matcher.group(2);
        if (group2 != null) {
            try {
                parseFloat = Float.parseFloat(group2) * 1000.0f;
                RtspMessageUtil.checkManifestExpression(parseFloat >= parseFloat2, str);
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedManifest(group2, e);
            }
        } else {
            parseFloat = C.TIME_UNSET;
        }
        return new RtspSessionTiming(parseFloat2, parseFloat);
    }

    public static String getOffsetStartTimeTiming(long j) {
        return Util.formatInvariant(START_TIMING_NTP_FORMAT, Double.valueOf(j / 1000.0d));
    }

    private RtspSessionTiming(long j, long j2) {
        this.startTimeMs = j;
        this.stopTimeMs = j2;
    }

    public boolean isLive() {
        return this.stopTimeMs == C.TIME_UNSET;
    }

    public long getDurationMs() {
        return this.stopTimeMs - this.startTimeMs;
    }
}
