package zv;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* compiled from: GzipSource.kt */
/* loaded from: classes2.dex */
public final class m implements z {

    /* renamed from: u  reason: collision with root package name */
    public byte f39895u;

    /* renamed from: v  reason: collision with root package name */
    public final t f39896v;

    /* renamed from: w  reason: collision with root package name */
    public final Inflater f39897w;

    /* renamed from: x  reason: collision with root package name */
    public final n f39898x;

    /* renamed from: y  reason: collision with root package name */
    public final CRC32 f39899y;

    public m(z source) {
        kotlin.jvm.internal.i.g(source, "source");
        t tVar = new t(source);
        this.f39896v = tVar;
        Inflater inflater = new Inflater(true);
        this.f39897w = inflater;
        this.f39898x = new n(tVar, inflater);
        this.f39899y = new CRC32();
    }

    public static void a(int i6, int i10, String str) {
        if (i10 == i6) {
            return;
        }
        throw new IOException(defpackage.b.o(new Object[]{str, Integer.valueOf(i10), Integer.valueOf(i6)}, 3, "%s: actual 0x%08x != expected 0x%08x", "java.lang.String.format(this, *args)"));
    }

    @Override // zv.z, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f39898x.close();
    }

    @Override // zv.z
    public final a0 d() {
        return this.f39896v.d();
    }

    public final void e(e eVar, long j10, long j11) {
        int i6;
        u uVar = eVar.f39884u;
        kotlin.jvm.internal.i.d(uVar);
        while (true) {
            int i10 = uVar.f39920c;
            int i11 = uVar.f39919b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= i10 - i11;
            uVar = uVar.f;
            kotlin.jvm.internal.i.d(uVar);
        }
        while (j11 > 0) {
            int min = (int) Math.min(uVar.f39920c - i6, j11);
            this.f39899y.update(uVar.f39918a, (int) (uVar.f39919b + j10), min);
            j11 -= min;
            uVar = uVar.f;
            kotlin.jvm.internal.i.d(uVar);
            j10 = 0;
        }
    }

    @Override // zv.z
    public final long o0(e sink, long j10) {
        boolean z10;
        t tVar;
        boolean z11;
        e eVar;
        boolean z12;
        boolean z13;
        boolean z14;
        long j11;
        kotlin.jvm.internal.i.g(sink, "sink");
        int i6 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i6 == 0) {
                return 0L;
            }
            byte b10 = this.f39895u;
            CRC32 crc32 = this.f39899y;
            t tVar2 = this.f39896v;
            if (b10 == 0) {
                tVar2.C0(10L);
                e eVar2 = tVar2.f39915v;
                byte m10 = eVar2.m(3L);
                if (((m10 >> 1) & 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    eVar = eVar2;
                    e(tVar2.f39915v, 0L, 10L);
                } else {
                    eVar = eVar2;
                }
                a(8075, tVar2.readShort(), "ID1ID2");
                tVar2.skip(8L);
                if (((m10 >> 2) & 1) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    tVar2.C0(2L);
                    if (z11) {
                        e(tVar2.f39915v, 0L, 2L);
                    }
                    int readShort = eVar.readShort() & 65535;
                    long j12 = (short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8));
                    tVar2.C0(j12);
                    if (z11) {
                        e(tVar2.f39915v, 0L, j12);
                        j11 = j12;
                    } else {
                        j11 = j12;
                    }
                    tVar2.skip(j11);
                }
                if (((m10 >> 3) & 1) == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    long a10 = tVar2.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a10 != -1) {
                        if (z11) {
                            tVar = tVar2;
                            e(tVar2.f39915v, 0L, a10 + 1);
                        } else {
                            tVar = tVar2;
                        }
                        tVar.skip(a10 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    tVar = tVar2;
                }
                if (((m10 >> 4) & 1) == 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    long a11 = tVar.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a11 != -1) {
                        if (z11) {
                            e(tVar.f39915v, 0L, a11 + 1);
                        }
                        tVar.skip(a11 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z11) {
                    tVar.C0(2L);
                    int readShort2 = eVar.readShort() & 65535;
                    a((short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                this.f39895u = (byte) 1;
            } else {
                tVar = tVar2;
            }
            if (this.f39895u == 1) {
                long j13 = sink.f39885v;
                long o02 = this.f39898x.o0(sink, j10);
                if (o02 != -1) {
                    e(sink, j13, o02);
                    return o02;
                }
                this.f39895u = (byte) 2;
            }
            if (this.f39895u == 2) {
                a(tVar.g(), (int) crc32.getValue(), "CRC");
                a(tVar.g(), (int) this.f39897w.getBytesWritten(), "ISIZE");
                this.f39895u = (byte) 3;
                if (!tVar.B()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Long.valueOf(j10), "byteCount < 0: ").toString());
    }
}
