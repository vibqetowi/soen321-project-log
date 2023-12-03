package com.bugsnag.android.repackaged.dslplatform.json;

import com.appsflyer.R;
import pl.a;
/* loaded from: classes.dex */
abstract class Grisu3 {
    static final int kFastDtoaMaximalLength = 17;
    static final int minimal_target_exponent = -60;

    /* loaded from: classes.dex */
    public static class CachedPowers {
        static final CachedPower[] CACHED_POWERS = {new CachedPower(-1865951482774665761L, -1087, -308), new CachedPower(-6093090917745768758L, -1060, -300), new CachedPower(-38366372719436721L, -1034, -292), new CachedPower(-4731433901725329908L, -1007, -284), new CachedPower(-8228041688891786180L, -980, -276), new CachedPower(-3219690930897053053L, -954, -268), new CachedPower(-7101705404292871755L, -927, -260), new CachedPower(-1541319077368263733L, -901, -252), new CachedPower(-5851220927660403859L, -874, -244), new CachedPower(-9062348037703676329L, -847, -236), new CachedPower(-4462904269766699465L, -821, -228), new CachedPower(-8027971522334779313L, -794, -220), new CachedPower(-2921563150702462265L, -768, -212), new CachedPower(-6879582898840692748L, -741, -204), new CachedPower(-1210330751515841307L, -715, -196), new CachedPower(-5604615407819967858L, -688, -188), new CachedPower(-8878612607581929669L, -661, -180), new CachedPower(-4189117143640191558L, -635, -172), new CachedPower(-7823984217374209642L, -608, -164), new CachedPower(-2617598379430861436L, -582, -156), new CachedPower(-6653111496142234890L, -555, -148), new CachedPower(-872862063775190746L, -529, -140), new CachedPower(-5353181642124984136L, -502, -132), new CachedPower(-8691279853972075893L, -475, -124), new CachedPower(-3909969587797413805L, -449, -116), new CachedPower(-7616003081050118571L, -422, -108), new CachedPower(-2307682335666372931L, -396, -100), new CachedPower(-6422206049907525489L, -369, -92), new CachedPower(-528786136287117932L, -343, -84), new CachedPower(-5096825099203863601L, -316, -76), new CachedPower(-8500279345513818773L, -289, -68), new CachedPower(-3625356651333078602L, -263, -60), new CachedPower(-7403949918844649556L, -236, -52), new CachedPower(-1991698500497491194L, -210, -44), new CachedPower(-6186779746782440749L, -183, -36), new CachedPower(-177973607073265138L, -157, -28), new CachedPower(-4835449396872013077L, -130, -20), new CachedPower(-8305539271883716404L, -103, -12), new CachedPower(-3335171328526686932L, -77, -4), new CachedPower(-7187745005283311616L, -50, 4), new CachedPower(-1669528073709551616L, -24, 12), new CachedPower(-5946744073709551616L, 3, 20), new CachedPower(-9133518327554766460L, 30, 28), new CachedPower(-4568956265895094861L, 56, 36), new CachedPower(-8106986416796705680L, 83, 44), new CachedPower(-3039304518611664792L, 109, 52), new CachedPower(-6967307053960650171L, 136, 60), new CachedPower(-1341049929119499481L, 162, 68), new CachedPower(-5702008784649933400L, 189, 76), new CachedPower(-8951176327949752869L, 216, 84), new CachedPower(-4297245513042813542L, 242, 92), new CachedPower(-7904546130479028392L, 269, 100), new CachedPower(-2737644984756826646L, 295, 108), new CachedPower(-6742553186979055798L, 322, 116), new CachedPower(-1006140569036166267L, 348, 124), new CachedPower(-5452481866653427593L, 375, 132), new CachedPower(-8765264286586255934L, 402, 140), new CachedPower(-4020214983419339459L, 428, 148), new CachedPower(-7698142301602209613L, 455, 156), new CachedPower(-2430079312244744221L, 481, 164), new CachedPower(-6513398903789220827L, 508, 172), new CachedPower(-664674077828931748L, 534, 180), new CachedPower(-5198069505264599346L, 561, 188), new CachedPower(-8575712306248138270L, 588, 196), new CachedPower(-3737760522056206171L, 614, 204), new CachedPower(-7487697328667536417L, 641, 212), new CachedPower(-2116491865831296966L, 667, 220), new CachedPower(-6279758049420528746L, 694, 228), new CachedPower(-316522074587315140L, 720, 236), new CachedPower(-4938676049251384304L, 747, 244), new CachedPower(-8382449121214030822L, 774, 252), new CachedPower(-3449775934753242068L, 800, 260), new CachedPower(-7273132090830278359L, 827, 268), new CachedPower(-1796764746270372707L, 853, 276), new CachedPower(-6041542782089432023L, 880, 284), new CachedPower(-9204148869281624187L, 907, 292), new CachedPower(-4674203974643163859L, 933, 300), new CachedPower(-8185402070463610993L, 960, 308), new CachedPower(-3156152948152813503L, 986, 316), new CachedPower(-7054365918152680535L, 1013, 324), new CachedPower(-1470777745987373095L, 1039, 332), new CachedPower(-5798663540173640085L, 1066, 340)};
        static final int CACHED_POWERS_SPACING = 8;
        static final int GRISU_CACHE_OFFSET = 308;
        static final double kD_1_LOG2_10 = 0.30102999566398114d;

        /* loaded from: classes.dex */
        public static class CachedPower {
            final short binaryExponent;
            final short decimalExponent;
            final long significand;

            public CachedPower(long j10, short s10, short s11) {
                this.significand = j10;
                this.binaryExponent = s10;
                this.decimalExponent = s11;
            }
        }

        private CachedPowers() {
        }

        public static int getCachedPower(int i6, int i10, DiyFp diyFp) {
            CachedPower cachedPower = CACHED_POWERS[(((((int) Math.ceil((((i10 - i6) + 64) - 1) * kD_1_LOG2_10)) + GRISU_CACHE_OFFSET) - 1) / 8) + 1];
            diyFp.f = cachedPower.significand;
            diyFp.f5921e = cachedPower.binaryExponent;
            return cachedPower.decimalExponent;
        }
    }

    /* loaded from: classes.dex */
    public static final class DiyFp {
        private static final long k10MSBits = -18014398509481984L;
        private static final long kM32 = 4294967295L;
        static final int kSignificandSize = 64;
        static final long kUint64MSB = Long.MIN_VALUE;
        long f = 0;

        /* renamed from: e  reason: collision with root package name */
        int f5921e = 0;

        public void multiply(DiyFp diyFp) {
            long j10 = this.f;
            long j11 = j10 >>> 32;
            long j12 = j10 & kM32;
            long j13 = diyFp.f;
            long j14 = j13 >>> 32;
            long j15 = j13 & kM32;
            long j16 = j11 * j14;
            long j17 = j14 * j12;
            long j18 = j11 * j15;
            long j19 = j16 + (j18 >>> 32) + (j17 >>> 32) + ((((((j12 * j15) >>> 32) + (j18 & kM32)) + (kM32 & j17)) + 2147483648L) >>> 32);
            this.f5921e = diyFp.f5921e + 64 + this.f5921e;
            this.f = j19;
        }

        public void normalize() {
            long j10 = this.f;
            int i6 = this.f5921e;
            while ((k10MSBits & j10) == 0) {
                j10 <<= 10;
                i6 -= 10;
            }
            while ((kUint64MSB & j10) == 0) {
                j10 <<= 1;
                i6--;
            }
            this.f = j10;
            this.f5921e = i6;
        }

        public void reset() {
            this.f5921e = 0;
            this.f = 0L;
        }

        public void subtract(DiyFp diyFp) {
            this.f -= diyFp.f;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[DiyFp f:");
            sb2.append(this.f);
            sb2.append(", e:");
            return a.g(sb2, this.f5921e, "]");
        }
    }

    /* loaded from: classes.dex */
    public static class DoubleHelper {
        private static final int kDenormalExponent = -1074;
        private static final int kExponentBias = 1075;
        static final long kExponentMask = 9218868437227405312L;
        static final long kHiddenBit = 4503599627370496L;
        static final long kSignificandMask = 4503599627370495L;
        private static final int kSignificandSize = 52;

        private DoubleHelper() {
        }

        public static void asDiyFp(long j10, DiyFp diyFp) {
            diyFp.f = significand(j10);
            diyFp.f5921e = exponent(j10);
        }

        public static void asNormalizedDiyFp(long j10, DiyFp diyFp) {
            long significand = significand(j10);
            int exponent = exponent(j10);
            while ((kHiddenBit & significand) == 0) {
                significand <<= 1;
                exponent--;
            }
            diyFp.f = significand << 11;
            diyFp.f5921e = exponent - 11;
        }

        public static int exponent(long j10) {
            if (isDenormal(j10)) {
                return kDenormalExponent;
            }
            return ((int) (((j10 & kExponentMask) >>> 52) & 4294967295L)) - 1075;
        }

        private static boolean isDenormal(long j10) {
            if ((j10 & kExponentMask) == 0) {
                return true;
            }
            return false;
        }

        public static void normalizedBoundaries(DiyFp diyFp, long j10, DiyFp diyFp2, DiyFp diyFp3) {
            boolean z10;
            int i6;
            asDiyFp(j10, diyFp);
            long j11 = diyFp.f;
            if (j11 == kHiddenBit) {
                z10 = true;
            } else {
                z10 = false;
            }
            diyFp3.f = (j11 << 1) + 1;
            diyFp3.f5921e = diyFp.f5921e - 1;
            diyFp3.normalize();
            if (z10 && (i6 = diyFp.f5921e) != kDenormalExponent) {
                diyFp2.f = (diyFp.f << 2) - 1;
                diyFp2.f5921e = i6 - 2;
            } else {
                diyFp2.f = (diyFp.f << 1) - 1;
                diyFp2.f5921e = diyFp.f5921e - 1;
            }
            long j12 = diyFp2.f;
            int i10 = diyFp2.f5921e;
            int i11 = diyFp3.f5921e;
            diyFp2.f = j12 << (i10 - i11);
            diyFp2.f5921e = i11;
        }

        public static long significand(long j10) {
            long j11 = kSignificandMask & j10;
            if (!isDenormal(j10)) {
                return j11 + kHiddenBit;
            }
            return j11;
        }
    }

    /* loaded from: classes.dex */
    public static class FastDtoa {
        static final int kTen4 = 10000;
        static final int kTen5 = 100000;
        static final int kTen6 = 1000000;
        static final int kTen7 = 10000000;
        static final int kTen8 = 100000000;
        static final int kTen9 = 1000000000;

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
            if (1 <= r4) goto L4;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static long biggestPowerTen(int i6, int i10) {
            int i11 = 1;
            int i12 = 0;
            switch (i10) {
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case 32:
                    if (kTen9 <= i6) {
                        i11 = kTen9;
                        i12 = 9;
                        break;
                    }
                case 27:
                case 28:
                case 29:
                    if (kTen8 <= i6) {
                        i11 = kTen8;
                        i12 = 8;
                        break;
                    }
                case 24:
                case 25:
                case 26:
                    if (kTen7 <= i6) {
                        i11 = kTen7;
                        i12 = 7;
                        break;
                    }
                case 20:
                case 21:
                case 22:
                case 23:
                    if (kTen6 <= i6) {
                        i11 = kTen6;
                        i12 = 6;
                        break;
                    }
                case 17:
                case 18:
                case 19:
                    if (kTen5 <= i6) {
                        i11 = kTen5;
                        i12 = 5;
                        break;
                    }
                case 14:
                case 15:
                case 16:
                    if (10000 <= i6) {
                        i11 = 10000;
                        i12 = 4;
                        break;
                    }
                case 10:
                case 11:
                case 12:
                case 13:
                    if (1000 <= i6) {
                        i11 = 1000;
                        i12 = 3;
                        break;
                    }
                case 7:
                case 8:
                case 9:
                    if (100 <= i6) {
                        i11 = 100;
                        i12 = 2;
                        break;
                    }
                case 4:
                case 5:
                case 6:
                    if (10 <= i6) {
                        i11 = 10;
                        i12 = 1;
                        break;
                    }
                case 1:
                case 2:
                case 3:
                    break;
                case 0:
                    i11 = 0;
                    i12 = -1;
                    break;
                default:
                    i11 = 0;
                    break;
            }
            return (i11 << 32) | (i12 & 4294967295L);
        }

        public static boolean digitGen(FastDtoaBuilder fastDtoaBuilder, int i6) {
            DiyFp diyFp = fastDtoaBuilder.scaled_boundary_minus;
            DiyFp diyFp2 = fastDtoaBuilder.scaled_w;
            DiyFp diyFp3 = fastDtoaBuilder.scaled_boundary_plus;
            DiyFp diyFp4 = fastDtoaBuilder.too_low;
            diyFp4.f = diyFp.f - 1;
            diyFp4.f5921e = diyFp.f5921e;
            DiyFp diyFp5 = fastDtoaBuilder.too_high;
            diyFp5.f = diyFp3.f + 1;
            diyFp5.f5921e = diyFp3.f5921e;
            DiyFp diyFp6 = fastDtoaBuilder.unsafe_interval;
            diyFp6.f = diyFp5.f;
            diyFp6.f5921e = diyFp5.f5921e;
            diyFp6.subtract(diyFp4);
            DiyFp diyFp7 = fastDtoaBuilder.one;
            int i10 = diyFp2.f5921e;
            long j10 = 1 << (-i10);
            diyFp7.f = j10;
            diyFp7.f5921e = i10;
            long j11 = diyFp5.f;
            int i11 = (int) ((j11 >>> (-i10)) & 4294967295L);
            long j12 = (j10 - 1) & j11;
            long biggestPowerTen = biggestPowerTen(i11, 64 - (-i10));
            int i12 = (int) ((biggestPowerTen >>> 32) & 4294967295L);
            int i13 = ((int) (biggestPowerTen & 4294967295L)) + 1;
            while (i13 > 0) {
                fastDtoaBuilder.append((byte) ((i11 / i12) + 48));
                i11 %= i12;
                i13--;
                long j13 = (i11 << (-diyFp7.f5921e)) + j12;
                if (j13 < diyFp6.f) {
                    fastDtoaBuilder.point = (fastDtoaBuilder.end - i6) + i13;
                    DiyFp diyFp8 = fastDtoaBuilder.minus_round;
                    diyFp8.f = diyFp5.f;
                    diyFp8.f5921e = diyFp5.f5921e;
                    diyFp8.subtract(diyFp2);
                    return roundWeed(fastDtoaBuilder, diyFp8.f, diyFp6.f, j13, i12 << (-diyFp7.f5921e), 1L);
                }
                i12 /= 10;
            }
            long j14 = 1;
            while (true) {
                long j15 = j12 * 5;
                long j16 = j14 * 5;
                diyFp6.f *= 5;
                diyFp6.f5921e++;
                diyFp7.f >>>= 1;
                int i14 = diyFp7.f5921e + 1;
                diyFp7.f5921e = i14;
                fastDtoaBuilder.append((byte) (((int) ((j15 >>> (-i14)) & 4294967295L)) + 48));
                j12 = j15 & (diyFp7.f - 1);
                i13--;
                if (j12 < diyFp6.f) {
                    fastDtoaBuilder.point = (fastDtoaBuilder.end - i6) + i13;
                    DiyFp diyFp9 = fastDtoaBuilder.minus_round;
                    diyFp9.f = diyFp5.f;
                    diyFp9.f5921e = diyFp5.f5921e;
                    diyFp9.subtract(diyFp2);
                    return roundWeed(fastDtoaBuilder, diyFp9.f * j16, diyFp6.f, j12, diyFp7.f, j16);
                }
                j14 = j16;
            }
        }

        public static boolean roundWeed(FastDtoaBuilder fastDtoaBuilder, long j10, long j11, long j12, long j13, long j14) {
            long j15 = j10 - j14;
            long j16 = j10 + j14;
            long j17 = j12;
            while (j17 < j15 && j11 - j17 >= j13) {
                long j18 = j17 + j13;
                if (j18 >= j15 && j15 - j17 < j18 - j15) {
                    break;
                }
                fastDtoaBuilder.decreaseLast();
                j17 = j18;
            }
            if (j17 < j16 && j11 - j17 >= j13) {
                long j19 = j17 + j13;
                if (j19 < j16 || j16 - j17 > j19 - j16) {
                    return false;
                }
            }
            if (2 * j14 > j17 || j17 > j11 - (4 * j14)) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class FastDtoaBuilder {
        static final byte[] digits = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
        private int point;

        /* renamed from: v  reason: collision with root package name */
        private final DiyFp f5922v = new DiyFp();

        /* renamed from: w  reason: collision with root package name */
        private final DiyFp f5923w = new DiyFp();
        private final DiyFp boundary_minus = new DiyFp();
        private final DiyFp boundary_plus = new DiyFp();
        private final DiyFp ten_mk = new DiyFp();
        private final DiyFp scaled_w = new DiyFp();
        private final DiyFp scaled_boundary_minus = new DiyFp();
        private final DiyFp scaled_boundary_plus = new DiyFp();
        private final DiyFp too_low = new DiyFp();
        private final DiyFp too_high = new DiyFp();
        private final DiyFp unsafe_interval = new DiyFp();
        private final DiyFp one = new DiyFp();
        private final DiyFp minus_round = new DiyFp();
        private final byte[] chars = new byte[27];
        private int end = 0;

        private void toExponentialFormat(int i6, int i10) {
            byte b10;
            int i11 = this.end;
            if (i11 - i6 > 1) {
                int i12 = i6 + 1;
                byte[] bArr = this.chars;
                System.arraycopy(bArr, i12, bArr, i12 + 1, i11 - i12);
                this.chars[i12] = 46;
                this.end++;
            }
            byte[] bArr2 = this.chars;
            int i13 = this.end;
            int i14 = i13 + 1;
            this.end = i14;
            bArr2[i13] = 69;
            int i15 = i10 - 1;
            if (i15 < 0) {
                i15 = -i15;
                b10 = 45;
            } else {
                b10 = 43;
            }
            int i16 = i14 + 1;
            this.end = i16;
            bArr2[i14] = b10;
            if (i15 > 99) {
                i16 += 2;
            } else if (i15 > 9) {
                i16++;
            }
            this.end = i16 + 1;
            while (true) {
                int i17 = i16 - 1;
                this.chars[i16] = digits[i15 % 10];
                i15 /= 10;
                if (i15 == 0) {
                    return;
                }
                i16 = i17;
            }
        }

        private void toFixedFormat(int i6, int i10) {
            int i11 = this.point;
            int i12 = this.end;
            if (i11 < i12) {
                if (i10 <= 0) {
                    int i13 = 2 - i10;
                    for (int i14 = i12 + i6; i14 >= i6; i14--) {
                        byte[] bArr = this.chars;
                        bArr[i14 + i13] = bArr[i14];
                    }
                    byte[] bArr2 = this.chars;
                    bArr2[i6] = 48;
                    bArr2[i6 + 1] = 46;
                    if (i10 < 0) {
                        int i15 = i6 + 2;
                        int i16 = i15 - i10;
                        while (i15 < i16) {
                            this.chars[i15] = 48;
                            i15++;
                        }
                    }
                    this.end += i13;
                    return;
                }
                while (true) {
                    int i17 = this.point;
                    if (i12 >= i17) {
                        byte[] bArr3 = this.chars;
                        bArr3[i12 + 1] = bArr3[i12];
                        i12--;
                    } else {
                        this.chars[i17] = 46;
                        this.end++;
                        return;
                    }
                }
            } else if (i11 <= i12) {
                byte[] bArr4 = this.chars;
                bArr4[i12] = 46;
                bArr4[i12 + 1] = 48;
                this.end = i12 + 2;
            } else {
                while (true) {
                    int i18 = this.point;
                    if (i12 < i18) {
                        this.chars[i12] = 48;
                        i12++;
                    } else {
                        int i19 = this.end;
                        int i20 = (i18 - i19) + i19;
                        byte[] bArr5 = this.chars;
                        bArr5[i20] = 46;
                        bArr5[i20 + 1] = 48;
                        this.end = i20 + 2;
                        return;
                    }
                }
            }
        }

        public void append(byte b10) {
            byte[] bArr = this.chars;
            int i6 = this.end;
            this.end = i6 + 1;
            bArr[i6] = b10;
        }

        public int copyTo(byte[] bArr, int i6) {
            int i10 = 0;
            while (true) {
                int i11 = this.end;
                if (i10 < i11) {
                    bArr[i10 + i6] = this.chars[i10];
                    i10++;
                } else {
                    return i11;
                }
            }
        }

        public void decreaseLast() {
            byte[] bArr;
            int i6;
            this.chars[this.end - 1] = (byte) (bArr[i6] - 1);
        }

        public int initialize(long j10) {
            DoubleHelper.asNormalizedDiyFp(j10, this.f5923w);
            this.boundary_minus.reset();
            this.boundary_plus.reset();
            DoubleHelper.normalizedBoundaries(this.f5922v, j10, this.boundary_minus, this.boundary_plus);
            this.ten_mk.reset();
            int cachedPower = CachedPowers.getCachedPower(this.f5923w.f5921e + 64, Grisu3.minimal_target_exponent, this.ten_mk);
            DiyFp diyFp = this.scaled_w;
            DiyFp diyFp2 = this.f5923w;
            diyFp.f = diyFp2.f;
            diyFp.f5921e = diyFp2.f5921e;
            diyFp.multiply(this.ten_mk);
            DiyFp diyFp3 = this.scaled_boundary_minus;
            DiyFp diyFp4 = this.boundary_minus;
            diyFp3.f = diyFp4.f;
            diyFp3.f5921e = diyFp4.f5921e;
            diyFp3.multiply(this.ten_mk);
            DiyFp diyFp5 = this.scaled_boundary_plus;
            DiyFp diyFp6 = this.boundary_plus;
            diyFp5.f = diyFp6.f;
            diyFp5.f5921e = diyFp6.f5921e;
            diyFp5.multiply(this.ten_mk);
            return cachedPower;
        }

        public void reset() {
            this.end = 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[chars:");
            sb2.append(new String(this.chars, 0, this.end));
            sb2.append(", point:");
            return a.g(sb2, this.point, "]");
        }

        public void write(int i6) {
            int i10 = this.point - i6;
            if (i10 >= -5 && i10 <= 21) {
                toFixedFormat(i6, i10);
            } else {
                toExponentialFormat(i6, i10);
            }
        }
    }

    public static boolean tryConvert(double d10, FastDtoaBuilder fastDtoaBuilder) {
        long doubleToLongBits;
        int i6;
        fastDtoaBuilder.reset();
        if (d10 < 0.0d) {
            fastDtoaBuilder.append((byte) 45);
            doubleToLongBits = Double.doubleToLongBits(-d10);
            i6 = 1;
        } else {
            doubleToLongBits = Double.doubleToLongBits(d10);
            i6 = 0;
        }
        if (!FastDtoa.digitGen(fastDtoaBuilder, fastDtoaBuilder.initialize(doubleToLongBits))) {
            return false;
        }
        fastDtoaBuilder.write(i6);
        return true;
    }
}
