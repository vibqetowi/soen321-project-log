package coil.compose;

import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: Composables.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AsyncImageKt$Content$$inlined$Layout$1 extends Lambda implements Function0<ComposeUiNode> {
    final /* synthetic */ Function0 $factory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImageKt$Content$$inlined$Layout$1(Function0 function0) {
        super(0);
        this.$factory = function0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ComposeUiNode invoke() {
        return this.$factory.invoke();
    }
}
