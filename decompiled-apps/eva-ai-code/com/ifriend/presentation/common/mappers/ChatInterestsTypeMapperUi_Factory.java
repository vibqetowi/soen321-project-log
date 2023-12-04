package com.ifriend.presentation.common.mappers;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class ChatInterestsTypeMapperUi_Factory implements Factory<ChatInterestsTypeMapperUi> {
    @Override // javax.inject.Provider
    public ChatInterestsTypeMapperUi get() {
        return newInstance();
    }

    public static ChatInterestsTypeMapperUi_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ChatInterestsTypeMapperUi newInstance() {
        return new ChatInterestsTypeMapperUi();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final ChatInterestsTypeMapperUi_Factory INSTANCE = new ChatInterestsTypeMapperUi_Factory();

        private InstanceHolder() {
        }
    }
}
