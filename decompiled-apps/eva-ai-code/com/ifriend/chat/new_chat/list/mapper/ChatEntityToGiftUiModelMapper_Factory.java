package com.ifriend.chat.new_chat.list.mapper;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class ChatEntityToGiftUiModelMapper_Factory implements Factory<ChatEntityToGiftUiModelMapper> {
    @Override // javax.inject.Provider
    public ChatEntityToGiftUiModelMapper get() {
        return newInstance();
    }

    public static ChatEntityToGiftUiModelMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ChatEntityToGiftUiModelMapper newInstance() {
        return new ChatEntityToGiftUiModelMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final ChatEntityToGiftUiModelMapper_Factory INSTANCE = new ChatEntityToGiftUiModelMapper_Factory();

        private InstanceHolder() {
        }
    }
}
