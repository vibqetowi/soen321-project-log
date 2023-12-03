package nd;

import java.util.concurrent.Callable;
/* compiled from: CrashlyticsBackgroundWorker.java */
/* loaded from: classes.dex */
public final class h implements Callable<Void> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Runnable f26064u;

    public h(q qVar) {
        this.f26064u = qVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        this.f26064u.run();
        return null;
    }
}
