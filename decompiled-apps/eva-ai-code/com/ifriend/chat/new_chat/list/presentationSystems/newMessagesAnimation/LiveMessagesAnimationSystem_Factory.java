package com.ifriend.chat.new_chat.list.presentationSystems.newMessagesAnimation;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class LiveMessagesAnimationSystem_Factory implements Factory<LiveMessagesAnimationSystem> {
    @Override // javax.inject.Provider
    public LiveMessagesAnimationSystem get() {
        return newInstance();
    }

    public static LiveMessagesAnimationSystem_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LiveMessagesAnimationSystem newInstance() {
        return new LiveMessagesAnimationSystem();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final LiveMessagesAnimationSystem_Factory INSTANCE = new LiveMessagesAnimationSystem_Factory();

        private InstanceHolder() {
        }
    }
}
