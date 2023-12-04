package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.apache.commons.lang3.function.FailableDoubleToIntFunction;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableDoubleToIntFunction<E extends Throwable> {
    public static final FailableDoubleToIntFunction NOP = new FailableDoubleToIntFunction() { // from class: org.apache.commons.lang3.function.FailableDoubleToIntFunction$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableDoubleToIntFunction
        public final int applyAsInt(double d) {
            return FailableDoubleToIntFunction.CC.lambda$static$0(d);
        }
    };

    int applyAsInt(double d) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableDoubleToIntFunction$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableDoubleToIntFunction failableDoubleToIntFunction = FailableDoubleToIntFunction.NOP;
        }

        public static /* synthetic */ int lambda$static$0(double d) throws Throwable {
            return 0;
        }

        public static <E extends Throwable> FailableDoubleToIntFunction<E> nop() {
            return FailableDoubleToIntFunction.NOP;
        }
    }
}
