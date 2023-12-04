package by.kirich1409.viewbindingdelegate;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewBindingPropertyDelegate.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aX\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0014\b\n\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\r0\fH\u0086\bø\u0001\u0000\u001aj\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u00030\u000f\"\b\b\u0000\u0010\u0010*\u00020\u0011\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0014\b\n\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\r0\fH\u0086\bø\u0001\u0000\u001aj\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u00030\u000f\"\b\b\u0000\u0010\u0010*\u00020\u0011\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0014\b\n\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\r0\fH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"viewBindingLazy", "Lby/kirich1409/viewbindingdelegate/LazyViewBindingProperty;", "Lby/kirich1409/viewbindingdelegate/R;", "VB", "Landroidx/viewbinding/ViewBinding;", "layoutInflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "attachToParent", "", "onViewDestroyed", "Lkotlin/Function1;", "", "viewBindingWithLifecycle", "Lby/kirich1409/viewbindingdelegate/LifecycleViewBindingProperty;", "R", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "com.github.kirich1409.ViewBindingPropertyDelegate"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewBindingPropertyDelegateUtilsRef {
    public static /* synthetic */ LazyViewBindingProperty viewBindingLazy$default(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Function1 onViewDestroyed, int i, Object obj) {
        if ((i & 2) != 0) {
            viewGroup = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            onViewDestroyed = ViewBindingPropertyDelegateUtilsRef$viewBindingLazy$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.needClassReification();
        return new LazyViewBindingProperty(onViewDestroyed, new ViewBindingPropertyDelegateUtilsRef$viewBindingLazy$2(layoutInflater, viewGroup, z));
    }

    public static final /* synthetic */ <VB extends ViewBinding> LazyViewBindingProperty<R, VB> viewBindingLazy(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Function1<? super VB, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.needClassReification();
        return new LazyViewBindingProperty<>(onViewDestroyed, new ViewBindingPropertyDelegateUtilsRef$viewBindingLazy$2(layoutInflater, viewGroup, z));
    }

    public static /* synthetic */ LifecycleViewBindingProperty viewBindingWithLifecycle$default(LifecycleOwner lifecycleOwner, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Function1 onViewDestroyed, int i, Object obj) {
        if ((i & 4) != 0) {
            viewGroup = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            onViewDestroyed = ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.needClassReification();
        ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$3 viewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$3 = new ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$3(layoutInflater, viewGroup, z);
        Intrinsics.needClassReification();
        return new ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$2(lifecycleOwner, onViewDestroyed, viewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$3);
    }

    public static final /* synthetic */ <R, VB extends ViewBinding> LifecycleViewBindingProperty<R, VB> viewBindingWithLifecycle(LifecycleOwner lifecycleOwner, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Function1<? super VB, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.needClassReification();
        ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$3 viewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$3 = new ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$3(layoutInflater, viewGroup, z);
        Intrinsics.needClassReification();
        return new ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$2(lifecycleOwner, onViewDestroyed, viewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$3);
    }

    public static /* synthetic */ LifecycleViewBindingProperty viewBindingWithLifecycle$default(Lifecycle lifecycle, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Function1 onViewDestroyed, int i, Object obj) {
        if ((i & 4) != 0) {
            viewGroup = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            onViewDestroyed = ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$4.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.needClassReification();
        ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$6 viewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$6 = new ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$6(layoutInflater, viewGroup, z);
        Intrinsics.needClassReification();
        return new ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$5(lifecycle, onViewDestroyed, viewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$6);
    }

    public static final /* synthetic */ <R, VB extends ViewBinding> LifecycleViewBindingProperty<R, VB> viewBindingWithLifecycle(Lifecycle lifecycle, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Function1<? super VB, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.needClassReification();
        ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$6 viewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$6 = new ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$6(layoutInflater, viewGroup, z);
        Intrinsics.needClassReification();
        return new ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$5(lifecycle, onViewDestroyed, viewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$6);
    }
}
