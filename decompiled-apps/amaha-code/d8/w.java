package d8;

import android.util.Log;
import android.util.SparseArray;
import d8.d0;
import u7.t;
/* compiled from: PsExtractor.java */
/* loaded from: classes.dex */
public final class w implements u7.h {

    /* renamed from: e  reason: collision with root package name */
    public boolean f12584e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12585g;

    /* renamed from: h  reason: collision with root package name */
    public long f12586h;

    /* renamed from: i  reason: collision with root package name */
    public u f12587i;

    /* renamed from: j  reason: collision with root package name */
    public u7.j f12588j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12589k;

    /* renamed from: a  reason: collision with root package name */
    public final c9.v f12580a = new c9.v(0);

    /* renamed from: c  reason: collision with root package name */
    public final c9.q f12582c = new c9.q(4096);

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<a> f12581b = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    public final v f12583d = new v();

    /* compiled from: PsExtractor.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final j f12590a;

        /* renamed from: b  reason: collision with root package name */
        public final c9.v f12591b;

        /* renamed from: c  reason: collision with root package name */
        public final u7.x f12592c = new u7.x(new byte[64], 1, 0);

        /* renamed from: d  reason: collision with root package name */
        public boolean f12593d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f12594e;
        public boolean f;

        /* renamed from: g  reason: collision with root package name */
        public long f12595g;

        public a(j jVar, c9.v vVar) {
            this.f12590a = jVar;
            this.f12591b = vVar;
        }
    }

    @Override // u7.h
    public final boolean b(u7.i iVar) {
        byte[] bArr = new byte[14];
        u7.e eVar = (u7.e) iVar;
        eVar.d(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        eVar.m(bArr[13] & 7, false);
        eVar.d(bArr, 0, 3, false);
        if (1 != (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return false;
        }
        return true;
    }

    @Override // u7.h
    public final void f(u7.j jVar) {
        this.f12588j = jVar;
    }

    @Override // u7.h
    public final void g(long j10, long j11) {
        boolean z10;
        c9.v vVar = this.f12580a;
        boolean z11 = true;
        if (vVar.d() == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            long c10 = vVar.c();
            z10 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : false;
        }
        if (z10) {
            vVar.e(j11);
        }
        u uVar = this.f12587i;
        if (uVar != null) {
            uVar.c(j11);
        }
        int i6 = 0;
        while (true) {
            SparseArray<a> sparseArray = this.f12581b;
            if (i6 < sparseArray.size()) {
                a valueAt = sparseArray.valueAt(i6);
                valueAt.f = false;
                valueAt.f12590a.c();
                i6++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0215  */
    @Override // u7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(u7.i iVar, u7.s sVar) {
        boolean z10;
        int i6;
        long j10;
        long j11;
        long j12;
        j kVar;
        boolean z11;
        sc.b.E(this.f12588j);
        long length = iVar.getLength();
        int i10 = 1;
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j13 = -9223372036854775807L;
        v vVar = this.f12583d;
        if (z10 && !vVar.f12575c) {
            boolean z12 = vVar.f12577e;
            c9.q qVar = vVar.f12574b;
            if (!z12) {
                long length2 = iVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j14 = length2 - min;
                if (iVar.getPosition() != j14) {
                    sVar.f33905a = j14;
                } else {
                    qVar.x(min);
                    iVar.k();
                    iVar.b(0, qVar.f5186a, min);
                    int i12 = qVar.f5187b;
                    int i13 = qVar.f5188c - 4;
                    while (true) {
                        if (i13 < i12) {
                            break;
                        }
                        if (v.b(qVar.f5186a, i13) == 442) {
                            qVar.A(i13 + 4);
                            long c10 = v.c(qVar);
                            if (c10 != -9223372036854775807L) {
                                j13 = c10;
                                break;
                            }
                        }
                        i13--;
                    }
                    vVar.f12578g = j13;
                    vVar.f12577e = true;
                    i10 = 0;
                }
            } else if (vVar.f12578g == -9223372036854775807L) {
                vVar.a(iVar);
                return 0;
            } else if (!vVar.f12576d) {
                int min2 = (int) Math.min(20000L, iVar.getLength());
                long j15 = 0;
                if (iVar.getPosition() != j15) {
                    sVar.f33905a = j15;
                } else {
                    qVar.x(min2);
                    iVar.k();
                    iVar.b(0, qVar.f5186a, min2);
                    int i14 = qVar.f5187b;
                    int i15 = qVar.f5188c;
                    while (true) {
                        if (i14 >= i15 - 3) {
                            break;
                        }
                        if (v.b(qVar.f5186a, i14) == 442) {
                            qVar.A(i14 + 4);
                            long c11 = v.c(qVar);
                            if (c11 != -9223372036854775807L) {
                                j13 = c11;
                                break;
                            }
                        }
                        i14++;
                    }
                    vVar.f = j13;
                    vVar.f12576d = true;
                    i10 = 0;
                }
            } else {
                long j16 = vVar.f;
                if (j16 == -9223372036854775807L) {
                    vVar.a(iVar);
                    return 0;
                }
                c9.v vVar2 = vVar.f12573a;
                long b10 = vVar2.b(vVar.f12578g) - vVar2.b(j16);
                vVar.f12579h = b10;
                if (b10 < 0) {
                    StringBuilder sb2 = new StringBuilder(65);
                    sb2.append("Invalid duration: ");
                    sb2.append(b10);
                    sb2.append(". Using TIME_UNSET instead.");
                    Log.w("PsDurationReader", sb2.toString());
                    vVar.f12579h = -9223372036854775807L;
                }
                vVar.a(iVar);
                return 0;
            }
            return i10;
        }
        if (!this.f12589k) {
            this.f12589k = true;
            long j17 = vVar.f12579h;
            if (j17 != -9223372036854775807L) {
                i6 = 442;
                u uVar = new u(vVar.f12573a, j17, length);
                this.f12587i = uVar;
                this.f12588j.i(uVar.f33837a);
            } else {
                i6 = 442;
                this.f12588j.i(new t.b(j17));
            }
        } else {
            i6 = 442;
        }
        u uVar2 = this.f12587i;
        if (uVar2 != null) {
            if (uVar2.f33839c != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return uVar2.a(iVar, sVar);
            }
        }
        iVar.k();
        if (i11 != 0) {
            j10 = length - iVar.e();
        } else {
            j10 = -1;
        }
        if (j10 != -1 && j10 < 4) {
            return -1;
        }
        c9.q qVar2 = this.f12582c;
        if (!iVar.d(qVar2.f5186a, 0, 4, true)) {
            return -1;
        }
        qVar2.A(0);
        int c12 = qVar2.c();
        if (c12 == 441) {
            return -1;
        }
        if (c12 == i6) {
            iVar.b(0, qVar2.f5186a, 10);
            qVar2.A(9);
            iVar.l((qVar2.q() & 7) + 14);
            return 0;
        } else if (c12 == 443) {
            iVar.b(0, qVar2.f5186a, 2);
            qVar2.A(0);
            iVar.l(qVar2.v() + 6);
            return 0;
        } else if (((c12 & (-256)) >> 8) != 1) {
            iVar.l(1);
            return 0;
        } else {
            int i16 = c12 & 255;
            SparseArray<a> sparseArray = this.f12581b;
            a aVar = sparseArray.get(i16);
            if (!this.f12584e) {
                if (aVar == null) {
                    j jVar = null;
                    if (i16 == 189) {
                        kVar = new b(null);
                        this.f = true;
                        this.f12586h = iVar.getPosition();
                    } else if ((i16 & 224) == 192) {
                        kVar = new q(null);
                        this.f = true;
                        this.f12586h = iVar.getPosition();
                    } else {
                        if ((i16 & 240) == 224) {
                            kVar = new k(null);
                            this.f12585g = true;
                            this.f12586h = iVar.getPosition();
                        }
                        if (jVar != null) {
                            jVar.d(this.f12588j, new d0.d(i16, 256));
                            aVar = new a(jVar, this.f12580a);
                            sparseArray.put(i16, aVar);
                        }
                    }
                    jVar = kVar;
                    if (jVar != null) {
                    }
                }
                if (this.f && this.f12585g) {
                    j12 = this.f12586h + 8192;
                } else {
                    j12 = 1048576;
                }
                if (iVar.getPosition() > j12) {
                    this.f12584e = true;
                    this.f12588j.e();
                }
            }
            iVar.b(0, qVar2.f5186a, 2);
            qVar2.A(0);
            int v10 = qVar2.v() + 6;
            if (aVar == null) {
                iVar.l(v10);
            } else {
                qVar2.x(v10);
                iVar.readFully(qVar2.f5186a, 0, v10);
                qVar2.A(6);
                u7.x xVar = aVar.f12592c;
                qVar2.b(0, xVar.f33924b, 3);
                xVar.o(0);
                xVar.r(8);
                aVar.f12593d = xVar.h();
                aVar.f12594e = xVar.h();
                xVar.r(6);
                qVar2.b(0, xVar.f33924b, xVar.i(8));
                xVar.o(0);
                aVar.f12595g = 0L;
                if (aVar.f12593d) {
                    xVar.r(4);
                    xVar.r(1);
                    xVar.r(1);
                    long i17 = (xVar.i(3) << 30) | (xVar.i(15) << 15) | xVar.i(15);
                    xVar.r(1);
                    boolean z13 = aVar.f;
                    c9.v vVar3 = aVar.f12591b;
                    if (!z13 && aVar.f12594e) {
                        xVar.r(4);
                        xVar.r(1);
                        j11 = i17;
                        xVar.r(1);
                        xVar.r(1);
                        vVar3.b((xVar.i(3) << 30) | (xVar.i(15) << 15) | xVar.i(15));
                        aVar.f = true;
                    } else {
                        j11 = i17;
                    }
                    aVar.f12595g = vVar3.b(j11);
                }
                long j18 = aVar.f12595g;
                j jVar2 = aVar.f12590a;
                jVar2.f(4, j18);
                jVar2.a(qVar2);
                jVar2.e();
                qVar2.z(qVar2.f5186a.length);
            }
            return 0;
        }
    }

    @Override // u7.h
    public final void a() {
    }
}
