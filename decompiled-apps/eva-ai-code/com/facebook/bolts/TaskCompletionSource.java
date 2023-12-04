package com.facebook.bolts;

import kotlin.Metadata;
/* compiled from: TaskCompletionSource.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\t2\u000e\u0010\u000b\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rJ\u0015\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u000b\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rJ\u0015\u0010\u0014\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/facebook/bolts/TaskCompletionSource;", "TResult", "", "()V", "task", "Lcom/facebook/bolts/Task;", "getTask", "()Lcom/facebook/bolts/Task;", "setCancelled", "", "setError", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "setResult", "result", "(Ljava/lang/Object;)V", "trySetCancelled", "", "trySetError", "trySetResult", "(Ljava/lang/Object;)Z", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class TaskCompletionSource<TResult> {
    private final Task<TResult> task = new Task<>();

    public final Task<TResult> getTask() {
        return this.task;
    }

    public final boolean trySetCancelled() {
        return this.task.trySetCancelled();
    }

    public final boolean trySetResult(TResult tresult) {
        return this.task.trySetResult(tresult);
    }

    public final boolean trySetError(Exception exc) {
        return this.task.trySetError(exc);
    }

    public final void setCancelled() {
        if (!trySetCancelled()) {
            throw new IllegalStateException("Cannot cancel a completed task.".toString());
        }
    }

    public final void setResult(TResult tresult) {
        if (!trySetResult(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.".toString());
        }
    }

    public final void setError(Exception exc) {
        if (!trySetError(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.".toString());
        }
    }
}
