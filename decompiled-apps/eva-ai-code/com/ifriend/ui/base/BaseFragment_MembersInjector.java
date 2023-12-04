package com.ifriend.ui.base;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class BaseFragment_MembersInjector implements MembersInjector<BaseFragment> {
    private final Provider<InternalNotificationHandlersRegister> internalNotificationHandlersRegisterProvider;
    private final Provider<InternetConnection> internetConnectionProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<RouterProvider> routerProvider;

    public BaseFragment_MembersInjector(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4) {
        this.internetConnectionProvider = provider;
        this.internalNotificationHandlersRegisterProvider = provider2;
        this.loggerProvider = provider3;
        this.routerProvider = provider4;
    }

    public static MembersInjector<BaseFragment> create(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4) {
        return new BaseFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BaseFragment baseFragment) {
        injectInternetConnection(baseFragment, this.internetConnectionProvider.get());
        injectInternalNotificationHandlersRegister(baseFragment, this.internalNotificationHandlersRegisterProvider.get());
        injectLogger(baseFragment, this.loggerProvider.get());
        injectRouterProvider(baseFragment, this.routerProvider.get());
    }

    public static void injectInternetConnection(BaseFragment baseFragment, InternetConnection internetConnection) {
        baseFragment.internetConnection = internetConnection;
    }

    public static void injectInternalNotificationHandlersRegister(BaseFragment baseFragment, InternalNotificationHandlersRegister internalNotificationHandlersRegister) {
        baseFragment.internalNotificationHandlersRegister = internalNotificationHandlersRegister;
    }

    public static void injectLogger(BaseFragment baseFragment, Logger logger) {
        baseFragment.logger = logger;
    }

    public static void injectRouterProvider(BaseFragment baseFragment, RouterProvider routerProvider) {
        baseFragment.routerProvider = routerProvider;
    }
}
