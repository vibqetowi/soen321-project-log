package he;

import android.util.SparseArray;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import he.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import je.b1;
import je.k;
import tr.i0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f17546u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ n f17547v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ z f17548w;

    public /* synthetic */ m(n nVar, z zVar, int i6) {
        this.f17546u = i6;
        this.f17547v = nVar;
        this.f17548w = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        int i6;
        int i10;
        boolean z13;
        int i11 = this.f17546u;
        z zVar = this.f17548w;
        n nVar = this.f17547v;
        boolean z14 = true;
        switch (i11) {
            case 0:
                j jVar = nVar.f17555h;
                jVar.getClass();
                y yVar = zVar.f17587a;
                HashMap hashMap = jVar.f17529b;
                j.b bVar = (j.b) hashMap.get(yVar);
                if (bVar == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    bVar = new j.b();
                    hashMap.put(yVar, bVar);
                }
                bVar.f17535a.add(zVar);
                w wVar = jVar.f17531d;
                zVar.f17591e = wVar;
                h0 h0Var = zVar.f;
                if (h0Var != null && !zVar.f17590d && zVar.c(h0Var, wVar)) {
                    zVar.b(zVar.f);
                    z12 = true;
                } else {
                    z12 = false;
                }
                ca.a.u0(!z12, "onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", new Object[0]);
                h0 h0Var2 = bVar.f17536b;
                if (h0Var2 != null && zVar.a(h0Var2)) {
                    jVar.b();
                }
                if (z11) {
                    c0 c0Var = jVar.f17528a;
                    c0Var.g("listen");
                    HashMap hashMap2 = c0Var.f17454c;
                    ca.a.u0(!hashMap2.containsKey(yVar), "We already listen to query: %s", yVar);
                    d0 k10 = yVar.k();
                    je.k kVar = c0Var.f17452a;
                    b1 b10 = kVar.f21853i.b(k10);
                    if (b10 != null) {
                        i6 = b10.f21797b;
                    } else {
                        k.a aVar = new k.a();
                        kVar.f21846a.A("Allocate target", new androidx.emoji2.text.g(13, kVar, aVar, k10));
                        i6 = aVar.f21858b;
                        b10 = aVar.f21857a;
                    }
                    SparseArray<b1> sparseArray = kVar.f21854j;
                    if (sparseArray.get(i6) == null) {
                        sparseArray.put(i6, b10);
                        kVar.f21855k.put(k10, Integer.valueOf(i6));
                    }
                    c0Var.f17453b.c(b10);
                    com.google.protobuf.h hVar = b10.f21801g;
                    nd.z a10 = kVar.a(yVar, true);
                    HashMap hashMap3 = c0Var.f17455d;
                    int i12 = b10.f21797b;
                    if (hashMap3.get(Integer.valueOf(i12)) != null) {
                        i10 = ((a0) hashMap2.get((y) ((List) hashMap3.get(Integer.valueOf(i12))).get(0))).f17451c.f17503b;
                    } else {
                        i10 = 1;
                    }
                    if (i10 == 3) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ImmutableSortedSet<ke.i> immutableSortedSet = ke.i.f23274w;
                    ne.a0 a0Var = new ne.a0(hVar, z13, immutableSortedSet, immutableSortedSet, immutableSortedSet);
                    g0 g0Var = new g0(yVar, (ImmutableSortedSet) a10.f26149c);
                    nd.z a11 = g0Var.a(g0Var.c((ImmutableSortedMap) a10.f26148b, null), a0Var);
                    c0Var.o(i12, (List) a11.f26149c);
                    hashMap2.put(yVar, new a0(yVar, i12, g0Var));
                    if (!hashMap3.containsKey(Integer.valueOf(i12))) {
                        hashMap3.put(Integer.valueOf(i12), new ArrayList(1));
                    }
                    ((List) hashMap3.get(Integer.valueOf(i12))).add(yVar);
                    ((j) c0Var.f17464n).a(Collections.singletonList((h0) a11.f26148b));
                    return;
                }
                return;
            default:
                j jVar2 = nVar.f17555h;
                jVar2.getClass();
                y yVar2 = zVar.f17587a;
                HashMap hashMap4 = jVar2.f17529b;
                j.b bVar2 = (j.b) hashMap4.get(yVar2);
                if (bVar2 != null) {
                    ArrayList arrayList = bVar2.f17535a;
                    arrayList.remove(zVar);
                    z10 = arrayList.isEmpty();
                } else {
                    z10 = false;
                }
                if (z10) {
                    hashMap4.remove(yVar2);
                    c0 c0Var2 = jVar2.f17528a;
                    c0Var2.g("stopListening");
                    HashMap hashMap5 = c0Var2.f17454c;
                    a0 a0Var2 = (a0) hashMap5.get(yVar2);
                    if (a0Var2 == null) {
                        z14 = false;
                    }
                    ca.a.u0(z14, "Trying to stop listening to a query not found", new Object[0]);
                    hashMap5.remove(yVar2);
                    int i13 = a0Var2.f17450b;
                    List list = (List) c0Var2.f17455d.get(Integer.valueOf(i13));
                    list.remove(yVar2);
                    if (list.isEmpty()) {
                        je.k kVar2 = c0Var2.f17452a;
                        kVar2.getClass();
                        kVar2.f21846a.A("Release target", new i0.g(i13, 3, kVar2));
                        c0Var2.f17453b.j(i13);
                        c0Var2.l(i13, i0.f33481e);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
