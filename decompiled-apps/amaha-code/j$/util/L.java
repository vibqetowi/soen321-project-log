package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* loaded from: classes3.dex */
public interface L extends O {
    @Override // j$.util.S
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(LongConsumer longConsumer);

    @Override // j$.util.S
    boolean tryAdvance(Consumer consumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // j$.util.O, j$.util.S
    L trySplit();
}
