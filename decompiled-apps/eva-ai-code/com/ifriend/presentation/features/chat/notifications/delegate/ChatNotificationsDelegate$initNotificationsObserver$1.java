package com.ifriend.presentation.features.chat.notifications.delegate;

import com.ifriend.domain.models.chat.notifications.ChatNotification;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatNotificationsDelegate.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ifriend/domain/models/chat/notifications/ChatNotification;", "invoke", "(Lcom/ifriend/domain/models/chat/notifications/ChatNotification;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatNotificationsDelegate$initNotificationsObserver$1 extends Lambda implements Function1<ChatNotification, Boolean> {
    public static final ChatNotificationsDelegate$initNotificationsObserver$1 INSTANCE = new ChatNotificationsDelegate$initNotificationsObserver$1();

    ChatNotificationsDelegate$initNotificationsObserver$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ChatNotification it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }
}
