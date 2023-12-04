package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Transition.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes.dex */
public final class TransitionKt$animateOffset$1 extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Offset>> {
    public static final TransitionKt$animateOffset$1 INSTANCE = new TransitionKt$animateOffset$1();

    public TransitionKt$animateOffset$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ SpringSpec<Offset> invoke(Object obj, Composer composer, Integer num) {
        return invoke((Transition.Segment) obj, composer, num.intValue());
    }

    public final SpringSpec<Offset> invoke(Transition.Segment<S> segment, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(segment, "$this$null");
        composer.startReplaceableGroup(1623385561);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1623385561, i, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:995)");
        }
        SpringSpec<Offset> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m3007boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return spring$default;
    }
}
