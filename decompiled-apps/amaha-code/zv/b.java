package zv;

import java.io.IOException;
/* compiled from: AsyncTimeout.kt */
/* loaded from: classes2.dex */
public final class b implements x {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f39879u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ x f39880v;

    public b(y yVar, r rVar) {
        this.f39879u = yVar;
        this.f39880v = rVar;
    }

    @Override // zv.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x xVar = this.f39880v;
        a aVar = this.f39879u;
        aVar.h();
        try {
            xVar.close();
            hs.k kVar = hs.k.f19476a;
            if (!aVar.i()) {
                return;
            }
            throw aVar.j(null);
        } catch (IOException e10) {
            if (!aVar.i()) {
                throw e10;
            }
            throw aVar.j(e10);
        } finally {
            aVar.i();
        }
    }

    @Override // zv.x
    public final a0 d() {
        return this.f39879u;
    }

    @Override // zv.x, java.io.Flushable
    public final void flush() {
        x xVar = this.f39880v;
        a aVar = this.f39879u;
        aVar.h();
        try {
            xVar.flush();
            hs.k kVar = hs.k.f19476a;
            if (!aVar.i()) {
                return;
            }
            throw aVar.j(null);
        } catch (IOException e10) {
            if (!aVar.i()) {
                throw e10;
            }
            throw aVar.j(e10);
        } finally {
            aVar.i();
        }
    }

    @Override // zv.x
    public final void n(e source, long j10) {
        kotlin.jvm.internal.i.g(source, "source");
        ta.v.m(source.f39885v, 0L, j10);
        while (true) {
            long j11 = 0;
            if (j10 > 0) {
                u uVar = source.f39884u;
                kotlin.jvm.internal.i.d(uVar);
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += uVar.f39920c - uVar.f39919b;
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        uVar = uVar.f;
                        kotlin.jvm.internal.i.d(uVar);
                    }
                }
                x xVar = this.f39880v;
                a aVar = this.f39879u;
                aVar.h();
                try {
                    xVar.n(source, j11);
                    hs.k kVar = hs.k.f19476a;
                    if (!aVar.i()) {
                        j10 -= j11;
                    } else {
                        throw aVar.j(null);
                    }
                } catch (IOException e10) {
                    if (!aVar.i()) {
                        throw e10;
                    }
                    throw aVar.j(e10);
                } finally {
                    aVar.i();
                }
            } else {
                return;
            }
        }
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f39880v + ')';
    }
}
