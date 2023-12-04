package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/material/AnchoredDraggableState;", ExifInterface.GPS_DIRECTION_TRUE, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnchoredDraggableKt$rememberAnchoredDraggableState$2 extends Lambda implements Function0<AnchoredDraggableState<T>> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<T, Boolean> $confirmValueChange;
    final /* synthetic */ T $initialValue;
    final /* synthetic */ Function1<Float, Float> $positionalThreshold;
    final /* synthetic */ Function0<Float> $velocityThreshold;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableKt$rememberAnchoredDraggableState$2(T t, Function1<? super Float, Float> function1, Function0<Float> function0, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function12) {
        super(0);
        this.$initialValue = t;
        this.$positionalThreshold = function1;
        this.$velocityThreshold = function0;
        this.$animationSpec = animationSpec;
        this.$confirmValueChange = function12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AnchoredDraggableState<T> invoke() {
        return new AnchoredDraggableState<>(this.$initialValue, this.$positionalThreshold, this.$velocityThreshold, this.$animationSpec, this.$confirmValueChange);
    }
}
