package com.ifriend.domain.newChat.chat.systems.dateSeparator;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class DateSeparatorSystem_Factory implements Factory<DateSeparatorSystem> {
    @Override // javax.inject.Provider
    public DateSeparatorSystem get() {
        return newInstance();
    }

    public static DateSeparatorSystem_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DateSeparatorSystem newInstance() {
        return new DateSeparatorSystem();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final DateSeparatorSystem_Factory INSTANCE = new DateSeparatorSystem_Factory();

        private InstanceHolder() {
        }
    }
}
