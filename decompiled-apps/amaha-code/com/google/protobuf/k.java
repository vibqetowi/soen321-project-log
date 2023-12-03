package com.google.protobuf;

import java.nio.charset.Charset;
/* compiled from: CodedOutputStreamWriter.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final CodedOutputStream f9994a;

    public k(CodedOutputStream codedOutputStream) {
        Charset charset = y.f10086a;
        if (codedOutputStream != null) {
            this.f9994a = codedOutputStream;
            codedOutputStream.f9867v = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public final void a(int i6, boolean z10) {
        this.f9994a.j0(i6, z10);
    }

    public final void b(int i6, h hVar) {
        this.f9994a.l0(i6, hVar);
    }

    public final void c(double d10, int i6) {
        CodedOutputStream codedOutputStream = this.f9994a;
        codedOutputStream.getClass();
        codedOutputStream.p0(i6, Double.doubleToRawLongBits(d10));
    }

    public final void d(int i6, int i10) {
        this.f9994a.r0(i6, i10);
    }

    public final void e(int i6, int i10) {
        this.f9994a.n0(i6, i10);
    }

    public final void f(int i6, long j10) {
        this.f9994a.p0(i6, j10);
    }

    public final void g(float f, int i6) {
        CodedOutputStream codedOutputStream = this.f9994a;
        codedOutputStream.getClass();
        codedOutputStream.n0(i6, Float.floatToRawIntBits(f));
    }

    public final void h(int i6, g1 g1Var, Object obj) {
        CodedOutputStream codedOutputStream = this.f9994a;
        codedOutputStream.z0(i6, 3);
        g1Var.b((q0) obj, codedOutputStream.f9867v);
        codedOutputStream.z0(i6, 4);
    }

    public final void i(int i6, int i10) {
        this.f9994a.r0(i6, i10);
    }

    public final void j(int i6, long j10) {
        this.f9994a.C0(i6, j10);
    }

    public final void k(int i6, g1 g1Var, Object obj) {
        this.f9994a.t0(i6, (q0) obj, g1Var);
    }

    public final void l(int i6, Object obj) {
        boolean z10 = obj instanceof h;
        CodedOutputStream codedOutputStream = this.f9994a;
        if (z10) {
            codedOutputStream.w0(i6, (h) obj);
        } else {
            codedOutputStream.v0(i6, (q0) obj);
        }
    }

    public final void m(int i6, int i10) {
        this.f9994a.n0(i6, i10);
    }

    public final void n(int i6, long j10) {
        this.f9994a.p0(i6, j10);
    }

    public final void o(int i6, int i10) {
        this.f9994a.A0(i6, (i10 >> 31) ^ (i10 << 1));
    }

    public final void p(int i6, long j10) {
        this.f9994a.C0(i6, (j10 >> 63) ^ (j10 << 1));
    }

    public final void q(int i6, int i10) {
        this.f9994a.A0(i6, i10);
    }

    public final void r(int i6, long j10) {
        this.f9994a.C0(i6, j10);
    }
}
