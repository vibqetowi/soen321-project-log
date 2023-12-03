package qn;

import android.os.Bundle;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
/* compiled from: MonetizationRepository.kt */
/* loaded from: classes2.dex */
public final class e implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f29945u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f29946v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Bundle f29947w;

    public e(c cVar, ls.h hVar, Bundle bundle) {
        this.f29945u = cVar;
        this.f29946v = hVar;
        this.f29947w = bundle;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f29945u.f29931a, "https://api.theinnerhour.com/v1/track_app_coupon", t3);
        this.f29946v.resumeWith(Boolean.FALSE);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, z<sf.m> response) {
        boolean z10;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        sf.m mVar = response.f13696b;
        if (String.valueOf(mVar).length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Bundle bundle = this.f29947w;
        if (z10) {
            bundle.putString("serverResponse", String.valueOf(mVar));
        }
        gk.a.b(bundle, "premuim_buy_success");
        this.f29946v.resumeWith(Boolean.TRUE);
    }
}
