package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;
import org.apache.commons.lang3.function.FailableIntConsumer;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableIntConsumer<E extends Throwable> {
    public static final FailableIntConsumer NOP = new FailableIntConsumer() { // from class: org.apache.commons.lang3.function.FailableIntConsumer$$ExternalSyntheticLambda1
        @Override // org.apache.commons.lang3.function.FailableIntConsumer
        public final void accept(int i) {
            FailableIntConsumer.CC.lambda$static$0(i);
        }

        @Override // org.apache.commons.lang3.function.FailableIntConsumer
        public /* synthetic */ FailableIntConsumer andThen(FailableIntConsumer failableIntConsumer) {
            return Objects.requireNonNull(failableIntConsumer);
        }
    };

    void accept(int i) throws Throwable;

    FailableIntConsumer<E> andThen(FailableIntConsumer<E> failableIntConsumer);

    /* renamed from: org.apache.commons.lang3.function.FailableIntConsumer$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableIntConsumer failableIntConsumer = FailableIntConsumer.NOP;
        }

        public static /* synthetic */ void lambda$static$0(int i) throws Throwable {
        }

        public static <E extends Throwable> FailableIntConsumer<E> nop() {
            return FailableIntConsumer.NOP;
        }

        public static /* synthetic */ void $private$lambda$andThen$1(FailableIntConsumer _this, FailableIntConsumer failableIntConsumer, int i) throws Throwable {
            _this.accept(i);
            failableIntConsumer.accept(i);
        }
    }
}
