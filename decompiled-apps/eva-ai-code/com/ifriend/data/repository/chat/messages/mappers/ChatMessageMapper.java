package com.ifriend.data.repository.chat.messages.mappers;

import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageRemote;
import com.ifriend.domain.data.SuspendMapper;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import com.ifriend.domain.newChat.chat.models.MessageInfo;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatMessageMapper.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/data/repository/chat/messages/mappers/ChatMessageMapper;", "Lcom/ifriend/domain/data/SuspendMapper;", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemote;", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "infoMapper", "Lcom/ifriend/data/repository/chat/messages/mappers/ChatMessageInfoMapper;", "contentMapper", "Lcom/ifriend/data/repository/chat/messages/mappers/ChatMessageContentMapper;", "(Lcom/ifriend/data/repository/chat/messages/mappers/ChatMessageInfoMapper;Lcom/ifriend/data/repository/chat/messages/mappers/ChatMessageContentMapper;)V", "map", "from", "(Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessageMapper implements SuspendMapper<ChatMessageRemote, ChatMessage> {
    private final ChatMessageContentMapper contentMapper;
    private final ChatMessageInfoMapper infoMapper;

    @Inject
    public ChatMessageMapper(ChatMessageInfoMapper infoMapper, ChatMessageContentMapper contentMapper) {
        Intrinsics.checkNotNullParameter(infoMapper, "infoMapper");
        Intrinsics.checkNotNullParameter(contentMapper, "contentMapper");
        this.infoMapper = infoMapper;
        this.contentMapper = contentMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // com.ifriend.domain.data.SuspendMapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object map(ChatMessageRemote chatMessageRemote, Continuation<? super ChatMessage> continuation) {
        ChatMessageMapper$map$1 chatMessageMapper$map$1;
        Object coroutine_suspended;
        int i;
        ChatMessageMapper chatMessageMapper;
        Object map;
        MessageInfo messageInfo;
        if (continuation instanceof ChatMessageMapper$map$1) {
            chatMessageMapper$map$1 = (ChatMessageMapper$map$1) continuation;
            if ((chatMessageMapper$map$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageMapper$map$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessageMapper$map$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessageMapper$map$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatMessageInfoMapper chatMessageInfoMapper = this.infoMapper;
                    chatMessageMapper$map$1.L$0 = this;
                    chatMessageMapper$map$1.L$1 = chatMessageRemote;
                    chatMessageMapper$map$1.label = 1;
                    obj = chatMessageInfoMapper.map(chatMessageRemote, (Continuation<? super MessageInfo>) chatMessageMapper$map$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatMessageMapper = this;
                } else if (i != 1) {
                    if (i == 2) {
                        messageInfo = (MessageInfo) chatMessageMapper$map$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        return new ChatMessage(messageInfo, (MessageContent) obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatMessageRemote = (ChatMessageRemote) chatMessageMapper$map$1.L$1;
                    chatMessageMapper = (ChatMessageMapper) chatMessageMapper$map$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                MessageInfo messageInfo2 = (MessageInfo) obj;
                ChatMessageContentMapper chatMessageContentMapper = chatMessageMapper.contentMapper;
                boolean isFromUser = messageInfo2.isFromUser();
                chatMessageMapper$map$1.L$0 = messageInfo2;
                chatMessageMapper$map$1.L$1 = null;
                chatMessageMapper$map$1.label = 2;
                map = chatMessageContentMapper.map(chatMessageRemote, isFromUser, chatMessageMapper$map$1);
                if (map != coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = map;
                messageInfo = messageInfo2;
                return new ChatMessage(messageInfo, (MessageContent) obj);
            }
        }
        chatMessageMapper$map$1 = new ChatMessageMapper$map$1(this, continuation);
        Object obj2 = chatMessageMapper$map$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessageMapper$map$1.label;
        if (i != 0) {
        }
        MessageInfo messageInfo22 = (MessageInfo) obj2;
        ChatMessageContentMapper chatMessageContentMapper2 = chatMessageMapper.contentMapper;
        boolean isFromUser2 = messageInfo22.isFromUser();
        chatMessageMapper$map$1.L$0 = messageInfo22;
        chatMessageMapper$map$1.L$1 = null;
        chatMessageMapper$map$1.label = 2;
        map = chatMessageContentMapper2.map(chatMessageRemote, isFromUser2, chatMessageMapper$map$1);
        if (map != coroutine_suspended) {
        }
    }
}
