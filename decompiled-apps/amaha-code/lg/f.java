package lg;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.theinnerhour.b2b.utils.Constants;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.b0;
import lg.a;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: MixpanelAPI.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: k  reason: collision with root package name */
    public static final HashMap f24318k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    public static final k f24319l = new k();

    /* renamed from: m  reason: collision with root package name */
    public static FutureTask f24320m;

    /* renamed from: a  reason: collision with root package name */
    public final Context f24321a;

    /* renamed from: b  reason: collision with root package name */
    public final lg.a f24322b;

    /* renamed from: c  reason: collision with root package name */
    public final c f24323c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f24324d;

    /* renamed from: e  reason: collision with root package name */
    public final String f24325e;
    public final b f;

    /* renamed from: g  reason: collision with root package name */
    public final i f24326g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, String> f24327h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f24328i;

    /* renamed from: j  reason: collision with root package name */
    public final j f24329j;

    /* compiled from: MixpanelAPI.java */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            JSONObject jSONObject = new JSONObject();
            Bundle bundleExtra = intent.getBundleExtra("event_args");
            if (bundleExtra != null) {
                for (String str : bundleExtra.keySet()) {
                    try {
                        jSONObject.put(str, bundleExtra.get(str));
                    } catch (JSONException e10) {
                        b0.n("MixpanelAPI.AL", "failed to add key \"" + str + "\" to properties for tracking bolts event", e10);
                    }
                }
            }
            f.this.n(jSONObject, "$" + intent.getStringExtra("event_name"));
        }
    }

    /* compiled from: MixpanelAPI.java */
    /* loaded from: classes.dex */
    public class b {
        public b() {
        }

        public final void a(Object obj, String str) {
            f fVar = f.this;
            if (fVar.h()) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, obj);
                f.a(fVar, h(jSONObject, "$append"));
            } catch (JSONException e10) {
                b0.n("MixpanelAPI.API", "Exception appending a property", e10);
            }
        }

        public final String b() {
            String str;
            i iVar = f.this.f24326g;
            synchronized (iVar) {
                if (!iVar.f24350i) {
                    iVar.h();
                }
                str = iVar.f24353l;
            }
            return str;
        }

        public final void c(String str) {
            f fVar = f.this;
            if (fVar.h()) {
                return;
            }
            b0.u("MixpanelAPI.API", "People.identify() is deprecated and calling it is no longer necessary, please use MixpanelAPI.identify() and set 'usePeople' to true instead");
            if (str == null) {
                b0.m("MixpanelAPI.API", "Can't identify with null distinct_id.");
            } else if (!str.equals(fVar.f24326g.b())) {
                b0.u("MixpanelAPI.API", "Identifying with a distinct_id different from the one being set by MixpanelAPI.identify() is not supported.");
            } else {
                d(str);
            }
        }

        public final void d(String str) {
            synchronized (f.this.f24326g) {
                f.this.f24326g.p(str);
            }
            f fVar = f.this;
            a.f fVar2 = new a.f(str, fVar.f24325e);
            lg.a aVar = fVar.f24322b;
            aVar.getClass();
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = fVar2;
            aVar.f24266a.b(obtain);
        }

        public final void e(double d10, String str) {
            f fVar = f.this;
            if (fVar.h()) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(str, Double.valueOf(d10));
            if (!fVar.h()) {
                try {
                    f.a(fVar, h(new JSONObject(hashMap), "$add"));
                } catch (JSONException e10) {
                    b0.n("MixpanelAPI.API", "Exception incrementing properties", e10);
                }
            }
        }

        public final void f(Object obj, String str) {
            if (f.this.h()) {
                return;
            }
            try {
                g(new JSONObject().put(str, obj));
            } catch (JSONException e10) {
                b0.n("MixpanelAPI.API", "set", e10);
            }
        }

        public final void g(JSONObject jSONObject) {
            f fVar = f.this;
            if (fVar.h()) {
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(fVar.f24327h);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                f.a(fVar, h(jSONObject2, "$set"));
            } catch (JSONException e10) {
                b0.n("MixpanelAPI.API", "Exception setting people properties", e10);
            }
        }

        public final JSONObject h(Object obj, String str) {
            JSONObject jSONObject = new JSONObject();
            String b10 = b();
            f fVar = f.this;
            String e10 = fVar.e();
            jSONObject.put(str, obj);
            jSONObject.put("$token", fVar.f24325e);
            jSONObject.put("$time", System.currentTimeMillis());
            jSONObject.put("$had_persisted_distinct_id", fVar.f24326g.c());
            if (e10 != null) {
                jSONObject.put("$device_id", e10);
            }
            if (b10 != null) {
                jSONObject.put("$distinct_id", b10);
                jSONObject.put("$user_id", b10);
            }
            jSONObject.put("$mp_metadata", fVar.f24329j.a(false));
            return jSONObject;
        }
    }

    public f() {
        throw null;
    }

    public f(Context context, Future future, String str) {
        boolean booleanValue;
        c b10 = c.b(context);
        this.f24321a = context;
        this.f24325e = str;
        this.f = new b();
        new HashMap();
        this.f24323c = b10;
        this.f24324d = Boolean.TRUE;
        HashMap hashMap = new HashMap();
        hashMap.put("$android_lib_version", "7.3.0");
        hashMap.put("$android_os", "Android");
        String str2 = Build.VERSION.RELEASE;
        hashMap.put("$android_os_version", str2 == null ? "UNKNOWN" : str2);
        String str3 = Build.MANUFACTURER;
        hashMap.put("$android_manufacturer", str3 == null ? "UNKNOWN" : str3);
        String str4 = Build.BRAND;
        hashMap.put("$android_brand", str4 == null ? "UNKNOWN" : str4);
        String str5 = Build.MODEL;
        hashMap.put("$android_model", str5 == null ? "UNKNOWN" : str5);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            hashMap.put("$android_app_version", packageInfo.versionName);
            hashMap.put("$android_app_version_code", Integer.toString(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException e10) {
            b0.n("MixpanelAPI.API", "Exception getting app version name", e10);
        }
        this.f24327h = Collections.unmodifiableMap(hashMap);
        this.f24329j = new j();
        this.f24322b = d();
        e eVar = new e(this);
        String concat = "com.mixpanel.android.mpmetrics.MixpanelAPI_".concat(str);
        k kVar = f24319l;
        FutureTask a10 = kVar.a(context, concat, eVar);
        FutureTask a11 = kVar.a(context, "com.mixpanel.android.mpmetrics.MixpanelAPI.TimeEvents_".concat(str), null);
        this.f24326g = new i(future, a10, a11, kVar.a(context, "com.mixpanel.android.mpmetrics.Mixpanel", null));
        HashMap hashMap2 = new HashMap();
        try {
            for (Map.Entry<String, ?> entry : ((SharedPreferences) a11.get()).getAll().entrySet()) {
                hashMap2.put(entry.getKey(), Long.valueOf(entry.getValue().toString()));
            }
        } catch (InterruptedException e11) {
            e11.printStackTrace();
        } catch (ExecutionException e12) {
            e12.printStackTrace();
        }
        this.f24328i = hashMap2;
        boolean exists = d.f(this.f24321a).f24313a.f24314u.exists();
        Context context2 = this.f24321a;
        if (context2.getApplicationContext() instanceof Application) {
            ((Application) context2.getApplicationContext()).registerActivityLifecycleCallbacks(new g(this, this.f24323c));
        } else if (b0.q(4)) {
            Log.i("MixpanelAPI.API", "Context is not an Application, Mixpanel won't be able to automatically flush on an app background.");
        }
        i iVar = this.f24326g;
        String str6 = this.f24325e;
        synchronized (iVar) {
            if (i.f24341q == null) {
                try {
                    if (iVar.f24346d.get().getBoolean("has_launched_" + str6, false)) {
                        i.f24341q = Boolean.FALSE;
                    } else {
                        Boolean valueOf = Boolean.valueOf(!exists);
                        i.f24341q = valueOf;
                        if (!valueOf.booleanValue()) {
                            iVar.n(str6);
                        }
                    }
                } catch (InterruptedException unused) {
                    i.f24341q = Boolean.FALSE;
                } catch (ExecutionException unused2) {
                    i.f24341q = Boolean.FALSE;
                }
            }
            booleanValue = i.f24341q.booleanValue();
        }
        if (booleanValue && this.f24324d.booleanValue()) {
            m("$ae_first_open", null, true);
            this.f24326g.n(this.f24325e);
        }
        if ((!this.f24323c.f24294g) && this.f24324d.booleanValue()) {
            n(null, "$app_open");
        }
        if (!this.f24326g.e(this.f24325e)) {
            try {
                l(str);
                this.f24326g.o(this.f24325e);
            } catch (JSONException unused3) {
            }
        }
        if (this.f24326g.f((String) hashMap.get("$android_app_version_code")) && this.f24324d.booleanValue()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("$ae_updated_version", hashMap.get("$android_app_version"));
                m("$ae_updated", jSONObject, true);
            } catch (JSONException unused4) {
            }
        }
        if (!this.f24323c.f24295h) {
            lg.b.a();
        }
        if (this.f24323c.f24303p) {
            lg.a aVar = this.f24322b;
            File file = new File(this.f24321a.getApplicationInfo().dataDir);
            aVar.getClass();
            Message obtain = Message.obtain();
            obtain.what = 9;
            obtain.obj = file;
            aVar.f24266a.b(obtain);
        }
    }

    public static void a(f fVar, JSONObject jSONObject) {
        if (!fVar.h()) {
            a.e eVar = new a.e(jSONObject, fVar.f24325e);
            lg.a aVar = fVar.f24322b;
            aVar.getClass();
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.obj = eVar;
            aVar.f24266a.b(obtain);
        }
    }

    public static void b(Context context) {
        if (context instanceof Activity) {
            try {
                Class.forName("bolts.AppLinks").getMethod("getTargetUrlFromInboundIntent", Context.class, Intent.class).invoke(null, context, ((Activity) context).getIntent());
                return;
            } catch (ClassNotFoundException e10) {
                b0.l("MixpanelAPI.AL", "Please install the Bolts library >= 1.1.2 to track App Links: " + e10.getMessage());
                return;
            } catch (IllegalAccessException e11) {
                b0.l("MixpanelAPI.AL", "Unable to detect inbound App Links: " + e11.getMessage());
                return;
            } catch (NoSuchMethodException e12) {
                b0.l("MixpanelAPI.AL", "Please install the Bolts library >= 1.1.2 to track App Links: " + e12.getMessage());
                return;
            } catch (InvocationTargetException e13) {
                if (b0.q(3)) {
                    Log.d("MixpanelAPI.AL", "Failed to invoke bolts.AppLinks.getTargetUrlFromInboundIntent() -- Unable to detect inbound App Links", e13);
                    return;
                }
                return;
            }
        }
        b0.l("MixpanelAPI.AL", "Context is not an instance of Activity. To detect inbound App Links, pass an instance of an Activity to getInstance.");
    }

    public static void j(Context context, f fVar) {
        try {
            Object obj = n1.a.f;
            n1.a.class.getMethod(Constants.ONBOARDING_VARIANT, BroadcastReceiver.class, IntentFilter.class).invoke(n1.a.class.getMethod("a", Context.class).invoke(null, context), new a(), new IntentFilter("com.parse.bolts.measurement_event"));
        } catch (ClassNotFoundException e10) {
            b0.l("MixpanelAPI.AL", "To enable App Links tracking, add implementation 'androidx.localbroadcastmanager:localbroadcastmanager:1.0.0': " + e10.getMessage());
        } catch (IllegalAccessException e11) {
            b0.l("MixpanelAPI.AL", "App Links tracking will not be enabled due to this exception: " + e11.getMessage());
        } catch (NoSuchMethodException e12) {
            b0.l("MixpanelAPI.AL", "To enable App Links tracking, add implementation 'androidx.localbroadcastmanager:localbroadcastmanager:1.0.0': " + e12.getMessage());
        } catch (InvocationTargetException e13) {
            if (b0.q(3)) {
                Log.d("MixpanelAPI.AL", "Failed to invoke LocalBroadcastManager.registerReceiver() -- App Links tracking will not be enabled due to this exception", e13);
            }
        }
    }

    public final void c() {
        if (h()) {
            return;
        }
        lg.a aVar = this.f24322b;
        aVar.getClass();
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = this.f24325e;
        obtain.arg1 = 0;
        aVar.f24266a.b(obtain);
    }

    public final lg.a d() {
        lg.a aVar;
        Context context = this.f24321a;
        HashMap hashMap = lg.a.f24265d;
        synchronized (hashMap) {
            Context applicationContext = context.getApplicationContext();
            if (!hashMap.containsKey(applicationContext)) {
                aVar = new lg.a(applicationContext);
                hashMap.put(applicationContext, aVar);
            } else {
                aVar = (lg.a) hashMap.get(applicationContext);
            }
        }
        return aVar;
    }

    public final String e() {
        String str;
        i iVar = this.f24326g;
        synchronized (iVar) {
            if (!iVar.f24350i) {
                iVar.h();
            }
            str = iVar.f24354m;
        }
        return str;
    }

    public final b f() {
        return this.f;
    }

    public final String g() {
        i iVar = this.f24326g;
        synchronized (iVar) {
            if (!iVar.f24350i) {
                iVar.h();
            }
            if (iVar.f24352k) {
                return iVar.f24351j;
            }
            return null;
        }
    }

    public final boolean h() {
        boolean booleanValue;
        i iVar = this.f24326g;
        String str = this.f24325e;
        synchronized (iVar) {
            if (iVar.f24356o == null) {
                iVar.i(str);
            }
            booleanValue = iVar.f24356o.booleanValue();
        }
        return booleanValue;
    }

    public final void i(String str) {
        if (!h()) {
            if (str == null) {
                b0.m("MixpanelAPI.API", "Can't identify with null distinct_id.");
                return;
            }
            synchronized (this.f24326g) {
                String b10 = this.f24326g.b();
                if (!str.equals(b10)) {
                    if (str.startsWith("$device:")) {
                        b0.m("MixpanelAPI.API", "Can't identify with '$device:' distinct_id.");
                        return;
                    }
                    this.f24326g.m(str);
                    this.f24326g.l(b10);
                    this.f24326g.g();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("$anon_distinct_id", b10);
                        n(jSONObject, "$identify");
                    } catch (JSONException unused) {
                        b0.m("MixpanelAPI.API", "Could not track $identify event");
                    }
                }
                this.f.d(str);
            }
        }
    }

    public final void k(JSONObject jSONObject) {
        if (h()) {
            return;
        }
        i iVar = this.f24326g;
        synchronized (iVar.f24348g) {
            if (iVar.f == null) {
                iVar.k();
            }
            JSONObject jSONObject2 = iVar.f;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    jSONObject2.put(next, jSONObject.get(next));
                } catch (JSONException e10) {
                    b0.n("MixpanelAPI.PIdentity", "Exception registering super property.", e10);
                }
            }
            iVar.q();
        }
    }

    public final void l(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        this.f24326g.a(jSONObject);
        String str3 = null;
        try {
            String str4 = (String) jSONObject.get("mp_lib");
            try {
                str2 = (String) jSONObject.get("$lib_version");
            } catch (JSONException unused) {
                str2 = null;
            }
            str3 = str4;
        } catch (JSONException unused2) {
            str2 = null;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (str3 == null) {
            str3 = "Android";
        }
        jSONObject2.put("mp_lib", str3);
        jSONObject2.put("distinct_id", str);
        if (str2 == null) {
            str2 = "7.3.0";
        }
        jSONObject2.put("$lib_version", str2);
        jSONObject2.put("Project Token", str);
        a.C0381a c0381a = new a.C0381a("Integration", jSONObject2, "85053bf24bba75239b16a601d9387e17", new JSONObject());
        lg.a aVar = this.f24322b;
        aVar.getClass();
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = c0381a;
        aVar.f24266a.b(obtain);
        Message obtain2 = Message.obtain();
        obtain2.what = 2;
        obtain2.obj = "85053bf24bba75239b16a601d9387e17";
        obtain2.arg1 = 0;
        aVar.f24266a.b(obtain2);
    }

    public final void m(String str, JSONObject jSONObject, boolean z10) {
        Long l2;
        if (!h()) {
            if (!z10 || this.f24324d.booleanValue()) {
                synchronized (this.f24328i) {
                    l2 = (Long) this.f24328i.get(str);
                    this.f24328i.remove(str);
                    i iVar = this.f24326g;
                    iVar.getClass();
                    try {
                        try {
                            SharedPreferences.Editor edit = iVar.f24345c.get().edit();
                            edit.remove(str);
                            edit.apply();
                        } catch (InterruptedException e10) {
                            e10.printStackTrace();
                        }
                    } catch (ExecutionException e11) {
                        e11.printStackTrace();
                    }
                }
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry entry : this.f24326g.d().entrySet()) {
                        jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    this.f24326g.a(jSONObject2);
                    double currentTimeMillis = System.currentTimeMillis() / 1000.0d;
                    String b10 = this.f24326g.b();
                    String e12 = e();
                    String g5 = g();
                    jSONObject2.put("time", System.currentTimeMillis());
                    jSONObject2.put("distinct_id", b10);
                    jSONObject2.put("$had_persisted_distinct_id", this.f24326g.c());
                    if (e12 != null) {
                        jSONObject2.put("$device_id", e12);
                    }
                    if (g5 != null) {
                        jSONObject2.put("$user_id", g5);
                    }
                    if (l2 != null) {
                        jSONObject2.put("$duration", currentTimeMillis - (l2.longValue() / 1000.0d));
                    }
                    if (jSONObject != null) {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject2.put(next, jSONObject.opt(next));
                        }
                    }
                    a.C0381a c0381a = new a.C0381a(str, jSONObject2, this.f24325e, this.f24329j.a(true));
                    lg.a aVar = this.f24322b;
                    aVar.getClass();
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    obtain.obj = c0381a;
                    aVar.f24266a.b(obtain);
                } catch (JSONException e13) {
                    b0.n("MixpanelAPI.API", "Exception tracking event " + str, e13);
                }
            }
        }
    }

    public final void n(JSONObject jSONObject, String str) {
        if (h()) {
            return;
        }
        m(str, jSONObject, false);
    }
}
