package m9;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f24998q = 1;
    public final /* synthetic */ g r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f24999s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, k9.m mVar) {
        super(gVar, false);
        this.r = gVar;
        this.f24999s = mVar;
    }

    @Override // m9.s
    public final void m() {
        long j10;
        int i6 = this.f24998q;
        Object obj = this.f24999s;
        g gVar = this.r;
        switch (i6) {
            case 0:
                p9.l lVar = gVar.f24986c;
                p9.m n10 = n();
                int[] iArr = (int[]) obj;
                lVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long q10 = lVar.q();
                try {
                    jSONObject.put("requestId", q10);
                    jSONObject.put("type", "QUEUE_GET_ITEMS");
                    jSONObject.put("mediaSessionId", lVar.u());
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 : iArr) {
                        jSONArray.put(i10);
                    }
                    jSONObject.put("itemIds", jSONArray);
                } catch (JSONException unused) {
                }
                lVar.p(q10, jSONObject.toString());
                lVar.M.a(q10, n10);
                return;
            default:
                p9.l lVar2 = gVar.f24986c;
                p9.m n11 = n();
                k9.m mVar = (k9.m) obj;
                lVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long q11 = lVar2.q();
                if (mVar.f23168c) {
                    j10 = 4294967296000L;
                } else {
                    j10 = mVar.f23166a;
                }
                try {
                    jSONObject2.put("requestId", q11);
                    jSONObject2.put("type", "SEEK");
                    jSONObject2.put("mediaSessionId", lVar2.u());
                    jSONObject2.put("currentTime", p9.a.a(j10));
                    int i11 = mVar.f23167b;
                    if (i11 == 1) {
                        jSONObject2.put("resumeState", "PLAYBACK_START");
                    } else if (i11 == 2) {
                        jSONObject2.put("resumeState", "PLAYBACK_PAUSE");
                    }
                    JSONObject jSONObject3 = mVar.f23169d;
                    if (jSONObject3 != null) {
                        jSONObject2.put("customData", jSONObject3);
                    }
                } catch (JSONException unused2) {
                }
                lVar2.p(q11, jSONObject2.toString());
                lVar2.B = Long.valueOf(j10);
                lVar2.G.a(q11, new androidx.appcompat.widget.l(lVar2, n11, 16));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, int[] iArr) {
        super(gVar, true);
        this.r = gVar;
        this.f24999s = iArr;
    }
}
