package j$.util.stream;

import j$.util.C0721i;
import j$.util.C0725m;
import j$.util.InterfaceC0730s;
import j$.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
/* loaded from: classes3.dex */
abstract class E extends AbstractC0741c implements H {
    /* JADX INFO: Access modifiers changed from: package-private */
    public E(j$.util.S s10, int i6) {
        super(s10, i6, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public E(AbstractC0741c abstractC0741c, int i6) {
        super(abstractC0741c, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.F c1(j$.util.S s10) {
        if (s10 instanceof j$.util.F) {
            return (j$.util.F) s10;
        }
        if (S3.f21385a) {
            S3.a(AbstractC0741c.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0850z0
    public final D0 D0(long j10, IntFunction intFunction) {
        return AbstractC0850z0.h0(j10);
    }

    @Override // j$.util.stream.AbstractC0741c
    final I0 N0(AbstractC0850z0 abstractC0850z0, j$.util.S s10, boolean z10, IntFunction intFunction) {
        return AbstractC0850z0.b0(abstractC0850z0, s10, z10);
    }

    @Override // j$.util.stream.AbstractC0741c
    final boolean O0(j$.util.S s10, InterfaceC0818r2 interfaceC0818r2) {
        DoubleConsumer c0825t;
        boolean e10;
        j$.util.F c12 = c1(s10);
        if (interfaceC0818r2 instanceof DoubleConsumer) {
            c0825t = (DoubleConsumer) interfaceC0818r2;
        } else if (S3.f21385a) {
            S3.a(AbstractC0741c.class, "using DoubleStream.adapt(Sink<Double> s)");
            throw null;
        } else {
            Objects.requireNonNull(interfaceC0818r2);
            c0825t = new C0825t(interfaceC0818r2);
        }
        do {
            e10 = interfaceC0818r2.e();
            if (e10) {
                break;
            }
        } while (c12.tryAdvance(c0825t));
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0741c
    public final EnumC0770h3 P0() {
        return EnumC0770h3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC0741c
    final j$.util.S Z0(AbstractC0850z0 abstractC0850z0, C0731a c0731a, boolean z10) {
        return new C0819r3(abstractC0850z0, c0731a, z10);
    }

    @Override // j$.util.stream.H
    public final H a() {
        Objects.requireNonNull(null);
        return new C0837w(this, EnumC0765g3.f21475t, null, 2);
    }

    @Override // j$.util.stream.H
    public final C0725m average() {
        double[] dArr = (double[]) collect(new C0736b(6), new C0736b(7), new C0736b(8));
        if (dArr[2] > 0.0d) {
            Set set = Collectors.f21264a;
            double d10 = dArr[0] + dArr[1];
            double d11 = dArr[dArr.length - 1];
            if (Double.isNaN(d10) && Double.isInfinite(d11)) {
                d10 = d11;
            }
            return C0725m.d(d10 / dArr[2]);
        }
        return C0725m.a();
    }

    @Override // j$.util.stream.H
    public final H b(C0731a c0731a) {
        Objects.requireNonNull(c0731a);
        return new C0837w(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n | EnumC0765g3.f21475t, c0731a, 1);
    }

    @Override // j$.util.stream.H
    public final Stream boxed() {
        return new C0833v(this, 0, new O0(20), 0);
    }

    @Override // j$.util.stream.H
    public final H c() {
        Objects.requireNonNull(null);
        return new C0837w(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n, null, 0);
    }

    @Override // j$.util.stream.H
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C0820s c0820s = new C0820s(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(c0820s);
        return L0(new E1(EnumC0770h3.DOUBLE_VALUE, c0820s, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.H
    public final long count() {
        return ((Long) L0(new G1(EnumC0770h3.DOUBLE_VALUE, 1))).longValue();
    }

    @Override // j$.util.stream.H
    public final H distinct() {
        return ((AbstractC0779j2) ((AbstractC0779j2) boxed()).distinct()).mapToDouble(new C0736b(9));
    }

    @Override // j$.util.stream.H
    public final C0725m findAny() {
        return (C0725m) L0(J.f21302d);
    }

    @Override // j$.util.stream.H
    public final C0725m findFirst() {
        return (C0725m) L0(J.f21301c);
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        L0(new P(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        L0(new P(doubleConsumer, true));
    }

    @Override // j$.util.stream.H
    public final boolean h() {
        return ((Boolean) L0(AbstractC0850z0.y0(EnumC0838w0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final InterfaceC0730s iterator() {
        return j$.util.g0.f(spliterator());
    }

    @Override // j$.util.stream.H
    public final H limit(long j10) {
        if (j10 >= 0) {
            return AbstractC0850z0.x0(this, 0L, j10);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.H
    public final boolean m() {
        return ((Boolean) L0(AbstractC0850z0.y0(EnumC0838w0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.H
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new C0833v(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n, doubleFunction, 0);
    }

    @Override // j$.util.stream.H
    public final C0725m max() {
        return reduce(new O0(19));
    }

    @Override // j$.util.stream.H
    public final C0725m min() {
        return reduce(new O0(18));
    }

    @Override // j$.util.stream.H
    public final InterfaceC0812q0 n() {
        Objects.requireNonNull(null);
        return new C0845y(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n, null, 0);
    }

    @Override // j$.util.stream.H
    public final H peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new C0837w(this, 0, doubleConsumer, 3);
    }

    @Override // j$.util.stream.H
    public final double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) L0(new I1(EnumC0770h3.DOUBLE_VALUE, doubleBinaryOperator, d10))).doubleValue();
    }

    @Override // j$.util.stream.H
    public final C0725m reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (C0725m) L0(new C1(EnumC0770h3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.H
    public final H skip(long j10) {
        int i6 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i6 >= 0) {
            return i6 == 0 ? this : AbstractC0850z0.x0(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.H
    public final H sorted() {
        return new J2(this);
    }

    @Override // j$.util.stream.AbstractC0741c, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final j$.util.F spliterator() {
        return c1(super.spliterator());
    }

    @Override // j$.util.stream.H
    public final double sum() {
        double[] dArr = (double[]) collect(new C0736b(10), new C0736b(4), new C0736b(5));
        Set set = Collectors.f21264a;
        double d10 = dArr[0] + dArr[1];
        double d11 = dArr[dArr.length - 1];
        return (Double.isNaN(d10) && Double.isInfinite(d11)) ? d11 : d10;
    }

    @Override // j$.util.stream.H
    public final C0721i summaryStatistics() {
        return (C0721i) collect(new O0(10), new O0(21), new O0(22));
    }

    @Override // j$.util.stream.H
    public final double[] toArray() {
        return (double[]) AbstractC0850z0.n0((E0) M0(new C0736b(3))).b();
    }

    @Override // j$.util.stream.H
    public final IntStream u() {
        Objects.requireNonNull(null);
        return new C0841x(this, EnumC0765g3.f21472p | EnumC0765g3.f21470n, null, 0);
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final InterfaceC0771i unordered() {
        return !R0() ? this : new A(this, EnumC0765g3.r, 0);
    }

    @Override // j$.util.stream.H
    public final boolean w() {
        return ((Boolean) L0(AbstractC0850z0.y0(EnumC0838w0.NONE))).booleanValue();
    }
}
