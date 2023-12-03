package hn;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import org.json.JSONObject;
/* compiled from: LoginSignupReworkRepository.kt */
/* loaded from: classes2.dex */
public final class g implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f17861u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ b f17862v;

    public g(b bVar, ls.h hVar) {
        this.f17861u = hVar;
        this.f17862v = bVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        this.f17861u.resumeWith(Boolean.FALSE);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
        ls.d<Boolean> dVar = this.f17861u;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        try {
            if (response.a()) {
                CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
                Utils.parseLoginResponse$default(Utils.INSTANCE, new JSONObject(String.valueOf(response.f13696b)), false, 2, null);
                dVar.resumeWith(Boolean.TRUE);
            } else {
                dVar.resumeWith(Boolean.FALSE);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17862v.f17789a, e10);
            dVar.resumeWith(Boolean.FALSE);
        }
    }
}
