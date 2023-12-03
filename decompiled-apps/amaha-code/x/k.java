package x;

import x.e;
/* compiled from: Optimizer.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean[] f37440a = new boolean[3];

    public static void a(f fVar, v.d dVar, e eVar) {
        eVar.f37387p = -1;
        eVar.f37389q = -1;
        e.a aVar = fVar.V[0];
        e.a aVar2 = e.a.WRAP_CONTENT;
        e.a aVar3 = e.a.MATCH_PARENT;
        if (aVar != aVar2 && eVar.V[0] == aVar3) {
            d dVar2 = eVar.K;
            int i6 = dVar2.f37351g;
            int u10 = fVar.u();
            d dVar3 = eVar.M;
            int i10 = u10 - dVar3.f37351g;
            dVar2.f37353i = dVar.k(dVar2);
            dVar3.f37353i = dVar.k(dVar3);
            dVar.d(dVar2.f37353i, i6);
            dVar.d(dVar3.f37353i, i10);
            eVar.f37387p = 2;
            eVar.f37363b0 = i6;
            int i11 = i10 - i6;
            eVar.X = i11;
            int i12 = eVar.e0;
            if (i11 < i12) {
                eVar.X = i12;
            }
        }
        if (fVar.V[1] != aVar2 && eVar.V[1] == aVar3) {
            d dVar4 = eVar.L;
            int i13 = dVar4.f37351g;
            int o10 = fVar.o();
            d dVar5 = eVar.N;
            int i14 = o10 - dVar5.f37351g;
            dVar4.f37353i = dVar.k(dVar4);
            dVar5.f37353i = dVar.k(dVar5);
            dVar.d(dVar4.f37353i, i13);
            dVar.d(dVar5.f37353i, i14);
            if (eVar.f37366d0 > 0 || eVar.f37376j0 == 8) {
                d dVar6 = eVar.O;
                dVar6.f37353i = dVar.k(dVar6);
                dVar.d(dVar6.f37353i, eVar.f37366d0 + i13);
            }
            eVar.f37389q = 2;
            eVar.c0 = i13;
            int i15 = i14 - i13;
            eVar.Y = i15;
            int i16 = eVar.f37368f0;
            if (i15 < i16) {
                eVar.Y = i16;
            }
        }
    }

    public static final boolean b(int i6, int i10) {
        if ((i6 & i10) == i10) {
            return true;
        }
        return false;
    }
}
