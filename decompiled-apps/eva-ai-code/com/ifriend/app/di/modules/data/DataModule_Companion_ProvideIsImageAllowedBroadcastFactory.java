package com.ifriend.app.di.modules.data;

import com.ifriend.domain.data.UserSubscriptionsBroadcast;
import com.ifriend.domain.newChat.chat.IsChatImageAllowedBroadcast;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideIsImageAllowedBroadcastFactory implements Factory<IsChatImageAllowedBroadcast> {
    private final Provider<UserSubscriptionsBroadcast> userSubscriptionsBroadcastProvider;

    public DataModule_Companion_ProvideIsImageAllowedBroadcastFactory(Provider<UserSubscriptionsBroadcast> provider) {
        this.userSubscriptionsBroadcastProvider = provider;
    }

    @Override // javax.inject.Provider
    public IsChatImageAllowedBroadcast get() {
        return provideIsImageAllowedBroadcast(this.userSubscriptionsBroadcastProvider.get());
    }

    public static DataModule_Companion_ProvideIsImageAllowedBroadcastFactory create(Provider<UserSubscriptionsBroadcast> provider) {
        return new DataModule_Companion_ProvideIsImageAllowedBroadcastFactory(provider);
    }

    public static IsChatImageAllowedBroadcast provideIsImageAllowedBroadcast(UserSubscriptionsBroadcast userSubscriptionsBroadcast) {
        return (IsChatImageAllowedBroadcast) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideIsImageAllowedBroadcast(userSubscriptionsBroadcast));
    }
}
