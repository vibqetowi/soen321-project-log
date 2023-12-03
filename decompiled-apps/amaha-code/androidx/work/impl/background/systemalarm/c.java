package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import androidx.work.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n2.t;
import v.g;
import v2.l;
import w2.o;
import w2.s;
import w2.z;
import y2.b;
/* compiled from: DelayMetCommandHandler.java */
/* loaded from: classes.dex */
public final class c implements r2.c, z.a {
    public static final String G = q.f("DelayMetCommandHandler");
    public int A;
    public final o B;
    public final b.a C;
    public PowerManager.WakeLock D;
    public boolean E;
    public final t F;

    /* renamed from: u  reason: collision with root package name */
    public final Context f3274u;

    /* renamed from: v  reason: collision with root package name */
    public final int f3275v;

    /* renamed from: w  reason: collision with root package name */
    public final l f3276w;

    /* renamed from: x  reason: collision with root package name */
    public final d f3277x;

    /* renamed from: y  reason: collision with root package name */
    public final r2.d f3278y;

    /* renamed from: z  reason: collision with root package name */
    public final Object f3279z;

    public c(Context context, int i6, d dVar, t tVar) {
        this.f3274u = context;
        this.f3275v = i6;
        this.f3277x = dVar;
        this.f3276w = tVar.f25851a;
        this.F = tVar;
        v.c cVar = dVar.f3284y.f25800j;
        y2.b bVar = (y2.b) dVar.f3281v;
        this.B = bVar.f38188a;
        this.C = bVar.f38190c;
        this.f3278y = new r2.d(cVar, this);
        this.E = false;
        this.A = 0;
        this.f3279z = new Object();
    }

    public static void b(c cVar) {
        l lVar = cVar.f3276w;
        String str = lVar.f34722a;
        int i6 = cVar.A;
        String str2 = G;
        if (i6 < 2) {
            cVar.A = 2;
            q d10 = q.d();
            d10.a(str2, "Stopping work for WorkSpec " + str);
            String str3 = a.f3265y;
            Context context = cVar.f3274u;
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_STOP_WORK");
            a.e(intent, lVar);
            int i10 = cVar.f3275v;
            d dVar = cVar.f3277x;
            d.b bVar = new d.b(i10, intent, dVar);
            b.a aVar = cVar.C;
            aVar.execute(bVar);
            if (dVar.f3283x.f(lVar.f34722a)) {
                q d11 = q.d();
                d11.a(str2, "WorkSpec " + str + " needs to be rescheduled");
                Intent intent2 = new Intent(context, SystemAlarmService.class);
                intent2.setAction("ACTION_SCHEDULE_WORK");
                a.e(intent2, lVar);
                aVar.execute(new d.b(i10, intent2, dVar));
                return;
            }
            q d12 = q.d();
            d12.a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        q d13 = q.d();
        d13.a(str2, "Already stopped work for " + str);
    }

    @Override // w2.z.a
    public final void a(l lVar) {
        q d10 = q.d();
        d10.a(G, "Exceeded time limits on execution for " + lVar);
        this.B.execute(new p2.b(this, 0));
    }

    public final void c() {
        synchronized (this.f3279z) {
            this.f3278y.e();
            this.f3277x.f3282w.a(this.f3276w);
            PowerManager.WakeLock wakeLock = this.D;
            if (wakeLock != null && wakeLock.isHeld()) {
                q d10 = q.d();
                String str = G;
                d10.a(str, "Releasing wakelock " + this.D + "for WorkSpec " + this.f3276w);
                this.D.release();
            }
        }
    }

    public final void d() {
        String str = this.f3276w.f34722a;
        this.D = s.a(this.f3274u, pl.a.g(g.d(str, " ("), this.f3275v, ")"));
        String str2 = G;
        q.d().a(str2, "Acquiring wakelock " + this.D + "for WorkSpec " + str);
        this.D.acquire();
        v2.s p10 = this.f3277x.f3284y.f25794c.u().p(str);
        if (p10 == null) {
            this.B.execute(new p2.b(this, 2));
            return;
        }
        boolean b10 = p10.b();
        this.E = b10;
        if (!b10) {
            q.d().a(str2, "No constraints for " + str);
            f(Collections.singletonList(p10));
            return;
        }
        this.f3278y.d(Collections.singletonList(p10));
    }

    @Override // r2.c
    public final void e(ArrayList arrayList) {
        this.B.execute(new p2.b(this, 1));
    }

    @Override // r2.c
    public final void f(List<v2.s> list) {
        for (v2.s sVar : list) {
            if (ca.a.a0(sVar).equals(this.f3276w)) {
                this.B.execute(new p2.b(this, 3));
                return;
            }
        }
    }

    public final void g(boolean z10) {
        q d10 = q.d();
        StringBuilder sb2 = new StringBuilder("onExecuted ");
        l lVar = this.f3276w;
        sb2.append(lVar);
        sb2.append(", ");
        sb2.append(z10);
        d10.a(G, sb2.toString());
        c();
        int i6 = this.f3275v;
        d dVar = this.f3277x;
        b.a aVar = this.C;
        Context context = this.f3274u;
        if (z10) {
            String str = a.f3265y;
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            a.e(intent, lVar);
            aVar.execute(new d.b(i6, intent, dVar));
        }
        if (this.E) {
            String str2 = a.f3265y;
            Intent intent2 = new Intent(context, SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            aVar.execute(new d.b(i6, intent2, dVar));
        }
    }
}
