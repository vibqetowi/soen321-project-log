package x7;

import c9.q;
import u7.e;
import u7.h;
import u7.i;
import u7.j;
import u7.r;
import u7.s;
import u7.t;
/* compiled from: FlvExtractor.java */
/* loaded from: classes.dex */
public final class a implements h {
    public j f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f37673h;

    /* renamed from: i  reason: collision with root package name */
    public long f37674i;

    /* renamed from: j  reason: collision with root package name */
    public int f37675j;

    /* renamed from: k  reason: collision with root package name */
    public int f37676k;

    /* renamed from: l  reason: collision with root package name */
    public int f37677l;

    /* renamed from: m  reason: collision with root package name */
    public long f37678m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f37679n;

    /* renamed from: o  reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.flv.a f37680o;

    /* renamed from: p  reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.flv.b f37681p;

    /* renamed from: a  reason: collision with root package name */
    public final q f37667a = new q(4);

    /* renamed from: b  reason: collision with root package name */
    public final q f37668b = new q(9);

    /* renamed from: c  reason: collision with root package name */
    public final q f37669c = new q(11);

    /* renamed from: d  reason: collision with root package name */
    public final q f37670d = new q();

    /* renamed from: e  reason: collision with root package name */
    public final b f37671e = new b();

    /* renamed from: g  reason: collision with root package name */
    public int f37672g = 1;

    @Override // u7.h
    public final boolean b(i iVar) {
        q qVar = this.f37667a;
        e eVar = (e) iVar;
        eVar.d(qVar.f5186a, 0, 3, false);
        qVar.A(0);
        if (qVar.s() != 4607062) {
            return false;
        }
        eVar.d(qVar.f5186a, 0, 2, false);
        qVar.A(0);
        if ((qVar.v() & 250) != 0) {
            return false;
        }
        eVar.d(qVar.f5186a, 0, 4, false);
        qVar.A(0);
        int c10 = qVar.c();
        eVar.f = 0;
        eVar.m(c10, false);
        eVar.d(qVar.f5186a, 0, 4, false);
        qVar.A(0);
        if (qVar.c() != 0) {
            return false;
        }
        return true;
    }

    public final q c(i iVar) {
        int i6 = this.f37677l;
        q qVar = this.f37670d;
        byte[] bArr = qVar.f5186a;
        if (i6 > bArr.length) {
            qVar.y(new byte[Math.max(bArr.length * 2, i6)], 0);
        } else {
            qVar.A(0);
        }
        qVar.z(this.f37677l);
        iVar.readFully(qVar.f5186a, 0, this.f37677l);
        return qVar;
    }

    @Override // u7.h
    public final void f(j jVar) {
        this.f = jVar;
    }

    @Override // u7.h
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.f37672g = 1;
            this.f37673h = false;
        } else {
            this.f37672g = 3;
        }
        this.f37675j = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r2.b(r14, r7) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (r2.b(r14, r7) != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d9 A[SYNTHETIC] */
    @Override // u7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(i iVar, s sVar) {
        long j10;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        sc.b.E(this.f);
        while (true) {
            int i6 = this.f37672g;
            boolean z13 = false;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            boolean z14 = this.f37673h;
                            b bVar = this.f37671e;
                            if (z14) {
                                j10 = this.f37674i + this.f37678m;
                            } else if (bVar.f37682b == -9223372036854775807L) {
                                j10 = 0;
                            } else {
                                j10 = this.f37678m;
                            }
                            int i10 = this.f37676k;
                            if (i10 == 8 && this.f37680o != null) {
                                if (!this.f37679n) {
                                    this.f.i(new t.b(-9223372036854775807L));
                                    this.f37679n = true;
                                }
                                com.google.android.exoplayer2.extractor.flv.a aVar = this.f37680o;
                                q c10 = c(iVar);
                                aVar.a(c10);
                            } else {
                                if (i10 == 9 && this.f37681p != null) {
                                    if (!this.f37679n) {
                                        this.f.i(new t.b(-9223372036854775807L));
                                        this.f37679n = true;
                                    }
                                    com.google.android.exoplayer2.extractor.flv.b bVar2 = this.f37681p;
                                    q c11 = c(iVar);
                                    if (bVar2.a(c11)) {
                                    }
                                } else if (i10 == 18 && !this.f37679n) {
                                    q c12 = c(iVar);
                                    bVar.getClass();
                                    bVar.a(j10, c12);
                                    long j12 = bVar.f37682b;
                                    if (j12 != -9223372036854775807L) {
                                        this.f.i(new r(j12, bVar.f37684d, bVar.f37683c));
                                        this.f37679n = true;
                                    }
                                } else {
                                    iVar.l(this.f37677l);
                                    z10 = false;
                                    z11 = false;
                                    if (!this.f37673h && z10) {
                                        this.f37673h = true;
                                        if (bVar.f37682b != -9223372036854775807L) {
                                            j11 = -this.f37678m;
                                        } else {
                                            j11 = 0;
                                        }
                                        this.f37674i = j11;
                                    }
                                    this.f37675j = 4;
                                    this.f37672g = 2;
                                    if (!z11) {
                                        return 0;
                                    }
                                }
                                z10 = false;
                            }
                            z11 = true;
                            if (!this.f37673h) {
                                this.f37673h = true;
                                if (bVar.f37682b != -9223372036854775807L) {
                                }
                                this.f37674i = j11;
                            }
                            this.f37675j = 4;
                            this.f37672g = 2;
                            if (!z11) {
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        q qVar = this.f37669c;
                        if (iVar.a(qVar.f5186a, 0, 11, true)) {
                            qVar.A(0);
                            this.f37676k = qVar.q();
                            this.f37677l = qVar.s();
                            this.f37678m = qVar.s();
                            this.f37678m = ((qVar.q() << 24) | this.f37678m) * 1000;
                            qVar.B(3);
                            this.f37672g = 4;
                            z13 = true;
                        }
                        if (!z13) {
                            return -1;
                        }
                    }
                } else {
                    iVar.l(this.f37675j);
                    this.f37675j = 0;
                    this.f37672g = 3;
                }
            } else {
                q qVar2 = this.f37668b;
                if (iVar.a(qVar2.f5186a, 0, 9, true)) {
                    qVar2.A(0);
                    qVar2.B(4);
                    int q10 = qVar2.q();
                    if ((q10 & 4) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((q10 & 1) != 0) {
                        z13 = true;
                    }
                    if (z12 && this.f37680o == null) {
                        this.f37680o = new com.google.android.exoplayer2.extractor.flv.a(this.f.n(8, 1));
                    }
                    if (z13 && this.f37681p == null) {
                        this.f37681p = new com.google.android.exoplayer2.extractor.flv.b(this.f.n(9, 2));
                    }
                    this.f.e();
                    this.f37675j = (qVar2.c() - 9) + 4;
                    this.f37672g = 2;
                    z13 = true;
                }
                if (!z13) {
                    return -1;
                }
            }
        }
    }

    @Override // u7.h
    public final void a() {
    }
}
