package com.ifriend.presentation.features.profile.header.delegate;

import android.content.res.Resources;
import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.useCases.bot.BotHaveUpdateUseCase;
import com.ifriend.domain.useCases.levels.GetLevelInfoUseCase;
import com.ifriend.presentation.features.email.confirm.EmailConfirmDelegateImpl;
import com.ifriend.presentation.features.profile.header.mappers.ChatAvatarMapper;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatHeaderDelegateImpl_Factory implements Factory<ChatHeaderDelegateImpl> {
    private final Provider<BotHaveUpdateUseCase> botHaveUpdateUseCaseProvider;
    private final Provider<ChatAvatarMapper> chatAvatarMapperProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<EmailConfirmDelegateImpl> emailConfirmDelegateProvider;
    private final Provider<FeatureToggleRepository> featureToggleRepositoryProvider;
    private final Provider<GenerateBotAvatarRepository> generateBotAvatarRepositoryProvider;
    private final Provider<GeneratedChatAvatarInteractor> generatedChatAvatarInteractorProvider;
    private final Provider<GetLevelInfoUseCase> getLevelInfoUseCaseProvider;
    private final Provider<Resources> resourcesProvider;
    private final Provider<UserBalanceRepository> userBalanceRepositoryProvider;

    public ChatHeaderDelegateImpl_Factory(Provider<Resources> provider, Provider<GetLevelInfoUseCase> provider2, Provider<BotHaveUpdateUseCase> provider3, Provider<ChatsInfoInteractor> provider4, Provider<UserBalanceRepository> provider5, Provider<EmailConfirmDelegateImpl> provider6, Provider<FeatureToggleRepository> provider7, Provider<GenerateBotAvatarRepository> provider8, Provider<ChatAvatarMapper> provider9, Provider<GeneratedChatAvatarInteractor> provider10) {
        this.resourcesProvider = provider;
        this.getLevelInfoUseCaseProvider = provider2;
        this.botHaveUpdateUseCaseProvider = provider3;
        this.chatsInfoInteractorProvider = provider4;
        this.userBalanceRepositoryProvider = provider5;
        this.emailConfirmDelegateProvider = provider6;
        this.featureToggleRepositoryProvider = provider7;
        this.generateBotAvatarRepositoryProvider = provider8;
        this.chatAvatarMapperProvider = provider9;
        this.generatedChatAvatarInteractorProvider = provider10;
    }

    @Override // javax.inject.Provider
    public ChatHeaderDelegateImpl get() {
        return newInstance(this.resourcesProvider.get(), this.getLevelInfoUseCaseProvider.get(), this.botHaveUpdateUseCaseProvider.get(), this.chatsInfoInteractorProvider.get(), this.userBalanceRepositoryProvider.get(), this.emailConfirmDelegateProvider.get(), this.featureToggleRepositoryProvider.get(), this.generateBotAvatarRepositoryProvider.get(), this.chatAvatarMapperProvider.get(), this.generatedChatAvatarInteractorProvider.get());
    }

    public static ChatHeaderDelegateImpl_Factory create(Provider<Resources> provider, Provider<GetLevelInfoUseCase> provider2, Provider<BotHaveUpdateUseCase> provider3, Provider<ChatsInfoInteractor> provider4, Provider<UserBalanceRepository> provider5, Provider<EmailConfirmDelegateImpl> provider6, Provider<FeatureToggleRepository> provider7, Provider<GenerateBotAvatarRepository> provider8, Provider<ChatAvatarMapper> provider9, Provider<GeneratedChatAvatarInteractor> provider10) {
        return new ChatHeaderDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static ChatHeaderDelegateImpl newInstance(Resources resources, GetLevelInfoUseCase getLevelInfoUseCase, BotHaveUpdateUseCase botHaveUpdateUseCase, ChatsInfoInteractor chatsInfoInteractor, UserBalanceRepository userBalanceRepository, EmailConfirmDelegateImpl emailConfirmDelegateImpl, FeatureToggleRepository featureToggleRepository, GenerateBotAvatarRepository generateBotAvatarRepository, ChatAvatarMapper chatAvatarMapper, GeneratedChatAvatarInteractor generatedChatAvatarInteractor) {
        return new ChatHeaderDelegateImpl(resources, getLevelInfoUseCase, botHaveUpdateUseCase, chatsInfoInteractor, userBalanceRepository, emailConfirmDelegateImpl, featureToggleRepository, generateBotAvatarRepository, chatAvatarMapper, generatedChatAvatarInteractor);
    }
}
