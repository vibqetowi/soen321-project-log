package hd;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
/* compiled from: LazySet.java */
/* loaded from: classes.dex */
public final class m<T> implements re.b<Set<T>> {

    /* renamed from: b  reason: collision with root package name */
    public volatile Set<T> f17433b = null;

    /* renamed from: a  reason: collision with root package name */
    public volatile Set<re.b<T>> f17432a = Collections.newSetFromMap(new ConcurrentHashMap());

    public m(Collection<re.b<T>> collection) {
        this.f17432a.addAll(collection);
    }

    public final synchronized void a() {
        for (re.b<T> bVar : this.f17432a) {
            this.f17433b.add(bVar.get());
        }
        this.f17432a = null;
    }

    @Override // re.b
    public final Object get() {
        if (this.f17433b == null) {
            synchronized (this) {
                if (this.f17433b == null) {
                    this.f17433b = Collections.newSetFromMap(new ConcurrentHashMap());
                    a();
                }
            }
        }
        return Collections.unmodifiableSet(this.f17433b);
    }
}
