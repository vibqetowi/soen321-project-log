package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Transition.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes.dex */
public final class TransitionKt$animateIntSize$1 extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<IntSize>> {
    public static final TransitionKt$animateIntSize$1 INSTANCE = new TransitionKt$animateIntSize$1();

    public TransitionKt$animateIntSize$1() {
        super(3);
    }

    public final SpringSpec<IntSize> invoke(Transition.Segment<S> segment, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(segment, "$this$null");
        composer.startReplaceableGroup(967893300);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(967893300, i, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:1120)");
        }
        SpringSpec<IntSize> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m5759boximpl(IntSizeKt.IntSize(1, 1)), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return spring$default;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(Object obj, Composer composer, Integer num) {
        return invoke((Transition.Segment) obj, composer, num.intValue());
    }
}
