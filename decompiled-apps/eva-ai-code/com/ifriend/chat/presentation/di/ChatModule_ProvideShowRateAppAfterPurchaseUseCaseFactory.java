package com.ifriend.chat.presentation.di;

import com.ifriend.chat.domain.billing.ShowRateAppAfterPurchaseUseCase;
import com.ifriend.data.toggle.RateAndReviewUsToggle;
import com.ifriend.domain.data.purchases.BillingPurchasesHistory;
import com.ifriend.domain.rateUs.RateAppShowingPlanner;
import com.ifriend.domain.rateUs.RateUsStateStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatModule_ProvideShowRateAppAfterPurchaseUseCaseFactory implements Factory<ShowRateAppAfterPurchaseUseCase> {
    private final Provider<BillingPurchasesHistory> billingPurchasesHistoryProvider;
    private final ChatModule module;
    private final Provider<RateAndReviewUsToggle> rateAndReviewUsToggleProvider;
    private final Provider<RateAppShowingPlanner> rateAppShowingPlannerProvider;
    private final Provider<RateUsStateStorage> storageProvider;

    public ChatModule_ProvideShowRateAppAfterPurchaseUseCaseFactory(ChatModule chatModule, Provider<RateUsStateStorage> provider, Provider<RateAndReviewUsToggle> provider2, Provider<BillingPurchasesHistory> provider3, Provider<RateAppShowingPlanner> provider4) {
        this.module = chatModule;
        this.storageProvider = provider;
        this.rateAndReviewUsToggleProvider = provider2;
        this.billingPurchasesHistoryProvider = provider3;
        this.rateAppShowingPlannerProvider = provider4;
    }

    @Override // javax.inject.Provider
    public ShowRateAppAfterPurchaseUseCase get() {
        return provideShowRateAppAfterPurchaseUseCase(this.module, this.storageProvider.get(), this.rateAndReviewUsToggleProvider.get(), this.billingPurchasesHistoryProvider.get(), this.rateAppShowingPlannerProvider.get());
    }

    public static ChatModule_ProvideShowRateAppAfterPurchaseUseCaseFactory create(ChatModule chatModule, Provider<RateUsStateStorage> provider, Provider<RateAndReviewUsToggle> provider2, Provider<BillingPurchasesHistory> provider3, Provider<RateAppShowingPlanner> provider4) {
        return new ChatModule_ProvideShowRateAppAfterPurchaseUseCaseFactory(chatModule, provider, provider2, provider3, provider4);
    }

    public static ShowRateAppAfterPurchaseUseCase provideShowRateAppAfterPurchaseUseCase(ChatModule chatModule, RateUsStateStorage rateUsStateStorage, RateAndReviewUsToggle rateAndReviewUsToggle, BillingPurchasesHistory billingPurchasesHistory, RateAppShowingPlanner rateAppShowingPlanner) {
        return (ShowRateAppAfterPurchaseUseCase) Preconditions.checkNotNullFromProvides(chatModule.provideShowRateAppAfterPurchaseUseCase(rateUsStateStorage, rateAndReviewUsToggle, billingPurchasesHistory, rateAppShowingPlanner));
    }
}
