package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.apache.commons.lang3.function.FailableIntToLongFunction;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableIntToLongFunction<E extends Throwable> {
    public static final FailableIntToLongFunction NOP = new FailableIntToLongFunction() { // from class: org.apache.commons.lang3.function.FailableIntToLongFunction$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableIntToLongFunction
        public final long applyAsLong(int i) {
            return FailableIntToLongFunction.CC.lambda$static$0(i);
        }
    };

    long applyAsLong(int i) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableIntToLongFunction$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableIntToLongFunction failableIntToLongFunction = FailableIntToLongFunction.NOP;
        }

        public static /* synthetic */ long lambda$static$0(int i) throws Throwable {
            return 0L;
        }

        public static <E extends Throwable> FailableIntToLongFunction<E> nop() {
            return FailableIntToLongFunction.NOP;
        }
    }
}
