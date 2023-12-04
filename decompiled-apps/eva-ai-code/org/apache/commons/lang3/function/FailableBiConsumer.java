package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;
import org.apache.commons.lang3.function.FailableBiConsumer;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableBiConsumer<T, U, E extends Throwable> {
    public static final FailableBiConsumer NOP = new FailableBiConsumer() { // from class: org.apache.commons.lang3.function.FailableBiConsumer$$ExternalSyntheticLambda1
        @Override // org.apache.commons.lang3.function.FailableBiConsumer
        public final void accept(Object obj, Object obj2) {
            FailableBiConsumer.CC.lambda$static$0(obj, obj2);
        }

        @Override // org.apache.commons.lang3.function.FailableBiConsumer
        public /* synthetic */ FailableBiConsumer andThen(FailableBiConsumer failableBiConsumer) {
            return Objects.requireNonNull(failableBiConsumer);
        }
    };

    void accept(T t, U u) throws Throwable;

    FailableBiConsumer<T, U, E> andThen(FailableBiConsumer<? super T, ? super U, E> failableBiConsumer);

    /* renamed from: org.apache.commons.lang3.function.FailableBiConsumer$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableBiConsumer failableBiConsumer = FailableBiConsumer.NOP;
        }

        public static /* synthetic */ void lambda$static$0(Object obj, Object obj2) throws Throwable {
        }

        public static <T, U, E extends Throwable> FailableBiConsumer<T, U, E> nop() {
            return FailableBiConsumer.NOP;
        }

        public static /* synthetic */ void $private$lambda$andThen$1(FailableBiConsumer _this, FailableBiConsumer failableBiConsumer, Object obj, Object obj2) throws Throwable {
            _this.accept(obj, obj2);
            failableBiConsumer.accept(obj, obj2);
        }
    }
}
