package com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest;

import com.ifriend.data.toggle.SextingRequestToggle;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisher;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.ui.base.modalMessage.RequestSextingPopupDelegate;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class ShowSextingRequestSystem_Factory implements Factory<ShowSextingRequestSystem> {
    private final Provider<AppConfigUseCase> appConfigUseCaseProvider;
    private final Provider<ChatHistory> chatHistoryProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<GlobalSendingMessageResultPublisher> globalSendingMessageResultPublisherProvider;
    private final Provider<RequestSextingPopupDelegate> sextingRequestSextingPopupDelegateProvider;
    private final Provider<SextingRequestor> sextingRequestorProvider;
    private final Provider<SextingRequestToggle> toggleProvider;
    private final Provider<Preferences> userPreferencesProvider;

    public ShowSextingRequestSystem_Factory(Provider<RequestSextingPopupDelegate> provider, Provider<Preferences> provider2, Provider<CoroutineDispatchers> provider3, Provider<CoroutineScope> provider4, Provider<AppConfigUseCase> provider5, Provider<SextingRequestToggle> provider6, Provider<SextingRequestor> provider7, Provider<ChatHistory> provider8, Provider<GlobalSendingMessageResultPublisher> provider9) {
        this.sextingRequestSextingPopupDelegateProvider = provider;
        this.userPreferencesProvider = provider2;
        this.dispatchersProvider = provider3;
        this.coroutineScopeProvider = provider4;
        this.appConfigUseCaseProvider = provider5;
        this.toggleProvider = provider6;
        this.sextingRequestorProvider = provider7;
        this.chatHistoryProvider = provider8;
        this.globalSendingMessageResultPublisherProvider = provider9;
    }

    @Override // javax.inject.Provider
    public ShowSextingRequestSystem get() {
        return newInstance(this.sextingRequestSextingPopupDelegateProvider.get(), this.userPreferencesProvider.get(), this.dispatchersProvider.get(), this.coroutineScopeProvider.get(), this.appConfigUseCaseProvider.get(), this.toggleProvider.get(), this.sextingRequestorProvider.get(), this.chatHistoryProvider.get(), this.globalSendingMessageResultPublisherProvider.get());
    }

    public static ShowSextingRequestSystem_Factory create(Provider<RequestSextingPopupDelegate> provider, Provider<Preferences> provider2, Provider<CoroutineDispatchers> provider3, Provider<CoroutineScope> provider4, Provider<AppConfigUseCase> provider5, Provider<SextingRequestToggle> provider6, Provider<SextingRequestor> provider7, Provider<ChatHistory> provider8, Provider<GlobalSendingMessageResultPublisher> provider9) {
        return new ShowSextingRequestSystem_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static ShowSextingRequestSystem newInstance(RequestSextingPopupDelegate requestSextingPopupDelegate, Preferences preferences, CoroutineDispatchers coroutineDispatchers, CoroutineScope coroutineScope, AppConfigUseCase appConfigUseCase, SextingRequestToggle sextingRequestToggle, SextingRequestor sextingRequestor, ChatHistory chatHistory, GlobalSendingMessageResultPublisher globalSendingMessageResultPublisher) {
        return new ShowSextingRequestSystem(requestSextingPopupDelegate, preferences, coroutineDispatchers, coroutineScope, appConfigUseCase, sextingRequestToggle, sextingRequestor, chatHistory, globalSendingMessageResultPublisher);
    }
}
