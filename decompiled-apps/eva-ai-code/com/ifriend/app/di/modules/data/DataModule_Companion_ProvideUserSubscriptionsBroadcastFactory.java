package com.ifriend.app.di.modules.data;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.UserSubscriptionsBroadcast;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideUserSubscriptionsBroadcastFactory implements Factory<UserSubscriptionsBroadcast> {
    private final Provider<UserRepository> userRepositoryProvider;

    public DataModule_Companion_ProvideUserSubscriptionsBroadcastFactory(Provider<UserRepository> provider) {
        this.userRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public UserSubscriptionsBroadcast get() {
        return provideUserSubscriptionsBroadcast(this.userRepositoryProvider.get());
    }

    public static DataModule_Companion_ProvideUserSubscriptionsBroadcastFactory create(Provider<UserRepository> provider) {
        return new DataModule_Companion_ProvideUserSubscriptionsBroadcastFactory(provider);
    }

    public static UserSubscriptionsBroadcast provideUserSubscriptionsBroadcast(UserRepository userRepository) {
        return (UserSubscriptionsBroadcast) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideUserSubscriptionsBroadcast(userRepository));
    }
}
