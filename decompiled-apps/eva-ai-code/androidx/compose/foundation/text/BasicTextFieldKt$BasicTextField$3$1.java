package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BasicTextField.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextFieldKt$BasicTextField$3$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ TextFieldValue $textFieldValue;
    final /* synthetic */ MutableState<TextFieldValue> $textFieldValueState$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$3$1(TextFieldValue textFieldValue, MutableState<TextFieldValue> mutableState) {
        super(0);
        this.$textFieldValue = textFieldValue;
        this.$textFieldValueState$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TextFieldValue BasicTextField$lambda$2;
        TextFieldValue BasicTextField$lambda$22;
        long m5325getSelectiond9O1mEE = this.$textFieldValue.m5325getSelectiond9O1mEE();
        BasicTextField$lambda$2 = BasicTextFieldKt.BasicTextField$lambda$2(this.$textFieldValueState$delegate);
        if (TextRange.m5075equalsimpl0(m5325getSelectiond9O1mEE, BasicTextField$lambda$2.m5325getSelectiond9O1mEE())) {
            TextRange m5324getCompositionMzsxiRA = this.$textFieldValue.m5324getCompositionMzsxiRA();
            BasicTextField$lambda$22 = BasicTextFieldKt.BasicTextField$lambda$2(this.$textFieldValueState$delegate);
            if (Intrinsics.areEqual(m5324getCompositionMzsxiRA, BasicTextField$lambda$22.m5324getCompositionMzsxiRA())) {
                return;
            }
        }
        this.$textFieldValueState$delegate.setValue(this.$textFieldValue);
    }
}
