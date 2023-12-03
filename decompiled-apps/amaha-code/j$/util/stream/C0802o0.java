package j$.util.stream;

import j$.util.AbstractC0724l;
import j$.util.C0723k;
import j$.util.C0725m;
import j$.util.C0727o;
import j$.util.C0858y;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;
/* renamed from: j$.util.stream.o0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0802o0 implements InterfaceC0812q0 {

    /* renamed from: a */
    public final /* synthetic */ LongStream f21524a;

    private /* synthetic */ C0802o0(LongStream longStream) {
        this.f21524a = longStream;
    }

    public static /* synthetic */ InterfaceC0812q0 k(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C0807p0 ? ((C0807p0) longStream).f21532a : new C0802o0(longStream);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ InterfaceC0812q0 a() {
        return k(this.f21524a.filter(null));
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ H asDoubleStream() {
        return F.k(this.f21524a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ C0725m average() {
        return AbstractC0724l.b(this.f21524a.average());
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final InterfaceC0812q0 b(C0731a c0731a) {
        return k(this.f21524a.flatMap(new C0731a(c0731a, 9)));
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ Stream boxed() {
        return C0745c3.k(this.f21524a.boxed());
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ InterfaceC0812q0 c() {
        return k(this.f21524a.map(null));
    }

    @Override // j$.util.stream.InterfaceC0771i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f21524a.close();
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f21524a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ long count() {
        return this.f21524a.count();
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ InterfaceC0812q0 distinct() {
        return k(this.f21524a.distinct());
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ H e() {
        return F.k(this.f21524a.mapToDouble(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0802o0) {
            obj = ((C0802o0) obj).f21524a;
        }
        return this.f21524a.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ C0727o findAny() {
        return AbstractC0724l.d(this.f21524a.findAny());
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ C0727o findFirst() {
        return AbstractC0724l.d(this.f21524a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f21524a.forEach(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f21524a.forEachOrdered(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ boolean g() {
        return this.f21524a.noneMatch(null);
    }

    public final /* synthetic */ int hashCode() {
        return this.f21524a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final /* synthetic */ boolean isParallel() {
        return this.f21524a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC0812q0, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* synthetic */ j$.util.A iterator() {
        return C0858y.a(this.f21524a.iterator());
    }

    @Override // j$.util.stream.InterfaceC0812q0, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* synthetic */ Iterator iterator() {
        return this.f21524a.iterator();
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ boolean j() {
        return this.f21524a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ InterfaceC0812q0 limit(long j10) {
        return k(this.f21524a.limit(j10));
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return C0745c3.k(this.f21524a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ C0727o max() {
        return AbstractC0724l.d(this.f21524a.max());
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ C0727o min() {
        return AbstractC0724l.d(this.f21524a.min());
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final /* synthetic */ InterfaceC0771i onClose(Runnable runnable) {
        return C0761g.k(this.f21524a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC0812q0, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* synthetic */ InterfaceC0771i parallel() {
        return C0761g.k(this.f21524a.parallel());
    }

    @Override // j$.util.stream.InterfaceC0812q0, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* synthetic */ InterfaceC0812q0 parallel() {
        return k(this.f21524a.parallel());
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ InterfaceC0812q0 peek(LongConsumer longConsumer) {
        return k(this.f21524a.peek(longConsumer));
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ boolean r() {
        return this.f21524a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ long reduce(long j10, LongBinaryOperator longBinaryOperator) {
        return this.f21524a.reduce(j10, longBinaryOperator);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ C0727o reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC0724l.d(this.f21524a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.InterfaceC0812q0, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* synthetic */ InterfaceC0771i sequential() {
        return C0761g.k(this.f21524a.sequential());
    }

    @Override // j$.util.stream.InterfaceC0812q0, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* synthetic */ InterfaceC0812q0 sequential() {
        return k(this.f21524a.sequential());
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ InterfaceC0812q0 skip(long j10) {
        return k(this.f21524a.skip(j10));
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ InterfaceC0812q0 sorted() {
        return k(this.f21524a.sorted());
    }

    @Override // j$.util.stream.InterfaceC0812q0, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* synthetic */ j$.util.L spliterator() {
        return j$.util.J.a(this.f21524a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC0812q0, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* synthetic */ j$.util.S spliterator() {
        return j$.util.P.a(this.f21524a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ long sum() {
        return this.f21524a.sum();
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final C0723k summaryStatistics() {
        this.f21524a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ long[] toArray() {
        return this.f21524a.toArray();
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final /* synthetic */ InterfaceC0771i unordered() {
        return C0761g.k(this.f21524a.unordered());
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final /* synthetic */ IntStream v() {
        return IntStream.VivifiedWrapper.convert(this.f21524a.mapToInt(null));
    }
}
