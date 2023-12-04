package com.ifriend.presentation.features.chat.message;

import androidx.lifecycle.ViewModel;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAccessReason;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatMessageAccessDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegateImpl$handleChatSubscriptionAccessException$2", f = "ChatMessageAccessDelegate.kt", i = {0}, l = {254, 260}, m = "invokeSuspend", n = {"requestId"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class ChatMessageAccessDelegateImpl$handleChatSubscriptionAccessException$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewModel $$context_receiver_0;
    final /* synthetic */ ChatMessageAccessReason $accessActionType;
    final /* synthetic */ String $messageId;
    Object L$0;
    int label;
    final /* synthetic */ ChatMessageAccessDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageAccessDelegateImpl$handleChatSubscriptionAccessException$2(ChatMessageAccessDelegateImpl chatMessageAccessDelegateImpl, String str, ChatMessageAccessReason chatMessageAccessReason, ViewModel viewModel, Continuation<? super ChatMessageAccessDelegateImpl$handleChatSubscriptionAccessException$2> continuation) {
        super(2, continuation);
        this.this$0 = chatMessageAccessDelegateImpl;
        this.$messageId = str;
        this.$accessActionType = chatMessageAccessReason;
        this.$$context_receiver_0 = viewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatMessageAccessDelegateImpl$handleChatSubscriptionAccessException$2(this.this$0, this.$messageId, this.$accessActionType, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatMessageAccessDelegateImpl$handleChatSubscriptionAccessException$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UUID randomUUID;
        Object sendBuyChatSubscriptionEvent;
        PaymentResultFlow paymentResultFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            randomUUID = UUID.randomUUID();
            ChatMessageAccessDelegateImpl chatMessageAccessDelegateImpl = this.this$0;
            Intrinsics.checkNotNull(randomUUID);
            this.L$0 = randomUUID;
            this.label = 1;
            sendBuyChatSubscriptionEvent = chatMessageAccessDelegateImpl.sendBuyChatSubscriptionEvent(randomUUID, this.$messageId, this.$accessActionType, this);
            if (sendBuyChatSubscriptionEvent == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            randomUUID = (UUID) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        paymentResultFlow = this.this$0.paymentResultFlow;
        Intrinsics.checkNotNull(randomUUID);
        Flow<Boolean> paymentResultFlow2 = paymentResultFlow.getPaymentResultFlow(randomUUID);
        final ChatMessageAccessDelegateImpl chatMessageAccessDelegateImpl2 = this.this$0;
        final ViewModel viewModel = this.$$context_receiver_0;
        final String str = this.$messageId;
        final ChatMessageAccessReason chatMessageAccessReason = this.$accessActionType;
        this.L$0 = null;
        this.label = 2;
        if (paymentResultFlow2.collect(new FlowCollector<Boolean>() { // from class: com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegateImpl$handleChatSubscriptionAccessException$2.1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation) {
                return emit(bool.booleanValue(), continuation);
            }

            public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                if (z) {
                    ChatMessageAccessDelegateImpl.this.requestAccessAfterUpdateSubscription(viewModel, str, chatMessageAccessReason);
                }
                return Unit.INSTANCE;
            }
        }, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
