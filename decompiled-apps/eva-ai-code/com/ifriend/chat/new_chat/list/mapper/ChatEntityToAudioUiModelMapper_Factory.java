package com.ifriend.chat.new_chat.list.mapper;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class ChatEntityToAudioUiModelMapper_Factory implements Factory<ChatEntityToAudioUiModelMapper> {
    @Override // javax.inject.Provider
    public ChatEntityToAudioUiModelMapper get() {
        return newInstance();
    }

    public static ChatEntityToAudioUiModelMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ChatEntityToAudioUiModelMapper newInstance() {
        return new ChatEntityToAudioUiModelMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final ChatEntityToAudioUiModelMapper_Factory INSTANCE = new ChatEntityToAudioUiModelMapper_Factory();

        private InstanceHolder() {
        }
    }
}
