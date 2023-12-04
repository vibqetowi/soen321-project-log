package com.ifriend.chat.new_chat.list.mapper;

import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.chat.new_chat.list.ui.model.ChatPhotoBotMessageUi;
import com.ifriend.chat.new_chat.list.ui.model.ChatPhotoMessageUi;
import com.ifriend.chat.new_chat.list.ui.model.ChatPhotoUserMessageUi;
import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAvailableState;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import com.ifriend.domain.newChat.chat.models.MessageInfo;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatPhotoMessageMapper.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/chat/new_chat/list/mapper/ChatPhotoMessageMapper;", "", "messageAccessInteractor", "Lcom/ifriend/domain/logic/chat/messages/ChatMessageAccessInteractor;", "(Lcom/ifriend/domain/logic/chat/messages/ChatMessageAccessInteractor;)V", "map", "Lcom/ifriend/chat/new_chat/list/ui/model/ChatPhotoMessageUi;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", FirebaseAnalytics.Param.CONTENT, "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Image;", "chatInfo", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPhotoMessageMapper {
    public static final int $stable = 8;
    private final ChatMessageAccessInteractor messageAccessInteractor;

    @Inject
    public ChatPhotoMessageMapper(ChatMessageAccessInteractor messageAccessInteractor) {
        Intrinsics.checkNotNullParameter(messageAccessInteractor, "messageAccessInteractor");
        this.messageAccessInteractor = messageAccessInteractor;
    }

    public final ChatPhotoMessageUi map(ChatMessage message, MessageContent.Image content, ChatInfo chatInfo) {
        String lockedImageUrl;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(chatInfo, "chatInfo");
        boolean isFromUser = message.getInfo().isFromUser();
        String messageId = message.getInfo().getIds().getMessageId();
        if (isFromUser) {
            return new ChatPhotoUserMessageUi(ChatMessageKt.getTag(message), messageId, content.getImage(), content.getImage());
        }
        MessageInfo.PaymentInfo paymentInfo = message.getInfo().getPaymentInfo();
        int orZero = ommonKt.orZero(paymentInfo != null ? Integer.valueOf(paymentInfo.getCost()) : null);
        String valueOf = orZero > 0 ? String.valueOf(orZero) : "";
        ChatMessageAvailableState messageAvailableState = this.messageAccessInteractor.getMessageAvailableState(message.getInfo(), chatInfo);
        if (messageAvailableState.isAvailable()) {
            lockedImageUrl = content.getImage();
        } else {
            lockedImageUrl = content.getLockedImageUrl();
            if (lockedImageUrl == null) {
                lockedImageUrl = content.getImage();
            }
        }
        return new ChatPhotoBotMessageUi(ChatMessageKt.getTag(message), messageId, lockedImageUrl, content.getImage(), valueOf, (messageAvailableState.isAvailable() || messageAvailableState.isNeedSubscription()) ? false : messageAvailableState.isNeedPayForMessage());
    }
}
