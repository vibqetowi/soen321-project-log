package com.ifriend.data.socket.mapper.chat;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class JsonToChatCallMessageMapper_Factory implements Factory<JsonToChatCallMessageMapper> {
    @Override // javax.inject.Provider
    public JsonToChatCallMessageMapper get() {
        return newInstance();
    }

    public static JsonToChatCallMessageMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static JsonToChatCallMessageMapper newInstance() {
        return new JsonToChatCallMessageMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final JsonToChatCallMessageMapper_Factory INSTANCE = new JsonToChatCallMessageMapper_Factory();

        private InstanceHolder() {
        }
    }
}
