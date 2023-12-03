package qn;

import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import java.util.regex.Pattern;
import kotlinx.coroutines.d0;
import lv.c0;
import lv.v;
import org.json.JSONObject;
/* compiled from: MonetizationViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel$trackAppliedCouponCode$1", f = "MonetizationViewModel.kt", l = {340}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f29975u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ MonetizationViewModel f29976v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f29977w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(MonetizationViewModel monetizationViewModel, String str, ls.d<? super q> dVar) {
        super(2, dVar);
        this.f29976v = monetizationViewModel;
        this.f29977w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new q(this.f29976v, this.f29977w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((q) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f29975u;
        MonetizationViewModel monetizationViewModel = this.f29976v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            monetizationViewModel.k().i(Boolean.TRUE);
            this.f29975u = 1;
            c cVar = monetizationViewModel.f11455z;
            cVar.getClass();
            ls.h hVar = new ls.h(ca.a.G0(this));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("coupon_id", this.f29977w);
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.i.f(jSONObject2, "req.toString()");
            Pattern pattern = v.f24702d;
            ((or.e) nr.b.a(or.e.class)).b("https://api.theinnerhour.com/v1/track_app_coupon", c0.a.a(jSONObject2, v.a.b("application/json; charset=utf-8"))).I(new g(cVar, hVar));
            obj = hVar.b();
            if (obj == aVar) {
                return aVar;
            }
        }
        ((Boolean) obj).booleanValue();
        monetizationViewModel.k().i(Boolean.FALSE);
        return hs.k.f19476a;
    }
}
