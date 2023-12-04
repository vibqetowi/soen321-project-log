package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: SwipeableV2.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwipeableV2Kt$rememberSwipeableV2State$2 extends Lambda implements Function0<SwipeableV2State<T>> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<T, Boolean> $confirmValueChange;
    final /* synthetic */ T $initialValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableV2Kt$rememberSwipeableV2State$2(T t, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1) {
        super(0);
        this.$initialValue = t;
        this.$animationSpec = animationSpec;
        this.$confirmValueChange = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SwipeableV2State<T> invoke() {
        return new SwipeableV2State<>(this.$initialValue, this.$animationSpec, this.$confirmValueChange, SwipeableV2Defaults.INSTANCE.getPositionalThreshold(), SwipeableV2Defaults.INSTANCE.m2082getVelocityThresholdD9Ej5fM(), null);
    }
}
