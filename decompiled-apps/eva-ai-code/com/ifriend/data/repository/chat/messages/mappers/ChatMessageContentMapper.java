package com.ifriend.data.repository.chat.messages.mappers;

import com.ifriend.data.networking.datasources.chat.models.response.client.ChatAutomationMessageRemote;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageMetaRemote;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageRemote;
import com.ifriend.data.repository.chat.messages.contenttypes.ChatMessageType;
import com.ifriend.data.repository.chat.messages.contenttypes.ContentReference;
import com.ifriend.data.repository.chat.messages.contenttypes.ContentReferenceKt;
import com.ifriend.data.repository.chat.messages.contenttypes.ContentReferenceType;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: ChatMessageContentMapper.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/ifriend/data/repository/chat/messages/mappers/ChatMessageContentMapper;", "", "audioMapper", "Lcom/ifriend/data/repository/chat/messages/mappers/ChatAudioContentMessageMapper;", "imageMapper", "Lcom/ifriend/data/repository/chat/messages/mappers/ChatImageContentMessageMapper;", "userImageMapper", "Lcom/ifriend/data/repository/chat/messages/mappers/ChatUserImageContentMessageMapper;", "textMapper", "Lcom/ifriend/data/repository/chat/messages/mappers/ChatTextContentMessageMapper;", "giftMapper", "Lcom/ifriend/data/repository/chat/messages/mappers/ChatGiftContentMessageMapper;", "(Lcom/ifriend/data/repository/chat/messages/mappers/ChatAudioContentMessageMapper;Lcom/ifriend/data/repository/chat/messages/mappers/ChatImageContentMessageMapper;Lcom/ifriend/data/repository/chat/messages/mappers/ChatUserImageContentMessageMapper;Lcom/ifriend/data/repository/chat/messages/mappers/ChatTextContentMessageMapper;Lcom/ifriend/data/repository/chat/messages/mappers/ChatGiftContentMessageMapper;)V", "map", "Lcom/ifriend/domain/newChat/chat/models/MessageContent;", "from", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemote;", "isFromUser", "", "(Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemote;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessageContentMapper {
    private final ChatAudioContentMessageMapper audioMapper;
    private final ChatGiftContentMessageMapper giftMapper;
    private final ChatImageContentMessageMapper imageMapper;
    private final ChatTextContentMessageMapper textMapper;
    private final ChatUserImageContentMessageMapper userImageMapper;

    @Inject
    public ChatMessageContentMapper(ChatAudioContentMessageMapper audioMapper, ChatImageContentMessageMapper imageMapper, ChatUserImageContentMessageMapper userImageMapper, ChatTextContentMessageMapper textMapper, ChatGiftContentMessageMapper giftMapper) {
        Intrinsics.checkNotNullParameter(audioMapper, "audioMapper");
        Intrinsics.checkNotNullParameter(imageMapper, "imageMapper");
        Intrinsics.checkNotNullParameter(userImageMapper, "userImageMapper");
        Intrinsics.checkNotNullParameter(textMapper, "textMapper");
        Intrinsics.checkNotNullParameter(giftMapper, "giftMapper");
        this.audioMapper = audioMapper;
        this.imageMapper = imageMapper;
        this.userImageMapper = userImageMapper;
        this.textMapper = textMapper;
        this.giftMapper = giftMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object map(ChatMessageRemote chatMessageRemote, boolean z, Continuation<? super MessageContent> continuation) {
        ChatMessageContentMapper$map$1 chatMessageContentMapper$map$1;
        int i;
        ContentReferenceType contentReferenceType;
        MessageContent.Audio audio;
        ChatMessageContentMapper chatMessageContentMapper;
        ChatAutomationMessageRemote automation;
        String type;
        ChatMessageRemote chatMessageRemote2 = chatMessageRemote;
        if (continuation instanceof ChatMessageContentMapper$map$1) {
            chatMessageContentMapper$map$1 = (ChatMessageContentMapper$map$1) continuation;
            if ((chatMessageContentMapper$map$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageContentMapper$map$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessageContentMapper$map$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessageContentMapper$map$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ContentReference contentReference = ContentReferenceKt.getContentReference(chatMessageRemote);
                    if (contentReference == null || (type = contentReference.getType()) == null || (contentReferenceType = ContentReferenceType.Companion.from(type)) == null) {
                        ChatMessageMetaRemote meta = chatMessageRemote.getMeta();
                        if (meta != null ? Intrinsics.areEqual(meta.getHasAudio(), Boxing.boxBoolean(true)) : false) {
                            contentReferenceType = ContentReferenceType.AUDIO;
                        } else {
                            contentReferenceType = ContentReferenceType.UNKNOWN;
                        }
                    }
                    audio = null;
                    String content = contentReference != null ? contentReference.getContent() : null;
                    if (content == null) {
                        content = "";
                    }
                    ChatMessageType.Companion companion = ChatMessageType.Companion;
                    ChatMessageMetaRemote meta2 = chatMessageRemote.getMeta();
                    String product = (meta2 == null || (automation = meta2.getAutomation()) == null) ? null : automation.getProduct();
                    if (product == null) {
                        product = "";
                    }
                    ChatMessageType from = companion.from(product);
                    ChatMessageType.Companion companion2 = ChatMessageType.Companion;
                    ChatMessageMetaRemote meta3 = chatMessageRemote.getMeta();
                    String type2 = meta3 != null ? meta3.getType() : null;
                    if (companion2.from(type2 != null ? type2 : "") == ChatMessageType.CALL) {
                        audio = MessageContent.EndCall.INSTANCE;
                    } else if (contentReferenceType.isAudio()) {
                        audio = this.audioMapper.map(chatMessageRemote2, contentReferenceType.isPremium());
                    } else if (contentReferenceType.isImage() && from == ChatMessageType.GIFT_RESPONSE) {
                        ChatGiftContentMessageMapper chatGiftContentMessageMapper = this.giftMapper;
                        chatMessageContentMapper$map$1.L$0 = this;
                        chatMessageContentMapper$map$1.L$1 = chatMessageRemote2;
                        chatMessageContentMapper$map$1.label = 1;
                        obj = chatGiftContentMessageMapper.map(chatMessageRemote2, (Continuation<? super MessageContent.Gift>) chatMessageContentMapper$map$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatMessageContentMapper = this;
                        audio = (MessageContent) obj;
                    } else if (contentReferenceType.isImage() && z) {
                        ChatUserImageContentMessageMapper chatUserImageContentMessageMapper = this.userImageMapper;
                        chatMessageContentMapper$map$1.L$0 = this;
                        chatMessageContentMapper$map$1.L$1 = chatMessageRemote2;
                        chatMessageContentMapper$map$1.label = 2;
                        obj = chatUserImageContentMessageMapper.map(chatMessageRemote2, (Continuation<? super MessageContent.Image>) chatMessageContentMapper$map$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatMessageContentMapper = this;
                        audio = (MessageContent) obj;
                    } else if (contentReferenceType.isImage()) {
                        ChatImageContentMessageMapper chatImageContentMessageMapper = this.imageMapper;
                        chatMessageContentMapper$map$1.L$0 = this;
                        chatMessageContentMapper$map$1.L$1 = chatMessageRemote2;
                        chatMessageContentMapper$map$1.label = 3;
                        obj = chatImageContentMessageMapper.map(chatMessageRemote2, (Continuation<? super MessageContent.Image>) chatMessageContentMapper$map$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatMessageContentMapper = this;
                        audio = (MessageContent) obj;
                    } else if (StringsKt.contains$default((CharSequence) content, (CharSequence) ContentReferenceType.GIFT.getType(), false, 2, (Object) null)) {
                        ChatGiftContentMessageMapper chatGiftContentMessageMapper2 = this.giftMapper;
                        chatMessageContentMapper$map$1.L$0 = this;
                        chatMessageContentMapper$map$1.L$1 = chatMessageRemote2;
                        chatMessageContentMapper$map$1.label = 4;
                        obj = chatGiftContentMessageMapper2.map(chatMessageRemote2, (Continuation<? super MessageContent.Gift>) chatMessageContentMapper$map$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatMessageContentMapper = this;
                        audio = (MessageContent) obj;
                    }
                    chatMessageContentMapper = this;
                } else if (i == 1) {
                    chatMessageRemote2 = (ChatMessageRemote) chatMessageContentMapper$map$1.L$1;
                    chatMessageContentMapper = (ChatMessageContentMapper) chatMessageContentMapper$map$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    audio = (MessageContent) obj;
                } else if (i == 2) {
                    chatMessageRemote2 = (ChatMessageRemote) chatMessageContentMapper$map$1.L$1;
                    chatMessageContentMapper = (ChatMessageContentMapper) chatMessageContentMapper$map$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    audio = (MessageContent) obj;
                } else if (i == 3) {
                    chatMessageRemote2 = (ChatMessageRemote) chatMessageContentMapper$map$1.L$1;
                    chatMessageContentMapper = (ChatMessageContentMapper) chatMessageContentMapper$map$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    audio = (MessageContent) obj;
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatMessageRemote2 = (ChatMessageRemote) chatMessageContentMapper$map$1.L$1;
                    chatMessageContentMapper = (ChatMessageContentMapper) chatMessageContentMapper$map$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    audio = (MessageContent) obj;
                }
                return audio != null ? chatMessageContentMapper.textMapper.map(chatMessageRemote2) : audio;
            }
        }
        chatMessageContentMapper$map$1 = new ChatMessageContentMapper$map$1(this, continuation);
        Object obj2 = chatMessageContentMapper$map$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessageContentMapper$map$1.label;
        if (i != 0) {
        }
        if (audio != null) {
        }
    }
}
