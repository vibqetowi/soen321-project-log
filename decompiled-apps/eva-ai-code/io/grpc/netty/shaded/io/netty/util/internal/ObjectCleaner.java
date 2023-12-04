package io.grpc.netty.shaded.io.netty.util.internal;

import io.grpc.netty.shaded.io.netty.util.concurrent.FastThreadLocalThread;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes4.dex */
public final class ObjectCleaner {
    private static final int REFERENCE_QUEUE_POLL_TIMEOUT_MS = Math.max(500, SystemPropertyUtil.getInt("io.grpc.netty.shaded.io.netty.util.internal.ObjectCleaner.refQueuePollTimeout", 10000));
    static final String CLEANER_THREAD_NAME = "ObjectCleanerThread";
    private static final Set<AutomaticCleanerReference> LIVE_SET = new ConcurrentSet();
    private static final ReferenceQueue<Object> REFERENCE_QUEUE = new ReferenceQueue<>();
    private static final AtomicBoolean CLEANER_RUNNING = new AtomicBoolean(false);
    private static final Runnable CLEANER_TASK = new Runnable() { // from class: io.grpc.netty.shaded.io.netty.util.internal.ObjectCleaner.1
        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            while (true) {
                if (!ObjectCleaner.LIVE_SET.isEmpty()) {
                    try {
                        AutomaticCleanerReference automaticCleanerReference = (AutomaticCleanerReference) ObjectCleaner.REFERENCE_QUEUE.remove(ObjectCleaner.REFERENCE_QUEUE_POLL_TIMEOUT_MS);
                        if (automaticCleanerReference != null) {
                            try {
                                automaticCleanerReference.cleanup();
                            } catch (Throwable unused) {
                            }
                            ObjectCleaner.LIVE_SET.remove(automaticCleanerReference);
                        }
                    } catch (InterruptedException unused2) {
                        z = true;
                    }
                } else {
                    ObjectCleaner.CLEANER_RUNNING.set(false);
                    if (ObjectCleaner.LIVE_SET.isEmpty() || !ObjectCleaner.CLEANER_RUNNING.compareAndSet(false, true)) {
                        break;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    };

    public static void register(Object obj, Runnable runnable) {
        LIVE_SET.add(new AutomaticCleanerReference(obj, (Runnable) ObjectUtil.checkNotNull(runnable, "cleanupTask")));
        if (CLEANER_RUNNING.compareAndSet(false, true)) {
            final FastThreadLocalThread fastThreadLocalThread = new FastThreadLocalThread(CLEANER_TASK);
            fastThreadLocalThread.setPriority(1);
            AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: io.grpc.netty.shaded.io.netty.util.internal.ObjectCleaner.2
                @Override // java.security.PrivilegedAction
                public Void run() {
                    fastThreadLocalThread.setContextClassLoader(null);
                    return null;
                }
            });
            fastThreadLocalThread.setName(CLEANER_THREAD_NAME);
            fastThreadLocalThread.setDaemon(true);
            fastThreadLocalThread.start();
        }
    }

    public static int getLiveSetCount() {
        return LIVE_SET.size();
    }

    private ObjectCleaner() {
    }

    /* loaded from: classes4.dex */
    private static final class AutomaticCleanerReference extends WeakReference<Object> {
        private final Runnable cleanupTask;

        @Override // java.lang.ref.Reference
        public Thread get() {
            return null;
        }

        AutomaticCleanerReference(Object obj, Runnable runnable) {
            super(obj, ObjectCleaner.REFERENCE_QUEUE);
            this.cleanupTask = runnable;
        }

        void cleanup() {
            this.cleanupTask.run();
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            ObjectCleaner.LIVE_SET.remove(this);
            super.clear();
        }
    }
}
