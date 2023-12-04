package com.ifriend.presentation.services;

import com.ifriend.domain.socket.MessagesSourceMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* compiled from: ChatService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$ChatSubscription;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.services.ChatServiceImpl$start$2", f = "ChatService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatServiceImpl$start$2 extends SuspendLambda implements Function2<MessagesSourceMessage.Chat.ChatSubscription, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatServiceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatServiceImpl$start$2(ChatServiceImpl chatServiceImpl, Continuation<? super ChatServiceImpl$start$2> continuation) {
        super(2, continuation);
        this.this$0 = chatServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatServiceImpl$start$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MessagesSourceMessage.Chat.ChatSubscription chatSubscription, Continuation<? super Unit> continuation) {
        return ((ChatServiceImpl$start$2) create(chatSubscription, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.updateChats();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
