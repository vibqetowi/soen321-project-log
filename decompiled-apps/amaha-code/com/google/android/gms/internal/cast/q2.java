package com.google.android.gms.internal.cast;

import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public abstract class q2 extends tr.r {

    /* renamed from: u0  reason: collision with root package name */
    public static final Logger f7626u0 = Logger.getLogger(q2.class.getName());

    /* renamed from: v0  reason: collision with root package name */
    public static final boolean f7627v0 = i5.f7559e;

    /* renamed from: t0  reason: collision with root package name */
    public r2 f7628t0;

    public q2() {
        super((Object) null);
    }

    @Deprecated
    public static int V(int i6, c4 c4Var, o4 o4Var) {
        int o02 = o0(i6 << 3);
        int i10 = o02 + o02;
        g2 g2Var = (g2) c4Var;
        int a10 = g2Var.a();
        if (a10 == -1) {
            a10 = o4Var.d(g2Var);
            g2Var.b(a10);
        }
        return i10 + a10;
    }

    public static int m0(int i6) {
        return o0(i6 << 3);
    }

    public static int n0(int i6) {
        if (i6 >= 0) {
            return o0(i6);
        }
        return 10;
    }

    public static int o0(int i6) {
        if ((i6 & (-128)) == 0) {
            return 1;
        }
        if ((i6 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i6) == 0) {
            return 3;
        }
        if ((i6 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int p0(long j10) {
        int i6;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i6 = 6;
        } else {
            i6 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i6 += 2;
            j10 >>>= 14;
        }
        if ((j10 & (-16384)) != 0) {
            return i6 + 1;
        }
        return i6;
    }

    public static int q0(String str) {
        int length;
        try {
            length = k5.a(str);
        } catch (j5 unused) {
            length = str.getBytes(k3.f7570a).length;
        }
        return o0(length) + length;
    }

    public abstract void X(int i6, int i10);

    public abstract void Y(int i6, int i10);

    public abstract void Z(int i6, int i10);

    public abstract void a0(int i6, int i10);

    public abstract void b0(int i6, long j10);

    public abstract void c0(int i6, long j10);

    public abstract void d0(int i6, boolean z10);

    public abstract void e0(int i6, String str);

    public abstract void f0(int i6, n2 n2Var);

    public abstract void g0(byte b10);

    public abstract void h0(int i6);

    public abstract void i0(int i6);

    public abstract void j0(int i6);

    public abstract void k0(long j10);

    public abstract void l0(long j10);

    public /* synthetic */ q2(int i6) {
        super((Object) null);
    }
}
