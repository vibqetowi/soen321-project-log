package com.ifriend.chat.new_chat.list.mapper;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatEntityToDateUiModelMapper_Factory implements Factory<ChatEntityToDateUiModelMapper> {
    private final Provider<Context> contextProvider;

    public ChatEntityToDateUiModelMapper_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatEntityToDateUiModelMapper get() {
        return newInstance(this.contextProvider.get());
    }

    public static ChatEntityToDateUiModelMapper_Factory create(Provider<Context> provider) {
        return new ChatEntityToDateUiModelMapper_Factory(provider);
    }

    public static ChatEntityToDateUiModelMapper newInstance(Context context) {
        return new ChatEntityToDateUiModelMapper(context);
    }
}
