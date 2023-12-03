package p2;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.q;
import n2.r;
import v2.l;
import v2.s;
/* compiled from: SystemAlarmScheduler.java */
/* loaded from: classes.dex */
public final class c implements r {

    /* renamed from: v  reason: collision with root package name */
    public static final String f27871v = q.f("SystemAlarmScheduler");

    /* renamed from: u  reason: collision with root package name */
    public final Context f27872u;

    public c(Context context) {
        this.f27872u = context.getApplicationContext();
    }

    @Override // n2.r
    public final void b(s... sVarArr) {
        for (s sVar : sVarArr) {
            q.d().a(f27871v, "Scheduling work with workSpecId " + sVar.f34734a);
            l a02 = ca.a.a0(sVar);
            String str = androidx.work.impl.background.systemalarm.a.f3265y;
            Context context = this.f27872u;
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            androidx.work.impl.background.systemalarm.a.e(intent, a02);
            context.startService(intent);
        }
    }

    @Override // n2.r
    public final boolean c() {
        return true;
    }

    @Override // n2.r
    public final void d(String str) {
        String str2 = androidx.work.impl.background.systemalarm.a.f3265y;
        Context context = this.f27872u;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        context.startService(intent);
    }
}
