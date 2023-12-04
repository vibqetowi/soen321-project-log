package by.kirich1409.viewbindingdelegate;

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
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b\t\u001a4\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0087\b¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"dialogViewBinding", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "Landroidx/fragment/app/DialogFragment;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", "viewBindingClass", "Ljava/lang/Class;", "viewBindingRootId", "", "viewBindingDialogFragment", "com.github.kirich1409.ViewBindingPropertyDelegate"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ReflectionDialogFragmentViewBindings {
    @Deprecated(message = "Use viewBinding delegate", replaceWith = @ReplaceWith(expression = "viewBinding(viewBindingRootId)", imports = {"by.kirich1409.viewbindingdelegate.viewBinding"}))
    public static final /* synthetic */ <T extends ViewBinding> ViewBindingProperty<DialogFragment, T> viewBindingDialogFragment(DialogFragment dialogFragment, int i) {
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        Function1 emptyVbCallback = UtilsKt.emptyVbCallback();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return ReflectionFragmentViewBindings.viewBindingFragment(dialogFragment, ViewBinding.class, i, emptyVbCallback);
    }

    @Deprecated(message = "Use viewBinding delegate", replaceWith = @ReplaceWith(expression = "viewBinding(viewBindingClass, viewBindingRootId)", imports = {"by.kirich1409.viewbindingdelegate.viewBinding"}))
    public static final <T extends ViewBinding> ViewBindingProperty<DialogFragment, T> viewBindingDialogFragment(DialogFragment dialogFragment, Class<T> viewBindingClass, int i) {
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        return ReflectionFragmentViewBindings.viewBindingFragment$default(dialogFragment, viewBindingClass, i, (Function1) null, 4, (Object) null);
    }
}
