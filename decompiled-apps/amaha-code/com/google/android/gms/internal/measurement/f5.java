package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class f5 {

    /* renamed from: a  reason: collision with root package name */
    public final e5 f8376a;

    public f5(d5 d5Var) {
        Charset charset = c6.f8318a;
        this.f8376a = d5Var;
        d5Var.f8357t0 = this;
    }

    public final void a(int i6, int i10) {
        this.f8376a.j0(i6, (i10 >> 31) ^ (i10 + i10));
    }

    public final void b(int i6, long j10) {
        this.f8376a.l0(i6, (j10 >> 63) ^ (j10 + j10));
    }

    public final void c(int i6, int i10) {
        this.f8376a.j0(i6, i10);
    }

    public final void d(int i6, long j10) {
        this.f8376a.l0(i6, j10);
    }

    public final void e(int i6, boolean z10) {
        this.f8376a.Z(i6, z10);
    }

    public final void f(int i6, b5 b5Var) {
        this.f8376a.a0(i6, b5Var);
    }

    public final void g(double d10, int i6) {
        this.f8376a.d0(i6, Double.doubleToRawLongBits(d10));
    }

    public final void h(int i6, int i10) {
        this.f8376a.f0(i6, i10);
    }

    public final void i(int i6, int i10) {
        this.f8376a.b0(i6, i10);
    }

    public final void j(int i6, long j10) {
        this.f8376a.d0(i6, j10);
    }

    public final void k(float f, int i6) {
        this.f8376a.b0(i6, Float.floatToRawIntBits(f));
    }

    public final void l(int i6, g7 g7Var, Object obj) {
        e5 e5Var = this.f8376a;
        e5Var.i0(i6, 3);
        g7Var.i((v6) obj, e5Var.f8357t0);
        e5Var.i0(i6, 4);
    }

    public final void m(int i6, int i10) {
        this.f8376a.f0(i6, i10);
    }

    public final void n(int i6, long j10) {
        this.f8376a.l0(i6, j10);
    }

    public final void o(int i6, g7 g7Var, Object obj) {
        v6 v6Var = (v6) obj;
        d5 d5Var = (d5) this.f8376a;
        d5Var.k0((i6 << 3) | 2);
        d5Var.k0(((r4) v6Var).e(g7Var));
        g7Var.i(v6Var, d5Var.f8357t0);
    }

    public final void p(int i6, int i10) {
        this.f8376a.b0(i6, i10);
    }

    public final void q(int i6, long j10) {
        this.f8376a.d0(i6, j10);
    }
}
