package com.ifriend.presentation.features.onboarding.steps.viewmodel.factory;

import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import com.ifriend.domain.logic.chat.info.IsMultiChatEnabledUseCase;
import com.ifriend.domain.logic.onboarding.GetOnboardingConfigurationChatsUseCase;
import com.ifriend.domain.onboarding.OnboardingAnalytics;
import com.ifriend.domain.useCases.bot.ChangeBotAgeUseCase;
import com.ifriend.domain.useCases.bot.ChangeBotGenderUseCase;
import com.ifriend.domain.useCases.bot.ChangeBotNameUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.domain.useCases.user.change.ChangeUserAgeUseCase;
import com.ifriend.domain.useCases.user.change.ChangeUserGenderUseCase;
import com.ifriend.domain.useCases.user.change.ChangeUserNameUseCase;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.mappers.ChatInterestsTypeMapperUi;
import com.ifriend.presentation.features.onboarding.steps.events.OnboardingStepEvent;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* renamed from: com.ifriend.presentation.features.onboarding.steps.viewmodel.factory.OnboardingStepViewModelFactory_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0211OnboardingStepViewModelFactory_Factory {
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<ChangeBotAgeUseCase> changeBotAgeUseCaseProvider;
    private final Provider<ChangeBotGenderUseCase> changeBotGenderUseCaseProvider;
    private final Provider<ChangeBotNameUseCase> changeBotNameUseCaseProvider;
    private final Provider<ChangeUserAgeUseCase> changeUserAgeUseCaseProvider;
    private final Provider<ChangeUserGenderUseCase> changeUserGenderUseCaseProvider;
    private final Provider<ChangeUserNameUseCase> changeUserNameUseCaseProvider;
    private final Provider<ChatConfigsMemoryCachedSource> chatConfigsMemoryCachedSourceProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<GetBotUseCase> getBotUseCaseProvider;
    private final Provider<GetOnboardingConfigurationChatsUseCase> getOnboardingConfigurationChatsUseCaseProvider;
    private final Provider<IsMultiChatEnabledUseCase> isMultiChatEnabledUseCaseProvider;
    private final Provider<ChatInterestsTypeMapperUi> mapperProvider;
    private final Provider<OnboardingAnalytics> onboardingAnalyticsProvider;
    private final Provider<OnboardingAnswersRepository> onboardingAnswersRepositoryProvider;
    private final Provider<ResourceProvider> resourceProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public C0211OnboardingStepViewModelFactory_Factory(Provider<ResourceProvider> provider, Provider<DispatcherProvider> provider2, Provider<GetBotUseCase> provider3, Provider<ChangeBotAgeUseCase> provider4, Provider<ChangeBotGenderUseCase> provider5, Provider<ChangeBotNameUseCase> provider6, Provider<ChangeUserAgeUseCase> provider7, Provider<ChangeUserGenderUseCase> provider8, Provider<ChangeUserNameUseCase> provider9, Provider<OnboardingAnalytics> provider10, Provider<OnboardingAnswersRepository> provider11, Provider<BotRepository> provider12, Provider<UserRepository> provider13, Provider<ChatInterestsTypeMapperUi> provider14, Provider<GetOnboardingConfigurationChatsUseCase> provider15, Provider<IsMultiChatEnabledUseCase> provider16, Provider<ChatConfigsMemoryCachedSource> provider17) {
        this.resourceProvider = provider;
        this.dispatcherProvider = provider2;
        this.getBotUseCaseProvider = provider3;
        this.changeBotAgeUseCaseProvider = provider4;
        this.changeBotGenderUseCaseProvider = provider5;
        this.changeBotNameUseCaseProvider = provider6;
        this.changeUserAgeUseCaseProvider = provider7;
        this.changeUserGenderUseCaseProvider = provider8;
        this.changeUserNameUseCaseProvider = provider9;
        this.onboardingAnalyticsProvider = provider10;
        this.onboardingAnswersRepositoryProvider = provider11;
        this.botRepositoryProvider = provider12;
        this.userRepositoryProvider = provider13;
        this.mapperProvider = provider14;
        this.getOnboardingConfigurationChatsUseCaseProvider = provider15;
        this.isMultiChatEnabledUseCaseProvider = provider16;
        this.chatConfigsMemoryCachedSourceProvider = provider17;
    }

    public OnboardingStepViewModelFactory get(CoroutineScope coroutineScope, MutableSharedFlow<OnboardingStepEvent> mutableSharedFlow) {
        return newInstance(coroutineScope, mutableSharedFlow, this.resourceProvider.get(), this.dispatcherProvider.get(), this.getBotUseCaseProvider.get(), this.changeBotAgeUseCaseProvider.get(), this.changeBotGenderUseCaseProvider.get(), this.changeBotNameUseCaseProvider.get(), this.changeUserAgeUseCaseProvider.get(), this.changeUserGenderUseCaseProvider.get(), this.changeUserNameUseCaseProvider.get(), this.onboardingAnalyticsProvider.get(), this.onboardingAnswersRepositoryProvider.get(), this.botRepositoryProvider.get(), this.userRepositoryProvider.get(), this.mapperProvider.get(), this.getOnboardingConfigurationChatsUseCaseProvider.get(), this.isMultiChatEnabledUseCaseProvider.get(), this.chatConfigsMemoryCachedSourceProvider.get());
    }

    public static C0211OnboardingStepViewModelFactory_Factory create(Provider<ResourceProvider> provider, Provider<DispatcherProvider> provider2, Provider<GetBotUseCase> provider3, Provider<ChangeBotAgeUseCase> provider4, Provider<ChangeBotGenderUseCase> provider5, Provider<ChangeBotNameUseCase> provider6, Provider<ChangeUserAgeUseCase> provider7, Provider<ChangeUserGenderUseCase> provider8, Provider<ChangeUserNameUseCase> provider9, Provider<OnboardingAnalytics> provider10, Provider<OnboardingAnswersRepository> provider11, Provider<BotRepository> provider12, Provider<UserRepository> provider13, Provider<ChatInterestsTypeMapperUi> provider14, Provider<GetOnboardingConfigurationChatsUseCase> provider15, Provider<IsMultiChatEnabledUseCase> provider16, Provider<ChatConfigsMemoryCachedSource> provider17) {
        return new C0211OnboardingStepViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    public static OnboardingStepViewModelFactory newInstance(CoroutineScope coroutineScope, MutableSharedFlow<OnboardingStepEvent> mutableSharedFlow, ResourceProvider resourceProvider, DispatcherProvider dispatcherProvider, GetBotUseCase getBotUseCase, ChangeBotAgeUseCase changeBotAgeUseCase, ChangeBotGenderUseCase changeBotGenderUseCase, ChangeBotNameUseCase changeBotNameUseCase, ChangeUserAgeUseCase changeUserAgeUseCase, ChangeUserGenderUseCase changeUserGenderUseCase, ChangeUserNameUseCase changeUserNameUseCase, OnboardingAnalytics onboardingAnalytics, OnboardingAnswersRepository onboardingAnswersRepository, BotRepository botRepository, UserRepository userRepository, ChatInterestsTypeMapperUi chatInterestsTypeMapperUi, GetOnboardingConfigurationChatsUseCase getOnboardingConfigurationChatsUseCase, IsMultiChatEnabledUseCase isMultiChatEnabledUseCase, ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource) {
        return new OnboardingStepViewModelFactory(coroutineScope, mutableSharedFlow, resourceProvider, dispatcherProvider, getBotUseCase, changeBotAgeUseCase, changeBotGenderUseCase, changeBotNameUseCase, changeUserAgeUseCase, changeUserGenderUseCase, changeUserNameUseCase, onboardingAnalytics, onboardingAnswersRepository, botRepository, userRepository, chatInterestsTypeMapperUi, getOnboardingConfigurationChatsUseCase, isMultiChatEnabledUseCase, chatConfigsMemoryCachedSource);
    }
}
