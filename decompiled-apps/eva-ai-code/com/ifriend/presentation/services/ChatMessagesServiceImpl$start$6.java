package com.ifriend.presentation.services;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.domain.socket.MessagesSourceMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* compiled from: ChatMessagesService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$MessageRemoved;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.services.ChatMessagesServiceImpl$start$6", f = "ChatMessagesService.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatMessagesServiceImpl$start$6 extends SuspendLambda implements Function2<MessagesSourceMessage.Chat.MessageRemoved, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatMessagesServiceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessagesServiceImpl$start$6(ChatMessagesServiceImpl chatMessagesServiceImpl, Continuation<? super ChatMessagesServiceImpl$start$6> continuation) {
        super(2, continuation);
        this.this$0 = chatMessagesServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatMessagesServiceImpl$start$6 chatMessagesServiceImpl$start$6 = new ChatMessagesServiceImpl$start$6(this.this$0, continuation);
        chatMessagesServiceImpl$start$6.L$0 = obj;
        return chatMessagesServiceImpl$start$6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MessagesSourceMessage.Chat.MessageRemoved messageRemoved, Continuation<? super Unit> continuation) {
        return ((ChatMessagesServiceImpl$start$6) create(messageRemoved, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object removeMessage;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MessagesSourceMessage.Chat.MessageRemoved messageRemoved = (MessagesSourceMessage.Chat.MessageRemoved) this.L$0;
            this.label = 1;
            removeMessage = this.this$0.removeMessage(messageRemoved.getChatId(), messageRemoved.getMessageId(), this);
            if (removeMessage == coroutine_suspended) {
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
