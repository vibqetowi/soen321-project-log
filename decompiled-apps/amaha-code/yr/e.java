package yr;

import com.theinnerhour.b2b.utils.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import ta.v;
import yr.f;
import yr.g;
import zv.i;
import zv.t;
/* compiled from: Hpack.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final i f38931a;

    /* renamed from: b  reason: collision with root package name */
    public static final d[] f38932b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map<i, Integer> f38933c;

    /* compiled from: Hpack.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public final t f38935b;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f38934a = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public d[] f38938e = new d[8];
        public int f = 7;

        /* renamed from: g  reason: collision with root package name */
        public int f38939g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f38940h = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f38936c = 4096;

        /* renamed from: d  reason: collision with root package name */
        public int f38937d = 4096;

        public a(f.a aVar) {
            this.f38935b = v.j(aVar);
        }

        public final int a(int i6) {
            int i10;
            int i11 = 0;
            if (i6 > 0) {
                int length = this.f38938e.length;
                while (true) {
                    length--;
                    i10 = this.f;
                    if (length < i10 || i6 <= 0) {
                        break;
                    }
                    int i12 = this.f38938e[length].f38930c;
                    i6 -= i12;
                    this.f38940h -= i12;
                    this.f38939g--;
                    i11++;
                }
                d[] dVarArr = this.f38938e;
                System.arraycopy(dVarArr, i10 + 1, dVarArr, i10 + 1 + i11, this.f38939g);
                this.f += i11;
            }
            return i11;
        }

        public final i b(int i6) {
            boolean z10;
            if (i6 >= 0 && i6 <= e.f38932b.length - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return e.f38932b[i6].f38928a;
            }
            int length = this.f + 1 + (i6 - e.f38932b.length);
            if (length >= 0) {
                d[] dVarArr = this.f38938e;
                if (length < dVarArr.length) {
                    return dVarArr[length].f38928a;
                }
            }
            throw new IOException("Header index too large " + (i6 + 1));
        }

        public final void c(d dVar) {
            this.f38934a.add(dVar);
            int i6 = this.f38937d;
            int i10 = dVar.f38930c;
            if (i10 > i6) {
                Arrays.fill(this.f38938e, (Object) null);
                this.f = this.f38938e.length - 1;
                this.f38939g = 0;
                this.f38940h = 0;
                return;
            }
            a((this.f38940h + i10) - i6);
            int i11 = this.f38939g + 1;
            d[] dVarArr = this.f38938e;
            if (i11 > dVarArr.length) {
                d[] dVarArr2 = new d[dVarArr.length * 2];
                System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                this.f = this.f38938e.length - 1;
                this.f38938e = dVarArr2;
            }
            int i12 = this.f;
            this.f = i12 - 1;
            this.f38938e[i12] = dVar;
            this.f38939g++;
            this.f38940h += i10;
        }

        public final i d() {
            boolean z10;
            int i6;
            t tVar = this.f38935b;
            int readByte = tVar.readByte() & 255;
            if ((readByte & 128) == 128) {
                z10 = true;
            } else {
                z10 = false;
            }
            int e10 = e(readByte, 127);
            if (z10) {
                g gVar = g.f38968d;
                long j10 = e10;
                tVar.C0(j10);
                byte[] c0 = tVar.f39915v.c0(j10);
                gVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                g.a aVar = gVar.f38969a;
                g.a aVar2 = aVar;
                int i10 = 0;
                int i11 = 0;
                for (byte b10 : c0) {
                    i10 = (i10 << 8) | (b10 & 255);
                    i11 += 8;
                    while (i11 >= 8) {
                        int i12 = i11 - 8;
                        aVar2 = aVar2.f38970a[(i10 >>> i12) & 255];
                        if (aVar2.f38970a == null) {
                            byteArrayOutputStream.write(aVar2.f38971b);
                            i11 -= aVar2.f38972c;
                            aVar2 = aVar;
                        } else {
                            i11 = i12;
                        }
                    }
                }
                while (i11 > 0) {
                    g.a aVar3 = aVar2.f38970a[(i10 << (8 - i11)) & 255];
                    if (aVar3.f38970a != null || (i6 = aVar3.f38972c) > i11) {
                        break;
                    }
                    byteArrayOutputStream.write(aVar3.f38971b);
                    i11 -= i6;
                    aVar2 = aVar;
                }
                return i.l(byteArrayOutputStream.toByteArray());
            }
            return tVar.p(e10);
        }

        public final int e(int i6, int i10) {
            int i11 = i6 & i10;
            if (i11 < i10) {
                return i11;
            }
            int i12 = 0;
            while (true) {
                int readByte = this.f38935b.readByte() & 255;
                if ((readByte & 128) != 0) {
                    i10 += (readByte & 127) << i12;
                    i12 += 7;
                } else {
                    return i10 + (readByte << i12);
                }
            }
        }
    }

    /* compiled from: Hpack.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final zv.e f38941a;

        /* renamed from: c  reason: collision with root package name */
        public int f38943c;

        /* renamed from: e  reason: collision with root package name */
        public int f38945e;

        /* renamed from: b  reason: collision with root package name */
        public d[] f38942b = new d[8];

        /* renamed from: d  reason: collision with root package name */
        public int f38944d = 7;

        public b(zv.e eVar) {
            this.f38941a = eVar;
        }

        public final void a(d dVar) {
            int i6;
            int i10 = dVar.f38930c;
            if (i10 > 4096) {
                Arrays.fill(this.f38942b, (Object) null);
                this.f38944d = this.f38942b.length - 1;
                this.f38943c = 0;
                this.f38945e = 0;
                return;
            }
            int i11 = (this.f38945e + i10) - 4096;
            if (i11 > 0) {
                int length = this.f38942b.length - 1;
                int i12 = 0;
                while (true) {
                    i6 = this.f38944d;
                    if (length < i6 || i11 <= 0) {
                        break;
                    }
                    int i13 = this.f38942b[length].f38930c;
                    i11 -= i13;
                    this.f38945e -= i13;
                    this.f38943c--;
                    i12++;
                    length--;
                }
                d[] dVarArr = this.f38942b;
                int i14 = i6 + 1;
                System.arraycopy(dVarArr, i14, dVarArr, i14 + i12, this.f38943c);
                this.f38944d += i12;
            }
            int i15 = this.f38943c + 1;
            d[] dVarArr2 = this.f38942b;
            if (i15 > dVarArr2.length) {
                d[] dVarArr3 = new d[dVarArr2.length * 2];
                System.arraycopy(dVarArr2, 0, dVarArr3, dVarArr2.length, dVarArr2.length);
                this.f38944d = this.f38942b.length - 1;
                this.f38942b = dVarArr3;
            }
            int i16 = this.f38944d;
            this.f38944d = i16 - 1;
            this.f38942b[i16] = dVar;
            this.f38943c++;
            this.f38945e += i10;
        }

        public final void b(i iVar) {
            c(iVar.h(), 127, 0);
            this.f38941a.B0(iVar);
        }

        public final void c(int i6, int i10, int i11) {
            zv.e eVar = this.f38941a;
            if (i6 < i10) {
                eVar.L0(i6 | i11);
                return;
            }
            eVar.L0(i11 | i10);
            int i12 = i6 - i10;
            while (i12 >= 128) {
                eVar.L0(128 | (i12 & 127));
                i12 >>>= 7;
            }
            eVar.L0(i12);
        }
    }

    static {
        i iVar = i.f39888x;
        f38931a = i.a.c(":");
        d dVar = new d(d.f38927h, "");
        i iVar2 = d.f38925e;
        i iVar3 = d.f;
        i iVar4 = d.f38926g;
        i iVar5 = d.f38924d;
        d[] dVarArr = {dVar, new d(iVar2, "GET"), new d(iVar2, "POST"), new d(iVar3, "/"), new d(iVar3, "/index.html"), new d(iVar4, "http"), new d(iVar4, "https"), new d(iVar5, "200"), new d(iVar5, "204"), new d(iVar5, "206"), new d(iVar5, "304"), new d(iVar5, "400"), new d(iVar5, "404"), new d(iVar5, "500"), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d(Constants.API_COURSE_LINK, ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        f38932b = dVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i6 = 0; i6 < 61; i6++) {
            if (!linkedHashMap.containsKey(dVarArr[i6].f38928a)) {
                linkedHashMap.put(dVarArr[i6].f38928a, Integer.valueOf(i6));
            }
        }
        f38933c = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(i iVar) {
        int h10 = iVar.h();
        for (int i6 = 0; i6 < h10; i6++) {
            byte k10 = iVar.k(i6);
            if (k10 >= 65 && k10 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(iVar.u()));
            }
        }
    }
}
