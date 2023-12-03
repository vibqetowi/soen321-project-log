package qn;

import com.theinnerhour.b2b.components.monetization.models.CampaignModel;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import java.util.ArrayList;
/* compiled from: MonetizationViewModel.kt */
/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.k implements ss.p<Boolean, ArrayList<CampaignModel>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ MonetizationViewModel f29959u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MonetizationViewModel monetizationViewModel) {
        super(2);
        this.f29959u = monetizationViewModel;
    }

    @Override // ss.p
    public final hs.k invoke(Boolean bool, ArrayList<CampaignModel> arrayList) {
        this.f29959u.p(bool.booleanValue(), arrayList);
        return hs.k.f19476a;
    }
}
