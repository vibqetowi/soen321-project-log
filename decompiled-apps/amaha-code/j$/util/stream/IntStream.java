package j$.util.stream;

import j$.util.AbstractC0724l;
import j$.util.C0722j;
import j$.util.C0725m;
import j$.util.C0726n;
import j$.util.C0854u;
import j$.util.C0855v;
import j$.util.InterfaceC0856w;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
/* loaded from: classes3.dex */
public interface IntStream extends InterfaceC0771i {

    /* loaded from: classes3.dex */
    public final /* synthetic */ class VivifiedWrapper implements IntStream {

        /* renamed from: a */
        public final /* synthetic */ java.util.stream.IntStream f21299a;

        private /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.f21299a = intStream;
        }

        public static /* synthetic */ IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof Wrapper ? IntStream.this : new VivifiedWrapper(intStream);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream a() {
            return convert(this.f21299a.filter(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ H asDoubleStream() {
            return F.k(this.f21299a.asDoubleStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC0812q0 asLongStream() {
            return C0802o0.k(this.f21299a.asLongStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C0725m average() {
            return AbstractC0724l.b(this.f21299a.average());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream boxed() {
            return C0745c3.k(this.f21299a.boxed());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream c() {
            return convert(this.f21299a.map(null));
        }

        @Override // j$.util.stream.InterfaceC0771i, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.f21299a.close();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            return this.f21299a.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ long count() {
            return this.f21299a.count();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ H d() {
            return F.k(this.f21299a.mapToDouble(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream distinct() {
            return convert(this.f21299a.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f21299a;
            }
            return this.f21299a.equals(obj);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC0812q0 f() {
            return C0802o0.k(this.f21299a.mapToLong(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C0726n findAny() {
            return AbstractC0724l.c(this.f21299a.findAny());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C0726n findFirst() {
            return AbstractC0724l.c(this.f21299a.findFirst());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            this.f21299a.forEach(intConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            this.f21299a.forEachOrdered(intConsumer);
        }

        public final /* synthetic */ int hashCode() {
            return this.f21299a.hashCode();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean i() {
            return this.f21299a.allMatch(null);
        }

        @Override // j$.util.stream.InterfaceC0771i
        public final /* synthetic */ boolean isParallel() {
            return this.f21299a.isParallel();
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC0771i, j$.util.stream.H
        public final /* synthetic */ InterfaceC0856w iterator() {
            return C0854u.a(this.f21299a.iterator());
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC0771i, j$.util.stream.H
        public final /* synthetic */ Iterator iterator() {
            return this.f21299a.iterator();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean l() {
            return this.f21299a.noneMatch(null);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream limit(long j10) {
            return convert(this.f21299a.limit(j10));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream mapToObj(IntFunction intFunction) {
            return C0745c3.k(this.f21299a.mapToObj(intFunction));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C0726n max() {
            return AbstractC0724l.c(this.f21299a.max());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C0726n min() {
            return AbstractC0724l.c(this.f21299a.min());
        }

        @Override // j$.util.stream.InterfaceC0771i
        public final /* synthetic */ InterfaceC0771i onClose(Runnable runnable) {
            return C0761g.k(this.f21299a.onClose(runnable));
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC0771i, j$.util.stream.H
        public final /* synthetic */ IntStream parallel() {
            return convert(this.f21299a.parallel());
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC0771i, j$.util.stream.H
        public final /* synthetic */ InterfaceC0771i parallel() {
            return C0761g.k(this.f21299a.parallel());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream peek(IntConsumer intConsumer) {
            return convert(this.f21299a.peek(intConsumer));
        }

        @Override // j$.util.stream.IntStream
        public final IntStream q(P0 p02) {
            return convert(this.f21299a.flatMap(new P0(p02)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int reduce(int i6, IntBinaryOperator intBinaryOperator) {
            return this.f21299a.reduce(i6, intBinaryOperator);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C0726n reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC0724l.c(this.f21299a.reduce(intBinaryOperator));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean s() {
            return this.f21299a.anyMatch(null);
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC0771i, j$.util.stream.H
        public final /* synthetic */ IntStream sequential() {
            return convert(this.f21299a.sequential());
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC0771i, j$.util.stream.H
        public final /* synthetic */ InterfaceC0771i sequential() {
            return C0761g.k(this.f21299a.sequential());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream skip(long j10) {
            return convert(this.f21299a.skip(j10));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream sorted() {
            return convert(this.f21299a.sorted());
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC0771i, j$.util.stream.H
        public final /* synthetic */ j$.util.I spliterator() {
            return j$.util.G.a(this.f21299a.spliterator());
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC0771i, j$.util.stream.H
        public final /* synthetic */ j$.util.S spliterator() {
            return j$.util.P.a(this.f21299a.spliterator());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return this.f21299a.sum();
        }

        @Override // j$.util.stream.IntStream
        public final C0722j summaryStatistics() {
            this.f21299a.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return this.f21299a.toArray();
        }

        @Override // j$.util.stream.InterfaceC0771i
        public final /* synthetic */ InterfaceC0771i unordered() {
            return C0761g.k(this.f21299a.unordered());
        }
    }

    /* loaded from: classes3.dex */
    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        private /* synthetic */ Wrapper() {
            IntStream.this = r1;
        }

        public static /* synthetic */ java.util.stream.IntStream convert(IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof VivifiedWrapper ? ((VivifiedWrapper) intStream).f21299a : new Wrapper();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return IntStream.this.i();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return IntStream.this.s();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream asDoubleStream() {
            return G.k(IntStream.this.asDoubleStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream asLongStream() {
            return C0807p0.k(IntStream.this.asLongStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalDouble average() {
            return AbstractC0724l.f(IntStream.this.average());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream boxed() {
            return C0750d3.k(IntStream.this.boxed());
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            IntStream.this.close();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            return IntStream.this.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ long count() {
            return IntStream.this.count();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(IntStream.this.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            IntStream intStream = IntStream.this;
            if (obj instanceof Wrapper) {
                obj = IntStream.this;
            }
            return intStream.equals(obj);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
            return convert(IntStream.this.a());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findAny() {
            return AbstractC0724l.g(IntStream.this.findAny());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findFirst() {
            return AbstractC0724l.g(IntStream.this.findFirst());
        }

        @Override // java.util.stream.IntStream
        public final java.util.stream.IntStream flatMap(IntFunction intFunction) {
            return convert(IntStream.this.q(new P0(intFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            IntStream.this.forEach(intConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            IntStream.this.forEachOrdered(intConsumer);
        }

        public final /* synthetic */ int hashCode() {
            return IntStream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return IntStream.this.isParallel();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Iterator<Integer> iterator() {
            return IntStream.this.iterator();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: iterator */
        public final /* synthetic */ Iterator<Integer> iterator2() {
            return C0855v.a(IntStream.this.iterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream limit(long j10) {
            return convert(IntStream.this.limit(j10));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
            return convert(IntStream.this.c());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
            return G.k(IntStream.this.d());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
            return C0807p0.k(IntStream.this.f());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream mapToObj(IntFunction intFunction) {
            return C0750d3.k(IntStream.this.mapToObj(intFunction));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt max() {
            return AbstractC0724l.g(IntStream.this.max());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt min() {
            return AbstractC0724l.g(IntStream.this.min());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return IntStream.this.l();
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream onClose(Runnable runnable) {
            return C0766h.k(IntStream.this.onClose(runnable));
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream parallel() {
            return C0766h.k(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: parallel */
        public final /* synthetic */ java.util.stream.IntStream parallel2() {
            return convert(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
            return convert(IntStream.this.peek(intConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int reduce(int i6, IntBinaryOperator intBinaryOperator) {
            return IntStream.this.reduce(i6, intBinaryOperator);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC0724l.g(IntStream.this.reduce(intBinaryOperator));
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream sequential() {
            return C0766h.k(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: sequential */
        public final /* synthetic */ java.util.stream.IntStream sequential2() {
            return convert(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream skip(long j10) {
            return convert(IntStream.this.skip(j10));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(IntStream.this.sorted());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Spliterator<Integer> spliterator() {
            return j$.util.H.a(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: spliterator */
        public final /* synthetic */ Spliterator<Integer> spliterator2() {
            return j$.util.Q.a(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return IntStream.this.sum();
        }

        @Override // java.util.stream.IntStream
        public final IntSummaryStatistics summaryStatistics() {
            IntStream.this.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return IntStream.this.toArray();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream unordered() {
            return C0766h.k(IntStream.this.unordered());
        }
    }

    IntStream a();

    H asDoubleStream();

    InterfaceC0812q0 asLongStream();

    C0725m average();

    Stream boxed();

    IntStream c();

    Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer);

    long count();

    H d();

    IntStream distinct();

    InterfaceC0812q0 f();

    C0726n findAny();

    C0726n findFirst();

    void forEach(IntConsumer intConsumer);

    void forEachOrdered(IntConsumer intConsumer);

    boolean i();

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    InterfaceC0856w iterator();

    boolean l();

    IntStream limit(long j10);

    Stream mapToObj(IntFunction intFunction);

    C0726n max();

    C0726n min();

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    IntStream parallel();

    IntStream peek(IntConsumer intConsumer);

    IntStream q(P0 p02);

    int reduce(int i6, IntBinaryOperator intBinaryOperator);

    C0726n reduce(IntBinaryOperator intBinaryOperator);

    boolean s();

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    IntStream sequential();

    IntStream skip(long j10);

    IntStream sorted();

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    j$.util.I spliterator();

    int sum();

    C0722j summaryStatistics();

    int[] toArray();
}
