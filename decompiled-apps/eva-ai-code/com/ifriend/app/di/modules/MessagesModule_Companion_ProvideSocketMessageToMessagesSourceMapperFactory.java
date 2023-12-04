package com.ifriend.app.di.modules;

import com.ifriend.data.socket.mapper.ChatRegenerateMessageFailedMapper;
import com.ifriend.data.socket.mapper.ChatRemovedMessageMapper;
import com.ifriend.data.socket.mapper.ChatSubscriptionMapper;
import com.ifriend.data.socket.mapper.JsonToChatMessageMapper;
import com.ifriend.data.socket.mapper.SocketMessageToMessagesSourceMessageMapper;
import com.ifriend.data.socket.mapper.chat.JsonToChatCallMessageMapper;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.models.TagOfUser;
import com.ifriend.domain.models.avatar.GeneratedAvatars;
import com.ifriend.domain.socket.MessagesSourceMessage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvideSocketMessageToMessagesSourceMapperFactory implements Factory<SocketMessageToMessagesSourceMessageMapper> {
    private final Provider<Mapper<JSONObject, MessagesSourceMessage.AddDiaryNotes>> addDiaryNotesMapperProvider;
    private final Provider<Mapper<JSONObject, MessagesSourceMessage.AvatarAnimationGenerated>> avatarAnimationGeneratedMapperProvider;
    private final Provider<Mapper<JSONObject, MessagesSourceMessage.BotDataChanged>> botDataChangedMapperProvider;
    private final Provider<JsonToChatCallMessageMapper> chatCallMessageMapperProvider;
    private final Provider<JsonToChatMessageMapper> chatItemMessageMapperProvider;
    private final Provider<ChatRegenerateMessageFailedMapper> chatRegenerateMessageFailedMapperProvider;
    private final Provider<ChatRemovedMessageMapper> chatRemovedMessageMapperProvider;
    private final Provider<ChatSubscriptionMapper> chatSubscriptionMapperProvider;
    private final Provider<Mapper<JSONObject, MessagesSourceMessage.DailyNeuronsReceived>> dailyNeuronsMapperProvider;
    private final Provider<Mapper<JSONObject, GeneratedAvatars>> generatedAvatarsMapperProvider;
    private final Provider<Mapper<JSONObject, MessagesSourceMessage.LevelInfoUpdate>> levelInfoMapperProvider;
    private final Provider<Mapper<JSONObject, MessagesSourceMessage.NeuronesPurchased>> neuronsAddedMapperProvider;
    private final Provider<Mapper<JSONObject, MessagesSourceMessage.NeuronesChanged>> neuronsSpentMapperProvider;
    private final Provider<Mapper<JSONObject, TagOfUser>> tagMapperProvider;

    public MessagesModule_Companion_ProvideSocketMessageToMessagesSourceMapperFactory(Provider<JsonToChatMessageMapper> provider, Provider<Mapper<JSONObject, TagOfUser>> provider2, Provider<Mapper<JSONObject, MessagesSourceMessage.NeuronesChanged>> provider3, Provider<Mapper<JSONObject, MessagesSourceMessage.NeuronesPurchased>> provider4, Provider<Mapper<JSONObject, MessagesSourceMessage.DailyNeuronsReceived>> provider5, Provider<Mapper<JSONObject, GeneratedAvatars>> provider6, Provider<Mapper<JSONObject, MessagesSourceMessage.AvatarAnimationGenerated>> provider7, Provider<Mapper<JSONObject, MessagesSourceMessage.BotDataChanged>> provider8, Provider<Mapper<JSONObject, MessagesSourceMessage.AddDiaryNotes>> provider9, Provider<Mapper<JSONObject, MessagesSourceMessage.LevelInfoUpdate>> provider10, Provider<ChatRemovedMessageMapper> provider11, Provider<JsonToChatCallMessageMapper> provider12, Provider<ChatRegenerateMessageFailedMapper> provider13, Provider<ChatSubscriptionMapper> provider14) {
        this.chatItemMessageMapperProvider = provider;
        this.tagMapperProvider = provider2;
        this.neuronsSpentMapperProvider = provider3;
        this.neuronsAddedMapperProvider = provider4;
        this.dailyNeuronsMapperProvider = provider5;
        this.generatedAvatarsMapperProvider = provider6;
        this.avatarAnimationGeneratedMapperProvider = provider7;
        this.botDataChangedMapperProvider = provider8;
        this.addDiaryNotesMapperProvider = provider9;
        this.levelInfoMapperProvider = provider10;
        this.chatRemovedMessageMapperProvider = provider11;
        this.chatCallMessageMapperProvider = provider12;
        this.chatRegenerateMessageFailedMapperProvider = provider13;
        this.chatSubscriptionMapperProvider = provider14;
    }

    @Override // javax.inject.Provider
    public SocketMessageToMessagesSourceMessageMapper get() {
        return provideSocketMessageToMessagesSourceMapper(this.chatItemMessageMapperProvider.get(), this.tagMapperProvider.get(), this.neuronsSpentMapperProvider.get(), this.neuronsAddedMapperProvider.get(), this.dailyNeuronsMapperProvider.get(), this.generatedAvatarsMapperProvider.get(), this.avatarAnimationGeneratedMapperProvider.get(), this.botDataChangedMapperProvider.get(), this.addDiaryNotesMapperProvider.get(), this.levelInfoMapperProvider.get(), this.chatRemovedMessageMapperProvider.get(), this.chatCallMessageMapperProvider.get(), this.chatRegenerateMessageFailedMapperProvider.get(), this.chatSubscriptionMapperProvider.get());
    }

    public static MessagesModule_Companion_ProvideSocketMessageToMessagesSourceMapperFactory create(Provider<JsonToChatMessageMapper> provider, Provider<Mapper<JSONObject, TagOfUser>> provider2, Provider<Mapper<JSONObject, MessagesSourceMessage.NeuronesChanged>> provider3, Provider<Mapper<JSONObject, MessagesSourceMessage.NeuronesPurchased>> provider4, Provider<Mapper<JSONObject, MessagesSourceMessage.DailyNeuronsReceived>> provider5, Provider<Mapper<JSONObject, GeneratedAvatars>> provider6, Provider<Mapper<JSONObject, MessagesSourceMessage.AvatarAnimationGenerated>> provider7, Provider<Mapper<JSONObject, MessagesSourceMessage.BotDataChanged>> provider8, Provider<Mapper<JSONObject, MessagesSourceMessage.AddDiaryNotes>> provider9, Provider<Mapper<JSONObject, MessagesSourceMessage.LevelInfoUpdate>> provider10, Provider<ChatRemovedMessageMapper> provider11, Provider<JsonToChatCallMessageMapper> provider12, Provider<ChatRegenerateMessageFailedMapper> provider13, Provider<ChatSubscriptionMapper> provider14) {
        return new MessagesModule_Companion_ProvideSocketMessageToMessagesSourceMapperFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static SocketMessageToMessagesSourceMessageMapper provideSocketMessageToMessagesSourceMapper(JsonToChatMessageMapper jsonToChatMessageMapper, Mapper<JSONObject, TagOfUser> mapper, Mapper<JSONObject, MessagesSourceMessage.NeuronesChanged> mapper2, Mapper<JSONObject, MessagesSourceMessage.NeuronesPurchased> mapper3, Mapper<JSONObject, MessagesSourceMessage.DailyNeuronsReceived> mapper4, Mapper<JSONObject, GeneratedAvatars> mapper5, Mapper<JSONObject, MessagesSourceMessage.AvatarAnimationGenerated> mapper6, Mapper<JSONObject, MessagesSourceMessage.BotDataChanged> mapper7, Mapper<JSONObject, MessagesSourceMessage.AddDiaryNotes> mapper8, Mapper<JSONObject, MessagesSourceMessage.LevelInfoUpdate> mapper9, ChatRemovedMessageMapper chatRemovedMessageMapper, JsonToChatCallMessageMapper jsonToChatCallMessageMapper, ChatRegenerateMessageFailedMapper chatRegenerateMessageFailedMapper, ChatSubscriptionMapper chatSubscriptionMapper) {
        return (SocketMessageToMessagesSourceMessageMapper) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provideSocketMessageToMessagesSourceMapper(jsonToChatMessageMapper, mapper, mapper2, mapper3, mapper4, mapper5, mapper6, mapper7, mapper8, mapper9, chatRemovedMessageMapper, jsonToChatCallMessageMapper, chatRegenerateMessageFailedMapper, chatSubscriptionMapper));
    }
}
