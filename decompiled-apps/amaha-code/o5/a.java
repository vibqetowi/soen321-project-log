package o5;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import h5.p;
/* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
/* loaded from: classes.dex */
public final class a implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.i.g(service, "service");
        c cVar = c.f27119a;
        f fVar = f.f27154a;
        Context a10 = p.a();
        Object obj = null;
        if (!b6.a.b(f.class)) {
            try {
                obj = f.f27154a.h(a10, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{service});
            } catch (Throwable th2) {
                b6.a.a(f.class, th2);
            }
        }
        c.f27126i = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        kotlin.jvm.internal.i.g(name, "name");
    }
}
