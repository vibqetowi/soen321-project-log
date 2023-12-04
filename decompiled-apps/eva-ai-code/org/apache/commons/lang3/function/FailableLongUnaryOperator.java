package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;
import org.apache.commons.lang3.function.FailableLongUnaryOperator;
/* loaded from: classes5.dex */
public interface FailableLongUnaryOperator<E extends Throwable> {
    public static final FailableLongUnaryOperator NOP = new FailableLongUnaryOperator() { // from class: org.apache.commons.lang3.function.FailableLongUnaryOperator$$ExternalSyntheticLambda3
        @Override // org.apache.commons.lang3.function.FailableLongUnaryOperator
        public /* synthetic */ FailableLongUnaryOperator andThen(FailableLongUnaryOperator failableLongUnaryOperator) {
            return Objects.requireNonNull(failableLongUnaryOperator);
        }

        @Override // org.apache.commons.lang3.function.FailableLongUnaryOperator
        public final long applyAsLong(long j) {
            return FailableLongUnaryOperator.CC.lambda$static$0(j);
        }

        @Override // org.apache.commons.lang3.function.FailableLongUnaryOperator
        public /* synthetic */ FailableLongUnaryOperator compose(FailableLongUnaryOperator failableLongUnaryOperator) {
            return Objects.requireNonNull(failableLongUnaryOperator);
        }
    };

    FailableLongUnaryOperator<E> andThen(FailableLongUnaryOperator<E> failableLongUnaryOperator);

    long applyAsLong(long j) throws Throwable;

    FailableLongUnaryOperator<E> compose(FailableLongUnaryOperator<E> failableLongUnaryOperator);

    /* renamed from: org.apache.commons.lang3.function.FailableLongUnaryOperator$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableLongUnaryOperator failableLongUnaryOperator = FailableLongUnaryOperator.NOP;
        }

        public static /* synthetic */ long lambda$identity$1(long j) throws Throwable {
            return j;
        }

        public static /* synthetic */ long lambda$static$0(long j) throws Throwable {
            return 0L;
        }

        public static <E extends Throwable> FailableLongUnaryOperator<E> identity() {
            return new FailableLongUnaryOperator() { // from class: org.apache.commons.lang3.function.FailableLongUnaryOperator$$ExternalSyntheticLambda2
                @Override // org.apache.commons.lang3.function.FailableLongUnaryOperator
                public /* synthetic */ FailableLongUnaryOperator andThen(FailableLongUnaryOperator failableLongUnaryOperator) {
                    return Objects.requireNonNull(failableLongUnaryOperator);
                }

                @Override // org.apache.commons.lang3.function.FailableLongUnaryOperator
                public final long applyAsLong(long j) {
                    return FailableLongUnaryOperator.CC.lambda$identity$1(j);
                }

                @Override // org.apache.commons.lang3.function.FailableLongUnaryOperator
                public /* synthetic */ FailableLongUnaryOperator compose(FailableLongUnaryOperator failableLongUnaryOperator) {
                    return Objects.requireNonNull(failableLongUnaryOperator);
                }
            };
        }

        public static <E extends Throwable> FailableLongUnaryOperator<E> nop() {
            return FailableLongUnaryOperator.NOP;
        }
    }
}
