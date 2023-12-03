package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.q;
import n2.a0;
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3261a = q.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        q d10 = q.d();
        String str = f3261a;
        d10.a(str, "Received intent " + intent);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                a0 e10 = a0.e(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                e10.getClass();
                synchronized (a0.f25791m) {
                    BroadcastReceiver.PendingResult pendingResult = e10.f25799i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    e10.f25799i = goAsync;
                    if (e10.f25798h) {
                        goAsync.finish();
                        e10.f25799i = null;
                    }
                }
                return;
            } catch (IllegalStateException e11) {
                q.d().c(f3261a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e11);
                return;
            }
        }
        String str2 = a.f3265y;
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_RESCHEDULE");
        context.startService(intent2);
    }
}
