package androidx.core.util;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes3.dex */
public class TypedValueCompat {
    private static final float INCHES_PER_MM = 0.03937008f;
    private static final float INCHES_PER_PT = 0.013888889f;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ComplexDimensionUnit {
    }

    public static int getUnitFromComplexDimension(int i) {
        return (i >> 0) & 15;
    }

    private TypedValueCompat() {
    }

    public static float deriveDimension(int i, float f, DisplayMetrics displayMetrics) {
        float f2;
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.deriveDimension(i, f, displayMetrics);
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (displayMetrics.xdpi == 0.0f) {
                                    return 0.0f;
                                }
                                f /= displayMetrics.xdpi;
                                f2 = INCHES_PER_MM;
                            } else {
                                throw new IllegalArgumentException("Invalid unitToConvertTo " + i);
                            }
                        } else if (displayMetrics.xdpi == 0.0f) {
                            return 0.0f;
                        } else {
                            f2 = displayMetrics.xdpi;
                        }
                    } else if (displayMetrics.xdpi == 0.0f) {
                        return 0.0f;
                    } else {
                        f /= displayMetrics.xdpi;
                        f2 = INCHES_PER_PT;
                    }
                } else if (displayMetrics.scaledDensity == 0.0f) {
                    return 0.0f;
                } else {
                    f2 = displayMetrics.scaledDensity;
                }
            } else if (displayMetrics.density == 0.0f) {
                return 0.0f;
            } else {
                f2 = displayMetrics.density;
            }
            return f / f2;
        }
        return f;
    }

    public static float dpToPx(float f, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f, displayMetrics);
    }

    public static float pxToDp(float f, DisplayMetrics displayMetrics) {
        return deriveDimension(1, f, displayMetrics);
    }

    public static float spToPx(float f, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, f, displayMetrics);
    }

    public static float pxToSp(float f, DisplayMetrics displayMetrics) {
        return deriveDimension(2, f, displayMetrics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class Api34Impl {
        private Api34Impl() {
        }

        public static float deriveDimension(int i, float f, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(i, f, displayMetrics);
        }
    }
}
