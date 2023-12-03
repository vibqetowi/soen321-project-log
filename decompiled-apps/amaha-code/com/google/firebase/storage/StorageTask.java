package com.google.firebase.storage;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.StorageTask.ProvideError;
import com.google.firebase.storage.TaskListenerImpl;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import v9.o;
/* loaded from: classes.dex */
public abstract class StorageTask<ResultT extends ProvideError> extends ControllableTask<ResultT> {
    static final int INTERNAL_STATE_CANCELED = 256;
    static final int INTERNAL_STATE_CANCELING = 32;
    static final int INTERNAL_STATE_FAILURE = 64;
    static final int INTERNAL_STATE_IN_PROGRESS = 4;
    static final int INTERNAL_STATE_NOT_STARTED = 1;
    static final int INTERNAL_STATE_PAUSED = 16;
    static final int INTERNAL_STATE_PAUSING = 8;
    static final int INTERNAL_STATE_QUEUED = 2;
    static final int INTERNAL_STATE_SUCCESS = 128;
    static final int STATES_CANCELED = 256;
    static final int STATES_COMPLETE = 448;
    static final int STATES_FAILURE = 64;
    static final int STATES_INPROGRESS = -465;
    static final int STATES_PAUSED = 16;
    static final int STATES_SUCCESS = 128;
    private static final String TAG = "StorageTask";
    private static final HashMap<Integer, HashSet<Integer>> ValidTaskInitiatedStateChanges;
    private static final HashMap<Integer, HashSet<Integer>> ValidUserInitiatedStateChanges;
    private ResultT finalResult;
    protected final Object syncObject = new Object();
    final TaskListenerImpl<ya.f<? super ResultT>, ResultT> successManager = new TaskListenerImpl<>(this, 128, new TaskListenerImpl.OnRaise(this) { // from class: com.google.firebase.storage.g

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StorageTask f9848b;

        {
            this.f9848b = this;
        }

        @Override // com.google.firebase.storage.TaskListenerImpl.OnRaise
        public final void raise(Object obj, Object obj2) {
            int i6 = r2;
            StorageTask storageTask = this.f9848b;
            switch (i6) {
                case 0:
                    storageTask.lambda$new$0((ya.f) obj, (StorageTask.ProvideError) obj2);
                    return;
                case 1:
                    storageTask.lambda$new$1((ya.e) obj, (StorageTask.ProvideError) obj2);
                    return;
                case 2:
                    storageTask.lambda$new$2((ya.d) obj, (StorageTask.ProvideError) obj2);
                    return;
                default:
                    storageTask.lambda$new$3((ya.c) obj, (StorageTask.ProvideError) obj2);
                    return;
            }
        }
    });
    final TaskListenerImpl<ya.e, ResultT> failureManager = new TaskListenerImpl<>(this, 64, new TaskListenerImpl.OnRaise(this) { // from class: com.google.firebase.storage.g

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StorageTask f9848b;

        {
            this.f9848b = this;
        }

        @Override // com.google.firebase.storage.TaskListenerImpl.OnRaise
        public final void raise(Object obj, Object obj2) {
            int i6 = r2;
            StorageTask storageTask = this.f9848b;
            switch (i6) {
                case 0:
                    storageTask.lambda$new$0((ya.f) obj, (StorageTask.ProvideError) obj2);
                    return;
                case 1:
                    storageTask.lambda$new$1((ya.e) obj, (StorageTask.ProvideError) obj2);
                    return;
                case 2:
                    storageTask.lambda$new$2((ya.d) obj, (StorageTask.ProvideError) obj2);
                    return;
                default:
                    storageTask.lambda$new$3((ya.c) obj, (StorageTask.ProvideError) obj2);
                    return;
            }
        }
    });
    final TaskListenerImpl<ya.d<ResultT>, ResultT> completeListener = new TaskListenerImpl<>(this, STATES_COMPLETE, new TaskListenerImpl.OnRaise(this) { // from class: com.google.firebase.storage.g

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StorageTask f9848b;

        {
            this.f9848b = this;
        }

        @Override // com.google.firebase.storage.TaskListenerImpl.OnRaise
        public final void raise(Object obj, Object obj2) {
            int i6 = r2;
            StorageTask storageTask = this.f9848b;
            switch (i6) {
                case 0:
                    storageTask.lambda$new$0((ya.f) obj, (StorageTask.ProvideError) obj2);
                    return;
                case 1:
                    storageTask.lambda$new$1((ya.e) obj, (StorageTask.ProvideError) obj2);
                    return;
                case 2:
                    storageTask.lambda$new$2((ya.d) obj, (StorageTask.ProvideError) obj2);
                    return;
                default:
                    storageTask.lambda$new$3((ya.c) obj, (StorageTask.ProvideError) obj2);
                    return;
            }
        }
    });
    final TaskListenerImpl<ya.c, ResultT> cancelManager = new TaskListenerImpl<>(this, 256, new TaskListenerImpl.OnRaise(this) { // from class: com.google.firebase.storage.g

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StorageTask f9848b;

        {
            this.f9848b = this;
        }

        @Override // com.google.firebase.storage.TaskListenerImpl.OnRaise
        public final void raise(Object obj, Object obj2) {
            int i6 = r2;
            StorageTask storageTask = this.f9848b;
            switch (i6) {
                case 0:
                    storageTask.lambda$new$0((ya.f) obj, (StorageTask.ProvideError) obj2);
                    return;
                case 1:
                    storageTask.lambda$new$1((ya.e) obj, (StorageTask.ProvideError) obj2);
                    return;
                case 2:
                    storageTask.lambda$new$2((ya.d) obj, (StorageTask.ProvideError) obj2);
                    return;
                default:
                    storageTask.lambda$new$3((ya.c) obj, (StorageTask.ProvideError) obj2);
                    return;
            }
        }
    });
    final TaskListenerImpl<OnProgressListener<? super ResultT>, ResultT> progressManager = new TaskListenerImpl<>(this, STATES_INPROGRESS, new TaskListenerImpl.OnRaise() { // from class: com.google.firebase.storage.h
        @Override // com.google.firebase.storage.TaskListenerImpl.OnRaise
        public final void raise(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((OnProgressListener) obj).onProgress((StorageTask.ProvideError) obj2);
                    return;
                default:
                    ((OnPausedListener) obj).onPaused((StorageTask.ProvideError) obj2);
                    return;
            }
        }
    });
    final TaskListenerImpl<OnPausedListener<? super ResultT>, ResultT> pausedManager = new TaskListenerImpl<>(this, 16, new TaskListenerImpl.OnRaise() { // from class: com.google.firebase.storage.h
        @Override // com.google.firebase.storage.TaskListenerImpl.OnRaise
        public final void raise(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((OnProgressListener) obj).onProgress((StorageTask.ProvideError) obj2);
                    return;
                default:
                    ((OnPausedListener) obj).onPaused((StorageTask.ProvideError) obj2);
                    return;
            }
        }
    });
    private volatile int currentState = 1;

    /* loaded from: classes.dex */
    public interface ProvideError {
        Exception getError();
    }

    /* loaded from: classes.dex */
    public class SnapshotBase implements ProvideError {
        private final Exception error;

        public SnapshotBase(Exception exc) {
            if (exc == null) {
                if (StorageTask.this.isCanceled()) {
                    this.error = StorageException.fromErrorStatus(Status.D);
                    return;
                } else if (StorageTask.this.getInternalState() == 64) {
                    this.error = StorageException.fromErrorStatus(Status.B);
                    return;
                } else {
                    this.error = null;
                    return;
                }
            }
            this.error = exc;
        }

        @Override // com.google.firebase.storage.StorageTask.ProvideError
        public Exception getError() {
            return this.error;
        }

        public StorageReference getStorage() {
            return getTask().getStorage();
        }

        public StorageTask<ResultT> getTask() {
            return StorageTask.this;
        }
    }

    static {
        HashMap<Integer, HashSet<Integer>> hashMap = new HashMap<>();
        ValidUserInitiatedStateChanges = hashMap;
        HashMap<Integer, HashSet<Integer>> hashMap2 = new HashMap<>();
        ValidTaskInitiatedStateChanges = hashMap2;
        hashMap.put(1, new HashSet<>(Arrays.asList(16, 256)));
        hashMap.put(2, new HashSet<>(Arrays.asList(8, 32)));
        hashMap.put(4, new HashSet<>(Arrays.asList(8, 32)));
        hashMap.put(16, new HashSet<>(Arrays.asList(2, 256)));
        hashMap.put(64, new HashSet<>(Arrays.asList(2, 256)));
        hashMap2.put(1, new HashSet<>(Arrays.asList(2, 64)));
        hashMap2.put(2, new HashSet<>(Arrays.asList(4, 64, 128)));
        hashMap2.put(4, new HashSet<>(Arrays.asList(4, 64, 128)));
        hashMap2.put(8, new HashSet<>(Arrays.asList(16, 64, 128)));
        hashMap2.put(32, new HashSet<>(Arrays.asList(256, 64, 128)));
    }

    private <ContinuationResultT> ya.h<ContinuationResultT> continueWithImpl(Executor executor, final ya.b<ResultT, ContinuationResultT> bVar) {
        final ya.i iVar = new ya.i();
        this.completeListener.addListener(null, executor, new ya.d() { // from class: com.google.firebase.storage.d
            @Override // ya.d
            public final void a(ya.h hVar) {
                StorageTask.this.lambda$continueWithImpl$4(bVar, iVar, hVar);
            }
        });
        return iVar.f38392a;
    }

    private <ContinuationResultT> ya.h<ContinuationResultT> continueWithTaskImpl(Executor executor, final ya.b<ResultT, ya.h<ContinuationResultT>> bVar) {
        final ya.a aVar = new ya.a();
        final ya.i iVar = new ya.i(aVar.f38391a);
        this.completeListener.addListener(null, executor, new ya.d() { // from class: com.google.firebase.storage.f
            @Override // ya.d
            public final void a(ya.h hVar) {
                StorageTask.this.lambda$continueWithTaskImpl$5(bVar, iVar, aVar, hVar);
            }
        });
        return iVar.f38392a;
    }

    private void ensureFinalState() {
        if (!isComplete() && !isPaused() && getInternalState() != 2 && !tryChangeState(256, false)) {
            tryChangeState(64, false);
        }
    }

    private ResultT getFinalResult() {
        ResultT resultt = this.finalResult;
        if (resultt != null) {
            return resultt;
        }
        if (!isComplete()) {
            return null;
        }
        if (this.finalResult == null) {
            this.finalResult = snapState();
        }
        return this.finalResult;
    }

    private String getStateString(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 4 ? i6 != 8 ? i6 != 16 ? i6 != 32 ? i6 != 64 ? i6 != 128 ? i6 != 256 ? "Unknown Internal State!" : "INTERNAL_STATE_CANCELED" : "INTERNAL_STATE_SUCCESS" : "INTERNAL_STATE_FAILURE" : "INTERNAL_STATE_CANCELING" : "INTERNAL_STATE_PAUSED" : "INTERNAL_STATE_PAUSING" : "INTERNAL_STATE_IN_PROGRESS" : "INTERNAL_STATE_QUEUED" : "INTERNAL_STATE_NOT_STARTED";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$continueWithImpl$4(ya.b bVar, ya.i iVar, ya.h hVar) {
        try {
            Object then = bVar.then(this);
            if (!iVar.f38392a.isComplete()) {
                iVar.b(then);
            }
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                iVar.a((Exception) e10.getCause());
            } else {
                iVar.a(e10);
            }
        } catch (Exception e11) {
            iVar.a(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$continueWithTaskImpl$5(ya.b bVar, ya.i iVar, ya.a aVar, ya.h hVar) {
        try {
            ya.h hVar2 = (ya.h) bVar.then(this);
            if (!iVar.f38392a.isComplete()) {
                if (hVar2 == null) {
                    iVar.a(new NullPointerException("Continuation returned null"));
                    return;
                }
                hVar2.addOnSuccessListener(new a(0, iVar));
                hVar2.addOnFailureListener(new b(0, iVar));
                Objects.requireNonNull(aVar);
                hVar2.addOnCanceledListener(new c(aVar, 0));
            }
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                iVar.a((Exception) e10.getCause());
            } else {
                iVar.a(e10);
            }
        } catch (Exception e11) {
            iVar.a(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getRunnable$7() {
        try {
            run();
        } finally {
            ensureFinalState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ya.f fVar, ProvideError provideError) {
        StorageTaskManager.getInstance().unRegister(this);
        fVar.onSuccess(provideError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(ya.e eVar, ProvideError provideError) {
        StorageTaskManager.getInstance().unRegister(this);
        eVar.onFailure(provideError.getError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(ya.d dVar, ProvideError provideError) {
        StorageTaskManager.getInstance().unRegister(this);
        dVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(ya.c cVar, ProvideError provideError) {
        StorageTaskManager.getInstance().unRegister(this);
        cVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$successTaskImpl$6(ya.g gVar, ya.i iVar, ya.a aVar, ProvideError provideError) {
        try {
            ya.h h10 = gVar.h(provideError);
            Objects.requireNonNull(iVar);
            h10.addOnSuccessListener(new a(1, iVar));
            h10.addOnFailureListener(new b(1, iVar));
            Objects.requireNonNull(aVar);
            h10.addOnCanceledListener(new c(aVar, 1));
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                iVar.a((Exception) e10.getCause());
            } else {
                iVar.a(e10);
            }
        } catch (Exception e11) {
            iVar.a(e11);
        }
    }

    private <ContinuationResultT> ya.h<ContinuationResultT> successTaskImpl(Executor executor, final ya.g<ResultT, ContinuationResultT> gVar) {
        final ya.a aVar = new ya.a();
        final ya.i iVar = new ya.i(aVar.f38391a);
        this.successManager.addListener(null, executor, new ya.f() { // from class: com.google.firebase.storage.i
            @Override // ya.f
            public final void onSuccess(Object obj) {
                StorageTask.lambda$successTaskImpl$6(ya.g.this, iVar, aVar, (StorageTask.ProvideError) obj);
            }
        });
        return iVar.f38392a;
    }

    @Override // com.google.firebase.storage.CancellableTask
    public boolean cancel() {
        return tryChangeState(new int[]{256, 32}, true);
    }

    @Override // ya.h
    public <ContinuationResultT> ya.h<ContinuationResultT> continueWith(ya.b<ResultT, ContinuationResultT> bVar) {
        return continueWithImpl(null, bVar);
    }

    @Override // ya.h
    public <ContinuationResultT> ya.h<ContinuationResultT> continueWithTask(ya.b<ResultT, ya.h<ContinuationResultT>> bVar) {
        return continueWithTaskImpl(null, bVar);
    }

    @Override // ya.h
    public Exception getException() {
        if (getFinalResult() == null) {
            return null;
        }
        return getFinalResult().getError();
    }

    public int getInternalState() {
        return this.currentState;
    }

    public Runnable getRunnable() {
        return new Runnable() { // from class: com.google.firebase.storage.e
            @Override // java.lang.Runnable
            public final void run() {
                StorageTask.this.lambda$getRunnable$7();
            }
        };
    }

    public ResultT getSnapshot() {
        return snapState();
    }

    public abstract StorageReference getStorage();

    public Object getSyncObject() {
        return this.syncObject;
    }

    @Override // com.google.firebase.storage.CancellableTask, ya.h
    public boolean isCanceled() {
        if (getInternalState() == 256) {
            return true;
        }
        return false;
    }

    @Override // ya.h
    public boolean isComplete() {
        if ((getInternalState() & STATES_COMPLETE) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.storage.CancellableTask
    public boolean isInProgress() {
        if ((getInternalState() & STATES_INPROGRESS) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.storage.ControllableTask
    public boolean isPaused() {
        if ((getInternalState() & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // ya.h
    public boolean isSuccessful() {
        if ((getInternalState() & 128) != 0) {
            return true;
        }
        return false;
    }

    @Override // ya.h
    public <ContinuationResultT> ya.h<ContinuationResultT> onSuccessTask(ya.g<ResultT, ContinuationResultT> gVar) {
        return successTaskImpl(null, gVar);
    }

    @Override // com.google.firebase.storage.ControllableTask
    public boolean pause() {
        return tryChangeState(new int[]{16, 8}, true);
    }

    public boolean queue() {
        if (!tryChangeState(2, false)) {
            return false;
        }
        schedule();
        return true;
    }

    public StorageTask<ResultT> removeOnCanceledListener(ya.c cVar) {
        o.h(cVar);
        this.cancelManager.lambda$addListener$0(cVar);
        return this;
    }

    public StorageTask<ResultT> removeOnCompleteListener(ya.d<ResultT> dVar) {
        o.h(dVar);
        this.completeListener.lambda$addListener$0(dVar);
        return this;
    }

    public StorageTask<ResultT> removeOnFailureListener(ya.e eVar) {
        o.h(eVar);
        this.failureManager.lambda$addListener$0(eVar);
        return this;
    }

    public StorageTask<ResultT> removeOnPausedListener(OnPausedListener<? super ResultT> onPausedListener) {
        o.h(onPausedListener);
        this.pausedManager.lambda$addListener$0(onPausedListener);
        return this;
    }

    public StorageTask<ResultT> removeOnProgressListener(OnProgressListener<? super ResultT> onProgressListener) {
        o.h(onProgressListener);
        this.progressManager.lambda$addListener$0(onProgressListener);
        return this;
    }

    public StorageTask<ResultT> removeOnSuccessListener(ya.f<? super ResultT> fVar) {
        o.h(fVar);
        this.successManager.lambda$addListener$0(fVar);
        return this;
    }

    @Override // com.google.firebase.storage.ControllableTask
    public boolean resume() {
        if (tryChangeState(2, true)) {
            resetState();
            schedule();
            return true;
        }
        return false;
    }

    public abstract void run();

    public abstract void schedule();

    public ResultT snapState() {
        ResultT snapStateImpl;
        synchronized (this.syncObject) {
            snapStateImpl = snapStateImpl();
        }
        return snapStateImpl;
    }

    public abstract ResultT snapStateImpl();

    public boolean tryChangeState(int[] iArr, boolean z10) {
        HashMap<Integer, HashSet<Integer>> hashMap = z10 ? ValidUserInitiatedStateChanges : ValidTaskInitiatedStateChanges;
        synchronized (this.syncObject) {
            for (int i6 : iArr) {
                HashSet<Integer> hashSet = hashMap.get(Integer.valueOf(getInternalState()));
                if (hashSet != null && hashSet.contains(Integer.valueOf(i6))) {
                    this.currentState = i6;
                    int i10 = this.currentState;
                    if (i10 == 2) {
                        StorageTaskManager.getInstance().ensureRegistered(this);
                        onQueued();
                    } else if (i10 == 4) {
                        onProgress();
                    } else if (i10 == 16) {
                        onPaused();
                    } else if (i10 == 64) {
                        onFailure();
                    } else if (i10 == 128) {
                        onSuccess();
                    } else if (i10 == 256) {
                        onCanceled();
                    }
                    this.successManager.onInternalStateChanged();
                    this.failureManager.onInternalStateChanged();
                    this.cancelManager.onInternalStateChanged();
                    this.completeListener.onInternalStateChanged();
                    this.pausedManager.onInternalStateChanged();
                    this.progressManager.onInternalStateChanged();
                    if (Log.isLoggable(TAG, 3)) {
                        Log.d(TAG, "changed internal state to: " + getStateString(i6) + " isUser: " + z10 + " from state:" + getStateString(this.currentState));
                    }
                    return true;
                }
            }
            Log.w(TAG, "unable to change internal state to: " + getStateString(iArr) + " isUser: " + z10 + " from state:" + getStateString(this.currentState));
            return false;
        }
    }

    private String getStateString(int[] iArr) {
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i6 : iArr) {
            sb2.append(getStateString(i6));
            sb2.append(", ");
        }
        return sb2.substring(0, sb2.length() - 2);
    }

    @Override // ya.h
    public <ContinuationResultT> ya.h<ContinuationResultT> continueWith(Executor executor, ya.b<ResultT, ContinuationResultT> bVar) {
        return continueWithImpl(executor, bVar);
    }

    @Override // ya.h
    public <ContinuationResultT> ya.h<ContinuationResultT> continueWithTask(Executor executor, ya.b<ResultT, ya.h<ContinuationResultT>> bVar) {
        return continueWithTaskImpl(executor, bVar);
    }

    @Override // ya.h
    public <ContinuationResultT> ya.h<ContinuationResultT> onSuccessTask(Executor executor, ya.g<ResultT, ContinuationResultT> gVar) {
        return successTaskImpl(executor, gVar);
    }

    @Override // ya.h
    public ResultT getResult() {
        if (getFinalResult() != null) {
            Exception error = getFinalResult().getError();
            if (error == null) {
                return getFinalResult();
            }
            throw new RuntimeExecutionException(error);
        }
        throw new IllegalStateException();
    }

    @Override // ya.h
    public StorageTask<ResultT> addOnCanceledListener(ya.c cVar) {
        o.h(cVar);
        this.cancelManager.addListener(null, null, cVar);
        return this;
    }

    @Override // ya.h
    public StorageTask<ResultT> addOnCompleteListener(ya.d<ResultT> dVar) {
        o.h(dVar);
        this.completeListener.addListener(null, null, dVar);
        return this;
    }

    @Override // ya.h
    public StorageTask<ResultT> addOnFailureListener(ya.e eVar) {
        o.h(eVar);
        this.failureManager.addListener(null, null, eVar);
        return this;
    }

    @Override // com.google.firebase.storage.ControllableTask
    public StorageTask<ResultT> addOnPausedListener(OnPausedListener<? super ResultT> onPausedListener) {
        o.h(onPausedListener);
        this.pausedManager.addListener(null, null, onPausedListener);
        return this;
    }

    @Override // com.google.firebase.storage.CancellableTask
    public StorageTask<ResultT> addOnProgressListener(OnProgressListener<? super ResultT> onProgressListener) {
        o.h(onProgressListener);
        this.progressManager.addListener(null, null, onProgressListener);
        return this;
    }

    @Override // ya.h
    public StorageTask<ResultT> addOnSuccessListener(ya.f<? super ResultT> fVar) {
        o.h(fVar);
        this.successManager.addListener(null, null, fVar);
        return this;
    }

    @Override // ya.h
    public StorageTask<ResultT> addOnCanceledListener(Executor executor, ya.c cVar) {
        o.h(cVar);
        o.h(executor);
        this.cancelManager.addListener(null, executor, cVar);
        return this;
    }

    @Override // ya.h
    public StorageTask<ResultT> addOnCompleteListener(Executor executor, ya.d<ResultT> dVar) {
        o.h(dVar);
        o.h(executor);
        this.completeListener.addListener(null, executor, dVar);
        return this;
    }

    @Override // ya.h
    public StorageTask<ResultT> addOnFailureListener(Executor executor, ya.e eVar) {
        o.h(eVar);
        o.h(executor);
        this.failureManager.addListener(null, executor, eVar);
        return this;
    }

    @Override // com.google.firebase.storage.ControllableTask
    public StorageTask<ResultT> addOnPausedListener(Executor executor, OnPausedListener<? super ResultT> onPausedListener) {
        o.h(onPausedListener);
        o.h(executor);
        this.pausedManager.addListener(null, executor, onPausedListener);
        return this;
    }

    @Override // com.google.firebase.storage.CancellableTask
    public StorageTask<ResultT> addOnProgressListener(Executor executor, OnProgressListener<? super ResultT> onProgressListener) {
        o.h(onProgressListener);
        o.h(executor);
        this.progressManager.addListener(null, executor, onProgressListener);
        return this;
    }

    @Override // ya.h
    public StorageTask<ResultT> addOnSuccessListener(Executor executor, ya.f<? super ResultT> fVar) {
        o.h(executor);
        o.h(fVar);
        this.successManager.addListener(null, executor, fVar);
        return this;
    }

    @Override // ya.h
    public <X extends Throwable> ResultT getResult(Class<X> cls) {
        if (getFinalResult() != null) {
            if (!cls.isInstance(getFinalResult().getError())) {
                Exception error = getFinalResult().getError();
                if (error == null) {
                    return getFinalResult();
                }
                throw new RuntimeExecutionException(error);
            }
            throw cls.cast(getFinalResult().getError());
        }
        throw new IllegalStateException();
    }

    @Override // ya.h
    public StorageTask<ResultT> addOnCanceledListener(Activity activity, ya.c cVar) {
        o.h(cVar);
        o.h(activity);
        this.cancelManager.addListener(activity, null, cVar);
        return this;
    }

    @Override // ya.h
    public StorageTask<ResultT> addOnCompleteListener(Activity activity, ya.d<ResultT> dVar) {
        o.h(dVar);
        o.h(activity);
        this.completeListener.addListener(activity, null, dVar);
        return this;
    }

    @Override // ya.h
    public StorageTask<ResultT> addOnFailureListener(Activity activity, ya.e eVar) {
        o.h(eVar);
        o.h(activity);
        this.failureManager.addListener(activity, null, eVar);
        return this;
    }

    @Override // com.google.firebase.storage.ControllableTask
    public StorageTask<ResultT> addOnPausedListener(Activity activity, OnPausedListener<? super ResultT> onPausedListener) {
        o.h(onPausedListener);
        o.h(activity);
        this.pausedManager.addListener(activity, null, onPausedListener);
        return this;
    }

    @Override // com.google.firebase.storage.CancellableTask
    public StorageTask<ResultT> addOnProgressListener(Activity activity, OnProgressListener<? super ResultT> onProgressListener) {
        o.h(onProgressListener);
        o.h(activity);
        this.progressManager.addListener(activity, null, onProgressListener);
        return this;
    }

    @Override // ya.h
    public StorageTask<ResultT> addOnSuccessListener(Activity activity, ya.f<? super ResultT> fVar) {
        o.h(activity);
        o.h(fVar);
        this.successManager.addListener(activity, null, fVar);
        return this;
    }

    public void onCanceled() {
    }

    public void onFailure() {
    }

    public void onPaused() {
    }

    public void onProgress() {
    }

    public void onQueued() {
    }

    public void onSuccess() {
    }

    public void resetState() {
    }

    public boolean tryChangeState(int i6, boolean z10) {
        return tryChangeState(new int[]{i6}, z10);
    }
}
