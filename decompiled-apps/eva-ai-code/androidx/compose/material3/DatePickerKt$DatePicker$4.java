package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerKt$DatePicker$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ DatePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePicker$4(DatePickerState datePickerState, DatePickerFormatter datePickerFormatter, int i) {
        super(2);
        this.$state = datePickerState;
        this.$dateFormatter = datePickerFormatter;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        PaddingValues paddingValues;
        ComposerKt.sourceInformation(composer, "C161@7665L142:DatePicker.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1578326756, i, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:160)");
            }
            DatePickerDefaults datePickerDefaults = DatePickerDefaults.INSTANCE;
            DatePickerState datePickerState = this.$state;
            DatePickerFormatter datePickerFormatter = this.$dateFormatter;
            paddingValues = DatePickerKt.DatePickerHeadlinePadding;
            Modifier padding = PaddingKt.padding(Modifier.Companion, paddingValues);
            int i2 = this.$$dirty;
            datePickerDefaults.DatePickerHeadline(datePickerState, datePickerFormatter, padding, composer, (i2 & 14) | 3456 | ((i2 >> 3) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
