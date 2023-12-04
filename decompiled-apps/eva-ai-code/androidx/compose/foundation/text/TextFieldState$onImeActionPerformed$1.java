package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "invoke-KlQnJC8", "(I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldState$onImeActionPerformed$1 extends Lambda implements Function1<ImeAction, Unit> {
    final /* synthetic */ TextFieldState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldState$onImeActionPerformed$1(TextFieldState textFieldState) {
        super(1);
        this.this$0 = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
        m1106invokeKlQnJC8(imeAction.m5256unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-KlQnJC8  reason: not valid java name */
    public final void m1106invokeKlQnJC8(int i) {
        KeyboardActionRunner keyboardActionRunner;
        keyboardActionRunner = this.this$0.keyboardActionRunner;
        keyboardActionRunner.m1037runActionKlQnJC8(i);
    }
}
