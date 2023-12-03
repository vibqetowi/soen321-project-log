package j$.util.stream;

import j$.util.C0722j;
import j$.util.C0725m;
import j$.util.C0726n;
import j$.util.InterfaceC0856w;
import j$.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
/* renamed from: j$.util.stream.g0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0762g0 extends AbstractC0741c implements IntStream {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0762g0(j$.util.S s10, int i6) {
        super(s10, i6, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0762g0(AbstractC0741c abstractC0741c, int i6) {
        super(abstractC0741c, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.I c1(j$.util.S s10) {
        if (s10 instanceof j$.util.I) {
            return (j$.util.I) s10;
        }
        if (S3.f21385a) {
            S3.a(AbstractC0741c.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0850z0
    public final D0 D0(long j10, IntFunction intFunction) {
        return AbstractC0850z0.t0(j10);
    }

    @Override // j$.util.stream.AbstractC0741c
    final I0 N0(AbstractC0850z0 abstractC0850z0, j$.util.S s10, boolean z10, IntFunction intFunction) {
        return AbstractC0850z0.c0(abstractC0850z0, s10, z10);
    }

    @Override // j$.util.stream.AbstractC0741c
    final boolean O0(j$.util.S s10, InterfaceC0818r2 interfaceC0818r2) {
        IntConsumer x10;
        boolean e10;
        j$.util.I c12 = c1(s10);
        if (interfaceC0818r2 instanceof IntConsumer) {
            x10 = (IntConsumer) interfaceC0818r2;
        } else if (S3.f21385a) {
            S3.a(AbstractC0741c.class, "using IntStream.adapt(Sink<Integer> s)");
            throw null;
        } else {
            Objects.requireNonNull(interfaceC0818r2);
            x10 = new X(interfaceC0818r2);
        }
        do {
            e10 = interfaceC0818r2.e();
            if (e10) {
                break;
            }
        } while (c12.tryAdvance(x10));
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0741c
    public final EnumC0770h3 P0() {
        return EnumC0770h3.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC0741c
    final j$.util.S Z0(AbstractC0850z0 abstractC0850z0, C0731a c0731a, boolean z10) {
        return new t3(abstractC0850z0, c0731a, z10);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        Objects.requireNonNull(null);
        return new C0841x(this, EnumC0765g3.f21475t, null, 4);
    }

    @Override // j$.util.stream.IntStream
    public final H asDoubleStream() {
        return new A(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC0812q0 asLongStream() {
        return new C0732a0(this, 0, 0);
    }

    @Override // j$.util.stream.IntStream
    public final C0725m average() {
        long[] jArr = (long[]) collect(new C0736b(17), new C0736b(18), new C0736b(19));
        long j10 = jArr[0];
        return j10 > 0 ? C0725m.d(jArr[1] / j10) : C0725m.a();
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C0833v(this, 0, new Y(1), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        Objects.requireNonNull(null);
        return new C0841x(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n, null, 2);
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C0820s c0820s = new C0820s(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(c0820s);
        return L0(new E1(EnumC0770h3.INT_VALUE, c0820s, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) L0(new G1(EnumC0770h3.INT_VALUE, 3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final H d() {
        Objects.requireNonNull(null);
        return new C0837w(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n, null, 4);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC0779j2) ((AbstractC0779j2) boxed()).distinct()).mapToInt(new C0736b(16));
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC0812q0 f() {
        Objects.requireNonNull(null);
        return new C0845y(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n, null, 1);
    }

    @Override // j$.util.stream.IntStream
    public final C0726n findAny() {
        return (C0726n) L0(K.f21308d);
    }

    @Override // j$.util.stream.IntStream
    public final C0726n findFirst() {
        return (C0726n) L0(K.f21307c);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        L0(new Q(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        L0(new Q(intConsumer, true));
    }

    @Override // j$.util.stream.IntStream
    public final boolean i() {
        return ((Boolean) L0(AbstractC0850z0.A0(EnumC0838w0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final InterfaceC0856w iterator() {
        return j$.util.g0.g(spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final boolean l() {
        return ((Boolean) L0(AbstractC0850z0.A0(EnumC0838w0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j10) {
        if (j10 >= 0) {
            return AbstractC0850z0.z0(this, 0L, j10);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new C0833v(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final C0726n max() {
        return reduce(new Y(2));
    }

    @Override // j$.util.stream.IntStream
    public final C0726n min() {
        return reduce(new O0(27));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new C0841x(this, 0, intConsumer, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream q(P0 p02) {
        Objects.requireNonNull(p02);
        return new C0841x(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n | EnumC0765g3.f21475t, p02, 3);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i6, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) L0(new P1(EnumC0770h3.INT_VALUE, intBinaryOperator, i6))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final C0726n reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (C0726n) L0(new C1(EnumC0770h3.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final boolean s() {
        return ((Boolean) L0(AbstractC0850z0.A0(EnumC0838w0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j10) {
        int i6 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i6 >= 0) {
            return i6 == 0 ? this : AbstractC0850z0.z0(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new K2(this);
    }

    @Override // j$.util.stream.AbstractC0741c, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final j$.util.I spliterator() {
        return c1(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new O0(28));
    }

    @Override // j$.util.stream.IntStream
    public final C0722j summaryStatistics() {
        return (C0722j) collect(new O0(11), new O0(29), new Y(0));
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC0850z0.o0((F0) M0(new C0736b(20))).b();
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final InterfaceC0771i unordered() {
        return !R0() ? this : new C0742c0(this, EnumC0765g3.r);
    }
}
