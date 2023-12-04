package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.apache.commons.lang3.function.FailableToIntFunction;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableToIntFunction<T, E extends Throwable> {
    public static final FailableToIntFunction NOP = new FailableToIntFunction() { // from class: org.apache.commons.lang3.function.FailableToIntFunction$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableToIntFunction
        public final int applyAsInt(Object obj) {
            return FailableToIntFunction.CC.lambda$static$0(obj);
        }
    };

    int applyAsInt(T t) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableToIntFunction$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableToIntFunction failableToIntFunction = FailableToIntFunction.NOP;
        }

        public static /* synthetic */ int lambda$static$0(Object obj) throws Throwable {
            return 0;
        }

        public static <T, E extends Throwable> FailableToIntFunction<T, E> nop() {
            return FailableToIntFunction.NOP;
        }
    }
}
