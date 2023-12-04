package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
/* compiled from: DatePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DatePickerKt$rememberDatePickerState$1 extends Lambda implements Function0<DatePickerState> {
    final /* synthetic */ int $initialDisplayMode;
    final /* synthetic */ Long $initialDisplayedMonthMillis;
    final /* synthetic */ Long $initialSelectedDateMillis;
    final /* synthetic */ IntRange $yearRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$rememberDatePickerState$1(Long l, Long l2, IntRange intRange, int i) {
        super(0);
        this.$initialSelectedDateMillis = l;
        this.$initialDisplayedMonthMillis = l2;
        this.$yearRange = intRange;
        this.$initialDisplayMode = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final DatePickerState invoke() {
        return new DatePickerState(this.$initialSelectedDateMillis, this.$initialDisplayedMonthMillis, this.$yearRange, this.$initialDisplayMode, null);
    }
}
