package com.ifriend.data.socket.mapper;

import com.ifriend.data.socket.mapper.chat.JsonToChatCallMessageMapper;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.models.TagOfUser;
import com.ifriend.domain.models.avatar.GeneratedAvatars;
import com.ifriend.domain.socket.MessagesSourceMessage;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class SocketMessageToMessagesSourceMessageMapper_Factory implements Factory<SocketMessageToMessagesSourceMessageMapper> {
    private final Provider<Mapper<JSONObject, MessagesSourceMessage.AddDiaryNotes>> addDiaryNotesMapperProvider;
    private final Provider<Mapper<JSONObject, MessagesSourceMessage.AvatarAnimationGenerated>> avatarAnimationMapperProvider;
    private final Provider<Mapper<JSONObject, MessagesSourceMessage.BotDataChanged>> botDataChangedMapperProvider;
    private final Provider<JsonToChatCallMessageMapper> chatCallMessageMapperProvider;
    private final Provider<JsonToChatMessageMapper> chatItemMessageMapperProvider;
    private final Provider<ChatRegenerateMessageFailedMapper> chatRegenerateMessageFailedMapperProvider;
    private final Provider<ChatRemovedMessageMapper> chatRemovedMessageMapperProvider;
    private final Provider<ChatSubscriptionMapper> chatSubscriptionMapperProvider;
    private final Provider<Mapper<JSONObject, MessagesSourceMessage.DailyNeuronsReceived>> dailyNeuronsReceivedMapperProvider;
    private final Provider<Mapper<JSONObject, GeneratedAvatars>> generatedAvatarsMapperProvider;
    private final Provider<Mapper<JSONObject, MessagesSourceMessage.LevelInfoUpdate>> levelInfoMapperProvider;
    private final Provider<Mapper<JSONObject, MessagesSourceMessage.NeuronesPurchased>> neuronsAddedMapperProvider;
    private final Provider<Mapper<JSONObject, MessagesSourceMessage.NeuronesChanged>> neuronsSpentMapperProvider;
    private final Provider<Mapper<JSONObject, TagOfUser>> tagMapperProvider;

    public SocketMessageToMessagesSourceMessageMapper_Factory(Provider<JsonToChatMessageMapper> provider, Provider<ChatSubscriptionMapper> provider2, Provider<ChatRemovedMessageMapper> provider3, Provider<ChatRegenerateMessageFailedMapper> provider4, Provider<Mapper<JSONObject, TagOfUser>> provider5, Provider<Mapper<JSONObject, MessagesSourceMessage.NeuronesChanged>> provider6, Provider<Mapper<JSONObject, MessagesSourceMessage.DailyNeuronsReceived>> provider7, Provider<Mapper<JSONObject, MessagesSourceMessage.NeuronesPurchased>> provider8, Provider<Mapper<JSONObject, GeneratedAvatars>> provider9, Provider<Mapper<JSONObject, MessagesSourceMessage.AvatarAnimationGenerated>> provider10, Provider<Mapper<JSONObject, MessagesSourceMessage.BotDataChanged>> provider11, Provider<Mapper<JSONObject, MessagesSourceMessage.AddDiaryNotes>> provider12, Provider<Mapper<JSONObject, MessagesSourceMessage.LevelInfoUpdate>> provider13, Provider<JsonToChatCallMessageMapper> provider14) {
        this.chatItemMessageMapperProvider = provider;
        this.chatSubscriptionMapperProvider = provider2;
        this.chatRemovedMessageMapperProvider = provider3;
        this.chatRegenerateMessageFailedMapperProvider = provider4;
        this.tagMapperProvider = provider5;
        this.neuronsSpentMapperProvider = provider6;
        this.dailyNeuronsReceivedMapperProvider = provider7;
        this.neuronsAddedMapperProvider = provider8;
        this.generatedAvatarsMapperProvider = provider9;
        this.avatarAnimationMapperProvider = provider10;
        this.botDataChangedMapperProvider = provider11;
        this.addDiaryNotesMapperProvider = provider12;
        this.levelInfoMapperProvider = provider13;
        this.chatCallMessageMapperProvider = provider14;
    }

    @Override // javax.inject.Provider
    public SocketMessageToMessagesSourceMessageMapper get() {
        return newInstance(this.chatItemMessageMapperProvider.get(), this.chatSubscriptionMapperProvider.get(), this.chatRemovedMessageMapperProvider.get(), this.chatRegenerateMessageFailedMapperProvider.get(), this.tagMapperProvider.get(), this.neuronsSpentMapperProvider.get(), this.dailyNeuronsReceivedMapperProvider.get(), this.neuronsAddedMapperProvider.get(), this.generatedAvatarsMapperProvider.get(), this.avatarAnimationMapperProvider.get(), this.botDataChangedMapperProvider.get(), this.addDiaryNotesMapperProvider.get(), this.levelInfoMapperProvider.get(), this.chatCallMessageMapperProvider.get());
    }

    public static SocketMessageToMessagesSourceMessageMapper_Factory create(Provider<JsonToChatMessageMapper> provider, Provider<ChatSubscriptionMapper> provider2, Provider<ChatRemovedMessageMapper> provider3, Provider<ChatRegenerateMessageFailedMapper> provider4, Provider<Mapper<JSONObject, TagOfUser>> provider5, Provider<Mapper<JSONObject, MessagesSourceMessage.NeuronesChanged>> provider6, Provider<Mapper<JSONObject, MessagesSourceMessage.DailyNeuronsReceived>> provider7, Provider<Mapper<JSONObject, MessagesSourceMessage.NeuronesPurchased>> provider8, Provider<Mapper<JSONObject, GeneratedAvatars>> provider9, Provider<Mapper<JSONObject, MessagesSourceMessage.AvatarAnimationGenerated>> provider10, Provider<Mapper<JSONObject, MessagesSourceMessage.BotDataChanged>> provider11, Provider<Mapper<JSONObject, MessagesSourceMessage.AddDiaryNotes>> provider12, Provider<Mapper<JSONObject, MessagesSourceMessage.LevelInfoUpdate>> provider13, Provider<JsonToChatCallMessageMapper> provider14) {
        return new SocketMessageToMessagesSourceMessageMapper_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static SocketMessageToMessagesSourceMessageMapper newInstance(JsonToChatMessageMapper jsonToChatMessageMapper, ChatSubscriptionMapper chatSubscriptionMapper, ChatRemovedMessageMapper chatRemovedMessageMapper, ChatRegenerateMessageFailedMapper chatRegenerateMessageFailedMapper, Mapper<JSONObject, TagOfUser> mapper, Mapper<JSONObject, MessagesSourceMessage.NeuronesChanged> mapper2, Mapper<JSONObject, MessagesSourceMessage.DailyNeuronsReceived> mapper3, Mapper<JSONObject, MessagesSourceMessage.NeuronesPurchased> mapper4, Mapper<JSONObject, GeneratedAvatars> mapper5, Mapper<JSONObject, MessagesSourceMessage.AvatarAnimationGenerated> mapper6, Mapper<JSONObject, MessagesSourceMessage.BotDataChanged> mapper7, Mapper<JSONObject, MessagesSourceMessage.AddDiaryNotes> mapper8, Mapper<JSONObject, MessagesSourceMessage.LevelInfoUpdate> mapper9, JsonToChatCallMessageMapper jsonToChatCallMessageMapper) {
        return new SocketMessageToMessagesSourceMessageMapper(jsonToChatMessageMapper, chatSubscriptionMapper, chatRemovedMessageMapper, chatRegenerateMessageFailedMapper, mapper, mapper2, mapper3, mapper4, mapper5, mapper6, mapper7, mapper8, mapper9, jsonToChatCallMessageMapper);
    }
}
