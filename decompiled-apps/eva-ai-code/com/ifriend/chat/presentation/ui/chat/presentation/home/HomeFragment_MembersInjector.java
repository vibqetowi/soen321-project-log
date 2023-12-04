package com.ifriend.chat.presentation.ui.chat.presentation.home;

import coil.ImageLoader;
import com.ifriend.base.di.AppImageLoader;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.ui.base.BaseFragment_MembersInjector;
import com.ifriend.ui.base.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
    private final Provider<AppFlowCoordinator> flowCoordinatorProvider;
    private final Provider<ImageLoader> imageLoaderProvider;
    private final Provider<InternalNotificationHandlersRegister> internalNotificationHandlersRegisterProvider;
    private final Provider<InternetConnection> internetConnectionProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<RouterProvider> routerProvider;
    private final Provider<ViewModelFactory> viewModelFactoryProvider;

    public HomeFragment_MembersInjector(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<ViewModelFactory> provider5, Provider<AppFlowCoordinator> provider6, Provider<ImageLoader> provider7) {
        this.internetConnectionProvider = provider;
        this.internalNotificationHandlersRegisterProvider = provider2;
        this.loggerProvider = provider3;
        this.routerProvider = provider4;
        this.viewModelFactoryProvider = provider5;
        this.flowCoordinatorProvider = provider6;
        this.imageLoaderProvider = provider7;
    }

    public static MembersInjector<HomeFragment> create(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<ViewModelFactory> provider5, Provider<AppFlowCoordinator> provider6, Provider<ImageLoader> provider7) {
        return new HomeFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(HomeFragment homeFragment) {
        BaseFragment_MembersInjector.injectInternetConnection(homeFragment, this.internetConnectionProvider.get());
        BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(homeFragment, this.internalNotificationHandlersRegisterProvider.get());
        BaseFragment_MembersInjector.injectLogger(homeFragment, this.loggerProvider.get());
        BaseFragment_MembersInjector.injectRouterProvider(homeFragment, this.routerProvider.get());
        injectViewModelFactory(homeFragment, this.viewModelFactoryProvider.get());
        injectFlowCoordinator(homeFragment, this.flowCoordinatorProvider.get());
        injectImageLoader(homeFragment, this.imageLoaderProvider.get());
    }

    public static void injectViewModelFactory(HomeFragment homeFragment, ViewModelFactory viewModelFactory) {
        homeFragment.viewModelFactory = viewModelFactory;
    }

    public static void injectFlowCoordinator(HomeFragment homeFragment, AppFlowCoordinator appFlowCoordinator) {
        homeFragment.flowCoordinator = appFlowCoordinator;
    }

    @AppImageLoader
    public static void injectImageLoader(HomeFragment homeFragment, ImageLoader imageLoader) {
        homeFragment.imageLoader = imageLoader;
    }
}
