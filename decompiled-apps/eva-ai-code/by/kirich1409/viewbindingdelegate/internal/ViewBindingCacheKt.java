package by.kirich1409.viewbindingdelegate.internal;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewBindingCache.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0001¨\u0006\u0006"}, d2 = {"InflateViewBinding", "Lby/kirich1409/viewbindingdelegate/internal/InflateViewBinding;", "VB", "Landroidx/viewbinding/ViewBinding;", "viewBindingClass", "Ljava/lang/Class;", "com.github.kirich1409.ViewBindingPropertyDelegate"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewBindingCacheKt {
    public static final <VB extends ViewBinding> InflateViewBinding<VB> InflateViewBinding(Class<VB> viewBindingClass) {
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        try {
            Method method = viewBindingClass.getMethod("inflate", LayoutInflater.class, ViewGroup.class, Boolean.TYPE);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new FullInflateViewBinding(method);
        } catch (NoSuchMethodException unused) {
            Method method2 = viewBindingClass.getMethod("inflate", LayoutInflater.class, ViewGroup.class);
            Intrinsics.checkNotNullExpressionValue(method2, "method");
            return new MergeInflateViewBinding(method2);
        }
    }
}
