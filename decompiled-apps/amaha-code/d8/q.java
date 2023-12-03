package d8;

import com.google.android.exoplayer2.n;
import d8.d0;
import q7.p;
/* compiled from: MpegAudioReader.java */
/* loaded from: classes.dex */
public final class q implements j {

    /* renamed from: a  reason: collision with root package name */
    public final c9.q f12541a;

    /* renamed from: b  reason: collision with root package name */
    public final p.a f12542b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12543c;

    /* renamed from: d  reason: collision with root package name */
    public u7.v f12544d;

    /* renamed from: e  reason: collision with root package name */
    public String f12545e;
    public int f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f12546g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12547h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12548i;

    /* renamed from: j  reason: collision with root package name */
    public long f12549j;

    /* renamed from: k  reason: collision with root package name */
    public int f12550k;

    /* renamed from: l  reason: collision with root package name */
    public long f12551l;

    public q(String str) {
        c9.q qVar = new c9.q(4);
        this.f12541a = qVar;
        qVar.f5186a[0] = -1;
        this.f12542b = new p.a();
        this.f12551l = -9223372036854775807L;
        this.f12543c = str;
    }

    @Override // d8.j
    public final void a(c9.q qVar) {
        boolean z10;
        boolean z11;
        sc.b.E(this.f12544d);
        while (true) {
            int i6 = qVar.f5188c;
            int i10 = qVar.f5187b;
            int i11 = i6 - i10;
            if (i11 > 0) {
                int i12 = this.f;
                c9.q qVar2 = this.f12541a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            int min = Math.min(i11, this.f12550k - this.f12546g);
                            this.f12544d.a(min, qVar);
                            int i13 = this.f12546g + min;
                            this.f12546g = i13;
                            int i14 = this.f12550k;
                            if (i13 >= i14) {
                                long j10 = this.f12551l;
                                if (j10 != -9223372036854775807L) {
                                    this.f12544d.d(j10, 1, i14, 0, null);
                                    this.f12551l += this.f12549j;
                                }
                                this.f12546g = 0;
                                this.f = 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        int min2 = Math.min(i11, 4 - this.f12546g);
                        qVar.b(this.f12546g, qVar2.f5186a, min2);
                        int i15 = this.f12546g + min2;
                        this.f12546g = i15;
                        if (i15 >= 4) {
                            qVar2.A(0);
                            int c10 = qVar2.c();
                            p.a aVar = this.f12542b;
                            if (!aVar.a(c10)) {
                                this.f12546g = 0;
                                this.f = 1;
                            } else {
                                this.f12550k = aVar.f29301c;
                                if (!this.f12547h) {
                                    int i16 = aVar.f29302d;
                                    this.f12549j = (aVar.f29304g * 1000000) / i16;
                                    n.a aVar2 = new n.a();
                                    aVar2.f6656a = this.f12545e;
                                    aVar2.f6665k = aVar.f29300b;
                                    aVar2.f6666l = 4096;
                                    aVar2.f6677x = aVar.f29303e;
                                    aVar2.f6678y = i16;
                                    aVar2.f6658c = this.f12543c;
                                    this.f12544d.e(new com.google.android.exoplayer2.n(aVar2));
                                    this.f12547h = true;
                                }
                                qVar2.A(0);
                                this.f12544d.a(4, qVar2);
                                this.f = 2;
                            }
                        }
                    }
                } else {
                    byte[] bArr = qVar.f5186a;
                    while (true) {
                        if (i10 < i6) {
                            byte b10 = bArr[i10];
                            if ((b10 & 255) == 255) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (this.f12548i && (b10 & 224) == 224) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f12548i = z10;
                            if (z11) {
                                qVar.A(i10 + 1);
                                this.f12548i = false;
                                qVar2.f5186a[1] = bArr[i10];
                                this.f12546g = 2;
                                this.f = 1;
                                break;
                            }
                            i10++;
                        } else {
                            qVar.A(i6);
                            break;
                        }
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
        this.f12546g = 0;
        this.f12548i = false;
        this.f12551l = -9223372036854775807L;
    }

    @Override // d8.j
    public final void d(u7.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f12545e = dVar.f12352e;
        dVar.b();
        this.f12544d = jVar.n(dVar.f12351d, 1);
    }

    @Override // d8.j
    public final void f(int i6, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f12551l = j10;
        }
    }

    @Override // d8.j
    public final void e() {
    }
}
