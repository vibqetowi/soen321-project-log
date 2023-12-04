package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: DatePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DatePickerKt$DatePicker$5$1$1 extends Lambda implements Function1<DisplayMode, Unit> {
    final /* synthetic */ DatePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePicker$5$1$1(DatePickerState datePickerState) {
        super(1);
        this.$state = datePickerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DisplayMode displayMode) {
        m1741invokevCnGnXg(displayMode.m1765unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-vCnGnXg  reason: not valid java name */
    public final void m1741invokevCnGnXg(int i) {
        this.$state.getStateData$material3_release().m1986switchDisplayModevCnGnXg(i);
    }
}
