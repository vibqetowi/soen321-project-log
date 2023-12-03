package f0;

import android.app.Application;
import f0.g;
/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Application f14618u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ g.a f14619v;

    public e(Application application, g.a aVar) {
        this.f14618u = application;
        this.f14619v = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14618u.unregisterActivityLifecycleCallbacks(this.f14619v);
    }
}
