package sv;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.theinnerhour.b2b.utils.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import sv.p;
import sv.s;
import ta.v;
/* compiled from: Hpack.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final sv.b[] f32105a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<zv.i, Integer> f32106b;

    /* compiled from: Hpack.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public final zv.t f32110d;

        /* renamed from: g  reason: collision with root package name */
        public int f32112g;

        /* renamed from: h  reason: collision with root package name */
        public int f32113h;

        /* renamed from: a  reason: collision with root package name */
        public final int f32107a = 4096;

        /* renamed from: b  reason: collision with root package name */
        public int f32108b = 4096;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f32109c = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public sv.b[] f32111e = new sv.b[8];
        public int f = 7;

        public a(p.b bVar) {
            this.f32110d = v.j(bVar);
        }

        public final int a(int i6) {
            int i10;
            int i11 = 0;
            if (i6 > 0) {
                int length = this.f32111e.length;
                while (true) {
                    length--;
                    i10 = this.f;
                    if (length < i10 || i6 <= 0) {
                        break;
                    }
                    sv.b bVar = this.f32111e[length];
                    kotlin.jvm.internal.i.d(bVar);
                    int i12 = bVar.f32104c;
                    i6 -= i12;
                    this.f32113h -= i12;
                    this.f32112g--;
                    i11++;
                }
                sv.b[] bVarArr = this.f32111e;
                System.arraycopy(bVarArr, i10 + 1, bVarArr, i10 + 1 + i11, this.f32112g);
                this.f += i11;
            }
            return i11;
        }

        public final zv.i b(int i6) {
            boolean z10;
            if (i6 >= 0 && i6 <= c.f32105a.length - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return c.f32105a[i6].f32102a;
            }
            int length = this.f + 1 + (i6 - c.f32105a.length);
            if (length >= 0) {
                sv.b[] bVarArr = this.f32111e;
                if (length < bVarArr.length) {
                    sv.b bVar = bVarArr[length];
                    kotlin.jvm.internal.i.d(bVar);
                    return bVar.f32102a;
                }
            }
            throw new IOException(kotlin.jvm.internal.i.n(Integer.valueOf(i6 + 1), "Header index too large "));
        }

        public final void c(sv.b bVar) {
            this.f32109c.add(bVar);
            int i6 = this.f32108b;
            int i10 = bVar.f32104c;
            if (i10 > i6) {
                is.i.N1(this.f32111e, null);
                this.f = this.f32111e.length - 1;
                this.f32112g = 0;
                this.f32113h = 0;
                return;
            }
            a((this.f32113h + i10) - i6);
            int i11 = this.f32112g + 1;
            sv.b[] bVarArr = this.f32111e;
            if (i11 > bVarArr.length) {
                sv.b[] bVarArr2 = new sv.b[bVarArr.length * 2];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.f = this.f32111e.length - 1;
                this.f32111e = bVarArr2;
            }
            int i12 = this.f;
            this.f = i12 - 1;
            this.f32111e[i12] = bVar;
            this.f32112g++;
            this.f32113h += i10;
        }

        public final zv.i d() {
            boolean z10;
            int i6;
            zv.t source = this.f32110d;
            byte readByte = source.readByte();
            byte[] bArr = mv.b.f25755a;
            int i10 = readByte & 255;
            int i11 = 0;
            if ((i10 & 128) == 128) {
                z10 = true;
            } else {
                z10 = false;
            }
            long e10 = e(i10, 127);
            if (z10) {
                zv.e eVar = new zv.e();
                int[] iArr = s.f32213a;
                kotlin.jvm.internal.i.g(source, "source");
                s.a aVar = s.f32215c;
                long j10 = 0;
                s.a aVar2 = aVar;
                int i12 = 0;
                while (j10 < e10) {
                    j10++;
                    byte readByte2 = source.readByte();
                    byte[] bArr2 = mv.b.f25755a;
                    i11 = (i11 << 8) | (readByte2 & 255);
                    i12 += 8;
                    while (i12 >= 8) {
                        int i13 = i12 - 8;
                        s.a[] aVarArr = aVar2.f32216a;
                        kotlin.jvm.internal.i.d(aVarArr);
                        aVar2 = aVarArr[(i11 >>> i13) & 255];
                        kotlin.jvm.internal.i.d(aVar2);
                        if (aVar2.f32216a == null) {
                            eVar.L0(aVar2.f32217b);
                            i12 -= aVar2.f32218c;
                            aVar2 = aVar;
                        } else {
                            i12 = i13;
                        }
                    }
                }
                while (i12 > 0) {
                    s.a[] aVarArr2 = aVar2.f32216a;
                    kotlin.jvm.internal.i.d(aVarArr2);
                    s.a aVar3 = aVarArr2[(i11 << (8 - i12)) & 255];
                    kotlin.jvm.internal.i.d(aVar3);
                    if (aVar3.f32216a != null || (i6 = aVar3.f32218c) > i12) {
                        break;
                    }
                    eVar.L0(aVar3.f32217b);
                    i12 -= i6;
                    aVar2 = aVar;
                }
                return eVar.e0();
            }
            return source.p(e10);
        }

        public final int e(int i6, int i10) {
            int i11 = i6 & i10;
            if (i11 < i10) {
                return i11;
            }
            int i12 = 0;
            while (true) {
                byte readByte = this.f32110d.readByte();
                byte[] bArr = mv.b.f25755a;
                int i13 = readByte & 255;
                if ((i13 & 128) != 0) {
                    i10 += (i13 & 127) << i12;
                    i12 += 7;
                } else {
                    return i10 + (i13 << i12);
                }
            }
        }
    }

    /* compiled from: Hpack.kt */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public final zv.e f32115b;

        /* renamed from: d  reason: collision with root package name */
        public boolean f32117d;

        /* renamed from: h  reason: collision with root package name */
        public int f32120h;

        /* renamed from: i  reason: collision with root package name */
        public int f32121i;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f32114a = true;

        /* renamed from: c  reason: collision with root package name */
        public int f32116c = SubsamplingScaleImageView.TILE_SIZE_AUTO;

        /* renamed from: e  reason: collision with root package name */
        public int f32118e = 4096;
        public sv.b[] f = new sv.b[8];

        /* renamed from: g  reason: collision with root package name */
        public int f32119g = 7;

        public b(zv.e eVar) {
            this.f32115b = eVar;
        }

        public final void a(int i6) {
            int i10;
            if (i6 > 0) {
                int length = this.f.length - 1;
                int i11 = 0;
                while (true) {
                    i10 = this.f32119g;
                    if (length < i10 || i6 <= 0) {
                        break;
                    }
                    sv.b bVar = this.f[length];
                    kotlin.jvm.internal.i.d(bVar);
                    i6 -= bVar.f32104c;
                    int i12 = this.f32121i;
                    sv.b bVar2 = this.f[length];
                    kotlin.jvm.internal.i.d(bVar2);
                    this.f32121i = i12 - bVar2.f32104c;
                    this.f32120h--;
                    i11++;
                    length--;
                }
                sv.b[] bVarArr = this.f;
                int i13 = i10 + 1;
                System.arraycopy(bVarArr, i13, bVarArr, i13 + i11, this.f32120h);
                sv.b[] bVarArr2 = this.f;
                int i14 = this.f32119g + 1;
                Arrays.fill(bVarArr2, i14, i14 + i11, (Object) null);
                this.f32119g += i11;
            }
        }

        public final void b(sv.b bVar) {
            int i6 = this.f32118e;
            int i10 = bVar.f32104c;
            if (i10 > i6) {
                is.i.N1(this.f, null);
                this.f32119g = this.f.length - 1;
                this.f32120h = 0;
                this.f32121i = 0;
                return;
            }
            a((this.f32121i + i10) - i6);
            int i11 = this.f32120h + 1;
            sv.b[] bVarArr = this.f;
            if (i11 > bVarArr.length) {
                sv.b[] bVarArr2 = new sv.b[bVarArr.length * 2];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.f32119g = this.f.length - 1;
                this.f = bVarArr2;
            }
            int i12 = this.f32119g;
            this.f32119g = i12 - 1;
            this.f[i12] = bVar;
            this.f32120h++;
            this.f32121i += i10;
        }

        public final void c(zv.i data) {
            kotlin.jvm.internal.i.g(data, "data");
            boolean z10 = this.f32114a;
            zv.e eVar = this.f32115b;
            int i6 = 0;
            if (z10) {
                int[] iArr = s.f32213a;
                int h10 = data.h();
                long j10 = 0;
                int i10 = 0;
                while (i10 < h10) {
                    int i11 = i10 + 1;
                    byte k10 = data.k(i10);
                    byte[] bArr = mv.b.f25755a;
                    j10 += s.f32214b[k10 & 255];
                    i10 = i11;
                }
                if (((int) ((j10 + 7) >> 3)) < data.h()) {
                    zv.e eVar2 = new zv.e();
                    int[] iArr2 = s.f32213a;
                    int h11 = data.h();
                    long j11 = 0;
                    byte b10 = 0;
                    while (i6 < h11) {
                        int i12 = i6 + 1;
                        byte k11 = data.k(i6);
                        byte[] bArr2 = mv.b.f25755a;
                        int i13 = k11 & 255;
                        int i14 = s.f32213a[i13];
                        byte b11 = s.f32214b[i13];
                        j11 = (j11 << b11) | i14;
                        int i15 = b10 + b11;
                        while (i15 >= 8) {
                            i15 = (i15 == 1 ? 1 : 0) - 8;
                            eVar2.L0((int) (j11 >> i15));
                        }
                        i6 = i12;
                        b10 = i15;
                    }
                    if (b10 > 0) {
                        eVar2.L0((int) ((255 >>> b10) | (j11 << (8 - b10))));
                    }
                    zv.i e0 = eVar2.e0();
                    e(e0.h(), 127, 128);
                    eVar.B0(e0);
                    return;
                }
            }
            e(data.h(), 127, 0);
            eVar.B0(data);
        }

        public final void d(ArrayList arrayList) {
            int i6;
            int i10;
            boolean z10;
            if (this.f32117d) {
                int i11 = this.f32116c;
                if (i11 < this.f32118e) {
                    e(i11, 31, 32);
                }
                this.f32117d = false;
                this.f32116c = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                e(this.f32118e, 31, 32);
            }
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                int i13 = i12 + 1;
                sv.b bVar = (sv.b) arrayList.get(i12);
                zv.i r = bVar.f32102a.r();
                Integer num = c.f32106b.get(r);
                zv.i iVar = bVar.f32103b;
                if (num != null) {
                    i6 = num.intValue() + 1;
                    if (2 <= i6 && i6 < 8) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        sv.b[] bVarArr = c.f32105a;
                        if (kotlin.jvm.internal.i.b(bVarArr[i6 - 1].f32103b, iVar)) {
                            i10 = i6;
                        } else if (kotlin.jvm.internal.i.b(bVarArr[i6].f32103b, iVar)) {
                            i10 = i6;
                            i6++;
                        }
                    }
                    i10 = i6;
                    i6 = -1;
                } else {
                    i6 = -1;
                    i10 = -1;
                }
                if (i6 == -1) {
                    int i14 = this.f32119g + 1;
                    int length = this.f.length;
                    while (true) {
                        if (i14 >= length) {
                            break;
                        }
                        int i15 = i14 + 1;
                        sv.b bVar2 = this.f[i14];
                        kotlin.jvm.internal.i.d(bVar2);
                        if (kotlin.jvm.internal.i.b(bVar2.f32102a, r)) {
                            sv.b bVar3 = this.f[i14];
                            kotlin.jvm.internal.i.d(bVar3);
                            if (kotlin.jvm.internal.i.b(bVar3.f32103b, iVar)) {
                                i6 = c.f32105a.length + (i14 - this.f32119g);
                                break;
                            } else if (i10 == -1) {
                                i10 = c.f32105a.length + (i14 - this.f32119g);
                            }
                        }
                        i14 = i15;
                    }
                }
                if (i6 != -1) {
                    e(i6, 127, 128);
                } else if (i10 == -1) {
                    this.f32115b.L0(64);
                    c(r);
                    c(iVar);
                    b(bVar);
                } else {
                    zv.i prefix = sv.b.f32097d;
                    r.getClass();
                    kotlin.jvm.internal.i.g(prefix, "prefix");
                    if (r.p(prefix, prefix.h()) && !kotlin.jvm.internal.i.b(sv.b.f32101i, r)) {
                        e(i10, 15, 0);
                        c(iVar);
                    } else {
                        e(i10, 63, 64);
                        c(iVar);
                        b(bVar);
                    }
                }
                i12 = i13;
            }
        }

        public final void e(int i6, int i10, int i11) {
            zv.e eVar = this.f32115b;
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
        sv.b bVar = new sv.b(sv.b.f32101i, "");
        int i6 = 0;
        zv.i iVar = sv.b.f;
        zv.i iVar2 = sv.b.f32099g;
        zv.i iVar3 = sv.b.f32100h;
        zv.i iVar4 = sv.b.f32098e;
        sv.b[] bVarArr = {bVar, new sv.b(iVar, "GET"), new sv.b(iVar, "POST"), new sv.b(iVar2, "/"), new sv.b(iVar2, "/index.html"), new sv.b(iVar3, "http"), new sv.b(iVar3, "https"), new sv.b(iVar4, "200"), new sv.b(iVar4, "204"), new sv.b(iVar4, "206"), new sv.b(iVar4, "304"), new sv.b(iVar4, "400"), new sv.b(iVar4, "404"), new sv.b(iVar4, "500"), new sv.b("accept-charset", ""), new sv.b("accept-encoding", "gzip, deflate"), new sv.b("accept-language", ""), new sv.b("accept-ranges", ""), new sv.b("accept", ""), new sv.b("access-control-allow-origin", ""), new sv.b("age", ""), new sv.b("allow", ""), new sv.b("authorization", ""), new sv.b("cache-control", ""), new sv.b("content-disposition", ""), new sv.b("content-encoding", ""), new sv.b("content-language", ""), new sv.b("content-length", ""), new sv.b("content-location", ""), new sv.b("content-range", ""), new sv.b("content-type", ""), new sv.b("cookie", ""), new sv.b("date", ""), new sv.b("etag", ""), new sv.b("expect", ""), new sv.b("expires", ""), new sv.b("from", ""), new sv.b("host", ""), new sv.b("if-match", ""), new sv.b("if-modified-since", ""), new sv.b("if-none-match", ""), new sv.b("if-range", ""), new sv.b("if-unmodified-since", ""), new sv.b("last-modified", ""), new sv.b(Constants.API_COURSE_LINK, ""), new sv.b("location", ""), new sv.b("max-forwards", ""), new sv.b("proxy-authenticate", ""), new sv.b("proxy-authorization", ""), new sv.b("range", ""), new sv.b("referer", ""), new sv.b("refresh", ""), new sv.b("retry-after", ""), new sv.b("server", ""), new sv.b("set-cookie", ""), new sv.b("strict-transport-security", ""), new sv.b("transfer-encoding", ""), new sv.b("user-agent", ""), new sv.b("vary", ""), new sv.b("via", ""), new sv.b("www-authenticate", "")};
        f32105a = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (i6 < 61) {
            int i10 = i6 + 1;
            if (!linkedHashMap.containsKey(bVarArr[i6].f32102a)) {
                linkedHashMap.put(bVarArr[i6].f32102a, Integer.valueOf(i6));
            }
            i6 = i10;
        }
        Map<zv.i, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.i.f(unmodifiableMap, "unmodifiableMap(result)");
        f32106b = unmodifiableMap;
    }

    public static void a(zv.i name) {
        boolean z10;
        kotlin.jvm.internal.i.g(name, "name");
        int h10 = name.h();
        int i6 = 0;
        while (i6 < h10) {
            int i10 = i6 + 1;
            byte k10 = name.k(i6);
            if (65 <= k10 && k10 <= 90) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                i6 = i10;
            } else {
                throw new IOException(kotlin.jvm.internal.i.n(name.u(), "PROTOCOL_ERROR response malformed: mixed case name: "));
            }
        }
    }
}
