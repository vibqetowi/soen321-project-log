package com.ifriend.domain.newChat.chat.systems.firstChat;

import com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository;
import com.ifriend.domain.socket.MessagesSource;
import java.util.concurrent.atomic.AtomicBoolean;
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
/* compiled from: RequestBotSendFirstMessageSystem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.newChat.chat.systems.firstChat.RequestBotSendFirstMessageSystem$onUpdateState$2", f = "RequestBotSendFirstMessageSystem.kt", i = {}, l = {36, 37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class RequestBotSendFirstMessageSystem$onUpdateState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RequestBotSendFirstMessageSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestBotSendFirstMessageSystem$onUpdateState$2(RequestBotSendFirstMessageSystem requestBotSendFirstMessageSystem, Continuation<? super RequestBotSendFirstMessageSystem$onUpdateState$2> continuation) {
        super(2, continuation);
        this.this$0 = requestBotSendFirstMessageSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RequestBotSendFirstMessageSystem$onUpdateState$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RequestBotSendFirstMessageSystem$onUpdateState$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MessagesSource messagesSource;
        ChatMessagesRepository chatMessagesRepository;
        String str;
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            messagesSource = this.this$0.messagesSource;
            this.label = 1;
            if (messagesSource.waitUntilRunning(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                boolean booleanValue = ((Boolean) obj).booleanValue();
                atomicBoolean = this.this$0.isMessageRequested;
                atomicBoolean.set(booleanValue);
                atomicBoolean2 = this.this$0.isRequestInProgress;
                atomicBoolean2.set(false);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        chatMessagesRepository = this.this$0.chatMessagesRepository;
        str = this.this$0.chatId;
        this.label = 2;
        obj = chatMessagesRepository.initFirstChat(str, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        boolean booleanValue2 = ((Boolean) obj).booleanValue();
        atomicBoolean = this.this$0.isMessageRequested;
        atomicBoolean.set(booleanValue2);
        atomicBoolean2 = this.this$0.isRequestInProgress;
        atomicBoolean2.set(false);
        return Unit.INSTANCE;
    }
}
