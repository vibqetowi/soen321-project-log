package j$.util.concurrent;

import j$.util.AbstractC0714b;
import j$.util.Collection$EL;
import j$.util.InterfaceC0715c;
import j$.util.Q;
import j$.util.S;
import j$.util.stream.AbstractC0850z0;
import j$.util.stream.C0750d3;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class t extends b implements InterfaceC0715c {
    private static final long serialVersionUID = 2249069246763182397L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f21142a.containsValue(obj);
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
            consumer.accept(a10.f21154c);
        }
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f21142a;
        l[] lVarArr = concurrentHashMap.f21129a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new h(lVarArr, length, length, concurrentHashMap, 1);
    }

    @Override // java.util.Collection
    public final Stream parallelStream() {
        return C0750d3.k(AbstractC0850z0.H0(Collection$EL.b(this), true));
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean remove(Object obj) {
        a aVar;
        if (obj != null) {
            Iterator it = iterator();
            do {
                aVar = (a) it;
                if (!aVar.hasNext()) {
                    return false;
                }
            } while (!obj.equals(((h) it).next()));
            aVar.remove();
            return true;
        }
        return false;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z10 = false;
        while (true) {
            a aVar = (a) it;
            if (!aVar.hasNext()) {
                return z10;
            }
            if (collection.contains(((h) it).next())) {
                aVar.remove();
                z10 = true;
            }
        }
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
                if (predicate.test(obj2) && concurrentHashMap.h(obj, null, obj2) != null) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.InterfaceC0715c, java.util.Set
    public final S spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f21142a;
        long k10 = concurrentHashMap.k();
        l[] lVarArr = concurrentHashMap.f21129a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new j(lVarArr, length, 0, length, k10 >= 0 ? k10 : 0L, 1);
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.InterfaceC0715c, java.util.Set
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
