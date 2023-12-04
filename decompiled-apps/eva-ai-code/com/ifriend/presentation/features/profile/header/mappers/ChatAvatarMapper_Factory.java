package com.ifriend.presentation.features.profile.header.mappers;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class ChatAvatarMapper_Factory implements Factory<ChatAvatarMapper> {
    @Override // javax.inject.Provider
    public ChatAvatarMapper get() {
        return newInstance();
    }

    public static ChatAvatarMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ChatAvatarMapper newInstance() {
        return new ChatAvatarMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final ChatAvatarMapper_Factory INSTANCE = new ChatAvatarMapper_Factory();

        private InstanceHolder() {
        }
    }
}
