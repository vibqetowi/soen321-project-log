package kq;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: StressRelaxingActivityFragment.kt */
/* loaded from: classes2.dex */
public final class h extends com.android.volley.toolbox.h {
    public h(JSONObject jSONObject, qk.a aVar, dd.a aVar2) {
        super(1, "https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", jSONObject, aVar, aVar2);
    }

    @Override // e4.j
    public final Map<String, String> getHeaders() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        return hashMap;
    }
}
