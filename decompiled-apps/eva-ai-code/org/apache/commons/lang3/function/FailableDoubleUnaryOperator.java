package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;
import org.apache.commons.lang3.function.FailableDoubleUnaryOperator;
/* loaded from: classes5.dex */
public interface FailableDoubleUnaryOperator<E extends Throwable> {
    public static final FailableDoubleUnaryOperator NOP = new FailableDoubleUnaryOperator() { // from class: org.apache.commons.lang3.function.FailableDoubleUnaryOperator$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableDoubleUnaryOperator
        public /* synthetic */ FailableDoubleUnaryOperator andThen(FailableDoubleUnaryOperator failableDoubleUnaryOperator) {
            return Objects.requireNonNull(failableDoubleUnaryOperator);
        }

        @Override // org.apache.commons.lang3.function.FailableDoubleUnaryOperator
        public final double applyAsDouble(double d) {
            return FailableDoubleUnaryOperator.CC.lambda$static$0(d);
        }

        @Override // org.apache.commons.lang3.function.FailableDoubleUnaryOperator
        public /* synthetic */ FailableDoubleUnaryOperator compose(FailableDoubleUnaryOperator failableDoubleUnaryOperator) {
            return Objects.requireNonNull(failableDoubleUnaryOperator);
        }
    };

    FailableDoubleUnaryOperator<E> andThen(FailableDoubleUnaryOperator<E> failableDoubleUnaryOperator);

    double applyAsDouble(double d) throws Throwable;

    FailableDoubleUnaryOperator<E> compose(FailableDoubleUnaryOperator<E> failableDoubleUnaryOperator);

    /* renamed from: org.apache.commons.lang3.function.FailableDoubleUnaryOperator$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableDoubleUnaryOperator failableDoubleUnaryOperator = FailableDoubleUnaryOperator.NOP;
        }

        public static /* synthetic */ double lambda$identity$1(double d) throws Throwable {
            return d;
        }

        public static /* synthetic */ double lambda$static$0(double d) throws Throwable {
            return 0.0d;
        }

        public static <E extends Throwable> FailableDoubleUnaryOperator<E> identity() {
            return new FailableDoubleUnaryOperator() { // from class: org.apache.commons.lang3.function.FailableDoubleUnaryOperator$$ExternalSyntheticLambda1
                @Override // org.apache.commons.lang3.function.FailableDoubleUnaryOperator
                public /* synthetic */ FailableDoubleUnaryOperator andThen(FailableDoubleUnaryOperator failableDoubleUnaryOperator) {
                    return Objects.requireNonNull(failableDoubleUnaryOperator);
                }

                @Override // org.apache.commons.lang3.function.FailableDoubleUnaryOperator
                public final double applyAsDouble(double d) {
                    return FailableDoubleUnaryOperator.CC.lambda$identity$1(d);
                }

                @Override // org.apache.commons.lang3.function.FailableDoubleUnaryOperator
                public /* synthetic */ FailableDoubleUnaryOperator compose(FailableDoubleUnaryOperator failableDoubleUnaryOperator) {
                    return Objects.requireNonNull(failableDoubleUnaryOperator);
                }
            };
        }

        public static <E extends Throwable> FailableDoubleUnaryOperator<E> nop() {
            return FailableDoubleUnaryOperator.NOP;
        }
    }
}
