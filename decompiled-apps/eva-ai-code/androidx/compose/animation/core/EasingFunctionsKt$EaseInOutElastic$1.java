package androidx.compose.animation.core;

import kotlin.Metadata;
/* compiled from: EasingFunctions.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "fraction", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class EasingFunctionsKt$EaseInOutElastic$1 implements Easing {
    public static final EasingFunctionsKt$EaseInOutElastic$1 INSTANCE = new EasingFunctionsKt$EaseInOutElastic$1();

    EasingFunctionsKt$EaseInOutElastic$1() {
    }

    @Override // androidx.compose.animation.core.Easing
    public final float transform(float f) {
        double d;
        double d2;
        boolean z = true;
        if (f == 0.0f) {
            return 0.0f;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        if (0.0f > f || f > 0.5f) {
            z = false;
        }
        if (z) {
            float f2 = f * 20.0f;
            return (float) ((-(((float) Math.pow(d2, f2 - 10.0f)) * Math.sin((f2 - 11.125f) * 1.3962634015954636d))) / 2.0f);
        }
        return ((float) ((((float) Math.pow(d, ((-20.0f) * f) + 10.0f)) * Math.sin(((f * 20.0f) - 11.125f) * 1.3962634015954636d)) / 2.0f)) + 1.0f;
    }
}
