package by.kirich1409.viewbindingdelegate.internal;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewBindingCache.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lby/kirich1409/viewbindingdelegate/internal/BindViewBinding;", "VB", "Landroidx/viewbinding/ViewBinding;", "", "viewBindingClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "bindViewBinding", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "bind", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "(Landroid/view/View;)Landroidx/viewbinding/ViewBinding;", "com.github.kirich1409.ViewBindingPropertyDelegate"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class BindViewBinding<VB extends ViewBinding> {
    private final Method bindViewBinding;

    public BindViewBinding(Class<VB> viewBindingClass) {
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        this.bindViewBinding = viewBindingClass.getMethod("bind", View.class);
    }

    public final VB bind(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object invoke = this.bindViewBinding.invoke(null, view);
        if (invoke != null) {
            return (VB) invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type VB of by.kirich1409.viewbindingdelegate.internal.BindViewBinding");
    }
}
