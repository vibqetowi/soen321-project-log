package com.redmadrobot.extensions.viewbinding;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewBindingDelegate.kt */
@Metadata(d1 = {"\u0000\r\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002*\u0001\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", "VB", "com/redmadrobot/extensions/viewbinding/ViewBindingDelegate$bindingCleaner$2$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes4.dex */
public final class ViewBindingDelegate$bindingCleaner$2 extends Lambda implements Function0<AnonymousClass1> {
    final /* synthetic */ ViewBindingDelegate<VB> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewBindingDelegate$bindingCleaner$2(ViewBindingDelegate<VB> viewBindingDelegate) {
        super(0);
        this.this$0 = viewBindingDelegate;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.redmadrobot.extensions.viewbinding.ViewBindingDelegate$bindingCleaner$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        final ViewBindingDelegate<VB> viewBindingDelegate = this.this$0;
        return new LifecycleEventObserver() { // from class: com.redmadrobot.extensions.viewbinding.ViewBindingDelegate$bindingCleaner$2.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ((ViewBindingDelegate) viewBindingDelegate).binding = null;
                    source.getLifecycle().removeObserver(this);
                }
            }
        };
    }
}
