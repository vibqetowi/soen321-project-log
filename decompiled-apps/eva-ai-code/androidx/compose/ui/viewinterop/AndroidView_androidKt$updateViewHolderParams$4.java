package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidView.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "Landroidx/compose/ui/node/LayoutNode;", "it", "Landroidx/savedstate/SavedStateRegistryOwner;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidView_androidKt$updateViewHolderParams$4 extends Lambda implements Function2<LayoutNode, SavedStateRegistryOwner, Unit> {
    public static final AndroidView_androidKt$updateViewHolderParams$4 INSTANCE = new AndroidView_androidKt$updateViewHolderParams$4();

    AndroidView_androidKt$updateViewHolderParams$4() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, SavedStateRegistryOwner savedStateRegistryOwner) {
        invoke2(layoutNode, savedStateRegistryOwner);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutNode set, SavedStateRegistryOwner it) {
        ViewFactoryHolder requireViewFactoryHolder;
        Intrinsics.checkNotNullParameter(set, "$this$set");
        Intrinsics.checkNotNullParameter(it, "it");
        requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(set);
        requireViewFactoryHolder.setSavedStateRegistryOwner(it);
    }
}
