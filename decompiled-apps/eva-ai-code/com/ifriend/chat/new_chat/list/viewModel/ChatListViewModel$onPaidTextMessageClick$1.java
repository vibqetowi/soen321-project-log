package com.ifriend.chat.new_chat.list.viewModel;

import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.features.chat.common.ChatEvents;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatListViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel$onPaidTextMessageClick$1", f = "ChatListViewModel.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatListViewModel$onPaidTextMessageClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $messageId;
    int label;
    final /* synthetic */ ChatListViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListViewModel$onPaidTextMessageClick$1(ChatListViewModel chatListViewModel, String str, Continuation<? super ChatListViewModel$onPaidTextMessageClick$1> continuation) {
        super(2, continuation);
        this.this$0 = chatListViewModel;
        this.$messageId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatListViewModel$onPaidTextMessageClick$1(this.this$0, this.$messageId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatListViewModel$onPaidTextMessageClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowObserverEmitter flowObserverEmitter;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowObserverEmitter = this.this$0.chatEventsEmitter;
            this.label = 1;
            if (flowObserverEmitter.emit(new ChatEvents.PaidTextMessageClick(this.$messageId), this) == coroutine_suspended) {
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
