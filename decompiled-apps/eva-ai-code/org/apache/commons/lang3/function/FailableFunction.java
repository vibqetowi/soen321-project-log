package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;
import org.apache.commons.lang3.function.FailableFunction;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableFunction<T, R, E extends Throwable> {
    public static final FailableFunction NOP = new FailableFunction() { // from class: org.apache.commons.lang3.function.FailableFunction$$ExternalSyntheticLambda2
        @Override // org.apache.commons.lang3.function.FailableFunction
        public /* synthetic */ FailableFunction andThen(FailableFunction failableFunction) {
            return Objects.requireNonNull(failableFunction);
        }

        @Override // org.apache.commons.lang3.function.FailableFunction
        public final Object apply(Object obj) {
            return FailableFunction.CC.lambda$static$0(obj);
        }

        @Override // org.apache.commons.lang3.function.FailableFunction
        public /* synthetic */ FailableFunction compose(FailableFunction failableFunction) {
            return Objects.requireNonNull(failableFunction);
        }
    };

    <V> FailableFunction<T, V, E> andThen(FailableFunction<? super R, ? extends V, E> failableFunction);

    R apply(T t) throws Throwable;

    <V> FailableFunction<V, R, E> compose(FailableFunction<? super V, ? extends T, E> failableFunction);

    /* renamed from: org.apache.commons.lang3.function.FailableFunction$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableFunction failableFunction = FailableFunction.NOP;
        }

        public static /* synthetic */ Object lambda$identity$1(Object obj) throws Throwable {
            return obj;
        }

        public static /* synthetic */ Object lambda$static$0(Object obj) throws Throwable {
            return null;
        }

        public static <T, E extends Throwable> FailableFunction<T, T, E> identity() {
            return new FailableFunction() { // from class: org.apache.commons.lang3.function.FailableFunction$$ExternalSyntheticLambda0
                @Override // org.apache.commons.lang3.function.FailableFunction
                public /* synthetic */ FailableFunction andThen(FailableFunction failableFunction) {
                    return Objects.requireNonNull(failableFunction);
                }

                @Override // org.apache.commons.lang3.function.FailableFunction
                public final Object apply(Object obj) {
                    return FailableFunction.CC.lambda$identity$1(obj);
                }

                @Override // org.apache.commons.lang3.function.FailableFunction
                public /* synthetic */ FailableFunction compose(FailableFunction failableFunction) {
                    return Objects.requireNonNull(failableFunction);
                }
            };
        }

        public static <T, R, E extends Throwable> FailableFunction<T, R, E> nop() {
            return FailableFunction.NOP;
        }
    }
}
