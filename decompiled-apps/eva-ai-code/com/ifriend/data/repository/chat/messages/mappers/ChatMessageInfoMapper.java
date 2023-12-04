package com.ifriend.data.repository.chat.messages.mappers;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.common_utils.extensions.TimestampKt;
import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatAutomationMessageRemote;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageMetaRemote;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageRemote;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatRankingMessageRemote;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatRegenerationRemote;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatTarifficationRemote;
import com.ifriend.domain.data.SuspendMapper;
import com.ifriend.domain.newChat.chat.models.ChatMessageAccessType;
import com.ifriend.domain.newChat.chat.models.MessageIds;
import com.ifriend.domain.newChat.chat.models.MessageInfo;
import com.ifriend.domain.newChat.chat.models.MessageMeta;
import com.ifriend.domain.newChat.chat.models.MessageTag;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatMessageInfoMapper.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0012H\u0002J\f\u0010\u0013\u001a\u00020\u0014*\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/ifriend/data/repository/chat/messages/mappers/ChatMessageInfoMapper;", "Lcom/ifriend/domain/data/SuspendMapper;", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemote;", "Lcom/ifriend/domain/newChat/chat/models/MessageInfo;", "authLocalDataSource", "Lcom/ifriend/core/local/api/AuthLocalDataSource;", "(Lcom/ifriend/core/local/api/AuthLocalDataSource;)V", "getMessageAccessType", "Lcom/ifriend/domain/newChat/chat/models/ChatMessageAccessType;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "getUnknownMessageAccessType", "tariffication", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatTarifficationRemote;", "map", "from", "(Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTopic", "Lcom/ifriend/domain/newChat/chat/models/MessageMeta$Topic;", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageMetaRemote;", "isSexting", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessageInfoMapper implements SuspendMapper<ChatMessageRemote, MessageInfo> {
    private final AuthLocalDataSource authLocalDataSource;

    @Inject
    public ChatMessageInfoMapper(AuthLocalDataSource authLocalDataSource) {
        Intrinsics.checkNotNullParameter(authLocalDataSource, "authLocalDataSource");
        this.authLocalDataSource = authLocalDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0120  */
    @Override // com.ifriend.domain.data.SuspendMapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object map(ChatMessageRemote chatMessageRemote, Continuation<? super MessageInfo> continuation) {
        ChatMessageInfoMapper$map$1 chatMessageInfoMapper$map$1;
        int i;
        String str;
        ChatMessageRemote chatMessageRemote2;
        ChatMessageInfoMapper chatMessageInfoMapper;
        String str2;
        ChatMessageMetaRemote meta;
        String tag;
        String str3;
        String mediaId;
        String type;
        ChatRegenerationRemote regeneration;
        ChatRegenerationRemote regeneration2;
        ChatTarifficationRemote tariffication;
        ChatTarifficationRemote tariffication2;
        if (continuation instanceof ChatMessageInfoMapper$map$1) {
            chatMessageInfoMapper$map$1 = (ChatMessageInfoMapper$map$1) continuation;
            if ((chatMessageInfoMapper$map$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageInfoMapper$map$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessageInfoMapper$map$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessageInfoMapper$map$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String sender = chatMessageRemote.getSender();
                    AuthLocalDataSource authLocalDataSource = this.authLocalDataSource;
                    chatMessageInfoMapper$map$1.L$0 = this;
                    chatMessageInfoMapper$map$1.L$1 = chatMessageRemote;
                    chatMessageInfoMapper$map$1.L$2 = sender;
                    chatMessageInfoMapper$map$1.label = 1;
                    Object userId = authLocalDataSource.getUserId(chatMessageInfoMapper$map$1);
                    if (userId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = sender;
                    obj = userId;
                    chatMessageRemote2 = chatMessageRemote;
                    chatMessageInfoMapper = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) chatMessageInfoMapper$map$1.L$2;
                    chatMessageRemote2 = (ChatMessageRemote) chatMessageInfoMapper$map$1.L$1;
                    chatMessageInfoMapper = (ChatMessageInfoMapper) chatMessageInfoMapper$map$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                str2 = (String) obj;
                if (str2 == null) {
                    str2 = "";
                }
                boolean areEqual = Intrinsics.areEqual(str, str2);
                meta = chatMessageRemote2.getMeta();
                ChatMessageAccessType messageAccessType = chatMessageInfoMapper.getMessageAccessType(chatMessageRemote2);
                MessageIds messageIds = new MessageIds(String.valueOf(chatMessageRemote2.getId()), chatMessageRemote2.getSender(), chatMessageRemote2.getRecipient());
                tag = chatMessageRemote2.getTag();
                if (tag == null) {
                    tag = String.valueOf(chatMessageRemote2.getId());
                }
                MessageTag messageTag = new MessageTag(tag);
                long normalizeTimestamp = TimestampKt.normalizeTimestamp(chatMessageRemote2.getTimestamp());
                boolean isSexting = chatMessageInfoMapper.isSexting(chatMessageRemote2);
                boolean read = chatMessageRemote2.getRead();
                ChatMessageMetaRemote meta2 = chatMessageRemote2.getMeta();
                str3 = null;
                MessageMeta.Topic fetchTopic = meta2 == null ? chatMessageInfoMapper.fetchTopic(meta2) : null;
                Boolean paid = (meta != null || (tariffication2 = meta.getTariffication()) == null) ? null : tariffication2.getPaid();
                ChatMessageMetaRemote meta3 = chatMessageRemote2.getMeta();
                MessageInfo.PaymentInfo paymentInfo = new MessageInfo.PaymentInfo(paid, ommonKt.orZero((meta3 != null || (tariffication = meta3.getTariffication()) == null) ? null : tariffication.getCost()));
                mediaId = meta == null ? meta.getMediaId() : null;
                if (mediaId == null) {
                    mediaId = "";
                }
                type = meta == null ? meta.getType() : null;
                if (type == null) {
                    type = "";
                }
                MessageInfo.Meta meta4 = new MessageInfo.Meta(mediaId, type);
                boolean orFalse = ommonKt.orFalse((meta != null || (regeneration2 = meta.getRegeneration()) == null) ? null : regeneration2.isAllowed());
                if (meta != null && (regeneration = meta.getRegeneration()) != null) {
                    str3 = regeneration.getOldMessageId();
                }
                return new MessageInfo(messageIds, messageTag, normalizeTimestamp, areEqual, read, isSexting, fetchTopic, paymentInfo, messageAccessType, meta4, new MessageInfo.Regenerate(orFalse, str3 != null ? str3 : ""));
            }
        }
        chatMessageInfoMapper$map$1 = new ChatMessageInfoMapper$map$1(this, continuation);
        Object obj2 = chatMessageInfoMapper$map$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessageInfoMapper$map$1.label;
        if (i != 0) {
        }
        str2 = (String) obj2;
        if (str2 == null) {
        }
        boolean areEqual2 = Intrinsics.areEqual(str, str2);
        meta = chatMessageRemote2.getMeta();
        ChatMessageAccessType messageAccessType2 = chatMessageInfoMapper.getMessageAccessType(chatMessageRemote2);
        MessageIds messageIds2 = new MessageIds(String.valueOf(chatMessageRemote2.getId()), chatMessageRemote2.getSender(), chatMessageRemote2.getRecipient());
        tag = chatMessageRemote2.getTag();
        if (tag == null) {
        }
        MessageTag messageTag2 = new MessageTag(tag);
        long normalizeTimestamp2 = TimestampKt.normalizeTimestamp(chatMessageRemote2.getTimestamp());
        boolean isSexting2 = chatMessageInfoMapper.isSexting(chatMessageRemote2);
        boolean read2 = chatMessageRemote2.getRead();
        ChatMessageMetaRemote meta22 = chatMessageRemote2.getMeta();
        str3 = null;
        if (meta22 == null) {
        }
        if (meta != null) {
        }
        ChatMessageMetaRemote meta32 = chatMessageRemote2.getMeta();
        MessageInfo.PaymentInfo paymentInfo2 = new MessageInfo.PaymentInfo(paid, ommonKt.orZero((meta32 != null || (tariffication = meta32.getTariffication()) == null) ? null : tariffication.getCost()));
        if (meta == null) {
        }
        if (mediaId == null) {
        }
        if (meta == null) {
        }
        if (type == null) {
        }
        MessageInfo.Meta meta42 = new MessageInfo.Meta(mediaId, type);
        boolean orFalse2 = ommonKt.orFalse((meta != null || (regeneration2 = meta.getRegeneration()) == null) ? null : regeneration2.isAllowed());
        if (meta != null) {
            str3 = regeneration.getOldMessageId();
        }
        return new MessageInfo(messageIds2, messageTag2, normalizeTimestamp2, areEqual2, read2, isSexting2, fetchTopic, paymentInfo2, messageAccessType2, meta42, new MessageInfo.Regenerate(orFalse2, str3 != null ? str3 : ""));
    }

    private final boolean isSexting(ChatMessageRemote chatMessageRemote) {
        ChatRankingMessageRemote ranking;
        List<String> labels;
        ChatMessageMetaRemote meta = chatMessageRemote.getMeta();
        return (meta == null || (ranking = meta.getRanking()) == null || (labels = ranking.getLabels()) == null || !labels.contains("sexting")) ? false : true;
    }

    private final MessageMeta.Topic fetchTopic(ChatMessageMetaRemote chatMessageMetaRemote) {
        String topicId;
        String topicName;
        ChatAutomationMessageRemote automation = chatMessageMetaRemote.getAutomation();
        if (automation == null || (topicId = automation.getTopicId()) == null || (topicName = chatMessageMetaRemote.getAutomation().getTopicName()) == null) {
            return null;
        }
        return new MessageMeta.Topic(topicId, topicName);
    }

    private final ChatMessageAccessType getMessageAccessType(ChatMessageRemote chatMessageRemote) {
        ChatTarifficationRemote tariffication;
        ChatMessageMetaRemote meta = chatMessageRemote.getMeta();
        String type = (meta == null || (tariffication = meta.getTariffication()) == null) ? null : tariffication.getType();
        if (type == null) {
            type = "";
        }
        ChatMessageAccessType from = ChatMessageAccessType.Companion.from(type);
        if (from != ChatMessageAccessType.UNKNOWN) {
            return from;
        }
        ChatMessageMetaRemote meta2 = chatMessageRemote.getMeta();
        return getUnknownMessageAccessType(meta2 != null ? meta2.getTariffication() : null);
    }

    private final ChatMessageAccessType getUnknownMessageAccessType(ChatTarifficationRemote chatTarifficationRemote) {
        boolean orFalse = ommonKt.orFalse(chatTarifficationRemote != null ? chatTarifficationRemote.getPaid() : null);
        int orZero = ommonKt.orZero(chatTarifficationRemote != null ? chatTarifficationRemote.getCost() : null);
        if (orFalse) {
            return ChatMessageAccessType.PURCHASE;
        }
        if (!orFalse && orZero > 0) {
            return ChatMessageAccessType.PURCHASE;
        }
        return ChatMessageAccessType.SUBSCRIPTION;
    }
}
