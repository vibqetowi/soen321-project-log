package j$.util;

import j$.util.Comparator;
import j$.util.Map;
import j$.util.concurrent.ConcurrentMap;
import j$.util.stream.AbstractC0850z0;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
/* renamed from: j$.util.b  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0714b {
    public static void a(F f, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            f.forEachRemaining((DoubleConsumer) consumer);
        } else if (i0.f21234a) {
            i0.a(f.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            f.forEachRemaining((DoubleConsumer) new C0728p(consumer));
        }
    }

    public static void b(I i6, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            i6.forEachRemaining((IntConsumer) consumer);
        } else if (i0.f21234a) {
            i0.a(i6.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            i6.forEachRemaining((IntConsumer) new C0853t(consumer));
        }
    }

    public static void c(L l2, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            l2.forEachRemaining((LongConsumer) consumer);
        } else if (i0.f21234a) {
            i0.a(l2.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            l2.forEachRemaining((LongConsumer) new C0857x(consumer));
        }
    }

    public static long d(S s10) {
        if ((s10.characteristics() & 64) == 0) {
            return -1L;
        }
        return s10.estimateSize();
    }

    public static boolean e(S s10, int i6) {
        return (s10.characteristics() & i6) == i6;
    }

    public static boolean f(Collection collection, Predicate predicate) {
        if (DesugarCollections.f21081a.isInstance(collection)) {
            return DesugarCollections.c(collection, predicate);
        }
        Objects.requireNonNull(predicate);
        java.util.Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (predicate.test(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static Stream g(Collection collection) {
        return AbstractC0850z0.H0(Collection$EL.b(collection), false);
    }

    public static boolean h(F f, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return f.tryAdvance((DoubleConsumer) consumer);
        }
        if (i0.f21234a) {
            i0.a(f.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return f.tryAdvance((DoubleConsumer) new C0728p(consumer));
    }

    public static boolean i(I i6, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return i6.tryAdvance((IntConsumer) consumer);
        }
        if (i0.f21234a) {
            i0.a(i6.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return i6.tryAdvance((IntConsumer) new C0853t(consumer));
    }

    public static boolean j(L l2, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return l2.tryAdvance((LongConsumer) consumer);
        }
        if (i0.f21234a) {
            i0.a(l2.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return l2.tryAdvance((LongConsumer) new C0857x(consumer));
    }

    public static /* synthetic */ Object k(java.util.Map map, Object obj, BiFunction biFunction) {
        return map instanceof Map ? ((Map) map).compute(obj, biFunction) : map instanceof ConcurrentMap ? ConcurrentMap.CC.$default$compute((java.util.concurrent.ConcurrentMap) map, obj, biFunction) : Map.CC.$default$compute(map, obj, biFunction);
    }

    public static /* synthetic */ Object l(java.util.Map map, Object obj, Function function) {
        return map instanceof Map ? ((Map) map).computeIfAbsent(obj, function) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$computeIfAbsent((java.util.concurrent.ConcurrentMap) map, obj, function) : Map.CC.$default$computeIfAbsent(map, obj, function);
    }

    public static /* synthetic */ Object m(java.util.Map map, Object obj, BiFunction biFunction) {
        return map instanceof Map ? ((Map) map).computeIfPresent(obj, biFunction) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$computeIfPresent((java.util.concurrent.ConcurrentMap) map, obj, biFunction) : Map.CC.$default$computeIfPresent(map, obj, biFunction);
    }

    public static /* synthetic */ void n(java.util.Map map, BiConsumer biConsumer) {
        if (map instanceof Map) {
            ((Map) map).forEach(biConsumer);
        } else if (map instanceof java.util.concurrent.ConcurrentMap) {
            ConcurrentMap.CC.$default$forEach((java.util.concurrent.ConcurrentMap) map, biConsumer);
        } else {
            Map.CC.$default$forEach(map, biConsumer);
        }
    }

    public static /* synthetic */ Object o(java.util.Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).getOrDefault(obj, obj2) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$getOrDefault((java.util.concurrent.ConcurrentMap) map, obj, obj2) : map.get(obj);
    }

    public static /* synthetic */ Object p(java.util.Map map, Object obj, Object obj2, BiFunction biFunction) {
        return map instanceof Map ? ((Map) map).merge(obj, obj2, biFunction) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$merge((java.util.concurrent.ConcurrentMap) map, obj, obj2, biFunction) : Map.CC.$default$merge(map, obj, obj2, biFunction);
    }

    public static /* synthetic */ Object q(java.util.Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).putIfAbsent(obj, obj2) : map.get(obj);
    }

    public static /* synthetic */ boolean r(java.util.Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
    }

    public static /* synthetic */ Object s(java.util.Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).replace(obj, obj2) : map.get(obj);
    }

    public static /* synthetic */ boolean t(java.util.Map map, Object obj, Object obj2, Object obj3) {
        return map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
    }

    public static /* synthetic */ void u(java.util.Map map, BiFunction biFunction) {
        if (map instanceof Map) {
            ((Map) map).replaceAll(biFunction);
        } else if (map instanceof java.util.concurrent.ConcurrentMap) {
            ConcurrentMap.CC.$default$replaceAll((java.util.concurrent.ConcurrentMap) map, biFunction);
        } else {
            Map.CC.$default$replaceAll(map, biFunction);
        }
    }

    public static /* synthetic */ java.util.Comparator v(java.util.Comparator comparator, java.util.Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public S trySplit() {
        return null;
    }
}
