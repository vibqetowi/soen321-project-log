package d8;

import com.google.android.exoplayer2.n;
import d8.d0;
import java.util.List;
/* compiled from: SeiReader.java */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final List<com.google.android.exoplayer2.n> f12601a;

    /* renamed from: b  reason: collision with root package name */
    public final u7.v[] f12602b;

    public z(List<com.google.android.exoplayer2.n> list) {
        this.f12601a = list;
        this.f12602b = new u7.v[list.size()];
    }

    public final void a(u7.j jVar, d0.d dVar) {
        boolean z10;
        String str;
        int i6 = 0;
        while (true) {
            u7.v[] vVarArr = this.f12602b;
            if (i6 < vVarArr.length) {
                dVar.a();
                dVar.b();
                u7.v n10 = jVar.n(dVar.f12351d, 3);
                com.google.android.exoplayer2.n nVar = this.f12601a.get(i6);
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
                String str3 = nVar.f6650u;
                if (str3 == null) {
                    dVar.b();
                    str3 = dVar.f12352e;
                }
                n.a aVar = new n.a();
                aVar.f6656a = str3;
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
