package w7;

import c9.q;
import c9.w;
import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import java.util.Collections;
import l8.g;
import nc.c;
import u7.e;
import u7.h;
import u7.i;
import u7.j;
import u7.l;
import u7.m;
import u7.n;
import u7.o;
import u7.s;
import u7.t;
import u7.v;
import u7.x;
import u7.y;
/* compiled from: FlacExtractor.java */
/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: e  reason: collision with root package name */
    public j f36581e;
    public v f;

    /* renamed from: h  reason: collision with root package name */
    public g8.a f36583h;

    /* renamed from: i  reason: collision with root package name */
    public o f36584i;

    /* renamed from: j  reason: collision with root package name */
    public int f36585j;

    /* renamed from: k  reason: collision with root package name */
    public int f36586k;

    /* renamed from: l  reason: collision with root package name */
    public a f36587l;

    /* renamed from: m  reason: collision with root package name */
    public int f36588m;

    /* renamed from: n  reason: collision with root package name */
    public long f36589n;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f36577a = new byte[42];

    /* renamed from: b  reason: collision with root package name */
    public final q f36578b = new q(new byte[32768], 0);

    /* renamed from: c  reason: collision with root package name */
    public final boolean f36579c = false;

    /* renamed from: d  reason: collision with root package name */
    public final l.a f36580d = new l.a();

    /* renamed from: g  reason: collision with root package name */
    public int f36582g = 0;

    @Override // u7.h
    public final boolean b(i iVar) {
        g8.a a10 = new u7.q().a(iVar, g.f24125c);
        if (a10 != null) {
            int length = a10.f16378u.length;
        }
        byte[] bArr = new byte[4];
        ((e) iVar).d(bArr, 0, 4, false);
        if (((bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8)) != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // u7.h
    public final void f(j jVar) {
        this.f36581e = jVar;
        this.f = jVar.n(0, 1);
        jVar.e();
    }

    @Override // u7.h
    public final void g(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f36582g = 0;
        } else {
            a aVar = this.f36587l;
            if (aVar != null) {
                aVar.c(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f36589n = j12;
        this.f36588m = 0;
        this.f36578b.x(0);
    }

    @Override // u7.h
    public final int h(i iVar, s sVar) {
        p7.e eVar;
        byte[] bArr;
        boolean z10;
        g8.a aVar;
        o oVar;
        g8.a aVar2;
        t bVar;
        long j10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i6 = this.f36582g;
        g8.a aVar3 = null;
        int i10 = 1;
        int i11 = 0;
        if (i6 != 0) {
            byte[] bArr2 = this.f36577a;
            if (i6 != 1) {
                int i12 = 24;
                int i13 = 3;
                int i14 = 4;
                if (i6 != 2) {
                    int i15 = 6;
                    int i16 = 7;
                    if (i6 != 3) {
                        long j11 = 0;
                        if (i6 != 4) {
                            if (i6 == 5) {
                                this.f.getClass();
                                this.f36584i.getClass();
                                a aVar4 = this.f36587l;
                                if (aVar4 != null) {
                                    if (aVar4.f33839c != null) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        return aVar4.a(iVar, sVar);
                                    }
                                }
                                if (this.f36589n == -1) {
                                    o oVar2 = this.f36584i;
                                    iVar.k();
                                    iVar.f(1);
                                    byte[] bArr3 = new byte[1];
                                    iVar.b(0, bArr3, 1);
                                    if ((bArr3[0] & 1) == 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    iVar.f(2);
                                    if (z12) {
                                        i15 = 7;
                                    }
                                    q qVar = new q(i15);
                                    byte[] bArr4 = qVar.f5186a;
                                    int i17 = 0;
                                    while (i17 < i15) {
                                        int g5 = iVar.g(0 + i17, bArr4, i15 - i17);
                                        if (g5 == -1) {
                                            break;
                                        }
                                        i17 += g5;
                                    }
                                    qVar.z(i17);
                                    iVar.k();
                                    try {
                                        long w10 = qVar.w();
                                        if (!z12) {
                                            w10 *= oVar2.f33885b;
                                        }
                                        j11 = w10;
                                    } catch (NumberFormatException unused) {
                                        i10 = 0;
                                    }
                                    if (i10 != 0) {
                                        this.f36589n = j11;
                                        return 0;
                                    }
                                    throw ParserException.a(null, null);
                                }
                                q qVar2 = this.f36578b;
                                int i18 = qVar2.f5188c;
                                if (i18 < 32768) {
                                    int read = iVar.read(qVar2.f5186a, i18, 32768 - i18);
                                    if (read != -1) {
                                        i10 = 0;
                                    }
                                    if (i10 == 0) {
                                        qVar2.z(i18 + read);
                                    } else if (qVar2.f5188c - qVar2.f5187b == 0) {
                                        o oVar3 = this.f36584i;
                                        int i19 = w.f5205a;
                                        this.f.d((this.f36589n * 1000000) / oVar3.f33888e, 1, this.f36588m, 0, null);
                                        return -1;
                                    }
                                } else {
                                    i10 = 0;
                                }
                                int i20 = qVar2.f5187b;
                                int i21 = this.f36588m;
                                int i22 = this.f36585j;
                                if (i21 < i22) {
                                    qVar2.B(Math.min(i22 - i21, qVar2.f5188c - i20));
                                }
                                this.f36584i.getClass();
                                int i23 = qVar2.f5187b;
                                while (true) {
                                    int i24 = qVar2.f5188c - 16;
                                    l.a aVar5 = this.f36580d;
                                    if (i23 <= i24) {
                                        qVar2.A(i23);
                                        if (l.a(qVar2, this.f36584i, this.f36586k, aVar5)) {
                                            qVar2.A(i23);
                                            j10 = aVar5.f33881a;
                                            break;
                                        }
                                        i23++;
                                    } else {
                                        if (i10 != 0) {
                                            while (true) {
                                                int i25 = qVar2.f5188c;
                                                if (i23 <= i25 - this.f36585j) {
                                                    qVar2.A(i23);
                                                    try {
                                                        z11 = l.a(qVar2, this.f36584i, this.f36586k, aVar5);
                                                    } catch (IndexOutOfBoundsException unused2) {
                                                        z11 = false;
                                                    }
                                                    if (qVar2.f5187b > qVar2.f5188c) {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        qVar2.A(i23);
                                                        j10 = aVar5.f33881a;
                                                        break;
                                                    }
                                                    i23++;
                                                } else {
                                                    qVar2.A(i25);
                                                    break;
                                                }
                                            }
                                        } else {
                                            qVar2.A(i23);
                                        }
                                        j10 = -1;
                                    }
                                }
                                int i26 = qVar2.f5187b - i20;
                                qVar2.A(i20);
                                this.f.a(i26, qVar2);
                                int i27 = this.f36588m + i26;
                                this.f36588m = i27;
                                if (j10 != -1) {
                                    o oVar4 = this.f36584i;
                                    int i28 = w.f5205a;
                                    this.f.d((this.f36589n * 1000000) / oVar4.f33888e, 1, i27, 0, null);
                                    this.f36588m = 0;
                                    this.f36589n = j10;
                                }
                                int i29 = qVar2.f5188c;
                                int i30 = qVar2.f5187b;
                                int i31 = i29 - i30;
                                if (i31 >= 16) {
                                    return 0;
                                }
                                byte[] bArr5 = qVar2.f5186a;
                                System.arraycopy(bArr5, i30, bArr5, 0, i31);
                                qVar2.A(0);
                                qVar2.z(i31);
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        iVar.k();
                        byte[] bArr6 = new byte[2];
                        iVar.b(0, bArr6, 2);
                        int i32 = (bArr6[1] & 255) | ((bArr6[0] & 255) << 8);
                        if ((i32 >> 2) == 16382) {
                            iVar.k();
                            this.f36586k = i32;
                            j jVar = this.f36581e;
                            int i33 = w.f5205a;
                            long position = iVar.getPosition();
                            long length = iVar.getLength();
                            this.f36584i.getClass();
                            o oVar5 = this.f36584i;
                            if (oVar5.f33893k != null) {
                                bVar = new n(oVar5, position);
                            } else if (length != -1 && oVar5.f33892j > 0) {
                                a aVar6 = new a(oVar5, this.f36586k, position, length);
                                this.f36587l = aVar6;
                                bVar = aVar6.f33837a;
                            } else {
                                bVar = new t.b(oVar5.c());
                            }
                            jVar.i(bVar);
                            this.f36582g = 5;
                            return 0;
                        }
                        iVar.k();
                        throw ParserException.a("First frame does not start with sync code.", null);
                    }
                    o oVar6 = this.f36584i;
                    boolean z14 = false;
                    while (!z14) {
                        iVar.k();
                        x xVar = new x(new byte[i14], i10, i11);
                        iVar.b(i11, xVar.f33924b, i14);
                        boolean h10 = xVar.h();
                        int i34 = xVar.i(i16);
                        int i35 = xVar.i(i12) + i14;
                        if (i34 == 0) {
                            byte[] bArr7 = new byte[38];
                            iVar.readFully(bArr7, i11, 38);
                            oVar6 = new o(bArr7, i14);
                            z10 = h10;
                        } else if (oVar6 != null) {
                            if (i34 == i13) {
                                q qVar3 = new q(i35);
                                iVar.readFully(qVar3.f5186a, i11, i35);
                                z10 = h10;
                                oVar = new o(oVar6.f33884a, oVar6.f33885b, oVar6.f33886c, oVar6.f33887d, oVar6.f33888e, oVar6.f33889g, oVar6.f33890h, oVar6.f33892j, m.a(qVar3), oVar6.f33894l);
                            } else {
                                z10 = h10;
                                g8.a aVar7 = oVar6.f33894l;
                                if (i34 == i14) {
                                    q qVar4 = new q(i35);
                                    iVar.readFully(qVar4.f5186a, 0, i35);
                                    qVar4.B(i14);
                                    g8.a a10 = o.a(Arrays.asList(y.a(qVar4, false, false).f33928a), Collections.emptyList());
                                    if (aVar7 == null) {
                                        aVar2 = a10;
                                    } else {
                                        if (a10 != null) {
                                            aVar7 = aVar7.a(a10.f16378u);
                                        }
                                        aVar2 = aVar7;
                                    }
                                    oVar = new o(oVar6.f33884a, oVar6.f33885b, oVar6.f33886c, oVar6.f33887d, oVar6.f33888e, oVar6.f33889g, oVar6.f33890h, oVar6.f33892j, oVar6.f33893k, aVar2);
                                } else if (i34 == 6) {
                                    q qVar5 = new q(i35);
                                    iVar.readFully(qVar5.f5186a, 0, i35);
                                    qVar5.B(4);
                                    int c10 = qVar5.c();
                                    String o10 = qVar5.o(qVar5.c(), c.f25986a);
                                    String n10 = qVar5.n(qVar5.c());
                                    int c11 = qVar5.c();
                                    int c12 = qVar5.c();
                                    int c13 = qVar5.c();
                                    int c14 = qVar5.c();
                                    int c15 = qVar5.c();
                                    byte[] bArr8 = new byte[c15];
                                    qVar5.b(0, bArr8, c15);
                                    g8.a a11 = o.a(Collections.emptyList(), Collections.singletonList(new j8.a(c10, o10, n10, c11, c12, c13, c14, bArr8)));
                                    if (aVar7 == null) {
                                        aVar = a11;
                                    } else {
                                        if (a11 != null) {
                                            aVar7 = aVar7.a(a11.f16378u);
                                        }
                                        aVar = aVar7;
                                    }
                                    oVar = new o(oVar6.f33884a, oVar6.f33885b, oVar6.f33886c, oVar6.f33887d, oVar6.f33888e, oVar6.f33889g, oVar6.f33890h, oVar6.f33892j, oVar6.f33893k, aVar);
                                } else {
                                    iVar.l(i35);
                                }
                            }
                            oVar6 = oVar;
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i36 = w.f5205a;
                        this.f36584i = oVar6;
                        z14 = z10;
                        i10 = 1;
                        i11 = 0;
                        i12 = 24;
                        i13 = 3;
                        i14 = 4;
                        i16 = 7;
                    }
                    this.f36584i.getClass();
                    this.f36585j = Math.max(this.f36584i.f33886c, 6);
                    v vVar = this.f;
                    int i37 = w.f5205a;
                    vVar.e(this.f36584i.d(bArr2, this.f36583h));
                    this.f36582g = 4;
                    return 0;
                }
                iVar.readFully(new byte[4], 0, 4);
                if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 1716281667) {
                    this.f36582g = 3;
                    return 0;
                }
                throw ParserException.a("Failed to read FLAC stream marker.", null);
            }
            iVar.b(0, bArr2, bArr2.length);
            iVar.k();
            this.f36582g = 2;
            return 0;
        }
        boolean z15 = !this.f36579c;
        iVar.k();
        long e10 = iVar.e();
        if (z15) {
            eVar = null;
        } else {
            eVar = g.f24125c;
        }
        g8.a a12 = new u7.q().a(iVar, eVar);
        if (a12 != null && a12.f16378u.length != 0) {
            aVar3 = a12;
        }
        iVar.l((int) (iVar.e() - e10));
        this.f36583h = aVar3;
        this.f36582g = 1;
        return 0;
    }

    @Override // u7.h
    public final void a() {
    }
}
