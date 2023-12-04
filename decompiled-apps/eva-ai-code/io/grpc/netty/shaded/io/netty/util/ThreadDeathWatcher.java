package io.grpc.netty.shaded.io.netty.util;

import io.grpc.netty.shaded.io.netty.util.concurrent.DefaultThreadFactory;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
import io.grpc.netty.shaded.io.netty.util.internal.SystemPropertyUtil;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
@Deprecated
/* loaded from: classes4.dex */
public final class ThreadDeathWatcher {
    static final ThreadFactory threadFactory;
    private static volatile Thread watcherThread;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(ThreadDeathWatcher.class);
    private static final Queue<Entry> pendingEntries = new ConcurrentLinkedQueue();
    private static final Watcher watcher = new Watcher();
    private static final AtomicBoolean started = new AtomicBoolean();

    static {
        String str = SystemPropertyUtil.get("io.grpc.netty.shaded.io.netty.serviceThreadPrefix");
        String str2 = "threadDeathWatcher";
        if (!StringUtil.isNullOrEmpty(str)) {
            str2 = str + "threadDeathWatcher";
        }
        threadFactory = new DefaultThreadFactory(str2, true, 1, null);
    }

    public static void watch(Thread thread, Runnable runnable) {
        ObjectUtil.checkNotNull(thread, "thread");
        ObjectUtil.checkNotNull(runnable, "task");
        if (!thread.isAlive()) {
            throw new IllegalArgumentException("thread must be alive.");
        }
        schedule(thread, runnable, true);
    }

    public static void unwatch(Thread thread, Runnable runnable) {
        schedule((Thread) ObjectUtil.checkNotNull(thread, "thread"), (Runnable) ObjectUtil.checkNotNull(runnable, "task"), false);
    }

    private static void schedule(Thread thread, Runnable runnable, boolean z) {
        pendingEntries.add(new Entry(thread, runnable, z));
        if (started.compareAndSet(false, true)) {
            final Thread newThread = threadFactory.newThread(watcher);
            AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: io.grpc.netty.shaded.io.netty.util.ThreadDeathWatcher.1
                @Override // java.security.PrivilegedAction
                public Void run() {
                    newThread.setContextClassLoader(null);
                    return null;
                }
            });
            newThread.start();
            watcherThread = newThread;
        }
    }

    public static boolean awaitInactivity(long j, TimeUnit timeUnit) throws InterruptedException {
        ObjectUtil.checkNotNull(timeUnit, "unit");
        Thread thread = watcherThread;
        if (thread != null) {
            thread.join(timeUnit.toMillis(j));
            return !thread.isAlive();
        }
        return true;
    }

    private ThreadDeathWatcher() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class Watcher implements Runnable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final List<Entry> watchees;

        private Watcher() {
            this.watchees = new ArrayList();
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                fetchWatchees();
                notifyWatchees();
                fetchWatchees();
                notifyWatchees();
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
                if (this.watchees.isEmpty() && ThreadDeathWatcher.pendingEntries.isEmpty()) {
                    ThreadDeathWatcher.started.compareAndSet(true, false);
                    if (ThreadDeathWatcher.pendingEntries.isEmpty() || !ThreadDeathWatcher.started.compareAndSet(false, true)) {
                        return;
                    }
                }
            }
        }

        private void fetchWatchees() {
            while (true) {
                Entry entry = (Entry) ThreadDeathWatcher.pendingEntries.poll();
                if (entry == null) {
                    return;
                }
                if (entry.isWatch) {
                    this.watchees.add(entry);
                } else {
                    this.watchees.remove(entry);
                }
            }
        }

        private void notifyWatchees() {
            List<Entry> list = this.watchees;
            int i = 0;
            while (i < list.size()) {
                Entry entry = list.get(i);
                if (entry.thread.isAlive()) {
                    i++;
                } else {
                    list.remove(i);
                    try {
                        entry.task.run();
                    } catch (Throwable th) {
                        ThreadDeathWatcher.logger.warn("Thread death watcher task raised an exception:", th);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class Entry {
        final boolean isWatch;
        final Runnable task;
        final Thread thread;

        Entry(Thread thread, Runnable runnable, boolean z) {
            this.thread = thread;
            this.task = runnable;
            this.isWatch = z;
        }

        public int hashCode() {
            return this.thread.hashCode() ^ this.task.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                return this.thread == entry.thread && this.task == entry.task;
            }
            return false;
        }
    }
}
