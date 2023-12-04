package com.ifriend.registration.presentation.ui;

import com.ifriend.analytics.usecase.auth.AuthScreenOpenedAnalytics;
import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.cicerone.Cicerone;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.infrastucture.InternetConnectionDialogsManager;
import com.ifriend.internal_notifications.notification.InternalNotification;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.registration.domain.applicationState.ApplicationState;
import com.ifriend.ui.base.BaseActivity_MembersInjector;
import com.ifriend.ui.base.modalMessage.NoInternetPopupDelegate;
import com.ifriend.ui.internalNotifications.SnackbarDescription;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class RegistrationActivity_MembersInjector implements MembersInjector<RegistrationActivity> {
    private final Provider<Cicerone<AppRouter>> appCiceroneProvider;
    private final Provider<ApplicationState> applicationStateProvider;
    private final Provider<AuthScreenOpenedAnalytics> authOpenedAnalyticsProvider;
    private final Provider<InternetConnectionDialogsManager> internetConnectionDialogsManagerProvider;
    private final Provider<NoInternetPopupDelegate> noInternetPopupDelegateProvider;
    private final Provider<InternalNotificationHandlersRegister> notificationHandlersRegisterProvider;
    private final Provider<Mapper<InternalNotification, SnackbarDescription>> notificationsMapperProvider;
    private final Provider<RegistrationViewModelFactory> viewModelFactoryProvider;

    public RegistrationActivity_MembersInjector(Provider<NoInternetPopupDelegate> provider, Provider<InternetConnectionDialogsManager> provider2, Provider<ApplicationState> provider3, Provider<InternalNotificationHandlersRegister> provider4, Provider<Mapper<InternalNotification, SnackbarDescription>> provider5, Provider<Cicerone<AppRouter>> provider6, Provider<RegistrationViewModelFactory> provider7, Provider<AuthScreenOpenedAnalytics> provider8) {
        this.noInternetPopupDelegateProvider = provider;
        this.internetConnectionDialogsManagerProvider = provider2;
        this.applicationStateProvider = provider3;
        this.notificationHandlersRegisterProvider = provider4;
        this.notificationsMapperProvider = provider5;
        this.appCiceroneProvider = provider6;
        this.viewModelFactoryProvider = provider7;
        this.authOpenedAnalyticsProvider = provider8;
    }

    public static MembersInjector<RegistrationActivity> create(Provider<NoInternetPopupDelegate> provider, Provider<InternetConnectionDialogsManager> provider2, Provider<ApplicationState> provider3, Provider<InternalNotificationHandlersRegister> provider4, Provider<Mapper<InternalNotification, SnackbarDescription>> provider5, Provider<Cicerone<AppRouter>> provider6, Provider<RegistrationViewModelFactory> provider7, Provider<AuthScreenOpenedAnalytics> provider8) {
        return new RegistrationActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RegistrationActivity registrationActivity) {
        BaseActivity_MembersInjector.injectNoInternetPopupDelegate(registrationActivity, this.noInternetPopupDelegateProvider.get());
        BaseActivity_MembersInjector.injectInternetConnectionDialogsManager(registrationActivity, this.internetConnectionDialogsManagerProvider.get());
        injectApplicationState(registrationActivity, this.applicationStateProvider.get());
        injectNotificationHandlersRegister(registrationActivity, this.notificationHandlersRegisterProvider.get());
        injectNotificationsMapper(registrationActivity, this.notificationsMapperProvider.get());
        injectAppCicerone(registrationActivity, this.appCiceroneProvider.get());
        injectViewModelFactory(registrationActivity, this.viewModelFactoryProvider.get());
        injectAuthOpenedAnalytics(registrationActivity, this.authOpenedAnalyticsProvider.get());
    }

    public static void injectApplicationState(RegistrationActivity registrationActivity, ApplicationState applicationState) {
        registrationActivity.applicationState = applicationState;
    }

    public static void injectNotificationHandlersRegister(RegistrationActivity registrationActivity, InternalNotificationHandlersRegister internalNotificationHandlersRegister) {
        registrationActivity.notificationHandlersRegister = internalNotificationHandlersRegister;
    }

    public static void injectNotificationsMapper(RegistrationActivity registrationActivity, Mapper<InternalNotification, SnackbarDescription> mapper) {
        registrationActivity.notificationsMapper = mapper;
    }

    public static void injectAppCicerone(RegistrationActivity registrationActivity, Cicerone<AppRouter> cicerone) {
        registrationActivity.appCicerone = cicerone;
    }

    public static void injectViewModelFactory(RegistrationActivity registrationActivity, RegistrationViewModelFactory registrationViewModelFactory) {
        registrationActivity.viewModelFactory = registrationViewModelFactory;
    }

    public static void injectAuthOpenedAnalytics(RegistrationActivity registrationActivity, AuthScreenOpenedAnalytics authScreenOpenedAnalytics) {
        registrationActivity.authOpenedAnalytics = authScreenOpenedAnalytics;
    }
}
