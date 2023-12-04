package org.apache.commons.lang3;

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
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.Streams;
@Deprecated
/* loaded from: classes5.dex */
public class Streams {

    @Deprecated
    /* loaded from: classes5.dex */
    public static class FailableStream<O> {
        private Stream<O> stream;
        private boolean terminated;

        public FailableStream(Stream<O> stream) {
            this.stream = stream;
        }

        protected void assertNotTerminated() {
            if (this.terminated) {
                throw new IllegalStateException("This stream is already terminated.");
            }
        }

        protected void makeTerminated() {
            assertNotTerminated();
            this.terminated = true;
        }

        public FailableStream<O> filter(Functions.FailablePredicate<O, ?> failablePredicate) {
            Stream<O> filter;
            assertNotTerminated();
            filter = this.stream.filter(Functions.asPredicate(failablePredicate));
            this.stream = filter;
            return this;
        }

        public void forEach(Functions.FailableConsumer<O, ?> failableConsumer) {
            makeTerminated();
            stream().forEach(Functions.asConsumer(failableConsumer));
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

        public O reduce(O o, BinaryOperator<O> binaryOperator) {
            Object reduce;
            makeTerminated();
            reduce = stream().reduce(o, binaryOperator);
            return (O) reduce;
        }

        public <R> FailableStream<R> map(Functions.FailableFunction<O, R, ?> failableFunction) {
            Stream map;
            assertNotTerminated();
            map = this.stream.map(Functions.asFunction(failableFunction));
            return new FailableStream<>(map);
        }

        public Stream<O> stream() {
            return this.stream;
        }

        public boolean allMatch(Functions.FailablePredicate<O, ?> failablePredicate) {
            boolean allMatch;
            assertNotTerminated();
            allMatch = stream().allMatch(Functions.asPredicate(failablePredicate));
            return allMatch;
        }

        public boolean anyMatch(Functions.FailablePredicate<O, ?> failablePredicate) {
            boolean anyMatch;
            assertNotTerminated();
            anyMatch = stream().anyMatch(Functions.asPredicate(failablePredicate));
            return anyMatch;
        }
    }

    public static <O> FailableStream<O> stream(Stream<O> stream) {
        return new FailableStream<>(stream);
    }

    public static <O> FailableStream<O> stream(Collection<O> collection) {
        Stream stream;
        stream = collection.stream();
        return stream(stream);
    }

    @Deprecated
    /* loaded from: classes5.dex */
    public static class ArrayCollector<O> implements Collector<O, List<O>, O[]> {
        private static final Set<Collector.Characteristics> characteristics = Collections.emptySet();
        private final Class<O> elementType;

        public ArrayCollector(Class<O> cls) {
            this.elementType = cls;
        }

        @Override // java.util.stream.Collector
        public Supplier<List<O>> supplier() {
            return new Streams$ArrayCollector$$ExternalSyntheticLambda0();
        }

        @Override // java.util.stream.Collector
        public BiConsumer<List<O>, O> accumulator() {
            return new Streams$ArrayCollector$$ExternalSyntheticLambda3();
        }

        @Override // java.util.stream.Collector
        public BinaryOperator<List<O>> combiner() {
            return new BinaryOperator() { // from class: org.apache.commons.lang3.Streams$ArrayCollector$$ExternalSyntheticLambda1
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return ((List) obj).addAll((List) obj2);
                }
            };
        }

        @Override // java.util.stream.Collector
        public Function<List<O>, O[]> finisher() {
            return new Function() { // from class: org.apache.commons.lang3.Streams$ArrayCollector$$ExternalSyntheticLambda2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Streams.ArrayCollector.this.m9054xfe0fe9ee((List) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$finisher$1$org-apache-commons-lang3-Streams$ArrayCollector  reason: not valid java name */
        public /* synthetic */ Object[] m9054xfe0fe9ee(List list) {
            return list.toArray((Object[]) Array.newInstance((Class<?>) this.elementType, list.size()));
        }

        @Override // java.util.stream.Collector
        public Set<Collector.Characteristics> characteristics() {
            return characteristics;
        }
    }

    public static <O> Collector<O, ?, O[]> toArray(Class<O> cls) {
        return new ArrayCollector(cls);
    }
}
