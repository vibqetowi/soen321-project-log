package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.a3;
import com.google.android.gms.internal.cast.c3;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public abstract class c3<MessageType extends c3<MessageType, BuilderType>, BuilderType extends a3<MessageType, BuilderType>> extends g2<MessageType, BuilderType> {
    private static final Map<Object, c3<?, ?>> zzb = new ConcurrentHashMap();
    protected z4 zzc = z4.f7691d;
    protected int zzd = -1;

    public static <T extends c3> T e(Class<T> cls) {
        Map<Object, c3<?, ?>> map = zzb;
        c3<?, ?> c3Var = map.get(cls);
        if (c3Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                c3Var = map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (c3Var == null) {
            c3Var = (c3) ((c3) i5.e(cls)).c(null, 6);
            if (c3Var != null) {
                map.put(cls, c3Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return c3Var;
    }

    public static <T extends c3> void f(Class<T> cls, T t3) {
        zzb.put(cls, t3);
    }

    public static Object g(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    @Override // com.google.android.gms.internal.cast.g2
    public final int a() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.cast.g2
    public final void b(int i6) {
        this.zzd = i6;
    }

    public abstract Object c(c3 c3Var, int i6);

    public final <MessageType extends c3<MessageType, BuilderType>, BuilderType extends a3<MessageType, BuilderType>> BuilderType d() {
        return (BuilderType) c(null, 5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return l4.f7583c.a(getClass()).g(this, (c3) obj);
    }

    public final int hashCode() {
        int i6 = this.zza;
        if (i6 != 0) {
            return i6;
        }
        int b10 = l4.f7583c.a(getClass()).b(this);
        this.zza = b10;
        return b10;
    }

    @Override // com.google.android.gms.internal.cast.d4
    public final /* bridge */ /* synthetic */ c3 j() {
        return (c3) c(null, 6);
    }

    @Override // com.google.android.gms.internal.cast.c4
    public final int m() {
        int i6 = this.zzd;
        if (i6 == -1) {
            int d10 = l4.f7583c.a(getClass()).d(this);
            this.zzd = d10;
            return d10;
        }
        return i6;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        f4.b(this, sb2, 0);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.cast.c4
    public final /* bridge */ /* synthetic */ a3 u() {
        a3 a3Var = (a3) c(null, 5);
        a3Var.e(this);
        return a3Var;
    }
}
