package androidx.compose.animation.core;

import kotlin.Metadata;
/* compiled from: EasingFunctions.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "fraction", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class EasingFunctionsKt$EaseInOutBounce$1 implements Easing {
    public static final EasingFunctionsKt$EaseInOutBounce$1 INSTANCE = new EasingFunctionsKt$EaseInOutBounce$1();

    EasingFunctionsKt$EaseInOutBounce$1() {
    }

    @Override // androidx.compose.animation.core.Easing
    public final float transform(float f) {
        float transform;
        if (f < 0.5d) {
            transform = 1 - EasingFunctionsKt.getEaseOutBounce().transform(1.0f - (f * 2.0f));
        } else {
            transform = 1 + EasingFunctionsKt.getEaseOutBounce().transform((f * 2.0f) - 1.0f);
        }
        return transform / 2.0f;
    }
}
