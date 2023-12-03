package zv;
/* compiled from: ForwardingSource.kt */
/* loaded from: classes2.dex */
public abstract class k implements z {

    /* renamed from: u  reason: collision with root package name */
    public final z f39893u;

    public k(z delegate) {
        kotlin.jvm.internal.i.g(delegate, "delegate");
        this.f39893u = delegate;
    }

    @Override // zv.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39893u.close();
    }

    @Override // zv.z
    public final a0 d() {
        return this.f39893u.d();
    }

    @Override // zv.z
    public long o0(e sink, long j10) {
        kotlin.jvm.internal.i.g(sink, "sink");
        return this.f39893u.o0(sink, j10);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) getClass().getSimpleName());
        sb2.append('(');
        sb2.append(this.f39893u);
        sb2.append(')');
        return sb2.toString();
    }
}
