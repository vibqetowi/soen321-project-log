package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.apache.commons.lang3.function.FailableLongFunction;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableLongFunction<R, E extends Throwable> {
    public static final FailableLongFunction NOP = new FailableLongFunction() { // from class: org.apache.commons.lang3.function.FailableLongFunction$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableLongFunction
        public final Object apply(long j) {
            return FailableLongFunction.CC.lambda$static$0(j);
        }
    };

    R apply(long j) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableLongFunction$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableLongFunction failableLongFunction = FailableLongFunction.NOP;
        }

        public static /* synthetic */ Object lambda$static$0(long j) throws Throwable {
            return null;
        }

        public static <R, E extends Throwable> FailableLongFunction<R, E> nop() {
            return FailableLongFunction.NOP;
        }
    }
}
