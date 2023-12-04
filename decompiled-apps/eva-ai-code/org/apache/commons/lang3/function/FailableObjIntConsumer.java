package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.apache.commons.lang3.function.FailableObjIntConsumer;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableObjIntConsumer<T, E extends Throwable> {
    public static final FailableObjIntConsumer NOP = new FailableObjIntConsumer() { // from class: org.apache.commons.lang3.function.FailableObjIntConsumer$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableObjIntConsumer
        public final void accept(Object obj, int i) {
            FailableObjIntConsumer.CC.lambda$static$0(obj, i);
        }
    };

    void accept(T t, int i) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableObjIntConsumer$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableObjIntConsumer failableObjIntConsumer = FailableObjIntConsumer.NOP;
        }

        public static /* synthetic */ void lambda$static$0(Object obj, int i) throws Throwable {
        }

        public static <T, E extends Throwable> FailableObjIntConsumer<T, E> nop() {
            return FailableObjIntConsumer.NOP;
        }
    }
}
