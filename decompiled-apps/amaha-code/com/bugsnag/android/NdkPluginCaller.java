package com.bugsnag.android;

import com.theinnerhour.b2b.utils.SessionManager;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
/* compiled from: NdkPluginCaller.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J5\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\u0006\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004\"\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010J\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013J\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0013J\u001a\u0010\u0018\u001a\u00020\f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013J\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0002J\u001a\u0010\u001d\u001a\u00020\f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0013R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010 ¨\u0006#"}, d2 = {"Lcom/bugsnag/android/NdkPluginCaller;", "", "", SessionManager.KEY_NAME, "", "Ljava/lang/Class;", "parameterTypes", "Ljava/lang/reflect/Method;", "getMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "Lcom/bugsnag/android/Plugin;", "plugin", "Lhs/k;", "setNdkPlugin", "", "getSignalUnwindStackFunction", "", "enabled", "setInternalMetricsEnabled", "", "", "getCurrentCallbackSetCounts", "getCurrentNativeApiCallUsage", "counts", "initCallbackCounts", "callback", "notifyAddCallback", "notifyRemoveCallback", "data", "setStaticData", "ndkPlugin", "Lcom/bugsnag/android/Plugin;", "Ljava/lang/reflect/Method;", "<init>", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class NdkPluginCaller {
    public static final NdkPluginCaller INSTANCE = new NdkPluginCaller();
    private static Method getCurrentCallbackSetCounts;
    private static Method getCurrentNativeApiCallUsage;
    private static Method getSignalUnwindStackFunction;
    private static Method initCallbackCounts;
    private static Plugin ndkPlugin;
    private static Method notifyAddCallback;
    private static Method notifyRemoveCallback;
    private static Method setInternalMetricsEnabled;
    private static Method setStaticData;

    private NdkPluginCaller() {
    }

    private final Method getMethod(String str, Class<?>... clsArr) {
        Plugin plugin = ndkPlugin;
        if (plugin == null) {
            return null;
        }
        return plugin.getClass().getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
    }

    public final Map<String, Integer> getCurrentCallbackSetCounts() {
        Method method = getCurrentCallbackSetCounts;
        if (method != null) {
            Object invoke = method.invoke(ndkPlugin, new Object[0]);
            if (invoke != null) {
                return (Map) invoke;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
        }
        return null;
    }

    public final Map<String, Boolean> getCurrentNativeApiCallUsage() {
        Method method = getCurrentNativeApiCallUsage;
        if (method != null) {
            Object invoke = method.invoke(ndkPlugin, new Object[0]);
            if (invoke != null) {
                return (Map) invoke;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean>");
        }
        return null;
    }

    public final long getSignalUnwindStackFunction() {
        Method method = getSignalUnwindStackFunction;
        if (method != null) {
            Object invoke = method.invoke(ndkPlugin, new Object[0]);
            if (invoke != null) {
                return ((Long) invoke).longValue();
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Long");
        }
        return 0L;
    }

    public final void initCallbackCounts(Map<String, Integer> counts) {
        i.h(counts, "counts");
        Method method = initCallbackCounts;
        if (method != null) {
            method.invoke(ndkPlugin, counts);
        }
    }

    public final void notifyAddCallback(String callback) {
        i.h(callback, "callback");
        Method method = notifyAddCallback;
        if (method != null) {
            method.invoke(ndkPlugin, callback);
        }
    }

    public final void notifyRemoveCallback(String callback) {
        i.h(callback, "callback");
        Method method = notifyRemoveCallback;
        if (method != null) {
            method.invoke(ndkPlugin, callback);
        }
    }

    public final void setInternalMetricsEnabled(boolean z10) {
        Method method = setInternalMetricsEnabled;
        if (method != null) {
            method.invoke(ndkPlugin, Boolean.valueOf(z10));
        }
    }

    public final void setNdkPlugin(Plugin plugin) {
        if (plugin != null) {
            ndkPlugin = plugin;
            setInternalMetricsEnabled = getMethod("setInternalMetricsEnabled", Boolean.TYPE);
            setStaticData = getMethod("setStaticData", Map.class);
            getSignalUnwindStackFunction = getMethod("getSignalUnwindStackFunction", new Class[0]);
            getCurrentCallbackSetCounts = getMethod("getCurrentCallbackSetCounts", new Class[0]);
            getCurrentNativeApiCallUsage = getMethod("getCurrentNativeApiCallUsage", new Class[0]);
            initCallbackCounts = getMethod("initCallbackCounts", Map.class);
            notifyAddCallback = getMethod("notifyAddCallback", String.class);
            notifyRemoveCallback = getMethod("notifyRemoveCallback", String.class);
        }
    }

    public final void setStaticData(Map<String, ? extends Object> data) {
        i.h(data, "data");
        Method method = setStaticData;
        if (method != null) {
            method.invoke(ndkPlugin, data);
        }
    }
}
