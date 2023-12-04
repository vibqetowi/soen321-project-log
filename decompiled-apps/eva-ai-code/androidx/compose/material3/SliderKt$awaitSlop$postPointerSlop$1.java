package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "pointerInput", "Landroidx/compose/ui/input/pointer/PointerInputChange;", TypedValues.CycleType.S_WAVE_OFFSET, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SliderKt$awaitSlop$postPointerSlop$1 extends Lambda implements Function2<PointerInputChange, Float, Unit> {
    final /* synthetic */ Ref.FloatRef $initialDelta;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$awaitSlop$postPointerSlop$1(Ref.FloatRef floatRef) {
        super(2);
        this.$initialDelta = floatRef;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Float f) {
        invoke(pointerInputChange, f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PointerInputChange pointerInput, float f) {
        Intrinsics.checkNotNullParameter(pointerInput, "pointerInput");
        pointerInput.consume();
        this.$initialDelta.element = f;
    }
}
