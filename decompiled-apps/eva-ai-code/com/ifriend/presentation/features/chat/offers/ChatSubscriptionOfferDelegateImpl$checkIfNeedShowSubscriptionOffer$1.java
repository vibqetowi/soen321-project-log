package com.ifriend.presentation.features.chat.offers;

import com.ifriend.domain.logic.offers.ChatSubscriptionOfferInteractor;
import com.ifriend.domain.models.offer.ChatSubscriptionOfferType;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuySubscriptionBillingUiParams;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatSubscriptionOfferDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.offers.ChatSubscriptionOfferDelegateImpl$checkIfNeedShowSubscriptionOffer$1", f = "ChatSubscriptionOfferDelegate.kt", i = {}, l = {28, 37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatSubscriptionOfferDelegateImpl$checkIfNeedShowSubscriptionOffer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatSubscriptionOfferDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSubscriptionOfferDelegateImpl$checkIfNeedShowSubscriptionOffer$1(ChatSubscriptionOfferDelegateImpl chatSubscriptionOfferDelegateImpl, Continuation<? super ChatSubscriptionOfferDelegateImpl$checkIfNeedShowSubscriptionOffer$1> continuation) {
        super(2, continuation);
        this.this$0 = chatSubscriptionOfferDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatSubscriptionOfferDelegateImpl$checkIfNeedShowSubscriptionOffer$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatSubscriptionOfferDelegateImpl$checkIfNeedShowSubscriptionOffer$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatSubscriptionOfferInteractor chatSubscriptionOfferInteractor;
        AppEventsEmitter appEventsEmitter;
        ChatSubscriptionOfferInteractor chatSubscriptionOfferInteractor2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatSubscriptionOfferInteractor = this.this$0.chatSubscriptionOfferInteractor;
            this.label = 1;
            obj = chatSubscriptionOfferInteractor.getSubscriptionOfferType(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        ChatSubscriptionOfferType chatSubscriptionOfferType = (ChatSubscriptionOfferType) obj;
        if (chatSubscriptionOfferType != ChatSubscriptionOfferType.None) {
            appEventsEmitter = this.this$0.appEventsEmitter;
            appEventsEmitter.emit(new AppEvents.Billing.BuySubscription(new BuySubscriptionBillingUiParams(null, false, UpgradeType.AUTO_AFTER_N_DAYS, null, 11, null)));
            chatSubscriptionOfferInteractor2 = this.this$0.chatSubscriptionOfferInteractor;
            this.label = 2;
            if (chatSubscriptionOfferInteractor2.onOfferShown(chatSubscriptionOfferType, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
