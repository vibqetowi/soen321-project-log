package nn;

import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: MiniMonetizationParentFragment.kt */
/* loaded from: classes2.dex */
public final class q1 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ MonetizationViewModel f26581u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ m1 f26582v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(MonetizationViewModel monetizationViewModel, m1 m1Var) {
        super(1);
        this.f26581u = monetizationViewModel;
        this.f26582v = m1Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        Boolean bool2 = bool;
        MonetizationViewModel monetizationViewModel = this.f26581u;
        m1 m1Var = this.f26582v;
        if (bool2 != null && bool2.booleanValue()) {
            int i6 = m1.K;
            m1Var.getClass();
            String str = monetizationViewModel.X;
            if (!kotlin.jvm.internal.i.b(monetizationViewModel.Y, Constants.SUBSCRIPTION_BASIC_FREE)) {
                kotlin.jvm.internal.i.g(monetizationViewModel.f11451a0, "<set-?>");
            }
        }
        ((androidx.lifecycle.w) monetizationViewModel.U.getValue()).e(m1Var.getViewLifecycleOwner(), new k(10, new p1(m1Var)));
        return hs.k.f19476a;
    }
}
