package u5;

import android.app.Activity;
import h5.p;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;
import u5.e;
import w5.o;
/* compiled from: SuggestedEventsManager.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f33819a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f33820b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashSet f33821c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashSet f33822d = new LinkedHashSet();

    public static final synchronized void a() {
        synchronized (d.class) {
            if (b6.a.b(d.class)) {
                return;
            }
            p.c().execute(new i5.b(13));
        }
    }

    public static final void d(Activity activity) {
        boolean z10;
        if (b6.a.b(d.class)) {
            return;
        }
        try {
            i.g(activity, "activity");
            try {
                if (f33820b.get()) {
                    a aVar = a.f33808a;
                    if (!b6.a.b(a.class)) {
                        try {
                            z10 = a.f;
                        } catch (Throwable th2) {
                            b6.a.a(a.class, th2);
                        }
                        if (z10 && (!f33821c.isEmpty() || !f33822d.isEmpty())) {
                            HashMap hashMap = e.f33823x;
                            e.a.a(activity);
                            return;
                        }
                    }
                    z10 = false;
                    if (z10) {
                        HashMap hashMap2 = e.f33823x;
                        e.a.a(activity);
                        return;
                    }
                }
                HashMap hashMap3 = e.f33823x;
                e.a.b(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th3) {
            b6.a.a(d.class, th3);
        }
    }

    public final void b() {
        String str;
        File d10;
        Activity activity;
        if (b6.a.b(this)) {
            return;
        }
        try {
            w5.p pVar = w5.p.f36526a;
            o f = w5.p.f(p.b(), false);
            if (f == null || (str = f.f36522l) == null) {
                return;
            }
            c(str);
            if ((!(!f33821c.isEmpty()) && !(!f33822d.isEmpty())) || (d10 = r5.c.d()) == null) {
                return;
            }
            a.d(d10);
            WeakReference<Activity> weakReference = q5.c.f29147l;
            if (weakReference != null) {
                activity = weakReference.get();
            } else {
                activity = null;
            }
            if (activity != null) {
                d(activity);
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final void c(String str) {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        if (b6.a.b(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i6 = 0;
            if (jSONObject.has("production_events") && (length2 = (jSONArray2 = jSONObject.getJSONArray("production_events")).length()) > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    LinkedHashSet linkedHashSet = f33821c;
                    String string = jSONArray2.getString(i10);
                    i.f(string, "jsonArray.getString(i)");
                    linkedHashSet.add(string);
                    if (i11 >= length2) {
                        break;
                    }
                    i10 = i11;
                }
            }
            if (!jSONObject.has("eligible_for_prediction_events") || (length = (jSONArray = jSONObject.getJSONArray("eligible_for_prediction_events")).length()) <= 0) {
                return;
            }
            while (true) {
                int i12 = i6 + 1;
                LinkedHashSet linkedHashSet2 = f33822d;
                String string2 = jSONArray.getString(i6);
                i.f(string2, "jsonArray.getString(i)");
                linkedHashSet2.add(string2);
                if (i12 < length) {
                    i6 = i12;
                } else {
                    return;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
