package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SliderKt$SliderImpl$gestureEndAction$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ SliderDraggableState $draggableState;
    final /* synthetic */ Function0<Unit> $onValueChangeFinished;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$gestureEndAction$1(SliderDraggableState sliderDraggableState, Function0<Unit> function0) {
        super(0);
        this.$draggableState = sliderDraggableState;
        this.$onValueChangeFinished = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> function0;
        if (this.$draggableState.isDragging() || (function0 = this.$onValueChangeFinished) == null) {
            return;
        }
        function0.invoke();
    }
}
