package by.kirich1409.viewbindingdelegate;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewBindingPropertyDelegate.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aN\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\t0\u0007\u001aV\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000b\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\t0\u0007\u001aV\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000b\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\t0\u0007¨\u0006\u0010"}, d2 = {"viewBindingLazy", "Lby/kirich1409/viewbindingdelegate/LazyViewBindingProperty;", "R", "VB", "", "Landroidx/viewbinding/ViewBinding;", "viewBinder", "Lkotlin/Function1;", "onViewDestroyed", "", "viewBindingWithLifecycle", "Lby/kirich1409/viewbindingdelegate/LifecycleViewBindingProperty;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewBindingPropertyDelegateUtils {
    public static final <R, VB extends ViewBinding> LazyViewBindingProperty<R, VB> viewBindingLazy(Function1<? super R, ? extends VB> viewBinder, Function1<? super VB, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        return new LazyViewBindingProperty<>(onViewDestroyed, viewBinder);
    }

    public static final <R, VB extends ViewBinding> LifecycleViewBindingProperty<R, VB> viewBindingWithLifecycle(final LifecycleOwner lifecycleOwner, final Function1<? super R, ? extends VB> viewBinder, final Function1<? super VB, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        return (LifecycleViewBindingProperty) new LifecycleViewBindingProperty<R, VB>(viewBinder, onViewDestroyed) { // from class: by.kirich1409.viewbindingdelegate.ViewBindingPropertyDelegateUtils$viewBindingWithLifecycle$1
            final /* synthetic */ Function1<VB, Unit> $onViewDestroyed;
            final /* synthetic */ Function1<R, VB> $viewBinder;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(viewBinder, onViewDestroyed);
                this.$viewBinder = viewBinder;
                this.$onViewDestroyed = onViewDestroyed;
            }

            @Override // by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty
            protected LifecycleOwner getLifecycleOwner(R thisRef) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                return LifecycleOwner.this;
            }
        };
    }

    public static final <R, VB extends ViewBinding> LifecycleViewBindingProperty<R, VB> viewBindingWithLifecycle(Lifecycle lifecycle, Function1<? super R, ? extends VB> viewBinder, Function1<? super VB, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        return new ViewBindingPropertyDelegateUtils$viewBindingWithLifecycle$2(lifecycle, viewBinder, onViewDestroyed);
    }
}
