package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SliderKt$RangeSliderImpl$gestureEndAction$1$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ Function0<Unit> $onValueChangeFinished;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSliderImpl$gestureEndAction$1$1(Function0<Unit> function0) {
        super(1);
        this.$onValueChangeFinished = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        Function0<Unit> function0 = this.$onValueChangeFinished;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
