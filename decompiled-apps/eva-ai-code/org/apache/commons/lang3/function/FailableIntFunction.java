package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.apache.commons.lang3.function.FailableIntFunction;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableIntFunction<R, E extends Throwable> {
    public static final FailableIntFunction NOP = new FailableIntFunction() { // from class: org.apache.commons.lang3.function.FailableIntFunction$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableIntFunction
        public final Object apply(int i) {
            return FailableIntFunction.CC.lambda$static$0(i);
        }
    };

    R apply(int i) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableIntFunction$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableIntFunction failableIntFunction = FailableIntFunction.NOP;
        }

        public static /* synthetic */ Object lambda$static$0(int i) throws Throwable {
            return null;
        }

        public static <R, E extends Throwable> FailableIntFunction<R, E> nop() {
            return FailableIntFunction.NOP;
        }
    }
}
