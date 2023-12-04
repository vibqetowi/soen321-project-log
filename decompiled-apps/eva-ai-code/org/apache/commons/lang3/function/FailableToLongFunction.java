package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.apache.commons.lang3.function.FailableToLongFunction;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableToLongFunction<T, E extends Throwable> {
    public static final FailableToLongFunction NOP = new FailableToLongFunction() { // from class: org.apache.commons.lang3.function.FailableToLongFunction$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableToLongFunction
        public final long applyAsLong(Object obj) {
            return FailableToLongFunction.CC.lambda$static$0(obj);
        }
    };

    long applyAsLong(T t) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableToLongFunction$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableToLongFunction failableToLongFunction = FailableToLongFunction.NOP;
        }

        public static /* synthetic */ long lambda$static$0(Object obj) throws Throwable {
            return 0L;
        }

        public static <T, E extends Throwable> FailableToLongFunction<T, E> nop() {
            return FailableToLongFunction.NOP;
        }
    }
}
