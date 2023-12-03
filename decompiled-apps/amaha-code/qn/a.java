package qn;

import android.os.Bundle;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
import lv.e0;
import org.json.JSONObject;
/* compiled from: MonetizationRepository.kt */
/* loaded from: classes2.dex */
public final class a implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<hs.f<? extends sf.m, String>> f29919u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c f29920v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f29921w;

    public a(ls.h hVar, c cVar, String str) {
        this.f29919u = hVar;
        this.f29920v = cVar;
        this.f29921w = str;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        c cVar = this.f29920v;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        try {
            this.f29919u.resumeWith(new hs.f(null, "Oops... Something went wrong. Please try again!"));
            LogHelper.INSTANCE.e(cVar.f29931a, "https://api.theinnerhour.com/v1/app_coupon_apply_v2", t3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(cVar.f29931a, "https://api.theinnerhour.com/v1/app_coupon_apply_v2", e10);
        }
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, z<sf.m> response) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<hs.f<? extends sf.m, String>> dVar = this.f29919u;
        if (a10) {
            dVar.resumeWith(new hs.f(response.f13696b, null));
            return;
        }
        String str = "";
        e0 e0Var = response.f13697c;
        JSONObject jSONObject = new JSONObject((e0Var == null || (r7 = e0Var.h()) == null) ? "" : "");
        Bundle bundle = new Bundle();
        bundle.putString("promo_code", this.f29921w);
        if (jSONObject.opt("status") != null) {
            str = jSONObject.optString("status");
        }
        bundle.putString("error", str);
        gk.a.b(bundle, "plus_promo_code_failure");
        Object opt = jSONObject.opt("status");
        if (kotlin.jvm.internal.i.b(opt, Constants.COUPON_STATE_CONSUMED)) {
            dVar.resumeWith(new hs.f(null, "You have already used this coupon code."));
        } else if (kotlin.jvm.internal.i.b(opt, Constants.COUPON_STATE_EXPIRED)) {
            dVar.resumeWith(new hs.f(null, "Sorry, this coupon code has expired..."));
        } else if (kotlin.jvm.internal.i.b(opt, Constants.COUPON_STATE_WRONG_PROMO_CODE)) {
            dVar.resumeWith(new hs.f(null, "Invalid coupon code. Please try again!"));
        } else {
            dVar.resumeWith(new hs.f(null, "Oops... Something went wrong. Please try again!"));
        }
    }
}
