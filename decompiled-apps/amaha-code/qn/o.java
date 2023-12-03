package qn;

import android.os.Bundle;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import java.util.regex.Pattern;
import kotlinx.coroutines.d0;
import lv.c0;
import lv.v;
import org.json.JSONObject;
/* compiled from: MonetizationViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel$sendFreeCouponActivationRequest$1", f = "MonetizationViewModel.kt", l = {376}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f29968u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ MonetizationViewModel f29969v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Bundle f29970w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f29971x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(MonetizationViewModel monetizationViewModel, Bundle bundle, String str, ls.d<? super o> dVar) {
        super(2, dVar);
        this.f29969v = monetizationViewModel;
        this.f29970w = bundle;
        this.f29971x = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new o(this.f29969v, this.f29970w, this.f29971x, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((o) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f29968u;
        MonetizationViewModel monetizationViewModel = this.f29969v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            monetizationViewModel.k().i(Boolean.TRUE);
            this.f29968u = 1;
            c cVar = monetizationViewModel.f11455z;
            cVar.getClass();
            ls.h hVar = new ls.h(ca.a.G0(this));
            String str = gk.a.f16573a;
            Bundle bundle = this.f29970w;
            gk.a.b(bundle, "premium_buy_click");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("coupon_id", this.f29971x);
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.i.f(jSONObject2, "req.toString()");
            Pattern pattern = v.f24702d;
            ((or.e) nr.b.a(or.e.class)).e("https://api.theinnerhour.com/v1/android_sub_free", c0.a.a(jSONObject2, v.a.b("application/json; charset=utf-8"))).I(new e(cVar, hVar, bundle));
            obj = hVar.b();
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            monetizationViewModel.k().i(Boolean.FALSE);
            ((w) monetizationViewModel.f11452b0.getValue()).i(Boolean.TRUE);
        } else {
            w<Boolean> k10 = monetizationViewModel.k();
            Boolean bool = Boolean.FALSE;
            k10.i(bool);
            ((w) monetizationViewModel.f11452b0.getValue()).i(bool);
        }
        return hs.k.f19476a;
    }
}
