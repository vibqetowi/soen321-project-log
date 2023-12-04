package com.ifriend.chat.presentation.di.internalNotifications;

import com.ifriend.base.di.Feature;
import com.ifriend.chat.presentation.ui.internalNotifications.NotificationToSnackbarMapper;
import com.ifriend.domain.data.Mapper;
import com.ifriend.internal_notifications.notification.InternalNotification;
import com.ifriend.ui.internalNotifications.SnackbarDescription;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;
/* compiled from: ChatInternalNotificationsModule.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/ifriend/chat/presentation/di/internalNotifications/ChatInternalNotificationsModule;", "", "bindNotificationToSnackbarMapper", "Lcom/ifriend/domain/data/Mapper;", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "Lcom/ifriend/ui/internalNotifications/SnackbarDescription;", "mapper", "Lcom/ifriend/chat/presentation/ui/internalNotifications/NotificationToSnackbarMapper;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface ChatInternalNotificationsModule {
    @Feature
    @Binds
    Mapper<InternalNotification, SnackbarDescription> bindNotificationToSnackbarMapper(NotificationToSnackbarMapper notificationToSnackbarMapper);
}
