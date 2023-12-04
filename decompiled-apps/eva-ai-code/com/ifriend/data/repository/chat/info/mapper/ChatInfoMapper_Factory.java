package com.ifriend.data.repository.chat.info.mapper;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class ChatInfoMapper_Factory implements Factory<ChatInfoMapper> {
    @Override // javax.inject.Provider
    public ChatInfoMapper get() {
        return newInstance();
    }

    public static ChatInfoMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ChatInfoMapper newInstance() {
        return new ChatInfoMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final ChatInfoMapper_Factory INSTANCE = new ChatInfoMapper_Factory();

        private InstanceHolder() {
        }
    }
}
