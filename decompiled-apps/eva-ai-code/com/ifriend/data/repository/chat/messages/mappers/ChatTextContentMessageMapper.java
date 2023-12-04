package com.ifriend.data.repository.chat.messages.mappers;

import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageRemote;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatTextContentMessageMapper.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/repository/chat/messages/mappers/ChatTextContentMessageMapper;", "", "()V", "map", "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Text;", "from", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemote;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatTextContentMessageMapper {
    public final MessageContent.Text map(ChatMessageRemote from) {
        Intrinsics.checkNotNullParameter(from, "from");
        return new MessageContent.Text(from.getText());
    }
}
