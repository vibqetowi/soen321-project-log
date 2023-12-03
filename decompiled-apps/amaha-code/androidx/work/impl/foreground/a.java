package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.g;
import androidx.work.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n2.a0;
import n2.t;
import r2.c;
import r2.d;
import v2.l;
import v2.s;
/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: classes.dex */
public final class a implements c, n2.c {
    public static final String D = q.f("SystemFgDispatcher");
    public final HashSet A;
    public final d B;
    public InterfaceC0042a C;

    /* renamed from: u  reason: collision with root package name */
    public final a0 f3301u;

    /* renamed from: v  reason: collision with root package name */
    public final y2.a f3302v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f3303w = new Object();

    /* renamed from: x  reason: collision with root package name */
    public l f3304x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f3305y;

    /* renamed from: z  reason: collision with root package name */
    public final HashMap f3306z;

    /* compiled from: SystemForegroundDispatcher.java */
    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0042a {
    }

    public a(Context context) {
        a0 e10 = a0.e(context);
        this.f3301u = e10;
        this.f3302v = e10.f25795d;
        this.f3304x = null;
        this.f3305y = new LinkedHashMap();
        this.A = new HashSet();
        this.f3306z = new HashMap();
        this.B = new d(e10.f25800j, this);
        e10.f.b(this);
    }

    public static Intent b(Context context, l lVar, g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f3245a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f3246b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f3247c);
        intent.putExtra("KEY_WORKSPEC_ID", lVar.f34722a);
        intent.putExtra("KEY_GENERATION", lVar.f34723b);
        return intent;
    }

    public static Intent c(Context context, l lVar, g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", lVar.f34722a);
        intent.putExtra("KEY_GENERATION", lVar.f34723b);
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f3245a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f3246b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f3247c);
        return intent;
    }

    @Override // n2.c
    public final void a(l lVar, boolean z10) {
        boolean z11;
        Map.Entry entry;
        synchronized (this.f3303w) {
            try {
                s sVar = (s) this.f3306z.remove(lVar);
                if (sVar != null) {
                    z11 = this.A.remove(sVar);
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.B.d(this.A);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g gVar = (g) this.f3305y.remove(lVar);
        if (lVar.equals(this.f3304x) && this.f3305y.size() > 0) {
            Iterator it = this.f3305y.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f3304x = (l) entry.getKey();
            if (this.C != null) {
                g gVar2 = (g) entry.getValue();
                InterfaceC0042a interfaceC0042a = this.C;
                int i6 = gVar2.f3245a;
                int i10 = gVar2.f3246b;
                SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0042a;
                systemForegroundService.f3297v.post(new b(systemForegroundService, i6, gVar2.f3247c, i10));
                InterfaceC0042a interfaceC0042a2 = this.C;
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) interfaceC0042a2;
                systemForegroundService2.f3297v.post(new u2.d(systemForegroundService2, gVar2.f3245a));
            }
        }
        InterfaceC0042a interfaceC0042a3 = this.C;
        if (gVar != null && interfaceC0042a3 != null) {
            q d10 = q.d();
            String str = D;
            d10.a(str, "Removing Notification (id: " + gVar.f3245a + ", workSpecId: " + lVar + ", notificationType: " + gVar.f3246b);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC0042a3;
            systemForegroundService3.f3297v.post(new u2.d(systemForegroundService3, gVar.f3245a));
        }
    }

    public final void d(Intent intent) {
        int i6 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        l lVar = new l(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        q d10 = q.d();
        StringBuilder sb2 = new StringBuilder("Notifying with (id:");
        sb2.append(intExtra);
        sb2.append(", workSpecId: ");
        sb2.append(stringExtra);
        sb2.append(", notificationType :");
        d10.a(D, pl.a.g(sb2, intExtra2, ")"));
        if (notification != null && this.C != null) {
            g gVar = new g(intExtra, intExtra2, notification);
            LinkedHashMap linkedHashMap = this.f3305y;
            linkedHashMap.put(lVar, gVar);
            if (this.f3304x == null) {
                this.f3304x = lVar;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.C;
                systemForegroundService.f3297v.post(new b(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.C;
            systemForegroundService2.f3297v.post(new u2.c(systemForegroundService2, intExtra, notification));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    i6 |= ((g) entry.getValue()).f3246b;
                }
                g gVar2 = (g) linkedHashMap.get(this.f3304x);
                if (gVar2 != null) {
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.C;
                    systemForegroundService3.f3297v.post(new b(systemForegroundService3, gVar2.f3245a, gVar2.f3247c, i6));
                }
            }
        }
    }

    @Override // r2.c
    public final void e(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                s sVar = (s) it.next();
                String str = sVar.f34734a;
                q.d().a(D, c.r("Constraints unmet for WorkSpec ", str));
                l a02 = ca.a.a0(sVar);
                a0 a0Var = this.f3301u;
                ((y2.b) a0Var.f25795d).a(new w2.q(a0Var, new t(a02), true));
            }
        }
    }

    @Override // r2.c
    public final void f(List<s> list) {
    }
}
