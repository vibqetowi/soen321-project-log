package by.kirich1409.viewbindingdelegate;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.viewbinding.ViewBinding;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DialogFragmentViewBindings.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001aE\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007H\u0007¢\u0006\u0002\b\b\u001aa\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u00020\u00042\u0014\b\u0004\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00030\u00072\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\n0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\b\b\u001aK\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005*\u00020\u00042\u0014\b\u0004\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00030\u00072\b\b\u0001\u0010\f\u001a\u00020\rH\u0087\bø\u0001\u0000¢\u0006\u0002\b\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"dialogViewBinding", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "F", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/DialogFragment;", "Landroidx/viewbinding/ViewBinding;", "viewBinder", "Lkotlin/Function1;", "viewBindingDialogFragment", "vbFactory", "Landroid/view/View;", "viewProvider", "viewBindingRootId", "", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class DialogFragmentViewBindings {
    @Deprecated(message = "Use viewBinding delegate", replaceWith = @ReplaceWith(expression = "viewBinding(viewBinder)", imports = {"by.kirich1409.viewbindingdelegate.viewBinding"}))
    public static final <F extends DialogFragment, T extends ViewBinding> ViewBindingProperty<F, T> viewBindingDialogFragment(DialogFragment dialogFragment, Function1<? super F, ? extends T> viewBinder) {
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        return FragmentViewBindings.viewBindingFragment(dialogFragment, viewBinder);
    }

    @Deprecated(message = "Use viewBinding delegate", replaceWith = @ReplaceWith(expression = "viewBinding(vbFactory, viewProvider)", imports = {"by.kirich1409.viewbindingdelegate.viewBinding"}))
    public static final <F extends DialogFragment, T extends ViewBinding> ViewBindingProperty<F, T> viewBindingDialogFragment(DialogFragment dialogFragment, Function1<? super View, ? extends T> vbFactory, Function1<? super F, ? extends View> viewProvider) {
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        return FragmentViewBindings.viewBindingFragmentWithCallbacks(dialogFragment, new FragmentViewBindings$viewBinding$5(vbFactory, viewProvider), UtilsKt.emptyVbCallback());
    }

    @Deprecated(message = "Use viewBinding delegate", replaceWith = @ReplaceWith(expression = "viewBinding(vbFactory, viewBindingRootId)", imports = {"by.kirich1409.viewbindingdelegate.viewBinding"}))
    public static final <T extends ViewBinding> ViewBindingProperty<DialogFragment, T> viewBindingDialogFragment(DialogFragment dialogFragment, Function1<? super View, ? extends T> vbFactory, int i) {
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        return FragmentViewBindings.viewBindingFragmentWithCallbacks(dialogFragment, new FragmentViewBindings$viewBinding$$inlined$viewBindingFragmentWithCallbacks$1(vbFactory, i), UtilsKt.emptyVbCallback());
    }
}
