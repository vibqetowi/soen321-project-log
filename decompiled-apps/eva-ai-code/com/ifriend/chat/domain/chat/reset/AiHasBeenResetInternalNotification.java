package com.ifriend.chat.domain.chat.reset;

import com.ifriend.internal_notifications.notification.HandlingStrategy;
import com.ifriend.internal_notifications.notification.InternalNotification;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AiHasBeenResetInternalNotification.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/domain/chat/reset/AiHasBeenResetInternalNotification;", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "botName", "", "(Ljava/lang/String;)V", "getBotName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AiHasBeenResetInternalNotification extends InternalNotification {
    private final String botName;

    public final String getBotName() {
        return this.botName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiHasBeenResetInternalNotification(String botName) {
        super(new HandlingStrategy.WaitUntilHandledWithTTL(0, 0L, 3, null));
        Intrinsics.checkNotNullParameter(botName, "botName");
        this.botName = botName;
    }
}
