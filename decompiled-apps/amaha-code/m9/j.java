package m9;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class j extends s {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f24995q = 0;
    public final /* synthetic */ g r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar) {
        super(gVar, false);
        this.r = gVar;
    }

    @Override // m9.s
    public final void m() {
        int i6 = this.f24995q;
        g gVar = this.r;
        switch (i6) {
            case 0:
                p9.l lVar = gVar.f24986c;
                p9.m n10 = n();
                lVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long q10 = lVar.q();
                try {
                    jSONObject.put("requestId", q10);
                    jSONObject.put("type", "GET_STATUS");
                    k9.n nVar = lVar.A;
                    if (nVar != null) {
                        jSONObject.put("mediaSessionId", nVar.f23171v);
                    }
                } catch (JSONException unused) {
                }
                lVar.p(q10, jSONObject.toString());
                lVar.J.a(q10, n10);
                return;
            default:
                p9.l lVar2 = gVar.f24986c;
                p9.m n11 = n();
                lVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long q11 = lVar2.q();
                try {
                    jSONObject2.put("requestId", q11);
                    jSONObject2.put("type", "QUEUE_GET_ITEM_IDS");
                    jSONObject2.put("mediaSessionId", lVar2.u());
                } catch (JSONException unused2) {
                }
                lVar2.p(q11, jSONObject2.toString());
                lVar2.L.a(q11, n11);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, int i6) {
        super(gVar, true);
        this.r = gVar;
    }
}
