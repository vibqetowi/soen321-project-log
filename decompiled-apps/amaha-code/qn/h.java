package qn;

import android.os.Bundle;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.model.SkuModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.PaymentUtils;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlinx.coroutines.d0;
import lv.c0;
import lv.v;
import org.json.JSONObject;
/* compiled from: MonetizationViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel$applyCouponCode$1", f = "MonetizationViewModel.kt", l = {390}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f29952u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ MonetizationViewModel f29953v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f29954w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MonetizationViewModel monetizationViewModel, String str, ls.d<? super h> dVar) {
        super(2, dVar);
        this.f29953v = monetizationViewModel;
        this.f29954w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new h(this.f29953v, this.f29954w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((h) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Type inference failed for: r11v55, types: [B, java.lang.Object] */
    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ArrayList<String> d10;
        boolean z10;
        String str;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f29952u;
        String str2 = this.f29954w;
        boolean z11 = true;
        MonetizationViewModel monetizationViewModel = this.f29953v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            monetizationViewModel.k().i(Boolean.TRUE);
            this.f29952u = 1;
            c cVar = monetizationViewModel.f11455z;
            cVar.getClass();
            ls.h hVar = new ls.h(ca.a.G0(this));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("coupon", str2);
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.i.f(jSONObject2, "req.toString()");
            Pattern pattern = v.f24702d;
            ((or.e) nr.b.a(or.e.class)).a("https://api.theinnerhour.com/v1/app_coupon_apply_v2", c0.a.a(jSONObject2, v.a.b("application/json; charset=utf-8"))).I(new a(hVar, cVar, str2));
            obj = hVar.b();
            if (obj == aVar) {
                return aVar;
            }
        }
        hs.f fVar = (hs.f) obj;
        A a10 = fVar.f19464u;
        if (a10 == 0) {
            monetizationViewModel.l().i(fVar.f19465v);
            monetizationViewModel.k().i(Boolean.FALSE);
        } else {
            JSONObject jSONObject3 = new JSONObject(String.valueOf(((sf.m) a10).g()));
            if (kotlin.jvm.internal.i.b(jSONObject3.opt("status"), Constants.COUPON_STATE_APPLIED)) {
                if (monetizationViewModel.j().d() != null && (!d10.isEmpty())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ArrayList<String> d11 = monetizationViewModel.j().d();
                    if ((d11 == null || !d11.contains(jSONObject3.optString("sku"))) ? false : false) {
                        monetizationViewModel.l().i("You have already used this coupon code.");
                        monetizationViewModel.k().i(Boolean.FALSE);
                        return hs.k.f19476a;
                    }
                }
                monetizationViewModel.f11451a0 = jSONObject3;
                monetizationViewModel.l().i("Coupon code successfully applied!");
                monetizationViewModel.X = jSONObject3.optString("coupon_id");
                monetizationViewModel.Y = jSONObject3.optString("sku");
                monetizationViewModel.h().i(Boolean.TRUE);
                ((w) monetizationViewModel.U.getValue()).i(jSONObject3.optString("sku"));
                if (kotlin.jvm.internal.i.b(monetizationViewModel.Y, Constants.SUBSCRIPTION_BASIC_FREE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("promo_code", str2);
                    gk.a.b(bundle, "plus_promo_code_success");
                    monetizationViewModel.k().i(Boolean.FALSE);
                } else {
                    PaymentUtils paymentUtils = PaymentUtils.INSTANCE;
                    String str3 = monetizationViewModel.Y;
                    kotlin.jvm.internal.i.d(str3);
                    SkuModel mapSkuToObject = paymentUtils.mapSkuToObject(str3);
                    monetizationViewModel.Z = mapSkuToObject;
                    if (mapSkuToObject != null) {
                        str = mapSkuToObject.getSubscriptionType();
                    } else {
                        str = null;
                    }
                    if (!kotlin.jvm.internal.i.b(str, "plus")) {
                        monetizationViewModel.l().i("This code is for the Pro plan. Please try again.");
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("promo_code", str2);
                        bundle2.putString("error", "promo != plus");
                        gk.a.b(bundle2, "plus_promo_code_failure");
                        monetizationViewModel.k().i(Boolean.FALSE);
                        return hs.k.f19476a;
                    }
                    String str4 = monetizationViewModel.Y;
                    kotlin.jvm.internal.i.d(str4);
                    ta.v.H(kc.f.H(monetizationViewModel), null, 0, new m(monetizationViewModel, str4, null), 3);
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("promo_code", str2);
                    gk.a.b(bundle3, "plus_promo_code_success");
                }
            } else {
                monetizationViewModel.k().i(Boolean.FALSE);
                monetizationViewModel.l().i("Oops... Something went wrong. Please try again!");
                Bundle bundle4 = new Bundle();
                bundle4.putString("promo_code", str2);
                bundle4.putString("error", "Oops... Something went wrong. Please try again!");
                gk.a.b(bundle4, "plus_promo_code_failure");
            }
        }
        return hs.k.f19476a;
    }
}
