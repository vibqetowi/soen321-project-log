package s5;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.FacebookException;
import g.v;
import h5.g0;
import i5.i;
import i5.s;
import is.w;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
import q5.f;
import s5.d;
import w5.e0;
import w5.l;
import w5.n;
import w5.o;
import w5.p;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f31270u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f31271v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Context f31272w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f31273x;

    public /* synthetic */ a(int i6, Context context, String str, String str2) {
        this.f31270u = i6;
        this.f31272w = context;
        this.f31271v = str;
        this.f31273x = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a aVar;
        JSONObject jSONObject;
        switch (this.f31270u) {
            case 0:
                Context context = this.f31272w;
                String str = this.f31271v;
                String applicationId = this.f31273x;
                if (!b6.a.b(b.class)) {
                    try {
                        i.g(context, "$context");
                        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                        String n10 = i.n("pingForOnDevice", applicationId);
                        if (sharedPreferences.getLong(n10, 0L) == 0) {
                            d dVar = d.f31277a;
                            if (!b6.a.b(d.class)) {
                                i.g(applicationId, "applicationId");
                                d.f31277a.b(d.a.MOBILE_APP_INSTALL, applicationId, w.f20676u);
                            }
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong(n10, System.currentTimeMillis());
                            edit.apply();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        b6.a.a(b.class, th2);
                        return;
                    }
                }
                return;
            case 1:
                n nVar = n.f36507a;
                String applicationId2 = this.f31271v;
                i.g(applicationId2, "$applicationId");
                Context context2 = this.f31272w;
                i.g(context2, "$context");
                String gateKeepersKey = this.f31273x;
                i.g(gateKeepersKey, "$gateKeepersKey");
                n.f36507a.getClass();
                JSONObject a10 = n.a();
                if (a10.length() != 0) {
                    n.d(a10, applicationId2);
                    context2.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(gateKeepersKey, a10.toString()).apply();
                    n.f36511e = Long.valueOf(System.currentTimeMillis());
                }
                n.e();
                n.f36508b.set(false);
                return;
            default:
                Context context3 = this.f31272w;
                String settingsKey = this.f31271v;
                String applicationId3 = this.f31273x;
                p pVar = p.f36526a;
                i.g(context3, "$context");
                i.g(settingsKey, "$settingsKey");
                i.g(applicationId3, "$applicationId");
                SharedPreferences sharedPreferences2 = context3.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                o oVar = null;
                String string = sharedPreferences2.getString(settingsKey, null);
                if (!e0.A(string)) {
                    if (string != null) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException unused) {
                            e0 e0Var = e0.f36453a;
                            h5.p pVar2 = h5.p.f17269a;
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            p.f36526a.getClass();
                            oVar = p.d(jSONObject, applicationId3);
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
                p.f36526a.getClass();
                JSONObject a11 = p.a();
                p.d(a11, applicationId3);
                sharedPreferences2.edit().putString(settingsKey, a11.toString()).apply();
                if (oVar != null) {
                    String str2 = oVar.f36520j;
                    if (!p.f36531g && str2 != null && str2.length() > 0) {
                        p.f36531g = true;
                        Log.w(p.f36527b, str2);
                    }
                }
                n.f36507a.getClass();
                JSONObject a12 = n.a();
                h5.p.a().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(defpackage.b.o(new Object[]{applicationId3}, 1, "com.facebook.internal.APP_GATEKEEPERS.%s", "java.lang.String.format(format, *args)"), a12.toString()).apply();
                n.d(a12, applicationId3);
                f fVar = f.f29153a;
                Context a13 = h5.p.a();
                String b10 = h5.p.b();
                if (g0.b()) {
                    if (a13 instanceof Application) {
                        Application application = (Application) a13;
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = i5.i.f19861c;
                        if (h5.p.h()) {
                            i5.c cVar = i5.c.f19836a;
                            if (!i5.c.f19840e) {
                                if (i5.i.b() == null) {
                                    i.a.d();
                                }
                                ScheduledThreadPoolExecutor b11 = i5.i.b();
                                if (b11 != null) {
                                    b11.execute(new i5.b(0));
                                } else {
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                            }
                            s sVar = s.f19889a;
                            if (!b6.a.b(s.class)) {
                                try {
                                    if (!s.f19892d.get()) {
                                        s.f19889a.b();
                                    }
                                } catch (Throwable th3) {
                                    b6.a.a(s.class, th3);
                                }
                            }
                            h5.p pVar3 = h5.p.f17269a;
                            if (!b6.a.b(h5.p.class)) {
                                try {
                                    h5.p.c().execute(new v(application.getApplicationContext(), 12, b10));
                                    l lVar = l.f36497a;
                                    if (l.c(l.b.OnDeviceEventProcessing) && b.a() && !b6.a.b(b.class)) {
                                        h5.p.c().execute(new a(0, h5.p.a(), "com.facebook.sdk.attributionTracking", b10));
                                    }
                                } catch (Throwable th4) {
                                    b6.a.a(h5.p.class, th4);
                                }
                            }
                            q5.c.b(application, b10);
                        } else {
                            throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
                        }
                    } else {
                        Log.w(f.f29154b, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
                    }
                }
                AtomicReference<p.a> atomicReference = p.f36530e;
                if (p.f36529d.containsKey(applicationId3)) {
                    aVar = p.a.SUCCESS;
                } else {
                    aVar = p.a.ERROR;
                }
                atomicReference.set(aVar);
                p.f36526a.e();
                return;
        }
    }

    public /* synthetic */ a(Context context, String str, String str2) {
        this.f31270u = 1;
        this.f31271v = str;
        this.f31272w = context;
        this.f31273x = str2;
    }
}
