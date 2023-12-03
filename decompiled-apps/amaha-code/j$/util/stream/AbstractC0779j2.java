package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
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
/* renamed from: j$.util.stream.j2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0779j2 extends AbstractC0741c implements Stream {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0779j2(j$.util.S s10, int i6, boolean z10) {
        super(s10, i6, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0779j2(AbstractC0741c abstractC0741c, int i6) {
        super(abstractC0741c, i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0850z0
    public final D0 D0(long j10, IntFunction intFunction) {
        return AbstractC0850z0.Z(j10, intFunction);
    }

    @Override // j$.util.stream.AbstractC0741c
    final I0 N0(AbstractC0850z0 abstractC0850z0, j$.util.S s10, boolean z10, IntFunction intFunction) {
        return AbstractC0850z0.a0(abstractC0850z0, s10, z10, intFunction);
    }

    @Override // j$.util.stream.AbstractC0741c
    final boolean O0(j$.util.S s10, InterfaceC0818r2 interfaceC0818r2) {
        boolean e10;
        do {
            e10 = interfaceC0818r2.e();
            if (e10) {
                break;
            }
        } while (s10.tryAdvance(interfaceC0818r2));
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0741c
    public final EnumC0770h3 P0() {
        return EnumC0770h3.REFERENCE;
    }

    @Override // j$.util.stream.AbstractC0741c
    final j$.util.S Z0(AbstractC0850z0 abstractC0850z0, C0731a c0731a, boolean z10) {
        return new N3(abstractC0850z0, c0731a, z10);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) L0(AbstractC0850z0.E0(EnumC0838w0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) L0(AbstractC0850z0.E0(EnumC0838w0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream b(C0731a c0731a) {
        Objects.requireNonNull(c0731a);
        return new C0754e2(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n | EnumC0765g3.f21475t, c0731a, 1);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Object L0;
        if (isParallel() && collector.characteristics().contains(EnumC0781k.CONCURRENT) && (!R0() || collector.characteristics().contains(EnumC0781k.UNORDERED))) {
            L0 = collector.supplier().get();
            forEach(new C0801o(5, collector.accumulator(), L0));
        } else {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            L0 = L0(new L1(EnumC0770h3.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector));
        }
        return collector.characteristics().contains(EnumC0781k.IDENTITY_FINISH) ? L0 : collector.finisher().apply(L0);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return L0(new E1(EnumC0770h3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) L0(new G1(EnumC0770h3.REFERENCE, 2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new r(this, EnumC0765g3.f21469m | EnumC0765g3.f21475t);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C0833v(this, EnumC0765g3.f21475t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) L0(M.f21330d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) L0(M.f21329c);
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        L0(new T(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        L0(new T(consumer, true));
    }

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final Iterator iterator() {
        return j$.util.g0.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j10) {
        if (j10 >= 0) {
            return AbstractC0850z0.F0(this, 0L, j10);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new C0754e2(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final H mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C0837w(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n, toDoubleFunction, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new C0841x(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n, toIntFunction, 6);
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC0812q0 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C0845y(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n, toLongFunction, 7);
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 0));
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) L0(AbstractC0850z0.E0(EnumC0838w0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC0812q0 p(C0731a c0731a) {
        Objects.requireNonNull(c0731a);
        return new C0845y(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n | EnumC0765g3.f21475t, c0731a, 6);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0833v(this, 0, consumer, 3);
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) L0(new C1(EnumC0770h3.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return L0(new E1(EnumC0770h3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return L0(new E1(EnumC0770h3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j10) {
        int i6 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i6 >= 0) {
            return i6 == 0 ? this : AbstractC0850z0.F0(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new M2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new M2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final IntStream t(C0731a c0731a) {
        Objects.requireNonNull(c0731a);
        return new C0841x(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n | EnumC0765g3.f21475t, c0731a, 7);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new O0(4));
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC0850z0.m0(M0(intFunction), intFunction).k(intFunction);
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final InterfaceC0771i unordered() {
        return !R0() ? this : new C0749d2(this, EnumC0765g3.r);
    }

    @Override // j$.util.stream.Stream
    public final H x(C0731a c0731a) {
        Objects.requireNonNull(c0731a);
        return new C0837w(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n | EnumC0765g3.f21475t, c0731a, 7);
    }
}
