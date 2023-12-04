package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.apache.commons.lang3.function.FailableToIntBiFunction;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableToIntBiFunction<T, U, E extends Throwable> {
    public static final FailableToIntBiFunction NOP = new FailableToIntBiFunction() { // from class: org.apache.commons.lang3.function.FailableToIntBiFunction$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableToIntBiFunction
        public final int applyAsInt(Object obj, Object obj2) {
            return FailableToIntBiFunction.CC.lambda$static$0(obj, obj2);
        }
    };

    int applyAsInt(T t, U u) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableToIntBiFunction$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableToIntBiFunction failableToIntBiFunction = FailableToIntBiFunction.NOP;
        }

        public static /* synthetic */ int lambda$static$0(Object obj, Object obj2) throws Throwable {
            return 0;
        }

        public static <T, U, E extends Throwable> FailableToIntBiFunction<T, U, E> nop() {
            return FailableToIntBiFunction.NOP;
        }
    }
}
