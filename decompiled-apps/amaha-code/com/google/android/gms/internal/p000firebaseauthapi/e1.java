package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.internal.p000firebaseauthapi.b1;
import com.google.android.gms.internal.p000firebaseauthapi.e1;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e1  reason: invalid package */
/* loaded from: classes.dex */
public abstract class e1<MessageType extends e1<MessageType, BuilderType>, BuilderType extends b1<MessageType, BuilderType>> extends w<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected y2 zzc = y2.f;

    public static Object c(Object obj, Method method, Object... objArr) {
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

    public static void f(Class cls, e1 e1Var) {
        zzb.put(cls, e1Var);
        e1Var.d();
    }

    public static e1 r(Class cls) {
        Map map = zzb;
        e1 e1Var = (e1) map.get(cls);
        if (e1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                e1Var = (e1) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (e1Var == null) {
            e1Var = (e1) ((e1) f3.i(cls)).m(6);
            if (e1Var != null) {
                map.put(cls, e1Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return e1Var;
    }

    public static e1 t(e1 e1Var, h0 h0Var, r0 r0Var) {
        i0 s10 = h0Var.s();
        e1 s11 = e1Var.s();
        try {
            m2 a10 = j2.f7908c.a(s11.getClass());
            k0 k0Var = s10.f7901b;
            if (k0Var == null) {
                k0Var = new k0(s10);
            }
            a10.h(s11, k0Var, r0Var);
            a10.a(s11);
            try {
                if (s10.f7884g == 0) {
                    if (s11.i()) {
                        return s11;
                    }
                    throw new zzadn(new zzafm().getMessage());
                }
                throw new zzadn("Protocol message end-group tag did not match expected tag.");
            } catch (zzadn e10) {
                throw e10;
            }
        } catch (zzadn e11) {
            throw e11;
        } catch (zzafm e12) {
            throw new zzadn(e12.getMessage());
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzadn) {
                throw ((zzadn) e13.getCause());
            }
            throw new zzadn(e13);
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof zzadn) {
                throw ((zzadn) e14.getCause());
            }
            throw e14;
        }
    }

    public static e1 u(e1 e1Var, byte[] bArr, r0 r0Var) {
        int length = bArr.length;
        e1 s10 = e1Var.s();
        try {
            m2 a10 = j2.f7908c.a(s10.getClass());
            a10.i(s10, bArr, 0, length, new z(r0Var));
            a10.a(s10);
            if (s10.i()) {
                return s10;
            }
            throw new zzadn(new zzafm().getMessage());
        } catch (zzadn e10) {
            throw e10;
        } catch (zzafm e11) {
            throw new zzadn(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzadn) {
                throw ((zzadn) e12.getCause());
            }
            throw new zzadn(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw zzadn.e();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.c2
    public final /* synthetic */ e1 a() {
        return (e1) m(6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w
    public final int b(m2 m2Var) {
        if (k()) {
            int l2 = l(m2Var);
            if (l2 >= 0) {
                return l2;
            }
            throw new IllegalStateException(c.p("serialized size must be non-negative, was ", l2));
        }
        int i6 = this.zzd & SubsamplingScaleImageView.TILE_SIZE_AUTO;
        if (i6 != Integer.MAX_VALUE) {
            return i6;
        }
        int l10 = l(m2Var);
        if (l10 >= 0) {
            this.zzd = (this.zzd & LinearLayoutManager.INVALID_OFFSET) | l10;
            return l10;
        }
        throw new IllegalStateException(c.p("serialized size must be non-negative, was ", l10));
    }

    public final void d() {
        j2.f7908c.a(getClass()).a(this);
        e();
    }

    public final void e() {
        this.zzd &= SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return j2.f7908c.a(getClass()).g(this, (e1) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.zzd = (this.zzd & LinearLayoutManager.INVALID_OFFSET) | SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    public final void h(n0 n0Var) {
        m2 a10 = j2.f7908c.a(getClass());
        o0 o0Var = n0Var.f7996v;
        if (o0Var == null) {
            o0Var = new o0(n0Var);
        }
        a10.j(this, o0Var);
    }

    public final int hashCode() {
        if (!k()) {
            int i6 = this.zza;
            if (i6 == 0) {
                int b10 = j2.f7908c.a(getClass()).b(this);
                this.zza = b10;
                return b10;
            }
            return i6;
        }
        return j2.f7908c.a(getClass()).b(this);
    }

    public final boolean i() {
        byte byteValue = ((Byte) m(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c10 = j2.f7908c.a(getClass()).c(this);
        m(2);
        return c10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.b2
    public final int j() {
        int i6;
        if (k()) {
            i6 = l(null);
            if (i6 < 0) {
                throw new IllegalStateException(c.p("serialized size must be non-negative, was ", i6));
            }
        } else {
            i6 = this.zzd & SubsamplingScaleImageView.TILE_SIZE_AUTO;
            if (i6 == Integer.MAX_VALUE) {
                i6 = l(null);
                if (i6 >= 0) {
                    this.zzd = (this.zzd & LinearLayoutManager.INVALID_OFFSET) | i6;
                } else {
                    throw new IllegalStateException(c.p("serialized size must be non-negative, was ", i6));
                }
            }
        }
        return i6;
    }

    public final boolean k() {
        if ((this.zzd & LinearLayoutManager.INVALID_OFFSET) != 0) {
            return true;
        }
        return false;
    }

    public final int l(m2 m2Var) {
        if (m2Var == null) {
            return j2.f7908c.a(getClass()).e(this);
        }
        return m2Var.e(this);
    }

    public abstract Object m(int i6);

    public final b1 o() {
        return (b1) m(5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.b2
    public final /* synthetic */ b1 q() {
        return (b1) m(5);
    }

    public final e1 s() {
        return (e1) m(4);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = d2.f7769a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        d2.c(this, sb2, 0);
        return sb2.toString();
    }
}
