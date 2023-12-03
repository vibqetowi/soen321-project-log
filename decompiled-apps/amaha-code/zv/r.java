package zv;

import java.io.OutputStream;
/* compiled from: JvmOkio.kt */
/* loaded from: classes2.dex */
public final class r implements x {

    /* renamed from: u  reason: collision with root package name */
    public final OutputStream f39909u;

    /* renamed from: v  reason: collision with root package name */
    public final a0 f39910v;

    public r(OutputStream outputStream, a0 a0Var) {
        this.f39909u = outputStream;
        this.f39910v = a0Var;
    }

    @Override // zv.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f39909u.close();
    }

    @Override // zv.x
    public final a0 d() {
        return this.f39910v;
    }

    @Override // zv.x, java.io.Flushable
    public final void flush() {
        this.f39909u.flush();
    }

    @Override // zv.x
    public final void n(e source, long j10) {
        kotlin.jvm.internal.i.g(source, "source");
        ta.v.m(source.f39885v, 0L, j10);
        while (j10 > 0) {
            this.f39910v.f();
            u uVar = source.f39884u;
            kotlin.jvm.internal.i.d(uVar);
            int min = (int) Math.min(j10, uVar.f39920c - uVar.f39919b);
            this.f39909u.write(uVar.f39918a, uVar.f39919b, min);
            int i6 = uVar.f39919b + min;
            uVar.f39919b = i6;
            long j11 = min;
            j10 -= j11;
            source.f39885v -= j11;
            if (i6 == uVar.f39920c) {
                source.f39884u = uVar.a();
                v.a(uVar);
            }
        }
    }

    public final String toString() {
        return "sink(" + this.f39909u + ')';
    }
}
