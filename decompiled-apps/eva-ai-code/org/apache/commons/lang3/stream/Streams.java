package org.apache.commons.lang3.stream;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;
import org.apache.commons.lang3.Streams$ArrayCollector$$ExternalSyntheticLambda3;
import org.apache.commons.lang3.function.Failable;
import org.apache.commons.lang3.function.FailableConsumer;
import org.apache.commons.lang3.function.FailableFunction;
import org.apache.commons.lang3.function.FailablePredicate;
import org.apache.commons.lang3.stream.Streams;
/* loaded from: classes5.dex */
public class Streams {

    /* loaded from: classes5.dex */
    public static class ArrayCollector<O> implements Collector<O, List<O>, O[]> {
        private static final Set<Collector.Characteristics> characteristics = Collections.emptySet();
        private final Class<O> elementType;

        public ArrayCollector(Class<O> cls) {
            this.elementType = cls;
        }

        @Override // java.util.stream.Collector
        public BiConsumer<List<O>, O> accumulator() {
            return new Streams$ArrayCollector$$ExternalSyntheticLambda3();
        }

        @Override // java.util.stream.Collector
        public Set<Collector.Characteristics> characteristics() {
            return characteristics;
        }

        @Override // java.util.stream.Collector
        public BinaryOperator<List<O>> combiner() {
            return new BinaryOperator() { // from class: org.apache.commons.lang3.stream.Streams$ArrayCollector$$ExternalSyntheticLambda0
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return ((List) obj).addAll((List) obj2);
                }
            };
        }

        @Override // java.util.stream.Collector
        public Function<List<O>, O[]> finisher() {
            return new Function() { // from class: org.apache.commons.lang3.stream.Streams$ArrayCollector$$ExternalSyntheticLambda1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Streams.ArrayCollector.this.m9056x3e66eb69((List) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$finisher$1$org-apache-commons-lang3-stream-Streams$ArrayCollector  reason: not valid java name */
        public /* synthetic */ Object[] m9056x3e66eb69(List list) {
            return list.toArray((Object[]) Array.newInstance((Class<?>) this.elementType, list.size()));
        }

        @Override // java.util.stream.Collector
        public Supplier<List<O>> supplier() {
            return new org.apache.commons.lang3.Streams$ArrayCollector$$ExternalSyntheticLambda0();
        }
    }

    /* loaded from: classes5.dex */
    public static class FailableStream<O> {
        private Stream<O> stream;
        private boolean terminated;

        public FailableStream(Stream<O> stream) {
            this.stream = stream;
        }

        public boolean allMatch(FailablePredicate<O, ?> failablePredicate) {
            boolean allMatch;
            assertNotTerminated();
            allMatch = stream().allMatch(Failable.asPredicate(failablePredicate));
            return allMatch;
        }

        public boolean anyMatch(FailablePredicate<O, ?> failablePredicate) {
            boolean anyMatch;
            assertNotTerminated();
            anyMatch = stream().anyMatch(Failable.asPredicate(failablePredicate));
            return anyMatch;
        }

        protected void assertNotTerminated() {
            if (this.terminated) {
                throw new IllegalStateException("This stream is already terminated.");
            }
        }

        public <A, R> R collect(Collector<? super O, A, R> collector) {
            Object collect;
            makeTerminated();
            collect = stream().collect(collector);
            return (R) collect;
        }

        public <A, R> R collect(Supplier<R> supplier, BiConsumer<R, ? super O> biConsumer, BiConsumer<R, R> biConsumer2) {
            Object collect;
            makeTerminated();
            collect = stream().collect(supplier, biConsumer, biConsumer2);
            return (R) collect;
        }

        public FailableStream<O> filter(FailablePredicate<O, ?> failablePredicate) {
            Stream<O> filter;
            assertNotTerminated();
            filter = this.stream.filter(Failable.asPredicate(failablePredicate));
            this.stream = filter;
            return this;
        }

        public void forEach(FailableConsumer<O, ?> failableConsumer) {
            makeTerminated();
            stream().forEach(Failable.asConsumer(failableConsumer));
        }

        protected void makeTerminated() {
            assertNotTerminated();
            this.terminated = true;
        }

        public <R> FailableStream<R> map(FailableFunction<O, R, ?> failableFunction) {
            Stream map;
            assertNotTerminated();
            map = this.stream.map(Failable.asFunction(failableFunction));
            return new FailableStream<>(map);
        }

        public O reduce(O o, BinaryOperator<O> binaryOperator) {
            Object reduce;
            makeTerminated();
            reduce = stream().reduce(o, binaryOperator);
            return (O) reduce;
        }

        public Stream<O> stream() {
            return this.stream;
        }
    }

    public static <O> FailableStream<O> stream(Collection<O> collection) {
        Stream stream;
        stream = collection.stream();
        return stream(stream);
    }

    public static <O> FailableStream<O> stream(Stream<O> stream) {
        return new FailableStream<>(stream);
    }

    public static <O> Collector<O, ?, O[]> toArray(Class<O> cls) {
        return new ArrayCollector(cls);
    }
}
