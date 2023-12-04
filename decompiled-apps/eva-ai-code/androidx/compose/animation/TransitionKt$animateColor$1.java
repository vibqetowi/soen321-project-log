package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Transition.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes.dex */
public final class TransitionKt$animateColor$1 extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Color>> {
    public static final TransitionKt$animateColor$1 INSTANCE = new TransitionKt$animateColor$1();

    public TransitionKt$animateColor$1() {
        super(3);
    }

    public final SpringSpec<Color> invoke(Transition.Segment<S> segment, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(segment, "$this$null");
        composer.startReplaceableGroup(-1457805428);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1457805428, i, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:64)");
        }
        SpringSpec<Color> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return spring$default;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ SpringSpec<Color> invoke(Object obj, Composer composer, Integer num) {
        return invoke((Transition.Segment) obj, composer, num.intValue());
    }
}
