package com.ifriend.data.repository.chat.messages.mappers;

import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageMetaRemote;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageRemote;
import com.ifriend.data.repository.chat.messages.mappers.images.ChatImageUrlMapper;
import com.ifriend.domain.data.SuspendMapper;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatUserImageContentMessageMapper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/data/repository/chat/messages/mappers/ChatUserImageContentMessageMapper;", "Lcom/ifriend/domain/data/SuspendMapper;", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemote;", "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Image;", "chatImageUrlMapper", "Lcom/ifriend/data/repository/chat/messages/mappers/images/ChatImageUrlMapper;", "(Lcom/ifriend/data/repository/chat/messages/mappers/images/ChatImageUrlMapper;)V", "map", "from", "(Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatUserImageContentMessageMapper implements SuspendMapper<ChatMessageRemote, MessageContent.Image> {
    private final ChatImageUrlMapper chatImageUrlMapper;

    @Inject
    public ChatUserImageContentMessageMapper(ChatImageUrlMapper chatImageUrlMapper) {
        Intrinsics.checkNotNullParameter(chatImageUrlMapper, "chatImageUrlMapper");
        this.chatImageUrlMapper = chatImageUrlMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // com.ifriend.domain.data.SuspendMapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object map(ChatMessageRemote chatMessageRemote, Continuation<? super MessageContent.Image> continuation) {
        ChatUserImageContentMessageMapper$map$1 chatUserImageContentMessageMapper$map$1;
        int i;
        String reference;
        if (continuation instanceof ChatUserImageContentMessageMapper$map$1) {
            chatUserImageContentMessageMapper$map$1 = (ChatUserImageContentMessageMapper$map$1) continuation;
            if ((chatUserImageContentMessageMapper$map$1.label & Integer.MIN_VALUE) != 0) {
                chatUserImageContentMessageMapper$map$1.label -= Integer.MIN_VALUE;
                Object obj = chatUserImageContentMessageMapper$map$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatUserImageContentMessageMapper$map$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatMessageMetaRemote meta = chatMessageRemote.getMeta();
                    if (meta == null || (reference = meta.getReference()) == null) {
                        return null;
                    }
                    ChatImageUrlMapper chatImageUrlMapper = this.chatImageUrlMapper;
                    chatUserImageContentMessageMapper$map$1.label = 1;
                    obj = chatImageUrlMapper.map(reference, chatUserImageContentMessageMapper$map$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return new MessageContent.Image((String) obj, null);
            }
        }
        chatUserImageContentMessageMapper$map$1 = new ChatUserImageContentMessageMapper$map$1(this, continuation);
        Object obj2 = chatUserImageContentMessageMapper$map$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatUserImageContentMessageMapper$map$1.label;
        if (i != 0) {
        }
        return new MessageContent.Image((String) obj2, null);
    }
}
