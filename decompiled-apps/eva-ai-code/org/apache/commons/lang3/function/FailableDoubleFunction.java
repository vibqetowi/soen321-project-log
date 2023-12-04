package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.apache.commons.lang3.function.FailableDoubleFunction;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableDoubleFunction<R, E extends Throwable> {
    public static final FailableDoubleFunction NOP = new FailableDoubleFunction() { // from class: org.apache.commons.lang3.function.FailableDoubleFunction$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableDoubleFunction
        public final Object apply(double d) {
            return FailableDoubleFunction.CC.lambda$static$0(d);
        }
    };

    R apply(double d) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableDoubleFunction$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableDoubleFunction failableDoubleFunction = FailableDoubleFunction.NOP;
        }

        public static /* synthetic */ Object lambda$static$0(double d) throws Throwable {
            return null;
        }

        public static <R, E extends Throwable> FailableDoubleFunction<R, E> nop() {
            return FailableDoubleFunction.NOP;
        }
    }
}
