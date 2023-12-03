package ne;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.protobuf.h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ne.f0;
import rf.u;
import tr.i0;
/* compiled from: RemoteStore.java */
/* loaded from: classes.dex */
public final class w implements f0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f26273a;

    public w(x xVar) {
        this.f26273a = xVar;
    }

    @Override // ne.z
    public final void a(i0 i0Var) {
        x xVar = this.f26273a;
        xVar.getClass();
        boolean z10 = true;
        if (i0Var.e()) {
            ca.a.u0(!xVar.h(), "Write stream was stopped gracefully while still needed.", new Object[0]);
        }
        boolean e10 = i0Var.e();
        f0 f0Var = xVar.f26279g;
        if (!e10) {
            ArrayDeque arrayDeque = xVar.f26281i;
            if (!arrayDeque.isEmpty()) {
                if (f0Var.f26219t) {
                    ca.a.u0(!i0Var.e(), "Handling write error with status OK.", new Object[0]);
                    if ((!g.a(i0Var) || i0Var.f33491a.equals(i0.a.ABORTED)) ? false : false) {
                        f0Var.b();
                        xVar.f26274a.a(((le.g) arrayDeque.poll()).f24218a, i0Var);
                        xVar.b();
                    }
                } else {
                    ca.a.u0(!i0Var.e(), "Handling write error with status OK.", new Object[0]);
                    if (g.a(i0Var)) {
                        kc.f.A(1, "RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", oe.n.h(f0Var.f26220u), i0Var);
                        h.C0164h c0164h = f0.f26217v;
                        c0164h.getClass();
                        f0Var.f26220u = c0164h;
                        je.k kVar = xVar.f26275b;
                        kVar.getClass();
                        kVar.f21846a.A("Set stream token", new q7.f(kVar, 24, c0164h));
                    }
                }
            }
        }
        if (xVar.h()) {
            ca.a.u0(xVar.h(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
            f0Var.f();
        }
    }

    @Override // ne.f0.a
    public final void b() {
        x xVar = this.f26273a;
        f0 f0Var = xVar.f26279g;
        com.google.protobuf.h hVar = f0Var.f26220u;
        je.k kVar = xVar.f26275b;
        kVar.getClass();
        kVar.f21846a.A("Set stream token", new q7.f(kVar, 24, hVar));
        Iterator it = xVar.f26281i.iterator();
        while (it.hasNext()) {
            f0Var.i(((le.g) it.next()).f24221d);
        }
    }

    @Override // ne.f0.a
    public final void d(ke.r rVar, ArrayList arrayList) {
        boolean z10;
        x xVar = this.f26273a;
        le.g gVar = (le.g) xVar.f26281i.poll();
        com.google.protobuf.h hVar = xVar.f26279g.f26220u;
        if (gVar.f24221d.size() == arrayList.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        List<le.f> list = gVar.f24221d;
        ca.a.u0(z10, "Mutations sent %d must equal results received %d", Integer.valueOf(list.size()), Integer.valueOf(arrayList.size()));
        ImmutableSortedMap<ke.i, ?> immutableSortedMap = ke.h.f23272a;
        for (int i6 = 0; i6 < list.size(); i6++) {
            immutableSortedMap = immutableSortedMap.insert(list.get(i6).f24215a, ((le.h) arrayList.get(i6)).f24222a);
        }
        xVar.f26274a.d(new q.f(gVar, rVar, arrayList, hVar, immutableSortedMap, 4));
        xVar.b();
    }

    @Override // ne.z
    public final void onOpen() {
        f0 f0Var = this.f26273a.f26279g;
        ca.a.u0(f0Var.c(), "Writing handshake requires an opened stream", new Object[0]);
        ca.a.u0(!f0Var.f26219t, "Handshake already completed", new Object[0]);
        u.a Q = rf.u.Q();
        String str = f0Var.f26218s.f26268b;
        Q.u();
        rf.u.M((rf.u) Q.f10073v, str);
        f0Var.h(Q.r());
    }
}
