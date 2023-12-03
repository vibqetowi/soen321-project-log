package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* loaded from: classes3.dex */
public interface F extends O {
    @Override // j$.util.S
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(DoubleConsumer doubleConsumer);

    @Override // j$.util.S
    boolean tryAdvance(Consumer consumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // j$.util.O, j$.util.S
    F trySplit();
}
