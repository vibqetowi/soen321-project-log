package ta;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class s4 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ t4 f32864u;

    public /* synthetic */ s4(t4 t4Var) {
        this.f32864u = t4Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        c5 c5Var;
        Uri data;
        boolean z10;
        String str;
        t4 t4Var = this.f32864u;
        try {
            try {
                w2 w2Var = t4Var.f32943u.C;
                y3.k(w2Var);
                w2Var.H.b("onActivityCreated");
                Intent intent = activity.getIntent();
                y3 y3Var = t4Var.f32943u;
                if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                    y3.i(y3Var.F);
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    boolean z11 = true;
                    if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (true != z10) {
                        str = "auto";
                    } else {
                        str = "gs";
                    }
                    String str2 = str;
                    String queryParameter = data.getQueryParameter("referrer");
                    if (bundle != null) {
                        z11 = false;
                    }
                    w3 w3Var = y3Var.D;
                    y3.k(w3Var);
                    w3Var.p(new r9.i(this, z11, data, str2, queryParameter));
                }
                c5Var = y3Var.I;
            } catch (RuntimeException e10) {
                w2 w2Var2 = t4Var.f32943u.C;
                y3.k(w2Var2);
                w2Var2.f32925z.c(e10, "Throwable caught in onActivityCreated");
                c5Var = t4Var.f32943u.I;
            }
            y3.j(c5Var);
            c5Var.p(activity, bundle);
        } catch (Throwable th2) {
            c5 c5Var2 = t4Var.f32943u.I;
            y3.j(c5Var2);
            c5Var2.p(activity, bundle);
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c5 c5Var = this.f32864u.f32943u.I;
        y3.j(c5Var);
        synchronized (c5Var.F) {
            if (activity == c5Var.A) {
                c5Var.A = null;
            }
        }
        if (c5Var.f32943u.A.r()) {
            c5Var.f32512z.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c5 c5Var = this.f32864u.f32943u.I;
        y3.j(c5Var);
        synchronized (c5Var.F) {
            c5Var.E = false;
            c5Var.B = true;
        }
        c5Var.f32943u.H.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!c5Var.f32943u.A.r()) {
            c5Var.f32509w = null;
            w3 w3Var = c5Var.f32943u.D;
            y3.k(w3Var);
            w3Var.p(new p0(c5Var, elapsedRealtime, 1));
        } else {
            z4 q10 = c5Var.q(activity);
            c5Var.f32510x = c5Var.f32509w;
            c5Var.f32509w = null;
            w3 w3Var2 = c5Var.f32943u.D;
            y3.k(w3Var2);
            w3Var2.p(new i4(c5Var, q10, elapsedRealtime));
        }
        v5 v5Var = this.f32864u.f32943u.E;
        y3.j(v5Var);
        v5Var.f32943u.H.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        w3 w3Var3 = v5Var.f32943u.D;
        y3.k(w3Var3);
        w3Var3.p(new r5(v5Var, elapsedRealtime2, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        v5 v5Var = this.f32864u.f32943u.E;
        y3.j(v5Var);
        v5Var.f32943u.H.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        w3 w3Var = v5Var.f32943u.D;
        y3.k(w3Var);
        w3Var.p(new r5(v5Var, elapsedRealtime, 0));
        c5 c5Var = this.f32864u.f32943u.I;
        y3.j(c5Var);
        synchronized (c5Var.F) {
            c5Var.E = true;
            if (activity != c5Var.A) {
                synchronized (c5Var.F) {
                    c5Var.A = activity;
                    c5Var.B = false;
                }
                if (c5Var.f32943u.A.r()) {
                    c5Var.C = null;
                    w3 w3Var2 = c5Var.f32943u.D;
                    y3.k(w3Var2);
                    w3Var2.p(new b5(c5Var, 1));
                }
            }
        }
        if (!c5Var.f32943u.A.r()) {
            c5Var.f32509w = c5Var.C;
            w3 w3Var3 = c5Var.f32943u.D;
            y3.k(w3Var3);
            w3Var3.p(new b5(c5Var, 0));
            return;
        }
        c5Var.r(activity, c5Var.q(activity), false);
        q1 m10 = c5Var.f32943u.m();
        m10.f32943u.H.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        w3 w3Var4 = m10.f32943u.D;
        y3.k(w3Var4);
        w3Var4.p(new p0(m10, elapsedRealtime2, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        z4 z4Var;
        c5 c5Var = this.f32864u.f32943u.I;
        y3.j(c5Var);
        if (c5Var.f32943u.A.r() && bundle != null && (z4Var = (z4) c5Var.f32512z.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", z4Var.f32976c);
            bundle2.putString(SessionManager.KEY_NAME, z4Var.f32974a);
            bundle2.putString("referrer_name", z4Var.f32975b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
