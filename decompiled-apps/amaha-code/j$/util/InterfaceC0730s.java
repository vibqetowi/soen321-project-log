package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* renamed from: j$.util.s  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0730s extends B {
    @Override // java.util.Iterator, j$.util.Iterator
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(DoubleConsumer doubleConsumer);

    @Override // java.util.Iterator, j$.util.Iterator
    Double next();

    double nextDouble();
}
