package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InAppPurchaseUtils.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J#\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\nJE\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u001e\u0010\u000f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0010\"\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u001e\u0010\u000f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0010\"\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0012JE\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0010\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseUtils;", "", "()V", "getClass", "Ljava/lang/Class;", "className", "", "getClassFromContext", "context", "Landroid/content/Context;", "getClassFromContext$facebook_core_release", "getDeclaredMethod", "Ljava/lang/reflect/Method;", "clazz", "methodName", "args", "", "getDeclaredMethod$facebook_core_release", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "getMethod", "invokeMethod", FirebaseAnalytics.Param.METHOD, "obj", "(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppPurchaseUtils {
    public static final InAppPurchaseUtils INSTANCE = new InAppPurchaseUtils();

    private InAppPurchaseUtils() {
    }

    @JvmStatic
    public static final Class<?> getClass(String className) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(className, "className");
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException unused) {
                Class cls = null;
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseUtils.class);
            return null;
        }
    }

    @JvmStatic
    public static final Method getMethod(Class<?> clazz, String methodName, Class<?>... args) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                Method method = null;
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseUtils.class);
            return null;
        }
    }

    @JvmStatic
    public static final Method getDeclaredMethod$facebook_core_release(Class<?> clazz, String methodName, Class<?>... args) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                Method method = null;
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseUtils.class);
            return null;
        }
    }

    @JvmStatic
    public static final Object invokeMethod(Class<?> clazz, Method method, Object obj, Object... args) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(args, args.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseUtils.class);
            return null;
        }
    }

    @JvmStatic
    public static final Class<?> getClassFromContext$facebook_core_release(Context context, String className) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(className, "className");
            try {
                return context.getClassLoader().loadClass(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseUtils.class);
            return null;
        }
    }
}
