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
public final class GeneratingBotAvatarPlaceholderFragment_MembersInjector implements MembersInjector<GeneratingBotAvatarPlaceholderFragment> {
    private final Provider<GenerateBotAvatarScreenFactory> generateBotAvatarScreenFactoryProvider;
    private final Provider<InternalNotificationHandlersRegister> internalNotificationHandlersRegisterProvider;
    private final Provider<InternalNotificationHandlersRegister> internalNotificationsRegisterProvider;
    private final Provider<InternetConnection> internetConnectionProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<RouterProvider> routerProvider;
    private final Provider<ViewModelFactory> viewModelFactoryProvider;

    public GeneratingBotAvatarPlaceholderFragment_MembersInjector(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<InternalNotificationHandlersRegister> provider5, Provider<GenerateBotAvatarScreenFactory> provider6, Provider<ViewModelFactory> provider7) {
        this.internetConnectionProvider = provider;
        this.internalNotificationHandlersRegisterProvider = provider2;
        this.loggerProvider = provider3;
        this.routerProvider = provider4;
        this.internalNotificationsRegisterProvider = provider5;
        this.generateBotAvatarScreenFactoryProvider = provider6;
        this.viewModelFactoryProvider = provider7;
    }

    public static MembersInjector<GeneratingBotAvatarPlaceholderFragment> create(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<InternalNotificationHandlersRegister> provider5, Provider<GenerateBotAvatarScreenFactory> provider6, Provider<ViewModelFactory> provider7) {
        return new GeneratingBotAvatarPlaceholderFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GeneratingBotAvatarPlaceholderFragment generatingBotAvatarPlaceholderFragment) {
        BaseFragment_MembersInjector.injectInternetConnection(generatingBotAvatarPlaceholderFragment, this.internetConnectionProvider.get());
        BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(generatingBotAvatarPlaceholderFragment, this.internalNotificationHandlersRegisterProvider.get());
        BaseFragment_MembersInjector.injectLogger(generatingBotAvatarPlaceholderFragment, this.loggerProvider.get());
        BaseFragment_MembersInjector.injectRouterProvider(generatingBotAvatarPlaceholderFragment, this.routerProvider.get());
        injectInternalNotificationsRegister(generatingBotAvatarPlaceholderFragment, this.internalNotificationsRegisterProvider.get());
        injectGenerateBotAvatarScreenFactory(generatingBotAvatarPlaceholderFragment, this.generateBotAvatarScreenFactoryProvider.get());
        injectViewModelFactory(generatingBotAvatarPlaceholderFragment, this.viewModelFactoryProvider.get());
    }

    public static void injectInternalNotificationsRegister(GeneratingBotAvatarPlaceholderFragment generatingBotAvatarPlaceholderFragment, InternalNotificationHandlersRegister internalNotificationHandlersRegister) {
        generatingBotAvatarPlaceholderFragment.internalNotificationsRegister = internalNotificationHandlersRegister;
    }

    public static void injectGenerateBotAvatarScreenFactory(GeneratingBotAvatarPlaceholderFragment generatingBotAvatarPlaceholderFragment, GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory) {
        generatingBotAvatarPlaceholderFragment.generateBotAvatarScreenFactory = generateBotAvatarScreenFactory;
    }

    public static void injectViewModelFactory(GeneratingBotAvatarPlaceholderFragment generatingBotAvatarPlaceholderFragment, ViewModelFactory viewModelFactory) {
        generatingBotAvatarPlaceholderFragment.viewModelFactory = viewModelFactory;
    }
}
