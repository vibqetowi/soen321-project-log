package by.kirich1409.viewbindingdelegate;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import by.kirich1409.viewbindingdelegate.internal.InflateViewBinding;
import by.kirich1409.viewbindingdelegate.internal.ViewBindingCache;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ViewGroupBindings.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¨\u0006\u0004"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/ViewGroup;", "viewGroup", "by/kirich1409/viewbindingdelegate/ViewGroupBindingsKt$viewBinding$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ReflectionViewGroupBindings$viewBinding$$inlined$viewBinding$3 extends Lambda implements Function1<ViewGroup, T> {
    final /* synthetic */ boolean $attachToRoot$inlined;
    final /* synthetic */ ViewGroup $this_viewBinding$inlined;
    final /* synthetic */ Class $viewBindingClass$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectionViewGroupBindings$viewBinding$$inlined$viewBinding$3(Class cls, ViewGroup viewGroup, boolean z) {
        super(1);
        this.$viewBindingClass$inlined = cls;
        this.$this_viewBinding$inlined = viewGroup;
        this.$attachToRoot$inlined = z;
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroid/view/ViewGroup;)TT; */
    @Override // kotlin.jvm.functions.Function1
    public final ViewBinding invoke(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        InflateViewBinding inflateWithLayoutInflater = ViewBindingCache.INSTANCE.getInflateWithLayoutInflater(this.$viewBindingClass$inlined);
        LayoutInflater from = LayoutInflater.from(this.$this_viewBinding$inlined.getContext());
        Intrinsics.checkNotNullExpressionValue(from, "from(context)");
        return inflateWithLayoutInflater.inflate(from, viewGroup, this.$attachToRoot$inlined);
    }
}
