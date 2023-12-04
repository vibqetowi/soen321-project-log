package com.ifriend.base.app.activity;

import com.ifriend.base.navigation.api.CiceroneHolder;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.ui.base.BaseFragment_MembersInjector;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class FlowFragment_MembersInjector implements MembersInjector<FlowFragment> {
    private final Provider<CiceroneHolder> ciceroneHolderProvider;
    private final Provider<InternalNotificationHandlersRegister> internalNotificationHandlersRegisterProvider;
    private final Provider<InternetConnection> internetConnectionProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<RouterProvider> routerProvider;

    public FlowFragment_MembersInjector(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<CiceroneHolder> provider5) {
        this.internetConnectionProvider = provider;
        this.internalNotificationHandlersRegisterProvider = provider2;
        this.loggerProvider = provider3;
        this.routerProvider = provider4;
        this.ciceroneHolderProvider = provider5;
    }

    public static MembersInjector<FlowFragment> create(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<CiceroneHolder> provider5) {
        return new FlowFragment_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FlowFragment flowFragment) {
        BaseFragment_MembersInjector.injectInternetConnection(flowFragment, this.internetConnectionProvider.get());
        BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(flowFragment, this.internalNotificationHandlersRegisterProvider.get());
        BaseFragment_MembersInjector.injectLogger(flowFragment, this.loggerProvider.get());
        BaseFragment_MembersInjector.injectRouterProvider(flowFragment, this.routerProvider.get());
        injectCiceroneHolder(flowFragment, this.ciceroneHolderProvider.get());
    }

    public static void injectCiceroneHolder(FlowFragment flowFragment, CiceroneHolder ciceroneHolder) {
        flowFragment.ciceroneHolder = ciceroneHolder;
    }
}
