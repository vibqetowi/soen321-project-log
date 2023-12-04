package com.ifriend.chat.new_chat.list.presentationSystems.scroll;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class ScrollControllingSystem_Factory implements Factory<ScrollControllingSystem> {
    @Override // javax.inject.Provider
    public ScrollControllingSystem get() {
        return newInstance();
    }

    public static ScrollControllingSystem_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ScrollControllingSystem newInstance() {
        return new ScrollControllingSystem();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final ScrollControllingSystem_Factory INSTANCE = new ScrollControllingSystem_Factory();

        private InstanceHolder() {
        }
    }
}
