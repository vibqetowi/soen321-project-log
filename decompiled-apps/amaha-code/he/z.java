package he;

import com.google.firebase.database.collection.ImmutableSortedSet;
import he.h;
import he.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: QueryListener.java */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final y f17587a;

    /* renamed from: b  reason: collision with root package name */
    public final j.a f17588b;

    /* renamed from: c  reason: collision with root package name */
    public final fe.h<h0> f17589c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f17590d = false;

    /* renamed from: e  reason: collision with root package name */
    public w f17591e = w.UNKNOWN;
    public h0 f;

    public z(y yVar, j.a aVar, d dVar) {
        this.f17587a = yVar;
        this.f17589c = dVar;
        this.f17588b = aVar;
    }

    public final boolean a(h0 h0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = true;
        if (h0Var.f17522d.isEmpty() && !h0Var.f17524g) {
            z10 = false;
        } else {
            z10 = true;
        }
        ca.a.u0(z10, "We got a new snapshot with no changes?", new Object[0]);
        j.a aVar = this.f17588b;
        if (!aVar.f17532a) {
            ArrayList arrayList = new ArrayList();
            for (h hVar : h0Var.f17522d) {
                if (hVar.f17512a != h.a.METADATA) {
                    arrayList.add(hVar);
                }
            }
            h0Var = new h0(h0Var.f17519a, h0Var.f17520b, h0Var.f17521c, arrayList, h0Var.f17523e, h0Var.f, h0Var.f17524g, true, h0Var.f17526i);
        }
        if (!this.f17590d) {
            if (c(h0Var, this.f17591e)) {
                b(h0Var);
            }
            z13 = false;
        } else {
            if (!h0Var.f17522d.isEmpty()) {
                z12 = true;
            } else {
                h0 h0Var2 = this.f;
                if (h0Var2 != null && (!h0Var2.f.isEmpty()) != (!h0Var.f.isEmpty())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!h0Var.f17524g && !z11) {
                    z12 = false;
                } else {
                    z12 = aVar.f17533b;
                }
            }
            if (z12) {
                this.f17589c.a(h0Var, null);
            }
            z13 = false;
        }
        this.f = h0Var;
        return z13;
    }

    public final void b(h0 h0Var) {
        ca.a.u0(!this.f17590d, "Trying to raise initial event for second time", new Object[0]);
        y yVar = h0Var.f17519a;
        ImmutableSortedSet<ke.i> immutableSortedSet = h0Var.f;
        boolean z10 = h0Var.f17523e;
        boolean z11 = h0Var.f17525h;
        boolean z12 = h0Var.f17526i;
        ArrayList arrayList = new ArrayList();
        ke.k kVar = h0Var.f17520b;
        Iterator<ke.g> it = kVar.iterator();
        while (it.hasNext()) {
            arrayList.add(new h(h.a.ADDED, it.next()));
        }
        h0 h0Var2 = new h0(yVar, kVar, new ke.k(ke.h.f23272a, new ImmutableSortedSet(Collections.emptyList(), new ke.j(yVar.b(), 0))), arrayList, z10, immutableSortedSet, true, z11, z12);
        this.f17590d = true;
        this.f17589c.a(h0Var2, null);
    }

    public final boolean c(h0 h0Var, w wVar) {
        ca.a.u0(!this.f17590d, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (!h0Var.f17523e) {
            return true;
        }
        w wVar2 = w.OFFLINE;
        boolean z10 = !wVar.equals(wVar2);
        if (this.f17588b.f17534c && z10) {
            ca.a.u0(h0Var.f17523e, "Waiting for sync, but snapshot is not from cache", new Object[0]);
            return false;
        } else if (!h0Var.f17520b.f23278u.isEmpty() || h0Var.f17526i || wVar.equals(wVar2)) {
            return true;
        } else {
            return false;
        }
    }
}
