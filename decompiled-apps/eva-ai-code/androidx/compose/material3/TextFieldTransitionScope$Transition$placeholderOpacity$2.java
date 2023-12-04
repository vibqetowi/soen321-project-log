package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
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
/* compiled from: TextFieldImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldTransitionScope$Transition$placeholderOpacity$2 extends Lambda implements Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>> {
    public static final TextFieldTransitionScope$Transition$placeholderOpacity$2 INSTANCE = new TextFieldTransitionScope$Transition$placeholderOpacity$2();

    TextFieldTransitionScope$Transition$placeholderOpacity$2() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer, Integer num) {
        return invoke(segment, composer, num.intValue());
    }

    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> animateFloat, Composer composer, int i) {
        TweenSpec tween;
        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
        composer.startReplaceableGroup(-1635067817);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1635067817, i, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:325)");
        }
        if (animateFloat.isTransitioningTo(InputPhase.Focused, InputPhase.UnfocusedEmpty)) {
            tween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
        } else if (animateFloat.isTransitioningTo(InputPhase.UnfocusedEmpty, InputPhase.Focused) || animateFloat.isTransitioningTo(InputPhase.UnfocusedNotEmpty, InputPhase.UnfocusedEmpty)) {
            tween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
        } else {
            tween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tween;
    }
}
