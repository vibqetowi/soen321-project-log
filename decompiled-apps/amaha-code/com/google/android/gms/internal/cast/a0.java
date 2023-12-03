package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: g  reason: collision with root package name */
    public static final p9.b f7470g = new p9.b("ApplicationAnalytics");

    /* renamed from: a  reason: collision with root package name */
    public final h f7471a;

    /* renamed from: b  reason: collision with root package name */
    public final c0 f7472b;

    /* renamed from: e  reason: collision with root package name */
    public final SharedPreferences f7475e;
    public b0 f;

    /* renamed from: d  reason: collision with root package name */
    public final f f7474d = new f(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final c4.u f7473c = new c4.u(12, this);

    public a0(SharedPreferences sharedPreferences, h hVar, Bundle bundle, String str) {
        this.f7475e = sharedPreferences;
        this.f7471a = hVar;
        this.f7472b = new c0(bundle, str);
    }

    public static void a(a0 a0Var) {
        b0 b0Var = a0Var.f;
        b0Var.getClass();
        SharedPreferences sharedPreferences = a0Var.f7475e;
        if (sharedPreferences != null) {
            b0.f7482g.b("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("application_id", b0Var.f7484a);
            edit.putString("receiver_metrics_id", b0Var.f7485b);
            edit.putLong("analytics_session_id", b0Var.f7486c);
            edit.putInt("event_sequence_number", b0Var.f7487d);
            edit.putInt("device_capabilities", b0Var.f7488e);
            edit.putString("receiver_session_id", b0Var.f);
            edit.apply();
        }
    }

    public static void b(a0 a0Var, l9.c cVar, int i6) {
        a0Var.e(cVar);
        a0Var.f7471a.a(a0Var.f7472b.a(a0Var.f, i6), 85);
        a0Var.f7474d.removeCallbacks(a0Var.f7473c);
        a0Var.f = null;
    }

    public static String h() {
        p9.b bVar = l9.a.f24145h;
        v9.o.d("Must be called from the main thread.");
        l9.a aVar = l9.a.f24147j;
        v9.o.h(aVar);
        v9.o.d("Must be called from the main thread.");
        return aVar.f24152e.f24155u;
    }

    public final void c() {
        f fVar = this.f7474d;
        v9.o.h(fVar);
        c4.u uVar = this.f7473c;
        v9.o.h(uVar);
        fVar.postDelayed(uVar, 300000L);
    }

    public final void d(l9.c cVar) {
        CastDevice castDevice;
        b0 b0Var;
        f7470g.b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        b0 b0Var2 = new b0();
        b0.f7483h++;
        this.f = b0Var2;
        b0Var2.f7484a = h();
        if (cVar == null) {
            castDevice = null;
        } else {
            v9.o.d("Must be called from the main thread.");
            castDevice = cVar.f24169j;
        }
        if (castDevice != null && (b0Var = this.f) != null) {
            b0Var.f7485b = castDevice.F;
            b0Var.f7488e = castDevice.C;
        }
        v9.o.h(this.f);
    }

    public final void e(l9.c cVar) {
        CastDevice castDevice;
        b0 b0Var;
        if (f()) {
            if (cVar != null) {
                v9.o.d("Must be called from the main thread.");
                castDevice = cVar.f24169j;
            } else {
                castDevice = null;
            }
            if (castDevice != null) {
                String str = this.f.f7485b;
                String str2 = castDevice.F;
                if (!TextUtils.equals(str, str2) && (b0Var = this.f) != null) {
                    b0Var.f7485b = str2;
                    b0Var.f7488e = castDevice.C;
                }
            }
            v9.o.h(this.f);
            return;
        }
        f7470g.e("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]);
        d(cVar);
    }

    public final boolean f() {
        String str;
        b0 b0Var = this.f;
        p9.b bVar = f7470g;
        if (b0Var == null) {
            bVar.b("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        String h10 = h();
        if (h10 != null && (str = this.f.f7484a) != null && TextUtils.equals(str, h10)) {
            v9.o.h(this.f);
            return true;
        }
        bVar.b("The analytics session doesn't match the application ID %s", h10);
        return false;
    }

    public final boolean g(String str) {
        String str2;
        if (!f()) {
            return false;
        }
        v9.o.h(this.f);
        if (str != null && (str2 = this.f.f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        f7470g.b("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
