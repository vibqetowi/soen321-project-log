package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.o0  reason: invalid package */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final n0 f8021a;

    public o0(n0 n0Var) {
        Charset charset = i1.f7886a;
        this.f8021a = n0Var;
        n0Var.f7996v = this;
    }

    public final void a(int i6, int i10) {
        this.f8021a.b0(i6, (i10 >> 31) ^ (i10 + i10));
    }

    public final void b(int i6, long j10) {
        this.f8021a.d0(i6, (j10 >> 63) ^ (j10 + j10));
    }

    public final void c(int i6, int i10) {
        this.f8021a.b0(i6, i10);
    }

    public final void d(int i6, long j10) {
        this.f8021a.d0(i6, j10);
    }

    public final void e(int i6, boolean z10) {
        this.f8021a.Q(i6, z10);
    }

    public final void f(int i6, h0 h0Var) {
        this.f8021a.R(i6, h0Var);
    }

    public final void g(double d10, int i6) {
        this.f8021a.U(i6, Double.doubleToRawLongBits(d10));
    }

    public final void h(int i6, int i10) {
        this.f8021a.W(i6, i10);
    }

    public final void i(int i6, int i10) {
        this.f8021a.S(i6, i10);
    }

    public final void j(int i6, long j10) {
        this.f8021a.U(i6, j10);
    }

    public final void k(float f, int i6) {
        this.f8021a.S(i6, Float.floatToRawIntBits(f));
    }

    public final void l(int i6, m2 m2Var, Object obj) {
        n0 n0Var = this.f8021a;
        n0Var.a0(i6, 3);
        m2Var.j((b2) obj, n0Var.f7996v);
        n0Var.a0(i6, 4);
    }

    public final void m(int i6, int i10) {
        this.f8021a.W(i6, i10);
    }

    public final void n(int i6, long j10) {
        this.f8021a.d0(i6, j10);
    }

    public final void o(int i6, m2 m2Var, Object obj) {
        this.f8021a.Y(i6, (b2) obj, m2Var);
    }

    public final void p(int i6, int i10) {
        this.f8021a.S(i6, i10);
    }

    public final void q(int i6, long j10) {
        this.f8021a.U(i6, j10);
    }
}
