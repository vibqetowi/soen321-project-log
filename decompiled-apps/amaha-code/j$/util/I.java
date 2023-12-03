package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* loaded from: classes3.dex */
public interface I extends O {
    @Override // j$.util.S
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(IntConsumer intConsumer);

    @Override // j$.util.S
    boolean tryAdvance(Consumer consumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // j$.util.O, j$.util.S
    I trySplit();
}
