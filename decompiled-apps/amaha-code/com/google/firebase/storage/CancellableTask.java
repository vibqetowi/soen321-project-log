package com.google.firebase.storage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class CancellableTask<StateT> extends ya.h<StateT> {
    public abstract CancellableTask<StateT> addOnProgressListener(Activity activity, OnProgressListener<? super StateT> onProgressListener);

    public abstract CancellableTask<StateT> addOnProgressListener(OnProgressListener<? super StateT> onProgressListener);

    public abstract CancellableTask<StateT> addOnProgressListener(Executor executor, OnProgressListener<? super StateT> onProgressListener);

    public abstract boolean cancel();

    @Override // ya.h
    public abstract boolean isCanceled();

    public abstract boolean isInProgress();
}
