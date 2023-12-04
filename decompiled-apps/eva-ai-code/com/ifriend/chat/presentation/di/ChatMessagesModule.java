package com.ifriend.chat.presentation.di;

import com.ifriend.base.di.Feature;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.changeVoice.ChatAudioMessageFacade;
import com.ifriend.chat.presentation.ui.chat.message.ChatAudioMessageFacadeImpl;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;
/* compiled from: ChatMessagesModule.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/ifriend/chat/presentation/di/ChatMessagesModule;", "", "bindsChatAudioMessageFacade", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/changeVoice/ChatAudioMessageFacade;", "facade", "Lcom/ifriend/chat/presentation/ui/chat/message/ChatAudioMessageFacadeImpl;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface ChatMessagesModule {
    @Feature
    @Binds
    ChatAudioMessageFacade bindsChatAudioMessageFacade(ChatAudioMessageFacadeImpl chatAudioMessageFacadeImpl);
}
