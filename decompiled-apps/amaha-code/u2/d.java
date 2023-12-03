package u2;

import androidx.work.impl.foreground.SystemForegroundService;
/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f33763u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f33764v;

    public d(SystemForegroundService systemForegroundService, int i6) {
        this.f33764v = systemForegroundService;
        this.f33763u = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33764v.f3300y.cancel(this.f33763u);
    }
}
