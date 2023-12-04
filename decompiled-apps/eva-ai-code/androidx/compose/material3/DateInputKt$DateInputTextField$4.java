package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateInput.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateInputKt$DateInputTextField$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DateInputFormat $dateInputFormat;
    final /* synthetic */ DateInputValidator $dateInputValidator;
    final /* synthetic */ CalendarDate $initialDate;
    final /* synthetic */ int $inputIdentifier;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<CalendarDate, Unit> $onDateChanged;
    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
    final /* synthetic */ StateData $stateData;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateInputKt$DateInputTextField$4(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, StateData stateData, CalendarDate calendarDate, Function1<? super CalendarDate, Unit> function1, int i, DateInputValidator dateInputValidator, DateInputFormat dateInputFormat, Locale locale, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$label = function2;
        this.$placeholder = function22;
        this.$stateData = stateData;
        this.$initialDate = calendarDate;
        this.$onDateChanged = function1;
        this.$inputIdentifier = i;
        this.$dateInputValidator = dateInputValidator;
        this.$dateInputFormat = dateInputFormat;
        this.$locale = locale;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        DateInputKt.m1725DateInputTextFieldzm97o8M(this.$modifier, this.$label, this.$placeholder, this.$stateData, this.$initialDate, this.$onDateChanged, this.$inputIdentifier, this.$dateInputValidator, this.$dateInputFormat, this.$locale, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
