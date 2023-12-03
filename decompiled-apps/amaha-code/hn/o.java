package hn;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: LoginSignupReworkRepository.kt */
/* loaded from: classes2.dex */
public final class o implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b f17885u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f17886v;

    public o(b bVar, ls.h hVar) {
        this.f17885u = bVar;
        this.f17886v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f17885u.f17789a, t3);
        this.f17886v.resumeWith(Boolean.FALSE);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
        ls.d<Boolean> dVar = this.f17886v;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        try {
            if (response.a()) {
                dVar.resumeWith(Boolean.TRUE);
            } else {
                dVar.resumeWith(Boolean.FALSE);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17885u.f17789a, e10);
            dVar.resumeWith(Boolean.FALSE);
        }
    }
}
