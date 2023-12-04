package com.ifriend.presentation.features.chat.panel.delegate;

import androidx.lifecycle.ViewModel;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuySubscriptionBillingUiParams;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
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
/* compiled from: ChatPanelActionsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$showUpdateSubscription$2", f = "ChatPanelActionsDelegate.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatPanelActionsDelegateImpl$showUpdateSubscription$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewModel $$context_receiver_0;
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatPanelActionsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPanelActionsDelegateImpl$showUpdateSubscription$2(ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl, ViewModel viewModel, String str, Continuation<? super ChatPanelActionsDelegateImpl$showUpdateSubscription$2> continuation) {
        super(2, continuation);
        this.this$0 = chatPanelActionsDelegateImpl;
        this.$$context_receiver_0 = viewModel;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatPanelActionsDelegateImpl$showUpdateSubscription$2(this.this$0, this.$$context_receiver_0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatPanelActionsDelegateImpl$showUpdateSubscription$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Intrinsics.checkNotNull(randomUUID);
            BuySubscriptionBillingUiParams buySubscriptionBillingUiParams = new BuySubscriptionBillingUiParams(randomUUID, false, UpgradeType.CALL, null, 10, null);
            appEventsEmitter = this.this$0.appEventsEmitter;
            appEventsEmitter.emit(new AppEvents.Billing.BuySubscription(buySubscriptionBillingUiParams));
            paymentResultFlow = this.this$0.paymentResultFlow;
            Flow<Boolean> paymentResultFlow2 = paymentResultFlow.getPaymentResultFlow(randomUUID);
            final ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl = this.this$0;
            final ViewModel viewModel = this.$$context_receiver_0;
            final String str = this.$chatId;
            this.label = 1;
            if (paymentResultFlow2.collect(new FlowCollector<Boolean>() { // from class: com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$showUpdateSubscription$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation) {
                    return emit(bool.booleanValue(), continuation);
                }

                public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                    if (z) {
                        ChatPanelActionsDelegateImpl.this.chatCallUi(viewModel, str);
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
