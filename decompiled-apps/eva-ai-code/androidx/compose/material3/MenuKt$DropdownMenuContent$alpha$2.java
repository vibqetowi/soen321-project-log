package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Menu.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MenuKt$DropdownMenuContent$alpha$2 extends Lambda implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> {
    public static final MenuKt$DropdownMenuContent$alpha$2 INSTANCE = new MenuKt$DropdownMenuContent$alpha$2();

    MenuKt$DropdownMenuContent$alpha$2() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer, Integer num) {
        return invoke(segment, composer, num.intValue());
    }

    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> animateFloat, Composer composer, int i) {
        TweenSpec tween$default;
        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
        composer.startReplaceableGroup(896631233);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(896631233, i, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:101)");
        }
        if (animateFloat.isTransitioningTo(false, true)) {
            tween$default = AnimationSpecKt.tween$default(30, 0, null, 6, null);
        } else {
            tween$default = AnimationSpecKt.tween$default(75, 0, null, 6, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tween$default;
    }
}
