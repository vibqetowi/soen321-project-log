package q5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import h5.g0;
import h5.p;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import w5.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f29130u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f29131v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f29132w;

    public /* synthetic */ a(String str, long j10, int i6) {
        this.f29130u = i6;
        this.f29131v = j10;
        this.f29132w = str;
    }

    private final void a() {
        long j10 = this.f29131v;
        String activityName = this.f29132w;
        kotlin.jvm.internal.i.g(activityName, "$activityName");
        if (c.f29142g == null) {
            c.f29142g = new j(Long.valueOf(j10), null);
        }
        if (c.f.get() <= 0) {
            k kVar = k.f29174a;
            k.c(activityName, c.f29142g, c.f29144i);
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(p.a()).edit();
            edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            edit.remove("com.facebook.appevents.SessionInfo.sessionId");
            edit.apply();
            SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(p.a()).edit();
            edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            edit2.apply();
            c.f29142g = null;
        }
        synchronized (c.f29141e) {
            c.f29140d = null;
            hs.k kVar2 = hs.k.f19476a;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        int i6;
        switch (this.f29130u) {
            case 0:
                long j11 = this.f29131v;
                String activityName = this.f29132w;
                kotlin.jvm.internal.i.g(activityName, "$activityName");
                if (c.f29142g == null) {
                    c.f29142g = new j(Long.valueOf(j11), null);
                }
                j jVar = c.f29142g;
                if (jVar != null) {
                    jVar.f29170b = Long.valueOf(j11);
                }
                if (c.f.get() <= 0) {
                    a aVar = new a(activityName, j11, 1);
                    synchronized (c.f29141e) {
                        ScheduledExecutorService scheduledExecutorService = c.f29139c;
                        c.f29137a.getClass();
                        w5.p pVar = w5.p.f36526a;
                        o b10 = w5.p.b(p.b());
                        if (b10 == null) {
                            i6 = 60;
                        } else {
                            i6 = b10.f36513b;
                        }
                        c.f29140d = scheduledExecutorService.schedule(aVar, i6, TimeUnit.SECONDS);
                        hs.k kVar = hs.k.f19476a;
                    }
                }
                long j12 = c.f29145j;
                if (j12 > 0) {
                    j10 = (j11 - j12) / 1000;
                } else {
                    j10 = 0;
                }
                f fVar = f.f29153a;
                Context a10 = p.a();
                o f = w5.p.f(p.b(), false);
                if (f != null && f.f36516e && j10 > 0) {
                    i5.i iVar = new i5.i(a10, (String) null);
                    Bundle bundle = new Bundle(1);
                    bundle.putCharSequence("fb_aa_time_spent_view_name", activityName);
                    double d10 = j10;
                    if (g0.b() && !b6.a.b(iVar)) {
                        try {
                            iVar.e("fb_aa_time_spent_on_view", Double.valueOf(d10), bundle, false, c.a());
                        } catch (Throwable th2) {
                            b6.a.a(iVar, th2);
                        }
                    }
                }
                j jVar2 = c.f29142g;
                if (jVar2 != null) {
                    jVar2.a();
                    return;
                }
                return;
            default:
                a();
                return;
        }
    }
}
