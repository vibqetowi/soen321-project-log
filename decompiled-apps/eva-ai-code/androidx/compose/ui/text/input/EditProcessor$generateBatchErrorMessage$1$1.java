package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProcessor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/input/EditCommand;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EditProcessor$generateBatchErrorMessage$1$1 extends Lambda implements Function1<EditCommand, CharSequence> {
    final /* synthetic */ EditCommand $failedCommand;
    final /* synthetic */ EditProcessor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProcessor$generateBatchErrorMessage$1$1(EditCommand editCommand, EditProcessor editProcessor) {
        super(1);
        this.$failedCommand = editCommand;
        this.this$0 = editProcessor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(EditCommand it) {
        String stringForLog;
        Intrinsics.checkNotNullParameter(it, "it");
        String str = this.$failedCommand == it ? " > " : "   ";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        stringForLog = this.this$0.toStringForLog(it);
        sb.append(stringForLog);
        return sb.toString();
    }
}
