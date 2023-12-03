package yl;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import dw.z;
import kotlin.jvm.internal.i;
import ls.h;
/* compiled from: ExpertCareRepository.kt */
/* loaded from: classes2.dex */
public final class c implements CustomRetrofitCallback<vl.c> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<vl.c> f38682u;

    public c(h hVar) {
        this.f38682u = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<vl.c> call, Throwable t3) {
        i.g(call, "call");
        i.g(t3, "t");
        this.f38682u.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<vl.c> call, z<vl.c> response) {
        i.g(call, "call");
        i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<vl.c> dVar = this.f38682u;
        if (a10) {
            dVar.resumeWith(response.f13696b);
        } else {
            dVar.resumeWith(null);
        }
    }
}
