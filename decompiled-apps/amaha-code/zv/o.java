package zv;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: JvmOkio.kt */
/* loaded from: classes2.dex */
public final class o implements z {

    /* renamed from: u  reason: collision with root package name */
    public final InputStream f39904u;

    /* renamed from: v  reason: collision with root package name */
    public final a0 f39905v;

    public o(InputStream input, a0 timeout) {
        kotlin.jvm.internal.i.g(input, "input");
        kotlin.jvm.internal.i.g(timeout, "timeout");
        this.f39904u = input;
        this.f39905v = timeout;
    }

    @Override // zv.z, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f39904u.close();
    }

    @Override // zv.z
    public final a0 d() {
        return this.f39905v;
    }

    @Override // zv.z
    public final long o0(e sink, long j10) {
        boolean z10;
        kotlin.jvm.internal.i.g(sink, "sink");
        int i6 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i6 == 0) {
            return 0L;
        }
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                this.f39905v.f();
                u w02 = sink.w0(1);
                int read = this.f39904u.read(w02.f39918a, w02.f39920c, (int) Math.min(j10, 8192 - w02.f39920c));
                if (read == -1) {
                    if (w02.f39919b == w02.f39920c) {
                        sink.f39884u = w02.a();
                        v.a(w02);
                        return -1L;
                    }
                    return -1L;
                }
                w02.f39920c += read;
                long j11 = read;
                sink.f39885v += j11;
                return j11;
            } catch (AssertionError e10) {
                if (ta.v.C(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Long.valueOf(j10), "byteCount < 0: ").toString());
    }

    public final String toString() {
        return "source(" + this.f39904u + ')';
    }
}
