package by.kirich1409.viewbindingdelegate;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ViewHolderBindings.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "viewHolder", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ViewHolderBindings$viewBinding$3 extends Lambda implements Function1<VH, T> {
    final /* synthetic */ Function1<View, T> $vbFactory;
    final /* synthetic */ int $viewBindingRootId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewHolderBindings$viewBinding$3(Function1<? super View, ? extends T> function1, int i) {
        super(1);
        this.$vbFactory = function1;
        this.$viewBindingRootId = i;
    }

    /* JADX WARN: Incorrect return type in method signature: (TVH;)TT; */
    @Override // kotlin.jvm.functions.Function1
    public final ViewBinding invoke(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Function1<View, T> function1 = this.$vbFactory;
        View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "viewHolder.itemView");
        View requireViewById = ViewCompat.requireViewById(view, this.$viewBindingRootId);
        Intrinsics.checkNotNullExpressionValue(requireViewById, "requireViewById(this, id)");
        return (ViewBinding) function1.invoke(requireViewById);
    }
}
