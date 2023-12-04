package com.ifriend.data.socket.mapper;

import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatSubscriptionMapper_Factory implements Factory<ChatSubscriptionMapper> {
    private final Provider<Gson> gsonProvider;

    public ChatSubscriptionMapper_Factory(Provider<Gson> provider) {
        this.gsonProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatSubscriptionMapper get() {
        return newInstance(this.gsonProvider.get());
    }

    public static ChatSubscriptionMapper_Factory create(Provider<Gson> provider) {
        return new ChatSubscriptionMapper_Factory(provider);
    }

    public static ChatSubscriptionMapper newInstance(Gson gson) {
        return new ChatSubscriptionMapper(gson);
    }
}
