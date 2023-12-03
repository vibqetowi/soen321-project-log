package com.bugsnag.android;

import com.bugsnag.android.Thread;
import java.util.Collection;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: ThreadState.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"toBugsnagThread", "Lcom/bugsnag/android/Thread;", "thread", "Ljava/lang/Thread;", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ThreadState$captureThreadTrace$1 extends k implements l<java.lang.Thread, Thread> {
    final /* synthetic */ java.lang.Thread $currentThread;
    final /* synthetic */ Throwable $exc;
    final /* synthetic */ boolean $isUnhandled;
    final /* synthetic */ Logger $logger;
    final /* synthetic */ Collection $projectPackages;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadState$captureThreadTrace$1(java.lang.Thread thread, Throwable th2, boolean z10, Collection collection, Logger logger) {
        super(1);
        this.$currentThread = thread;
        this.$exc = th2;
        this.$isUnhandled = z10;
        this.$projectPackages = collection;
        this.$logger = logger;
    }

    @Override // ss.l
    public final Thread invoke(java.lang.Thread thread) {
        StackTraceElement[] stackTrace;
        i.h(thread, "thread");
        boolean z10 = thread.getId() == this.$currentThread.getId();
        if (z10) {
            Throwable th2 = this.$exc;
            if (th2 != null && this.$isUnhandled) {
                stackTrace = th2.getStackTrace();
            } else {
                stackTrace = this.$currentThread.getStackTrace();
            }
        } else {
            stackTrace = thread.getStackTrace();
        }
        i.c(stackTrace, "if (isErrorThread) {\n   …ckTrace\n                }");
        return new Thread(thread.getId(), thread.getName(), ThreadType.ANDROID, z10, Thread.State.forThread(thread), new Stacktrace(stackTrace, this.$projectPackages, this.$logger), this.$logger);
    }
}
