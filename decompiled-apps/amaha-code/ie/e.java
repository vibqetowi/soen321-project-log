package ie;

import java.math.RoundingMode;
/* compiled from: IntMath.java */
/* loaded from: classes.dex */
public final class e {

    /* compiled from: IntMath.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20000a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f20000a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20000a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20000a[RoundingMode.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20000a[RoundingMode.CEILING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20000a[RoundingMode.FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20000a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20000a[RoundingMode.HALF_DOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20000a[RoundingMode.HALF_UP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        if ((r6 & r7) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
        if (r1 > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r5 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (r5 > 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(int i6, int i10, RoundingMode roundingMode) {
        boolean z10;
        boolean z11;
        if (i10 != 0) {
            int i11 = i6 / i10;
            int i12 = i6 - (i10 * i11);
            if (i12 == 0) {
                return i11;
            }
            boolean z12 = true;
            int i13 = ((i6 ^ i10) >> 31) | 1;
            switch (a.f20000a[roundingMode.ordinal()]) {
                case 1:
                case 2:
                    z12 = false;
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                    int abs = Math.abs(i12);
                    int abs2 = abs - (Math.abs(i10) - abs);
                    if (abs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            if (roundingMode == RoundingMode.HALF_EVEN) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if ((i11 & 1) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            break;
                        }
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            if (z12) {
                return i11 + i13;
            }
            return i11;
        }
        throw new ArithmeticException("/ by zero");
    }
}
