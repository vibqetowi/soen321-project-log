package j$.util.stream;

import j$.util.C0721i;
import j$.util.C0725m;
import j$.util.InterfaceC0730s;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
/* loaded from: classes3.dex */
public interface H extends InterfaceC0771i {
    H a();

    C0725m average();

    H b(C0731a c0731a);

    Stream boxed();

    H c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    H distinct();

    C0725m findAny();

    C0725m findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    boolean h();

    @Override // 
    InterfaceC0730s iterator();

    H limit(long j10);

    boolean m();

    Stream mapToObj(DoubleFunction doubleFunction);

    C0725m max();

    C0725m min();

    InterfaceC0812q0 n();

    @Override // 
    H parallel();

    H peek(DoubleConsumer doubleConsumer);

    double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator);

    C0725m reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // 
    H sequential();

    H skip(long j10);

    H sorted();

    @Override // 
    j$.util.F spliterator();

    double sum();

    C0721i summaryStatistics();

    double[] toArray();

    IntStream u();

    boolean w();
}
