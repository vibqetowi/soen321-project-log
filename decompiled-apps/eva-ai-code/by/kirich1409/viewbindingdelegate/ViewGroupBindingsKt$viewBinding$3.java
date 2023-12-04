package by.kirich1409.viewbindingdelegate;

import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ViewGroupBindings.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/ViewGroup;", "viewGroup", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ViewGroupBindingsKt$viewBinding$3 extends Lambda implements Function1<ViewGroup, T> {
    final /* synthetic */ Function1<View, T> $vbFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewGroupBindingsKt$viewBinding$3(Function1<? super View, ? extends T> function1) {
        super(1);
        this.$vbFactory = function1;
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroid/view/ViewGroup;)TT; */
    @Override // kotlin.jvm.functions.Function1
    public final ViewBinding invoke(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        return (ViewBinding) this.$vbFactory.invoke(viewGroup);
    }
}
