package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClickableSemanticsNode$applySemantics$2 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ ClickableSemanticsNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableSemanticsNode$applySemantics$2(ClickableSemanticsNode clickableSemanticsNode) {
        super(0);
        this.this$0 = clickableSemanticsNode;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Function0 function0;
        function0 = this.this$0.onLongClick;
        if (function0 != null) {
            function0.invoke();
        }
        return true;
    }
}
