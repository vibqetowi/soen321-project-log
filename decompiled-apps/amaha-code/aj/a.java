package aj;

import di.n;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import org.json.JSONObject;
/* compiled from: CampaignContext.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f585a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f586b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Object> f587c;

    public a(String str, JSONObject payload, HashMap hashMap) {
        i.g(payload, "payload");
        this.f585a = str;
        this.f586b = payload;
        this.f587c = hashMap;
    }

    public static final a a(JSONObject payload) {
        i.g(payload, "payload");
        String string = payload.getString("cid");
        i.f(string, "payload.getString(CAMPAIGN_ID)");
        return new a(string, payload, n.e(payload));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !i.b(a.class, obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        if (!i.b(this.f585a, aVar.f585a)) {
            return false;
        }
        return i.b(this.f587c, aVar.f587c);
    }

    public final String toString() {
        String jSONObject = this.f586b.toString();
        i.f(jSONObject, "payload.toString()");
        return jSONObject;
    }
}
