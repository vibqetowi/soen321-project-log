package com.ifriend.presentation.features.app.di;

import com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModelFactory;
import com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModelFactory;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.factory.OnboardingStepViewModelFactory;
import com.ifriend.presentation.features.purchases.benefits.viewmodel.ActivePremiumBenefitsViewModelFactory;
import com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModelFactory;
import com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModelFactory;
import com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModelFactory;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModelFactory;
import kotlin.Metadata;
/* compiled from: AppViewModelProvider.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/ifriend/presentation/features/app/di/AppViewModelProvider;", "", "provideActivePremiumBenefitsViewModelFactory", "Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModelFactory;", "provideChatActiveSubscriptionViewModelFactory", "Lcom/ifriend/presentation/features/purchases/chatsubscription/activesubscription/viewmodel/ChatActiveSubscriptionViewModelFactory$Factory;", "provideChatCallViewModelFactory", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModelFactory$Factory;", "provideChatFlowSubscriptionViewModelFactory", "Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModelFactory$Factory;", "provideChatSubscriptionBenefitsViewModelFactory", "Lcom/ifriend/presentation/features/purchases/chatsubscription/benefits/viewmodel/ChatSubscriptionBenefitsViewModelFactory$Factory;", "provideChatSubscriptionViewModelFactory", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModelFactory$Factory;", "provideOnboardingFlowViewModelFactory", "Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModelFactory;", "provideOnboardingStepViewModelFactory", "Lcom/ifriend/presentation/features/onboarding/steps/viewmodel/factory/OnboardingStepViewModelFactory$Factory;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppViewModelProvider {
    ActivePremiumBenefitsViewModelFactory provideActivePremiumBenefitsViewModelFactory();

    ChatActiveSubscriptionViewModelFactory.Factory provideChatActiveSubscriptionViewModelFactory();

    ChatCallViewModelFactory.Factory provideChatCallViewModelFactory();

    ChatFlowSubscriptionViewModelFactory.Factory provideChatFlowSubscriptionViewModelFactory();

    ChatSubscriptionBenefitsViewModelFactory.Factory provideChatSubscriptionBenefitsViewModelFactory();

    ChatBuySubscriptionViewModelFactory.Factory provideChatSubscriptionViewModelFactory();

    OnboardingFlowViewModelFactory provideOnboardingFlowViewModelFactory();

    OnboardingStepViewModelFactory.Factory provideOnboardingStepViewModelFactory();
}
