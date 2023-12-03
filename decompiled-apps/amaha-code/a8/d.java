package a8;

import a8.e;
import android.util.Log;
import c9.q;
import c9.w;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.n;
import g8.a;
import java.io.EOFException;
import l8.l;
import q7.p;
import u7.h;
import u7.i;
import u7.j;
import u7.s;
import u7.v;
/* compiled from: Mp3Extractor.java */
/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: u  reason: collision with root package name */
    public static final p7.e f345u = new p7.e(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f346a;

    /* renamed from: b  reason: collision with root package name */
    public final long f347b;

    /* renamed from: c  reason: collision with root package name */
    public final q f348c;

    /* renamed from: d  reason: collision with root package name */
    public final p.a f349d;

    /* renamed from: e  reason: collision with root package name */
    public final u7.p f350e;
    public final u7.q f;

    /* renamed from: g  reason: collision with root package name */
    public final u7.g f351g;

    /* renamed from: h  reason: collision with root package name */
    public j f352h;

    /* renamed from: i  reason: collision with root package name */
    public v f353i;

    /* renamed from: j  reason: collision with root package name */
    public v f354j;

    /* renamed from: k  reason: collision with root package name */
    public int f355k;

    /* renamed from: l  reason: collision with root package name */
    public g8.a f356l;

    /* renamed from: m  reason: collision with root package name */
    public long f357m;

    /* renamed from: n  reason: collision with root package name */
    public long f358n;

    /* renamed from: o  reason: collision with root package name */
    public long f359o;

    /* renamed from: p  reason: collision with root package name */
    public int f360p;

    /* renamed from: q  reason: collision with root package name */
    public e f361q;
    public boolean r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f362s;

    /* renamed from: t  reason: collision with root package name */
    public long f363t;

    public d() {
        this(0);
    }

    public static long d(g8.a aVar) {
        a.b[] bVarArr;
        if (aVar != null) {
            for (a.b bVar : aVar.f16378u) {
                if (bVar instanceof l) {
                    l lVar = (l) bVar;
                    if (lVar.f24130u.equals("TLEN")) {
                        return w.y(Long.parseLong(lVar.f24142w));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // u7.h
    public final boolean b(i iVar) {
        return i(iVar, true);
    }

    public final a c(i iVar, boolean z10) {
        q qVar = this.f348c;
        iVar.b(0, qVar.f5186a, 4);
        qVar.A(0);
        this.f349d.a(qVar.c());
        return new a(iVar.getLength(), iVar.getPosition(), this.f349d, z10);
    }

    public final boolean e(i iVar) {
        e eVar = this.f361q;
        if (eVar != null) {
            long c10 = eVar.c();
            if (c10 != -1 && iVar.e() > c10 - 4) {
                return true;
            }
        }
        try {
            return !iVar.d(this.f348c.f5186a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // u7.h
    public final void f(j jVar) {
        this.f352h = jVar;
        v n10 = jVar.n(0, 1);
        this.f353i = n10;
        this.f354j = n10;
        this.f352h.e();
    }

    @Override // u7.h
    public final void g(long j10, long j11) {
        this.f355k = 0;
        this.f357m = -9223372036854775807L;
        this.f358n = 0L;
        this.f360p = 0;
        this.f363t = j11;
        e eVar = this.f361q;
        if ((eVar instanceof b) && !((b) eVar).a(j11)) {
            this.f362s = true;
            this.f354j = this.f351g;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r14 != 1231971951) goto L188;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0214  */
    @Override // u7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(i iVar, s sVar) {
        p.a aVar;
        int i6;
        d dVar;
        i iVar2;
        q qVar;
        int i10;
        boolean z10;
        int i11;
        int i12;
        u7.p pVar;
        int c10;
        e eVar;
        u7.p pVar2;
        q qVar2;
        boolean z11;
        int t3;
        e eVar2;
        g8.a aVar2;
        u7.p pVar3;
        c cVar;
        boolean z12;
        int i13;
        boolean z13;
        e c11;
        long d10;
        long j10;
        g8.a aVar3;
        a.b[] bVarArr;
        l8.j jVar;
        u7.p pVar4;
        q qVar3;
        e eVar3;
        int i14;
        p.a aVar4;
        int q10;
        e eVar4;
        sc.b.E(this.f353i);
        int i15 = w.f5205a;
        int i16 = this.f355k;
        p.a aVar5 = this.f349d;
        if (i16 == 0) {
            try {
                i(iVar, false);
            } catch (EOFException unused) {
                aVar = aVar5;
                i6 = -1;
                dVar = this;
            }
        }
        e eVar5 = this.f361q;
        q qVar4 = this.f348c;
        if (eVar5 == null) {
            q qVar5 = new q(aVar5.f29301c);
            iVar.b(0, qVar5.f5186a, aVar5.f29301c);
            if ((aVar5.f29299a & 1) != 0) {
                if (aVar5.f29303e != 1) {
                    i11 = 36;
                    if (qVar5.f5188c >= i11 + 4) {
                        qVar5.A(i11);
                        i12 = qVar5.c();
                        if (i12 != 1483304551) {
                        }
                        pVar = this.f350e;
                        long j11 = -1;
                        String str = ", ";
                        if (i12 == 1483304551 && i12 != 1231971951) {
                            if (i12 == 1447187017) {
                                long length = iVar.getLength();
                                long position = iVar.getPosition();
                                qVar5.B(10);
                                int c12 = qVar5.c();
                                if (c12 <= 0) {
                                    aVar4 = aVar5;
                                    pVar4 = pVar;
                                    qVar3 = qVar4;
                                } else {
                                    int i17 = aVar5.f29302d;
                                    qVar3 = qVar4;
                                    long j12 = c12;
                                    if (i17 >= 32000) {
                                        i14 = 1152;
                                    } else {
                                        i14 = 576;
                                    }
                                    long C = w.C(j12, i14 * 1000000, i17);
                                    int v10 = qVar5.v();
                                    int v11 = qVar5.v();
                                    int v12 = qVar5.v();
                                    qVar5.B(2);
                                    long j13 = position + aVar5.f29301c;
                                    long[] jArr = new long[v10];
                                    long[] jArr2 = new long[v10];
                                    int i18 = 0;
                                    aVar4 = aVar5;
                                    pVar4 = pVar;
                                    long j14 = position;
                                    while (i18 < v10) {
                                        long j15 = j13;
                                        String str2 = str;
                                        jArr[i18] = (i18 * C) / v10;
                                        jArr2[i18] = Math.max(j14, j15);
                                        if (v12 != 1) {
                                            if (v12 != 2) {
                                                if (v12 != 3) {
                                                    if (v12 == 4) {
                                                        q10 = qVar5.t();
                                                    }
                                                } else {
                                                    q10 = qVar5.s();
                                                }
                                            } else {
                                                q10 = qVar5.v();
                                            }
                                        } else {
                                            q10 = qVar5.q();
                                        }
                                        j14 += q10 * v11;
                                        i18++;
                                        j13 = j15;
                                        str = str2;
                                    }
                                    String str3 = str;
                                    if (length != -1 && length != j14) {
                                        StringBuilder sb2 = new StringBuilder(67);
                                        sb2.append("VBRI data size mismatch: ");
                                        sb2.append(length);
                                        sb2.append(str3);
                                        sb2.append(j14);
                                        Log.w("VbriSeeker", sb2.toString());
                                    }
                                    eVar4 = new f(jArr, jArr2, C, j14);
                                    aVar = aVar4;
                                    iVar2 = iVar;
                                    iVar2.l(aVar.f29301c);
                                    eVar3 = eVar4;
                                }
                                eVar4 = null;
                                aVar = aVar4;
                                iVar2 = iVar;
                                iVar2.l(aVar.f29301c);
                                eVar3 = eVar4;
                            } else {
                                iVar2 = iVar;
                                aVar = aVar5;
                                pVar4 = pVar;
                                qVar3 = qVar4;
                                iVar.k();
                                eVar3 = null;
                            }
                            dVar = this;
                            pVar2 = pVar4;
                            qVar2 = qVar3;
                            eVar2 = eVar3;
                        } else {
                            iVar2 = iVar;
                            aVar = aVar5;
                            long length2 = iVar.getLength();
                            long position2 = iVar.getPosition();
                            int i19 = aVar.f29304g;
                            int i20 = aVar.f29302d;
                            c10 = qVar5.c();
                            if ((c10 & 1) != 1 && (t3 = qVar5.t()) != 0) {
                                long C2 = w.C(t3, i19 * 1000000, i20);
                                if ((c10 & 6) != 6) {
                                    eVar = new g(position2, aVar.f29301c, C2, -1L, null);
                                } else {
                                    long r = qVar5.r();
                                    long[] jArr3 = new long[100];
                                    for (int i21 = 0; i21 < 100; i21++) {
                                        jArr3[i21] = qVar5.q();
                                    }
                                    if (length2 != -1) {
                                        long j16 = position2 + r;
                                        if (length2 != j16) {
                                            StringBuilder sb3 = new StringBuilder(67);
                                            sb3.append("XING data size mismatch: ");
                                            sb3.append(length2);
                                            sb3.append(", ");
                                            sb3.append(j16);
                                            Log.w("XingSeeker", sb3.toString());
                                        }
                                    }
                                    eVar = new g(position2, aVar.f29301c, C2, r, jArr3);
                                }
                            } else {
                                eVar = null;
                            }
                            pVar2 = pVar;
                            if (eVar != null) {
                                if (pVar2.f33898a != -1 && pVar2.f33899b != -1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!z11) {
                                    iVar.k();
                                    iVar2.f(i11 + 141);
                                    qVar2 = qVar4;
                                    iVar2.b(0, qVar2.f5186a, 3);
                                    qVar2.A(0);
                                    int s10 = qVar2.s();
                                    int i22 = s10 >> 12;
                                    int i23 = s10 & 4095;
                                    if (i22 > 0 || i23 > 0) {
                                        pVar2.f33898a = i22;
                                        pVar2.f33899b = i23;
                                    }
                                    iVar2.l(aVar.f29301c);
                                    if (eVar == null && !eVar.d() && i12 == 1231971951) {
                                        dVar = this;
                                        eVar2 = dVar.c(iVar2, false);
                                    } else {
                                        dVar = this;
                                        eVar2 = eVar;
                                    }
                                }
                            }
                            qVar2 = qVar4;
                            iVar2.l(aVar.f29301c);
                            if (eVar == null) {
                            }
                            dVar = this;
                            eVar2 = eVar;
                        }
                        aVar2 = dVar.f356l;
                        long position3 = iVar.getPosition();
                        if (aVar2 != null) {
                            for (a.b bVar : aVar2.f16378u) {
                                if (bVar instanceof l8.j) {
                                    long d11 = d(aVar2);
                                    int length3 = ((l8.j) bVar).f24137y.length;
                                    int i24 = length3 + 1;
                                    long[] jArr4 = new long[i24];
                                    long[] jArr5 = new long[i24];
                                    jArr4[0] = position3;
                                    jArr5[0] = 0;
                                    int i25 = 1;
                                    long j17 = 0;
                                    while (i25 <= length3) {
                                        int i26 = i25 - 1;
                                        position3 += jVar.f24135w + jVar.f24137y[i26];
                                        j17 += jVar.f24136x + jVar.f24138z[i26];
                                        jArr4[i25] = position3;
                                        jArr5[i25] = j17;
                                        i25++;
                                        length3 = length3;
                                        pVar2 = pVar2;
                                        qVar2 = qVar2;
                                    }
                                    pVar3 = pVar2;
                                    qVar = qVar2;
                                    cVar = new c(d11, jArr4, jArr5);
                                    z12 = dVar.r;
                                    i13 = dVar.f346a;
                                    if (z12) {
                                        c11 = new e.a();
                                    } else {
                                        e eVar6 = eVar2;
                                        if ((i13 & 4) != 0) {
                                            if (cVar != null) {
                                                d10 = cVar.f344c;
                                            } else if (eVar2 != null) {
                                                long j18 = eVar2.j();
                                                j11 = eVar2.c();
                                                j10 = j18;
                                                eVar6 = new b(j10, iVar.getPosition(), j11);
                                            } else {
                                                d10 = d(dVar.f356l);
                                            }
                                            j10 = d10;
                                            eVar6 = new b(j10, iVar.getPosition(), j11);
                                        } else {
                                            if (cVar == null) {
                                                if (eVar2 == null) {
                                                    cVar = null;
                                                }
                                            }
                                            if (cVar == null && (cVar.d() || (i13 & 1) == 0)) {
                                                c11 = cVar;
                                            } else {
                                                if ((i13 & 2) == 0) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                c11 = dVar.c(iVar2, z13);
                                            }
                                        }
                                        cVar = eVar6;
                                        if (cVar == null) {
                                        }
                                        if ((i13 & 2) == 0) {
                                        }
                                        c11 = dVar.c(iVar2, z13);
                                    }
                                    dVar.f361q = c11;
                                    dVar.f352h.i(c11);
                                    v vVar = dVar.f354j;
                                    n.a aVar6 = new n.a();
                                    aVar6.f6665k = aVar.f29300b;
                                    aVar6.f6666l = 4096;
                                    aVar6.f6677x = aVar.f29303e;
                                    aVar6.f6678y = aVar.f29302d;
                                    u7.p pVar5 = pVar3;
                                    aVar6.A = pVar5.f33898a;
                                    aVar6.B = pVar5.f33899b;
                                    if ((i13 & 8) != 0) {
                                        aVar3 = null;
                                    } else {
                                        aVar3 = dVar.f356l;
                                    }
                                    aVar6.f6663i = aVar3;
                                    vVar.e(new n(aVar6));
                                    dVar.f359o = iVar.getPosition();
                                }
                            }
                        }
                        pVar3 = pVar2;
                        qVar = qVar2;
                        cVar = null;
                        z12 = dVar.r;
                        i13 = dVar.f346a;
                        if (z12) {
                        }
                        dVar.f361q = c11;
                        dVar.f352h.i(c11);
                        v vVar2 = dVar.f354j;
                        n.a aVar62 = new n.a();
                        aVar62.f6665k = aVar.f29300b;
                        aVar62.f6666l = 4096;
                        aVar62.f6677x = aVar.f29303e;
                        aVar62.f6678y = aVar.f29302d;
                        u7.p pVar52 = pVar3;
                        aVar62.A = pVar52.f33898a;
                        aVar62.B = pVar52.f33899b;
                        if ((i13 & 8) != 0) {
                        }
                        aVar62.f6663i = aVar3;
                        vVar2.e(new n(aVar62));
                        dVar.f359o = iVar.getPosition();
                    }
                    if (qVar5.f5188c >= 40) {
                        qVar5.A(36);
                        if (qVar5.c() == 1447187017) {
                            i12 = 1447187017;
                            pVar = this.f350e;
                            long j112 = -1;
                            String str4 = ", ";
                            if (i12 == 1483304551) {
                            }
                            iVar2 = iVar;
                            aVar = aVar5;
                            long length22 = iVar.getLength();
                            long position22 = iVar.getPosition();
                            int i192 = aVar.f29304g;
                            int i202 = aVar.f29302d;
                            c10 = qVar5.c();
                            if ((c10 & 1) != 1) {
                            }
                            eVar = null;
                            pVar2 = pVar;
                            if (eVar != null) {
                            }
                            qVar2 = qVar4;
                            iVar2.l(aVar.f29301c);
                            if (eVar == null) {
                            }
                            dVar = this;
                            eVar2 = eVar;
                            aVar2 = dVar.f356l;
                            long position32 = iVar.getPosition();
                            if (aVar2 != null) {
                            }
                            pVar3 = pVar2;
                            qVar = qVar2;
                            cVar = null;
                            z12 = dVar.r;
                            i13 = dVar.f346a;
                            if (z12) {
                            }
                            dVar.f361q = c11;
                            dVar.f352h.i(c11);
                            v vVar22 = dVar.f354j;
                            n.a aVar622 = new n.a();
                            aVar622.f6665k = aVar.f29300b;
                            aVar622.f6666l = 4096;
                            aVar622.f6677x = aVar.f29303e;
                            aVar622.f6678y = aVar.f29302d;
                            u7.p pVar522 = pVar3;
                            aVar622.A = pVar522.f33898a;
                            aVar622.B = pVar522.f33899b;
                            if ((i13 & 8) != 0) {
                            }
                            aVar622.f6663i = aVar3;
                            vVar22.e(new n(aVar622));
                            dVar.f359o = iVar.getPosition();
                        }
                    }
                    i12 = 0;
                    pVar = this.f350e;
                    long j1122 = -1;
                    String str42 = ", ";
                    if (i12 == 1483304551) {
                    }
                    iVar2 = iVar;
                    aVar = aVar5;
                    long length222 = iVar.getLength();
                    long position222 = iVar.getPosition();
                    int i1922 = aVar.f29304g;
                    int i2022 = aVar.f29302d;
                    c10 = qVar5.c();
                    if ((c10 & 1) != 1) {
                    }
                    eVar = null;
                    pVar2 = pVar;
                    if (eVar != null) {
                    }
                    qVar2 = qVar4;
                    iVar2.l(aVar.f29301c);
                    if (eVar == null) {
                    }
                    dVar = this;
                    eVar2 = eVar;
                    aVar2 = dVar.f356l;
                    long position322 = iVar.getPosition();
                    if (aVar2 != null) {
                    }
                    pVar3 = pVar2;
                    qVar = qVar2;
                    cVar = null;
                    z12 = dVar.r;
                    i13 = dVar.f346a;
                    if (z12) {
                    }
                    dVar.f361q = c11;
                    dVar.f352h.i(c11);
                    v vVar222 = dVar.f354j;
                    n.a aVar6222 = new n.a();
                    aVar6222.f6665k = aVar.f29300b;
                    aVar6222.f6666l = 4096;
                    aVar6222.f6677x = aVar.f29303e;
                    aVar6222.f6678y = aVar.f29302d;
                    u7.p pVar5222 = pVar3;
                    aVar6222.A = pVar5222.f33898a;
                    aVar6222.B = pVar5222.f33899b;
                    if ((i13 & 8) != 0) {
                    }
                    aVar6222.f6663i = aVar3;
                    vVar222.e(new n(aVar6222));
                    dVar.f359o = iVar.getPosition();
                }
                i11 = 21;
                if (qVar5.f5188c >= i11 + 4) {
                }
                if (qVar5.f5188c >= 40) {
                }
                i12 = 0;
                pVar = this.f350e;
                long j11222 = -1;
                String str422 = ", ";
                if (i12 == 1483304551) {
                }
                iVar2 = iVar;
                aVar = aVar5;
                long length2222 = iVar.getLength();
                long position2222 = iVar.getPosition();
                int i19222 = aVar.f29304g;
                int i20222 = aVar.f29302d;
                c10 = qVar5.c();
                if ((c10 & 1) != 1) {
                }
                eVar = null;
                pVar2 = pVar;
                if (eVar != null) {
                }
                qVar2 = qVar4;
                iVar2.l(aVar.f29301c);
                if (eVar == null) {
                }
                dVar = this;
                eVar2 = eVar;
                aVar2 = dVar.f356l;
                long position3222 = iVar.getPosition();
                if (aVar2 != null) {
                }
                pVar3 = pVar2;
                qVar = qVar2;
                cVar = null;
                z12 = dVar.r;
                i13 = dVar.f346a;
                if (z12) {
                }
                dVar.f361q = c11;
                dVar.f352h.i(c11);
                v vVar2222 = dVar.f354j;
                n.a aVar62222 = new n.a();
                aVar62222.f6665k = aVar.f29300b;
                aVar62222.f6666l = 4096;
                aVar62222.f6677x = aVar.f29303e;
                aVar62222.f6678y = aVar.f29302d;
                u7.p pVar52222 = pVar3;
                aVar62222.A = pVar52222.f33898a;
                aVar62222.B = pVar52222.f33899b;
                if ((i13 & 8) != 0) {
                }
                aVar62222.f6663i = aVar3;
                vVar2222.e(new n(aVar62222));
                dVar.f359o = iVar.getPosition();
            } else {
                if (aVar5.f29303e == 1) {
                    i11 = 13;
                    if (qVar5.f5188c >= i11 + 4) {
                    }
                    if (qVar5.f5188c >= 40) {
                    }
                    i12 = 0;
                    pVar = this.f350e;
                    long j112222 = -1;
                    String str4222 = ", ";
                    if (i12 == 1483304551) {
                    }
                    iVar2 = iVar;
                    aVar = aVar5;
                    long length22222 = iVar.getLength();
                    long position22222 = iVar.getPosition();
                    int i192222 = aVar.f29304g;
                    int i202222 = aVar.f29302d;
                    c10 = qVar5.c();
                    if ((c10 & 1) != 1) {
                    }
                    eVar = null;
                    pVar2 = pVar;
                    if (eVar != null) {
                    }
                    qVar2 = qVar4;
                    iVar2.l(aVar.f29301c);
                    if (eVar == null) {
                    }
                    dVar = this;
                    eVar2 = eVar;
                    aVar2 = dVar.f356l;
                    long position32222 = iVar.getPosition();
                    if (aVar2 != null) {
                    }
                    pVar3 = pVar2;
                    qVar = qVar2;
                    cVar = null;
                    z12 = dVar.r;
                    i13 = dVar.f346a;
                    if (z12) {
                    }
                    dVar.f361q = c11;
                    dVar.f352h.i(c11);
                    v vVar22222 = dVar.f354j;
                    n.a aVar622222 = new n.a();
                    aVar622222.f6665k = aVar.f29300b;
                    aVar622222.f6666l = 4096;
                    aVar622222.f6677x = aVar.f29303e;
                    aVar622222.f6678y = aVar.f29302d;
                    u7.p pVar522222 = pVar3;
                    aVar622222.A = pVar522222.f33898a;
                    aVar622222.B = pVar522222.f33899b;
                    if ((i13 & 8) != 0) {
                    }
                    aVar622222.f6663i = aVar3;
                    vVar22222.e(new n(aVar622222));
                    dVar.f359o = iVar.getPosition();
                }
                i11 = 21;
                if (qVar5.f5188c >= i11 + 4) {
                }
                if (qVar5.f5188c >= 40) {
                }
                i12 = 0;
                pVar = this.f350e;
                long j1122222 = -1;
                String str42222 = ", ";
                if (i12 == 1483304551) {
                }
                iVar2 = iVar;
                aVar = aVar5;
                long length222222 = iVar.getLength();
                long position222222 = iVar.getPosition();
                int i1922222 = aVar.f29304g;
                int i2022222 = aVar.f29302d;
                c10 = qVar5.c();
                if ((c10 & 1) != 1) {
                }
                eVar = null;
                pVar2 = pVar;
                if (eVar != null) {
                }
                qVar2 = qVar4;
                iVar2.l(aVar.f29301c);
                if (eVar == null) {
                }
                dVar = this;
                eVar2 = eVar;
                aVar2 = dVar.f356l;
                long position322222 = iVar.getPosition();
                if (aVar2 != null) {
                }
                pVar3 = pVar2;
                qVar = qVar2;
                cVar = null;
                z12 = dVar.r;
                i13 = dVar.f346a;
                if (z12) {
                }
                dVar.f361q = c11;
                dVar.f352h.i(c11);
                v vVar222222 = dVar.f354j;
                n.a aVar6222222 = new n.a();
                aVar6222222.f6665k = aVar.f29300b;
                aVar6222222.f6666l = 4096;
                aVar6222222.f6677x = aVar.f29303e;
                aVar6222222.f6678y = aVar.f29302d;
                u7.p pVar5222222 = pVar3;
                aVar6222222.A = pVar5222222.f33898a;
                aVar6222222.B = pVar5222222.f33899b;
                if ((i13 & 8) != 0) {
                }
                aVar6222222.f6663i = aVar3;
                vVar222222.e(new n(aVar6222222));
                dVar.f359o = iVar.getPosition();
            }
        } else {
            iVar2 = iVar;
            aVar = aVar5;
            qVar = qVar4;
            dVar = this;
            if (dVar.f359o != 0) {
                long position4 = iVar.getPosition();
                long j19 = dVar.f359o;
                if (position4 < j19) {
                    iVar2.l((int) (j19 - position4));
                }
            }
        }
        if (dVar.f360p == 0) {
            iVar.k();
            if (!e(iVar)) {
                q qVar6 = qVar;
                qVar6.A(0);
                int c13 = qVar6.c();
                if (((-128000) & c13) == (dVar.f355k & (-128000))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && p.a(c13) != -1) {
                    aVar.a(c13);
                    if (dVar.f357m == -9223372036854775807L) {
                        dVar.f357m = dVar.f361q.e(iVar.getPosition());
                        long j20 = dVar.f347b;
                        if (j20 != -9223372036854775807L) {
                            dVar.f357m = (j20 - dVar.f361q.e(0L)) + dVar.f357m;
                        }
                    }
                    dVar.f360p = aVar.f29301c;
                    e eVar7 = dVar.f361q;
                    if (eVar7 instanceof b) {
                        b bVar2 = (b) eVar7;
                        long j21 = (((dVar.f358n + aVar.f29304g) * 1000000) / aVar.f29302d) + dVar.f357m;
                        long position5 = iVar.getPosition() + aVar.f29301c;
                        if (!bVar2.a(j21)) {
                            bVar2.f339b.a(j21);
                            bVar2.f340c.a(position5);
                        }
                        if (dVar.f362s && bVar2.a(dVar.f363t)) {
                            dVar.f362s = false;
                            dVar.f354j = dVar.f353i;
                        }
                    }
                } else {
                    iVar2.l(1);
                    dVar.f355k = 0;
                    i10 = 0;
                    i6 = i10;
                    if (i6 == -1) {
                        e eVar8 = dVar.f361q;
                        if (eVar8 instanceof b) {
                            long j22 = ((dVar.f358n * 1000000) / aVar.f29302d) + dVar.f357m;
                            if (eVar8.j() != j22) {
                                e eVar9 = dVar.f361q;
                                ((b) eVar9).f341d = j22;
                                dVar.f352h.i(eVar9);
                            }
                        }
                    }
                    return i6;
                }
            }
            i10 = -1;
            i6 = i10;
            if (i6 == -1) {
            }
            return i6;
        }
        int c14 = dVar.f354j.c(iVar2, dVar.f360p, true);
        if (c14 != -1) {
            int i27 = dVar.f360p - c14;
            dVar.f360p = i27;
            if (i27 <= 0) {
                dVar.f354j.d(dVar.f357m + ((dVar.f358n * 1000000) / aVar.f29302d), 1, aVar.f29301c, 0, null);
                dVar.f358n += aVar.f29304g;
                dVar.f360p = 0;
            }
            i10 = 0;
            i6 = i10;
            if (i6 == -1) {
            }
            return i6;
        }
        i10 = -1;
        i6 = i10;
        if (i6 == -1) {
        }
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ab, code lost:
        if (r19 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
        r18.l(r4 + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b2, code lost:
        r18.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b5, code lost:
        r17.f355k = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0081 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(i iVar, boolean z10) {
        int i6;
        int i10;
        boolean z11;
        boolean z12;
        p7.e eVar;
        if (z10) {
            i6 = 32768;
        } else {
            i6 = 131072;
        }
        iVar.k();
        if (iVar.getPosition() == 0) {
            if ((this.f346a & 8) == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                eVar = null;
            } else {
                eVar = f345u;
            }
            g8.a a10 = this.f.a(iVar, eVar);
            this.f356l = a10;
            if (a10 != null) {
                this.f350e.b(a10);
            }
            i10 = (int) iVar.e();
            if (!z10) {
                iVar.l(i10);
            }
        } else {
            i10 = 0;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (e(iVar)) {
                if (i12 <= 0) {
                    throw new EOFException();
                }
            } else {
                q qVar = this.f348c;
                qVar.A(0);
                int c10 = qVar.c();
                if (i11 != 0) {
                    if (((-128000) & c10) == (i11 & (-128000))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        int i14 = i13 + 1;
                        if (i13 != i6) {
                            if (z10) {
                                return false;
                            }
                            throw ParserException.a("Searched too many bytes.", null);
                        }
                        if (z10) {
                            iVar.k();
                            iVar.f(i10 + i14);
                        } else {
                            iVar.l(1);
                        }
                        i13 = i14;
                        i11 = 0;
                        i12 = 0;
                    }
                }
                int a11 = p.a(c10);
                if (a11 == -1) {
                    int i142 = i13 + 1;
                    if (i13 != i6) {
                    }
                } else {
                    i12++;
                    if (i12 == 1) {
                        this.f349d.a(c10);
                        i11 = c10;
                    } else if (i12 == 4) {
                        break;
                    }
                    iVar.f(a11 - 4);
                }
            }
        }
    }

    public d(int i6) {
        this.f346a = 0;
        this.f347b = -9223372036854775807L;
        this.f348c = new q(10);
        this.f349d = new p.a();
        this.f350e = new u7.p();
        this.f357m = -9223372036854775807L;
        this.f = new u7.q();
        u7.g gVar = new u7.g();
        this.f351g = gVar;
        this.f354j = gVar;
    }

    @Override // u7.h
    public final void a() {
    }
}
