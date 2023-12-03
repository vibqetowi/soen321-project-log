package o5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
/* compiled from: InAppPurchaseUtils.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f27172a = 0;

    static {
        new j();
    }

    public static final Class<?> a(String str) {
        if (b6.a.b(j.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            b6.a.a(j.class, th2);
            return null;
        }
    }

    public static final Method b(Class<?> cls, String str, Class<?>... args) {
        if (b6.a.b(j.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.i.g(args, "args");
            try {
                return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            b6.a.a(j.class, th2);
            return null;
        }
    }

    public static final Method c(Class<?> clazz, String str, Class<?>... clsArr) {
        if (b6.a.b(j.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.i.g(clazz, "clazz");
            try {
                return clazz.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            b6.a.a(j.class, th2);
            return null;
        }
    }

    public static final Object d(Class clazz, Object obj, Method method, Object... args) {
        if (b6.a.b(j.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.i.g(clazz, "clazz");
            kotlin.jvm.internal.i.g(method, "method");
            kotlin.jvm.internal.i.g(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(args, args.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th2) {
            b6.a.a(j.class, th2);
            return null;
        }
    }
}
