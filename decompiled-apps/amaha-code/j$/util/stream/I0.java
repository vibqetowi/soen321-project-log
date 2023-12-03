package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public interface I0 {
    I0 a(int i6);

    long count();

    void forEach(Consumer consumer);

    I0 i(long j10, long j11, IntFunction intFunction);

    void j(Object[] objArr, int i6);

    Object[] k(IntFunction intFunction);

    int n();

    j$.util.S spliterator();
}
