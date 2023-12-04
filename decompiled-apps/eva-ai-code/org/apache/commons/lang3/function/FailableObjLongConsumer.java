package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.apache.commons.lang3.function.FailableObjLongConsumer;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableObjLongConsumer<T, E extends Throwable> {
    public static final FailableObjLongConsumer NOP = new FailableObjLongConsumer() { // from class: org.apache.commons.lang3.function.FailableObjLongConsumer$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableObjLongConsumer
        public final void accept(Object obj, long j) {
            FailableObjLongConsumer.CC.lambda$static$0(obj, j);
        }
    };

    void accept(T t, long j) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableObjLongConsumer$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableObjLongConsumer failableObjLongConsumer = FailableObjLongConsumer.NOP;
        }

        public static /* synthetic */ void lambda$static$0(Object obj, long j) throws Throwable {
        }

        public static <T, E extends Throwable> FailableObjLongConsumer<T, E> nop() {
            return FailableObjLongConsumer.NOP;
        }
    }
}
