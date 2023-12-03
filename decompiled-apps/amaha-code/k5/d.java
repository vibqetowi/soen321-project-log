package k5;

import android.content.SharedPreferences;
import h5.p;
import h5.w;
import java.util.HashMap;
import w5.v;
/* compiled from: AppEventsCAPIManager.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f22971a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final String f22972b = d.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f22973c;

    public static void a(HashMap hashMap) {
        SharedPreferences sharedPreferences = p.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        Object obj = hashMap.get("dataset_id");
        Object obj2 = hashMap.get("endpoint");
        Object obj3 = hashMap.get("access_key");
        if (obj != null && obj2 != null && obj3 != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("dataset_id", obj.toString());
            edit.putString("endpoint", obj2.toString());
            edit.putString("access_key", obj3.toString());
            edit.apply();
            v.a aVar = v.f36544d;
            w wVar = w.APP_EVENTS;
            String tag = f22972b.toString();
            kotlin.jvm.internal.i.g(tag, "tag");
            p.i(wVar);
        }
    }
}
