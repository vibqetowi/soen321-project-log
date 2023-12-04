package com.ifriend.data.repository.chat.messages.mappers;

import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageMetaRemote;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageRemote;
import com.ifriend.data.repository.chat.messages.mappers.images.ChatImageUrlMapper;
import com.ifriend.data.storages.config.AppConfigStorage;
import com.ifriend.domain.data.SuspendMapper;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatImageContentMessageMapper.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/data/repository/chat/messages/mappers/ChatImageContentMessageMapper;", "Lcom/ifriend/domain/data/SuspendMapper;", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemote;", "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Image;", "chatImageUrlMapper", "Lcom/ifriend/data/repository/chat/messages/mappers/images/ChatImageUrlMapper;", "appConfigStorage", "Lcom/ifriend/data/storages/config/AppConfigStorage;", "(Lcom/ifriend/data/repository/chat/messages/mappers/images/ChatImageUrlMapper;Lcom/ifriend/data/storages/config/AppConfigStorage;)V", "map", "from", "(Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatImageContentMessageMapper implements SuspendMapper<ChatMessageRemote, MessageContent.Image> {
    private final AppConfigStorage appConfigStorage;
    private final ChatImageUrlMapper chatImageUrlMapper;

    @Inject
    public ChatImageContentMessageMapper(ChatImageUrlMapper chatImageUrlMapper, AppConfigStorage appConfigStorage) {
        Intrinsics.checkNotNullParameter(chatImageUrlMapper, "chatImageUrlMapper");
        Intrinsics.checkNotNullParameter(appConfigStorage, "appConfigStorage");
        this.chatImageUrlMapper = chatImageUrlMapper;
        this.appConfigStorage = appConfigStorage;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    @Override // com.ifriend.domain.data.SuspendMapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object map(ChatMessageRemote chatMessageRemote, Continuation<? super MessageContent.Image> continuation) {
        ChatImageContentMessageMapper$map$1 chatImageContentMessageMapper$map$1;
        int i;
        String reference;
        ChatImageContentMessageMapper chatImageContentMessageMapper;
        if (continuation instanceof ChatImageContentMessageMapper$map$1) {
            chatImageContentMessageMapper$map$1 = (ChatImageContentMessageMapper$map$1) continuation;
            if ((chatImageContentMessageMapper$map$1.label & Integer.MIN_VALUE) != 0) {
                chatImageContentMessageMapper$map$1.label -= Integer.MIN_VALUE;
                Object obj = chatImageContentMessageMapper$map$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatImageContentMessageMapper$map$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatMessageMetaRemote meta = chatMessageRemote.getMeta();
                    if (meta == null || (reference = meta.getReference()) == null) {
                        return null;
                    }
                    ChatImageUrlMapper chatImageUrlMapper = this.chatImageUrlMapper;
                    chatImageContentMessageMapper$map$1.L$0 = this;
                    chatImageContentMessageMapper$map$1.L$1 = chatMessageRemote;
                    chatImageContentMessageMapper$map$1.label = 1;
                    obj = chatImageUrlMapper.map(reference, chatImageContentMessageMapper$map$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatImageContentMessageMapper = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatMessageRemote = (ChatMessageRemote) chatImageContentMessageMapper$map$1.L$1;
                    chatImageContentMessageMapper = (ChatImageContentMessageMapper) chatImageContentMessageMapper$map$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return new MessageContent.Image((String) obj, chatImageContentMessageMapper.appConfigStorage.getApiUrl() + chatMessageRemote.getMeta().getPreview());
            }
        }
        chatImageContentMessageMapper$map$1 = new ChatImageContentMessageMapper$map$1(this, continuation);
        Object obj2 = chatImageContentMessageMapper$map$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatImageContentMessageMapper$map$1.label;
        if (i != 0) {
        }
        return new MessageContent.Image((String) obj2, chatImageContentMessageMapper.appConfigStorage.getApiUrl() + chatMessageRemote.getMeta().getPreview());
    }
}
