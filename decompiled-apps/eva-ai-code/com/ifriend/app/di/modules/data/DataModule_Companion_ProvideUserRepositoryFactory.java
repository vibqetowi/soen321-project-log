package com.ifriend.app.di.modules.data;

import com.ifriend.data.mappers.GenderToBackendString;
import com.ifriend.data.mappers.ToUserMapper;
import com.ifriend.data.networking.api.UserApi;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.data.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideUserRepositoryFactory implements Factory<UserRepository> {
    private final Provider<UserApi> apiProvider;
    private final Provider<AuthDataProvider> authDataProvider;
    private final Provider<CoroutineDispatchers> coroutineDispatchersProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<GenderToBackendString> fromGenderMapperProvider;
    private final Provider<TagsProvider> tagsProvider;
    private final Provider<ToUserMapper> toUserMapperProvider;

    public DataModule_Companion_ProvideUserRepositoryFactory(Provider<AuthDataProvider> provider, Provider<TagsProvider> provider2, Provider<UserApi> provider3, Provider<GenderToBackendString> provider4, Provider<ToUserMapper> provider5, Provider<CoroutineDispatchers> provider6, Provider<CoroutineScope> provider7) {
        this.authDataProvider = provider;
        this.tagsProvider = provider2;
        this.apiProvider = provider3;
        this.fromGenderMapperProvider = provider4;
        this.toUserMapperProvider = provider5;
        this.coroutineDispatchersProvider = provider6;
        this.coroutineScopeProvider = provider7;
    }

    @Override // javax.inject.Provider
    public UserRepository get() {
        return provideUserRepository(this.authDataProvider.get(), this.tagsProvider.get(), this.apiProvider.get(), this.fromGenderMapperProvider.get(), this.toUserMapperProvider.get(), this.coroutineDispatchersProvider.get(), this.coroutineScopeProvider.get());
    }

    public static DataModule_Companion_ProvideUserRepositoryFactory create(Provider<AuthDataProvider> provider, Provider<TagsProvider> provider2, Provider<UserApi> provider3, Provider<GenderToBackendString> provider4, Provider<ToUserMapper> provider5, Provider<CoroutineDispatchers> provider6, Provider<CoroutineScope> provider7) {
        return new DataModule_Companion_ProvideUserRepositoryFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static UserRepository provideUserRepository(AuthDataProvider authDataProvider, TagsProvider tagsProvider, UserApi userApi, GenderToBackendString genderToBackendString, ToUserMapper toUserMapper, CoroutineDispatchers coroutineDispatchers, CoroutineScope coroutineScope) {
        return (UserRepository) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideUserRepository(authDataProvider, tagsProvider, userApi, genderToBackendString, toUserMapper, coroutineDispatchers, coroutineScope));
    }
}
