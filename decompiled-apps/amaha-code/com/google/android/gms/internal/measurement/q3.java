package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import t.g;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class q3 implements t3 {

    /* renamed from: h  reason: collision with root package name */
    public static final t.b f8562h = new t.b();

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f8563i = {"key", "value"};

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f8564a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f8565b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f8566c;

    /* renamed from: d  reason: collision with root package name */
    public final p3 f8567d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f8568e;
    public volatile Map f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f8569g;

    public q3(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        p3 p3Var = new p3(this);
        this.f8567d = p3Var;
        this.f8568e = new Object();
        this.f8569g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f8564a = contentResolver;
        this.f8565b = uri;
        this.f8566c = runnable;
        contentResolver.registerContentObserver(uri, false, p3Var);
    }

    public static q3 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        q3 q3Var;
        synchronized (q3.class) {
            t.b bVar = f8562h;
            q3Var = (q3) bVar.getOrDefault(uri, null);
            if (q3Var == null) {
                try {
                    q3 q3Var2 = new q3(contentResolver, uri, runnable);
                    try {
                        bVar.put(uri, q3Var2);
                    } catch (SecurityException unused) {
                    }
                    q3Var = q3Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return q3Var;
    }

    public static synchronized void c() {
        synchronized (q3.class) {
            Iterator it = ((g.e) f8562h.values()).iterator();
            while (it.hasNext()) {
                q3 q3Var = (q3) it.next();
                q3Var.f8564a.unregisterContentObserver(q3Var.f8567d);
            }
            f8562h.clear();
        }
    }

    public final Map b() {
        Map map;
        Object a10;
        Map map2 = this.f;
        if (map2 == null) {
            synchronized (this.f8568e) {
                map2 = this.f;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        g.x xVar = new g.x(25, this);
                        try {
                            a10 = xVar.a();
                        } catch (SecurityException unused) {
                            long clearCallingIdentity = Binder.clearCallingIdentity();
                            try {
                                a10 = xVar.a();
                            } finally {
                                Binder.restoreCallingIdentity(clearCallingIdentity);
                            }
                        }
                        map = (Map) a10;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                        Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    }
                    this.f = map;
                    map2 = map;
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.measurement.t3
    public final /* bridge */ /* synthetic */ Object f(String str) {
        return (String) b().get(str);
    }
}
