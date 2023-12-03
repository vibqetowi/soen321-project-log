package hn;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: LoginSignupReworkRepository.kt */
/* loaded from: classes2.dex */
public final class p implements CustomRetrofitCallback<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b f17887u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<String> f17888v;

    public p(b bVar, ls.h hVar) {
        this.f17887u = bVar;
        this.f17888v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<String> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f17887u.f17789a, t3);
        this.f17888v.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<String> call, dw.z<String> response) {
        ls.d<String> dVar = this.f17888v;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        try {
            String g5 = response.f13695a.f24588z.g("location");
            if (g5 == null) {
                g5 = "";
            }
            dVar.resumeWith(g5);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17887u.f17789a, e10);
            dVar.resumeWith(null);
        }
    }
}
