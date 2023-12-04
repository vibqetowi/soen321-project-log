package com.ifriend.app.di.modules.data;

import com.ifriend.common_utils.Logger;
import com.ifriend.data.networking.api.GenerateBotAvatarApi;
import com.ifriend.data.toggle.AnimatedAvatarFeatureToggle;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatusStorage;
import com.ifriend.domain.data.generateAvatar.AvatarInfoStorage;
import com.ifriend.domain.data.generateAvatar.AvatarsStorage;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.storage.AvatarAnimationEnabledStorage;
import com.ifriend.domain.storage.NeuronsCostsStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideGenerateBotAvatarRepositoryFactory implements Factory<GenerateBotAvatarRepository> {
    private final Provider<AnimatedAvatarFeatureToggle> animatedAvatarFeatureToggleProvider;
    private final Provider<AuthDataProvider> authDataProvider;
    private final Provider<AvatarAnimationEnabledStorage> avatarAnimationEnabledStorageProvider;
    private final Provider<AvatarGenerationStatusStorage> avatarGenerationStatusStorageProvider;
    private final Provider<AvatarInfoStorage> avatarInfoStorageProvider;
    private final Provider<AvatarsStorage> avatarsStorageProvider;
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<GenerateBotAvatarApi> generateBotAvatarApiProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<MessagesSource> messagesSourceProvider;
    private final Provider<NeuronsCostsStorage> neuronsCostsStorageProvider;
    private final Provider<Preferences> preferencesProvider;

    public DataModule_Companion_ProvideGenerateBotAvatarRepositoryFactory(Provider<GenerateBotAvatarApi> provider, Provider<AuthDataProvider> provider2, Provider<MessagesSource> provider3, Provider<CoroutineScope> provider4, Provider<Preferences> provider5, Provider<AvatarsStorage> provider6, Provider<AvatarInfoStorage> provider7, Provider<AvatarGenerationStatusStorage> provider8, Provider<NeuronsCostsStorage> provider9, Provider<AnimatedAvatarFeatureToggle> provider10, Provider<AvatarAnimationEnabledStorage> provider11, Provider<BotRepository> provider12, Provider<Logger> provider13) {
        this.generateBotAvatarApiProvider = provider;
        this.authDataProvider = provider2;
        this.messagesSourceProvider = provider3;
        this.coroutineScopeProvider = provider4;
        this.preferencesProvider = provider5;
        this.avatarsStorageProvider = provider6;
        this.avatarInfoStorageProvider = provider7;
        this.avatarGenerationStatusStorageProvider = provider8;
        this.neuronsCostsStorageProvider = provider9;
        this.animatedAvatarFeatureToggleProvider = provider10;
        this.avatarAnimationEnabledStorageProvider = provider11;
        this.botRepositoryProvider = provider12;
        this.loggerProvider = provider13;
    }

    @Override // javax.inject.Provider
    public GenerateBotAvatarRepository get() {
        return provideGenerateBotAvatarRepository(this.generateBotAvatarApiProvider.get(), this.authDataProvider.get(), this.messagesSourceProvider.get(), this.coroutineScopeProvider.get(), this.preferencesProvider.get(), this.avatarsStorageProvider.get(), this.avatarInfoStorageProvider.get(), this.avatarGenerationStatusStorageProvider.get(), this.neuronsCostsStorageProvider.get(), this.animatedAvatarFeatureToggleProvider.get(), this.avatarAnimationEnabledStorageProvider.get(), this.botRepositoryProvider.get(), this.loggerProvider.get());
    }

    public static DataModule_Companion_ProvideGenerateBotAvatarRepositoryFactory create(Provider<GenerateBotAvatarApi> provider, Provider<AuthDataProvider> provider2, Provider<MessagesSource> provider3, Provider<CoroutineScope> provider4, Provider<Preferences> provider5, Provider<AvatarsStorage> provider6, Provider<AvatarInfoStorage> provider7, Provider<AvatarGenerationStatusStorage> provider8, Provider<NeuronsCostsStorage> provider9, Provider<AnimatedAvatarFeatureToggle> provider10, Provider<AvatarAnimationEnabledStorage> provider11, Provider<BotRepository> provider12, Provider<Logger> provider13) {
        return new DataModule_Companion_ProvideGenerateBotAvatarRepositoryFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static GenerateBotAvatarRepository provideGenerateBotAvatarRepository(GenerateBotAvatarApi generateBotAvatarApi, AuthDataProvider authDataProvider, MessagesSource messagesSource, CoroutineScope coroutineScope, Preferences preferences, AvatarsStorage avatarsStorage, AvatarInfoStorage avatarInfoStorage, AvatarGenerationStatusStorage avatarGenerationStatusStorage, NeuronsCostsStorage neuronsCostsStorage, AnimatedAvatarFeatureToggle animatedAvatarFeatureToggle, AvatarAnimationEnabledStorage avatarAnimationEnabledStorage, BotRepository botRepository, Logger logger) {
        return (GenerateBotAvatarRepository) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideGenerateBotAvatarRepository(generateBotAvatarApi, authDataProvider, messagesSource, coroutineScope, preferences, avatarsStorage, avatarInfoStorage, avatarGenerationStatusStorage, neuronsCostsStorage, animatedAvatarFeatureToggle, avatarAnimationEnabledStorage, botRepository, logger));
    }
}
