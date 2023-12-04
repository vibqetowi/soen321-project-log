package org.apache.commons.lang3;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.Streams;
import org.apache.commons.lang3.function.FailableBooleanSupplier;
import retrofit2.Platform$$ExternalSyntheticApiModelOutline0;
@Deprecated
/* loaded from: classes5.dex */
public class Functions {

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes5.dex */
    public interface FailableBiConsumer<O1, O2, T extends Throwable> {
        void accept(O1 o1, O2 o2) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes5.dex */
    public interface FailableBiFunction<O1, O2, R, T extends Throwable> {
        R apply(O1 o1, O2 o2) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes5.dex */
    public interface FailableBiPredicate<O1, O2, T extends Throwable> {
        boolean test(O1 o1, O2 o2) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes5.dex */
    public interface FailableCallable<R, T extends Throwable> {
        R call() throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes5.dex */
    public interface FailableConsumer<O, T extends Throwable> {
        void accept(O o) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes5.dex */
    public interface FailableFunction<I, R, T extends Throwable> {
        R apply(I i) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes5.dex */
    public interface FailablePredicate<I, T extends Throwable> {
        boolean test(I i) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes5.dex */
    public interface FailableRunnable<T extends Throwable> {
        void run() throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes5.dex */
    public interface FailableSupplier<R, T extends Throwable> {
        R get() throws Throwable;
    }

    public static <O1, O2, T extends Throwable> void accept(final FailableBiConsumer<O1, O2, T> failableBiConsumer, final O1 o1, final O2 o2) {
        run(new FailableRunnable() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda15
            @Override // org.apache.commons.lang3.Functions.FailableRunnable
            public final void run() {
                Functions.FailableBiConsumer.this.accept(o1, o2);
            }
        });
    }

    public static <O, T extends Throwable> void accept(final FailableConsumer<O, T> failableConsumer, final O o) {
        run(new FailableRunnable() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda17
            @Override // org.apache.commons.lang3.Functions.FailableRunnable
            public final void run() {
                Functions.FailableConsumer.this.accept(o);
            }
        });
    }

    public static <O1, O2, O, T extends Throwable> O apply(final FailableBiFunction<O1, O2, O, T> failableBiFunction, final O1 o1, final O2 o2) {
        return (O) get(new FailableSupplier() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda13
            @Override // org.apache.commons.lang3.Functions.FailableSupplier
            public final Object get() {
                Object apply;
                apply = Functions.FailableBiFunction.this.apply(o1, o2);
                return apply;
            }
        });
    }

    public static <I, O, T extends Throwable> O apply(final FailableFunction<I, O, T> failableFunction, final I i) {
        return (O) get(new FailableSupplier() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda14
            @Override // org.apache.commons.lang3.Functions.FailableSupplier
            public final Object get() {
                Object apply;
                apply = Functions.FailableFunction.this.apply(i);
                return apply;
            }
        });
    }

    public static <O1, O2> BiConsumer<O1, O2> asBiConsumer(final FailableBiConsumer<O1, O2, ?> failableBiConsumer) {
        return new BiConsumer() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda19
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Functions.accept(Functions.FailableBiConsumer.this, obj, obj2);
            }
        };
    }

    public static <O1, O2, O> BiFunction<O1, O2, O> asBiFunction(final FailableBiFunction<O1, O2, O, ?> failableBiFunction) {
        return new BiFunction() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda11
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object apply;
                apply = Functions.apply(Functions.FailableBiFunction.this, obj, obj2);
                return apply;
            }
        };
    }

    public static <O1, O2> BiPredicate<O1, O2> asBiPredicate(final FailableBiPredicate<O1, O2, ?> failableBiPredicate) {
        return new BiPredicate() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda12
            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                boolean test;
                test = Functions.test(Functions.FailableBiPredicate.this, obj, obj2);
                return test;
            }
        };
    }

    public static <O> Callable<O> asCallable(final FailableCallable<O, ?> failableCallable) {
        return new Callable() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object call;
                call = Functions.call(Functions.FailableCallable.this);
                return call;
            }
        };
    }

    public static <I> Consumer<I> asConsumer(final FailableConsumer<I, ?> failableConsumer) {
        return new Consumer() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda5
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Functions.accept(Functions.FailableConsumer.this, obj);
            }
        };
    }

    public static <I, O> Function<I, O> asFunction(final FailableFunction<I, O, ?> failableFunction) {
        return new Function() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Functions.apply(Functions.FailableFunction.this, obj);
                return apply;
            }
        };
    }

    public static <I> Predicate<I> asPredicate(final FailablePredicate<I, ?> failablePredicate) {
        return new Predicate() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda8
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean test;
                test = Functions.test(Functions.FailablePredicate.this, obj);
                return test;
            }
        };
    }

    public static Runnable asRunnable(final FailableRunnable<?> failableRunnable) {
        return new Runnable() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                Functions.run(Functions.FailableRunnable.this);
            }
        };
    }

    public static <O> Supplier<O> asSupplier(final FailableSupplier<O, ?> failableSupplier) {
        return new Supplier() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda3
            @Override // java.util.function.Supplier
            public final Object get() {
                Object obj;
                obj = Functions.get(Functions.FailableSupplier.this);
                return obj;
            }
        };
    }

    public static <O, T extends Throwable> O call(final FailableCallable<O, T> failableCallable) {
        failableCallable.getClass();
        return (O) get(new FailableSupplier() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda7
            @Override // org.apache.commons.lang3.Functions.FailableSupplier
            public final Object get() {
                return Functions.FailableCallable.this.call();
            }
        });
    }

    public static <O, T extends Throwable> O get(FailableSupplier<O, T> failableSupplier) {
        try {
            return failableSupplier.get();
        } catch (Throwable th) {
            throw rethrow(th);
        }
    }

    private static <T extends Throwable> boolean getAsBoolean(FailableBooleanSupplier<T> failableBooleanSupplier) {
        try {
            return failableBooleanSupplier.getAsBoolean();
        } catch (Throwable th) {
            throw rethrow(th);
        }
    }

    public static RuntimeException rethrow(Throwable th) {
        Objects.requireNonNull(th, "throwable");
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th instanceof IOException) {
            Platform$$ExternalSyntheticApiModelOutline0.m9081m();
            throw Platform$$ExternalSyntheticApiModelOutline0.m((IOException) th);
        }
        throw new UndeclaredThrowableException(th);
    }

    public static <T extends Throwable> void run(FailableRunnable<T> failableRunnable) {
        try {
            failableRunnable.run();
        } catch (Throwable th) {
            throw rethrow(th);
        }
    }

    public static <O> Streams.FailableStream<O> stream(Collection<O> collection) {
        Stream stream;
        stream = collection.stream();
        return new Streams.FailableStream<>(stream);
    }

    public static <O> Streams.FailableStream<O> stream(Stream<O> stream) {
        return new Streams.FailableStream<>(stream);
    }

    public static <O1, O2, T extends Throwable> boolean test(final FailableBiPredicate<O1, O2, T> failableBiPredicate, final O1 o1, final O2 o2) {
        return getAsBoolean(new FailableBooleanSupplier() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda9
            @Override // org.apache.commons.lang3.function.FailableBooleanSupplier
            public final boolean getAsBoolean() {
                boolean test;
                test = Functions.FailableBiPredicate.this.test(o1, o2);
                return test;
            }
        });
    }

    public static <O, T extends Throwable> boolean test(final FailablePredicate<O, T> failablePredicate, final O o) {
        return getAsBoolean(new FailableBooleanSupplier() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda10
            @Override // org.apache.commons.lang3.function.FailableBooleanSupplier
            public final boolean getAsBoolean() {
                boolean test;
                test = Functions.FailablePredicate.this.test(o);
                return test;
            }
        });
    }

    @SafeVarargs
    public static void tryWithResources(FailableRunnable<? extends Throwable> failableRunnable, FailableConsumer<Throwable, ? extends Throwable> failableConsumer, FailableRunnable<? extends Throwable>... failableRunnableArr) {
        if (failableConsumer == null) {
            failableConsumer = new FailableConsumer() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda16
                @Override // org.apache.commons.lang3.Functions.FailableConsumer
                public final void accept(Object obj) {
                    Functions.rethrow((Throwable) obj);
                }
            };
        }
        if (failableRunnableArr != null) {
            for (FailableRunnable<? extends Throwable> failableRunnable2 : failableRunnableArr) {
                Objects.requireNonNull(failableRunnable2, "runnable");
            }
        }
        try {
            failableRunnable.run();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        if (failableRunnableArr != null) {
            for (FailableRunnable<? extends Throwable> failableRunnable3 : failableRunnableArr) {
                try {
                    failableRunnable3.run();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
            }
        }
        if (th != null) {
            try {
                failableConsumer.accept(th);
            } catch (Throwable th3) {
                throw rethrow(th3);
            }
        }
    }

    @SafeVarargs
    public static void tryWithResources(FailableRunnable<? extends Throwable> failableRunnable, FailableRunnable<? extends Throwable>... failableRunnableArr) {
        tryWithResources(failableRunnable, null, failableRunnableArr);
    }
}
