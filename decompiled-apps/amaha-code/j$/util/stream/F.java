package j$.util.stream;

import j$.util.AbstractC0724l;
import j$.util.C0721i;
import j$.util.C0725m;
import j$.util.C0729q;
import j$.util.InterfaceC0730s;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
/* loaded from: classes3.dex */
public final /* synthetic */ class F implements H {

    /* renamed from: a */
    public final /* synthetic */ DoubleStream f21279a;

    private /* synthetic */ F(DoubleStream doubleStream) {
        this.f21279a = doubleStream;
    }

    public static /* synthetic */ H k(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof G ? ((G) doubleStream).f21285a : new F(doubleStream);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ H a() {
        return k(this.f21279a.filter(null));
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ C0725m average() {
        return AbstractC0724l.b(this.f21279a.average());
    }

    @Override // j$.util.stream.H
    public final H b(C0731a c0731a) {
        return k(this.f21279a.flatMap(new C0731a(c0731a, 7)));
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ Stream boxed() {
        return C0745c3.k(this.f21279a.boxed());
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ H c() {
        return k(this.f21279a.map(null));
    }

    @Override // j$.util.stream.InterfaceC0771i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f21279a.close();
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f21279a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ long count() {
        return this.f21279a.count();
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ H distinct() {
        return k(this.f21279a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof F) {
            obj = ((F) obj).f21279a;
        }
        return this.f21279a.equals(obj);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ C0725m findAny() {
        return AbstractC0724l.b(this.f21279a.findAny());
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ C0725m findFirst() {
        return AbstractC0724l.b(this.f21279a.findFirst());
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f21279a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f21279a.forEachOrdered(doubleConsumer);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ boolean h() {
        return this.f21279a.anyMatch(null);
    }

    public final /* synthetic */ int hashCode() {
        return this.f21279a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final /* synthetic */ boolean isParallel() {
        return this.f21279a.isParallel();
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ InterfaceC0730s iterator() {
        return C0729q.a(this.f21279a.iterator());
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ Iterator iterator() {
        return this.f21279a.iterator();
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ H limit(long j10) {
        return k(this.f21279a.limit(j10));
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ boolean m() {
        return this.f21279a.allMatch(null);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return C0745c3.k(this.f21279a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ C0725m max() {
        return AbstractC0724l.b(this.f21279a.max());
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ C0725m min() {
        return AbstractC0724l.b(this.f21279a.min());
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ InterfaceC0812q0 n() {
        return C0802o0.k(this.f21279a.mapToLong(null));
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final /* synthetic */ InterfaceC0771i onClose(Runnable runnable) {
        return C0761g.k(this.f21279a.onClose(runnable));
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ H parallel() {
        return k(this.f21279a.parallel());
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ InterfaceC0771i parallel() {
        return C0761g.k(this.f21279a.parallel());
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ H peek(DoubleConsumer doubleConsumer) {
        return k(this.f21279a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f21279a.reduce(d10, doubleBinaryOperator);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ C0725m reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC0724l.b(this.f21279a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ H sequential() {
        return k(this.f21279a.sequential());
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ InterfaceC0771i sequential() {
        return C0761g.k(this.f21279a.sequential());
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ H skip(long j10) {
        return k(this.f21279a.skip(j10));
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ H sorted() {
        return k(this.f21279a.sorted());
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ j$.util.F spliterator() {
        return j$.util.D.a(this.f21279a.spliterator());
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ j$.util.S spliterator() {
        return j$.util.P.a(this.f21279a.spliterator());
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ double sum() {
        return this.f21279a.sum();
    }

    @Override // j$.util.stream.H
    public final C0721i summaryStatistics() {
        this.f21279a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ double[] toArray() {
        return this.f21279a.toArray();
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ IntStream u() {
        return IntStream.VivifiedWrapper.convert(this.f21279a.mapToInt(null));
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final /* synthetic */ InterfaceC0771i unordered() {
        return C0761g.k(this.f21279a.unordered());
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ boolean w() {
        return this.f21279a.noneMatch(null);
    }
}
