package jl;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: NotV4DashboardRepository.kt */
/* loaded from: classes2.dex */
public final class o0 implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ u0 f22276u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<ArrayList<String>> f22277v;

    public o0(u0 u0Var, ls.h hVar) {
        this.f22276u = u0Var;
        this.f22277v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f22276u.f22359a, t3);
        this.f22277v.resumeWith(new ArrayList());
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
        String mVar;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<ArrayList<String>> dVar = this.f22277v;
        if (a10) {
            try {
                sf.m mVar2 = response.f13696b;
                if (mVar2 != null && (mVar = mVar2.toString()) != null) {
                    JSONArray jSONArray = new JSONObject(mVar).getJSONArray("data");
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList();
                    for (int i6 = 0; i6 < length; i6++) {
                        Object obj = jSONArray.get(i6);
                        if (obj instanceof String) {
                            arrayList.add(obj);
                        }
                    }
                    dVar.resumeWith(arrayList);
                    return;
                }
                return;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f22276u.f22359a, e10);
                dVar.resumeWith(new ArrayList());
                return;
            }
        }
        dVar.resumeWith(new ArrayList());
    }
}
