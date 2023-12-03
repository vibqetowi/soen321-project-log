package d8;

import com.google.android.exoplayer2.n;
import d8.d0;
import q7.c;
/* compiled from: Ac4Reader.java */
/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    public final u7.x f12331a;

    /* renamed from: b  reason: collision with root package name */
    public final c9.q f12332b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12333c;

    /* renamed from: d  reason: collision with root package name */
    public String f12334d;

    /* renamed from: e  reason: collision with root package name */
    public u7.v f12335e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f12336g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12337h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12338i;

    /* renamed from: j  reason: collision with root package name */
    public long f12339j;

    /* renamed from: k  reason: collision with root package name */
    public com.google.android.exoplayer2.n f12340k;

    /* renamed from: l  reason: collision with root package name */
    public int f12341l;

    /* renamed from: m  reason: collision with root package name */
    public long f12342m;

    public d(String str) {
        u7.x xVar = new u7.x(new byte[16], 1, 0);
        this.f12331a = xVar;
        this.f12332b = new c9.q(xVar.f33924b);
        this.f = 0;
        this.f12336g = 0;
        this.f12337h = false;
        this.f12338i = false;
        this.f12342m = -9223372036854775807L;
        this.f12333c = str;
    }

    @Override // d8.j
    public final void a(c9.q qVar) {
        int i6;
        boolean z10;
        boolean z11;
        int q10;
        boolean z12;
        boolean z13;
        sc.b.E(this.f12335e);
        while (true) {
            int i10 = qVar.f5188c - qVar.f5187b;
            if (i10 > 0) {
                int i11 = this.f;
                boolean z14 = true;
                c9.q qVar2 = this.f12332b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            int min = Math.min(i10, this.f12341l - this.f12336g);
                            this.f12335e.a(min, qVar);
                            int i12 = this.f12336g + min;
                            this.f12336g = i12;
                            int i13 = this.f12341l;
                            if (i12 == i13) {
                                long j10 = this.f12342m;
                                if (j10 != -9223372036854775807L) {
                                    this.f12335e.d(j10, 1, i13, 0, null);
                                    this.f12342m += this.f12339j;
                                }
                                this.f = 0;
                            }
                        }
                    } else {
                        byte[] bArr = qVar2.f5186a;
                        int min2 = Math.min(i10, 16 - this.f12336g);
                        qVar.b(this.f12336g, bArr, min2);
                        int i14 = this.f12336g + min2;
                        this.f12336g = i14;
                        if (i14 != 16) {
                            z14 = false;
                        }
                        if (z14) {
                            u7.x xVar = this.f12331a;
                            xVar.o(0);
                            c.a b10 = q7.c.b(xVar);
                            com.google.android.exoplayer2.n nVar = this.f12340k;
                            int i15 = b10.f29239a;
                            if (nVar == null || 2 != nVar.S || i15 != nVar.T || !"audio/ac4".equals(nVar.F)) {
                                n.a aVar = new n.a();
                                aVar.f6656a = this.f12334d;
                                aVar.f6665k = "audio/ac4";
                                aVar.f6677x = 2;
                                aVar.f6678y = i15;
                                aVar.f6658c = this.f12333c;
                                com.google.android.exoplayer2.n nVar2 = new com.google.android.exoplayer2.n(aVar);
                                this.f12340k = nVar2;
                                this.f12335e.e(nVar2);
                            }
                            this.f12341l = b10.f29240b;
                            this.f12339j = (b10.f29241c * 1000000) / this.f12340k.T;
                            qVar2.A(0);
                            this.f12335e.a(16, qVar2);
                            this.f = 2;
                        }
                    }
                } else {
                    while (true) {
                        i6 = 64;
                        if (qVar.f5188c - qVar.f5187b > 0) {
                            if (!this.f12337h) {
                                if (qVar.q() == 172) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                this.f12337h = z11;
                            } else {
                                q10 = qVar.q();
                                if (q10 == 172) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f12337h = z12;
                                if (q10 == 64 || q10 == 65) {
                                    break;
                                }
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    if (q10 == 65) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    this.f12338i = z13;
                    z10 = true;
                    if (z10) {
                        this.f = 1;
                        byte[] bArr2 = qVar2.f5186a;
                        bArr2[0] = -84;
                        if (this.f12338i) {
                            i6 = 65;
                        }
                        bArr2[1] = (byte) i6;
                        this.f12336g = 2;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // d8.j
    public final void c() {
        this.f = 0;
        this.f12336g = 0;
        this.f12337h = false;
        this.f12338i = false;
        this.f12342m = -9223372036854775807L;
    }

    @Override // d8.j
    public final void d(u7.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f12334d = dVar.f12352e;
        dVar.b();
        this.f12335e = jVar.n(dVar.f12351d, 1);
    }

    @Override // d8.j
    public final void f(int i6, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f12342m = j10;
        }
    }

    @Override // d8.j
    public final void e() {
    }
}
