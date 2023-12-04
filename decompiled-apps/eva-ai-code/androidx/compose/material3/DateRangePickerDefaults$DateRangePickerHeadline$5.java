package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateRangePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateRangePickerDefaults$DateRangePickerHeadline$5 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ Function2<Composer, Integer, Unit> $datesDelimiter;
    final /* synthetic */ Function2<Composer, Integer, Unit> $endDatePlaceholder;
    final /* synthetic */ String $endDateText;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function2<Composer, Integer, Unit> $startDatePlaceholder;
    final /* synthetic */ String $startDateText;
    final /* synthetic */ DateRangePickerState $state;
    final /* synthetic */ DateRangePickerDefaults $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateRangePickerDefaults$DateRangePickerHeadline$5(DateRangePickerDefaults dateRangePickerDefaults, DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter, Modifier modifier, String str, String str2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i) {
        super(2);
        this.$tmp0_rcvr = dateRangePickerDefaults;
        this.$state = dateRangePickerState;
        this.$dateFormatter = datePickerFormatter;
        this.$modifier = modifier;
        this.$startDateText = str;
        this.$endDateText = str2;
        this.$startDatePlaceholder = function2;
        this.$endDatePlaceholder = function22;
        this.$datesDelimiter = function23;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.DateRangePickerHeadline(this.$state, this.$dateFormatter, this.$modifier, this.$startDateText, this.$endDateText, this.$startDatePlaceholder, this.$endDatePlaceholder, this.$datesDelimiter, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
