package hd;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: RestrictedComponentContainer.java */
/* loaded from: classes.dex */
public final class p implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Set<o<?>> f17440a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<o<?>> f17441b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<o<?>> f17442c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<o<?>> f17443d;

    /* renamed from: e  reason: collision with root package name */
    public final c f17444e;

    /* compiled from: RestrictedComponentContainer.java */
    /* loaded from: classes.dex */
    public static class a implements ee.c {

        /* renamed from: a  reason: collision with root package name */
        public final ee.c f17445a;

        public a(ee.c cVar) {
            this.f17445a = cVar;
        }
    }

    public p(b bVar, h hVar) {
        boolean z10;
        boolean z11;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (j jVar : bVar.f17399c) {
            int i6 = jVar.f17425c;
            if (i6 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = jVar.f17424b;
            o<?> oVar = jVar.f17423a;
            if (z10) {
                if (i10 == 2) {
                    hashSet4.add(oVar);
                } else {
                    hashSet.add(oVar);
                }
            } else {
                if (i6 == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    hashSet3.add(oVar);
                } else if (i10 == 2) {
                    hashSet5.add(oVar);
                } else {
                    hashSet2.add(oVar);
                }
            }
        }
        if (!bVar.f17402g.isEmpty()) {
            hashSet.add(o.a(ee.c.class));
        }
        this.f17440a = Collections.unmodifiableSet(hashSet);
        this.f17441b = Collections.unmodifiableSet(hashSet2);
        this.f17442c = Collections.unmodifiableSet(hashSet3);
        this.f17443d = Collections.unmodifiableSet(hashSet4);
        Collections.unmodifiableSet(hashSet5);
        this.f17444e = hVar;
    }

    @Override // hd.c
    public final <T> T a(Class<T> cls) {
        if (this.f17440a.contains(o.a(cls))) {
            T t3 = (T) this.f17444e.a(cls);
            if (!cls.equals(ee.c.class)) {
                return t3;
            }
            return (T) new a((ee.c) t3);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // hd.c
    public final <T> re.b<T> b(Class<T> cls) {
        return d(o.a(cls));
    }

    @Override // hd.c
    public final <T> re.a<T> c(o<T> oVar) {
        if (this.f17442c.contains(oVar)) {
            return this.f17444e.c(oVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", oVar));
    }

    @Override // hd.c
    public final <T> re.b<T> d(o<T> oVar) {
        if (this.f17441b.contains(oVar)) {
            return this.f17444e.d(oVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", oVar));
    }

    @Override // hd.c
    public final <T> T e(o<T> oVar) {
        if (this.f17440a.contains(oVar)) {
            return (T) this.f17444e.e(oVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", oVar));
    }

    @Override // hd.c
    public final <T> Set<T> f(o<T> oVar) {
        if (this.f17443d.contains(oVar)) {
            return this.f17444e.f(oVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", oVar));
    }

    @Override // hd.c
    public final <T> re.a<T> g(Class<T> cls) {
        return c(o.a(cls));
    }

    public final Set h(Class cls) {
        return f(o.a(cls));
    }
}
