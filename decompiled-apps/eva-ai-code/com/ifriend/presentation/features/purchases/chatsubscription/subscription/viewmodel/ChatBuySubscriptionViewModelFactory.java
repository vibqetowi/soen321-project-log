package com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.bolts.AppLinks;
import com.facebook.internal.NativeProtocol;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.billing.api.models.BillingPurchaseProductType;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.refresh.ChatsRefreshConfigurationUseCase;
import com.ifriend.domain.logic.topics.ChatPanelActionsInteractor;
import com.ifriend.platform.tools.api.AppInfoProvider;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.analytics.ChatAnalyticsInteractor;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.common.observers.purchases.PaymentResultEmitter;
import com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegateImpl;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.mappers.ChatBuySubscriptionOfferUiMapper;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatBuySubscriptionViewModelFactory.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001,B\u0090\u0001\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0015\u0010\f\u001a\u0011\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rj\u0002`\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"¢\u0006\u0002\u0010#J-\u0010$\u001a\u0002H%\"\b\b\u0000\u0010%*\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H%0(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0002\u0010+R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u0011\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rj\u0002`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "chatHeaderDelegate", "Lcom/ifriend/presentation/features/profile/header/delegate/ChatHeaderDelegateImpl;", "chatsConfigurationInteractor", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;", "chatPanelActionsInteractor", "Lcom/ifriend/domain/logic/topics/ChatPanelActionsInteractor;", "billingPurchaseDelegate", "Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate$Factory;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "subscriptionOfferUiMapper", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/mappers/ChatBuySubscriptionOfferUiMapper;", "appInfoProvider", "Lcom/ifriend/platform/tools/api/AppInfoProvider;", "refreshConfigurationUseCase", "Lcom/ifriend/domain/logic/chat/refresh/ChatsRefreshConfigurationUseCase;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "paymentResultEmitter", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultEmitter;", "chatAnalyticsInteractor", "Lcom/ifriend/presentation/analytics/ChatAnalyticsInteractor;", "(Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;Lcom/ifriend/presentation/features/profile/header/delegate/ChatHeaderDelegateImpl;Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;Lcom/ifriend/domain/logic/topics/ChatPanelActionsInteractor;Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate$Factory;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/mappers/ChatBuySubscriptionOfferUiMapper;Lcom/ifriend/platform/tools/api/AppInfoProvider;Lcom/ifriend/domain/logic/chat/refresh/ChatsRefreshConfigurationUseCase;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/presentation/common/observers/purchases/PaymentResultEmitter;Lcom/ifriend/presentation/analytics/ChatAnalyticsInteractor;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", AppLinks.KEY_NAME_EXTRAS, "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Factory", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final AnalyticsInteractor analyticsInteractor;
    private final AppEventsEmitter appEventsEmitter;
    private final AppInfoProvider appInfoProvider;
    private final BillingPurchaseDelegate.Factory billingPurchaseDelegate;
    private final ChatAnalyticsInteractor chatAnalyticsInteractor;
    private final ChatHeaderDelegateImpl chatHeaderDelegate;
    private final ChatPanelActionsInteractor chatPanelActionsInteractor;
    private final ChatsConfigurationInteractor chatsConfigurationInteractor;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final BuyChatSubscriptionBillingUiParams params;
    private final PaymentResultEmitter paymentResultEmitter;
    private final ChatsRefreshConfigurationUseCase refreshConfigurationUseCase;
    private final ResourceProvider resourceProvider;
    private final ChatBuySubscriptionOfferUiMapper subscriptionOfferUiMapper;

    /* compiled from: ChatBuySubscriptionViewModelFactory.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModelFactory$Factory;", "", "create", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModelFactory;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Factory {
        ChatBuySubscriptionViewModelFactory create(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls);
    }

    @AssistedInject
    public ChatBuySubscriptionViewModelFactory(@Assisted BuyChatSubscriptionBillingUiParams params, ChatHeaderDelegateImpl chatHeaderDelegate, ChatsConfigurationInteractor chatsConfigurationInteractor, ChatPanelActionsInteractor chatPanelActionsInteractor, BillingPurchaseDelegate.Factory billingPurchaseDelegate, FlowObserverEmitter<Throwable> exceptionsEmitter, AppEventsEmitter appEventsEmitter, ResourceProvider resourceProvider, AnalyticsInteractor analyticsInteractor, ChatBuySubscriptionOfferUiMapper subscriptionOfferUiMapper, AppInfoProvider appInfoProvider, ChatsRefreshConfigurationUseCase refreshConfigurationUseCase, ChatsInfoInteractor chatsInfoInteractor, PaymentResultEmitter paymentResultEmitter, ChatAnalyticsInteractor chatAnalyticsInteractor) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(chatHeaderDelegate, "chatHeaderDelegate");
        Intrinsics.checkNotNullParameter(chatsConfigurationInteractor, "chatsConfigurationInteractor");
        Intrinsics.checkNotNullParameter(chatPanelActionsInteractor, "chatPanelActionsInteractor");
        Intrinsics.checkNotNullParameter(billingPurchaseDelegate, "billingPurchaseDelegate");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(subscriptionOfferUiMapper, "subscriptionOfferUiMapper");
        Intrinsics.checkNotNullParameter(appInfoProvider, "appInfoProvider");
        Intrinsics.checkNotNullParameter(refreshConfigurationUseCase, "refreshConfigurationUseCase");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(paymentResultEmitter, "paymentResultEmitter");
        Intrinsics.checkNotNullParameter(chatAnalyticsInteractor, "chatAnalyticsInteractor");
        this.params = params;
        this.chatHeaderDelegate = chatHeaderDelegate;
        this.chatsConfigurationInteractor = chatsConfigurationInteractor;
        this.chatPanelActionsInteractor = chatPanelActionsInteractor;
        this.billingPurchaseDelegate = billingPurchaseDelegate;
        this.exceptionsEmitter = exceptionsEmitter;
        this.appEventsEmitter = appEventsEmitter;
        this.resourceProvider = resourceProvider;
        this.analyticsInteractor = analyticsInteractor;
        this.subscriptionOfferUiMapper = subscriptionOfferUiMapper;
        this.appInfoProvider = appInfoProvider;
        this.refreshConfigurationUseCase = refreshConfigurationUseCase;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.paymentResultEmitter = paymentResultEmitter;
        this.chatAnalyticsInteractor = chatAnalyticsInteractor;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (modelClass.isAssignableFrom(ChatBuySubscriptionViewModel.class)) {
            BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams = this.params;
            ChatHeaderDelegateImpl chatHeaderDelegateImpl = this.chatHeaderDelegate;
            ChatsConfigurationInteractor chatsConfigurationInteractor = this.chatsConfigurationInteractor;
            ChatPanelActionsInteractor chatPanelActionsInteractor = this.chatPanelActionsInteractor;
            BillingPurchaseDelegateImpl create = this.billingPurchaseDelegate.create(BillingPurchaseProductType.SUBSCRIPTION, this.params.getPurchaseReason(), this.params.getPurchaseSource(), this.params.getChatId());
            return new ChatBuySubscriptionViewModel(buyChatSubscriptionBillingUiParams, chatHeaderDelegateImpl, chatsConfigurationInteractor, chatPanelActionsInteractor, this.appEventsEmitter, this.exceptionsEmitter, create, this.resourceProvider, this.analyticsInteractor, this.subscriptionOfferUiMapper, this.appInfoProvider, this.refreshConfigurationUseCase, this.chatsInfoInteractor, this.paymentResultEmitter, this.chatAnalyticsInteractor);
        }
        String simpleName = getClass().getSimpleName();
        throw new IllegalArgumentException("Unknown ViewModel class=" + simpleName);
    }
}
