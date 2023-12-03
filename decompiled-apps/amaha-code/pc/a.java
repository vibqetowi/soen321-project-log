package pc;

import java.math.RoundingMode;
/* compiled from: IntMath.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: IntMath.java */
    /* renamed from: pc.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0469a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28100a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f28100a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28100a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28100a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28100a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28100a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28100a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28100a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28100a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
        if ((r6 & r7) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
        if (r1 > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (r5 > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
        if (r5 < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(int i6, int i10, RoundingMode roundingMode) {
        boolean z10;
        boolean z11;
        roundingMode.getClass();
        if (i10 != 0) {
            int i11 = i6 / i10;
            int i12 = i6 - (i10 * i11);
            if (i12 == 0) {
                return i11;
            }
            boolean z12 = true;
            int i13 = ((i6 ^ i10) >> 31) | 1;
            switch (C0469a.f28100a[roundingMode.ordinal()]) {
                case 1:
                    if (i12 != 0) {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                    z12 = false;
                    break;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int b(int i6, RoundingMode roundingMode) {
        boolean z10;
        if (i6 > 0) {
            boolean z11 = true;
            switch (C0469a.f28100a[roundingMode.ordinal()]) {
                case 1:
                    if (i6 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (((i6 - 1) & i6) != 0) {
                        z11 = false;
                    }
                    if (!(z10 & z11)) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i6 - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i6);
                    return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i6))) >>> 31);
                default:
                    throw new AssertionError();
            }
            return 31 - Integer.numberOfLeadingZeros(i6);
        }
        StringBuilder sb2 = new StringBuilder(27);
        sb2.append("x (");
        sb2.append(i6);
        sb2.append(") must be > 0");
        throw new IllegalArgumentException(sb2.toString());
    }
}
