package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.apache.commons.lang3.function.FailableToDoubleFunction;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableToDoubleFunction<T, E extends Throwable> {
    public static final FailableToDoubleFunction NOP = new FailableToDoubleFunction() { // from class: org.apache.commons.lang3.function.FailableToDoubleFunction$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableToDoubleFunction
        public final double applyAsDouble(Object obj) {
            return FailableToDoubleFunction.CC.lambda$static$0(obj);
        }
    };

    double applyAsDouble(T t) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableToDoubleFunction$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableToDoubleFunction failableToDoubleFunction = FailableToDoubleFunction.NOP;
        }

        public static /* synthetic */ double lambda$static$0(Object obj) throws Throwable {
            return 0.0d;
        }

        public static <T, E extends Throwable> FailableToDoubleFunction<T, E> nop() {
            return FailableToDoubleFunction.NOP;
        }
    }
}
