package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.apache.commons.lang3.function.FailableLongToDoubleFunction;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableLongToDoubleFunction<E extends Throwable> {
    public static final FailableLongToDoubleFunction NOP = new FailableLongToDoubleFunction() { // from class: org.apache.commons.lang3.function.FailableLongToDoubleFunction$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableLongToDoubleFunction
        public final double applyAsDouble(long j) {
            return FailableLongToDoubleFunction.CC.lambda$static$0(j);
        }
    };

    double applyAsDouble(long j) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableLongToDoubleFunction$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableLongToDoubleFunction failableLongToDoubleFunction = FailableLongToDoubleFunction.NOP;
        }

        public static /* synthetic */ double lambda$static$0(long j) throws Throwable {
            return 0.0d;
        }

        public static <E extends Throwable> FailableLongToDoubleFunction<E> nop() {
            return FailableLongToDoubleFunction.NOP;
        }
    }
}
