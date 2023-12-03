package rc;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: ListenableFuture.java */
/* loaded from: classes.dex */
public interface b<V> extends Future<V> {
    void d(Runnable runnable, Executor executor);
}
