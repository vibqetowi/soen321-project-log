package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: DateRangeInput.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DateRangeInputKt$DateRangeInputContent$1$3$1 extends Lambda implements Function1<CalendarDate, Unit> {
    final /* synthetic */ StateData $stateData;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangeInputKt$DateRangeInputContent$1$3$1(StateData stateData) {
        super(1);
        this.$stateData = stateData;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CalendarDate calendarDate) {
        invoke2(calendarDate);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CalendarDate calendarDate) {
        this.$stateData.getSelectedStartDate().setValue(calendarDate);
    }
}
