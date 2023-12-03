package je;

import com.google.firebase.database.collection.ImmutableSortedSet;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: MemoryTargetCache.java */
/* loaded from: classes.dex */
public final class v implements a1 {

    /* renamed from: c  reason: collision with root package name */
    public int f21960c;
    public final t f;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f21958a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final nd.z f21959b = new nd.z(5);

    /* renamed from: d  reason: collision with root package name */
    public ke.r f21961d = ke.r.f23293v;

    /* renamed from: e  reason: collision with root package name */
    public long f21962e = 0;

    public v(t tVar) {
        this.f = tVar;
    }

    @Override // je.a1
    public final void a(b1 b1Var) {
        this.f21958a.put(b1Var.f21796a, b1Var);
        int i6 = this.f21960c;
        int i10 = b1Var.f21797b;
        if (i10 > i6) {
            this.f21960c = i10;
        }
        long j10 = this.f21962e;
        long j11 = b1Var.f21798c;
        if (j11 > j10) {
            this.f21962e = j11;
        }
    }

    @Override // je.a1
    public final b1 b(he.d0 d0Var) {
        return (b1) this.f21958a.get(d0Var);
    }

    @Override // je.a1
    public final int c() {
        return this.f21960c;
    }

    @Override // je.a1
    public final ImmutableSortedSet<ke.i> d(int i6) {
        return this.f21959b.j(i6);
    }

    @Override // je.a1
    public final ke.r e() {
        return this.f21961d;
    }

    @Override // je.a1
    public final void f(ImmutableSortedSet<ke.i> immutableSortedSet, int i6) {
        nd.z zVar = this.f21959b;
        zVar.getClass();
        Iterator<ke.i> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            c cVar = new c(i6, it.next());
            zVar.f26148b = ((ImmutableSortedSet) zVar.f26148b).insert(cVar);
            zVar.f26149c = ((ImmutableSortedSet) zVar.f26149c).insert(cVar);
        }
        b0 b0Var = this.f.f21945h;
        Iterator<ke.i> it2 = immutableSortedSet.iterator();
        while (it2.hasNext()) {
            b0Var.g(it2.next());
        }
    }

    @Override // je.a1
    public final void g(b1 b1Var) {
        a(b1Var);
    }

    @Override // je.a1
    public final void h(ke.r rVar) {
        this.f21961d = rVar;
    }

    @Override // je.a1
    public final void i(ImmutableSortedSet<ke.i> immutableSortedSet, int i6) {
        nd.z zVar = this.f21959b;
        zVar.getClass();
        Iterator<ke.i> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            c cVar = new c(i6, it.next());
            zVar.f26148b = ((ImmutableSortedSet) zVar.f26148b).remove(cVar);
            zVar.f26149c = ((ImmutableSortedSet) zVar.f26149c).remove(cVar);
        }
        b0 b0Var = this.f.f21945h;
        Iterator<ke.i> it2 = immutableSortedSet.iterator();
        while (it2.hasNext()) {
            b0Var.i(it2.next());
        }
    }
}
