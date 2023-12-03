package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.c0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: l  reason: collision with root package name */
    public static final long f9640l = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: m  reason: collision with root package name */
    public static c0 f9641m;

    /* renamed from: n  reason: collision with root package name */
    public static a7.g f9642n;

    /* renamed from: o  reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f9643o;

    /* renamed from: a  reason: collision with root package name */
    public final sc.e f9644a;

    /* renamed from: b  reason: collision with root package name */
    public final qe.a f9645b;

    /* renamed from: c  reason: collision with root package name */
    public final se.d f9646c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f9647d;

    /* renamed from: e  reason: collision with root package name */
    public final r f9648e;
    public final z f;

    /* renamed from: g  reason: collision with root package name */
    public final a f9649g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f9650h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f9651i;

    /* renamed from: j  reason: collision with root package name */
    public final u f9652j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9653k;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final ee.d f9654a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9655b;

        /* renamed from: c  reason: collision with root package name */
        public Boolean f9656c;

        public a(ee.d dVar) {
            this.f9654a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [com.google.firebase.messaging.q] */
        public final synchronized void a() {
            if (this.f9655b) {
                return;
            }
            Boolean b10 = b();
            this.f9656c = b10;
            if (b10 == null) {
                this.f9654a.a(new ee.b() { // from class: com.google.firebase.messaging.q
                    @Override // ee.b
                    public final void a(ee.a aVar) {
                        boolean k10;
                        FirebaseMessaging.a aVar2 = FirebaseMessaging.a.this;
                        synchronized (aVar2) {
                            aVar2.a();
                            Boolean bool = aVar2.f9656c;
                            if (bool != null) {
                                k10 = bool.booleanValue();
                            } else {
                                k10 = FirebaseMessaging.this.f9644a.k();
                            }
                        }
                        if (k10) {
                            c0 c0Var = FirebaseMessaging.f9641m;
                            FirebaseMessaging.this.h();
                        }
                    }
                });
            }
            this.f9655b = true;
        }

        public final Boolean b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            sc.e eVar = FirebaseMessaging.this.f9644a;
            eVar.b();
            Context context = eVar.f31432a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging() {
        throw null;
    }

    public FirebaseMessaging(sc.e eVar, qe.a aVar, re.b<mf.f> bVar, re.b<pe.g> bVar2, se.d dVar, a7.g gVar, ee.d dVar2) {
        eVar.b();
        Context context = eVar.f31432a;
        final u uVar = new u(context);
        final r rVar = new r(eVar, uVar, bVar, bVar2, dVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ba.a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ba.a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ba.a("Firebase-Messaging-File-Io"));
        this.f9653k = false;
        f9642n = gVar;
        this.f9644a = eVar;
        this.f9645b = aVar;
        this.f9646c = dVar;
        this.f9649g = new a(dVar2);
        eVar.b();
        final Context context2 = eVar.f31432a;
        this.f9647d = context2;
        l lVar = new l();
        this.f9652j = uVar;
        this.f9648e = rVar;
        this.f = new z(newSingleThreadExecutor);
        this.f9650h = scheduledThreadPoolExecutor;
        this.f9651i = threadPoolExecutor;
        eVar.b();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(lVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.d();
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.m

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f9753v;

            {
                this.f9753v = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                boolean z10;
                Context applicationContext;
                PackageManager packageManager;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                boolean k10;
                int i6 = r2;
                FirebaseMessaging firebaseMessaging = this.f9753v;
                switch (i6) {
                    case 0:
                        c0 c0Var = FirebaseMessaging.f9641m;
                        FirebaseMessaging.a aVar2 = firebaseMessaging.f9649g;
                        synchronized (aVar2) {
                            aVar2.a();
                            Boolean bool = aVar2.f9656c;
                            if (bool != null) {
                                k10 = bool.booleanValue();
                            } else {
                                k10 = FirebaseMessaging.this.f9644a.k();
                            }
                        }
                        if (k10) {
                            firebaseMessaging.h();
                            return;
                        }
                        return;
                    default:
                        Context context3 = firebaseMessaging.f9647d;
                        Context applicationContext2 = context3.getApplicationContext();
                        if (applicationContext2 == null) {
                            applicationContext2 = context3;
                        }
                        boolean z11 = false;
                        if (!applicationContext2.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                            try {
                                applicationContext = context3.getApplicationContext();
                                packageManager = applicationContext.getPackageManager();
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                                z10 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                                if (Build.VERSION.SDK_INT >= 29) {
                                    z11 = true;
                                }
                                if (z11) {
                                    ya.k.e(null);
                                    return;
                                } else {
                                    new n2.o(context3, z10, new ya.i(), 1).run();
                                    return;
                                }
                            }
                            z10 = true;
                            if (Build.VERSION.SDK_INT >= 29) {
                            }
                            if (z11) {
                            }
                        } else {
                            return;
                        }
                        break;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new ba.a("Firebase-Messaging-Topics-Io"));
        int i6 = h0.f9722j;
        ya.k.c(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.g0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                f0 f0Var;
                Context context3 = context2;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                u uVar2 = uVar;
                r rVar2 = rVar;
                synchronized (f0.class) {
                    WeakReference<f0> weakReference = f0.f9706d;
                    if (weakReference != null) {
                        f0Var = weakReference.get();
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        f0 f0Var2 = new f0(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledExecutorService);
                        f0Var2.b();
                        f0.f9706d = new WeakReference<>(f0Var2);
                        f0Var = f0Var2;
                    }
                }
                return new h0(firebaseMessaging, uVar2, f0Var, rVar2, context3, scheduledExecutorService);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new n(0, this));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.m

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f9753v;

            {
                this.f9753v = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                boolean z10;
                Context applicationContext;
                PackageManager packageManager;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                boolean k10;
                int i62 = r2;
                FirebaseMessaging firebaseMessaging = this.f9753v;
                switch (i62) {
                    case 0:
                        c0 c0Var = FirebaseMessaging.f9641m;
                        FirebaseMessaging.a aVar2 = firebaseMessaging.f9649g;
                        synchronized (aVar2) {
                            aVar2.a();
                            Boolean bool = aVar2.f9656c;
                            if (bool != null) {
                                k10 = bool.booleanValue();
                            } else {
                                k10 = FirebaseMessaging.this.f9644a.k();
                            }
                        }
                        if (k10) {
                            firebaseMessaging.h();
                            return;
                        }
                        return;
                    default:
                        Context context3 = firebaseMessaging.f9647d;
                        Context applicationContext2 = context3.getApplicationContext();
                        if (applicationContext2 == null) {
                            applicationContext2 = context3;
                        }
                        boolean z11 = false;
                        if (!applicationContext2.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                            try {
                                applicationContext = context3.getApplicationContext();
                                packageManager = applicationContext.getPackageManager();
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                                z10 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                                if (Build.VERSION.SDK_INT >= 29) {
                                    z11 = true;
                                }
                                if (z11) {
                                    ya.k.e(null);
                                    return;
                                } else {
                                    new n2.o(context3, z10, new ya.i(), 1).run();
                                    return;
                                }
                            }
                            z10 = true;
                            if (Build.VERSION.SDK_INT >= 29) {
                            }
                            if (z11) {
                            }
                        } else {
                            return;
                        }
                        break;
                }
            }
        });
    }

    public static void b(d0 d0Var, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f9643o == null) {
                f9643o = new ScheduledThreadPoolExecutor(1, new ba.a("TAG"));
            }
            f9643o.schedule(d0Var, j10, TimeUnit.SECONDS);
        }
    }

    public static synchronized c0 c(Context context) {
        c0 c0Var;
        synchronized (FirebaseMessaging.class) {
            if (f9641m == null) {
                f9641m = new c0(context);
            }
            c0Var = f9641m;
        }
        return c0Var;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(sc.e eVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) eVar.c(FirebaseMessaging.class);
            v9.o.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        ya.h hVar;
        qe.a aVar = this.f9645b;
        if (aVar != null) {
            try {
                return (String) ya.k.a(aVar.c());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        final c0.a e11 = e();
        if (!j(e11)) {
            return e11.f9689a;
        }
        final String c10 = u.c(this.f9644a);
        z zVar = this.f;
        synchronized (zVar) {
            hVar = (ya.h) zVar.f9789b.getOrDefault(c10, null);
            if (hVar != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + c10);
                }
            } else {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + c10);
                }
                r rVar = this.f9648e;
                hVar = rVar.a(rVar.c(u.c(rVar.f9771a), "*", new Bundle())).onSuccessTask(this.f9651i, new ya.g() { // from class: com.google.firebase.messaging.p
                    @Override // ya.g
                    public final ya.h h(Object obj) {
                        FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                        String str = c10;
                        c0.a aVar2 = e11;
                        String str2 = (String) obj;
                        c0 c11 = FirebaseMessaging.c(firebaseMessaging.f9647d);
                        String d10 = firebaseMessaging.d();
                        String a10 = firebaseMessaging.f9652j.a();
                        synchronized (c11) {
                            String a11 = c0.a.a(System.currentTimeMillis(), str2, a10);
                            if (a11 != null) {
                                SharedPreferences.Editor edit = c11.f9687a.edit();
                                edit.putString(c0.a(d10, str), a11);
                                edit.commit();
                            }
                        }
                        if (aVar2 == null || !str2.equals(aVar2.f9689a)) {
                            sc.e eVar = firebaseMessaging.f9644a;
                            eVar.b();
                            if ("[DEFAULT]".equals(eVar.f31433b)) {
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                                    eVar.b();
                                    sb2.append(eVar.f31433b);
                                    Log.d("FirebaseMessaging", sb2.toString());
                                }
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra("token", str2);
                                new k(firebaseMessaging.f9647d).c(intent);
                            }
                        }
                        return ya.k.e(str2);
                    }
                }).continueWithTask(zVar.f9788a, new dd.a(zVar, 24, c10));
                zVar.f9789b.put(c10, hVar);
            }
        }
        try {
            return (String) ya.k.a(hVar);
        } catch (InterruptedException | ExecutionException e12) {
            throw new IOException(e12);
        }
    }

    public final String d() {
        sc.e eVar = this.f9644a;
        eVar.b();
        if ("[DEFAULT]".equals(eVar.f31433b)) {
            return "";
        }
        return eVar.g();
    }

    public final c0.a e() {
        c0.a b10;
        c0 c10 = c(this.f9647d);
        String d10 = d();
        String c11 = u.c(this.f9644a);
        synchronized (c10) {
            b10 = c0.a.b(c10.f9687a.getString(c0.a(d10, c11), null));
        }
        return b10;
    }

    public final boolean f() {
        boolean k10;
        a aVar = this.f9649g;
        synchronized (aVar) {
            aVar.a();
            Boolean bool = aVar.f9656c;
            if (bool != null) {
                k10 = bool.booleanValue();
            } else {
                k10 = FirebaseMessaging.this.f9644a.k();
            }
        }
        return k10;
    }

    public final synchronized void g(boolean z10) {
        this.f9653k = z10;
    }

    public final void h() {
        qe.a aVar = this.f9645b;
        if (aVar != null) {
            aVar.a();
        } else if (j(e())) {
            synchronized (this) {
                if (!this.f9653k) {
                    i(0L);
                }
            }
        }
    }

    public final synchronized void i(long j10) {
        b(new d0(this, Math.min(Math.max(30L, 2 * j10), f9640l)), j10);
        this.f9653k = true;
    }

    public final boolean j(c0.a aVar) {
        boolean z10;
        if (aVar == null) {
            return true;
        }
        String a10 = this.f9652j.a();
        if (System.currentTimeMillis() <= aVar.f9691c + c0.a.f9688d && a10.equals(aVar.f9690b)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return true;
        }
        return false;
    }
}
