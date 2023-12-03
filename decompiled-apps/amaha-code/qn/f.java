package qn;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
/* compiled from: MonetizationRepository.kt */
/* loaded from: classes2.dex */
public final class f implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f29948u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f29949v;

    public f(c cVar, ls.h hVar) {
        this.f29948u = cVar;
        this.f29949v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f29948u.f29931a, "https://api.theinnerhour.com/v1/failedpayment", t3);
        this.f29949v.resumeWith(Boolean.FALSE);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, z<sf.m> response) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        this.f29949v.resumeWith(Boolean.TRUE);
    }
}
