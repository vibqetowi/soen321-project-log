package com.ifriend.chat.presentation.ui.chat.presentation.chat.ui;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class ChatScreenFactoryImpl_Factory implements Factory<ChatScreenFactoryImpl> {
    @Override // javax.inject.Provider
    public ChatScreenFactoryImpl get() {
        return newInstance();
    }

    public static ChatScreenFactoryImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ChatScreenFactoryImpl newInstance() {
        return new ChatScreenFactoryImpl();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final ChatScreenFactoryImpl_Factory INSTANCE = new ChatScreenFactoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
