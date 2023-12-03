package com.google.android.gms.internal.measurement;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.internal.measurement.t5;
import com.google.android.gms.internal.measurement.w5;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public abstract class w5<MessageType extends w5<MessageType, BuilderType>, BuilderType extends t5<MessageType, BuilderType>> extends r4<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected s7 zzc = s7.f;

    public static l6 i(a6 a6Var) {
        int i6;
        l6 l6Var = (l6) a6Var;
        int i10 = l6Var.f8458w;
        if (i10 == 0) {
            i6 = 10;
        } else {
            i6 = i10 + i10;
        }
        if (i6 >= i10) {
            return new l6(Arrays.copyOf(l6Var.f8457v, i6), l6Var.f8458w);
        }
        throw new IllegalArgumentException();
    }

    public static b6 j(b6 b6Var) {
        int i6;
        int size = b6Var.size();
        if (size == 0) {
            i6 = 10;
        } else {
            i6 = size + size;
        }
        return b6Var.k(i6);
    }

    public static Object k(Object obj, Method method, Object... objArr) {
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

    public static void n(Class cls, w5 w5Var) {
        zza.put(cls, w5Var);
        w5Var.l();
    }

    public static w5 s(Class cls) {
        Map map = zza;
        w5 w5Var = (w5) map.get(cls);
        if (w5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                w5Var = (w5) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (w5Var == null) {
            w5Var = (w5) ((w5) y7.i(cls)).t(6);
            if (w5Var != null) {
                map.put(cls, w5Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return w5Var;
    }

    @Override // com.google.android.gms.internal.measurement.v6
    public final /* synthetic */ t5 b() {
        return (t5) t(5);
    }

    @Override // com.google.android.gms.internal.measurement.v6
    public final int c() {
        int i6;
        if (p()) {
            i6 = h(null);
            if (i6 < 0) {
                throw new IllegalStateException(defpackage.c.p("serialized size must be non-negative, was ", i6));
            }
        } else {
            i6 = this.zzd & SubsamplingScaleImageView.TILE_SIZE_AUTO;
            if (i6 == Integer.MAX_VALUE) {
                i6 = h(null);
                if (i6 >= 0) {
                    this.zzd = (this.zzd & LinearLayoutManager.INVALID_OFFSET) | i6;
                } else {
                    throw new IllegalStateException(defpackage.c.p("serialized size must be non-negative, was ", i6));
                }
            }
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final /* synthetic */ w5 d() {
        return (w5) t(6);
    }

    @Override // com.google.android.gms.internal.measurement.r4
    public final int e(g7 g7Var) {
        if (p()) {
            int h10 = h(g7Var);
            if (h10 >= 0) {
                return h10;
            }
            throw new IllegalStateException(defpackage.c.p("serialized size must be non-negative, was ", h10));
        }
        int i6 = this.zzd & SubsamplingScaleImageView.TILE_SIZE_AUTO;
        if (i6 != Integer.MAX_VALUE) {
            return i6;
        }
        int h11 = h(g7Var);
        if (h11 >= 0) {
            this.zzd = (this.zzd & LinearLayoutManager.INVALID_OFFSET) | h11;
            return h11;
        }
        throw new IllegalStateException(defpackage.c.p("serialized size must be non-negative, was ", h11));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return d7.f8338c.a(getClass()).g(this, (w5) obj);
    }

    public final int h(g7 g7Var) {
        if (g7Var == null) {
            return d7.f8338c.a(getClass()).e(this);
        }
        return g7Var.e(this);
    }

    public final int hashCode() {
        if (!p()) {
            int i6 = this.zzb;
            if (i6 == 0) {
                int b10 = d7.f8338c.a(getClass()).b(this);
                this.zzb = b10;
                return b10;
            }
            return i6;
        }
        return d7.f8338c.a(getClass()).b(this);
    }

    public final void l() {
        d7.f8338c.a(getClass()).a(this);
        m();
    }

    public final void m() {
        this.zzd &= SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    public final void o() {
        this.zzd = (this.zzd & LinearLayoutManager.INVALID_OFFSET) | SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    public final boolean p() {
        if ((this.zzd & LinearLayoutManager.INVALID_OFFSET) != 0) {
            return true;
        }
        return false;
    }

    public final t5 q() {
        return (t5) t(5);
    }

    public final t5 r() {
        t5 t5Var = (t5) t(5);
        if (!t5Var.f8612u.equals(this)) {
            if (!t5Var.f8613v.p()) {
                w5 w5Var = (w5) t5Var.f8612u.t(4);
                d7.f8338c.a(w5Var.getClass()).f(w5Var, t5Var.f8613v);
                t5Var.f8613v = w5Var;
            }
            w5 w5Var2 = t5Var.f8613v;
            d7.f8338c.a(w5Var2.getClass()).f(w5Var2, this);
        }
        return t5Var;
    }

    public abstract Object t(int i6);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = x6.f8690a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        x6.c(this, sb2, 0);
        return sb2.toString();
    }
}
