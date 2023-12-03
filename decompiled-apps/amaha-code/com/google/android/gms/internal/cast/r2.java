package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class r2 {

    /* renamed from: a  reason: collision with root package name */
    public final q2 f7630a;

    public r2(p2 p2Var) {
        Charset charset = k3.f7570a;
        this.f7630a = p2Var;
        p2Var.f7628t0 = this;
    }

    public final void a(int i6, int i10) {
        this.f7630a.a0(i6, i10);
    }

    public final void b(int i6, long j10) {
        this.f7630a.b0(i6, j10);
    }

    public final void c(int i6, long j10) {
        this.f7630a.c0(i6, j10);
    }

    public final void d(float f, int i6) {
        this.f7630a.a0(i6, Float.floatToRawIntBits(f));
    }

    public final void e(double d10, int i6) {
        this.f7630a.c0(i6, Double.doubleToRawLongBits(d10));
    }

    public final void f(int i6, int i10) {
        this.f7630a.Y(i6, i10);
    }

    public final void g(int i6, long j10) {
        this.f7630a.b0(i6, j10);
    }

    public final void h(int i6, int i10) {
        this.f7630a.Y(i6, i10);
    }

    public final void i(int i6, long j10) {
        this.f7630a.c0(i6, j10);
    }

    public final void j(int i6, int i10) {
        this.f7630a.a0(i6, i10);
    }

    public final void k(int i6, boolean z10) {
        this.f7630a.d0(i6, z10);
    }

    public final void l(int i6, n2 n2Var) {
        this.f7630a.f0(i6, n2Var);
    }

    public final void m(int i6, int i10) {
        this.f7630a.Z(i6, i10);
    }

    public final void n(int i6, int i10) {
        this.f7630a.Z(i6, (i10 >> 31) ^ (i10 + i10));
    }

    public final void o(int i6, long j10) {
        this.f7630a.b0(i6, (j10 >> 63) ^ (j10 + j10));
    }

    public final void p(int i6, o4 o4Var, Object obj) {
        c4 c4Var = (c4) obj;
        p2 p2Var = (p2) this.f7630a;
        p2Var.i0((i6 << 3) | 2);
        g2 g2Var = (g2) c4Var;
        int a10 = g2Var.a();
        if (a10 == -1) {
            a10 = o4Var.d(g2Var);
            g2Var.b(a10);
        }
        p2Var.i0(a10);
        o4Var.e(c4Var, p2Var.f7628t0);
    }

    public final void q(int i6, o4 o4Var, Object obj) {
        q2 q2Var = this.f7630a;
        q2Var.X(i6, 3);
        o4Var.e((c4) obj, q2Var.f7628t0);
        q2Var.X(i6, 4);
    }
}
