package androidx.compose.animation.core;

import com.facebook.appevents.UserDataStore;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: SpringEstimation.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000b\u001a(\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a8\u0010\u0011\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a0\u0010\u0014\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a(\u0010\u0015\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a9\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0019H\u0082\b\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0003H\u0082\b¨\u0006\u001d"}, d2 = {"estimateAnimationDurationMillis", "", "stiffness", "", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "springConstant", "dampingCoefficient", "mass", "", "estimateCriticallyDamped", "firstRoot", "Landroidx/compose/animation/core/ComplexDouble;", "p0", "v0", "estimateDurationInternal", "secondRoot", "initialPosition", "estimateOverDamped", "estimateUnderDamped", "iterateNewtonsMethod", "x", UserDataStore.FIRST_NAME, "Lkotlin/Function1;", "fnPrime", "isNotFinite", "", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpringEstimationKt {
    public static final long estimateAnimationDurationMillis(float f, float f2, float f3, float f4, float f5) {
        return estimateAnimationDurationMillis(f, f2, f3, f4, f5);
    }

    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5) {
        double sqrt = 2.0d * d2 * Math.sqrt(d);
        double d6 = (sqrt * sqrt) - (4.0d * d);
        double d7 = -sqrt;
        ComplexDouble complexSqrt = ComplexDoubleKt.complexSqrt(d6);
        complexSqrt._real += d7;
        complexSqrt._real *= 0.5d;
        complexSqrt._imaginary *= 0.5d;
        ComplexDouble complexSqrt2 = ComplexDoubleKt.complexSqrt(d6);
        double d8 = -1;
        complexSqrt2._real *= d8;
        complexSqrt2._imaginary *= d8;
        complexSqrt2._real += d7;
        complexSqrt2._real *= 0.5d;
        complexSqrt2._imaginary *= 0.5d;
        return estimateDurationInternal(complexSqrt, complexSqrt2, d2, d3, d4, d5);
    }

    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5, double d6) {
        double sqrt = d2 / (Math.sqrt(d * d3) * 2.0d);
        double d7 = (d2 * d2) - ((4.0d * d3) * d);
        double d8 = 1.0d / (2.0d * d3);
        double d9 = -d2;
        ComplexDouble complexSqrt = ComplexDoubleKt.complexSqrt(d7);
        complexSqrt._real += d9;
        complexSqrt._real *= d8;
        complexSqrt._imaginary *= d8;
        ComplexDouble complexSqrt2 = ComplexDoubleKt.complexSqrt(d7);
        double d10 = -1;
        complexSqrt2._real *= d10;
        complexSqrt2._imaginary *= d10;
        complexSqrt2._real += d9;
        complexSqrt2._real *= d8;
        complexSqrt2._imaginary *= d8;
        return estimateDurationInternal(complexSqrt, complexSqrt2, sqrt, d4, d5, d6);
    }

    private static final double estimateUnderDamped(ComplexDouble complexDouble, double d, double d2, double d3) {
        double real = complexDouble.getReal();
        double imaginary = (d2 - (real * d)) / complexDouble.getImaginary();
        return Math.log(d3 / Math.sqrt((d * d) + (imaginary * imaginary))) / real;
    }

    private static final double estimateCriticallyDamped(ComplexDouble complexDouble, double d, double d2, double d3) {
        double d4;
        int i;
        double d5 = d3;
        double real = complexDouble.getReal();
        double d6 = real * d;
        double d7 = d2 - d6;
        double log = Math.log(Math.abs(d5 / d)) / real;
        double log2 = Math.log(Math.abs(d5 / d7));
        double d8 = log2;
        for (int i2 = 0; i2 < 6; i2++) {
            d8 = log2 - Math.log(Math.abs(d8 / real));
        }
        double d9 = d8 / real;
        if (!((Double.isInfinite(log) || Double.isNaN(log)) ? false : true)) {
            log = d9;
        } else if (!(!((Double.isInfinite(d9) || Double.isNaN(d9)) ? false : true))) {
            log = Math.max(log, d9);
        }
        double d10 = (-(d6 + d7)) / (real * d7);
        double d11 = real * d10;
        double exp = (Math.exp(d11) * d) + (d7 * d10 * Math.exp(d11));
        if (!Double.isNaN(d10) && d10 > 0.0d) {
            if (d10 <= 0.0d || (-exp) >= d5) {
                log = (-(2.0d / real)) - (d / d7);
                d4 = Double.MAX_VALUE;
                i = 0;
                while (d4 > 0.001d && i < 100) {
                    i++;
                    double d12 = real * log;
                    double d13 = d5;
                    double exp2 = log - ((((d + (d7 * log)) * Math.exp(d12)) + d5) / ((((1 + d12) * d7) + d6) * Math.exp(d12)));
                    d4 = Math.abs(log - exp2);
                    log = exp2;
                    d5 = d13;
                }
                return log;
            } else if (d7 < 0.0d && d > 0.0d) {
                log = 0.0d;
            }
        }
        d5 = -d5;
        d4 = Double.MAX_VALUE;
        i = 0;
        while (d4 > 0.001d) {
            i++;
            double d122 = real * log;
            double d132 = d5;
            double exp22 = log - ((((d + (d7 * log)) * Math.exp(d122)) + d5) / ((((1 + d122) * d7) + d6) * Math.exp(d122)));
            d4 = Math.abs(log - exp22);
            log = exp22;
            d5 = d132;
        }
        return log;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final double estimateOverDamped(ComplexDouble complexDouble, ComplexDouble complexDouble2, double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7 = d3;
        double real = complexDouble.getReal();
        double real2 = complexDouble2.getReal();
        double d8 = real - real2;
        double d9 = ((real * d) - d2) / d8;
        double d10 = d - d9;
        double log = Math.log(Math.abs(d7 / d10)) / real;
        double log2 = Math.log(Math.abs(d7 / d9)) / real2;
        if (!((Double.isInfinite(log) || Double.isNaN(log)) ? false : true)) {
            d4 = log2;
        } else {
            if (!(!((Double.isInfinite(log2) || Double.isNaN(log2)) ? false : true))) {
                log = Math.max(log, log2);
            }
            d4 = log;
        }
        double d11 = d10 * real;
        double log3 = Math.log(d11 / ((-d9) * real2)) / (real2 - real);
        if (!Double.isNaN(log3) && log3 > 0.0d) {
            if (log3 > 0.0d) {
                d5 = d9;
                if ((-estimateOverDamped$xInflection(d10, real, log3, d9, real2)) < d7) {
                    if (d5 > 0.0d && d10 < 0.0d) {
                        d4 = 0.0d;
                    }
                }
            } else {
                d5 = d9;
            }
            d4 = Math.log((-((d5 * real2) * real2)) / (d11 * real)) / d8;
            d6 = d5 * real2;
            if (Math.abs((Math.exp(real * d4) * d11) + (Math.exp(real2 * d4) * d6)) >= 1.0E-4d) {
                return d4;
            }
            double d12 = Double.MAX_VALUE;
            int i = 0;
            while (d12 > 0.001d && i < 100) {
                i++;
                double d13 = real * d4;
                double d14 = real2 * d4;
                double exp = d4 - ((((Math.exp(d13) * d10) + (Math.exp(d14) * d5)) + d7) / ((Math.exp(d13) * d11) + (Math.exp(d14) * d6)));
                double abs = Math.abs(d4 - exp);
                d4 = exp;
                d12 = abs;
            }
            return d4;
        }
        d5 = d9;
        d7 = -d7;
        d6 = d5 * real2;
        if (Math.abs((Math.exp(real * d4) * d11) + (Math.exp(real2 * d4) * d6)) >= 1.0E-4d) {
        }
    }

    private static final double estimateOverDamped$xInflection(double d, double d2, double d3, double d4, double d5) {
        return (d * Math.exp(d2 * d3)) + (d4 * Math.exp(d5 * d3));
    }

    private static final long estimateDurationInternal(ComplexDouble complexDouble, ComplexDouble complexDouble2, double d, double d2, double d3, double d4) {
        double estimateCriticallyDamped;
        double d5 = d2;
        int i = (d3 > 0.0d ? 1 : (d3 == 0.0d ? 0 : -1));
        if (i == 0) {
            if (d5 == 0.0d) {
                return 0L;
            }
        }
        if (i < 0) {
            d5 = -d5;
        }
        double abs = Math.abs(d3);
        if (d > 1.0d) {
            estimateCriticallyDamped = estimateOverDamped(complexDouble, complexDouble2, abs, d5, d4);
        } else if (d < 1.0d) {
            estimateCriticallyDamped = estimateUnderDamped(complexDouble, abs, d5, d4);
        } else {
            estimateCriticallyDamped = estimateCriticallyDamped(complexDouble, abs, d5, d4);
        }
        return (long) (estimateCriticallyDamped * 1000.0d);
    }

    private static final double iterateNewtonsMethod(double d, Function1<? super Double, Double> function1, Function1<? super Double, Double> function12) {
        return d - (function1.invoke(Double.valueOf(d)).doubleValue() / function12.invoke(Double.valueOf(d)).doubleValue());
    }

    private static final boolean isNotFinite(double d) {
        return !((Double.isInfinite(d) || Double.isNaN(d)) ? false : true);
    }
}
