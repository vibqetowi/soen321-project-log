package j$.util;

import java.util.function.Consumer;
/* loaded from: classes3.dex */
public interface S {
    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer consumer);

    java.util.Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i6);

    boolean tryAdvance(Consumer consumer);

    S trySplit();
}
