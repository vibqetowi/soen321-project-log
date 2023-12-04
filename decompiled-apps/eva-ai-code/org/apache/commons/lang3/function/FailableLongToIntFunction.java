package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.apache.commons.lang3.function.FailableLongToIntFunction;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableLongToIntFunction<E extends Throwable> {
    public static final FailableLongToIntFunction NOP = new FailableLongToIntFunction() { // from class: org.apache.commons.lang3.function.FailableLongToIntFunction$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableLongToIntFunction
        public final int applyAsInt(long j) {
            return FailableLongToIntFunction.CC.lambda$static$0(j);
        }
    };

    int applyAsInt(long j) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableLongToIntFunction$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableLongToIntFunction failableLongToIntFunction = FailableLongToIntFunction.NOP;
        }

        public static /* synthetic */ int lambda$static$0(long j) throws Throwable {
            return 0;
        }

        public static <E extends Throwable> FailableLongToIntFunction<E> nop() {
            return FailableLongToIntFunction.NOP;
        }
    }
}
