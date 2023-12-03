package y7;

import u7.i;
/* compiled from: StartOffsetExtractorInput.java */
/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public final i f38327a;

    /* renamed from: b  reason: collision with root package name */
    public final long f38328b;

    public c(i iVar, long j10) {
        boolean z10;
        this.f38327a = iVar;
        if (iVar.getPosition() >= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        this.f38328b = j10;
    }

    @Override // u7.i
    public final boolean a(byte[] bArr, int i6, int i10, boolean z10) {
        return this.f38327a.a(bArr, i6, i10, z10);
    }

    @Override // u7.i
    public final void b(int i6, byte[] bArr, int i10) {
        this.f38327a.b(i6, bArr, i10);
    }

    @Override // u7.i
    public final boolean d(byte[] bArr, int i6, int i10, boolean z10) {
        return this.f38327a.d(bArr, i6, i10, z10);
    }

    @Override // u7.i
    public final long e() {
        return this.f38327a.e() - this.f38328b;
    }

    @Override // u7.i
    public final void f(int i6) {
        this.f38327a.f(i6);
    }

    @Override // u7.i
    public final int g(int i6, byte[] bArr, int i10) {
        return this.f38327a.g(i6, bArr, i10);
    }

    @Override // u7.i
    public final long getLength() {
        return this.f38327a.getLength() - this.f38328b;
    }

    @Override // u7.i
    public final long getPosition() {
        return this.f38327a.getPosition() - this.f38328b;
    }

    @Override // u7.i
    public final int i(int i6) {
        return this.f38327a.i(i6);
    }

    @Override // u7.i
    public final void k() {
        this.f38327a.k();
    }

    @Override // u7.i
    public final void l(int i6) {
        this.f38327a.l(i6);
    }

    @Override // u7.i
    public final boolean m(int i6, boolean z10) {
        return this.f38327a.m(i6, z10);
    }

    @Override // u7.i, b9.d
    public final int read(byte[] bArr, int i6, int i10) {
        return this.f38327a.read(bArr, i6, i10);
    }

    @Override // u7.i
    public final void readFully(byte[] bArr, int i6, int i10) {
        this.f38327a.readFully(bArr, i6, i10);
    }
}
