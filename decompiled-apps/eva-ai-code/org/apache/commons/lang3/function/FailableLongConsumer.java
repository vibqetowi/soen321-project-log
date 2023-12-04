package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;
import org.apache.commons.lang3.function.FailableLongConsumer;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableLongConsumer<E extends Throwable> {
    public static final FailableLongConsumer NOP = new FailableLongConsumer() { // from class: org.apache.commons.lang3.function.FailableLongConsumer$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableLongConsumer
        public final void accept(long j) {
            FailableLongConsumer.CC.lambda$static$0(j);
        }

        @Override // org.apache.commons.lang3.function.FailableLongConsumer
        public /* synthetic */ FailableLongConsumer andThen(FailableLongConsumer failableLongConsumer) {
            return Objects.requireNonNull(failableLongConsumer);
        }
    };

    void accept(long j) throws Throwable;

    FailableLongConsumer<E> andThen(FailableLongConsumer<E> failableLongConsumer);

    /* renamed from: org.apache.commons.lang3.function.FailableLongConsumer$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableLongConsumer failableLongConsumer = FailableLongConsumer.NOP;
        }

        public static /* synthetic */ void lambda$static$0(long j) throws Throwable {
        }

        public static <E extends Throwable> FailableLongConsumer<E> nop() {
            return FailableLongConsumer.NOP;
        }

        public static /* synthetic */ void $private$lambda$andThen$1(FailableLongConsumer _this, FailableLongConsumer failableLongConsumer, long j) throws Throwable {
            _this.accept(j);
            failableLongConsumer.accept(j);
        }
    }
}
