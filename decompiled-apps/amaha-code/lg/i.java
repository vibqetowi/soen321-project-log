package lg;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.b0;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PersistentIdentity.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: p  reason: collision with root package name */
    public static Integer f24340p = null;

    /* renamed from: q  reason: collision with root package name */
    public static Boolean f24341q = null;
    public static boolean r = true;

    /* renamed from: s  reason: collision with root package name */
    public static final Object f24342s = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Future<SharedPreferences> f24343a;

    /* renamed from: b  reason: collision with root package name */
    public final Future<SharedPreferences> f24344b;

    /* renamed from: c  reason: collision with root package name */
    public final Future<SharedPreferences> f24345c;

    /* renamed from: d  reason: collision with root package name */
    public final Future<SharedPreferences> f24346d;

    /* renamed from: j  reason: collision with root package name */
    public String f24351j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f24352k;

    /* renamed from: l  reason: collision with root package name */
    public String f24353l;

    /* renamed from: m  reason: collision with root package name */
    public String f24354m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f24355n;

    /* renamed from: o  reason: collision with root package name */
    public Boolean f24356o;

    /* renamed from: g  reason: collision with root package name */
    public final Object f24348g = new Object();
    public JSONObject f = null;

    /* renamed from: h  reason: collision with root package name */
    public HashMap f24349h = null;

    /* renamed from: i  reason: collision with root package name */
    public boolean f24350i = false;

    /* renamed from: e  reason: collision with root package name */
    public final h f24347e = new h(this);

    public i(Future future, FutureTask futureTask, FutureTask futureTask2, FutureTask futureTask3) {
        this.f24344b = future;
        this.f24343a = futureTask;
        this.f24345c = futureTask2;
        this.f24346d = futureTask3;
    }

    public final void a(JSONObject jSONObject) {
        synchronized (this.f24348g) {
            if (this.f == null) {
                k();
            }
            JSONObject jSONObject2 = this.f;
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    jSONObject.put(next, jSONObject2.get(next));
                } catch (JSONException e10) {
                    b0.n("MixpanelAPI.PIdentity", "Object read from one JSON Object cannot be written to another", e10);
                }
            }
        }
    }

    public final synchronized String b() {
        if (!this.f24350i) {
            h();
        }
        return this.f24351j;
    }

    public final synchronized boolean c() {
        if (!this.f24350i) {
            h();
        }
        return this.f24355n;
    }

    public final HashMap d() {
        synchronized (f24342s) {
            if (r || this.f24349h == null) {
                j();
                r = false;
            }
        }
        return this.f24349h;
    }

    public final synchronized boolean e(String str) {
        boolean z10;
        z10 = false;
        try {
            z10 = this.f24346d.get().getBoolean(str, false);
        } catch (InterruptedException e10) {
            b0.n("MixpanelAPI.PIdentity", "Couldn't read internal Mixpanel from shared preferences.", e10);
        } catch (ExecutionException e11) {
            b0.n("MixpanelAPI.PIdentity", "Couldn't read internal Mixpanel shared preferences.", e11.getCause());
        }
        return z10;
    }

    public final synchronized boolean f(String str) {
        if (str == null) {
            return false;
        }
        Integer valueOf = Integer.valueOf(str);
        try {
            try {
                if (f24340p == null) {
                    Integer valueOf2 = Integer.valueOf(this.f24346d.get().getInt("latest_version_code", -1));
                    f24340p = valueOf2;
                    if (valueOf2.intValue() == -1) {
                        f24340p = valueOf;
                        SharedPreferences.Editor edit = this.f24346d.get().edit();
                        edit.putInt("latest_version_code", valueOf.intValue());
                        edit.apply();
                    }
                }
                if (f24340p.intValue() < valueOf.intValue()) {
                    SharedPreferences.Editor edit2 = this.f24346d.get().edit();
                    edit2.putInt("latest_version_code", valueOf.intValue());
                    edit2.apply();
                    return true;
                }
            } catch (InterruptedException e10) {
                b0.n("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel from shared preferences.", e10);
            }
        } catch (ExecutionException e11) {
            b0.n("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e11.getCause());
        }
        return false;
    }

    public final synchronized void g() {
        if (!this.f24350i) {
            h();
        }
        this.f24352k = true;
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = this.f24343a.get();
        } catch (InterruptedException e10) {
            b0.n("MixpanelAPI.PIdentity", "Cannot read distinct ids from sharedPreferences.", e10);
            sharedPreferences = null;
            if (sharedPreferences == null) {
            }
        } catch (ExecutionException e11) {
            b0.n("MixpanelAPI.PIdentity", "Cannot read distinct ids from sharedPreferences.", e11.getCause());
            sharedPreferences = null;
            if (sharedPreferences == null) {
            }
        }
        if (sharedPreferences == null) {
            return;
        }
        this.f24351j = sharedPreferences.getString("events_distinct_id", null);
        this.f24352k = sharedPreferences.getBoolean("events_user_id_present", false);
        this.f24353l = sharedPreferences.getString("people_distinct_id", null);
        this.f24354m = sharedPreferences.getString("anonymous_id", null);
        this.f24355n = sharedPreferences.getBoolean("had_persisted_distinct_id", false);
        if (this.f24351j == null) {
            this.f24354m = UUID.randomUUID().toString();
            this.f24351j = "$device:" + this.f24354m;
            this.f24352k = false;
            r();
        }
        this.f24350i = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str) {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = this.f24346d.get();
        } catch (InterruptedException e10) {
            b0.n("MixpanelAPI.PIdentity", "Cannot read opt out flag from sharedPreferences.", e10);
            sharedPreferences = null;
            if (sharedPreferences == null) {
            }
        } catch (ExecutionException e11) {
            b0.n("MixpanelAPI.PIdentity", "Cannot read opt out flag from sharedPreferences.", e11.getCause());
            sharedPreferences = null;
            if (sharedPreferences == null) {
            }
        }
        if (sharedPreferences == null) {
            return;
        }
        this.f24356o = Boolean.valueOf(sharedPreferences.getBoolean("opt_out_" + str, false));
    }

    public final void j() {
        this.f24349h = new HashMap();
        try {
            SharedPreferences sharedPreferences = this.f24344b.get();
            h hVar = this.f24347e;
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(hVar);
            sharedPreferences.registerOnSharedPreferenceChangeListener(hVar);
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                this.f24349h.put(entry.getKey(), value.toString());
            }
        } catch (InterruptedException e10) {
            b0.n("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e10);
        } catch (ExecutionException e11) {
            b0.n("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e11.getCause());
        }
    }

    public final void k() {
        JSONObject jSONObject;
        try {
            try {
                try {
                    String string = this.f24343a.get().getString("super_properties", "{}");
                    b0.t("MixpanelAPI.PIdentity", "Loading Super Properties " + string);
                    this.f = new JSONObject(string);
                } catch (JSONException unused) {
                    b0.m("MixpanelAPI.PIdentity", "Cannot parse stored superProperties");
                    q();
                    if (this.f == null) {
                        jSONObject = new JSONObject();
                        this.f = jSONObject;
                    }
                }
            } catch (InterruptedException e10) {
                b0.n("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", e10);
                if (this.f == null) {
                    jSONObject = new JSONObject();
                    this.f = jSONObject;
                }
            } catch (ExecutionException e11) {
                b0.n("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", e11.getCause());
                if (this.f == null) {
                    jSONObject = new JSONObject();
                    this.f = jSONObject;
                }
            }
        } catch (Throwable th2) {
            if (this.f == null) {
                this.f = new JSONObject();
            }
            throw th2;
        }
    }

    public final synchronized void l(String str) {
        if (!this.f24350i) {
            h();
        }
        if (this.f24354m != null) {
            return;
        }
        this.f24354m = str;
        this.f24355n = true;
        r();
    }

    public final synchronized void m(String str) {
        if (!this.f24350i) {
            h();
        }
        this.f24351j = str;
        r();
    }

    public final synchronized void n(String str) {
        try {
            SharedPreferences.Editor edit = this.f24346d.get().edit();
            edit.putBoolean("has_launched_" + str, true);
            edit.apply();
        } catch (InterruptedException e10) {
            b0.n("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e10);
        } catch (ExecutionException e11) {
            b0.n("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e11.getCause());
        }
    }

    public final synchronized void o(String str) {
        try {
            try {
                SharedPreferences.Editor edit = this.f24346d.get().edit();
                edit.putBoolean(str, true);
                edit.apply();
            } catch (ExecutionException e10) {
                b0.n("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e10.getCause());
            }
        } catch (InterruptedException e11) {
            b0.n("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel from shared preferences.", e11);
        }
    }

    public final synchronized void p(String str) {
        if (!this.f24350i) {
            h();
        }
        this.f24353l = str;
        r();
    }

    public final void q() {
        JSONObject jSONObject = this.f;
        if (jSONObject == null) {
            b0.m("MixpanelAPI.PIdentity", "storeSuperProperties should not be called with uninitialized superPropertiesCache.");
            return;
        }
        String jSONObject2 = jSONObject.toString();
        b0.t("MixpanelAPI.PIdentity", "Storing Super Properties " + jSONObject2);
        try {
            SharedPreferences.Editor edit = this.f24343a.get().edit();
            edit.putString("super_properties", jSONObject2);
            edit.apply();
        } catch (InterruptedException e10) {
            b0.n("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", e10);
        } catch (ExecutionException e11) {
            b0.n("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", e11.getCause());
        }
    }

    public final void r() {
        try {
            SharedPreferences.Editor edit = this.f24343a.get().edit();
            edit.putString("events_distinct_id", this.f24351j);
            edit.putBoolean("events_user_id_present", this.f24352k);
            edit.putString("people_distinct_id", this.f24353l);
            edit.putString("anonymous_id", this.f24354m);
            edit.putBoolean("had_persisted_distinct_id", this.f24355n);
            edit.apply();
        } catch (InterruptedException e10) {
            b0.n("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", e10);
        } catch (ExecutionException e11) {
            b0.n("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", e11.getCause());
        }
    }
}
