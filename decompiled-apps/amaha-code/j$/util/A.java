package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* loaded from: classes3.dex */
public interface A extends B {
    @Override // java.util.Iterator
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(LongConsumer longConsumer);

    @Override // java.util.Iterator
    Long next();

    long nextLong();
}
