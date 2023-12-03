package lg;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: MixpanelActivityLifecycleCallbacks.java */
/* loaded from: classes.dex */
public final class g implements Application.ActivityLifecycleCallbacks {
    public static Double A;

    /* renamed from: v  reason: collision with root package name */
    public a f24333v;

    /* renamed from: y  reason: collision with root package name */
    public final f f24336y;

    /* renamed from: z  reason: collision with root package name */
    public final c f24337z;

    /* renamed from: u  reason: collision with root package name */
    public final Handler f24332u = new Handler(Looper.getMainLooper());

    /* renamed from: w  reason: collision with root package name */
    public boolean f24334w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f24335x = true;

    /* compiled from: MixpanelActivityLifecycleCallbacks.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            if (gVar.f24334w && gVar.f24335x) {
                gVar.f24334w = false;
                try {
                    double currentTimeMillis = System.currentTimeMillis() - g.A.doubleValue();
                    c cVar = gVar.f24337z;
                    if (currentTimeMillis >= cVar.f24300m && currentTimeMillis < cVar.f24301n && gVar.f24336y.f24324d.booleanValue()) {
                        double round = Math.round((currentTimeMillis / 1000.0d) * 10.0d) / 10.0d;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("$ae_session_length", round);
                        gVar.f24336y.f.e(1.0d, "$ae_total_app_sessions");
                        gVar.f24336y.f.e(round, "$ae_total_app_session_length");
                        gVar.f24336y.m("$ae_session", jSONObject, true);
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                f fVar = gVar.f24336y;
                if (fVar.f24323c.f24291c) {
                    fVar.c();
                }
            }
        }
    }

    public g(f fVar, c cVar) {
        this.f24336y = fVar;
        this.f24337z = cVar;
        if (A == null) {
            A = Double.valueOf(System.currentTimeMillis());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f24335x = true;
        a aVar = this.f24333v;
        Handler handler = this.f24332u;
        if (aVar != null) {
            handler.removeCallbacks(aVar);
        }
        a aVar2 = new a();
        this.f24333v = aVar2;
        handler.postDelayed(aVar2, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        new WeakReference(activity);
        this.f24335x = false;
        boolean z10 = !this.f24334w;
        this.f24334w = true;
        a aVar = this.f24333v;
        if (aVar != null) {
            this.f24332u.removeCallbacks(aVar);
        }
        if (z10) {
            A = Double.valueOf(System.currentTimeMillis());
            this.f24336y.f24329j.b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
