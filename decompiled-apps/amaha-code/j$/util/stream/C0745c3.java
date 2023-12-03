package j$.util.stream;

import j$.util.AbstractC0724l;
import j$.util.Optional;
import j$.util.stream.IntStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
/* renamed from: j$.util.stream.c3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0745c3 implements Stream {

    /* renamed from: a */
    public final /* synthetic */ java.util.stream.Stream f21440a;

    private /* synthetic */ C0745c3(java.util.stream.Stream stream) {
        this.f21440a = stream;
    }

    public static /* synthetic */ Stream k(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof C0750d3 ? ((C0750d3) stream).f21443a : new C0745c3(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f21440a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f21440a.anyMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream b(C0731a c0731a) {
        return k(this.f21440a.flatMap(AbstractC0850z0.r0(c0731a)));
    }

    @Override // j$.util.stream.InterfaceC0771i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f21440a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Collector collector) {
        return this.f21440a.collect(C0791m.a(collector));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f21440a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f21440a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return k(this.f21440a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0745c3) {
            obj = ((C0745c3) obj).f21440a;
        }
        return this.f21440a.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return k(this.f21440a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return AbstractC0724l.a(this.f21440a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return AbstractC0724l.a(this.f21440a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f21440a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f21440a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f21440a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final /* synthetic */ boolean isParallel() {
        return this.f21440a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* synthetic */ Iterator iterator() {
        return this.f21440a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j10) {
        return k(this.f21440a.limit(j10));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return k(this.f21440a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ H mapToDouble(ToDoubleFunction toDoubleFunction) {
        return F.k(this.f21440a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f21440a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC0812q0 mapToLong(ToLongFunction toLongFunction) {
        return C0802o0.k(this.f21440a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return AbstractC0724l.a(this.f21440a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return AbstractC0724l.a(this.f21440a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f21440a.noneMatch(predicate);
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final /* synthetic */ InterfaceC0771i onClose(Runnable runnable) {
        return C0761g.k(this.f21440a.onClose(runnable));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC0812q0 p(C0731a c0731a) {
        return C0802o0.k(this.f21440a.flatMapToLong(AbstractC0850z0.r0(c0731a)));
    }

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* synthetic */ InterfaceC0771i parallel() {
        return C0761g.k(this.f21440a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return k(this.f21440a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return AbstractC0724l.a(this.f21440a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f21440a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f21440a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* synthetic */ InterfaceC0771i sequential() {
        return C0761g.k(this.f21440a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j10) {
        return k(this.f21440a.skip(j10));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return k(this.f21440a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return k(this.f21440a.sorted(comparator));
    }

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* synthetic */ j$.util.S spliterator() {
        return j$.util.P.a(this.f21440a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream t(C0731a c0731a) {
        return IntStream.VivifiedWrapper.convert(this.f21440a.flatMapToInt(AbstractC0850z0.r0(c0731a)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f21440a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f21440a.toArray(intFunction);
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final /* synthetic */ InterfaceC0771i unordered() {
        return C0761g.k(this.f21440a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ H x(C0731a c0731a) {
        return F.k(this.f21440a.flatMapToDouble(AbstractC0850z0.r0(c0731a)));
    }
}
