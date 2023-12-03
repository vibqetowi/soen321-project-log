package d8;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import d8.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import u7.t;
/* compiled from: TsExtractor.java */
/* loaded from: classes.dex */
public final class c0 implements u7.h {

    /* renamed from: a  reason: collision with root package name */
    public final int f12307a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12308b;

    /* renamed from: c  reason: collision with root package name */
    public final List<c9.v> f12309c;

    /* renamed from: d  reason: collision with root package name */
    public final c9.q f12310d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseIntArray f12311e;
    public final d0.c f;

    /* renamed from: g  reason: collision with root package name */
    public final SparseArray<d0> f12312g;

    /* renamed from: h  reason: collision with root package name */
    public final SparseBooleanArray f12313h;

    /* renamed from: i  reason: collision with root package name */
    public final SparseBooleanArray f12314i;

    /* renamed from: j  reason: collision with root package name */
    public final b0 f12315j;

    /* renamed from: k  reason: collision with root package name */
    public a0 f12316k;

    /* renamed from: l  reason: collision with root package name */
    public u7.j f12317l;

    /* renamed from: m  reason: collision with root package name */
    public int f12318m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12319n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12320o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12321p;

    /* renamed from: q  reason: collision with root package name */
    public d0 f12322q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public int f12323s;

    public c0() {
        c9.v vVar = new c9.v(0L);
        this.f = new g();
        this.f12308b = 112800;
        this.f12307a = 1;
        this.f12309c = Collections.singletonList(vVar);
        this.f12310d = new c9.q(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f12313h = sparseBooleanArray;
        this.f12314i = new SparseBooleanArray();
        SparseArray<d0> sparseArray = new SparseArray<>();
        this.f12312g = sparseArray;
        this.f12311e = new SparseIntArray();
        this.f12315j = new b0();
        this.f12317l = u7.j.f33880t;
        this.f12323s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i6 = 0; i6 < size; i6++) {
            sparseArray.put(sparseArray2.keyAt(i6), (d0) sparseArray2.valueAt(i6));
        }
        sparseArray.put(0, new y(new a()));
        this.f12322q = null;
    }

    @Override // u7.h
    public final boolean b(u7.i iVar) {
        boolean z10;
        byte[] bArr = this.f12310d.f5186a;
        u7.e eVar = (u7.e) iVar;
        eVar.d(bArr, 0, 940, false);
        for (int i6 = 0; i6 < 188; i6++) {
            int i10 = 0;
            while (true) {
                if (i10 < 5) {
                    if (bArr[(i10 * 188) + i6] != 71) {
                        z10 = false;
                        break;
                    }
                    i10++;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                eVar.l(i6);
                return true;
            }
        }
        return false;
    }

    @Override // u7.h
    public final void f(u7.j jVar) {
        this.f12317l = jVar;
    }

    @Override // u7.h
    public final void g(long j10, long j11) {
        boolean z10;
        a0 a0Var;
        boolean z11;
        if (this.f12307a != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        List<c9.v> list = this.f12309c;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            c9.v vVar = list.get(i6);
            if (vVar.d() == -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                long c10 = vVar.c();
                if (c10 != -9223372036854775807L && c10 != 0 && c10 != j11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                vVar.e(j11);
            }
        }
        if (j11 != 0 && (a0Var = this.f12316k) != null) {
            a0Var.c(j11);
        }
        this.f12310d.x(0);
        this.f12311e.clear();
        int i10 = 0;
        while (true) {
            SparseArray<d0> sparseArray = this.f12312g;
            if (i10 < sparseArray.size()) {
                sparseArray.valueAt(i10).c();
                i10++;
            } else {
                this.r = 0;
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    @Override // u7.h
    public final int h(u7.i iVar, u7.s sVar) {
        int i6;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        boolean z15;
        boolean z16;
        long j10;
        int i13;
        long j11;
        boolean z17;
        long length = iVar.getLength();
        boolean z18 = this.f12319n;
        int i14 = this.f12307a;
        if (z18) {
            if (length != -1 && i14 != 2) {
                z15 = true;
            } else {
                z15 = false;
            }
            b0 b0Var = this.f12315j;
            if (z15 && !b0Var.f12299d) {
                int i15 = this.f12323s;
                if (i15 <= 0) {
                    b0Var.a(iVar);
                    return 0;
                }
                boolean z19 = b0Var.f;
                c9.q qVar = b0Var.f12298c;
                int i16 = b0Var.f12296a;
                if (!z19) {
                    long length2 = iVar.getLength();
                    int min = (int) Math.min(i16, length2);
                    long j12 = length2 - min;
                    if (iVar.getPosition() != j12) {
                        sVar.f33905a = j12;
                        i13 = 1;
                    } else {
                        qVar.x(min);
                        iVar.k();
                        iVar.b(0, qVar.f5186a, min);
                        int i17 = qVar.f5187b;
                        int i18 = qVar.f5188c;
                        int i19 = i18 - 188;
                        while (true) {
                            if (i19 >= i17) {
                                byte[] bArr = qVar.f5186a;
                                int i20 = -4;
                                int i21 = 0;
                                while (true) {
                                    if (i20 <= 4) {
                                        int i22 = (i20 * 188) + i19;
                                        if (i22 >= i17 && i22 < i18 && bArr[i22] == 71) {
                                            i21++;
                                            if (i21 == 5) {
                                                z17 = true;
                                                break;
                                            }
                                        } else {
                                            i21 = 0;
                                        }
                                        i20++;
                                    } else {
                                        z17 = false;
                                        break;
                                    }
                                }
                                if (z17) {
                                    long T = kc.f.T(qVar, i19, i15);
                                    if (T != -9223372036854775807L) {
                                        j11 = T;
                                        break;
                                    }
                                }
                                i19--;
                            } else {
                                j11 = -9223372036854775807L;
                                break;
                            }
                        }
                        b0Var.f12302h = j11;
                        b0Var.f = true;
                        i13 = 0;
                    }
                } else if (b0Var.f12302h == -9223372036854775807L) {
                    b0Var.a(iVar);
                    return 0;
                } else if (!b0Var.f12300e) {
                    int min2 = (int) Math.min(i16, iVar.getLength());
                    long j13 = 0;
                    if (iVar.getPosition() != j13) {
                        sVar.f33905a = j13;
                        i13 = 1;
                    } else {
                        qVar.x(min2);
                        iVar.k();
                        iVar.b(0, qVar.f5186a, min2);
                        int i23 = qVar.f5187b;
                        int i24 = qVar.f5188c;
                        while (true) {
                            if (i23 < i24) {
                                if (qVar.f5186a[i23] == 71) {
                                    long T2 = kc.f.T(qVar, i23, i15);
                                    if (T2 != -9223372036854775807L) {
                                        j10 = T2;
                                        break;
                                    }
                                }
                                i23++;
                            } else {
                                j10 = -9223372036854775807L;
                                break;
                            }
                        }
                        b0Var.f12301g = j10;
                        b0Var.f12300e = true;
                        i13 = 0;
                    }
                } else {
                    long j14 = b0Var.f12301g;
                    if (j14 == -9223372036854775807L) {
                        b0Var.a(iVar);
                        return 0;
                    }
                    c9.v vVar = b0Var.f12297b;
                    long b10 = vVar.b(b0Var.f12302h) - vVar.b(j14);
                    b0Var.f12303i = b10;
                    if (b10 < 0) {
                        StringBuilder sb2 = new StringBuilder(65);
                        sb2.append("Invalid duration: ");
                        sb2.append(b10);
                        sb2.append(". Using TIME_UNSET instead.");
                        Log.w("TsDurationReader", sb2.toString());
                        b0Var.f12303i = -9223372036854775807L;
                    }
                    b0Var.a(iVar);
                    return 0;
                }
                return i13;
            }
            if (!this.f12320o) {
                this.f12320o = true;
                long j15 = b0Var.f12303i;
                if (j15 != -9223372036854775807L) {
                    z10 = 0;
                    i6 = i14;
                    a0 a0Var = new a0(b0Var.f12297b, j15, length, this.f12323s, this.f12308b);
                    this.f12316k = a0Var;
                    this.f12317l.i(a0Var.f33837a);
                } else {
                    i6 = i14;
                    z10 = 0;
                    this.f12317l.i(new t.b(j15));
                }
            } else {
                i6 = i14;
                z10 = 0;
            }
            if (this.f12321p) {
                this.f12321p = z10;
                g(0L, 0L);
                if (iVar.getPosition() != 0) {
                    sVar.f33905a = 0L;
                    return 1;
                }
            }
            a0 a0Var2 = this.f12316k;
            if (a0Var2 != null) {
                if (a0Var2.f33839c != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    return a0Var2.a(iVar, sVar);
                }
            }
        } else {
            i6 = i14;
            z10 = 0;
        }
        c9.q qVar2 = this.f12310d;
        byte[] bArr2 = qVar2.f5186a;
        int i25 = qVar2.f5187b;
        if (9400 - i25 < 188) {
            int i26 = qVar2.f5188c - i25;
            if (i26 > 0) {
                System.arraycopy(bArr2, i25, bArr2, z10, i26);
            }
            qVar2.y(bArr2, i26);
        }
        while (true) {
            int i27 = qVar2.f5188c;
            if (i27 - qVar2.f5187b < 188) {
                int read = iVar.read(bArr2, i27, 9400 - i27);
                if (read == -1) {
                    z11 = false;
                    break;
                }
                qVar2.z(i27 + read);
            } else {
                z11 = true;
                break;
            }
        }
        if (!z11) {
            return -1;
        }
        int i28 = qVar2.f5187b;
        int i29 = qVar2.f5188c;
        byte[] bArr3 = qVar2.f5186a;
        int i30 = i28;
        while (i30 < i29 && bArr3[i30] != 71) {
            i30++;
        }
        qVar2.A(i30);
        int i31 = i30 + 188;
        d0 d0Var = null;
        if (i31 > i29) {
            int i32 = (i30 - i28) + this.r;
            this.r = i32;
            i10 = i6;
            if (i10 == 2 && i32 > 376) {
                throw ParserException.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i10 = i6;
            this.r = z10;
        }
        int i33 = qVar2.f5188c;
        if (i31 > i33) {
            return z10;
        }
        int c10 = qVar2.c();
        if ((8388608 & c10) != 0) {
            qVar2.A(i31);
            return z10;
        }
        if ((4194304 & c10) != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i34 = i11 | z10;
        int i35 = (2096896 & c10) >> 8;
        if ((c10 & 32) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((c10 & 16) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            d0Var = this.f12312g.get(i35);
        }
        if (d0Var == null) {
            qVar2.A(i31);
            return z10;
        }
        if (i10 != 2) {
            int i36 = c10 & 15;
            SparseIntArray sparseIntArray = this.f12311e;
            int i37 = sparseIntArray.get(i35, i36 - 1);
            sparseIntArray.put(i35, i36);
            if (i37 == i36) {
                qVar2.A(i31);
                return z10;
            } else if (i36 != ((i37 + 1) & 15)) {
                d0Var.c();
            }
        }
        if (z12) {
            int q10 = qVar2.q();
            if ((qVar2.q() & 64) != 0) {
                i12 = 2;
            } else {
                i12 = 0;
            }
            i34 |= i12;
            qVar2.B(q10 - 1);
        }
        boolean z20 = this.f12319n;
        if (i10 != 2 && !z20 && this.f12314i.get(i35, z10)) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z14) {
            qVar2.z(i31);
            d0Var.a(i34, qVar2);
            qVar2.z(i33);
        }
        if (i10 != 2 && !z20 && this.f12319n && length != -1) {
            this.f12321p = true;
        }
        qVar2.A(i31);
        return z10;
    }

    @Override // u7.h
    public final void a() {
    }

    /* compiled from: TsExtractor.java */
    /* loaded from: classes.dex */
    public class a implements x {

        /* renamed from: a  reason: collision with root package name */
        public final u7.x f12324a = new u7.x(new byte[4], 1, 0);

        public a() {
        }

        @Override // d8.x
        public final void a(c9.q qVar) {
            c0 c0Var;
            if (qVar.q() != 0 || (qVar.q() & 128) == 0) {
                return;
            }
            qVar.B(6);
            int i6 = (qVar.f5188c - qVar.f5187b) / 4;
            int i10 = 0;
            while (true) {
                c0Var = c0.this;
                if (i10 >= i6) {
                    break;
                }
                u7.x xVar = this.f12324a;
                qVar.b(0, xVar.f33924b, 4);
                xVar.o(0);
                int i11 = xVar.i(16);
                xVar.r(3);
                if (i11 == 0) {
                    xVar.r(13);
                } else {
                    int i12 = xVar.i(13);
                    if (c0Var.f12312g.get(i12) == null) {
                        c0Var.f12312g.put(i12, new y(new b(i12)));
                        c0Var.f12318m++;
                    }
                }
                i10++;
            }
            if (c0Var.f12307a != 2) {
                c0Var.f12312g.remove(0);
            }
        }

        @Override // d8.x
        public final void b(c9.v vVar, u7.j jVar, d0.d dVar) {
        }
    }

    /* compiled from: TsExtractor.java */
    /* loaded from: classes.dex */
    public class b implements x {

        /* renamed from: a  reason: collision with root package name */
        public final u7.x f12326a = new u7.x(new byte[5], 1, 0);

        /* renamed from: b  reason: collision with root package name */
        public final SparseArray<d0> f12327b = new SparseArray<>();

        /* renamed from: c  reason: collision with root package name */
        public final SparseIntArray f12328c = new SparseIntArray();

        /* renamed from: d  reason: collision with root package name */
        public final int f12329d;

        public b(int i6) {
            this.f12329d = i6;
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0145, code lost:
            if (r27.q() == 21) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:101:0x020e  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01fe  */
        @Override // d8.x
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(c9.q qVar) {
            c9.v vVar;
            SparseBooleanArray sparseBooleanArray;
            SparseArray<d0> sparseArray;
            int i6;
            c9.v vVar2;
            int i10;
            SparseArray<d0> sparseArray2;
            int i11;
            int i12;
            d0 a10;
            SparseIntArray sparseIntArray;
            int i13;
            SparseArray<d0> sparseArray3;
            SparseIntArray sparseIntArray2;
            if (qVar.q() != 2) {
                return;
            }
            c0 c0Var = c0.this;
            int i14 = c0Var.f12307a;
            int i15 = 0;
            List<c9.v> list = c0Var.f12309c;
            if (i14 != 1 && i14 != 2 && c0Var.f12318m != 1) {
                vVar = new c9.v(list.get(0).c());
                list.add(vVar);
            } else {
                vVar = list.get(0);
            }
            if ((qVar.q() & 128) == 0) {
                return;
            }
            qVar.B(1);
            int v10 = qVar.v();
            int i16 = 3;
            qVar.B(3);
            u7.x xVar = this.f12326a;
            qVar.b(0, xVar.f33924b, 2);
            xVar.o(0);
            xVar.r(3);
            c0Var.f12323s = xVar.i(13);
            qVar.b(0, xVar.f33924b, 2);
            xVar.o(0);
            xVar.r(4);
            qVar.B(xVar.i(12));
            d0.c cVar = c0Var.f;
            int i17 = c0Var.f12307a;
            if (i17 == 2 && c0Var.f12322q == null) {
                d0 a11 = cVar.a(21, new d0.b(21, null, null, c9.w.f));
                c0Var.f12322q = a11;
                if (a11 != null) {
                    a11.b(vVar, c0Var.f12317l, new d0.d(v10, 21, 8192));
                }
            }
            SparseArray<d0> sparseArray4 = this.f12327b;
            sparseArray4.clear();
            SparseIntArray sparseIntArray3 = this.f12328c;
            sparseIntArray3.clear();
            int i18 = qVar.f5188c - qVar.f5187b;
            while (true) {
                sparseBooleanArray = c0Var.f12313h;
                if (i18 <= 0) {
                    break;
                }
                qVar.b(i15, xVar.f33924b, 5);
                xVar.o(i15);
                int i19 = xVar.i(8);
                xVar.r(i16);
                int i20 = xVar.i(13);
                xVar.r(4);
                int i21 = xVar.i(12);
                int i22 = qVar.f5187b;
                int i23 = i21 + i22;
                c9.v vVar3 = vVar;
                int i24 = v10;
                u7.x xVar2 = xVar;
                String str = null;
                ArrayList arrayList = null;
                int i25 = -1;
                while (true) {
                    if (qVar.f5187b < i23) {
                        int q10 = qVar.q();
                        sparseArray2 = sparseArray4;
                        int q11 = qVar.f5187b + qVar.q();
                        i11 = i20;
                        if (q11 > i23) {
                            break;
                        }
                        if (q10 == 5) {
                            long r = qVar.r();
                            if (r != 1094921523) {
                                if (r != 1161904947) {
                                    if (r != 1094921524) {
                                        if (r == 1212503619) {
                                            sparseIntArray2 = sparseIntArray3;
                                            i25 = 36;
                                        }
                                        sparseIntArray2 = sparseIntArray3;
                                    }
                                    sparseIntArray2 = sparseIntArray3;
                                    i25 = 172;
                                }
                                sparseIntArray2 = sparseIntArray3;
                                i25 = 135;
                            }
                            sparseIntArray2 = sparseIntArray3;
                            i25 = 129;
                        } else {
                            if (q10 != 106) {
                                if (q10 != 122) {
                                    if (q10 != 127) {
                                        if (q10 == 123) {
                                            sparseIntArray2 = sparseIntArray3;
                                            i25 = 138;
                                        } else if (q10 == 10) {
                                            str = qVar.n(3).trim();
                                            sparseIntArray2 = sparseIntArray3;
                                        } else if (q10 == 89) {
                                            arrayList = new ArrayList();
                                            while (qVar.f5187b < q11) {
                                                String trim = qVar.n(3).trim();
                                                qVar.q();
                                                byte[] bArr = new byte[4];
                                                qVar.b(0, bArr, 4);
                                                arrayList.add(new d0.a(trim, bArr));
                                                sparseIntArray3 = sparseIntArray3;
                                            }
                                            sparseIntArray2 = sparseIntArray3;
                                            i25 = 89;
                                        } else {
                                            sparseIntArray2 = sparseIntArray3;
                                            if (q10 == 111) {
                                                i25 = 257;
                                            }
                                            qVar.B(q11 - qVar.f5187b);
                                            sparseIntArray3 = sparseIntArray2;
                                            sparseArray4 = sparseArray2;
                                            i20 = i11;
                                        }
                                    }
                                }
                                sparseIntArray2 = sparseIntArray3;
                                i25 = 135;
                            }
                            sparseIntArray2 = sparseIntArray3;
                            i25 = 129;
                        }
                        qVar.B(q11 - qVar.f5187b);
                        sparseIntArray3 = sparseIntArray2;
                        sparseArray4 = sparseArray2;
                        i20 = i11;
                    } else {
                        sparseArray2 = sparseArray4;
                        i11 = i20;
                        break;
                    }
                }
                SparseIntArray sparseIntArray4 = sparseIntArray3;
                qVar.A(i23);
                d0.b bVar = new d0.b(i25, str, arrayList, Arrays.copyOfRange(qVar.f5186a, i22, i23));
                if (i19 == 6 || i19 == 5) {
                    i19 = i25;
                }
                i18 -= i21 + 5;
                if (i17 == 2) {
                    i12 = i19;
                } else {
                    i12 = i11;
                }
                if (sparseBooleanArray.get(i12)) {
                    sparseIntArray = sparseIntArray4;
                    sparseArray3 = sparseArray2;
                } else {
                    if (i17 == 2 && i19 == 21) {
                        a10 = c0Var.f12322q;
                        if (i17 != 2) {
                            sparseIntArray = sparseIntArray4;
                            i13 = i11;
                            if (i13 >= sparseIntArray.get(i12, 8192)) {
                                sparseArray3 = sparseArray2;
                            }
                        } else {
                            sparseIntArray = sparseIntArray4;
                            i13 = i11;
                        }
                        sparseIntArray.put(i12, i13);
                        sparseArray3 = sparseArray2;
                        sparseArray3.put(i12, a10);
                    }
                    a10 = cVar.a(i19, bVar);
                    if (i17 != 2) {
                    }
                    sparseIntArray.put(i12, i13);
                    sparseArray3 = sparseArray2;
                    sparseArray3.put(i12, a10);
                }
                sparseIntArray3 = sparseIntArray;
                sparseArray4 = sparseArray3;
                xVar = xVar2;
                vVar = vVar3;
                v10 = i24;
                i15 = 0;
                i16 = 3;
            }
            c9.v vVar4 = vVar;
            int i26 = v10;
            SparseIntArray sparseIntArray5 = sparseIntArray3;
            SparseArray<d0> sparseArray5 = sparseArray4;
            int size = sparseIntArray5.size();
            int i27 = 0;
            while (true) {
                sparseArray = c0Var.f12312g;
                if (i27 >= size) {
                    break;
                }
                int keyAt = sparseIntArray5.keyAt(i27);
                int valueAt = sparseIntArray5.valueAt(i27);
                sparseBooleanArray.put(keyAt, true);
                c0Var.f12314i.put(valueAt, true);
                d0 valueAt2 = sparseArray5.valueAt(i27);
                if (valueAt2 != null) {
                    if (valueAt2 != c0Var.f12322q) {
                        u7.j jVar = c0Var.f12317l;
                        i10 = i26;
                        d0.d dVar = new d0.d(i10, keyAt, 8192);
                        vVar2 = vVar4;
                        valueAt2.b(vVar2, jVar, dVar);
                    } else {
                        vVar2 = vVar4;
                        i10 = i26;
                    }
                    sparseArray.put(valueAt, valueAt2);
                } else {
                    vVar2 = vVar4;
                    i10 = i26;
                }
                i27++;
                vVar4 = vVar2;
                i26 = i10;
            }
            if (i17 == 2) {
                if (!c0Var.f12319n) {
                    c0Var.f12317l.e();
                    c0Var.f12318m = 0;
                    c0Var.f12319n = true;
                }
                return;
            }
            sparseArray.remove(this.f12329d);
            if (i17 == 1) {
                i6 = 0;
            } else {
                i6 = c0Var.f12318m - 1;
            }
            c0Var.f12318m = i6;
            if (i6 == 0) {
                c0Var.f12317l.e();
                c0Var.f12319n = true;
            }
        }

        @Override // d8.x
        public final void b(c9.v vVar, u7.j jVar, d0.d dVar) {
        }
    }
}
