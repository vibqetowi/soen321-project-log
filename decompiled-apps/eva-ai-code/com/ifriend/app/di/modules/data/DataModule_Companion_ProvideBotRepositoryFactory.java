package com.ifriend.app.di.modules.data;

import com.ifriend.common_utils.Logger;
import com.ifriend.data.mappers.BotFromResponseMapper;
import com.ifriend.data.mappers.EthnicityToBackendValueMapper;
import com.ifriend.data.mappers.GenderToBackendString;
import com.ifriend.data.mappers.PersonalityToBackendValueMapper;
import com.ifriend.data.networking.api.BotApi;
import com.ifriend.data.storages.bots.MainBotLocalDataSource;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.socket.MessagesSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideBotRepositoryFactory implements Factory<BotRepository> {
    private final Provider<BotApi> apiProvider;
    private final Provider<AuthDataProvider> authDataProvider;
    private final Provider<BotFromResponseMapper> botFromResponseMapperProvider;
    private final Provider<CoroutineDispatchers> coroutineDispatchersProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<EthnicityToBackendValueMapper> fromEthnicityMapperProvider;
    private final Provider<GenderToBackendString> fromGenderMapperProvider;
    private final Provider<PersonalityToBackendValueMapper> fromPersonalityMapperProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<MainBotLocalDataSource> mainBotLocalDataSourceProvider;
    private final Provider<MessagesSource> sourceProvider;
    private final Provider<Preferences> userSessionSharedPreferencesProvider;
    private final Provider<Preferences> userSharedPreferencesProvider;

    public DataModule_Companion_ProvideBotRepositoryFactory(Provider<AuthDataProvider> provider, Provider<BotApi> provider2, Provider<BotFromResponseMapper> provider3, Provider<GenderToBackendString> provider4, Provider<PersonalityToBackendValueMapper> provider5, Provider<EthnicityToBackendValueMapper> provider6, Provider<Preferences> provider7, Provider<Preferences> provider8, Provider<Logger> provider9, Provider<CoroutineDispatchers> provider10, Provider<CoroutineScope> provider11, Provider<MessagesSource> provider12, Provider<MainBotLocalDataSource> provider13) {
        this.authDataProvider = provider;
        this.apiProvider = provider2;
        this.botFromResponseMapperProvider = provider3;
        this.fromGenderMapperProvider = provider4;
        this.fromPersonalityMapperProvider = provider5;
        this.fromEthnicityMapperProvider = provider6;
        this.userSessionSharedPreferencesProvider = provider7;
        this.userSharedPreferencesProvider = provider8;
        this.loggerProvider = provider9;
        this.coroutineDispatchersProvider = provider10;
        this.coroutineScopeProvider = provider11;
        this.sourceProvider = provider12;
        this.mainBotLocalDataSourceProvider = provider13;
    }

    @Override // javax.inject.Provider
    public BotRepository get() {
        return provideBotRepository(this.authDataProvider.get(), this.apiProvider.get(), this.botFromResponseMapperProvider.get(), this.fromGenderMapperProvider.get(), this.fromPersonalityMapperProvider.get(), this.fromEthnicityMapperProvider.get(), this.userSessionSharedPreferencesProvider.get(), this.userSharedPreferencesProvider.get(), this.loggerProvider.get(), this.coroutineDispatchersProvider.get(), this.coroutineScopeProvider.get(), this.sourceProvider.get(), this.mainBotLocalDataSourceProvider.get());
    }

    public static DataModule_Companion_ProvideBotRepositoryFactory create(Provider<AuthDataProvider> provider, Provider<BotApi> provider2, Provider<BotFromResponseMapper> provider3, Provider<GenderToBackendString> provider4, Provider<PersonalityToBackendValueMapper> provider5, Provider<EthnicityToBackendValueMapper> provider6, Provider<Preferences> provider7, Provider<Preferences> provider8, Provider<Logger> provider9, Provider<CoroutineDispatchers> provider10, Provider<CoroutineScope> provider11, Provider<MessagesSource> provider12, Provider<MainBotLocalDataSource> provider13) {
        return new DataModule_Companion_ProvideBotRepositoryFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static BotRepository provideBotRepository(AuthDataProvider authDataProvider, BotApi botApi, BotFromResponseMapper botFromResponseMapper, GenderToBackendString genderToBackendString, PersonalityToBackendValueMapper personalityToBackendValueMapper, EthnicityToBackendValueMapper ethnicityToBackendValueMapper, Preferences preferences, Preferences preferences2, Logger logger, CoroutineDispatchers coroutineDispatchers, CoroutineScope coroutineScope, MessagesSource messagesSource, MainBotLocalDataSource mainBotLocalDataSource) {
        return (BotRepository) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideBotRepository(authDataProvider, botApi, botFromResponseMapper, genderToBackendString, personalityToBackendValueMapper, ethnicityToBackendValueMapper, preferences, preferences2, logger, coroutineDispatchers, coroutineScope, messagesSource, mainBotLocalDataSource));
    }
}
