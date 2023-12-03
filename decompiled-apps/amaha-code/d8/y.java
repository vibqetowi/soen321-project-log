package d8;

import d8.d0;
/* compiled from: SectionReader.java */
/* loaded from: classes.dex */
public final class y implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public final x f12596a;

    /* renamed from: b  reason: collision with root package name */
    public final c9.q f12597b = new c9.q(32);

    /* renamed from: c  reason: collision with root package name */
    public int f12598c;

    /* renamed from: d  reason: collision with root package name */
    public int f12599d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12600e;
    public boolean f;

    public y(x xVar) {
        this.f12596a = xVar;
    }

    @Override // d8.d0
    public final void a(int i6, c9.q qVar) {
        boolean z10;
        int i10;
        boolean z11;
        if ((i6 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = qVar.f5187b + qVar.q();
        } else {
            i10 = -1;
        }
        if (this.f) {
            if (!z10) {
                return;
            }
            this.f = false;
            qVar.A(i10);
            this.f12599d = 0;
        }
        while (true) {
            int i11 = qVar.f5188c;
            int i12 = qVar.f5187b;
            if (i11 - i12 > 0) {
                int i13 = this.f12599d;
                c9.q qVar2 = this.f12597b;
                if (i13 < 3) {
                    if (i13 == 0) {
                        int q10 = qVar.q();
                        qVar.A(qVar.f5187b - 1);
                        if (q10 == 255) {
                            this.f = true;
                            return;
                        }
                    }
                    int min = Math.min(qVar.f5188c - qVar.f5187b, 3 - this.f12599d);
                    qVar.b(this.f12599d, qVar2.f5186a, min);
                    int i14 = this.f12599d + min;
                    this.f12599d = i14;
                    if (i14 == 3) {
                        qVar2.A(0);
                        qVar2.z(3);
                        qVar2.B(1);
                        int q11 = qVar2.q();
                        int q12 = qVar2.q();
                        if ((q11 & 128) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f12600e = z11;
                        int i15 = (((q11 & 15) << 8) | q12) + 3;
                        this.f12598c = i15;
                        byte[] bArr = qVar2.f5186a;
                        if (bArr.length < i15) {
                            qVar2.a(Math.min(4098, Math.max(i15, bArr.length * 2)));
                        }
                    }
                } else {
                    int min2 = Math.min(i11 - i12, this.f12598c - i13);
                    qVar.b(this.f12599d, qVar2.f5186a, min2);
                    int i16 = this.f12599d + min2;
                    this.f12599d = i16;
                    int i17 = this.f12598c;
                    if (i16 != i17) {
                        continue;
                    } else {
                        if (this.f12600e) {
                            byte[] bArr2 = qVar2.f5186a;
                            int i18 = c9.w.f5205a;
                            int i19 = -1;
                            for (int i20 = 0; i20 < i17; i20++) {
                                i19 = c9.w.f5214k[((i19 >>> 24) ^ (bArr2[i20] & 255)) & 255] ^ (i19 << 8);
                            }
                            if (i19 != 0) {
                                this.f = true;
                                return;
                            }
                            qVar2.z(this.f12598c - 4);
                        } else {
                            qVar2.z(i17);
                        }
                        qVar2.A(0);
                        this.f12596a.a(qVar2);
                        this.f12599d = 0;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // d8.d0
    public final void b(c9.v vVar, u7.j jVar, d0.d dVar) {
        this.f12596a.b(vVar, jVar, dVar);
        this.f = true;
    }

    @Override // d8.d0
    public final void c() {
        this.f = true;
    }
}
