package u5;

import android.content.SharedPreferences;
import android.view.View;
import h5.p;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w5.e0;
/* compiled from: PredictionHistoryManager.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static SharedPreferences f33815c;

    /* renamed from: a  reason: collision with root package name */
    public static final b f33813a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f33814b = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f33816d = new AtomicBoolean(false);

    public static final void a(String str, String predictedEvent) {
        if (b6.a.b(b.class)) {
            return;
        }
        try {
            i.g(predictedEvent, "predictedEvent");
            if (!f33816d.get()) {
                f33813a.c();
            }
            LinkedHashMap linkedHashMap = f33814b;
            linkedHashMap.put(str, predictedEvent);
            SharedPreferences sharedPreferences = f33815c;
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                e0 e0Var = e0.f36453a;
                edit.putString("SUGGESTED_EVENTS_HISTORY", e0.E(is.e0.x0(linkedHashMap))).apply();
                return;
            }
            i.q("shardPreferences");
            throw null;
        } catch (Throwable th2) {
            b6.a.a(b.class, th2);
        }
    }

    public static final String b(View view, String text) {
        if (b6.a.b(b.class)) {
            return null;
        }
        try {
            i.g(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = m5.f.h(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            e0 e0Var = e0.f36453a;
            return e0.K(jSONObject.toString());
        } catch (Throwable th2) {
            b6.a.a(b.class, th2);
            return null;
        }
    }

    public final void c() {
        String str = "";
        if (b6.a.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f33816d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = p.a().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            i.f(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            f33815c = sharedPreferences;
            LinkedHashMap linkedHashMap = f33814b;
            e0 e0Var = e0.f36453a;
            SharedPreferences sharedPreferences2 = f33815c;
            if (sharedPreferences2 != null) {
                String string = sharedPreferences2.getString("SUGGESTED_EVENTS_HISTORY", "");
                if (string != null) {
                    str = string;
                }
                linkedHashMap.putAll(e0.D(str));
                atomicBoolean.set(true);
                return;
            }
            i.q("shardPreferences");
            throw null;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
