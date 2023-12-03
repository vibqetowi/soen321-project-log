package vr;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: SerializeReentrantCallsDirectExecutor.java */
/* loaded from: classes2.dex */
public final class z2 implements Executor {

    /* renamed from: w  reason: collision with root package name */
    public static final Logger f36131w = Logger.getLogger(z2.class.getName());

    /* renamed from: u  reason: collision with root package name */
    public boolean f36132u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayDeque<Runnable> f36133v;

    public final void a() {
        while (true) {
            Runnable poll = this.f36133v.poll();
            if (poll != null) {
                try {
                    poll.run();
                } catch (Throwable th2) {
                    Level level = Level.SEVERE;
                    f36131w.log(level, "Exception while executing runnable " + poll, th2);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r6.f36133v != null) goto L11;
     */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void execute(Runnable runnable) {
        sc.b.w(runnable, "'task' must not be null.");
        if (!this.f36132u) {
            this.f36132u = true;
            try {
                runnable.run();
            } catch (Throwable th2) {
                try {
                    Logger logger = f36131w;
                    Level level = Level.SEVERE;
                    logger.log(level, "Exception while executing runnable " + runnable, th2);
                } finally {
                    if (this.f36133v != null) {
                        a();
                    }
                    this.f36132u = false;
                }
            }
        } else {
            if (this.f36133v == null) {
                this.f36133v = new ArrayDeque<>(4);
            }
            this.f36133v.add(runnable);
        }
    }
}
