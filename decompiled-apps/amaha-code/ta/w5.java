package ta;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class w5 extends y5 {

    /* renamed from: x  reason: collision with root package name */
    public final AlarmManager f32933x;

    /* renamed from: y  reason: collision with root package name */
    public t5 f32934y;

    /* renamed from: z  reason: collision with root package name */
    public Integer f32935z;

    public w5(d6 d6Var) {
        super(d6Var);
        this.f32933x = (AlarmManager) this.f32943u.f32953u.getSystemService("alarm");
    }

    @Override // ta.y5
    public final void k() {
        JobScheduler jobScheduler;
        AlarmManager alarmManager = this.f32933x;
        if (alarmManager != null) {
            alarmManager.cancel(n());
        }
        if (Build.VERSION.SDK_INT >= 24 && (jobScheduler = (JobScheduler) this.f32943u.f32953u.getSystemService("jobscheduler")) != null) {
            jobScheduler.cancel(m());
        }
    }

    public final void l() {
        JobScheduler jobScheduler;
        i();
        y3 y3Var = this.f32943u;
        w2 w2Var = y3Var.C;
        y3.k(w2Var);
        w2Var.H.b("Unscheduling upload");
        AlarmManager alarmManager = this.f32933x;
        if (alarmManager != null) {
            alarmManager.cancel(n());
        }
        o().a();
        if (Build.VERSION.SDK_INT >= 24 && (jobScheduler = (JobScheduler) y3Var.f32953u.getSystemService("jobscheduler")) != null) {
            jobScheduler.cancel(m());
        }
    }

    public final int m() {
        if (this.f32935z == null) {
            this.f32935z = Integer.valueOf("measurement".concat(String.valueOf(this.f32943u.f32953u.getPackageName())).hashCode());
        }
        return this.f32935z.intValue();
    }

    public final PendingIntent n() {
        Context context = this.f32943u.f32953u;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.d0.f8326a);
    }

    public final m o() {
        if (this.f32934y == null) {
            this.f32934y = new t5(this, this.f32947v.F, 1);
        }
        return this.f32934y;
    }
}
