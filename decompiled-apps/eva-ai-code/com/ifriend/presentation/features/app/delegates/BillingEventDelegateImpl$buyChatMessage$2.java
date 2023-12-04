package com.ifriend.presentation.features.app.delegates;

import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatType;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.models.profile.user.UserKt;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatMessageBillingUiParams;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.common.observers.appevents.params.BuySubscriptionBillingUiParams;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingEventDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.BillingEventDelegateImpl$buyChatMessage$2", f = "BillingEventDelegate.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BillingEventDelegateImpl$buyChatMessage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BuyChatMessageBillingUiParams $params;
    int label;
    final /* synthetic */ BillingEventDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingEventDelegateImpl$buyChatMessage$2(BillingEventDelegateImpl billingEventDelegateImpl, BuyChatMessageBillingUiParams buyChatMessageBillingUiParams, Continuation<? super BillingEventDelegateImpl$buyChatMessage$2> continuation) {
        super(2, continuation);
        this.this$0 = billingEventDelegateImpl;
        this.$params = buyChatMessageBillingUiParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingEventDelegateImpl$buyChatMessage$2(this.this$0, this.$params, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BillingEventDelegateImpl$buyChatMessage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatsInfoInteractor chatsInfoInteractor;
        UserRepository userRepository;
        AppEventsEmitter appEventsEmitter;
        AppEventsEmitter appEventsEmitter2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatsInfoInteractor = this.this$0.chatsInfoInteractor;
            this.label = 1;
            obj = chatsInfoInteractor.getChatInfo(this.$params.getChatId(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        if (obj != null) {
            ChatInfo chatInfo = (ChatInfo) obj;
            userRepository = this.this$0.userRepository;
            User currentUser = userRepository.getCurrentUser();
            boolean z = false;
            if (currentUser != null && UserKt.isPremium(currentUser)) {
                z = true;
            }
            if (chatInfo.getChatType() == ChatType.INFLUENCER && !chatInfo.isSubscriptionActivated()) {
                BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams = new BuyChatSubscriptionBillingUiParams(this.$params.getRequestId(), chatInfo.getChatId(), true, this.$params.getUpgradeType(), this.$params.getPurchaseReason(), (PurchaseSource) null, 32, (DefaultConstructorMarker) null);
                appEventsEmitter2 = this.this$0.appEventsEmitter;
                appEventsEmitter2.emit(new AppEvents.Billing.BuyChatSubscription(buyChatSubscriptionBillingUiParams));
            } else if (z || chatInfo.getChatType() == ChatType.INFLUENCER) {
                this.this$0.buyNeurons(this.$params);
            } else {
                BuySubscriptionBillingUiParams buySubscriptionBillingUiParams = new BuySubscriptionBillingUiParams(this.$params.getRequestId(), true, this.$params.getUpgradeType(), this.$params.getPurchaseReason());
                appEventsEmitter = this.this$0.appEventsEmitter;
                appEventsEmitter.emit(new AppEvents.Billing.BuySubscription(buySubscriptionBillingUiParams));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
