package w4;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: ActivityFragmentLifecycle.java */
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: u  reason: collision with root package name */
    public final Set<g> f36392u = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: v  reason: collision with root package name */
    public boolean f36393v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f36394w;

    @Override // w4.f
    public final void a(g gVar) {
        this.f36392u.remove(gVar);
    }

    @Override // w4.f
    public final void b(g gVar) {
        this.f36392u.add(gVar);
        if (this.f36394w) {
            gVar.g();
        } else if (this.f36393v) {
            gVar.n();
        } else {
            gVar.i();
        }
    }

    public final void c() {
        this.f36394w = true;
        Iterator it = d5.j.d(this.f36392u).iterator();
        while (it.hasNext()) {
            ((g) it.next()).g();
        }
    }

    public final void d() {
        this.f36393v = true;
        Iterator it = d5.j.d(this.f36392u).iterator();
        while (it.hasNext()) {
            ((g) it.next()).n();
        }
    }

    public final void e() {
        this.f36393v = false;
        Iterator it = d5.j.d(this.f36392u).iterator();
        while (it.hasNext()) {
            ((g) it.next()).i();
        }
    }
}
