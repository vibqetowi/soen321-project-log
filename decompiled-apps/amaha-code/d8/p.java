package d8;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.n;
import com.theinnerhour.b2b.utils.Constants;
import d8.d0;
import java.util.Collections;
import q7.a;
/* compiled from: LatmReader.java */
/* loaded from: classes.dex */
public final class p implements j {

    /* renamed from: a  reason: collision with root package name */
    public final String f12522a;

    /* renamed from: b  reason: collision with root package name */
    public final c9.q f12523b;

    /* renamed from: c  reason: collision with root package name */
    public final u7.x f12524c;

    /* renamed from: d  reason: collision with root package name */
    public u7.v f12525d;

    /* renamed from: e  reason: collision with root package name */
    public String f12526e;
    public com.google.android.exoplayer2.n f;

    /* renamed from: g  reason: collision with root package name */
    public int f12527g;

    /* renamed from: h  reason: collision with root package name */
    public int f12528h;

    /* renamed from: i  reason: collision with root package name */
    public int f12529i;

    /* renamed from: j  reason: collision with root package name */
    public int f12530j;

    /* renamed from: k  reason: collision with root package name */
    public long f12531k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12532l;

    /* renamed from: m  reason: collision with root package name */
    public int f12533m;

    /* renamed from: n  reason: collision with root package name */
    public int f12534n;

    /* renamed from: o  reason: collision with root package name */
    public int f12535o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12536p;

    /* renamed from: q  reason: collision with root package name */
    public long f12537q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public long f12538s;

    /* renamed from: t  reason: collision with root package name */
    public int f12539t;

    /* renamed from: u  reason: collision with root package name */
    public String f12540u;

    public p(String str) {
        this.f12522a = str;
        c9.q qVar = new c9.q((int) Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID);
        this.f12523b = qVar;
        this.f12524c = new u7.x(qVar.f5186a, 1, 0);
        this.f12531k = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0181, code lost:
        throw com.google.android.exoplayer2.ParserException.a(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018e, code lost:
        if (r23.f12532l == false) goto L104;
     */
    @Override // d8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(c9.q qVar) {
        int i6;
        int i10;
        boolean h10;
        sc.b.E(this.f12525d);
        while (true) {
            int i11 = qVar.f5188c - qVar.f5187b;
            if (i11 > 0) {
                int i12 = this.f12527g;
                if (i12 != 0) {
                    if (i12 != 1) {
                        c9.q qVar2 = this.f12523b;
                        u7.x xVar = this.f12524c;
                        if (i12 != 2) {
                            if (i12 == 3) {
                                int min = Math.min(i11, this.f12529i - this.f12528h);
                                qVar.b(this.f12528h, xVar.f33924b, min);
                                int i13 = this.f12528h + min;
                                this.f12528h = i13;
                                if (i13 == this.f12529i) {
                                    xVar.o(0);
                                    if (!xVar.h()) {
                                        this.f12532l = true;
                                        int i14 = xVar.i(1);
                                        if (i14 == 1) {
                                            i10 = xVar.i(1);
                                        } else {
                                            i10 = 0;
                                        }
                                        this.f12533m = i10;
                                        if (i10 == 0) {
                                            if (i14 == 1) {
                                                xVar.i((xVar.i(2) + 1) * 8);
                                            }
                                            if (xVar.h()) {
                                                this.f12534n = xVar.i(6);
                                                int i15 = xVar.i(4);
                                                int i16 = xVar.i(3);
                                                if (i15 != 0 || i16 != 0) {
                                                    break;
                                                }
                                                if (i14 == 0) {
                                                    int g5 = xVar.g();
                                                    int b10 = xVar.b();
                                                    a.C0493a b11 = q7.a.b(xVar, true);
                                                    this.f12540u = b11.f29232c;
                                                    this.r = b11.f29230a;
                                                    this.f12539t = b11.f29231b;
                                                    int b12 = b10 - xVar.b();
                                                    xVar.o(g5);
                                                    byte[] bArr = new byte[(b12 + 7) / 8];
                                                    xVar.j(bArr, b12);
                                                    n.a aVar = new n.a();
                                                    aVar.f6656a = this.f12526e;
                                                    aVar.f6665k = "audio/mp4a-latm";
                                                    aVar.f6662h = this.f12540u;
                                                    aVar.f6677x = this.f12539t;
                                                    aVar.f6678y = this.r;
                                                    aVar.f6667m = Collections.singletonList(bArr);
                                                    aVar.f6658c = this.f12522a;
                                                    com.google.android.exoplayer2.n nVar = new com.google.android.exoplayer2.n(aVar);
                                                    if (!nVar.equals(this.f)) {
                                                        this.f = nVar;
                                                        this.f12538s = 1024000000 / nVar.T;
                                                        this.f12525d.e(nVar);
                                                    }
                                                } else {
                                                    int b13 = xVar.b();
                                                    a.C0493a b14 = q7.a.b(xVar, true);
                                                    this.f12540u = b14.f29232c;
                                                    this.r = b14.f29230a;
                                                    this.f12539t = b14.f29231b;
                                                    xVar.r(xVar.i((xVar.i(2) + 1) * 8) - (b13 - xVar.b()));
                                                }
                                                int i17 = xVar.i(3);
                                                this.f12535o = i17;
                                                if (i17 != 0) {
                                                    if (i17 != 1) {
                                                        if (i17 != 3 && i17 != 4 && i17 != 5) {
                                                            if (i17 != 6 && i17 != 7) {
                                                                throw new IllegalStateException();
                                                            }
                                                            xVar.r(1);
                                                        } else {
                                                            xVar.r(6);
                                                        }
                                                    } else {
                                                        xVar.r(9);
                                                    }
                                                } else {
                                                    xVar.r(8);
                                                }
                                                boolean h11 = xVar.h();
                                                this.f12536p = h11;
                                                this.f12537q = 0L;
                                                if (h11) {
                                                    if (i14 == 1) {
                                                        this.f12537q = xVar.i((xVar.i(2) + 1) * 8);
                                                    } else {
                                                        do {
                                                            h10 = xVar.h();
                                                            this.f12537q = (this.f12537q << 8) + xVar.i(8);
                                                        } while (h10);
                                                    }
                                                }
                                                if (xVar.h()) {
                                                    xVar.r(8);
                                                }
                                            } else {
                                                throw ParserException.a(null, null);
                                            }
                                        } else {
                                            throw ParserException.a(null, null);
                                        }
                                    }
                                    if (this.f12533m == 0) {
                                        if (this.f12534n == 0) {
                                            if (this.f12535o == 0) {
                                                int i18 = 0;
                                                do {
                                                    i6 = xVar.i(8);
                                                    i18 += i6;
                                                } while (i6 == 255);
                                                int g10 = xVar.g();
                                                if ((g10 & 7) == 0) {
                                                    qVar2.A(g10 >> 3);
                                                } else {
                                                    xVar.j(qVar2.f5186a, i18 * 8);
                                                    qVar2.A(0);
                                                }
                                                this.f12525d.a(i18, qVar2);
                                                long j10 = this.f12531k;
                                                if (j10 != -9223372036854775807L) {
                                                    this.f12525d.d(j10, 1, i18, 0, null);
                                                    this.f12531k += this.f12538s;
                                                }
                                                if (this.f12536p) {
                                                    xVar.r((int) this.f12537q);
                                                }
                                                this.f12527g = 0;
                                            } else {
                                                throw ParserException.a(null, null);
                                            }
                                        } else {
                                            throw ParserException.a(null, null);
                                        }
                                    } else {
                                        throw ParserException.a(null, null);
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            int q10 = ((this.f12530j & (-225)) << 8) | qVar.q();
                            this.f12529i = q10;
                            if (q10 > qVar2.f5186a.length) {
                                qVar2.x(q10);
                                byte[] bArr2 = qVar2.f5186a;
                                xVar.getClass();
                                xVar.n(bArr2, bArr2.length);
                            }
                            this.f12528h = 0;
                            this.f12527g = 3;
                        }
                    } else {
                        int q11 = qVar.q();
                        if ((q11 & 224) == 224) {
                            this.f12530j = q11;
                            this.f12527g = 2;
                        } else if (q11 != 86) {
                            this.f12527g = 0;
                        }
                    }
                } else if (qVar.q() == 86) {
                    this.f12527g = 1;
                }
            } else {
                return;
            }
        }
    }

    @Override // d8.j
    public final void c() {
        this.f12527g = 0;
        this.f12531k = -9223372036854775807L;
        this.f12532l = false;
    }

    @Override // d8.j
    public final void d(u7.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f12525d = jVar.n(dVar.f12351d, 1);
        dVar.b();
        this.f12526e = dVar.f12352e;
    }

    @Override // d8.j
    public final void f(int i6, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f12531k = j10;
        }
    }

    @Override // d8.j
    public final void e() {
    }
}
