package i5;

import android.content.Context;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.FacebookException;
import g.v;
import h5.a;
import h5.w;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import w5.e0;
import w5.f0;
import w5.l;
import w5.s;
import w5.t;
import w5.v;
/* compiled from: AppEventsLoggerImpl.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: c */
    public static ScheduledThreadPoolExecutor f19861c;

    /* renamed from: d */
    public static final Object f19862d;

    /* renamed from: e */
    public static String f19863e;
    public static boolean f;

    /* renamed from: a */
    public final String f19864a;

    /* renamed from: b */
    public final i5.a f19865b;

    /* compiled from: AppEventsLoggerImpl.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* compiled from: AppEventsLoggerImpl.kt */
        /* renamed from: i5.i$a$a */
        /* loaded from: classes.dex */
        public static final class C0300a implements s.a {
            @Override // w5.s.a
            public final void a(String str) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = i.f19861c;
                h5.p.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", str).apply();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x0073 A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #1 {all -> 0x0082, blocks: (B:86:0x0044, B:96:0x0067, B:103:0x0073, B:90:0x0057), top: B:127:0x0044 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void a(d dVar, i5.a accessTokenAppId) {
            boolean z10;
            boolean z11;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = i.f19861c;
            String str = f.f19852a;
            if (!b6.a.b(f.class)) {
                try {
                    kotlin.jvm.internal.i.g(accessTokenAppId, "accessTokenAppId");
                    f.f19855d.execute(new v(accessTokenAppId, 15, dVar));
                } catch (Throwable th2) {
                    b6.a.a(f.class, th2);
                }
            }
            w5.l lVar = w5.l.f36497a;
            boolean c10 = w5.l.c(l.b.OnDevicePostInstallEventProcessing);
            boolean z12 = false;
            String str2 = dVar.f19845x;
            boolean z13 = dVar.f19843v;
            if (c10 && s5.b.a()) {
                String applicationId = accessTokenAppId.f19831u;
                if (!b6.a.b(s5.b.class)) {
                    try {
                        kotlin.jvm.internal.i.g(applicationId, "applicationId");
                        s5.b bVar = s5.b.f31274a;
                        bVar.getClass();
                        if (!b6.a.b(bVar)) {
                            if (z13 && s5.b.f31275b.contains(str2)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!(!z13)) {
                                if (z11) {
                                }
                            }
                            z10 = true;
                            if (z10) {
                                h5.p.c().execute(new v(applicationId, 24, dVar));
                            }
                        }
                        z10 = false;
                        if (z10) {
                        }
                    } catch (Throwable th3) {
                        b6.a.a(s5.b.class, th3);
                    }
                }
            }
            if (!z13) {
                if (!b6.a.b(i.class)) {
                    try {
                        z12 = i.f;
                    } catch (Throwable th4) {
                        b6.a.a(i.class, th4);
                    }
                }
                if (!z12) {
                    if (kotlin.jvm.internal.i.b(str2, "fb_mobile_activate_app")) {
                        if (!b6.a.b(i.class)) {
                            try {
                                i.f = true;
                                return;
                            } catch (Throwable th5) {
                                b6.a.a(i.class, th5);
                                return;
                            }
                        }
                        return;
                    }
                    v.a aVar = w5.v.f36544d;
                    v.a.a(w.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
                }
            }
        }

        public static h b() {
            h hVar;
            synchronized (i.c()) {
                if (!b6.a.b(i.class)) {
                    hVar = h.AUTO;
                } else {
                    hVar = null;
                }
            }
            return hVar;
        }

        public static String c() {
            C0300a c0300a = new C0300a();
            if (!h5.p.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(h5.p.a()).build();
                try {
                    build.startConnection(new t(build, c0300a));
                } catch (Exception unused) {
                }
            }
            return h5.p.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        public static void d() {
            synchronized (i.c()) {
                if (i.b() != null) {
                    return;
                }
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                if (!b6.a.b(i.class)) {
                    i.f19861c = scheduledThreadPoolExecutor;
                }
                hs.k kVar = hs.k.f19476a;
                b bVar = new b(3);
                ScheduledThreadPoolExecutor b10 = i.b();
                if (b10 != null) {
                    b10.scheduleAtFixedRate(bVar, 0L, 86400L, TimeUnit.SECONDS);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
    }

    static {
        new a();
        f19862d = new Object();
    }

    public i(String str, String str2) {
        f0.e();
        this.f19864a = str;
        Date date = h5.a.F;
        h5.a b10 = a.b.b();
        if (b10 != null && !new Date().after(b10.f17176u) && (str2 == null || kotlin.jvm.internal.i.b(str2, b10.B))) {
            this.f19865b = new i5.a(b10.f17180y, h5.p.b());
        } else {
            if (str2 == null) {
                e0 e0Var = e0.f36453a;
                str2 = e0.q(h5.p.a());
            }
            this.f19865b = new i5.a(null, str2);
        }
        a.d();
    }

    public static final /* synthetic */ String a() {
        if (b6.a.b(i.class)) {
            return null;
        }
        try {
            return f19863e;
        } catch (Throwable th2) {
            b6.a.a(i.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (b6.a.b(i.class)) {
            return null;
        }
        try {
            return f19861c;
        } catch (Throwable th2) {
            b6.a.a(i.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ Object c() {
        if (b6.a.b(i.class)) {
            return null;
        }
        try {
            return f19862d;
        } catch (Throwable th2) {
            b6.a.a(i.class, th2);
            return null;
        }
    }

    public final void d(Bundle bundle, String str) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            e(str, null, bundle, false, q5.c.a());
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final void e(String str, Double d10, Bundle bundle, boolean z10, UUID uuid) {
        boolean z11;
        boolean z12;
        if (!b6.a.b(this) && str != null) {
            try {
                if (str.length() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    w5.n nVar = w5.n.f36507a;
                    boolean b10 = w5.n.b("app_events_killswitch", h5.p.b(), false);
                    w wVar = w.APP_EVENTS;
                    if (b10) {
                        v.a aVar = w5.v.f36544d;
                        h5.p.i(wVar);
                        return;
                    }
                    try {
                        String str2 = this.f19864a;
                        if (q5.c.f29146k == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        a.a(new d(str2, str, d10, bundle, z10, z12, uuid), this.f19865b);
                    } catch (FacebookException e10) {
                        v.a aVar2 = w5.v.f36544d;
                        e10.toString();
                        h5.p.i(wVar);
                    } catch (JSONException e11) {
                        v.a aVar3 = w5.v.f36544d;
                        e11.toString();
                        h5.p.i(wVar);
                    }
                }
            } catch (Throwable th2) {
                b6.a.a(this, th2);
            }
        }
    }

    public final void f(String str, Bundle bundle) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            e(str, null, bundle, true, q5.c.a());
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final void g(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (b6.a.b(this)) {
            return;
        }
        w wVar = w.DEVELOPER_ERRORS;
        try {
            if (bigDecimal == null) {
                v.a aVar = w5.v.f36544d;
                v.a.a(wVar, "AppEvents", "purchaseAmount cannot be null");
            } else if (currency == null) {
                v.a aVar2 = w5.v.f36544d;
                v.a.a(wVar, "AppEvents", "currency cannot be null");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                e("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, true, q5.c.a());
                if (a.b() != h.EXPLICIT_ONLY) {
                    String str = f.f19852a;
                    f.c(l.EAGER_FLUSHING_EVENT);
                }
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public i(Context context, String str) {
        this(e0.l(context), str);
    }
}
