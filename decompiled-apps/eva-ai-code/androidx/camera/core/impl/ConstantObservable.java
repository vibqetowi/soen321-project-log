package androidx.camera.core.impl;

import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ConstantObservable<T> implements Observable<T> {
    private static final ConstantObservable<Object> NULL_OBSERVABLE = new ConstantObservable<>(null);
    private static final String TAG = "ConstantObservable";
    private final ListenableFuture<T> mValueFuture;

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(Observable.Observer<? super T> observer) {
    }

    public static <U> Observable<U> withValue(U u) {
        if (u == null) {
            return NULL_OBSERVABLE;
        }
        return new ConstantObservable(u);
    }

    private ConstantObservable(T t) {
        this.mValueFuture = Futures.immediateFuture(t);
    }

    @Override // androidx.camera.core.impl.Observable
    public ListenableFuture<T> fetchData() {
        return this.mValueFuture;
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(Executor executor, final Observable.Observer<? super T> observer) {
        this.mValueFuture.addListener(new Runnable() { // from class: androidx.camera.core.impl.ConstantObservable$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ConstantObservable.this.m181x573c7728(observer);
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$addObserver$0$androidx-camera-core-impl-ConstantObservable  reason: not valid java name */
    public /* synthetic */ void m181x573c7728(Observable.Observer observer) {
        try {
            observer.onNewData(this.mValueFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            observer.onError(e);
        }
    }
}
