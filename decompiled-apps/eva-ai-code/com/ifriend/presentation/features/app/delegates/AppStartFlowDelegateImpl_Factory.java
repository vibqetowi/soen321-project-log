package com.ifriend.presentation.features.app.delegates;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppStartFlowDelegateImpl_Factory implements Factory<AppStartFlowDelegateImpl> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<UserProfileRepository> userProfileRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public AppStartFlowDelegateImpl_Factory(Provider<UserRepository> provider, Provider<UserProfileRepository> provider2, Provider<AppEventsEmitter> provider3) {
        this.userRepositoryProvider = provider;
        this.userProfileRepositoryProvider = provider2;
        this.appEventsEmitterProvider = provider3;
    }

    @Override // javax.inject.Provider
    public AppStartFlowDelegateImpl get() {
        return newInstance(this.userRepositoryProvider.get(), this.userProfileRepositoryProvider.get(), this.appEventsEmitterProvider.get());
    }

    public static AppStartFlowDelegateImpl_Factory create(Provider<UserRepository> provider, Provider<UserProfileRepository> provider2, Provider<AppEventsEmitter> provider3) {
        return new AppStartFlowDelegateImpl_Factory(provider, provider2, provider3);
    }

    public static AppStartFlowDelegateImpl newInstance(UserRepository userRepository, UserProfileRepository userProfileRepository, AppEventsEmitter appEventsEmitter) {
        return new AppStartFlowDelegateImpl(userRepository, userProfileRepository, appEventsEmitter);
    }
}
