package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;
import org.apache.commons.lang3.function.FailableBiFunction;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableBiFunction<T, U, R, E extends Throwable> {
    public static final FailableBiFunction NOP = new FailableBiFunction() { // from class: org.apache.commons.lang3.function.FailableBiFunction$$ExternalSyntheticLambda1
        @Override // org.apache.commons.lang3.function.FailableBiFunction
        public /* synthetic */ FailableBiFunction andThen(FailableFunction failableFunction) {
            return Objects.requireNonNull(failableFunction);
        }

        @Override // org.apache.commons.lang3.function.FailableBiFunction
        public final Object apply(Object obj, Object obj2) {
            return FailableBiFunction.CC.lambda$static$0(obj, obj2);
        }
    };

    <V> FailableBiFunction<T, U, V, E> andThen(FailableFunction<? super R, ? extends V, E> failableFunction);

    R apply(T t, U u) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableBiFunction$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableBiFunction failableBiFunction = FailableBiFunction.NOP;
        }

        public static /* synthetic */ Object lambda$static$0(Object obj, Object obj2) throws Throwable {
            return null;
        }

        public static <T, U, R, E extends Throwable> FailableBiFunction<T, U, R, E> nop() {
            return FailableBiFunction.NOP;
        }
    }
}
