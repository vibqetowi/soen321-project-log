package com.ifriend.registration.presentation.ui.registration;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.api.AppActivityScreenFactory;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.ui.base.BaseFragment_MembersInjector;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.modalMessage.NoInternetPopupDelegate;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class VideoBackgroundRegistrationFragment_MembersInjector implements MembersInjector<VideoBackgroundRegistrationFragment> {
    private final Provider<AppActivityScreenFactory> appActivityScreenFactoryProvider;
    private final Provider<InternalNotificationHandlersRegister> internalNotificationHandlersRegisterProvider;
    private final Provider<InternetConnection> internetConnectionProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NoInternetPopupDelegate> noInternetPopupDelegateProvider;
    private final Provider<RouterProvider> routerProvider;
    private final Provider<ViewModelFactory> viewModelFactoryProvider;

    public VideoBackgroundRegistrationFragment_MembersInjector(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<ViewModelFactory> provider5, Provider<AppActivityScreenFactory> provider6, Provider<NoInternetPopupDelegate> provider7) {
        this.internetConnectionProvider = provider;
        this.internalNotificationHandlersRegisterProvider = provider2;
        this.loggerProvider = provider3;
        this.routerProvider = provider4;
        this.viewModelFactoryProvider = provider5;
        this.appActivityScreenFactoryProvider = provider6;
        this.noInternetPopupDelegateProvider = provider7;
    }

    public static MembersInjector<VideoBackgroundRegistrationFragment> create(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<ViewModelFactory> provider5, Provider<AppActivityScreenFactory> provider6, Provider<NoInternetPopupDelegate> provider7) {
        return new VideoBackgroundRegistrationFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VideoBackgroundRegistrationFragment videoBackgroundRegistrationFragment) {
        BaseFragment_MembersInjector.injectInternetConnection(videoBackgroundRegistrationFragment, this.internetConnectionProvider.get());
        BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(videoBackgroundRegistrationFragment, this.internalNotificationHandlersRegisterProvider.get());
        BaseFragment_MembersInjector.injectLogger(videoBackgroundRegistrationFragment, this.loggerProvider.get());
        BaseFragment_MembersInjector.injectRouterProvider(videoBackgroundRegistrationFragment, this.routerProvider.get());
        injectViewModelFactory(videoBackgroundRegistrationFragment, this.viewModelFactoryProvider.get());
        injectAppActivityScreenFactory(videoBackgroundRegistrationFragment, this.appActivityScreenFactoryProvider.get());
        injectNoInternetPopupDelegate(videoBackgroundRegistrationFragment, this.noInternetPopupDelegateProvider.get());
    }

    public static void injectViewModelFactory(VideoBackgroundRegistrationFragment videoBackgroundRegistrationFragment, ViewModelFactory viewModelFactory) {
        videoBackgroundRegistrationFragment.viewModelFactory = viewModelFactory;
    }

    public static void injectAppActivityScreenFactory(VideoBackgroundRegistrationFragment videoBackgroundRegistrationFragment, AppActivityScreenFactory appActivityScreenFactory) {
        videoBackgroundRegistrationFragment.appActivityScreenFactory = appActivityScreenFactory;
    }

    public static void injectNoInternetPopupDelegate(VideoBackgroundRegistrationFragment videoBackgroundRegistrationFragment, NoInternetPopupDelegate noInternetPopupDelegate) {
        videoBackgroundRegistrationFragment.noInternetPopupDelegate = noInternetPopupDelegate;
    }
}
