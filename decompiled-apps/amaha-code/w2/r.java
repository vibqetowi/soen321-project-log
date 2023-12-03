package w2;

import java.util.concurrent.Executor;
/* compiled from: SynchronousExecutor.java */
/* loaded from: classes.dex */
public final class r implements Executor {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f36321u;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f36321u) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
