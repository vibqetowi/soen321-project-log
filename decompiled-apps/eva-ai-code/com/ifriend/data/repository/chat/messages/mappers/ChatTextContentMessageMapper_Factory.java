package com.ifriend.data.repository.chat.messages.mappers;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class ChatTextContentMessageMapper_Factory implements Factory<ChatTextContentMessageMapper> {
    @Override // javax.inject.Provider
    public ChatTextContentMessageMapper get() {
        return newInstance();
    }

    public static ChatTextContentMessageMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ChatTextContentMessageMapper newInstance() {
        return new ChatTextContentMessageMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final ChatTextContentMessageMapper_Factory INSTANCE = new ChatTextContentMessageMapper_Factory();

        private InstanceHolder() {
        }
    }
}
