package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.levels.LevelsApiDelegate;
import com.ifriend.data.storages.levels.LevelsDao;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.levels.LevelsRepository;
import com.ifriend.domain.socket.MessagesSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideLevelsRepositoryFactory implements Factory<LevelsRepository> {
    private final Provider<LevelsApiDelegate> apiDelegateProvider;
    private final Provider<LevelsDao> daoProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<MessagesSource> messagesSourceProvider;
    private final Provider<CoroutineScope> scopeProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public DataModule_Companion_ProvideLevelsRepositoryFactory(Provider<LevelsApiDelegate> provider, Provider<UserRepository> provider2, Provider<LevelsDao> provider3, Provider<MessagesSource> provider4, Provider<CoroutineScope> provider5, Provider<CoroutineDispatchers> provider6) {
        this.apiDelegateProvider = provider;
        this.userRepositoryProvider = provider2;
        this.daoProvider = provider3;
        this.messagesSourceProvider = provider4;
        this.scopeProvider = provider5;
        this.dispatchersProvider = provider6;
    }

    @Override // javax.inject.Provider
    public LevelsRepository get() {
        return provideLevelsRepository(this.apiDelegateProvider.get(), this.userRepositoryProvider.get(), this.daoProvider.get(), this.messagesSourceProvider.get(), this.scopeProvider.get(), this.dispatchersProvider.get());
    }

    public static DataModule_Companion_ProvideLevelsRepositoryFactory create(Provider<LevelsApiDelegate> provider, Provider<UserRepository> provider2, Provider<LevelsDao> provider3, Provider<MessagesSource> provider4, Provider<CoroutineScope> provider5, Provider<CoroutineDispatchers> provider6) {
        return new DataModule_Companion_ProvideLevelsRepositoryFactory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static LevelsRepository provideLevelsRepository(LevelsApiDelegate levelsApiDelegate, UserRepository userRepository, LevelsDao levelsDao, MessagesSource messagesSource, CoroutineScope coroutineScope, CoroutineDispatchers coroutineDispatchers) {
        return (LevelsRepository) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideLevelsRepository(levelsApiDelegate, userRepository, levelsDao, messagesSource, coroutineScope, coroutineDispatchers));
    }
}
