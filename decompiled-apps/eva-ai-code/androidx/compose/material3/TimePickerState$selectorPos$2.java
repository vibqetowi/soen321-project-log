package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TimePicker.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/DpOffset;", "invoke-RKDOV3M", "()J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerState$selectorPos$2 extends Lambda implements Function0<DpOffset> {
    final /* synthetic */ boolean $is24Hour;
    final /* synthetic */ TimePickerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerState$selectorPos$2(TimePickerState timePickerState, boolean z) {
        super(0);
        this.this$0 = timePickerState;
        this.$is24Hour = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ DpOffset invoke() {
        return DpOffset.m5662boximpl(m2189invokeRKDOV3M());
    }

    /* renamed from: invoke-RKDOV3M  reason: not valid java name */
    public final long m2189invokeRKDOV3M() {
        boolean isInnerCircle$material3_release = this.this$0.isInnerCircle$material3_release();
        float f = 2;
        float m5607constructorimpl = Dp.m5607constructorimpl(TimePickerTokens.INSTANCE.m2755getClockDialSelectorHandleContainerSizeD9Ej5fM() / f);
        float m5607constructorimpl2 = Dp.m5607constructorimpl(Dp.m5607constructorimpl(((this.$is24Hour && isInnerCircle$material3_release && Selection.m1968equalsimpl0(this.this$0.m2185getSelectionJiIwxys$material3_release(), Selection.Companion.m1972getHourJiIwxys())) ? TimePickerKt.InnerCircleRadius : TimePickerKt.OuterCircleSizeRadius) - m5607constructorimpl) + m5607constructorimpl);
        return DpKt.m5628DpOffsetYgX7TsA(Dp.m5607constructorimpl(Dp.m5607constructorimpl(((float) Math.cos(this.this$0.getCurrentAngle$material3_release().getValue().floatValue())) * m5607constructorimpl2) + Dp.m5607constructorimpl(TimePickerTokens.INSTANCE.m2753getClockDialContainerSizeD9Ej5fM() / f)), Dp.m5607constructorimpl(Dp.m5607constructorimpl(m5607constructorimpl2 * ((float) Math.sin(this.this$0.getCurrentAngle$material3_release().getValue().floatValue()))) + Dp.m5607constructorimpl(TimePickerTokens.INSTANCE.m2753getClockDialContainerSizeD9Ej5fM() / f)));
    }
}
