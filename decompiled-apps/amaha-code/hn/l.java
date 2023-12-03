package hn;

import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: LoginSignupReworkRepository.kt */
/* loaded from: classes2.dex */
public final class l extends CustomVolleyJsonObjectRequest {
    public l(JSONObject jSONObject, m mVar, n nVar) {
        super(1, "https://api.theinnerhour.com/v1/authenticate/", jSONObject, mVar, nVar);
    }

    @Override // com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest, e4.j
    public final Map<String, String> getHeaders() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        hashMap.put("Android-Version", "214");
        hashMap.put("Create-Firebase", "false");
        return hashMap;
    }
}
