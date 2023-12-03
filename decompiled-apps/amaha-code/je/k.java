package je;

import android.util.SparseArray;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import ke.l;
/* compiled from: LocalStore.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: m  reason: collision with root package name */
    public static final long f21844m = TimeUnit.MINUTES.toSeconds(5);

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f21845n = 0;

    /* renamed from: a  reason: collision with root package name */
    public final androidx.work.k f21846a;

    /* renamed from: b  reason: collision with root package name */
    public f f21847b;

    /* renamed from: c  reason: collision with root package name */
    public w f21848c;

    /* renamed from: d  reason: collision with root package name */
    public b f21849d;

    /* renamed from: e  reason: collision with root package name */
    public final c0 f21850e;
    public h f;

    /* renamed from: g  reason: collision with root package name */
    public final z f21851g;

    /* renamed from: h  reason: collision with root package name */
    public final nd.z f21852h;

    /* renamed from: i  reason: collision with root package name */
    public final a1 f21853i;

    /* renamed from: j  reason: collision with root package name */
    public final SparseArray<b1> f21854j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f21855k;

    /* renamed from: l  reason: collision with root package name */
    public final he.e0 f21856l;

    /* compiled from: LocalStore.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public b1 f21857a;

        /* renamed from: b  reason: collision with root package name */
        public int f21858b;
    }

    public k(androidx.work.k kVar, z zVar, ge.e eVar) {
        ca.a.u0(kVar.u(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.f21846a = kVar;
        this.f21851g = zVar;
        a1 t3 = kVar.t();
        this.f21853i = t3;
        kVar.m();
        he.e0 e0Var = new he.e0(0, t3.c(), 0);
        e0Var.f17480b += 2;
        this.f21856l = e0Var;
        this.f21850e = kVar.s();
        nd.z zVar2 = new nd.z(5);
        this.f21852h = zVar2;
        this.f21854j = new SparseArray<>();
        this.f21855k = new HashMap();
        kVar.r().h(zVar2);
        b(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nd.z a(he.y yVar, boolean z10) {
        b1 b10;
        ke.r rVar;
        ImmutableSortedMap<ke.i, ke.g> immutableSortedMap;
        sc.h hVar;
        he.d0 k10 = yVar.k();
        Integer num = (Integer) this.f21855k.get(k10);
        a1 a1Var = this.f21853i;
        if (num != null) {
            b10 = this.f21854j.get(num.intValue());
        } else {
            b10 = a1Var.b(k10);
        }
        ke.r rVar2 = ke.r.f23293v;
        ImmutableSortedSet<ke.i> immutableSortedSet = ke.i.f23274w;
        if (b10 != null) {
            immutableSortedSet = a1Var.d(b10.f21797b);
            rVar = b10.f;
        } else {
            rVar = rVar2;
        }
        if (!z10) {
            rVar = rVar2;
        }
        z zVar = this.f21851g;
        ca.a.u0(zVar.f21980c, "initialize() not called", new Object[0]);
        ImmutableSortedMap<ke.i, ke.g> d10 = zVar.d(yVar);
        if (d10 == null) {
            if (!yVar.j() && !rVar.equals(rVar2)) {
                ImmutableSortedSet b11 = z.b(yVar, zVar.f21978a.b(immutableSortedSet));
                if (!z.c(yVar, immutableSortedSet.size(), b11, rVar)) {
                    kc.f.A(1, "QueryEngine", "Re-using previous result from %s to execute query: %s", rVar.toString(), yVar.toString());
                    ke.b bVar = l.a.f23281u;
                    sc.h hVar2 = rVar.f23294u;
                    long j10 = hVar2.f31450u;
                    int i6 = hVar2.f31451v + 1;
                    if (i6 == 1.0E9d) {
                        hVar = new sc.h(0, j10 + 1);
                    } else {
                        hVar = new sc.h(i6, j10);
                    }
                    immutableSortedMap = zVar.a(b11, yVar, new ke.b(new ke.r(hVar), ke.i.f(), -1));
                    d10 = immutableSortedMap;
                    if (d10 == null) {
                        kc.f.A(1, "QueryEngine", "Using full collection scan to execute query: %s", yVar.toString());
                        d10 = zVar.f21978a.d(yVar, l.a.f23281u);
                    }
                }
            }
            immutableSortedMap = null;
            d10 = immutableSortedMap;
            if (d10 == null) {
            }
        }
        return new nd.z(d10, 4, immutableSortedSet);
    }

    public final void b(ge.e eVar) {
        androidx.work.k kVar = this.f21846a;
        f o10 = kVar.o(eVar);
        this.f21847b = o10;
        this.f21848c = kVar.p(eVar, o10);
        b n10 = kVar.n(eVar);
        this.f21849d = n10;
        w wVar = this.f21848c;
        f fVar = this.f21847b;
        c0 c0Var = this.f21850e;
        this.f = new h(c0Var, wVar, n10, fVar);
        c0Var.c(fVar);
        h hVar = this.f;
        f fVar2 = this.f21847b;
        z zVar = this.f21851g;
        zVar.f21978a = hVar;
        zVar.f21979b = fVar2;
        zVar.f21980c = true;
    }
}
