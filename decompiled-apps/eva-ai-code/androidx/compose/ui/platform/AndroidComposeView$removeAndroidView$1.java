package androidx.compose.ui.platform;

import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidComposeView$removeAndroidView$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ AndroidViewHolder $view;
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$removeAndroidView$1(AndroidComposeView androidComposeView, AndroidViewHolder androidViewHolder) {
        super(0);
        this.this$0 = androidComposeView;
        this.$view = androidViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.getAndroidViewsHandler$ui_release().removeViewInLayout(this.$view);
        TypeIntrinsics.asMutableMap(this.this$0.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder()).remove(this.this$0.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(this.$view));
        ViewCompat.setImportantForAccessibility(this.$view, 0);
    }
}
