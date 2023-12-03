package wo;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import org.json.JSONObject;
/* compiled from: ExperimentEditProfileRepository.kt */
/* loaded from: classes2.dex */
public final class u implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ n f36992u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j<Boolean> f36993v;

    public u(n nVar, kotlinx.coroutines.k kVar) {
        this.f36992u = nVar;
        this.f36993v = kVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        androidx.lifecycle.w<SingleUseEvent<Boolean>> wVar = this.f36992u.f36966i;
        Boolean bool = Boolean.FALSE;
        wVar.i(new SingleUseEvent<>(bool));
        kotlinx.coroutines.j<Boolean> jVar = this.f36993v;
        if (jVar.a()) {
            jVar.resumeWith(bool);
        }
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
        hs.k kVar;
        String mVar;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        n nVar = this.f36992u;
        kotlinx.coroutines.j<Boolean> jVar = this.f36993v;
        if (a10) {
            sf.m mVar2 = response.f13696b;
            if (mVar2 != null && (mVar = mVar2.toString()) != null) {
                if (!gv.n.B0(mVar)) {
                    if (new JSONObject(mVar).optBoolean(SessionManager.KEY_MOBILE_VERIFIED)) {
                        androidx.lifecycle.w<SingleUseEvent<Boolean>> wVar = nVar.f36966i;
                        Boolean bool = Boolean.TRUE;
                        wVar.i(new SingleUseEvent<>(bool));
                        if (jVar.a()) {
                            jVar.resumeWith(bool);
                        }
                    } else {
                        androidx.lifecycle.w<SingleUseEvent<Boolean>> wVar2 = nVar.f36966i;
                        Boolean bool2 = Boolean.FALSE;
                        wVar2.i(new SingleUseEvent<>(bool2));
                        nVar.f36968k.i(new SingleUseEvent<>(new JSONObject(mVar).optString("message")));
                        if (jVar.a()) {
                            jVar.resumeWith(bool2);
                        }
                    }
                } else {
                    androidx.lifecycle.w<SingleUseEvent<Boolean>> wVar3 = nVar.f36966i;
                    Boolean bool3 = Boolean.FALSE;
                    wVar3.i(new SingleUseEvent<>(bool3));
                    if (jVar.a()) {
                        jVar.resumeWith(bool3);
                    }
                }
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                nVar.f36966i.i(new SingleUseEvent<>(Boolean.FALSE));
                if (jVar.a()) {
                    jVar.resumeWith(Boolean.TRUE);
                    return;
                }
                return;
            }
            return;
        }
        androidx.lifecycle.w<SingleUseEvent<Boolean>> wVar4 = nVar.f36966i;
        Boolean bool4 = Boolean.FALSE;
        wVar4.i(new SingleUseEvent<>(bool4));
        if (jVar.a()) {
            jVar.resumeWith(bool4);
        }
    }
}
