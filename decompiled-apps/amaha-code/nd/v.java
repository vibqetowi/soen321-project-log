package nd;

import java.util.concurrent.Callable;
/* compiled from: CrashlyticsCore.java */
/* loaded from: classes.dex */
public final class v implements Callable<ya.h<Void>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ud.f f26128u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ x f26129v;

    public v(x xVar, ud.d dVar) {
        this.f26129v = xVar;
        this.f26128u = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final ya.h<Void> call() {
        return x.a(this.f26129v, this.f26128u);
    }
}
