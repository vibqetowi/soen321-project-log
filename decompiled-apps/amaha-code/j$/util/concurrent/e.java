package j$.util.concurrent;

import j$.util.AbstractC0714b;
import j$.util.Collection$EL;
import j$.util.InterfaceC0715c;
import j$.util.Q;
import j$.util.S;
import j$.util.stream.AbstractC0850z0;
import j$.util.stream.C0750d3;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e extends b implements Set, InterfaceC0715c {
    private static final long serialVersionUID = 2249069246763182397L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.f21142a.g(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.f21142a.g(entry.getKey(), entry.getValue(), false) == null) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        Object value;
        return (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.f21142a.get(key)) == null || (value = entry.getValue()) == null || (value != obj2 && !value.equals(obj2))) ? false : true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
    }

    @Override // java.lang.Iterable, j$.util.InterfaceC0715c
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        l[] lVarArr = this.f21142a.f21129a;
        if (lVarArr == null) {
            return;
        }
        q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l a10 = qVar.a();
            if (a10 == null) {
                return;
            }
            consumer.accept(new k(a10.f21153b, a10.f21154c, this.f21142a));
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        l[] lVarArr = this.f21142a.f21129a;
        int i6 = 0;
        if (lVarArr != null) {
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a10 = qVar.a();
                if (a10 == null) {
                    break;
                }
                i6 += a10.hashCode();
            }
        }
        return i6;
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f21142a;
        l[] lVarArr = concurrentHashMap.f21129a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new d(lVarArr, length, length, concurrentHashMap);
    }

    @Override // java.util.Collection
    public final Stream parallelStream() {
        return C0750d3.k(AbstractC0850z0.H0(Collection$EL.b(this), true));
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.f21142a.remove(key, value);
    }

    @Override // java.util.Collection, j$.util.InterfaceC0715c
    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.f21142a;
        concurrentHashMap.getClass();
        predicate.getClass();
        l[] lVarArr = concurrentHashMap.f21129a;
        boolean z10 = false;
        if (lVarArr != null) {
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a10 = qVar.a();
                if (a10 == null) {
                    break;
                }
                Object obj = a10.f21153b;
                Object obj2 = a10.f21154c;
                if (predicate.test(new AbstractMap.SimpleImmutableEntry(obj, obj2)) && concurrentHashMap.h(obj, null, obj2) != null) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.InterfaceC0715c
    public final S spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f21142a;
        long k10 = concurrentHashMap.k();
        l[] lVarArr = concurrentHashMap.f21129a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new f(lVarArr, length, 0, length, k10 >= 0 ? k10 : 0L, concurrentHashMap);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.InterfaceC0715c
    public final /* synthetic */ Spliterator spliterator() {
        return Q.a(spliterator());
    }

    @Override // java.util.Collection, j$.util.InterfaceC0715c
    public final /* synthetic */ j$.util.stream.Stream stream() {
        return AbstractC0714b.g(this);
    }

    @Override // java.util.Collection, j$.util.InterfaceC0715c
    public final /* synthetic */ Stream stream() {
        return C0750d3.k(AbstractC0714b.g(this));
    }

    public final Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }
}
