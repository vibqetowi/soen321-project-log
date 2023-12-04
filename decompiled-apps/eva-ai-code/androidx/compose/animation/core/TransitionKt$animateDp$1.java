package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Transition.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes.dex */
public final class TransitionKt$animateDp$1 extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Dp>> {
    public static final TransitionKt$animateDp$1 INSTANCE = new TransitionKt$animateDp$1();

    public TransitionKt$animateDp$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ SpringSpec<Dp> invoke(Object obj, Composer composer, Integer num) {
        return invoke((Transition.Segment) obj, composer, num.intValue());
    }

    public final SpringSpec<Dp> invoke(Transition.Segment<S> segment, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(segment, "$this$null");
        composer.startReplaceableGroup(-575880366);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-575880366, i, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:964)");
        }
        SpringSpec<Dp> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m5605boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.Companion)), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return spring$default;
    }
}
