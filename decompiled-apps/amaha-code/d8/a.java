package d8;

import d8.d0;
import u7.t;
/* compiled from: Ac3Extractor.java */
/* loaded from: classes.dex */
public final class a implements u7.h {

    /* renamed from: a  reason: collision with root package name */
    public final b f12278a = new b(null);

    /* renamed from: b  reason: collision with root package name */
    public final c9.q f12279b = new c9.q(2786);

    /* renamed from: c  reason: collision with root package name */
    public boolean f12280c;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
        if ((r4 - r3) < 8192) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
        r5.f = 0;
        r4 = r4 + 1;
     */
    @Override // u7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(u7.i iVar) {
        u7.e eVar;
        boolean z10;
        int a10;
        c9.q qVar = new c9.q(10);
        int i6 = 0;
        while (true) {
            eVar = (u7.e) iVar;
            eVar.d(qVar.f5186a, 0, 10, false);
            qVar.A(0);
            if (qVar.s() != 4801587) {
                break;
            }
            qVar.B(3);
            int p10 = qVar.p();
            i6 += p10 + 10;
            eVar.m(p10, false);
        }
        eVar.f = 0;
        eVar.m(i6, false);
        int i10 = i6;
        while (true) {
            int i11 = 0;
            while (true) {
                eVar.d(qVar.f5186a, 0, 6, false);
                qVar.A(0);
                if (qVar.v() != 2935) {
                    break;
                }
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = qVar.f5186a;
                if (bArr.length < 6) {
                    a10 = -1;
                } else {
                    if (((bArr[5] & 248) >> 3) > 10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        a10 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                    } else {
                        byte b10 = bArr[4];
                        a10 = q7.b.a((b10 & 192) >> 6, b10 & 63);
                    }
                }
                if (a10 == -1) {
                    return false;
                }
                eVar.m(a10 - 6, false);
            }
            eVar.m(i10, false);
        }
    }

    @Override // u7.h
    public final void f(u7.j jVar) {
        this.f12278a.d(jVar, new d0.d(0, 1));
        jVar.e();
        jVar.i(new t.b(-9223372036854775807L));
    }

    @Override // u7.h
    public final void g(long j10, long j11) {
        this.f12280c = false;
        this.f12278a.c();
    }

    @Override // u7.h
    public final int h(u7.i iVar, u7.s sVar) {
        c9.q qVar = this.f12279b;
        int read = iVar.read(qVar.f5186a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        qVar.A(0);
        qVar.z(read);
        boolean z10 = this.f12280c;
        b bVar = this.f12278a;
        if (!z10) {
            bVar.f(4, 0L);
            this.f12280c = true;
        }
        bVar.a(qVar);
        return 0;
    }

    @Override // u7.h
    public final void a() {
    }
}
