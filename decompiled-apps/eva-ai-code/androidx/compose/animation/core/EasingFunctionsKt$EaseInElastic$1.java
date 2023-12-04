package androidx.compose.animation.core;

import kotlin.Metadata;
/* compiled from: EasingFunctions.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "fraction", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class EasingFunctionsKt$EaseInElastic$1 implements Easing {
    public static final EasingFunctionsKt$EaseInElastic$1 INSTANCE = new EasingFunctionsKt$EaseInElastic$1();

    EasingFunctionsKt$EaseInElastic$1() {
    }

    @Override // androidx.compose.animation.core.Easing
    public final float transform(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        float f2 = f * 10.0f;
        return (float) ((-((float) Math.pow(2.0f, f2 - 10.0f))) * Math.sin((f2 - 10.75f) * 2.0943951023931953d));
    }
}
