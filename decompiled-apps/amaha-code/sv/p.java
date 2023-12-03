package sv;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sv.c;
import zv.a0;
import zv.z;
/* compiled from: Http2Reader.kt */
/* loaded from: classes2.dex */
public final class p implements Closeable {

    /* renamed from: y  reason: collision with root package name */
    public static final Logger f32172y;

    /* renamed from: u  reason: collision with root package name */
    public final zv.h f32173u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f32174v;

    /* renamed from: w  reason: collision with root package name */
    public final b f32175w;

    /* renamed from: x  reason: collision with root package name */
    public final c.a f32176x;

    /* compiled from: Http2Reader.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static int a(int i6, int i10, int i11) {
            if ((i10 & 8) != 0) {
                i6--;
            }
            if (i11 <= i6) {
                return i6 - i11;
            }
            throw new IOException(defpackage.b.j("PROTOCOL_ERROR padding ", i11, " > remaining length ", i6));
        }
    }

    /* compiled from: Http2Reader.kt */
    /* loaded from: classes2.dex */
    public interface c {
        void f(int i6, long j10);

        void i(int i6, int i10, boolean z10);

        void j(u uVar);

        void k(int i6, List list);

        void l();

        void m(int i6, sv.a aVar, zv.i iVar);

        void o(int i6, int i10, zv.h hVar, boolean z10);

        void p();

        void s(int i6, List list, boolean z10);

        void t(int i6, sv.a aVar);
    }

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        kotlin.jvm.internal.i.f(logger, "getLogger(Http2::class.java.name)");
        f32172y = logger;
    }

    public p(zv.h hVar, boolean z10) {
        this.f32173u = hVar;
        this.f32174v = z10;
        b bVar = new b(hVar);
        this.f32175w = bVar;
        this.f32176x = new c.a(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c2, code lost:
        throw new java.io.IOException(kotlin.jvm.internal.i.n(java.lang.Integer.valueOf(r7), "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z10, c handler) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String i6;
        zv.h hVar = this.f32173u;
        kotlin.jvm.internal.i.g(handler, "handler");
        int i10 = 0;
        boolean z16 = false;
        int i11 = 0;
        int i12 = 0;
        try {
            hVar.C0(9L);
            int t3 = mv.b.t(hVar);
            if (t3 <= 16384) {
                int readByte = hVar.readByte() & 255;
                int readByte2 = hVar.readByte() & 255;
                int readInt = hVar.readInt() & SubsamplingScaleImageView.TILE_SIZE_AUTO;
                Level level = Level.FINE;
                Logger logger = f32172y;
                if (logger.isLoggable(level)) {
                    d.f32122a.getClass();
                    logger.fine(d.a(readInt, t3, readByte, readByte2, true));
                }
                if (z10 && readByte != 4) {
                    d.f32122a.getClass();
                    String[] strArr = d.f32124c;
                    if (readByte < strArr.length) {
                        i6 = strArr[readByte];
                    } else {
                        i6 = mv.b.i("0x%02x", Integer.valueOf(readByte));
                    }
                    throw new IOException(kotlin.jvm.internal.i.n(i6, "Expected a SETTINGS frame but was "));
                }
                sv.a aVar = null;
                switch (readByte) {
                    case 0:
                        if (readInt != 0) {
                            if ((readByte2 & 1) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if ((readByte2 & 32) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                if ((readByte2 & 8) != 0) {
                                    i10 = hVar.readByte() & 255;
                                }
                                handler.o(readInt, a.a(t3, readByte2, i10), hVar, z11);
                                hVar.skip(i10);
                                break;
                            } else {
                                throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                            }
                        } else {
                            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                        }
                    case 1:
                        if (readInt != 0) {
                            if ((readByte2 & 1) != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if ((readByte2 & 8) != 0) {
                                i12 = hVar.readByte() & 255;
                            }
                            if ((readByte2 & 32) != 0) {
                                h(handler, readInt);
                                t3 -= 5;
                            }
                            handler.s(readInt, g(a.a(t3, readByte2, i12), i12, readByte2, readInt), z13);
                            break;
                        } else {
                            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                        }
                    case 2:
                        if (t3 == 5) {
                            if (readInt != 0) {
                                h(handler, readInt);
                                break;
                            } else {
                                throw new IOException("TYPE_PRIORITY streamId == 0");
                            }
                        } else {
                            throw new IOException(defpackage.c.q("TYPE_PRIORITY length: ", t3, " != 5"));
                        }
                    case 3:
                        if (t3 == 4) {
                            if (readInt != 0) {
                                int readInt2 = hVar.readInt();
                                sv.a[] values = sv.a.values();
                                int length = values.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 < length) {
                                        sv.a aVar2 = values[i13];
                                        if (aVar2.f32096u == readInt2) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (z14) {
                                            aVar = aVar2;
                                        } else {
                                            i13++;
                                        }
                                    }
                                }
                                if (aVar != null) {
                                    handler.t(readInt, aVar);
                                    break;
                                } else {
                                    throw new IOException(kotlin.jvm.internal.i.n(Integer.valueOf(readInt2), "TYPE_RST_STREAM unexpected error code: "));
                                }
                            } else {
                                throw new IOException("TYPE_RST_STREAM streamId == 0");
                            }
                        } else {
                            throw new IOException(defpackage.c.q("TYPE_RST_STREAM length: ", t3, " != 4"));
                        }
                    case 4:
                        if (readInt == 0) {
                            if ((readByte2 & 1) != 0) {
                                if (t3 == 0) {
                                    handler.l();
                                    break;
                                } else {
                                    throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                                }
                            } else if (t3 % 6 == 0) {
                                u uVar = new u();
                                xs.d h02 = kotlin.jvm.internal.h.h0(kotlin.jvm.internal.h.k0(0, t3), 6);
                                int i14 = h02.f37996u;
                                int i15 = h02.f37997v;
                                int i16 = h02.f37998w;
                                if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                                    while (true) {
                                        int i17 = i14 + i16;
                                        short readShort = hVar.readShort();
                                        byte[] bArr = mv.b.f25755a;
                                        int i18 = readShort & 65535;
                                        int readInt3 = hVar.readInt();
                                        if (i18 != 2) {
                                            if (i18 != 3) {
                                                if (i18 != 4) {
                                                    if (i18 == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                                    }
                                                } else if (readInt3 >= 0) {
                                                    i18 = 7;
                                                } else {
                                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                                }
                                            } else {
                                                i18 = 4;
                                            }
                                        } else if (readInt3 != 0 && readInt3 != 1) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        }
                                        uVar.c(i18, readInt3);
                                        if (i14 != i15) {
                                            i14 = i17;
                                        }
                                    }
                                }
                                handler.j(uVar);
                                break;
                            } else {
                                throw new IOException(kotlin.jvm.internal.i.n(Integer.valueOf(t3), "TYPE_SETTINGS length % 6 != 0: "));
                            }
                        } else {
                            throw new IOException("TYPE_SETTINGS streamId != 0");
                        }
                    case 5:
                        if (readInt != 0) {
                            if ((readByte2 & 8) != 0) {
                                i11 = hVar.readByte() & 255;
                            }
                            handler.k(hVar.readInt() & SubsamplingScaleImageView.TILE_SIZE_AUTO, g(a.a(t3 - 4, readByte2, i11), i11, readByte2, readInt));
                            break;
                        } else {
                            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                        }
                    case 6:
                        if (t3 == 8) {
                            if (readInt == 0) {
                                int readInt4 = hVar.readInt();
                                int readInt5 = hVar.readInt();
                                if ((readByte2 & 1) != 0) {
                                    z16 = true;
                                }
                                handler.i(readInt4, readInt5, z16);
                                break;
                            } else {
                                throw new IOException("TYPE_PING streamId != 0");
                            }
                        } else {
                            throw new IOException(kotlin.jvm.internal.i.n(Integer.valueOf(t3), "TYPE_PING length != 8: "));
                        }
                    case 7:
                        if (t3 >= 8) {
                            if (readInt == 0) {
                                int readInt6 = hVar.readInt();
                                int readInt7 = hVar.readInt();
                                int i19 = t3 - 8;
                                sv.a[] values2 = sv.a.values();
                                int length2 = values2.length;
                                int i20 = 0;
                                while (true) {
                                    if (i20 < length2) {
                                        sv.a aVar3 = values2[i20];
                                        if (aVar3.f32096u == readInt7) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (z15) {
                                            aVar = aVar3;
                                        } else {
                                            i20++;
                                        }
                                    }
                                }
                                if (aVar != null) {
                                    zv.i iVar = zv.i.f39888x;
                                    if (i19 > 0) {
                                        iVar = hVar.p(i19);
                                    }
                                    handler.m(readInt6, aVar, iVar);
                                    break;
                                } else {
                                    throw new IOException(kotlin.jvm.internal.i.n(Integer.valueOf(readInt7), "TYPE_GOAWAY unexpected error code: "));
                                }
                            } else {
                                throw new IOException("TYPE_GOAWAY streamId != 0");
                            }
                        } else {
                            throw new IOException(kotlin.jvm.internal.i.n(Integer.valueOf(t3), "TYPE_GOAWAY length < 8: "));
                        }
                    case 8:
                        if (t3 == 4) {
                            long readInt8 = hVar.readInt() & 2147483647L;
                            if (readInt8 != 0) {
                                handler.f(readInt, readInt8);
                                break;
                            } else {
                                throw new IOException("windowSizeIncrement was 0");
                            }
                        } else {
                            throw new IOException(kotlin.jvm.internal.i.n(Integer.valueOf(t3), "TYPE_WINDOW_UPDATE length !=4: "));
                        }
                    default:
                        hVar.skip(t3);
                        break;
                }
                return true;
            }
            throw new IOException(kotlin.jvm.internal.i.n(Integer.valueOf(t3), "FRAME_SIZE_ERROR: "));
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f32173u.close();
    }

    public final void e(c handler) {
        kotlin.jvm.internal.i.g(handler, "handler");
        if (this.f32174v) {
            if (!a(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        zv.i iVar = d.f32123b;
        zv.i p10 = this.f32173u.p(iVar.f39889u.length);
        Level level = Level.FINE;
        Logger logger = f32172y;
        if (logger.isLoggable(level)) {
            logger.fine(mv.b.i(kotlin.jvm.internal.i.n(p10.i(), "<< CONNECTION "), new Object[0]));
        }
        if (kotlin.jvm.internal.i.b(iVar, p10)) {
            return;
        }
        throw new IOException(kotlin.jvm.internal.i.n(p10.u(), "Expected a connection header but was "));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00eb, code lost:
        throw new java.io.IOException(kotlin.jvm.internal.i.n(java.lang.Integer.valueOf(r3.f32108b), "Invalid dynamic table size update "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<sv.b> g(int i6, int i10, int i11, int i12) {
        int e10;
        b bVar = this.f32175w;
        bVar.f32181y = i6;
        bVar.f32178v = i6;
        bVar.f32182z = i10;
        bVar.f32179w = i11;
        bVar.f32180x = i12;
        while (true) {
            c.a aVar = this.f32176x;
            zv.t tVar = aVar.f32110d;
            boolean B = tVar.B();
            ArrayList arrayList = aVar.f32109c;
            if (!B) {
                byte readByte = tVar.readByte();
                byte[] bArr = mv.b.f25755a;
                int i13 = readByte & 255;
                if (i13 != 128) {
                    boolean z10 = false;
                    if ((i13 & 128) == 128) {
                        e10 = aVar.e(i13, 127) - 1;
                        if (e10 >= 0 && e10 <= sv.c.f32105a.length - 1) {
                            z10 = true;
                        }
                        if (z10) {
                            arrayList.add(sv.c.f32105a[e10]);
                        } else {
                            int length = aVar.f + 1 + (e10 - sv.c.f32105a.length);
                            if (length < 0) {
                                break;
                            }
                            sv.b[] bVarArr = aVar.f32111e;
                            if (length >= bVarArr.length) {
                                break;
                            }
                            sv.b bVar2 = bVarArr[length];
                            kotlin.jvm.internal.i.d(bVar2);
                            arrayList.add(bVar2);
                        }
                    } else if (i13 == 64) {
                        sv.b[] bVarArr2 = sv.c.f32105a;
                        zv.i d10 = aVar.d();
                        sv.c.a(d10);
                        aVar.c(new sv.b(d10, aVar.d()));
                    } else if ((i13 & 64) == 64) {
                        aVar.c(new sv.b(aVar.b(aVar.e(i13, 63) - 1), aVar.d()));
                    } else if ((i13 & 32) == 32) {
                        int e11 = aVar.e(i13, 31);
                        aVar.f32108b = e11;
                        if (e11 < 0 || e11 > aVar.f32107a) {
                            break;
                        }
                        int i14 = aVar.f32113h;
                        if (e11 < i14) {
                            if (e11 == 0) {
                                is.i.N1(aVar.f32111e, null);
                                aVar.f = aVar.f32111e.length - 1;
                                aVar.f32112g = 0;
                                aVar.f32113h = 0;
                            } else {
                                aVar.a(i14 - e11);
                            }
                        }
                    } else if (i13 != 16 && i13 != 0) {
                        arrayList.add(new sv.b(aVar.b(aVar.e(i13, 15) - 1), aVar.d()));
                    } else {
                        sv.b[] bVarArr3 = sv.c.f32105a;
                        zv.i d11 = aVar.d();
                        sv.c.a(d11);
                        arrayList.add(new sv.b(d11, aVar.d()));
                    }
                } else {
                    throw new IOException("index == 0");
                }
            } else {
                List<sv.b> I2 = is.u.I2(arrayList);
                arrayList.clear();
                return I2;
            }
        }
        throw new IOException(kotlin.jvm.internal.i.n(Integer.valueOf(e10 + 1), "Header index too large "));
    }

    public final void h(c cVar, int i6) {
        zv.h hVar = this.f32173u;
        hVar.readInt();
        hVar.readByte();
        byte[] bArr = mv.b.f25755a;
        cVar.p();
    }

    /* compiled from: Http2Reader.kt */
    /* loaded from: classes2.dex */
    public static final class b implements z {

        /* renamed from: u  reason: collision with root package name */
        public final zv.h f32177u;

        /* renamed from: v  reason: collision with root package name */
        public int f32178v;

        /* renamed from: w  reason: collision with root package name */
        public int f32179w;

        /* renamed from: x  reason: collision with root package name */
        public int f32180x;

        /* renamed from: y  reason: collision with root package name */
        public int f32181y;

        /* renamed from: z  reason: collision with root package name */
        public int f32182z;

        public b(zv.h hVar) {
            this.f32177u = hVar;
        }

        @Override // zv.z
        public final a0 d() {
            return this.f32177u.d();
        }

        @Override // zv.z
        public final long o0(zv.e sink, long j10) {
            int i6;
            int readInt;
            kotlin.jvm.internal.i.g(sink, "sink");
            do {
                int i10 = this.f32181y;
                zv.h hVar = this.f32177u;
                if (i10 == 0) {
                    hVar.skip(this.f32182z);
                    this.f32182z = 0;
                    if ((this.f32179w & 4) != 0) {
                        return -1L;
                    }
                    i6 = this.f32180x;
                    int t3 = mv.b.t(hVar);
                    this.f32181y = t3;
                    this.f32178v = t3;
                    int readByte = hVar.readByte() & 255;
                    this.f32179w = hVar.readByte() & 255;
                    Logger logger = p.f32172y;
                    if (logger.isLoggable(Level.FINE)) {
                        d dVar = d.f32122a;
                        int i11 = this.f32180x;
                        int i12 = this.f32178v;
                        int i13 = this.f32179w;
                        dVar.getClass();
                        logger.fine(d.a(i11, i12, readByte, i13, true));
                    }
                    readInt = hVar.readInt() & SubsamplingScaleImageView.TILE_SIZE_AUTO;
                    this.f32180x = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                } else {
                    long o02 = hVar.o0(sink, Math.min(j10, i10));
                    if (o02 == -1) {
                        return -1L;
                    }
                    this.f32181y -= (int) o02;
                    return o02;
                }
            } while (readInt == i6);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // zv.z, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
