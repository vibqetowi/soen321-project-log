package ta;

import android.content.SharedPreferences;
import android.util.Pair;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class j3 extends e4 {
    public static final Pair R = new Pair("", 0L);
    public String A;
    public boolean B;
    public long C;
    public final g3 D;
    public final e3 E;
    public final i3 F;
    public final e3 G;
    public final g3 H;
    public final g3 I;
    public boolean J;
    public final e3 K;
    public final e3 L;
    public final g3 M;
    public final i3 N;
    public final i3 O;
    public final g3 P;
    public final f3 Q;

    /* renamed from: w  reason: collision with root package name */
    public SharedPreferences f32677w;

    /* renamed from: x  reason: collision with root package name */
    public h3 f32678x;

    /* renamed from: y  reason: collision with root package name */
    public final g3 f32679y;

    /* renamed from: z  reason: collision with root package name */
    public final i3 f32680z;

    public j3(y3 y3Var) {
        super(y3Var);
        this.D = new g3(this, "session_timeout", 1800000L);
        this.E = new e3(this, "start_new_session", true);
        this.H = new g3(this, "last_pause_time", 0L);
        this.I = new g3(this, "session_id", 0L);
        this.F = new i3(this, "non_personalized_ads");
        this.G = new e3(this, "allow_remote_dynamite", false);
        this.f32679y = new g3(this, "first_open_time", 0L);
        v9.o.e("app_install_time");
        this.f32680z = new i3(this, "app_instance_id");
        this.K = new e3(this, "app_backgrounded", false);
        this.L = new e3(this, "deep_link_retrieval_complete", false);
        this.M = new g3(this, "deep_link_retrieval_attempts", 0L);
        this.N = new i3(this, "firebase_feature_rollouts");
        this.O = new i3(this, "deferred_attribution_cache");
        this.P = new g3(this, "deferred_attribution_cache_timestamp", 0L);
        this.Q = new f3(this);
    }

    @Override // ta.e4
    public final boolean i() {
        return true;
    }

    public final SharedPreferences l() {
        h();
        j();
        v9.o.h(this.f32677w);
        return this.f32677w;
    }

    public final void m() {
        SharedPreferences sharedPreferences = this.f32943u.f32953u.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f32677w = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.J = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f32677w.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f32678x = new h3(this, Math.max(0L, ((Long) j2.f32643c.a(null)).longValue()));
    }

    public final h n() {
        h();
        return h.b(l().getString("consent_settings", "G1"));
    }

    public final Boolean o() {
        h();
        if (l().contains("measurement_enabled")) {
            return Boolean.valueOf(l().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final void p(Boolean bool) {
        h();
        SharedPreferences.Editor edit = l().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final void q(boolean z10) {
        h();
        w2 w2Var = this.f32943u.C;
        y3.k(w2Var);
        w2Var.H.c(Boolean.valueOf(z10), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = l().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    public final boolean r(long j10) {
        if (j10 - this.D.a() > this.H.a()) {
            return true;
        }
        return false;
    }

    public final boolean s(int i6) {
        int i10 = l().getInt("consent_source", 100);
        h hVar = h.f32583b;
        if (i6 <= i10) {
            return true;
        }
        return false;
    }
}
