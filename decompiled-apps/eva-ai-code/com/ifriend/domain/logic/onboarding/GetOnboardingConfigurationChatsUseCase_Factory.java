package com.ifriend.domain.logic.onboarding;

import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.data.memorycached.OnboardingChatConfigsMemoryCachedSource;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class GetOnboardingConfigurationChatsUseCase_Factory implements Factory<GetOnboardingConfigurationChatsUseCase> {
    private final Provider<ChatConfigsMemoryCachedSource> chatConfigsMemoryCachedSourceProvider;
    private final Provider<OnboardingChatConfigsMemoryCachedSource> onboardingConfigsMemoryCachedSourceProvider;

    public GetOnboardingConfigurationChatsUseCase_Factory(Provider<ChatConfigsMemoryCachedSource> provider, Provider<OnboardingChatConfigsMemoryCachedSource> provider2) {
        this.chatConfigsMemoryCachedSourceProvider = provider;
        this.onboardingConfigsMemoryCachedSourceProvider = provider2;
    }

    @Override // javax.inject.Provider
    public GetOnboardingConfigurationChatsUseCase get() {
        return newInstance(this.chatConfigsMemoryCachedSourceProvider.get(), this.onboardingConfigsMemoryCachedSourceProvider.get());
    }

    public static GetOnboardingConfigurationChatsUseCase_Factory create(Provider<ChatConfigsMemoryCachedSource> provider, Provider<OnboardingChatConfigsMemoryCachedSource> provider2) {
        return new GetOnboardingConfigurationChatsUseCase_Factory(provider, provider2);
    }

    public static GetOnboardingConfigurationChatsUseCase newInstance(ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource, OnboardingChatConfigsMemoryCachedSource onboardingChatConfigsMemoryCachedSource) {
        return new GetOnboardingConfigurationChatsUseCase(chatConfigsMemoryCachedSource, onboardingChatConfigsMemoryCachedSource);
    }
}
