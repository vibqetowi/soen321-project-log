package com.ifriend.chat.new_chat.list.mapper;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class ChatEntityToTopicSeparatorUiModelMapper_Factory implements Factory<ChatEntityToTopicSeparatorUiModelMapper> {
    @Override // javax.inject.Provider
    public ChatEntityToTopicSeparatorUiModelMapper get() {
        return newInstance();
    }

    public static ChatEntityToTopicSeparatorUiModelMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ChatEntityToTopicSeparatorUiModelMapper newInstance() {
        return new ChatEntityToTopicSeparatorUiModelMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final ChatEntityToTopicSeparatorUiModelMapper_Factory INSTANCE = new ChatEntityToTopicSeparatorUiModelMapper_Factory();

        private InstanceHolder() {
        }
    }
}
