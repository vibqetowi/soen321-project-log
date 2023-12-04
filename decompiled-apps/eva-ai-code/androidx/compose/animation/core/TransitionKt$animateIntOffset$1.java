package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Transition.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes.dex */
public final class TransitionKt$animateIntOffset$1 extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<IntOffset>> {
    public static final TransitionKt$animateIntOffset$1 INSTANCE = new TransitionKt$animateIntOffset$1();

    public TransitionKt$animateIntOffset$1() {
        super(3);
    }

    public final SpringSpec<IntOffset> invoke(Transition.Segment<S> segment, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(segment, "$this$null");
        composer.startReplaceableGroup(-1953479610);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1953479610, i, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:1059)");
        }
        SpringSpec<IntOffset> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m5716boximpl(IntOffsetKt.IntOffset(1, 1)), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return spring$default;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ SpringSpec<IntOffset> invoke(Object obj, Composer composer, Integer num) {
        return invoke((Transition.Segment) obj, composer, num.intValue());
    }
}
