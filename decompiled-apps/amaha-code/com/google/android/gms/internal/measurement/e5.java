package com.google.android.gms.internal.measurement;

import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public abstract class e5 extends tr.r {

    /* renamed from: u0  reason: collision with root package name */
    public static final Logger f8355u0 = Logger.getLogger(e5.class.getName());

    /* renamed from: v0  reason: collision with root package name */
    public static final boolean f8356v0 = y7.f8720e;

    /* renamed from: t0  reason: collision with root package name */
    public f5 f8357t0;

    public e5() {
    }

    public static int V(int i6) {
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

    public static int X(long j10) {
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

    @Deprecated
    public static int n0(int i6, v6 v6Var, g7 g7Var) {
        int V = V(i6 << 3);
        return ((r4) v6Var).e(g7Var) + V + V;
    }

    public static int o0(int i6) {
        if (i6 >= 0) {
            return V(i6);
        }
        return 10;
    }

    public static int p0(String str) {
        int length;
        try {
            length = c8.c(str);
        } catch (b8 unused) {
            length = str.getBytes(c6.f8318a).length;
        }
        return V(length) + length;
    }

    public static int q0(int i6) {
        return V(i6 << 3);
    }

    public abstract void Y(byte b10);

    public abstract void Z(int i6, boolean z10);

    public abstract void a0(int i6, b5 b5Var);

    public abstract void b0(int i6, int i10);

    public abstract void c0(int i6);

    public abstract void d0(int i6, long j10);

    public abstract void e0(long j10);

    public abstract void f0(int i6, int i10);

    public abstract void g0(int i6);

    public abstract void h0(int i6, String str);

    public abstract void i0(int i6, int i10);

    public abstract void j0(int i6, int i10);

    public abstract void k0(int i6);

    public abstract void l0(int i6, long j10);

    public abstract void m0(long j10);

    public /* synthetic */ e5(int i6) {
    }
}
