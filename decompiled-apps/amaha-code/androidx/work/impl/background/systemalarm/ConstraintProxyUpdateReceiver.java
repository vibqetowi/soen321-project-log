package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.q;
import n2.a0;
import w2.l;
/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3257a = q.f("ConstrntProxyUpdtRecvr");

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Intent f3258u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Context f3259v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f3260w;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f3258u = intent;
            this.f3259v = context;
            this.f3260w = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.f3260w;
            Context context = this.f3259v;
            Intent intent = this.f3258u;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                q.d().a(ConstraintProxyUpdateReceiver.f3257a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                l.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                l.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                l.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                l.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            q.d().a(f3257a, defpackage.c.r("Ignoring unknown action ", str));
            return;
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        ((y2.b) a0.e(context).f25795d).a(new a(intent, context, goAsync));
    }
}
