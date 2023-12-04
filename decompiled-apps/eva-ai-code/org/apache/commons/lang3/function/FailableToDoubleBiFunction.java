package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.apache.commons.lang3.function.FailableToDoubleBiFunction;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableToDoubleBiFunction<T, U, E extends Throwable> {
    public static final FailableToDoubleBiFunction NOP = new FailableToDoubleBiFunction() { // from class: org.apache.commons.lang3.function.FailableToDoubleBiFunction$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableToDoubleBiFunction
        public final double applyAsDouble(Object obj, Object obj2) {
            return FailableToDoubleBiFunction.CC.lambda$static$0(obj, obj2);
        }
    };

    double applyAsDouble(T t, U u) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableToDoubleBiFunction$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableToDoubleBiFunction failableToDoubleBiFunction = FailableToDoubleBiFunction.NOP;
        }

        public static /* synthetic */ double lambda$static$0(Object obj, Object obj2) throws Throwable {
            return 0.0d;
        }

        public static <T, U, E extends Throwable> FailableToDoubleBiFunction<T, U, E> nop() {
            return FailableToDoubleBiFunction.NOP;
        }
    }
}
