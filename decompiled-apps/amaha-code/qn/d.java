package qn;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
/* compiled from: MonetizationRepository.kt */
/* loaded from: classes2.dex */
public final class d implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f29943u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c f29944v;

    public d(c cVar, ls.h hVar) {
        this.f29943u = hVar;
        this.f29944v = cVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        this.f29943u.resumeWith(Boolean.FALSE);
        LogHelper.INSTANCE.e(this.f29944v.f29931a, "https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", t3);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, z<sf.m> response) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        this.f29943u.resumeWith(Boolean.TRUE);
    }
}
