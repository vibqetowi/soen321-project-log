package com.ifriend.presentation.services;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.newChat.chat.systems.events.regeneration.MessageRegeneratingEvent;
import com.ifriend.domain.socket.MessagesSourceMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: ChatMessagesService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$ChatRegenerateMessageFailed;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.services.ChatMessagesServiceImpl$start$8", f = "ChatMessagesService.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatMessagesServiceImpl$start$8 extends SuspendLambda implements Function2<MessagesSourceMessage.Chat.ChatRegenerateMessageFailed, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatMessagesServiceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessagesServiceImpl$start$8(ChatMessagesServiceImpl chatMessagesServiceImpl, Continuation<? super ChatMessagesServiceImpl$start$8> continuation) {
        super(2, continuation);
        this.this$0 = chatMessagesServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatMessagesServiceImpl$start$8 chatMessagesServiceImpl$start$8 = new ChatMessagesServiceImpl$start$8(this.this$0, continuation);
        chatMessagesServiceImpl$start$8.L$0 = obj;
        return chatMessagesServiceImpl$start$8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MessagesSourceMessage.Chat.ChatRegenerateMessageFailed chatRegenerateMessageFailed, Continuation<? super Unit> continuation) {
        return ((ChatMessagesServiceImpl$start$8) create(chatRegenerateMessageFailed, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatClientInteractor chatClientInteractor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MessagesSourceMessage.Chat.ChatRegenerateMessageFailed chatRegenerateMessageFailed = (MessagesSourceMessage.Chat.ChatRegenerateMessageFailed) this.L$0;
            chatClientInteractor = this.this$0.chatClientInteractor;
            this.label = 1;
            if (chatClientInteractor.handleEvent(chatRegenerateMessageFailed.getChatId(), new MessageRegeneratingEvent(chatRegenerateMessageFailed.getMessageId(), false), this) == coroutine_suspended) {
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
