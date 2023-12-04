package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.ui.base.BaseFragment_MembersInjector;
import com.ifriend.ui.base.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BotEthnicityFragment_MembersInjector implements MembersInjector<BotEthnicityFragment> {
    private final Provider<InternalNotificationHandlersRegister> internalNotificationHandlersRegisterProvider;
    private final Provider<InternetConnection> internetConnectionProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<RouterProvider> routerProvider;
    private final Provider<ViewModelFactory> viewModelFactoryProvider;

    public BotEthnicityFragment_MembersInjector(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<ViewModelFactory> provider5) {
        this.internetConnectionProvider = provider;
        this.internalNotificationHandlersRegisterProvider = provider2;
        this.loggerProvider = provider3;
        this.routerProvider = provider4;
        this.viewModelFactoryProvider = provider5;
    }

    public static MembersInjector<BotEthnicityFragment> create(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<ViewModelFactory> provider5) {
        return new BotEthnicityFragment_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BotEthnicityFragment botEthnicityFragment) {
        BaseFragment_MembersInjector.injectInternetConnection(botEthnicityFragment, this.internetConnectionProvider.get());
        BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(botEthnicityFragment, this.internalNotificationHandlersRegisterProvider.get());
        BaseFragment_MembersInjector.injectLogger(botEthnicityFragment, this.loggerProvider.get());
        BaseFragment_MembersInjector.injectRouterProvider(botEthnicityFragment, this.routerProvider.get());
        injectViewModelFactory(botEthnicityFragment, this.viewModelFactoryProvider.get());
    }

    public static void injectViewModelFactory(BotEthnicityFragment botEthnicityFragment, ViewModelFactory viewModelFactory) {
        botEthnicityFragment.viewModelFactory = viewModelFactory;
    }
}
