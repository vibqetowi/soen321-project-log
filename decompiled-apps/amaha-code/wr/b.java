package wr;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import wr.a;
/* compiled from: ExceptionHandlingFrameWriter.java */
/* loaded from: classes2.dex */
public final class b implements yr.c {

    /* renamed from: x  reason: collision with root package name */
    public static final Logger f37085x = Logger.getLogger(i.class.getName());

    /* renamed from: u  reason: collision with root package name */
    public final a f37086u;

    /* renamed from: v  reason: collision with root package name */
    public final yr.c f37087v;

    /* renamed from: w  reason: collision with root package name */
    public final j f37088w = new j(Level.FINE);

    /* compiled from: ExceptionHandlingFrameWriter.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Exception exc);
    }

    public b(a aVar, a.d dVar) {
        sc.b.w(aVar, "transportExceptionHandler");
        this.f37086u = aVar;
        this.f37087v = dVar;
    }

    @Override // yr.c
    public final int A0() {
        return this.f37087v.A0();
    }

    @Override // yr.c
    public final void C() {
        try {
            this.f37087v.C();
        } catch (IOException e10) {
            this.f37086u.a(e10);
        }
    }

    @Override // yr.c
    public final void E(boolean z10, int i6, List list) {
        try {
            this.f37087v.E(z10, i6, list);
        } catch (IOException e10) {
            this.f37086u.a(e10);
        }
    }

    @Override // yr.c
    public final void F(yr.a aVar, byte[] bArr) {
        yr.c cVar = this.f37087v;
        this.f37088w.c(2, 0, aVar, zv.i.l(bArr));
        try {
            cVar.F(aVar, bArr);
            cVar.flush();
        } catch (IOException e10) {
            this.f37086u.a(e10);
        }
    }

    @Override // yr.c
    public final void N(int i6, yr.a aVar) {
        this.f37088w.e(2, i6, aVar);
        try {
            this.f37087v.N(i6, aVar);
        } catch (IOException e10) {
            this.f37086u.a(e10);
        }
    }

    @Override // yr.c
    public final void P(boolean z10, int i6, zv.e eVar, int i10) {
        j jVar = this.f37088w;
        eVar.getClass();
        jVar.b(2, i6, eVar, i10, z10);
        try {
            this.f37087v.P(z10, i6, eVar, i10);
        } catch (IOException e10) {
            this.f37086u.a(e10);
        }
    }

    @Override // yr.c
    public final void b0(hg.a aVar) {
        this.f37088w.f(2, aVar);
        try {
            this.f37087v.b0(aVar);
        } catch (IOException e10) {
            this.f37086u.a(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Level level;
        try {
            this.f37087v.close();
        } catch (IOException e10) {
            if (e10.getClass().equals(IOException.class)) {
                level = Level.FINE;
            } else {
                level = Level.INFO;
            }
            f37085x.log(level, "Failed closing connection", (Throwable) e10);
        }
    }

    @Override // yr.c
    public final void f(int i6, long j10) {
        this.f37088w.g(2, i6, j10);
        try {
            this.f37087v.f(i6, j10);
        } catch (IOException e10) {
            this.f37086u.a(e10);
        }
    }

    @Override // yr.c
    public final void flush() {
        try {
            this.f37087v.flush();
        } catch (IOException e10) {
            this.f37086u.a(e10);
        }
    }

    @Override // yr.c
    public final void g0(hg.a aVar) {
        j jVar = this.f37088w;
        if (jVar.a()) {
            jVar.f37164a.log(jVar.f37165b, pl.a.n(2).concat(" SETTINGS: ack=true"));
        }
        try {
            this.f37087v.g0(aVar);
        } catch (IOException e10) {
            this.f37086u.a(e10);
        }
    }

    @Override // yr.c
    public final void i(int i6, int i10, boolean z10) {
        j jVar = this.f37088w;
        if (z10) {
            long j10 = (4294967295L & i10) | (i6 << 32);
            if (jVar.a()) {
                jVar.f37164a.log(jVar.f37165b, pl.a.n(2) + " PING: ack=true bytes=" + j10);
            }
        } else {
            jVar.d(2, (4294967295L & i10) | (i6 << 32));
        }
        try {
            this.f37087v.i(i6, i10, z10);
        } catch (IOException e10) {
            this.f37086u.a(e10);
        }
    }
}
