package d8;

import com.theinnerhour.b2b.utils.Constants;
import d8.d0;
import java.io.EOFException;
import u7.t;
/* compiled from: AdtsExtractor.java */
/* loaded from: classes.dex */
public final class e implements u7.h {

    /* renamed from: d  reason: collision with root package name */
    public final c9.q f12356d;

    /* renamed from: e  reason: collision with root package name */
    public final u7.x f12357e;
    public u7.j f;

    /* renamed from: g  reason: collision with root package name */
    public long f12358g;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12361j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12362k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12363l;

    /* renamed from: a  reason: collision with root package name */
    public final int f12353a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final f f12354b = new f(true, null);

    /* renamed from: c  reason: collision with root package name */
    public final c9.q f12355c = new c9.q((int) Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID);

    /* renamed from: i  reason: collision with root package name */
    public int f12360i = -1;

    /* renamed from: h  reason: collision with root package name */
    public long f12359h = -1;

    public e() {
        c9.q qVar = new c9.q(10);
        this.f12356d = qVar;
        this.f12357e = new u7.x(qVar.f5186a, 1, 0);
    }

    @Override // u7.h
    public final boolean b(u7.i iVar) {
        boolean z10;
        int c10 = c(iVar);
        int i6 = c10;
        int i10 = 0;
        int i11 = 0;
        do {
            c9.q qVar = this.f12356d;
            u7.e eVar = (u7.e) iVar;
            eVar.d(qVar.f5186a, 0, 2, false);
            qVar.A(0);
            if ((qVar.v() & 65526) == 65520) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                i6++;
                eVar.f = 0;
                eVar.m(i6, false);
            } else {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                eVar.d(qVar.f5186a, 0, 4, false);
                u7.x xVar = this.f12357e;
                xVar.o(14);
                int i12 = xVar.i(13);
                if (i12 <= 6) {
                    i6++;
                    eVar.f = 0;
                    eVar.m(i6, false);
                } else {
                    eVar.m(i12 - 6, false);
                    i11 += i12;
                }
            }
            i10 = 0;
            i11 = 0;
        } while (i6 - c10 < 8192);
        return false;
    }

    public final int c(u7.i iVar) {
        int i6 = 0;
        while (true) {
            c9.q qVar = this.f12356d;
            iVar.b(0, qVar.f5186a, 10);
            qVar.A(0);
            if (qVar.s() != 4801587) {
                break;
            }
            qVar.B(3);
            int p10 = qVar.p();
            i6 += p10 + 10;
            iVar.f(p10);
        }
        iVar.k();
        iVar.f(i6);
        if (this.f12359h == -1) {
            this.f12359h = i6;
        }
        return i6;
    }

    @Override // u7.h
    public final void f(u7.j jVar) {
        this.f = jVar;
        this.f12354b.d(jVar, new d0.d(0, 1));
        jVar.e();
    }

    @Override // u7.h
    public final void g(long j10, long j11) {
        this.f12362k = false;
        this.f12354b.c();
        this.f12358g = j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0090, code lost:
        r19.f12361j = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
        throw com.google.android.exoplayer2.ParserException.a("Malformed ADTS stream", null);
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0120  */
    @Override // u7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(u7.i iVar, u7.s sVar) {
        boolean z10;
        boolean z11;
        f fVar;
        boolean z12;
        f fVar2;
        boolean z13;
        boolean z14;
        long j10;
        int i6;
        boolean z15;
        sc.b.E(this.f);
        long length = iVar.getLength();
        int i10 = this.f12353a;
        int i11 = i10 & 2;
        if (i11 == 0 && ((i10 & 1) == 0 || length == -1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i12 = 4;
        if (z10) {
            u7.x xVar = this.f12357e;
            c9.q qVar = this.f12356d;
            if (!this.f12361j) {
                this.f12360i = -1;
                iVar.k();
                j10 = 0;
                if (iVar.getPosition() == 0) {
                    c(iVar);
                }
                i6 = 0;
                while (true) {
                    try {
                        if (!iVar.d(qVar.f5186a, 0, 2, true)) {
                            break;
                        }
                        qVar.A(0);
                        if ((qVar.v() & 65526) == 65520) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (!z15) {
                            i6 = 0;
                            break;
                        } else if (!iVar.d(qVar.f5186a, 0, i12, true)) {
                            break;
                        } else {
                            xVar.o(14);
                            int i13 = xVar.i(13);
                            if (i13 <= 6) {
                                break;
                            }
                            j10 += i13;
                            i6++;
                            if (i6 != 1000 && iVar.m(i13 - 6, true)) {
                                i12 = 4;
                            }
                        }
                    } catch (EOFException unused) {
                    }
                }
            }
        }
        int i14 = -1;
        c9.q qVar2 = this.f12355c;
        int read = iVar.read(qVar2.f5186a, 0, Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID);
        if (read != i14) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z16 = this.f12363l;
        f fVar3 = this.f12354b;
        if (!z16) {
            if ((i10 & 1) != 0 && this.f12360i > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13 || fVar3.f12382q != -9223372036854775807L || z11) {
                if (z13) {
                    long j11 = fVar3.f12382q;
                    if (j11 != -9223372036854775807L) {
                        u7.j jVar = this.f;
                        if (i11 != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        int i15 = this.f12360i;
                        fVar = fVar3;
                        jVar.i(new u7.d((int) (((i15 * 8) * 1000000) / j11), i15, length, this.f12359h, z14));
                        z12 = true;
                        this.f12363l = true;
                        if (!z11) {
                            return -1;
                        }
                        qVar2.A(0);
                        qVar2.z(read);
                        if (!this.f12362k) {
                            fVar2 = fVar;
                            fVar2.f(4, this.f12358g);
                            this.f12362k = z12;
                        } else {
                            fVar2 = fVar;
                        }
                        fVar2.a(qVar2);
                        return 0;
                    }
                }
                fVar = fVar3;
                this.f.i(new t.b(-9223372036854775807L));
                z12 = true;
                this.f12363l = true;
                if (!z11) {
                }
            }
        }
        fVar = fVar3;
        z12 = true;
        if (!z11) {
        }
        iVar.k();
        if (i6 > 0) {
            this.f12360i = (int) (j10 / i6);
            i14 = -1;
        } else {
            i14 = -1;
            this.f12360i = -1;
        }
        this.f12361j = true;
        c9.q qVar22 = this.f12355c;
        int read2 = iVar.read(qVar22.f5186a, 0, Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID);
        if (read2 != i14) {
        }
        boolean z162 = this.f12363l;
        f fVar32 = this.f12354b;
        if (!z162) {
        }
        fVar = fVar32;
        z12 = true;
        if (!z11) {
        }
    }

    @Override // u7.h
    public final void a() {
    }
}
