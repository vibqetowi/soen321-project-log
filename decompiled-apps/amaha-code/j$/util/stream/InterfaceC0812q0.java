package j$.util.stream;

import j$.util.C0723k;
import j$.util.C0725m;
import j$.util.C0727o;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
/* renamed from: j$.util.stream.q0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0812q0 extends InterfaceC0771i {
    InterfaceC0812q0 a();

    H asDoubleStream();

    C0725m average();

    InterfaceC0812q0 b(C0731a c0731a);

    Stream boxed();

    InterfaceC0812q0 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC0812q0 distinct();

    H e();

    C0727o findAny();

    C0727o findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    boolean g();

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    j$.util.A iterator();

    boolean j();

    InterfaceC0812q0 limit(long j10);

    Stream mapToObj(LongFunction longFunction);

    C0727o max();

    C0727o min();

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    InterfaceC0812q0 parallel();

    InterfaceC0812q0 peek(LongConsumer longConsumer);

    boolean r();

    long reduce(long j10, LongBinaryOperator longBinaryOperator);

    C0727o reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    InterfaceC0812q0 sequential();

    InterfaceC0812q0 skip(long j10);

    InterfaceC0812q0 sorted();

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    j$.util.L spliterator();

    long sum();

    C0723k summaryStatistics();

    long[] toArray();

    IntStream v();
}
