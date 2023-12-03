package q7;

import com.theinnerhour.b2b.utils.Constants;
import u7.x;
/* compiled from: Ac4Util.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f29238a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID};

    /* compiled from: Ac4Util.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f29239a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29240b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29241c;

        public a(int i6, int i10, int i11) {
            this.f29239a = i6;
            this.f29240b = i10;
            this.f29241c = i11;
        }
    }

    public static void a(int i6, c9.q qVar) {
        qVar.x(7);
        byte[] bArr = qVar.f5186a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i6 >> 16) & 255);
        bArr[5] = (byte) ((i6 >> 8) & 255);
        bArr[6] = (byte) (i6 & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
        if (r9 != 8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a b(x xVar) {
        int i6;
        int i10;
        int i11;
        int i12 = xVar.i(16);
        int i13 = xVar.i(16);
        if (i13 == 65535) {
            i13 = xVar.i(24);
            i6 = 7;
        } else {
            i6 = 4;
        }
        int i14 = i13 + i6;
        if (i12 == 44097) {
            i14 += 2;
        }
        if (xVar.i(2) == 3) {
            do {
                xVar.i(2);
            } while (xVar.h());
            int i15 = xVar.i(10);
            if (xVar.h() && xVar.i(3) > 0) {
                xVar.r(2);
            }
            if (!xVar.h()) {
                i10 = 48000;
            } else {
                i10 = 44100;
            }
            int i16 = xVar.i(4);
            int[] iArr = f29238a;
            if (i10 != 44100 && i16 == 13) {
                i11 = iArr[i16];
            } else if (i10 != 48000 && i16 < 14) {
                int i17 = iArr[i16];
                int i18 = i15 % 5;
                if (i18 != 1) {
                    if (i18 != 2) {
                        if (i18 != 3) {
                            if (i18 == 4) {
                                if (i16 != 3) {
                                    if (i16 != 8) {
                                    }
                                }
                                i17++;
                            }
                            i11 = i17;
                        }
                    } else {
                        if (i16 != 8) {
                        }
                        i17++;
                        i11 = i17;
                    }
                }
                if (i16 != 3) {
                }
                i17++;
                i11 = i17;
            } else {
                i11 = 0;
            }
            return new a(i10, i14, i11);
        }
        int i152 = xVar.i(10);
        if (xVar.h()) {
            xVar.r(2);
        }
        if (!xVar.h()) {
        }
        int i162 = xVar.i(4);
        int[] iArr2 = f29238a;
        if (i10 != 44100) {
        }
        if (i10 != 48000) {
        }
        i11 = 0;
        return new a(i10, i14, i11);
    }
}
