package org.apache.http.pool;

import java.util.concurrent.Future;
import org.apache.http.concurrent.FutureCallback;
/* loaded from: classes5.dex */
public interface ConnPool<T, E> {
    Future<E> lease(T t, Object obj, FutureCallback<E> futureCallback);

    void release(E e, boolean z);
}
