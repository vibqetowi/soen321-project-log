package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class CombinedClickablePointerInputNode$pointerInput$2 extends Lambda implements Function1<Offset, Unit> {
    final /* synthetic */ CombinedClickablePointerInputNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickablePointerInputNode$pointerInput$2(CombinedClickablePointerInputNode combinedClickablePointerInputNode) {
        super(1);
        this.this$0 = combinedClickablePointerInputNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
        m472invokek4lQ0M(offset.m3028unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
    public final void m472invokek4lQ0M(long j) {
        Function0 function0;
        function0 = this.this$0.onDoubleClick;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
