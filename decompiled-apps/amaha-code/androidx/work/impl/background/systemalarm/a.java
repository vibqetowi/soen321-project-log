package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.l;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import androidx.work.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n2.t;
import v2.i;
import v2.j;
import v2.s;
/* compiled from: CommandHandler.java */
/* loaded from: classes.dex */
public final class a implements n2.c {

    /* renamed from: y  reason: collision with root package name */
    public static final String f3265y = q.f("CommandHandler");

    /* renamed from: u  reason: collision with root package name */
    public final Context f3266u;

    /* renamed from: v  reason: collision with root package name */
    public final HashMap f3267v = new HashMap();

    /* renamed from: w  reason: collision with root package name */
    public final Object f3268w = new Object();

    /* renamed from: x  reason: collision with root package name */
    public final l f3269x;

    public a(Context context, l lVar) {
        this.f3266u = context;
        this.f3269x = lVar;
    }

    public static v2.l d(Intent intent) {
        return new v2.l(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void e(Intent intent, v2.l lVar) {
        intent.putExtra("KEY_WORKSPEC_ID", lVar.f34722a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", lVar.f34723b);
    }

    @Override // n2.c
    public final void a(v2.l lVar, boolean z10) {
        synchronized (this.f3268w) {
            c cVar = (c) this.f3267v.remove(lVar);
            this.f3269x.u(lVar);
            if (cVar != null) {
                cVar.g(z10);
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f3268w) {
            if (!this.f3267v.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c(int i6, Intent intent, d dVar) {
        boolean z10;
        List<t> list;
        boolean z11;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            q.d().a(f3265y, "Handling constraints changed " + intent);
            b bVar = new b(this.f3266u, i6, dVar);
            ArrayList<s> i10 = dVar.f3284y.f25794c.u().i();
            String str = ConstraintProxy.f3256a;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            for (s sVar : i10) {
                androidx.work.c cVar = sVar.f34742j;
                z12 |= cVar.f3228d;
                z13 |= cVar.f3226b;
                z14 |= cVar.f3229e;
                if (cVar.f3225a != 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z15 |= z11;
                if (z12 && z13 && z14 && z15) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f3257a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = bVar.f3271a;
            intent2.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z13).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z14).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z15);
            context.sendBroadcast(intent2);
            r2.d dVar2 = bVar.f3273c;
            dVar2.d(i10);
            ArrayList arrayList = new ArrayList(i10.size());
            long currentTimeMillis = System.currentTimeMillis();
            for (s sVar2 : i10) {
                String str3 = sVar2.f34734a;
                if (currentTimeMillis >= sVar2.a() && (!sVar2.b() || dVar2.c(str3))) {
                    arrayList.add(sVar2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                s sVar3 = (s) it.next();
                String str4 = sVar3.f34734a;
                v2.l a02 = ca.a.a0(sVar3);
                Intent intent3 = new Intent(context, SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                e(intent3, a02);
                q.d().a(b.f3270d, defpackage.b.m("Creating a delay_met command for workSpec with id (", str4, ")"));
                ((y2.b) dVar.f3281v).f38190c.execute(new d.b(bVar.f3272b, intent3, dVar));
            }
            dVar2.e();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            q.d().a(f3265y, "Handling reschedule " + intent + ", " + i6);
            dVar.f3284y.i();
        } else {
            Bundle extras = intent.getExtras();
            String[] strArr = {"KEY_WORKSPEC_ID"};
            if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                q.d().b(f3265y, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                v2.l d10 = d(intent);
                String str5 = f3265y;
                q.d().a(str5, "Handling schedule work for " + d10);
                WorkDatabase workDatabase = dVar.f3284y.f25794c;
                workDatabase.c();
                try {
                    s p10 = workDatabase.u().p(d10.f34722a);
                    if (p10 == null) {
                        q.d().g(str5, "Skipping scheduling " + d10 + " because it's no longer in the DB");
                    } else if (p10.f34735b.d()) {
                        q.d().g(str5, "Skipping scheduling " + d10 + "because it is finished.");
                    } else {
                        long a10 = p10.a();
                        boolean b10 = p10.b();
                        Context context2 = this.f3266u;
                        if (!b10) {
                            q.d().a(str5, "Setting up Alarms for " + d10 + "at " + a10);
                            p2.a.b(context2, workDatabase, d10, a10);
                        } else {
                            q.d().a(str5, "Opportunistically setting an alarm for " + d10 + "at " + a10);
                            p2.a.b(context2, workDatabase, d10, a10);
                            Intent intent4 = new Intent(context2, SystemAlarmService.class);
                            intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                            ((y2.b) dVar.f3281v).f38190c.execute(new d.b(i6, intent4, dVar));
                        }
                        workDatabase.n();
                    }
                } finally {
                    workDatabase.j();
                }
            } else if ("ACTION_DELAY_MET".equals(action)) {
                synchronized (this.f3268w) {
                    v2.l d11 = d(intent);
                    q d12 = q.d();
                    String str6 = f3265y;
                    d12.a(str6, "Handing delay met for " + d11);
                    if (!this.f3267v.containsKey(d11)) {
                        c cVar2 = new c(this.f3266u, i6, dVar, this.f3269x.x(d11));
                        this.f3267v.put(d11, cVar2);
                        cVar2.d();
                    } else {
                        q.d().a(str6, "WorkSpec " + d11 + " is is already being handled for ACTION_DELAY_MET");
                    }
                }
            } else if ("ACTION_STOP_WORK".equals(action)) {
                Bundle extras2 = intent.getExtras();
                String string = extras2.getString("KEY_WORKSPEC_ID");
                boolean containsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
                l lVar = this.f3269x;
                if (containsKey) {
                    int i11 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                    ArrayList arrayList2 = new ArrayList(1);
                    t u10 = lVar.u(new v2.l(string, i11));
                    list = arrayList2;
                    if (u10 != null) {
                        arrayList2.add(u10);
                        list = arrayList2;
                    }
                } else {
                    list = lVar.t(string);
                }
                for (t tVar : list) {
                    q.d().a(f3265y, defpackage.c.r("Handing stopWork work for ", string));
                    dVar.f3284y.k(tVar);
                    WorkDatabase workDatabase2 = dVar.f3284y.f25794c;
                    v2.l lVar2 = tVar.f25851a;
                    String str7 = p2.a.f27868a;
                    j r = workDatabase2.r();
                    i c10 = r.c(lVar2);
                    if (c10 != null) {
                        p2.a.a(this.f3266u, lVar2, c10.f34717c);
                        q.d().a(p2.a.f27868a, "Removing SystemIdInfo for workSpecId (" + lVar2 + ")");
                        r.a(lVar2);
                    }
                    dVar.a(tVar.f25851a, false);
                }
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                v2.l d13 = d(intent);
                boolean z16 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                q.d().a(f3265y, "Handling onExecutionCompleted " + intent + ", " + i6);
                a(d13, z16);
            } else {
                q.d().g(f3265y, "Ignoring intent " + intent);
            }
        }
    }
}
