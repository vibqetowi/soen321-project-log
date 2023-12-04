package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: DateRangePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DateRangePickerKt$DateRangePicker$5$1$1 extends Lambda implements Function1<DisplayMode, Unit> {
    final /* synthetic */ DateRangePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$DateRangePicker$5$1$1(DateRangePickerState dateRangePickerState) {
        super(1);
        this.$state = dateRangePickerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DisplayMode displayMode) {
        m1747invokevCnGnXg(displayMode.m1765unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-vCnGnXg  reason: not valid java name */
    public final void m1747invokevCnGnXg(int i) {
        this.$state.getStateData$material3_release().m1986switchDisplayModevCnGnXg(i);
    }
}
