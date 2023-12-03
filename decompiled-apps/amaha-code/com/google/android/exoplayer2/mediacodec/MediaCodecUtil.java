package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import c9.l;
import c9.w;
import com.appsflyer.R;
import com.google.android.exoplayer2.n;
import com.theinnerhour.b2b.utils.Constants;
import f8.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class MediaCodecUtil {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f6618a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<a, List<com.google.android.exoplayer2.mediacodec.d>> f6619b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static int f6620c = -1;

    /* loaded from: classes.dex */
    public static class DecoderQueryException extends Exception {
        public DecoderQueryException(Exception exc) {
            super("Failed to query underlying media codecs", exc);
        }
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f6621a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6622b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f6623c;

        public a(String str, boolean z10, boolean z11) {
            this.f6621a = str;
            this.f6622b = z10;
            this.f6623c = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            if (TextUtils.equals(this.f6621a, aVar.f6621a) && this.f6622b == aVar.f6622b && this.f6623c == aVar.f6623c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i6;
            int c10 = pl.a.c(this.f6621a, 31, 31);
            int i10 = 1231;
            if (this.f6622b) {
                i6 = 1231;
            } else {
                i6 = 1237;
            }
            int i11 = (c10 + i6) * 31;
            if (!this.f6623c) {
                i10 = 1237;
            }
            return i11 + i10;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        MediaCodecInfo a(int i6);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* loaded from: classes.dex */
    public static final class c implements b {
        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.b
        public final MediaCodecInfo a(int i6) {
            return MediaCodecList.getCodecInfoAt(i6);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.b
        public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.b
        public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.b
        public final int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.b
        public final boolean e() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public final int f6624a;

        /* renamed from: b  reason: collision with root package name */
        public MediaCodecInfo[] f6625b;

        public d(boolean z10, boolean z11) {
            int i6;
            if (!z10 && !z11) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            this.f6624a = i6;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.b
        public final MediaCodecInfo a(int i6) {
            if (this.f6625b == null) {
                this.f6625b = new MediaCodecList(this.f6624a).getCodecInfos();
            }
            return this.f6625b[i6];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.b
        public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.b
        public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.b
        public final int d() {
            if (this.f6625b == null) {
                this.f6625b = new MediaCodecList(this.f6624a).getCodecInfos();
            }
            return this.f6625b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.b
        public final boolean e() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface e<T> {
        int a(T t3);
    }

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (w.f5205a < 26 && w.f5206b.equals("R9") && arrayList.size() == 1 && ((com.google.android.exoplayer2.mediacodec.d) arrayList.get(0)).f6638a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(com.google.android.exoplayer2.mediacodec.d.g("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new j(0, new p7.e(13)));
        }
        int i6 = w.f5205a;
        if (i6 < 21 && arrayList.size() > 1) {
            String str2 = ((com.google.android.exoplayer2.mediacodec.d) arrayList.get(0)).f6638a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new j(0, new p7.e(14)));
            }
        }
        if (i6 < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((com.google.android.exoplayer2.mediacodec.d) arrayList.get(0)).f6638a)) {
            arrayList.add((com.google.android.exoplayer2.mediacodec.d) arrayList.remove(0));
        }
    }

    public static String b(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x042b A[Catch: NumberFormatException -> 0x043b, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x043b, blocks: (B:280:0x03c0, B:282:0x03d4, B:294:0x03f3, B:310:0x042b), top: B:638:0x03c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:479:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:647:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> c(n nVar) {
        char c10;
        String str;
        int i6;
        int i10;
        int i11;
        String str2;
        String str3;
        String str4;
        int parseInt;
        int parseInt2;
        int i12;
        int i13;
        int i14;
        String str5;
        String str6;
        int i15;
        Integer num;
        String str7;
        char c11;
        String str8;
        String str9;
        String str10;
        int i16;
        int i17;
        String str11;
        String str12;
        int i18;
        int i19;
        int i20;
        String str13;
        Integer num2;
        Integer num3;
        String str14;
        char c12;
        String str15;
        char c13;
        String str16;
        String str17;
        String str18 = nVar.C;
        if (str18 == null) {
            return null;
        }
        String[] split = str18.split("\\.");
        boolean equals = "video/dolby-vision".equals(nVar.F);
        String str19 = nVar.C;
        if (equals) {
            if (split.length < 3) {
                String valueOf = String.valueOf(str19);
                if (valueOf.length() != 0) {
                    str17 = "Ignoring malformed Dolby Vision codec string: ".concat(valueOf);
                } else {
                    str17 = new String("Ignoring malformed Dolby Vision codec string: ");
                }
                Log.w("MediaCodecUtil", str17);
            } else {
                Matcher matcher = f6618a.matcher(split[1]);
                if (!matcher.matches()) {
                    String valueOf2 = String.valueOf(str19);
                    if (valueOf2.length() != 0) {
                        str16 = "Ignoring malformed Dolby Vision codec string: ".concat(valueOf2);
                    } else {
                        str16 = new String("Ignoring malformed Dolby Vision codec string: ");
                    }
                    Log.w("MediaCodecUtil", str16);
                } else {
                    String group = matcher.group(1);
                    if (group != null) {
                        switch (group.hashCode()) {
                            case 1536:
                                if (group.equals("00")) {
                                    c13 = 0;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 1537:
                                if (group.equals("01")) {
                                    c13 = 1;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 1538:
                                if (group.equals("02")) {
                                    c13 = 2;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 1539:
                                if (group.equals("03")) {
                                    c13 = 3;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 1540:
                                if (group.equals("04")) {
                                    c13 = 4;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 1541:
                                if (group.equals("05")) {
                                    c13 = 5;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 1542:
                                if (group.equals("06")) {
                                    c13 = 6;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 1543:
                                if (group.equals("07")) {
                                    c13 = 7;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 1544:
                                if (group.equals("08")) {
                                    c13 = '\b';
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 1545:
                                if (group.equals("09")) {
                                    c13 = '\t';
                                    break;
                                }
                                c13 = 65535;
                                break;
                            default:
                                c13 = 65535;
                                break;
                        }
                        switch (c13) {
                            case 0:
                                num2 = 1;
                                break;
                            case 1:
                                num2 = 2;
                                break;
                            case 2:
                                num2 = 4;
                                break;
                            case 3:
                                num2 = 8;
                                break;
                            case 4:
                                num2 = 16;
                                break;
                            case 5:
                                num2 = 32;
                                break;
                            case 6:
                                num2 = 64;
                                break;
                            case 7:
                                num2 = 128;
                                break;
                            case '\b':
                                num2 = 256;
                                break;
                            case '\t':
                                num2 = 512;
                                break;
                        }
                        if (num2 != null) {
                            String valueOf3 = String.valueOf(group);
                            if (valueOf3.length() != 0) {
                                str15 = "Unknown Dolby Vision profile string: ".concat(valueOf3);
                            } else {
                                str15 = new String("Unknown Dolby Vision profile string: ");
                            }
                            Log.w("MediaCodecUtil", str15);
                        } else {
                            String str20 = split[2];
                            if (str20 != null) {
                                int hashCode = str20.hashCode();
                                switch (hashCode) {
                                    case 1537:
                                        if (str20.equals("01")) {
                                            c12 = 0;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 1538:
                                        if (str20.equals("02")) {
                                            c12 = 1;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 1539:
                                        if (str20.equals("03")) {
                                            c12 = 2;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 1540:
                                        if (str20.equals("04")) {
                                            c12 = 3;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 1541:
                                        if (str20.equals("05")) {
                                            c12 = 4;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 1542:
                                        if (str20.equals("06")) {
                                            c12 = 5;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 1543:
                                        if (str20.equals("07")) {
                                            c12 = 6;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 1544:
                                        if (str20.equals("08")) {
                                            c12 = 7;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 1545:
                                        if (str20.equals("09")) {
                                            c12 = '\b';
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    default:
                                        switch (hashCode) {
                                            case 1567:
                                                if (str20.equals("10")) {
                                                    c12 = '\t';
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            case 1568:
                                                if (str20.equals("11")) {
                                                    c12 = '\n';
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            case 1569:
                                                if (str20.equals("12")) {
                                                    c12 = 11;
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            case 1570:
                                                if (str20.equals("13")) {
                                                    c12 = '\f';
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            default:
                                                c12 = 65535;
                                                break;
                                        }
                                }
                                switch (c12) {
                                    case 0:
                                        num3 = 1;
                                        break;
                                    case 1:
                                        num3 = 2;
                                        break;
                                    case 2:
                                        num3 = 4;
                                        break;
                                    case 3:
                                        num3 = 8;
                                        break;
                                    case 4:
                                        num3 = 16;
                                        break;
                                    case 5:
                                        num3 = 32;
                                        break;
                                    case 6:
                                        num3 = 64;
                                        break;
                                    case 7:
                                        num3 = 128;
                                        break;
                                    case '\b':
                                        num3 = 256;
                                        break;
                                    case '\t':
                                        num3 = 512;
                                        break;
                                    case '\n':
                                        num3 = Integer.valueOf((int) Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID);
                                        break;
                                    case 11:
                                        num3 = Integer.valueOf((int) Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID);
                                        break;
                                    case '\f':
                                        num3 = 4096;
                                        break;
                                }
                                if (num3 != null) {
                                    String valueOf4 = String.valueOf(str20);
                                    if (valueOf4.length() != 0) {
                                        str14 = "Unknown Dolby Vision level string: ".concat(valueOf4);
                                    } else {
                                        str14 = new String("Unknown Dolby Vision level string: ");
                                    }
                                    Log.w("MediaCodecUtil", str14);
                                } else {
                                    return new Pair<>(num2, num3);
                                }
                            }
                            num3 = null;
                            if (num3 != null) {
                            }
                        }
                    }
                    num2 = null;
                    if (num2 != null) {
                    }
                }
            }
            return null;
        }
        String str21 = split[0];
        str21.getClass();
        switch (str21.hashCode()) {
            case 3004662:
                if (str21.equals("av01")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 3006243:
                if (str21.equals("avc1")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3006244:
                if (str21.equals("avc2")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3199032:
                if (str21.equals("hev1")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3214780:
                if (str21.equals("hvc1")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 3356560:
                if (str21.equals("mp4a")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 3624515:
                if (str21.equals("vp09")) {
                    c10 = 6;
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
                if (split.length < 4) {
                    String valueOf5 = String.valueOf(str19);
                    if (valueOf5.length() != 0) {
                        str2 = "Ignoring malformed AV1 codec string: ".concat(valueOf5);
                    } else {
                        str2 = new String("Ignoring malformed AV1 codec string: ");
                    }
                    Log.w("MediaCodecUtil", str2);
                    return null;
                }
                try {
                    int parseInt3 = Integer.parseInt(split[1]);
                    int parseInt4 = Integer.parseInt(split[2].substring(0, 2));
                    int parseInt5 = Integer.parseInt(split[3]);
                    if (parseInt3 != 0) {
                        defpackage.d.k(32, "Unknown AV1 profile: ", parseInt3, "MediaCodecUtil");
                    } else {
                        int i21 = 8;
                        if (parseInt5 != 8) {
                            if (parseInt5 != 10) {
                                defpackage.d.k(34, "Unknown AV1 bit depth: ", parseInt5, "MediaCodecUtil");
                            } else {
                                i21 = 8;
                            }
                        }
                        if (parseInt5 == i21) {
                            i6 = 1;
                        } else {
                            d9.b bVar = nVar.R;
                            if (bVar != null && (bVar.f12612x != null || (i10 = bVar.f12611w) == 7 || i10 == 6)) {
                                i6 = 4096;
                            } else {
                                i6 = 2;
                            }
                        }
                        switch (parseInt4) {
                            case 0:
                                i11 = -1;
                                i21 = 1;
                                break;
                            case 1:
                                i11 = -1;
                                i21 = 2;
                                break;
                            case 2:
                                i11 = -1;
                                i21 = 4;
                                break;
                            case 3:
                                i11 = -1;
                                break;
                            case 4:
                                i11 = -1;
                                i21 = 16;
                                break;
                            case 5:
                                i11 = -1;
                                i21 = 32;
                                break;
                            case 6:
                                i11 = -1;
                                i21 = 64;
                                break;
                            case 7:
                                i11 = -1;
                                i21 = 128;
                                break;
                            case 8:
                                i11 = -1;
                                i21 = 256;
                                break;
                            case 9:
                                i11 = -1;
                                i21 = 512;
                                break;
                            case 10:
                                i21 = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
                                i11 = -1;
                                break;
                            case 11:
                                i11 = -1;
                                i21 = Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
                                break;
                            case 12:
                                i11 = -1;
                                i21 = 4096;
                                break;
                            case 13:
                                i21 = 8192;
                                i11 = -1;
                                break;
                            case 14:
                                i21 = 16384;
                                i11 = -1;
                                break;
                            case 15:
                                i21 = 32768;
                                i11 = -1;
                                break;
                            case 16:
                                i21 = 65536;
                                i11 = -1;
                                break;
                            case 17:
                                i21 = 131072;
                                i11 = -1;
                                break;
                            case 18:
                                i21 = 262144;
                                i11 = -1;
                                break;
                            case 19:
                                i21 = 524288;
                                i11 = -1;
                                break;
                            case 20:
                                i21 = 1048576;
                                i11 = -1;
                                break;
                            case 21:
                                i21 = 2097152;
                                i11 = -1;
                                break;
                            case 22:
                                i21 = 4194304;
                                i11 = -1;
                                break;
                            case 23:
                                i21 = 8388608;
                                i11 = -1;
                                break;
                            default:
                                i11 = -1;
                                i21 = -1;
                                break;
                        }
                        if (i21 == i11) {
                            defpackage.d.k(30, "Unknown AV1 level: ", parseInt4, "MediaCodecUtil");
                        } else {
                            return new Pair<>(Integer.valueOf(i6), Integer.valueOf(i21));
                        }
                    }
                } catch (NumberFormatException unused) {
                    String valueOf6 = String.valueOf(str19);
                    if (valueOf6.length() != 0) {
                        str = "Ignoring malformed AV1 codec string: ".concat(valueOf6);
                    } else {
                        str = new String("Ignoring malformed AV1 codec string: ");
                    }
                    Log.w("MediaCodecUtil", str);
                }
                return null;
            case 1:
            case 2:
                if (split.length < 2) {
                    String valueOf7 = String.valueOf(str19);
                    if (valueOf7.length() != 0) {
                        str5 = "Ignoring malformed AVC codec string: ".concat(valueOf7);
                    } else {
                        str5 = new String("Ignoring malformed AVC codec string: ");
                    }
                    Log.w("MediaCodecUtil", str5);
                    return null;
                }
                try {
                    if (split[1].length() == 6) {
                        parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                        parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                    } else if (split.length >= 3) {
                        parseInt = Integer.parseInt(split[1]);
                        parseInt2 = Integer.parseInt(split[2]);
                    } else {
                        String valueOf8 = String.valueOf(str19);
                        if (valueOf8.length() != 0) {
                            str4 = "Ignoring malformed AVC codec string: ".concat(valueOf8);
                        } else {
                            str4 = new String("Ignoring malformed AVC codec string: ");
                        }
                        Log.w("MediaCodecUtil", str4);
                        return null;
                    }
                    if (parseInt != 66) {
                        if (parseInt != 77) {
                            if (parseInt != 88) {
                                if (parseInt != 100) {
                                    if (parseInt != 110) {
                                        if (parseInt != 122) {
                                            if (parseInt != 244) {
                                                i12 = -1;
                                            } else {
                                                i12 = 64;
                                            }
                                        } else {
                                            i12 = 32;
                                        }
                                    } else {
                                        i12 = 16;
                                    }
                                } else {
                                    i12 = 8;
                                }
                            } else {
                                i12 = 4;
                            }
                        } else {
                            i12 = 2;
                        }
                    } else {
                        i12 = 1;
                    }
                    if (i12 == -1) {
                        defpackage.d.k(32, "Unknown AVC profile: ", parseInt, "MediaCodecUtil");
                        return null;
                    }
                    switch (parseInt2) {
                        case 10:
                            i13 = -1;
                            i14 = 1;
                            break;
                        case 11:
                            i13 = -1;
                            i14 = 4;
                            break;
                        case 12:
                            i13 = -1;
                            i14 = 8;
                            break;
                        case 13:
                            i13 = -1;
                            i14 = 16;
                            break;
                        default:
                            switch (parseInt2) {
                                case 20:
                                    i13 = -1;
                                    i14 = 32;
                                    break;
                                case 21:
                                    i13 = -1;
                                    i14 = 64;
                                    break;
                                case 22:
                                    i13 = -1;
                                    i14 = 128;
                                    break;
                                default:
                                    switch (parseInt2) {
                                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                            i13 = -1;
                                            i14 = 256;
                                            break;
                                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                            i13 = -1;
                                            i14 = 512;
                                            break;
                                        case 32:
                                            i14 = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
                                            i13 = -1;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                                    i13 = -1;
                                                    i14 = Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
                                                    break;
                                                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                                    i13 = -1;
                                                    i14 = 4096;
                                                    break;
                                                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                                    i14 = 8192;
                                                    i13 = -1;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 50:
                                                            i14 = 16384;
                                                            i13 = -1;
                                                            break;
                                                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                                            i14 = 32768;
                                                            i13 = -1;
                                                            break;
                                                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                                            i14 = 65536;
                                                            i13 = -1;
                                                            break;
                                                        default:
                                                            i13 = -1;
                                                            i14 = -1;
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
                    if (i14 == i13) {
                        defpackage.d.k(30, "Unknown AVC level: ", parseInt2, "MediaCodecUtil");
                        return null;
                    }
                    return new Pair<>(Integer.valueOf(i12), Integer.valueOf(i14));
                } catch (NumberFormatException unused2) {
                    String valueOf9 = String.valueOf(str19);
                    if (valueOf9.length() != 0) {
                        str3 = "Ignoring malformed AVC codec string: ".concat(valueOf9);
                    } else {
                        str3 = new String("Ignoring malformed AVC codec string: ");
                    }
                    Log.w("MediaCodecUtil", str3);
                    return null;
                }
            case 3:
            case 4:
                if (split.length < 4) {
                    String valueOf10 = String.valueOf(str19);
                    if (valueOf10.length() != 0) {
                        str9 = "Ignoring malformed HEVC codec string: ".concat(valueOf10);
                    } else {
                        str9 = new String("Ignoring malformed HEVC codec string: ");
                    }
                    Log.w("MediaCodecUtil", str9);
                    return null;
                }
                Matcher matcher2 = f6618a.matcher(split[1]);
                if (!matcher2.matches()) {
                    String valueOf11 = String.valueOf(str19);
                    if (valueOf11.length() != 0) {
                        str8 = "Ignoring malformed HEVC codec string: ".concat(valueOf11);
                    } else {
                        str8 = new String("Ignoring malformed HEVC codec string: ");
                    }
                    Log.w("MediaCodecUtil", str8);
                    return null;
                }
                String group2 = matcher2.group(1);
                if ("1".equals(group2)) {
                    i15 = 1;
                } else if ("2".equals(group2)) {
                    i15 = 2;
                } else {
                    String valueOf12 = String.valueOf(group2);
                    if (valueOf12.length() != 0) {
                        str6 = "Unknown HEVC profile string: ".concat(valueOf12);
                    } else {
                        str6 = new String("Unknown HEVC profile string: ");
                    }
                    Log.w("MediaCodecUtil", str6);
                    return null;
                }
                String str22 = split[3];
                if (str22 != null) {
                    switch (str22.hashCode()) {
                        case 70821:
                            if (str22.equals("H30")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 70914:
                            if (str22.equals("H60")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 70917:
                            if (str22.equals("H63")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 71007:
                            if (str22.equals("H90")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 71010:
                            if (str22.equals("H93")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 74665:
                            if (str22.equals("L30")) {
                                c11 = 5;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 74758:
                            if (str22.equals("L60")) {
                                c11 = 6;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 74761:
                            if (str22.equals("L63")) {
                                c11 = 7;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 74851:
                            if (str22.equals("L90")) {
                                c11 = '\b';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 74854:
                            if (str22.equals("L93")) {
                                c11 = '\t';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2193639:
                            if (str22.equals("H120")) {
                                c11 = '\n';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2193642:
                            if (str22.equals("H123")) {
                                c11 = 11;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2193732:
                            if (str22.equals("H150")) {
                                c11 = '\f';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2193735:
                            if (str22.equals("H153")) {
                                c11 = '\r';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2193738:
                            if (str22.equals("H156")) {
                                c11 = 14;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2193825:
                            if (str22.equals("H180")) {
                                c11 = 15;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2193828:
                            if (str22.equals("H183")) {
                                c11 = 16;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2193831:
                            if (str22.equals("H186")) {
                                c11 = 17;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2312803:
                            if (str22.equals("L120")) {
                                c11 = 18;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2312806:
                            if (str22.equals("L123")) {
                                c11 = 19;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2312896:
                            if (str22.equals("L150")) {
                                c11 = 20;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2312899:
                            if (str22.equals("L153")) {
                                c11 = 21;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2312902:
                            if (str22.equals("L156")) {
                                c11 = 22;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2312989:
                            if (str22.equals("L180")) {
                                c11 = 23;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2312992:
                            if (str22.equals("L183")) {
                                c11 = 24;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2312995:
                            if (str22.equals("L186")) {
                                c11 = 25;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            num = 2;
                            break;
                        case 1:
                            num = 8;
                            break;
                        case 2:
                            num = 32;
                            break;
                        case 3:
                            num = 128;
                            break;
                        case 4:
                            num = 512;
                            break;
                        case 5:
                            num = 1;
                            break;
                        case 6:
                            num = 4;
                            break;
                        case 7:
                            num = 16;
                            break;
                        case '\b':
                            num = 64;
                            break;
                        case '\t':
                            num = 256;
                            break;
                        case '\n':
                            num = Integer.valueOf((int) Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID);
                            break;
                        case 11:
                            num = 8192;
                            break;
                        case '\f':
                            num = 32768;
                            break;
                        case '\r':
                            num = 131072;
                            break;
                        case 14:
                            num = 524288;
                            break;
                        case 15:
                            num = 2097152;
                            break;
                        case 16:
                            num = 8388608;
                            break;
                        case 17:
                            num = 33554432;
                            break;
                        case 18:
                            num = Integer.valueOf((int) Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID);
                            break;
                        case 19:
                            num = 4096;
                            break;
                        case 20:
                            num = 16384;
                            break;
                        case 21:
                            num = 65536;
                            break;
                        case 22:
                            num = 262144;
                            break;
                        case 23:
                            num = 1048576;
                            break;
                        case 24:
                            num = 4194304;
                            break;
                        case 25:
                            num = 16777216;
                            break;
                    }
                    if (num != null) {
                        String valueOf13 = String.valueOf(str22);
                        if (valueOf13.length() != 0) {
                            str7 = "Unknown HEVC level string: ".concat(valueOf13);
                        } else {
                            str7 = new String("Unknown HEVC level string: ");
                        }
                        Log.w("MediaCodecUtil", str7);
                        return null;
                    }
                    return new Pair<>(Integer.valueOf(i15), num);
                }
                num = null;
                if (num != null) {
                }
            case 5:
                if (split.length != 3) {
                    String valueOf14 = String.valueOf(str19);
                    if (valueOf14.length() != 0) {
                        str11 = "Ignoring malformed MP4A codec string: ".concat(valueOf14);
                    } else {
                        str11 = new String("Ignoring malformed MP4A codec string: ");
                    }
                    Log.w("MediaCodecUtil", str11);
                    return null;
                }
                try {
                    if (!"audio/mp4a-latm".equals(l.d(Integer.parseInt(split[1], 16)))) {
                        return null;
                    }
                    int parseInt6 = Integer.parseInt(split[2]);
                    if (parseInt6 != 17) {
                        if (parseInt6 != 20) {
                            if (parseInt6 != 23) {
                                if (parseInt6 != 29) {
                                    if (parseInt6 != 39) {
                                        if (parseInt6 != 42) {
                                            switch (parseInt6) {
                                                case 1:
                                                    i17 = -1;
                                                    i16 = 1;
                                                    break;
                                                case 2:
                                                    i17 = -1;
                                                    i16 = 2;
                                                    break;
                                                case 3:
                                                    i17 = -1;
                                                    i16 = 3;
                                                    break;
                                                case 4:
                                                    i17 = -1;
                                                    i16 = 4;
                                                    break;
                                                case 5:
                                                    i17 = -1;
                                                    i16 = 5;
                                                    break;
                                                case 6:
                                                    i17 = -1;
                                                    i16 = 6;
                                                    break;
                                                default:
                                                    i17 = -1;
                                                    i16 = -1;
                                                    break;
                                            }
                                            if (i16 != i17) {
                                                return null;
                                            }
                                            return new Pair<>(Integer.valueOf(i16), 0);
                                        }
                                        i16 = 42;
                                    } else {
                                        i16 = 39;
                                    }
                                } else {
                                    i16 = 29;
                                }
                            } else {
                                i16 = 23;
                            }
                        } else {
                            i16 = 20;
                        }
                    } else {
                        i16 = 17;
                    }
                    i17 = -1;
                    if (i16 != i17) {
                    }
                } catch (NumberFormatException unused3) {
                    String valueOf15 = String.valueOf(str19);
                    if (valueOf15.length() != 0) {
                        str10 = "Ignoring malformed MP4A codec string: ".concat(valueOf15);
                    } else {
                        str10 = new String("Ignoring malformed MP4A codec string: ");
                    }
                    Log.w("MediaCodecUtil", str10);
                    return null;
                }
            case 6:
                if (split.length < 3) {
                    String valueOf16 = String.valueOf(str19);
                    if (valueOf16.length() != 0) {
                        str13 = "Ignoring malformed VP9 codec string: ".concat(valueOf16);
                    } else {
                        str13 = new String("Ignoring malformed VP9 codec string: ");
                    }
                    Log.w("MediaCodecUtil", str13);
                    return null;
                }
                try {
                    int parseInt7 = Integer.parseInt(split[1]);
                    int parseInt8 = Integer.parseInt(split[2]);
                    if (parseInt7 != 0) {
                        if (parseInt7 != 1) {
                            if (parseInt7 != 2) {
                                if (parseInt7 != 3) {
                                    i18 = -1;
                                } else {
                                    i18 = 8;
                                }
                            } else {
                                i18 = 4;
                            }
                        } else {
                            i18 = 2;
                        }
                    } else {
                        i18 = 1;
                    }
                    if (i18 == -1) {
                        defpackage.d.k(32, "Unknown VP9 profile: ", parseInt7, "MediaCodecUtil");
                        return null;
                    }
                    if (parseInt8 != 10) {
                        if (parseInt8 != 11) {
                            if (parseInt8 != 20) {
                                if (parseInt8 != 21) {
                                    if (parseInt8 != 30) {
                                        if (parseInt8 != 31) {
                                            if (parseInt8 != 40) {
                                                if (parseInt8 != 41) {
                                                    if (parseInt8 != 50) {
                                                        if (parseInt8 != 51) {
                                                            switch (parseInt8) {
                                                                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                                                    i19 = -1;
                                                                    i20 = Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                                                    i19 = -1;
                                                                    i20 = 4096;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                                                    i20 = 8192;
                                                                    i19 = -1;
                                                                    break;
                                                                default:
                                                                    i19 = -1;
                                                                    i20 = -1;
                                                                    break;
                                                            }
                                                        } else {
                                                            i19 = -1;
                                                            i20 = 512;
                                                        }
                                                    } else {
                                                        i19 = -1;
                                                        i20 = 256;
                                                    }
                                                } else {
                                                    i19 = -1;
                                                    i20 = 128;
                                                }
                                            } else {
                                                i19 = -1;
                                                i20 = 64;
                                            }
                                        } else {
                                            i19 = -1;
                                            i20 = 32;
                                        }
                                    } else {
                                        i19 = -1;
                                        i20 = 16;
                                    }
                                } else {
                                    i19 = -1;
                                    i20 = 8;
                                }
                            } else {
                                i19 = -1;
                                i20 = 4;
                            }
                        } else {
                            i19 = -1;
                            i20 = 2;
                        }
                    } else {
                        i19 = -1;
                        i20 = 1;
                    }
                    if (i20 == i19) {
                        defpackage.d.k(30, "Unknown VP9 level: ", parseInt8, "MediaCodecUtil");
                        return null;
                    }
                    return new Pair<>(Integer.valueOf(i18), Integer.valueOf(i20));
                } catch (NumberFormatException unused4) {
                    String valueOf17 = String.valueOf(str19);
                    if (valueOf17.length() != 0) {
                        str12 = "Ignoring malformed VP9 codec string: ".concat(valueOf17);
                    } else {
                        str12 = new String("Ignoring malformed VP9 codec string: ");
                    }
                    Log.w("MediaCodecUtil", str12);
                    return null;
                }
            default:
                return null;
        }
    }

    public static synchronized List<com.google.android.exoplayer2.mediacodec.d> d(String str, boolean z10, boolean z11) {
        b cVar;
        synchronized (MediaCodecUtil.class) {
            a aVar = new a(str, z10, z11);
            HashMap<a, List<com.google.android.exoplayer2.mediacodec.d>> hashMap = f6619b;
            List<com.google.android.exoplayer2.mediacodec.d> list = hashMap.get(aVar);
            if (list != null) {
                return list;
            }
            int i6 = w.f5205a;
            if (i6 >= 21) {
                cVar = new d(z10, z11);
            } else {
                cVar = new c();
            }
            ArrayList<com.google.android.exoplayer2.mediacodec.d> e10 = e(aVar, cVar);
            if (z10 && e10.isEmpty() && 21 <= i6 && i6 <= 23) {
                e10 = e(aVar, new c());
                if (!e10.isEmpty()) {
                    String str2 = e10.get(0).f6638a;
                    StringBuilder sb2 = new StringBuilder(str.length() + 63 + String.valueOf(str2).length());
                    sb2.append("MediaCodecList API didn't list secure decoder for: ");
                    sb2.append(str);
                    sb2.append(". Assuming: ");
                    sb2.append(str2);
                    Log.w("MediaCodecUtil", sb2.toString());
                }
            }
            a(str, e10);
            List<com.google.android.exoplayer2.mediacodec.d> unmodifiableList = Collections.unmodifiableList(e10);
            hashMap.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[Catch: Exception -> 0x017a, TryCatch #0 {Exception -> 0x017a, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:72:0x013c, B:13:0x0032, B:16:0x003d, B:66:0x010b, B:69:0x0113, B:71:0x0119, B:73:0x0146, B:74:0x0178), top: B:79:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList<com.google.android.exoplayer2.mediacodec.d> e(a aVar, b bVar) {
        boolean z10;
        String b10;
        String str;
        String str2;
        int i6;
        boolean z11;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean b11;
        boolean c10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean isAlias;
        a aVar2 = aVar;
        b bVar2 = bVar;
        try {
            ArrayList<com.google.android.exoplayer2.mediacodec.d> arrayList = new ArrayList<>();
            String str3 = aVar2.f6621a;
            int d10 = bVar.d();
            boolean e10 = bVar.e();
            int i10 = 0;
            while (i10 < d10) {
                MediaCodecInfo a10 = bVar2.a(i10);
                int i11 = w.f5205a;
                if (i11 >= 29) {
                    isAlias = a10.isAlias();
                    if (isAlias) {
                        z10 = true;
                        if (z10) {
                            String name = a10.getName();
                            if (f(a10, name, e10, str3) && (b10 = b(a10, name, str3)) != null) {
                                try {
                                    capabilitiesForType = a10.getCapabilitiesForType(b10);
                                    b11 = bVar2.b("tunneled-playback", b10, capabilitiesForType);
                                    c10 = bVar2.c("tunneled-playback", capabilitiesForType);
                                    z12 = aVar2.f6623c;
                                } catch (Exception e11) {
                                    e = e11;
                                    str = b10;
                                    str2 = name;
                                    i6 = i10;
                                    z11 = e10;
                                }
                                if ((z12 || !c10) && (!z12 || b11)) {
                                    boolean b12 = bVar2.b("secure-playback", b10, capabilitiesForType);
                                    boolean c11 = bVar2.c("secure-playback", capabilitiesForType);
                                    boolean z16 = aVar2.f6622b;
                                    if ((z16 || !c11) && (!z16 || b12)) {
                                        if (i11 >= 29) {
                                            z14 = a10.isHardwareAccelerated();
                                            z13 = true;
                                        } else {
                                            z13 = true;
                                            z14 = !g(a10);
                                        }
                                        boolean g5 = g(a10);
                                        if (i11 >= 29) {
                                            z15 = a10.isVendor();
                                        } else {
                                            String h02 = sc.b.h0(a10.getName());
                                            z15 = (h02.startsWith("omx.google.") || h02.startsWith("c2.android.") || h02.startsWith("c2.google.")) ? false : false;
                                        }
                                        if ((e10 && z16 == b12) || (!e10 && !z16)) {
                                            str = b10;
                                            i6 = i10;
                                            z11 = e10;
                                            try {
                                                arrayList.add(com.google.android.exoplayer2.mediacodec.d.g(name, str3, b10, capabilitiesForType, z14, g5, z15, false));
                                            } catch (Exception e12) {
                                                e = e12;
                                                str2 = name;
                                                if (w.f5205a > 23 && !arrayList.isEmpty()) {
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 46);
                                                    sb2.append("Skipping codec ");
                                                    sb2.append(str2);
                                                    sb2.append(" (failed to query capabilities)");
                                                    Log.e("MediaCodecUtil", sb2.toString());
                                                    i10 = i6 + 1;
                                                    aVar2 = aVar;
                                                    bVar2 = bVar;
                                                    e10 = z11;
                                                } else {
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 25 + str.length());
                                                    sb3.append("Failed to query codec ");
                                                    sb3.append(str2);
                                                    sb3.append(" (");
                                                    sb3.append(str);
                                                    sb3.append(")");
                                                    Log.e("MediaCodecUtil", sb3.toString());
                                                    throw e;
                                                }
                                            }
                                        } else {
                                            str = b10;
                                            str2 = name;
                                            i6 = i10;
                                            z11 = e10;
                                            if (!z11 && b12) {
                                                try {
                                                    arrayList.add(com.google.android.exoplayer2.mediacodec.d.g(String.valueOf(str2).concat(".secure"), str3, str, capabilitiesForType, z14, g5, z15, true));
                                                    return arrayList;
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    if (w.f5205a > 23) {
                                                    }
                                                    StringBuilder sb32 = new StringBuilder(String.valueOf(str2).length() + 25 + str.length());
                                                    sb32.append("Failed to query codec ");
                                                    sb32.append(str2);
                                                    sb32.append(" (");
                                                    sb32.append(str);
                                                    sb32.append(")");
                                                    Log.e("MediaCodecUtil", sb32.toString());
                                                    throw e;
                                                }
                                            }
                                        }
                                        i10 = i6 + 1;
                                        aVar2 = aVar;
                                        bVar2 = bVar;
                                        e10 = z11;
                                    }
                                }
                            }
                        }
                        i6 = i10;
                        z11 = e10;
                        i10 = i6 + 1;
                        aVar2 = aVar;
                        bVar2 = bVar;
                        e10 = z11;
                    }
                }
                z10 = false;
                if (z10) {
                }
                i6 = i10;
                z11 = e10;
                i10 = i6 + 1;
                aVar2 = aVar;
                bVar2 = bVar;
                e10 = z11;
            }
            return arrayList;
        } catch (Exception e14) {
            throw new DecoderQueryException(e14);
        }
    }

    public static boolean f(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i6 = w.f5205a;
        if (i6 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i6 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = w.f5206b;
            if ("a70".equals(str3) || ("Xiaomi".equals(w.f5207c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i6 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = w.f5206b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i6 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = w.f5206b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i6 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(w.f5207c))) {
            String str6 = w.f5206b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i6 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(w.f5207c)) {
            String str7 = w.f5206b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i6 <= 19 && w.f5206b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        if (w.f5205a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        String h02 = sc.b.h0(mediaCodecInfo.getName());
        if (h02.startsWith("arc.")) {
            return false;
        }
        if (!h02.startsWith("omx.google.") && !h02.startsWith("omx.ffmpeg.") && ((!h02.startsWith("omx.sec.") || !h02.contains(".sw.")) && !h02.equals("omx.qcom.video.decoder.hevcswvdec") && !h02.startsWith("c2.android.") && !h02.startsWith("c2.google.") && (h02.startsWith("omx.") || h02.startsWith("c2.")))) {
            return false;
        }
        return true;
    }

    public static int h() {
        com.google.android.exoplayer2.mediacodec.d dVar;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i6;
        int i10;
        if (f6620c == -1) {
            int i11 = 0;
            List<com.google.android.exoplayer2.mediacodec.d> d10 = d("video/avc", false, false);
            if (d10.isEmpty()) {
                dVar = null;
            } else {
                dVar = d10.get(0);
            }
            if (dVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = dVar.f6641d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = codecProfileLevelArr[i11].level;
                    if (i13 != 1 && i13 != 2) {
                        switch (i13) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                continue;
                            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                i10 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i10 = 414720;
                                continue;
                            case 512:
                                i10 = 921600;
                                continue;
                            case Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID /* 1024 */:
                                i10 = 1310720;
                                continue;
                            case Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID /* 2048 */:
                            case 4096:
                                i10 = 2097152;
                                continue;
                            case 8192:
                                i10 = 2228224;
                                continue;
                            case 16384:
                                i10 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                continue;
                            default:
                                i10 = -1;
                                continue;
                        }
                    } else {
                        i10 = 25344;
                    }
                    i12 = Math.max(i10, i12);
                    i11++;
                }
                if (w.f5205a >= 21) {
                    i6 = 345600;
                } else {
                    i6 = 172800;
                }
                i11 = Math.max(i12, i6);
            }
            f6620c = i11;
        }
        return f6620c;
    }
}
