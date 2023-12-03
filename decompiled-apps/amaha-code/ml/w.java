package ml;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: DashboardViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class w implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ u f25605u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f25606v = "https://api.theinnerhour.com/v1/b2b/email/resend";

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j<Boolean> f25607w;

    public w(u uVar, kotlinx.coroutines.k kVar) {
        this.f25605u = uVar;
        this.f25607w = kVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f25605u.f25590a, this.f25606v, t3);
        this.f25607w.resumeWith(Boolean.FALSE);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        boolean a10 = response.a();
        kotlinx.coroutines.j<Boolean> jVar = this.f25607w;
        if (a10) {
            jVar.resumeWith(Boolean.TRUE);
        } else {
            jVar.resumeWith(Boolean.FALSE);
        }
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
    }
}
