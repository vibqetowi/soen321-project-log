package s2;

import androidx.work.q;
import hs.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import t2.g;
import t2.h;
import v2.s;
/* compiled from: ConstraintController.kt */
/* loaded from: classes.dex */
public abstract class b<T> implements r2.a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final g<T> f31247a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f31248b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f31249c;

    /* renamed from: d  reason: collision with root package name */
    public T f31250d;

    /* renamed from: e  reason: collision with root package name */
    public a f31251e;

    /* compiled from: ConstraintController.kt */
    /* loaded from: classes.dex */
    public interface a {
        void a(ArrayList arrayList);

        void b(ArrayList arrayList);
    }

    public b(g<T> tracker) {
        i.g(tracker, "tracker");
        this.f31247a = tracker;
        this.f31248b = new ArrayList();
        this.f31249c = new ArrayList();
    }

    @Override // r2.a
    public final void a(T t3) {
        this.f31250d = t3;
        e(this.f31251e, t3);
    }

    public abstract boolean b(s sVar);

    public abstract boolean c(T t3);

    public final void d(Collection workSpecs) {
        i.g(workSpecs, "workSpecs");
        this.f31248b.clear();
        this.f31249c.clear();
        ArrayList arrayList = this.f31248b;
        for (T t3 : workSpecs) {
            if (b((s) t3)) {
                arrayList.add(t3);
            }
        }
        ArrayList arrayList2 = this.f31248b;
        ArrayList arrayList3 = this.f31249c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((s) it.next()).f34734a);
        }
        if (this.f31248b.isEmpty()) {
            this.f31247a.b(this);
        } else {
            g<T> gVar = this.f31247a;
            gVar.getClass();
            synchronized (gVar.f32396c) {
                if (gVar.f32397d.add(this)) {
                    if (gVar.f32397d.size() == 1) {
                        gVar.f32398e = gVar.a();
                        q d10 = q.d();
                        String str = h.f32399a;
                        d10.a(str, gVar.getClass().getSimpleName() + ": initial state = " + gVar.f32398e);
                        gVar.d();
                    }
                    a(gVar.f32398e);
                }
                k kVar = k.f19476a;
            }
        }
        e(this.f31251e, this.f31250d);
    }

    public final void e(a aVar, T t3) {
        ArrayList arrayList = this.f31248b;
        if (!arrayList.isEmpty() && aVar != null) {
            if (t3 != null && !c(t3)) {
                aVar.a(arrayList);
            } else {
                aVar.b(arrayList);
            }
        }
    }
}
