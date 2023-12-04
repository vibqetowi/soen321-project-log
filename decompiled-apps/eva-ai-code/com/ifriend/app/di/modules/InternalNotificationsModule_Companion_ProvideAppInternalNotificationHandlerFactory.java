package com.ifriend.app.di.modules;

import com.ifriend.internal_notifications.handler.ComposedInternalNotificationHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class InternalNotificationsModule_Companion_ProvideAppInternalNotificationHandlerFactory implements Factory<ComposedInternalNotificationHandler> {
    @Override // javax.inject.Provider
    public ComposedInternalNotificationHandler get() {
        return provideAppInternalNotificationHandler();
    }

    public static InternalNotificationsModule_Companion_ProvideAppInternalNotificationHandlerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ComposedInternalNotificationHandler provideAppInternalNotificationHandler() {
        return (ComposedInternalNotificationHandler) Preconditions.checkNotNullFromProvides(InternalNotificationsModule.Companion.provideAppInternalNotificationHandler());
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final InternalNotificationsModule_Companion_ProvideAppInternalNotificationHandlerFactory INSTANCE = new InternalNotificationsModule_Companion_ProvideAppInternalNotificationHandlerFactory();

        private InstanceHolder() {
        }
    }
}
