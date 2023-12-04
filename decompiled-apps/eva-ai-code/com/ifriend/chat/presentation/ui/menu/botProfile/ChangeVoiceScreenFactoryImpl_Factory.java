package com.ifriend.chat.presentation.ui.menu.botProfile;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class ChangeVoiceScreenFactoryImpl_Factory implements Factory<ChangeVoiceScreenFactoryImpl> {
    @Override // javax.inject.Provider
    public ChangeVoiceScreenFactoryImpl get() {
        return newInstance();
    }

    public static ChangeVoiceScreenFactoryImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ChangeVoiceScreenFactoryImpl newInstance() {
        return new ChangeVoiceScreenFactoryImpl();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final ChangeVoiceScreenFactoryImpl_Factory INSTANCE = new ChangeVoiceScreenFactoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
