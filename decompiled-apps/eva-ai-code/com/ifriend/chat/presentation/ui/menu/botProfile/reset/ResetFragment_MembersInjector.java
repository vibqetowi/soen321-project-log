package com.ifriend.chat.presentation.ui.menu.botProfile.reset;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.api.ChatScreenFactory;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.ui.base.BaseFragment_MembersInjector;
import com.ifriend.ui.base.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ResetFragment_MembersInjector implements MembersInjector<ResetFragment> {
    private final Provider<AppFlowCoordinator> appFlowCoordinatorProvider;
    private final Provider<ChatScreenFactory> chatScreenFactoryProvider;
    private final Provider<InternalNotificationHandlersRegister> internalNotificationHandlersRegisterProvider;
    private final Provider<InternetConnection> internetConnectionProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<RouterProvider> routerProvider;
    private final Provider<ViewModelFactory> viewModelFactoryProvider;

    public ResetFragment_MembersInjector(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<ViewModelFactory> provider5, Provider<ChatScreenFactory> provider6, Provider<AppFlowCoordinator> provider7) {
        this.internetConnectionProvider = provider;
        this.internalNotificationHandlersRegisterProvider = provider2;
        this.loggerProvider = provider3;
        this.routerProvider = provider4;
        this.viewModelFactoryProvider = provider5;
        this.chatScreenFactoryProvider = provider6;
        this.appFlowCoordinatorProvider = provider7;
    }

    public static MembersInjector<ResetFragment> create(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<ViewModelFactory> provider5, Provider<ChatScreenFactory> provider6, Provider<AppFlowCoordinator> provider7) {
        return new ResetFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ResetFragment resetFragment) {
        BaseFragment_MembersInjector.injectInternetConnection(resetFragment, this.internetConnectionProvider.get());
        BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(resetFragment, this.internalNotificationHandlersRegisterProvider.get());
        BaseFragment_MembersInjector.injectLogger(resetFragment, this.loggerProvider.get());
        BaseFragment_MembersInjector.injectRouterProvider(resetFragment, this.routerProvider.get());
        injectViewModelFactory(resetFragment, this.viewModelFactoryProvider.get());
        injectChatScreenFactory(resetFragment, this.chatScreenFactoryProvider.get());
        injectAppFlowCoordinator(resetFragment, this.appFlowCoordinatorProvider.get());
    }

    public static void injectViewModelFactory(ResetFragment resetFragment, ViewModelFactory viewModelFactory) {
        resetFragment.viewModelFactory = viewModelFactory;
    }

    public static void injectChatScreenFactory(ResetFragment resetFragment, ChatScreenFactory chatScreenFactory) {
        resetFragment.chatScreenFactory = chatScreenFactory;
    }

    public static void injectAppFlowCoordinator(ResetFragment resetFragment, AppFlowCoordinator appFlowCoordinator) {
        resetFragment.appFlowCoordinator = appFlowCoordinator;
    }
}
