package com.ifriend.chat.data.chat.sending;

import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue;
import com.ifriend.domain.socket.MessagesSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatMessagesRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.data.chat.sending.ChatMessagesRepositoryImpl$sendQueuedMessage$2$1", f = "ChatMessagesRepositoryImpl.kt", i = {}, l = {124, 125, WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatMessagesRepositoryImpl$sendQueuedMessage$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SendingMessagesQueue.QueuedMessage $message;
    int label;
    final /* synthetic */ ChatMessagesRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessagesRepositoryImpl$sendQueuedMessage$2$1(ChatMessagesRepositoryImpl chatMessagesRepositoryImpl, SendingMessagesQueue.QueuedMessage queuedMessage, Continuation<? super ChatMessagesRepositoryImpl$sendQueuedMessage$2$1> continuation) {
        super(2, continuation);
        this.this$0 = chatMessagesRepositoryImpl;
        this.$message = queuedMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatMessagesRepositoryImpl$sendQueuedMessage$2$1(this.this$0, this.$message, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatMessagesRepositoryImpl$sendQueuedMessage$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MessagesSource messagesSource;
        Object sendMessage;
        SendingMessagesQueue sendingMessagesQueue;
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
            if (i != 2) {
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            sendingMessagesQueue = this.this$0.queue;
            this.label = 3;
            if (sendingMessagesQueue.delete(this.$message, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        sendMessage = this.this$0.sendMessage(this.$message.getMessageToSend(), this.$message.getChatId(), this.$message.getTag(), this);
        if (sendMessage == coroutine_suspended) {
            return coroutine_suspended;
        }
        sendingMessagesQueue = this.this$0.queue;
        this.label = 3;
        if (sendingMessagesQueue.delete(this.$message, this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
