package com.ifriend.presentation.features.purchases.premium.viewmodel;

import com.ifriend.presentation.features.purchases.common.model.SubscriptionBenefitsUiParams;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BuyPremiumViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BuyPremiumViewModel$loadBenefits$1$3$1 extends Lambda implements Function1<BuyPremiumViewModel.UiState, BuyPremiumViewModel.UiState> {
    final /* synthetic */ SubscriptionBenefitsUiParams $benefit;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumViewModel$loadBenefits$1$3$1(SubscriptionBenefitsUiParams subscriptionBenefitsUiParams) {
        super(1);
        this.$benefit = subscriptionBenefitsUiParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final BuyPremiumViewModel.UiState invoke(BuyPremiumViewModel.UiState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return BuyPremiumViewModel.UiState.copy$default(state, null, this.$benefit.getTitleLabel(), null, null, false, false, null, 125, null);
    }
}
