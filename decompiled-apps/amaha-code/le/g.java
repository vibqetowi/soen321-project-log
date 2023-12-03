package le;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: MutationBatch.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f24218a;

    /* renamed from: b  reason: collision with root package name */
    public final sc.h f24219b;

    /* renamed from: c  reason: collision with root package name */
    public final List<f> f24220c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f> f24221d;

    public g(int i6, sc.h hVar, ArrayList arrayList, List list) {
        ca.a.u0(!list.isEmpty(), "Cannot create an empty mutation batch", new Object[0]);
        this.f24218a = i6;
        this.f24219b = hVar;
        this.f24220c = arrayList;
        this.f24221d = list;
    }

    public final d a(ke.n nVar, d dVar) {
        sc.h hVar;
        int i6 = 0;
        int i10 = 0;
        while (true) {
            List<f> list = this.f24220c;
            int size = list.size();
            hVar = this.f24219b;
            if (i10 >= size) {
                break;
            }
            f fVar = list.get(i10);
            if (fVar.f24215a.equals(nVar.f23285b)) {
                dVar = fVar.a(nVar, dVar, hVar);
            }
            i10++;
        }
        while (true) {
            List<f> list2 = this.f24221d;
            if (i6 < list2.size()) {
                f fVar2 = list2.get(i6);
                if (fVar2.f24215a.equals(nVar.f23285b)) {
                    dVar = fVar2.a(nVar, dVar, hVar);
                }
                i6++;
            } else {
                return dVar;
            }
        }
    }

    public final HashSet b() {
        HashSet hashSet = new HashSet();
        for (f fVar : this.f24221d) {
            hashSet.add(fVar.f24215a);
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f24218a == gVar.f24218a && this.f24219b.equals(gVar.f24219b) && this.f24220c.equals(gVar.f24220c) && this.f24221d.equals(gVar.f24221d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f24219b.hashCode();
        int hashCode2 = this.f24220c.hashCode();
        return this.f24221d.hashCode() + ((hashCode2 + ((hashCode + (this.f24218a * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MutationBatch(batchId=" + this.f24218a + ", localWriteTime=" + this.f24219b + ", baseMutations=" + this.f24220c + ", mutations=" + this.f24221d + ')';
    }
}
