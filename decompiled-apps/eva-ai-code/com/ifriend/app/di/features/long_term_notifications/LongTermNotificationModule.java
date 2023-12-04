package com.ifriend.app.di.features.long_term_notifications;

import com.ifriend.domain.notifications.LongTermNotificationByPushCreator;
import com.ifriend.domain.notifications.LongTermNotificationByTypeOfPushHandler;
import com.ifriend.domain.notifications.LongTermNotificationManager;
import com.ifriend.long_term_notifications.impl.AvatarGeneratedLongTermCreator;
import com.ifriend.long_term_notifications.impl.LongTermNotificationByTypeOfPushHandlerImpl;
import com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoSet;
import javax.inject.Singleton;
import kotlin.Metadata;
/* compiled from: LongTermNotificationModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH'¨\u0006\u000f"}, d2 = {"Lcom/ifriend/app/di/features/long_term_notifications/LongTermNotificationModule;", "", "()V", "bindAvatarGeneratedLongTermCreator", "Lcom/ifriend/domain/notifications/LongTermNotificationByPushCreator;", "avatarGeneratedLongTermCreator", "Lcom/ifriend/long_term_notifications/impl/AvatarGeneratedLongTermCreator;", "bindLongTermNotificationByTypeOfPushHandler", "Lcom/ifriend/domain/notifications/LongTermNotificationByTypeOfPushHandler;", "longTermNotificationByTypeOfPushHandler", "Lcom/ifriend/long_term_notifications/impl/LongTermNotificationByTypeOfPushHandlerImpl;", "bindLongTermNotificationManager", "Lcom/ifriend/domain/notifications/LongTermNotificationManager;", "notificationManager", "Lcom/ifriend/long_term_notifications/impl/LongTermNotificationManagerImpl;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public abstract class LongTermNotificationModule {
    @Binds
    @IntoSet
    public abstract LongTermNotificationByPushCreator bindAvatarGeneratedLongTermCreator(AvatarGeneratedLongTermCreator avatarGeneratedLongTermCreator);

    @Binds
    public abstract LongTermNotificationByTypeOfPushHandler bindLongTermNotificationByTypeOfPushHandler(LongTermNotificationByTypeOfPushHandlerImpl longTermNotificationByTypeOfPushHandlerImpl);

    @Singleton
    @Binds
    public abstract LongTermNotificationManager bindLongTermNotificationManager(LongTermNotificationManagerImpl longTermNotificationManagerImpl);
}
