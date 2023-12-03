package d8;

import android.util.Log;
import d8.d0;
/* compiled from: PesReader.java */
/* loaded from: classes.dex */
public final class t implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public final j f12560a;

    /* renamed from: b  reason: collision with root package name */
    public final u7.x f12561b = new u7.x(new byte[10], 1, 0);

    /* renamed from: c  reason: collision with root package name */
    public int f12562c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f12563d;

    /* renamed from: e  reason: collision with root package name */
    public c9.v f12564e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12565g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12566h;

    /* renamed from: i  reason: collision with root package name */
    public int f12567i;

    /* renamed from: j  reason: collision with root package name */
    public int f12568j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12569k;

    /* renamed from: l  reason: collision with root package name */
    public long f12570l;

    public t(j jVar) {
        this.f12560a = jVar;
    }

    @Override // d8.d0
    public final void a(int i6, c9.q qVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        sc.b.E(this.f12564e);
        int i13 = i6 & 1;
        j jVar = this.f12560a;
        int i14 = -1;
        int i15 = 3;
        int i16 = 2;
        if (i13 != 0) {
            int i17 = this.f12562c;
            if (i17 != 0 && i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3) {
                        int i18 = this.f12568j;
                        if (i18 != -1) {
                            StringBuilder sb2 = new StringBuilder(59);
                            sb2.append("Unexpected start indicator: expected ");
                            sb2.append(i18);
                            sb2.append(" more bytes");
                            Log.w("PesReader", sb2.toString());
                        }
                        jVar.e();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f12562c = 1;
            this.f12563d = 0;
        }
        int i19 = i6;
        while (true) {
            int i20 = qVar.f5188c;
            int i21 = qVar.f5187b;
            int i22 = i20 - i21;
            if (i22 > 0) {
                int i23 = this.f12562c;
                if (i23 != 0) {
                    u7.x xVar = this.f12561b;
                    if (i23 != 1) {
                        if (i23 != i16) {
                            if (i23 == i15) {
                                int i24 = this.f12568j;
                                if (i24 == i14) {
                                    i12 = 0;
                                } else {
                                    i12 = i22 - i24;
                                }
                                if (i12 > 0) {
                                    i22 -= i12;
                                    qVar.z(i21 + i22);
                                }
                                jVar.a(qVar);
                                int i25 = this.f12568j;
                                if (i25 != i14) {
                                    int i26 = i25 - i22;
                                    this.f12568j = i26;
                                    if (i26 == 0) {
                                        jVar.e();
                                        this.f12562c = 1;
                                        this.f12563d = 0;
                                    }
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else if (d(Math.min(10, this.f12567i), qVar, xVar.f33924b) && d(this.f12567i, qVar, null)) {
                            xVar.o(0);
                            this.f12570l = -9223372036854775807L;
                            if (this.f) {
                                xVar.r(4);
                                xVar.r(1);
                                xVar.r(1);
                                long i27 = (xVar.i(i15) << 30) | (xVar.i(15) << 15) | xVar.i(15);
                                xVar.r(1);
                                if (!this.f12566h && this.f12565g) {
                                    xVar.r(4);
                                    xVar.r(1);
                                    long i28 = xVar.i(15) << 15;
                                    xVar.r(1);
                                    xVar.r(1);
                                    this.f12564e.b(i28 | (xVar.i(3) << 30) | xVar.i(15));
                                    this.f12566h = true;
                                }
                                this.f12570l = this.f12564e.b(i27);
                            }
                            if (this.f12569k) {
                                i11 = 4;
                            } else {
                                i11 = 0;
                            }
                            i19 |= i11;
                            jVar.f(i19, this.f12570l);
                            this.f12562c = 3;
                            this.f12563d = 0;
                        }
                    } else if (d(9, qVar, xVar.f33924b)) {
                        xVar.o(0);
                        int i29 = xVar.i(24);
                        if (i29 != 1) {
                            defpackage.d.k(41, "Unexpected start code prefix: ", i29, "PesReader");
                            this.f12568j = -1;
                            z10 = false;
                        } else {
                            xVar.r(8);
                            int i30 = xVar.i(16);
                            xVar.r(5);
                            this.f12569k = xVar.h();
                            xVar.r(2);
                            this.f = xVar.h();
                            this.f12565g = xVar.h();
                            xVar.r(6);
                            int i31 = xVar.i(8);
                            this.f12567i = i31;
                            if (i30 == 0) {
                                this.f12568j = -1;
                            } else {
                                int i32 = ((i30 + 6) - 9) - i31;
                                this.f12568j = i32;
                                if (i32 < 0) {
                                    defpackage.d.k(47, "Found negative packet payload size: ", i32, "PesReader");
                                    this.f12568j = -1;
                                }
                            }
                            z10 = true;
                        }
                        if (z10) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                        this.f12562c = i10;
                        this.f12563d = 0;
                    }
                } else {
                    qVar.B(i22);
                }
                i14 = -1;
                i15 = 3;
                i16 = 2;
            } else {
                return;
            }
        }
    }

    @Override // d8.d0
    public final void b(c9.v vVar, u7.j jVar, d0.d dVar) {
        this.f12564e = vVar;
        this.f12560a.d(jVar, dVar);
    }

    @Override // d8.d0
    public final void c() {
        this.f12562c = 0;
        this.f12563d = 0;
        this.f12566h = false;
        this.f12560a.c();
    }

    public final boolean d(int i6, c9.q qVar, byte[] bArr) {
        int min = Math.min(qVar.f5188c - qVar.f5187b, i6 - this.f12563d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            qVar.B(min);
        } else {
            qVar.b(this.f12563d, bArr, min);
        }
        int i10 = this.f12563d + min;
        this.f12563d = i10;
        if (i10 == i6) {
            return true;
        }
        return false;
    }
}
