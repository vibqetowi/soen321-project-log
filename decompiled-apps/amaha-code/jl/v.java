package jl;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
/* compiled from: CustomDashboardViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class v implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f22369u;

    public v(ls.h hVar) {
        this.f22369u = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        this.f22369u.resumeWith(Boolean.FALSE);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        if (response.a()) {
            this.f22369u.resumeWith(Boolean.TRUE);
        }
    }
}
