package com.ifriend.registration.presentation.ui.email;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.api.AppActivityScreenFactory;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.ui.base.BaseFragment_MembersInjector;
import com.ifriend.ui.base.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class EmailRegistrationFragment_MembersInjector implements MembersInjector<EmailRegistrationFragment> {
    private final Provider<AppActivityScreenFactory> appActivityScreenFactoryProvider;
    private final Provider<InternalNotificationHandlersRegister> internalNotificationHandlersRegisterProvider;
    private final Provider<InternetConnection> internetConnectionProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<RouterProvider> routerProvider;
    private final Provider<ViewModelFactory> viewModelFactoryProvider;

    public EmailRegistrationFragment_MembersInjector(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<ViewModelFactory> provider5, Provider<AppActivityScreenFactory> provider6) {
        this.internetConnectionProvider = provider;
        this.internalNotificationHandlersRegisterProvider = provider2;
        this.loggerProvider = provider3;
        this.routerProvider = provider4;
        this.viewModelFactoryProvider = provider5;
        this.appActivityScreenFactoryProvider = provider6;
    }

    public static MembersInjector<EmailRegistrationFragment> create(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<ViewModelFactory> provider5, Provider<AppActivityScreenFactory> provider6) {
        return new EmailRegistrationFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EmailRegistrationFragment emailRegistrationFragment) {
        BaseFragment_MembersInjector.injectInternetConnection(emailRegistrationFragment, this.internetConnectionProvider.get());
        BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(emailRegistrationFragment, this.internalNotificationHandlersRegisterProvider.get());
        BaseFragment_MembersInjector.injectLogger(emailRegistrationFragment, this.loggerProvider.get());
        BaseFragment_MembersInjector.injectRouterProvider(emailRegistrationFragment, this.routerProvider.get());
        injectViewModelFactory(emailRegistrationFragment, this.viewModelFactoryProvider.get());
        injectAppActivityScreenFactory(emailRegistrationFragment, this.appActivityScreenFactoryProvider.get());
    }

    public static void injectViewModelFactory(EmailRegistrationFragment emailRegistrationFragment, ViewModelFactory viewModelFactory) {
        emailRegistrationFragment.viewModelFactory = viewModelFactory;
    }

    public static void injectAppActivityScreenFactory(EmailRegistrationFragment emailRegistrationFragment, AppActivityScreenFactory appActivityScreenFactory) {
        emailRegistrationFragment.appActivityScreenFactory = appActivityScreenFactory;
    }
}
