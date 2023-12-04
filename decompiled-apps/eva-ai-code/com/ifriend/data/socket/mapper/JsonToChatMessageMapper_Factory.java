package com.ifriend.data.socket.mapper;

import com.google.gson.Gson;
import com.ifriend.data.repository.chat.messages.mappers.ChatMessageMapper;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class JsonToChatMessageMapper_Factory implements Factory<JsonToChatMessageMapper> {
    private final Provider<ChatMessageMapper> chatMessageMapperProvider;
    private final Provider<Gson> gsonProvider;

    public JsonToChatMessageMapper_Factory(Provider<ChatMessageMapper> provider, Provider<Gson> provider2) {
        this.chatMessageMapperProvider = provider;
        this.gsonProvider = provider2;
    }

    @Override // javax.inject.Provider
    public JsonToChatMessageMapper get() {
        return newInstance(this.chatMessageMapperProvider.get(), this.gsonProvider.get());
    }

    public static JsonToChatMessageMapper_Factory create(Provider<ChatMessageMapper> provider, Provider<Gson> provider2) {
        return new JsonToChatMessageMapper_Factory(provider, provider2);
    }

    public static JsonToChatMessageMapper newInstance(ChatMessageMapper chatMessageMapper, Gson gson) {
        return new JsonToChatMessageMapper(chatMessageMapper, gson);
    }
}
