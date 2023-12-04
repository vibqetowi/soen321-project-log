package io.grpc.internal;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes4.dex */
class SerializeReentrantCallsDirectExecutor implements Executor {
    private static final Logger log = Logger.getLogger(SerializeReentrantCallsDirectExecutor.class.getName());
    private boolean executing;
    private ArrayDeque<Runnable> taskQueue;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r6.taskQueue == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void execute(Runnable runnable) {
        Preconditions.checkNotNull(runnable, "'task' must not be null.");
        if (!this.executing) {
            this.executing = true;
            try {
                runnable.run();
            } catch (Throwable th) {
                try {
                    Logger logger = log;
                    Level level = Level.SEVERE;
                    logger.log(level, "Exception while executing runnable " + runnable, th);
                } finally {
                    if (this.taskQueue != null) {
                        completeQueuedTasks();
                    }
                    this.executing = false;
                }
            }
        } else {
            enqueue(runnable);
        }
    }

    private void completeQueuedTasks() {
        while (true) {
            Runnable poll = this.taskQueue.poll();
            if (poll == null) {
                return;
            }
            try {
                poll.run();
            } catch (Throwable th) {
                Logger logger = log;
                Level level = Level.SEVERE;
                logger.log(level, "Exception while executing runnable " + poll, th);
            }
        }
    }

    private void enqueue(Runnable runnable) {
        if (this.taskQueue == null) {
            this.taskQueue = new ArrayDeque<>(4);
        }
        this.taskQueue.add(runnable);
    }
}
