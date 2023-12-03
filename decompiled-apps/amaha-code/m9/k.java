package m9;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class k extends s {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f24996q;
    public final /* synthetic */ JSONObject r = null;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ g f24997s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(g gVar, int i6) {
        super(gVar, false);
        this.f24996q = i6;
        this.f24997s = gVar;
    }

    @Override // m9.s
    public final void m() {
        int i6 = this.f24996q;
        JSONObject jSONObject = this.r;
        g gVar = this.f24997s;
        switch (i6) {
            case 0:
                gVar.f24986c.t(n(), -1, jSONObject);
                return;
            case 1:
                gVar.f24986c.t(n(), 1, jSONObject);
                return;
            case 2:
                p9.l lVar = gVar.f24986c;
                p9.m n10 = n();
                lVar.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long q10 = lVar.q();
                try {
                    jSONObject2.put("requestId", q10);
                    jSONObject2.put("type", "PAUSE");
                    jSONObject2.put("mediaSessionId", lVar.u());
                    if (jSONObject != null) {
                        jSONObject2.put("customData", jSONObject);
                    }
                } catch (JSONException unused) {
                }
                lVar.p(q10, jSONObject2.toString());
                lVar.E.a(q10, n10);
                return;
            default:
                p9.l lVar2 = gVar.f24986c;
                p9.m n11 = n();
                lVar2.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long q11 = lVar2.q();
                try {
                    jSONObject3.put("requestId", q11);
                    jSONObject3.put("type", "PLAY");
                    jSONObject3.put("mediaSessionId", lVar2.u());
                    if (jSONObject != null) {
                        jSONObject3.put("customData", jSONObject);
                    }
                } catch (JSONException unused2) {
                }
                lVar2.p(q11, jSONObject3.toString());
                lVar2.F.a(q11, n11);
                return;
        }
    }
}
