package com.google.firebase.storage;

import com.google.firebase.storage.StorageTask;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f9853u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TaskListenerImpl f9854v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f9855w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ StorageTask.ProvideError f9856x;

    public /* synthetic */ j(TaskListenerImpl taskListenerImpl, Object obj, StorageTask.ProvideError provideError, int i6) {
        this.f9853u = i6;
        this.f9854v = taskListenerImpl;
        this.f9855w = obj;
        this.f9856x = provideError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f9853u;
        TaskListenerImpl taskListenerImpl = this.f9854v;
        StorageTask.ProvideError provideError = this.f9856x;
        Object obj = this.f9855w;
        switch (i6) {
            case 0:
                taskListenerImpl.lambda$onInternalStateChanged$2(obj, provideError);
                return;
            default:
                taskListenerImpl.lambda$addListener$1(obj, provideError);
                return;
        }
    }
}
