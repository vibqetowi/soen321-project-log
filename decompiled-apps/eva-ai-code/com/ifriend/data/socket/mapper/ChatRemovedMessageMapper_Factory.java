package com.ifriend.data.socket.mapper;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class ChatRemovedMessageMapper_Factory implements Factory<ChatRemovedMessageMapper> {
    @Override // javax.inject.Provider
    public ChatRemovedMessageMapper get() {
        return newInstance();
    }

    public static ChatRemovedMessageMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ChatRemovedMessageMapper newInstance() {
        return new ChatRemovedMessageMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final ChatRemovedMessageMapper_Factory INSTANCE = new ChatRemovedMessageMapper_Factory();

        private InstanceHolder() {
        }
    }
}
