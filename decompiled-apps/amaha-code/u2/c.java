package u2;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;
/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f33760u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Notification f33761v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f33762w;

    public c(SystemForegroundService systemForegroundService, int i6, Notification notification) {
        this.f33762w = systemForegroundService;
        this.f33760u = i6;
        this.f33761v = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33762w.f3300y.notify(this.f33760u, this.f33761v);
    }
}
