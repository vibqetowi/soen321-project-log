package com.ifriend.chat.new_chat.list.adapter.delegates;

import com.hannesdorfmann.adapterdelegates4.AdapterDelegate;
import com.hannesdorfmann.adapterdelegates4.dsl.DslViewBindingListAdapterDelegate;
import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.chat.new_chat.list.viewModel.AudioItemClick;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AudioMessageBotDelegate.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"audioMessageBotDelegate", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;", "", "", "audioItemClick", "Lcom/ifriend/chat/new_chat/list/viewModel/AudioItemClick;", "audioPlayer", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayer;", "new_chat_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioMessageBotDelegateKt {
    public static final AdapterDelegate<List<Object>> audioMessageBotDelegate(AudioItemClick audioItemClick, AudioPlayer audioPlayer) {
        Intrinsics.checkNotNullParameter(audioItemClick, "audioItemClick");
        Intrinsics.checkNotNullParameter(audioPlayer, "audioPlayer");
        return new DslViewBindingListAdapterDelegate(AudioMessageBotDelegateKt$audioMessageBotDelegate$1.INSTANCE, new AudioMessageBotDelegateKt$audioMessageBotDelegate$$inlined$adapterDelegateViewBinding$default$1(), new AudioMessageBotDelegateKt$audioMessageBotDelegate$2(audioPlayer, audioItemClick), AudioMessageBotDelegateKt$audioMessageBotDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
