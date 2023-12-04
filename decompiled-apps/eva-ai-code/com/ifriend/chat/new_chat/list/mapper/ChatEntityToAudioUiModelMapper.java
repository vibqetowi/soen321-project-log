package com.ifriend.chat.new_chat.list.mapper;

import android.net.Uri;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.decode.AudioDecodingStatusComponent;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.playback.AudioStatusComponent;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageBotDecodedUiModel;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageBotUiModel;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageUiModel;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageUserUiModel;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatType;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import com.ifriend.domain.newChat.chat.systems.messages.sending.showSending.SendingStatusComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
/* compiled from: ChatEntityToAudioUiModelMapper.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToAudioUiModelMapper;", "", "()V", "histogramProvider", "Lcom/ifriend/chat/new_chat/list/mapper/HistogramProvider;", "map", "Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageUiModel;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", FirebaseAnalytics.Param.CONTENT, "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Audio;", "entity", "Lcom/ifriend/common_entities_engine/Entity;", "bot", "Lcom/ifriend/domain/models/profile/bot/Bot;", "chatInfo", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "mapDecodedModel", "Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageBotDecodedUiModel;", "decoded", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus$Decoded;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatEntityToAudioUiModelMapper {
    public static final int $stable = 8;
    private final HistogramProvider histogramProvider = new HistogramProvider();

    public final AudioMessageUiModel map(ChatMessage message, MessageContent.Audio content, Entity entity, Bot bot, ChatInfo chatInfo) {
        AudioStatusComponent.PlaybackStatus.Idle idle;
        AudioDecodingStatusComponent.DecodingStatus.None none;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(chatInfo, "chatInfo");
        AudioStatusComponent audioStatusComponent = (AudioStatusComponent) entity.get(Reflection.getOrCreateKotlinClass(AudioStatusComponent.class));
        if (audioStatusComponent == null || (idle = audioStatusComponent.getPlaybackStatus()) == null) {
            idle = AudioStatusComponent.PlaybackStatus.Idle.INSTANCE;
        }
        AudioStatusComponent.PlaybackStatus playbackStatus = idle;
        AudioDecodingStatusComponent audioDecodingStatusComponent = (AudioDecodingStatusComponent) entity.get(Reflection.getOrCreateKotlinClass(AudioDecodingStatusComponent.class));
        if (audioDecodingStatusComponent == null || (none = audioDecodingStatusComponent.getStatus()) == null) {
            none = AudioDecodingStatusComponent.DecodingStatus.None.INSTANCE;
        }
        AudioDecodingStatusComponent.DecodingStatus decodingStatus = none;
        boolean z = entity.get(Reflection.getOrCreateKotlinClass(SendingStatusComponent.class)) != null;
        int histogramFor = this.histogramProvider.histogramFor(message);
        if (message.getInfo().isFromUser()) {
            String tag = ChatMessageKt.getTag(message);
            Uri parse = Uri.parse(content.getAudioUri());
            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            return new AudioMessageUserUiModel(tag, parse, histogramFor, playbackStatus, z, message);
        }
        boolean z2 = ((bot != null ? bot.getGender() : null) == Gender.NON_BINARY || chatInfo.getChatType() == ChatType.INFLUENCER || content.isPremium()) ? false : true;
        String tag2 = ChatMessageKt.getTag(message);
        Uri parse2 = Uri.parse(content.getAudioUri());
        Intrinsics.checkNotNullExpressionValue(parse2, "parse(this)");
        return new AudioMessageBotUiModel(tag2, parse2, histogramFor, playbackStatus, decodingStatus, z2, content.isPremium(), message);
    }

    public final AudioMessageBotDecodedUiModel mapDecodedModel(ChatMessage message, AudioDecodingStatusComponent.DecodingStatus.Decoded decoded) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(decoded, "decoded");
        String tag = ChatMessageKt.getTag(message);
        String text = decoded.getText();
        return new AudioMessageBotDecodedUiModel(tag + text, decoded.getText(), message);
    }
}
