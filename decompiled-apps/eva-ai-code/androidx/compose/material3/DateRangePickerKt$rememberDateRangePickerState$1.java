package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
/* compiled from: DateRangePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DateRangePickerKt$rememberDateRangePickerState$1 extends Lambda implements Function0<DateRangePickerState> {
    final /* synthetic */ int $initialDisplayMode;
    final /* synthetic */ Long $initialDisplayedMonthMillis;
    final /* synthetic */ Long $initialSelectedEndDateMillis;
    final /* synthetic */ Long $initialSelectedStartDateMillis;
    final /* synthetic */ IntRange $yearRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$rememberDateRangePickerState$1(Long l, Long l2, Long l3, IntRange intRange, int i) {
        super(0);
        this.$initialSelectedStartDateMillis = l;
        this.$initialSelectedEndDateMillis = l2;
        this.$initialDisplayedMonthMillis = l3;
        this.$yearRange = intRange;
        this.$initialDisplayMode = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final DateRangePickerState invoke() {
        return new DateRangePickerState(this.$initialSelectedStartDateMillis, this.$initialSelectedEndDateMillis, this.$initialDisplayedMonthMillis, this.$yearRange, this.$initialDisplayMode, null);
    }
}
