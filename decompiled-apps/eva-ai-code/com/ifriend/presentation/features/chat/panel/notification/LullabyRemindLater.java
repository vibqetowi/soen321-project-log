package com.ifriend.presentation.features.chat.panel.notification;

import com.ifriend.internal_notifications.notification.HandlingStrategy;
import com.ifriend.internal_notifications.notification.InternalNotification;
import kotlin.Metadata;
/* compiled from: LullabyRemindLater.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/presentation/features/chat/panel/notification/LullabyRemindLater;", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "()V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LullabyRemindLater extends InternalNotification {
    public static final int $stable = 0;
    public static final LullabyRemindLater INSTANCE = new LullabyRemindLater();

    private LullabyRemindLater() {
        super(new HandlingStrategy.FireAndForged(0, 0L, 3, null));
    }
}
