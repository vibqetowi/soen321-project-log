package hd;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ComponentRuntime.java */
/* loaded from: classes.dex */
public final class h implements c, yd.a {

    /* renamed from: g  reason: collision with root package name */
    public static final g f17412g = new g(0);

    /* renamed from: d  reason: collision with root package name */
    public final k f17416d;
    public final f f;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f17413a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f17414b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f17415c = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<Boolean> f17417e = new AtomicReference<>();

    public h(Executor executor, ArrayList arrayList, ArrayList arrayList2, f fVar) {
        k kVar = new k(executor);
        this.f17416d = kVar;
        this.f = fVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.b(kVar, k.class, ee.d.class, ee.c.class));
        arrayList3.add(b.b(this, yd.a.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((re.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e10) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f17413a.isEmpty()) {
                i.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f17413a.keySet());
                arrayList6.addAll(arrayList3);
                i.a(arrayList6);
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                b bVar2 = (b) it4.next();
                this.f17413a.put(bVar2, new l(new sc.c(this, 1, bVar2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            i();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = this.f17417e.get();
        if (bool != null) {
            h(this.f17413a, bool.booleanValue());
        }
    }

    @Override // hd.c
    public final Object a(Class cls) {
        return e(o.a(cls));
    }

    @Override // hd.c
    public final re.b b(Class cls) {
        return d(o.a(cls));
    }

    @Override // hd.c
    public final <T> re.a<T> c(o<T> oVar) {
        re.b<T> d10 = d(oVar);
        if (d10 == null) {
            return new n(n.f17434c, n.f17435d);
        }
        if (d10 instanceof n) {
            return (n) d10;
        }
        return new n(null, d10);
    }

    @Override // hd.c
    public final synchronized <T> re.b<T> d(o<T> oVar) {
        if (oVar != null) {
        } else {
            throw new NullPointerException("Null interface requested.");
        }
        return (re.b) this.f17414b.get(oVar);
    }

    @Override // hd.c
    public final Object e(o oVar) {
        re.b d10 = d(oVar);
        if (d10 == null) {
            return null;
        }
        return d10.get();
    }

    @Override // hd.c
    public final Set f(o oVar) {
        return (Set) l(oVar).get();
    }

    @Override // hd.c
    public final re.a g(Class cls) {
        return c(o.a(cls));
    }

    public final void h(Map<b<?>, re.b<?>> map, boolean z10) {
        ArrayDeque<ee.a<?>> arrayDeque;
        boolean z11;
        for (Map.Entry<b<?>, re.b<?>> entry : map.entrySet()) {
            re.b<?> value = entry.getValue();
            int i6 = entry.getKey().f17400d;
            boolean z12 = false;
            if (i6 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (i6 == 2) {
                    z12 = true;
                }
                if (z12 && z10) {
                }
            }
            value.get();
        }
        k kVar = this.f17416d;
        synchronized (kVar) {
            try {
                arrayDeque = kVar.f17427b;
                if (arrayDeque != null) {
                    kVar.f17427b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            for (ee.a<?> aVar : arrayDeque) {
                kVar.d(aVar);
            }
        }
    }

    public final void i() {
        boolean z10;
        boolean z11;
        for (b bVar : this.f17413a.keySet()) {
            for (j jVar : bVar.f17399c) {
                boolean z12 = true;
                if (jVar.f17424b == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o<?> oVar = jVar.f17423a;
                if (z10) {
                    HashMap hashMap = this.f17415c;
                    if (!hashMap.containsKey(oVar)) {
                        hashMap.put(oVar, new m(Collections.emptySet()));
                    }
                }
                HashMap hashMap2 = this.f17414b;
                if (hashMap2.containsKey(oVar)) {
                    continue;
                } else {
                    int i6 = jVar.f17424b;
                    if (i6 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        if (i6 != 2) {
                            z12 = false;
                        }
                        if (!z12) {
                            hashMap2.put(oVar, new n(n.f17434c, n.f17435d));
                        }
                    } else {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", bVar, oVar));
                    }
                }
            }
        }
    }

    public final ArrayList j(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f17401e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                re.b bVar2 = (re.b) this.f17413a.get(bVar);
                Iterator it2 = bVar.f17398b.iterator();
                while (it2.hasNext()) {
                    o oVar = (o) it2.next();
                    HashMap hashMap = this.f17414b;
                    if (!hashMap.containsKey(oVar)) {
                        hashMap.put(oVar, bVar2);
                    } else {
                        arrayList2.add(new q7.f((n) ((re.b) hashMap.get(oVar)), 12, bVar2));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f17413a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f17401e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                re.b bVar2 = (re.b) entry.getValue();
                Iterator it = bVar.f17398b.iterator();
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    if (!hashMap.containsKey(oVar)) {
                        hashMap.put(oVar, new HashSet());
                    }
                    ((Set) hashMap.get(oVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f17415c;
            if (!hashMap2.containsKey(key)) {
                hashMap2.put((o) entry2.getKey(), new m((Set) ((Collection) entry2.getValue())));
            } else {
                m mVar = (m) hashMap2.get(entry2.getKey());
                for (re.b bVar3 : (Set) entry2.getValue()) {
                    arrayList.add(new q7.f(mVar, 13, bVar3));
                }
            }
        }
        return arrayList;
    }

    public final synchronized <T> re.b<Set<T>> l(o<T> oVar) {
        m mVar = (m) this.f17415c.get(oVar);
        if (mVar != null) {
            return mVar;
        }
        return f17412g;
    }
}
