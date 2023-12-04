package com.ifriend.domain.newChat.chat.systems.messages.sending.send;

import com.ifriend.common_entities_engine.Event;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SendingMessagesSystem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesSystem$onHandleEvent$2", f = "SendingMessagesSystem.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class SendingMessagesSystem$onHandleEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Event $event;
    int label;
    final /* synthetic */ SendingMessagesSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendingMessagesSystem$onHandleEvent$2(SendingMessagesSystem sendingMessagesSystem, Event event, Continuation<? super SendingMessagesSystem$onHandleEvent$2> continuation) {
        super(2, continuation);
        this.this$0 = sendingMessagesSystem;
        this.$event = event;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SendingMessagesSystem$onHandleEvent$2(this.this$0, this.$event, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SendingMessagesSystem$onHandleEvent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatMessagesRepository chatMessagesRepository;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatMessagesRepository = this.this$0.chatMessagesRepository;
            MessageToSend messageToSend = ((SendMessageEvent) this.$event).getMessageToSend();
            str = this.this$0.chatId;
            this.label = 1;
            if (chatMessagesRepository.sendMessages(str, messageToSend, this) == coroutine_suspended) {
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
