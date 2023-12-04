package com.ifriend.registration.presentation.di;

import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.common.collect.ImmutableMap;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.analytics.di.AnalyticUseCasesModule;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsAppOpenUpUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsFirstAppOpenUpUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsSetUserIdUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsSignUpUseCaseFactory;
import com.ifriend.analytics.usecase.appOpen.AnalyticsAppOpenUseCase;
import com.ifriend.analytics.usecase.appOpen.AnalyticsFirstAppOpenUseCase;
import com.ifriend.analytics.usecase.auth.AnalyticsSetUserIdUseCase;
import com.ifriend.analytics.usecase.auth.AuthScreenOpenedAnalytics;
import com.ifriend.analytics.usecase.auth.UserAuthorizedAnalyticsSender;
import com.ifriend.base.di.BaseComponent;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.base.navigation.api.cicerone.Cicerone;
import com.ifriend.chat.api.AppActivityScreenFactory;
import com.ifriend.common_utils.Logger;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.authorization.Authorizer;
import com.ifriend.domain.authorization.SignInWithTokenUseCase;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.ResetPasswordRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.config.AppConfigRepository;
import com.ifriend.domain.data.install.AppInstallStorage;
import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import com.ifriend.domain.data.update.InAppUpdateRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.domain.infrastucture.InternetConnectionDialogsManager;
import com.ifriend.domain.logic.onboarding.UpdateOnboardingUseCase;
import com.ifriend.domain.logic.onboarding.UpdateOnboardingUseCase_Factory;
import com.ifriend.domain.logic.updates.UpdatePromptInteractor;
import com.ifriend.domain.onboarding.interactor.OnboardingInteractor;
import com.ifriend.domain.onboarding.interactor.OnboardingInteractor_Factory;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.domain.useCases.AppConfigUseCase_Factory;
import com.ifriend.domain.validation.EmailValidator;
import com.ifriend.domain.validation.ValidateCredentialsUseCase;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.internal_notifications.notification.InternalNotification;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.popup.api.PopupFragmentFactory;
import com.ifriend.presentation.features.update.analytics.InAppUpdateAnalytics;
import com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl;
import com.ifriend.registration.domain.applicationState.ApplicationState;
import com.ifriend.registration.domain.useCase.email.SignUpEmailUseCase;
import com.ifriend.registration.domain.useCase.facebook.AuthWithFacebookUseCase;
import com.ifriend.registration.domain.useCase.google.AuthWithGoogleUseCase;
import com.ifriend.registration.domain.useCase.password.PasswordGenerator;
import com.ifriend.registration.presentation.bridges.facebook.FacebookAuthorizationBridge;
import com.ifriend.registration.presentation.di.RegistrationComponent;
import com.ifriend.registration.presentation.ui.RegistrationActivity;
import com.ifriend.registration.presentation.ui.RegistrationActivity_MembersInjector;
import com.ifriend.registration.presentation.ui.RegistrationViewModelFactory;
import com.ifriend.registration.presentation.ui.email.DebugFragment;
import com.ifriend.registration.presentation.ui.email.EmailRegistrationFragment;
import com.ifriend.registration.presentation.ui.email.EmailRegistrationFragment_MembersInjector;
import com.ifriend.registration.presentation.ui.email.EmailRegistrationViewModel;
import com.ifriend.registration.presentation.ui.email.EmailRegistrationViewModel_Factory;
import com.ifriend.registration.presentation.ui.email.resetPassword.ResetPasswordFragment;
import com.ifriend.registration.presentation.ui.email.resetPassword.ResetPasswordFragment_MembersInjector;
import com.ifriend.registration.presentation.ui.email.resetPassword.ResetPasswordViewModel;
import com.ifriend.registration.presentation.ui.email.resetPassword.ResetPasswordViewModel_Factory;
import com.ifriend.registration.presentation.ui.internalNotifications.NotificationToSnackbarMapper;
import com.ifriend.registration.presentation.ui.internalNotifications.NotificationToSnackbarMapper_Factory;
import com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationFragment;
import com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationFragment_MembersInjector;
import com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationViewModel;
import com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationViewModel_Factory;
import com.ifriend.ui.base.BaseActivity;
import com.ifriend.ui.base.BaseActivity_MembersInjector;
import com.ifriend.ui.base.BaseFragment_MembersInjector;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.modalMessage.NoInternetPopupDelegate;
import com.ifriend.ui.internalNotifications.SnackbarDescription;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class DaggerRegistrationComponent {
    private DaggerRegistrationComponent() {
    }

    public static RegistrationComponent.Builder builder() {
        return new Builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class Builder implements RegistrationComponent.Builder {
        private BaseActivity activity;
        private BaseComponent baseComponent;

        private Builder() {
        }

        @Override // com.ifriend.registration.presentation.di.RegistrationComponent.Builder
        public Builder coreComponent(BaseComponent baseComponent) {
            this.baseComponent = (BaseComponent) Preconditions.checkNotNull(baseComponent);
            return this;
        }

        @Override // com.ifriend.registration.presentation.di.RegistrationComponent.Builder
        public Builder activity(BaseActivity baseActivity) {
            this.activity = (BaseActivity) Preconditions.checkNotNull(baseActivity);
            return this;
        }

        @Override // com.ifriend.registration.presentation.di.RegistrationComponent.Builder
        public RegistrationComponent build() {
            Preconditions.checkBuilderRequirement(this.baseComponent, BaseComponent.class);
            Preconditions.checkBuilderRequirement(this.activity, BaseActivity.class);
            return new RegistrationComponentImpl(new AnalyticUseCasesModule(), new AppStateModule(), new AuthAnalyticsModule(), this.baseComponent, this.activity);
        }
    }

    /* loaded from: classes6.dex */
    private static final class RegistrationComponentImpl implements RegistrationComponent {
        private Provider<BaseActivity> activityProvider;
        private Provider<AppConfigUseCase> appConfigUseCaseProvider;
        private final BaseComponent baseComponent;
        private Provider<Mapper<InternalNotification, SnackbarDescription>> bindNotificationToSnackbarMapperProvider;
        private Provider<EmailRegistrationViewModel> emailRegistrationViewModelProvider;
        private Provider<NotificationToSnackbarMapper> notificationToSnackbarMapperProvider;
        private Provider<OnboardingInteractor> onboardingInteractorProvider;
        private Provider<AnalyticsAppOpenUseCase> provideAnalyticsAppOpenUpUseCaseProvider;
        private Provider<AnalyticsFirstAppOpenUseCase> provideAnalyticsFirstAppOpenUpUseCaseProvider;
        private Provider<AnalyticsSetUserIdUseCase> provideAnalyticsSetUserIdUseCaseProvider;
        private Provider<UserAuthorizedAnalyticsSender> provideAnalyticsSignUpUseCaseProvider;
        private Provider<AnalyticsSender> provideAnnalsTrackerAnalyticsSenderProvider;
        private Provider<AppCompatActivity> provideAppCompatActivityProvider;
        private Provider<AppConfigRepository> provideAppConfigRepositoryProvider;
        private Provider<AppInstallStorage> provideAppInstallStorageProvider;
        private Provider<ApplicationState> provideApplicationStateProvider;
        private Provider<AnalyticsSender> provideAppsFlyerAnalyticsSenderProvider;
        private Provider<AuthScreenOpenedAnalytics> provideAuthScreenOpenedAnalyticsProvider;
        private Provider<AuthWithGoogleUseCase> provideAuthWithGoogleUseCaseProvider;
        private Provider<Authorizer> provideAuthorizerProvider;
        private Provider<BotRepository> provideBotRepositoryProvider;
        private Provider<CoroutineDispatchers> provideCoroutineDispatchersProvider;
        private Provider<CoroutineScope> provideCoroutineScopeProvider;
        private Provider<Preferences> provideDevicePreferencesProvider;
        private Provider<EmailValidator> provideEmailValidatorProvider;
        private Provider<FacebookAuthorizationBridge> provideFacebookAuthorizationBridgeProvider;
        private Provider<AnalyticsSender> provideFirebaseAnalyticsSenderProvider;
        private Provider<InitialDataLoader> provideInitialDataLoaderProvider;
        private Provider<InternalNotificationHandler> provideInternalNotificationHandlerProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<OnboardingAnswersRepository> provideOnboardingAnswersRepositoryProvider;
        private Provider<PasswordGenerator> providePasswordGeneratorProvider;
        private Provider<ResetPasswordRepository> provideResetPasswordRepositoryProvider;
        private Provider<Resources> provideResourcesProvider;
        private Provider<SignInWithTokenUseCase> provideSignInUseCaseProvider;
        private Provider<SignUpEmailUseCase> provideSignUpEmailUseCaseProvider;
        private Provider<AuthWithFacebookUseCase> provideSignUpFacebookUseCaseProvider;
        private Provider<UserProfileRepository> provideUserConfigRepositoryProvider;
        private Provider<UserRepository> provideUserRepositoryProvider;
        private Provider<Preferences> provideUserSessionSharedPreferencesProvider;
        private Provider<ValidateCredentialsUseCase> provideValidateCredentialsUseCaseProvider;
        private final RegistrationComponentImpl registrationComponentImpl;
        private Provider<ResetPasswordViewModel> resetPasswordViewModelProvider;
        private Provider<UpdateOnboardingUseCase> updateOnboardingUseCaseProvider;
        private Provider<VideoBackgroundRegistrationViewModel> videoBackgroundRegistrationViewModelProvider;

        private RegistrationComponentImpl(AnalyticUseCasesModule analyticUseCasesModule, AppStateModule appStateModule, AuthAnalyticsModule authAnalyticsModule, BaseComponent baseComponent, BaseActivity baseActivity) {
            this.registrationComponentImpl = this;
            this.baseComponent = baseComponent;
            initialize(analyticUseCasesModule, appStateModule, authAnalyticsModule, baseComponent, baseActivity);
        }

        private NoInternetPopupDelegate noInternetPopupDelegate() {
            return new NoInternetPopupDelegate((PopupFragmentFactory) Preconditions.checkNotNullFromComponent(this.baseComponent.popupFragmentFactory()), (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
        }

        private UpdatePromptInteractor updatePromptInteractor() {
            return new UpdatePromptInteractor((InAppUpdateRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInAppUpdateRepository()), (AppConfigRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppConfigRepository()));
        }

        private InAppUpdateAnalytics inAppUpdateAnalytics() {
            return new InAppUpdateAnalytics((AnalyticsInteractor) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAnalyticsInteractor()));
        }

        private InAppUpdateDelegateImpl inAppUpdateDelegateImpl() {
            return new InAppUpdateDelegateImpl((AppUpdateManager) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppUpdateManager()), updatePromptInteractor(), inAppUpdateAnalytics());
        }

        private RegistrationViewModelFactory registrationViewModelFactory() {
            return new RegistrationViewModelFactory(inAppUpdateDelegateImpl(), (AppConfigRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppConfigRepository()), (DispatcherProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDispatcherProvider()));
        }

        private Map<Class<? extends ViewModel>, Provider<ViewModel>> mapOfClassOfAndProviderOfViewModel() {
            return ImmutableMap.of(EmailRegistrationViewModel.class, (Provider<VideoBackgroundRegistrationViewModel>) this.emailRegistrationViewModelProvider, ResetPasswordViewModel.class, (Provider<VideoBackgroundRegistrationViewModel>) this.resetPasswordViewModelProvider, VideoBackgroundRegistrationViewModel.class, this.videoBackgroundRegistrationViewModelProvider);
        }

        private ViewModelFactory viewModelFactory() {
            return new ViewModelFactory(mapOfClassOfAndProviderOfViewModel());
        }

        private void initialize(AnalyticUseCasesModule analyticUseCasesModule, AppStateModule appStateModule, AuthAnalyticsModule authAnalyticsModule, BaseComponent baseComponent, BaseActivity baseActivity) {
            this.provideFirebaseAnalyticsSenderProvider = new ProvideFirebaseAnalyticsSenderProvider(baseComponent);
            ProvideAppsFlyerAnalyticsSenderProvider provideAppsFlyerAnalyticsSenderProvider = new ProvideAppsFlyerAnalyticsSenderProvider(baseComponent);
            this.provideAppsFlyerAnalyticsSenderProvider = provideAppsFlyerAnalyticsSenderProvider;
            this.provideAnalyticsAppOpenUpUseCaseProvider = AnalyticUseCasesModule_ProvideAnalyticsAppOpenUpUseCaseFactory.create(analyticUseCasesModule, this.provideFirebaseAnalyticsSenderProvider, provideAppsFlyerAnalyticsSenderProvider);
            this.provideAnalyticsFirstAppOpenUpUseCaseProvider = AnalyticUseCasesModule_ProvideAnalyticsFirstAppOpenUpUseCaseFactory.create(analyticUseCasesModule, this.provideFirebaseAnalyticsSenderProvider);
            ProvideUserSessionSharedPreferencesProvider provideUserSessionSharedPreferencesProvider = new ProvideUserSessionSharedPreferencesProvider(baseComponent);
            this.provideUserSessionSharedPreferencesProvider = provideUserSessionSharedPreferencesProvider;
            this.provideApplicationStateProvider = DoubleCheck.provider(AppStateModule_ProvideApplicationStateFactory.create(appStateModule, this.provideAnalyticsAppOpenUpUseCaseProvider, this.provideAnalyticsFirstAppOpenUpUseCaseProvider, provideUserSessionSharedPreferencesProvider));
            Factory create = InstanceFactory.create(baseActivity);
            this.activityProvider = create;
            Provider<AppCompatActivity> provider = DoubleCheck.provider(AuthorizationModule_Companion_ProvideAppCompatActivityFactory.create(create));
            this.provideAppCompatActivityProvider = provider;
            Provider<Resources> provider2 = DoubleCheck.provider(AuthorizationModule_Companion_ProvideResourcesFactory.create(provider));
            this.provideResourcesProvider = provider2;
            NotificationToSnackbarMapper_Factory create2 = NotificationToSnackbarMapper_Factory.create(provider2);
            this.notificationToSnackbarMapperProvider = create2;
            this.bindNotificationToSnackbarMapperProvider = DoubleCheck.provider(create2);
            this.provideDevicePreferencesProvider = new ProvideDevicePreferencesProvider(baseComponent);
            this.provideCoroutineScopeProvider = new ProvideCoroutineScopeProvider(baseComponent);
            this.provideCoroutineDispatchersProvider = new ProvideCoroutineDispatchersProvider(baseComponent);
            this.provideAppInstallStorageProvider = new ProvideAppInstallStorageProvider(baseComponent);
            ProvideAnnalsTrackerAnalyticsSenderProvider provideAnnalsTrackerAnalyticsSenderProvider = new ProvideAnnalsTrackerAnalyticsSenderProvider(baseComponent);
            this.provideAnnalsTrackerAnalyticsSenderProvider = provideAnnalsTrackerAnalyticsSenderProvider;
            this.provideAuthScreenOpenedAnalyticsProvider = DoubleCheck.provider(AuthAnalyticsModule_ProvideAuthScreenOpenedAnalyticsFactory.create(authAnalyticsModule, this.provideDevicePreferencesProvider, this.provideCoroutineScopeProvider, this.provideCoroutineDispatchersProvider, this.provideAppInstallStorageProvider, provideAnnalsTrackerAnalyticsSenderProvider));
            this.provideValidateCredentialsUseCaseProvider = new ProvideValidateCredentialsUseCaseProvider(baseComponent);
            this.provideAuthorizerProvider = new ProvideAuthorizerProvider(baseComponent);
            this.provideAnalyticsSignUpUseCaseProvider = AnalyticUseCasesModule_ProvideAnalyticsSignUpUseCaseFactory.create(analyticUseCasesModule, this.provideAppInstallStorageProvider, this.provideFirebaseAnalyticsSenderProvider, this.provideAppsFlyerAnalyticsSenderProvider, this.provideAnnalsTrackerAnalyticsSenderProvider);
            this.provideAnalyticsSetUserIdUseCaseProvider = AnalyticUseCasesModule_ProvideAnalyticsSetUserIdUseCaseFactory.create(analyticUseCasesModule, this.provideFirebaseAnalyticsSenderProvider, this.provideAppsFlyerAnalyticsSenderProvider);
            this.provideUserConfigRepositoryProvider = new ProvideUserConfigRepositoryProvider(baseComponent);
            this.provideUserRepositoryProvider = new ProvideUserRepositoryProvider(baseComponent);
            this.provideBotRepositoryProvider = new ProvideBotRepositoryProvider(baseComponent);
            ProvideOnboardingAnswersRepositoryProvider provideOnboardingAnswersRepositoryProvider = new ProvideOnboardingAnswersRepositoryProvider(baseComponent);
            this.provideOnboardingAnswersRepositoryProvider = provideOnboardingAnswersRepositoryProvider;
            OnboardingInteractor_Factory create3 = OnboardingInteractor_Factory.create(this.provideUserRepositoryProvider, this.provideBotRepositoryProvider, provideOnboardingAnswersRepositoryProvider);
            this.onboardingInteractorProvider = create3;
            this.updateOnboardingUseCaseProvider = UpdateOnboardingUseCase_Factory.create(this.provideUserConfigRepositoryProvider, create3);
            this.provideInitialDataLoaderProvider = new ProvideInitialDataLoaderProvider(baseComponent);
            ProvideEmailValidatorProvider provideEmailValidatorProvider = new ProvideEmailValidatorProvider(baseComponent);
            this.provideEmailValidatorProvider = provideEmailValidatorProvider;
            this.provideSignUpEmailUseCaseProvider = DoubleCheck.provider(AuthorizationModule_Companion_ProvideSignUpEmailUseCaseFactory.create(this.provideAuthorizerProvider, this.provideAnalyticsSignUpUseCaseProvider, this.provideAnalyticsSetUserIdUseCaseProvider, this.updateOnboardingUseCaseProvider, this.provideInitialDataLoaderProvider, provideEmailValidatorProvider));
            ProvideLoggerProvider provideLoggerProvider = new ProvideLoggerProvider(baseComponent);
            this.provideLoggerProvider = provideLoggerProvider;
            this.emailRegistrationViewModelProvider = EmailRegistrationViewModel_Factory.create(this.provideValidateCredentialsUseCaseProvider, this.provideSignUpEmailUseCaseProvider, provideLoggerProvider);
            this.provideResetPasswordRepositoryProvider = new ProvideResetPasswordRepositoryProvider(baseComponent);
            ProvideInternalNotificationHandlerProvider provideInternalNotificationHandlerProvider = new ProvideInternalNotificationHandlerProvider(baseComponent);
            this.provideInternalNotificationHandlerProvider = provideInternalNotificationHandlerProvider;
            this.resetPasswordViewModelProvider = ResetPasswordViewModel_Factory.create(this.provideResetPasswordRepositoryProvider, provideInternalNotificationHandlerProvider, this.provideCoroutineDispatchersProvider);
            Provider<PasswordGenerator> provider3 = DoubleCheck.provider(AuthorizationModule_Companion_ProvidePasswordGeneratorFactory.create());
            this.providePasswordGeneratorProvider = provider3;
            this.provideSignUpFacebookUseCaseProvider = DoubleCheck.provider(AuthorizationModule_Companion_ProvideSignUpFacebookUseCaseFactory.create(this.provideAuthorizerProvider, this.provideUserRepositoryProvider, this.provideInitialDataLoaderProvider, provider3, this.updateOnboardingUseCaseProvider));
            this.provideAuthWithGoogleUseCaseProvider = DoubleCheck.provider(AuthorizationModule_Companion_ProvideAuthWithGoogleUseCaseFactory.create(this.provideAuthorizerProvider, this.provideUserRepositoryProvider, this.provideInitialDataLoaderProvider, this.providePasswordGeneratorProvider, this.provideLoggerProvider, this.updateOnboardingUseCaseProvider));
            this.provideFacebookAuthorizationBridgeProvider = DoubleCheck.provider(AuthorizationModule_Companion_ProvideFacebookAuthorizationBridgeFactory.create());
            this.provideSignInUseCaseProvider = new ProvideSignInUseCaseProvider(baseComponent);
            ProvideAppConfigRepositoryProvider provideAppConfigRepositoryProvider = new ProvideAppConfigRepositoryProvider(baseComponent);
            this.provideAppConfigRepositoryProvider = provideAppConfigRepositoryProvider;
            AppConfigUseCase_Factory create4 = AppConfigUseCase_Factory.create(provideAppConfigRepositoryProvider);
            this.appConfigUseCaseProvider = create4;
            this.videoBackgroundRegistrationViewModelProvider = VideoBackgroundRegistrationViewModel_Factory.create(this.provideAnalyticsSignUpUseCaseProvider, this.provideAnalyticsSetUserIdUseCaseProvider, this.provideSignUpFacebookUseCaseProvider, this.provideAuthWithGoogleUseCaseProvider, this.provideFacebookAuthorizationBridgeProvider, this.provideSignInUseCaseProvider, create4, this.provideLoggerProvider, this.provideCoroutineDispatchersProvider);
        }

        @Override // com.ifriend.ui.base.di.ActivityComponent
        public void inject(BaseActivity baseActivity) {
            injectBaseActivity(baseActivity);
        }

        @Override // com.ifriend.registration.presentation.di.RegistrationComponent
        public void inject(RegistrationActivity registrationActivity) {
            injectRegistrationActivity(registrationActivity);
        }

        @Override // com.ifriend.registration.presentation.di.RegistrationComponent
        public void inject(EmailRegistrationFragment emailRegistrationFragment) {
            injectEmailRegistrationFragment(emailRegistrationFragment);
        }

        @Override // com.ifriend.registration.presentation.di.RegistrationComponent
        public void inject(ResetPasswordFragment resetPasswordFragment) {
            injectResetPasswordFragment(resetPasswordFragment);
        }

        @Override // com.ifriend.registration.presentation.di.RegistrationComponent
        public void inject(VideoBackgroundRegistrationFragment videoBackgroundRegistrationFragment) {
            injectVideoBackgroundRegistrationFragment(videoBackgroundRegistrationFragment);
        }

        @Override // com.ifriend.registration.presentation.di.RegistrationComponent
        public void inject(DebugFragment debugFragment) {
            injectDebugFragment(debugFragment);
        }

        private BaseActivity injectBaseActivity(BaseActivity baseActivity) {
            BaseActivity_MembersInjector.injectNoInternetPopupDelegate(baseActivity, noInternetPopupDelegate());
            BaseActivity_MembersInjector.injectInternetConnectionDialogsManager(baseActivity, (InternetConnectionDialogsManager) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnectionDialogsManager()));
            return baseActivity;
        }

        private RegistrationActivity injectRegistrationActivity(RegistrationActivity registrationActivity) {
            BaseActivity_MembersInjector.injectNoInternetPopupDelegate(registrationActivity, noInternetPopupDelegate());
            BaseActivity_MembersInjector.injectInternetConnectionDialogsManager(registrationActivity, (InternetConnectionDialogsManager) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnectionDialogsManager()));
            RegistrationActivity_MembersInjector.injectApplicationState(registrationActivity, this.provideApplicationStateProvider.get());
            RegistrationActivity_MembersInjector.injectNotificationHandlersRegister(registrationActivity, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            RegistrationActivity_MembersInjector.injectNotificationsMapper(registrationActivity, this.bindNotificationToSnackbarMapperProvider.get());
            RegistrationActivity_MembersInjector.injectAppCicerone(registrationActivity, (Cicerone) Preconditions.checkNotNullFromComponent(this.baseComponent.appCicerone()));
            RegistrationActivity_MembersInjector.injectViewModelFactory(registrationActivity, registrationViewModelFactory());
            RegistrationActivity_MembersInjector.injectAuthOpenedAnalytics(registrationActivity, this.provideAuthScreenOpenedAnalyticsProvider.get());
            return registrationActivity;
        }

        private EmailRegistrationFragment injectEmailRegistrationFragment(EmailRegistrationFragment emailRegistrationFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(emailRegistrationFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(emailRegistrationFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(emailRegistrationFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(emailRegistrationFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            EmailRegistrationFragment_MembersInjector.injectViewModelFactory(emailRegistrationFragment, viewModelFactory());
            EmailRegistrationFragment_MembersInjector.injectAppActivityScreenFactory(emailRegistrationFragment, (AppActivityScreenFactory) Preconditions.checkNotNullFromComponent(this.baseComponent.appActivityScreenFactory()));
            return emailRegistrationFragment;
        }

        private ResetPasswordFragment injectResetPasswordFragment(ResetPasswordFragment resetPasswordFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(resetPasswordFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(resetPasswordFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(resetPasswordFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(resetPasswordFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            ResetPasswordFragment_MembersInjector.injectViewModelFactory(resetPasswordFragment, viewModelFactory());
            return resetPasswordFragment;
        }

        private VideoBackgroundRegistrationFragment injectVideoBackgroundRegistrationFragment(VideoBackgroundRegistrationFragment videoBackgroundRegistrationFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(videoBackgroundRegistrationFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(videoBackgroundRegistrationFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(videoBackgroundRegistrationFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(videoBackgroundRegistrationFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            VideoBackgroundRegistrationFragment_MembersInjector.injectViewModelFactory(videoBackgroundRegistrationFragment, viewModelFactory());
            VideoBackgroundRegistrationFragment_MembersInjector.injectAppActivityScreenFactory(videoBackgroundRegistrationFragment, (AppActivityScreenFactory) Preconditions.checkNotNullFromComponent(this.baseComponent.appActivityScreenFactory()));
            VideoBackgroundRegistrationFragment_MembersInjector.injectNoInternetPopupDelegate(videoBackgroundRegistrationFragment, noInternetPopupDelegate());
            return videoBackgroundRegistrationFragment;
        }

        private DebugFragment injectDebugFragment(DebugFragment debugFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(debugFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(debugFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(debugFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(debugFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            return debugFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideFirebaseAnalyticsSenderProvider implements Provider<AnalyticsSender> {
            private final BaseComponent baseComponent;

            ProvideFirebaseAnalyticsSenderProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AnalyticsSender get() {
                return (AnalyticsSender) Preconditions.checkNotNullFromComponent(this.baseComponent.provideFirebaseAnalyticsSender());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideAppsFlyerAnalyticsSenderProvider implements Provider<AnalyticsSender> {
            private final BaseComponent baseComponent;

            ProvideAppsFlyerAnalyticsSenderProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AnalyticsSender get() {
                return (AnalyticsSender) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppsFlyerAnalyticsSender());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideUserSessionSharedPreferencesProvider implements Provider<Preferences> {
            private final BaseComponent baseComponent;

            ProvideUserSessionSharedPreferencesProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public Preferences get() {
                return (Preferences) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserSessionSharedPreferences());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideDevicePreferencesProvider implements Provider<Preferences> {
            private final BaseComponent baseComponent;

            ProvideDevicePreferencesProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public Preferences get() {
                return (Preferences) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDevicePreferences());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideCoroutineScopeProvider implements Provider<CoroutineScope> {
            private final BaseComponent baseComponent;

            ProvideCoroutineScopeProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            @Override // javax.inject.Provider
            public CoroutineScope get() {
                return (CoroutineScope) Preconditions.checkNotNullFromComponent(this.baseComponent.provideCoroutineScope());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideCoroutineDispatchersProvider implements Provider<CoroutineDispatchers> {
            private final BaseComponent baseComponent;

            ProvideCoroutineDispatchersProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public CoroutineDispatchers get() {
                return (CoroutineDispatchers) Preconditions.checkNotNullFromComponent(this.baseComponent.provideCoroutineDispatchers());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideAppInstallStorageProvider implements Provider<AppInstallStorage> {
            private final BaseComponent baseComponent;

            ProvideAppInstallStorageProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AppInstallStorage get() {
                return (AppInstallStorage) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppInstallStorage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideAnnalsTrackerAnalyticsSenderProvider implements Provider<AnalyticsSender> {
            private final BaseComponent baseComponent;

            ProvideAnnalsTrackerAnalyticsSenderProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AnalyticsSender get() {
                return (AnalyticsSender) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAnnalsTrackerAnalyticsSender());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideValidateCredentialsUseCaseProvider implements Provider<ValidateCredentialsUseCase> {
            private final BaseComponent baseComponent;

            ProvideValidateCredentialsUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ValidateCredentialsUseCase get() {
                return (ValidateCredentialsUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideValidateCredentialsUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideAuthorizerProvider implements Provider<Authorizer> {
            private final BaseComponent baseComponent;

            ProvideAuthorizerProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public Authorizer get() {
                return (Authorizer) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAuthorizer());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideUserConfigRepositoryProvider implements Provider<UserProfileRepository> {
            private final BaseComponent baseComponent;

            ProvideUserConfigRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public UserProfileRepository get() {
                return (UserProfileRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserConfigRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideUserRepositoryProvider implements Provider<UserRepository> {
            private final BaseComponent baseComponent;

            ProvideUserRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public UserRepository get() {
                return (UserRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideBotRepositoryProvider implements Provider<BotRepository> {
            private final BaseComponent baseComponent;

            ProvideBotRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public BotRepository get() {
                return (BotRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideBotRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideOnboardingAnswersRepositoryProvider implements Provider<OnboardingAnswersRepository> {
            private final BaseComponent baseComponent;

            ProvideOnboardingAnswersRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public OnboardingAnswersRepository get() {
                return (OnboardingAnswersRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideOnboardingAnswersRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideInitialDataLoaderProvider implements Provider<InitialDataLoader> {
            private final BaseComponent baseComponent;

            ProvideInitialDataLoaderProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public InitialDataLoader get() {
                return (InitialDataLoader) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInitialDataLoader());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideEmailValidatorProvider implements Provider<EmailValidator> {
            private final BaseComponent baseComponent;

            ProvideEmailValidatorProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public EmailValidator get() {
                return (EmailValidator) Preconditions.checkNotNullFromComponent(this.baseComponent.provideEmailValidator());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideLoggerProvider implements Provider<Logger> {
            private final BaseComponent baseComponent;

            ProvideLoggerProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public Logger get() {
                return (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideResetPasswordRepositoryProvider implements Provider<ResetPasswordRepository> {
            private final BaseComponent baseComponent;

            ProvideResetPasswordRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ResetPasswordRepository get() {
                return (ResetPasswordRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideResetPasswordRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideInternalNotificationHandlerProvider implements Provider<InternalNotificationHandler> {
            private final BaseComponent baseComponent;

            ProvideInternalNotificationHandlerProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public InternalNotificationHandler get() {
                return (InternalNotificationHandler) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandler());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideSignInUseCaseProvider implements Provider<SignInWithTokenUseCase> {
            private final BaseComponent baseComponent;

            ProvideSignInUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public SignInWithTokenUseCase get() {
                return (SignInWithTokenUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideSignInUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideAppConfigRepositoryProvider implements Provider<AppConfigRepository> {
            private final BaseComponent baseComponent;

            ProvideAppConfigRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AppConfigRepository get() {
                return (AppConfigRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppConfigRepository());
            }
        }
    }
}
