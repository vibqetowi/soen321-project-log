package com.ifriend.presentation.features.chat.panel.delegate;

import com.ifriend.core.tools.api.AppIdentityConverter;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.logic.calls.ChatCallsInteractor;
import com.ifriend.domain.logic.chat.events.ChatEventsInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.topics.ChatPanelActionsInteractor;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.presentation.analytics.ChatTopicsAnalytics;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import com.ifriend.presentation.features.chat.panel.mappers.ChatPremiumTopicMapperUi;
import com.ifriend.presentation.features.chat.panel.mappers.ChatTopicMapperUi;
import com.ifriend.presentation.features.chat.panel.mappers.TopicPopupDataMapperUi;
import com.ifriend.presentation.features.chatcall.analytics.ChatCallAnalytics;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatPanelActionsDelegateImpl_Factory implements Factory<ChatPanelActionsDelegateImpl> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<AppIdentityConverter> appIdentityConverterProvider;
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<ChatCallAnalytics> chatCallAnalyticsProvider;
    private final Provider<ChatCallsInteractor> chatCallsInteractorProvider;
    private final Provider<ChatEventsInteractor> chatEventsInteractorProvider;
    private final Provider<ChatPanelActionsInteractor> chatPanelActionsInteractorProvider;
    private final Provider<ChatPremiumTopicMapperUi> chatPremiumTopicMapperUiProvider;
    private final Provider<ChatTopicMapperUi> chatTopicMapperUiProvider;
    private final Provider<ChatTopicsAnalytics> chatTopicsAnalyticsProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;
    private final Provider<InternalNotificationHandler> internalNotificationHandlerProvider;
    private final Provider<PaymentResultFlow> paymentResultFlowProvider;
    private final Provider<TopicPopupDataMapperUi> topicPopupDataMapperUiProvider;

    public ChatPanelActionsDelegateImpl_Factory(Provider<ChatPanelActionsInteractor> provider, Provider<DispatcherProvider> provider2, Provider<ChatTopicMapperUi> provider3, Provider<ChatPremiumTopicMapperUi> provider4, Provider<TopicPopupDataMapperUi> provider5, Provider<FlowObserverEmitter<Throwable>> provider6, Provider<AppIdentityConverter> provider7, Provider<ChatTopicsAnalytics> provider8, Provider<BotRepository> provider9, Provider<ChatsInfoInteractor> provider10, Provider<InternalNotificationHandler> provider11, Provider<ChatEventsInteractor> provider12, Provider<ChatCallsInteractor> provider13, Provider<AppEventsEmitter> provider14, Provider<PaymentResultFlow> provider15, Provider<ChatCallAnalytics> provider16) {
        this.chatPanelActionsInteractorProvider = provider;
        this.dispatcherProvider = provider2;
        this.chatTopicMapperUiProvider = provider3;
        this.chatPremiumTopicMapperUiProvider = provider4;
        this.topicPopupDataMapperUiProvider = provider5;
        this.exceptionsEmitterProvider = provider6;
        this.appIdentityConverterProvider = provider7;
        this.chatTopicsAnalyticsProvider = provider8;
        this.botRepositoryProvider = provider9;
        this.chatsInfoInteractorProvider = provider10;
        this.internalNotificationHandlerProvider = provider11;
        this.chatEventsInteractorProvider = provider12;
        this.chatCallsInteractorProvider = provider13;
        this.appEventsEmitterProvider = provider14;
        this.paymentResultFlowProvider = provider15;
        this.chatCallAnalyticsProvider = provider16;
    }

    @Override // javax.inject.Provider
    public ChatPanelActionsDelegateImpl get() {
        return newInstance(this.chatPanelActionsInteractorProvider.get(), this.dispatcherProvider.get(), this.chatTopicMapperUiProvider.get(), this.chatPremiumTopicMapperUiProvider.get(), this.topicPopupDataMapperUiProvider.get(), this.exceptionsEmitterProvider.get(), this.appIdentityConverterProvider.get(), this.chatTopicsAnalyticsProvider.get(), this.botRepositoryProvider.get(), this.chatsInfoInteractorProvider.get(), this.internalNotificationHandlerProvider.get(), this.chatEventsInteractorProvider.get(), this.chatCallsInteractorProvider.get(), this.appEventsEmitterProvider.get(), this.paymentResultFlowProvider.get(), this.chatCallAnalyticsProvider.get());
    }

    public static ChatPanelActionsDelegateImpl_Factory create(Provider<ChatPanelActionsInteractor> provider, Provider<DispatcherProvider> provider2, Provider<ChatTopicMapperUi> provider3, Provider<ChatPremiumTopicMapperUi> provider4, Provider<TopicPopupDataMapperUi> provider5, Provider<FlowObserverEmitter<Throwable>> provider6, Provider<AppIdentityConverter> provider7, Provider<ChatTopicsAnalytics> provider8, Provider<BotRepository> provider9, Provider<ChatsInfoInteractor> provider10, Provider<InternalNotificationHandler> provider11, Provider<ChatEventsInteractor> provider12, Provider<ChatCallsInteractor> provider13, Provider<AppEventsEmitter> provider14, Provider<PaymentResultFlow> provider15, Provider<ChatCallAnalytics> provider16) {
        return new ChatPanelActionsDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    public static ChatPanelActionsDelegateImpl newInstance(ChatPanelActionsInteractor chatPanelActionsInteractor, DispatcherProvider dispatcherProvider, ChatTopicMapperUi chatTopicMapperUi, ChatPremiumTopicMapperUi chatPremiumTopicMapperUi, TopicPopupDataMapperUi topicPopupDataMapperUi, FlowObserverEmitter<Throwable> flowObserverEmitter, AppIdentityConverter appIdentityConverter, ChatTopicsAnalytics chatTopicsAnalytics, BotRepository botRepository, ChatsInfoInteractor chatsInfoInteractor, InternalNotificationHandler internalNotificationHandler, ChatEventsInteractor chatEventsInteractor, ChatCallsInteractor chatCallsInteractor, AppEventsEmitter appEventsEmitter, PaymentResultFlow paymentResultFlow, ChatCallAnalytics chatCallAnalytics) {
        return new ChatPanelActionsDelegateImpl(chatPanelActionsInteractor, dispatcherProvider, chatTopicMapperUi, chatPremiumTopicMapperUi, topicPopupDataMapperUi, flowObserverEmitter, appIdentityConverter, chatTopicsAnalytics, botRepository, chatsInfoInteractor, internalNotificationHandler, chatEventsInteractor, chatCallsInteractor, appEventsEmitter, paymentResultFlow, chatCallAnalytics);
    }
}
