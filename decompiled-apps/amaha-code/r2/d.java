package r2;

import androidx.work.q;
import hs.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import s2.b;
import t2.g;
import v2.s;
/* compiled from: WorkConstraintsTracker.kt */
/* loaded from: classes.dex */
public final class d implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final c f30379a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.b<?>[] f30380b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f30381c;

    public d(v.c trackers, c cVar) {
        i.g(trackers, "trackers");
        s2.b<?>[] bVarArr = {new s2.a((g) trackers.f34631v, 0), new s2.a((t2.a) trackers.f34632w), new s2.a((g) trackers.f34634y, 4), new s2.a((g) trackers.f34633x, 2), new s2.a((g) trackers.f34633x, 3), new s2.d((g) trackers.f34633x), new s2.c((g) trackers.f34633x)};
        this.f30379a = cVar;
        this.f30380b = bVarArr;
        this.f30381c = new Object();
    }

    @Override // s2.b.a
    public final void a(ArrayList workSpecs) {
        i.g(workSpecs, "workSpecs");
        synchronized (this.f30381c) {
            ArrayList arrayList = new ArrayList();
            Iterator it = workSpecs.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (c(((s) next).f34734a)) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                q d10 = q.d();
                String str = e.f30382a;
                d10.a(str, "Constraints met for " + ((s) it2.next()));
            }
            c cVar = this.f30379a;
            if (cVar != null) {
                cVar.f(arrayList);
                k kVar = k.f19476a;
            }
        }
    }

    @Override // s2.b.a
    public final void b(ArrayList workSpecs) {
        i.g(workSpecs, "workSpecs");
        synchronized (this.f30381c) {
            c cVar = this.f30379a;
            if (cVar != null) {
                cVar.e(workSpecs);
                k kVar = k.f19476a;
            }
        }
    }

    public final boolean c(String workSpecId) {
        boolean z10;
        s2.b<?> bVar;
        boolean z11;
        i.g(workSpecId, "workSpecId");
        synchronized (this.f30381c) {
            s2.b<?>[] bVarArr = this.f30380b;
            int length = bVarArr.length;
            z10 = false;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    bVar = bVarArr[i6];
                    bVar.getClass();
                    Object obj = bVar.f31250d;
                    if (obj != null && bVar.c(obj) && bVar.f31249c.contains(workSpecId)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        break;
                    }
                    i6++;
                } else {
                    bVar = null;
                    break;
                }
            }
            if (bVar != null) {
                q d10 = q.d();
                String str = e.f30382a;
                d10.a(str, "Work " + workSpecId + " constrained by " + bVar.getClass().getSimpleName());
            }
            if (bVar == null) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void d(Collection workSpecs) {
        s2.b<?>[] bVarArr;
        s2.b<?>[] bVarArr2;
        i.g(workSpecs, "workSpecs");
        synchronized (this.f30381c) {
            for (s2.b<?> bVar : this.f30380b) {
                if (bVar.f31251e != null) {
                    bVar.f31251e = null;
                    bVar.e(null, bVar.f31250d);
                }
            }
            for (s2.b<?> bVar2 : this.f30380b) {
                bVar2.d(workSpecs);
            }
            for (s2.b<?> bVar3 : this.f30380b) {
                if (bVar3.f31251e != this) {
                    bVar3.f31251e = this;
                    bVar3.e(this, bVar3.f31250d);
                }
            }
            k kVar = k.f19476a;
        }
    }

    public final void e() {
        s2.b<?>[] bVarArr;
        synchronized (this.f30381c) {
            for (s2.b<?> bVar : this.f30380b) {
                ArrayList arrayList = bVar.f31248b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    bVar.f31247a.b(bVar);
                }
            }
            k kVar = k.f19476a;
        }
    }
}
