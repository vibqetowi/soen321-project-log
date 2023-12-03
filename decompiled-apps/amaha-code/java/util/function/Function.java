package java.util.function;
/* loaded from: classes3.dex */
public interface Function<T, R> {
    <V> Function<T, V> andThen(Function<? super R, ? extends V> function);

    R apply(T t3);

    <V> Function<V, R> compose(Function<? super V, ? extends T> function);
}
