package zv;

import java.nio.ByteBuffer;
/* compiled from: RealBufferedSink.kt */
/* loaded from: classes2.dex */
public final class s implements g {

    /* renamed from: u  reason: collision with root package name */
    public final x f39911u;

    /* renamed from: v  reason: collision with root package name */
    public final e f39912v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f39913w;

    public s(x sink) {
        kotlin.jvm.internal.i.g(sink, "sink");
        this.f39911u = sink;
        this.f39912v = new e();
    }

    @Override // zv.g
    public final g E0(long j10) {
        if (!this.f39913w) {
            this.f39912v.M0(j10);
            H();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // zv.g
    public final g H() {
        if (!this.f39913w) {
            e eVar = this.f39912v;
            long h10 = eVar.h();
            if (h10 > 0) {
                this.f39911u.n(eVar, h10);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // zv.g
    public final g T(String string) {
        kotlin.jvm.internal.i.g(string, "string");
        if (!this.f39913w) {
            this.f39912v.R0(string);
            H();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // zv.g
    public final g Z(long j10) {
        if (!this.f39913w) {
            this.f39912v.N0(j10);
            H();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // zv.g
    public final e c() {
        return this.f39912v;
    }

    @Override // zv.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x xVar = this.f39911u;
        if (!this.f39913w) {
            try {
                e eVar = this.f39912v;
                long j10 = eVar.f39885v;
                if (j10 > 0) {
                    xVar.n(eVar, j10);
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                xVar.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f39913w = true;
            if (th == null) {
                return;
            }
            throw th;
        }
    }

    @Override // zv.x
    public final a0 d() {
        return this.f39911u.d();
    }

    @Override // zv.g, zv.x, java.io.Flushable
    public final void flush() {
        if (!this.f39913w) {
            e eVar = this.f39912v;
            long j10 = eVar.f39885v;
            x xVar = this.f39911u;
            if (j10 > 0) {
                xVar.n(eVar, j10);
            }
            xVar.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f39913w;
    }

    @Override // zv.x
    public final void n(e source, long j10) {
        kotlin.jvm.internal.i.g(source, "source");
        if (!this.f39913w) {
            this.f39912v.n(source, j10);
            H();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // zv.g
    public final g t0(int i6, byte[] source, int i10) {
        kotlin.jvm.internal.i.g(source, "source");
        if (!this.f39913w) {
            this.f39912v.y0(i6, source, i10);
            H();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String toString() {
        return "buffer(" + this.f39911u + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.i.g(source, "source");
        if (!this.f39913w) {
            int write = this.f39912v.write(source);
            H();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // zv.g
    public final g writeByte(int i6) {
        if (!this.f39913w) {
            this.f39912v.L0(i6);
            H();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // zv.g
    public final g writeInt(int i6) {
        if (!this.f39913w) {
            this.f39912v.O0(i6);
            H();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // zv.g
    public final g writeShort(int i6) {
        if (!this.f39913w) {
            this.f39912v.P0(i6);
            H();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // zv.g
    public final g z(i byteString) {
        kotlin.jvm.internal.i.g(byteString, "byteString");
        if (!this.f39913w) {
            this.f39912v.B0(byteString);
            H();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // zv.g
    public final g write(byte[] source) {
        kotlin.jvm.internal.i.g(source, "source");
        if (!this.f39913w) {
            e eVar = this.f39912v;
            eVar.getClass();
            eVar.y0(0, source, source.length);
            H();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
