package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.apache.commons.lang3.function.FailableToLongBiFunction;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableToLongBiFunction<T, U, E extends Throwable> {
    public static final FailableToLongBiFunction NOP = new FailableToLongBiFunction() { // from class: org.apache.commons.lang3.function.FailableToLongBiFunction$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableToLongBiFunction
        public final long applyAsLong(Object obj, Object obj2) {
            return FailableToLongBiFunction.CC.lambda$static$0(obj, obj2);
        }
    };

    long applyAsLong(T t, U u) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableToLongBiFunction$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableToLongBiFunction failableToLongBiFunction = FailableToLongBiFunction.NOP;
        }

        public static /* synthetic */ long lambda$static$0(Object obj, Object obj2) throws Throwable {
            return 0L;
        }

        public static <T, U, E extends Throwable> FailableToLongBiFunction<T, U, E> nop() {
            return FailableToLongBiFunction.NOP;
        }
    }
}
