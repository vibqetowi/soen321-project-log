package com.ifriend.chat.new_chat.list.mapper;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatEntityToProcessingUiModelMapper_Factory implements Factory<ChatEntityToProcessingUiModelMapper> {
    private final Provider<Context> contextProvider;

    public ChatEntityToProcessingUiModelMapper_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatEntityToProcessingUiModelMapper get() {
        return newInstance(this.contextProvider.get());
    }

    public static ChatEntityToProcessingUiModelMapper_Factory create(Provider<Context> provider) {
        return new ChatEntityToProcessingUiModelMapper_Factory(provider);
    }

    public static ChatEntityToProcessingUiModelMapper newInstance(Context context) {
        return new ChatEntityToProcessingUiModelMapper(context);
    }
}
