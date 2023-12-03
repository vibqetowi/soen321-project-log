package vr;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: ReflectionLongAdderCounter.java */
/* loaded from: classes2.dex */
public final class t2 implements p1 {

    /* renamed from: v  reason: collision with root package name */
    public static final Logger f35963v = Logger.getLogger(t2.class.getName());

    /* renamed from: w  reason: collision with root package name */
    public static final Constructor<?> f35964w;

    /* renamed from: x  reason: collision with root package name */
    public static final Method f35965x;

    /* renamed from: y  reason: collision with root package name */
    public static final RuntimeException f35966y;

    /* renamed from: z  reason: collision with root package name */
    public static final Object[] f35967z;

    /* renamed from: u  reason: collision with root package name */
    public final Object f35968u;

    static {
        Method method;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                cls.getMethod("sum", new Class[0]);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i6 = 0;
                while (true) {
                    if (i6 < length) {
                        constructor = constructors[i6];
                        if (constructor.getParameterTypes().length == 0) {
                            break;
                        }
                        i6++;
                    } else {
                        constructor = null;
                        break;
                    }
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
                f35963v.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
                if (th != null) {
                }
                f35964w = null;
                f35965x = null;
                f35966y = new RuntimeException(th);
                f35967z = new Object[]{1L};
            }
        } catch (Throwable th3) {
            th = th3;
            method = null;
        }
        if (th != null && constructor != null) {
            f35964w = constructor;
            f35965x = method;
            f35966y = null;
        } else {
            f35964w = null;
            f35965x = null;
            f35966y = new RuntimeException(th);
        }
        f35967z = new Object[]{1L};
    }

    public t2() {
        RuntimeException runtimeException = f35966y;
        if (runtimeException == null) {
            try {
                this.f35968u = f35964w.newInstance(new Object[0]);
                return;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException(e12);
            }
        }
        throw runtimeException;
    }

    @Override // vr.p1
    public final void add(long j10) {
        try {
            f35965x.invoke(this.f35968u, f35967z);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
