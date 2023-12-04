package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;
import org.apache.commons.lang3.function.FailableIntUnaryOperator;
/* loaded from: classes5.dex */
public interface FailableIntUnaryOperator<E extends Throwable> {
    public static final FailableIntUnaryOperator NOP = new FailableIntUnaryOperator() { // from class: org.apache.commons.lang3.function.FailableIntUnaryOperator$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableIntUnaryOperator
        public /* synthetic */ FailableIntUnaryOperator andThen(FailableIntUnaryOperator failableIntUnaryOperator) {
            return Objects.requireNonNull(failableIntUnaryOperator);
        }

        @Override // org.apache.commons.lang3.function.FailableIntUnaryOperator
        public final int applyAsInt(int i) {
            return FailableIntUnaryOperator.CC.lambda$static$0(i);
        }

        @Override // org.apache.commons.lang3.function.FailableIntUnaryOperator
        public /* synthetic */ FailableIntUnaryOperator compose(FailableIntUnaryOperator failableIntUnaryOperator) {
            return Objects.requireNonNull(failableIntUnaryOperator);
        }
    };

    FailableIntUnaryOperator<E> andThen(FailableIntUnaryOperator<E> failableIntUnaryOperator);

    int applyAsInt(int i) throws Throwable;

    FailableIntUnaryOperator<E> compose(FailableIntUnaryOperator<E> failableIntUnaryOperator);

    /* renamed from: org.apache.commons.lang3.function.FailableIntUnaryOperator$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableIntUnaryOperator failableIntUnaryOperator = FailableIntUnaryOperator.NOP;
        }

        public static /* synthetic */ int lambda$identity$1(int i) throws Throwable {
            return i;
        }

        public static /* synthetic */ int lambda$static$0(int i) throws Throwable {
            return 0;
        }

        public static <E extends Throwable> FailableIntUnaryOperator<E> identity() {
            return new FailableIntUnaryOperator() { // from class: org.apache.commons.lang3.function.FailableIntUnaryOperator$$ExternalSyntheticLambda1
                @Override // org.apache.commons.lang3.function.FailableIntUnaryOperator
                public /* synthetic */ FailableIntUnaryOperator andThen(FailableIntUnaryOperator failableIntUnaryOperator) {
                    return Objects.requireNonNull(failableIntUnaryOperator);
                }

                @Override // org.apache.commons.lang3.function.FailableIntUnaryOperator
                public final int applyAsInt(int i) {
                    return FailableIntUnaryOperator.CC.lambda$identity$1(i);
                }

                @Override // org.apache.commons.lang3.function.FailableIntUnaryOperator
                public /* synthetic */ FailableIntUnaryOperator compose(FailableIntUnaryOperator failableIntUnaryOperator) {
                    return Objects.requireNonNull(failableIntUnaryOperator);
                }
            };
        }

        public static <E extends Throwable> FailableIntUnaryOperator<E> nop() {
            return FailableIntUnaryOperator.NOP;
        }
    }
}
