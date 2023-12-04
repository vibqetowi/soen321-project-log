package com.redmadrobot.extensions.viewbinding;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.viewbinding.ViewBinding;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
/* compiled from: ViewBindingDelegate.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ$\u0010\u0012\u001a\u00028\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0096\u0002¢\u0006\u0002\u0010\u0016J\r\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001bR\u0012\u0010\n\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/redmadrobot/extensions/viewbinding/ViewBindingDelegate;", "VB", "Landroidx/viewbinding/ViewBinding;", "Lkotlin/properties/ReadOnlyProperty;", "", "fragment", "Landroidx/fragment/app/Fragment;", "viewBindingClass", "Lkotlin/reflect/KClass;", "(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;)V", "binding", "Landroidx/viewbinding/ViewBinding;", "bindingCleaner", "Landroidx/lifecycle/LifecycleObserver;", "getBindingCleaner", "()Landroidx/lifecycle/LifecycleObserver;", "bindingCleaner$delegate", "Lkotlin/Lazy;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;", "obtainBinding", "()Landroidx/viewbinding/ViewBinding;", "saveBindingIfNeed", "", "(Landroidx/viewbinding/ViewBinding;)V", "redmadrobot.viewbinding-ktx"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class ViewBindingDelegate<VB extends ViewBinding> implements ReadOnlyProperty<Object, VB> {
    private VB binding;
    private final Lazy bindingCleaner$delegate;
    private final Fragment fragment;
    private final KClass<VB> viewBindingClass;

    public ViewBindingDelegate(Fragment fragment, KClass<VB> viewBindingClass) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        this.fragment = fragment;
        this.viewBindingClass = viewBindingClass;
        this.bindingCleaner$delegate = LazyKt.lazy(new ViewBindingDelegate$bindingCleaner$2(this));
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue(obj, (KProperty<?>) kProperty);
    }

    private final LifecycleObserver getBindingCleaner() {
        return (LifecycleObserver) this.bindingCleaner$delegate.getValue();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public VB getValue(Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        VB vb = this.binding;
        return vb == null ? obtainBinding() : vb;
    }

    private final VB obtainBinding() {
        View view = this.fragment.getView();
        if (view == null) {
            throw new IllegalStateException("ViewBinding is only valid between onCreateView and onDestroyView.".toString());
        }
        VB vb = (VB) ViewBindingKt.bind(this.viewBindingClass, view);
        saveBindingIfNeed(vb);
        return vb;
    }

    private final void saveBindingIfNeed(VB vb) {
        Lifecycle lifecycle = this.fragment.getViewLifecycleOwner().getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "fragment.viewLifecycleOwner.lifecycle");
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.INITIALIZED)) {
            this.binding = vb;
            lifecycle.addObserver(getBindingCleaner());
        }
    }
}
