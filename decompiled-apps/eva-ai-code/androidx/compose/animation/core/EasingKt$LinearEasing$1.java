package androidx.compose.animation.core;

import kotlin.Metadata;
/* compiled from: Easing.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "fraction", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class EasingKt$LinearEasing$1 implements Easing {
    public static final EasingKt$LinearEasing$1 INSTANCE = new EasingKt$LinearEasing$1();

    EasingKt$LinearEasing$1() {
    }

    @Override // androidx.compose.animation.core.Easing
    public final float transform(float f) {
        return f;
    }
}
