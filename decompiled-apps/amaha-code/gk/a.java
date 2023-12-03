package gk;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.j1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import fk.g;
import java.util.HashMap;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.o0;
import org.json.JSONArray;
import org.json.JSONObject;
import ta.v;
/* compiled from: CustomAnalytics.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f16573a = LogHelper.INSTANCE.makeLogTag(a.class);

    /* renamed from: b  reason: collision with root package name */
    public static DatabaseReference f16574b = FirebaseDatabase.getInstance().getReference("eventlogs");

    /* renamed from: c  reason: collision with root package name */
    public static final String f16575c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f16576d;

    /* renamed from: e  reason: collision with root package name */
    public static InterfaceC0251a f16577e;

    /* compiled from: CustomAnalytics.kt */
    /* renamed from: gk.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0251a {
        void dataLogged();
    }

    static {
        f16575c = "";
        f16576d = "0";
        MyApplication.a aVar = MyApplication.V;
        PackageInfo packageInfo = aVar.a().getPackageManager().getPackageInfo(aVar.a().getPackageName(), 0);
        String str = packageInfo.versionName;
        i.f(str, "pi.versionName");
        f16575c = str;
        f16576d = String.valueOf(h0.a.a(packageInfo));
    }

    public static void a(Bundle bundle, String str) {
        if (str != null) {
            try {
                HashMap hashMap = new HashMap();
                if (bundle != null) {
                    for (String key : bundle.keySet()) {
                        Object obj = bundle.get(key);
                        i.f(key, "key");
                        hashMap.put(key, obj);
                    }
                }
                u3.b.h((o3.a) MyApplication.V.a().J.getValue(), str, hashMap, 4);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(f16573a, "exception", e10);
            }
        }
    }

    public static void b(Bundle bundle, String event) {
        String str = f16573a;
        i.g(event, "event");
        try {
            JSONObject jSONObject = new JSONObject();
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if (obj instanceof Object[]) {
                        jSONObject.put(str2, new JSONArray(obj));
                    } else {
                        jSONObject.put(str2, obj);
                    }
                }
            }
            MyApplication.V.a().d().n(jSONObject, event);
            if (g.f15127b.contains(event)) {
                UtilsKt.logError$default(str, null, new c(bundle, event), 2, null);
            }
            Boolean ANALYTICS_SEND = Constants.ANALYTICS_SEND;
            i.f(ANALYTICS_SEND, "ANALYTICS_SEND");
            if (ANALYTICS_SEND.booleanValue()) {
                v.H(h.c(o0.f23642c), null, 0, new b(bundle, event, null), 3);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, "exception in log event", e10);
        }
    }

    public static void c(Bundle bundle, String str) {
        if (bundle != null) {
            try {
                bundle.putLong("extend_session", 1L);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(f16573a, "exception in firing firebase analytics", e10);
                return;
            }
        }
        j1 j1Var = FirebaseAnalytics.getInstance(MyApplication.V.a()).f9535a;
        j1Var.getClass();
        j1Var.b(new d1(j1Var, null, str, bundle, false));
    }

    public static void d(Bundle bundle, InterfaceC0251a interfaceC0251a) {
        String str = f16573a;
        try {
            f16577e = interfaceC0251a;
            if (g.f15127b.contains("notification_activity_show")) {
                UtilsKt.logError$default(str, null, new c(bundle, "notification_activity_show"), 2, null);
            }
            JSONObject jSONObject = new JSONObject();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof Object[]) {
                    jSONObject.put(str2, new JSONArray(obj));
                } else {
                    jSONObject.put(str2, obj);
                }
            }
            MyApplication.V.a().d().n(jSONObject, "notification_activity_show");
            v.H(h.c(o0.f23642c), null, 0, new d(bundle, "notification_activity_show", null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, "exception in log event", e10);
        }
    }
}
