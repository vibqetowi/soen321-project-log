package com.bugsnag.android.internal;

import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: BackgroundTaskService.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/internal/TaskTypeThread;", "Ljava/lang/Thread;", "runnable", "Ljava/lang/Runnable;", SessionManager.KEY_NAME, "", "taskType", "Lcom/bugsnag/android/internal/TaskType;", "(Ljava/lang/Runnable;Ljava/lang/String;Lcom/bugsnag/android/internal/TaskType;)V", "getTaskType", "()Lcom/bugsnag/android/internal/TaskType;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
final class TaskTypeThread extends Thread {
    private final TaskType taskType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskTypeThread(Runnable runnable, String name, TaskType taskType) {
        super(runnable, name);
        i.h(runnable, "runnable");
        i.h(name, "name");
        i.h(taskType, "taskType");
        this.taskType = taskType;
    }

    public final TaskType getTaskType() {
        return this.taskType;
    }
}
