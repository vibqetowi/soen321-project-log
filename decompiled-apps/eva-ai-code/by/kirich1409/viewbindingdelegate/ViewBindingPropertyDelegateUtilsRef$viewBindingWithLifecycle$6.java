package by.kirich1409.viewbindingdelegate;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import by.kirich1409.viewbindingdelegate.internal.ViewBindingCache;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ViewBindingPropertyDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"", "R", "Landroidx/viewbinding/ViewBinding;", "VB", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$6 extends Lambda implements Function1<R, VB> {
    final /* synthetic */ boolean $attachToParent;
    final /* synthetic */ LayoutInflater $layoutInflater;
    final /* synthetic */ ViewGroup $parent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$6(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        super(1);
        this.$layoutInflater = layoutInflater;
        this.$parent = viewGroup;
        this.$attachToParent = z;
    }

    /* JADX WARN: Incorrect return type in method signature: (TR;)TVB; */
    @Override // kotlin.jvm.functions.Function1
    public final ViewBinding invoke(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ViewBindingCache viewBindingCache = ViewBindingCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "VB");
        return viewBindingCache.getInflateWithLayoutInflater(ViewBinding.class).inflate(this.$layoutInflater, this.$parent, this.$attachToParent);
    }
}
