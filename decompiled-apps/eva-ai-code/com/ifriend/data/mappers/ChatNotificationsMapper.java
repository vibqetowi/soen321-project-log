package com.ifriend.data.mappers;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.domain.models.chat.notifications.ChatNotification;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import com.ifriend.domain.newChat.chat.models.MessageInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatMappers.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/ifriend/data/mappers/ChatNotificationsMapper;", "", "()V", "map", "Lcom/ifriend/domain/models/chat/notifications/ChatNotification;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "chatId", "", "name", "avatarUrl", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatNotificationsMapper {
    public final ChatNotification map(ChatMessage message, String chatId, String name, String avatarUrl) {
        ChatNotification.Content.Text text;
        ChatNotification.Content.EndCall endCall;
        ChatNotification.Content content;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        if (!ChatMessageKt.isFromBot(message)) {
            throw new IllegalArgumentException("Message for the notification must be from the bot!".toString());
        }
        MessageInfo info = message.getInfo();
        String id = ChatMessageKt.getId(message);
        MessageContent content2 = message.getContent();
        if (!(content2 instanceof MessageContent.Audio)) {
            if (content2 instanceof MessageContent.Image) {
                text = new ChatNotification.Content.Image(((MessageContent.Image) content2).getImage());
            } else if (content2 instanceof MessageContent.Gift) {
                text = new ChatNotification.Content.Image(((MessageContent.Gift) content2).getImageUrl());
            } else if (content2 instanceof MessageContent.EndCall) {
                endCall = ChatNotification.Content.EndCall.INSTANCE;
            } else if (!(content2 instanceof MessageContent.Text)) {
                throw new NoWhenBranchMatchedException();
            } else {
                text = new ChatNotification.Content.Text(((MessageContent.Text) content2).getText());
            }
            content = text;
            return new ChatNotification(id, chatId, name, content, avatarUrl, info);
        }
        endCall = ChatNotification.Content.Audio.INSTANCE;
        content = endCall;
        return new ChatNotification(id, chatId, name, content, avatarUrl, info);
    }
}
