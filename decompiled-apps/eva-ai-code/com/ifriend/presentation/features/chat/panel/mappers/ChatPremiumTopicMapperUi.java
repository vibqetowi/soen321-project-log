package com.ifriend.presentation.features.chat.panel.mappers;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ifriend.domain.logic.topics.models.ChatPremiumTopic;
import com.ifriend.presentation.features.chat.panel.models.ChatPremiumTopicUi;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatPremiumTopicMapperUi.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/presentation/features/chat/panel/mappers/ChatPremiumTopicMapperUi;", "", "topicIconMapperUi", "Lcom/ifriend/presentation/features/chat/panel/mappers/TopicIconMapperUi;", "(Lcom/ifriend/presentation/features/chat/panel/mappers/TopicIconMapperUi;)V", "map", "Lcom/ifriend/presentation/features/chat/panel/models/ChatPremiumTopicUi;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/ifriend/domain/logic/topics/models/ChatPremiumTopic;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPremiumTopicMapperUi {
    public static final int $stable = 0;
    private final TopicIconMapperUi topicIconMapperUi;

    @Inject
    public ChatPremiumTopicMapperUi(TopicIconMapperUi topicIconMapperUi) {
        Intrinsics.checkNotNullParameter(topicIconMapperUi, "topicIconMapperUi");
        this.topicIconMapperUi = topicIconMapperUi;
    }

    public final ChatPremiumTopicUi map(ChatPremiumTopic model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return new ChatPremiumTopicUi(model.getId(), model.getName(), this.topicIconMapperUi.map(model.getIconName()), false);
    }
}
