package com.ifriend.presentation.features.app.viewmodel;

import com.ifriend.core.tools.api.AppIdentityConverter;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.logic.logout.LogoutUseCase;
import com.ifriend.presentation.common.exception.mappers.FeatureExceptionMapper;
import com.ifriend.presentation.common.observers.FlowObserver;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.features.app.delegates.AppChatEventsDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppChatMessagesDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppDeepLinksDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppNavigationDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppReloadDataDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppServicesDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppStartFlowDelegateImpl;
import com.ifriend.presentation.features.app.delegates.BillingEventDelegateImpl;
import com.ifriend.presentation.features.app.delegates.OnboardingSubmittedDelegateImpl;
import com.ifriend.presentation.features.app.delegates.PurchaseInfoDelegateImpl;
import com.ifriend.presentation.features.app.delegates.StartChatFlowDelegateImpl;
import com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppViewModel_Factory implements Factory<AppViewModel> {
    private final Provider<BillingEventDelegateImpl> addNeuronsBillingDelegateProvider;
    private final Provider<AppChatEventsDelegateImpl> appChatEventsDelegateProvider;
    private final Provider<AppChatMessagesDelegateImpl> appChatMessagesDelegateProvider;
    private final Provider<FlowObserver<AppEvents>> appEventsFlowProvider;
    private final Provider<AppIdentityConverter> appIdentityConverterProvider;
    private final Provider<AppNavigationDelegateImpl> appNavigationDelegateProvider;
    private final Provider<AppReloadDataDelegateImpl> appReloadDataDelegateProvider;
    private final Provider<AppServicesDelegateImpl> appServicesDelegateProvider;
    private final Provider<AppStartFlowDelegateImpl> appStartFlowDelegateProvider;
    private final Provider<InAppUpdateDelegateImpl> appUpdatesDelegateProvider;
    private final Provider<ChatsInfoConfigurationRepository> chatsInfoConfigurationRepositoryProvider;
    private final Provider<AppDeepLinksDelegateImpl> deepLinkDelegateProvider;
    private final Provider<DispatcherProvider> dispatchersProvider;
    private final Provider<FlowObserver<Throwable>> exceptionsFlowProvider;
    private final Provider<FeatureExceptionMapper> featureExceptionMapperProvider;
    private final Provider<LogoutUseCase> logoutUseCaseProvider;
    private final Provider<OnboardingSubmittedDelegateImpl> onboardingSubmittedDelegateProvider;
    private final Provider<PurchaseInfoDelegateImpl> purchaseInfoDelegateProvider;
    private final Provider<StartChatFlowDelegateImpl> startChatFlowDelegateProvider;

    public AppViewModel_Factory(Provider<ChatsInfoConfigurationRepository> provider, Provider<FeatureExceptionMapper> provider2, Provider<LogoutUseCase> provider3, Provider<AppIdentityConverter> provider4, Provider<DispatcherProvider> provider5, Provider<AppServicesDelegateImpl> provider6, Provider<AppChatMessagesDelegateImpl> provider7, Provider<BillingEventDelegateImpl> provider8, Provider<AppStartFlowDelegateImpl> provider9, Provider<AppDeepLinksDelegateImpl> provider10, Provider<AppReloadDataDelegateImpl> provider11, Provider<StartChatFlowDelegateImpl> provider12, Provider<AppChatEventsDelegateImpl> provider13, Provider<OnboardingSubmittedDelegateImpl> provider14, Provider<AppNavigationDelegateImpl> provider15, Provider<PurchaseInfoDelegateImpl> provider16, Provider<FlowObserver<AppEvents>> provider17, Provider<FlowObserver<Throwable>> provider18, Provider<InAppUpdateDelegateImpl> provider19) {
        this.chatsInfoConfigurationRepositoryProvider = provider;
        this.featureExceptionMapperProvider = provider2;
        this.logoutUseCaseProvider = provider3;
        this.appIdentityConverterProvider = provider4;
        this.dispatchersProvider = provider5;
        this.appServicesDelegateProvider = provider6;
        this.appChatMessagesDelegateProvider = provider7;
        this.addNeuronsBillingDelegateProvider = provider8;
        this.appStartFlowDelegateProvider = provider9;
        this.deepLinkDelegateProvider = provider10;
        this.appReloadDataDelegateProvider = provider11;
        this.startChatFlowDelegateProvider = provider12;
        this.appChatEventsDelegateProvider = provider13;
        this.onboardingSubmittedDelegateProvider = provider14;
        this.appNavigationDelegateProvider = provider15;
        this.purchaseInfoDelegateProvider = provider16;
        this.appEventsFlowProvider = provider17;
        this.exceptionsFlowProvider = provider18;
        this.appUpdatesDelegateProvider = provider19;
    }

    @Override // javax.inject.Provider
    public AppViewModel get() {
        return newInstance(this.chatsInfoConfigurationRepositoryProvider.get(), this.featureExceptionMapperProvider.get(), this.logoutUseCaseProvider.get(), this.appIdentityConverterProvider.get(), this.dispatchersProvider.get(), this.appServicesDelegateProvider.get(), this.appChatMessagesDelegateProvider.get(), this.addNeuronsBillingDelegateProvider.get(), this.appStartFlowDelegateProvider.get(), this.deepLinkDelegateProvider.get(), this.appReloadDataDelegateProvider.get(), this.startChatFlowDelegateProvider.get(), this.appChatEventsDelegateProvider.get(), this.onboardingSubmittedDelegateProvider.get(), this.appNavigationDelegateProvider.get(), this.purchaseInfoDelegateProvider.get(), this.appEventsFlowProvider.get(), this.exceptionsFlowProvider.get(), this.appUpdatesDelegateProvider.get());
    }

    public static AppViewModel_Factory create(Provider<ChatsInfoConfigurationRepository> provider, Provider<FeatureExceptionMapper> provider2, Provider<LogoutUseCase> provider3, Provider<AppIdentityConverter> provider4, Provider<DispatcherProvider> provider5, Provider<AppServicesDelegateImpl> provider6, Provider<AppChatMessagesDelegateImpl> provider7, Provider<BillingEventDelegateImpl> provider8, Provider<AppStartFlowDelegateImpl> provider9, Provider<AppDeepLinksDelegateImpl> provider10, Provider<AppReloadDataDelegateImpl> provider11, Provider<StartChatFlowDelegateImpl> provider12, Provider<AppChatEventsDelegateImpl> provider13, Provider<OnboardingSubmittedDelegateImpl> provider14, Provider<AppNavigationDelegateImpl> provider15, Provider<PurchaseInfoDelegateImpl> provider16, Provider<FlowObserver<AppEvents>> provider17, Provider<FlowObserver<Throwable>> provider18, Provider<InAppUpdateDelegateImpl> provider19) {
        return new AppViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19);
    }

    public static AppViewModel newInstance(ChatsInfoConfigurationRepository chatsInfoConfigurationRepository, FeatureExceptionMapper featureExceptionMapper, LogoutUseCase logoutUseCase, AppIdentityConverter appIdentityConverter, DispatcherProvider dispatcherProvider, AppServicesDelegateImpl appServicesDelegateImpl, AppChatMessagesDelegateImpl appChatMessagesDelegateImpl, BillingEventDelegateImpl billingEventDelegateImpl, AppStartFlowDelegateImpl appStartFlowDelegateImpl, AppDeepLinksDelegateImpl appDeepLinksDelegateImpl, AppReloadDataDelegateImpl appReloadDataDelegateImpl, StartChatFlowDelegateImpl startChatFlowDelegateImpl, AppChatEventsDelegateImpl appChatEventsDelegateImpl, OnboardingSubmittedDelegateImpl onboardingSubmittedDelegateImpl, AppNavigationDelegateImpl appNavigationDelegateImpl, PurchaseInfoDelegateImpl purchaseInfoDelegateImpl, FlowObserver<AppEvents> flowObserver, FlowObserver<Throwable> flowObserver2, InAppUpdateDelegateImpl inAppUpdateDelegateImpl) {
        return new AppViewModel(chatsInfoConfigurationRepository, featureExceptionMapper, logoutUseCase, appIdentityConverter, dispatcherProvider, appServicesDelegateImpl, appChatMessagesDelegateImpl, billingEventDelegateImpl, appStartFlowDelegateImpl, appDeepLinksDelegateImpl, appReloadDataDelegateImpl, startChatFlowDelegateImpl, appChatEventsDelegateImpl, onboardingSubmittedDelegateImpl, appNavigationDelegateImpl, purchaseInfoDelegateImpl, flowObserver, flowObserver2, inAppUpdateDelegateImpl);
    }
}
