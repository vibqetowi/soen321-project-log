package d8;

import d8.d0;
import u7.t;
/* compiled from: Ac4Extractor.java */
/* loaded from: classes.dex */
public final class c implements u7.h {

    /* renamed from: a  reason: collision with root package name */
    public final d f12304a = new d(null);

    /* renamed from: b  reason: collision with root package name */
    public final c9.q f12305b = new c9.q(16384);

    /* renamed from: c  reason: collision with root package name */
    public boolean f12306c;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
        r5.f = 0;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
        if ((r4 - r3) < 8192) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
        return false;
     */
    @Override // u7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(u7.i iVar) {
        u7.e eVar;
        int i6;
        c9.q qVar = new c9.q(10);
        int i10 = 0;
        while (true) {
            eVar = (u7.e) iVar;
            eVar.d(qVar.f5186a, 0, 10, false);
            qVar.A(0);
            if (qVar.s() != 4801587) {
                break;
            }
            qVar.B(3);
            int p10 = qVar.p();
            i10 += p10 + 10;
            eVar.m(p10, false);
        }
        eVar.f = 0;
        eVar.m(i10, false);
        int i11 = i10;
        while (true) {
            int i12 = 0;
            while (true) {
                int i13 = 7;
                eVar.d(qVar.f5186a, 0, 7, false);
                qVar.A(0);
                int v10 = qVar.v();
                if (v10 != 44096 && v10 != 44097) {
                    break;
                }
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = qVar.f5186a;
                if (bArr.length < 7) {
                    i6 = -1;
                } else {
                    int i14 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i14 == 65535) {
                        i14 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i13 = 4;
                    }
                    if (v10 == 44097) {
                        i13 += 2;
                    }
                    i6 = i14 + i13;
                }
                if (i6 == -1) {
                    return false;
                }
                eVar.m(i6 - 7, false);
            }
            eVar.m(i11, false);
        }
    }

    @Override // u7.h
    public final void f(u7.j jVar) {
        this.f12304a.d(jVar, new d0.d(0, 1));
        jVar.e();
        jVar.i(new t.b(-9223372036854775807L));
    }

    @Override // u7.h
    public final void g(long j10, long j11) {
        this.f12306c = false;
        this.f12304a.c();
    }

    @Override // u7.h
    public final int h(u7.i iVar, u7.s sVar) {
        c9.q qVar = this.f12305b;
        int read = iVar.read(qVar.f5186a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        qVar.A(0);
        qVar.z(read);
        boolean z10 = this.f12306c;
        d dVar = this.f12304a;
        if (!z10) {
            dVar.f(4, 0L);
            this.f12306c = true;
        }
        dVar.a(qVar);
        return 0;
    }

    @Override // u7.h
    public final void a() {
    }
}
