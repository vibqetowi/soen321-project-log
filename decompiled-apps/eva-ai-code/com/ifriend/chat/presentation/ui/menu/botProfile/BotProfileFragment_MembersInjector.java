package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.ui.base.BaseFragment_MembersInjector;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.modalMessage.GeneratingAnimatedAvatarPopupDelegate;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BotProfileFragment_MembersInjector implements MembersInjector<BotProfileFragment> {
    private final Provider<GeneratingAnimatedAvatarPopupDelegate> generatingAnimatedAvatarPopupDelegateProvider;
    private final Provider<InternalNotificationHandlersRegister> internalNotificationHandlersRegisterProvider;
    private final Provider<InternetConnection> internetConnectionProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<InternalNotificationHandlersRegister> notificationHandlersRegisterProvider;
    private final Provider<RouterProvider> routerProvider;
    private final Provider<ViewModelFactory> viewModelFactoryProvider;

    public BotProfileFragment_MembersInjector(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<InternalNotificationHandlersRegister> provider5, Provider<ViewModelFactory> provider6, Provider<GeneratingAnimatedAvatarPopupDelegate> provider7) {
        this.internetConnectionProvider = provider;
        this.internalNotificationHandlersRegisterProvider = provider2;
        this.loggerProvider = provider3;
        this.routerProvider = provider4;
        this.notificationHandlersRegisterProvider = provider5;
        this.viewModelFactoryProvider = provider6;
        this.generatingAnimatedAvatarPopupDelegateProvider = provider7;
    }

    public static MembersInjector<BotProfileFragment> create(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<InternalNotificationHandlersRegister> provider5, Provider<ViewModelFactory> provider6, Provider<GeneratingAnimatedAvatarPopupDelegate> provider7) {
        return new BotProfileFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BotProfileFragment botProfileFragment) {
        BaseFragment_MembersInjector.injectInternetConnection(botProfileFragment, this.internetConnectionProvider.get());
        BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(botProfileFragment, this.internalNotificationHandlersRegisterProvider.get());
        BaseFragment_MembersInjector.injectLogger(botProfileFragment, this.loggerProvider.get());
        BaseFragment_MembersInjector.injectRouterProvider(botProfileFragment, this.routerProvider.get());
        injectNotificationHandlersRegister(botProfileFragment, this.notificationHandlersRegisterProvider.get());
        injectViewModelFactory(botProfileFragment, this.viewModelFactoryProvider.get());
        injectGeneratingAnimatedAvatarPopupDelegate(botProfileFragment, this.generatingAnimatedAvatarPopupDelegateProvider.get());
    }

    public static void injectNotificationHandlersRegister(BotProfileFragment botProfileFragment, InternalNotificationHandlersRegister internalNotificationHandlersRegister) {
        botProfileFragment.notificationHandlersRegister = internalNotificationHandlersRegister;
    }

    public static void injectViewModelFactory(BotProfileFragment botProfileFragment, ViewModelFactory viewModelFactory) {
        botProfileFragment.viewModelFactory = viewModelFactory;
    }

    public static void injectGeneratingAnimatedAvatarPopupDelegate(BotProfileFragment botProfileFragment, GeneratingAnimatedAvatarPopupDelegate generatingAnimatedAvatarPopupDelegate) {
        botProfileFragment.generatingAnimatedAvatarPopupDelegate = generatingAnimatedAvatarPopupDelegate;
    }
}
