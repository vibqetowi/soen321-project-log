package u7;

import java.io.EOFException;
/* compiled from: Id3Peeker.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final c9.q f33900a = new c9.q(10);

    public final g8.a a(i iVar, p7.e eVar) {
        c9.q qVar = this.f33900a;
        g8.a aVar = null;
        int i6 = 0;
        while (true) {
            try {
                iVar.b(0, qVar.f5186a, 10);
                qVar.A(0);
                if (qVar.s() != 4801587) {
                    break;
                }
                qVar.B(3);
                int p10 = qVar.p();
                int i10 = p10 + 10;
                if (aVar == null) {
                    byte[] bArr = new byte[i10];
                    System.arraycopy(qVar.f5186a, 0, bArr, 0, 10);
                    iVar.b(10, bArr, p10);
                    aVar = new l8.g(eVar).D(bArr, i10);
                } else {
                    iVar.f(p10);
                }
                i6 += i10;
            } catch (EOFException unused) {
            }
        }
        iVar.k();
        iVar.f(i6);
        return aVar;
    }
}
