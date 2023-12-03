package nv;

import hs.k;
import java.io.IOException;
import ss.l;
import zv.j;
import zv.x;
/* compiled from: FaultHidingSink.kt */
/* loaded from: classes2.dex */
public final class i extends j {

    /* renamed from: v  reason: collision with root package name */
    public final l<IOException, k> f26884v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f26885w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(x delegate, l<? super IOException, k> lVar) {
        super(delegate);
        kotlin.jvm.internal.i.g(delegate, "delegate");
        this.f26884v = lVar;
    }

    @Override // zv.j, zv.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f26885w) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f26885w = true;
            this.f26884v.invoke(e10);
        }
    }

    @Override // zv.j, zv.x, java.io.Flushable
    public final void flush() {
        if (this.f26885w) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f26885w = true;
            this.f26884v.invoke(e10);
        }
    }

    @Override // zv.j, zv.x
    public final void n(zv.e source, long j10) {
        kotlin.jvm.internal.i.g(source, "source");
        if (this.f26885w) {
            source.skip(j10);
            return;
        }
        try {
            super.n(source, j10);
        } catch (IOException e10) {
            this.f26885w = true;
            this.f26884v.invoke(e10);
        }
    }
}
