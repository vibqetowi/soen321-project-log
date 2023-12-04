package com.ifriend.domain.logic.chat.avatart;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.storage.AvatarAnimationEnabledStorage;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class GeneratedChatAvatarInteractor_Factory implements Factory<GeneratedChatAvatarInteractor> {
    private final Provider<AvatarAnimationEnabledStorage> avatarAnimationEnabledStorageProvider;
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<FeatureToggleRepository> featureToggleRepositoryProvider;
    private final Provider<GenerateBotAvatarRepository> generateBotAvatarRepositoryProvider;

    public GeneratedChatAvatarInteractor_Factory(Provider<BotRepository> provider, Provider<AvatarAnimationEnabledStorage> provider2, Provider<ChatsInfoInteractor> provider3, Provider<GenerateBotAvatarRepository> provider4, Provider<FeatureToggleRepository> provider5) {
        this.botRepositoryProvider = provider;
        this.avatarAnimationEnabledStorageProvider = provider2;
        this.chatsInfoInteractorProvider = provider3;
        this.generateBotAvatarRepositoryProvider = provider4;
        this.featureToggleRepositoryProvider = provider5;
    }

    @Override // javax.inject.Provider
    public GeneratedChatAvatarInteractor get() {
        return newInstance(this.botRepositoryProvider.get(), this.avatarAnimationEnabledStorageProvider.get(), this.chatsInfoInteractorProvider.get(), this.generateBotAvatarRepositoryProvider.get(), this.featureToggleRepositoryProvider.get());
    }

    public static GeneratedChatAvatarInteractor_Factory create(Provider<BotRepository> provider, Provider<AvatarAnimationEnabledStorage> provider2, Provider<ChatsInfoInteractor> provider3, Provider<GenerateBotAvatarRepository> provider4, Provider<FeatureToggleRepository> provider5) {
        return new GeneratedChatAvatarInteractor_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static GeneratedChatAvatarInteractor newInstance(BotRepository botRepository, AvatarAnimationEnabledStorage avatarAnimationEnabledStorage, ChatsInfoInteractor chatsInfoInteractor, GenerateBotAvatarRepository generateBotAvatarRepository, FeatureToggleRepository featureToggleRepository) {
        return new GeneratedChatAvatarInteractor(botRepository, avatarAnimationEnabledStorage, chatsInfoInteractor, generateBotAvatarRepository, featureToggleRepository);
    }
}
