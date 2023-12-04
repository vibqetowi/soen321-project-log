package by.kirich1409.viewbindingdelegate;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewBindingPropertyDelegate.kt */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"by/kirich1409/viewbindingdelegate/ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$2", "Lby/kirich1409/viewbindingdelegate/LifecycleViewBindingProperty;", "getLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "thisRef", "(Ljava/lang/Object;)Landroidx/lifecycle/LifecycleOwner;", "com.github.kirich1409.ViewBindingPropertyDelegate"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$2 extends LifecycleViewBindingProperty<R, VB> {
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ Function1<VB, Unit> $onViewDestroyed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$2(LifecycleOwner lifecycleOwner, Function1<? super VB, Unit> function1, ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$3 viewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$3) {
        super(viewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$3, function1);
        this.$lifecycleOwner = lifecycleOwner;
        this.$onViewDestroyed = function1;
    }

    @Override // by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty
    protected LifecycleOwner getLifecycleOwner(R thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        return this.$lifecycleOwner;
    }
}
