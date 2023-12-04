package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BasicTextField.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newTextFieldValueState", "Landroidx/compose/ui/text/input/TextFieldValue;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextFieldKt$BasicTextField$4$1 extends Lambda implements Function1<TextFieldValue, Unit> {
    final /* synthetic */ MutableState<String> $lastTextValue$delegate;
    final /* synthetic */ Function1<String, Unit> $onValueChange;
    final /* synthetic */ MutableState<TextFieldValue> $textFieldValueState$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BasicTextFieldKt$BasicTextField$4$1(Function1<? super String, Unit> function1, MutableState<TextFieldValue> mutableState, MutableState<String> mutableState2) {
        super(1);
        this.$onValueChange = function1;
        this.$textFieldValueState$delegate = mutableState;
        this.$lastTextValue$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
        invoke2(textFieldValue);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TextFieldValue newTextFieldValueState) {
        String BasicTextField$lambda$6;
        Intrinsics.checkNotNullParameter(newTextFieldValueState, "newTextFieldValueState");
        this.$textFieldValueState$delegate.setValue(newTextFieldValueState);
        BasicTextField$lambda$6 = BasicTextFieldKt.BasicTextField$lambda$6(this.$lastTextValue$delegate);
        boolean z = !Intrinsics.areEqual(BasicTextField$lambda$6, newTextFieldValueState.getText());
        this.$lastTextValue$delegate.setValue(newTextFieldValueState.getText());
        if (z) {
            this.$onValueChange.invoke(newTextFieldValueState.getText());
        }
    }
}
