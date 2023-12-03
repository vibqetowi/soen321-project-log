package jl;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: NotV4FeedbackRepository.kt */
/* loaded from: classes2.dex */
public final class s1 implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f22346u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t1 f22347v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f22348w = "https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback";

    public s1(ls.h hVar, t1 t1Var) {
        this.f22346u = hVar;
        this.f22347v = t1Var;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        this.f22346u.resumeWith(Boolean.FALSE);
        LogHelper.INSTANCE.e(this.f22347v.f22352a, this.f22348w, t3);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        this.f22346u.resumeWith(Boolean.TRUE);
    }
}
