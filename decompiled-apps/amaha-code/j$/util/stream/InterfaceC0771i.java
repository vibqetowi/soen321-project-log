package j$.util.stream;

import java.util.Iterator;
/* renamed from: j$.util.stream.i  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0771i extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    Iterator iterator();

    InterfaceC0771i onClose(Runnable runnable);

    InterfaceC0771i parallel();

    InterfaceC0771i sequential();

    j$.util.S spliterator();

    InterfaceC0771i unordered();
}
