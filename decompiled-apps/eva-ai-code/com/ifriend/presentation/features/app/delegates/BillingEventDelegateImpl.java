package com.ifriend.presentation.features.app.delegates;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.billing.api.logic.BillingInteractor;
import com.ifriend.chat.domain.billing.ShowRateAppAfterPurchaseUseCase;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.purchases.BillingPurchasesHistory;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.purchase.PurchaseType;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatMessageBillingUiParams;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.common.observers.appevents.params.BuyNeuronsBillingUiParams;
import com.ifriend.presentation.common.observers.appevents.params.BuySubscriptionBillingUiParams;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
/* compiled from: BillingEventDelegate.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BV\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0015\u0010\u0004\u001a\u0011\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005j\u0002`\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u00020\u001a¢\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001fH\u0002R\u00020\u001a¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0019\u0010!\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\"H\u0002R\u00020\u001a¢\u0006\u0002\u0010#J\u0019\u0010$\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020%H\u0002R\u00020\u001a¢\u0006\u0002\u0010&J\u0019\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)H\u0016R\u00020\u001a¢\u0006\u0002\u0010*J5\u0010+\u001a\u00020\u00192\u001e\b\u0004\u0010,\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190.\u0012\u0006\u0012\u0004\u0018\u00010/0-H\u0082\bR\u00020\u001aø\u0001\u0000¢\u0006\u0002\u00100J\u0019\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u000203H\u0002R\u00020\u001a¢\u0006\u0002\u00104R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u0011\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005j\u0002`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lcom/ifriend/presentation/features/app/delegates/BillingEventDelegateImpl;", "Lcom/ifriend/presentation/features/app/delegates/BillingEventDelegate;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "billingInteractor", "Lcom/ifriend/billing/api/logic/BillingInteractor;", "showRateAppAfterPurchaseUseCase", "Lcom/ifriend/chat/domain/billing/ShowRateAppAfterPurchaseUseCase;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "userProfileRepository", "Lcom/ifriend/domain/data/purchases/BillingPurchasesHistory;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "(Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/billing/api/logic/BillingInteractor;Lcom/ifriend/chat/domain/billing/ShowRateAppAfterPurchaseUseCase;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/domain/data/purchases/BillingPurchasesHistory;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;)V", "requestProductsJob", "Lkotlinx/coroutines/Job;", "buyChatMessage", "", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatMessageBillingUiParams;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatMessageBillingUiParams;)V", "buyChatSubscription", "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;)V", "buyNeurons", "Lcom/ifriend/presentation/common/observers/appevents/params/BuyNeuronsBillingUiParams;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lcom/ifriend/presentation/common/observers/appevents/params/BuyNeuronsBillingUiParams;)V", "buySubscription", "Lcom/ifriend/presentation/common/observers/appevents/params/BuySubscriptionBillingUiParams;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lcom/ifriend/presentation/common/observers/appevents/params/BuySubscriptionBillingUiParams;)V", "handleBillingEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing;)V", "makeRequest", "request", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lkotlin/jvm/functions/Function1;)V", "purchaseCompleted", "type", "Lcom/ifriend/domain/logic/purchase/PurchaseType;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lcom/ifriend/domain/logic/purchase/PurchaseType;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingEventDelegateImpl implements BillingEventDelegate {
    public static final int $stable = 8;
    private final AppEventsEmitter appEventsEmitter;
    private final BillingInteractor billingInteractor;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final DispatcherProvider dispatcherProvider;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private Job requestProductsJob;
    private final ShowRateAppAfterPurchaseUseCase showRateAppAfterPurchaseUseCase;
    private final BillingPurchasesHistory userProfileRepository;
    private final UserRepository userRepository;

    @Inject
    public BillingEventDelegateImpl(UserRepository userRepository, FlowObserverEmitter<Throwable> exceptionsEmitter, AppEventsEmitter appEventsEmitter, BillingInteractor billingInteractor, ShowRateAppAfterPurchaseUseCase showRateAppAfterPurchaseUseCase, DispatcherProvider dispatcherProvider, BillingPurchasesHistory userProfileRepository, ChatsInfoInteractor chatsInfoInteractor) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(billingInteractor, "billingInteractor");
        Intrinsics.checkNotNullParameter(showRateAppAfterPurchaseUseCase, "showRateAppAfterPurchaseUseCase");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(userProfileRepository, "userProfileRepository");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        this.userRepository = userRepository;
        this.exceptionsEmitter = exceptionsEmitter;
        this.appEventsEmitter = appEventsEmitter;
        this.billingInteractor = billingInteractor;
        this.showRateAppAfterPurchaseUseCase = showRateAppAfterPurchaseUseCase;
        this.dispatcherProvider = dispatcherProvider;
        this.userProfileRepository = userProfileRepository;
        this.chatsInfoInteractor = chatsInfoInteractor;
    }

    @Override // com.ifriend.presentation.features.app.delegates.BillingEventDelegate
    public void handleBillingEvent(AppViewModel context_receiver_0, AppEvents.Billing event) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof AppEvents.Billing.BuyNeurons) {
            buyNeurons(context_receiver_0, ((AppEvents.Billing.BuyNeurons) event).getParams());
        } else if (event instanceof AppEvents.Billing.BuySubscription) {
            buySubscription(context_receiver_0, ((AppEvents.Billing.BuySubscription) event).getParams());
        } else if (event instanceof AppEvents.Billing.BuyChatMessage) {
            buyChatMessage(context_receiver_0, ((AppEvents.Billing.BuyChatMessage) event).getParams());
        } else if (event instanceof AppEvents.Billing.BuyChatSubscription) {
            buyChatSubscription(context_receiver_0, ((AppEvents.Billing.BuyChatSubscription) event).getParams());
        } else if (!(event instanceof AppEvents.Billing.PurchaseCompleted)) {
            throw new NoWhenBranchMatchedException();
        } else {
            purchaseCompleted(context_receiver_0, ((AppEvents.Billing.PurchaseCompleted) event).getType());
        }
    }

    private final void buyNeurons(AppViewModel appViewModel, BuyNeuronsBillingUiParams buyNeuronsBillingUiParams) {
        Job job = this.requestProductsJob;
        boolean z = false;
        if (job != null && job.isActive()) {
            z = true;
        }
        if (z) {
            return;
        }
        Job safeLaunch$default = CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(appViewModel), new BillingEventDelegateImpl$makeRequest$1(this.exceptionsEmitter), null, new BillingEventDelegateImpl$buyNeurons$$inlined$makeRequest$1(appViewModel, null, this, appViewModel, buyNeuronsBillingUiParams), 2, null);
        safeLaunch$default.invokeOnCompletion(new BillingEventDelegateImpl$makeRequest$3$1(appViewModel, this));
        this.requestProductsJob = safeLaunch$default;
    }

    private final void buySubscription(AppViewModel appViewModel, BuySubscriptionBillingUiParams buySubscriptionBillingUiParams) {
        Job job = this.requestProductsJob;
        boolean z = false;
        if (job != null && job.isActive()) {
            z = true;
        }
        if (z) {
            return;
        }
        Job safeLaunch$default = CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(appViewModel), new BillingEventDelegateImpl$makeRequest$1(this.exceptionsEmitter), null, new BillingEventDelegateImpl$buySubscription$$inlined$makeRequest$1(appViewModel, null, this, appViewModel, buySubscriptionBillingUiParams), 2, null);
        safeLaunch$default.invokeOnCompletion(new BillingEventDelegateImpl$makeRequest$3$1(appViewModel, this));
        this.requestProductsJob = safeLaunch$default;
    }

    private final void buyChatSubscription(AppViewModel appViewModel, BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams) {
        Job job = this.requestProductsJob;
        boolean z = false;
        if (job != null && job.isActive()) {
            z = true;
        }
        if (z) {
            return;
        }
        Job safeLaunch$default = CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(appViewModel), new BillingEventDelegateImpl$makeRequest$1(this.exceptionsEmitter), null, new BillingEventDelegateImpl$buyChatSubscription$$inlined$makeRequest$1(appViewModel, null, this, appViewModel, buyChatSubscriptionBillingUiParams), 2, null);
        safeLaunch$default.invokeOnCompletion(new BillingEventDelegateImpl$makeRequest$3$1(appViewModel, this));
        this.requestProductsJob = safeLaunch$default;
    }

    private final void makeRequest(AppViewModel appViewModel, Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
        Job safeLaunch$default = CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(appViewModel), new BillingEventDelegateImpl$makeRequest$1(this.exceptionsEmitter), null, new BillingEventDelegateImpl$makeRequest$2(appViewModel, function1, null), 2, null);
        safeLaunch$default.invokeOnCompletion(new BillingEventDelegateImpl$makeRequest$3$1(appViewModel, this));
        this.requestProductsJob = safeLaunch$default;
    }

    private final void buyChatMessage(AppViewModel appViewModel, BuyChatMessageBillingUiParams buyChatMessageBillingUiParams) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(appViewModel), new BillingEventDelegateImpl$buyChatMessage$1(this.exceptionsEmitter), null, new BillingEventDelegateImpl$buyChatMessage$2(this, buyChatMessageBillingUiParams, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void buyNeurons(BuyChatMessageBillingUiParams buyChatMessageBillingUiParams) {
        this.appEventsEmitter.emit(new AppEvents.Billing.BuyNeurons(new BuyNeuronsBillingUiParams(false, buyChatMessageBillingUiParams.getPurchaseReason(), buyChatMessageBillingUiParams.getPurchaseSource(), buyChatMessageBillingUiParams.getRequestId())));
    }

    private final void purchaseCompleted(AppViewModel appViewModel, PurchaseType purchaseType) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(appViewModel), null, null, new BillingEventDelegateImpl$purchaseCompleted$1(this, purchaseType, null), 3, null);
    }
}
