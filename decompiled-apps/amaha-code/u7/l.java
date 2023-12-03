package u7;
/* compiled from: FlacFrameReader.java */
/* loaded from: classes.dex */
public final class l {

    /* compiled from: FlacFrameReader.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f33881a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x009b, code lost:
        if (r7 == r18.f) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
        if ((r17.q() * 1000) == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b7, code lost:
        if (r4 == r3) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(c9.q qVar, o oVar, int i6, a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        long r = qVar.r();
        long j10 = r >>> 16;
        if (j10 != i6) {
            return false;
        }
        if ((j10 & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = (int) ((r >> 12) & 15);
        int i11 = (int) ((r >> 8) & 15);
        int i12 = (int) (15 & (r >> 4));
        int i13 = (int) ((r >> 1) & 7);
        if ((r & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i12 > 7 ? !(i12 > 10 || oVar.f33889g != 2) : i12 == oVar.f33889g - 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        if (i13 == 0 || i13 == oVar.f33891i) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 || z11) {
            return false;
        }
        try {
            long w10 = qVar.w();
            if (!z10) {
                w10 *= oVar.f33885b;
            }
            aVar.f33881a = w10;
            z14 = true;
        } catch (NumberFormatException unused) {
            z14 = false;
        }
        if (!z14) {
            return false;
        }
        int b10 = b(i10, qVar);
        if (b10 != -1 && b10 <= oVar.f33885b) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (!z15) {
            return false;
        }
        int i14 = oVar.f33888e;
        if (i11 != 0) {
            if (i11 > 11) {
                if (i11 != 12) {
                    if (i11 <= 14) {
                        int v10 = qVar.v();
                        if (i11 == 14) {
                            v10 *= 10;
                        }
                    }
                    z16 = false;
                }
            }
            if (z16) {
                return false;
            }
            int q10 = qVar.q();
            int i15 = qVar.f5187b;
            byte[] bArr = qVar.f5186a;
            int i16 = i15 - 1;
            int i17 = c9.w.f5205a;
            int i18 = 0;
            for (int i19 = qVar.f5187b; i19 < i16; i19++) {
                i18 = c9.w.f5215l[i18 ^ (bArr[i19] & 255)];
            }
            if (q10 == i18) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (!z17) {
                return false;
            }
            return true;
        }
        z16 = true;
        if (z16) {
        }
    }

    public static int b(int i6, c9.q qVar) {
        switch (i6) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i6 - 2);
            case 6:
                return qVar.q() + 1;
            case 7:
                return qVar.v() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i6 - 8);
            default:
                return -1;
        }
    }
}
