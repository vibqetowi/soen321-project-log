package com.ifriend.chat.new_chat.list.presentationSystems.audio.decode;

import com.ifriend.common_entities_engine.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DecodeAudioClickEvent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/DecodeAudioClickEvent;", "Lcom/ifriend/common_entities_engine/Event;", "messageId", "", "(Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DecodeAudioClickEvent implements Event {
    public static final int $stable = 0;
    private final String messageId;

    public DecodeAudioClickEvent(String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.messageId = messageId;
    }

    public final String getMessageId() {
        return this.messageId;
    }
}
