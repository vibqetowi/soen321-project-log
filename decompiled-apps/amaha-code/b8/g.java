package b8;

import android.util.Pair;
import b8.a;
import b8.i;
import c9.q;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.n;
import g8.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import m8.c;
import u7.p;
import u7.s;
import u7.t;
import u7.u;
import u7.v;
import u7.w;
/* compiled from: Mp4Extractor.java */
/* loaded from: classes.dex */
public final class g implements u7.h, t {

    /* renamed from: a  reason: collision with root package name */
    public final int f4034a;

    /* renamed from: b  reason: collision with root package name */
    public final q f4035b;

    /* renamed from: c  reason: collision with root package name */
    public final q f4036c;

    /* renamed from: d  reason: collision with root package name */
    public final q f4037d;

    /* renamed from: e  reason: collision with root package name */
    public final q f4038e;
    public final ArrayDeque<a.C0077a> f;

    /* renamed from: g  reason: collision with root package name */
    public final i f4039g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f4040h;

    /* renamed from: i  reason: collision with root package name */
    public int f4041i;

    /* renamed from: j  reason: collision with root package name */
    public int f4042j;

    /* renamed from: k  reason: collision with root package name */
    public long f4043k;

    /* renamed from: l  reason: collision with root package name */
    public int f4044l;

    /* renamed from: m  reason: collision with root package name */
    public q f4045m;

    /* renamed from: n  reason: collision with root package name */
    public int f4046n;

    /* renamed from: o  reason: collision with root package name */
    public int f4047o;

    /* renamed from: p  reason: collision with root package name */
    public int f4048p;

    /* renamed from: q  reason: collision with root package name */
    public int f4049q;
    public u7.j r;

    /* renamed from: s  reason: collision with root package name */
    public a[] f4050s;

    /* renamed from: t  reason: collision with root package name */
    public long[][] f4051t;

    /* renamed from: u  reason: collision with root package name */
    public int f4052u;

    /* renamed from: v  reason: collision with root package name */
    public long f4053v;

    /* renamed from: w  reason: collision with root package name */
    public int f4054w;

    /* renamed from: x  reason: collision with root package name */
    public m8.b f4055x;

    /* compiled from: Mp4Extractor.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final j f4056a;

        /* renamed from: b  reason: collision with root package name */
        public final m f4057b;

        /* renamed from: c  reason: collision with root package name */
        public final v f4058c;

        /* renamed from: d  reason: collision with root package name */
        public final w f4059d;

        /* renamed from: e  reason: collision with root package name */
        public int f4060e;

        public a(j jVar, m mVar, v vVar) {
            w wVar;
            this.f4056a = jVar;
            this.f4057b = mVar;
            this.f4058c = vVar;
            if ("audio/true-hd".equals(jVar.f.F)) {
                wVar = new w();
            } else {
                wVar = null;
            }
            this.f4059d = wVar;
        }
    }

    public g() {
        this(0);
    }

    @Override // u7.h
    public final boolean b(u7.i iVar) {
        boolean z10;
        if ((this.f4034a & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return kotlin.jvm.internal.h.g0(iVar, false, z10);
    }

    @Override // u7.t
    public final boolean d() {
        return true;
    }

    @Override // u7.h
    public final void f(u7.j jVar) {
        this.r = jVar;
    }

    @Override // u7.h
    public final void g(long j10, long j11) {
        this.f.clear();
        this.f4044l = 0;
        this.f4046n = -1;
        this.f4047o = 0;
        this.f4048p = 0;
        this.f4049q = 0;
        if (j10 == 0) {
            if (this.f4041i != 3) {
                this.f4041i = 0;
                this.f4044l = 0;
                return;
            }
            i iVar = this.f4039g;
            iVar.f4066a.clear();
            iVar.f4067b = 0;
            this.f4040h.clear();
            return;
        }
        a[] aVarArr = this.f4050s;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                m mVar = aVar.f4057b;
                int f = c9.w.f(mVar.f, j11, false);
                while (true) {
                    if (f >= 0) {
                        if ((mVar.f4107g[f] & 1) != 0) {
                            break;
                        }
                        f--;
                    } else {
                        f = -1;
                        break;
                    }
                }
                if (f == -1) {
                    f = mVar.a(j11);
                }
                aVar.f4060e = f;
                w wVar = aVar.f4059d;
                if (wVar != null) {
                    wVar.f33918b = false;
                    wVar.f33919c = 0;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0471 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0670 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0006 A[SYNTHETIC] */
    @Override // u7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(u7.i iVar, s sVar) {
        boolean z10;
        long j10;
        int i6;
        char c10;
        boolean z11;
        boolean z12;
        int i10;
        a.C0077a peek;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        g8.a aVar;
        while (true) {
            int i11 = this.f4041i;
            ArrayDeque<a.C0077a> arrayDeque = this.f;
            int i12 = 4;
            q qVar = this.f4037d;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            ArrayList arrayList = this.f4040h;
                            i iVar2 = this.f4039g;
                            int i13 = iVar2.f4067b;
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    ArrayList arrayList2 = iVar2.f4066a;
                                    short s10 = 2192;
                                    if (i13 != 2) {
                                        if (i13 == 3) {
                                            long position = iVar.getPosition();
                                            int length = (int) ((iVar.getLength() - iVar.getPosition()) - iVar2.f4068c);
                                            q qVar2 = new q(length);
                                            iVar.readFully(qVar2.f5186a, 0, length);
                                            int i14 = 0;
                                            while (i14 < arrayList2.size()) {
                                                i.a aVar2 = (i.a) arrayList2.get(i14);
                                                qVar2.A((int) (aVar2.f4069a - position));
                                                qVar2.B(i12);
                                                int e10 = qVar2.e();
                                                String n10 = qVar2.n(e10);
                                                switch (n10.hashCode()) {
                                                    case -1711564334:
                                                        if (n10.equals("SlowMotion_Data")) {
                                                            i6 = 0;
                                                            break;
                                                        }
                                                        i6 = -1;
                                                        break;
                                                    case -1332107749:
                                                        if (n10.equals("Super_SlowMotion_Edit_Data")) {
                                                            i6 = 1;
                                                            break;
                                                        }
                                                        i6 = -1;
                                                        break;
                                                    case -1251387154:
                                                        if (n10.equals("Super_SlowMotion_Data")) {
                                                            i6 = 2;
                                                            break;
                                                        }
                                                        i6 = -1;
                                                        break;
                                                    case -830665521:
                                                        if (n10.equals("Super_SlowMotion_Deflickering_On")) {
                                                            i6 = 3;
                                                            break;
                                                        }
                                                        i6 = -1;
                                                        break;
                                                    case 1760745220:
                                                        if (n10.equals("Super_SlowMotion_BGM")) {
                                                            i6 = 4;
                                                            break;
                                                        }
                                                        i6 = -1;
                                                        break;
                                                    default:
                                                        i6 = -1;
                                                        break;
                                                }
                                                if (i6 != 0) {
                                                    if (i6 != 1) {
                                                        if (i6 != 2) {
                                                            if (i6 != 3) {
                                                                if (i6 == i12) {
                                                                    c10 = 2817;
                                                                } else {
                                                                    throw ParserException.a("Invalid SEF name", null);
                                                                }
                                                            } else {
                                                                c10 = 2820;
                                                            }
                                                        } else {
                                                            c10 = 2816;
                                                        }
                                                    } else {
                                                        c10 = 2819;
                                                    }
                                                } else {
                                                    c10 = 2192;
                                                }
                                                int i15 = aVar2.f4070b - (e10 + 8);
                                                if (c10 != 2192) {
                                                    if (c10 != 2816 && c10 != 2817 && c10 != 2819 && c10 != 2820) {
                                                        throw new IllegalStateException();
                                                    }
                                                } else {
                                                    ArrayList arrayList3 = new ArrayList();
                                                    List<String> b10 = i.f4065e.b(qVar2.n(i15));
                                                    for (int i16 = 0; i16 < b10.size(); i16++) {
                                                        List<String> b11 = i.f4064d.b(b10.get(i16));
                                                        if (b11.size() == 3) {
                                                            try {
                                                                arrayList3.add(new c.b(1 << (Integer.parseInt(b11.get(2)) - 1), Long.parseLong(b11.get(0)), Long.parseLong(b11.get(1))));
                                                            } catch (NumberFormatException e11) {
                                                                throw ParserException.a(null, e11);
                                                            }
                                                        } else {
                                                            throw ParserException.a(null, null);
                                                        }
                                                    }
                                                    arrayList.add(new m8.c(arrayList3));
                                                }
                                                i14++;
                                                i12 = 4;
                                            }
                                            sVar.f33905a = 0L;
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    } else {
                                        long length2 = iVar.getLength();
                                        int i17 = (iVar2.f4068c - 12) - 8;
                                        q qVar3 = new q(i17);
                                        iVar.readFully(qVar3.f5186a, 0, i17);
                                        int i18 = 0;
                                        while (i18 < i17 / 12) {
                                            qVar3.B(2);
                                            short f = qVar3.f();
                                            if (f != s10 && f != 2816) {
                                                if (f != 2817 && f != 2819) {
                                                    if (f != 2820) {
                                                        qVar3.B(8);
                                                        i18++;
                                                        s10 = 2192;
                                                    }
                                                }
                                            }
                                            arrayList2.add(new i.a(qVar3.e(), (length2 - iVar2.f4068c) - qVar3.e()));
                                            i18++;
                                            s10 = 2192;
                                        }
                                        if (arrayList2.isEmpty()) {
                                            sVar.f33905a = 0L;
                                        } else {
                                            iVar2.f4067b = 3;
                                            sVar.f33905a = ((i.a) arrayList2.get(0)).f4069a;
                                        }
                                    }
                                } else {
                                    q qVar4 = new q(8);
                                    iVar.readFully(qVar4.f5186a, 0, 8);
                                    iVar2.f4068c = qVar4.e() + 8;
                                    if (qVar4.c() != 1397048916) {
                                        sVar.f33905a = 0L;
                                    } else {
                                        sVar.f33905a = iVar.getPosition() - (iVar2.f4068c - 12);
                                        iVar2.f4067b = 2;
                                    }
                                }
                            } else {
                                long length3 = iVar.getLength();
                                if (length3 != -1 && length3 >= 8) {
                                    j10 = length3 - 8;
                                } else {
                                    j10 = 0;
                                }
                                sVar.f33905a = j10;
                                iVar2.f4067b = 1;
                            }
                            if (sVar.f33905a == 0) {
                                this.f4041i = 0;
                                this.f4044l = 0;
                                return 1;
                            }
                            return 1;
                        }
                        throw new IllegalStateException();
                    }
                    long position2 = iVar.getPosition();
                    if (this.f4046n == -1) {
                        int i19 = -1;
                        int i20 = -1;
                        int i21 = 0;
                        boolean z18 = true;
                        boolean z19 = true;
                        long j11 = Long.MAX_VALUE;
                        long j12 = Long.MAX_VALUE;
                        long j13 = Long.MAX_VALUE;
                        while (true) {
                            a[] aVarArr = this.f4050s;
                            int i22 = c9.w.f5205a;
                            if (i21 >= aVarArr.length) {
                                break;
                            }
                            a aVar3 = aVarArr[i21];
                            int i23 = aVar3.f4060e;
                            m mVar = aVar3.f4057b;
                            if (i23 != mVar.f4103b) {
                                long j14 = mVar.f4104c[i23];
                                long j15 = this.f4051t[i21][i23];
                                long j16 = j14 - position2;
                                if (j16 >= 0 && j16 < 262144) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if ((!z10 && z19) || (z10 == z19 && j16 < j13)) {
                                    z19 = z10;
                                    i20 = i21;
                                    j13 = j16;
                                    j12 = j15;
                                }
                                if (j15 < j11) {
                                    z18 = z10;
                                    i19 = i21;
                                    j11 = j15;
                                }
                            }
                            i21++;
                        }
                        if (j11 == Long.MAX_VALUE || !z18 || j12 < j11 + 10485760) {
                            i19 = i20;
                        }
                        this.f4046n = i19;
                        if (i19 == -1) {
                            return -1;
                        }
                    }
                    a[] aVarArr2 = this.f4050s;
                    int i24 = c9.w.f5205a;
                    a aVar4 = aVarArr2[this.f4046n];
                    v vVar = aVar4.f4058c;
                    int i25 = aVar4.f4060e;
                    m mVar2 = aVar4.f4057b;
                    long j17 = mVar2.f4104c[i25];
                    int i26 = mVar2.f4105d[i25];
                    long j18 = (j17 - position2) + this.f4047o;
                    if (j18 >= 0 && j18 < 262144) {
                        j jVar = aVar4.f4056a;
                        if (jVar.f4076g == 1) {
                            j18 += 8;
                            i26 -= 8;
                        }
                        iVar.l((int) j18);
                        int i27 = jVar.f4079j;
                        w wVar = aVar4.f4059d;
                        if (i27 != 0) {
                            q qVar5 = this.f4036c;
                            byte[] bArr = qVar5.f5186a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i28 = 4 - i27;
                            while (this.f4048p < i26) {
                                int i29 = this.f4049q;
                                if (i29 == 0) {
                                    iVar.readFully(bArr, i28, i27);
                                    this.f4047o += i27;
                                    qVar5.A(0);
                                    int c11 = qVar5.c();
                                    if (c11 >= 0) {
                                        this.f4049q = c11;
                                        q qVar6 = this.f4035b;
                                        qVar6.A(0);
                                        vVar.a(4, qVar6);
                                        this.f4048p += 4;
                                        i26 += i28;
                                    } else {
                                        throw ParserException.a("Invalid NAL length", null);
                                    }
                                } else {
                                    int c12 = vVar.c(iVar, i29, false);
                                    this.f4047o += c12;
                                    this.f4048p += c12;
                                    this.f4049q -= c12;
                                }
                            }
                        } else {
                            if ("audio/ac4".equals(jVar.f.F)) {
                                if (this.f4048p == 0) {
                                    q7.c.a(i26, qVar);
                                    vVar.a(7, qVar);
                                    this.f4048p += 7;
                                }
                                i26 += 7;
                            } else if (wVar != null) {
                                wVar.c(iVar);
                            }
                            while (true) {
                                int i30 = this.f4048p;
                                if (i30 >= i26) {
                                    break;
                                }
                                int c13 = vVar.c(iVar, i26 - i30, false);
                                this.f4047o += c13;
                                this.f4048p += c13;
                                this.f4049q -= c13;
                            }
                        }
                        long j19 = mVar2.f[i25];
                        int i31 = mVar2.f4107g[i25];
                        if (wVar != null) {
                            wVar.b(vVar, j19, i31, i26, 0, null);
                            if (i25 + 1 == mVar2.f4103b) {
                                wVar.a(vVar, null);
                            }
                        } else {
                            vVar.d(j19, i31, i26, 0, null);
                        }
                        aVar4.f4060e++;
                        this.f4046n = -1;
                        this.f4047o = 0;
                        this.f4048p = 0;
                        this.f4049q = 0;
                        return 0;
                    }
                    sVar.f33905a = j17;
                    return 1;
                }
                long j20 = this.f4043k - this.f4044l;
                long position3 = iVar.getPosition() + j20;
                q qVar7 = this.f4045m;
                if (qVar7 != null) {
                    iVar.readFully(qVar7.f5186a, this.f4044l, (int) j20);
                    if (this.f4042j == 1718909296) {
                        qVar7.A(8);
                        int c14 = qVar7.c();
                        if (c14 != 1751476579) {
                            if (c14 != 1903435808) {
                                i10 = 0;
                            } else {
                                i10 = 1;
                            }
                        } else {
                            i10 = 2;
                        }
                        if (i10 == 0) {
                            qVar7.B(4);
                            while (true) {
                                if (qVar7.f5188c - qVar7.f5187b > 0) {
                                    int c15 = qVar7.c();
                                    if (c15 != 1751476579) {
                                        if (c15 != 1903435808) {
                                            i10 = 0;
                                            continue;
                                        } else {
                                            i10 = 1;
                                            continue;
                                        }
                                    } else {
                                        i10 = 2;
                                        continue;
                                    }
                                    if (i10 != 0) {
                                        break;
                                    }
                                } else {
                                    i10 = 0;
                                    break;
                                }
                            }
                        }
                        this.f4054w = i10;
                    } else if (!arrayDeque.isEmpty()) {
                        arrayDeque.peek().f3967c.add(new a.b(this.f4042j, qVar7));
                    }
                } else if (j20 < 262144) {
                    iVar.l((int) j20);
                } else {
                    sVar.f33905a = iVar.getPosition() + j20;
                    z11 = true;
                    k(position3);
                    if (!z11 && this.f4041i != 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        return 1;
                    }
                }
                z11 = false;
                k(position3);
                if (!z11) {
                }
                z12 = false;
                if (!z12) {
                }
            } else {
                int i32 = this.f4044l;
                q qVar8 = this.f4038e;
                if (i32 == 0) {
                    if (!iVar.a(qVar8.f5186a, 0, 8, true)) {
                        if (this.f4054w == 2 && (this.f4034a & 2) != 0) {
                            u7.j jVar2 = this.r;
                            jVar2.getClass();
                            v n11 = jVar2.n(0, 4);
                            m8.b bVar = this.f4055x;
                            if (bVar == null) {
                                aVar = null;
                            } else {
                                aVar = new g8.a(bVar);
                            }
                            n.a aVar5 = new n.a();
                            aVar5.f6663i = aVar;
                            n11.e(new n(aVar5));
                            jVar2.e();
                            jVar2.i(new t.b(-9223372036854775807L));
                        }
                        z17 = false;
                        if (z17) {
                            return -1;
                        }
                    } else {
                        this.f4044l = 8;
                        qVar8.A(0);
                        this.f4043k = qVar8.r();
                        this.f4042j = qVar8.c();
                    }
                }
                long j21 = this.f4043k;
                if (j21 == 1) {
                    iVar.readFully(qVar8.f5186a, 8, 8);
                    this.f4044l += 8;
                    this.f4043k = qVar8.u();
                } else if (j21 == 0) {
                    long length4 = iVar.getLength();
                    if (length4 == -1 && (peek = arrayDeque.peek()) != null) {
                        length4 = peek.f3966b;
                    }
                    if (length4 != -1) {
                        this.f4043k = (length4 - iVar.getPosition()) + this.f4044l;
                    }
                }
                long j22 = this.f4043k;
                int i33 = this.f4044l;
                if (j22 >= i33) {
                    int i34 = this.f4042j;
                    if (i34 != 1836019574 && i34 != 1953653099 && i34 != 1835297121 && i34 != 1835626086 && i34 != 1937007212 && i34 != 1701082227 && i34 != 1835365473) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z13) {
                        long position4 = iVar.getPosition();
                        long j23 = this.f4043k;
                        long j24 = this.f4044l;
                        long j25 = (position4 + j23) - j24;
                        if (j23 != j24 && this.f4042j == 1835365473) {
                            qVar.x(8);
                            iVar.b(0, qVar.f5186a, 8);
                            byte[] bArr2 = b.f3970a;
                            int i35 = qVar.f5187b;
                            qVar.B(4);
                            if (qVar.c() != 1751411826) {
                                i35 += 4;
                            }
                            qVar.A(i35);
                            iVar.l(qVar.f5187b);
                            iVar.k();
                        }
                        arrayDeque.push(new a.C0077a(this.f4042j, j25));
                        if (this.f4043k == this.f4044l) {
                            k(j25);
                        } else {
                            this.f4041i = 0;
                            this.f4044l = 0;
                        }
                    } else {
                        if (i34 != 1835296868 && i34 != 1836476516 && i34 != 1751411826 && i34 != 1937011556 && i34 != 1937011827 && i34 != 1937011571 && i34 != 1668576371 && i34 != 1701606260 && i34 != 1937011555 && i34 != 1937011578 && i34 != 1937013298 && i34 != 1937007471 && i34 != 1668232756 && i34 != 1953196132 && i34 != 1718909296 && i34 != 1969517665 && i34 != 1801812339 && i34 != 1768715124) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (z14) {
                            if (i33 == 8) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            sc.b.C(z15);
                            if (this.f4043k <= 2147483647L) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            sc.b.C(z16);
                            q qVar9 = new q((int) this.f4043k);
                            System.arraycopy(qVar8.f5186a, 0, qVar9.f5186a, 0, 8);
                            this.f4045m = qVar9;
                            this.f4041i = 1;
                        } else {
                            long position5 = iVar.getPosition();
                            long j26 = this.f4044l;
                            long j27 = position5 - j26;
                            if (this.f4042j == 1836086884) {
                                this.f4055x = new m8.b(0L, j27, -9223372036854775807L, j27 + j26, this.f4043k - j26);
                            }
                            this.f4045m = null;
                            this.f4041i = 1;
                        }
                    }
                    z17 = true;
                    if (z17) {
                    }
                } else {
                    throw ParserException.b("Atom size less than header length (unsupported).");
                }
            }
        }
    }

    @Override // u7.t
    public final t.a i(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        int a10;
        long j15 = j10;
        a[] aVarArr = this.f4050s;
        aVarArr.getClass();
        int length = aVarArr.length;
        u uVar = u.f33910c;
        if (length == 0) {
            return new t.a(uVar, uVar);
        }
        int i6 = this.f4052u;
        boolean z10 = false;
        int i10 = -1;
        if (i6 != -1) {
            m mVar = this.f4050s[i6].f4057b;
            int f = c9.w.f(mVar.f, j15, false);
            while (true) {
                if (f >= 0) {
                    if ((mVar.f4107g[f] & 1) != 0) {
                        break;
                    }
                    f--;
                } else {
                    f = -1;
                    break;
                }
            }
            if (f == -1) {
                f = mVar.a(j15);
            }
            if (f == -1) {
                return new t.a(uVar, uVar);
            }
            long[] jArr = mVar.f;
            long j16 = jArr[f];
            long[] jArr2 = mVar.f4104c;
            j11 = jArr2[f];
            if (j16 < j15 && f < mVar.f4103b - 1 && (a10 = mVar.a(j15)) != -1 && a10 != f) {
                j14 = jArr[a10];
                j13 = jArr2[a10];
            } else {
                j14 = -9223372036854775807L;
                j13 = -1;
            }
            j12 = j14;
            j15 = j16;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -9223372036854775807L;
            j13 = -1;
        }
        long j17 = j11;
        int i11 = 0;
        while (true) {
            a[] aVarArr2 = this.f4050s;
            if (i11 >= aVarArr2.length) {
                break;
            }
            if (i11 != this.f4052u) {
                m mVar2 = aVarArr2[i11].f4057b;
                int f2 = c9.w.f(mVar2.f, j15, z10);
                while (true) {
                    if (f2 >= 0) {
                        if ((mVar2.f4107g[f2] & 1) != 0) {
                            break;
                        }
                        f2--;
                    } else {
                        f2 = -1;
                        break;
                    }
                }
                if (f2 == i10) {
                    f2 = mVar2.a(j15);
                }
                if (f2 != i10) {
                    j17 = Math.min(mVar2.f4104c[f2], j17);
                }
                if (j12 != -9223372036854775807L) {
                    int f10 = c9.w.f(mVar2.f, j12, false);
                    while (true) {
                        if (f10 >= 0) {
                            if ((mVar2.f4107g[f10] & 1) != 0) {
                                break;
                            }
                            f10--;
                        } else {
                            f10 = -1;
                            break;
                        }
                    }
                    if (f10 == -1) {
                        f10 = mVar2.a(j12);
                    }
                    if (f10 != -1) {
                        j13 = Math.min(mVar2.f4104c[f10], j13);
                    }
                    i11++;
                    z10 = false;
                    i10 = -1;
                }
            }
            i11++;
            z10 = false;
            i10 = -1;
        }
        u uVar2 = new u(j15, j17);
        if (j12 == -9223372036854775807L) {
            return new t.a(uVar2, uVar2);
        }
        return new t.a(uVar2, new u(j12, j13));
    }

    @Override // u7.t
    public final long j() {
        return this.f4053v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01cd, code lost:
        r7 = r4.l(r18 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d8, code lost:
        if (r12 != 1851878757) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01da, code lost:
        r10 = r4.l(r18 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e5, code lost:
        if (r12 != 1684108385) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e7, code lost:
        r6 = r18;
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01eb, code lost:
        r4.B(r18 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f0, code lost:
        r2 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f3, code lost:
        r20 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f5, code lost:
        if (r7 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f7, code lost:
        if (r10 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01fa, code lost:
        if (r0 != (-1)) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01fe, code lost:
        r4.A(r0);
        r4.B(16);
        r0 = new l8.i(r7, r10, r4.l(r6 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0214, code lost:
        r20 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0218, code lost:
        r20 = r2;
        r2 = 16777215 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0221, code lost:
        if (r2 != 6516084) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0223, code lost:
        r0 = b8.f.a(r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0229, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x022f, code lost:
        if (r2 == 7233901) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0234, code lost:
        if (r2 != 7631467) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023b, code lost:
        if (r2 == 6516589) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0240, code lost:
        if (r2 != 7828084) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0247, code lost:
        if (r2 != 6578553) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0249, code lost:
        r0 = b8.f.d(r6, r4, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0254, code lost:
        if (r2 != 4280916) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0256, code lost:
        r0 = b8.f.d(r6, r4, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0261, code lost:
        if (r2 != 7630703) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0263, code lost:
        r0 = b8.f.d(r6, r4, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x026d, code lost:
        if (r2 != 6384738) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x026f, code lost:
        r0 = b8.f.d(r6, r4, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0279, code lost:
        if (r2 != 7108978) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x027b, code lost:
        r0 = b8.f.d(r6, r4, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0285, code lost:
        if (r2 != 6776174) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0287, code lost:
        r0 = b8.f.d(r6, r4, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x028f, code lost:
        if (r2 != 6779504) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0291, code lost:
        r0 = b8.f.d(r6, r4, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0298, code lost:
        r6 = java.lang.String.valueOf(b8.a.a(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02a6, code lost:
        if (r6.length() == 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02a8, code lost:
        r2 = "Skipped unknown metadata entry: ".concat(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02ad, code lost:
        r2 = new java.lang.String("Skipped unknown metadata entry: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02b3, code lost:
        android.util.Log.d("MetadataUtil", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02b6, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02b8, code lost:
        r0 = b8.f.d(r6, r4, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02bf, code lost:
        r0 = b8.f.d(r6, r4, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02c8, code lost:
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02ca, code lost:
        r5.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02cd, code lost:
        r7 = r16;
        r0 = r17;
        r2 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02d5, code lost:
        r4.A(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02d8, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02d9, code lost:
        r17 = r0;
        r20 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02e1, code lost:
        if (r5.isEmpty() == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02e4, code lost:
        r0 = new g8.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
        r4.A(r7);
        r7 = r7 + r8;
        r4.B(r10);
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
        r6 = r4.f5187b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
        if (r6 >= r7) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
        r8 = r4.c() + r6;
        r6 = r4.c();
        r10 = (r6 >> 24) & 255;
        r16 = r7;
        r17 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
        if (r10 == 169) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
        if (r10 != 253) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c3, code lost:
        if (r6 != 1735291493) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
        r6 = b8.f.f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
        if (r6 <= 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
        if (r6 > 192) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
        r6 = b8.f.f4033a[r6 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d6, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
        if (r6 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d9, code lost:
        r0 = new l8.l("TCON", null, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
        android.util.Log.w("MetadataUtil", "Failed to parse standard genre code");
        r20 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ea, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
        if (r6 != 1684632427) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
        r0 = b8.f.c(r6, r4, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:
        if (r6 != 1953655662) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fd, code lost:
        r0 = b8.f.c(r6, r4, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
        if (r6 != 1953329263) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010a, code lost:
        r0 = b8.f.e(r6, "TBPM", r4, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0117, code lost:
        if (r6 != 1668311404) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0119, code lost:
        r0 = b8.f.e(r6, "TCMP", r4, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0125, code lost:
        if (r6 != 1668249202) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0127, code lost:
        r0 = b8.f.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0130, code lost:
        if (r6 != 1631670868) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0132, code lost:
        r0 = b8.f.d(r6, r4, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013d, code lost:
        if (r6 != 1936682605) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013f, code lost:
        r0 = b8.f.d(r6, r4, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0149, code lost:
        if (r6 != 1936679276) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014b, code lost:
        r0 = b8.f.d(r6, r4, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0155, code lost:
        if (r6 != 1936679282) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0157, code lost:
        r0 = b8.f.d(r6, r4, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0161, code lost:
        if (r6 != 1936679265) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0163, code lost:
        r0 = b8.f.d(r6, r4, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016d, code lost:
        if (r6 != 1936679791) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016f, code lost:
        r0 = b8.f.d(r6, r4, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0179, code lost:
        if (r6 != 1920233063) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017b, code lost:
        r0 = b8.f.e(r6, "ITUNESADVISORY", r4, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0186, code lost:
        if (r6 != 1885823344) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0188, code lost:
        r0 = b8.f.e(r6, "ITUNESGAPLESS", r4, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0194, code lost:
        if (r6 != 1936683886) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0196, code lost:
        r0 = b8.f.d(r6, r4, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a0, code lost:
        if (r6 != 1953919848) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a2, code lost:
        r0 = b8.f.d(r6, r4, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a8, code lost:
        r20 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01af, code lost:
        if (r6 != 757935405) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b1, code lost:
        r0 = -1;
        r6 = -1;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b4, code lost:
        r12 = r4.f5187b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b6, code lost:
        if (r12 >= r8) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b8, code lost:
        r18 = r4.c();
        r12 = r4.c();
        r20 = r2;
        r4.B(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cb, code lost:
        if (r12 != 1835360622) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0608 A[LOOP:12: B:315:0x0605->B:317:0x0608, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0626  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(long j10) {
        boolean z10;
        ArrayDeque<a.C0077a> arrayDeque;
        ArrayList arrayList;
        g8.a aVar;
        g8.a aVar2;
        g8.a aVar3;
        boolean z11;
        int size;
        int i6;
        a[] aVarArr;
        int i10;
        int i11;
        ArrayList arrayList2;
        int i12;
        int i13;
        g8.a aVar4;
        int i14;
        g8.a aVar5;
        g8.a aVar6;
        g8.a aVar7;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList3;
        boolean z12;
        int i18;
        int i19;
        String[] strArr;
        m8.a aVar8;
        ArrayDeque<a.C0077a> arrayDeque2;
        ArrayList arrayList4;
        float f;
        while (true) {
            ArrayDeque<a.C0077a> arrayDeque3 = this.f;
            if (arrayDeque3.isEmpty() || arrayDeque3.peek().f3966b != j10) {
                break;
            }
            a.C0077a pop = arrayDeque3.pop();
            if (pop.f3965a == 1836019574) {
                ArrayList arrayList5 = new ArrayList();
                if (this.f4054w == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p pVar = new p();
                a.b c10 = pop.c(1969517665);
                int i20 = 1768715124;
                int i21 = 1751411826;
                int i22 = 1835365473;
                int i23 = 4;
                int i24 = 8;
                if (c10 != null) {
                    byte[] bArr = b.f3970a;
                    q qVar = c10.f3969b;
                    qVar.A(8);
                    g8.a aVar9 = null;
                    g8.a aVar10 = null;
                    while (true) {
                        int i25 = qVar.f5188c;
                        int i26 = qVar.f5187b;
                        if (i25 - i26 < i24) {
                            break;
                        }
                        int c11 = qVar.c();
                        int i27 = i20;
                        int c12 = qVar.c();
                        if (c12 == i22) {
                            qVar.A(i26);
                            int i28 = i26 + c11;
                            qVar.B(i24);
                            int i29 = qVar.f5187b;
                            qVar.B(i23);
                            if (qVar.c() != i21) {
                                i29 += 4;
                            }
                            qVar.A(i29);
                            int i30 = i27;
                            while (true) {
                                int i31 = qVar.f5187b;
                                if (i31 < i28) {
                                    int c13 = qVar.c();
                                    if (qVar.c() == i30) {
                                        break;
                                    }
                                    qVar.A(i31 + c13);
                                    i30 = 1768715124;
                                    i24 = 8;
                                } else {
                                    arrayDeque2 = arrayDeque3;
                                    arrayList4 = arrayList5;
                                    break;
                                }
                            }
                            g8.a aVar11 = null;
                            aVar9 = aVar11;
                        } else {
                            arrayDeque2 = arrayDeque3;
                            arrayList4 = arrayList5;
                            if (c12 == 1936553057) {
                                qVar.A(i26);
                                int i32 = i26 + c11;
                                qVar.B(12);
                                while (true) {
                                    int i33 = qVar.f5187b;
                                    if (i33 >= i32) {
                                        break;
                                    }
                                    int c14 = qVar.c();
                                    if (qVar.c() == 1935766900) {
                                        if (c14 >= 14) {
                                            qVar.B(5);
                                            int q10 = qVar.q();
                                            if (q10 == 12 || q10 == 13) {
                                                if (q10 == 12) {
                                                    f = 240.0f;
                                                } else {
                                                    f = 120.0f;
                                                }
                                                qVar.B(1);
                                                aVar10 = new g8.a(new m8.d(f, qVar.q()));
                                            }
                                        }
                                    } else {
                                        qVar.A(i33 + c14);
                                    }
                                }
                                aVar10 = null;
                            }
                        }
                        qVar.A(i26 + c11);
                        i23 = 4;
                        i20 = 1768715124;
                        i21 = 1751411826;
                        i22 = 1835365473;
                        i24 = 8;
                        arrayDeque3 = arrayDeque2;
                        arrayList5 = arrayList4;
                    }
                    arrayDeque = arrayDeque3;
                    arrayList = arrayList5;
                    Pair create = Pair.create(aVar9, aVar10);
                    aVar2 = (g8.a) create.first;
                    aVar = (g8.a) create.second;
                    if (aVar2 != null) {
                        pVar.b(aVar2);
                    }
                } else {
                    arrayDeque = arrayDeque3;
                    arrayList = arrayList5;
                    aVar = null;
                    aVar2 = null;
                }
                a.C0077a b10 = pop.b(1835365473);
                if (b10 != null) {
                    byte[] bArr2 = b.f3970a;
                    a.b c15 = b10.c(1751411826);
                    a.b c16 = b10.c(1801812339);
                    a.b c17 = b10.c(1768715124);
                    if (c15 != null && c16 != null && c17 != null) {
                        q qVar2 = c15.f3969b;
                        qVar2.A(16);
                        if (qVar2.c() == 1835299937) {
                            q qVar3 = c16.f3969b;
                            qVar3.A(12);
                            int c18 = qVar3.c();
                            String[] strArr2 = new String[c18];
                            for (int i34 = 0; i34 < c18; i34++) {
                                int c19 = qVar3.c();
                                qVar3.B(4);
                                strArr2[i34] = qVar3.n(c19 - 8);
                            }
                            int i35 = 8;
                            q qVar4 = c17.f3969b;
                            qVar4.A(8);
                            ArrayList arrayList6 = new ArrayList();
                            while (true) {
                                int i36 = qVar4.f5188c;
                                int i37 = qVar4.f5187b;
                                if (i36 - i37 <= i35) {
                                    break;
                                }
                                int c20 = qVar4.c();
                                int c21 = qVar4.c() - 1;
                                if (c21 >= 0 && c21 < c18) {
                                    String str = strArr2[c21];
                                    int i38 = i37 + c20;
                                    while (true) {
                                        int i39 = qVar4.f5187b;
                                        if (i39 < i38) {
                                            int c22 = qVar4.c();
                                            i19 = c18;
                                            strArr = strArr2;
                                            if (qVar4.c() == 1684108385) {
                                                int c23 = qVar4.c();
                                                int c24 = qVar4.c();
                                                int i40 = c22 - 16;
                                                byte[] bArr3 = new byte[i40];
                                                qVar4.b(0, bArr3, i40);
                                                aVar8 = new m8.a(c24, c23, str, bArr3);
                                                break;
                                            }
                                            qVar4.A(i39 + c22);
                                            c18 = i19;
                                            strArr2 = strArr;
                                        } else {
                                            i19 = c18;
                                            strArr = strArr2;
                                            aVar8 = null;
                                            break;
                                        }
                                    }
                                    if (aVar8 != null) {
                                        arrayList6.add(aVar8);
                                    }
                                } else {
                                    i19 = c18;
                                    strArr = strArr2;
                                    defpackage.d.k(52, "Skipped metadata with unknown key index: ", c21, "AtomParsers");
                                }
                                qVar4.A(i37 + c20);
                                i35 = 8;
                                c18 = i19;
                                strArr2 = strArr;
                            }
                            if (!arrayList6.isEmpty()) {
                                aVar3 = new g8.a(arrayList6);
                                g8.a aVar12 = aVar3;
                                if ((this.f4034a & 1) == 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                ArrayList e10 = b.e(pop, pVar, -9223372036854775807L, null, z11, z10, new defpackage.e());
                                u7.j jVar = this.r;
                                jVar.getClass();
                                size = e10.size();
                                long j11 = -9223372036854775807L;
                                long j12 = -9223372036854775807L;
                                i6 = 0;
                                int i41 = -1;
                                while (i6 < size) {
                                    m mVar = (m) e10.get(i6);
                                    if (mVar.f4103b == 0) {
                                        aVar6 = aVar;
                                        aVar7 = aVar2;
                                        arrayList2 = e10;
                                        i12 = size;
                                        i17 = i41;
                                        arrayList3 = arrayList;
                                        aVar5 = aVar12;
                                    } else {
                                        j jVar2 = mVar.f4102a;
                                        g8.a aVar13 = aVar12;
                                        int i42 = i41;
                                        long j13 = jVar2.f4075e;
                                        if (j13 == j12) {
                                            j13 = mVar.f4108h;
                                        }
                                        j11 = Math.max(j11, j13);
                                        int i43 = jVar2.f4072b;
                                        arrayList2 = e10;
                                        a aVar14 = new a(jVar2, mVar, jVar.n(i6, i43));
                                        n nVar = jVar2.f;
                                        i12 = size;
                                        boolean equals = "audio/true-hd".equals(nVar.F);
                                        int i44 = mVar.f4106e;
                                        if (equals) {
                                            i13 = i44 * 16;
                                        } else {
                                            i13 = i44 + 30;
                                        }
                                        n.a aVar15 = new n.a(nVar);
                                        aVar15.f6666l = i13;
                                        if (i43 == 2 && j13 > 0 && (i18 = mVar.f4103b) > 1) {
                                            aVar15.r = i18 / (((float) j13) / 1000000.0f);
                                        }
                                        if (i43 == 1) {
                                            int i45 = pVar.f33898a;
                                            if (i45 != -1 && pVar.f33899b != -1) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                aVar15.A = i45;
                                                aVar15.B = pVar.f33899b;
                                            }
                                        }
                                        g8.a[] aVarArr2 = new g8.a[2];
                                        aVarArr2[0] = aVar;
                                        ArrayList arrayList7 = this.f4040h;
                                        if (arrayList7.isEmpty()) {
                                            i14 = 1;
                                            aVar4 = null;
                                        } else {
                                            aVar4 = new g8.a(arrayList7);
                                            i14 = 1;
                                        }
                                        aVarArr2[i14] = aVar4;
                                        g8.a aVar16 = new g8.a(new a.b[0]);
                                        if (i43 == i14) {
                                            if (aVar2 != null) {
                                                aVar16 = aVar2;
                                                aVar7 = aVar16;
                                                aVar5 = aVar13;
                                                aVar6 = aVar;
                                                for (i15 = 0; i15 < 2; i15++) {
                                                    g8.a aVar17 = aVarArr2[i15];
                                                    if (aVar17 != null) {
                                                        aVar16 = aVar16.a(aVar17.f16378u);
                                                    }
                                                }
                                                if (aVar16.f16378u.length > 0) {
                                                    aVar15.f6663i = aVar16;
                                                }
                                                aVar14.f4058c.e(new n(aVar15));
                                                if (i43 == 2) {
                                                    i16 = i42;
                                                    if (i16 == -1) {
                                                        i17 = arrayList.size();
                                                        arrayList3 = arrayList;
                                                        arrayList3.add(aVar14);
                                                    }
                                                } else {
                                                    i16 = i42;
                                                }
                                                i17 = i16;
                                                arrayList3 = arrayList;
                                                arrayList3.add(aVar14);
                                            }
                                        } else if (i43 == 2 && aVar13 != null) {
                                            int i46 = 0;
                                            aVar5 = aVar13;
                                            while (true) {
                                                a.b[] bVarArr = aVar5.f16378u;
                                                aVar6 = aVar;
                                                if (i46 < bVarArr.length) {
                                                    a.b bVar = bVarArr[i46];
                                                    if (bVar instanceof m8.a) {
                                                        m8.a aVar18 = (m8.a) bVar;
                                                        aVar7 = aVar2;
                                                        if ("com.android.capture.fps".equals(aVar18.f24924u)) {
                                                            aVar16 = new g8.a(aVar18);
                                                            break;
                                                        }
                                                    } else {
                                                        aVar7 = aVar2;
                                                    }
                                                    i46++;
                                                    aVar = aVar6;
                                                    aVar2 = aVar7;
                                                } else {
                                                    aVar7 = aVar2;
                                                    break;
                                                }
                                            }
                                            while (i15 < 2) {
                                            }
                                            if (aVar16.f16378u.length > 0) {
                                            }
                                            aVar14.f4058c.e(new n(aVar15));
                                            if (i43 == 2) {
                                            }
                                            i17 = i16;
                                            arrayList3 = arrayList;
                                            arrayList3.add(aVar14);
                                        }
                                        aVar7 = aVar2;
                                        aVar5 = aVar13;
                                        aVar6 = aVar;
                                        while (i15 < 2) {
                                        }
                                        if (aVar16.f16378u.length > 0) {
                                        }
                                        aVar14.f4058c.e(new n(aVar15));
                                        if (i43 == 2) {
                                        }
                                        i17 = i16;
                                        arrayList3 = arrayList;
                                        arrayList3.add(aVar14);
                                    }
                                    i6++;
                                    j12 = -9223372036854775807L;
                                    arrayList = arrayList3;
                                    aVar12 = aVar5;
                                    e10 = arrayList2;
                                    size = i12;
                                    aVar2 = aVar7;
                                    i41 = i17;
                                    aVar = aVar6;
                                }
                                this.f4052u = i41;
                                this.f4053v = j11;
                                aVarArr = (a[]) arrayList.toArray(new a[0]);
                                this.f4050s = aVarArr;
                                long[][] jArr = new long[aVarArr.length];
                                int[] iArr = new int[aVarArr.length];
                                long[] jArr2 = new long[aVarArr.length];
                                boolean[] zArr = new boolean[aVarArr.length];
                                for (i10 = 0; i10 < aVarArr.length; i10++) {
                                    jArr[i10] = new long[aVarArr[i10].f4057b.f4103b];
                                    jArr2[i10] = aVarArr[i10].f4057b.f[0];
                                }
                                i11 = 0;
                                long j14 = 0;
                                while (i11 < aVarArr.length) {
                                    long j15 = Long.MAX_VALUE;
                                    int i47 = -1;
                                    for (int i48 = 0; i48 < aVarArr.length; i48++) {
                                        if (!zArr[i48]) {
                                            long j16 = jArr2[i48];
                                            if (j16 <= j15) {
                                                i47 = i48;
                                                j15 = j16;
                                            }
                                        }
                                    }
                                    int i49 = iArr[i47];
                                    long[] jArr3 = jArr[i47];
                                    jArr3[i49] = j14;
                                    m mVar2 = aVarArr[i47].f4057b;
                                    j14 += mVar2.f4105d[i49];
                                    int i50 = i49 + 1;
                                    iArr[i47] = i50;
                                    if (i50 < jArr3.length) {
                                        jArr2[i47] = mVar2.f[i50];
                                    } else {
                                        zArr[i47] = true;
                                        i11++;
                                    }
                                }
                                this.f4051t = jArr;
                                jVar.e();
                                jVar.i(this);
                                arrayDeque.clear();
                                this.f4041i = 2;
                            }
                        }
                    }
                }
                aVar3 = null;
                g8.a aVar122 = aVar3;
                if ((this.f4034a & 1) == 0) {
                }
                ArrayList e102 = b.e(pop, pVar, -9223372036854775807L, null, z11, z10, new defpackage.e());
                u7.j jVar3 = this.r;
                jVar3.getClass();
                size = e102.size();
                long j112 = -9223372036854775807L;
                long j122 = -9223372036854775807L;
                i6 = 0;
                int i412 = -1;
                while (i6 < size) {
                }
                this.f4052u = i412;
                this.f4053v = j112;
                aVarArr = (a[]) arrayList.toArray(new a[0]);
                this.f4050s = aVarArr;
                long[][] jArr4 = new long[aVarArr.length];
                int[] iArr2 = new int[aVarArr.length];
                long[] jArr22 = new long[aVarArr.length];
                boolean[] zArr2 = new boolean[aVarArr.length];
                while (i10 < aVarArr.length) {
                }
                i11 = 0;
                long j142 = 0;
                while (i11 < aVarArr.length) {
                }
                this.f4051t = jArr4;
                jVar3.e();
                jVar3.i(this);
                arrayDeque.clear();
                this.f4041i = 2;
            } else if (!arrayDeque3.isEmpty()) {
                arrayDeque3.peek().f3968d.add(pop);
            }
        }
        if (this.f4041i != 2) {
            this.f4041i = 0;
            this.f4044l = 0;
        }
    }

    public g(int i6) {
        this.f4034a = 0;
        this.f4041i = 0;
        this.f4039g = new i();
        this.f4040h = new ArrayList();
        this.f4038e = new q(16);
        this.f = new ArrayDeque<>();
        this.f4035b = new q(c9.m.f5155a);
        this.f4036c = new q(4);
        this.f4037d = new q();
        this.f4046n = -1;
    }

    @Override // u7.h
    public final void a() {
    }
}
