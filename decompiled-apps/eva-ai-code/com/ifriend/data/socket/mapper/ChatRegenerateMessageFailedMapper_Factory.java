package com.ifriend.data.socket.mapper;

import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatRegenerateMessageFailedMapper_Factory implements Factory<ChatRegenerateMessageFailedMapper> {
    private final Provider<Gson> gsonProvider;

    public ChatRegenerateMessageFailedMapper_Factory(Provider<Gson> provider) {
        this.gsonProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatRegenerateMessageFailedMapper get() {
        return newInstance(this.gsonProvider.get());
    }

    public static ChatRegenerateMessageFailedMapper_Factory create(Provider<Gson> provider) {
        return new ChatRegenerateMessageFailedMapper_Factory(provider);
    }

    public static ChatRegenerateMessageFailedMapper newInstance(Gson gson) {
        return new ChatRegenerateMessageFailedMapper(gson);
    }
}
