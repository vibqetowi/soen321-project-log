package j$.util.stream;

import j$.util.C0719g;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
/* renamed from: j$.util.stream.z0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0850z0 implements P3 {

    /* renamed from: a  reason: collision with root package name */
    private static final C0743c1 f21602a = new C0743c1();

    /* renamed from: b  reason: collision with root package name */
    private static final F0 f21603b = new C0733a1();

    /* renamed from: c  reason: collision with root package name */
    private static final G0 f21604c = new C0738b1();

    /* renamed from: d  reason: collision with root package name */
    private static final E0 f21605d = new Z0();

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f21606e = new int[0];
    private static final long[] f = new long[0];

    /* renamed from: g  reason: collision with root package name */
    private static final double[] f21607g = new double[0];

    public /* synthetic */ AbstractC0850z0() {
    }

    public /* synthetic */ AbstractC0850z0(EnumC0770h3 enumC0770h3) {
    }

    public static void A(InterfaceC0804o2 interfaceC0804o2, Double d10) {
        if (S3.f21385a) {
            S3.a(interfaceC0804o2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        } else {
            interfaceC0804o2.accept(d10.doubleValue());
        }
    }

    public static C0842x0 A0(EnumC0838w0 enumC0838w0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC0838w0);
        return new C0842x0(EnumC0770h3.INT_VALUE, enumC0838w0, new C0801o(1, enumC0838w0, null));
    }

    public static InterfaceC0812q0 B0(AbstractC0741c abstractC0741c, long j10, long j11) {
        if (j10 >= 0) {
            return new C0844x2(abstractC0741c, l0(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static void C(InterfaceC0809p2 interfaceC0809p2, Integer num) {
        if (S3.f21385a) {
            S3.a(interfaceC0809p2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        } else {
            interfaceC0809p2.accept(num.intValue());
        }
    }

    public static C0842x0 C0(EnumC0838w0 enumC0838w0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC0838w0);
        return new C0842x0(EnumC0770h3.LONG_VALUE, enumC0838w0, new C0801o(4, enumC0838w0, null));
    }

    public static void E(InterfaceC0814q2 interfaceC0814q2, Long l2) {
        if (S3.f21385a) {
            S3.a(interfaceC0814q2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        } else {
            interfaceC0814q2.accept(l2.longValue());
        }
    }

    public static C0842x0 E0(EnumC0838w0 enumC0838w0, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC0838w0);
        return new C0842x0(EnumC0770h3.REFERENCE, enumC0838w0, new C0801o(2, enumC0838w0, predicate));
    }

    public static Stream F0(AbstractC0741c abstractC0741c, long j10, long j11) {
        if (j10 >= 0) {
            return new C0828t2(abstractC0741c, l0(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static void G() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void H() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Stream H0(j$.util.S s10, boolean z10) {
        Objects.requireNonNull(s10);
        return new C0764g2(s10, EnumC0765g3.n(s10), z10);
    }

    public static Object[] I(H0 h02, IntFunction intFunction) {
        if (S3.f21385a) {
            S3.a(h02.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        } else if (h02.count() < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) h02.count());
            h02.j(objArr, 0);
            return objArr;
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static void J(E0 e0, Double[] dArr, int i6) {
        if (S3.f21385a) {
            S3.a(e0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) e0.b();
        for (int i10 = 0; i10 < dArr2.length; i10++) {
            dArr[i6 + i10] = Double.valueOf(dArr2[i10]);
        }
    }

    public static void K(F0 f02, Integer[] numArr, int i6) {
        if (S3.f21385a) {
            S3.a(f02.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) f02.b();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i6 + i10] = Integer.valueOf(iArr[i10]);
        }
    }

    public static void L(G0 g02, Long[] lArr, int i6) {
        if (S3.f21385a) {
            S3.a(g02.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) g02.b();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            lArr[i6 + i10] = Long.valueOf(jArr[i10]);
        }
    }

    public static void M(E0 e0, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            e0.g((DoubleConsumer) consumer);
        } else if (S3.f21385a) {
            S3.a(e0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((j$.util.F) e0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void N(F0 f02, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            f02.g((IntConsumer) consumer);
        } else if (S3.f21385a) {
            S3.a(f02.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((j$.util.I) f02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void O(G0 g02, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            g02.g((LongConsumer) consumer);
        } else if (S3.f21385a) {
            S3.a(g02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((j$.util.L) g02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static E0 P(E0 e0, long j10, long j11) {
        if (j10 == 0 && j11 == e0.count()) {
            return e0;
        }
        long j12 = j11 - j10;
        j$.util.F f2 = (j$.util.F) e0.spliterator();
        A0 h02 = h0(j12);
        h02.c(j12);
        for (int i6 = 0; i6 < j10 && f2.tryAdvance((DoubleConsumer) new w3(1)); i6++) {
        }
        if (j11 == e0.count()) {
            f2.forEachRemaining((DoubleConsumer) h02);
        } else {
            for (int i10 = 0; i10 < j12 && f2.tryAdvance((DoubleConsumer) h02); i10++) {
            }
        }
        h02.end();
        return h02.build();
    }

    public static F0 Q(F0 f02, long j10, long j11) {
        if (j10 == 0 && j11 == f02.count()) {
            return f02;
        }
        long j12 = j11 - j10;
        j$.util.I i6 = (j$.util.I) f02.spliterator();
        B0 t02 = t0(j12);
        t02.c(j12);
        for (int i10 = 0; i10 < j10 && i6.tryAdvance((IntConsumer) new y3(1)); i10++) {
        }
        if (j11 == f02.count()) {
            i6.forEachRemaining((IntConsumer) t02);
        } else {
            for (int i11 = 0; i11 < j12 && i6.tryAdvance((IntConsumer) t02); i11++) {
            }
        }
        t02.end();
        return t02.build();
    }

    public static G0 R(G0 g02, long j10, long j11) {
        if (j10 == 0 && j11 == g02.count()) {
            return g02;
        }
        long j12 = j11 - j10;
        j$.util.L l2 = (j$.util.L) g02.spliterator();
        C0 v02 = v0(j12);
        v02.c(j12);
        for (int i6 = 0; i6 < j10 && l2.tryAdvance((LongConsumer) new A3(1)); i6++) {
        }
        if (j11 == g02.count()) {
            l2.forEachRemaining((LongConsumer) v02);
        } else {
            for (int i10 = 0; i10 < j12 && l2.tryAdvance((LongConsumer) v02); i10++) {
            }
        }
        v02.end();
        return v02.build();
    }

    public static I0 S(I0 i02, long j10, long j11, IntFunction intFunction) {
        if (j10 == 0 && j11 == i02.count()) {
            return i02;
        }
        j$.util.S spliterator = i02.spliterator();
        long j12 = j11 - j10;
        D0 Z = Z(j12, intFunction);
        Z.c(j12);
        for (int i6 = 0; i6 < j10 && spliterator.tryAdvance(new Y(9)); i6++) {
        }
        if (j11 == i02.count()) {
            spliterator.forEachRemaining(Z);
        } else {
            for (int i10 = 0; i10 < j12 && spliterator.tryAdvance(Z); i10++) {
            }
        }
        Z.end();
        return Z.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long W(long j10, long j11, long j12) {
        if (j10 >= 0) {
            return Math.max(-1L, Math.min(j10 - j11, j12));
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long X(long j10, long j11) {
        long j12 = j11 >= 0 ? j10 + j11 : Long.MAX_VALUE;
        if (j12 >= 0) {
            return j12;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j$.util.S Y(EnumC0770h3 enumC0770h3, j$.util.S s10, long j10, long j11) {
        long j12 = j11 >= 0 ? j10 + j11 : Long.MAX_VALUE;
        long j13 = j12 >= 0 ? j12 : Long.MAX_VALUE;
        int i6 = A2.f21250a[enumC0770h3.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        return new x3((j$.util.F) s10, j10, j13);
                    }
                    throw new IllegalStateException("Unknown shape " + enumC0770h3);
                }
                return new B3((j$.util.L) s10, j10, j13);
            }
            return new z3((j$.util.I) s10, j10, j13);
        }
        return new D3(s10, j10, j13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static D0 Z(long j10, IntFunction intFunction) {
        return (j10 < 0 || j10 >= 2147483639) ? new C0839w1() : new C0753e1(j10, intFunction);
    }

    public static I0 a0(AbstractC0850z0 abstractC0850z0, j$.util.S s10, boolean z10, IntFunction intFunction) {
        long k02 = abstractC0850z0.k0(s10);
        if (k02 < 0 || !s10.hasCharacteristics(16384)) {
            I0 i02 = (I0) new N0(s10, abstractC0850z0, intFunction).invoke();
            return z10 ? m0(i02, intFunction) : i02;
        } else if (k02 < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) k02);
            new C0831u1(s10, abstractC0850z0, objArr).invoke();
            return new L0(objArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static E0 b0(AbstractC0850z0 abstractC0850z0, j$.util.S s10, boolean z10) {
        long k02 = abstractC0850z0.k0(s10);
        if (k02 < 0 || !s10.hasCharacteristics(16384)) {
            E0 e0 = (E0) new N0(0, s10, abstractC0850z0).invoke();
            return z10 ? n0(e0) : e0;
        } else if (k02 < 2147483639) {
            double[] dArr = new double[(int) k02];
            new C0817r1(s10, abstractC0850z0, dArr).invoke();
            return new W0(dArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static F0 c0(AbstractC0850z0 abstractC0850z0, j$.util.S s10, boolean z10) {
        long k02 = abstractC0850z0.k0(s10);
        if (k02 < 0 || !s10.hasCharacteristics(16384)) {
            F0 f02 = (F0) new N0(1, s10, abstractC0850z0).invoke();
            return z10 ? o0(f02) : f02;
        } else if (k02 < 2147483639) {
            int[] iArr = new int[(int) k02];
            new C0822s1(s10, abstractC0850z0, iArr).invoke();
            return new C0758f1(iArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static G0 d0(AbstractC0850z0 abstractC0850z0, j$.util.S s10, boolean z10) {
        long k02 = abstractC0850z0.k0(s10);
        if (k02 < 0 || !s10.hasCharacteristics(16384)) {
            G0 g02 = (G0) new N0(2, s10, abstractC0850z0).invoke();
            return z10 ? p0(g02) : g02;
        } else if (k02 < 2147483639) {
            long[] jArr = new long[(int) k02];
            new C0827t1(s10, abstractC0850z0, jArr).invoke();
            return new C0803o1(jArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static K0 e0(EnumC0770h3 enumC0770h3, I0 i02, I0 i03) {
        int i6 = J0.f21303a[enumC0770h3.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        return new R0((E0) i02, (E0) i03);
                    }
                    throw new IllegalStateException("Unknown shape " + enumC0770h3);
                }
                return new T0((G0) i02, (G0) i03);
            }
            return new S0((F0) i02, (F0) i03);
        }
        return new V0(i02, i03);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static A0 h0(long j10) {
        return (j10 < 0 || j10 >= 2147483639) ? new Y0() : new X0(j10);
    }

    public static H i0(j$.util.F f2) {
        return new B(f2, EnumC0765g3.n(f2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC0748d1 j0(EnumC0770h3 enumC0770h3) {
        I0 i02;
        int i6 = J0.f21303a[enumC0770h3.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                i02 = f21603b;
            } else if (i6 == 3) {
                i02 = f21604c;
            } else if (i6 != 4) {
                throw new IllegalStateException("Unknown shape " + enumC0770h3);
            } else {
                i02 = f21605d;
            }
            return (AbstractC0748d1) i02;
        }
        return f21602a;
    }

    private static int l0(long j10) {
        return (j10 != -1 ? EnumC0765g3.f21476u : 0) | EnumC0765g3.f21475t;
    }

    public static I0 m0(I0 i02, IntFunction intFunction) {
        if (i02.n() > 0) {
            long count = i02.count();
            if (count < 2147483639) {
                Object[] objArr = (Object[]) intFunction.apply((int) count);
                new C0847y1(i02, objArr).invoke();
                return new L0(objArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return i02;
    }

    public static E0 n0(E0 e0) {
        if (e0.n() > 0) {
            long count = e0.count();
            if (count < 2147483639) {
                double[] dArr = new double[(int) count];
                new C0843x1(e0, dArr).invoke();
                return new W0(dArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return e0;
    }

    public static F0 o0(F0 f02) {
        if (f02.n() > 0) {
            long count = f02.count();
            if (count < 2147483639) {
                int[] iArr = new int[(int) count];
                new C0843x1(f02, iArr).invoke();
                return new C0758f1(iArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return f02;
    }

    public static G0 p0(G0 g02) {
        if (g02.n() > 0) {
            long count = g02.count();
            if (count < 2147483639) {
                long[] jArr = new long[(int) count];
                new C0843x1(g02, jArr).invoke();
                return new C0803o1(jArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return g02;
    }

    public static Set q0(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC0781k) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(AbstractC0776j.b((EnumC0781k) it.next()));
                } catch (ClassCastException e10) {
                    C0719g.a(e10, "java.util.stream.Collector.Characteristics");
                    throw null;
                }
            }
            return hashSet;
        } else if (!(next instanceof Collector.Characteristics)) {
            C0719g.a(next.getClass(), "java.util.stream.Collector.Characteristics");
            throw null;
        } else {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(AbstractC0776j.a((Collector.Characteristics) it2.next()));
                } catch (ClassCastException e11) {
                    C0719g.a(e11, "java.util.stream.Collector.Characteristics");
                    throw null;
                }
            }
            return hashSet;
        }
    }

    public static C0731a r0(Function function) {
        return new C0731a(function, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static B0 t0(long j10) {
        return (j10 < 0 || j10 >= 2147483639) ? new C0768h1() : new C0763g1(j10);
    }

    public static IntStream u0(j$.util.I i6) {
        return new C0747d0(i6, EnumC0765g3.n(i6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0 v0(long j10) {
        return (j10 < 0 || j10 >= 2147483639) ? new C0813q1() : new C0808p1(j10);
    }

    public static InterfaceC0812q0 w0(j$.util.L l2) {
        return new C0782k0(l2, EnumC0765g3.n(l2));
    }

    public static H x0(AbstractC0741c abstractC0741c, long j10, long j11) {
        if (j10 >= 0) {
            return new C0852z2(abstractC0741c, l0(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static C0842x0 y0(EnumC0838w0 enumC0838w0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC0838w0);
        return new C0842x0(EnumC0770h3.DOUBLE_VALUE, enumC0838w0, new C0801o(3, enumC0838w0, null));
    }

    public static void z() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static IntStream z0(AbstractC0741c abstractC0741c, long j10, long j11) {
        if (j10 >= 0) {
            return new C0836v2(abstractC0741c, l0(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract D0 D0(long j10, IntFunction intFunction);

    public abstract U1 G0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC0818r2 I0(j$.util.S s10, InterfaceC0818r2 interfaceC0818r2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC0818r2 J0(InterfaceC0818r2 interfaceC0818r2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f0(j$.util.S s10, InterfaceC0818r2 interfaceC0818r2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean g0(j$.util.S s10, InterfaceC0818r2 interfaceC0818r2);

    @Override // j$.util.stream.P3
    public Object k(AbstractC0850z0 abstractC0850z0, j$.util.S s10) {
        return ((U1) new C0739b2(this, abstractC0850z0, s10).invoke()).get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long k0(j$.util.S s10);

    @Override // j$.util.stream.P3
    public /* synthetic */ int o() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int s0();

    @Override // j$.util.stream.P3
    public Object y(AbstractC0850z0 abstractC0850z0, j$.util.S s10) {
        U1 G0 = G0();
        abstractC0850z0.I0(s10, G0);
        return G0.get();
    }
}
