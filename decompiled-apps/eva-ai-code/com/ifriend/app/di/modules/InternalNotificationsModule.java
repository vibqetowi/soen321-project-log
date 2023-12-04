package com.ifriend.app.di.modules;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.socket.notifications.AppNotifier;
import com.ifriend.infrastructure.internalNotifications.MainThreadInternalNotificationHandlerRunner;
import com.ifriend.internal_notifications.handler.ComposedInternalNotificationHandler;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.internal_notifications.handler.InternalNotificationsQueue;
import com.ifriend.internal_notifications.register.AutoRemoveTerminatedHandlersRegister;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: InternalNotificationsModule.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u000b"}, d2 = {"Lcom/ifriend/app/di/modules/InternalNotificationsModule;", "", "provideInternalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "appHandler", "Lcom/ifriend/internal_notifications/handler/ComposedInternalNotificationHandler;", "provideInternalNotificationHandlersRegister", "Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;", "provideInternalNotificationsQueue", "Lcom/ifriend/internal_notifications/handler/InternalNotificationsQueue;", "Companion", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface InternalNotificationsModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Singleton
    @Binds
    InternalNotificationHandler provideInternalNotificationHandler(ComposedInternalNotificationHandler composedInternalNotificationHandler);

    @Singleton
    @Binds
    InternalNotificationHandlersRegister provideInternalNotificationHandlersRegister(ComposedInternalNotificationHandler composedInternalNotificationHandler);

    @Singleton
    @Binds
    InternalNotificationsQueue provideInternalNotificationsQueue(ComposedInternalNotificationHandler composedInternalNotificationHandler);

    /* compiled from: InternalNotificationsModule.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0011"}, d2 = {"Lcom/ifriend/app/di/modules/InternalNotificationsModule$Companion;", "", "()V", "provideAppInternalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/ComposedInternalNotificationHandler;", "provideAppNotifier", "Lcom/ifriend/domain/socket/notifications/AppNotifier;", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "internalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "logger", "Lcom/ifriend/common_utils/Logger;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @Singleton
        public final AppNotifier provideAppNotifier(MessagesSource messagesSource, InternalNotificationHandler internalNotificationHandler, CoroutineScope scope, CoroutineDispatchers dispatchers, Logger logger) {
            Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
            Intrinsics.checkNotNullParameter(internalNotificationHandler, "internalNotificationHandler");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new AppNotifier(messagesSource, internalNotificationHandler, scope, dispatchers, logger);
        }

        @Provides
        @Singleton
        public final ComposedInternalNotificationHandler provideAppInternalNotificationHandler() {
            return new ComposedInternalNotificationHandler(new MainThreadInternalNotificationHandlerRunner(), new AutoRemoveTerminatedHandlersRegister(null, 1, null));
        }
    }
}
