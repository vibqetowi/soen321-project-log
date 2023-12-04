package com.ifriend.presentation.features.chat.gifts.delegate;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class ChatGiftsMapper_Factory implements Factory<ChatGiftsMapper> {
    @Override // javax.inject.Provider
    public ChatGiftsMapper get() {
        return newInstance();
    }

    public static ChatGiftsMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ChatGiftsMapper newInstance() {
        return new ChatGiftsMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final ChatGiftsMapper_Factory INSTANCE = new ChatGiftsMapper_Factory();

        private InstanceHolder() {
        }
    }
}
