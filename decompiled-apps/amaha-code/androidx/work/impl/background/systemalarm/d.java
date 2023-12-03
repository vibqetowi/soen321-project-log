package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.appcompat.widget.l;
import androidx.work.q;
import java.util.ArrayList;
import java.util.Iterator;
import n2.a0;
import n2.p;
import w2.o;
import w2.s;
import w2.z;
import y2.b;
/* compiled from: SystemAlarmDispatcher.java */
/* loaded from: classes.dex */
public final class d implements n2.c {
    public static final String D = q.f("SystemAlarmDispatcher");
    public final ArrayList A;
    public Intent B;
    public c C;

    /* renamed from: u  reason: collision with root package name */
    public final Context f3280u;

    /* renamed from: v  reason: collision with root package name */
    public final y2.a f3281v;

    /* renamed from: w  reason: collision with root package name */
    public final z f3282w;

    /* renamed from: x  reason: collision with root package name */
    public final p f3283x;

    /* renamed from: y  reason: collision with root package name */
    public final a0 f3284y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.work.impl.background.systemalarm.a f3285z;

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.a aVar;
            RunnableC0041d runnableC0041d;
            synchronized (d.this.A) {
                d dVar = d.this;
                dVar.B = (Intent) dVar.A.get(0);
            }
            Intent intent = d.this.B;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.B.getIntExtra("KEY_START_ID", 0);
                q d10 = q.d();
                String str = d.D;
                d10.a(str, "Processing command " + d.this.B + ", " + intExtra);
                Context context = d.this.f3280u;
                PowerManager.WakeLock a10 = s.a(context, action + " (" + intExtra + ")");
                try {
                    q d11 = q.d();
                    d11.a(str, "Acquiring operation wake lock (" + action + ") " + a10);
                    a10.acquire();
                    d dVar2 = d.this;
                    dVar2.f3285z.c(intExtra, dVar2.B, dVar2);
                    q d12 = q.d();
                    d12.a(str, "Releasing operation wake lock (" + action + ") " + a10);
                    a10.release();
                    d dVar3 = d.this;
                    aVar = ((y2.b) dVar3.f3281v).f38190c;
                    runnableC0041d = new RunnableC0041d(dVar3);
                } catch (Throwable th2) {
                    try {
                        q d13 = q.d();
                        String str2 = d.D;
                        d13.c(str2, "Unexpected error in onHandleIntent", th2);
                        q d14 = q.d();
                        d14.a(str2, "Releasing operation wake lock (" + action + ") " + a10);
                        a10.release();
                        d dVar4 = d.this;
                        aVar = ((y2.b) dVar4.f3281v).f38190c;
                        runnableC0041d = new RunnableC0041d(dVar4);
                    } catch (Throwable th3) {
                        q d15 = q.d();
                        String str3 = d.D;
                        d15.a(str3, "Releasing operation wake lock (" + action + ") " + a10);
                        a10.release();
                        d dVar5 = d.this;
                        ((y2.b) dVar5.f3281v).f38190c.execute(new RunnableC0041d(dVar5));
                        throw th3;
                    }
                }
                aVar.execute(runnableC0041d);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final d f3287u;

        /* renamed from: v  reason: collision with root package name */
        public final Intent f3288v;

        /* renamed from: w  reason: collision with root package name */
        public final int f3289w;

        public b(int i6, Intent intent, d dVar) {
            this.f3287u = dVar;
            this.f3288v = intent;
            this.f3289w = i6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3287u.b(this.f3288v, this.f3289w);
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* renamed from: androidx.work.impl.background.systemalarm.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0041d implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final d f3290u;

        public RunnableC0041d(d dVar) {
            this.f3290u = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = this.f3290u;
            dVar.getClass();
            q d10 = q.d();
            String str = d.D;
            d10.a(str, "Checking if commands are complete.");
            d.c();
            synchronized (dVar.A) {
                if (dVar.B != null) {
                    q d11 = q.d();
                    d11.a(str, "Removing command " + dVar.B);
                    if (((Intent) dVar.A.remove(0)).equals(dVar.B)) {
                        dVar.B = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                o oVar = ((y2.b) dVar.f3281v).f38188a;
                if (!dVar.f3285z.b() && dVar.A.isEmpty() && !oVar.a()) {
                    q.d().a(str, "No more commands & intents.");
                    c cVar = dVar.C;
                    if (cVar != null) {
                        ((SystemAlarmService) cVar).a();
                    }
                } else if (!dVar.A.isEmpty()) {
                    dVar.e();
                }
            }
        }
    }

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f3280u = applicationContext;
        this.f3285z = new androidx.work.impl.background.systemalarm.a(applicationContext, new l(2));
        a0 e10 = a0.e(context);
        this.f3284y = e10;
        this.f3282w = new z(e10.f25793b.f3218e);
        p pVar = e10.f;
        this.f3283x = pVar;
        this.f3281v = e10.f25795d;
        pVar.b(this);
        this.A = new ArrayList();
        this.B = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    @Override // n2.c
    public final void a(v2.l lVar, boolean z10) {
        b.a aVar = ((y2.b) this.f3281v).f38190c;
        String str = androidx.work.impl.background.systemalarm.a.f3265y;
        Intent intent = new Intent(this.f3280u, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        androidx.work.impl.background.systemalarm.a.e(intent, lVar);
        aVar.execute(new b(0, intent, this));
    }

    public final void b(Intent intent, int i6) {
        q d10 = q.d();
        String str = D;
        d10.a(str, "Adding command " + intent + " (" + i6 + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            q.d().g(str, "Unknown command. Ignoring");
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && d()) {
        } else {
            intent.putExtra("KEY_START_ID", i6);
            synchronized (this.A) {
                boolean z10 = !this.A.isEmpty();
                this.A.add(intent);
                if (!z10) {
                    e();
                }
            }
        }
    }

    public final boolean d() {
        c();
        synchronized (this.A) {
            Iterator it = this.A.iterator();
            while (it.hasNext()) {
                if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void e() {
        c();
        PowerManager.WakeLock a10 = s.a(this.f3280u, "ProcessCommand");
        try {
            a10.acquire();
            ((y2.b) this.f3284y.f25795d).a(new a());
        } finally {
            a10.release();
        }
    }
}
