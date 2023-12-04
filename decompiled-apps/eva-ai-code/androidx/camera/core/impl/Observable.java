package androidx.camera.core.impl;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public interface Observable<T> {

    /* loaded from: classes.dex */
    public interface Observer<T> {
        void onError(Throwable th);

        void onNewData(T t);
    }

    void addObserver(Executor executor, Observer<? super T> observer);

    ListenableFuture<T> fetchData();

    void removeObserver(Observer<? super T> observer);
}
