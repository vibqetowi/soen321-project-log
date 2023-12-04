package androidx.compose.animation.core;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SuspendAnimation.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/AnimationScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SuspendAnimationKt$animate$3 extends Lambda implements Function1<AnimationScope<T, V>, Unit> {
    final /* synthetic */ Function2<T, T, Unit> $block;
    final /* synthetic */ TwoWayConverter<T, V> $typeConverter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendAnimationKt$animate$3(Function2<? super T, ? super T, Unit> function2, TwoWayConverter<T, V> twoWayConverter) {
        super(1);
        this.$block = function2;
        this.$typeConverter = twoWayConverter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((AnimationScope) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(AnimationScope<T, V> animate) {
        Intrinsics.checkNotNullParameter(animate, "$this$animate");
        this.$block.invoke(animate.getValue(), this.$typeConverter.getConvertFromVector().invoke(animate.getVelocityVector()));
    }
}
