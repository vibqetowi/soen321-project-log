package jl;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
/* compiled from: NotV4DashboardRepository.kt */
/* loaded from: classes2.dex */
public final class t0 implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f22351u;

    public t0(ls.h hVar) {
        this.f22351u = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        this.f22351u.resumeWith(Boolean.FALSE);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        if (response.a()) {
            this.f22351u.resumeWith(Boolean.TRUE);
        }
    }
}
