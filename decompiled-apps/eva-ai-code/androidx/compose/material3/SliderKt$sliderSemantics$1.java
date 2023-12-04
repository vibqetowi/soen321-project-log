package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SliderKt$sliderSemantics$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ float $coerced;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function1<Float, Unit> $onValueChange;
    final /* synthetic */ Function0<Unit> $onValueChangeFinished;
    final /* synthetic */ int $steps;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$sliderSemantics$1(boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, float f, Function1<? super Float, Unit> function1, Function0<Unit> function0) {
        super(1);
        this.$enabled = z;
        this.$valueRange = closedFloatingPointRange;
        this.$steps = i;
        this.$coerced = f;
        this.$onValueChange = function1;
        this.$onValueChangeFinished = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "targetValue", "", "invoke", "(F)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$sliderSemantics$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Float, Boolean> {
        final /* synthetic */ float $coerced;
        final /* synthetic */ Function1<Float, Unit> $onValueChange;
        final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        final /* synthetic */ int $steps;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, float f, Function1<? super Float, Unit> function1, Function0<Unit> function0) {
            super(1);
            this.$valueRange = closedFloatingPointRange;
            this.$steps = i;
            this.$coerced = f;
            this.$onValueChange = function1;
            this.$onValueChangeFinished = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
            return invoke(f.floatValue());
        }

        public final Boolean invoke(float f) {
            int i;
            float coerceIn = RangesKt.coerceIn(f, this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
            int i2 = this.$steps;
            boolean z = false;
            if (i2 > 0 && (i = i2 + 1) >= 0) {
                float f2 = coerceIn;
                float f3 = f2;
                int i3 = 0;
                while (true) {
                    float lerp = MathHelpersKt.lerp(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), i3 / (this.$steps + 1));
                    float f4 = lerp - coerceIn;
                    if (Math.abs(f4) <= f2) {
                        f2 = Math.abs(f4);
                        f3 = lerp;
                    }
                    if (i3 == i) {
                        break;
                    }
                    i3++;
                }
                coerceIn = f3;
            }
            if (!(coerceIn == this.$coerced)) {
                this.$onValueChange.invoke(Float.valueOf(coerceIn));
                Function0<Unit> function0 = this.$onValueChangeFinished;
                if (function0 != null) {
                    function0.invoke();
                }
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        if (!this.$enabled) {
            SemanticsPropertiesKt.disabled(semantics);
        }
        SemanticsPropertiesKt.setProgress$default(semantics, null, new AnonymousClass1(this.$valueRange, this.$steps, this.$coerced, this.$onValueChange, this.$onValueChangeFinished), 1, null);
    }
}
