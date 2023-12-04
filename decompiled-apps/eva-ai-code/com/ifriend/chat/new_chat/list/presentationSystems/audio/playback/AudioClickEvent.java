package com.ifriend.chat.new_chat.list.presentationSystems.audio.playback;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.common_entities_engine.Event;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import com.ifriend.domain.newChat.chat.models.MessageInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AudioClickEvent.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioClickEvent;", "Lcom/ifriend/common_entities_engine/Event;", "info", "Lcom/ifriend/domain/newChat/chat/models/MessageInfo;", FirebaseAnalytics.Param.CONTENT, "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Audio;", "(Lcom/ifriend/domain/newChat/chat/models/MessageInfo;Lcom/ifriend/domain/newChat/chat/models/MessageContent$Audio;)V", "getContent", "()Lcom/ifriend/domain/newChat/chat/models/MessageContent$Audio;", "getInfo", "()Lcom/ifriend/domain/newChat/chat/models/MessageInfo;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioClickEvent implements Event {
    public static final int $stable = 8;
    private final MessageContent.Audio content;
    private final MessageInfo info;

    public AudioClickEvent(MessageInfo info, MessageContent.Audio content) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(content, "content");
        this.info = info;
        this.content = content;
    }

    public final MessageInfo getInfo() {
        return this.info;
    }

    public final MessageContent.Audio getContent() {
        return this.content;
    }
}
