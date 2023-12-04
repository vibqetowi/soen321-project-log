package com.ifriend.presentation.services;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.domain.logic.chat.info.ActivateNewChatUseCase;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatoptionsKt;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$ChatMessageEvent;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.services.ChatMessagesServiceImpl$start$3", f = "ChatMessagesService.kt", i = {0}, l = {74, 76, 77}, m = "invokeSuspend", n = {"chatId"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class ChatMessagesServiceImpl$start$3 extends SuspendLambda implements Function2<MessagesSourceMessage.Chat.ChatMessageEvent, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatMessagesServiceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessagesServiceImpl$start$3(ChatMessagesServiceImpl chatMessagesServiceImpl, Continuation<? super ChatMessagesServiceImpl$start$3> continuation) {
        super(2, continuation);
        this.this$0 = chatMessagesServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatMessagesServiceImpl$start$3 chatMessagesServiceImpl$start$3 = new ChatMessagesServiceImpl$start$3(this.this$0, continuation);
        chatMessagesServiceImpl$start$3.L$0 = obj;
        return chatMessagesServiceImpl$start$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MessagesSourceMessage.Chat.ChatMessageEvent chatMessageEvent, Continuation<? super Unit> continuation) {
        return ((ChatMessagesServiceImpl$start$3) create(chatMessageEvent, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String senderId;
        ChatsInfoInteractor chatsInfoInteractor;
        ActivateNewChatUseCase activateNewChatUseCase;
        ActivateNewChatUseCase activateNewChatUseCase2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            senderId = ((MessagesSourceMessage.Chat.ChatMessageEvent) this.L$0).getChatMessage().getInfo().getIds().getSenderId();
            chatsInfoInteractor = this.this$0.chatsInfoInteractor;
            this.L$0 = senderId;
            this.label = 1;
            obj = chatsInfoInteractor.getChatInfo(senderId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2 || i == 3) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            senderId = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ChatInfo chatInfo = (ChatInfo) obj;
        if (chatInfo == null) {
            activateNewChatUseCase2 = this.this$0.activateNewChatUseCase;
            this.L$0 = null;
            this.label = 2;
            if (activateNewChatUseCase2.execute(senderId, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (!ChatoptionsKt.isCanChatting(chatInfo)) {
            activateNewChatUseCase = this.this$0.activateNewChatUseCase;
            this.L$0 = null;
            this.label = 3;
            if (activateNewChatUseCase.execute(senderId, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
