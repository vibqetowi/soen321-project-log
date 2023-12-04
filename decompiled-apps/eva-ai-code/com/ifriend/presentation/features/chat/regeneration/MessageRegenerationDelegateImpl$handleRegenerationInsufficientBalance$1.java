package com.ifriend.presentation.features.chat.regeneration;

import androidx.lifecycle.ViewModel;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyNeuronsBillingUiParams;
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
/* compiled from: MessageRegenerationDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegateImpl$handleRegenerationInsufficientBalance$1", f = "MessageRegenerationDelegate.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class MessageRegenerationDelegateImpl$handleRegenerationInsufficientBalance$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewModel $$context_receiver_0;
    final /* synthetic */ String $chatId;
    final /* synthetic */ String $messageId;
    int label;
    final /* synthetic */ MessageRegenerationDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageRegenerationDelegateImpl$handleRegenerationInsufficientBalance$1(MessageRegenerationDelegateImpl messageRegenerationDelegateImpl, ViewModel viewModel, String str, String str2, Continuation<? super MessageRegenerationDelegateImpl$handleRegenerationInsufficientBalance$1> continuation) {
        super(2, continuation);
        this.this$0 = messageRegenerationDelegateImpl;
        this.$$context_receiver_0 = viewModel;
        this.$chatId = str;
        this.$messageId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageRegenerationDelegateImpl$handleRegenerationInsufficientBalance$1(this.this$0, this.$$context_receiver_0, this.$chatId, this.$messageId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageRegenerationDelegateImpl$handleRegenerationInsufficientBalance$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppEventsEmitter appEventsEmitter;
        PaymentResultFlow paymentResultFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID randomUUID = UUID.randomUUID();
            appEventsEmitter = this.this$0.appEventsEmitter;
            PurchaseSource purchaseSource = PurchaseSource.CHAT;
            Intrinsics.checkNotNull(randomUUID);
            appEventsEmitter.emit(new AppEvents.Billing.BuyNeurons(new BuyNeuronsBillingUiParams(false, null, purchaseSource, randomUUID, 3, null)));
            paymentResultFlow = this.this$0.paymentResultFlow;
            Flow<Boolean> paymentResultFlow2 = paymentResultFlow.getPaymentResultFlow(randomUUID);
            final MessageRegenerationDelegateImpl messageRegenerationDelegateImpl = this.this$0;
            final ViewModel viewModel = this.$$context_receiver_0;
            final String str = this.$chatId;
            final String str2 = this.$messageId;
            this.label = 1;
            if (paymentResultFlow2.collect(new FlowCollector<Boolean>() { // from class: com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegateImpl$handleRegenerationInsufficientBalance$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation) {
                    return emit(bool.booleanValue(), continuation);
                }

                public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                    if (z) {
                        MessageRegenerationDelegateImpl.this.regenerateMessage(viewModel, str, str2);
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
