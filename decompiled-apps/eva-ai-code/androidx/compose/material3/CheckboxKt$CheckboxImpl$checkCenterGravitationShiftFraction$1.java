package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Checkbox.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 extends Lambda implements Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>> {
    public static final CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 INSTANCE = new CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1();

    CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer, Integer num) {
        return invoke(segment, composer, num.intValue());
    }

    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> animateFloat, Composer composer, int i) {
        TweenSpec snap;
        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
        composer.startReplaceableGroup(-1324481169);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1324481169, i, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:253)");
        }
        if (animateFloat.getInitialState() == ToggleableState.Off) {
            snap = AnimationSpecKt.snap$default(0, 1, null);
        } else {
            snap = animateFloat.getTargetState() == ToggleableState.Off ? AnimationSpecKt.snap(100) : AnimationSpecKt.tween$default(100, 0, null, 6, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snap;
    }
}
