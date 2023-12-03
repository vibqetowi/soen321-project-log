package vr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import vr.q1;
/* compiled from: ManagedChannelImpl.java */
/* loaded from: classes2.dex */
public final class c2 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ q1.n f35479u;

    public c2(q1.n nVar) {
        this.f35479u = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        if (this.f35479u.f35907b.get() == q1.f35851k0) {
            this.f35479u.f35907b.set(null);
        }
        Collection<q1.n.e<?, ?>> collection = q1.this.B;
        if (collection != null) {
            for (q1.n.e<?, ?> eVar : collection) {
                eVar.a("Channel is forcefully shutdown", null);
            }
        }
        q1.q qVar = q1.this.F;
        tr.i0 i0Var = q1.f35847g0;
        qVar.a(i0Var);
        synchronized (qVar.f35935a) {
            arrayList = new ArrayList(qVar.f35936b);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((r) it.next()).o(i0Var);
        }
        q1.this.E.c(i0Var);
    }
}
