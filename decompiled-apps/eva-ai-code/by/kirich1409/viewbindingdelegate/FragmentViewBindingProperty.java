package by.kirich1409.viewbindingdelegate;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentViewBindings.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005:\u0001\"B5\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\u0010\fJ\b\u0010\u0012\u001a\u00020\u000bH\u0016J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0016J\"\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00028\u00002\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0097\u0002¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002J\u0015\u0010\u001f\u001a\u00020 2\u0006\u0010\u0015\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010!R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lby/kirich1409/viewbindingdelegate/FragmentViewBindingProperty;", "F", "Landroidx/fragment/app/Fragment;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", "Lby/kirich1409/viewbindingdelegate/LifecycleViewBindingProperty;", "viewNeedInitialization", "", "viewBinder", "Lkotlin/Function1;", "onViewDestroyed", "", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "fragmentLifecycleCallbacks", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "fragmentManager", "Ljava/lang/ref/Reference;", "Landroidx/fragment/app/FragmentManager;", "clear", "getLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "thisRef", "(Landroidx/fragment/app/Fragment;)Landroidx/lifecycle/LifecycleOwner;", "getValue", "property", "Lkotlin/reflect/KProperty;", "(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;", "isViewInitialized", "(Landroidx/fragment/app/Fragment;)Z", "registerFragmentLifecycleCallbacksIfNeeded", "fragment", "viewNotInitializedReadableErrorMessage", "", "(Landroidx/fragment/app/Fragment;)Ljava/lang/String;", "ClearOnDestroy", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class FragmentViewBindingProperty<F extends Fragment, T extends ViewBinding> extends LifecycleViewBindingProperty<F, T> {
    private FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks;
    private Reference<FragmentManager> fragmentManager;
    private final boolean viewNeedInitialization;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty
    public /* bridge */ /* synthetic */ LifecycleOwner getLifecycleOwner(Object obj) {
        return getLifecycleOwner((FragmentViewBindingProperty<F, T>) ((Fragment) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty, kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ ViewBinding getValue(Object obj, KProperty kProperty) {
        return getValue((FragmentViewBindingProperty<F, T>) ((Fragment) obj), (KProperty<?>) kProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty, kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((FragmentViewBindingProperty<F, T>) ((Fragment) obj), (KProperty<?>) kProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty
    public /* bridge */ /* synthetic */ boolean isViewInitialized(Object obj) {
        return isViewInitialized((FragmentViewBindingProperty<F, T>) ((Fragment) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty
    public /* bridge */ /* synthetic */ String viewNotInitializedReadableErrorMessage(Object obj) {
        return viewNotInitializedReadableErrorMessage((FragmentViewBindingProperty<F, T>) ((Fragment) obj));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewBindingProperty(boolean z, Function1<? super F, ? extends T> viewBinder, Function1<? super T, Unit> onViewDestroyed) {
        super(viewBinder, onViewDestroyed);
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        this.viewNeedInitialization = z;
    }

    public T getValue(F thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        T t = (T) super.getValue((FragmentViewBindingProperty<F, T>) thisRef, property);
        registerFragmentLifecycleCallbacksIfNeeded(thisRef);
        return t;
    }

    private final void registerFragmentLifecycleCallbacksIfNeeded(Fragment fragment) {
        if (this.fragmentLifecycleCallbacks != null) {
            return;
        }
        FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
        this.fragmentManager = new WeakReference(parentFragmentManager);
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "fragment.parentFragmentM…akReference(fm)\n        }");
        ClearOnDestroy clearOnDestroy = new ClearOnDestroy(this, fragment);
        parentFragmentManager.registerFragmentLifecycleCallbacks(clearOnDestroy, false);
        Unit unit = Unit.INSTANCE;
        this.fragmentLifecycleCallbacks = clearOnDestroy;
    }

    protected boolean isViewInitialized(F thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        if (this.viewNeedInitialization) {
            if (!thisRef.isAdded() || thisRef.isDetached()) {
                return false;
            }
            if (thisRef instanceof DialogFragment) {
                return super.isViewInitialized((FragmentViewBindingProperty<F, T>) thisRef);
            }
            return thisRef.getView() != null;
        }
        return true;
    }

    protected String viewNotInitializedReadableErrorMessage(F thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        return !thisRef.isAdded() ? "Fragment's view can't be accessed. Fragment isn't added" : thisRef.isDetached() ? "Fragment's view can't be accessed. Fragment is detached" : ((thisRef instanceof DialogFragment) || thisRef.getView() != null) ? super.viewNotInitializedReadableErrorMessage((FragmentViewBindingProperty<F, T>) thisRef) : "Fragment's view can't be accessed. Fragment's view is null. Maybe you try to access view before onViewCreated() or after onDestroyView(). Add check `if (view != null)` before call ViewBinding";
    }

    @Override // by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty, by.kirich1409.viewbindingdelegate.ViewBindingProperty
    public void clear() {
        FragmentManager fragmentManager;
        FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks;
        super.clear();
        Reference<FragmentManager> reference = this.fragmentManager;
        if (reference != null && (fragmentManager = reference.get()) != null && (fragmentLifecycleCallbacks = this.fragmentLifecycleCallbacks) != null) {
            fragmentManager.unregisterFragmentLifecycleCallbacks(fragmentLifecycleCallbacks);
        }
        this.fragmentManager = null;
        this.fragmentLifecycleCallbacks = null;
    }

    protected LifecycleOwner getLifecycleOwner(F thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        try {
            LifecycleOwner viewLifecycleOwner = thisRef.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "thisRef.viewLifecycleOwner");
            return viewLifecycleOwner;
        } catch (IllegalStateException unused) {
            throw new IllegalStateException("Fragment doesn't have view associated with it or the view has been destroyed".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FragmentViewBindings.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lby/kirich1409/viewbindingdelegate/FragmentViewBindingProperty$ClearOnDestroy;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "fragment", "Landroidx/fragment/app/Fragment;", "(Lby/kirich1409/viewbindingdelegate/FragmentViewBindingProperty;Landroidx/fragment/app/Fragment;)V", "Ljava/lang/ref/Reference;", "onFragmentDestroyed", "", "fm", "Landroidx/fragment/app/FragmentManager;", "f", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public final class ClearOnDestroy extends FragmentManager.FragmentLifecycleCallbacks {
        private Reference<Fragment> fragment;
        final /* synthetic */ FragmentViewBindingProperty<F, T> this$0;

        public ClearOnDestroy(FragmentViewBindingProperty this$0, Fragment fragment) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.this$0 = this$0;
            this.fragment = new WeakReference(fragment);
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentDestroyed(FragmentManager fm, Fragment f) {
            Intrinsics.checkNotNullParameter(fm, "fm");
            Intrinsics.checkNotNullParameter(f, "f");
            if (this.fragment.get() == f) {
                this.this$0.postClear$com_github_kirich1409_ViewBindingPropertyDelegate_noreflection();
            }
        }
    }
}
