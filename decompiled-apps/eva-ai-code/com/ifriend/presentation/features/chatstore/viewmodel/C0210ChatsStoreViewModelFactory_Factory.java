package com.ifriend.presentation.features.chatstore.viewmodel;

import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.logic.chat.buy.BuyChatInteractor;
import com.ifriend.domain.logic.store.GetChatsStoreInteractor;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import com.ifriend.presentation.features.chatstore.analytics.ChatsStoreAnalyticsInteractor;
import com.ifriend.presentation.features.chatstore.mapper.ChatStoreUiMapper;
import javax.inject.Provider;
/* renamed from: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModelFactory_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0210ChatsStoreViewModelFactory_Factory {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<BuyChatInteractor> buyChatInteractorProvider;
    private final Provider<ChatStoreUiMapper> chatStoreUiMapperProvider;
    private final Provider<ChatsStoreAnalyticsInteractor> chatsStoreAnalyticsInteractorProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;
    private final Provider<GetChatsStoreInteractor> getChatsStoreInteractorProvider;
    private final Provider<PaymentResultFlow> paymentResultFlowProvider;
    private final Provider<ResourceProvider> resourceProvider;
    private final Provider<UserBalanceRepository> userBalanceRepositoryProvider;

    public C0210ChatsStoreViewModelFactory_Factory(Provider<GetChatsStoreInteractor> provider, Provider<ChatStoreUiMapper> provider2, Provider<UserBalanceRepository> provider3, Provider<AppEventsEmitter> provider4, Provider<FlowObserverEmitter<Throwable>> provider5, Provider<PaymentResultFlow> provider6, Provider<BuyChatInteractor> provider7, Provider<ResourceProvider> provider8, Provider<ChatsStoreAnalyticsInteractor> provider9) {
        this.getChatsStoreInteractorProvider = provider;
        this.chatStoreUiMapperProvider = provider2;
        this.userBalanceRepositoryProvider = provider3;
        this.appEventsEmitterProvider = provider4;
        this.exceptionsEmitterProvider = provider5;
        this.paymentResultFlowProvider = provider6;
        this.buyChatInteractorProvider = provider7;
        this.resourceProvider = provider8;
        this.chatsStoreAnalyticsInteractorProvider = provider9;
    }

    public ChatsStoreViewModelFactory get(String str) {
        return newInstance(str, this.getChatsStoreInteractorProvider.get(), this.chatStoreUiMapperProvider.get(), this.userBalanceRepositoryProvider.get(), this.appEventsEmitterProvider.get(), this.exceptionsEmitterProvider.get(), this.paymentResultFlowProvider.get(), this.buyChatInteractorProvider.get(), this.resourceProvider.get(), this.chatsStoreAnalyticsInteractorProvider.get());
    }

    public static C0210ChatsStoreViewModelFactory_Factory create(Provider<GetChatsStoreInteractor> provider, Provider<ChatStoreUiMapper> provider2, Provider<UserBalanceRepository> provider3, Provider<AppEventsEmitter> provider4, Provider<FlowObserverEmitter<Throwable>> provider5, Provider<PaymentResultFlow> provider6, Provider<BuyChatInteractor> provider7, Provider<ResourceProvider> provider8, Provider<ChatsStoreAnalyticsInteractor> provider9) {
        return new C0210ChatsStoreViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static ChatsStoreViewModelFactory newInstance(String str, GetChatsStoreInteractor getChatsStoreInteractor, ChatStoreUiMapper chatStoreUiMapper, UserBalanceRepository userBalanceRepository, AppEventsEmitter appEventsEmitter, FlowObserverEmitter<Throwable> flowObserverEmitter, PaymentResultFlow paymentResultFlow, BuyChatInteractor buyChatInteractor, ResourceProvider resourceProvider, ChatsStoreAnalyticsInteractor chatsStoreAnalyticsInteractor) {
        return new ChatsStoreViewModelFactory(str, getChatsStoreInteractor, chatStoreUiMapper, userBalanceRepository, appEventsEmitter, flowObserverEmitter, paymentResultFlow, buyChatInteractor, resourceProvider, chatsStoreAnalyticsInteractor);
    }
}
