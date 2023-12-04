package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;
import org.apache.commons.lang3.function.FailableDoubleConsumer;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableDoubleConsumer<E extends Throwable> {
    public static final FailableDoubleConsumer NOP = new FailableDoubleConsumer() { // from class: org.apache.commons.lang3.function.FailableDoubleConsumer$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableDoubleConsumer
        public final void accept(double d) {
            FailableDoubleConsumer.CC.lambda$static$0(d);
        }

        @Override // org.apache.commons.lang3.function.FailableDoubleConsumer
        public /* synthetic */ FailableDoubleConsumer andThen(FailableDoubleConsumer failableDoubleConsumer) {
            return Objects.requireNonNull(failableDoubleConsumer);
        }
    };

    void accept(double d) throws Throwable;

    FailableDoubleConsumer<E> andThen(FailableDoubleConsumer<E> failableDoubleConsumer);

    /* renamed from: org.apache.commons.lang3.function.FailableDoubleConsumer$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableDoubleConsumer failableDoubleConsumer = FailableDoubleConsumer.NOP;
        }

        public static /* synthetic */ void lambda$static$0(double d) throws Throwable {
        }

        public static <E extends Throwable> FailableDoubleConsumer<E> nop() {
            return FailableDoubleConsumer.NOP;
        }

        public static /* synthetic */ void $private$lambda$andThen$1(FailableDoubleConsumer _this, FailableDoubleConsumer failableDoubleConsumer, double d) throws Throwable {
            _this.accept(d);
            failableDoubleConsumer.accept(d);
        }
    }
}
