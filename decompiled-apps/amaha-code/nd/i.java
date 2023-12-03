package nd;

import java.util.concurrent.Callable;
/* compiled from: CrashlyticsBackgroundWorker.java */
/* loaded from: classes.dex */
public final class i implements ya.b<Void, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Callable f26072u;

    public i(Callable callable) {
        this.f26072u = callable;
    }

    @Override // ya.b
    public final Object then(ya.h<Void> hVar) {
        return this.f26072u.call();
    }
}
