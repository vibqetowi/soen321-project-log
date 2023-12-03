package com.google.firebase.storage;

import android.app.Activity;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.StorageTask.ProvideError;
import com.google.firebase.storage.internal.ActivityLifecycleListener;
import com.google.firebase.storage.internal.SmartHandler;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import v9.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TaskListenerImpl<ListenerTypeT, ResultT extends StorageTask.ProvideError> {
    private OnRaise<ListenerTypeT, ResultT> onRaise;
    private int targetStates;
    private StorageTask<ResultT> task;
    private final Queue<ListenerTypeT> listenerQueue = new ConcurrentLinkedQueue();
    private final HashMap<ListenerTypeT, SmartHandler> handlerMap = new HashMap<>();

    /* loaded from: classes.dex */
    public interface OnRaise<ListenerTypeT, ResultT> {
        void raise(ListenerTypeT listenertypet, ResultT resultt);
    }

    public TaskListenerImpl(StorageTask<ResultT> storageTask, int i6, OnRaise<ListenerTypeT, ResultT> onRaise) {
        this.task = storageTask;
        this.targetStates = i6;
        this.onRaise = onRaise;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addListener$1(Object obj, StorageTask.ProvideError provideError) {
        this.onRaise.raise(obj, provideError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInternalStateChanged$2(Object obj, StorageTask.ProvideError provideError) {
        this.onRaise.raise(obj, provideError);
    }

    public void addListener(Activity activity, Executor executor, final ListenerTypeT listenertypet) {
        boolean z10;
        SmartHandler smartHandler;
        o.h(listenertypet);
        synchronized (this.task.getSyncObject()) {
            try {
                if ((this.task.getInternalState() & this.targetStates) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.listenerQueue.add(listenertypet);
                smartHandler = new SmartHandler(executor);
                this.handlerMap.put(listenertypet, smartHandler);
                if (activity != null) {
                    o.a("Activity is already destroyed!", !activity.isDestroyed());
                    ActivityLifecycleListener.getInstance().runOnActivityStopped(activity, listenertypet, new Runnable() { // from class: com.google.firebase.storage.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            TaskListenerImpl.this.lambda$addListener$0(listenertypet);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            smartHandler.callBack(new j(this, listenertypet, this.task.snapState(), 1));
        }
    }

    public int getListenerCount() {
        return Math.max(this.listenerQueue.size(), this.handlerMap.size());
    }

    public void onInternalStateChanged() {
        if ((this.task.getInternalState() & this.targetStates) != 0) {
            ResultT snapState = this.task.snapState();
            for (ListenerTypeT listenertypet : this.listenerQueue) {
                SmartHandler smartHandler = this.handlerMap.get(listenertypet);
                if (smartHandler != null) {
                    smartHandler.callBack(new j(this, listenertypet, snapState, 0));
                }
            }
        }
    }

    /* renamed from: removeListener */
    public void lambda$addListener$0(ListenerTypeT listenertypet) {
        o.h(listenertypet);
        synchronized (this.task.getSyncObject()) {
            this.handlerMap.remove(listenertypet);
            this.listenerQueue.remove(listenertypet);
            ActivityLifecycleListener.getInstance().removeCookie(listenertypet);
        }
    }
}
