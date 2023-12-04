package com.ifriend.chat.new_chat.list.delegate;

import com.ifriend.chat.new_chat.list.presentationSystems.audio.playback.AudioClickEvent;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageUiModel;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnAudioMessageClickDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.delegate.OnAudioMessageClickDelegate$onAudioPlayButtonClick$2", f = "OnAudioMessageClickDelegate.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class OnAudioMessageClickDelegate$onAudioPlayButtonClick$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ AudioMessageUiModel $model;
    int label;
    final /* synthetic */ OnAudioMessageClickDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnAudioMessageClickDelegate$onAudioPlayButtonClick$2(AudioMessageUiModel audioMessageUiModel, OnAudioMessageClickDelegate onAudioMessageClickDelegate, String str, Continuation<? super OnAudioMessageClickDelegate$onAudioPlayButtonClick$2> continuation) {
        super(2, continuation);
        this.$model = audioMessageUiModel;
        this.this$0 = onAudioMessageClickDelegate;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnAudioMessageClickDelegate$onAudioPlayButtonClick$2(this.$model, this.this$0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnAudioMessageClickDelegate$onAudioPlayButtonClick$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatClientInteractor chatClientInteractor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Object payload = this.$model.getPayload();
            ChatMessage chatMessage = payload instanceof ChatMessage ? (ChatMessage) payload : null;
            if (chatMessage == null) {
                return Unit.INSTANCE;
            }
            MessageContent content = chatMessage.getContent();
            MessageContent.Audio audio = content instanceof MessageContent.Audio ? (MessageContent.Audio) content : null;
            if (audio == null) {
                return Unit.INSTANCE;
            }
            chatClientInteractor = this.this$0.chatClientInteractor;
            this.label = 1;
            if (chatClientInteractor.handleEvent(this.$chatId, new AudioClickEvent(chatMessage.getInfo(), audio), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
