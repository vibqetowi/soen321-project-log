package by.kirich1409.viewbindingdelegate;

import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewGroupBindings.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B-\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lby/kirich1409/viewbindingdelegate/ViewGroupViewBindingProperty;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroid/view/ViewGroup;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", "Lby/kirich1409/viewbindingdelegate/LifecycleViewBindingProperty;", "onViewDestroyed", "Lkotlin/Function1;", "", "viewBinder", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "thisRef", "(Landroid/view/ViewGroup;)Landroidx/lifecycle/LifecycleOwner;", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewGroupViewBindingProperty<V extends ViewGroup, T extends ViewBinding> extends LifecycleViewBindingProperty<V, T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty
    public /* bridge */ /* synthetic */ LifecycleOwner getLifecycleOwner(Object obj) {
        return getLifecycleOwner((ViewGroupViewBindingProperty<V, T>) ((ViewGroup) obj));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewGroupViewBindingProperty(Function1<? super T, Unit> onViewDestroyed, Function1<? super V, ? extends T> viewBinder) {
        super(viewBinder, onViewDestroyed);
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
    }

    protected LifecycleOwner getLifecycleOwner(V thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(thisRef);
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        throw new IllegalStateException("Fragment doesn't have view associated with it or the view has been destroyed".toString());
    }
}
