package h5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdkNotInitializedException;
import h5.g0;
import h5.q;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import w5.a;
/* compiled from: UserSettingsManager.kt */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f17231a = new g0();

    /* renamed from: b  reason: collision with root package name */
    public static final String f17232b = g0.class.getName();

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicBoolean f17233c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f17234d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public static final a f17235e = new a(true, "com.facebook.sdk.AutoInitEnabled");
    public static final a f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: g  reason: collision with root package name */
    public static final a f17236g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: h  reason: collision with root package name */
    public static final a f17237h = new a(false, "auto_event_setup_enabled");

    /* renamed from: i  reason: collision with root package name */
    public static final a f17238i = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: j  reason: collision with root package name */
    public static SharedPreferences f17239j;

    /* compiled from: UserSettingsManager.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f17240a;

        /* renamed from: b  reason: collision with root package name */
        public final String f17241b;

        /* renamed from: c  reason: collision with root package name */
        public Boolean f17242c;

        /* renamed from: d  reason: collision with root package name */
        public long f17243d;

        public a(boolean z10, String str) {
            this.f17240a = z10;
            this.f17241b = str;
        }

        public final boolean a() {
            Boolean bool = this.f17242c;
            if (bool == null) {
                return this.f17240a;
            }
            return bool.booleanValue();
        }
    }

    public static final boolean a() {
        if (b6.a.b(g0.class)) {
            return false;
        }
        try {
            f17231a.d();
            return f17236g.a();
        } catch (Throwable th2) {
            b6.a.a(g0.class, th2);
            return false;
        }
    }

    public static final boolean b() {
        if (b6.a.b(g0.class)) {
            return false;
        }
        try {
            f17231a.d();
            return f.a();
        } catch (Throwable th2) {
            b6.a.a(g0.class, th2);
            return false;
        }
    }

    public final void c() {
        if (b6.a.b(this)) {
            return;
        }
        try {
            a aVar = f17237h;
            h(aVar);
            final long currentTimeMillis = System.currentTimeMillis();
            if (aVar.f17242c != null && currentTimeMillis - aVar.f17243d < 604800000) {
                return;
            }
            aVar.f17242c = null;
            aVar.f17243d = 0L;
            if (!f17234d.compareAndSet(false, true)) {
                return;
            }
            p.c().execute(new Runnable() { // from class: h5.f0
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    long j10 = currentTimeMillis;
                    if (!b6.a.b(g0.class)) {
                        try {
                            if (g0.f17236g.a()) {
                                w5.p pVar = w5.p.f36526a;
                                w5.o f2 = w5.p.f(p.b(), false);
                                if (f2 != null && f2.f36518h) {
                                    Context a10 = p.a();
                                    w5.a aVar2 = w5.a.f;
                                    w5.a a11 = a.C0610a.a(a10);
                                    if (a11 != null && a11.a() != null) {
                                        str = a11.a();
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("advertiser_id", str);
                                        bundle.putString("fields", "auto_event_setup_enabled");
                                        String str2 = q.f17287j;
                                        q g5 = q.c.g(null, "app", null);
                                        g5.f17293d = bundle;
                                        JSONObject jSONObject = g5.c().f17317b;
                                        if (jSONObject != null) {
                                            g0.a aVar3 = g0.f17237h;
                                            aVar3.f17242c = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                            aVar3.f17243d = j10;
                                            g0.f17231a.j(aVar3);
                                        }
                                    }
                                }
                            }
                            g0.f17234d.set(false);
                        } catch (Throwable th2) {
                            b6.a.a(g0.class, th2);
                        }
                    }
                }
            });
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final void d() {
        if (b6.a.b(this)) {
            return;
        }
        try {
            if (!p.h()) {
                return;
            }
            int i6 = 0;
            if (!f17233c.compareAndSet(false, true)) {
                return;
            }
            SharedPreferences sharedPreferences = p.a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            kotlin.jvm.internal.i.f(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
            f17239j = sharedPreferences;
            a[] aVarArr = {f, f17236g, f17235e};
            if (!b6.a.b(this)) {
                while (i6 < 3) {
                    a aVar = aVarArr[i6];
                    i6++;
                    if (aVar == f17237h) {
                        c();
                    } else if (aVar.f17242c == null) {
                        h(aVar);
                        if (aVar.f17242c == null) {
                            e(aVar);
                        }
                    } else {
                        j(aVar);
                    }
                }
            }
            c();
            g();
            f();
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final void e(a aVar) {
        String str = aVar.f17241b;
        if (b6.a.b(this)) {
            return;
        }
        try {
            i();
            try {
                Context a10 = p.a();
                ApplicationInfo applicationInfo = a10.getPackageManager().getApplicationInfo(a10.getPackageName(), 128);
                kotlin.jvm.internal.i.f(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null && bundle.containsKey(str)) {
                    aVar.f17242c = Boolean.valueOf(applicationInfo.metaData.getBoolean(str, aVar.f17240a));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                w5.e0 e0Var = w5.e0.f36453a;
                p pVar = p.f17269a;
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Bundle bundle;
        boolean z10;
        ApplicationInfo applicationInfo;
        int i15;
        if (b6.a.b(this)) {
            return;
        }
        try {
            if (!f17233c.get() || !p.h()) {
                return;
            }
            Context a10 = p.a();
            if (f17235e.a()) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            int i16 = (i6 << 0) | 0;
            if (f.a()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            int i17 = i16 | (i10 << 1);
            if (f17236g.a()) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            int i18 = i17 | (i11 << 2);
            if (f17238i.a()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            int i19 = i18 | (i12 << 3);
            SharedPreferences sharedPreferences = f17239j;
            if (sharedPreferences != null) {
                int i20 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i20 != i19) {
                    SharedPreferences sharedPreferences2 = f17239j;
                    if (sharedPreferences2 != null) {
                        sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i19).apply();
                        try {
                            applicationInfo = a10.getPackageManager().getApplicationInfo(a10.getPackageName(), 128);
                            kotlin.jvm.internal.i.f(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if (applicationInfo.metaData != null) {
                            String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                            boolean[] zArr = {true, true, true, true};
                            int i21 = 0;
                            i13 = 0;
                            i14 = 0;
                            while (true) {
                                int i22 = i21 + 1;
                                try {
                                    if (applicationInfo.metaData.containsKey(strArr[i21])) {
                                        i15 = 1;
                                    } else {
                                        i15 = 0;
                                    }
                                    i13 |= i15 << i21;
                                    i14 |= (applicationInfo.metaData.getBoolean(strArr[i21], zArr[i21]) ? 1 : 0) << i21;
                                    if (i22 > 3) {
                                        break;
                                    }
                                    i21 = i22;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                }
                            }
                            i5.i iVar = new i5.i(a10, (String) null);
                            bundle = new Bundle();
                            bundle.putInt("usage", i13);
                            bundle.putInt("initial", i14);
                            bundle.putInt("previous", i20);
                            bundle.putInt("current", i19);
                            if ((bundle.getInt("previous") & 2) == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10 || b()) {
                                iVar.f("fb_sdk_settings_changed", bundle);
                                return;
                            }
                            return;
                        }
                        i13 = 0;
                        i14 = 0;
                        i5.i iVar2 = new i5.i(a10, (String) null);
                        bundle = new Bundle();
                        bundle.putInt("usage", i13);
                        bundle.putInt("initial", i14);
                        bundle.putInt("previous", i20);
                        bundle.putInt("current", i19);
                        if ((bundle.getInt("previous") & 2) == 0) {
                        }
                        if (!z10) {
                        }
                        iVar2.f("fb_sdk_settings_changed", bundle);
                        return;
                    }
                    kotlin.jvm.internal.i.q("userSettingPref");
                    throw null;
                }
                return;
            }
            kotlin.jvm.internal.i.q("userSettingPref");
            throw null;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final void g() {
        if (b6.a.b(this)) {
            return;
        }
        try {
            Context a10 = p.a();
            ApplicationInfo applicationInfo = a10.getPackageManager().getApplicationInfo(a10.getPackageName(), 128);
            kotlin.jvm.internal.i.f(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                boolean containsKey = bundle.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled");
                String str = f17232b;
                if (!containsKey) {
                    Log.w(str, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(str, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!a()) {
                    Log.w(str, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final void h(a aVar) {
        boolean z10;
        String str = "";
        if (b6.a.b(this)) {
            return;
        }
        try {
            i();
            try {
                SharedPreferences sharedPreferences = f17239j;
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString(aVar.f17241b, "");
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        JSONObject jSONObject = new JSONObject(str);
                        aVar.f17242c = Boolean.valueOf(jSONObject.getBoolean("value"));
                        aVar.f17243d = jSONObject.getLong("last_timestamp");
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.i.q("userSettingPref");
                throw null;
            } catch (JSONException unused) {
                w5.e0 e0Var = w5.e0.f36453a;
                p pVar = p.f17269a;
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final void i() {
        if (b6.a.b(this)) {
            return;
        }
        try {
            if (f17233c.get()) {
                return;
            }
            throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final void j(a aVar) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            i();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.f17242c);
                jSONObject.put("last_timestamp", aVar.f17243d);
                SharedPreferences sharedPreferences = f17239j;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString(aVar.f17241b, jSONObject.toString()).apply();
                    f();
                    return;
                }
                kotlin.jvm.internal.i.q("userSettingPref");
                throw null;
            } catch (Exception unused) {
                w5.e0 e0Var = w5.e0.f36453a;
                p pVar = p.f17269a;
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
