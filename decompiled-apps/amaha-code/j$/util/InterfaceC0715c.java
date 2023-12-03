package j$.util;

import j$.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;
/* renamed from: j$.util.c  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0715c {
    void forEach(Consumer consumer);

    boolean removeIf(Predicate predicate);

    S spliterator();

    Stream stream();
}
