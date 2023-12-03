package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import c9.l;
import c9.w;
import com.google.android.exoplayer2.n;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: MediaCodecInfo.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f6638a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6639b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6640c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f6641d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6642e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6643g;

    public d(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        str.getClass();
        this.f6638a = str;
        this.f6639b = str2;
        this.f6640c = str3;
        this.f6641d = codecCapabilities;
        this.f6642e = z10;
        this.f = z11;
        this.f6643g = l.j(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i6, int i10, double d10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i11 = w.f5205a;
        Point point = new Point((((i6 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i10 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
        if (c9.w.f5205a < 21) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0068, code lost:
        if (r10.isFeatureSupported("secure-playback") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006c, code lost:
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006d, code lost:
        if (r14 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0070, code lost:
        r6 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d g(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16;
        if (codecCapabilities != null) {
            int i6 = w.f5205a;
            if (i6 >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                if (i6 <= 22) {
                    String str4 = w.f5208d;
                    if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                        z16 = true;
                        if (!z16) {
                            z14 = true;
                            if (codecCapabilities != null && (w.f5205a < 21 || !codecCapabilities.isFeatureSupported("tunneled-playback"))) {
                            }
                            boolean z17 = true;
                            return new d(str, str2, str3, codecCapabilities, z14, z17);
                        }
                    }
                }
                z16 = false;
                if (!z16) {
                }
            }
        }
        z14 = false;
        if (codecCapabilities != null) {
        }
        boolean z172 = true;
        return new d(str, str2, str3, codecCapabilities, z14, z172);
    }

    public final r7.f b(n nVar, n nVar2) {
        int i6;
        int i10;
        boolean z10 = false;
        if (!w.a(nVar.F, nVar2.F)) {
            i6 = 8;
        } else {
            i6 = 0;
        }
        if (this.f6643g) {
            if (nVar.N != nVar2.N) {
                i6 |= Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
            }
            if (!this.f6642e && (nVar.K != nVar2.K || nVar.L != nVar2.L)) {
                i6 |= 512;
            }
            if (!w.a(nVar.R, nVar2.R)) {
                i6 |= Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
            }
            if (w.f5208d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f6638a)) {
                z10 = true;
            }
            if (z10 && !nVar.c(nVar2)) {
                i6 |= 2;
            }
            if (i6 == 0) {
                String str = this.f6638a;
                if (nVar.c(nVar2)) {
                    i10 = 3;
                } else {
                    i10 = 2;
                }
                return new r7.f(str, nVar, nVar2, i10, 0);
            }
        } else {
            if (nVar.S != nVar2.S) {
                i6 |= 4096;
            }
            if (nVar.T != nVar2.T) {
                i6 |= 8192;
            }
            if (nVar.U != nVar2.U) {
                i6 |= 16384;
            }
            String str2 = this.f6639b;
            if (i6 == 0 && "audio/mp4a-latm".equals(str2)) {
                Pair<Integer, Integer> c10 = MediaCodecUtil.c(nVar);
                Pair<Integer, Integer> c11 = MediaCodecUtil.c(nVar2);
                if (c10 != null && c11 != null) {
                    int intValue = ((Integer) c10.first).intValue();
                    int intValue2 = ((Integer) c11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new r7.f(this.f6638a, nVar, nVar2, 3, 0);
                    }
                }
            }
            if (!nVar.c(nVar2)) {
                i6 |= 32;
            }
            if ("audio/opus".equals(str2)) {
                i6 |= 2;
            }
            if (i6 == 0) {
                return new r7.f(this.f6638a, nVar, nVar2, 1, 0);
            }
        }
        return new r7.f(this.f6638a, nVar, nVar2, 0, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(n nVar) {
        boolean z10;
        int i6;
        boolean z11;
        int i10;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i11;
        int i12;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        String str = nVar.C;
        boolean z12 = this.f6643g;
        String str2 = this.f6639b;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6641d;
        boolean z13 = false;
        boolean z14 = true;
        if (str != null && str2 != null) {
            String c10 = l.c(str);
            if (c10 != null) {
                boolean equals = str2.equals(c10);
                String str3 = nVar.C;
                if (!equals) {
                    StringBuilder sb2 = new StringBuilder(c10.length() + ri.e.c(str3, 13));
                    sb2.append("codec.mime ");
                    sb2.append(str3);
                    sb2.append(", ");
                    sb2.append(c10);
                    f(sb2.toString());
                } else {
                    Pair<Integer, Integer> c11 = MediaCodecUtil.c(nVar);
                    if (c11 != null) {
                        int intValue = ((Integer) c11.first).intValue();
                        int intValue2 = ((Integer) c11.second).intValue();
                        if (z12 || intValue == 42) {
                            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                            }
                            if (w.f5205a <= 23 && "video/x-vnd.on2.vp9".equals(str2) && codecProfileLevelArr.length == 0) {
                                if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                                    i11 = videoCapabilities.getBitrateRange().getUpper().intValue();
                                } else {
                                    i11 = 0;
                                }
                                if (i11 >= 180000000) {
                                    i12 = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
                                } else if (i11 >= 120000000) {
                                    i12 = 512;
                                } else if (i11 >= 60000000) {
                                    i12 = 256;
                                } else if (i11 >= 30000000) {
                                    i12 = 128;
                                } else if (i11 >= 18000000) {
                                    i12 = 64;
                                } else if (i11 >= 12000000) {
                                    i12 = 32;
                                } else if (i11 >= 7200000) {
                                    i12 = 16;
                                } else if (i11 >= 3600000) {
                                    i12 = 8;
                                } else if (i11 >= 1800000) {
                                    i12 = 4;
                                } else if (i11 >= 800000) {
                                    i12 = 2;
                                } else {
                                    i12 = 1;
                                }
                                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                                codecProfileLevel.profile = 1;
                                codecProfileLevel.level = i12;
                                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                            }
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                                if (codecProfileLevel2.profile != intValue || codecProfileLevel2.level < intValue2) {
                                }
                            }
                            StringBuilder sb3 = new StringBuilder(c10.length() + ri.e.c(str3, 22));
                            sb3.append("codec.profileLevel, ");
                            sb3.append(str3);
                            sb3.append(", ");
                            sb3.append(c10);
                            f(sb3.toString());
                        }
                    }
                }
                z14 = false;
            }
            if (z14) {
                return false;
            }
            if (z12) {
                int i13 = nVar.K;
                if (i13 > 0 && (i10 = nVar.L) > 0) {
                    if (w.f5205a >= 21) {
                        return e(i13, nVar.M, i10);
                    }
                    if (i13 * i10 <= MediaCodecUtil.h()) {
                        z13 = true;
                    }
                    if (!z13) {
                        StringBuilder sb4 = new StringBuilder(40);
                        sb4.append("legacyFrameSize, ");
                        sb4.append(i13);
                        sb4.append("x");
                        sb4.append(i10);
                        f(sb4.toString());
                    }
                    return z13;
                }
                return true;
            }
            int i14 = w.f5205a;
            if (i14 >= 21) {
                int i15 = nVar.T;
                if (i15 != -1) {
                    if (codecCapabilities == null) {
                        f("sampleRate.caps");
                    } else {
                        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities == null) {
                            f("sampleRate.aCaps");
                        } else if (!audioCapabilities.isSampleRateSupported(i15)) {
                            StringBuilder sb5 = new StringBuilder(31);
                            sb5.append("sampleRate.support, ");
                            sb5.append(i15);
                            f(sb5.toString());
                        } else {
                            z11 = true;
                            if (!z11) {
                                return false;
                            }
                        }
                    }
                    z11 = false;
                    if (!z11) {
                    }
                }
                int i16 = nVar.S;
                if (i16 != -1) {
                    if (codecCapabilities == null) {
                        f("channelCount.caps");
                    } else {
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            f("channelCount.aCaps");
                        } else {
                            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                            if (maxInputChannelCount <= 1 && ((i14 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                                if ("audio/ac3".equals(str2)) {
                                    i6 = 6;
                                } else if ("audio/eac3".equals(str2)) {
                                    i6 = 16;
                                } else {
                                    i6 = 30;
                                }
                                String str4 = this.f6638a;
                                StringBuilder sb6 = new StringBuilder(ri.e.c(str4, 59));
                                sb6.append("AssumedMaxChannelAdjustment: ");
                                sb6.append(str4);
                                sb6.append(", [");
                                sb6.append(maxInputChannelCount);
                                sb6.append(" to ");
                                sb6.append(i6);
                                sb6.append("]");
                                Log.w("MediaCodecInfo", sb6.toString());
                                maxInputChannelCount = i6;
                            }
                            if (maxInputChannelCount < i16) {
                                StringBuilder sb7 = new StringBuilder(33);
                                sb7.append("channelCount.support, ");
                                sb7.append(i16);
                                f(sb7.toString());
                            } else {
                                z10 = true;
                                if (z10) {
                                    return false;
                                }
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                    }
                }
            }
            return true;
        }
        z14 = true;
        if (z14) {
        }
    }

    public final boolean d(n nVar) {
        if (this.f6643g) {
            return this.f6642e;
        }
        Pair<Integer, Integer> c10 = MediaCodecUtil.c(nVar);
        if (c10 != null && ((Integer) c10.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean e(int i6, double d10, int i10) {
        boolean z10;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6641d;
        if (codecCapabilities == null) {
            f("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            f("sizeAndRate.vCaps");
            return false;
        }
        if (!a(videoCapabilities, i6, i10, d10)) {
            if (i6 < i10) {
                String str = this.f6638a;
                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(w.f5206b)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10 && a(videoCapabilities, i10, i6, d10)) {
                    StringBuilder sb2 = new StringBuilder(69);
                    sb2.append("sizeAndRate.rotated, ");
                    sb2.append(i6);
                    sb2.append("x");
                    sb2.append(i10);
                    sb2.append("x");
                    sb2.append(d10);
                    String sb3 = sb2.toString();
                    String str2 = w.f5209e;
                    int c10 = ri.e.c(str, ri.e.c(sb3, 25));
                    String str3 = this.f6639b;
                    StringBuilder n10 = defpackage.e.n(ri.e.c(str2, ri.e.c(str3, c10)), "AssumedSupport [", sb3, "] [", str);
                    n10.append(", ");
                    n10.append(str3);
                    n10.append("] [");
                    n10.append(str2);
                    n10.append("]");
                    Log.d("MediaCodecInfo", n10.toString());
                }
            }
            StringBuilder sb4 = new StringBuilder(69);
            sb4.append("sizeAndRate.support, ");
            sb4.append(i6);
            sb4.append("x");
            sb4.append(i10);
            sb4.append("x");
            sb4.append(d10);
            f(sb4.toString());
            return false;
        }
        return true;
    }

    public final void f(String str) {
        String str2 = w.f5209e;
        int c10 = ri.e.c(str, 20);
        String str3 = this.f6638a;
        int c11 = ri.e.c(str3, c10);
        String str4 = this.f6639b;
        StringBuilder n10 = defpackage.e.n(ri.e.c(str2, ri.e.c(str4, c11)), "NoSupport [", str, "] [", str3);
        n10.append(", ");
        n10.append(str4);
        n10.append("] [");
        n10.append(str2);
        n10.append("]");
        Log.d("MediaCodecInfo", n10.toString());
    }

    public final String toString() {
        return this.f6638a;
    }
}
