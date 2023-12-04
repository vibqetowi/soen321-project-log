package com.ifriend.chat.presentation.ui.chat.presentation.chat.ui;

import coil.ImageLoader;
import com.ifriend.base.app.activity.FlowFragment_MembersInjector;
import com.ifriend.base.di.AppImageLoader;
import com.ifriend.base.navigation.api.CiceroneHolder;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.presentation.ui.chat.ShowRateAppDialog;
import com.ifriend.chat.presentation.ui.chat.presentation.chat.viewmodel.ChatRootViewModelFactory;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.ui.base.BaseFragment_MembersInjector;
import com.ifriend.ui.base.modalMessage.ChooseVoicePopupDelegate;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatFragment_MembersInjector implements MembersInjector<ChatFragment> {
    private final Provider<ChooseVoicePopupDelegate> chooseVoicePopupDelegateProvider;
    private final Provider<CiceroneHolder> ciceroneHolderProvider;
    private final Provider<AppFlowCoordinator> flowCoordinatorProvider;
    private final Provider<ImageLoader> imageLoaderProvider;
    private final Provider<InternalNotificationHandlersRegister> internalNotificationHandlersRegisterProvider;
    private final Provider<InternetConnection> internetConnectionProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<RouterProvider> routerProvider;
    private final Provider<ShowRateAppDialog> showRateAppDialogProvider;
    private final Provider<ChatRootViewModelFactory> viewModelFactoryProvider;

    public ChatFragment_MembersInjector(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<CiceroneHolder> provider5, Provider<ImageLoader> provider6, Provider<AppFlowCoordinator> provider7, Provider<ChatRootViewModelFactory> provider8, Provider<ShowRateAppDialog> provider9, Provider<ChooseVoicePopupDelegate> provider10) {
        this.internetConnectionProvider = provider;
        this.internalNotificationHandlersRegisterProvider = provider2;
        this.loggerProvider = provider3;
        this.routerProvider = provider4;
        this.ciceroneHolderProvider = provider5;
        this.imageLoaderProvider = provider6;
        this.flowCoordinatorProvider = provider7;
        this.viewModelFactoryProvider = provider8;
        this.showRateAppDialogProvider = provider9;
        this.chooseVoicePopupDelegateProvider = provider10;
    }

    public static MembersInjector<ChatFragment> create(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<CiceroneHolder> provider5, Provider<ImageLoader> provider6, Provider<AppFlowCoordinator> provider7, Provider<ChatRootViewModelFactory> provider8, Provider<ShowRateAppDialog> provider9, Provider<ChooseVoicePopupDelegate> provider10) {
        return new ChatFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ChatFragment chatFragment) {
        BaseFragment_MembersInjector.injectInternetConnection(chatFragment, this.internetConnectionProvider.get());
        BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(chatFragment, this.internalNotificationHandlersRegisterProvider.get());
        BaseFragment_MembersInjector.injectLogger(chatFragment, this.loggerProvider.get());
        BaseFragment_MembersInjector.injectRouterProvider(chatFragment, this.routerProvider.get());
        FlowFragment_MembersInjector.injectCiceroneHolder(chatFragment, this.ciceroneHolderProvider.get());
        injectImageLoader(chatFragment, this.imageLoaderProvider.get());
        injectFlowCoordinator(chatFragment, this.flowCoordinatorProvider.get());
        injectViewModelFactory(chatFragment, this.viewModelFactoryProvider.get());
        injectShowRateAppDialog(chatFragment, this.showRateAppDialogProvider.get());
        injectChooseVoicePopupDelegate(chatFragment, this.chooseVoicePopupDelegateProvider.get());
    }

    @AppImageLoader
    public static void injectImageLoader(ChatFragment chatFragment, ImageLoader imageLoader) {
        chatFragment.imageLoader = imageLoader;
    }

    public static void injectFlowCoordinator(ChatFragment chatFragment, AppFlowCoordinator appFlowCoordinator) {
        chatFragment.flowCoordinator = appFlowCoordinator;
    }

    public static void injectViewModelFactory(ChatFragment chatFragment, ChatRootViewModelFactory chatRootViewModelFactory) {
        chatFragment.viewModelFactory = chatRootViewModelFactory;
    }

    public static void injectShowRateAppDialog(ChatFragment chatFragment, ShowRateAppDialog showRateAppDialog) {
        chatFragment.showRateAppDialog = showRateAppDialog;
    }

    public static void injectChooseVoicePopupDelegate(ChatFragment chatFragment, ChooseVoicePopupDelegate chooseVoicePopupDelegate) {
        chatFragment.chooseVoicePopupDelegate = chooseVoicePopupDelegate;
    }
}
