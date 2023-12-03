package r9;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import ya.v;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class o {
    public static o f;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30638a;

    /* renamed from: b  reason: collision with root package name */
    public int f30639b;

    /* renamed from: c  reason: collision with root package name */
    public Object f30640c;

    /* renamed from: d  reason: collision with root package name */
    public Object f30641d;

    /* renamed from: e  reason: collision with root package name */
    public Object f30642e;

    public o(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f30638a = 0;
        this.f30642e = new l(this);
        this.f30639b = 1;
        this.f30641d = scheduledExecutorService;
        this.f30640c = context.getApplicationContext();
    }

    public static synchronized o a(Context context) {
        o oVar;
        synchronized (o.class) {
            if (f == null) {
                f = new o(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ba.a("MessengerIpcClient"))));
            }
            oVar = f;
        }
        return oVar;
    }

    public final synchronized int b() {
        int i6;
        i6 = this.f30639b;
        this.f30639b = i6 + 1;
        return i6;
    }

    public final synchronized v c(m mVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(mVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
            sb2.append("Queueing ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        if (!((l) this.f30642e).d(mVar)) {
            l lVar = new l(this);
            this.f30642e = lVar;
            lVar.d(mVar);
        }
        return mVar.f30635b.f38392a;
    }

    public final String toString() {
        switch (this.f30638a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("ConfigChangeMeta(lastShownCampaign=");
                sb2.append((pi.d) this.f30640c);
                sb2.append(", activityName=");
                sb2.append((Object) ((String) this.f30641d));
                sb2.append(", activityOrientation=");
                return defpackage.c.s(sb2, this.f30639b, ')');
            default:
                return super.toString();
        }
    }

    public o() {
        this.f30638a = 1;
        this.f30639b = -1;
    }
}
