package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.core.location.LocationRequestCompat;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class MimeTypes {
    public static final String APPLICATION_AIT = "application/vnd.dvb.ait";
    public static final String APPLICATION_CAMERA_MOTION = "application/x-camera-motion";
    public static final String APPLICATION_CEA608 = "application/cea-608";
    public static final String APPLICATION_CEA708 = "application/cea-708";
    public static final String APPLICATION_DVBSUBS = "application/dvbsubs";
    public static final String APPLICATION_EMSG = "application/x-emsg";
    public static final String APPLICATION_EXIF = "application/x-exif";
    public static final String APPLICATION_ICY = "application/x-icy";
    public static final String APPLICATION_ID3 = "application/id3";
    public static final String APPLICATION_M3U8 = "application/x-mpegURL";
    public static final String APPLICATION_MATROSKA = "application/x-matroska";
    public static final String APPLICATION_MP4 = "application/mp4";
    public static final String APPLICATION_MP4CEA608 = "application/x-mp4-cea-608";
    public static final String APPLICATION_MP4VTT = "application/x-mp4-vtt";
    public static final String APPLICATION_MPD = "application/dash+xml";
    public static final String APPLICATION_PGS = "application/pgs";
    public static final String APPLICATION_RAWCC = "application/x-rawcc";
    public static final String APPLICATION_RTSP = "application/x-rtsp";
    public static final String APPLICATION_SCTE35 = "application/x-scte35";
    public static final String APPLICATION_SS = "application/vnd.ms-sstr+xml";
    public static final String APPLICATION_SUBRIP = "application/x-subrip";
    public static final String APPLICATION_TTML = "application/ttml+xml";
    public static final String APPLICATION_TX3G = "application/x-quicktime-tx3g";
    public static final String APPLICATION_VOBSUB = "application/vobsub";
    public static final String APPLICATION_WEBM = "application/webm";
    public static final String AUDIO_AAC = "audio/mp4a-latm";
    public static final String AUDIO_AC3 = "audio/ac3";
    public static final String AUDIO_AC4 = "audio/ac4";
    public static final String AUDIO_ALAC = "audio/alac";
    public static final String AUDIO_ALAW = "audio/g711-alaw";
    public static final String AUDIO_AMR = "audio/amr";
    public static final String AUDIO_AMR_NB = "audio/3gpp";
    public static final String AUDIO_AMR_WB = "audio/amr-wb";
    public static final String AUDIO_DTS = "audio/vnd.dts";
    public static final String AUDIO_DTS_EXPRESS = "audio/vnd.dts.hd;profile=lbr";
    public static final String AUDIO_DTS_HD = "audio/vnd.dts.hd";
    public static final String AUDIO_DTS_X = "audio/vnd.dts.uhd;profile=p2";
    public static final String AUDIO_E_AC3 = "audio/eac3";
    public static final String AUDIO_E_AC3_JOC = "audio/eac3-joc";
    public static final String AUDIO_FLAC = "audio/flac";
    public static final String AUDIO_MATROSKA = "audio/x-matroska";
    public static final String AUDIO_MIDI = "audio/midi";
    public static final String AUDIO_MLAW = "audio/g711-mlaw";
    public static final String AUDIO_MP4 = "audio/mp4";
    public static final String AUDIO_MPEG = "audio/mpeg";
    public static final String AUDIO_MPEGH_MHA1 = "audio/mha1";
    public static final String AUDIO_MPEGH_MHM1 = "audio/mhm1";
    public static final String AUDIO_MPEG_L1 = "audio/mpeg-L1";
    public static final String AUDIO_MPEG_L2 = "audio/mpeg-L2";
    public static final String AUDIO_MSGSM = "audio/gsm";
    public static final String AUDIO_OGG = "audio/ogg";
    public static final String AUDIO_OPUS = "audio/opus";
    public static final String AUDIO_RAW = "audio/raw";
    public static final String AUDIO_TRUEHD = "audio/true-hd";
    public static final String AUDIO_UNKNOWN = "audio/x-unknown";
    public static final String AUDIO_VORBIS = "audio/vorbis";
    public static final String AUDIO_WAV = "audio/wav";
    public static final String AUDIO_WEBM = "audio/webm";
    public static final String BASE_TYPE_APPLICATION = "application";
    public static final String BASE_TYPE_AUDIO = "audio";
    public static final String BASE_TYPE_IMAGE = "image";
    public static final String BASE_TYPE_TEXT = "text";
    public static final String BASE_TYPE_VIDEO = "video";
    public static final String CODEC_E_AC3_JOC = "ec+3";
    public static final String IMAGE_JPEG = "image/jpeg";
    public static final String TEXT_EXOPLAYER_CUES = "text/x-exoplayer-cues";
    public static final String TEXT_SSA = "text/x-ssa";
    public static final String TEXT_UNKNOWN = "text/x-unknown";
    public static final String TEXT_VTT = "text/vtt";
    public static final String VIDEO_AV1 = "video/av01";
    public static final String VIDEO_AVI = "video/x-msvideo";
    public static final String VIDEO_DIVX = "video/divx";
    public static final String VIDEO_DOLBY_VISION = "video/dolby-vision";
    public static final String VIDEO_FLV = "video/x-flv";
    public static final String VIDEO_H263 = "video/3gpp";
    public static final String VIDEO_H264 = "video/avc";
    public static final String VIDEO_H265 = "video/hevc";
    public static final String VIDEO_MATROSKA = "video/x-matroska";
    public static final String VIDEO_MJPEG = "video/mjpeg";
    public static final String VIDEO_MP2T = "video/mp2t";
    public static final String VIDEO_MP4 = "video/mp4";
    public static final String VIDEO_MP42 = "video/mp42";
    public static final String VIDEO_MP43 = "video/mp43";
    public static final String VIDEO_MP4V = "video/mp4v-es";
    public static final String VIDEO_MPEG = "video/mpeg";
    public static final String VIDEO_MPEG2 = "video/mpeg2";
    public static final String VIDEO_OGG = "video/ogg";
    public static final String VIDEO_PS = "video/mp2p";
    public static final String VIDEO_UNKNOWN = "video/x-unknown";
    public static final String VIDEO_VC1 = "video/wvc1";
    public static final String VIDEO_VP8 = "video/x-vnd.on2.vp8";
    public static final String VIDEO_VP9 = "video/x-vnd.on2.vp9";
    public static final String VIDEO_WEBM = "video/webm";
    private static final ArrayList<CustomMimeType> customMimeTypes = new ArrayList<>();
    private static final Pattern MP4A_RFC_6381_CODEC_PATTERN = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String getMimeTypeFromMp4ObjectType(int i) {
        if (i != 32) {
            if (i != 33) {
                if (i != 35) {
                    if (i != 64) {
                        if (i != 163) {
                            if (i != 177) {
                                if (i != 165) {
                                    if (i != 166) {
                                        switch (i) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return VIDEO_MPEG2;
                                            case 102:
                                            case 103:
                                            case LocationRequestCompat.QUALITY_LOW_POWER /* 104 */:
                                                return AUDIO_AAC;
                                            case 105:
                                            case 107:
                                                return AUDIO_MPEG;
                                            case 106:
                                                return VIDEO_MPEG;
                                            default:
                                                switch (i) {
                                                    case 169:
                                                    case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                                                        return AUDIO_DTS;
                                                    case 170:
                                                    case 171:
                                                        return AUDIO_DTS_HD;
                                                    case 173:
                                                        return AUDIO_OPUS;
                                                    case 174:
                                                        return AUDIO_AC4;
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return AUDIO_E_AC3;
                                }
                                return AUDIO_AC3;
                            }
                            return VIDEO_VP9;
                        }
                        return VIDEO_VC1;
                    }
                    return AUDIO_AAC;
                }
                return VIDEO_H265;
            }
            return VIDEO_H264;
        }
        return VIDEO_MP4V;
    }

    public static void registerCustomMimeType(String str, String str2, int i) {
        CustomMimeType customMimeType = new CustomMimeType(str, str2, i);
        int size = customMimeTypes.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            ArrayList<CustomMimeType> arrayList = customMimeTypes;
            if (str.equals(arrayList.get(i2).mimeType)) {
                arrayList.remove(i2);
                break;
            }
            i2++;
        }
        customMimeTypes.add(customMimeType);
    }

    public static boolean isAudio(String str) {
        return "audio".equals(getTopLevelType(str));
    }

    public static boolean isVideo(String str) {
        return "video".equals(getTopLevelType(str));
    }

    public static boolean isText(String str) {
        return "text".equals(getTopLevelType(str)) || APPLICATION_CEA608.equals(str) || APPLICATION_CEA708.equals(str) || APPLICATION_MP4CEA608.equals(str) || APPLICATION_SUBRIP.equals(str) || APPLICATION_TTML.equals(str) || APPLICATION_TX3G.equals(str) || APPLICATION_MP4VTT.equals(str) || APPLICATION_RAWCC.equals(str) || APPLICATION_VOBSUB.equals(str) || APPLICATION_PGS.equals(str) || APPLICATION_DVBSUBS.equals(str);
    }

    public static boolean isImage(String str) {
        return "image".equals(getTopLevelType(str));
    }

    public static boolean allSamplesAreSyncSamples(String str, String str2) {
        Mp4aObjectType objectTypeFromMp4aRFC6381CodecString;
        int encoding;
        if (str == null) {
            return false;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(AUDIO_E_AC3_JOC)) {
                    c = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals(AUDIO_MPEG_L1)) {
                    c = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals(AUDIO_MPEG_L2)) {
                    c = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals(AUDIO_AAC)) {
                    c = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(AUDIO_AC3)) {
                    c = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals(AUDIO_RAW)) {
                    c = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(AUDIO_E_AC3)) {
                    c = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals(AUDIO_FLAC)) {
                    c = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals(AUDIO_MPEG)) {
                    c = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals(AUDIO_ALAW)) {
                    c = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals(AUDIO_MLAW)) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                return (str2 == null || (objectTypeFromMp4aRFC6381CodecString = getObjectTypeFromMp4aRFC6381CodecString(str2)) == null || (encoding = objectTypeFromMp4aRFC6381CodecString.getEncoding()) == 0 || encoding == 16) ? false : true;
            default:
                return false;
        }
    }

    public static String getVideoMediaMimeType(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : Util.splitCodecs(str)) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isVideo(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    public static boolean containsCodecsCorrespondingToMimeType(String str, String str2) {
        return getCodecsCorrespondingToMimeType(str, str2) != null;
    }

    public static String getCodecsCorrespondingToMimeType(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] splitCodecs = Util.splitCodecs(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : splitCodecs) {
            if (str2.equals(getMediaMimeType(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String getAudioMediaMimeType(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : Util.splitCodecs(str)) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isAudio(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    public static String getTextMediaMimeType(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : Util.splitCodecs(str)) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isText(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    public static String getMediaMimeType(String str) {
        Mp4aObjectType objectTypeFromMp4aRFC6381CodecString;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
            return VIDEO_H264;
        }
        if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
            return VIDEO_H265;
        }
        if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1")) {
            return VIDEO_DOLBY_VISION;
        }
        if (lowerCase.startsWith("av01")) {
            return VIDEO_AV1;
        }
        if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
            return VIDEO_VP9;
        }
        if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
            return VIDEO_VP8;
        }
        if (!lowerCase.startsWith("mp4a")) {
            return lowerCase.startsWith("mha1") ? AUDIO_MPEGH_MHA1 : lowerCase.startsWith("mhm1") ? AUDIO_MPEGH_MHM1 : (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) ? AUDIO_AC3 : (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) ? AUDIO_E_AC3 : lowerCase.startsWith(CODEC_E_AC3_JOC) ? AUDIO_E_AC3_JOC : (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) ? AUDIO_AC4 : lowerCase.startsWith("dtsc") ? AUDIO_DTS : lowerCase.startsWith("dtse") ? AUDIO_DTS_EXPRESS : (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) ? AUDIO_DTS_HD : lowerCase.startsWith("dtsx") ? AUDIO_DTS_X : lowerCase.startsWith("opus") ? AUDIO_OPUS : lowerCase.startsWith("vorbis") ? AUDIO_VORBIS : lowerCase.startsWith("flac") ? AUDIO_FLAC : lowerCase.startsWith("stpp") ? APPLICATION_TTML : lowerCase.startsWith("wvtt") ? TEXT_VTT : lowerCase.contains("cea708") ? APPLICATION_CEA708 : (lowerCase.contains("eia608") || lowerCase.contains("cea608")) ? APPLICATION_CEA608 : getCustomMimeTypeForCodec(lowerCase);
        }
        if (lowerCase.startsWith("mp4a.") && (objectTypeFromMp4aRFC6381CodecString = getObjectTypeFromMp4aRFC6381CodecString(lowerCase)) != null) {
            str2 = getMimeTypeFromMp4ObjectType(objectTypeFromMp4aRFC6381CodecString.objectTypeIndication);
        }
        return str2 == null ? AUDIO_AAC : str2;
    }

    public static int getTrackType(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (isAudio(str)) {
            return 1;
        }
        if (isVideo(str)) {
            return 2;
        }
        if (isText(str)) {
            return 3;
        }
        if (isImage(str)) {
            return 4;
        }
        if (APPLICATION_ID3.equals(str) || APPLICATION_EMSG.equals(str) || APPLICATION_SCTE35.equals(str)) {
            return 5;
        }
        if (APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        return getTrackTypeForCustomMimeType(str);
    }

    public static int getEncoding(String str, String str2) {
        Mp4aObjectType objectTypeFromMp4aRFC6381CodecString;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(AUDIO_E_AC3_JOC)) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals(AUDIO_DTS)) {
                    c = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals(AUDIO_AAC)) {
                    c = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(AUDIO_AC3)) {
                    c = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals(AUDIO_AC4)) {
                    c = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(AUDIO_E_AC3)) {
                    c = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals(AUDIO_MPEG)) {
                    c = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals(AUDIO_DTS_HD)) {
                    c = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals(AUDIO_TRUEHD)) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (objectTypeFromMp4aRFC6381CodecString = getObjectTypeFromMp4aRFC6381CodecString(str2)) == null) {
                    return 0;
                }
                return objectTypeFromMp4aRFC6381CodecString.getEncoding();
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    public static int getTrackTypeOfCodec(String str) {
        return getTrackType(getMediaMimeType(str));
    }

    public static String normalizeMimeType(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return AUDIO_FLAC;
            case 1:
                return AUDIO_WAV;
            case 2:
                return AUDIO_MPEG;
            default:
                return str;
        }
    }

    public static boolean isMatroska(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(VIDEO_WEBM) || str.startsWith(AUDIO_WEBM) || str.startsWith(APPLICATION_WEBM) || str.startsWith(VIDEO_MATROSKA) || str.startsWith(AUDIO_MATROSKA) || str.startsWith(APPLICATION_MATROSKA);
    }

    private static String getTopLevelType(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    private static String getCustomMimeTypeForCodec(String str) {
        int size = customMimeTypes.size();
        for (int i = 0; i < size; i++) {
            CustomMimeType customMimeType = customMimeTypes.get(i);
            if (str.startsWith(customMimeType.codecPrefix)) {
                return customMimeType.mimeType;
            }
        }
        return null;
    }

    private static int getTrackTypeForCustomMimeType(String str) {
        int size = customMimeTypes.size();
        for (int i = 0; i < size; i++) {
            CustomMimeType customMimeType = customMimeTypes.get(i);
            if (str.equals(customMimeType.mimeType)) {
                return customMimeType.trackType;
            }
        }
        return -1;
    }

    private MimeTypes() {
    }

    static Mp4aObjectType getObjectTypeFromMp4aRFC6381CodecString(String str) {
        Matcher matcher = MP4A_RFC_6381_CODEC_PATTERN.matcher(str);
        if (matcher.matches()) {
            String str2 = (String) Assertions.checkNotNull(matcher.group(1));
            String group = matcher.group(2);
            try {
                return new Mp4aObjectType(Integer.parseInt(str2, 16), group != null ? Integer.parseInt(group) : 0);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Mp4aObjectType {
        public final int audioObjectTypeIndication;
        public final int objectTypeIndication;

        public Mp4aObjectType(int i, int i2) {
            this.objectTypeIndication = i;
            this.audioObjectTypeIndication = i2;
        }

        public int getEncoding() {
            int i = this.audioObjectTypeIndication;
            if (i != 2) {
                if (i != 5) {
                    if (i != 29) {
                        if (i != 42) {
                            if (i != 22) {
                                return i != 23 ? 0 : 15;
                            }
                            return 1073741824;
                        }
                        return 16;
                    }
                    return 12;
                }
                return 11;
            }
            return 10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class CustomMimeType {
        public final String codecPrefix;
        public final String mimeType;
        public final int trackType;

        public CustomMimeType(String str, String str2, int i) {
            this.mimeType = str;
            this.codecPrefix = str2;
            this.trackType = i;
        }
    }
}
