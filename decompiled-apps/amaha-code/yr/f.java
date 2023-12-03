package yr;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import r1.b0;
import tr.c0;
import tr.i0;
import vr.a1;
import vr.s;
import vr.u0;
import wr.i;
import wr.j;
import yr.b;
import yr.e;
import zv.a0;
import zv.i;
import zv.t;
import zv.z;
/* compiled from: Http2.java */
/* loaded from: classes2.dex */
public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f38946a = Logger.getLogger(b.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final i f38947b;

    /* compiled from: Http2.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final String[] f38954a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f38955b = new String[64];

        /* renamed from: c  reason: collision with root package name */
        public static final String[] f38956c = new String[256];

        static {
            int i6 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr = f38956c;
                if (i10 >= strArr.length) {
                    break;
                }
                strArr[i10] = String.format("%8s", Integer.toBinaryString(i10)).replace(' ', '0');
                i10++;
            }
            String[] strArr2 = f38955b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            strArr2[1 | 8] = b0.b(new StringBuilder(), strArr2[1], "|PADDED");
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr2[i11];
                int i13 = iArr[0];
                String[] strArr3 = f38955b;
                int i14 = i13 | i12;
                strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strArr3[i13]);
                sb2.append('|');
                strArr3[i14 | 8] = b0.b(sb2, strArr3[i12], "|PADDED");
            }
            while (true) {
                String[] strArr4 = f38955b;
                if (i6 < strArr4.length) {
                    if (strArr4[i6] == null) {
                        strArr4[i6] = f38956c[i6];
                    }
                    i6++;
                } else {
                    return;
                }
            }
        }

        public static String a(boolean z10, int i6, int i10, byte b10, byte b11) {
            String format;
            String str;
            String str2;
            String str3;
            if (b10 < 10) {
                format = f38954a[b10];
            } else {
                format = String.format("0x%02x", Byte.valueOf(b10));
            }
            if (b11 == 0) {
                str = "";
            } else {
                String[] strArr = f38956c;
                if (b10 != 2 && b10 != 3) {
                    if (b10 != 4 && b10 != 6) {
                        if (b10 != 7 && b10 != 8) {
                            if (b11 < 64) {
                                str2 = f38955b[b11];
                            } else {
                                str2 = strArr[b11];
                            }
                            if (b10 == 5 && (b11 & 4) != 0) {
                                str = str2.replace("HEADERS", "PUSH_PROMISE");
                            } else if (b10 == 0 && (b11 & 32) != 0) {
                                str = str2.replace("PRIORITY", "COMPRESSED");
                            } else {
                                str = str2;
                            }
                        }
                    } else if (b11 == 1) {
                        str = "ACK";
                    } else {
                        str = strArr[b11];
                    }
                }
                str = strArr[b11];
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            if (z10) {
                str3 = "<<";
            } else {
                str3 = ">>";
            }
            objArr[0] = str3;
            objArr[1] = Integer.valueOf(i6);
            objArr[2] = Integer.valueOf(i10);
            objArr[3] = format;
            objArr[4] = str;
            return String.format(locale, "%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* compiled from: Http2.java */
    /* loaded from: classes2.dex */
    public static final class c implements yr.b {

        /* renamed from: u  reason: collision with root package name */
        public final zv.h f38957u;

        /* renamed from: v  reason: collision with root package name */
        public final a f38958v;

        /* renamed from: w  reason: collision with root package name */
        public final e.a f38959w;

        public c(t tVar) {
            this.f38957u = tVar;
            a aVar = new a(tVar);
            this.f38958v = aVar;
            this.f38959w = new e.a(aVar);
        }

        public final boolean a(b.a aVar) {
            boolean z10;
            boolean z11;
            short s10;
            wr.i iVar;
            yr.a aVar2;
            u0.g gVar;
            i0 i0Var;
            try {
                this.f38957u.C0(9L);
                zv.h hVar = this.f38957u;
                int readByte = (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
                if (readByte >= 0 && readByte <= 16384) {
                    byte readByte2 = (byte) (this.f38957u.readByte() & 255);
                    byte readByte3 = (byte) (this.f38957u.readByte() & 255);
                    int readInt = this.f38957u.readInt() & SubsamplingScaleImageView.TILE_SIZE_AUTO;
                    Logger logger = f.f38946a;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(b.a(true, readInt, readByte, readByte2, readByte3));
                    }
                    switch (readByte2) {
                        case 0:
                            if ((readByte3 & 1) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if ((readByte3 & 32) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                if ((readByte3 & 8) != 0) {
                                    s10 = (short) (this.f38957u.readByte() & 255);
                                } else {
                                    s10 = 0;
                                }
                                int c10 = f.c(readByte, readByte3, s10);
                                zv.h hVar2 = this.f38957u;
                                i.d dVar = (i.d) aVar;
                                dVar.f37160u.b(1, readInt, hVar2.c(), c10, z10);
                                wr.h o10 = wr.i.this.o(readInt);
                                if (o10 == null) {
                                    if (wr.i.this.p(readInt)) {
                                        synchronized (wr.i.this.f37140k) {
                                            wr.i.this.f37138i.N(readInt, yr.a.STREAM_CLOSED);
                                        }
                                        hVar2.skip(c10);
                                    } else {
                                        wr.i.i(wr.i.this, "Received data for unknown stream: " + readInt);
                                        this.f38957u.skip(s10);
                                        break;
                                    }
                                } else {
                                    long j10 = c10;
                                    hVar2.C0(j10);
                                    zv.e eVar = new zv.e();
                                    eVar.n(hVar2.c(), j10);
                                    fs.c cVar = o10.f37122l.J;
                                    fs.b.f15847a.getClass();
                                    synchronized (wr.i.this.f37140k) {
                                        o10.f37122l.s(eVar, z10);
                                    }
                                }
                                wr.i iVar2 = wr.i.this;
                                int i6 = iVar2.f37147s + c10;
                                iVar2.f37147s = i6;
                                if (i6 >= iVar2.f * 0.5f) {
                                    synchronized (iVar2.f37140k) {
                                        wr.i.this.f37138i.f(0, iVar.f37147s);
                                    }
                                    wr.i.this.f37147s = 0;
                                }
                                this.f38957u.skip(s10);
                            } else {
                                f.d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                                throw null;
                            }
                        case 1:
                            g(aVar, readByte, readByte3, readInt);
                            break;
                        case 2:
                            if (readByte == 5) {
                                if (readInt != 0) {
                                    zv.h hVar3 = this.f38957u;
                                    hVar3.readInt();
                                    hVar3.readByte();
                                    aVar.getClass();
                                    break;
                                } else {
                                    f.d("TYPE_PRIORITY streamId == 0", new Object[0]);
                                    throw null;
                                }
                            } else {
                                f.d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(readByte));
                                throw null;
                            }
                        case 3:
                            m(aVar, readByte, readInt);
                            break;
                        case 4:
                            o(aVar, readByte, readByte3, readInt);
                            break;
                        case 5:
                            j(aVar, readByte, readByte3, readInt);
                            break;
                        case 6:
                            h(aVar, readByte, readByte3, readInt);
                            break;
                        case 7:
                            if (readByte >= 8) {
                                if (readInt == 0) {
                                    zv.h hVar4 = this.f38957u;
                                    int readInt2 = hVar4.readInt();
                                    int readInt3 = hVar4.readInt();
                                    int i10 = readByte - 8;
                                    yr.a[] values = yr.a.values();
                                    int length = values.length;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < length) {
                                            aVar2 = values[i11];
                                            if (aVar2.f38923u != readInt3) {
                                                i11++;
                                            }
                                        } else {
                                            aVar2 = null;
                                        }
                                    }
                                    if (aVar2 != null) {
                                        zv.i iVar3 = zv.i.f39888x;
                                        if (i10 > 0) {
                                            iVar3 = hVar4.p(i10);
                                        }
                                        i.d dVar2 = (i.d) aVar;
                                        dVar2.f37160u.c(1, readInt2, aVar2, iVar3);
                                        yr.a aVar3 = yr.a.ENHANCE_YOUR_CALM;
                                        wr.i iVar4 = wr.i.this;
                                        if (aVar2 == aVar3) {
                                            String u10 = iVar3.u();
                                            wr.i.T.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", dVar2, u10));
                                            if ("too_many_pings".equals(u10)) {
                                                iVar4.L.run();
                                            }
                                        }
                                        long j11 = aVar2.f38923u;
                                        u0.g[] gVarArr = u0.g.f35992x;
                                        if (j11 < gVarArr.length && j11 >= 0) {
                                            gVar = gVarArr[(int) j11];
                                        } else {
                                            gVar = null;
                                        }
                                        if (gVar == null) {
                                            i0Var = i0.c(u0.g.f35991w.f35995v.f33491a.f33498u).g("Unrecognized HTTP/2 error code: " + j11);
                                        } else {
                                            i0Var = gVar.f35995v;
                                        }
                                        i0 a10 = i0Var.a("Received Goaway");
                                        if (iVar3.h() > 0) {
                                            a10 = a10.a(iVar3.u());
                                        }
                                        Map<yr.a, i0> map = wr.i.S;
                                        iVar4.t(readInt2, null, a10);
                                        break;
                                    } else {
                                        f.d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt3));
                                        throw null;
                                    }
                                } else {
                                    f.d("TYPE_GOAWAY streamId != 0", new Object[0]);
                                    throw null;
                                }
                            } else {
                                f.d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(readByte));
                                throw null;
                            }
                            break;
                        case 8:
                            s(aVar, readByte, readInt);
                            break;
                        default:
                            this.f38957u.skip(readByte);
                            break;
                    }
                    return true;
                }
                f.d("FRAME_SIZE_ERROR: %s", Integer.valueOf(readByte));
                throw null;
            } catch (IOException unused) {
                return false;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f38957u.close();
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x00ee, code lost:
            throw new java.io.IOException("Invalid dynamic table size update " + r3.f38937d);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ArrayList e(int i6, short s10, byte b10, int i10) {
            int e10;
            a aVar = this.f38958v;
            aVar.f38952y = i6;
            aVar.f38949v = i6;
            aVar.f38953z = s10;
            aVar.f38950w = b10;
            aVar.f38951x = i10;
            while (true) {
                e.a aVar2 = this.f38959w;
                t tVar = aVar2.f38935b;
                boolean B = tVar.B();
                ArrayList arrayList = aVar2.f38934a;
                if (!B) {
                    int readByte = tVar.readByte() & 255;
                    if (readByte != 128) {
                        boolean z10 = false;
                        if ((readByte & 128) == 128) {
                            e10 = aVar2.e(readByte, 127) - 1;
                            if (e10 >= 0 && e10 <= e.f38932b.length - 1) {
                                z10 = true;
                            }
                            if (z10) {
                                arrayList.add(e.f38932b[e10]);
                            } else {
                                int length = aVar2.f + 1 + (e10 - e.f38932b.length);
                                if (length < 0) {
                                    break;
                                }
                                yr.d[] dVarArr = aVar2.f38938e;
                                if (length > dVarArr.length - 1) {
                                    break;
                                }
                                arrayList.add(dVarArr[length]);
                            }
                        } else if (readByte == 64) {
                            zv.i d10 = aVar2.d();
                            e.a(d10);
                            aVar2.c(new yr.d(d10, aVar2.d()));
                        } else if ((readByte & 64) == 64) {
                            aVar2.c(new yr.d(aVar2.b(aVar2.e(readByte, 63) - 1), aVar2.d()));
                        } else if ((readByte & 32) == 32) {
                            int e11 = aVar2.e(readByte, 31);
                            aVar2.f38937d = e11;
                            if (e11 < 0 || e11 > aVar2.f38936c) {
                                break;
                            }
                            int i11 = aVar2.f38940h;
                            if (e11 < i11) {
                                if (e11 == 0) {
                                    Arrays.fill(aVar2.f38938e, (Object) null);
                                    aVar2.f = aVar2.f38938e.length - 1;
                                    aVar2.f38939g = 0;
                                    aVar2.f38940h = 0;
                                } else {
                                    aVar2.a(i11 - e11);
                                }
                            }
                        } else if (readByte != 16 && readByte != 0) {
                            arrayList.add(new yr.d(aVar2.b(aVar2.e(readByte, 15) - 1), aVar2.d()));
                        } else {
                            zv.i d11 = aVar2.d();
                            e.a(d11);
                            arrayList.add(new yr.d(d11, aVar2.d()));
                        }
                    } else {
                        throw new IOException("index == 0");
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    arrayList.clear();
                    return arrayList2;
                }
            }
            throw new IOException("Header index too large " + (e10 + 1));
        }

        public final void g(b.a aVar, int i6, byte b10, int i10) {
            boolean z10;
            short s10;
            String str;
            i0 i0Var = null;
            boolean z11 = false;
            if (i10 != 0) {
                if ((b10 & 1) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((b10 & 8) != 0) {
                    s10 = (short) (this.f38957u.readByte() & 255);
                } else {
                    s10 = 0;
                }
                if ((b10 & 32) != 0) {
                    zv.h hVar = this.f38957u;
                    hVar.readInt();
                    hVar.readByte();
                    aVar.getClass();
                    i6 -= 5;
                }
                ArrayList e10 = e(f.c(i6, b10, s10), s10, b10, i10);
                i.d dVar = (i.d) aVar;
                j jVar = dVar.f37160u;
                if (jVar.a()) {
                    jVar.f37164a.log(jVar.f37165b, pl.a.n(1) + " HEADERS: streamId=" + i10 + " headers=" + e10 + " endStream=" + z10);
                }
                if (wr.i.this.M != Integer.MAX_VALUE) {
                    long j10 = 0;
                    for (int i11 = 0; i11 < e10.size(); i11++) {
                        yr.d dVar2 = (yr.d) e10.get(i11);
                        j10 += dVar2.f38929b.h() + dVar2.f38928a.h() + 32;
                    }
                    int min = (int) Math.min(j10, 2147483647L);
                    int i12 = wr.i.this.M;
                    if (min > i12) {
                        i0 i0Var2 = i0.f33486k;
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[3];
                        if (z10) {
                            str = "trailer";
                        } else {
                            str = "header";
                        }
                        objArr[0] = str;
                        objArr[1] = Integer.valueOf(i12);
                        objArr[2] = Integer.valueOf(min);
                        i0Var = i0Var2.g(String.format(locale, "Response %s metadata larger than %d: %d", objArr));
                    }
                }
                synchronized (wr.i.this.f37140k) {
                    try {
                        wr.h hVar2 = (wr.h) wr.i.this.f37143n.get(Integer.valueOf(i10));
                        if (hVar2 == null) {
                            if (wr.i.this.p(i10)) {
                                wr.i.this.f37138i.N(i10, yr.a.STREAM_CLOSED);
                            } else {
                                z11 = true;
                            }
                        } else if (i0Var == null) {
                            fs.c cVar = hVar2.f37122l.J;
                            fs.b.f15847a.getClass();
                            hVar2.f37122l.t(e10, z10);
                        } else {
                            if (!z10) {
                                wr.i.this.f37138i.N(i10, yr.a.CANCEL);
                            }
                            hVar2.f37122l.k(new c0(), i0Var, false);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z11) {
                    wr.i.i(wr.i.this, "Received header for unknown stream: " + i10);
                    return;
                }
                return;
            }
            f.d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }

        public final void h(b.a aVar, int i6, byte b10, int i10) {
            boolean z10;
            a1 a1Var = null;
            if (i6 == 8) {
                if (i10 == 0) {
                    int readInt = this.f38957u.readInt();
                    int readInt2 = this.f38957u.readInt();
                    if ((b10 & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i.d dVar = (i.d) aVar;
                    long j10 = (readInt << 32) | (readInt2 & 4294967295L);
                    dVar.f37160u.d(1, j10);
                    if (!z10) {
                        synchronized (wr.i.this.f37140k) {
                            wr.i.this.f37138i.i(readInt, readInt2, true);
                        }
                        return;
                    }
                    synchronized (wr.i.this.f37140k) {
                        wr.i iVar = wr.i.this;
                        a1 a1Var2 = iVar.f37152x;
                        if (a1Var2 != null) {
                            long j11 = a1Var2.f35386a;
                            if (j11 == j10) {
                                iVar.f37152x = null;
                                a1Var = a1Var2;
                            } else {
                                wr.i.T.log(Level.WARNING, String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(j11), Long.valueOf(j10)));
                            }
                        } else {
                            wr.i.T.warning("Received unexpected ping ack. No ping outstanding");
                        }
                    }
                    if (a1Var != null) {
                        a1Var.b();
                        return;
                    }
                    return;
                }
                f.d("TYPE_PING streamId != 0", new Object[0]);
                throw null;
            }
            f.d("TYPE_PING length != 8: %s", Integer.valueOf(i6));
            throw null;
        }

        public final void j(b.a aVar, int i6, byte b10, int i10) {
            short s10 = 0;
            if (i10 != 0) {
                if ((b10 & 8) != 0) {
                    s10 = (short) (this.f38957u.readByte() & 255);
                }
                int readInt = this.f38957u.readInt() & SubsamplingScaleImageView.TILE_SIZE_AUTO;
                ArrayList e10 = e(f.c(i6 - 4, b10, s10), s10, b10, i10);
                i.d dVar = (i.d) aVar;
                j jVar = dVar.f37160u;
                if (jVar.a()) {
                    jVar.f37164a.log(jVar.f37165b, pl.a.n(1) + " PUSH_PROMISE: streamId=" + i10 + " promisedStreamId=" + readInt + " headers=" + e10);
                }
                synchronized (wr.i.this.f37140k) {
                    wr.i.this.f37138i.N(i10, yr.a.PROTOCOL_ERROR);
                }
                return;
            }
            f.d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }

        public final void m(b.a aVar, int i6, int i10) {
            yr.a aVar2;
            boolean z10;
            s.a aVar3;
            if (i6 == 4) {
                if (i10 != 0) {
                    int readInt = this.f38957u.readInt();
                    yr.a[] values = yr.a.values();
                    int length = values.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            aVar2 = values[i11];
                            if (aVar2.f38923u == readInt) {
                                break;
                            }
                            i11++;
                        } else {
                            aVar2 = null;
                            break;
                        }
                    }
                    if (aVar2 != null) {
                        i.d dVar = (i.d) aVar;
                        dVar.f37160u.e(1, i10, aVar2);
                        i0 a10 = wr.i.x(aVar2).a("Rst Stream");
                        i0.a aVar4 = a10.f33491a;
                        if (aVar4 != i0.a.CANCELLED && aVar4 != i0.a.DEADLINE_EXCEEDED) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        synchronized (wr.i.this.f37140k) {
                            wr.h hVar = (wr.h) wr.i.this.f37143n.get(Integer.valueOf(i10));
                            if (hVar != null) {
                                fs.c cVar = hVar.f37122l.J;
                                fs.b.f15847a.getClass();
                                wr.i iVar = wr.i.this;
                                if (aVar2 == yr.a.REFUSED_STREAM) {
                                    aVar3 = s.a.REFUSED;
                                } else {
                                    aVar3 = s.a.PROCESSED;
                                }
                                iVar.l(i10, a10, aVar3, z10, null, null);
                            }
                        }
                        return;
                    }
                    f.d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
                    throw null;
                }
                f.d("TYPE_RST_STREAM streamId == 0", new Object[0]);
                throw null;
            }
            f.d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i6));
            throw null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final void o(b.a aVar, int i6, byte b10, int i10) {
            boolean z10;
            int i11;
            int i12;
            int readInt;
            if (i10 == 0) {
                if ((b10 & 1) != 0) {
                    if (i6 == 0) {
                        aVar.getClass();
                        return;
                    } else {
                        f.d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        throw null;
                    }
                } else if (i6 % 6 == 0) {
                    hg.a aVar2 = new hg.a();
                    int i13 = 0;
                    while (true) {
                        short s10 = 4;
                        if (i13 < i6) {
                            short readShort = this.f38957u.readShort();
                            readInt = this.f38957u.readInt();
                            switch (readShort) {
                                case 1:
                                case 6:
                                    s10 = readShort;
                                    break;
                                case 2:
                                    if (readInt != 0 && readInt != 1) {
                                        f.d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                        throw null;
                                    }
                                    s10 = readShort;
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    if (readInt >= 0) {
                                        s10 = 7;
                                        break;
                                    } else {
                                        f.d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                        throw null;
                                    }
                                case 5:
                                    if (readInt < 16384 || readInt > 16777215) {
                                    }
                                    s10 = readShort;
                                    break;
                                default:
                                    i13 += 6;
                            }
                            aVar2.d(s10, readInt);
                            i13 += 6;
                        } else {
                            i.d dVar = (i.d) aVar;
                            dVar.f37160u.f(1, aVar2);
                            synchronized (wr.i.this.f37140k) {
                                try {
                                    if (aVar2.c(4)) {
                                        wr.i.this.D = ((int[]) aVar2.f17598d)[4];
                                    }
                                    if (aVar2.c(7)) {
                                        z10 = wr.i.this.f37139j.b(((int[]) aVar2.f17598d)[7]);
                                    } else {
                                        z10 = false;
                                    }
                                    if (dVar.f37162w) {
                                        wr.i.this.f37137h.a();
                                        dVar.f37162w = false;
                                    }
                                    wr.i.this.f37138i.g0(aVar2);
                                    if (z10) {
                                        wr.i.this.f37139j.d();
                                    }
                                    wr.i.this.u();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            int i14 = aVar2.f17595a;
                            if ((i14 & 2) != 0) {
                                i11 = ((int[]) aVar2.f17598d)[1];
                            } else {
                                i11 = -1;
                            }
                            if (i11 >= 0) {
                                e.a aVar3 = this.f38959w;
                                if ((i14 & 2) != 0) {
                                    i12 = ((int[]) aVar2.f17598d)[1];
                                } else {
                                    i12 = -1;
                                }
                                aVar3.f38936c = i12;
                                aVar3.f38937d = i12;
                                int i15 = aVar3.f38940h;
                                if (i12 < i15) {
                                    if (i12 == 0) {
                                        Arrays.fill(aVar3.f38938e, (Object) null);
                                        aVar3.f = aVar3.f38938e.length - 1;
                                        aVar3.f38939g = 0;
                                        aVar3.f38940h = 0;
                                        return;
                                    }
                                    aVar3.a(i15 - i12);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    f.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                    throw null;
                } else {
                    f.d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i6));
                    throw null;
                }
            }
            f.d("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void s(b.a aVar, int i6, int i10) {
            boolean z10 = true;
            if (i6 == 4) {
                long readInt = this.f38957u.readInt() & 2147483647L;
                int i11 = (readInt > 0L ? 1 : (readInt == 0L ? 0 : -1));
                if (i11 != 0) {
                    i.d dVar = (i.d) aVar;
                    dVar.f37160u.g(1, i10, readInt);
                    if (i11 == 0) {
                        if (i10 == 0) {
                            wr.i.i(wr.i.this, "Received 0 flow control window increment.");
                            return;
                        } else {
                            wr.i.this.l(i10, i0.f33487l.g("Received 0 flow control window increment."), s.a.PROCESSED, false, yr.a.PROTOCOL_ERROR, null);
                            return;
                        }
                    }
                    synchronized (wr.i.this.f37140k) {
                        if (i10 == 0) {
                            wr.i.this.f37139j.c(null, (int) readInt);
                            return;
                        }
                        wr.h hVar = (wr.h) wr.i.this.f37143n.get(Integer.valueOf(i10));
                        if (hVar != null) {
                            wr.i.this.f37139j.c(hVar.f37122l.r(), (int) readInt);
                        } else if (!wr.i.this.p(i10)) {
                            if (!z10) {
                                wr.i iVar = wr.i.this;
                                wr.i.i(iVar, "Received window_update for unknown stream: " + i10);
                                return;
                            }
                            return;
                        }
                        z10 = false;
                        if (!z10) {
                        }
                    }
                } else {
                    f.d("windowSizeIncrement was 0", new Object[0]);
                    throw null;
                }
            } else {
                f.d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i6));
                throw null;
            }
        }
    }

    /* compiled from: Http2.java */
    /* loaded from: classes2.dex */
    public static final class d implements yr.c {

        /* renamed from: u  reason: collision with root package name */
        public final zv.g f38960u;

        /* renamed from: v  reason: collision with root package name */
        public final boolean f38961v = true;

        /* renamed from: w  reason: collision with root package name */
        public final zv.e f38962w;

        /* renamed from: x  reason: collision with root package name */
        public final e.b f38963x;

        /* renamed from: y  reason: collision with root package name */
        public int f38964y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f38965z;

        public d(zv.s sVar) {
            this.f38960u = sVar;
            zv.e eVar = new zv.e();
            this.f38962w = eVar;
            this.f38963x = new e.b(eVar);
            this.f38964y = 16384;
        }

        @Override // yr.c
        public final int A0() {
            return this.f38964y;
        }

        @Override // yr.c
        public final synchronized void C() {
            if (!this.f38965z) {
                if (!this.f38961v) {
                    return;
                }
                Logger logger = f.f38946a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(String.format(">> CONNECTION %s", f.f38947b.i()));
                }
                this.f38960u.write(f.f38947b.t());
                this.f38960u.flush();
                return;
            }
            throw new IOException("closed");
        }

        @Override // yr.c
        public final synchronized void E(boolean z10, int i6, List list) {
            if (!this.f38965z) {
                e(i6, list, z10);
            } else {
                throw new IOException("closed");
            }
        }

        @Override // yr.c
        public final synchronized void F(yr.a aVar, byte[] bArr) {
            if (!this.f38965z) {
                if (aVar.f38923u != -1) {
                    a(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f38960u.writeInt(0);
                    this.f38960u.writeInt(aVar.f38923u);
                    if (bArr.length > 0) {
                        this.f38960u.write(bArr);
                    }
                    this.f38960u.flush();
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "errorCode.httpCode == -1", new Object[0]));
                }
            } else {
                throw new IOException("closed");
            }
        }

        @Override // yr.c
        public final synchronized void N(int i6, yr.a aVar) {
            if (!this.f38965z) {
                if (aVar.f38923u != -1) {
                    a(i6, 4, (byte) 3, (byte) 0);
                    this.f38960u.writeInt(aVar.f38923u);
                    this.f38960u.flush();
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                throw new IOException("closed");
            }
        }

        @Override // yr.c
        public final synchronized void P(boolean z10, int i6, zv.e eVar, int i10) {
            byte b10;
            if (!this.f38965z) {
                if (z10) {
                    b10 = (byte) 1;
                } else {
                    b10 = 0;
                }
                a(i6, i10, (byte) 0, b10);
                if (i10 > 0) {
                    this.f38960u.n(eVar, i10);
                }
            } else {
                throw new IOException("closed");
            }
        }

        public final void a(int i6, int i10, byte b10, byte b11) {
            Logger logger = f.f38946a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(b.a(false, i6, i10, b10, b11));
            }
            int i11 = this.f38964y;
            if (i10 <= i11) {
                if ((Integer.MIN_VALUE & i6) == 0) {
                    zv.g gVar = this.f38960u;
                    gVar.writeByte((i10 >>> 16) & 255);
                    gVar.writeByte((i10 >>> 8) & 255);
                    gVar.writeByte(i10 & 255);
                    gVar.writeByte(b10 & 255);
                    gVar.writeByte(b11 & 255);
                    gVar.writeInt(i6 & SubsamplingScaleImageView.TILE_SIZE_AUTO);
                    return;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "reserved bit set: %s", Integer.valueOf(i6)));
            }
            throw new IllegalArgumentException(String.format(Locale.US, "FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i11), Integer.valueOf(i10)));
        }

        @Override // yr.c
        public final synchronized void b0(hg.a aVar) {
            int i6;
            if (!this.f38965z) {
                a(0, Integer.bitCount(aVar.f17595a) * 6, (byte) 4, (byte) 0);
                for (int i10 = 0; i10 < 10; i10++) {
                    if (aVar.c(i10)) {
                        if (i10 == 4) {
                            i6 = 3;
                        } else if (i10 == 7) {
                            i6 = 4;
                        } else {
                            i6 = i10;
                        }
                        this.f38960u.writeShort(i6);
                        this.f38960u.writeInt(((int[]) aVar.f17598d)[i10]);
                    }
                }
                this.f38960u.flush();
            } else {
                throw new IOException("closed");
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            this.f38965z = true;
            this.f38960u.close();
        }

        public final void e(int i6, List list, boolean z10) {
            byte b10;
            byte b11;
            int i10;
            int i11;
            if (!this.f38965z) {
                e.b bVar = this.f38963x;
                bVar.getClass();
                int size = list.size();
                int i12 = 0;
                while (true) {
                    int i13 = 1;
                    if (i12 >= size) {
                        break;
                    }
                    yr.d dVar = (yr.d) list.get(i12);
                    zv.i r = dVar.f38928a.r();
                    Integer num = e.f38933c.get(r);
                    zv.i iVar = dVar.f38929b;
                    if (num != null) {
                        i10 = num.intValue() + 1;
                        if (i10 >= 2 && i10 <= 7) {
                            yr.d[] dVarArr = e.f38932b;
                            if (dVarArr[i10 - 1].f38929b.equals(iVar)) {
                                i11 = i10;
                            } else if (dVarArr[i10].f38929b.equals(iVar)) {
                                i11 = i10;
                                i10++;
                            }
                        }
                        i11 = i10;
                        i10 = -1;
                    } else {
                        i10 = -1;
                        i11 = -1;
                    }
                    if (i10 == -1) {
                        int i14 = bVar.f38944d;
                        while (true) {
                            i14 += i13;
                            yr.d[] dVarArr2 = bVar.f38942b;
                            if (i14 >= dVarArr2.length) {
                                break;
                            }
                            if (dVarArr2[i14].f38928a.equals(r)) {
                                if (bVar.f38942b[i14].f38929b.equals(iVar)) {
                                    i10 = e.f38932b.length + (i14 - bVar.f38944d);
                                    break;
                                } else if (i11 == -1) {
                                    i11 = (i14 - bVar.f38944d) + e.f38932b.length;
                                }
                            }
                            i13 = 1;
                        }
                    }
                    if (i10 != -1) {
                        bVar.c(i10, 127, 128);
                    } else if (i11 == -1) {
                        bVar.f38941a.L0(64);
                        bVar.b(r);
                        bVar.b(iVar);
                        bVar.a(dVar);
                    } else {
                        zv.i prefix = e.f38931a;
                        r.getClass();
                        kotlin.jvm.internal.i.g(prefix, "prefix");
                        if (r.p(prefix, prefix.h()) && !yr.d.f38927h.equals(r)) {
                            bVar.c(i11, 15, 0);
                            bVar.b(iVar);
                        } else {
                            bVar.c(i11, 63, 64);
                            bVar.b(iVar);
                            bVar.a(dVar);
                        }
                    }
                    i12++;
                }
                zv.e eVar = this.f38962w;
                long j10 = eVar.f39885v;
                int min = (int) Math.min(this.f38964y, j10);
                long j11 = min;
                int i15 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                if (i15 == 0) {
                    b10 = 4;
                } else {
                    b10 = 0;
                }
                if (z10) {
                    b10 = (byte) (b10 | 1);
                }
                a(i6, min, (byte) 1, b10);
                zv.g gVar = this.f38960u;
                gVar.n(eVar, j11);
                if (i15 > 0) {
                    long j12 = j10 - j11;
                    while (j12 > 0) {
                        int min2 = (int) Math.min(this.f38964y, j12);
                        long j13 = min2;
                        j12 -= j13;
                        if (j12 == 0) {
                            b11 = 4;
                        } else {
                            b11 = 0;
                        }
                        a(i6, min2, (byte) 9, b11);
                        gVar.n(eVar, j13);
                    }
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        @Override // yr.c
        public final synchronized void f(int i6, long j10) {
            if (!this.f38965z) {
                if (j10 != 0 && j10 <= 2147483647L) {
                    a(i6, 4, (byte) 8, (byte) 0);
                    this.f38960u.writeInt((int) j10);
                    this.f38960u.flush();
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10)));
                }
            } else {
                throw new IOException("closed");
            }
        }

        @Override // yr.c
        public final synchronized void flush() {
            if (!this.f38965z) {
                this.f38960u.flush();
            } else {
                throw new IOException("closed");
            }
        }

        @Override // yr.c
        public final synchronized void g0(hg.a aVar) {
            if (!this.f38965z) {
                int i6 = this.f38964y;
                if ((aVar.f17595a & 32) != 0) {
                    i6 = ((int[]) aVar.f17598d)[5];
                }
                this.f38964y = i6;
                a(0, 0, (byte) 4, (byte) 1);
                this.f38960u.flush();
            } else {
                throw new IOException("closed");
            }
        }

        @Override // yr.c
        public final synchronized void i(int i6, int i10, boolean z10) {
            byte b10;
            if (!this.f38965z) {
                if (z10) {
                    b10 = 1;
                } else {
                    b10 = 0;
                }
                a(0, 8, (byte) 6, b10);
                this.f38960u.writeInt(i6);
                this.f38960u.writeInt(i10);
                this.f38960u.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    static {
        zv.i iVar = zv.i.f39888x;
        f38947b = i.a.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int c(int i6, byte b10, short s10) {
        if ((b10 & 8) != 0) {
            i6--;
        }
        if (s10 <= i6) {
            return (short) (i6 - s10);
        }
        d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i6));
        throw null;
    }

    public static void d(String str, Object... objArr) {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    @Override // yr.h
    public final c a(t tVar) {
        return new c(tVar);
    }

    @Override // yr.h
    public final d b(zv.s sVar) {
        return new d(sVar);
    }

    /* compiled from: Http2.java */
    /* loaded from: classes2.dex */
    public static final class a implements z {

        /* renamed from: u  reason: collision with root package name */
        public final zv.h f38948u;

        /* renamed from: v  reason: collision with root package name */
        public int f38949v;

        /* renamed from: w  reason: collision with root package name */
        public byte f38950w;

        /* renamed from: x  reason: collision with root package name */
        public int f38951x;

        /* renamed from: y  reason: collision with root package name */
        public int f38952y;

        /* renamed from: z  reason: collision with root package name */
        public short f38953z;

        public a(t tVar) {
            this.f38948u = tVar;
        }

        @Override // zv.z
        public final a0 d() {
            return this.f38948u.d();
        }

        @Override // zv.z
        public final long o0(zv.e eVar, long j10) {
            int i6;
            int readInt;
            do {
                int i10 = this.f38952y;
                zv.h hVar = this.f38948u;
                if (i10 == 0) {
                    hVar.skip(this.f38953z);
                    this.f38953z = (short) 0;
                    if ((this.f38950w & 4) != 0) {
                        return -1L;
                    }
                    i6 = this.f38951x;
                    Logger logger = f.f38946a;
                    int readByte = ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8) | (hVar.readByte() & 255);
                    this.f38952y = readByte;
                    this.f38949v = readByte;
                    byte readByte2 = (byte) (hVar.readByte() & 255);
                    this.f38950w = (byte) (hVar.readByte() & 255);
                    Logger logger2 = f.f38946a;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine(b.a(true, this.f38951x, this.f38949v, readByte2, this.f38950w));
                    }
                    readInt = hVar.readInt() & SubsamplingScaleImageView.TILE_SIZE_AUTO;
                    this.f38951x = readInt;
                    if (readByte2 != 9) {
                        f.d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte2));
                        throw null;
                    }
                } else {
                    long o02 = hVar.o0(eVar, Math.min(j10, i10));
                    if (o02 == -1) {
                        return -1L;
                    }
                    this.f38952y -= (int) o02;
                    return o02;
                }
            } while (readInt == i6);
            f.d("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // zv.z, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
