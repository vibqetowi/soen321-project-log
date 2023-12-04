package com.ifriend.presentation.features.chat.common.models;

import com.ifriend.domain.newChat.chat.models.MessageIds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MessageIdsParams.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0003"}, d2 = {"toMessageIdsParams", "Lcom/ifriend/presentation/features/chat/common/models/MessageIdsParams;", "Lcom/ifriend/domain/newChat/chat/models/MessageIds;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessageIdsParamsKt {
    public static final MessageIdsParams toMessageIdsParams(MessageIds messageIds) {
        Intrinsics.checkNotNullParameter(messageIds, "<this>");
        return new MessageIdsParams(messageIds.getMessageId(), messageIds.getSenderId(), messageIds.getRecipientId());
    }

    public static final MessageIds toMessageIdsParams(MessageIdsParams messageIdsParams) {
        Intrinsics.checkNotNullParameter(messageIdsParams, "<this>");
        return new MessageIds(messageIdsParams.getMessageId(), messageIdsParams.getSenderId(), messageIdsParams.getRecipientId());
    }
}
