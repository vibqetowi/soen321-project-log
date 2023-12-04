package by.kirich1409.viewbindingdelegate;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import by.kirich1409.viewbindingdelegate.internal.BindViewBinding;
import by.kirich1409.viewbindingdelegate.internal.ViewBindingCache;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ViewHolderBindings.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
final class ReflectionViewHolderBindings$viewBinding$1 extends Lambda implements Function1<RecyclerView.ViewHolder, T> {
    final /* synthetic */ RecyclerView.ViewHolder $this_viewBinding;
    final /* synthetic */ Class<T> $viewBindingClass;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectionViewHolderBindings$viewBinding$1(Class<T> cls, RecyclerView.ViewHolder viewHolder) {
        super(1);
        this.$viewBindingClass = cls;
        this.$this_viewBinding = viewHolder;
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)TT; */
    @Override // kotlin.jvm.functions.Function1
    public final ViewBinding invoke(RecyclerView.ViewHolder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BindViewBinding bind$com_github_kirich1409_ViewBindingPropertyDelegate = ViewBindingCache.INSTANCE.getBind$com_github_kirich1409_ViewBindingPropertyDelegate(this.$viewBindingClass);
        View itemView = this.$this_viewBinding.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        return bind$com_github_kirich1409_ViewBindingPropertyDelegate.bind(itemView);
    }
}
