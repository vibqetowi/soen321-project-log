package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: SwipeToDismiss.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/material/DismissState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwipeToDismissKt$rememberDismissState$2$1 extends Lambda implements Function0<DismissState> {
    final /* synthetic */ Function1<DismissValue, Boolean> $confirmStateChange;
    final /* synthetic */ DismissValue $initialValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissKt$rememberDismissState$2$1(DismissValue dismissValue, Function1<? super DismissValue, Boolean> function1) {
        super(0);
        this.$initialValue = dismissValue;
        this.$confirmStateChange = function1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final DismissState invoke() {
        return new DismissState(this.$initialValue, this.$confirmStateChange);
    }
}
