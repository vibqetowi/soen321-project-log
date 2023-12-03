package wh;

import di.l;
import gv.n;
import ih.p;
import java.util.List;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ApiManager.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final p f36702a;

    /* renamed from: b  reason: collision with root package name */
    public final String f36703b;

    public f(p sdkInstance) {
        i.g(sdkInstance, "sdkInstance");
        this.f36702a = sdkInstance;
        this.f36703b = "Core_ApiManager";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:6:0x002f, B:9:0x0041, B:15:0x004d, B:16:0x0052), top: B:26:0x002f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject a(oh.c cVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        boolean z10;
        JSONObject jSONObject3 = new JSONObject();
        Object value = ((l) cVar.f22021d).f12898b;
        i.g(value, "value");
        jSONObject3.put("query_params", value);
        JSONArray jSONArray = new JSONArray();
        for (nh.a aVar : (List) cVar.f27466h) {
            try {
                jSONObject2 = new JSONObject();
                ih.e eVar = aVar.f26317c;
                jSONObject2.put("msg", eVar.f20078b);
                str = eVar.f20079c;
            } catch (Exception e10) {
                this.f36702a.f20105d.a(1, e10, new c(this));
                jSONObject = null;
            }
            if (str != null && !n.B0(str)) {
                z10 = false;
                if (!z10) {
                    jSONObject2.put("trace", str);
                }
                jSONObject = new JSONObject();
                jSONObject.put("log_type", aVar.f26315a);
                jSONObject.put("sent_time", aVar.f26316b);
                jSONObject.put("lake_fields", jSONObject2);
                if (jSONObject != null && jSONObject.length() != 0) {
                    jSONArray.put(jSONObject);
                }
            }
            z10 = true;
            if (!z10) {
            }
            jSONObject = new JSONObject();
            jSONObject.put("log_type", aVar.f26315a);
            jSONObject.put("sent_time", aVar.f26316b);
            jSONObject.put("lake_fields", jSONObject2);
            if (jSONObject != null) {
                jSONArray.put(jSONObject);
            }
        }
        jSONObject3.put("logs", jSONArray);
        return jSONObject3;
    }
}
