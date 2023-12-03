package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* renamed from: j$.util.w  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0856w extends B {
    @Override // java.util.Iterator, j$.util.Iterator
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(IntConsumer intConsumer);

    @Override // java.util.Iterator, j$.util.Iterator
    Integer next();

    int nextInt();
}
