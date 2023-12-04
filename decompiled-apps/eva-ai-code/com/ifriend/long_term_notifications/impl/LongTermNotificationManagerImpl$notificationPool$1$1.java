package com.ifriend.long_term_notifications.impl;

import com.ifriend.domain.notifications.LongTermNotification;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: LongTermNotificationManagerImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "first", "Lcom/ifriend/domain/notifications/LongTermNotification;", "kotlin.jvm.PlatformType", "second", "invoke", "(Lcom/ifriend/domain/notifications/LongTermNotification;Lcom/ifriend/domain/notifications/LongTermNotification;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LongTermNotificationManagerImpl$notificationPool$1$1 extends Lambda implements Function2<LongTermNotification, LongTermNotification, Integer> {
    public static final LongTermNotificationManagerImpl$notificationPool$1$1 INSTANCE = new LongTermNotificationManagerImpl$notificationPool$1$1();

    LongTermNotificationManagerImpl$notificationPool$1$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(LongTermNotification longTermNotification, LongTermNotification longTermNotification2) {
        return Integer.valueOf(longTermNotification.getPriority() - longTermNotification2.getPriority());
    }
}
