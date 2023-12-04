package com.ifriend.presentation.features.purchases.billing.delegate;

import com.ifriend.domain.logic.chat.events.ChatEventsInteractor;
import com.ifriend.domain.socket.MessagesSourceMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingPurchaseDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$NeuronesChanged;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$2$1", f = "BillingPurchaseDelegate.kt", i = {}, l = {342}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BillingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MessagesSourceMessage.NeuronesChanged>, Object> {
    final /* synthetic */ BillingPurchaseDelegateImpl $this_runCatching;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$2$1(BillingPurchaseDelegateImpl billingPurchaseDelegateImpl, Continuation<? super BillingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$2$1> continuation) {
        super(2, continuation);
        this.$this_runCatching = billingPurchaseDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$2$1(this.$this_runCatching, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MessagesSourceMessage.NeuronesChanged> continuation) {
        return ((BillingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatEventsInteractor chatEventsInteractor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatEventsInteractor = this.$this_runCatching.chatEventsInteractor;
            this.label = 1;
            obj = FlowKt.firstOrNull(chatEventsInteractor.getChatNeuronesChangedFlow(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
