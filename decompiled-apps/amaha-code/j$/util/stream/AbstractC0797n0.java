package j$.util.stream;

import j$.util.C0723k;
import j$.util.C0725m;
import j$.util.C0727o;
import j$.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
/* renamed from: j$.util.stream.n0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0797n0 extends AbstractC0741c implements InterfaceC0812q0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0797n0(j$.util.S s10, int i6) {
        super(s10, i6, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0797n0(AbstractC0741c abstractC0741c, int i6) {
        super(abstractC0741c, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.L c1(j$.util.S s10) {
        if (s10 instanceof j$.util.L) {
            return (j$.util.L) s10;
        }
        if (S3.f21385a) {
            S3.a(AbstractC0741c.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0850z0
    public final D0 D0(long j10, IntFunction intFunction) {
        return AbstractC0850z0.v0(j10);
    }

    @Override // j$.util.stream.AbstractC0741c
    final I0 N0(AbstractC0850z0 abstractC0850z0, j$.util.S s10, boolean z10, IntFunction intFunction) {
        return AbstractC0850z0.d0(abstractC0850z0, s10, z10);
    }

    @Override // j$.util.stream.AbstractC0741c
    final boolean O0(j$.util.S s10, InterfaceC0818r2 interfaceC0818r2) {
        LongConsumer c0767h0;
        boolean e10;
        j$.util.L c12 = c1(s10);
        if (interfaceC0818r2 instanceof LongConsumer) {
            c0767h0 = (LongConsumer) interfaceC0818r2;
        } else if (S3.f21385a) {
            S3.a(AbstractC0741c.class, "using LongStream.adapt(Sink<Long> s)");
            throw null;
        } else {
            Objects.requireNonNull(interfaceC0818r2);
            c0767h0 = new C0767h0(interfaceC0818r2);
        }
        do {
            e10 = interfaceC0818r2.e();
            if (e10) {
                break;
            }
        } while (c12.tryAdvance(c0767h0));
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0741c
    public final EnumC0770h3 P0() {
        return EnumC0770h3.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC0741c
    final j$.util.S Z0(AbstractC0850z0 abstractC0850z0, C0731a c0731a, boolean z10) {
        return new v3(abstractC0850z0, c0731a, z10);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final InterfaceC0812q0 a() {
        Objects.requireNonNull(null);
        return new C0845y(this, EnumC0765g3.f21475t, null, 4);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final H asDoubleStream() {
        return new A(this, EnumC0765g3.f21470n, 2);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final C0725m average() {
        long[] jArr = (long[]) collect(new C0736b(23), new C0736b(24), new C0736b(25));
        long j10 = jArr[0];
        return j10 > 0 ? C0725m.d(jArr[1] / j10) : C0725m.a();
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final InterfaceC0812q0 b(C0731a c0731a) {
        Objects.requireNonNull(c0731a);
        return new C0845y(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n | EnumC0765g3.f21475t, c0731a, 3);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final Stream boxed() {
        return new C0833v(this, 0, new Y(4), 2);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final InterfaceC0812q0 c() {
        Objects.requireNonNull(null);
        return new C0845y(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n, null, 2);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C0820s c0820s = new C0820s(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(c0820s);
        return L0(new E1(EnumC0770h3.LONG_VALUE, c0820s, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final long count() {
        return ((Long) L0(new G1(EnumC0770h3.LONG_VALUE, 0))).longValue();
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final InterfaceC0812q0 distinct() {
        return ((AbstractC0779j2) ((AbstractC0779j2) boxed()).distinct()).mapToLong(new C0736b(21));
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final H e() {
        Objects.requireNonNull(null);
        return new C0837w(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n, null, 5);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final C0727o findAny() {
        return (C0727o) L0(L.f21317d);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final C0727o findFirst() {
        return (C0727o) L0(L.f21316c);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        L0(new S(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        L0(new S(longConsumer, true));
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final boolean g() {
        return ((Boolean) L0(AbstractC0850z0.C0(EnumC0838w0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final j$.util.A iterator() {
        return j$.util.g0.h(spliterator());
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final boolean j() {
        return ((Boolean) L0(AbstractC0850z0.C0(EnumC0838w0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final InterfaceC0812q0 limit(long j10) {
        if (j10 >= 0) {
            return AbstractC0850z0.B0(this, 0L, j10);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new C0833v(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n, longFunction, 2);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final C0727o max() {
        return reduce(new Y(3));
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final C0727o min() {
        return reduce(new Y(8));
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final InterfaceC0812q0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C0845y(this, 0, longConsumer, 5);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final boolean r() {
        return ((Boolean) L0(AbstractC0850z0.C0(EnumC0838w0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final long reduce(long j10, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) L0(new A1(EnumC0770h3.LONG_VALUE, longBinaryOperator, j10))).longValue();
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final C0727o reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (C0727o) L0(new C1(EnumC0770h3.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final InterfaceC0812q0 skip(long j10) {
        int i6 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i6 >= 0) {
            return i6 == 0 ? this : AbstractC0850z0.B0(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final InterfaceC0812q0 sorted() {
        return new L2(this);
    }

    @Override // j$.util.stream.AbstractC0741c, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final j$.util.L spliterator() {
        return c1(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final long sum() {
        return reduce(0L, new Y(5));
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final C0723k summaryStatistics() {
        return (C0723k) collect(new O0(12), new Y(6), new Y(7));
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final long[] toArray() {
        return (long[]) AbstractC0850z0.p0((G0) M0(new C0736b(22))).b();
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final InterfaceC0771i unordered() {
        return !R0() ? this : new C0732a0(this, EnumC0765g3.r, 1);
    }

    @Override // j$.util.stream.InterfaceC0812q0
    public final IntStream v() {
        Objects.requireNonNull(null);
        return new C0841x(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n, null, 5);
    }
}
