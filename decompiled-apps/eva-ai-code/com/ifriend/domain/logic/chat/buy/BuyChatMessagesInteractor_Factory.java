package com.ifriend.domain.logic.chat.buy;

import com.ifriend.domain.data.chat.BuyChatMessagesRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BuyChatMessagesInteractor_Factory implements Factory<BuyChatMessagesInteractor> {
    private final Provider<BuyChatMessagesRepository> buyChatMessagesRepositoryProvider;

    public BuyChatMessagesInteractor_Factory(Provider<BuyChatMessagesRepository> provider) {
        this.buyChatMessagesRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public BuyChatMessagesInteractor get() {
        return newInstance(this.buyChatMessagesRepositoryProvider.get());
    }

    public static BuyChatMessagesInteractor_Factory create(Provider<BuyChatMessagesRepository> provider) {
        return new BuyChatMessagesInteractor_Factory(provider);
    }

    public static BuyChatMessagesInteractor newInstance(BuyChatMessagesRepository buyChatMessagesRepository) {
        return new BuyChatMessagesInteractor(buyChatMessagesRepository);
    }
}
