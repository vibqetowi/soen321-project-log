package l5;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import g.v;
import h5.p;
import h5.q;
import h5.u;
import h5.w;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w5.v;
/* compiled from: ViewIndexer.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: e  reason: collision with root package name */
    public static final String f24084e;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f24085a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Activity> f24086b;

    /* renamed from: c  reason: collision with root package name */
    public Timer f24087c;

    /* renamed from: d  reason: collision with root package name */
    public String f24088d;

    /* compiled from: ViewIndexer.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static q a(String str, h5.a aVar, String str2) {
            String str3;
            String str4 = q.f17287j;
            String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            i.f(format, "java.lang.String.format(locale, format, *args)");
            q h10 = q.c.h(aVar, format, null, null);
            Bundle bundle = h10.f17293d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("tree", str);
            int i6 = q5.d.f29148a;
            Context a10 = p.a();
            try {
                str3 = a10.getPackageManager().getPackageInfo(a10.getPackageName(), 0).versionName;
                i.f(str3, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            } catch (PackageManager.NameNotFoundException unused) {
                str3 = "";
            }
            bundle.putString("app_version", str3);
            bundle.putString("platform", "android");
            bundle.putString("request_type", "app_indexing");
            if (i.b("app_indexing", "app_indexing")) {
                bundle.putString("device_session_id", l5.b.a());
            }
            h10.f17293d = bundle;
            h10.j(new k5.c(1));
            return h10;
        }
    }

    /* compiled from: ViewIndexer.kt */
    /* loaded from: classes.dex */
    public static final class b implements Callable<String> {

        /* renamed from: u  reason: collision with root package name */
        public final WeakReference<View> f24089u;

        public b(View view) {
            this.f24089u = new WeakReference<>(view);
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            View view = this.f24089u.get();
            if (view != null && view.getWidth() != 0 && view.getHeight() != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                view.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                i.f(encodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
                return encodeToString;
            }
            return "";
        }
    }

    /* compiled from: ViewIndexer.kt */
    /* loaded from: classes.dex */
    public static final class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            WeakReference<Activity> weakReference;
            boolean z10;
            try {
                boolean b10 = b6.a.b(e.class);
                Handler handler = null;
                e eVar = e.this;
                if (!b10) {
                    weakReference = eVar.f24086b;
                } else {
                    weakReference = null;
                }
                Activity activity = weakReference.get();
                View b11 = q5.d.b(activity);
                if (activity != null && b11 != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    l5.b bVar = l5.b.f24059a;
                    if (!b6.a.b(l5.b.class)) {
                        z10 = l5.b.f24064g.get();
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        return;
                    }
                    String str = "";
                    if (i.b(null, Boolean.TRUE)) {
                        m5.e.a("CaptureViewHierarchy", "");
                        return;
                    }
                    FutureTask futureTask = new FutureTask(new b(b11));
                    if (!b6.a.b(e.class)) {
                        handler = eVar.f24085a;
                    }
                    handler.post(futureTask);
                    try {
                        str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                    } catch (Exception e10) {
                        Log.e(e.a(), "Failed to take screenshot.", e10);
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("screenname", simpleName);
                        jSONObject.put("screenshot", str);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(m5.f.c(b11));
                        jSONObject.put("view", jSONArray);
                    } catch (JSONException unused) {
                        Log.e(e.a(), "Failed to create JSONObject");
                    }
                    String jSONObject2 = jSONObject.toString();
                    i.f(jSONObject2, "viewTree.toString()");
                    if (!b6.a.b(e.class)) {
                        eVar.getClass();
                        if (!b6.a.b(eVar)) {
                            try {
                                p.c().execute(new v(jSONObject2, 22, eVar));
                            } catch (Throwable th2) {
                                b6.a.a(eVar, th2);
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                Log.e(e.a(), "UI Component tree indexing failure!", e11);
            }
        }
    }

    static {
        String canonicalName = e.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f24084e = canonicalName;
    }

    public e(Activity activity) {
        i.g(activity, "activity");
        this.f24086b = new WeakReference<>(activity);
        this.f24088d = null;
        this.f24085a = new Handler(Looper.getMainLooper());
    }

    public static final /* synthetic */ String a() {
        if (b6.a.b(e.class)) {
            return null;
        }
        try {
            return f24084e;
        } catch (Throwable th2) {
            b6.a.a(e.class, th2);
            return null;
        }
    }

    public final void b(q qVar, String str) {
        String str2 = f24084e;
        if (b6.a.b(this) || qVar == null) {
            return;
        }
        try {
            u c10 = qVar.c();
            try {
                JSONObject jSONObject = c10.f17317b;
                if (jSONObject != null) {
                    if (i.b("true", jSONObject.optString("success"))) {
                        v.a aVar = w5.v.f36544d;
                        v.a.a(w.APP_EVENTS, str2, "Successfully send UI component tree to server");
                        this.f24088d = str;
                    }
                    if (jSONObject.has("is_app_indexing_enabled")) {
                        boolean z10 = jSONObject.getBoolean("is_app_indexing_enabled");
                        l5.b bVar = l5.b.f24059a;
                        if (!b6.a.b(l5.b.class)) {
                            try {
                                l5.b.f24064g.set(z10);
                                return;
                            } catch (Throwable th2) {
                                b6.a.a(l5.b.class, th2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                Log.e(str2, i.n(c10.f17318c, "Error sending UI component tree to Facebook: "));
            } catch (JSONException e10) {
                Log.e(str2, "Error decoding server response.", e10);
            }
        } catch (Throwable th3) {
            b6.a.a(this, th3);
        }
    }

    public final void c() {
        if (b6.a.b(this)) {
            return;
        }
        try {
            try {
                p.c().execute(new g.v(this, 21, new c()));
            } catch (RejectedExecutionException e10) {
                Log.e(f24084e, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
