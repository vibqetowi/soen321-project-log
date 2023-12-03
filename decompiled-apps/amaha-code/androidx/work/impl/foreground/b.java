package androidx.work.impl.foreground;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f3307u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Notification f3308v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f3309w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f3310x;

    public b(SystemForegroundService systemForegroundService, int i6, Notification notification, int i10) {
        this.f3310x = systemForegroundService;
        this.f3307u = i6;
        this.f3308v = notification;
        this.f3309w = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = Build.VERSION.SDK_INT;
        int i10 = this.f3309w;
        Notification notification = this.f3308v;
        int i11 = this.f3307u;
        SystemForegroundService systemForegroundService = this.f3310x;
        if (i6 >= 31) {
            SystemForegroundService.b.a(systemForegroundService, i11, notification, i10);
        } else if (i6 >= 29) {
            SystemForegroundService.a.a(systemForegroundService, i11, notification, i10);
        } else {
            systemForegroundService.startForeground(i11, notification);
        }
    }
}
