package org.apache.commons.lang3.math;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.math.BigInteger;
import org.apache.commons.lang3.Validate;
/* loaded from: classes5.dex */
public final class Fraction extends Number implements Comparable<Fraction> {
    private static final long serialVersionUID = 65382027393090L;
    private final int denominator;
    private final int numerator;
    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction ONE = new Fraction(1, 1);
    public static final Fraction ONE_HALF = new Fraction(1, 2);
    public static final Fraction ONE_THIRD = new Fraction(1, 3);
    public static final Fraction TWO_THIRDS = new Fraction(2, 3);
    public static final Fraction ONE_QUARTER = new Fraction(1, 4);
    public static final Fraction TWO_QUARTERS = new Fraction(2, 4);
    public static final Fraction THREE_QUARTERS = new Fraction(3, 4);
    public static final Fraction ONE_FIFTH = new Fraction(1, 5);
    public static final Fraction TWO_FIFTHS = new Fraction(2, 5);
    public static final Fraction THREE_FIFTHS = new Fraction(3, 5);
    public static final Fraction FOUR_FIFTHS = new Fraction(4, 5);
    private transient int hashCode = 0;
    private transient String toString = null;
    private transient String toProperString = null;

    private Fraction(int i, int i2) {
        this.numerator = i;
        this.denominator = i2;
    }

    public static Fraction getFraction(int i, int i2) {
        if (i2 == 0) {
            throw new ArithmeticException("The denominator must not be zero");
        }
        if (i2 < 0) {
            if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE) {
                throw new ArithmeticException("overflow: can't negate");
            }
            i = -i;
            i2 = -i2;
        }
        return new Fraction(i, i2);
    }

    public static Fraction getFraction(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 >= 0) {
                if (i2 >= 0) {
                    long j = i < 0 ? (i * i3) - i2 : (i * i3) + i2;
                    if (j < -2147483648L || j > 2147483647L) {
                        throw new ArithmeticException("Numerator too large to represent as an Integer.");
                    }
                    return new Fraction((int) j, i3);
                }
                throw new ArithmeticException("The numerator must not be negative");
            }
            throw new ArithmeticException("The denominator must not be negative");
        }
        throw new ArithmeticException("The denominator must not be zero");
    }

    public static Fraction getReducedFraction(int i, int i2) {
        if (i2 != 0) {
            if (i == 0) {
                return ZERO;
            }
            if (i2 == Integer.MIN_VALUE && (i & 1) == 0) {
                i /= 2;
                i2 /= 2;
            }
            if (i2 < 0) {
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE) {
                    throw new ArithmeticException("overflow: can't negate");
                }
                i = -i;
                i2 = -i2;
            }
            int greatestCommonDivisor = greatestCommonDivisor(i, i2);
            return new Fraction(i / greatestCommonDivisor, i2 / greatestCommonDivisor);
        }
        throw new ArithmeticException("The denominator must not be zero");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
        return getReducedFraction((r8 + (r4 * r10)) * r0, r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Fraction getFraction(double d) {
        int i = d < 0.0d ? -1 : 1;
        double abs = Math.abs(d);
        if (abs > 2.147483647E9d || Double.isNaN(abs)) {
            throw new ArithmeticException("The value must not be greater than Integer.MAX_VALUE or NaN");
        }
        int i2 = (int) abs;
        double d2 = abs - i2;
        int i3 = (int) d2;
        double d3 = d2 - i3;
        double d4 = d2;
        double d5 = Double.MAX_VALUE;
        int i4 = 1;
        int i5 = 1;
        double d6 = 1.0d;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1;
        while (true) {
            int i9 = (int) (d6 / d3);
            double d7 = d6 - (i9 * d3);
            int i10 = (i3 * i8) + i6;
            int i11 = (i3 * i7) + i4;
            double d8 = d3;
            double d9 = d4;
            double abs2 = Math.abs(d9 - (i10 / i11));
            int i12 = i5 + 1;
            if (d5 <= abs2 || i11 > 10000 || i11 <= 0 || i12 >= 25) {
                break;
            }
            d5 = abs2;
            d4 = d9;
            i4 = i7;
            i5 = i12;
            d3 = d7;
            i7 = i11;
            i3 = i9;
            i6 = i8;
            i8 = i10;
            d6 = d8;
        }
        throw new ArithmeticException("Unable to convert double to fraction");
    }

    public static Fraction getFraction(String str) {
        Validate.notNull(str, "The string must not be null", new Object[0]);
        if (str.indexOf(46) >= 0) {
            return getFraction(Double.parseDouble(str));
        }
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(str.substring(0, indexOf));
            String substring = str.substring(indexOf + 1);
            int indexOf2 = substring.indexOf(47);
            if (indexOf2 < 0) {
                throw new NumberFormatException("The fraction could not be parsed as the format X Y/Z");
            }
            return getFraction(parseInt, Integer.parseInt(substring.substring(0, indexOf2)), Integer.parseInt(substring.substring(indexOf2 + 1)));
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 < 0) {
            return getFraction(Integer.parseInt(str), 1);
        }
        return getFraction(Integer.parseInt(str.substring(0, indexOf3)), Integer.parseInt(str.substring(indexOf3 + 1)));
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public int getProperNumerator() {
        return Math.abs(this.numerator % this.denominator);
    }

    public int getProperWhole() {
        return this.numerator / this.denominator;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.numerator / this.denominator;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.numerator / this.denominator;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.numerator / this.denominator;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.numerator / this.denominator;
    }

    public Fraction reduce() {
        int i = this.numerator;
        if (i == 0) {
            Fraction fraction = ZERO;
            return equals(fraction) ? this : fraction;
        }
        int greatestCommonDivisor = greatestCommonDivisor(Math.abs(i), this.denominator);
        return greatestCommonDivisor == 1 ? this : getFraction(this.numerator / greatestCommonDivisor, this.denominator / greatestCommonDivisor);
    }

    public Fraction invert() {
        int i = this.numerator;
        if (i != 0) {
            if (i != Integer.MIN_VALUE) {
                if (i < 0) {
                    return new Fraction(-this.denominator, -i);
                }
                return new Fraction(this.denominator, i);
            }
            throw new ArithmeticException("overflow: can't negate numerator");
        }
        throw new ArithmeticException("Unable to invert zero.");
    }

    public Fraction negate() {
        int i = this.numerator;
        if (i == Integer.MIN_VALUE) {
            throw new ArithmeticException("overflow: too large to negate");
        }
        return new Fraction(-i, this.denominator);
    }

    public Fraction abs() {
        return this.numerator >= 0 ? this : negate();
    }

    public Fraction pow(int i) {
        if (i == 1) {
            return this;
        }
        if (i == 0) {
            return ONE;
        }
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return invert().pow(2).pow(-(i / 2));
            }
            return invert().pow(-i);
        }
        Fraction multiplyBy = multiplyBy(this);
        if (i % 2 == 0) {
            return multiplyBy.pow(i / 2);
        }
        return multiplyBy.pow(i / 2).multiplyBy(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
        if (r3 != 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
        r0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:
        r0 = -(r6 / 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
        if ((r0 & 1) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
        r0 = r0 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003f, code lost:
        if (r0 <= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
        r6 = -r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0043, code lost:
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0044, code lost:
        r0 = (r7 - r6) / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        if (r0 != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004e, code lost:
        return (-r6) * (1 << r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int greatestCommonDivisor(int i, int i2) {
        if (i == 0 || i2 == 0) {
            if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE) {
                throw new ArithmeticException("overflow: gcd is 2^31");
            }
            return Math.abs(i) + Math.abs(i2);
        } else if (Math.abs(i) == 1 || Math.abs(i2) == 1) {
            return 1;
        } else {
            if (i > 0) {
                i = -i;
            }
            if (i2 > 0) {
                i2 = -i2;
            }
            int i3 = 0;
            while (true) {
                int i4 = i & 1;
                if (i4 != 0 || (i2 & 1) != 0 || i3 >= 31) {
                    break;
                }
                i /= 2;
                i2 /= 2;
                i3++;
            }
            throw new ArithmeticException("overflow: gcd is 2^31");
        }
    }

    private static int mulAndCheck(int i, int i2) {
        long j = i * i2;
        if (j < -2147483648L || j > 2147483647L) {
            throw new ArithmeticException("overflow: mul");
        }
        return (int) j;
    }

    private static int mulPosAndCheck(int i, int i2) {
        long j = i * i2;
        if (j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException("overflow: mulPos");
    }

    private static int addAndCheck(int i, int i2) {
        long j = i + i2;
        if (j < -2147483648L || j > 2147483647L) {
            throw new ArithmeticException("overflow: add");
        }
        return (int) j;
    }

    private static int subAndCheck(int i, int i2) {
        long j = i - i2;
        if (j < -2147483648L || j > 2147483647L) {
            throw new ArithmeticException("overflow: add");
        }
        return (int) j;
    }

    public Fraction add(Fraction fraction) {
        return addSub(fraction, true);
    }

    public Fraction subtract(Fraction fraction) {
        return addSub(fraction, false);
    }

    private Fraction addSub(Fraction fraction, boolean z) {
        Validate.notNull(fraction, "The fraction must not be null", new Object[0]);
        if (this.numerator == 0) {
            return z ? fraction : fraction.negate();
        } else if (fraction.numerator == 0) {
            return this;
        } else {
            int greatestCommonDivisor = greatestCommonDivisor(this.denominator, fraction.denominator);
            if (greatestCommonDivisor == 1) {
                int mulAndCheck = mulAndCheck(this.numerator, fraction.denominator);
                int mulAndCheck2 = mulAndCheck(fraction.numerator, this.denominator);
                return new Fraction(z ? addAndCheck(mulAndCheck, mulAndCheck2) : subAndCheck(mulAndCheck, mulAndCheck2), mulPosAndCheck(this.denominator, fraction.denominator));
            }
            BigInteger multiply = BigInteger.valueOf(this.numerator).multiply(BigInteger.valueOf(fraction.denominator / greatestCommonDivisor));
            BigInteger multiply2 = BigInteger.valueOf(fraction.numerator).multiply(BigInteger.valueOf(this.denominator / greatestCommonDivisor));
            BigInteger add = z ? multiply.add(multiply2) : multiply.subtract(multiply2);
            int intValue = add.mod(BigInteger.valueOf(greatestCommonDivisor)).intValue();
            int greatestCommonDivisor2 = intValue == 0 ? greatestCommonDivisor : greatestCommonDivisor(intValue, greatestCommonDivisor);
            BigInteger divide = add.divide(BigInteger.valueOf(greatestCommonDivisor2));
            if (divide.bitLength() > 31) {
                throw new ArithmeticException("overflow: numerator too large after multiply");
            }
            return new Fraction(divide.intValue(), mulPosAndCheck(this.denominator / greatestCommonDivisor, fraction.denominator / greatestCommonDivisor2));
        }
    }

    public Fraction multiplyBy(Fraction fraction) {
        Validate.notNull(fraction, "The fraction must not be null", new Object[0]);
        int i = this.numerator;
        if (i == 0 || fraction.numerator == 0) {
            return ZERO;
        }
        int greatestCommonDivisor = greatestCommonDivisor(i, fraction.denominator);
        int greatestCommonDivisor2 = greatestCommonDivisor(fraction.numerator, this.denominator);
        return getReducedFraction(mulAndCheck(this.numerator / greatestCommonDivisor, fraction.numerator / greatestCommonDivisor2), mulPosAndCheck(this.denominator / greatestCommonDivisor2, fraction.denominator / greatestCommonDivisor));
    }

    public Fraction divideBy(Fraction fraction) {
        Validate.notNull(fraction, "The fraction must not be null", new Object[0]);
        if (fraction.numerator == 0) {
            throw new ArithmeticException("The fraction to divide by must not be zero");
        }
        return multiplyBy(fraction.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Fraction) {
            Fraction fraction = (Fraction) obj;
            return getNumerator() == fraction.getNumerator() && getDenominator() == fraction.getDenominator();
        }
        return false;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((getNumerator() + 629) * 37) + getDenominator();
        }
        return this.hashCode;
    }

    @Override // java.lang.Comparable
    public int compareTo(Fraction fraction) {
        if (this == fraction) {
            return 0;
        }
        int i = this.numerator;
        int i2 = fraction.numerator;
        if (i == i2 && this.denominator == fraction.denominator) {
            return 0;
        }
        return Long.compare(i * fraction.denominator, i2 * this.denominator);
    }

    public String toString() {
        if (this.toString == null) {
            this.toString = getNumerator() + RemoteSettings.FORWARD_SLASH_STRING + getDenominator();
        }
        return this.toString;
    }

    public String toProperString() {
        if (this.toProperString == null) {
            int i = this.numerator;
            if (i == 0) {
                this.toProperString = "0";
            } else {
                int i2 = this.denominator;
                if (i == i2) {
                    this.toProperString = "1";
                } else if (i == i2 * (-1)) {
                    this.toProperString = "-1";
                } else {
                    if (i > 0) {
                        i = -i;
                    }
                    if (i < (-i2)) {
                        int properNumerator = getProperNumerator();
                        if (properNumerator == 0) {
                            this.toProperString = Integer.toString(getProperWhole());
                        } else {
                            this.toProperString = getProperWhole() + " " + properNumerator + RemoteSettings.FORWARD_SLASH_STRING + getDenominator();
                        }
                    } else {
                        this.toProperString = getNumerator() + RemoteSettings.FORWARD_SLASH_STRING + getDenominator();
                    }
                }
            }
        }
        return this.toProperString;
    }
}
