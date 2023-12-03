package zv;
/* compiled from: ForwardingSink.kt */
/* loaded from: classes2.dex */
public abstract class j implements x {

    /* renamed from: u  reason: collision with root package name */
    public final x f39892u;

    public j(x delegate) {
        kotlin.jvm.internal.i.g(delegate, "delegate");
        this.f39892u = delegate;
    }

    @Override // zv.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39892u.close();
    }

    @Override // zv.x
    public final a0 d() {
        return this.f39892u.d();
    }

    @Override // zv.x, java.io.Flushable
    public void flush() {
        this.f39892u.flush();
    }

    @Override // zv.x
    public void n(e source, long j10) {
        kotlin.jvm.internal.i.g(source, "source");
        this.f39892u.n(source, j10);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) getClass().getSimpleName());
        sb2.append('(');
        sb2.append(this.f39892u);
        sb2.append(')');
        return sb2.toString();
    }
}
