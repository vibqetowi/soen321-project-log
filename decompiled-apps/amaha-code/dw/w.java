package dw;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
/* compiled from: Platform.java */
/* loaded from: classes2.dex */
public class w {

    /* renamed from: c  reason: collision with root package name */
    public static final w f13644c;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13645a;

    /* renamed from: b  reason: collision with root package name */
    public final Constructor<MethodHandles.Lookup> f13646b;

    /* compiled from: Platform.java */
    /* loaded from: classes2.dex */
    public static final class a extends w {

        /* compiled from: Platform.java */
        /* renamed from: dw.w$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class ExecutorC0211a implements Executor {

            /* renamed from: u  reason: collision with root package name */
            public final Handler f13647u = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f13647u.post(runnable);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a() {
            super(r0);
            boolean z10;
            if (Build.VERSION.SDK_INT >= 24) {
                z10 = true;
            } else {
                z10 = false;
            }
        }

        @Override // dw.w
        public final Executor a() {
            return new ExecutorC0211a();
        }

        @Override // dw.w
        public final Object b(Class cls, Object obj, Method method, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.b(cls, obj, method, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        w wVar;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            wVar = new a();
        } else {
            wVar = new w(true);
        }
        f13644c = wVar;
    }

    public w(boolean z10) {
        this.f13645a = z10;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z10) {
            try {
                constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f13646b = constructor;
    }

    public Executor a() {
        return null;
    }

    public Object b(Class cls, Object obj, Method method, Object... objArr) {
        MethodHandles.Lookup lookup;
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor<MethodHandles.Lookup> constructor = this.f13646b;
        if (constructor == null) {
            lookup = MethodHandles.lookup();
        } else {
            lookup = constructor.newInstance(cls, -1);
        }
        unreflectSpecial = lookup.unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }
}
