package g6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import g6.p;
import g6.s;
import h5.h;
import h5.x;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import w5.d;
import w5.f0;
/* compiled from: LoginManager.kt */
/* loaded from: classes.dex */
public final class x {
    public static final b f = new b();

    /* renamed from: g  reason: collision with root package name */
    public static final Set<String> f16336g = ca.a.m1("ads_management", "create_event", "rsvp_event");

    /* renamed from: h  reason: collision with root package name */
    public static volatile x f16337h;

    /* renamed from: c  reason: collision with root package name */
    public final SharedPreferences f16340c;

    /* renamed from: a  reason: collision with root package name */
    public final o f16338a = o.NATIVE_WITH_FALLBACK;

    /* renamed from: b  reason: collision with root package name */
    public final d f16339b = d.FRIENDS;

    /* renamed from: d  reason: collision with root package name */
    public final String f16341d = "rerequest";

    /* renamed from: e  reason: collision with root package name */
    public final a0 f16342e = a0.FACEBOOK;

    /* compiled from: LoginManager.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.activity.result.g f16343a;

        /* renamed from: b  reason: collision with root package name */
        public final h5.l f16344b;

        public a(androidx.activity.result.g activityResultRegistryOwner, h5.l lVar) {
            kotlin.jvm.internal.i.g(activityResultRegistryOwner, "activityResultRegistryOwner");
            this.f16343a = activityResultRegistryOwner;
            this.f16344b = lVar;
        }

        public final void a(Intent intent) {
            w wVar = new w();
            androidx.activity.result.e d10 = this.f16343a.getActivityResultRegistry().d("facebook-login", new v(), new dd.a(this, 4, wVar));
            wVar.f16335a = d10;
            d10.a(intent);
        }
    }

    /* compiled from: LoginManager.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public static boolean b(String str) {
            if (str != null && (gv.n.H0(str, "publish") || gv.n.H0(str, "manage") || x.f16336g.contains(str))) {
                return true;
            }
            return false;
        }

        public final x a() {
            if (x.f16337h == null) {
                synchronized (this) {
                    x.f16337h = new x();
                    hs.k kVar = hs.k.f19476a;
                }
            }
            x xVar = x.f16337h;
            if (xVar != null) {
                return xVar;
            }
            kotlin.jvm.internal.i.q("instance");
            throw null;
        }
    }

    /* compiled from: LoginManager.kt */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f16345a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static s f16346b;

        /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
            r3 = r3;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized s a(Activity activity) {
            Activity activity2;
            if (activity == null) {
                activity2 = h5.p.a();
            }
            if (f16346b == null) {
                f16346b = new s(activity2, h5.p.b());
            }
            return f16346b;
        }
    }

    static {
        kotlin.jvm.internal.i.f(x.class.toString(), "LoginManager::class.java.toString()");
    }

    public x() {
        f0.e();
        SharedPreferences sharedPreferences = h5.p.a().getSharedPreferences("com.facebook.loginManager", 0);
        kotlin.jvm.internal.i.f(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.f16340c = sharedPreferences;
        if (h5.p.f17280m && w5.f.a() != null) {
            q.c.a(h5.p.a(), "com.android.chrome", new g6.c());
            Context a10 = h5.p.a();
            String packageName = h5.p.a().getPackageName();
            if (packageName != null) {
                Context applicationContext = a10.getApplicationContext();
                try {
                    q.c.a(applicationContext, packageName, new q.a(applicationContext));
                } catch (SecurityException unused) {
                }
            }
        }
    }

    public static void a(Activity activity, p.e.a aVar, Map map, FacebookException facebookException, boolean z10, p.d dVar) {
        String str;
        String message;
        s a10 = c.f16345a.a(activity);
        if (a10 == null) {
            return;
        }
        String str2 = "fb_mobile_login_complete";
        if (dVar == null) {
            ScheduledExecutorService scheduledExecutorService = s.f16328d;
            if (!b6.a.b(s.class)) {
                try {
                    a10.a("fb_mobile_login_complete", "");
                    return;
                } catch (Throwable th2) {
                    b6.a.a(s.class, th2);
                    return;
                }
            }
            return;
        }
        HashMap hashMap = new HashMap();
        if (z10) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("try_login_activity", str);
        String str3 = dVar.f16306y;
        if (dVar.G) {
            str2 = "foa_mobile_login_complete";
        }
        if (!b6.a.b(a10)) {
            ScheduledExecutorService scheduledExecutorService2 = s.f16328d;
            try {
                Bundle a11 = s.a.a(str3);
                if (aVar != null) {
                    a11.putString("2_result", aVar.f16318u);
                }
                JSONObject jSONObject = null;
                if (facebookException == null) {
                    message = null;
                } else {
                    message = facebookException.getMessage();
                }
                if (message != null) {
                    a11.putString("5_error_message", facebookException.getMessage());
                }
                if (!hashMap.isEmpty()) {
                    jSONObject = new JSONObject(hashMap);
                }
                if (map != null) {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    try {
                        for (Map.Entry entry : map.entrySet()) {
                            String str4 = (String) entry.getKey();
                            String str5 = (String) entry.getValue();
                            if (str4 != null) {
                                jSONObject.put(str4, str5);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                if (jSONObject != null) {
                    a11.putString("6_extras", jSONObject.toString());
                }
                a10.f16330b.a(a11, str2);
                if (aVar == p.e.a.SUCCESS && !b6.a.b(a10)) {
                    s.f16328d.schedule(new g.v(a10, 26, s.a.a(str3)), 5L, TimeUnit.SECONDS);
                }
            } catch (Throwable th3) {
                b6.a.a(a10, th3);
            }
        }
    }

    public final void b(int i6, Intent intent, h5.m mVar) {
        p.e.a aVar;
        h5.a aVar2;
        p.d dVar;
        FacebookException facebookException;
        Map<String, String> map;
        h5.h hVar;
        FacebookAuthorizationException facebookAuthorizationException;
        h5.h hVar2;
        boolean z10;
        p.e.a aVar3 = p.e.a.ERROR;
        boolean z11 = false;
        z zVar = null;
        if (intent != null) {
            intent.setExtrasClassLoader(p.e.class.getClassLoader());
            p.e eVar = (p.e) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (eVar != null) {
                p.e.a aVar4 = eVar.f16308u;
                if (i6 != -1) {
                    if (i6 != 0) {
                        facebookAuthorizationException = null;
                    } else {
                        aVar2 = null;
                        facebookException = null;
                        hVar2 = null;
                        z10 = true;
                        map = eVar.A;
                        dVar = eVar.f16313z;
                        hVar = hVar2;
                        z11 = z10;
                        aVar = aVar4;
                    }
                } else if (aVar4 == p.e.a.SUCCESS) {
                    aVar2 = eVar.f16309v;
                    hVar2 = eVar.f16310w;
                    facebookException = null;
                    z10 = false;
                    map = eVar.A;
                    dVar = eVar.f16313z;
                    hVar = hVar2;
                    z11 = z10;
                    aVar = aVar4;
                } else {
                    facebookAuthorizationException = new FacebookAuthorizationException(eVar.f16311x);
                }
                facebookException = facebookAuthorizationException;
                aVar2 = null;
                hVar2 = null;
                z10 = false;
                map = eVar.A;
                dVar = eVar.f16313z;
                hVar = hVar2;
                z11 = z10;
                aVar = aVar4;
            }
            aVar = aVar3;
            aVar2 = null;
            dVar = null;
            facebookException = null;
            map = null;
            hVar = null;
        } else {
            if (i6 == 0) {
                aVar = p.e.a.CANCEL;
                aVar2 = null;
                dVar = null;
                facebookException = null;
                map = null;
                hVar = null;
                z11 = true;
            }
            aVar = aVar3;
            aVar2 = null;
            dVar = null;
            facebookException = null;
            map = null;
            hVar = null;
        }
        if (facebookException == null && aVar2 == null && !z11) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        a(null, aVar, map, facebookException, true, dVar);
        if (aVar2 != null) {
            Date date = h5.a.F;
            h5.f.f.a().c(aVar2, true);
            Parcelable.Creator<h5.x> creator = h5.x.CREATOR;
            x.b.a();
        }
        if (hVar != null) {
            h.b.a(hVar);
        }
        if (mVar != null) {
            if (aVar2 != null && dVar != null) {
                Set<String> set = dVar.f16303v;
                Set L2 = is.u.L2(is.u.e2(aVar2.f17177v));
                if (dVar.f16307z) {
                    L2.retainAll(set);
                }
                Set L22 = is.u.L2(is.u.e2(set));
                L22.removeAll(L2);
                zVar = new z(aVar2, hVar, L2, L22);
            }
            if (!z11 && (zVar == null || !zVar.f16351c.isEmpty())) {
                if (facebookException != null) {
                    mVar.a(facebookException);
                    return;
                } else if (aVar2 != null && zVar != null) {
                    SharedPreferences.Editor edit = this.f16340c.edit();
                    edit.putBoolean("express_login_allowed", true);
                    edit.apply();
                    mVar.b(zVar);
                    return;
                } else {
                    return;
                }
            }
            mVar.onCancel();
        }
    }

    public final void c(h5.l lVar, final hn.v vVar) {
        if (lVar instanceof w5.d) {
            w5.d dVar = (w5.d) lVar;
            int d10 = d.c.Login.d();
            d.a aVar = new d.a() { // from class: g6.t
                @Override // w5.d.a
                public final void a(Intent intent, int i6) {
                    x this$0 = x.this;
                    kotlin.jvm.internal.i.g(this$0, "this$0");
                    this$0.b(i6, intent, vVar);
                }
            };
            dVar.getClass();
            dVar.f36447a.put(Integer.valueOf(d10), aVar);
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }
}
