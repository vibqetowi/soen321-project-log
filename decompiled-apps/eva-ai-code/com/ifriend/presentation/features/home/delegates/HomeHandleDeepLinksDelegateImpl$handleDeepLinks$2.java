package com.ifriend.presentation.features.home.delegates;

import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.domain.data.deeplinks.DeepLink;
import com.ifriend.domain.data.deeplinks.DeepLinksRepository;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyNeuronsBillingUiParams;
import com.ifriend.presentation.common.observers.appevents.params.BuySubscriptionBillingUiParams;
import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeHandleDeepLinksDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.home.delegates.HomeHandleDeepLinksDelegateImpl$handleDeepLinks$2", f = "HomeHandleDeepLinksDelegate.kt", i = {}, l = {36, 40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class HomeHandleDeepLinksDelegateImpl$handleDeepLinks$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeViewModel $$context_receiver_0;
    int label;
    final /* synthetic */ HomeHandleDeepLinksDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeHandleDeepLinksDelegateImpl$handleDeepLinks$2(HomeHandleDeepLinksDelegateImpl homeHandleDeepLinksDelegateImpl, HomeViewModel homeViewModel, Continuation<? super HomeHandleDeepLinksDelegateImpl$handleDeepLinks$2> continuation) {
        super(2, continuation);
        this.this$0 = homeHandleDeepLinksDelegateImpl;
        this.$$context_receiver_0 = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeHandleDeepLinksDelegateImpl$handleDeepLinks$2(this.this$0, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeHandleDeepLinksDelegateImpl$handleDeepLinks$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DeepLinksRepository deepLinksRepository;
        AppEventsEmitter appEventsEmitter;
        AppEventsEmitter appEventsEmitter2;
        Object navigateToDefaultChat;
        Object navigateToDefaultChat2;
        DeepLinksRepository deepLinksRepository2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                deepLinksRepository2 = this.this$0.deepLinksRepository;
                deepLinksRepository2.clear();
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        ResultKt.throwOnFailure(obj);
        deepLinksRepository = this.this$0.deepLinksRepository;
        DeepLink deepLink = deepLinksRepository.getDeepLink();
        if (deepLink == null) {
            return Unit.INSTANCE;
        }
        if (deepLink instanceof DeepLink.OpenGenerateAvatar ? true : deepLink instanceof DeepLink.OpenDiary) {
            this.label = 1;
            navigateToDefaultChat2 = this.this$0.navigateToDefaultChat(this.$$context_receiver_0, this);
            if (navigateToDefaultChat2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (deepLink instanceof DeepLink.OpenChat) {
            this.label = 2;
            navigateToDefaultChat = this.this$0.navigateToDefaultChat(this.$$context_receiver_0, this);
            if (navigateToDefaultChat == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (deepLink instanceof DeepLink.OpenNeurons) {
            appEventsEmitter2 = this.this$0.appEventsEmitter;
            appEventsEmitter2.emit(new AppEvents.Billing.BuyNeurons(new BuyNeuronsBillingUiParams(false, null, PurchaseSource.DEEPLINK, null, 11, null)));
        } else if (deepLink instanceof DeepLink.OpenSubscription) {
            appEventsEmitter = this.this$0.appEventsEmitter;
            appEventsEmitter.emit(new AppEvents.Billing.BuySubscription(new BuySubscriptionBillingUiParams(null, false, UpgradeType.DEEPLINK, null, 11, null)));
        }
        deepLinksRepository2 = this.this$0.deepLinksRepository;
        deepLinksRepository2.clear();
        return Unit.INSTANCE;
    }
}
