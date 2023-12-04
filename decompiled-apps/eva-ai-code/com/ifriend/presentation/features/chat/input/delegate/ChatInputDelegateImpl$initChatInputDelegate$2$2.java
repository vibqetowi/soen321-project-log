package com.ifriend.presentation.features.chat.input.delegate;

import com.ifriend.common_utils.extensions.DurationKt;
import com.ifriend.domain.services.audio.recording.AudioRecorderState;
import com.ifriend.presentation.features.chat.input.model.ChatInputState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatInputDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/input/model/ChatInputState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatInputDelegateImpl$initChatInputDelegate$2$2 extends Lambda implements Function1<ChatInputState, ChatInputState> {
    final /* synthetic */ AudioRecorderState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputDelegateImpl$initChatInputDelegate$2$2(AudioRecorderState audioRecorderState) {
        super(1);
        this.$state = audioRecorderState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChatInputState invoke(ChatInputState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ChatInputState.copy$default(it, null, null, true, false, DurationKt.m6850formatUpToMinutesLRDsOJo(((AudioRecorderState.Recording) this.$state).getFile().m6886getDurationUwyO8pc()), ((AudioRecorderState.Recording) this.$state).getFile().getVolumeDb(), 11, null);
    }
}
