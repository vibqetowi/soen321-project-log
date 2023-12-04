package com.ifriend.data.socket.mapper;

import com.ifriend.data.socket.SocketMessage;
import com.ifriend.data.socket.SocketMessageType;
import com.ifriend.data.socket.mapper.chat.JsonToChatCallMessageMapper;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.models.TagOfUser;
import com.ifriend.domain.models.avatar.GeneratedAvatars;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.socket.MessagesSourceMessage;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* compiled from: SocketMessageToMessagesSourceMessageMapper.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001Bó\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000b\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000b\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150\u000b\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000b\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u000b\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u000b\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0002\u0010 J\u001b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010%J\u0017\u0010&\u001a\u0004\u0018\u00010\"*\u00020$H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010%R\u001c\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/ifriend/data/socket/mapper/SocketMessageToMessagesSourceMessageMapper;", "", "chatItemMessageMapper", "Lcom/ifriend/data/socket/mapper/JsonToChatMessageMapper;", "chatSubscriptionMapper", "Lcom/ifriend/data/socket/mapper/ChatSubscriptionMapper;", "chatRemovedMessageMapper", "Lcom/ifriend/data/socket/mapper/ChatRemovedMessageMapper;", "chatRegenerateMessageFailedMapper", "Lcom/ifriend/data/socket/mapper/ChatRegenerateMessageFailedMapper;", "tagMapper", "Lcom/ifriend/domain/data/Mapper;", "Lorg/json/JSONObject;", "Lcom/ifriend/domain/models/TagOfUser;", "neuronsSpentMapper", "Lcom/ifriend/domain/socket/MessagesSourceMessage$NeuronesChanged;", "dailyNeuronsReceivedMapper", "Lcom/ifriend/domain/socket/MessagesSourceMessage$DailyNeuronsReceived;", "neuronsAddedMapper", "Lcom/ifriend/domain/socket/MessagesSourceMessage$NeuronesPurchased;", "generatedAvatarsMapper", "Lcom/ifriend/domain/models/avatar/GeneratedAvatars;", "avatarAnimationMapper", "Lcom/ifriend/domain/socket/MessagesSourceMessage$AvatarAnimationGenerated;", "botDataChangedMapper", "Lcom/ifriend/domain/socket/MessagesSourceMessage$BotDataChanged;", "addDiaryNotesMapper", "Lcom/ifriend/domain/socket/MessagesSourceMessage$AddDiaryNotes;", "levelInfoMapper", "Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate;", "chatCallMessageMapper", "Lcom/ifriend/data/socket/mapper/chat/JsonToChatCallMessageMapper;", "(Lcom/ifriend/data/socket/mapper/JsonToChatMessageMapper;Lcom/ifriend/data/socket/mapper/ChatSubscriptionMapper;Lcom/ifriend/data/socket/mapper/ChatRemovedMessageMapper;Lcom/ifriend/data/socket/mapper/ChatRegenerateMessageFailedMapper;Lcom/ifriend/domain/data/Mapper;Lcom/ifriend/domain/data/Mapper;Lcom/ifriend/domain/data/Mapper;Lcom/ifriend/domain/data/Mapper;Lcom/ifriend/domain/data/Mapper;Lcom/ifriend/domain/data/Mapper;Lcom/ifriend/domain/data/Mapper;Lcom/ifriend/domain/data/Mapper;Lcom/ifriend/domain/data/Mapper;Lcom/ifriend/data/socket/mapper/chat/JsonToChatCallMessageMapper;)V", "map", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "from", "Lcom/ifriend/data/socket/SocketMessage;", "(Lcom/ifriend/data/socket/SocketMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toMessagesSourceMessage", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SocketMessageToMessagesSourceMessageMapper {
    private final Mapper<JSONObject, MessagesSourceMessage.AddDiaryNotes> addDiaryNotesMapper;
    private final Mapper<JSONObject, MessagesSourceMessage.AvatarAnimationGenerated> avatarAnimationMapper;
    private final Mapper<JSONObject, MessagesSourceMessage.BotDataChanged> botDataChangedMapper;
    private final JsonToChatCallMessageMapper chatCallMessageMapper;
    private final JsonToChatMessageMapper chatItemMessageMapper;
    private final ChatRegenerateMessageFailedMapper chatRegenerateMessageFailedMapper;
    private final ChatRemovedMessageMapper chatRemovedMessageMapper;
    private final ChatSubscriptionMapper chatSubscriptionMapper;
    private final Mapper<JSONObject, MessagesSourceMessage.DailyNeuronsReceived> dailyNeuronsReceivedMapper;
    private final Mapper<JSONObject, GeneratedAvatars> generatedAvatarsMapper;
    private final Mapper<JSONObject, MessagesSourceMessage.LevelInfoUpdate> levelInfoMapper;
    private final Mapper<JSONObject, MessagesSourceMessage.NeuronesPurchased> neuronsAddedMapper;
    private final Mapper<JSONObject, MessagesSourceMessage.NeuronesChanged> neuronsSpentMapper;
    private final Mapper<JSONObject, TagOfUser> tagMapper;

    @Inject
    public SocketMessageToMessagesSourceMessageMapper(JsonToChatMessageMapper chatItemMessageMapper, ChatSubscriptionMapper chatSubscriptionMapper, ChatRemovedMessageMapper chatRemovedMessageMapper, ChatRegenerateMessageFailedMapper chatRegenerateMessageFailedMapper, Mapper<JSONObject, TagOfUser> tagMapper, Mapper<JSONObject, MessagesSourceMessage.NeuronesChanged> neuronsSpentMapper, Mapper<JSONObject, MessagesSourceMessage.DailyNeuronsReceived> dailyNeuronsReceivedMapper, Mapper<JSONObject, MessagesSourceMessage.NeuronesPurchased> neuronsAddedMapper, Mapper<JSONObject, GeneratedAvatars> generatedAvatarsMapper, Mapper<JSONObject, MessagesSourceMessage.AvatarAnimationGenerated> avatarAnimationMapper, Mapper<JSONObject, MessagesSourceMessage.BotDataChanged> botDataChangedMapper, Mapper<JSONObject, MessagesSourceMessage.AddDiaryNotes> addDiaryNotesMapper, Mapper<JSONObject, MessagesSourceMessage.LevelInfoUpdate> levelInfoMapper, JsonToChatCallMessageMapper chatCallMessageMapper) {
        Intrinsics.checkNotNullParameter(chatItemMessageMapper, "chatItemMessageMapper");
        Intrinsics.checkNotNullParameter(chatSubscriptionMapper, "chatSubscriptionMapper");
        Intrinsics.checkNotNullParameter(chatRemovedMessageMapper, "chatRemovedMessageMapper");
        Intrinsics.checkNotNullParameter(chatRegenerateMessageFailedMapper, "chatRegenerateMessageFailedMapper");
        Intrinsics.checkNotNullParameter(tagMapper, "tagMapper");
        Intrinsics.checkNotNullParameter(neuronsSpentMapper, "neuronsSpentMapper");
        Intrinsics.checkNotNullParameter(dailyNeuronsReceivedMapper, "dailyNeuronsReceivedMapper");
        Intrinsics.checkNotNullParameter(neuronsAddedMapper, "neuronsAddedMapper");
        Intrinsics.checkNotNullParameter(generatedAvatarsMapper, "generatedAvatarsMapper");
        Intrinsics.checkNotNullParameter(avatarAnimationMapper, "avatarAnimationMapper");
        Intrinsics.checkNotNullParameter(botDataChangedMapper, "botDataChangedMapper");
        Intrinsics.checkNotNullParameter(addDiaryNotesMapper, "addDiaryNotesMapper");
        Intrinsics.checkNotNullParameter(levelInfoMapper, "levelInfoMapper");
        Intrinsics.checkNotNullParameter(chatCallMessageMapper, "chatCallMessageMapper");
        this.chatItemMessageMapper = chatItemMessageMapper;
        this.chatSubscriptionMapper = chatSubscriptionMapper;
        this.chatRemovedMessageMapper = chatRemovedMessageMapper;
        this.chatRegenerateMessageFailedMapper = chatRegenerateMessageFailedMapper;
        this.tagMapper = tagMapper;
        this.neuronsSpentMapper = neuronsSpentMapper;
        this.dailyNeuronsReceivedMapper = dailyNeuronsReceivedMapper;
        this.neuronsAddedMapper = neuronsAddedMapper;
        this.generatedAvatarsMapper = generatedAvatarsMapper;
        this.avatarAnimationMapper = avatarAnimationMapper;
        this.botDataChangedMapper = botDataChangedMapper;
        this.addDiaryNotesMapper = addDiaryNotesMapper;
        this.levelInfoMapper = levelInfoMapper;
        this.chatCallMessageMapper = chatCallMessageMapper;
    }

    public final Object map(SocketMessage socketMessage, Continuation<? super MessagesSourceMessage> continuation) {
        return toMessagesSourceMessage(socketMessage, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object toMessagesSourceMessage(SocketMessage socketMessage, Continuation<? super MessagesSourceMessage> continuation) {
        SocketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1 socketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1;
        int i;
        ChatMessage chatMessage;
        ChatMessage chatMessage2;
        if (continuation instanceof SocketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1) {
            socketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1 = (SocketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1) continuation;
            if ((socketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1.label & Integer.MIN_VALUE) != 0) {
                socketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1.label -= Integer.MIN_VALUE;
                Object obj = socketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = socketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        chatMessage = (ChatMessage) obj;
                        if (chatMessage != null) {
                            return null;
                        }
                        return new MessagesSourceMessage.Chat.Message(chatMessage);
                    } else if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        chatMessage2 = (ChatMessage) obj;
                        if (chatMessage2 != null) {
                            return null;
                        }
                        return new MessagesSourceMessage.Chat.MessageUpdated(chatMessage2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
                String type = socketMessage.getType();
                if (Intrinsics.areEqual(type, SocketMessageType.CHAT_MESSAGE.getKey())) {
                    JsonToChatMessageMapper jsonToChatMessageMapper = this.chatItemMessageMapper;
                    JSONObject json = socketMessage.getJson();
                    socketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1.label = 1;
                    obj = jsonToChatMessageMapper.map(json, socketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatMessage = (ChatMessage) obj;
                    if (chatMessage != null) {
                    }
                } else if (Intrinsics.areEqual(type, SocketMessageType.CHAT_MESSAGE_REMOVED.getKey())) {
                    MessagesSourceMessage.Chat.MessageRemoved map = this.chatRemovedMessageMapper.map(socketMessage.getJson());
                    if (map == null) {
                        return null;
                    }
                    return map;
                } else if (Intrinsics.areEqual(type, SocketMessageType.CHAT_MESSAGE_UPDATED.getKey())) {
                    JsonToChatMessageMapper jsonToChatMessageMapper2 = this.chatItemMessageMapper;
                    JSONObject json2 = socketMessage.getJson();
                    socketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1.label = 2;
                    obj = jsonToChatMessageMapper2.map(json2, socketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatMessage2 = (ChatMessage) obj;
                    if (chatMessage2 != null) {
                    }
                } else if (Intrinsics.areEqual(type, SocketMessageType.CHAT_CALL_MESSAGE.getKey())) {
                    return this.chatCallMessageMapper.map(socketMessage.getJson());
                } else {
                    if (Intrinsics.areEqual(type, SocketMessageType.REGENERATE_ANSWER_FAILED.getKey())) {
                        return this.chatRegenerateMessageFailedMapper.map(socketMessage.getJson());
                    }
                    if (Intrinsics.areEqual(type, SocketMessageType.CHAT_SUBSCRIPTION_AVAILABLE.getKey())) {
                        return this.chatSubscriptionMapper.map(socketMessage.getJson(), true);
                    }
                    if (Intrinsics.areEqual(type, SocketMessageType.CHAT_SUBSCRIPTION_UNAVAILABLE.getKey())) {
                        return this.chatSubscriptionMapper.map(socketMessage.getJson(), false);
                    }
                    if (Intrinsics.areEqual(type, SocketMessageType.LULLABY_AVAILABILITY_CHANGED.getKey())) {
                        return MessagesSourceMessage.LullabyAvailabilityChanged.INSTANCE;
                    }
                    if (Intrinsics.areEqual(type, SocketMessageType.TAGS_ADDED.getKey())) {
                        TagOfUser map2 = this.tagMapper.map(socketMessage.getJson());
                        if (map2 == null) {
                            return null;
                        }
                        return new MessagesSourceMessage.TagAdded(map2);
                    } else if (Intrinsics.areEqual(type, SocketMessageType.TAGS_REMOVED.getKey())) {
                        TagOfUser map3 = this.tagMapper.map(socketMessage.getJson());
                        if (map3 == null) {
                            return null;
                        }
                        return new MessagesSourceMessage.TagRemoved(map3);
                    } else if (Intrinsics.areEqual(type, SocketMessageType.AVATARS_GENERATED.getKey())) {
                        return new MessagesSourceMessage.AvatarsGenerated(this.generatedAvatarsMapper.map(socketMessage.getJson()));
                    } else {
                        if (Intrinsics.areEqual(type, SocketMessageType.AVATAR_ANIMATION_GENERATED.getKey())) {
                            return this.avatarAnimationMapper.map(socketMessage.getJson());
                        }
                        if (Intrinsics.areEqual(type, SocketMessageType.NEURONS_CHANGED.getKey())) {
                            return this.neuronsSpentMapper.map(socketMessage.getJson());
                        }
                        if (Intrinsics.areEqual(type, SocketMessageType.UPGRADED_ACCOUNT.getKey())) {
                            return MessagesSourceMessage.AccountUpgraded.INSTANCE;
                        }
                        if (Intrinsics.areEqual(type, SocketMessageType.DAILY_NEURONS_RECEIVED.getKey())) {
                            return this.dailyNeuronsReceivedMapper.map(socketMessage.getJson());
                        }
                        if (Intrinsics.areEqual(type, SocketMessageType.NEURONS_PURCHASED.getKey())) {
                            return this.neuronsAddedMapper.map(socketMessage.getJson());
                        }
                        if (Intrinsics.areEqual(type, SocketMessageType.BOT_CHANGED.getKey())) {
                            return this.botDataChangedMapper.map(socketMessage.getJson());
                        }
                        if (Intrinsics.areEqual(type, SocketMessageType.ADD_DIARY_NOTES.getKey())) {
                            return this.addDiaryNotesMapper.map(socketMessage.getJson());
                        }
                        if (Intrinsics.areEqual(type, SocketMessageType.LEVEL_UPDATED.getKey())) {
                            return this.levelInfoMapper.map(socketMessage.getJson());
                        }
                        return null;
                    }
                }
            }
        }
        socketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1 = new SocketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1(this, continuation);
        Object obj2 = socketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = socketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1.label;
        if (i == 0) {
        }
    }
}
