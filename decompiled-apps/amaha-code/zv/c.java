package zv;

import java.io.IOException;
/* compiled from: AsyncTimeout.kt */
/* loaded from: classes2.dex */
public final class c implements z {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f39882u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ z f39883v;

    public c(y yVar, o oVar) {
        this.f39882u = yVar;
        this.f39883v = oVar;
    }

    @Override // zv.z, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z zVar = this.f39883v;
        a aVar = this.f39882u;
        aVar.h();
        try {
            zVar.close();
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

    @Override // zv.z
    public final a0 d() {
        return this.f39882u;
    }

    @Override // zv.z
    public final long o0(e sink, long j10) {
        kotlin.jvm.internal.i.g(sink, "sink");
        z zVar = this.f39883v;
        a aVar = this.f39882u;
        aVar.h();
        try {
            long o02 = zVar.o0(sink, j10);
            if (!aVar.i()) {
                return o02;
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

    public final String toString() {
        return "AsyncTimeout.source(" + this.f39883v + ')';
    }
}
