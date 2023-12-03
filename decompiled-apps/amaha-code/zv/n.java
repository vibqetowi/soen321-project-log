package zv;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* compiled from: InflaterSource.kt */
/* loaded from: classes2.dex */
public final class n implements z {

    /* renamed from: u  reason: collision with root package name */
    public final h f39900u;

    /* renamed from: v  reason: collision with root package name */
    public final Inflater f39901v;

    /* renamed from: w  reason: collision with root package name */
    public int f39902w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f39903x;

    public n(t tVar, Inflater inflater) {
        this.f39900u = tVar;
        this.f39901v = inflater;
    }

    @Override // zv.z, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f39903x) {
            return;
        }
        this.f39901v.end();
        this.f39903x = true;
        this.f39900u.close();
    }

    @Override // zv.z
    public final a0 d() {
        return this.f39900u.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c A[SYNTHETIC] */
    @Override // zv.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long o0(e sink, long j10) {
        boolean z10;
        h hVar;
        long j11;
        kotlin.jvm.internal.i.g(sink, "sink");
        do {
            int i6 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i6 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (!this.f39903x) {
                    hVar = this.f39900u;
                    Inflater inflater = this.f39901v;
                    if (i6 != 0) {
                        try {
                            u w02 = sink.w0(1);
                            int min = (int) Math.min(j10, 8192 - w02.f39920c);
                            if (inflater.needsInput() && !hVar.B()) {
                                u uVar = hVar.c().f39884u;
                                kotlin.jvm.internal.i.d(uVar);
                                int i10 = uVar.f39920c;
                                int i11 = uVar.f39919b;
                                int i12 = i10 - i11;
                                this.f39902w = i12;
                                inflater.setInput(uVar.f39918a, i11, i12);
                            }
                            int inflate = inflater.inflate(w02.f39918a, w02.f39920c, min);
                            int i13 = this.f39902w;
                            if (i13 != 0) {
                                int remaining = i13 - inflater.getRemaining();
                                this.f39902w -= remaining;
                                hVar.skip(remaining);
                            }
                            if (inflate > 0) {
                                w02.f39920c += inflate;
                                j11 = inflate;
                                sink.f39885v += j11;
                                if (j11 <= 0) {
                                    return j11;
                                }
                                if (inflater.finished() || inflater.needsDictionary()) {
                                    return -1L;
                                }
                            } else if (w02.f39919b == w02.f39920c) {
                                sink.f39884u = w02.a();
                                v.a(w02);
                            }
                        } catch (DataFormatException e10) {
                            throw new IOException(e10);
                        }
                    }
                    j11 = 0;
                    if (j11 <= 0) {
                    }
                } else {
                    throw new IllegalStateException("closed".toString());
                }
            } else {
                throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Long.valueOf(j10), "byteCount < 0: ").toString());
            }
        } while (!hVar.B());
        throw new EOFException("source exhausted prematurely");
    }
}
