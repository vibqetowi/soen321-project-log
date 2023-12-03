package wr;

import java.util.List;
/* compiled from: ForwardingFrameWriter.java */
/* loaded from: classes2.dex */
public abstract class c implements yr.c {

    /* renamed from: u  reason: collision with root package name */
    public final yr.c f37089u;

    public c(yr.c cVar) {
        sc.b.w(cVar, "delegate");
        this.f37089u = cVar;
    }

    @Override // yr.c
    public final int A0() {
        return this.f37089u.A0();
    }

    @Override // yr.c
    public final void C() {
        this.f37089u.C();
    }

    @Override // yr.c
    public final void E(boolean z10, int i6, List list) {
        this.f37089u.E(z10, i6, list);
    }

    @Override // yr.c
    public final void F(yr.a aVar, byte[] bArr) {
        this.f37089u.F(aVar, bArr);
    }

    @Override // yr.c
    public final void P(boolean z10, int i6, zv.e eVar, int i10) {
        this.f37089u.P(z10, i6, eVar, i10);
    }

    @Override // yr.c
    public final void b0(hg.a aVar) {
        this.f37089u.b0(aVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f37089u.close();
    }

    @Override // yr.c
    public final void f(int i6, long j10) {
        this.f37089u.f(i6, j10);
    }

    @Override // yr.c
    public final void flush() {
        this.f37089u.flush();
    }
}
