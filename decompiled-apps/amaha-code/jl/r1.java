package jl;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: NotV4FeedbackRepository.kt */
/* loaded from: classes2.dex */
public final class r1 implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f22339u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t1 f22340v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f22341w = "https://api.theinnerhour.com/v1/employeefeedback";

    public r1(ls.h hVar, t1 t1Var) {
        this.f22339u = hVar;
        this.f22340v = t1Var;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        this.f22339u.resumeWith(Boolean.FALSE);
        LogHelper.INSTANCE.e(this.f22340v.f22352a, this.f22341w, t3);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        this.f22339u.resumeWith(Boolean.TRUE);
    }
}
