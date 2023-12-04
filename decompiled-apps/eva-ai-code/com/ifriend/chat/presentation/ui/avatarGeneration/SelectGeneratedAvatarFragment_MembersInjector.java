package com.ifriend.chat.presentation.ui.avatarGeneration;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.ui.base.BaseFragment_MembersInjector;
import com.ifriend.ui.base.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class SelectGeneratedAvatarFragment_MembersInjector implements MembersInjector<SelectGeneratedAvatarFragment> {
    private final Provider<GenerateBotAvatarScreenFactory> generateBotAvatarScreenFactoryProvider;
    private final Provider<InternalNotificationHandlersRegister> internalNotificationHandlersRegisterProvider;
    private final Provider<InternetConnection> internetConnectionProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<RouterProvider> routerProvider;
    private final Provider<ViewModelFactory> viewModelFactoryProvider;

    public SelectGeneratedAvatarFragment_MembersInjector(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<ViewModelFactory> provider5, Provider<GenerateBotAvatarScreenFactory> provider6) {
        this.internetConnectionProvider = provider;
        this.internalNotificationHandlersRegisterProvider = provider2;
        this.loggerProvider = provider3;
        this.routerProvider = provider4;
        this.viewModelFactoryProvider = provider5;
        this.generateBotAvatarScreenFactoryProvider = provider6;
    }

    public static MembersInjector<SelectGeneratedAvatarFragment> create(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<ViewModelFactory> provider5, Provider<GenerateBotAvatarScreenFactory> provider6) {
        return new SelectGeneratedAvatarFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SelectGeneratedAvatarFragment selectGeneratedAvatarFragment) {
        BaseFragment_MembersInjector.injectInternetConnection(selectGeneratedAvatarFragment, this.internetConnectionProvider.get());
        BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(selectGeneratedAvatarFragment, this.internalNotificationHandlersRegisterProvider.get());
        BaseFragment_MembersInjector.injectLogger(selectGeneratedAvatarFragment, this.loggerProvider.get());
        BaseFragment_MembersInjector.injectRouterProvider(selectGeneratedAvatarFragment, this.routerProvider.get());
        injectViewModelFactory(selectGeneratedAvatarFragment, this.viewModelFactoryProvider.get());
        injectGenerateBotAvatarScreenFactory(selectGeneratedAvatarFragment, this.generateBotAvatarScreenFactoryProvider.get());
    }

    public static void injectViewModelFactory(SelectGeneratedAvatarFragment selectGeneratedAvatarFragment, ViewModelFactory viewModelFactory) {
        selectGeneratedAvatarFragment.viewModelFactory = viewModelFactory;
    }

    public static void injectGenerateBotAvatarScreenFactory(SelectGeneratedAvatarFragment selectGeneratedAvatarFragment, GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory) {
        selectGeneratedAvatarFragment.generateBotAvatarScreenFactory = generateBotAvatarScreenFactory;
    }
}
