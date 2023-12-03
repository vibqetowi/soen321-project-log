package d8;

import com.google.android.exoplayer2.n;
import d8.d0;
import java.util.List;
/* compiled from: UserDataReader.java */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final List<com.google.android.exoplayer2.n> f12364a;

    /* renamed from: b  reason: collision with root package name */
    public final u7.v[] f12365b;

    public e0(List<com.google.android.exoplayer2.n> list) {
        this.f12364a = list;
        this.f12365b = new u7.v[list.size()];
    }

    public final void a(long j10, c9.q qVar) {
        if (qVar.f5188c - qVar.f5187b < 9) {
            return;
        }
        int c10 = qVar.c();
        int c11 = qVar.c();
        int q10 = qVar.q();
        if (c10 == 434 && c11 == 1195456820 && q10 == 3) {
            u7.b.b(j10, qVar, this.f12365b);
        }
    }

    public final void b(u7.j jVar, d0.d dVar) {
        boolean z10;
        String str;
        int i6 = 0;
        while (true) {
            u7.v[] vVarArr = this.f12365b;
            if (i6 < vVarArr.length) {
                dVar.a();
                dVar.b();
                u7.v n10 = jVar.n(dVar.f12351d, 3);
                com.google.android.exoplayer2.n nVar = this.f12364a.get(i6);
                String str2 = nVar.F;
                if (!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str = "Invalid closed caption mime type provided: ".concat(valueOf);
                } else {
                    str = new String("Invalid closed caption mime type provided: ");
                }
                sc.b.p(str, z10);
                n.a aVar = new n.a();
                dVar.b();
                aVar.f6656a = dVar.f12352e;
                aVar.f6665k = str2;
                aVar.f6659d = nVar.f6653x;
                aVar.f6658c = nVar.f6652w;
                aVar.C = nVar.X;
                aVar.f6667m = nVar.H;
                n10.e(new com.google.android.exoplayer2.n(aVar));
                vVarArr[i6] = n10;
                i6++;
            } else {
                return;
            }
        }
    }
}
