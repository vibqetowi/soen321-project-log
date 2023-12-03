package c8;

import c8.b;
import c8.h;
import c9.q;
import c9.w;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.n;
import java.util.Arrays;
import u7.j;
import u7.s;
import u7.t;
import u7.v;
import u7.y;
/* compiled from: OggExtractor.java */
/* loaded from: classes.dex */
public final class c implements u7.h {

    /* renamed from: a  reason: collision with root package name */
    public j f5088a;

    /* renamed from: b  reason: collision with root package name */
    public h f5089b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5090c;

    @Override // u7.h
    public final boolean b(u7.i iVar) {
        try {
            return c(iVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    public final boolean c(u7.i iVar) {
        boolean z10;
        boolean z11;
        boolean equals;
        e eVar = new e();
        if (eVar.a(iVar, true) && (eVar.f5096a & 2) == 2) {
            int min = Math.min(eVar.f5100e, 8);
            q qVar = new q(min);
            iVar.b(0, qVar.f5186a, min);
            qVar.A(0);
            if (qVar.f5188c - qVar.f5187b >= 5 && qVar.q() == 127 && qVar.r() == 1179402563) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f5089b = new b();
            } else {
                qVar.A(0);
                try {
                    z11 = y.b(1, qVar, true);
                } catch (ParserException unused) {
                    z11 = false;
                }
                if (z11) {
                    this.f5089b = new i();
                } else {
                    qVar.A(0);
                    if (qVar.f5188c - qVar.f5187b < 8) {
                        equals = false;
                    } else {
                        byte[] bArr = new byte[8];
                        qVar.b(0, bArr, 8);
                        equals = Arrays.equals(bArr, g.f5102o);
                    }
                    if (equals) {
                        this.f5089b = new g();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // u7.h
    public final void f(j jVar) {
        this.f5088a = jVar;
    }

    @Override // u7.h
    public final void g(long j10, long j11) {
        h hVar = this.f5089b;
        if (hVar != null) {
            d dVar = hVar.f5104a;
            e eVar = dVar.f5091a;
            eVar.f5096a = 0;
            eVar.f5097b = 0L;
            eVar.f5098c = 0;
            eVar.f5099d = 0;
            eVar.f5100e = 0;
            dVar.f5092b.x(0);
            dVar.f5093c = -1;
            dVar.f5095e = false;
            if (j10 == 0) {
                hVar.d(!hVar.f5114l);
            } else if (hVar.f5110h != 0) {
                long j12 = (hVar.f5111i * j11) / 1000000;
                hVar.f5108e = j12;
                f fVar = hVar.f5107d;
                int i6 = w.f5205a;
                fVar.c(j12);
                hVar.f5110h = 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @Override // u7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(u7.i iVar, s sVar) {
        q qVar;
        boolean z10;
        boolean z11;
        q qVar2;
        byte[] bArr;
        sc.b.E(this.f5088a);
        if (this.f5089b == null) {
            if (c(iVar)) {
                iVar.k();
            } else {
                throw ParserException.a("Failed to determine bitstream type", null);
            }
        }
        if (!this.f5090c) {
            v n10 = this.f5088a.n(0, 1);
            this.f5088a.e();
            h hVar = this.f5089b;
            hVar.f5106c = this.f5088a;
            hVar.f5105b = n10;
            hVar.d(true);
            this.f5090c = true;
        }
        h hVar2 = this.f5089b;
        sc.b.E(hVar2.f5105b);
        int i6 = w.f5205a;
        int i10 = hVar2.f5110h;
        d dVar = hVar2.f5104a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                } else {
                    long b10 = hVar2.f5107d.b(iVar);
                    if (b10 >= 0) {
                        sVar.f33905a = b10;
                        return 1;
                    }
                    if (b10 < -1) {
                        hVar2.a(-(b10 + 2));
                    }
                    if (!hVar2.f5114l) {
                        t a10 = hVar2.f5107d.a();
                        sc.b.E(a10);
                        hVar2.f5106c.i(a10);
                        hVar2.f5114l = true;
                    }
                    if (hVar2.f5113k <= 0 && !dVar.a(iVar)) {
                        hVar2.f5110h = 3;
                    } else {
                        hVar2.f5113k = 0L;
                        q qVar3 = dVar.f5092b;
                        long b11 = hVar2.b(qVar3);
                        if (b11 >= 0) {
                            long j10 = hVar2.f5109g;
                            if (j10 + b11 >= hVar2.f5108e) {
                                hVar2.f5105b.a(qVar3.f5188c, qVar3);
                                hVar2.f5105b.d((j10 * 1000000) / hVar2.f5111i, 1, qVar3.f5188c, 0, null);
                                hVar2.f5108e = -1L;
                            }
                        }
                        hVar2.f5109g += b11;
                        return 0;
                    }
                }
            } else {
                iVar.l((int) hVar2.f);
                hVar2.f5110h = 2;
                return 0;
            }
        } else {
            while (true) {
                boolean a11 = dVar.a(iVar);
                qVar = dVar.f5092b;
                if (!a11) {
                    hVar2.f5110h = 3;
                    z10 = false;
                    break;
                }
                long position = iVar.getPosition();
                long j11 = hVar2.f;
                hVar2.f5113k = position - j11;
                if (hVar2.c(qVar, j11, hVar2.f5112j)) {
                    hVar2.f = iVar.getPosition();
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                n nVar = hVar2.f5112j.f5116a;
                hVar2.f5111i = nVar.T;
                if (!hVar2.f5115m) {
                    hVar2.f5105b.e(nVar);
                    hVar2.f5115m = true;
                }
                b.a aVar = hVar2.f5112j.f5117b;
                if (aVar != null) {
                    hVar2.f5107d = aVar;
                } else if (iVar.getLength() == -1) {
                    hVar2.f5107d = new h.b();
                } else {
                    e eVar = dVar.f5091a;
                    if ((eVar.f5096a & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    qVar2 = qVar;
                    hVar2.f5107d = new a(hVar2, hVar2.f, iVar.getLength(), eVar.f5099d + eVar.f5100e, eVar.f5097b, z11);
                    hVar2.f5110h = 2;
                    bArr = qVar2.f5186a;
                    if (bArr.length != 65025) {
                        return 0;
                    }
                    qVar2.y(Arrays.copyOf(bArr, Math.max(65025, qVar2.f5188c)), qVar2.f5188c);
                    return 0;
                }
                qVar2 = qVar;
                hVar2.f5110h = 2;
                bArr = qVar2.f5186a;
                if (bArr.length != 65025) {
                }
            }
        }
        return -1;
    }

    @Override // u7.h
    public final void a() {
    }
}
