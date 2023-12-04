package com.ifriend.long_term_notifications.impl;

import com.ifriend.domain.notifications.LongTermNotificationByPushCreator;
import com.ifriend.domain.notifications.LongTermNotificationManager;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class LongTermNotificationByTypeOfPushHandlerImpl_Factory implements Factory<LongTermNotificationByTypeOfPushHandlerImpl> {
    private final Provider<Set<LongTermNotificationByPushCreator>> creatorsProvider;
    private final Provider<LongTermNotificationManager> longTermNotificationManagerProvider;

    public LongTermNotificationByTypeOfPushHandlerImpl_Factory(Provider<LongTermNotificationManager> provider, Provider<Set<LongTermNotificationByPushCreator>> provider2) {
        this.longTermNotificationManagerProvider = provider;
        this.creatorsProvider = provider2;
    }

    @Override // javax.inject.Provider
    public LongTermNotificationByTypeOfPushHandlerImpl get() {
        return newInstance(this.longTermNotificationManagerProvider.get(), this.creatorsProvider.get());
    }

    public static LongTermNotificationByTypeOfPushHandlerImpl_Factory create(Provider<LongTermNotificationManager> provider, Provider<Set<LongTermNotificationByPushCreator>> provider2) {
        return new LongTermNotificationByTypeOfPushHandlerImpl_Factory(provider, provider2);
    }

    public static LongTermNotificationByTypeOfPushHandlerImpl newInstance(LongTermNotificationManager longTermNotificationManager, Set<LongTermNotificationByPushCreator> set) {
        return new LongTermNotificationByTypeOfPushHandlerImpl(longTermNotificationManager, set);
    }
}
