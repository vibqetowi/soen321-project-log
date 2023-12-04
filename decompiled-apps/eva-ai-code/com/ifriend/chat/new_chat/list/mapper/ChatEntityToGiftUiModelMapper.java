package com.ifriend.chat.new_chat.list.mapper;

import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.chat.new_chat.list.presentationSystems.levels.ExperienceMessageAnimationComponent;
import com.ifriend.chat.new_chat.list.ui.model.ChatPhotoBotMessageUi;
import com.ifriend.chat.new_chat.list.ui.model.GiftUserMessageUiModel;
import com.ifriend.chat.new_chat.list.ui.model.TagHolder;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
/* compiled from: ChatEntityToGiftUiModelMapper.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToGiftUiModelMapper;", "", "()V", "mapItem", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", FirebaseAnalytics.Param.CONTENT, "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Gift;", "entity", "Lcom/ifriend/common_entities_engine/Entity;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatEntityToGiftUiModelMapper {
    public static final int $stable = 0;

    public final TagHolder mapItem(ChatMessage message, MessageContent.Gift content, Entity entity) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(entity, "entity");
        ExperienceMessageAnimationComponent experienceMessageAnimationComponent = (ExperienceMessageAnimationComponent) entity.get(Reflection.getOrCreateKotlinClass(ExperienceMessageAnimationComponent.class));
        if (ChatMessageKt.isFromUser(message)) {
            return new GiftUserMessageUiModel(ChatMessageKt.getTag(message), content.getImageUrl(), experienceMessageAnimationComponent != null ? Integer.valueOf(experienceMessageAnimationComponent.getExperienceChange()) : null, message);
        }
        return new ChatPhotoBotMessageUi(ChatMessageKt.getTag(message), ChatMessageKt.getId(message), content.getImageUrl(), content.getImageUrl(), "", false);
    }
}
