package com.ifriend.app.di.modules.data;

import com.ifriend.common_utils.Logger;
import com.ifriend.data.networking.api.FirebaseApi;
import com.ifriend.domain.data.networking.FirebaseApiRepository;
import com.ifriend.domain.storage.token.UserTokenProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideFirebaseProcessFactory implements Factory<FirebaseApiRepository> {
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<FirebaseApi> firebaseApiProvider;
    private final Provider<Logger> loggerProvider;
    private final ApiModule module;
    private final Provider<UserTokenProvider> userTokenProvider;

    public ApiModule_ProvideFirebaseProcessFactory(ApiModule apiModule, Provider<FirebaseApi> provider, Provider<UserTokenProvider> provider2, Provider<CoroutineScope> provider3, Provider<Logger> provider4) {
        this.module = apiModule;
        this.firebaseApiProvider = provider;
        this.userTokenProvider = provider2;
        this.coroutineScopeProvider = provider3;
        this.loggerProvider = provider4;
    }

    @Override // javax.inject.Provider
    public FirebaseApiRepository get() {
        return provideFirebaseProcess(this.module, this.firebaseApiProvider.get(), this.userTokenProvider.get(), this.coroutineScopeProvider.get(), this.loggerProvider.get());
    }

    public static ApiModule_ProvideFirebaseProcessFactory create(ApiModule apiModule, Provider<FirebaseApi> provider, Provider<UserTokenProvider> provider2, Provider<CoroutineScope> provider3, Provider<Logger> provider4) {
        return new ApiModule_ProvideFirebaseProcessFactory(apiModule, provider, provider2, provider3, provider4);
    }

    public static FirebaseApiRepository provideFirebaseProcess(ApiModule apiModule, FirebaseApi firebaseApi, UserTokenProvider userTokenProvider, CoroutineScope coroutineScope, Logger logger) {
        return (FirebaseApiRepository) Preconditions.checkNotNullFromProvides(apiModule.provideFirebaseProcess(firebaseApi, userTokenProvider, coroutineScope, logger));
    }
}
