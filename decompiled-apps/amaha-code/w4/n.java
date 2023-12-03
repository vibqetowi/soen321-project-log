package w4;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: TargetTracker.java */
/* loaded from: classes.dex */
public final class n implements g {

    /* renamed from: u  reason: collision with root package name */
    public final Set<a5.h<?>> f36425u = Collections.newSetFromMap(new WeakHashMap());

    @Override // w4.g
    public final void g() {
        Iterator it = d5.j.d(this.f36425u).iterator();
        while (it.hasNext()) {
            ((a5.h) it.next()).g();
        }
    }

    @Override // w4.g
    public final void i() {
        Iterator it = d5.j.d(this.f36425u).iterator();
        while (it.hasNext()) {
            ((a5.h) it.next()).i();
        }
    }

    @Override // w4.g
    public final void n() {
        Iterator it = d5.j.d(this.f36425u).iterator();
        while (it.hasNext()) {
            ((a5.h) it.next()).n();
        }
    }
}
