package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.Thread;
import com.bugsnag.android.internal.ImmutableConfig;
import is.k;
import is.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import sp.b;
/* compiled from: ThreadState.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$BY\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u001f\u0010 B#\b\u0010\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b\u001f\u0010#JT\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Lcom/bugsnag/android/ThreadState;", "Lcom/bugsnag/android/JsonStream$Streamable;", "", "Ljava/lang/Thread;", "allThreads", "currentThread", "", "exc", "", "isUnhandled", "", "maxThreadCount", "", "", "projectPackages", "Lcom/bugsnag/android/Logger;", "logger", "", "Lcom/bugsnag/android/Thread;", "captureThreadTrace", "Lcom/bugsnag/android/JsonStream;", "writer", "Lhs/k;", "toStream", "threads", "Ljava/util/List;", "getThreads", "()Ljava/util/List;", "maxThreads", "Lcom/bugsnag/android/ThreadSendPolicy;", "sendThreads", "<init>", "(Ljava/lang/Throwable;ZILcom/bugsnag/android/ThreadSendPolicy;Ljava/util/Collection;Lcom/bugsnag/android/Logger;Ljava/lang/Thread;Ljava/util/List;)V", "Lcom/bugsnag/android/internal/ImmutableConfig;", "config", "(Ljava/lang/Throwable;ZLcom/bugsnag/android/internal/ImmutableConfig;)V", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ThreadState implements JsonStream.Streamable {
    public static final Companion Companion = new Companion(null);
    private final List<Thread> threads;

    /* compiled from: ThreadState.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0002\b\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\t"}, d2 = {"Lcom/bugsnag/android/ThreadState$Companion;", "", "()V", "allThreads", "", "Ljava/lang/Thread;", "allThreads$bugsnag_android_core_release", "rootThreadGroup", "Ljava/lang/ThreadGroup;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        private final ThreadGroup rootThreadGroup() {
            java.lang.Thread currentThread = java.lang.Thread.currentThread();
            i.c(currentThread, "JavaThread.currentThread()");
            ThreadGroup threadGroup = currentThread.getThreadGroup();
            if (threadGroup != null) {
                while (threadGroup.getParent() != null) {
                    threadGroup = threadGroup.getParent();
                    i.c(threadGroup, "group.parent");
                }
                return threadGroup;
            }
            i.o();
            throw null;
        }

        public final List<java.lang.Thread> allThreads$bugsnag_android_core_release() {
            ThreadGroup rootThreadGroup = rootThreadGroup();
            java.lang.Thread[] threadArr = new java.lang.Thread[rootThreadGroup.activeCount()];
            rootThreadGroup.enumerate(threadArr);
            return k.R1(threadArr);
        }
    }

    public ThreadState(Throwable th2, boolean z10, int i6, ThreadSendPolicy sendThreads, Collection<String> projectPackages, Logger logger, java.lang.Thread currentThread, List<? extends java.lang.Thread> allThreads) {
        List<Thread> arrayList;
        i.h(sendThreads, "sendThreads");
        i.h(projectPackages, "projectPackages");
        i.h(logger, "logger");
        i.h(currentThread, "currentThread");
        i.h(allThreads, "allThreads");
        if (sendThreads == ThreadSendPolicy.ALWAYS || (sendThreads == ThreadSendPolicy.UNHANDLED_ONLY && z10)) {
            arrayList = captureThreadTrace(allThreads, currentThread, th2, z10, i6, projectPackages, logger);
        } else {
            arrayList = new ArrayList<>();
        }
        this.threads = arrayList;
    }

    private final List<Thread> captureThreadTrace(List<? extends java.lang.Thread> list, java.lang.Thread thread, Throwable th2, boolean z10, int i6, Collection<String> collection, Logger logger) {
        ThreadState$captureThreadTrace$1 threadState$captureThreadTrace$1 = new ThreadState$captureThreadTrace$1(thread, th2, z10, collection, logger);
        List<java.lang.Thread> E2 = u.E2(u.D2(list, new Comparator<T>() { // from class: com.bugsnag.android.ThreadState$captureThreadTrace$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                return b.g(Long.valueOf(((java.lang.Thread) t3).getId()), Long.valueOf(((java.lang.Thread) t10).getId()));
            }
        }), i6);
        if (!E2.contains(thread)) {
            E2 = u.D2(u.v2(thread, u.E2(E2, Math.max(i6 - 1, 0))), new Comparator<T>() { // from class: com.bugsnag.android.ThreadState$captureThreadTrace$$inlined$sortedBy$2
                @Override // java.util.Comparator
                public final int compare(T t3, T t10) {
                    return b.g(Long.valueOf(((java.lang.Thread) t3).getId()), Long.valueOf(((java.lang.Thread) t10).getId()));
                }
            });
        }
        ArrayList arrayList = new ArrayList(is.i.H1(E2, 10));
        for (java.lang.Thread thread2 : E2) {
            arrayList.add(threadState$captureThreadTrace$1.invoke(thread2));
        }
        ArrayList J2 = u.J2(arrayList);
        if (list.size() > i6) {
            J2.add(new Thread(-1L, "[" + (list.size() - i6) + " threads omitted as the maxReportedThreads limit (" + i6 + ") was exceeded]", ThreadType.EMPTY, false, Thread.State.UNKNOWN, new Stacktrace(new StackTraceElement[]{new StackTraceElement("", "", "-", 0)}, collection, logger), logger));
        }
        return J2;
    }

    public final List<Thread> getThreads() {
        return this.threads;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream writer) {
        i.h(writer, "writer");
        writer.beginArray();
        for (Thread thread : this.threads) {
            writer.value(thread);
        }
        writer.endArray();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ThreadState(Throwable th2, boolean z10, int i6, ThreadSendPolicy threadSendPolicy, Collection collection, Logger logger, java.lang.Thread thread, List list, int i10, d dVar) {
        this(th2, z10, i6, threadSendPolicy, collection, logger, r10, (i10 & 128) != 0 ? Companion.allThreads$bugsnag_android_core_release() : list);
        java.lang.Thread thread2;
        if ((i10 & 64) != 0) {
            java.lang.Thread currentThread = java.lang.Thread.currentThread();
            i.c(currentThread, "JavaThread.currentThread()");
            thread2 = currentThread;
        } else {
            thread2 = thread;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreadState(Throwable th2, boolean z10, ImmutableConfig config) {
        this(th2, z10, config.getMaxReportedThreads(), config.getSendThreads(), config.getProjectPackages(), config.getLogger(), null, null, 192, null);
        i.h(config, "config");
    }
}
