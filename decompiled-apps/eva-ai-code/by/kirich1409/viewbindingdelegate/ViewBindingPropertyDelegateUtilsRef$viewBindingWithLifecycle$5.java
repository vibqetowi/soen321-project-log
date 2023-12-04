package by.kirich1409.viewbindingdelegate;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewBindingPropertyDelegate.kt */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"by/kirich1409/viewbindingdelegate/ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$5", "Lby/kirich1409/viewbindingdelegate/LifecycleViewBindingProperty;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "thisRef", "(Ljava/lang/Object;)Landroidx/lifecycle/LifecycleOwner;", "com.github.kirich1409.ViewBindingPropertyDelegate"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$5 extends LifecycleViewBindingProperty<R, VB> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Function1<VB, Unit> $onViewDestroyed;
    private final LifecycleOwner lifecycleOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$5(final Lifecycle lifecycle, Function1<? super VB, Unit> function1, ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$6 viewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$6) {
        super(viewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$6, function1);
        this.$lifecycle = lifecycle;
        this.$onViewDestroyed = function1;
        this.lifecycleOwner = new LifecycleOwner() { // from class: by.kirich1409.viewbindingdelegate.ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$5$lifecycleOwner$1
            @Override // androidx.lifecycle.LifecycleOwner
            public final Lifecycle getLifecycle() {
                return Lifecycle.this;
            }
        };
    }

    @Override // by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty
    protected LifecycleOwner getLifecycleOwner(R thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        return this.lifecycleOwner;
    }
}
