package com.ifriend.data.repository.chat.messages.mappers;

import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageMetaRemote;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageRemote;
import com.ifriend.data.repository.chat.messages.contenttypes.ContentReference;
import com.ifriend.data.repository.chat.messages.contenttypes.ContentReferenceKt;
import com.ifriend.data.repository.chat.messages.contenttypes.ContentReferenceType;
import com.ifriend.data.socket.generator.BotAudioMessageUrlGenerator;
import com.ifriend.data.socket.generator.UserAudioMessageUrlGenerator;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatAudioContentMessageMapper.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J:\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010J\f\u0010\u0014\u001a\u00020\u0010*\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ifriend/data/repository/chat/messages/mappers/ChatAudioContentMessageMapper;", "", "botAudioMessageUrlGenerator", "Lcom/ifriend/data/socket/generator/BotAudioMessageUrlGenerator;", "userAudioMessageUrlGenerator", "Lcom/ifriend/data/socket/generator/UserAudioMessageUrlGenerator;", "(Lcom/ifriend/data/socket/generator/BotAudioMessageUrlGenerator;Lcom/ifriend/data/socket/generator/UserAudioMessageUrlGenerator;)V", "buildChatAudioItem", "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Audio;", "id", "", "text", "sender", "recipient", "reference", "isPremium", "", "map", "from", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemote;", "isAudioMessage", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatAudioContentMessageMapper {
    private final BotAudioMessageUrlGenerator botAudioMessageUrlGenerator;
    private final UserAudioMessageUrlGenerator userAudioMessageUrlGenerator;

    @Inject
    public ChatAudioContentMessageMapper(BotAudioMessageUrlGenerator botAudioMessageUrlGenerator, UserAudioMessageUrlGenerator userAudioMessageUrlGenerator) {
        Intrinsics.checkNotNullParameter(botAudioMessageUrlGenerator, "botAudioMessageUrlGenerator");
        Intrinsics.checkNotNullParameter(userAudioMessageUrlGenerator, "userAudioMessageUrlGenerator");
        this.botAudioMessageUrlGenerator = botAudioMessageUrlGenerator;
        this.userAudioMessageUrlGenerator = userAudioMessageUrlGenerator;
    }

    public final MessageContent.Audio map(ChatMessageRemote from, boolean z) {
        Intrinsics.checkNotNullParameter(from, "from");
        if (isAudioMessage(from)) {
            String valueOf = String.valueOf(from.getId());
            String text = from.getText();
            String sender = from.getSender();
            String recipient = from.getRecipient();
            ChatMessageMetaRemote meta = from.getMeta();
            return buildChatAudioItem(valueOf, text, sender, recipient, meta != null ? meta.getReference() : null, z);
        }
        return null;
    }

    private final boolean isAudioMessage(ChatMessageRemote chatMessageRemote) {
        ContentReference contentReference = ContentReferenceKt.getContentReference(chatMessageRemote);
        ContentReferenceType.Companion companion = ContentReferenceType.Companion;
        String type = contentReference != null ? contentReference.getType() : null;
        if (type == null) {
            type = "";
        }
        ContentReferenceType from = companion.from(type);
        ChatMessageMetaRemote meta = chatMessageRemote.getMeta();
        return (meta != null ? Intrinsics.areEqual((Object) meta.getHasAudio(), (Object) true) : false) || from.isAudio();
    }

    private final MessageContent.Audio buildChatAudioItem(String str, String str2, String str3, String str4, String str5, boolean z) {
        String generate;
        if (str5 == null) {
            generate = this.botAudioMessageUrlGenerator.generate(str3, str4, str);
        } else if (z) {
            generate = this.botAudioMessageUrlGenerator.generatePremium(str5);
        } else {
            generate = this.userAudioMessageUrlGenerator.generate(str3, str4, str5);
        }
        return new MessageContent.Audio(str2, generate, z);
    }
}
