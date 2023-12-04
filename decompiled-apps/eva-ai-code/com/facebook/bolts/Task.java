package com.facebook.bolts;

import androidx.core.app.NotificationCompat;
import com.facebook.appevents.UserDataStore;
import com.facebook.bolts.Task;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
/* compiled from: Task.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 @*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003@ABB\u0007\b\u0010¢\u0006\u0002\u0010\u0003B\u0011\b\u0012\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0005B\u000f\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010%\u001a\b\u0012\u0004\u0012\u0002H&0\u0000\"\u0004\b\u0001\u0010&J4\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u00002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070)2\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00000\u0010J>\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u00002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070)2\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00000\u00102\b\u0010+\u001a\u0004\u0018\u00010,JJ\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u00002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070)2\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00000\u00102\b\b\u0002\u0010-\u001a\u00020.2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,J&\u0010/\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u0010J0\u0010/\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u00102\b\u0010+\u001a\u0004\u0018\u00010,J.\u0010/\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u00102\u0006\u0010-\u001a\u00020.J8\u0010/\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u00102\u0006\u0010-\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,J,\u00101\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H00\u00000\u0010J6\u00101\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H00\u00000\u00102\b\u0010+\u001a\u0004\u0018\u00010,J4\u00101\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H00\u00000\u00102\u0006\u0010-\u001a\u00020.J>\u00101\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H00\u00000\u00102\u0006\u0010-\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,J\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u0000J&\u00103\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u0010J0\u00103\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u00102\b\u0010+\u001a\u0004\u0018\u00010,J.\u00103\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u00102\u0006\u0010-\u001a\u00020.J8\u00103\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u00102\u0006\u0010-\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,J,\u00104\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H00\u00000\u0010J6\u00104\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H00\u00000\u00102\b\u0010+\u001a\u0004\u0018\u00010,J4\u00104\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H00\u00000\u00102\u0006\u0010-\u001a\u00020.J>\u00104\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H00\u00000\u00102\u0006\u0010-\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,J\b\u00105\u001a\u000206H\u0002J\u0006\u00107\u001a\u00020\u0007J\u0016\u00108\u001a\u00020\u00072\u000e\u0010\u0012\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014J\u0015\u00109\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010:J\u0006\u0010;\u001a\u000206J\u0016\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/facebook/bolts/Task;", "TResult", "", "()V", "result", "(Ljava/lang/Object;)V", AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, "", "(Z)V", "cancelledField", "completeField", "condition", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "continuations", "", "Lcom/facebook/bolts/Continuation;", "Ljava/lang/Void;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getError", "()Ljava/lang/Exception;", "errorField", "errorHasBeenObserved", "isCancelled", "()Z", "isCompleted", "isFaulted", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getResult", "()Ljava/lang/Object;", "resultField", "Ljava/lang/Object;", "unobservedErrorNotifier", "Lcom/facebook/bolts/UnobservedErrorNotifier;", "cast", "TOut", "continueWhile", "predicate", "Ljava/util/concurrent/Callable;", "continuation", UserDataStore.CITY, "Lcom/facebook/bolts/CancellationToken;", "executor", "Ljava/util/concurrent/Executor;", "continueWith", "TContinuationResult", "continueWithTask", "makeVoid", "onSuccess", "onSuccessTask", "runContinuations", "", "trySetCancelled", "trySetError", "trySetResult", "(Ljava/lang/Object;)Z", "waitForCompletion", "duration", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "Companion", "TaskCompletionSource", "UnobservedExceptionHandler", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Task<TResult> {
    private static volatile UnobservedExceptionHandler unobservedExceptionHandler;
    private boolean cancelledField;
    private boolean completeField;
    private final Condition condition;
    private List<Continuation<TResult, Void>> continuations;
    private Exception errorField;
    private boolean errorHasBeenObserved;
    private final ReentrantLock lock;
    private TResult resultField;
    private UnobservedErrorNotifier unobservedErrorNotifier;
    public static final Companion Companion = new Companion(null);
    public static final ExecutorService BACKGROUND_EXECUTOR = BoltsExecutors.Companion.background();
    private static final Executor IMMEDIATE_EXECUTOR = BoltsExecutors.Companion.immediate$facebook_bolts_release();
    public static final Executor UI_THREAD_EXECUTOR = AndroidExecutors.Companion.uiThread();
    private static final Task<?> TASK_NULL = new Task<>((Object) null);
    private static final Task<Boolean> TASK_TRUE = new Task<>(true);
    private static final Task<Boolean> TASK_FALSE = new Task<>(false);
    private static final Task<?> TASK_CANCELLED = new Task<>(true);

    /* compiled from: Task.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/facebook/bolts/Task$UnobservedExceptionHandler;", "", "unobservedException", "", "t", "Lcom/facebook/bolts/Task;", "e", "Lcom/facebook/bolts/UnobservedTaskException;", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public interface UnobservedExceptionHandler {
        void unobservedException(Task<?> task, UnobservedTaskException unobservedTaskException);
    }

    @JvmStatic
    public static final <TResult> Task<TResult> call(Callable<TResult> callable) {
        return Companion.call(callable);
    }

    @JvmStatic
    public static final <TResult> Task<TResult> call(Callable<TResult> callable, CancellationToken cancellationToken) {
        return Companion.call(callable, cancellationToken);
    }

    @JvmStatic
    public static final <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
        return Companion.call(callable, executor);
    }

    @JvmStatic
    public static final <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor, CancellationToken cancellationToken) {
        return Companion.call(callable, executor, cancellationToken);
    }

    @JvmStatic
    public static final <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
        return Companion.callInBackground(callable);
    }

    @JvmStatic
    public static final <TResult> Task<TResult> callInBackground(Callable<TResult> callable, CancellationToken cancellationToken) {
        return Companion.callInBackground(callable, cancellationToken);
    }

    @JvmStatic
    public static final <TResult> Task<TResult> cancelled() {
        return Companion.cancelled();
    }

    @JvmStatic
    public static final Task<Void> delay(long j) {
        return Companion.delay(j);
    }

    @JvmStatic
    public static final Task<Void> delay(long j, CancellationToken cancellationToken) {
        return Companion.delay(j, cancellationToken);
    }

    @JvmStatic
    public static final <TResult> Task<TResult> forError(Exception exc) {
        return Companion.forError(exc);
    }

    @JvmStatic
    public static final <TResult> Task<TResult> forResult(TResult tresult) {
        return Companion.forResult(tresult);
    }

    @JvmStatic
    public static final UnobservedExceptionHandler getUnobservedExceptionHandler() {
        return Companion.getUnobservedExceptionHandler();
    }

    @JvmStatic
    public static final void setUnobservedExceptionHandler(UnobservedExceptionHandler unobservedExceptionHandler2) {
        Companion.setUnobservedExceptionHandler(unobservedExceptionHandler2);
    }

    @JvmStatic
    public static final Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        return Companion.whenAll(collection);
    }

    @JvmStatic
    public static final <TResult> Task<List<TResult>> whenAllResult(Collection<Task<TResult>> collection) {
        return Companion.whenAllResult(collection);
    }

    @JvmStatic
    public static final Task<Task<?>> whenAny(Collection<? extends Task<?>> collection) {
        return Companion.whenAny(collection);
    }

    @JvmStatic
    public static final <TResult> Task<Task<TResult>> whenAnyResult(Collection<Task<TResult>> collection) {
        return Companion.whenAnyResult(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <TOut> Task<TOut> cast() {
        return this;
    }

    public Task() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
    }

    private Task(TResult tresult) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
        trySetResult(tresult);
    }

    private Task(boolean z) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
        if (z) {
            trySetCancelled();
        } else {
            trySetResult(null);
        }
    }

    public final boolean isCompleted() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.completeField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isCancelled() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.cancelledField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isFaulted() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.errorField != null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final TResult getResult() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.resultField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Exception getError() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.errorField != null) {
                this.errorHasBeenObserved = true;
                UnobservedErrorNotifier unobservedErrorNotifier = this.unobservedErrorNotifier;
                if (unobservedErrorNotifier != null) {
                    unobservedErrorNotifier.setObserved();
                    this.unobservedErrorNotifier = null;
                }
            }
            return this.errorField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void waitForCompletion() throws InterruptedException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isCompleted()) {
                this.condition.await();
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean waitForCompletion(long j, TimeUnit timeUnit) throws InterruptedException {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isCompleted()) {
                this.condition.await(j, timeUnit);
            }
            return isCompleted();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Task<Void> makeVoid() {
        return continueWithTask(new Continuation() { // from class: com.facebook.bolts.Task$$ExternalSyntheticLambda3
            @Override // com.facebook.bolts.Continuation
            public final Object then(Task task) {
                Task m6363makeVoid$lambda8;
                m6363makeVoid$lambda8 = Task.m6363makeVoid$lambda8(task);
                return m6363makeVoid$lambda8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: makeVoid$lambda-8  reason: not valid java name */
    public static final Task m6363makeVoid$lambda8(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isCancelled()) {
            return Companion.cancelled();
        }
        if (task.isFaulted()) {
            return Companion.forError(task.getError());
        }
        return Companion.forResult(null);
    }

    public final Task<Void> continueWhile(Callable<Boolean> predicate, Continuation<Void, Task<Void>> continuation) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWhile(predicate, continuation, IMMEDIATE_EXECUTOR, null);
    }

    public final Task<Void> continueWhile(Callable<Boolean> predicate, Continuation<Void, Task<Void>> continuation, CancellationToken cancellationToken) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWhile(predicate, continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public static /* synthetic */ Task continueWhile$default(Task task, Callable callable, Continuation continuation, Executor executor, CancellationToken cancellationToken, int i, Object obj) {
        if ((i & 4) != 0) {
            executor = IMMEDIATE_EXECUTOR;
        }
        if ((i & 8) != 0) {
            cancellationToken = null;
        }
        return task.continueWhile(callable, continuation, executor, cancellationToken);
    }

    public final Task<Void> continueWhile(final Callable<Boolean> predicate, final Continuation<Void, Task<Void>> continuation, final Executor executor, final CancellationToken cancellationToken) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return makeVoid().continueWithTask((Continuation) new Continuation<Void, Task<Void>>() { // from class: com.facebook.bolts.Task$continueWhile$predicateContinuation$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.bolts.Continuation
            public Task<Void> then(Task<Void> task) throws Exception {
                Intrinsics.checkNotNullParameter(task, "task");
                CancellationToken cancellationToken2 = CancellationToken.this;
                if (cancellationToken2 != null && cancellationToken2.isCancellationRequested()) {
                    return Task.Companion.cancelled();
                }
                Boolean call = predicate.call();
                Intrinsics.checkNotNullExpressionValue(call, "predicate.call()");
                if (call.booleanValue()) {
                    return Task.Companion.forResult(null).onSuccessTask(continuation, executor).onSuccessTask(this, executor);
                }
                return Task.Companion.forResult(null);
            }
        }, executor);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return continueWith(continuation, executor, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(final Continuation<TResult, TContinuationResult> continuation, final Executor executor, final CancellationToken cancellationToken) {
        List<Continuation<TResult, Void>> list;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean isCompleted = isCompleted();
            if (!isCompleted && (list = this.continuations) != null) {
                list.add(new Continuation() { // from class: com.facebook.bolts.Task$$ExternalSyntheticLambda1
                    @Override // com.facebook.bolts.Continuation
                    public final Object then(Task task) {
                        Void m6361continueWith$lambda10$lambda9;
                        m6361continueWith$lambda10$lambda9 = Task.m6361continueWith$lambda10$lambda9(TaskCompletionSource.this, continuation, executor, cancellationToken, task);
                        return m6361continueWith$lambda10$lambda9;
                    }
                });
            }
            Unit unit = Unit.INSTANCE;
            if (isCompleted) {
                Companion.completeImmediately(taskCompletionSource, continuation, this, executor, cancellationToken);
            }
            return taskCompletionSource.getTask();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: continueWith$lambda-10$lambda-9  reason: not valid java name */
    public static final Void m6361continueWith$lambda10$lambda9(com.facebook.bolts.TaskCompletionSource tcs, Continuation continuation, Executor executor, CancellationToken cancellationToken, Task task) {
        Intrinsics.checkNotNullParameter(tcs, "$tcs");
        Intrinsics.checkNotNullParameter(continuation, "$continuation");
        Intrinsics.checkNotNullParameter(executor, "$executor");
        Intrinsics.checkNotNullParameter(task, "task");
        Companion.completeImmediately(tcs, continuation, task, executor, cancellationToken);
        return null;
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWith(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, CancellationToken cancellationToken) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWith(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return continueWithTask(continuation, executor, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(final Continuation<TResult, Task<TContinuationResult>> continuation, final Executor executor, final CancellationToken cancellationToken) {
        List<Continuation<TResult, Void>> list;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean isCompleted = isCompleted();
            if (!isCompleted && (list = this.continuations) != null) {
                list.add(new Continuation() { // from class: com.facebook.bolts.Task$$ExternalSyntheticLambda2
                    @Override // com.facebook.bolts.Continuation
                    public final Object then(Task task) {
                        Void m6362continueWithTask$lambda12$lambda11;
                        m6362continueWithTask$lambda12$lambda11 = Task.m6362continueWithTask$lambda12$lambda11(TaskCompletionSource.this, continuation, executor, cancellationToken, task);
                        return m6362continueWithTask$lambda12$lambda11;
                    }
                });
            }
            Unit unit = Unit.INSTANCE;
            if (isCompleted) {
                Companion.completeAfterTask(taskCompletionSource, continuation, this, executor, cancellationToken);
            }
            return taskCompletionSource.getTask();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: continueWithTask$lambda-12$lambda-11  reason: not valid java name */
    public static final Void m6362continueWithTask$lambda12$lambda11(com.facebook.bolts.TaskCompletionSource tcs, Continuation continuation, Executor executor, CancellationToken cancellationToken, Task task) {
        Intrinsics.checkNotNullParameter(tcs, "$tcs");
        Intrinsics.checkNotNullParameter(continuation, "$continuation");
        Intrinsics.checkNotNullParameter(executor, "$executor");
        Intrinsics.checkNotNullParameter(task, "task");
        Companion.completeAfterTask(tcs, continuation, task, executor, cancellationToken);
        return null;
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, CancellationToken cancellationToken) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return onSuccess(continuation, executor, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccess(final Continuation<TResult, TContinuationResult> continuation, Executor executor, final CancellationToken cancellationToken) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return continueWithTask(new Continuation() { // from class: com.facebook.bolts.Task$$ExternalSyntheticLambda0
            @Override // com.facebook.bolts.Continuation
            public final Object then(Task task) {
                Task m6364onSuccess$lambda13;
                m6364onSuccess$lambda13 = Task.m6364onSuccess$lambda13(CancellationToken.this, continuation, task);
                return m6364onSuccess$lambda13;
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-13  reason: not valid java name */
    public static final Task m6364onSuccess$lambda13(CancellationToken cancellationToken, Continuation continuation, Task task) {
        Intrinsics.checkNotNullParameter(continuation, "$continuation");
        Intrinsics.checkNotNullParameter(task, "task");
        if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
            return Companion.cancelled();
        }
        if (task.isFaulted()) {
            return Companion.forError(task.getError());
        }
        if (task.isCancelled()) {
            return Companion.cancelled();
        }
        return task.continueWith(continuation);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, CancellationToken cancellationToken) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return onSuccessTask(continuation, executor, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(final Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor, final CancellationToken cancellationToken) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return continueWithTask(new Continuation() { // from class: com.facebook.bolts.Task$$ExternalSyntheticLambda4
            @Override // com.facebook.bolts.Continuation
            public final Object then(Task task) {
                Task m6365onSuccessTask$lambda14;
                m6365onSuccessTask$lambda14 = Task.m6365onSuccessTask$lambda14(CancellationToken.this, continuation, task);
                return m6365onSuccessTask$lambda14;
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccessTask$lambda-14  reason: not valid java name */
    public static final Task m6365onSuccessTask$lambda14(CancellationToken cancellationToken, Continuation continuation, Task task) {
        Intrinsics.checkNotNullParameter(continuation, "$continuation");
        Intrinsics.checkNotNullParameter(task, "task");
        if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
            return Companion.cancelled();
        }
        if (task.isFaulted()) {
            return Companion.forError(task.getError());
        }
        if (task.isCancelled()) {
            return Companion.cancelled();
        }
        return task.continueWithTask(continuation);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, CancellationToken cancellationToken) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    private final void runContinuations() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List<Continuation<TResult, Void>> list = this.continuations;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((Continuation) it.next()).then(this);
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
            this.continuations = null;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetCancelled() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                reentrantLock.unlock();
                return false;
            }
            this.completeField = true;
            this.cancelledField = true;
            this.condition.signalAll();
            runContinuations();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetResult(TResult tresult) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                reentrantLock.unlock();
                return false;
            }
            this.completeField = true;
            this.resultField = tresult;
            this.condition.signalAll();
            runContinuations();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetError(Exception exc) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                return false;
            }
            this.completeField = true;
            this.errorField = exc;
            this.errorHasBeenObserved = false;
            this.condition.signalAll();
            runContinuations();
            if (!this.errorHasBeenObserved && unobservedExceptionHandler != null) {
                this.unobservedErrorNotifier = new UnobservedErrorNotifier(this);
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* compiled from: Task.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/bolts/Task$TaskCompletionSource;", "Lcom/facebook/bolts/TaskCompletionSource;", "(Lcom/facebook/bolts/Task;)V", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @Deprecated(message = "Please use [TaskCompletionSource] instead. ")
    /* loaded from: classes2.dex */
    public final class TaskCompletionSource extends com.facebook.bolts.TaskCompletionSource<TResult> {
        final /* synthetic */ Task<TResult> this$0;

        public TaskCompletionSource(Task this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }
    }

    /* compiled from: Task.kt */
    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00110\u0013H\u0007J.\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00110\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J,\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00110\u00132\u0006\u0010\u0016\u001a\u00020\u0006H\u0007J6\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00110\u00132\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J$\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00110\u0013H\u0007J.\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00110\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u0011H\u0007J\\\u0010\u0019\u001a\u00020\u001a\"\u0004\b\u0001\u0010\u001b\"\u0004\b\u0002\u0010\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001d2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u0002H\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0\b0\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00110\b2\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002JV\u0010!\u001a\u00020\u001a\"\u0004\b\u0001\u0010\u001b\"\u0004\b\u0002\u0010\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u001b0\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00110\b2\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\b2\u0006\u0010\"\u001a\u00020$H\u0007J\"\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\b2\u0006\u0010\"\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0015H\u0007J/\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\b2\u0006\u0010\"\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0002\b'J$\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u00112\u000e\u0010)\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+H\u0007J#\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u00112\b\u0010-\u001a\u0004\u0018\u0001H\u0011H\u0007¢\u0006\u0002\u0010.J\n\u0010/\u001a\u0004\u0018\u00010\u000fH\u0007J\u0012\u00100\u001a\u00020\u001a2\b\u00101\u001a\u0004\u0018\u00010\u000fH\u0007J \u00102\u001a\b\u0012\u0004\u0012\u00020#0\b2\u0010\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b04H\u0007J0\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0011060\b\"\u0004\b\u0001\u0010\u00112\u0012\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\b04H\u0007J$\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\b2\u0010\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b04H\u0007J.\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\b0\b\"\u0004\b\u0001\u0010\u00112\u0012\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\b04H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/facebook/bolts/Task$Companion;", "", "()V", "BACKGROUND_EXECUTOR", "Ljava/util/concurrent/ExecutorService;", "IMMEDIATE_EXECUTOR", "Ljava/util/concurrent/Executor;", "TASK_CANCELLED", "Lcom/facebook/bolts/Task;", "TASK_FALSE", "", "TASK_NULL", "TASK_TRUE", "UI_THREAD_EXECUTOR", "unobservedExceptionHandler", "Lcom/facebook/bolts/Task$UnobservedExceptionHandler;", NotificationCompat.CATEGORY_CALL, "TResult", "callable", "Ljava/util/concurrent/Callable;", UserDataStore.CITY, "Lcom/facebook/bolts/CancellationToken;", "executor", "callInBackground", AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, "completeAfterTask", "", "TContinuationResult", "tcs", "Lcom/facebook/bolts/TaskCompletionSource;", "continuation", "Lcom/facebook/bolts/Continuation;", "task", "completeImmediately", "delay", "Ljava/lang/Void;", "", "cancellationToken", "Ljava/util/concurrent/ScheduledExecutorService;", "delay$facebook_bolts_release", "forError", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "forResult", "value", "(Ljava/lang/Object;)Lcom/facebook/bolts/Task;", "getUnobservedExceptionHandler", "setUnobservedExceptionHandler", "eh", "whenAll", "tasks", "", "whenAllResult", "", "whenAny", "whenAnyResult", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final UnobservedExceptionHandler getUnobservedExceptionHandler() {
            return Task.unobservedExceptionHandler;
        }

        @JvmStatic
        public final void setUnobservedExceptionHandler(UnobservedExceptionHandler unobservedExceptionHandler) {
            Task.unobservedExceptionHandler = unobservedExceptionHandler;
        }

        @JvmStatic
        public final <TResult> Task<TResult> forResult(TResult tresult) {
            if (tresult == null) {
                return Task.TASK_NULL;
            }
            if (tresult instanceof Boolean) {
                return ((Boolean) tresult).booleanValue() ? Task.TASK_TRUE : Task.TASK_FALSE;
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            taskCompletionSource.setResult(tresult);
            return taskCompletionSource.getTask();
        }

        @JvmStatic
        public final <TResult> Task<TResult> forError(Exception exc) {
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            taskCompletionSource.setError(exc);
            return taskCompletionSource.getTask();
        }

        @JvmStatic
        public final <TResult> Task<TResult> cancelled() {
            return Task.TASK_CANCELLED;
        }

        @JvmStatic
        public final Task<Void> delay(long j) {
            return delay$facebook_bolts_release(j, BoltsExecutors.Companion.scheduled$facebook_bolts_release(), null);
        }

        @JvmStatic
        public final Task<Void> delay(long j, CancellationToken cancellationToken) {
            return delay$facebook_bolts_release(j, BoltsExecutors.Companion.scheduled$facebook_bolts_release(), cancellationToken);
        }

        @JvmStatic
        public final Task<Void> delay$facebook_bolts_release(long j, ScheduledExecutorService executor, CancellationToken cancellationToken) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            if (cancellationToken == null || !cancellationToken.isCancellationRequested()) {
                if (j <= 0) {
                    return forResult(null);
                }
                final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
                final ScheduledFuture<?> schedule = executor.schedule(new Runnable() { // from class: com.facebook.bolts.Task$Companion$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.m6372delay$lambda0(TaskCompletionSource.this);
                    }
                }, j, TimeUnit.MILLISECONDS);
                if (cancellationToken != null) {
                    cancellationToken.register(new Runnable() { // from class: com.facebook.bolts.Task$Companion$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            Task.Companion.m6373delay$lambda1(schedule, taskCompletionSource);
                        }
                    });
                }
                return taskCompletionSource.getTask();
            }
            return cancelled();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: delay$lambda-0  reason: not valid java name */
        public static final void m6372delay$lambda0(com.facebook.bolts.TaskCompletionSource tcs) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            tcs.trySetResult(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: delay$lambda-1  reason: not valid java name */
        public static final void m6373delay$lambda1(ScheduledFuture scheduledFuture, com.facebook.bolts.TaskCompletionSource tcs) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            scheduledFuture.cancel(true);
            tcs.trySetCancelled();
        }

        @JvmStatic
        public final <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            return call(callable, Task.BACKGROUND_EXECUTOR, null);
        }

        @JvmStatic
        public final <TResult> Task<TResult> callInBackground(Callable<TResult> callable, CancellationToken cancellationToken) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            return call(callable, Task.BACKGROUND_EXECUTOR, cancellationToken);
        }

        @JvmStatic
        public final <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            Intrinsics.checkNotNullParameter(executor, "executor");
            return call(callable, executor, null);
        }

        @JvmStatic
        public final <TResult> Task<TResult> call(final Callable<TResult> callable, Executor executor, final CancellationToken cancellationToken) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            Intrinsics.checkNotNullParameter(executor, "executor");
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            try {
                executor.execute(new Runnable() { // from class: com.facebook.bolts.Task$Companion$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.m6368call$lambda2(CancellationToken.this, taskCompletionSource, callable);
                    }
                });
            } catch (Exception e) {
                taskCompletionSource.setError(new ExecutorException(e));
            }
            return taskCompletionSource.getTask();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: call$lambda-2  reason: not valid java name */
        public static final void m6368call$lambda2(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource tcs, Callable callable) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            Intrinsics.checkNotNullParameter(callable, "$callable");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                tcs.setCancelled();
                return;
            }
            try {
                tcs.setResult(callable.call());
            } catch (CancellationException unused) {
                tcs.setCancelled();
            } catch (Exception e) {
                tcs.setError(e);
            }
        }

        @JvmStatic
        public final <TResult> Task<TResult> call(Callable<TResult> callable) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            return call(callable, Task.IMMEDIATE_EXECUTOR, null);
        }

        @JvmStatic
        public final <TResult> Task<TResult> call(Callable<TResult> callable, CancellationToken cancellationToken) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            return call(callable, Task.IMMEDIATE_EXECUTOR, cancellationToken);
        }

        @JvmStatic
        public final <TResult> Task<Task<TResult>> whenAnyResult(Collection<Task<TResult>> tasks) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (Task<TResult> task : tasks) {
                task.continueWith(new Continuation() { // from class: com.facebook.bolts.Task$Companion$$ExternalSyntheticLambda0
                    @Override // com.facebook.bolts.Continuation
                    public final Object then(Task task2) {
                        Void m6375whenAnyResult$lambda3;
                        m6375whenAnyResult$lambda3 = Task.Companion.m6375whenAnyResult$lambda3(atomicBoolean, taskCompletionSource, task2);
                        return m6375whenAnyResult$lambda3;
                    }
                });
            }
            return taskCompletionSource.getTask();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: whenAnyResult$lambda-3  reason: not valid java name */
        public static final Void m6375whenAnyResult$lambda3(AtomicBoolean isAnyTaskComplete, com.facebook.bolts.TaskCompletionSource firstCompleted, Task it) {
            Intrinsics.checkNotNullParameter(isAnyTaskComplete, "$isAnyTaskComplete");
            Intrinsics.checkNotNullParameter(firstCompleted, "$firstCompleted");
            Intrinsics.checkNotNullParameter(it, "it");
            if (isAnyTaskComplete.compareAndSet(false, true)) {
                firstCompleted.setResult(it);
                return null;
            }
            it.getError();
            return null;
        }

        @JvmStatic
        public final Task<Task<?>> whenAny(Collection<? extends Task<?>> tasks) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (Task<?> task : tasks) {
                task.continueWith(new Continuation() { // from class: com.facebook.bolts.Task$Companion$$ExternalSyntheticLambda6
                    @Override // com.facebook.bolts.Continuation
                    public final Object then(Task task2) {
                        Void m6374whenAny$lambda4;
                        m6374whenAny$lambda4 = Task.Companion.m6374whenAny$lambda4(atomicBoolean, taskCompletionSource, task2);
                        return m6374whenAny$lambda4;
                    }
                });
            }
            return taskCompletionSource.getTask();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: whenAny$lambda-4  reason: not valid java name */
        public static final Void m6374whenAny$lambda4(AtomicBoolean isAnyTaskComplete, com.facebook.bolts.TaskCompletionSource firstCompleted, Task it) {
            Intrinsics.checkNotNullParameter(isAnyTaskComplete, "$isAnyTaskComplete");
            Intrinsics.checkNotNullParameter(firstCompleted, "$firstCompleted");
            Intrinsics.checkNotNullParameter(it, "it");
            if (isAnyTaskComplete.compareAndSet(false, true)) {
                firstCompleted.setResult(it);
                return null;
            }
            it.getError();
            return null;
        }

        @JvmStatic
        public final <TResult> Task<List<TResult>> whenAllResult(final Collection<Task<TResult>> tasks) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            return (Task<List<TResult>>) whenAll(tasks).onSuccess((Continuation) ((Continuation<Void, List<? extends TResult>>) new Continuation<Void, List<? extends TResult>>() { // from class: com.facebook.bolts.Task$Companion$whenAllResult$1
                @Override // com.facebook.bolts.Continuation
                public List<TResult> then(Task<Void> task) {
                    Intrinsics.checkNotNullParameter(task, "task");
                    if (tasks.isEmpty()) {
                        return CollectionsKt.emptyList();
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = tasks.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Task) it.next()).getResult());
                    }
                    return arrayList;
                }
            }));
        }

        @JvmStatic
        public final Task<Void> whenAll(Collection<? extends Task<?>> tasks) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            final ArrayList arrayList = new ArrayList();
            final ReentrantLock reentrantLock = new ReentrantLock();
            final AtomicInteger atomicInteger = new AtomicInteger(tasks.size());
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (Task<?> task : tasks) {
                task.continueWith(new Continuation() { // from class: com.facebook.bolts.Task$Companion$whenAll$1
                    @Override // com.facebook.bolts.Continuation
                    public /* bridge */ /* synthetic */ Object then(Task task2) {
                        return then((Task<Object>) task2);
                    }

                    @Override // com.facebook.bolts.Continuation
                    public final Void then(Task<Object> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it.isFaulted()) {
                            ReentrantLock reentrantLock2 = reentrantLock;
                            ArrayList<Exception> arrayList2 = arrayList;
                            reentrantLock2.lock();
                            try {
                                arrayList2.add(it.getError());
                            } finally {
                                reentrantLock2.unlock();
                            }
                        }
                        if (it.isCancelled()) {
                            atomicBoolean.set(true);
                        }
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (arrayList.size() != 0) {
                                if (arrayList.size() == 1) {
                                    taskCompletionSource.setError(arrayList.get(0));
                                } else {
                                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                    String format = String.format("There were %d exceptions.", Arrays.copyOf(new Object[]{Integer.valueOf(arrayList.size())}, 1));
                                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                                    taskCompletionSource.setError(new AggregateException(format, arrayList));
                                }
                            } else if (atomicBoolean.get()) {
                                taskCompletionSource.setCancelled();
                            } else {
                                taskCompletionSource.setResult(null);
                            }
                        }
                        return null;
                    }
                });
            }
            return taskCompletionSource.getTask();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void completeImmediately(final com.facebook.bolts.TaskCompletionSource<TContinuationResult> taskCompletionSource, final Continuation<TResult, TContinuationResult> continuation, final Task<TResult> task, Executor executor, final CancellationToken cancellationToken) {
            try {
                executor.execute(new Runnable() { // from class: com.facebook.bolts.Task$Companion$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.m6371completeImmediately$lambda5(CancellationToken.this, taskCompletionSource, continuation, task);
                    }
                });
            } catch (Exception e) {
                taskCompletionSource.setError(new ExecutorException(e));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: completeImmediately$lambda-5  reason: not valid java name */
        public static final void m6371completeImmediately$lambda5(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource tcs, Continuation continuation, Task task) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            Intrinsics.checkNotNullParameter(continuation, "$continuation");
            Intrinsics.checkNotNullParameter(task, "$task");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                tcs.setCancelled();
                return;
            }
            try {
                tcs.setResult(continuation.then(task));
            } catch (CancellationException unused) {
                tcs.setCancelled();
            } catch (Exception e) {
                tcs.setError(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void completeAfterTask(final com.facebook.bolts.TaskCompletionSource<TContinuationResult> taskCompletionSource, final Continuation<TResult, Task<TContinuationResult>> continuation, final Task<TResult> task, Executor executor, final CancellationToken cancellationToken) {
            try {
                executor.execute(new Runnable() { // from class: com.facebook.bolts.Task$Companion$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.m6369completeAfterTask$lambda7(CancellationToken.this, taskCompletionSource, continuation, task);
                    }
                });
            } catch (Exception e) {
                taskCompletionSource.setError(new ExecutorException(e));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: completeAfterTask$lambda-7  reason: not valid java name */
        public static final void m6369completeAfterTask$lambda7(final CancellationToken cancellationToken, final com.facebook.bolts.TaskCompletionSource tcs, Continuation continuation, Task task) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            Intrinsics.checkNotNullParameter(continuation, "$continuation");
            Intrinsics.checkNotNullParameter(task, "$task");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                tcs.setCancelled();
                return;
            }
            try {
                Task task2 = (Task) continuation.then(task);
                if (task2 != null) {
                    task2.continueWith(new Continuation() { // from class: com.facebook.bolts.Task$Companion$$ExternalSyntheticLambda7
                        @Override // com.facebook.bolts.Continuation
                        public final Object then(Task task3) {
                            Void m6370completeAfterTask$lambda7$lambda6;
                            m6370completeAfterTask$lambda7$lambda6 = Task.Companion.m6370completeAfterTask$lambda7$lambda6(CancellationToken.this, tcs, task3);
                            return m6370completeAfterTask$lambda7$lambda6;
                        }
                    });
                } else {
                    tcs.setResult(null);
                }
            } catch (CancellationException unused) {
                tcs.setCancelled();
            } catch (Exception e) {
                tcs.setError(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: completeAfterTask$lambda-7$lambda-6  reason: not valid java name */
        public static final Void m6370completeAfterTask$lambda7$lambda6(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource tcs, Task task) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            Intrinsics.checkNotNullParameter(task, "task");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                tcs.setCancelled();
                return null;
            }
            if (task.isCancelled()) {
                tcs.setCancelled();
            } else if (task.isFaulted()) {
                tcs.setError(task.getError());
            } else {
                tcs.setResult(task.getResult());
            }
            return null;
        }
    }
}
