package yl;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import dw.z;
import kotlin.jvm.internal.i;
import ls.h;
/* compiled from: ExpertCareRepository.kt */
/* loaded from: classes2.dex */
public final class d implements CustomRetrofitCallback<xl.b> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<xl.b> f38683u;

    public d(h hVar) {
        this.f38683u = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<xl.b> call, Throwable t3) {
        i.g(call, "call");
        i.g(t3, "t");
        this.f38683u.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<xl.b> call, z<xl.b> response) {
        i.g(call, "call");
        i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<xl.b> dVar = this.f38683u;
        if (a10) {
            dVar.resumeWith(response.f13696b);
        } else {
            dVar.resumeWith(null);
        }
    }
}
