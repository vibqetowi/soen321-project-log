package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateInput.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateInputKt$DateInputTextField$1 extends Lambda implements Function1<TextFieldValue, Unit> {
    final /* synthetic */ DateInputFormat $dateInputFormat;
    final /* synthetic */ DateInputValidator $dateInputValidator;
    final /* synthetic */ MutableState<String> $errorText;
    final /* synthetic */ int $inputIdentifier;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ Function1<CalendarDate, Unit> $onDateChanged;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ MutableState<TextFieldValue> $text$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateInputKt$DateInputTextField$1(DateInputFormat dateInputFormat, MutableState<String> mutableState, Function1<? super CalendarDate, Unit> function1, StateData stateData, DateInputValidator dateInputValidator, int i, Locale locale, MutableState<TextFieldValue> mutableState2) {
        super(1);
        this.$dateInputFormat = dateInputFormat;
        this.$errorText = mutableState;
        this.$onDateChanged = function1;
        this.$stateData = stateData;
        this.$dateInputValidator = dateInputValidator;
        this.$inputIdentifier = i;
        this.$locale = locale;
        this.$text$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
        invoke2(textFieldValue);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TextFieldValue input) {
        boolean z;
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getText().length() <= this.$dateInputFormat.getPatternWithoutDelimiters().length()) {
            String text = input.getText();
            int i = 0;
            while (true) {
                if (i >= text.length()) {
                    z = true;
                    break;
                } else if (!Character.isDigit(text.charAt(i))) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                this.$text$delegate.setValue(input);
                String obj = StringsKt.trim((CharSequence) input.getText()).toString();
                if ((obj.length() == 0) || obj.length() < this.$dateInputFormat.getPatternWithoutDelimiters().length()) {
                    this.$errorText.setValue("");
                    this.$onDateChanged.invoke(null);
                    return;
                }
                CalendarDate parse = this.$stateData.getCalendarModel().parse(obj, this.$dateInputFormat.getPatternWithoutDelimiters());
                this.$errorText.setValue(this.$dateInputValidator.m1726validateXivgLIo(parse, this.$inputIdentifier, this.$locale));
                this.$onDateChanged.invoke(this.$errorText.getValue().length() == 0 ? parse : null);
            }
        }
    }
}
