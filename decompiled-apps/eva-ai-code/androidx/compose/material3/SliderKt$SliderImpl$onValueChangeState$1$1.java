package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SliderKt$SliderImpl$onValueChangeState$1$1 extends Lambda implements Function1<Float, Unit> {
    final /* synthetic */ Function1<Float, Unit> $onValueChange;
    final /* synthetic */ float $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$SliderImpl$onValueChangeState$1$1(float f, Function1<? super Float, Unit> function1) {
        super(1);
        this.$value = f;
        this.$onValueChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f) {
        if (f == this.$value) {
            return;
        }
        this.$onValueChange.invoke(Float.valueOf(f));
    }
}
