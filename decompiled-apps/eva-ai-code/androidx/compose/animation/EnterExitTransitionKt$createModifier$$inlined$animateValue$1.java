package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Transition.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createModifier$$inlined$animateValue$1 extends Lambda implements Function3<Transition.Segment<EnterExitState>, Composer, Integer, SpringSpec<TransformOrigin>> {
    public static final EnterExitTransitionKt$createModifier$$inlined$animateValue$1 INSTANCE = new EnterExitTransitionKt$createModifier$$inlined$animateValue$1();

    public EnterExitTransitionKt$createModifier$$inlined$animateValue$1() {
        super(3);
    }

    public final SpringSpec<TransformOrigin> invoke(Transition.Segment<EnterExitState> segment, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(segment, "$this$null");
        composer.startReplaceableGroup(-895531546);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-895531546, i, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:852)");
        }
        SpringSpec<TransformOrigin> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return spring$default;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ SpringSpec<TransformOrigin> invoke(Transition.Segment<EnterExitState> segment, Composer composer, Integer num) {
        return invoke(segment, composer, num.intValue());
    }
}
