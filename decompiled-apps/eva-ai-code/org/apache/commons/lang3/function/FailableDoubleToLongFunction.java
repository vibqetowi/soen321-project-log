package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.apache.commons.lang3.function.FailableDoubleToLongFunction;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableDoubleToLongFunction<E extends Throwable> {
    public static final FailableDoubleToLongFunction NOP = new FailableDoubleToLongFunction() { // from class: org.apache.commons.lang3.function.FailableDoubleToLongFunction$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableDoubleToLongFunction
        public final int applyAsLong(double d) {
            return FailableDoubleToLongFunction.CC.lambda$static$0(d);
        }
    };

    int applyAsLong(double d) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableDoubleToLongFunction$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableDoubleToLongFunction failableDoubleToLongFunction = FailableDoubleToLongFunction.NOP;
        }

        public static /* synthetic */ int lambda$static$0(double d) throws Throwable {
            return 0;
        }

        public static <E extends Throwable> FailableDoubleToLongFunction<E> nop() {
            return FailableDoubleToLongFunction.NOP;
        }
    }
}
