package by.kirich1409.viewbindingdelegate;

import android.view.LayoutInflater;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import by.kirich1409.viewbindingdelegate.internal.InflateViewBinding;
import by.kirich1409.viewbindingdelegate.internal.ViewBindingCache;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentViewBindings.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ReflectionFragmentViewBindings$viewBinding$4 extends Lambda implements Function1<Fragment, T> {
    final /* synthetic */ Fragment $this_viewBinding;
    final /* synthetic */ Class<T> $viewBindingClass;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectionFragmentViewBindings$viewBinding$4(Class<T> cls, Fragment fragment) {
        super(1);
        this.$viewBindingClass = cls;
        this.$this_viewBinding = fragment;
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroidx/fragment/app/Fragment;)TT; */
    @Override // kotlin.jvm.functions.Function1
    public final ViewBinding invoke(Fragment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InflateViewBinding inflateWithLayoutInflater = ViewBindingCache.INSTANCE.getInflateWithLayoutInflater(this.$viewBindingClass);
        LayoutInflater layoutInflater = ((DialogFragment) this.$this_viewBinding).getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "layoutInflater");
        return inflateWithLayoutInflater.inflate(layoutInflater, null, false);
    }
}
