package com.ifriend.internal_notifications.handler;

import com.ifriend.internal_notifications.handler.ComposedInternalNotificationHandler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: ComposedInternalNotificationHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ifriend/internal_notifications/handler/ComposedInternalNotificationHandler$QueuedNotification;", "kotlin.jvm.PlatformType", "invoke", "(Lcom/ifriend/internal_notifications/handler/ComposedInternalNotificationHandler$QueuedNotification;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ComposedInternalNotificationHandler$cancelReadyToDisposeNotifications$1 extends Lambda implements Function1<ComposedInternalNotificationHandler.QueuedNotification, Boolean> {
    public static final ComposedInternalNotificationHandler$cancelReadyToDisposeNotifications$1 INSTANCE = new ComposedInternalNotificationHandler$cancelReadyToDisposeNotifications$1();

    ComposedInternalNotificationHandler$cancelReadyToDisposeNotifications$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ComposedInternalNotificationHandler.QueuedNotification queuedNotification) {
        long ttlInMillis = queuedNotification.getNotification().getHandlingStrategy().getTtlInMillis();
        boolean z = false;
        if (ttlInMillis != 0) {
            if (System.currentTimeMillis() > queuedNotification.getTimestamp() + ttlInMillis) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
