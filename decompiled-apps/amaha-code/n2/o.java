package n2;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import hh.g;
import qg.g0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f25835u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f25836v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f25837w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f25838x;

    public /* synthetic */ o(int i6, Object obj, Object obj2) {
        this.f25835u = i6;
        this.f25837w = obj;
        this.f25838x = obj2;
        this.f25836v = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        Object systemService;
        String notificationDelegate;
        int i6 = this.f25835u;
        boolean z11 = this.f25836v;
        Object obj = this.f25838x;
        Object obj2 = this.f25837w;
        switch (i6) {
            case 0:
                ((p) obj2).a((v2.l) obj, z11);
                return;
            case 1:
                Context context = (Context) obj2;
                ya.i iVar = (ya.i) obj;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    } else {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context;
                        }
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        systemService = context.getSystemService(NotificationManager.class);
                        NotificationManager notificationManager = (NotificationManager) systemService;
                        if (!z11) {
                            notificationDelegate = notificationManager.getNotificationDelegate();
                            if ("com.google.android.gms".equals(notificationDelegate)) {
                                notificationManager.setNotificationDelegate(null);
                            }
                        } else {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        }
                    }
                    return;
                } finally {
                    iVar.d(null);
                }
            case 2:
                qg.g this$0 = (qg.g) obj2;
                Context context2 = (Context) obj;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(context2, "$context");
                this$0.f29549d.a(z11, context2);
                return;
            default:
                Context context3 = (Context) obj2;
                Bundle bundle = (Bundle) obj;
                kotlin.jvm.internal.i.g(context3, "$context");
                try {
                    for (ih.p pVar : g0.f29557b.values()) {
                        new kj.a(pVar).d(context3, z11, "dialog", bundle);
                    }
                    return;
                } catch (Throwable th2) {
                    hh.a aVar = hh.g.f17610d;
                    g.a.a(1, th2, kj.i.f23374u);
                    return;
                }
        }
    }

    public /* synthetic */ o(Context context, boolean z10, Object obj, int i6) {
        this.f25835u = i6;
        this.f25837w = context;
        this.f25836v = z10;
        this.f25838x = obj;
    }
}
