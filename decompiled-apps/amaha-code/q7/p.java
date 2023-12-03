package q7;
/* compiled from: MpegAudioUtil.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f29293a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f29294b = {44100, 48000, 32000};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f29295c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f29296d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f29297e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f29298g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* compiled from: MpegAudioUtil.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f29299a;

        /* renamed from: b  reason: collision with root package name */
        public String f29300b;

        /* renamed from: c  reason: collision with root package name */
        public int f29301c;

        /* renamed from: d  reason: collision with root package name */
        public int f29302d;

        /* renamed from: e  reason: collision with root package name */
        public int f29303e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f29304g;

        public final boolean a(int i6) {
            boolean z10;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            if ((i6 & (-2097152)) == -2097152) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || (i10 = (i6 >>> 19) & 3) == 1 || (i11 = (i6 >>> 17) & 3) == 0 || (i12 = (i6 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i6 >>> 10) & 3) == 3) {
                return false;
            }
            this.f29299a = i10;
            this.f29300b = p.f29293a[3 - i11];
            int i16 = p.f29294b[i13];
            this.f29302d = i16;
            int i17 = 2;
            if (i10 == 2) {
                this.f29302d = i16 / 2;
            } else if (i10 == 0) {
                this.f29302d = i16 / 4;
            }
            int i18 = (i6 >>> 9) & 1;
            int i19 = 1152;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        i19 = 384;
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
            } else if (i10 != 3) {
                i19 = 576;
            }
            this.f29304g = i19;
            if (i11 == 3) {
                if (i10 == 3) {
                    i15 = p.f29295c[i12 - 1];
                } else {
                    i15 = p.f29296d[i12 - 1];
                }
                this.f = i15;
                this.f29301c = (((i15 * 12) / this.f29302d) + i18) * 4;
            } else {
                int i20 = 144;
                if (i10 == 3) {
                    if (i11 == 2) {
                        i14 = p.f29297e[i12 - 1];
                    } else {
                        i14 = p.f[i12 - 1];
                    }
                    this.f = i14;
                    this.f29301c = ((i14 * 144) / this.f29302d) + i18;
                } else {
                    int i21 = p.f29298g[i12 - 1];
                    this.f = i21;
                    if (i11 == 1) {
                        i20 = 72;
                    }
                    this.f29301c = ((i20 * i21) / this.f29302d) + i18;
                }
            }
            if (((i6 >> 6) & 3) == 3) {
                i17 = 1;
            }
            this.f29303e = i17;
            return true;
        }
    }

    public static int a(int i6) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i6 & (-2097152)) == -2097152) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (i10 = (i6 >>> 19) & 3) == 1 || (i11 = (i6 >>> 17) & 3) == 0 || (i12 = (i6 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i6 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f29294b[i13];
        if (i10 == 2) {
            i16 /= 2;
        } else if (i10 == 0) {
            i16 /= 4;
        }
        int i17 = (i6 >>> 9) & 1;
        if (i11 == 3) {
            if (i10 == 3) {
                i15 = f29295c[i12 - 1];
            } else {
                i15 = f29296d[i12 - 1];
            }
            return (((i15 * 12) / i16) + i17) * 4;
        }
        if (i10 == 3) {
            if (i11 == 2) {
                i14 = f29297e[i12 - 1];
            } else {
                i14 = f[i12 - 1];
            }
        } else {
            i14 = f29298g[i12 - 1];
        }
        int i18 = 144;
        if (i10 == 3) {
            return pl.a.b(i14, 144, i16, i17);
        }
        if (i11 == 1) {
            i18 = 72;
        }
        return pl.a.b(i18, i14, i16, i17);
    }

    public static int b(int i6) {
        boolean z10;
        int i10;
        int i11;
        if ((i6 & (-2097152)) == -2097152) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (i10 = (i6 >>> 19) & 3) == 1 || (i11 = (i6 >>> 17) & 3) == 0) {
            return -1;
        }
        int i12 = (i6 >>> 12) & 15;
        int i13 = (i6 >>> 10) & 3;
        if (i12 == 0 || i12 == 15 || i13 == 3) {
            return -1;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                return 1152;
            }
            if (i11 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        } else if (i10 == 3) {
            return 1152;
        } else {
            return 576;
        }
    }
}
