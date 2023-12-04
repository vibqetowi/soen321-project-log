package com.ifriend.presentation.features.chat.input.delegate;

import androidx.lifecycle.ViewModel;
import com.ifriend.keychain.KeychainModule;
import com.ifriend.presentation.features.chat.input.model.ChatInputState;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatInputDelegate.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH&R\u00020\t¢\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\bH&R\u00020\t¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\bH&R\u00020\t¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000bH&R\u00020\t¢\u0006\u0002\u0010\fJ\u0011\u0010\u0012\u001a\u00020\bH&R\u00020\t¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0013\u001a\u00020\bH&R\u00020\t¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H&R\u00020\t¢\u0006\u0002\u0010\u0017R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/ifriend/presentation/features/chat/input/delegate/ChatInputDelegate;", "", "chatInputState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/presentation/features/chat/input/model/ChatInputState;", "getChatInputState", "()Lkotlinx/coroutines/flow/StateFlow;", "changeInputMessage", "", "Landroidx/lifecycle/ViewModel;", "new", "", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "clearChatInputDelegate", "(Landroidx/lifecycle/ViewModel;)V", "clearInputMessage", "initChatInputDelegate", "chatId", "sendInputMessage", "startAudioRecording", "stopRecordAudio", KeychainModule.AuthPromptOptions.CANCEL, "", "(Landroidx/lifecycle/ViewModel;Z)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatInputDelegate {
    void changeInputMessage(ViewModel viewModel, String str);

    void clearChatInputDelegate(ViewModel viewModel);

    void clearInputMessage(ViewModel viewModel);

    StateFlow<ChatInputState> getChatInputState();

    void initChatInputDelegate(ViewModel viewModel, String str);

    void sendInputMessage(ViewModel viewModel);

    void startAudioRecording(ViewModel viewModel);

    void stopRecordAudio(ViewModel viewModel, boolean z);
}
