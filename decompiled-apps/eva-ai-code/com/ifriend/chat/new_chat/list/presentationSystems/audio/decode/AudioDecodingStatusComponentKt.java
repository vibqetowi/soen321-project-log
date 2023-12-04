package com.ifriend.chat.new_chat.list.presentationSystems.audio.decode;

import com.ifriend.chat.new_chat.list.presentationSystems.audio.decode.AudioDecodingStatusComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AudioDecodingStatusComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toComponent", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus;", "new_chat_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioDecodingStatusComponentKt {
    public static final AudioDecodingStatusComponent toComponent(AudioDecodingStatusComponent.DecodingStatus decodingStatus) {
        Intrinsics.checkNotNullParameter(decodingStatus, "<this>");
        return new AudioDecodingStatusComponent(decodingStatus);
    }
}
