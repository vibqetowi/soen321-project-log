package com.ifriend.chat.presentation.ui;

import androidx.lifecycle.DefaultLifecycleObserver;
import com.ifriend.base.di.MessagesSourceLifecycleObserver;
import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.cicerone.Cicerone;
import com.ifriend.chat.api.ChatScreenFactory;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.infrastucture.InternetConnectionDialogsManager;
import com.ifriend.domain.useCases.socket.ListenTagsUseCase;
import com.ifriend.internal_notifications.notification.InternalNotification;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.ui.base.BaseActivity_MembersInjector;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.modalMessage.NoInternetPopupDelegate;
import com.ifriend.ui.internalNotifications.SnackbarDescription;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppActivity_MembersInjector implements MembersInjector<AppActivity> {
    private final Provider<Cicerone<AppRouter>> appCiceroneProvider;
    private final Provider<AppFlowCoordinator> appFlowCoordinatorProvider;
    private final Provider<ChatScreenFactory> chatScreenFactoryProvider;
    private final Provider<CoroutineDispatchers> coroutineDispatchersProvider;
    private final Provider<InternetConnectionDialogsManager> internetConnectionDialogsManagerProvider;
    private final Provider<ListenTagsUseCase> listenTagsUseCaseProvider;
    private final Provider<DefaultLifecycleObserver> messagesSourceLifecycleControllerProvider;
    private final Provider<NoInternetPopupDelegate> noInternetPopupDelegateProvider;
    private final Provider<InternalNotificationHandlersRegister> notificationHandlersRegisterProvider;
    private final Provider<Mapper<InternalNotification, SnackbarDescription>> notificationsMapperProvider;
    private final Provider<ViewModelFactory> viewModelFactoryProvider;

    public AppActivity_MembersInjector(Provider<NoInternetPopupDelegate> provider, Provider<InternetConnectionDialogsManager> provider2, Provider<Cicerone<AppRouter>> provider3, Provider<AppFlowCoordinator> provider4, Provider<Mapper<InternalNotification, SnackbarDescription>> provider5, Provider<DefaultLifecycleObserver> provider6, Provider<InternalNotificationHandlersRegister> provider7, Provider<ViewModelFactory> provider8, Provider<ChatScreenFactory> provider9, Provider<ListenTagsUseCase> provider10, Provider<CoroutineDispatchers> provider11) {
        this.noInternetPopupDelegateProvider = provider;
        this.internetConnectionDialogsManagerProvider = provider2;
        this.appCiceroneProvider = provider3;
        this.appFlowCoordinatorProvider = provider4;
        this.notificationsMapperProvider = provider5;
        this.messagesSourceLifecycleControllerProvider = provider6;
        this.notificationHandlersRegisterProvider = provider7;
        this.viewModelFactoryProvider = provider8;
        this.chatScreenFactoryProvider = provider9;
        this.listenTagsUseCaseProvider = provider10;
        this.coroutineDispatchersProvider = provider11;
    }

    public static MembersInjector<AppActivity> create(Provider<NoInternetPopupDelegate> provider, Provider<InternetConnectionDialogsManager> provider2, Provider<Cicerone<AppRouter>> provider3, Provider<AppFlowCoordinator> provider4, Provider<Mapper<InternalNotification, SnackbarDescription>> provider5, Provider<DefaultLifecycleObserver> provider6, Provider<InternalNotificationHandlersRegister> provider7, Provider<ViewModelFactory> provider8, Provider<ChatScreenFactory> provider9, Provider<ListenTagsUseCase> provider10, Provider<CoroutineDispatchers> provider11) {
        return new AppActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AppActivity appActivity) {
        BaseActivity_MembersInjector.injectNoInternetPopupDelegate(appActivity, this.noInternetPopupDelegateProvider.get());
        BaseActivity_MembersInjector.injectInternetConnectionDialogsManager(appActivity, this.internetConnectionDialogsManagerProvider.get());
        injectAppCicerone(appActivity, this.appCiceroneProvider.get());
        injectAppFlowCoordinator(appActivity, this.appFlowCoordinatorProvider.get());
        injectNotificationsMapper(appActivity, this.notificationsMapperProvider.get());
        injectMessagesSourceLifecycleController(appActivity, this.messagesSourceLifecycleControllerProvider.get());
        injectNotificationHandlersRegister(appActivity, this.notificationHandlersRegisterProvider.get());
        injectViewModelFactory(appActivity, this.viewModelFactoryProvider.get());
        injectChatScreenFactory(appActivity, this.chatScreenFactoryProvider.get());
        injectListenTagsUseCase(appActivity, this.listenTagsUseCaseProvider.get());
        injectCoroutineDispatchers(appActivity, this.coroutineDispatchersProvider.get());
    }

    public static void injectAppCicerone(AppActivity appActivity, Cicerone<AppRouter> cicerone) {
        appActivity.appCicerone = cicerone;
    }

    public static void injectAppFlowCoordinator(AppActivity appActivity, AppFlowCoordinator appFlowCoordinator) {
        appActivity.appFlowCoordinator = appFlowCoordinator;
    }

    public static void injectNotificationsMapper(AppActivity appActivity, Mapper<InternalNotification, SnackbarDescription> mapper) {
        appActivity.notificationsMapper = mapper;
    }

    @MessagesSourceLifecycleObserver
    public static void injectMessagesSourceLifecycleController(AppActivity appActivity, DefaultLifecycleObserver defaultLifecycleObserver) {
        appActivity.messagesSourceLifecycleController = defaultLifecycleObserver;
    }

    public static void injectNotificationHandlersRegister(AppActivity appActivity, InternalNotificationHandlersRegister internalNotificationHandlersRegister) {
        appActivity.notificationHandlersRegister = internalNotificationHandlersRegister;
    }

    public static void injectViewModelFactory(AppActivity appActivity, ViewModelFactory viewModelFactory) {
        appActivity.viewModelFactory = viewModelFactory;
    }

    public static void injectChatScreenFactory(AppActivity appActivity, ChatScreenFactory chatScreenFactory) {
        appActivity.chatScreenFactory = chatScreenFactory;
    }

    public static void injectListenTagsUseCase(AppActivity appActivity, ListenTagsUseCase listenTagsUseCase) {
        appActivity.listenTagsUseCase = listenTagsUseCase;
    }

    public static void injectCoroutineDispatchers(AppActivity appActivity, CoroutineDispatchers coroutineDispatchers) {
        appActivity.coroutineDispatchers = coroutineDispatchers;
    }
}
