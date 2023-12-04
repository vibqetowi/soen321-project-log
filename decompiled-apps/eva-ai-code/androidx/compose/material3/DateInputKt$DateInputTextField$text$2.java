package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
/* compiled from: DateInput.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DateInputKt$DateInputTextField$text$2 extends Lambda implements Function0<MutableState<TextFieldValue>> {
    final /* synthetic */ DateInputFormat $dateInputFormat;
    final /* synthetic */ CalendarDate $initialDate;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ StateData $stateData;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateInputKt$DateInputTextField$text$2(StateData stateData, CalendarDate calendarDate, DateInputFormat dateInputFormat, Locale locale) {
        super(0);
        this.$stateData = stateData;
        this.$initialDate = calendarDate;
        this.$dateInputFormat = dateInputFormat;
        this.$locale = locale;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MutableState<TextFieldValue> invoke() {
        MutableState<TextFieldValue> mutableStateOf$default;
        StateData stateData = this.$stateData;
        CalendarDate calendarDate = this.$initialDate;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((calendarDate == null || (r0 = stateData.getCalendarModel().formatWithPattern(calendarDate.getUtcTimeMillis(), this.$dateInputFormat.getPatternWithoutDelimiters(), this.$locale)) == null) ? "" : "", TextRangeKt.TextRange(0, 0), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
        return mutableStateOf$default;
    }
}
