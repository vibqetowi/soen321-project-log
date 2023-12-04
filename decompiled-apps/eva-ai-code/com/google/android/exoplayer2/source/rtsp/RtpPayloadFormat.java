package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class RtpPayloadFormat {
    private static final String RTP_MEDIA_AC3 = "AC3";
    private static final String RTP_MEDIA_AMR = "AMR";
    private static final String RTP_MEDIA_AMR_WB = "AMR-WB";
    private static final String RTP_MEDIA_H263_1998 = "H263-1998";
    private static final String RTP_MEDIA_H263_2000 = "H263-2000";
    private static final String RTP_MEDIA_H264 = "H264";
    private static final String RTP_MEDIA_H265 = "H265";
    private static final String RTP_MEDIA_MPEG4_GENERIC = "MPEG4-GENERIC";
    private static final String RTP_MEDIA_MPEG4_VIDEO = "MP4V-ES";
    private static final String RTP_MEDIA_OPUS = "OPUS";
    private static final String RTP_MEDIA_PCMA = "PCMA";
    private static final String RTP_MEDIA_PCMU = "PCMU";
    private static final String RTP_MEDIA_PCM_L16 = "L16";
    private static final String RTP_MEDIA_PCM_L8 = "L8";
    private static final String RTP_MEDIA_VP8 = "VP8";
    private static final String RTP_MEDIA_VP9 = "VP9";
    public final int clockRate;
    public final ImmutableMap<String, String> fmtpParameters;
    public final Format format;
    public final int rtpPayloadType;

    public static boolean isFormatSupported(MediaDescription mediaDescription) {
        String upperCase = Ascii.toUpperCase(mediaDescription.rtpMapAttribute.mediaEncoding);
        upperCase.hashCode();
        char c = 65535;
        switch (upperCase.hashCode()) {
            case -1922091719:
                if (upperCase.equals(RTP_MEDIA_MPEG4_GENERIC)) {
                    c = 0;
                    break;
                }
                break;
            case 2412:
                if (upperCase.equals(RTP_MEDIA_PCM_L8)) {
                    c = 1;
                    break;
                }
                break;
            case 64593:
                if (upperCase.equals(RTP_MEDIA_AC3)) {
                    c = 2;
                    break;
                }
                break;
            case 64934:
                if (upperCase.equals(RTP_MEDIA_AMR)) {
                    c = 3;
                    break;
                }
                break;
            case 74609:
                if (upperCase.equals(RTP_MEDIA_PCM_L16)) {
                    c = 4;
                    break;
                }
                break;
            case 85182:
                if (upperCase.equals(RTP_MEDIA_VP8)) {
                    c = 5;
                    break;
                }
                break;
            case 85183:
                if (upperCase.equals(RTP_MEDIA_VP9)) {
                    c = 6;
                    break;
                }
                break;
            case 2194728:
                if (upperCase.equals(RTP_MEDIA_H264)) {
                    c = 7;
                    break;
                }
                break;
            case 2194729:
                if (upperCase.equals(RTP_MEDIA_H265)) {
                    c = '\b';
                    break;
                }
                break;
            case 2433087:
                if (upperCase.equals(RTP_MEDIA_OPUS)) {
                    c = '\t';
                    break;
                }
                break;
            case 2450119:
                if (upperCase.equals(RTP_MEDIA_PCMA)) {
                    c = '\n';
                    break;
                }
                break;
            case 2450139:
                if (upperCase.equals(RTP_MEDIA_PCMU)) {
                    c = 11;
                    break;
                }
                break;
            case 1934494802:
                if (upperCase.equals(RTP_MEDIA_AMR_WB)) {
                    c = '\f';
                    break;
                }
                break;
            case 1959269366:
                if (upperCase.equals(RTP_MEDIA_MPEG4_VIDEO)) {
                    c = '\r';
                    break;
                }
                break;
            case 2137188397:
                if (upperCase.equals(RTP_MEDIA_H263_1998)) {
                    c = 14;
                    break;
                }
                break;
            case 2137209252:
                if (upperCase.equals(RTP_MEDIA_H263_2000)) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
                return true;
            default:
                return false;
        }
    }

    public static String getMimeTypeFromRtpMediaType(String str) {
        String upperCase = Ascii.toUpperCase(str);
        upperCase.hashCode();
        char c = 65535;
        switch (upperCase.hashCode()) {
            case -1922091719:
                if (upperCase.equals(RTP_MEDIA_MPEG4_GENERIC)) {
                    c = 0;
                    break;
                }
                break;
            case 2412:
                if (upperCase.equals(RTP_MEDIA_PCM_L8)) {
                    c = 1;
                    break;
                }
                break;
            case 64593:
                if (upperCase.equals(RTP_MEDIA_AC3)) {
                    c = 2;
                    break;
                }
                break;
            case 64934:
                if (upperCase.equals(RTP_MEDIA_AMR)) {
                    c = 3;
                    break;
                }
                break;
            case 74609:
                if (upperCase.equals(RTP_MEDIA_PCM_L16)) {
                    c = 4;
                    break;
                }
                break;
            case 85182:
                if (upperCase.equals(RTP_MEDIA_VP8)) {
                    c = 5;
                    break;
                }
                break;
            case 85183:
                if (upperCase.equals(RTP_MEDIA_VP9)) {
                    c = 6;
                    break;
                }
                break;
            case 2194728:
                if (upperCase.equals(RTP_MEDIA_H264)) {
                    c = 7;
                    break;
                }
                break;
            case 2194729:
                if (upperCase.equals(RTP_MEDIA_H265)) {
                    c = '\b';
                    break;
                }
                break;
            case 2433087:
                if (upperCase.equals(RTP_MEDIA_OPUS)) {
                    c = '\t';
                    break;
                }
                break;
            case 2450119:
                if (upperCase.equals(RTP_MEDIA_PCMA)) {
                    c = '\n';
                    break;
                }
                break;
            case 2450139:
                if (upperCase.equals(RTP_MEDIA_PCMU)) {
                    c = 11;
                    break;
                }
                break;
            case 1934494802:
                if (upperCase.equals(RTP_MEDIA_AMR_WB)) {
                    c = '\f';
                    break;
                }
                break;
            case 1959269366:
                if (upperCase.equals(RTP_MEDIA_MPEG4_VIDEO)) {
                    c = '\r';
                    break;
                }
                break;
            case 2137188397:
                if (upperCase.equals(RTP_MEDIA_H263_1998)) {
                    c = 14;
                    break;
                }
                break;
            case 2137209252:
                if (upperCase.equals(RTP_MEDIA_H263_2000)) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return MimeTypes.AUDIO_AAC;
            case 1:
            case 4:
                return MimeTypes.AUDIO_RAW;
            case 2:
                return MimeTypes.AUDIO_AC3;
            case 3:
                return MimeTypes.AUDIO_AMR_NB;
            case 5:
                return MimeTypes.VIDEO_VP8;
            case 6:
                return MimeTypes.VIDEO_VP9;
            case 7:
                return MimeTypes.VIDEO_H264;
            case '\b':
                return MimeTypes.VIDEO_H265;
            case '\t':
                return MimeTypes.AUDIO_OPUS;
            case '\n':
                return MimeTypes.AUDIO_ALAW;
            case 11:
                return MimeTypes.AUDIO_MLAW;
            case '\f':
                return MimeTypes.AUDIO_AMR_WB;
            case '\r':
                return MimeTypes.VIDEO_MP4V;
            case 14:
            case 15:
                return MimeTypes.VIDEO_H263;
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public static int getRawPcmEncodingType(String str) {
        Assertions.checkArgument(str.equals(RTP_MEDIA_PCM_L8) || str.equals(RTP_MEDIA_PCM_L16));
        return str.equals(RTP_MEDIA_PCM_L8) ? 3 : 268435456;
    }

    public RtpPayloadFormat(Format format, int i, int i2, Map<String, String> map) {
        this.rtpPayloadType = i;
        this.clockRate = i2;
        this.format = format;
        this.fmtpParameters = ImmutableMap.copyOf((Map) map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RtpPayloadFormat rtpPayloadFormat = (RtpPayloadFormat) obj;
        return this.rtpPayloadType == rtpPayloadFormat.rtpPayloadType && this.clockRate == rtpPayloadFormat.clockRate && this.format.equals(rtpPayloadFormat.format) && this.fmtpParameters.equals(rtpPayloadFormat.fmtpParameters);
    }

    public int hashCode() {
        return ((((((217 + this.rtpPayloadType) * 31) + this.clockRate) * 31) + this.format.hashCode()) * 31) + this.fmtpParameters.hashCode();
    }
}
