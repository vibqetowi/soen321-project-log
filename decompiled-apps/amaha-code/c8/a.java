package c8;

import c9.w;
import java.io.EOFException;
import java.io.IOException;
import u7.t;
import u7.u;
/* compiled from: DefaultOggSeeker.java */
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final e f5070a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5071b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5072c;

    /* renamed from: d  reason: collision with root package name */
    public final h f5073d;

    /* renamed from: e  reason: collision with root package name */
    public int f5074e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public long f5075g;

    /* renamed from: h  reason: collision with root package name */
    public long f5076h;

    /* renamed from: i  reason: collision with root package name */
    public long f5077i;

    /* renamed from: j  reason: collision with root package name */
    public long f5078j;

    /* renamed from: k  reason: collision with root package name */
    public long f5079k;

    /* renamed from: l  reason: collision with root package name */
    public long f5080l;

    /* compiled from: DefaultOggSeeker.java */
    /* renamed from: c8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0106a implements t {
        public C0106a() {
        }

        @Override // u7.t
        public final boolean d() {
            return true;
        }

        @Override // u7.t
        public final t.a i(long j10) {
            a aVar = a.this;
            long j11 = aVar.f5071b;
            long j12 = aVar.f5072c;
            u uVar = new u(j10, w.i(((((j12 - j11) * ((aVar.f5073d.f5111i * j10) / 1000000)) / aVar.f) + j11) - 30000, j11, j12 - 1));
            return new t.a(uVar, uVar);
        }

        @Override // u7.t
        public final long j() {
            a aVar = a.this;
            return (aVar.f * 1000000) / aVar.f5073d.f5111i;
        }
    }

    public a(h hVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        sc.b.q(z11);
        this.f5073d = hVar;
        this.f5071b = j10;
        this.f5072c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.f5074e = 0;
        } else {
            this.f = j13;
            this.f5074e = 4;
        }
        this.f5070a = new e();
    }

    @Override // c8.f
    public final t a() {
        if (this.f != 0) {
            return new C0106a();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    @Override // c8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(u7.i iVar) {
        e eVar;
        boolean z10;
        e eVar2;
        long j10;
        long j11;
        long j12;
        int i6 = this.f5074e;
        long j13 = this.f5072c;
        e eVar3 = this.f5070a;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            return -1L;
                        }
                        throw new IllegalStateException();
                    }
                    eVar2 = eVar3;
                    j10 = -1;
                } else {
                    if (this.f5077i != this.f5078j) {
                        long position = iVar.getPosition();
                        if (!eVar3.b(iVar, this.f5078j)) {
                            long j14 = this.f5077i;
                            if (j14 != position) {
                                j11 = j14;
                                eVar2 = eVar3;
                            } else {
                                throw new IOException("No ogg page can be found.");
                            }
                        } else {
                            eVar3.a(iVar, false);
                            iVar.k();
                            long j15 = this.f5076h;
                            long j16 = eVar3.f5097b;
                            long j17 = j15 - j16;
                            int i10 = eVar3.f5099d + eVar3.f5100e;
                            if (0 > j17 || j17 >= 72000) {
                                int i11 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
                                if (i11 < 0) {
                                    this.f5078j = position;
                                    this.f5080l = j16;
                                } else {
                                    this.f5077i = iVar.getPosition() + i10;
                                    this.f5079k = eVar3.f5097b;
                                }
                                long j18 = this.f5078j;
                                long j19 = this.f5077i;
                                if (j18 - j19 < 100000) {
                                    this.f5078j = j19;
                                    eVar2 = eVar3;
                                    j11 = j19;
                                } else {
                                    long j20 = i10;
                                    if (i11 <= 0) {
                                        j12 = 2;
                                    } else {
                                        j12 = 1;
                                    }
                                    long j21 = this.f5078j;
                                    long j22 = this.f5077i;
                                    eVar2 = eVar3;
                                    j11 = w.i((((j21 - j22) * j17) / (this.f5080l - this.f5079k)) + (iVar.getPosition() - (j20 * j12)), j22, j21 - 1);
                                }
                            }
                        }
                        j10 = -1;
                        if (j11 == j10) {
                            return j11;
                        }
                        this.f5074e = 3;
                    }
                    eVar2 = eVar3;
                    j10 = -1;
                    j11 = -1;
                    if (j11 == j10) {
                    }
                }
                e eVar4 = eVar2;
                while (true) {
                    eVar4.b(iVar, j10);
                    eVar4.a(iVar, false);
                    if (eVar4.f5097b > this.f5076h) {
                        iVar.k();
                        this.f5074e = 4;
                        return -(this.f5079k + 2);
                    }
                    iVar.l(eVar4.f5099d + eVar4.f5100e);
                    this.f5077i = iVar.getPosition();
                    this.f5079k = eVar4.f5097b;
                    j10 = -1;
                }
            } else {
                eVar = eVar3;
            }
        } else {
            eVar = eVar3;
            long position2 = iVar.getPosition();
            this.f5075g = position2;
            this.f5074e = 1;
            long j23 = j13 - 65307;
            if (j23 > position2) {
                return j23;
            }
        }
        eVar.f5096a = 0;
        eVar.f5097b = 0L;
        eVar.f5098c = 0;
        eVar.f5099d = 0;
        eVar.f5100e = 0;
        if (eVar.b(iVar, -1L)) {
            eVar.a(iVar, false);
            iVar.l(eVar.f5099d + eVar.f5100e);
            long j24 = eVar.f5097b;
            while ((eVar.f5096a & 4) != 4 && eVar.b(iVar, -1L) && iVar.getPosition() < j13 && eVar.a(iVar, true)) {
                try {
                    iVar.l(eVar.f5099d + eVar.f5100e);
                    z10 = true;
                } catch (EOFException unused) {
                    z10 = false;
                }
                if (!z10) {
                    break;
                }
                j24 = eVar.f5097b;
            }
            this.f = j24;
            this.f5074e = 4;
            return this.f5075g;
        }
        throw new EOFException();
    }

    @Override // c8.f
    public final void c(long j10) {
        this.f5076h = w.i(j10, 0L, this.f - 1);
        this.f5074e = 2;
        this.f5077i = this.f5071b;
        this.f5078j = this.f5072c;
        this.f5079k = 0L;
        this.f5080l = this.f;
    }
}
