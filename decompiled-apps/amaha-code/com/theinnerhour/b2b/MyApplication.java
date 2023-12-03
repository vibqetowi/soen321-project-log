package com.theinnerhour.b2b;

import android.app.Activity;
import android.app.Application;
import android.app.NotificationManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AppsFlyerLib;
import com.bugsnag.android.Bugsnag;
import com.bugsnag.android.Configuration;
import com.bugsnag.android.Event;
import com.bugsnag.android.OnErrorCallback;
import com.bugsnag.android.internal.ImmutableConfigKt;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.v0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import com.moengage.core.MoEngage;
import com.theinnerhour.b2b.components.assetDownloader.AssetDownloadJobScheduler;
import com.theinnerhour.b2b.components.lock.activity.LockScreenActivity;
import com.theinnerhour.b2b.components.splash.activity.SplashScreenActivity;
import com.theinnerhour.b2b.model.OfflineAsset;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.GoalsNotificationPersistence;
import com.theinnerhour.b2b.persistence.GoalsPersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.service.DownloadJobScheduler;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DownloadUtil;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import eh.o;
import gv.n;
import hh.g;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import pg.j;
import qg.g0;
import qg.w;
import ss.p;
import ta.v;
import tr.r;
/* compiled from: MyApplication.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/theinnerhour/b2b/MyApplication;", "Landroid/app/Application;", "Lcom/theinnerhour/b2b/utils/ConnectionStatusReceiver$ConnectivityListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class MyApplication extends Application implements ConnectionStatusReceiver.ConnectivityListener, Application.ActivityLifecycleCallbacks {
    public static final a V = new a();
    public static MyApplication W;
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean H;
    public boolean I;
    public boolean M;
    public boolean P;
    public boolean Q;

    /* renamed from: v  reason: collision with root package name */
    public ConnectionStatusReceiver f10266v;

    /* renamed from: y  reason: collision with root package name */
    public boolean f10269y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f10270z;

    /* renamed from: u  reason: collision with root package name */
    public final String f10265u = LogHelper.INSTANCE.makeLogTag(MyApplication.class);

    /* renamed from: w  reason: collision with root package name */
    public int f10267w = 1;

    /* renamed from: x  reason: collision with root package name */
    public int f10268x = 1;
    public final String G = "";
    public final hs.i J = sp.b.O(new b());
    public final hs.i K = sp.b.O(e.f10274u);
    public final hs.i L = sp.b.O(new d());
    public boolean N = true;
    public String O = "";
    public final hs.i R = sp.b.O(new h());
    public final hs.i S = sp.b.O(new g());
    public final f T = new f();
    public final c U = new c();

    /* compiled from: MyApplication.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final synchronized MyApplication a() {
            MyApplication myApplication;
            myApplication = MyApplication.W;
            if (myApplication == null) {
                kotlin.jvm.internal.i.q("instance");
                throw null;
            }
            return myApplication;
        }
    }

    /* compiled from: MyApplication.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<o3.a> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final o3.a invoke() {
            MyApplication myApplication = MyApplication.this;
            String string = myApplication.getString(R.string.AMPLITUDE_ID);
            kotlin.jvm.internal.i.f(string, "getString(R.string.AMPLITUDE_ID)");
            return new o3.a(new o3.e(string, myApplication));
        }
    }

    /* compiled from: MyApplication.kt */
    /* loaded from: classes.dex */
    public static final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.i.g(context, "context");
            kotlin.jvm.internal.i.g(intent, "intent");
            int intExtra = intent.getIntExtra("asset_download_status", 1);
            MyApplication myApplication = MyApplication.this;
            myApplication.f10268x = intExtra;
            a aVar = MyApplication.V;
            myApplication.i(aVar.a());
            n1.a.a(aVar.a()).d(this);
            int i6 = myApplication.f10268x;
            if (i6 == 100 && myApplication.f10270z) {
                myApplication.g();
            } else if (i6 == 3) {
                myApplication.f10268x = 1;
            }
            myApplication.f10270z = false;
        }
    }

    /* compiled from: MyApplication.kt */
    /* loaded from: classes.dex */
    public static final class d extends k implements ss.a<lv.c> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final lv.c invoke() {
            File cacheDir = MyApplication.V.a().getCacheDir();
            kotlin.jvm.internal.i.f(cacheDir, "instance.cacheDir");
            return new lv.c(cacheDir, ((Number) MyApplication.this.K.getValue()).longValue());
        }
    }

    /* compiled from: MyApplication.kt */
    /* loaded from: classes.dex */
    public static final class e extends k implements ss.a<Long> {

        /* renamed from: u  reason: collision with root package name */
        public static final e f10274u = new e();

        public e() {
            super(0);
        }

        @Override // ss.a
        public final Long invoke() {
            return 10485760L;
        }
    }

    /* compiled from: MyApplication.kt */
    /* loaded from: classes.dex */
    public static final class f extends BroadcastReceiver {
        public f() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.i.g(context, "context");
            kotlin.jvm.internal.i.g(intent, "intent");
            int intExtra = intent.getIntExtra(DownloadUtil.DOWNLOAD_STATUS, 1);
            MyApplication myApplication = MyApplication.this;
            myApplication.f10267w = intExtra;
            a aVar = MyApplication.V;
            myApplication.i(aVar.a());
            n1.a.a(aVar.a()).d(this);
            int i6 = myApplication.f10267w;
            if (i6 == 100 && myApplication.f10269y) {
                myApplication.g();
            } else if (i6 == 3) {
                myApplication.f10267w = 1;
            }
            myApplication.f10269y = false;
        }
    }

    /* compiled from: MyApplication.kt */
    /* loaded from: classes.dex */
    public static final class g extends k implements ss.a<GoalsNotificationPersistence> {
        public g() {
            super(0);
        }

        @Override // ss.a
        public final GoalsNotificationPersistence invoke() {
            SharedPreferences sharedPreferences = MyApplication.this.getSharedPreferences(GoalsNotificationPersistence.GOALS_NOTIF_PERSISTENCE_KEY, 0);
            kotlin.jvm.internal.i.f(sharedPreferences, "getSharedPreferences(Goa…EY, Context.MODE_PRIVATE)");
            return new GoalsNotificationPersistence(sharedPreferences);
        }
    }

    /* compiled from: MyApplication.kt */
    /* loaded from: classes.dex */
    public static final class h extends k implements ss.a<GoalsPersistence> {
        public h() {
            super(0);
        }

        @Override // ss.a
        public final GoalsPersistence invoke() {
            SharedPreferences sharedPreferences = MyApplication.this.getSharedPreferences(GoalsPersistence.GOALS_PERSISTENCE_KEY, 0);
            kotlin.jvm.internal.i.f(sharedPreferences, "getSharedPreferences(Goa…EY, Context.MODE_PRIVATE)");
            return new GoalsPersistence(sharedPreferences);
        }
    }

    /* compiled from: MyApplication.kt */
    @ns.e(c = "com.theinnerhour.b2b.MyApplication$onCreate$1", f = "MyApplication.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
        public i(ls.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new i(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((i) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String j02;
            sp.b.d0(obj);
            a aVar = MyApplication.V;
            MyApplication myApplication = MyApplication.this;
            myApplication.getClass();
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(myApplication);
            kotlin.jvm.internal.i.f(firebaseAnalytics, "getInstance(this)");
            Boolean bool = Boolean.TRUE;
            j1 j1Var = firebaseAnalytics.f9535a;
            j1Var.getClass();
            j1Var.b(new v0(j1Var, bool, 1));
            Configuration configuration = new Configuration(myApplication.getString(R.string.BUGSNAG_ID));
            if (!Constants.CRASH_REPORT_SEND.booleanValue()) {
                configuration.addOnError(new OnErrorCallback() { // from class: ck.a
                    @Override // com.bugsnag.android.OnErrorCallback
                    public final boolean onError(Event event) {
                        return false;
                    }
                });
            }
            configuration.getEnabledErrorTypes().setNdkCrashes(false);
            configuration.getEnabledErrorTypes().setAnrs(true);
            Bugsnag.start(myApplication, configuration);
            Iterator<OfflineAsset> it = ApplicationPersistence.getInstance().getOfflineAssets().iterator();
            while (it.hasNext()) {
                it.next().setDownloading(false);
            }
            ApplicationPersistence.getInstance().updateOfflineAssetsSP();
            InstallReferrerClient.newBuilder(myApplication).build().startConnection(new r());
            hs.k kVar = hs.k.f19476a;
            AppsFlyerLib.getInstance().init(myApplication.getString(R.string.APPSFLYER_ID), null, myApplication);
            AppsFlyerLib.getInstance().start(myApplication);
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                wn.b.f36765a.getClass();
                wn.b.c(j02);
            }
            return hs.k.f19476a;
        }
    }

    public final void a(ConnectionStatusReceiver.ConnectivityListener connectivityListener) {
        if (this.f10266v == null) {
            ConnectionStatusReceiver connectionStatusReceiver = new ConnectionStatusReceiver();
            this.f10266v = connectionStatusReceiver;
            registerReceiver(connectionStatusReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        ConnectionStatusReceiver connectionStatusReceiver2 = this.f10266v;
        kotlin.jvm.internal.i.d(connectionStatusReceiver2);
        connectionStatusReceiver2.addConnectivityListener(connectivityListener);
    }

    public final GoalsNotificationPersistence b() {
        return (GoalsNotificationPersistence) this.S.getValue();
    }

    public final GoalsPersistence c() {
        return (GoalsPersistence) this.R.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0119 A[Catch: all -> 0x00cd, TryCatch #0 {all -> 0x00cd, blocks: (B:29:0x00b9, B:31:0x00c1, B:34:0x00cf, B:36:0x00d7, B:37:0x00df, B:39:0x00e7, B:43:0x00f6, B:45:0x00fe, B:47:0x010c, B:51:0x0119, B:49:0x0112, B:52:0x0126, B:53:0x0129), top: B:58:0x00b9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lg.f d() {
        String string;
        lg.f fVar;
        boolean z10;
        String userName;
        String makeLogTag = LogHelper.INSTANCE.makeLogTag("MixpanelUtils");
        Pattern compile = Pattern.compile("@ihtest.com|@theinnerhour.com|@amahahealth.com");
        kotlin.jvm.internal.i.f(compile, "compile(pattern)");
        boolean z11 = false;
        try {
            if (!ca.a.k("staging", "preProd").contains(ImmutableConfigKt.RELEASE_STAGE_PRODUCTION)) {
                if (FirebaseAuth.getInstance().f == null) {
                    string = V.a().getString(R.string.MIXPANEL_TOKEN);
                } else {
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null && (userName = user.getUserName()) != null && compile.matcher(userName).find()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_UID);
                        kotlin.jvm.internal.i.f(stringValue, "getInstance().getStringV…e(SessionManager.KEY_UID)");
                        if (!compile.matcher(stringValue).find()) {
                            string = V.a().getString(R.string.MIXPANEL_TOKEN);
                        }
                    }
                    string = V.a().getString(R.string.MIXPANEL_STAGING);
                }
            } else {
                string = V.a().getString(R.string.MIXPANEL_STAGING);
            }
            kotlin.jvm.internal.i.f(string, "{\n            // Check i…)\n            }\n        }");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(makeLogTag, e10);
            string = V.a().getString(R.string.MIXPANEL_STAGING);
            kotlin.jvm.internal.i.f(string, "{\n            LogHelper.…XPANEL_STAGING)\n        }");
        }
        HashMap hashMap = lg.f.f24318k;
        synchronized (hashMap) {
            try {
                Context applicationContext = getApplicationContext();
                if (lg.f.f24320m == null) {
                    lg.f.f24320m = lg.f.f24319l.a(this, "com.mixpanel.android.mpmetrics.ReferralInfo", null);
                }
                Map map = (Map) hashMap.get(string);
                if (map == null) {
                    map = new HashMap();
                    hashMap.put(string, map);
                }
                fVar = (lg.f) map.get(applicationContext);
                if (fVar == null) {
                    PackageManager packageManager = applicationContext.getPackageManager();
                    String packageName = applicationContext.getPackageName();
                    if (packageManager != null && packageName != null) {
                        if (packageManager.checkPermission("android.permission.INTERNET", packageName) != 0) {
                            b0.u("MixpanelAPI.ConfigurationChecker", "Package does not have permission android.permission.INTERNET - Mixpanel will not work at all!");
                            if (b0.q(4)) {
                                Log.i("MixpanelAPI.ConfigurationChecker", "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.INTERNET\" />");
                            }
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            fVar = new lg.f(applicationContext, lg.f.f24320m, string);
                            lg.f.j(this, fVar);
                            map.put(applicationContext, fVar);
                        }
                    }
                    b0.u("MixpanelAPI.ConfigurationChecker", "Can't check configuration when using a Context with null packageManager or packageName");
                    if (z11) {
                    }
                }
                lg.f.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        kotlin.jvm.internal.i.f(fVar, "getInstance(this, MixpanelUtils().getID(), true)");
        return fVar;
    }

    public final String e() {
        return this.G;
    }

    public final void f() {
        boolean z10;
        String str;
        ej.b bVar;
        if (this.Q && !this.P) {
            String string = getString(R.string.MOENGAGE_ID);
            kotlin.jvm.internal.i.f(string, "getString(R.string.MOENGAGE_ID)");
            dh.a aVar = new dh.a(string);
            aVar.f12856b = 3;
            j jVar = new j(R.drawable.ic_stat_notification_amaha, R.drawable.ic_amaha_logo);
            pg.k kVar = aVar.f12858d;
            kVar.getClass();
            kVar.f28417b = jVar;
            pg.c cVar = new pg.c(false);
            pg.k kVar2 = aVar.f12858d;
            kVar2.getClass();
            kVar2.f28419d = cVar;
            dh.i iVar = MoEngage.f10160a;
            iVar.getClass();
            synchronized (iVar.f12873a) {
                Context context = getApplicationContext();
                kotlin.jvm.internal.i.f(context, "context");
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hc.d.B = z10;
                if (!n.B0(string)) {
                    if (!n.B0(string)) {
                        if (hc.d.B) {
                            str = kotlin.jvm.internal.i.n("_DEBUG", string);
                        } else {
                            str = string;
                        }
                        kotlin.jvm.internal.i.g(str, "<set-?>");
                        aVar.f12855a = str;
                        ih.p pVar = new ih.p(new c9.d(string), aVar, th.b.a());
                        if (!g0.a(pVar)) {
                            hh.a aVar2 = hh.g.f17610d;
                            g.a.b(0, new dh.b(iVar, pVar), 3);
                        } else {
                            w.f29578a.getClass();
                            w.d(pVar).a(this);
                            Set<fh.a> set = o.f14029a;
                            o.f(this);
                            pVar.f20106e.c(new ah.e("LOAD_CONFIGURATION_FROM_DISK", true, new androidx.emoji2.text.g(25, iVar, context, pVar)));
                            hh.g.b(pVar.f20105d, 3, new dh.c(iVar), 2);
                            hh.g.b(pVar.f20105d, 3, new dh.d(iVar, pVar), 2);
                            hh.g.b(pVar.f20105d, 3, new dh.e(iVar), 2);
                        }
                    } else {
                        throw new IllegalStateException("App-id cannot be blank.");
                    }
                } else {
                    throw new IllegalStateException("App-Id is empty, SDK cannot be initialised.".toString());
                }
            }
            if (Build.VERSION.SDK_INT >= 33) {
                new yn.a();
                if (yn.a.b()) {
                    ej.b bVar2 = ej.b.f14047b;
                    if (bVar2 == null) {
                        synchronized (ej.b.class) {
                            bVar = ej.b.f14047b;
                            if (bVar == null) {
                                bVar = new ej.b();
                            }
                            ej.b.f14047b = bVar;
                        }
                        bVar2 = bVar;
                    }
                    bVar2.c(true, this);
                    if (ej.b.f14047b == null) {
                        synchronized (ej.b.class) {
                            ej.b bVar3 = ej.b.f14047b;
                            if (bVar3 == null) {
                                bVar3 = new ej.b();
                            }
                            ej.b.f14047b = bVar3;
                        }
                    }
                    ej.b.d(this);
                }
            }
            Utils.INSTANCE.updateFirebaseInstanceId();
            this.P = true;
            return;
        }
        Utils.INSTANCE.updateFirebaseInstanceId();
    }

    public final void g() {
        int i6 = this.f10267w;
        if (i6 == 100) {
            this.f10267w = 1;
        } else if (i6 == 99) {
            this.f10269y = true;
        }
        int i10 = this.f10267w;
        a aVar = V;
        if (i10 == 1) {
            a(aVar.a());
        }
        int i11 = this.f10268x;
        if (i11 == 100) {
            this.f10268x = 1;
        } else if (i11 == 99) {
            this.f10270z = true;
        }
        if (this.f10268x == 1) {
            a(aVar.a());
        }
    }

    public final boolean h() {
        return this.D;
    }

    public final void i(ConnectionStatusReceiver.ConnectivityListener connectivityListener) {
        ConnectionStatusReceiver connectionStatusReceiver = this.f10266v;
        if (connectionStatusReceiver != null) {
            kotlin.jvm.internal.i.d(connectionStatusReceiver);
            if (connectionStatusReceiver.removeConnectivityListener(connectivityListener) == 0) {
                unregisterReceiver(this.f10266v);
                this.f10266v = null;
            }
        }
    }

    @Override // com.theinnerhour.b2b.utils.ConnectionStatusReceiver.ConnectivityListener
    public final void networkConnected() {
        if (this.f10267w < 99) {
            JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(getPackageName(), DownloadJobScheduler.class.getName()));
            builder.setRequiredNetworkType(1);
            builder.setRequiresCharging(false);
            Object systemService = getSystemService("jobscheduler");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            ((JobScheduler) systemService).schedule(builder.build());
        }
        int i6 = this.f10267w;
        a aVar = V;
        if (i6 == 1) {
            n1.a.a(aVar.a()).b(this.T, new IntentFilter(DownloadUtil.DOWNLOAD_SERVICE_BROADCAST));
        }
        this.f10267w = 99;
        if (this.f10268x < 99) {
            JobInfo.Builder builder2 = new JobInfo.Builder(2, new ComponentName(getPackageName(), AssetDownloadJobScheduler.class.getName()));
            builder2.setRequiredNetworkType(1);
            builder2.setRequiresCharging(false);
            Object systemService2 = getSystemService("jobscheduler");
            kotlin.jvm.internal.i.e(systemService2, "null cannot be cast to non-null type android.app.job.JobScheduler");
            ((JobScheduler) systemService2).schedule(builder2.build());
        }
        if (this.f10268x == 1) {
            n1.a.a(aVar.a()).b(this.U, new IntentFilter("com.theinnerhour.b2b.allAssetDownloadBroadcast"));
        }
        this.f10268x = 99;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
        try {
            if (ApplicationPersistence.getInstance().containsKey(Constants.RA_GOAL_ID)) {
                Object systemService = getSystemService("notification");
                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).cancel(ApplicationPersistence.getInstance().getIntValue(Constants.RA_GOAL_ID));
                ApplicationPersistence.getInstance().deleteKey(Constants.RA_GOAL_ID);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10265u, "exception", e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.i.g(activity, "activity");
        kotlin.jvm.internal.i.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        String stringValue;
        kotlin.jvm.internal.i.g(activity, "activity");
        try {
            int i6 = this.A + 1;
            this.A = i6;
            if (((i6 == 1 && !this.B) || this.C) && (stringValue = ApplicationPersistence.getInstance().getStringValue("user_lock_code")) != null && !kotlin.jvm.internal.i.b(stringValue, "")) {
                if (activity instanceof SplashScreenActivity) {
                    this.C = true;
                    return;
                }
                this.C = false;
                Intent intent = new Intent(this, LockScreenActivity.class);
                intent.setFlags(268435456);
                startActivity(intent);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10265u, "exception", e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
        LogHelper.INSTANCE.i(this.f10265u, "on activity stopped ");
        this.B = activity.isChangingConfigurations();
        this.A--;
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        try {
            W = this;
            sc.e.i(this);
            zc.d dVar = (zc.d) sc.e.e().c(zc.d.class);
            kotlin.jvm.internal.i.f(dVar, "getInstance()");
            dVar.c();
            FirebasePersistence.getInstance().setContext(this);
            registerActivityLifecycleCallbacks(this);
            SessionManager.getInstance().setupSessionManager();
            d();
            if (LocationPersistence.INSTANCE.isIndianUser()) {
                this.Q = true;
                f();
            } else {
                Utils.INSTANCE.updateFirebaseInstanceId();
            }
            v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new i(null), 3);
        } catch (Exception e10) {
            String message = e10.getMessage();
            kotlin.jvm.internal.i.d(message);
            Log.e(this.f10265u, message);
        }
    }

    @Override // com.theinnerhour.b2b.utils.ConnectionStatusReceiver.ConnectivityListener
    public final void networkDisconnected() {
    }
}
