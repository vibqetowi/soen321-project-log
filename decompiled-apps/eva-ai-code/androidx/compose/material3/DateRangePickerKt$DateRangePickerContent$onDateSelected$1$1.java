package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateRangePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateRangePickerKt$DateRangePickerContent$onDateSelected$1$1 extends Lambda implements Function1<Long, Unit> {
    final /* synthetic */ StateData $stateData;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$DateRangePickerContent$onDateSelected$1$1(StateData stateData) {
        super(1);
        this.$stateData = stateData;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l) {
        invoke(l.longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j) {
        DateRangePickerKt.updateDateSelection(this.$stateData, j);
    }
}
