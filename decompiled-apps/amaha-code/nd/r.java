package nd;

import java.util.concurrent.Callable;
/* compiled from: CrashlyticsController.java */
/* loaded from: classes.dex */
public final class r implements Callable<Void> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f26107u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t f26108v;

    public r(t tVar, String str) {
        this.f26108v = tVar;
        this.f26107u = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        t.a(this.f26108v, this.f26107u);
        return null;
    }
}
