package com.ifriend.internal_notifications.notification;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InternalNotification.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/internal_notifications/notification/InternalNotification;", "", "handlingStrategy", "Lcom/ifriend/internal_notifications/notification/HandlingStrategy;", "(Lcom/ifriend/internal_notifications/notification/HandlingStrategy;)V", "getHandlingStrategy", "()Lcom/ifriend/internal_notifications/notification/HandlingStrategy;", "internal_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class InternalNotification {
    private final HandlingStrategy handlingStrategy;

    public InternalNotification(HandlingStrategy handlingStrategy) {
        Intrinsics.checkNotNullParameter(handlingStrategy, "handlingStrategy");
        this.handlingStrategy = handlingStrategy;
    }

    public final HandlingStrategy getHandlingStrategy() {
        return this.handlingStrategy;
    }
}
