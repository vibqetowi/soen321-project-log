package fm;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: FirestoreGoalsViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class k0 implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j0 f15425u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j<Boolean> f15426v;

    public k0(j0 j0Var, kotlinx.coroutines.k kVar) {
        this.f15425u = j0Var;
        this.f15426v = kVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f15425u.f15374a, t3);
        kotlinx.coroutines.j<Boolean> jVar = this.f15426v;
        if (jVar.a()) {
            jVar.resumeWith(Boolean.FALSE);
        }
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
        kotlinx.coroutines.j<Boolean> jVar = this.f15426v;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        try {
            if (response.a()) {
                if (jVar.a()) {
                    jVar.resumeWith(Boolean.TRUE);
                }
            } else if (jVar.a()) {
                jVar.resumeWith(Boolean.FALSE);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15425u.f15374a, e10);
            if (jVar.a()) {
                jVar.resumeWith(Boolean.FALSE);
            }
        }
    }
}
