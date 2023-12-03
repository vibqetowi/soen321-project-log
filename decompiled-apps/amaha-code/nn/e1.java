package nn;

import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: DynamicCampaignFragment.kt */
/* loaded from: classes2.dex */
public final class e1 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ MonetizationViewModel f26475u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a1 f26476v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(MonetizationViewModel monetizationViewModel, a1 a1Var) {
        super(1);
        this.f26475u = monetizationViewModel;
        this.f26476v = a1Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        Boolean bool2 = bool;
        MonetizationViewModel monetizationViewModel = this.f26475u;
        a1 a1Var = this.f26476v;
        if (bool2 != null && bool2.booleanValue()) {
            int i6 = a1.K;
            a1Var.getClass();
            String str = monetizationViewModel.X;
            if (!kotlin.jvm.internal.i.b(monetizationViewModel.Y, Constants.SUBSCRIPTION_BASIC_FREE)) {
                kotlin.jvm.internal.i.g(monetizationViewModel.f11451a0, "<set-?>");
            }
        }
        ((androidx.lifecycle.w) monetizationViewModel.U.getValue()).e(a1Var.getViewLifecycleOwner(), new k(6, new d1(a1Var)));
        return hs.k.f19476a;
    }
}
