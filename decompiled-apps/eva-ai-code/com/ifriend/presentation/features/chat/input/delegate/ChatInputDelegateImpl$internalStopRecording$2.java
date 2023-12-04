package com.ifriend.presentation.features.chat.input.delegate;

import androidx.lifecycle.ViewModel;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendMessageEvent;
import com.ifriend.domain.services.audio.recording.AudioRecorderController;
import com.ifriend.domain.services.audio.recording.AudioRecorderState;
import com.ifriend.domain.services.audio.recording.AudioRecordingStateProvider;
import com.ifriend.presentation.features.chat.input.analytics.VoiceRecordingAnalytics;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatInputDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegateImpl$internalStopRecording$2", f = "ChatInputDelegate.kt", i = {0}, l = {227, 228, 239}, m = "invokeSuspend", n = {"state"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class ChatInputDelegateImpl$internalStopRecording$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewModel $$context_receiver_0;
    final /* synthetic */ boolean $cancel;
    Object L$0;
    int label;
    final /* synthetic */ ChatInputDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputDelegateImpl$internalStopRecording$2(boolean z, ChatInputDelegateImpl chatInputDelegateImpl, ViewModel viewModel, Continuation<? super ChatInputDelegateImpl$internalStopRecording$2> continuation) {
        super(2, continuation);
        this.$cancel = z;
        this.this$0 = chatInputDelegateImpl;
        this.$$context_receiver_0 = viewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatInputDelegateImpl$internalStopRecording$2(this.$cancel, this.this$0, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatInputDelegateImpl$internalStopRecording$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AudioRecorderController audioRecorderController;
        AudioRecordingStateProvider audioRecordingStateProvider;
        AudioRecorderState current;
        long j;
        AudioRecorderController audioRecorderController2;
        ChatClientInteractor chatClientInteractor;
        String str;
        File file;
        String str2;
        VoiceRecordingAnalytics voiceRecordingAnalytics;
        String str3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$cancel) {
                audioRecordingStateProvider = this.this$0.recorderStateProvider;
                current = audioRecordingStateProvider.current();
                if (!(current instanceof AudioRecorderState.WithFile)) {
                    return Unit.INSTANCE;
                }
                long m6886getDurationUwyO8pc = ((AudioRecorderState.WithFile) current).getFile().m6886getDurationUwyO8pc();
                j = ChatInputDelegateImpl.MIN_AUDIO_DURATION;
                if (Duration.m8639compareToLRDsOJo(m6886getDurationUwyO8pc, j) >= 0) {
                    audioRecorderController2 = this.this$0.recorderController;
                    this.L$0 = current;
                    this.label = 1;
                    if (audioRecorderController2.stop(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatClientInteractor = this.this$0.chatClientInteractor;
                    str = this.this$0.chatId;
                    file = new File(((AudioRecorderState.WithFile) current).getFile().getPath());
                    str2 = this.this$0.chatId;
                    this.L$0 = null;
                    this.label = 2;
                    if (chatClientInteractor.handleEvent(str, new SendMessageEvent(new MessageToSend.Audio(file, str2)), this) == coroutine_suspended) {
                    }
                } else {
                    this.this$0.stopRecordAudio(this.$$context_receiver_0, true);
                    return Unit.INSTANCE;
                }
            } else {
                audioRecorderController = this.this$0.recorderController;
                this.label = 3;
                if (audioRecorderController.stopAndClear(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            current = (AudioRecorderState) this.L$0;
            ResultKt.throwOnFailure(obj);
            chatClientInteractor = this.this$0.chatClientInteractor;
            str = this.this$0.chatId;
            file = new File(((AudioRecorderState.WithFile) current).getFile().getPath());
            str2 = this.this$0.chatId;
            this.L$0 = null;
            this.label = 2;
            if (chatClientInteractor.handleEvent(str, new SendMessageEvent(new MessageToSend.Audio(file, str2)), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 2) {
            if (i == 3) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        voiceRecordingAnalytics = this.this$0.voiceRecordingAnalytics;
        str3 = this.this$0.chatId;
        voiceRecordingAnalytics.trackUserSendRecording(str3);
        return Unit.INSTANCE;
    }
}
