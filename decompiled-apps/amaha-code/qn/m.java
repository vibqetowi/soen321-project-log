package qn;

import androidx.lifecycle.w;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import is.u;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.d0;
/* compiled from: MonetizationViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel$fetchCouponProduct$1", f = "MonetizationViewModel.kt", l = {448}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f29962u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ MonetizationViewModel f29963v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f29964w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(MonetizationViewModel monetizationViewModel, String str, ls.d<? super m> dVar) {
        super(2, dVar);
        this.f29963v = monetizationViewModel;
        this.f29964w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new m(this.f29963v, this.f29964w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((m) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        c4.h hVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f29962u;
        MonetizationViewModel monetizationViewModel = this.f29963v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            c cVar = monetizationViewModel.f11455z;
            ArrayList k10 = ca.a.k(this.f29964w);
            this.f29962u = 1;
            cVar.getClass();
            obj = c.a(k10, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        List list = (List) obj;
        if (list != null && (hVar = (c4.h) u.i2(list)) != null) {
            w<List<c4.h>> i10 = monetizationViewModel.i();
            List<c4.h> d10 = monetizationViewModel.i().d();
            kotlin.jvm.internal.i.d(d10);
            i10.i(u.v2(hVar, d10));
            monetizationViewModel.k().i(Boolean.FALSE);
        }
        return hs.k.f19476a;
    }
}
