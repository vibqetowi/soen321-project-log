package by.kirich1409.viewbindingdelegate;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewHolderBindings.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u0002H\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007¢\u0006\u0002\u0010\b\u001aa\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u0002H\u00022\u0014\b\u0004\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00030\u00072\u0014\b\u0006\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\n0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\f\u001aU\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u0002H\u00022\u0014\b\u0004\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00030\u00072\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"viewBinding", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "VH", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/viewbinding/ViewBinding;", "viewBinder", "Lkotlin/Function1;", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lkotlin/jvm/functions/Function1;)Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "vbFactory", "Landroid/view/View;", "viewProvider", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "viewBindingRootId", "", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lkotlin/jvm/functions/Function1;I)Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewHolderBindings {
    public static final <VH extends RecyclerView.ViewHolder, T extends ViewBinding> ViewBindingProperty<VH, T> viewBinding(VH vh, Function1<? super VH, ? extends T> viewBinder) {
        Intrinsics.checkNotNullParameter(vh, "<this>");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        return new LazyViewBindingProperty(viewBinder);
    }

    public static /* synthetic */ ViewBindingProperty viewBinding$default(RecyclerView.ViewHolder viewHolder, Function1 vbFactory, Function1 viewProvider, int i, Object obj) {
        if ((i & 2) != 0) {
            viewProvider = ViewHolderBindings$viewBinding$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(viewHolder, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        return new LazyViewBindingProperty(new ViewHolderBindings$viewBinding$2(viewProvider, vbFactory));
    }

    public static final <VH extends RecyclerView.ViewHolder, T extends ViewBinding> ViewBindingProperty<VH, T> viewBinding(VH vh, Function1<? super View, ? extends T> vbFactory, Function1<? super VH, ? extends View> viewProvider) {
        Intrinsics.checkNotNullParameter(vh, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        return new LazyViewBindingProperty(new ViewHolderBindings$viewBinding$2(viewProvider, vbFactory));
    }

    public static final <VH extends RecyclerView.ViewHolder, T extends ViewBinding> ViewBindingProperty<VH, T> viewBinding(VH vh, Function1<? super View, ? extends T> vbFactory, int i) {
        Intrinsics.checkNotNullParameter(vh, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        return new LazyViewBindingProperty(new ViewHolderBindings$viewBinding$3(vbFactory, i));
    }
}
