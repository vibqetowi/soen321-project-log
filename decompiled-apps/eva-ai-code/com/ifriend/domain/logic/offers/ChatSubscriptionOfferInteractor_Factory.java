package com.ifriend.domain.logic.offers;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.offers.UserOffersRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatSubscriptionOfferInteractor_Factory implements Factory<ChatSubscriptionOfferInteractor> {
    private final Provider<UserOffersRepository> userOffersRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public ChatSubscriptionOfferInteractor_Factory(Provider<UserOffersRepository> provider, Provider<UserRepository> provider2) {
        this.userOffersRepositoryProvider = provider;
        this.userRepositoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatSubscriptionOfferInteractor get() {
        return newInstance(this.userOffersRepositoryProvider.get(), this.userRepositoryProvider.get());
    }

    public static ChatSubscriptionOfferInteractor_Factory create(Provider<UserOffersRepository> provider, Provider<UserRepository> provider2) {
        return new ChatSubscriptionOfferInteractor_Factory(provider, provider2);
    }

    public static ChatSubscriptionOfferInteractor newInstance(UserOffersRepository userOffersRepository, UserRepository userRepository) {
        return new ChatSubscriptionOfferInteractor(userOffersRepository, userRepository);
    }
}
