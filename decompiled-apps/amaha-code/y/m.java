package y;

import java.util.ArrayList;
/* compiled from: RunGroup.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final p f38167a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<p> f38168b = new ArrayList<>();

    public m(p pVar) {
        this.f38167a = null;
        this.f38167a = pVar;
    }

    public static long a(f fVar, long j10) {
        p pVar = fVar.f38156d;
        if (pVar instanceof k) {
            return j10;
        }
        ArrayList arrayList = fVar.f38162k;
        int size = arrayList.size();
        long j11 = j10;
        for (int i6 = 0; i6 < size; i6++) {
            d dVar = (d) arrayList.get(i6);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f38156d != pVar) {
                    j11 = Math.min(j11, a(fVar2, fVar2.f + j10));
                }
            }
        }
        if (fVar == pVar.f38183i) {
            long j12 = pVar.j();
            f fVar3 = pVar.f38182h;
            long j13 = j10 - j12;
            return Math.min(Math.min(j11, a(fVar3, j13)), j13 - fVar3.f);
        }
        return j11;
    }

    public static long b(f fVar, long j10) {
        p pVar = fVar.f38156d;
        if (pVar instanceof k) {
            return j10;
        }
        ArrayList arrayList = fVar.f38162k;
        int size = arrayList.size();
        long j11 = j10;
        for (int i6 = 0; i6 < size; i6++) {
            d dVar = (d) arrayList.get(i6);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f38156d != pVar) {
                    j11 = Math.max(j11, b(fVar2, fVar2.f + j10));
                }
            }
        }
        if (fVar == pVar.f38182h) {
            long j12 = pVar.j();
            f fVar3 = pVar.f38183i;
            long j13 = j10 + j12;
            return Math.max(Math.max(j11, b(fVar3, j13)), j13 - fVar3.f);
        }
        return j11;
    }
}
