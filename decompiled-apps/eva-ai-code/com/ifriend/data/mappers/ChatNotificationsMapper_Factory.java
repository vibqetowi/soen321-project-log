package com.ifriend.data.mappers;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class ChatNotificationsMapper_Factory implements Factory<ChatNotificationsMapper> {
    @Override // javax.inject.Provider
    public ChatNotificationsMapper get() {
        return newInstance();
    }

    public static ChatNotificationsMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ChatNotificationsMapper newInstance() {
        return new ChatNotificationsMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final ChatNotificationsMapper_Factory INSTANCE = new ChatNotificationsMapper_Factory();

        private InstanceHolder() {
        }
    }
}
