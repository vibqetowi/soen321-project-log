package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Tab.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TabKt$TabTransition$color$2 extends Lambda implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>> {
    public static final TabKt$TabTransition$color$2 INSTANCE = new TabKt$TabTransition$color$2();

    TabKt$TabTransition$color$2() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer, Integer num) {
        return invoke(segment, composer, num.intValue());
    }

    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> animateColor, Composer composer, int i) {
        TweenSpec tween$default;
        Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
        composer.startReplaceableGroup(-899623535);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-899623535, i, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:274)");
        }
        if (animateColor.isTransitioningTo(false, true)) {
            tween$default = AnimationSpecKt.tween(150, 100, EasingKt.getLinearEasing());
        } else {
            tween$default = AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tween$default;
    }
}
