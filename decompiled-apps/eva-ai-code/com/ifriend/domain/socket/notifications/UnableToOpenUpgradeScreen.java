package com.ifriend.domain.socket.notifications;

import com.ifriend.internal_notifications.notification.HandlingStrategy;
import com.ifriend.internal_notifications.notification.InternalNotification;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: UnableToOpenUpgradeScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/domain/socket/notifications/UnableToOpenUpgradeScreen;", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnableToOpenUpgradeScreen extends InternalNotification {
    public UnableToOpenUpgradeScreen() {
        super(new HandlingStrategy.FireAndForged(0, 1L, 1, null));
    }
}
