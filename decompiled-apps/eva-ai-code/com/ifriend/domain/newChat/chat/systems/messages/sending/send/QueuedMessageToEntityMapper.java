package com.ifriend.domain.newChat.chat.systems.messages.sending.send;

import com.ifriend.common_entities_engine.Entity;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageAccessType;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import com.ifriend.domain.newChat.chat.models.MessageIds;
import com.ifriend.domain.newChat.chat.models.MessageInfo;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import com.ifriend.domain.newChat.chat.systems.distinct.UniqueComponent;
import com.ifriend.domain.newChat.chat.systems.messages.live.LiveMessageComponent;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue;
import com.ifriend.domain.newChat.chat.systems.messages.sending.showSending.SendingStatusComponent;
import com.ifriend.domain.newChat.chat.systems.sorting.SortComponent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: QueuedMessageToEntityMapper.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/QueuedMessageToEntityMapper;", "", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "(Lcom/ifriend/domain/data/AuthDataProvider;)V", "map", "Lcom/ifriend/common_entities_engine/Entity;", "from", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$QueuedMessage;", "toContent", "Lcom/ifriend/domain/newChat/chat/models/MessageContent;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class QueuedMessageToEntityMapper {
    private final AuthDataProvider authDataProvider;

    public QueuedMessageToEntityMapper(AuthDataProvider authDataProvider) {
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        this.authDataProvider = authDataProvider;
    }

    public final Entity map(SendingMessagesQueue.QueuedMessage from) {
        Intrinsics.checkNotNullParameter(from, "from");
        AuthData value = this.authDataProvider.sessionAuthData().getValue();
        if (value == null) {
            return null;
        }
        String value2 = value.getUserId().getValue();
        String value3 = value.getClientId().getValue();
        long timestamp = from.getTimestamp();
        return new Entity(SetsKt.mutableSetOf(new ChatMessage(new MessageInfo(new MessageIds(from.getId(), value2, value3), from.getTag(), timestamp, true, true, false, null, new MessageInfo.PaymentInfo(false, 0), ChatMessageAccessType.FREE, null, new MessageInfo.Regenerate(false, "")), toContent(from.getMessageToSend())), new SortComponent.RegularMessage(timestamp), new UniqueComponent(from.getTag().getValue()), SendingStatusComponent.INSTANCE, LiveMessageComponent.INSTANCE));
    }

    private final MessageContent toContent(MessageToSend messageToSend) {
        if (messageToSend instanceof MessageToSend.Audio) {
            String uri = ((MessageToSend.Audio) messageToSend).getFile().toURI().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            return new MessageContent.Audio(uri, "", false, 4, null);
        } else if (messageToSend instanceof MessageToSend.Image) {
            String uri2 = ((MessageToSend.Image) messageToSend).getFile().toURI().toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
            return new MessageContent.Image(uri2, null);
        } else if (messageToSend instanceof MessageToSend.Text) {
            return new MessageContent.Text(((MessageToSend.Text) messageToSend).getText());
        } else {
            if (messageToSend instanceof MessageToSend.Gift) {
                return new MessageContent.Gift(((MessageToSend.Gift) messageToSend).getImageUrl());
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
