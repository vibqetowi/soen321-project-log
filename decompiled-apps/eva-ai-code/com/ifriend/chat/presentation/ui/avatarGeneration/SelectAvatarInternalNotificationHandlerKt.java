package com.ifriend.chat.presentation.ui.avatarGeneration;

import androidx.lifecycle.Lifecycle;
import com.ifriend.domain.socket.notifications.AvatarsGeneratedNotification;
import com.ifriend.infrastructure.internalNotifications.LifecycledInternalNotificationHandler;
import com.ifriend.internal_notifications.notification.InternalNotification;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SelectAvatarInternalNotificationHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"createInternalNotificationHandler", "Lcom/ifriend/infrastructure/internalNotifications/LifecycledInternalNotificationHandler;", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarFragment;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectAvatarInternalNotificationHandlerKt {
    public static final LifecycledInternalNotificationHandler createInternalNotificationHandler(SelectGeneratedAvatarFragment selectGeneratedAvatarFragment) {
        Intrinsics.checkNotNullParameter(selectGeneratedAvatarFragment, "<this>");
        final Lifecycle lifecycle = selectGeneratedAvatarFragment.getViewLifecycleOwner().getLifecycle();
        return new LifecycledInternalNotificationHandler(lifecycle) { // from class: com.ifriend.chat.presentation.ui.avatarGeneration.SelectAvatarInternalNotificationHandlerKt$createInternalNotificationHandler$1
            @Override // com.ifriend.internal_notifications.handler.InternalNotificationHandler
            public boolean handle(InternalNotification notification) {
                Intrinsics.checkNotNullParameter(notification, "notification");
                return notification instanceof AvatarsGeneratedNotification;
            }
        };
    }
}
