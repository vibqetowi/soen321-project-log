package com.ifriend.presentation.features.purchases.billing.delegate;

import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.billing.api.logic.BillingInteractor;
import com.ifriend.billing.api.models.BillingPurchaseProductType;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.domain.logic.chat.buy.BuyChatMessagesInteractor;
import com.ifriend.domain.logic.chat.events.ChatEventsInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.logger.api.logic.AppLoggerInteractor;
import com.ifriend.presentation.features.purchases.billing.analytics.BillingPurchaseProductAnalytics;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BillingPurchaseDelegateImpl_Factory {
    private final Provider<AppLoggerInteractor> appLoggerInteractorProvider;
    private final Provider<BillingInteractor> billingInteractorProvider;
    private final Provider<BillingPurchaseProductAnalytics> billingPurchaseProductAnalyticsProvider;
    private final Provider<BuyChatMessagesInteractor> buyChatMessagesInteractorProvider;
    private final Provider<ChatEventsInteractor> chatEventsInteractorProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<TagsProvider> tagsProvider;
    private final Provider<UserBalanceRepository> userBalanceRepositoryProvider;
    private final Provider<UserProfileRepository> userProfileRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public BillingPurchaseDelegateImpl_Factory(Provider<AppLoggerInteractor> provider, Provider<BillingInteractor> provider2, Provider<BuyChatMessagesInteractor> provider3, Provider<ChatEventsInteractor> provider4, Provider<UserBalanceRepository> provider5, Provider<BillingPurchaseProductAnalytics> provider6, Provider<UserProfileRepository> provider7, Provider<ChatsInfoInteractor> provider8, Provider<TagsProvider> provider9, Provider<UserRepository> provider10) {
        this.appLoggerInteractorProvider = provider;
        this.billingInteractorProvider = provider2;
        this.buyChatMessagesInteractorProvider = provider3;
        this.chatEventsInteractorProvider = provider4;
        this.userBalanceRepositoryProvider = provider5;
        this.billingPurchaseProductAnalyticsProvider = provider6;
        this.userProfileRepositoryProvider = provider7;
        this.chatsInfoInteractorProvider = provider8;
        this.tagsProvider = provider9;
        this.userRepositoryProvider = provider10;
    }

    public BillingPurchaseDelegateImpl get(BillingPurchaseProductType billingPurchaseProductType, PurchaseReason purchaseReason, PurchaseSource purchaseSource, String str) {
        return newInstance(billingPurchaseProductType, purchaseReason, purchaseSource, str, this.appLoggerInteractorProvider.get(), this.billingInteractorProvider.get(), this.buyChatMessagesInteractorProvider.get(), this.chatEventsInteractorProvider.get(), this.userBalanceRepositoryProvider.get(), this.billingPurchaseProductAnalyticsProvider.get(), this.userProfileRepositoryProvider.get(), this.chatsInfoInteractorProvider.get(), this.tagsProvider.get(), this.userRepositoryProvider.get());
    }

    public static BillingPurchaseDelegateImpl_Factory create(Provider<AppLoggerInteractor> provider, Provider<BillingInteractor> provider2, Provider<BuyChatMessagesInteractor> provider3, Provider<ChatEventsInteractor> provider4, Provider<UserBalanceRepository> provider5, Provider<BillingPurchaseProductAnalytics> provider6, Provider<UserProfileRepository> provider7, Provider<ChatsInfoInteractor> provider8, Provider<TagsProvider> provider9, Provider<UserRepository> provider10) {
        return new BillingPurchaseDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static BillingPurchaseDelegateImpl newInstance(BillingPurchaseProductType billingPurchaseProductType, PurchaseReason purchaseReason, PurchaseSource purchaseSource, String str, AppLoggerInteractor appLoggerInteractor, BillingInteractor billingInteractor, BuyChatMessagesInteractor buyChatMessagesInteractor, ChatEventsInteractor chatEventsInteractor, UserBalanceRepository userBalanceRepository, BillingPurchaseProductAnalytics billingPurchaseProductAnalytics, UserProfileRepository userProfileRepository, ChatsInfoInteractor chatsInfoInteractor, TagsProvider tagsProvider, UserRepository userRepository) {
        return new BillingPurchaseDelegateImpl(billingPurchaseProductType, purchaseReason, purchaseSource, str, appLoggerInteractor, billingInteractor, buyChatMessagesInteractor, chatEventsInteractor, userBalanceRepository, billingPurchaseProductAnalytics, userProfileRepository, chatsInfoInteractor, tagsProvider, userRepository);
    }
}
