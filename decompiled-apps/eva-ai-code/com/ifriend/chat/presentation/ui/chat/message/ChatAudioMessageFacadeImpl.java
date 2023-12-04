package com.ifriend.chat.presentation.ui.chat.message;

import com.ifriend.chat.new_chat.list.presentationSystems.audio.changeVoice.ChatAudioMessageFacade;
import com.ifriend.domain.data.AudioMessageRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatAudioMessageFacadeImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/message/ChatAudioMessageFacadeImpl;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/changeVoice/ChatAudioMessageFacade;", "audioMessageRepository", "Lcom/ifriend/domain/data/AudioMessageRepository;", "(Lcom/ifriend/domain/data/AudioMessageRepository;)V", "isAudioPopUpShowed", "", "setAudioPopUpShowed", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatAudioMessageFacadeImpl implements ChatAudioMessageFacade {
    public static final int $stable = 8;
    private final AudioMessageRepository audioMessageRepository;

    @Inject
    public ChatAudioMessageFacadeImpl(AudioMessageRepository audioMessageRepository) {
        Intrinsics.checkNotNullParameter(audioMessageRepository, "audioMessageRepository");
        this.audioMessageRepository = audioMessageRepository;
    }

    @Override // com.ifriend.chat.new_chat.list.presentationSystems.audio.changeVoice.ChatAudioMessageFacade
    public boolean isAudioPopUpShowed() {
        return this.audioMessageRepository.isAudioPopUpShowed();
    }

    @Override // com.ifriend.chat.new_chat.list.presentationSystems.audio.changeVoice.ChatAudioMessageFacade
    public void setAudioPopUpShowed() {
        this.audioMessageRepository.setAudioPopUpShowed();
    }
}
