package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.apache.commons.lang3.function.FailableObjDoubleConsumer;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableObjDoubleConsumer<T, E extends Throwable> {
    public static final FailableObjDoubleConsumer NOP = new FailableObjDoubleConsumer() { // from class: org.apache.commons.lang3.function.FailableObjDoubleConsumer$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableObjDoubleConsumer
        public final void accept(Object obj, double d) {
            FailableObjDoubleConsumer.CC.lambda$static$0(obj, d);
        }
    };

    void accept(T t, double d) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableObjDoubleConsumer$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableObjDoubleConsumer failableObjDoubleConsumer = FailableObjDoubleConsumer.NOP;
        }

        public static /* synthetic */ void lambda$static$0(Object obj, double d) throws Throwable {
        }

        public static <T, E extends Throwable> FailableObjDoubleConsumer<T, E> nop() {
            return FailableObjDoubleConsumer.NOP;
        }
    }
}
