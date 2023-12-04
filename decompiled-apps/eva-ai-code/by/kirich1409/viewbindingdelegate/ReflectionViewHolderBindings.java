package by.kirich1409.viewbindingdelegate;

import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewHolderBindings.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0004*\u00020\u0002H\u0087\b¢\u0006\u0002\b\u0005\u001a5\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0007H\u0007¢\u0006\u0002\b\u0005¨\u0006\b"}, d2 = {"viewBinding", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", "viewBindingViewHolder", "viewBindingClass", "Ljava/lang/Class;", "com.github.kirich1409.ViewBindingPropertyDelegate"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ReflectionViewHolderBindings {
    public static final /* synthetic */ <T extends ViewBinding> ViewBindingProperty<RecyclerView.ViewHolder, T> viewBindingViewHolder(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "<this>");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return viewBindingViewHolder(viewHolder, ViewBinding.class);
    }

    public static final <T extends ViewBinding> ViewBindingProperty<RecyclerView.ViewHolder, T> viewBindingViewHolder(RecyclerView.ViewHolder viewHolder, Class<T> viewBindingClass) {
        Intrinsics.checkNotNullParameter(viewHolder, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        return ViewHolderBindings.viewBinding(viewHolder, new ReflectionViewHolderBindings$viewBinding$1(viewBindingClass, viewHolder));
    }
}
