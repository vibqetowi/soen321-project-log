package by.kirich1409.viewbindingdelegate.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewBindingCache.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ+\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0007\"\b\b\u0000\u0010\r*\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u0005H\u0001¢\u0006\u0002\b\u000fJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\r0\t\"\b\b\u0000\u0010\r*\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u0005H\u0001R(\u0010\u0003\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lby/kirich1409/viewbindingdelegate/internal/ViewBindingCache;", "", "()V", "bindCache", "", "Ljava/lang/Class;", "Landroidx/viewbinding/ViewBinding;", "Lby/kirich1409/viewbindingdelegate/internal/BindViewBinding;", "inflateCache", "Lby/kirich1409/viewbindingdelegate/internal/InflateViewBinding;", "clear", "", "getBind", ExifInterface.GPS_DIRECTION_TRUE, "viewBindingClass", "getBind$com_github_kirich1409_ViewBindingPropertyDelegate", "getInflateWithLayoutInflater", "com.github.kirich1409.ViewBindingPropertyDelegate"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewBindingCache {
    public static final ViewBindingCache INSTANCE = new ViewBindingCache();
    private static final Map<Class<? extends ViewBinding>, InflateViewBinding<ViewBinding>> inflateCache = new LinkedHashMap();
    private static final Map<Class<? extends ViewBinding>, BindViewBinding<ViewBinding>> bindCache = new LinkedHashMap();

    private ViewBindingCache() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends ViewBinding> InflateViewBinding<T> getInflateWithLayoutInflater(Class<T> viewBindingClass) {
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        Map<Class<? extends ViewBinding>, InflateViewBinding<ViewBinding>> map = inflateCache;
        Object obj = map.get(viewBindingClass);
        if (obj == null) {
            obj = ViewBindingCacheKt.InflateViewBinding(viewBindingClass);
            map.put(viewBindingClass, obj);
        }
        return (InflateViewBinding) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends ViewBinding> BindViewBinding<T> getBind$com_github_kirich1409_ViewBindingPropertyDelegate(Class<T> viewBindingClass) {
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        Map<Class<? extends ViewBinding>, BindViewBinding<ViewBinding>> map = bindCache;
        Object obj = map.get(viewBindingClass);
        if (obj == null) {
            obj = new BindViewBinding(viewBindingClass);
            map.put(viewBindingClass, obj);
        }
        return (BindViewBinding) obj;
    }

    public final void clear() {
        inflateCache.clear();
        bindCache.clear();
    }
}
