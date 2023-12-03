package nv;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import lv.c;
import zv.a0;
import zv.s;
import zv.z;
/* compiled from: CacheInterceptor.kt */
/* loaded from: classes2.dex */
public final class b implements z {

    /* renamed from: u  reason: collision with root package name */
    public boolean f26847u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ zv.h f26848v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ c f26849w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ zv.g f26850x;

    public b(zv.h hVar, c.d dVar, s sVar) {
        this.f26848v = hVar;
        this.f26849w = dVar;
        this.f26850x = sVar;
    }

    @Override // zv.z, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f26847u && !mv.b.h(this, TimeUnit.MILLISECONDS)) {
            this.f26847u = true;
            this.f26849w.abort();
        }
        this.f26848v.close();
    }

    @Override // zv.z
    public final a0 d() {
        return this.f26848v.d();
    }

    @Override // zv.z
    public final long o0(zv.e sink, long j10) {
        kotlin.jvm.internal.i.g(sink, "sink");
        try {
            long o02 = this.f26848v.o0(sink, j10);
            zv.g gVar = this.f26850x;
            if (o02 == -1) {
                if (!this.f26847u) {
                    this.f26847u = true;
                    gVar.close();
                }
                return -1L;
            }
            sink.j(gVar.c(), sink.f39885v - o02, o02);
            gVar.H();
            return o02;
        } catch (IOException e10) {
            if (!this.f26847u) {
                this.f26847u = true;
                this.f26849w.abort();
            }
            throw e10;
        }
    }
}
