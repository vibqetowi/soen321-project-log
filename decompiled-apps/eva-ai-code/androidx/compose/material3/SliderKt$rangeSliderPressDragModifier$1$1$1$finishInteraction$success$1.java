package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1 extends Lambda implements Function1<PointerInputChange, Unit> {
    final /* synthetic */ Ref.BooleanRef $draggingStart;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1(State<? extends Function2<? super Boolean, ? super Float, Unit>> state, Ref.BooleanRef booleanRef, boolean z) {
        super(1);
        this.$onDrag = state;
        this.$draggingStart = booleanRef;
        this.$isRtl = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
        invoke2(pointerInputChange);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PointerInputChange it) {
        Intrinsics.checkNotNullParameter(it, "it");
        float m3018getXimpl = Offset.m3018getXimpl(PointerEventKt.positionChange(it));
        Function2<Boolean, Float, Unit> value = this.$onDrag.getValue();
        Boolean valueOf = Boolean.valueOf(this.$draggingStart.element);
        if (this.$isRtl) {
            m3018getXimpl = -m3018getXimpl;
        }
        value.invoke(valueOf, Float.valueOf(m3018getXimpl));
    }
}
