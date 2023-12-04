package by.kirich1409.viewbindingdelegate;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentViewBindings.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B5\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\u0010\fJ\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lby/kirich1409/viewbindingdelegate/DialogFragmentViewBindingProperty;", "F", "Landroidx/fragment/app/DialogFragment;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", "Lby/kirich1409/viewbindingdelegate/LifecycleViewBindingProperty;", "viewNeedInitialization", "", "viewBinder", "Lkotlin/Function1;", "onViewDestroyed", "", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "thisRef", "(Landroidx/fragment/app/DialogFragment;)Landroidx/lifecycle/LifecycleOwner;", "isViewInitialized", "(Landroidx/fragment/app/DialogFragment;)Z", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class DialogFragmentViewBindingProperty<F extends DialogFragment, T extends ViewBinding> extends LifecycleViewBindingProperty<F, T> {
    private final boolean viewNeedInitialization;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty
    public /* bridge */ /* synthetic */ LifecycleOwner getLifecycleOwner(Object obj) {
        return getLifecycleOwner((DialogFragmentViewBindingProperty<F, T>) ((DialogFragment) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty
    public /* bridge */ /* synthetic */ boolean isViewInitialized(Object obj) {
        return isViewInitialized((DialogFragmentViewBindingProperty<F, T>) ((DialogFragment) obj));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogFragmentViewBindingProperty(boolean z, Function1<? super F, ? extends T> viewBinder, Function1<? super T, Unit> onViewDestroyed) {
        super(viewBinder, onViewDestroyed);
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        this.viewNeedInitialization = z;
    }

    protected LifecycleOwner getLifecycleOwner(F thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        if (thisRef.getView() == null) {
            return thisRef;
        }
        try {
            LifecycleOwner viewLifecycleOwner = thisRef.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "{\n            try {\n    …)\n            }\n        }");
            return viewLifecycleOwner;
        } catch (IllegalStateException unused) {
            throw new IllegalStateException("Fragment doesn't have view associated with it or the view has been destroyed".toString());
        }
    }

    protected boolean isViewInitialized(F thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        if (this.viewNeedInitialization) {
            return thisRef.getShowsDialog() ? thisRef.getDialog() != null : thisRef.getView() != null;
        }
        return true;
    }
}
