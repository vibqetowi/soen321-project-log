package androidx.compose.ui.viewinterop;

import android.content.Context;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.node.LayoutNode;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidView.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/node/LayoutNode;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidView_androidKt$createAndroidViewNodeFactory$1 extends Lambda implements Function0<LayoutNode> {
    final /* synthetic */ int $compositeKeyHash;
    final /* synthetic */ Context $context;
    final /* synthetic */ Function1<Context, T> $factory;
    final /* synthetic */ CompositionContext $parentReference;
    final /* synthetic */ SaveableStateRegistry $stateRegistry;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidView_androidKt$createAndroidViewNodeFactory$1(Context context, Function1<? super Context, ? extends T> function1, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i) {
        super(0);
        this.$context = context;
        this.$factory = function1;
        this.$parentReference = compositionContext;
        this.$stateRegistry = saveableStateRegistry;
        this.$compositeKeyHash = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LayoutNode invoke() {
        return new ViewFactoryHolder(this.$context, this.$factory, this.$parentReference, this.$stateRegistry, this.$compositeKeyHash).getLayoutNode();
    }
}
