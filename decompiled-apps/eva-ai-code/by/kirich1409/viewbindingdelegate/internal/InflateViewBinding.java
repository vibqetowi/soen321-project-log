package by.kirich1409.viewbindingdelegate.internal;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewBindingCache.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b!\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J'\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lby/kirich1409/viewbindingdelegate/internal/InflateViewBinding;", "VB", "Landroidx/viewbinding/ViewBinding;", "", "inflateViewBinding", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "inflate", "layoutInflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "attachToParent", "", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Landroidx/viewbinding/ViewBinding;", "com.github.kirich1409.ViewBindingPropertyDelegate"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class InflateViewBinding<VB extends ViewBinding> {
    private final Method inflateViewBinding;

    public abstract VB inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z);

    public InflateViewBinding(Method inflateViewBinding) {
        Intrinsics.checkNotNullParameter(inflateViewBinding, "inflateViewBinding");
        this.inflateViewBinding = inflateViewBinding;
    }
}
