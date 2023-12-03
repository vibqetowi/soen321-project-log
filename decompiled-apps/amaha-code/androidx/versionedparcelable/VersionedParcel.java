package androidx.versionedparcelable;

import android.os.Parcelable;
import j2.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import t.b;
/* loaded from: classes.dex */
public abstract class VersionedParcel {

    /* renamed from: a  reason: collision with root package name */
    public final b<String, Method> f3084a;

    /* renamed from: b  reason: collision with root package name */
    public final b<String, Method> f3085b;

    /* renamed from: c  reason: collision with root package name */
    public final b<String, Class> f3086c;

    /* loaded from: classes.dex */
    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(b<String, Method> bVar, b<String, Method> bVar2, b<String, Class> bVar3) {
        this.f3084a = bVar;
        this.f3085b = bVar2;
        this.f3086c = bVar3;
    }

    public abstract j2.b a();

    public final Class b(Class<? extends c> cls) {
        String name = cls.getName();
        b<String, Class> bVar = this.f3086c;
        Class orDefault = bVar.getOrDefault(name, null);
        if (orDefault == null) {
            Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            bVar.put(cls.getName(), cls2);
            return cls2;
        }
        return orDefault;
    }

    public final Method c(String str) {
        b<String, Method> bVar = this.f3084a;
        Method orDefault = bVar.getOrDefault(str, null);
        if (orDefault == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
            bVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        b<String, Method> bVar = this.f3085b;
        Method orDefault = bVar.getOrDefault(name, null);
        if (orDefault == null) {
            Class b10 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b10.getDeclaredMethod("write", cls, VersionedParcel.class);
            bVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract CharSequence g();

    public abstract boolean h(int i6);

    public abstract int i();

    public final int j(int i6, int i10) {
        if (!h(i10)) {
            return i6;
        }
        return i();
    }

    public abstract <T extends Parcelable> T k();

    public final <T extends Parcelable> T l(T t3, int i6) {
        if (!h(i6)) {
            return t3;
        }
        return (T) k();
    }

    public abstract String m();

    public final <T extends c> T n() {
        String m10 = m();
        if (m10 == null) {
            return null;
        }
        try {
            return (T) c(m10).invoke(null, a());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public abstract void o(int i6);

    public abstract void p(boolean z10);

    public abstract void q(byte[] bArr);

    public abstract void r(CharSequence charSequence);

    public abstract void s(int i6);

    public final void t(int i6, int i10) {
        o(i10);
        s(i6);
    }

    public abstract void u(Parcelable parcelable);

    public abstract void v(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(c cVar) {
        if (cVar == null) {
            v(null);
            return;
        }
        try {
            v(b(cVar.getClass()).getName());
            j2.b a10 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a10);
                a10.x();
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (e13.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e13.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e14);
        }
    }
}
