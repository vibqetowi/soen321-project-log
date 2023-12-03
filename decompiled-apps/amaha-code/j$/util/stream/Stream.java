package j$.util.stream;

import j$.util.Optional;
import java.util.Comparator;
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
/* loaded from: classes3.dex */
public interface Stream<T> extends InterfaceC0771i {
    boolean allMatch(Predicate predicate);

    boolean anyMatch(Predicate predicate);

    Stream b(C0731a c0731a);

    <R, A> R collect(Collector<? super T, A, R> collector);

    Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2);

    long count();

    Stream<T> distinct();

    Stream<T> filter(Predicate<? super T> predicate);

    Optional findAny();

    Optional findFirst();

    void forEach(Consumer consumer);

    void forEachOrdered(Consumer consumer);

    Stream limit(long j10);

    <R> Stream<R> map(Function<? super T, ? extends R> function);

    H mapToDouble(ToDoubleFunction toDoubleFunction);

    IntStream mapToInt(ToIntFunction toIntFunction);

    InterfaceC0812q0 mapToLong(ToLongFunction toLongFunction);

    Optional max(Comparator comparator);

    Optional min(Comparator comparator);

    boolean noneMatch(Predicate predicate);

    InterfaceC0812q0 p(C0731a c0731a);

    Stream peek(Consumer consumer);

    Optional reduce(BinaryOperator binaryOperator);

    Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator);

    Object reduce(Object obj, BinaryOperator binaryOperator);

    Stream skip(long j10);

    Stream sorted();

    Stream sorted(Comparator comparator);

    IntStream t(C0731a c0731a);

    Object[] toArray();

    Object[] toArray(IntFunction intFunction);

    H x(C0731a c0731a);
}
