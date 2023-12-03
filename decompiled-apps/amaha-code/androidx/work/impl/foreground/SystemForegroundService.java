package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.s;
import androidx.work.impl.foreground.a;
import androidx.work.q;
import java.util.UUID;
import n2.a0;
/* loaded from: classes.dex */
public class SystemForegroundService extends s implements a.InterfaceC0042a {

    /* renamed from: z  reason: collision with root package name */
    public static final String f3296z = q.f("SystemFgService");

    /* renamed from: v  reason: collision with root package name */
    public Handler f3297v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3298w;

    /* renamed from: x  reason: collision with root package name */
    public androidx.work.impl.foreground.a f3299x;

    /* renamed from: y  reason: collision with root package name */
    public NotificationManager f3300y;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(Service service, int i6, Notification notification, int i10) {
            service.startForeground(i6, notification, i10);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(Service service, int i6, Notification notification, int i10) {
            try {
                service.startForeground(i6, notification, i10);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                q d10 = q.d();
                String str = SystemForegroundService.f3296z;
                if (((q.a) d10).f3335c <= 5) {
                    Log.w(str, "Unable to start foreground service", e10);
                }
            }
        }
    }

    public final void a() {
        this.f3297v = new Handler(Looper.getMainLooper());
        this.f3300y = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f3299x = aVar;
        if (aVar.C != null) {
            q.d().b(androidx.work.impl.foreground.a.D, "A callback already exists.");
        } else {
            aVar.C = this;
        }
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        androidx.work.impl.foreground.a aVar = this.f3299x;
        aVar.C = null;
        synchronized (aVar.f3303w) {
            aVar.B.e();
        }
        aVar.f3301u.f.g(aVar);
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public final int onStartCommand(Intent intent, int i6, int i10) {
        super.onStartCommand(intent, i6, i10);
        boolean z10 = this.f3298w;
        String str = f3296z;
        if (z10) {
            q.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            androidx.work.impl.foreground.a aVar = this.f3299x;
            aVar.C = null;
            synchronized (aVar.f3303w) {
                aVar.B.e();
            }
            aVar.f3301u.f.g(aVar);
            a();
            this.f3298w = false;
        }
        if (intent != null) {
            androidx.work.impl.foreground.a aVar2 = this.f3299x;
            aVar2.getClass();
            String action = intent.getAction();
            boolean equals = "ACTION_START_FOREGROUND".equals(action);
            String str2 = androidx.work.impl.foreground.a.D;
            if (equals) {
                q d10 = q.d();
                d10.e(str2, "Started foreground service " + intent);
                ((y2.b) aVar2.f3302v).a(new u2.b(aVar2, intent.getStringExtra("KEY_WORKSPEC_ID")));
                aVar2.d(intent);
                return 3;
            } else if ("ACTION_NOTIFY".equals(action)) {
                aVar2.d(intent);
                return 3;
            } else if ("ACTION_CANCEL_WORK".equals(action)) {
                q d11 = q.d();
                d11.e(str2, "Stopping foreground work for " + intent);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    UUID fromString = UUID.fromString(stringExtra);
                    a0 a0Var = aVar2.f3301u;
                    a0Var.getClass();
                    ((y2.b) a0Var.f25795d).a(new w2.b(a0Var, fromString));
                    return 3;
                }
                return 3;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                q.d().e(str2, "Stopping foreground service");
                a.InterfaceC0042a interfaceC0042a = aVar2.C;
                if (interfaceC0042a != null) {
                    SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0042a;
                    systemForegroundService.f3298w = true;
                    q.d().a(str, "All commands completed.");
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf();
                    return 3;
                }
                return 3;
            } else {
                return 3;
            }
        }
        return 3;
    }
}
