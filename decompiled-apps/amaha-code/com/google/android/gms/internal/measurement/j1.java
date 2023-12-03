package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: i  reason: collision with root package name */
    public static volatile j1 f8435i;

    /* renamed from: a  reason: collision with root package name */
    public final String f8436a = "FA";

    /* renamed from: b  reason: collision with root package name */
    public final kotlin.jvm.internal.b0 f8437b = kotlin.jvm.internal.b0.f23449u;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f8438c;

    /* renamed from: d  reason: collision with root package name */
    public final sa.a f8439d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f8440e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8441g;

    /* renamed from: h  reason: collision with root package name */
    public volatile k0 f8442h;

    public j1(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c1());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f8438c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f8439d = new sa.a(this);
        this.f8440e = new ArrayList();
        try {
            if (kotlin.jvm.internal.h.t0(context, ta.s3.a(context)) != null) {
                boolean z10 = false;
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, j1.class.getClassLoader());
                    z10 = true;
                } catch (ClassNotFoundException unused) {
                }
                if (!z10) {
                    this.f8441g = true;
                    Log.w(this.f8436a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        b(new y0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f8436a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new i1(this));
        }
    }

    public static j1 d(Context context, Bundle bundle) {
        v9.o.h(context);
        if (f8435i == null) {
            synchronized (j1.class) {
                if (f8435i == null) {
                    f8435i = new j1(context, bundle);
                }
            }
        }
        return f8435i;
    }

    public final void a(Exception exc, boolean z10, boolean z11) {
        this.f8441g |= z10;
        String str = this.f8436a;
        if (z10) {
            Log.w(str, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            b(new b1(this, exc));
        }
        Log.w(str, "Error with data collection. Data lost.", exc);
    }

    public final void b(e1 e1Var) {
        this.f8438c.execute(e1Var);
    }

    public final int c(String str) {
        g0 g0Var = new g0();
        b(new b1(this, str, g0Var));
        Integer num = (Integer) g0.R1(g0Var.z(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final List e(String str, String str2) {
        g0 g0Var = new g0();
        b(new w0(this, str, str2, g0Var, 1));
        List list = (List) g0.R1(g0Var.z(5000L), List.class);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public final Map f(String str, String str2, boolean z10) {
        g0 g0Var = new g0();
        b(new a1(this, str, str2, z10, g0Var));
        Bundle z11 = g0Var.z(5000L);
        if (z11 != null && z11.size() != 0) {
            HashMap hashMap = new HashMap(z11.size());
            for (String str3 : z11.keySet()) {
                Object obj = z11.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
