package com.ifriend.domain.data.notifications;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.domain.models.chat.notifications.ChatNotification;
import com.ifriend.domain.socket.MessagesSourceMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatNotificationsRepository.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/domain/data/notifications/ChatNotificationsRepository;", "", "emitNew", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$Message;", "(Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flowNotifications", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/domain/models/chat/notifications/ChatNotification;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatNotificationsRepository {
    Object emitNew(MessagesSourceMessage.Chat.Message message, Continuation<? super Unit> continuation);

    Flow<ChatNotification> flowNotifications();
}
