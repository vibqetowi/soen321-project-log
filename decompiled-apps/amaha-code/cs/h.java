package cs;

import com.theinnerhour.b2b.utils.Constants;
import io.grpc.a;
import io.grpc.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import nc.f;
import tr.i0;
import tr.j;
import tr.k;
/* compiled from: RoundRobinLoadBalancer.java */
/* loaded from: classes2.dex */
public final class h extends io.grpc.h {

    /* renamed from: h  reason: collision with root package name */
    public static final a.b<d<k>> f11997h = new a.b<>("state-info");

    /* renamed from: i  reason: collision with root package name */
    public static final i0 f11998i = i0.f33481e.g("no subchannels ready");

    /* renamed from: c  reason: collision with root package name */
    public final h.c f11999c;

    /* renamed from: e  reason: collision with root package name */
    public final Random f12001e;
    public j f;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f12000d = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public e f12002g = new b(f11998i);

    /* compiled from: RoundRobinLoadBalancer.java */
    /* loaded from: classes2.dex */
    public class a implements h.i {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h.g f12003a;

        public a(h.g gVar) {
            this.f12003a = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.h.i
        public final void a(k kVar) {
            h hVar = h.this;
            HashMap hashMap = hVar.f12000d;
            h.g gVar = this.f12003a;
            if (hashMap.get(new io.grpc.d(gVar.a().f20452a, io.grpc.a.f20426b)) == gVar) {
                j jVar = kVar.f33510a;
                j jVar2 = j.TRANSIENT_FAILURE;
                j jVar3 = j.IDLE;
                if (jVar == jVar2 || jVar == jVar3) {
                    hVar.f11999c.e();
                }
                j jVar4 = kVar.f33510a;
                if (jVar4 == jVar3) {
                    gVar.e();
                }
                d<k> g5 = h.g(gVar);
                if (!g5.f12009a.f33510a.equals(jVar2) || (!jVar4.equals(j.CONNECTING) && !jVar4.equals(jVar3))) {
                    g5.f12009a = kVar;
                    hVar.h();
                }
            }
        }
    }

    /* compiled from: RoundRobinLoadBalancer.java */
    /* loaded from: classes2.dex */
    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        public final i0 f12005a;

        public b(i0 i0Var) {
            sc.b.w(i0Var, "status");
            this.f12005a = i0Var;
        }

        @Override // io.grpc.h.AbstractC0310h
        public final h.d a(h.e eVar) {
            i0 i0Var = this.f12005a;
            if (i0Var.e()) {
                return h.d.f20470e;
            }
            return h.d.a(i0Var);
        }

        @Override // cs.h.e
        public final boolean b(e eVar) {
            if (eVar instanceof b) {
                b bVar = (b) eVar;
                i0 i0Var = bVar.f12005a;
                i0 i0Var2 = this.f12005a;
                if (f6.b.v0(i0Var2, i0Var) || (i0Var2.e() && bVar.f12005a.e())) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            f.a aVar = new f.a(b.class.getSimpleName());
            aVar.c(this.f12005a, "status");
            return aVar.toString();
        }
    }

    /* compiled from: RoundRobinLoadBalancer.java */
    /* loaded from: classes2.dex */
    public static final class c extends e {

        /* renamed from: c  reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater<c> f12006c = AtomicIntegerFieldUpdater.newUpdater(c.class, Constants.ONBOARDING_VARIANT);

        /* renamed from: a  reason: collision with root package name */
        public final List<h.g> f12007a;

        /* renamed from: b  reason: collision with root package name */
        public volatile int f12008b;

        public c(int i6, ArrayList arrayList) {
            sc.b.s("empty list", !arrayList.isEmpty());
            this.f12007a = arrayList;
            this.f12008b = i6 - 1;
        }

        @Override // io.grpc.h.AbstractC0310h
        public final h.d a(h.e eVar) {
            List<h.g> list = this.f12007a;
            int size = list.size();
            AtomicIntegerFieldUpdater<c> atomicIntegerFieldUpdater = f12006c;
            int incrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
            if (incrementAndGet >= size) {
                int i6 = incrementAndGet % size;
                atomicIntegerFieldUpdater.compareAndSet(this, incrementAndGet, i6);
                incrementAndGet = i6;
            }
            return h.d.b(list.get(incrementAndGet), null);
        }

        @Override // cs.h.e
        public final boolean b(e eVar) {
            if (!(eVar instanceof c)) {
                return false;
            }
            c cVar = (c) eVar;
            if (cVar != this) {
                List<h.g> list = this.f12007a;
                if (list.size() != cVar.f12007a.size() || !new HashSet(list).containsAll(cVar.f12007a)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            f.a aVar = new f.a(c.class.getSimpleName());
            aVar.c(this.f12007a, "list");
            return aVar.toString();
        }
    }

    /* compiled from: RoundRobinLoadBalancer.java */
    /* loaded from: classes2.dex */
    public static final class d<T> {

        /* renamed from: a  reason: collision with root package name */
        public T f12009a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(k kVar) {
            this.f12009a = kVar;
        }
    }

    /* compiled from: RoundRobinLoadBalancer.java */
    /* loaded from: classes2.dex */
    public static abstract class e extends h.AbstractC0310h {
        public abstract boolean b(e eVar);
    }

    public h(h.c cVar) {
        sc.b.w(cVar, "helper");
        this.f11999c = cVar;
        this.f12001e = new Random();
    }

    public static d<k> g(h.g gVar) {
        io.grpc.a c10 = gVar.c();
        d<k> dVar = (d) c10.f20427a.get(f11997h);
        sc.b.w(dVar, "STATE_INFO");
        return dVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, tr.k] */
    @Override // io.grpc.h
    public final boolean a(h.f fVar) {
        List<io.grpc.d> list = fVar.f20475a;
        if (list.isEmpty()) {
            i0 i0Var = i0.f33488m;
            c(i0Var.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + fVar.f20476b));
            return false;
        }
        HashMap hashMap = this.f12000d;
        Set keySet = hashMap.keySet();
        HashMap hashMap2 = new HashMap(list.size() * 2);
        for (io.grpc.d dVar : list) {
            hashMap2.put(new io.grpc.d(dVar.f20452a, io.grpc.a.f20426b), dVar);
        }
        Set keySet2 = hashMap2.keySet();
        HashSet hashSet = new HashSet(keySet);
        hashSet.removeAll(keySet2);
        for (Map.Entry entry : hashMap2.entrySet()) {
            io.grpc.d dVar2 = (io.grpc.d) entry.getKey();
            io.grpc.d dVar3 = (io.grpc.d) entry.getValue();
            h.g gVar = (h.g) hashMap.get(dVar2);
            if (gVar != null) {
                gVar.h(Collections.singletonList(dVar3));
            } else {
                io.grpc.a aVar = io.grpc.a.f20426b;
                a.b<d<k>> bVar = f11997h;
                d dVar4 = new d(k.a(j.IDLE));
                IdentityHashMap identityHashMap = new IdentityHashMap(1);
                identityHashMap.put(bVar, dVar4);
                h.a.C0309a c0309a = new h.a.C0309a();
                c0309a.f20467a = Collections.singletonList(dVar3);
                for (Map.Entry<a.b<?>, Object> entry2 : aVar.f20427a.entrySet()) {
                    if (!identityHashMap.containsKey(entry2.getKey())) {
                        identityHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                io.grpc.a aVar2 = new io.grpc.a(identityHashMap);
                c0309a.f20468b = aVar2;
                h.g a10 = this.f11999c.a(new h.a(c0309a.f20467a, aVar2, c0309a.f20469c));
                sc.b.w(a10, "subchannel");
                a10.g(new a(a10));
                hashMap.put(dVar2, a10);
                a10.e();
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add((h.g) hashMap.remove((io.grpc.d) it.next()));
        }
        h();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            h.g gVar2 = (h.g) it2.next();
            gVar2.f();
            g(gVar2).f12009a = k.a(j.SHUTDOWN);
        }
        return true;
    }

    @Override // io.grpc.h
    public final void c(i0 i0Var) {
        if (this.f != j.READY) {
            i(j.TRANSIENT_FAILURE, new b(i0Var));
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, tr.k] */
    @Override // io.grpc.h
    public final void f() {
        HashMap hashMap = this.f12000d;
        for (h.g gVar : hashMap.values()) {
            gVar.f();
            g(gVar).f12009a = k.a(j.SHUTDOWN);
        }
        hashMap.clear();
    }

    public final void h() {
        j jVar;
        boolean z10;
        j jVar2;
        HashMap hashMap = this.f12000d;
        Collection values = hashMap.values();
        ArrayList arrayList = new ArrayList(values.size());
        Iterator it = values.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            jVar = j.READY;
            z10 = false;
            if (!hasNext) {
                break;
            }
            h.g gVar = (h.g) it.next();
            if (g(gVar).f12009a.f33510a == jVar) {
                z10 = true;
            }
            if (z10) {
                arrayList.add(gVar);
            }
        }
        if (arrayList.isEmpty()) {
            Iterator it2 = hashMap.values().iterator();
            i0 i0Var = f11998i;
            i0 i0Var2 = i0Var;
            while (true) {
                boolean hasNext2 = it2.hasNext();
                jVar2 = j.CONNECTING;
                if (!hasNext2) {
                    break;
                }
                k kVar = g((h.g) it2.next()).f12009a;
                j jVar3 = kVar.f33510a;
                z10 = (jVar3 == jVar2 || jVar3 == j.IDLE) ? true : true;
                if (i0Var2 == i0Var || !i0Var2.e()) {
                    i0Var2 = kVar.f33511b;
                }
            }
            if (!z10) {
                jVar2 = j.TRANSIENT_FAILURE;
            }
            i(jVar2, new b(i0Var2));
            return;
        }
        i(jVar, new c(this.f12001e.nextInt(arrayList.size()), arrayList));
    }

    public final void i(j jVar, e eVar) {
        if (jVar != this.f || !eVar.b(this.f12002g)) {
            this.f11999c.f(jVar, eVar);
            this.f = jVar;
            this.f12002g = eVar;
        }
    }
}
