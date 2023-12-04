package com.ifriend.chat.new_chat.list.mapper;

import com.ifriend.chat.new_chat.list.ui.model.ThemedTopicSeparatorUiModel;
import com.ifriend.chat.new_chat.list.ui.model.TopicSeparatorUiModel;
import com.ifriend.domain.newChat.chat.systems.messages.topics.TopicComponent;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatEntityToTopicSeparatorUiModelMapper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToTopicSeparatorUiModelMapper;", "", "()V", "map", "Lcom/ifriend/chat/new_chat/list/ui/model/ThemedTopicSeparatorUiModel;", "topicComponent", "Lcom/ifriend/domain/newChat/chat/systems/messages/topics/TopicComponent;", "Companion", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatEntityToTopicSeparatorUiModelMapper {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final String NAME_PREMIUM_TOPIC = "lullaby";

    /* compiled from: ChatEntityToTopicSeparatorUiModelMapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToTopicSeparatorUiModelMapper$Companion;", "", "()V", "NAME_PREMIUM_TOPIC", "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final ThemedTopicSeparatorUiModel map(TopicComponent topicComponent) {
        Intrinsics.checkNotNullParameter(topicComponent, "topicComponent");
        TopicSeparatorUiModel topicSeparatorUiModel = new TopicSeparatorUiModel(topicComponent.getName(), topicComponent.getTimestamp());
        String lowerCase = topicComponent.getName().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (Intrinsics.areEqual(lowerCase, NAME_PREMIUM_TOPIC)) {
            return new ThemedTopicSeparatorUiModel.Premium(topicSeparatorUiModel);
        }
        return new ThemedTopicSeparatorUiModel.Dark(topicSeparatorUiModel);
    }
}
