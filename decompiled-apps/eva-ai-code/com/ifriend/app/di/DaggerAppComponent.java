package com.ifriend.app.di;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ViewModel;
import coil.ImageLoader;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.cloud.speech.v1.SpeechClient;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.gson.Gson;
import com.ifiend.billing.impl.data.BillingProductMapper_Factory;
import com.ifiend.billing.impl.data.BillingRepositoryImpl;
import com.ifiend.billing.impl.data.BillingRepositoryImpl_Factory;
import com.ifiend.billing.impl.logic.AppLaunchBillingFlowImpl;
import com.ifiend.billing.impl.logic.AppLaunchBillingFlowImpl_Factory;
import com.ifiend.billing.impl.logic.BillingInteractorImpl;
import com.ifiend.billing.impl.logic.BillingInteractorImpl_Factory;
import com.ifiend.billing.impl.logic.repository.BillingRepository;
import com.ifiend.billing.impl.manager.BillingManager;
import com.ifiend.billing.impl.manager.BillingManagerImpl;
import com.ifiend.billing.impl.manager.BillingManagerImpl_Factory;
import com.ifiend.billing.impl.manager.BillingResponseCodeMapper_Factory;
import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerApi;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.analytics.di.AnalyticUseCasesModule;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsAppOpenUpUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsFirstAppOpenUpUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsNotificationAppOpenedUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsNotificationReceivedUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsSetUserIdUseCaseFactory;
import com.ifriend.analytics.di.AnalyticsModule;
import com.ifriend.analytics.di.AnalyticsModule_AnalyticsEngineFactory;
import com.ifriend.analytics.di.AnalyticsModule_ProvideAnnalsTrackerAnalyticsSenderFactory;
import com.ifriend.analytics.di.AnalyticsModule_ProvideAnnalsTrackerApiFactory;
import com.ifriend.analytics.di.AnalyticsModule_ProvideAppsFlyerAnalyticsSenderFactory;
import com.ifriend.analytics.di.AnalyticsModule_ProvideFirebaseAnalyticsSenderFactory;
import com.ifriend.analytics.di.AnalyticsModule_ProvidePushNotificationOpenedAnalyticsSenderFactory;
import com.ifriend.analytics.di.AnalyticsModule_ProvidePushNotificationOpenedTrackerApiFactory;
import com.ifriend.analytics.impl.di.CoreAnalyticsModule_Companion_ProvideAnnalsAnalyticsRepositoryFactory;
import com.ifriend.analytics.impl.di.CoreAnalyticsModule_Companion_ProvideAppsFlyerAnalyticsRepositoryFactory;
import com.ifriend.analytics.impl.di.CoreAnalyticsModule_Companion_ProvideFirebaseAnalyticsRepositoryFactory;
import com.ifriend.analytics.impl.domain.logic.AnalyticsInteractorImpl;
import com.ifriend.analytics.impl.domain.logic.AnalyticsInteractorImpl_Factory;
import com.ifriend.analytics.impl.domain.logic.TrackExceptionUseCase;
import com.ifriend.analytics.impl.domain.logic.TrackExceptionUseCase_Factory;
import com.ifriend.analytics.impl.domain.repository.AnalyticsRepository;
import com.ifriend.analytics.pushNotificationOpenedTraker.PushNotificationOpenedTrackerApi;
import com.ifriend.analytics.usecase.appOpen.AnalyticsAppOpenUseCase;
import com.ifriend.analytics.usecase.appOpen.AnalyticsFirstAppOpenUseCase;
import com.ifriend.analytics.usecase.auth.AnalyticsSetUserIdUseCase;
import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationAppOpenedUseCase;
import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationReceivedUseCase;
import com.ifriend.app.App;
import com.ifriend.app.AppFirebaseMessagingService;
import com.ifriend.app.AppFirebaseMessagingService_MembersInjector;
import com.ifriend.app.App_MembersInjector;
import com.ifriend.app.PremiumIconDisabler;
import com.ifriend.app.appsflyer.AppsflyerDeepLinksManager;
import com.ifriend.app.di.AppComponent;
import com.ifriend.app.di.modules.AudioRecordingModule_Companion_ProvideAudioRecorderFactory;
import com.ifriend.app.di.modules.AudioRecordingModule_Companion_ProvideRecordedAudioFileStorageFactory;
import com.ifriend.app.di.modules.BaseAppModule;
import com.ifriend.app.di.modules.BaseAppModule_ProvideAppCoroutineScopeFactory;
import com.ifriend.app.di.modules.BaseAppModule_ProvideCoroutineDispatchersFactory;
import com.ifriend.app.di.modules.BaseAppModule_ProvideResourcesFactory;
import com.ifriend.app.di.modules.ConnectivityModule;
import com.ifriend.app.di.modules.ConnectivityModule_ProvideInternetConnectionFactory;
import com.ifriend.app.di.modules.ConnectivityModule_ProvideShowInternetConnectionDialogsUseCaseFactory;
import com.ifriend.app.di.modules.CoreAuthModule;
import com.ifriend.app.di.modules.CoreAuthModule_ProvideAuthorizerFactory;
import com.ifriend.app.di.modules.CoreAuthModule_ProvideConfirmEmailApiFactory;
import com.ifriend.app.di.modules.CoreAuthModule_ProvideConfirmEmailRepositoryFactory;
import com.ifriend.app.di.modules.CoreAuthModule_ProvideRegistrationApiFactory;
import com.ifriend.app.di.modules.CoreAuthModule_ProvideRegistrationProcessFactory;
import com.ifriend.app.di.modules.CoreAuthModule_ProvideSignInUseCaseFactory;
import com.ifriend.app.di.modules.GoogleServicesModule;
import com.ifriend.app.di.modules.GoogleServicesModule_ProvideAppUpdateManagerFactory;
import com.ifriend.app.di.modules.InitialDataLoadersModule;
import com.ifriend.app.di.modules.InitialDataLoadersModule_ProvideChatGiftsLoaderFactory;
import com.ifriend.app.di.modules.InitialDataLoadersModule_ProvideConfigurationBotsLoaderFactory;
import com.ifriend.app.di.modules.InitialDataLoadersModule_ProvideDiaryLoaderFactory;
import com.ifriend.app.di.modules.InitialDataLoadersModule_ProvideInitialAvatarLoaderFactory;
import com.ifriend.app.di.modules.InitialDataLoadersModule_ProvideInitialBotLoaderFactory;
import com.ifriend.app.di.modules.InitialDataLoadersModule_ProvideInitialConfigurationBotsAvatarLoaderFactory;
import com.ifriend.app.di.modules.InitialDataLoadersModule_ProvideInitialDataLoaderFactory;
import com.ifriend.app.di.modules.InitialDataLoadersModule_ProvideInitialLevelInfoLoaderFactory;
import com.ifriend.app.di.modules.InitialDataLoadersModule_ProvideInitialTagsLoaderFactory;
import com.ifriend.app.di.modules.InitialDataLoadersModule_ProvideInitialUserConfigLoaderFactory;
import com.ifriend.app.di.modules.InitialDataLoadersModule_ProvideInitialUserLoaderFactory;
import com.ifriend.app.di.modules.InternalNotificationsModule_Companion_ProvideAppInternalNotificationHandlerFactory;
import com.ifriend.app.di.modules.InternalNotificationsModule_Companion_ProvideAppNotifierFactory;
import com.ifriend.app.di.modules.LogsModule;
import com.ifriend.app.di.modules.LogsModule_ProvideProdLoggerFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_BindsDecodedAudioMessagesRepositoryFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvicedsAudioMessageRepositoryFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvideBotAudioMessageUrlGeneratorFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvideControllableMessagesSourceFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvideJsonToAddDiaryNotesMapperFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvideJsonToAvatarAnimationGeneratedMapperFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvideJsonToBotChangedMapperFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvideJsonToDailyNeuronsReceivedMapperFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvideJsonToGeneratedAvatarMapperFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvideJsonToLevelInfoUpdateMapperFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvideJsonToNeuronsAddedMapperFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvideJsonToTagOfUserMapperFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvideListenTagsUseCaseFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvideMediaPlayerPlaybackControllerGeneratorFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvideMessagesSourceLifecycleControllerFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvideSocketMessageToMessagesSourceMapperFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvideSocketMessageToNeuronsChangeMapperFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvideUrlProviderFactory;
import com.ifriend.app.di.modules.MessagesModule_Companion_ProvideUserAudioMessageUrlGeneratorFactory;
import com.ifriend.app.di.modules.NavigationModule;
import com.ifriend.app.di.modules.NavigationModule_ProvideAppCiceroneFactory;
import com.ifriend.app.di.modules.NavigationModule_ProvideCiceroneHolderFactory;
import com.ifriend.app.di.modules.NavigationModule_ProvideRouterProviderFactory;
import com.ifriend.app.di.modules.RateUsModule;
import com.ifriend.app.di.modules.RateUsModule_ProvideOnUserRateUsUseCaseFactory;
import com.ifriend.app.di.modules.RateUsModule_ProvideRateAppShowingPlannerFactory;
import com.ifriend.app.di.modules.RateUsModule_ProvideRateUsStateStorageFactory;
import com.ifriend.app.di.modules.RateUsModule_ProvideShowRateUsUseCaseFactory;
import com.ifriend.app.di.modules.ValidationModule;
import com.ifriend.app.di.modules.ValidationModule_ProvideEmailValidatorFactory;
import com.ifriend.app.di.modules.ValidationModule_ProvideValidateAgeUseCaseFactory;
import com.ifriend.app.di.modules.ValidationModule_ProvideValidateCredentialsUseCaseFactory;
import com.ifriend.app.di.modules.ValidationModule_ProvideValidateNameUseCaseFactory;
import com.ifriend.app.di.modules.data.ApiModule;
import com.ifriend.app.di.modules.data.ApiModule_ApiUrlFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideAnnalsApiServiceFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideAppBillingApiServiceFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideAppHttpClientFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideAppRetrofitFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideBotApiFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideCallApiServiceFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideChatConfigurationApiFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideChatsApiFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideChatsInfoApiFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideDiaryApiFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideFirebaseApiFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideFirebaseProcessFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideGenerateBotAvatarApiFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideHttpClientFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideLevelsApiFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideNeuronsApiFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideOnboardingApiFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideRateUsApiFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideResetPasswordApiFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideRetrofitFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideShardsApiFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideTagsApiFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideUserApiFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideUserApiServiceFactory;
import com.ifriend.app.di.modules.data.ApiModule_ProvideValidationApiFactory;
import com.ifriend.app.di.modules.data.ConfigModule_Companion_ProvideConditionsCheckerFactory;
import com.ifriend.app.di.modules.data.ConfigModule_Companion_ProvideFirebaseRemoteConfigParserFactory;
import com.ifriend.app.di.modules.data.ConfigModule_Companion_ProvideLocalConfigExtractorFactory;
import com.ifriend.app.di.modules.data.CoreDataModule_Companion_ProvideUserProfileRepositoryFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_AppInstallStorageFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideAppConfigStorageFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideAppImageLoaderFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideAppImageLoaderRepositoryFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideAuthDataStorageFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideAvatarAnimationEnabledStorageFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideAvatarGenerationStatusStorageFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideAvatarInfoStorageFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideAvatarsStorageFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideBotRepositoryFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideChatApiFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideChatGiftsApiFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideChatGiftsRepositoryFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideDiaryDaoFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideDiaryNoteReplierFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideDiaryRepositoryFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideEventDelayStorageFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideFileProviderFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideGenerateBotAvatarRepositoryFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideIsImageAllowedBroadcastFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideLevelsDaoFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideLevelsRepositoryFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideNeuronsCostsStorageFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideOnboardingAnswersRepositoryFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideRateUsRepositoryFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideResetPasswordRepositoryFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideShownDiaryNotesDaoFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideTagsProviderFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideTagsStorageFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideTopicsApiFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideUserProfileRepositoryFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideUserRepositoryFactory;
import com.ifriend.app.di.modules.data.DataModule_Companion_ProvideUserSubscriptionsBroadcastFactory;
import com.ifriend.app.di.modules.data.DataToolsModule_Companion_ProvideGsonFactory;
import com.ifriend.app.di.modules.data.LocalDataModule_Companion_ProvideDataStoreFactory;
import com.ifriend.app.di.modules.data.LocalDataModule_Companion_ProvideJsonFactory;
import com.ifriend.app.di.modules.data.PreferencesModule;
import com.ifriend.app.di.modules.data.PreferencesModule_ProvideDeviceByUserSharedPreferencesFactory;
import com.ifriend.app.di.modules.data.PreferencesModule_ProvideDeviceSharedPreferencesFactory;
import com.ifriend.app.di.modules.data.PreferencesModule_ProvideSecurePreferencesFactory;
import com.ifriend.app.di.modules.data.PreferencesModule_ProvideUserSharedPreferencesFactory;
import com.ifriend.app.di.modules.data.SharedTogglesModule;
import com.ifriend.app.di.modules.data.SharedTogglesModule_ProvideAnimatedAvatarFeatureToggleFactory;
import com.ifriend.app.di.modules.data.SharedTogglesModule_ProvideAnimatedAvatarOnChatToggleFactory;
import com.ifriend.app.di.modules.data.SharedTogglesModule_ProvideAnimatedBackgroundFeatureToggleFactory;
import com.ifriend.app.di.modules.data.SharedTogglesModule_ProvideAvatarGenerationFreeToggleFactory;
import com.ifriend.app.di.modules.data.SharedTogglesModule_ProvideAvatarInPushToggleFactory;
import com.ifriend.app.di.modules.data.SharedTogglesModule_ProvideAvatarInRetentionPushToggleFactory;
import com.ifriend.app.di.modules.data.SharedTogglesModule_ProvideConfirmEmailFeatureToggleFactory;
import com.ifriend.app.di.modules.data.SharedTogglesModule_ProvideNeuronsFeatureToggleFactory;
import com.ifriend.app.di.modules.data.SharedTogglesModule_ProvideRateAndReviewUsToggleFactory;
import com.ifriend.app.di.modules.data.TokenModule_Companion_ProvideKeychainUserTokenStorageFactory;
import com.ifriend.app.di.modules.data.core.InterceptorsModule;
import com.ifriend.app.di.modules.data.core.InterceptorsModule_ProvideHttpLoggingInterceptorFactory;
import com.ifriend.app.di.modules.data.core.InterceptorsModule_ProvidesAuthorizationInterceptorFactory;
import com.ifriend.app.di.modules.data.core.LocalDataSourceModule_Companion_ProviderKeychainAdapterFactory;
import com.ifriend.app.di.modules.data.core.LocalDataSourceModule_Companion_ProviderUserPreferencesFactory;
import com.ifriend.app.di.modules.data.datadog.DataDogModule;
import com.ifriend.app.di.modules.data.datadog.DataDogModule_ProvideDataDogApiServiceFactory;
import com.ifriend.app.di.modules.data.datadog.DataDogModule_ProvideDataDogHttpClientFactory;
import com.ifriend.app.di.modules.data.datadog.DataDogModule_ProvideDataDogRetrofitFactory;
import com.ifriend.app.di.modules.platform.PlatformToolsModule_Companion_ProvideSpeechClientFactory;
import com.ifriend.app.di.modules.usecases.ChangeBotModule;
import com.ifriend.app.di.modules.usecases.ChangeBotModule_ProvideChangeBotAgeUseCaseFactory;
import com.ifriend.app.di.modules.usecases.ChangeBotModule_ProvideChangeBotEthnicityUseCaseFactory;
import com.ifriend.app.di.modules.usecases.ChangeBotModule_ProvideChangeBotGenderUseCaseFactory;
import com.ifriend.app.di.modules.usecases.ChangeBotModule_ProvideChangeBotPersonalityUseCaseFactory;
import com.ifriend.app.di.modules.usecases.ChangeBotModule_ProvideChangeBotVoiceUseCaseFactory;
import com.ifriend.app.di.modules.usecases.ChangeUserModule;
import com.ifriend.app.di.modules.usecases.ChangeUserModule_ProvideSetUserAgeUseCaseFactory;
import com.ifriend.app.di.modules.usecases.ChangeUserModule_ProvideSetUserGenderUseCaseFactory;
import com.ifriend.app.di.modules.usecases.ChangeUserModule_ProvideSetUserNameUseCaseFactory;
import com.ifriend.app.di.modules.usecases.DiaryModule;
import com.ifriend.app.di.modules.usecases.DiaryModule_ProvideGetDiaryNotesListUseCaseFactory;
import com.ifriend.app.di.modules.usecases.DiaryModule_ProvideGetDiaryNotesUseCaseFactory;
import com.ifriend.app.di.modules.usecases.DiaryModule_ProvideOnDiaryShownUseCaseFactory;
import com.ifriend.app.di.modules.usecases.DiaryModule_ProvideRefreshDiaryUseCaseFactory;
import com.ifriend.app.di.modules.usecases.DiaryModule_ProvideReplyDiaryNoteUseCaseFactory;
import com.ifriend.app.di.modules.usecases.LevelsModule;
import com.ifriend.app.di.modules.usecases.LevelsModule_ProvideGetLevelsListUseCaseFactory;
import com.ifriend.app.di.modules.usecases.UseCasesModule_Companion_ProvideGetBotUseCaseFactory;
import com.ifriend.app.di.modules.usecases.UseCasesModule_Companion_ProvideGetUserUseCaseFactory;
import com.ifriend.app.ui.splash.SplashActivity;
import com.ifriend.app.ui.splash.SplashActivity_MembersInjector;
import com.ifriend.app.ui.splash.SplashViewModel;
import com.ifriend.app.ui.splash.SplashViewModel_Factory;
import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.CiceroneHolder;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.base.navigation.api.cicerone.Cicerone;
import com.ifriend.billing.api.logic.AppLaunchBillingFlow;
import com.ifriend.billing.api.logic.BillingInteractor;
import com.ifriend.chat.api.AppActivityScreenFactory;
import com.ifriend.chat.api.ChatScreenFactory;
import com.ifriend.chat.presentation.ui.AppActivityScreenFactoryImpl;
import com.ifriend.chat.presentation.ui.AppActivityScreenFactoryImpl_Factory;
import com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatScreenFactoryImpl;
import com.ifriend.common_utils.Logger;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.local.impl.datasource.AuthLocalDataSourceImpl;
import com.ifriend.core.local.impl.datasource.AuthLocalDataSourceImpl_Factory;
import com.ifriend.core.remote.datasources.billing.BillingRemoteDataSource;
import com.ifriend.core.remote.datasources.billing.BillingRemoteDataSource_Factory;
import com.ifriend.core.remote.interceptors.AuthorizationInterceptor;
import com.ifriend.core.remote.interceptors.DataDogAuthInterceptor_Factory;
import com.ifriend.core.remote.interceptors.TimeoutInterceptor_Factory;
import com.ifriend.core.remote.services.AnnalsApiService;
import com.ifriend.core.remote.services.AppBillingApiService;
import com.ifriend.core.remote.services.CallsApiService;
import com.ifriend.core.remote.services.DataDogApiService;
import com.ifriend.core.remote.services.UserApiService;
import com.ifriend.core.tools.api.AppIdentityConverter;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.tools.impl.AppIdentityConverterImpl_Factory;
import com.ifriend.core.tools.impl.DispatcherProviderImpl_Factory;
import com.ifriend.data.authorization.RegistrationApiDelegate;
import com.ifriend.data.authorization.confirmEmail.ConfirmEmailApi;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.common.CoreExecuteCatchingImpl;
import com.ifriend.data.common.CoreExecuteCatchingImpl_Factory;
import com.ifriend.data.config.FirebaseConfig;
import com.ifriend.data.config.FirebaseConfig_Factory;
import com.ifriend.data.config.LocalConfigExtractor;
import com.ifriend.data.config.LocalDefaultsConfig;
import com.ifriend.data.config.LocalDefaultsConfig_Factory;
import com.ifriend.data.config.parser.ConditionsChecker;
import com.ifriend.data.config.parser.FirebaseRemoteConfigParser;
import com.ifriend.data.exception.mappers.CoreExceptionMapper_Factory;
import com.ifriend.data.initialLoaders.AppConfigLoader;
import com.ifriend.data.initialLoaders.AppConfigLoader_Factory;
import com.ifriend.data.initialLoaders.ChatConfigurationLoader;
import com.ifriend.data.initialLoaders.ChatGiftsLoader;
import com.ifriend.data.initialLoaders.DiaryLoader;
import com.ifriend.data.initialLoaders.InitialAvatarLoader;
import com.ifriend.data.initialLoaders.InitialBotLoader;
import com.ifriend.data.initialLoaders.InitialConfigurationBotsAvatarLoader;
import com.ifriend.data.initialLoaders.InitialLevelInfoLoader;
import com.ifriend.data.initialLoaders.InitialTagsLoader;
import com.ifriend.data.initialLoaders.InitialUserConfigLoader;
import com.ifriend.data.initialLoaders.InitialUserLoader;
import com.ifriend.data.mappers.BotFromResponseMapper;
import com.ifriend.data.mappers.BotFromResponseMapper_Factory;
import com.ifriend.data.mappers.ChatNotificationsMapper_Factory;
import com.ifriend.data.mappers.EthnicityFromBackendValueMapper_Factory;
import com.ifriend.data.mappers.EthnicityToBackendValueMapper_Factory;
import com.ifriend.data.mappers.GenderFromBackendString_Factory;
import com.ifriend.data.mappers.GenderToBackendString_Factory;
import com.ifriend.data.mappers.PersonalityFromBackendValueMapper_Factory;
import com.ifriend.data.mappers.PersonalityToBackendValueMapper_Factory;
import com.ifriend.data.mappers.ToUserMapper;
import com.ifriend.data.mappers.ToUserMapper_Factory;
import com.ifriend.data.mappers.featuretoggles.FeatureToggleBotIdsMapper_Factory;
import com.ifriend.data.mappers.subscription.ChatSubscriptionBenefitsMapper_Factory;
import com.ifriend.data.memorycached.chats.ChatConfigsMemoryCachedSourceImpl;
import com.ifriend.data.memorycached.chats.ChatConfigsMemoryCachedSourceImpl_Factory;
import com.ifriend.data.memorycached.chats.mappers.ChatConfigMapper;
import com.ifriend.data.memorycached.chats.mappers.ChatConfigMapper_Factory;
import com.ifriend.data.memorycached.onboarding.OnboardingChatConfigsMemoryCachedSourceImpl;
import com.ifriend.data.memorycached.onboarding.OnboardingChatConfigsMemoryCachedSourceImpl_Factory;
import com.ifriend.data.networking.api.BotApi;
import com.ifriend.data.networking.api.FirebaseApi;
import com.ifriend.data.networking.api.GenerateBotAvatarApi;
import com.ifriend.data.networking.api.NeuronsApi;
import com.ifriend.data.networking.api.RateUsApi;
import com.ifriend.data.networking.api.RegistrationApi;
import com.ifriend.data.networking.api.ResetPasswordApi;
import com.ifriend.data.networking.api.SocketShardsApi;
import com.ifriend.data.networking.api.TagsApi;
import com.ifriend.data.networking.api.UserApi;
import com.ifriend.data.networking.api.ValidationApi;
import com.ifriend.data.networking.api.chat.ChatMessagesApi;
import com.ifriend.data.networking.api.chat.ChatsApi;
import com.ifriend.data.networking.api.chat.ChatsInfoApi;
import com.ifriend.data.networking.api.chatgifts.ChatGiftsApi;
import com.ifriend.data.networking.api.configuration.ChatConfigurationsApi;
import com.ifriend.data.networking.api.diary.DiaryApi;
import com.ifriend.data.networking.api.diary.DiaryApiDelegate;
import com.ifriend.data.networking.api.diary.DiaryApiDelegate_Factory;
import com.ifriend.data.networking.api.levels.LevelsApi;
import com.ifriend.data.networking.api.levels.LevelsApiDelegate;
import com.ifriend.data.networking.api.levels.LevelsApiDelegate_Factory;
import com.ifriend.data.networking.api.onboarding.OnboardingApi;
import com.ifriend.data.networking.api.onboarding.OnboardingApiDelegate;
import com.ifriend.data.networking.api.onboarding.OnboardingApiDelegate_Factory;
import com.ifriend.data.networking.api.topics.TopicsApi;
import com.ifriend.data.networking.datasources.chat.ChatConfigurationsRemoteDataSource;
import com.ifriend.data.networking.datasources.chat.ChatConfigurationsRemoteDataSource_Factory;
import com.ifriend.data.networking.datasources.chat.ChatMessagesRemoteDataSource;
import com.ifriend.data.networking.datasources.chat.ChatMessagesRemoteDataSource_Factory;
import com.ifriend.data.networking.datasources.chat.ChatsRemoteDataSource;
import com.ifriend.data.networking.datasources.chat.ChatsRemoteDataSource_Factory;
import com.ifriend.data.networking.datasources.gifts.ChatGiftsRemoteDataSource;
import com.ifriend.data.networking.datasources.gifts.ChatGiftsRemoteDataSource_Factory;
import com.ifriend.data.repository.chat.ChatsRepositoryImpl;
import com.ifriend.data.repository.chat.ChatsRepositoryImpl_Factory;
import com.ifriend.data.repository.chat.buy.BuyChatMessagesRepositoryImpl;
import com.ifriend.data.repository.chat.buy.BuyChatMessagesRepositoryImpl_Factory;
import com.ifriend.data.repository.chat.info.ChatBackgroundRepositoryImpl;
import com.ifriend.data.repository.chat.info.ChatBackgroundRepositoryImpl_Factory;
import com.ifriend.data.repository.chat.info.ChatNotificationsRepositoryImpl;
import com.ifriend.data.repository.chat.info.ChatNotificationsRepositoryImpl_Factory;
import com.ifriend.data.repository.chat.info.ChatsInfoConfigurationRepositoryImpl;
import com.ifriend.data.repository.chat.info.ChatsInfoConfigurationRepositoryImpl_Factory;
import com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl;
import com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl_Factory;
import com.ifriend.data.repository.chat.info.mapper.ChatInfoMapper_Factory;
import com.ifriend.data.repository.chat.intro.ChatIntroRepositoryImpl;
import com.ifriend.data.repository.chat.intro.ChatIntroRepositoryImpl_Factory;
import com.ifriend.data.repository.chat.messages.mappers.ChatAudioContentMessageMapper;
import com.ifriend.data.repository.chat.messages.mappers.ChatAudioContentMessageMapper_Factory;
import com.ifriend.data.repository.chat.messages.mappers.ChatGiftContentMessageMapper;
import com.ifriend.data.repository.chat.messages.mappers.ChatGiftContentMessageMapper_Factory;
import com.ifriend.data.repository.chat.messages.mappers.ChatImageContentMessageMapper;
import com.ifriend.data.repository.chat.messages.mappers.ChatImageContentMessageMapper_Factory;
import com.ifriend.data.repository.chat.messages.mappers.ChatMessageContentMapper;
import com.ifriend.data.repository.chat.messages.mappers.ChatMessageContentMapper_Factory;
import com.ifriend.data.repository.chat.messages.mappers.ChatMessageInfoMapper;
import com.ifriend.data.repository.chat.messages.mappers.ChatMessageInfoMapper_Factory;
import com.ifriend.data.repository.chat.messages.mappers.ChatMessageMapper;
import com.ifriend.data.repository.chat.messages.mappers.ChatMessageMapper_Factory;
import com.ifriend.data.repository.chat.messages.mappers.ChatTextContentMessageMapper_Factory;
import com.ifriend.data.repository.chat.messages.mappers.ChatUserImageContentMessageMapper;
import com.ifriend.data.repository.chat.messages.mappers.ChatUserImageContentMessageMapper_Factory;
import com.ifriend.data.repository.chat.messages.mappers.images.ChatImageUrlMapper;
import com.ifriend.data.repository.chat.messages.mappers.images.ChatImageUrlMapper_Factory;
import com.ifriend.data.repository.chat.subscription.ChatSubscriptionRepositoryImpl;
import com.ifriend.data.repository.chat.subscription.ChatSubscriptionRepositoryImpl_Factory;
import com.ifriend.data.repository.config.AppConfigRepositoryImpl;
import com.ifriend.data.repository.config.AppConfigRepositoryImpl_Factory;
import com.ifriend.data.repository.deeplinks.DeepLinksParser_Factory;
import com.ifriend.data.repository.deeplinks.DeepLinksRepositoryImpl;
import com.ifriend.data.repository.deeplinks.DeepLinksRepositoryImpl_Factory;
import com.ifriend.data.repository.experiments.FeatureTogglePayloadsRepositoryImpl;
import com.ifriend.data.repository.experiments.FeatureTogglePayloadsRepositoryImpl_Factory;
import com.ifriend.data.repository.experiments.FeatureToggleRepositoryImpl;
import com.ifriend.data.repository.experiments.FeatureToggleRepositoryImpl_Factory;
import com.ifriend.data.repository.guide.UserGuideRepositoryImpl;
import com.ifriend.data.repository.guide.UserGuideRepositoryImpl_Factory;
import com.ifriend.data.repository.offer.UserOffersRepositoryImpl;
import com.ifriend.data.repository.offer.UserOffersRepositoryImpl_Factory;
import com.ifriend.data.repository.update.InAppUpdateRepositoryImpl;
import com.ifriend.data.repository.update.InAppUpdateRepositoryImpl_Factory;
import com.ifriend.data.socket.LiveChatMessagesFlowImpl;
import com.ifriend.data.socket.LiveChatMessagesFlowImpl_Factory;
import com.ifriend.data.socket.SocketUrlProvider;
import com.ifriend.data.socket.generator.BotAudioMessageUrlGenerator;
import com.ifriend.data.socket.generator.MediaPlayerPlaybackControllerGenerator;
import com.ifriend.data.socket.generator.UserAudioMessageUrlGenerator;
import com.ifriend.data.socket.mapper.ChatMessageMapHelper;
import com.ifriend.data.socket.mapper.ChatMessageMapHelperImpl;
import com.ifriend.data.socket.mapper.ChatMessageMapHelperImpl_Factory;
import com.ifriend.data.socket.mapper.ChatRegenerateMessageFailedMapper;
import com.ifriend.data.socket.mapper.ChatRegenerateMessageFailedMapper_Factory;
import com.ifriend.data.socket.mapper.ChatRemovedMessageMapper_Factory;
import com.ifriend.data.socket.mapper.ChatSubscriptionMapper;
import com.ifriend.data.socket.mapper.ChatSubscriptionMapper_Factory;
import com.ifriend.data.socket.mapper.JsonToChatMessageMapper;
import com.ifriend.data.socket.mapper.JsonToChatMessageMapper_Factory;
import com.ifriend.data.socket.mapper.SocketMessageToMessagesSourceMessageMapper;
import com.ifriend.data.socket.mapper.chat.JsonToChatCallMessageMapper_Factory;
import com.ifriend.data.storages.auth.AuthDataStorageImpl;
import com.ifriend.data.storages.bots.MainBotLocalDataSource;
import com.ifriend.data.storages.bots.MainBotLocalDataSourceImpl_Factory;
import com.ifriend.data.storages.chat.intro.ChatIntroLocalDataSource;
import com.ifriend.data.storages.chat.intro.ChatIntroLocalDataSource_Factory;
import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.data.storages.config.AppConfigLocalDataSourceImpl_Factory;
import com.ifriend.data.storages.config.AppConfigStorage;
import com.ifriend.data.storages.diary.DiaryDao;
import com.ifriend.data.storages.diary.ShownDiaryNotesDao;
import com.ifriend.data.storages.levels.LevelsDao;
import com.ifriend.data.storages.sharedPreferences.SecurePreferencesService;
import com.ifriend.data.storages.tags.TagsLocalDataSource;
import com.ifriend.data.storages.tags.TagsLocalDataSourceImpl_Factory;
import com.ifriend.data.storages.token.KeychainUserTokenStorage;
import com.ifriend.data.toggle.AnimatedAvatarFeatureToggle;
import com.ifriend.data.toggle.AnimatedAvatarOnChatToggle;
import com.ifriend.data.toggle.AnimatedBackgroundFeatureToggle;
import com.ifriend.data.toggle.AvatarGenerationFreeToggle;
import com.ifriend.data.toggle.AvatarInPushToggle;
import com.ifriend.data.toggle.AvatarInRetentionPushToggle;
import com.ifriend.data.toggle.ChatGiftsStoreToggle;
import com.ifriend.data.toggle.ChatGiftsStoreToggle_Factory;
import com.ifriend.data.toggle.ChatVideoBackgroundFeatureToggleImpl;
import com.ifriend.data.toggle.ChatVideoBackgroundFeatureToggleImpl_Factory;
import com.ifriend.data.toggle.ConfirmEmailFeatureToggle;
import com.ifriend.data.toggle.DiaryFeatureToggle;
import com.ifriend.data.toggle.DiaryFeatureToggle_Factory;
import com.ifriend.data.toggle.RateAndReviewUsToggle;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.authorization.Authorizer;
import com.ifriend.domain.authorization.SignInWithTokenUseCase;
import com.ifriend.domain.data.AppImageLoaderRepository;
import com.ifriend.domain.data.AudioMessageRepository;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.AuthDataStorage;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.DecodedAudioMessagesRepository;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.data.RateUsRepository;
import com.ifriend.domain.data.ResetPasswordRepository;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.data.TagsStorage;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.UserSubscriptionsBroadcast;
import com.ifriend.domain.data.authorization.confirmEmail.ConfirmEmailRepository;
import com.ifriend.domain.data.authorization.confirmEmail.SendConfirmationEmailUseCase;
import com.ifriend.domain.data.chat.BuyChatMessagesRepository;
import com.ifriend.domain.data.chat.ChatBackgroundRepository;
import com.ifriend.domain.data.chat.ChatIntroRepository;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.chat.ChatsRepository;
import com.ifriend.domain.data.chat.subscription.ChatSubscriptionRepository;
import com.ifriend.domain.data.chatgifts.ChatGiftsRepository;
import com.ifriend.domain.data.config.AppConfigRepository;
import com.ifriend.domain.data.deeplinks.DeepLinksRepository;
import com.ifriend.domain.data.diary.DiaryRepository;
import com.ifriend.domain.data.experiments.FeatureTogglePayloadsRepository;
import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.data.files.FileProvider;
import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatusStorage;
import com.ifriend.domain.data.generateAvatar.AvatarInfoStorage;
import com.ifriend.domain.data.generateAvatar.AvatarsStorage;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.data.guide.UserGuideRepository;
import com.ifriend.domain.data.install.AppInstallStorage;
import com.ifriend.domain.data.levels.LevelsRepository;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.data.memorycached.OnboardingChatConfigsMemoryCachedSource;
import com.ifriend.domain.data.networking.FirebaseApiRepository;
import com.ifriend.domain.data.notifications.ChatNotificationsRepository;
import com.ifriend.domain.data.offers.UserOffersRepository;
import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import com.ifriend.domain.data.purchases.BillingPurchasesHistory;
import com.ifriend.domain.data.update.InAppUpdateRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.domain.featuretoggles.ChatVideoBackgroundFeatureToggle;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.domain.infrastucture.InternetConnectionDialogsManager;
import com.ifriend.domain.logic.onboarding.UpdateOnboardingUseCase;
import com.ifriend.domain.logic.onboarding.UpdateOnboardingUseCase_Factory;
import com.ifriend.domain.models.TagOfUser;
import com.ifriend.domain.models.avatar.GeneratedAvatars;
import com.ifriend.domain.newChat.chat.IsChatImageAllowedBroadcast;
import com.ifriend.domain.newChat.chat.systems.messages.live.LiveChatMessagesFlow;
import com.ifriend.domain.notifications.LongTermNotificationByPushCreator;
import com.ifriend.domain.notifications.LongTermNotificationByTypeOfPushHandler;
import com.ifriend.domain.notifications.LongTermNotificationManager;
import com.ifriend.domain.onboarding.interactor.OnboardingInteractor;
import com.ifriend.domain.onboarding.interactor.OnboardingInteractor_Factory;
import com.ifriend.domain.rateUs.OnUserRatedAppUseCase;
import com.ifriend.domain.rateUs.RateAppShowingPlanner;
import com.ifriend.domain.rateUs.RateUsStateStorage;
import com.ifriend.domain.rateUs.ShowRateUsUseCase;
import com.ifriend.domain.services.audio.recording.AudioRecorder;
import com.ifriend.domain.services.audio.recording.AudioRecorderController;
import com.ifriend.domain.services.audio.recording.AudioRecordingFileStorage;
import com.ifriend.domain.services.audio.recording.AudioRecordingStateProvider;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.socket.MessagesSourceMessage;
import com.ifriend.domain.socket.notifications.AppNotifier;
import com.ifriend.domain.storage.AvatarAnimationEnabledStorage;
import com.ifriend.domain.storage.EventDelayStorage;
import com.ifriend.domain.storage.NeuronsCostsStorage;
import com.ifriend.domain.storage.token.UserTokenProvider;
import com.ifriend.domain.storage.token.UserTokenStorage;
import com.ifriend.domain.toggle.FeatureToggle;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.domain.useCases.AppConfigUseCase_Factory;
import com.ifriend.domain.useCases.bot.ChangeBotAgeUseCase;
import com.ifriend.domain.useCases.bot.ChangeBotEthnicityUseCase;
import com.ifriend.domain.useCases.bot.ChangeBotGenderUseCase;
import com.ifriend.domain.useCases.bot.ChangeBotNameUseCase;
import com.ifriend.domain.useCases.bot.ChangeBotPersonalityUseCase;
import com.ifriend.domain.useCases.bot.ChangeBotVoiceUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.domain.useCases.diary.DiaryNoteReplier;
import com.ifriend.domain.useCases.diary.DiaryNotesService;
import com.ifriend.domain.useCases.diary.GetDiaryNotesListUseCase;
import com.ifriend.domain.useCases.diary.OnDiaryShownUseCase;
import com.ifriend.domain.useCases.diary.RefreshDiaryUseCase;
import com.ifriend.domain.useCases.diary.ReplyDiaryNoteUseCase;
import com.ifriend.domain.useCases.levels.GetLevelInfoUseCase;
import com.ifriend.domain.useCases.socket.ListenTagsUseCase;
import com.ifriend.domain.useCases.user.change.ChangeUserAgeUseCase;
import com.ifriend.domain.useCases.user.change.ChangeUserGenderUseCase;
import com.ifriend.domain.useCases.user.change.ChangeUserNameUseCase;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.domain.validation.EmailValidator;
import com.ifriend.domain.validation.ValidateAgeUseCase;
import com.ifriend.domain.validation.ValidateCredentialsUseCase;
import com.ifriend.domain.validation.ValidateNameUseCase;
import com.ifriend.icon_switcher.PremiumAppIconManager;
import com.ifriend.icon_switcher.di.PremiumIconManagerModule;
import com.ifriend.icon_switcher.di.PremiumIconManagerModule_ProvidePremiumAppIconManagerFactory;
import com.ifriend.internal_notifications.handler.ComposedInternalNotificationHandler;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.internal_notifications.handler.InternalNotificationsQueue;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.keychain.KeychainAdapter;
import com.ifriend.logger.api.logic.AppLoggerInteractor;
import com.ifriend.logger.impl.core.datadog.DataDogRepository;
import com.ifriend.logger.impl.core.datadog.DataDogRepository_Factory;
import com.ifriend.logger.impl.core.timber.TimberLoggerRepository;
import com.ifriend.logger.impl.core.timber.TimberLoggerRepository_Factory;
import com.ifriend.logger.impl.logic.AppLoggerInteractorImpl;
import com.ifriend.logger.impl.logic.AppLoggerInteractorImpl_Factory;
import com.ifriend.long_term_notifications.impl.AvatarGeneratedLongTermCreator;
import com.ifriend.long_term_notifications.impl.LongTermNotificationByTypeOfPushHandlerImpl;
import com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl;
import com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl_Factory;
import com.ifriend.platform.tools.api.AppInfoProvider;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.platform.tools.api.permissions.PermissionProvider;
import com.ifriend.platform.tools.api.speech.TextToSpeechStream;
import com.ifriend.platform.tools.api.speech.voice.VoiceRecognitionStreaming;
import com.ifriend.platform.tools.impl.AppInfoProviderImpl;
import com.ifriend.platform.tools.impl.AppInfoProviderImpl_Factory;
import com.ifriend.platform.tools.impl.ResourceProviderImpl;
import com.ifriend.platform.tools.impl.ResourceProviderImpl_Factory;
import com.ifriend.platform.tools.impl.permissions.PermissionProviderImpl;
import com.ifriend.platform.tools.impl.permissions.PermissionProviderImpl_Factory;
import com.ifriend.platform.tools.impl.speech.TextToSpeechStreamImpl;
import com.ifriend.platform.tools.impl.speech.VoiceRecognitionStreamingImpl;
import com.ifriend.popup.api.PopupFragmentFactory;
import com.ifriend.popup.api.PopupModelFactory;
import com.ifriend.popup.impl.PopupFragmentFactoryImpl;
import com.ifriend.popup.impl.PopupModelFactoryImpl;
import com.ifriend.registration.StartRegistrationUseCase;
import com.ifriend.ui.base.BaseActivity_MembersInjector;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.modalMessage.NoInternetPopupDelegate;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.SetFactory;
import dagger.internal.SingleCheck;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.json.JSONObject;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class DaggerAppComponent {
    private DaggerAppComponent() {
    }

    public static AppComponent.Builder builder() {
        return new Builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class Builder implements AppComponent.Builder {
        private Context context;

        private Builder() {
        }

        @Override // com.ifriend.app.di.AppComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.ifriend.app.di.AppComponent.Builder
        public AppComponent build() {
            Preconditions.checkBuilderRequirement(this.context, Context.class);
            return new AppComponentImpl(new AppModule(), new PremiumIconManagerModule(), new AnalyticUseCasesModule(), new BaseAppModule(), new ChangeUserModule(), new ChangeBotModule(), new CoreAuthModule(), new LogsModule(), new PreferencesModule(), new RateUsModule(), new ConnectivityModule(), new ValidationModule(), new NavigationModule(), new AnalyticsModule(), new DiaryModule(), new LevelsModule(), new ApiModule(), new InterceptorsModule(), new DataDogModule(), new SharedTogglesModule(), new InitialDataLoadersModule(), new GoogleServicesModule(), this.context);
        }
    }

    /* loaded from: classes6.dex */
    private static final class AppComponentImpl implements AppComponent {
        private final AnalyticUseCasesModule analyticUseCasesModule;
        private Provider<AnalyticsEngine> analyticsEngineProvider;
        private Provider<AnalyticsInteractorImpl> analyticsInteractorImplProvider;
        private Provider<String> apiUrlProvider;
        private final AppComponentImpl appComponentImpl;
        private Provider<AppConfigLoader> appConfigLoaderProvider;
        private Provider<AppConfigRepositoryImpl> appConfigRepositoryImplProvider;
        private Provider<AppConfigUseCase> appConfigUseCaseProvider;
        private Provider<AppInfoProviderImpl> appInfoProviderImplProvider;
        private Provider<AppInstallStorage> appInstallStorageProvider;
        private Provider<AppLaunchBillingFlowImpl> appLaunchBillingFlowImplProvider;
        private Provider<AppLoggerInteractorImpl> appLoggerInteractorImplProvider;
        private final AppModule appModule;
        private Provider<AuthLocalDataSourceImpl> authLocalDataSourceImplProvider;
        private final BaseAppModule baseAppModule;
        private Provider<BillingInteractorImpl> billingInteractorImplProvider;
        private Provider<BillingManagerImpl> billingManagerImplProvider;
        private Provider<BillingRemoteDataSource> billingRemoteDataSourceProvider;
        private Provider<BillingRepositoryImpl> billingRepositoryImplProvider;
        private Provider<ChatIntroRepository> bindChatIntroRepositoryProvider;
        private Provider<UserGuideRepository> bindExplanationRepositoryProvider;
        private Provider<InAppUpdateRepository> bindInAppUpdateRepositoryProvider;
        private Provider<LongTermNotificationManager> bindLongTermNotificationManagerProvider;
        private Provider<UserOffersRepository> bindUserOffersRepositoryProvider;
        private Provider<AppConfigLocalDataSource> bindsAppConfigLocalDataSourceProvider;
        private Provider<AppConfigRepository> bindsAppConfigRepositoryProvider;
        private Provider<AppIdentityConverter> bindsAppIdentityConverterProvider;
        private Provider<AppInfoProvider> bindsAppInfoProvider;
        private Provider<AppLoggerInteractor> bindsAppLoggerInteractorProvider;
        private Provider<AuthLocalDataSource> bindsAuthLocalDataSourceProvider;
        private Provider<BillingInteractor> bindsBillingInteractorProvider;
        private Provider<BillingManager> bindsBillingManagerProvider;
        private Provider<BillingRepository> bindsBillingRepositoryProvider;
        private Provider<BuyChatMessagesRepository> bindsBuyChatMessagesRepositoryProvider;
        private Provider<ChatBackgroundRepository> bindsChatBackgroundRepositoryProvider;
        private Provider<ChatMessageMapHelper> bindsChatMessageMapHelperProvider;
        private Provider<LiveChatMessagesFlow> bindsChatMessagesFlowProvider;
        private Provider<ChatNotificationsRepository> bindsChatNotificationRepositoryProvider;
        private Provider<ChatSubscriptionRepository> bindsChatSubscriptionRepositoryProvider;
        private Provider<ChatVideoBackgroundFeatureToggle> bindsChatVideoBackgroundFeatureToggleProvider;
        private Provider<ChatsInfoConfigurationRepository> bindsChatsInfoConfigurationRepositoryProvider;
        private Provider<ChatsInfoRepository> bindsChatsInfoRepositoryProvider;
        private Provider<ChatsRepository> bindsChatsRepositoryProvider;
        private Provider<ChatConfigsMemoryCachedSource> bindsConfigurationBotsMemoryCachedSourceProvider;
        private Provider<CoreExecuteCatching> bindsCoreExecuteCatchingProvider;
        private Provider<DecodedAudioMessagesRepository> bindsDecodedAudioMessagesRepositoryProvider;
        private Provider<DeepLinksRepository> bindsDeepLinksRepositoryProvider;
        private Provider<DispatcherProvider> bindsDispatcherProvider;
        private Provider<FeatureTogglePayloadsRepository> bindsFeatureTogglePayloadsRepositoryProvider;
        private Provider<FeatureToggleRepository> bindsFeatureToggleRepositoryProvider;
        private Provider<AppLaunchBillingFlow> bindsLaunchBillingFlowProvider;
        private Provider<MainBotLocalDataSource> bindsMainBotLocalDataSourceProvider;
        private Provider<OnboardingChatConfigsMemoryCachedSource> bindsOnboardingChatConfigsMemoryCachedSourceProvider;
        private Provider<PermissionProvider> bindsPermissionProvider;
        private Provider<ResourceProvider> bindsResourceProvider;
        private Provider<TagsLocalDataSource> bindsTagsLocalDataSourceProvider;
        private Provider<BotFromResponseMapper> botFromResponseMapperProvider;
        private Provider<BuyChatMessagesRepositoryImpl> buyChatMessagesRepositoryImplProvider;
        private Provider<ChatAudioContentMessageMapper> chatAudioContentMessageMapperProvider;
        private Provider<ChatBackgroundRepositoryImpl> chatBackgroundRepositoryImplProvider;
        private Provider<ChatConfigMapper> chatConfigMapperProvider;
        private Provider<ChatConfigsMemoryCachedSourceImpl> chatConfigsMemoryCachedSourceImplProvider;
        private Provider<ChatConfigurationsRemoteDataSource> chatConfigurationsRemoteDataSourceProvider;
        private Provider<ChatGiftContentMessageMapper> chatGiftContentMessageMapperProvider;
        private Provider<ChatGiftsRemoteDataSource> chatGiftsRemoteDataSourceProvider;
        private Provider<ChatGiftsStoreToggle> chatGiftsStoreToggleProvider;
        private Provider<ChatImageContentMessageMapper> chatImageContentMessageMapperProvider;
        private Provider<ChatImageUrlMapper> chatImageUrlMapperProvider;
        private Provider<ChatIntroLocalDataSource> chatIntroLocalDataSourceProvider;
        private Provider<ChatIntroRepositoryImpl> chatIntroRepositoryImplProvider;
        private Provider<ChatMessageContentMapper> chatMessageContentMapperProvider;
        private Provider<ChatMessageInfoMapper> chatMessageInfoMapperProvider;
        private Provider<ChatMessageMapHelperImpl> chatMessageMapHelperImplProvider;
        private Provider<ChatMessageMapper> chatMessageMapperProvider;
        private Provider<ChatMessagesRemoteDataSource> chatMessagesRemoteDataSourceProvider;
        private Provider<ChatNotificationsRepositoryImpl> chatNotificationsRepositoryImplProvider;
        private Provider<ChatRegenerateMessageFailedMapper> chatRegenerateMessageFailedMapperProvider;
        private Provider<ChatSubscriptionMapper> chatSubscriptionMapperProvider;
        private Provider<ChatSubscriptionRepositoryImpl> chatSubscriptionRepositoryImplProvider;
        private Provider<ChatUserImageContentMessageMapper> chatUserImageContentMessageMapperProvider;
        private Provider<ChatVideoBackgroundFeatureToggleImpl> chatVideoBackgroundFeatureToggleImplProvider;
        private Provider<ChatsInfoConfigurationRepositoryImpl> chatsInfoConfigurationRepositoryImplProvider;
        private Provider<ChatsInfoRepositoryImpl> chatsInfoRepositoryImplProvider;
        private Provider<ChatsRemoteDataSource> chatsRemoteDataSourceProvider;
        private Provider<ChatsRepositoryImpl> chatsRepositoryImplProvider;
        private final Context context;
        private Provider<Context> contextProvider;
        private Provider<CoreExecuteCatchingImpl> coreExecuteCatchingImplProvider;
        private Provider<DataDogRepository> dataDogRepositoryProvider;
        private Provider<DeepLinksRepositoryImpl> deepLinksRepositoryImplProvider;
        private Provider<DiaryApiDelegate> diaryApiDelegateProvider;
        private Provider<DiaryFeatureToggle> diaryFeatureToggleProvider;
        private Provider<FeatureTogglePayloadsRepositoryImpl> featureTogglePayloadsRepositoryImplProvider;
        private Provider<FeatureToggleRepositoryImpl> featureToggleRepositoryImplProvider;
        private Provider<FirebaseConfig> firebaseConfigProvider;
        private Provider<InAppUpdateRepositoryImpl> inAppUpdateRepositoryImplProvider;
        private Provider<JsonToChatMessageMapper> jsonToChatMessageMapperProvider;
        private Provider<LevelsApiDelegate> levelsApiDelegateProvider;
        private Provider<LiveChatMessagesFlowImpl> liveChatMessagesFlowImplProvider;
        private Provider<LocalDefaultsConfig> localDefaultsConfigProvider;
        private Provider<LongTermNotificationManagerImpl> longTermNotificationManagerImplProvider;
        private Provider<OnboardingApiDelegate> onboardingApiDelegateProvider;
        private Provider<OnboardingChatConfigsMemoryCachedSourceImpl> onboardingChatConfigsMemoryCachedSourceImplProvider;
        private Provider<OnboardingInteractor> onboardingInteractorProvider;
        private Provider<PermissionProviderImpl> permissionProviderImplProvider;
        private final PremiumIconManagerModule premiumIconManagerModule;
        private Provider<AudioMessageRepository> provicedsAudioMessageRepositoryProvider;
        private Provider<AnalyticsAppOpenUseCase> provideAnalyticsAppOpenUpUseCaseProvider;
        private Provider<AnalyticsFirstAppOpenUseCase> provideAnalyticsFirstAppOpenUpUseCaseProvider;
        private Provider<AnalyticsInteractor> provideAnalyticsInteractorProvider;
        private Provider<AnalyticsNotificationAppOpenedUseCase> provideAnalyticsNotificationAppOpenedUseCaseProvider;
        private Provider<AnalyticsSetUserIdUseCase> provideAnalyticsSetUserIdUseCaseProvider;
        private Provider<AnimatedAvatarFeatureToggle> provideAnimatedAvatarFeatureToggleProvider;
        private Provider<AnimatedAvatarOnChatToggle> provideAnimatedAvatarOnChatToggleProvider;
        private Provider<AnimatedBackgroundFeatureToggle> provideAnimatedBackgroundFeatureToggleProvider;
        private Provider<AnalyticsRepository> provideAnnalsAnalyticsRepositoryProvider;
        private Provider<AnnalsApiService> provideAnnalsApiServiceProvider;
        private Provider<AnalyticsSender> provideAnnalsTrackerAnalyticsSenderProvider;
        private Provider<AnnalsTrackerApi> provideAnnalsTrackerApiProvider;
        private Provider<AppBillingApiService> provideAppBillingApiServiceProvider;
        private Provider<Cicerone<AppRouter>> provideAppCiceroneProvider;
        private Provider<AppConfigStorage> provideAppConfigStorageProvider;
        private Provider<CoroutineScope> provideAppCoroutineScopeProvider;
        private Provider<OkHttpClient> provideAppHttpClientProvider;
        private Provider<ImageLoader> provideAppImageLoaderProvider;
        private Provider<AppImageLoaderRepository> provideAppImageLoaderRepositoryProvider;
        private Provider<ComposedInternalNotificationHandler> provideAppInternalNotificationHandlerProvider;
        private Provider<AppNotifier> provideAppNotifierProvider;
        private Provider<Retrofit> provideAppRetrofitProvider;
        private Provider<AppUpdateManager> provideAppUpdateManagerProvider;
        private Provider<AnalyticsRepository> provideAppsFlyerAnalyticsRepositoryProvider;
        private Provider<AnalyticsSender> provideAppsFlyerAnalyticsSenderProvider;
        private Provider<AudioRecorder> provideAudioRecorderProvider;
        private Provider<AuthDataStorageImpl> provideAuthDataStorageProvider;
        private Provider<Authorizer> provideAuthorizerProvider;
        private Provider<AvatarAnimationEnabledStorage> provideAvatarAnimationEnabledStorageProvider;
        private Provider<AvatarGenerationFreeToggle> provideAvatarGenerationFreeToggleProvider;
        private Provider<AvatarGenerationStatusStorage> provideAvatarGenerationStatusStorageProvider;
        private Provider<AvatarInPushToggle> provideAvatarInPushToggleProvider;
        private Provider<AvatarInRetentionPushToggle> provideAvatarInRetentionPushToggleProvider;
        private Provider<AvatarInfoStorage> provideAvatarInfoStorageProvider;
        private Provider<AvatarsStorage> provideAvatarsStorageProvider;
        private Provider<BotApi> provideBotApiProvider;
        private Provider<BotAudioMessageUrlGenerator> provideBotAudioMessageUrlGeneratorProvider;
        private Provider<BotRepository> provideBotRepositoryProvider;
        private Provider<CallsApiService> provideCallApiServiceProvider;
        private Provider<ChangeBotAgeUseCase> provideChangeBotAgeUseCaseProvider;
        private Provider<ChangeBotEthnicityUseCase> provideChangeBotEthnicityUseCaseProvider;
        private Provider<ChangeBotGenderUseCase> provideChangeBotGenderUseCaseProvider;
        private Provider<ChangeBotPersonalityUseCase> provideChangeBotPersonalityUseCaseProvider;
        private Provider<ChangeBotVoiceUseCase> provideChangeBotVoiceUseCaseProvider;
        private Provider<ChatMessagesApi> provideChatApiProvider;
        private Provider<ChatConfigurationsApi> provideChatConfigurationApiProvider;
        private Provider<ChatGiftsApi> provideChatGiftsApiProvider;
        private Provider<ChatGiftsLoader> provideChatGiftsLoaderProvider;
        private Provider<ChatGiftsRepository> provideChatGiftsRepositoryProvider;
        private Provider<ChatsApi> provideChatsApiProvider;
        private Provider<ChatsInfoApi> provideChatsInfoApiProvider;
        private Provider<CiceroneHolder> provideCiceroneHolderProvider;
        private Provider<ConditionsChecker> provideConditionsCheckerProvider;
        private Provider<ChatConfigurationLoader> provideConfigurationBotsLoaderProvider;
        private Provider<ConfirmEmailApi> provideConfirmEmailApiProvider;
        private Provider<ConfirmEmailFeatureToggle> provideConfirmEmailFeatureToggleProvider;
        private Provider<ConfirmEmailRepository> provideConfirmEmailRepositoryProvider;
        private Provider<MessagesSource> provideControllableMessagesSourceProvider;
        private Provider<CoroutineDispatchers> provideCoroutineDispatchersProvider;
        private Provider<DataDogApiService> provideDataDogApiServiceProvider;
        private Provider<OkHttpClient> provideDataDogHttpClientProvider;
        private Provider<Retrofit> provideDataDogRetrofitProvider;
        private Provider<DataStore<Preferences>> provideDataStoreProvider;
        private Provider<com.ifriend.domain.data.Preferences> provideDeviceByUserSharedPreferencesProvider;
        private Provider<com.ifriend.domain.data.Preferences> provideDeviceSharedPreferencesProvider;
        private Provider<DiaryApi> provideDiaryApiProvider;
        private Provider<DiaryDao> provideDiaryDaoProvider;
        private Provider<DiaryLoader> provideDiaryLoaderProvider;
        private Provider<DiaryNoteReplier> provideDiaryNoteReplierProvider;
        private Provider<DiaryRepository> provideDiaryRepositoryProvider;
        private Provider<EmailValidator> provideEmailValidatorProvider;
        private Provider<EventDelayStorage> provideEventDelayStorageProvider;
        private Provider<FileProvider> provideFileProvider;
        private Provider<AnalyticsRepository> provideFirebaseAnalyticsRepositoryProvider;
        private Provider<AnalyticsSender> provideFirebaseAnalyticsSenderProvider;
        private Provider<FirebaseApi> provideFirebaseApiProvider;
        private Provider<FirebaseApiRepository> provideFirebaseProcessProvider;
        private Provider<FirebaseRemoteConfigParser> provideFirebaseRemoteConfigParserProvider;
        private Provider<GenerateBotAvatarApi> provideGenerateBotAvatarApiProvider;
        private Provider<GenerateBotAvatarRepository> provideGenerateBotAvatarRepositoryProvider;
        private Provider<GetBotUseCase> provideGetBotUseCaseProvider;
        private Provider<GetDiaryNotesListUseCase> provideGetDiaryNotesListUseCaseProvider;
        private Provider<DiaryNotesService> provideGetDiaryNotesUseCaseProvider;
        private Provider<GetLevelInfoUseCase> provideGetLevelsListUseCaseProvider;
        private Provider<GetUserUseCase> provideGetUserUseCaseProvider;
        private Provider<Gson> provideGsonProvider;
        private Provider<OkHttpClient> provideHttpClientProvider;
        private Provider<HttpLoggingInterceptor> provideHttpLoggingInterceptorProvider;
        private Provider<InitialAvatarLoader> provideInitialAvatarLoaderProvider;
        private Provider<InitialBotLoader> provideInitialBotLoaderProvider;
        private Provider<InitialConfigurationBotsAvatarLoader> provideInitialConfigurationBotsAvatarLoaderProvider;
        private Provider<InitialDataLoader> provideInitialDataLoaderProvider;
        private Provider<InitialLevelInfoLoader> provideInitialLevelInfoLoaderProvider;
        private Provider<InitialTagsLoader> provideInitialTagsLoaderProvider;
        private Provider<InitialUserConfigLoader> provideInitialUserConfigLoaderProvider;
        private Provider<InitialUserLoader> provideInitialUserLoaderProvider;
        private Provider<InternetConnection> provideInternetConnectionProvider;
        private Provider<IsChatImageAllowedBroadcast> provideIsImageAllowedBroadcastProvider;
        private Provider<Json> provideJsonProvider;
        private Provider<Mapper<JSONObject, MessagesSourceMessage.AddDiaryNotes>> provideJsonToAddDiaryNotesMapperProvider;
        private Provider<Mapper<JSONObject, MessagesSourceMessage.AvatarAnimationGenerated>> provideJsonToAvatarAnimationGeneratedMapperProvider;
        private Provider<Mapper<JSONObject, MessagesSourceMessage.BotDataChanged>> provideJsonToBotChangedMapperProvider;
        private Provider<Mapper<JSONObject, MessagesSourceMessage.DailyNeuronsReceived>> provideJsonToDailyNeuronsReceivedMapperProvider;
        private Provider<Mapper<JSONObject, GeneratedAvatars>> provideJsonToGeneratedAvatarMapperProvider;
        private Provider<Mapper<JSONObject, MessagesSourceMessage.LevelInfoUpdate>> provideJsonToLevelInfoUpdateMapperProvider;
        private Provider<Mapper<JSONObject, MessagesSourceMessage.NeuronesPurchased>> provideJsonToNeuronsAddedMapperProvider;
        private Provider<Mapper<JSONObject, TagOfUser>> provideJsonToTagOfUserMapperProvider;
        private Provider<KeychainUserTokenStorage> provideKeychainUserTokenStorageProvider;
        private Provider<LevelsApi> provideLevelsApiProvider;
        private Provider<LevelsDao> provideLevelsDaoProvider;
        private Provider<LevelsRepository> provideLevelsRepositoryProvider;
        private Provider<ListenTagsUseCase> provideListenTagsUseCaseProvider;
        private Provider<LocalConfigExtractor> provideLocalConfigExtractorProvider;
        private Provider<MediaPlayerPlaybackControllerGenerator> provideMediaPlayerPlaybackControllerGeneratorProvider;
        private Provider<DefaultLifecycleObserver> provideMessagesSourceLifecycleControllerProvider;
        private Provider<NeuronsApi> provideNeuronsApiProvider;
        private Provider<NeuronsCostsStorage> provideNeuronsCostsStorageProvider;
        private Provider<FeatureToggle> provideNeuronsFeatureToggleProvider;
        private Provider<OnDiaryShownUseCase> provideOnDiaryShownUseCaseProvider;
        private Provider<OnUserRatedAppUseCase> provideOnUserRateUsUseCaseProvider;
        private Provider<OnboardingAnswersRepository> provideOnboardingAnswersRepositoryProvider;
        private Provider<OnboardingApi> provideOnboardingApiProvider;
        private Provider<Logger> provideProdLoggerProvider;
        private Provider<AnalyticsSender> providePushNotificationOpenedAnalyticsSenderProvider;
        private Provider<PushNotificationOpenedTrackerApi> providePushNotificationOpenedTrackerApiProvider;
        private Provider<RateAndReviewUsToggle> provideRateAndReviewUsToggleProvider;
        private Provider<RateAppShowingPlanner> provideRateAppShowingPlannerProvider;
        private Provider<RateUsApi> provideRateUsApiProvider;
        private Provider<RateUsRepository> provideRateUsRepositoryProvider;
        private Provider<RateUsStateStorage> provideRateUsStateStorageProvider;
        private Provider<AudioRecordingFileStorage> provideRecordedAudioFileStorageProvider;
        private Provider<RefreshDiaryUseCase> provideRefreshDiaryUseCaseProvider;
        private Provider<RegistrationApi> provideRegistrationApiProvider;
        private Provider<RegistrationApiDelegate> provideRegistrationProcessProvider;
        private Provider<ReplyDiaryNoteUseCase> provideReplyDiaryNoteUseCaseProvider;
        private Provider<ResetPasswordApi> provideResetPasswordApiProvider;
        private Provider<ResetPasswordRepository> provideResetPasswordRepositoryProvider;
        private Provider<Retrofit> provideRetrofitProvider;
        private Provider<RouterProvider> provideRouterProvider;
        private Provider<SecurePreferencesService> provideSecurePreferencesProvider;
        private Provider<ChangeUserAgeUseCase> provideSetUserAgeUseCaseProvider;
        private Provider<ChangeUserGenderUseCase> provideSetUserGenderUseCaseProvider;
        private Provider<ChangeUserNameUseCase> provideSetUserNameUseCaseProvider;
        private Provider<SocketShardsApi> provideShardsApiProvider;
        private Provider<InternetConnectionDialogsManager> provideShowInternetConnectionDialogsUseCaseProvider;
        private Provider<ShowRateUsUseCase> provideShowRateUsUseCaseProvider;
        private Provider<ShownDiaryNotesDao> provideShownDiaryNotesDaoProvider;
        private Provider<SignInWithTokenUseCase> provideSignInUseCaseProvider;
        private Provider<SocketMessageToMessagesSourceMessageMapper> provideSocketMessageToMessagesSourceMapperProvider;
        private Provider<Mapper<JSONObject, MessagesSourceMessage.NeuronesChanged>> provideSocketMessageToNeuronsChangeMapperProvider;
        private Provider<SpeechClient> provideSpeechClientProvider;
        private Provider<StartRegistrationUseCase> provideStartRegistrationUseCaseProvider;
        private Provider<TagsApi> provideTagsApiProvider;
        private Provider<TagsProvider> provideTagsProvider;
        private Provider<TagsStorage> provideTagsStorageProvider;
        private Provider<TopicsApi> provideTopicsApiProvider;
        private Provider<SocketUrlProvider> provideUrlProvider;
        private Provider<UserApi> provideUserApiProvider;
        private Provider<UserApiService> provideUserApiServiceProvider;
        private Provider<UserAudioMessageUrlGenerator> provideUserAudioMessageUrlGeneratorProvider;
        private Provider<UserProfileRepository> provideUserProfileRepositoryProvider;
        private Provider<BillingPurchasesHistory> provideUserProfileRepositoryProvider2;
        private Provider<UserRepository> provideUserRepositoryProvider;
        private Provider<com.ifriend.domain.data.Preferences> provideUserSharedPreferencesProvider;
        private Provider<UserSubscriptionsBroadcast> provideUserSubscriptionsBroadcastProvider;
        private Provider<ValidateAgeUseCase> provideValidateAgeUseCaseProvider;
        private Provider<ValidateCredentialsUseCase> provideValidateCredentialsUseCaseProvider;
        private Provider<ValidateNameUseCase> provideValidateNameUseCaseProvider;
        private Provider<ValidationApi> provideValidationApiProvider;
        private Provider<KeychainAdapter> providerKeychainAdapterProvider;
        private Provider<SharedPreferences> providerUserPreferencesProvider;
        private Provider<AuthorizationInterceptor> providesAuthorizationInterceptorProvider;
        private Provider<ResourceProviderImpl> resourceProviderImplProvider;
        private Provider<Set<AnalyticsRepository>> setOfAnalyticsRepositoryProvider;
        private Provider<SplashViewModel> splashViewModelProvider;
        private Provider<TimberLoggerRepository> timberLoggerRepositoryProvider;
        private Provider<ToUserMapper> toUserMapperProvider;
        private Provider<TrackExceptionUseCase> trackExceptionUseCaseProvider;
        private Provider<UpdateOnboardingUseCase> updateOnboardingUseCaseProvider;
        private Provider<UserGuideRepositoryImpl> userGuideRepositoryImplProvider;
        private Provider<UserOffersRepositoryImpl> userOffersRepositoryImplProvider;

        private AppComponentImpl(AppModule appModule, PremiumIconManagerModule premiumIconManagerModule, AnalyticUseCasesModule analyticUseCasesModule, BaseAppModule baseAppModule, ChangeUserModule changeUserModule, ChangeBotModule changeBotModule, CoreAuthModule coreAuthModule, LogsModule logsModule, PreferencesModule preferencesModule, RateUsModule rateUsModule, ConnectivityModule connectivityModule, ValidationModule validationModule, NavigationModule navigationModule, AnalyticsModule analyticsModule, DiaryModule diaryModule, LevelsModule levelsModule, ApiModule apiModule, InterceptorsModule interceptorsModule, DataDogModule dataDogModule, SharedTogglesModule sharedTogglesModule, InitialDataLoadersModule initialDataLoadersModule, GoogleServicesModule googleServicesModule, Context context) {
            this.appComponentImpl = this;
            this.context = context;
            this.baseAppModule = baseAppModule;
            this.appModule = appModule;
            this.premiumIconManagerModule = premiumIconManagerModule;
            this.analyticUseCasesModule = analyticUseCasesModule;
            initialize(appModule, premiumIconManagerModule, analyticUseCasesModule, baseAppModule, changeUserModule, changeBotModule, coreAuthModule, logsModule, preferencesModule, rateUsModule, connectivityModule, validationModule, navigationModule, analyticsModule, diaryModule, levelsModule, apiModule, interceptorsModule, dataDogModule, sharedTogglesModule, initialDataLoadersModule, googleServicesModule, context);
            initialize2(appModule, premiumIconManagerModule, analyticUseCasesModule, baseAppModule, changeUserModule, changeBotModule, coreAuthModule, logsModule, preferencesModule, rateUsModule, connectivityModule, validationModule, navigationModule, analyticsModule, diaryModule, levelsModule, apiModule, interceptorsModule, dataDogModule, sharedTogglesModule, initialDataLoadersModule, googleServicesModule, context);
            initialize3(appModule, premiumIconManagerModule, analyticUseCasesModule, baseAppModule, changeUserModule, changeBotModule, coreAuthModule, logsModule, preferencesModule, rateUsModule, connectivityModule, validationModule, navigationModule, analyticsModule, diaryModule, levelsModule, apiModule, interceptorsModule, dataDogModule, sharedTogglesModule, initialDataLoadersModule, googleServicesModule, context);
        }

        private LongTermNotificationByTypeOfPushHandlerImpl longTermNotificationByTypeOfPushHandlerImpl() {
            return new LongTermNotificationByTypeOfPushHandlerImpl(this.bindLongTermNotificationManagerProvider.get(), provideLongTermNotificationByPushCreator());
        }

        private Resources resources() {
            return BaseAppModule_ProvideResourcesFactory.provideResources(this.baseAppModule, this.context);
        }

        private AvatarGeneratedLongTermCreator avatarGeneratedLongTermCreator() {
            return new AvatarGeneratedLongTermCreator(resources());
        }

        private TextToSpeechStreamImpl textToSpeechStreamImpl() {
            return new TextToSpeechStreamImpl(this.context, this.provideAppCoroutineScopeProvider.get());
        }

        private VoiceRecognitionStreamingImpl voiceRecognitionStreamingImpl() {
            return new VoiceRecognitionStreamingImpl(this.provideAppCoroutineScopeProvider.get(), this.bindsDispatcherProvider.get(), this.provideSpeechClientProvider.get(), this.provideAnalyticsInteractorProvider.get());
        }

        private PremiumAppIconManager premiumAppIconManager() {
            return PremiumIconManagerModule_ProvidePremiumAppIconManagerFactory.providePremiumAppIconManager(this.premiumIconManagerModule, this.context);
        }

        private NoInternetPopupDelegate noInternetPopupDelegate() {
            return new NoInternetPopupDelegate(new PopupFragmentFactoryImpl(), this.provideInternetConnectionProvider.get());
        }

        private Map<Class<? extends ViewModel>, Provider<ViewModel>> mapOfClassOfAndProviderOfViewModel() {
            return ImmutableMap.of(SplashViewModel.class, this.splashViewModelProvider);
        }

        private ViewModelFactory viewModelFactory() {
            return new ViewModelFactory(mapOfClassOfAndProviderOfViewModel());
        }

        private AnalyticsNotificationReceivedUseCase analyticsNotificationReceivedUseCase() {
            return AnalyticUseCasesModule_ProvideAnalyticsNotificationReceivedUseCaseFactory.provideAnalyticsNotificationReceivedUseCase(this.analyticUseCasesModule, this.bindsAppIdentityConverterProvider.get(), this.provideAnnalsTrackerAnalyticsSenderProvider.get());
        }

        private AppsflyerDeepLinksManager appsflyerDeepLinksManager() {
            return new AppsflyerDeepLinksManager(this.bindsDeepLinksRepositoryProvider.get());
        }

        private void initialize(AppModule appModule, PremiumIconManagerModule premiumIconManagerModule, AnalyticUseCasesModule analyticUseCasesModule, BaseAppModule baseAppModule, ChangeUserModule changeUserModule, ChangeBotModule changeBotModule, CoreAuthModule coreAuthModule, LogsModule logsModule, PreferencesModule preferencesModule, RateUsModule rateUsModule, ConnectivityModule connectivityModule, ValidationModule validationModule, NavigationModule navigationModule, AnalyticsModule analyticsModule, DiaryModule diaryModule, LevelsModule levelsModule, ApiModule apiModule, InterceptorsModule interceptorsModule, DataDogModule dataDogModule, SharedTogglesModule sharedTogglesModule, InitialDataLoadersModule initialDataLoadersModule, GoogleServicesModule googleServicesModule, Context context) {
            Factory create = InstanceFactory.create(context);
            this.contextProvider = create;
            this.apiUrlProvider = DoubleCheck.provider(ApiModule_ApiUrlFactory.create(apiModule, create));
            this.provideProdLoggerProvider = DoubleCheck.provider(LogsModule_ProvideProdLoggerFactory.create(logsModule));
            this.provideGsonProvider = DoubleCheck.provider(DataToolsModule_Companion_ProvideGsonFactory.create());
            this.provideAppInternalNotificationHandlerProvider = DoubleCheck.provider(InternalNotificationsModule_Companion_ProvideAppInternalNotificationHandlerFactory.create());
            Provider<Retrofit> provider = DoubleCheck.provider(ApiModule_ProvideRetrofitFactory.create(apiModule, this.apiUrlProvider, this.contextProvider, this.provideProdLoggerProvider));
            this.provideRetrofitProvider = provider;
            this.provideShardsApiProvider = DoubleCheck.provider(ApiModule_ProvideShardsApiFactory.create(apiModule, provider));
            this.provideKeychainUserTokenStorageProvider = DoubleCheck.provider(TokenModule_Companion_ProvideKeychainUserTokenStorageFactory.create(this.contextProvider));
            Provider<com.ifriend.domain.data.Preferences> provider2 = DoubleCheck.provider(PreferencesModule_ProvideUserSharedPreferencesFactory.create(preferencesModule, this.contextProvider));
            this.provideUserSharedPreferencesProvider = provider2;
            Provider<AuthDataStorageImpl> provider3 = DoubleCheck.provider(DataModule_Companion_ProvideAuthDataStorageFactory.create(this.provideKeychainUserTokenStorageProvider, provider2));
            this.provideAuthDataStorageProvider = provider3;
            this.provideUrlProvider = DoubleCheck.provider(MessagesModule_Companion_ProvideUrlProviderFactory.create(this.apiUrlProvider, this.provideShardsApiProvider, provider3, this.provideProdLoggerProvider));
            this.provideAppCoroutineScopeProvider = DoubleCheck.provider(BaseAppModule_ProvideAppCoroutineScopeFactory.create(baseAppModule, this.provideProdLoggerProvider));
            this.provideCoroutineDispatchersProvider = DoubleCheck.provider(BaseAppModule_ProvideCoroutineDispatchersFactory.create(baseAppModule));
            this.providerKeychainAdapterProvider = DoubleCheck.provider(LocalDataSourceModule_Companion_ProviderKeychainAdapterFactory.create(this.contextProvider));
            Provider<SharedPreferences> provider4 = DoubleCheck.provider(LocalDataSourceModule_Companion_ProviderUserPreferencesFactory.create(this.contextProvider));
            this.providerUserPreferencesProvider = provider4;
            AuthLocalDataSourceImpl_Factory create2 = AuthLocalDataSourceImpl_Factory.create(this.providerKeychainAdapterProvider, provider4);
            this.authLocalDataSourceImplProvider = create2;
            Provider<AuthLocalDataSource> provider5 = DoubleCheck.provider(create2);
            this.bindsAuthLocalDataSourceProvider = provider5;
            this.chatMessageInfoMapperProvider = ChatMessageInfoMapper_Factory.create(provider5);
            this.provideBotAudioMessageUrlGeneratorProvider = DoubleCheck.provider(MessagesModule_Companion_ProvideBotAudioMessageUrlGeneratorFactory.create(this.contextProvider));
            Provider<UserAudioMessageUrlGenerator> provider6 = DoubleCheck.provider(MessagesModule_Companion_ProvideUserAudioMessageUrlGeneratorFactory.create(this.contextProvider));
            this.provideUserAudioMessageUrlGeneratorProvider = provider6;
            this.chatAudioContentMessageMapperProvider = ChatAudioContentMessageMapper_Factory.create(this.provideBotAudioMessageUrlGeneratorProvider, provider6);
            Provider<AppConfigStorage> provider7 = DoubleCheck.provider(DataModule_Companion_ProvideAppConfigStorageFactory.create(this.contextProvider));
            this.provideAppConfigStorageProvider = provider7;
            ChatImageUrlMapper_Factory create3 = ChatImageUrlMapper_Factory.create(provider7, this.provideAuthDataStorageProvider);
            this.chatImageUrlMapperProvider = create3;
            this.chatImageContentMessageMapperProvider = ChatImageContentMessageMapper_Factory.create(create3, this.provideAppConfigStorageProvider);
            this.chatUserImageContentMessageMapperProvider = ChatUserImageContentMessageMapper_Factory.create(this.chatImageUrlMapperProvider);
            this.chatGiftContentMessageMapperProvider = ChatGiftContentMessageMapper_Factory.create(this.chatImageUrlMapperProvider);
            ChatMessageContentMapper_Factory create4 = ChatMessageContentMapper_Factory.create(this.chatAudioContentMessageMapperProvider, this.chatImageContentMessageMapperProvider, this.chatUserImageContentMessageMapperProvider, ChatTextContentMessageMapper_Factory.create(), this.chatGiftContentMessageMapperProvider);
            this.chatMessageContentMapperProvider = create4;
            ChatMessageMapper_Factory create5 = ChatMessageMapper_Factory.create(this.chatMessageInfoMapperProvider, create4);
            this.chatMessageMapperProvider = create5;
            this.jsonToChatMessageMapperProvider = JsonToChatMessageMapper_Factory.create(create5, this.provideGsonProvider);
            this.provideJsonToTagOfUserMapperProvider = DoubleCheck.provider(MessagesModule_Companion_ProvideJsonToTagOfUserMapperFactory.create());
            this.provideSocketMessageToNeuronsChangeMapperProvider = DoubleCheck.provider(MessagesModule_Companion_ProvideSocketMessageToNeuronsChangeMapperFactory.create());
            this.provideJsonToNeuronsAddedMapperProvider = DoubleCheck.provider(MessagesModule_Companion_ProvideJsonToNeuronsAddedMapperFactory.create());
            this.provideJsonToDailyNeuronsReceivedMapperProvider = DoubleCheck.provider(MessagesModule_Companion_ProvideJsonToDailyNeuronsReceivedMapperFactory.create());
            this.provideJsonToGeneratedAvatarMapperProvider = DoubleCheck.provider(MessagesModule_Companion_ProvideJsonToGeneratedAvatarMapperFactory.create());
            this.provideJsonToAvatarAnimationGeneratedMapperProvider = DoubleCheck.provider(MessagesModule_Companion_ProvideJsonToAvatarAnimationGeneratedMapperFactory.create());
            this.provideJsonToBotChangedMapperProvider = DoubleCheck.provider(MessagesModule_Companion_ProvideJsonToBotChangedMapperFactory.create(GenderFromBackendString_Factory.create(), EthnicityFromBackendValueMapper_Factory.create(), PersonalityFromBackendValueMapper_Factory.create()));
            this.provideJsonToAddDiaryNotesMapperProvider = DoubleCheck.provider(MessagesModule_Companion_ProvideJsonToAddDiaryNotesMapperFactory.create(this.provideProdLoggerProvider));
            this.provideJsonToLevelInfoUpdateMapperProvider = DoubleCheck.provider(MessagesModule_Companion_ProvideJsonToLevelInfoUpdateMapperFactory.create());
            this.chatRegenerateMessageFailedMapperProvider = ChatRegenerateMessageFailedMapper_Factory.create(this.provideGsonProvider);
            this.chatSubscriptionMapperProvider = ChatSubscriptionMapper_Factory.create(this.provideGsonProvider);
            Provider<SocketMessageToMessagesSourceMessageMapper> provider8 = DoubleCheck.provider(MessagesModule_Companion_ProvideSocketMessageToMessagesSourceMapperFactory.create(this.jsonToChatMessageMapperProvider, this.provideJsonToTagOfUserMapperProvider, this.provideSocketMessageToNeuronsChangeMapperProvider, this.provideJsonToNeuronsAddedMapperProvider, this.provideJsonToDailyNeuronsReceivedMapperProvider, this.provideJsonToGeneratedAvatarMapperProvider, this.provideJsonToAvatarAnimationGeneratedMapperProvider, this.provideJsonToBotChangedMapperProvider, this.provideJsonToAddDiaryNotesMapperProvider, this.provideJsonToLevelInfoUpdateMapperProvider, ChatRemovedMessageMapper_Factory.create(), JsonToChatCallMessageMapper_Factory.create(), this.chatRegenerateMessageFailedMapperProvider, this.chatSubscriptionMapperProvider));
            this.provideSocketMessageToMessagesSourceMapperProvider = provider8;
            Provider<MessagesSource> provider9 = DoubleCheck.provider(MessagesModule_Companion_ProvideControllableMessagesSourceFactory.create(this.provideUrlProvider, this.provideAppCoroutineScopeProvider, this.provideCoroutineDispatchersProvider, this.provideProdLoggerProvider, this.contextProvider, provider8));
            this.provideControllableMessagesSourceProvider = provider9;
            this.provideAppNotifierProvider = DoubleCheck.provider(InternalNotificationsModule_Companion_ProvideAppNotifierFactory.create(provider9, this.provideAppInternalNotificationHandlerProvider, this.provideAppCoroutineScopeProvider, this.provideCoroutineDispatchersProvider, this.provideProdLoggerProvider));
            this.provideRateUsStateStorageProvider = DoubleCheck.provider(RateUsModule_ProvideRateUsStateStorageFactory.create(rateUsModule, this.provideUserSharedPreferencesProvider));
            Provider<RouterProvider> provider10 = DoubleCheck.provider(NavigationModule_ProvideRouterProviderFactory.create(navigationModule));
            this.provideRouterProvider = provider10;
            this.provideRateAppShowingPlannerProvider = DoubleCheck.provider(RateUsModule_ProvideRateAppShowingPlannerFactory.create(rateUsModule, this.provideAppInternalNotificationHandlerProvider, provider10));
            this.provideAvatarAnimationEnabledStorageProvider = DoubleCheck.provider(DataModule_Companion_ProvideAvatarAnimationEnabledStorageFactory.create(this.provideUserSharedPreferencesProvider));
            Provider<AppConfigLocalDataSource> provider11 = DoubleCheck.provider(AppConfigLocalDataSourceImpl_Factory.create());
            this.bindsAppConfigLocalDataSourceProvider = provider11;
            this.provideAvatarGenerationFreeToggleProvider = DoubleCheck.provider(SharedTogglesModule_ProvideAvatarGenerationFreeToggleFactory.create(sharedTogglesModule, provider11, this.provideAppCoroutineScopeProvider));
            Provider<NeuronsApi> provider12 = DoubleCheck.provider(ApiModule_ProvideNeuronsApiFactory.create(apiModule, this.provideRetrofitProvider));
            this.provideNeuronsApiProvider = provider12;
            this.provideNeuronsCostsStorageProvider = DoubleCheck.provider(DataModule_Companion_ProvideNeuronsCostsStorageFactory.create(this.provideAppCoroutineScopeProvider, this.bindsAppConfigLocalDataSourceProvider, this.provideAvatarGenerationFreeToggleProvider, provider12, this.provideAuthDataStorageProvider));
            this.provideTagsApiProvider = DoubleCheck.provider(ApiModule_ProvideTagsApiFactory.create(apiModule, this.provideRetrofitProvider));
            Provider<TagsLocalDataSource> provider13 = DoubleCheck.provider(TagsLocalDataSourceImpl_Factory.create());
            this.bindsTagsLocalDataSourceProvider = provider13;
            Provider<TagsStorage> provider14 = DoubleCheck.provider(DataModule_Companion_ProvideTagsStorageFactory.create(this.provideTagsApiProvider, this.provideAuthDataStorageProvider, this.provideAppInternalNotificationHandlerProvider, this.provideCoroutineDispatchersProvider, this.provideAppCoroutineScopeProvider, this.provideProdLoggerProvider, provider13));
            this.provideTagsStorageProvider = provider14;
            this.provideTagsProvider = DoubleCheck.provider(DataModule_Companion_ProvideTagsProviderFactory.create(provider14));
            this.provideUserApiProvider = DoubleCheck.provider(ApiModule_ProvideUserApiFactory.create(apiModule, this.provideRetrofitProvider));
            this.toUserMapperProvider = ToUserMapper_Factory.create(GenderFromBackendString_Factory.create());
            Provider<UserRepository> provider15 = DoubleCheck.provider(DataModule_Companion_ProvideUserRepositoryFactory.create(this.provideAuthDataStorageProvider, this.provideTagsProvider, this.provideUserApiProvider, GenderToBackendString_Factory.create(), this.toUserMapperProvider, this.provideCoroutineDispatchersProvider, this.provideAppCoroutineScopeProvider));
            this.provideUserRepositoryProvider = provider15;
            Provider<UserSubscriptionsBroadcast> provider16 = DoubleCheck.provider(DataModule_Companion_ProvideUserSubscriptionsBroadcastFactory.create(provider15));
            this.provideUserSubscriptionsBroadcastProvider = provider16;
            this.provideIsImageAllowedBroadcastProvider = DoubleCheck.provider(DataModule_Companion_ProvideIsImageAllowedBroadcastFactory.create(provider16));
            this.provideBotApiProvider = DoubleCheck.provider(ApiModule_ProvideBotApiFactory.create(apiModule, this.provideRetrofitProvider));
            this.botFromResponseMapperProvider = BotFromResponseMapper_Factory.create(EthnicityFromBackendValueMapper_Factory.create(), PersonalityFromBackendValueMapper_Factory.create(), GenderFromBackendString_Factory.create());
            this.provideDeviceByUserSharedPreferencesProvider = DoubleCheck.provider(PreferencesModule_ProvideDeviceByUserSharedPreferencesFactory.create(preferencesModule, this.contextProvider, this.provideUserSharedPreferencesProvider));
            this.bindsMainBotLocalDataSourceProvider = DoubleCheck.provider(MainBotLocalDataSourceImpl_Factory.create());
            this.provideBotRepositoryProvider = DoubleCheck.provider(DataModule_Companion_ProvideBotRepositoryFactory.create(this.provideAuthDataStorageProvider, this.provideBotApiProvider, this.botFromResponseMapperProvider, GenderToBackendString_Factory.create(), PersonalityToBackendValueMapper_Factory.create(), EthnicityToBackendValueMapper_Factory.create(), this.provideUserSharedPreferencesProvider, this.provideDeviceByUserSharedPreferencesProvider, this.provideProdLoggerProvider, this.provideCoroutineDispatchersProvider, this.provideAppCoroutineScopeProvider, this.provideControllableMessagesSourceProvider, this.bindsMainBotLocalDataSourceProvider));
            Provider<DiaryApi> provider17 = DoubleCheck.provider(ApiModule_ProvideDiaryApiFactory.create(apiModule, this.provideRetrofitProvider));
            this.provideDiaryApiProvider = provider17;
            this.diaryApiDelegateProvider = DiaryApiDelegate_Factory.create(provider17, this.provideUserRepositoryProvider);
            this.provideDiaryDaoProvider = DoubleCheck.provider(DataModule_Companion_ProvideDiaryDaoFactory.create());
            Provider<ShownDiaryNotesDao> provider18 = DoubleCheck.provider(DataModule_Companion_ProvideShownDiaryNotesDaoFactory.create(this.provideDeviceByUserSharedPreferencesProvider));
            this.provideShownDiaryNotesDaoProvider = provider18;
            this.provideDiaryRepositoryProvider = DoubleCheck.provider(DataModule_Companion_ProvideDiaryRepositoryFactory.create(this.diaryApiDelegateProvider, this.provideDiaryDaoProvider, provider18, this.provideUserRepositoryProvider, this.provideBotRepositoryProvider, this.provideControllableMessagesSourceProvider, this.provideAppCoroutineScopeProvider, this.provideProdLoggerProvider));
            this.provideDiaryNoteReplierProvider = DoubleCheck.provider(DataModule_Companion_ProvideDiaryNoteReplierFactory.create(this.diaryApiDelegateProvider));
            Provider<LevelsApi> provider19 = DoubleCheck.provider(ApiModule_ProvideLevelsApiFactory.create(apiModule, this.provideRetrofitProvider));
            this.provideLevelsApiProvider = provider19;
            this.levelsApiDelegateProvider = LevelsApiDelegate_Factory.create(provider19, this.provideUserRepositoryProvider);
            Provider<LevelsDao> provider20 = DoubleCheck.provider(DataModule_Companion_ProvideLevelsDaoFactory.create());
            this.provideLevelsDaoProvider = provider20;
            this.provideLevelsRepositoryProvider = DoubleCheck.provider(DataModule_Companion_ProvideLevelsRepositoryFactory.create(this.levelsApiDelegateProvider, this.provideUserRepositoryProvider, provider20, this.provideControllableMessagesSourceProvider, this.provideAppCoroutineScopeProvider, this.provideCoroutineDispatchersProvider));
            Provider<AuthorizationInterceptor> provider21 = DoubleCheck.provider(InterceptorsModule_ProvidesAuthorizationInterceptorFactory.create(interceptorsModule, this.bindsAuthLocalDataSourceProvider));
            this.providesAuthorizationInterceptorProvider = provider21;
            Provider<OkHttpClient> provider22 = DoubleCheck.provider(ApiModule_ProvideAppHttpClientFactory.create(apiModule, provider21, TimeoutInterceptor_Factory.create()));
            this.provideAppHttpClientProvider = provider22;
            Provider<Retrofit> provider23 = DoubleCheck.provider(ApiModule_ProvideAppRetrofitFactory.create(apiModule, provider22, this.apiUrlProvider));
            this.provideAppRetrofitProvider = provider23;
            Provider<OnboardingApi> provider24 = DoubleCheck.provider(ApiModule_ProvideOnboardingApiFactory.create(apiModule, provider23));
            this.provideOnboardingApiProvider = provider24;
            OnboardingApiDelegate_Factory create6 = OnboardingApiDelegate_Factory.create(provider24, this.bindsAuthLocalDataSourceProvider);
            this.onboardingApiDelegateProvider = create6;
            this.provideOnboardingAnswersRepositoryProvider = DoubleCheck.provider(DataModule_Companion_ProvideOnboardingAnswersRepositoryFactory.create(create6));
            DiaryFeatureToggle_Factory create7 = DiaryFeatureToggle_Factory.create(this.bindsAppConfigLocalDataSourceProvider, this.provideAppCoroutineScopeProvider);
            this.diaryFeatureToggleProvider = create7;
            this.provideGetDiaryNotesUseCaseProvider = DoubleCheck.provider(DiaryModule_ProvideGetDiaryNotesUseCaseFactory.create(diaryModule, this.provideDiaryRepositoryProvider, this.provideUserRepositoryProvider, this.provideBotRepositoryProvider, create7));
            this.provideGenerateBotAvatarApiProvider = DoubleCheck.provider(ApiModule_ProvideGenerateBotAvatarApiFactory.create(apiModule, this.provideRetrofitProvider));
            this.provideAvatarsStorageProvider = DoubleCheck.provider(DataModule_Companion_ProvideAvatarsStorageFactory.create(this.provideAuthDataStorageProvider, this.contextProvider, this.provideCoroutineDispatchersProvider));
            this.provideAvatarInfoStorageProvider = DoubleCheck.provider(DataModule_Companion_ProvideAvatarInfoStorageFactory.create(this.provideUserSharedPreferencesProvider));
            this.provideAvatarGenerationStatusStorageProvider = DoubleCheck.provider(DataModule_Companion_ProvideAvatarGenerationStatusStorageFactory.create());
            Provider<AnimatedAvatarFeatureToggle> provider25 = DoubleCheck.provider(SharedTogglesModule_ProvideAnimatedAvatarFeatureToggleFactory.create(sharedTogglesModule, this.bindsAppConfigLocalDataSourceProvider, this.provideAppCoroutineScopeProvider));
            this.provideAnimatedAvatarFeatureToggleProvider = provider25;
            this.provideGenerateBotAvatarRepositoryProvider = DoubleCheck.provider(DataModule_Companion_ProvideGenerateBotAvatarRepositoryFactory.create(this.provideGenerateBotAvatarApiProvider, this.provideAuthDataStorageProvider, this.provideControllableMessagesSourceProvider, this.provideAppCoroutineScopeProvider, this.provideUserSharedPreferencesProvider, this.provideAvatarsStorageProvider, this.provideAvatarInfoStorageProvider, this.provideAvatarGenerationStatusStorageProvider, this.provideNeuronsCostsStorageProvider, provider25, this.provideAvatarAnimationEnabledStorageProvider, this.provideBotRepositoryProvider, this.provideProdLoggerProvider));
            CoreExecuteCatchingImpl_Factory create8 = CoreExecuteCatchingImpl_Factory.create(this.provideCoroutineDispatchersProvider, CoreExceptionMapper_Factory.create());
            this.coreExecuteCatchingImplProvider = create8;
            this.bindsCoreExecuteCatchingProvider = DoubleCheck.provider(create8);
            Provider<ChatConfigurationsApi> provider26 = DoubleCheck.provider(ApiModule_ProvideChatConfigurationApiFactory.create(apiModule, this.provideAppRetrofitProvider));
            this.provideChatConfigurationApiProvider = provider26;
            this.chatConfigurationsRemoteDataSourceProvider = ChatConfigurationsRemoteDataSource_Factory.create(provider26);
            this.chatConfigMapperProvider = ChatConfigMapper_Factory.create(PersonalityFromBackendValueMapper_Factory.create(), GenderFromBackendString_Factory.create());
            Provider<DispatcherProvider> provider27 = DoubleCheck.provider(DispatcherProviderImpl_Factory.create());
            this.bindsDispatcherProvider = provider27;
            ChatConfigsMemoryCachedSourceImpl_Factory create9 = ChatConfigsMemoryCachedSourceImpl_Factory.create(this.chatConfigurationsRemoteDataSourceProvider, this.provideAppConfigStorageProvider, this.chatConfigMapperProvider, provider27, this.bindsCoreExecuteCatchingProvider);
            this.chatConfigsMemoryCachedSourceImplProvider = create9;
            this.bindsConfigurationBotsMemoryCachedSourceProvider = DoubleCheck.provider(create9);
            Provider<ChatsApi> provider28 = DoubleCheck.provider(ApiModule_ProvideChatsApiFactory.create(apiModule, this.provideAppRetrofitProvider));
            this.provideChatsApiProvider = provider28;
            this.chatsRemoteDataSourceProvider = ChatsRemoteDataSource_Factory.create(provider28, this.provideAuthDataStorageProvider);
            this.chatsInfoRepositoryImplProvider = ChatsInfoRepositoryImpl_Factory.create(this.bindsCoreExecuteCatchingProvider, this.bindsMainBotLocalDataSourceProvider, this.bindsConfigurationBotsMemoryCachedSourceProvider, ChatInfoMapper_Factory.create(), this.chatsRemoteDataSourceProvider);
        }

        private void initialize2(AppModule appModule, PremiumIconManagerModule premiumIconManagerModule, AnalyticUseCasesModule analyticUseCasesModule, BaseAppModule baseAppModule, ChangeUserModule changeUserModule, ChangeBotModule changeBotModule, CoreAuthModule coreAuthModule, LogsModule logsModule, PreferencesModule preferencesModule, RateUsModule rateUsModule, ConnectivityModule connectivityModule, ValidationModule validationModule, NavigationModule navigationModule, AnalyticsModule analyticsModule, DiaryModule diaryModule, LevelsModule levelsModule, ApiModule apiModule, InterceptorsModule interceptorsModule, DataDogModule dataDogModule, SharedTogglesModule sharedTogglesModule, InitialDataLoadersModule initialDataLoadersModule, GoogleServicesModule googleServicesModule, Context context) {
            this.bindsChatsInfoRepositoryProvider = DoubleCheck.provider(this.chatsInfoRepositoryImplProvider);
            ChatNotificationsRepositoryImpl_Factory create = ChatNotificationsRepositoryImpl_Factory.create(ChatNotificationsMapper_Factory.create(), this.provideCoroutineDispatchersProvider, this.bindsChatsInfoRepositoryProvider);
            this.chatNotificationsRepositoryImplProvider = create;
            this.bindsChatNotificationRepositoryProvider = DoubleCheck.provider(create);
            this.provideDataStoreProvider = DoubleCheck.provider(LocalDataModule_Companion_ProvideDataStoreFactory.create(this.contextProvider));
            AppInfoProviderImpl_Factory create2 = AppInfoProviderImpl_Factory.create(this.contextProvider);
            this.appInfoProviderImplProvider = create2;
            Provider<AppInfoProvider> provider = DoubleCheck.provider(create2);
            this.bindsAppInfoProvider = provider;
            InAppUpdateRepositoryImpl_Factory create3 = InAppUpdateRepositoryImpl_Factory.create(this.provideDataStoreProvider, provider);
            this.inAppUpdateRepositoryImplProvider = create3;
            this.bindInAppUpdateRepositoryProvider = SingleCheck.provider(create3);
            this.provideInitialUserLoaderProvider = DoubleCheck.provider(InitialDataLoadersModule_ProvideInitialUserLoaderFactory.create(initialDataLoadersModule, this.provideUserRepositoryProvider));
            this.provideInitialBotLoaderProvider = DoubleCheck.provider(InitialDataLoadersModule_ProvideInitialBotLoaderFactory.create(initialDataLoadersModule, this.provideBotRepositoryProvider));
            this.provideInitialTagsLoaderProvider = DoubleCheck.provider(InitialDataLoadersModule_ProvideInitialTagsLoaderFactory.create(initialDataLoadersModule, this.provideTagsProvider));
            this.provideDiaryLoaderProvider = DoubleCheck.provider(InitialDataLoadersModule_ProvideDiaryLoaderFactory.create(initialDataLoadersModule, this.diaryFeatureToggleProvider, this.provideDiaryRepositoryProvider, this.provideUserRepositoryProvider));
            Provider<ChatGiftsApi> provider2 = DoubleCheck.provider(DataModule_Companion_ProvideChatGiftsApiFactory.create(this.provideRetrofitProvider));
            this.provideChatGiftsApiProvider = provider2;
            ChatGiftsRemoteDataSource_Factory create4 = ChatGiftsRemoteDataSource_Factory.create(provider2, this.provideUserRepositoryProvider);
            this.chatGiftsRemoteDataSourceProvider = create4;
            this.provideChatGiftsRepositoryProvider = DoubleCheck.provider(DataModule_Companion_ProvideChatGiftsRepositoryFactory.create(create4, this.provideAppConfigStorageProvider, this.bindsCoreExecuteCatchingProvider));
            ChatGiftsStoreToggle_Factory create5 = ChatGiftsStoreToggle_Factory.create(this.bindsAppConfigLocalDataSourceProvider, this.provideAppCoroutineScopeProvider);
            this.chatGiftsStoreToggleProvider = create5;
            this.provideChatGiftsLoaderProvider = DoubleCheck.provider(InitialDataLoadersModule_ProvideChatGiftsLoaderFactory.create(initialDataLoadersModule, this.provideChatGiftsRepositoryProvider, this.provideUserRepositoryProvider, create5));
            this.provideInitialLevelInfoLoaderProvider = DoubleCheck.provider(InitialDataLoadersModule_ProvideInitialLevelInfoLoaderFactory.create(initialDataLoadersModule, this.provideLevelsRepositoryProvider));
            this.provideInitialAvatarLoaderProvider = DoubleCheck.provider(InitialDataLoadersModule_ProvideInitialAvatarLoaderFactory.create(initialDataLoadersModule, this.provideGenerateBotAvatarRepositoryProvider, this.provideAvatarGenerationStatusStorageProvider));
            Provider<ImageLoader> provider3 = DoubleCheck.provider(DataModule_Companion_ProvideAppImageLoaderFactory.create(this.contextProvider, this.provideAppHttpClientProvider));
            this.provideAppImageLoaderProvider = provider3;
            Provider<AppImageLoaderRepository> provider4 = DoubleCheck.provider(DataModule_Companion_ProvideAppImageLoaderRepositoryFactory.create(this.contextProvider, provider3));
            this.provideAppImageLoaderRepositoryProvider = provider4;
            this.provideInitialConfigurationBotsAvatarLoaderProvider = DoubleCheck.provider(InitialDataLoadersModule_ProvideInitialConfigurationBotsAvatarLoaderFactory.create(initialDataLoadersModule, this.bindsConfigurationBotsMemoryCachedSourceProvider, this.provideUserRepositoryProvider, provider4));
            ChatsInfoConfigurationRepositoryImpl_Factory create6 = ChatsInfoConfigurationRepositoryImpl_Factory.create(this.bindsCoreExecuteCatchingProvider, this.bindsDispatcherProvider, this.provideDataStoreProvider);
            this.chatsInfoConfigurationRepositoryImplProvider = create6;
            this.bindsChatsInfoConfigurationRepositoryProvider = DoubleCheck.provider(create6);
            this.provideFirebaseAnalyticsRepositoryProvider = DoubleCheck.provider(CoreAnalyticsModule_Companion_ProvideFirebaseAnalyticsRepositoryFactory.create(this.contextProvider));
            Provider<AnnalsApiService> provider5 = DoubleCheck.provider(ApiModule_ProvideAnnalsApiServiceFactory.create(apiModule, this.provideRetrofitProvider));
            this.provideAnnalsApiServiceProvider = provider5;
            this.provideAnnalsAnalyticsRepositoryProvider = DoubleCheck.provider(CoreAnalyticsModule_Companion_ProvideAnnalsAnalyticsRepositoryFactory.create(this.bindsDispatcherProvider, this.provideAppCoroutineScopeProvider, provider5, this.bindsAuthLocalDataSourceProvider));
            this.provideAppsFlyerAnalyticsRepositoryProvider = DoubleCheck.provider(CoreAnalyticsModule_Companion_ProvideAppsFlyerAnalyticsRepositoryFactory.create(this.contextProvider));
            SetFactory build = SetFactory.builder(3, 0).addProvider(this.provideFirebaseAnalyticsRepositoryProvider).addProvider(this.provideAnnalsAnalyticsRepositoryProvider).addProvider(this.provideAppsFlyerAnalyticsRepositoryProvider).build();
            this.setOfAnalyticsRepositoryProvider = build;
            TrackExceptionUseCase_Factory create7 = TrackExceptionUseCase_Factory.create(build);
            this.trackExceptionUseCaseProvider = create7;
            AnalyticsInteractorImpl_Factory create8 = AnalyticsInteractorImpl_Factory.create(create7, this.setOfAnalyticsRepositoryProvider);
            this.analyticsInteractorImplProvider = create8;
            Provider<AnalyticsInteractor> provider6 = SingleCheck.provider(create8);
            this.provideAnalyticsInteractorProvider = provider6;
            this.provideConfigurationBotsLoaderProvider = DoubleCheck.provider(InitialDataLoadersModule_ProvideConfigurationBotsLoaderFactory.create(initialDataLoadersModule, this.bindsConfigurationBotsMemoryCachedSourceProvider, this.provideUserRepositoryProvider, this.bindsChatsInfoConfigurationRepositoryProvider, this.bindsChatsInfoRepositoryProvider, provider6));
            Provider<LocalConfigExtractor> provider7 = DoubleCheck.provider(ConfigModule_Companion_ProvideLocalConfigExtractorFactory.create(this.contextProvider, this.bindsAppInfoProvider));
            this.provideLocalConfigExtractorProvider = provider7;
            this.localDefaultsConfigProvider = LocalDefaultsConfig_Factory.create(provider7);
            Provider<ConditionsChecker> provider8 = DoubleCheck.provider(ConfigModule_Companion_ProvideConditionsCheckerFactory.create(this.provideBotRepositoryProvider, this.provideProdLoggerProvider));
            this.provideConditionsCheckerProvider = provider8;
            Provider<FirebaseRemoteConfigParser> provider9 = DoubleCheck.provider(ConfigModule_Companion_ProvideFirebaseRemoteConfigParserFactory.create(this.provideTagsProvider, provider8));
            this.provideFirebaseRemoteConfigParserProvider = provider9;
            FirebaseConfig_Factory create9 = FirebaseConfig_Factory.create(provider9, this.provideProdLoggerProvider);
            this.firebaseConfigProvider = create9;
            AppConfigRepositoryImpl_Factory create10 = AppConfigRepositoryImpl_Factory.create(this.bindsCoreExecuteCatchingProvider, this.localDefaultsConfigProvider, create9, this.bindsAppConfigLocalDataSourceProvider, this.bindsTagsLocalDataSourceProvider, this.provideAppCoroutineScopeProvider);
            this.appConfigRepositoryImplProvider = create10;
            Provider<AppConfigRepository> provider10 = DoubleCheck.provider(create10);
            this.bindsAppConfigRepositoryProvider = provider10;
            this.appConfigLoaderProvider = AppConfigLoader_Factory.create(provider10, this.provideTagsProvider, this.provideAnalyticsInteractorProvider);
            ChatsRepositoryImpl_Factory create11 = ChatsRepositoryImpl_Factory.create(this.bindsCoreExecuteCatchingProvider, this.chatsRemoteDataSourceProvider);
            this.chatsRepositoryImplProvider = create11;
            Provider<ChatsRepository> provider11 = SingleCheck.provider(create11);
            this.bindsChatsRepositoryProvider = provider11;
            Provider<InitialUserConfigLoader> provider12 = DoubleCheck.provider(InitialDataLoadersModule_ProvideInitialUserConfigLoaderFactory.create(initialDataLoadersModule, provider11, this.provideTagsProvider));
            this.provideInitialUserConfigLoaderProvider = provider12;
            this.provideInitialDataLoaderProvider = DoubleCheck.provider(InitialDataLoadersModule_ProvideInitialDataLoaderFactory.create(initialDataLoadersModule, this.provideCoroutineDispatchersProvider, this.provideProdLoggerProvider, this.provideInitialUserLoaderProvider, this.provideInitialBotLoaderProvider, this.provideInitialTagsLoaderProvider, this.provideDiaryLoaderProvider, this.provideChatGiftsLoaderProvider, this.provideInitialLevelInfoLoaderProvider, this.provideInitialAvatarLoaderProvider, this.provideInitialConfigurationBotsAvatarLoaderProvider, this.provideConfigurationBotsLoaderProvider, this.appConfigLoaderProvider, provider12));
            UserOffersRepositoryImpl_Factory create12 = UserOffersRepositoryImpl_Factory.create(this.bindsDispatcherProvider, this.provideDataStoreProvider);
            this.userOffersRepositoryImplProvider = create12;
            this.bindUserOffersRepositoryProvider = SingleCheck.provider(create12);
            this.provideValidationApiProvider = DoubleCheck.provider(ApiModule_ProvideValidationApiFactory.create(apiModule, this.apiUrlProvider, this.contextProvider, this.provideProdLoggerProvider));
            this.provideRegistrationApiProvider = DoubleCheck.provider(CoreAuthModule_ProvideRegistrationApiFactory.create(coreAuthModule, this.provideRetrofitProvider));
            this.provideChatsInfoApiProvider = DoubleCheck.provider(ApiModule_ProvideChatsInfoApiFactory.create(apiModule, this.provideAppRetrofitProvider));
            this.provideChatApiProvider = DoubleCheck.provider(DataModule_Companion_ProvideChatApiFactory.create(this.provideAppRetrofitProvider));
            this.provideTopicsApiProvider = DoubleCheck.provider(DataModule_Companion_ProvideTopicsApiFactory.create(this.provideAppRetrofitProvider));
            this.provideUserApiServiceProvider = DoubleCheck.provider(ApiModule_ProvideUserApiServiceFactory.create(apiModule, this.provideAppRetrofitProvider));
            this.provideCallApiServiceProvider = DoubleCheck.provider(ApiModule_ProvideCallApiServiceFactory.create(apiModule, this.provideAppRetrofitProvider));
            this.provideRegistrationProcessProvider = DoubleCheck.provider(CoreAuthModule_ProvideRegistrationProcessFactory.create(coreAuthModule, this.provideRegistrationApiProvider, this.provideProdLoggerProvider));
            Provider<ResetPasswordApi> provider13 = DoubleCheck.provider(ApiModule_ProvideResetPasswordApiFactory.create(apiModule, this.provideRetrofitProvider));
            this.provideResetPasswordApiProvider = provider13;
            this.provideResetPasswordRepositoryProvider = DoubleCheck.provider(DataModule_Companion_ProvideResetPasswordRepositoryFactory.create(provider13));
            Provider<RateUsApi> provider14 = DoubleCheck.provider(ApiModule_ProvideRateUsApiFactory.create(apiModule, this.provideRetrofitProvider));
            this.provideRateUsApiProvider = provider14;
            this.provideRateUsRepositoryProvider = DoubleCheck.provider(DataModule_Companion_ProvideRateUsRepositoryFactory.create(this.provideAuthDataStorageProvider, provider14));
            this.provideEventDelayStorageProvider = DoubleCheck.provider(DataModule_Companion_ProvideEventDelayStorageFactory.create(this.provideUserSharedPreferencesProvider));
            this.provideGetUserUseCaseProvider = DoubleCheck.provider(UseCasesModule_Companion_ProvideGetUserUseCaseFactory.create(this.provideUserRepositoryProvider));
            this.provideSetUserAgeUseCaseProvider = DoubleCheck.provider(ChangeUserModule_ProvideSetUserAgeUseCaseFactory.create(changeUserModule, this.provideUserRepositoryProvider));
            this.provideSetUserNameUseCaseProvider = DoubleCheck.provider(ChangeUserModule_ProvideSetUserNameUseCaseFactory.create(changeUserModule, this.provideUserRepositoryProvider));
            this.provideSetUserGenderUseCaseProvider = DoubleCheck.provider(ChangeUserModule_ProvideSetUserGenderUseCaseFactory.create(changeUserModule, this.provideUserRepositoryProvider));
            this.provideGetBotUseCaseProvider = DoubleCheck.provider(UseCasesModule_Companion_ProvideGetBotUseCaseFactory.create(this.provideBotRepositoryProvider));
            this.provideChangeBotGenderUseCaseProvider = DoubleCheck.provider(ChangeBotModule_ProvideChangeBotGenderUseCaseFactory.create(changeBotModule, this.provideBotRepositoryProvider));
            this.provideChangeBotAgeUseCaseProvider = DoubleCheck.provider(ChangeBotModule_ProvideChangeBotAgeUseCaseFactory.create(changeBotModule, this.provideBotRepositoryProvider));
            this.provideChangeBotEthnicityUseCaseProvider = DoubleCheck.provider(ChangeBotModule_ProvideChangeBotEthnicityUseCaseFactory.create(changeBotModule, this.provideBotRepositoryProvider));
            this.provideChangeBotPersonalityUseCaseProvider = DoubleCheck.provider(ChangeBotModule_ProvideChangeBotPersonalityUseCaseFactory.create(changeBotModule, this.provideBotRepositoryProvider));
            this.provideChangeBotVoiceUseCaseProvider = DoubleCheck.provider(ChangeBotModule_ProvideChangeBotVoiceUseCaseFactory.create(changeBotModule, this.provideBotRepositoryProvider));
            this.provideGetDiaryNotesListUseCaseProvider = DoubleCheck.provider(DiaryModule_ProvideGetDiaryNotesListUseCaseFactory.create(diaryModule, this.provideGetDiaryNotesUseCaseProvider));
            this.provideReplyDiaryNoteUseCaseProvider = DoubleCheck.provider(DiaryModule_ProvideReplyDiaryNoteUseCaseFactory.create(diaryModule, this.provideDiaryNoteReplierProvider, this.provideDiaryRepositoryProvider));
            this.provideRefreshDiaryUseCaseProvider = DoubleCheck.provider(DiaryModule_ProvideRefreshDiaryUseCaseFactory.create(diaryModule, this.provideDiaryRepositoryProvider));
            this.provideOnDiaryShownUseCaseProvider = DoubleCheck.provider(DiaryModule_ProvideOnDiaryShownUseCaseFactory.create(diaryModule, this.provideDiaryRepositoryProvider));
            this.provideGetLevelsListUseCaseProvider = DoubleCheck.provider(LevelsModule_ProvideGetLevelsListUseCaseFactory.create(levelsModule, this.provideLevelsRepositoryProvider));
            LiveChatMessagesFlowImpl_Factory create13 = LiveChatMessagesFlowImpl_Factory.create(this.provideControllableMessagesSourceProvider);
            this.liveChatMessagesFlowImplProvider = create13;
            this.bindsChatMessagesFlowProvider = DoubleCheck.provider(create13);
            this.provideMediaPlayerPlaybackControllerGeneratorProvider = DoubleCheck.provider(MessagesModule_Companion_ProvideMediaPlayerPlaybackControllerGeneratorFactory.create(this.contextProvider, this.provideKeychainUserTokenStorageProvider));
            Provider<InternetConnection> provider15 = DoubleCheck.provider(ConnectivityModule_ProvideInternetConnectionFactory.create(connectivityModule, this.contextProvider, this.provideAppCoroutineScopeProvider, this.provideCoroutineDispatchersProvider));
            this.provideInternetConnectionProvider = provider15;
            this.provideMessagesSourceLifecycleControllerProvider = DoubleCheck.provider(MessagesModule_Companion_ProvideMessagesSourceLifecycleControllerFactory.create(provider15, this.provideAppCoroutineScopeProvider, this.provideCoroutineDispatchersProvider, this.provideControllableMessagesSourceProvider, this.provideProdLoggerProvider));
            this.provicedsAudioMessageRepositoryProvider = DoubleCheck.provider(MessagesModule_Companion_ProvicedsAudioMessageRepositoryFactory.create(this.provideUserSharedPreferencesProvider));
            this.bindsDecodedAudioMessagesRepositoryProvider = DoubleCheck.provider(MessagesModule_Companion_BindsDecodedAudioMessagesRepositoryFactory.create(this.provideUserSharedPreferencesProvider));
            ChatMessageMapHelperImpl_Factory create14 = ChatMessageMapHelperImpl_Factory.create(this.provideAuthDataStorageProvider, this.provideBotAudioMessageUrlGeneratorProvider, this.provideUserAudioMessageUrlGeneratorProvider, this.contextProvider);
            this.chatMessageMapHelperImplProvider = create14;
            this.bindsChatMessageMapHelperProvider = DoubleCheck.provider(create14);
            this.provideListenTagsUseCaseProvider = DoubleCheck.provider(MessagesModule_Companion_ProvideListenTagsUseCaseFactory.create(this.provideControllableMessagesSourceProvider, this.provideTagsStorageProvider, this.provideAuthDataStorageProvider));
            Provider<FirebaseApi> provider16 = DoubleCheck.provider(ApiModule_ProvideFirebaseApiFactory.create(apiModule, this.provideRetrofitProvider));
            this.provideFirebaseApiProvider = provider16;
            this.provideFirebaseProcessProvider = DoubleCheck.provider(ApiModule_ProvideFirebaseProcessFactory.create(apiModule, provider16, this.provideKeychainUserTokenStorageProvider, this.provideAppCoroutineScopeProvider, this.provideProdLoggerProvider));
            this.provideConfirmEmailFeatureToggleProvider = DoubleCheck.provider(SharedTogglesModule_ProvideConfirmEmailFeatureToggleFactory.create(sharedTogglesModule, this.bindsAppConfigLocalDataSourceProvider, this.provideAppCoroutineScopeProvider));
            this.provideAnimatedBackgroundFeatureToggleProvider = DoubleCheck.provider(SharedTogglesModule_ProvideAnimatedBackgroundFeatureToggleFactory.create(sharedTogglesModule, this.bindsAppConfigLocalDataSourceProvider, this.provideAppCoroutineScopeProvider));
            this.provideAnimatedAvatarOnChatToggleProvider = DoubleCheck.provider(SharedTogglesModule_ProvideAnimatedAvatarOnChatToggleFactory.create(sharedTogglesModule, this.bindsAppConfigLocalDataSourceProvider, this.provideAppCoroutineScopeProvider));
            this.provideRateAndReviewUsToggleProvider = DoubleCheck.provider(SharedTogglesModule_ProvideRateAndReviewUsToggleFactory.create(sharedTogglesModule, this.bindsAppConfigLocalDataSourceProvider, this.provideAppCoroutineScopeProvider));
            Provider<AnnalsTrackerApi> provider17 = DoubleCheck.provider(AnalyticsModule_ProvideAnnalsTrackerApiFactory.create(analyticsModule, this.provideRetrofitProvider));
            this.provideAnnalsTrackerApiProvider = provider17;
            this.provideAnnalsTrackerAnalyticsSenderProvider = DoubleCheck.provider(AnalyticsModule_ProvideAnnalsTrackerAnalyticsSenderFactory.create(analyticsModule, provider17, this.provideAuthDataStorageProvider, this.provideAppCoroutineScopeProvider, this.provideCoroutineDispatchersProvider, this.provideProdLoggerProvider));
            Provider<PushNotificationOpenedTrackerApi> provider18 = DoubleCheck.provider(AnalyticsModule_ProvidePushNotificationOpenedTrackerApiFactory.create(analyticsModule, this.provideRetrofitProvider));
            this.providePushNotificationOpenedTrackerApiProvider = provider18;
            this.providePushNotificationOpenedAnalyticsSenderProvider = DoubleCheck.provider(AnalyticsModule_ProvidePushNotificationOpenedAnalyticsSenderFactory.create(analyticsModule, provider18, this.provideAuthDataStorageProvider, this.provideAppCoroutineScopeProvider, this.provideCoroutineDispatchersProvider, this.provideProdLoggerProvider));
            this.provideAppsFlyerAnalyticsSenderProvider = DoubleCheck.provider(AnalyticsModule_ProvideAppsFlyerAnalyticsSenderFactory.create(analyticsModule, this.contextProvider));
            Provider<AnalyticsSender> provider19 = DoubleCheck.provider(AnalyticsModule_ProvideFirebaseAnalyticsSenderFactory.create(analyticsModule));
            this.provideFirebaseAnalyticsSenderProvider = provider19;
            this.analyticsEngineProvider = DoubleCheck.provider(AnalyticsModule_AnalyticsEngineFactory.create(analyticsModule, provider19, this.provideAppsFlyerAnalyticsSenderProvider, this.provideAnnalsTrackerAnalyticsSenderProvider, this.providePushNotificationOpenedAnalyticsSenderProvider));
            this.provideNeuronsFeatureToggleProvider = DoubleCheck.provider(SharedTogglesModule_ProvideNeuronsFeatureToggleFactory.create(sharedTogglesModule, this.provideTagsProvider, this.provideAppCoroutineScopeProvider));
            this.provideDeviceSharedPreferencesProvider = DoubleCheck.provider(PreferencesModule_ProvideDeviceSharedPreferencesFactory.create(preferencesModule, this.contextProvider));
        }

        private void initialize3(AppModule appModule, PremiumIconManagerModule premiumIconManagerModule, AnalyticUseCasesModule analyticUseCasesModule, BaseAppModule baseAppModule, ChangeUserModule changeUserModule, ChangeBotModule changeBotModule, CoreAuthModule coreAuthModule, LogsModule logsModule, PreferencesModule preferencesModule, RateUsModule rateUsModule, ConnectivityModule connectivityModule, ValidationModule validationModule, NavigationModule navigationModule, AnalyticsModule analyticsModule, DiaryModule diaryModule, LevelsModule levelsModule, ApiModule apiModule, InterceptorsModule interceptorsModule, DataDogModule dataDogModule, SharedTogglesModule sharedTogglesModule, InitialDataLoadersModule initialDataLoadersModule, GoogleServicesModule googleServicesModule, Context context) {
            Provider<AppInstallStorage> provider = DoubleCheck.provider(DataModule_Companion_AppInstallStorageFactory.create(this.provideDeviceSharedPreferencesProvider));
            this.appInstallStorageProvider = provider;
            this.provideAuthorizerProvider = DoubleCheck.provider(CoreAuthModule_ProvideAuthorizerFactory.create(coreAuthModule, this.provideRegistrationProcessProvider, this.provideAuthDataStorageProvider, provider, this.provideProdLoggerProvider));
            this.provideUserProfileRepositoryProvider = DoubleCheck.provider(DataModule_Companion_ProvideUserProfileRepositoryFactory.create(this.bindsDispatcherProvider, this.provideUserSharedPreferencesProvider, this.provideDataStoreProvider, this.bindsCoreExecuteCatchingProvider));
            OnboardingInteractor_Factory create = OnboardingInteractor_Factory.create(this.provideUserRepositoryProvider, this.provideBotRepositoryProvider, this.provideOnboardingAnswersRepositoryProvider);
            this.onboardingInteractorProvider = create;
            UpdateOnboardingUseCase_Factory create2 = UpdateOnboardingUseCase_Factory.create(this.provideUserProfileRepositoryProvider, create);
            this.updateOnboardingUseCaseProvider = create2;
            this.provideSignInUseCaseProvider = DoubleCheck.provider(CoreAuthModule_ProvideSignInUseCaseFactory.create(coreAuthModule, this.provideKeychainUserTokenStorageProvider, this.provideAuthorizerProvider, this.provideInitialDataLoaderProvider, create2));
            Provider<ConfirmEmailApi> provider2 = DoubleCheck.provider(CoreAuthModule_ProvideConfirmEmailApiFactory.create(coreAuthModule, this.provideRetrofitProvider));
            this.provideConfirmEmailApiProvider = provider2;
            this.provideConfirmEmailRepositoryProvider = DoubleCheck.provider(CoreAuthModule_ProvideConfirmEmailRepositoryFactory.create(coreAuthModule, provider2, this.provideAuthDataStorageProvider, this.provideAppInternalNotificationHandlerProvider));
            this.provideShowRateUsUseCaseProvider = DoubleCheck.provider(RateUsModule_ProvideShowRateUsUseCaseFactory.create(rateUsModule, this.provideRateUsStateStorageProvider, this.provideRateAppShowingPlannerProvider));
            this.provideSecurePreferencesProvider = DoubleCheck.provider(PreferencesModule_ProvideSecurePreferencesFactory.create(preferencesModule, this.contextProvider));
            this.provideOnUserRateUsUseCaseProvider = DoubleCheck.provider(RateUsModule_ProvideOnUserRateUsUseCaseFactory.create(rateUsModule, this.provideUserSharedPreferencesProvider));
            LongTermNotificationManagerImpl_Factory create3 = LongTermNotificationManagerImpl_Factory.create(this.contextProvider, this.provideAppCoroutineScopeProvider, this.provideControllableMessagesSourceProvider);
            this.longTermNotificationManagerImplProvider = create3;
            this.bindLongTermNotificationManagerProvider = DoubleCheck.provider(create3);
            this.provideShowInternetConnectionDialogsUseCaseProvider = DoubleCheck.provider(ConnectivityModule_ProvideShowInternetConnectionDialogsUseCaseFactory.create(connectivityModule, this.provideAppCoroutineScopeProvider, this.provideInternetConnectionProvider));
            this.provideValidateCredentialsUseCaseProvider = DoubleCheck.provider(ValidationModule_ProvideValidateCredentialsUseCaseFactory.create(validationModule));
            this.provideValidateNameUseCaseProvider = DoubleCheck.provider(ValidationModule_ProvideValidateNameUseCaseFactory.create(validationModule));
            AppConfigUseCase_Factory create4 = AppConfigUseCase_Factory.create(this.bindsAppConfigRepositoryProvider);
            this.appConfigUseCaseProvider = create4;
            this.provideValidateAgeUseCaseProvider = DoubleCheck.provider(ValidationModule_ProvideValidateAgeUseCaseFactory.create(validationModule, create4));
            this.provideEmailValidatorProvider = DoubleCheck.provider(ValidationModule_ProvideEmailValidatorFactory.create(validationModule, this.provideValidationApiProvider));
            Provider<OkHttpClient> provider3 = DoubleCheck.provider(ApiModule_ProvideHttpClientFactory.create(apiModule, this.contextProvider, this.provideProdLoggerProvider));
            this.provideHttpClientProvider = provider3;
            this.provideFileProvider = DoubleCheck.provider(DataModule_Companion_ProvideFileProviderFactory.create(this.contextProvider, provider3, this.provideProdLoggerProvider, this.provideCoroutineDispatchersProvider));
            this.provideAppCiceroneProvider = DoubleCheck.provider(NavigationModule_ProvideAppCiceroneFactory.create(navigationModule));
            this.provideCiceroneHolderProvider = DoubleCheck.provider(NavigationModule_ProvideCiceroneHolderFactory.create(navigationModule));
            Provider<AudioRecordingFileStorage> provider4 = DoubleCheck.provider(AudioRecordingModule_Companion_ProvideRecordedAudioFileStorageFactory.create(this.contextProvider));
            this.provideRecordedAudioFileStorageProvider = provider4;
            this.provideAudioRecorderProvider = DoubleCheck.provider(AudioRecordingModule_Companion_ProvideAudioRecorderFactory.create(this.contextProvider, provider4, this.provideProdLoggerProvider));
            OnboardingChatConfigsMemoryCachedSourceImpl_Factory create5 = OnboardingChatConfigsMemoryCachedSourceImpl_Factory.create(this.bindsDispatcherProvider, this.bindsCoreExecuteCatchingProvider, this.provideOnboardingApiProvider, this.bindsAuthLocalDataSourceProvider);
            this.onboardingChatConfigsMemoryCachedSourceImplProvider = create5;
            this.bindsOnboardingChatConfigsMemoryCachedSourceProvider = DoubleCheck.provider(create5);
            DeepLinksRepositoryImpl_Factory create6 = DeepLinksRepositoryImpl_Factory.create(DeepLinksParser_Factory.create());
            this.deepLinksRepositoryImplProvider = create6;
            this.bindsDeepLinksRepositoryProvider = DoubleCheck.provider(create6);
            UserGuideRepositoryImpl_Factory create7 = UserGuideRepositoryImpl_Factory.create(this.provideDataStoreProvider);
            this.userGuideRepositoryImplProvider = create7;
            this.bindExplanationRepositoryProvider = SingleCheck.provider(create7);
            ChatBackgroundRepositoryImpl_Factory create8 = ChatBackgroundRepositoryImpl_Factory.create(this.bindsCoreExecuteCatchingProvider, this.provideFileProvider, this.bindsConfigurationBotsMemoryCachedSourceProvider);
            this.chatBackgroundRepositoryImplProvider = create8;
            this.bindsChatBackgroundRepositoryProvider = DoubleCheck.provider(create8);
            ChatMessagesRemoteDataSource_Factory create9 = ChatMessagesRemoteDataSource_Factory.create(this.provideChatApiProvider, this.bindsAuthLocalDataSourceProvider);
            this.chatMessagesRemoteDataSourceProvider = create9;
            BuyChatMessagesRepositoryImpl_Factory create10 = BuyChatMessagesRepositoryImpl_Factory.create(create9, this.bindsCoreExecuteCatchingProvider);
            this.buyChatMessagesRepositoryImplProvider = create10;
            this.bindsBuyChatMessagesRepositoryProvider = SingleCheck.provider(create10);
            ChatIntroLocalDataSource_Factory create11 = ChatIntroLocalDataSource_Factory.create(this.provideDataStoreProvider);
            this.chatIntroLocalDataSourceProvider = create11;
            ChatIntroRepositoryImpl_Factory create12 = ChatIntroRepositoryImpl_Factory.create(create11, this.chatConfigurationsRemoteDataSourceProvider, this.bindsCoreExecuteCatchingProvider);
            this.chatIntroRepositoryImplProvider = create12;
            this.bindChatIntroRepositoryProvider = SingleCheck.provider(create12);
            FeatureToggleRepositoryImpl_Factory create13 = FeatureToggleRepositoryImpl_Factory.create(this.bindsAppConfigLocalDataSourceProvider, this.bindsDispatcherProvider);
            this.featureToggleRepositoryImplProvider = create13;
            this.bindsFeatureToggleRepositoryProvider = SingleCheck.provider(create13);
            Provider<Json> provider5 = DoubleCheck.provider(LocalDataModule_Companion_ProvideJsonFactory.create());
            this.provideJsonProvider = provider5;
            FeatureTogglePayloadsRepositoryImpl_Factory create14 = FeatureTogglePayloadsRepositoryImpl_Factory.create(this.bindsCoreExecuteCatchingProvider, provider5, this.bindsAppConfigLocalDataSourceProvider, FeatureToggleBotIdsMapper_Factory.create());
            this.featureTogglePayloadsRepositoryImplProvider = create14;
            this.bindsFeatureTogglePayloadsRepositoryProvider = SingleCheck.provider(create14);
            ChatSubscriptionRepositoryImpl_Factory create15 = ChatSubscriptionRepositoryImpl_Factory.create(this.bindsCoreExecuteCatchingProvider, this.chatsRemoteDataSourceProvider, ChatSubscriptionBenefitsMapper_Factory.create());
            this.chatSubscriptionRepositoryImplProvider = create15;
            this.bindsChatSubscriptionRepositoryProvider = DoubleCheck.provider(create15);
            this.provideUserProfileRepositoryProvider2 = SingleCheck.provider(CoreDataModule_Companion_ProvideUserProfileRepositoryFactory.create(this.provideUserSharedPreferencesProvider, this.bindsCoreExecuteCatchingProvider));
            this.bindsAppIdentityConverterProvider = SingleCheck.provider(AppIdentityConverterImpl_Factory.create());
            this.provideHttpLoggingInterceptorProvider = DoubleCheck.provider(InterceptorsModule_ProvideHttpLoggingInterceptorFactory.create(interceptorsModule));
            Provider<OkHttpClient> provider6 = DoubleCheck.provider(DataDogModule_ProvideDataDogHttpClientFactory.create(dataDogModule, DataDogAuthInterceptor_Factory.create(), this.provideHttpLoggingInterceptorProvider));
            this.provideDataDogHttpClientProvider = provider6;
            Provider<Retrofit> provider7 = DoubleCheck.provider(DataDogModule_ProvideDataDogRetrofitFactory.create(dataDogModule, provider6));
            this.provideDataDogRetrofitProvider = provider7;
            Provider<DataDogApiService> provider8 = DoubleCheck.provider(DataDogModule_ProvideDataDogApiServiceFactory.create(dataDogModule, provider7));
            this.provideDataDogApiServiceProvider = provider8;
            this.dataDogRepositoryProvider = DataDogRepository_Factory.create(provider8, this.bindsAuthLocalDataSourceProvider, this.bindsAppInfoProvider, this.provideGsonProvider, this.bindsDispatcherProvider);
            TimberLoggerRepository_Factory create16 = TimberLoggerRepository_Factory.create(this.provideGsonProvider, this.bindsDispatcherProvider);
            this.timberLoggerRepositoryProvider = create16;
            AppLoggerInteractorImpl_Factory create17 = AppLoggerInteractorImpl_Factory.create(this.provideAppCoroutineScopeProvider, this.dataDogRepositoryProvider, create16);
            this.appLoggerInteractorImplProvider = create17;
            this.bindsAppLoggerInteractorProvider = DoubleCheck.provider(create17);
            ResourceProviderImpl_Factory create18 = ResourceProviderImpl_Factory.create(this.contextProvider);
            this.resourceProviderImplProvider = create18;
            this.bindsResourceProvider = DoubleCheck.provider(create18);
            this.provideSpeechClientProvider = DoubleCheck.provider(PlatformToolsModule_Companion_ProvideSpeechClientFactory.create(this.contextProvider));
            PermissionProviderImpl_Factory create19 = PermissionProviderImpl_Factory.create(this.contextProvider);
            this.permissionProviderImplProvider = create19;
            this.bindsPermissionProvider = SingleCheck.provider(create19);
            BillingManagerImpl_Factory create20 = BillingManagerImpl_Factory.create(this.contextProvider, this.bindsAppLoggerInteractorProvider, this.provideAppCoroutineScopeProvider, BillingResponseCodeMapper_Factory.create());
            this.billingManagerImplProvider = create20;
            Provider<BillingManager> provider9 = DoubleCheck.provider(create20);
            this.bindsBillingManagerProvider = provider9;
            AppLaunchBillingFlowImpl_Factory create21 = AppLaunchBillingFlowImpl_Factory.create(provider9);
            this.appLaunchBillingFlowImplProvider = create21;
            this.bindsLaunchBillingFlowProvider = SingleCheck.provider(create21);
            Provider<AppBillingApiService> provider10 = DoubleCheck.provider(ApiModule_ProvideAppBillingApiServiceFactory.create(apiModule, this.provideAppRetrofitProvider));
            this.provideAppBillingApiServiceProvider = provider10;
            BillingRemoteDataSource_Factory create22 = BillingRemoteDataSource_Factory.create(provider10, this.bindsAuthLocalDataSourceProvider);
            this.billingRemoteDataSourceProvider = create22;
            BillingRepositoryImpl_Factory create23 = BillingRepositoryImpl_Factory.create(create22, this.bindsDispatcherProvider, this.bindsBillingManagerProvider, BillingProductMapper_Factory.create(), this.provideGsonProvider);
            this.billingRepositoryImplProvider = create23;
            Provider<BillingRepository> provider11 = SingleCheck.provider(create23);
            this.bindsBillingRepositoryProvider = provider11;
            BillingInteractorImpl_Factory create24 = BillingInteractorImpl_Factory.create(this.bindsBillingManagerProvider, provider11, this.bindsAppLoggerInteractorProvider);
            this.billingInteractorImplProvider = create24;
            this.bindsBillingInteractorProvider = SingleCheck.provider(create24);
            ChatVideoBackgroundFeatureToggleImpl_Factory create25 = ChatVideoBackgroundFeatureToggleImpl_Factory.create(this.bindsAppConfigLocalDataSourceProvider, this.provideAppCoroutineScopeProvider);
            this.chatVideoBackgroundFeatureToggleImplProvider = create25;
            this.bindsChatVideoBackgroundFeatureToggleProvider = DoubleCheck.provider(create25);
            this.provideAppUpdateManagerProvider = SingleCheck.provider(GoogleServicesModule_ProvideAppUpdateManagerFactory.create(googleServicesModule, this.contextProvider));
            this.provideStartRegistrationUseCaseProvider = AppModule_ProvideStartRegistrationUseCaseFactory.create(appModule);
            this.provideAnalyticsAppOpenUpUseCaseProvider = AnalyticUseCasesModule_ProvideAnalyticsAppOpenUpUseCaseFactory.create(analyticUseCasesModule, this.provideFirebaseAnalyticsSenderProvider, this.provideAppsFlyerAnalyticsSenderProvider);
            this.provideAnalyticsSetUserIdUseCaseProvider = AnalyticUseCasesModule_ProvideAnalyticsSetUserIdUseCaseFactory.create(analyticUseCasesModule, this.provideFirebaseAnalyticsSenderProvider, this.provideAppsFlyerAnalyticsSenderProvider);
            this.provideAnalyticsFirstAppOpenUpUseCaseProvider = AnalyticUseCasesModule_ProvideAnalyticsFirstAppOpenUpUseCaseFactory.create(analyticUseCasesModule, this.provideFirebaseAnalyticsSenderProvider);
            this.provideAnalyticsNotificationAppOpenedUseCaseProvider = AnalyticUseCasesModule_ProvideAnalyticsNotificationAppOpenedUseCaseFactory.create(analyticUseCasesModule, this.bindsAppIdentityConverterProvider, this.provideAnnalsTrackerAnalyticsSenderProvider, this.providePushNotificationOpenedAnalyticsSenderProvider);
            this.splashViewModelProvider = SplashViewModel_Factory.create(this.provideSignInUseCaseProvider, this.provideStartRegistrationUseCaseProvider, AppActivityScreenFactoryImpl_Factory.create(), this.provideConfirmEmailRepositoryProvider, this.provideAppCoroutineScopeProvider, this.provideAnalyticsAppOpenUpUseCaseProvider, this.provideAnalyticsSetUserIdUseCaseProvider, this.provideAnalyticsFirstAppOpenUpUseCaseProvider, this.provideAnalyticsNotificationAppOpenedUseCaseProvider, this.provideCoroutineDispatchersProvider, this.bindsChatsInfoConfigurationRepositoryProvider);
            this.provideAvatarInPushToggleProvider = DoubleCheck.provider(SharedTogglesModule_ProvideAvatarInPushToggleFactory.create(sharedTogglesModule, this.bindsAppConfigLocalDataSourceProvider, this.provideAppCoroutineScopeProvider, this.provideDeviceByUserSharedPreferencesProvider));
            this.provideAvatarInRetentionPushToggleProvider = DoubleCheck.provider(SharedTogglesModule_ProvideAvatarInRetentionPushToggleFactory.create(sharedTogglesModule, this.bindsAppConfigLocalDataSourceProvider, this.provideAppCoroutineScopeProvider, this.provideDeviceByUserSharedPreferencesProvider));
        }

        @Override // com.ifriend.base.di.BaseComponent
        public String provideApiUrl() {
            return this.apiUrlProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public Logger provideLogger() {
            return this.provideProdLoggerProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public Gson provideGson() {
            return this.provideGsonProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public InternalNotificationHandlersRegister provideInternalNotificationHandlersRegister() {
            return this.provideAppInternalNotificationHandlerProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public InternalNotificationHandler provideInternalNotificationHandler() {
            return this.provideAppInternalNotificationHandlerProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public InternalNotificationsQueue provideInternalNotificationsQueue() {
            return this.provideAppInternalNotificationHandlerProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AppNotifier provideAppNotifier() {
            return this.provideAppNotifierProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public PopupFragmentFactory popupFragmentFactory() {
            return new PopupFragmentFactoryImpl();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public PopupModelFactory popupModelFactory() {
            return new PopupModelFactoryImpl();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public RateUsStateStorage provideRateUsStateStorage() {
            return this.provideRateUsStateStorageProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public RateAppShowingPlanner provideRateAppShowingPlanner() {
            return this.provideRateAppShowingPlannerProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public UserAudioMessageUrlGenerator provideUserAudioMessageUrlGenerator() {
            return this.provideUserAudioMessageUrlGeneratorProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AvatarAnimationEnabledStorage provideAvatarAnimationEnabledStorage() {
            return this.provideAvatarAnimationEnabledStorageProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public NeuronsCostsStorage provideNeuronsCostsStorage() {
            return this.provideNeuronsCostsStorageProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public TagsProvider provideTagsProvider() {
            return this.provideTagsProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public UserSubscriptionsBroadcast provideUserSubscriptionsBroadcast() {
            return this.provideUserSubscriptionsBroadcastProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public IsChatImageAllowedBroadcast provideIsChatImageAllowedBroadcast() {
            return this.provideIsImageAllowedBroadcastProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AuthDataStorage provideAuthDataStorage() {
            return this.provideAuthDataStorageProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AuthDataProvider provideAuthDataProvider() {
            return this.provideAuthDataStorageProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public UserRepository provideUserRepository() {
            return this.provideUserRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public BotRepository provideBotRepository() {
            return this.provideBotRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public DiaryRepository provideDiaryRepository() {
            return this.provideDiaryRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public DiaryNoteReplier provideDiaryNoteReplier() {
            return this.provideDiaryNoteReplierProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public LevelsRepository provideLevelsRepository() {
            return this.provideLevelsRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public OnboardingAnswersRepository provideOnboardingAnswersRepository() {
            return this.provideOnboardingAnswersRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public DiaryNotesService provideDiaryNotesService() {
            return this.provideGetDiaryNotesUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public GenerateBotAvatarRepository provideGenerateBotAvatarRepository() {
            return this.provideGenerateBotAvatarRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChatNotificationsRepository provideChatNotificationsRepository() {
            return this.bindsChatNotificationRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public InAppUpdateRepository provideInAppUpdateRepository() {
            return this.bindInAppUpdateRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AvatarsStorage avatarsStorage() {
            return this.provideAvatarsStorageProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public GenerateBotAvatarApi provideGenerateBotAvatarApi() {
            return this.provideGenerateBotAvatarApiProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AvatarGenerationStatusStorage provideAvatarGenerationStatusStorage() {
            return this.provideAvatarGenerationStatusStorageProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AvatarInfoStorage provideAvatarInfoStorage() {
            return this.provideAvatarInfoStorageProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public InitialDataLoader provideInitialDataLoader() {
            return this.provideInitialDataLoaderProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public UserOffersRepository provideUserOffersRepository() {
            return this.bindUserOffersRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public TagsApi provideTagsApi() {
            return this.provideTagsApiProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ValidationApi provideValidationApi() {
            return this.provideValidationApiProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public RegistrationApi provideRegistrationApi() {
            return this.provideRegistrationApiProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChatsInfoApi provideUserChatApi() {
            return this.provideChatsInfoApiProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChatGiftsApi provideChatGiftsApi() {
            return this.provideChatGiftsApiProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChatMessagesApi provideChatApi() {
            return this.provideChatApiProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChatsApi provideChatsApi() {
            return this.provideChatsApiProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public TopicsApi provideTopicsApi() {
            return this.provideTopicsApiProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public UserApiService provideUserApiService() {
            return this.provideUserApiServiceProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public CallsApiService provideCallsApiService() {
            return this.provideCallApiServiceProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public RegistrationApiDelegate provideRegistrationProcess() {
            return this.provideRegistrationProcessProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ResetPasswordRepository provideResetPasswordRepository() {
            return this.provideResetPasswordRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public RateUsRepository provideRateUsRepository() {
            return this.provideRateUsRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public Context provideContext() {
            return this.context;
        }

        @Override // com.ifriend.base.di.BaseComponent
        public Retrofit provideRetrofit() {
            return this.provideRetrofitProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public EventDelayStorage provideEventDelayStorage() {
            return this.provideEventDelayStorageProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public GetUserUseCase provideGetUserUseCase() {
            return this.provideGetUserUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChangeUserAgeUseCase provideChangeUserAgeUseCase() {
            return this.provideSetUserAgeUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChangeUserNameUseCase provideChangeUserNameUseCase() {
            return this.provideSetUserNameUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChangeUserGenderUseCase provideChangeUserGenderUseCase() {
            return this.provideSetUserGenderUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public GetBotUseCase provideGetBotUseCase() {
            return this.provideGetBotUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChangeBotNameUseCase provideChangeBotNameUseCase() {
            return new ChangeBotNameUseCase(this.provideBotRepositoryProvider.get(), this.provideUserRepositoryProvider.get(), this.bindsChatsInfoRepositoryProvider.get());
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChangeBotGenderUseCase provideChangeBotGenderUseCase() {
            return this.provideChangeBotGenderUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChangeBotAgeUseCase provideChangeBotAgeUseCase() {
            return this.provideChangeBotAgeUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChangeBotEthnicityUseCase provideChangeBotEthnicityUseCase() {
            return this.provideChangeBotEthnicityUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChangeBotPersonalityUseCase provideChangeBotPersonalityUseCase() {
            return this.provideChangeBotPersonalityUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChangeBotVoiceUseCase provideChangeBotVoiceUseCase() {
            return this.provideChangeBotVoiceUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public GetDiaryNotesListUseCase provideGetDiaryNotesUseCase() {
            return this.provideGetDiaryNotesListUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ReplyDiaryNoteUseCase provideReplyDiaryNoteUseCase() {
            return this.provideReplyDiaryNoteUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public RefreshDiaryUseCase provideRefreshDiaryUseCase() {
            return this.provideRefreshDiaryUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public OnDiaryShownUseCase provideOnDiaryShownUseCase() {
            return this.provideOnDiaryShownUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public GetLevelInfoUseCase provideLevelsInfoUseCase() {
            return this.provideGetLevelsListUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public SocketShardsApi provideShardsApi() {
            return this.provideShardsApiProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public SocketUrlProvider provideUrlProvider() {
            return this.provideUrlProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public MessagesSource provideMessagesSource() {
            return this.provideControllableMessagesSourceProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public LiveChatMessagesFlow provideLiveChatMessagesFlow() {
            return this.bindsChatMessagesFlowProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public SocketMessageToMessagesSourceMessageMapper provideSocketMessageToMessagesSourceMessageMapper() {
            return this.provideSocketMessageToMessagesSourceMapperProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public BotAudioMessageUrlGenerator provideAudioMessageUrlGenerator() {
            return this.provideBotAudioMessageUrlGeneratorProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public MediaPlayerPlaybackControllerGenerator provideMediaPlayerPlaybackControllerGenerator() {
            return this.provideMediaPlayerPlaybackControllerGeneratorProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public DefaultLifecycleObserver provideMessageSourceLifecycleController() {
            return this.provideMessagesSourceLifecycleControllerProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AudioMessageRepository provideAudioMessageRepository() {
            return this.provicedsAudioMessageRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public DecodedAudioMessagesRepository provideDecodedAudioMessagesRepository() {
            return this.bindsDecodedAudioMessagesRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChatMessageMapHelper provideChatMessageMapHelper() {
            return this.bindsChatMessageMapHelperProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ListenTagsUseCase provideListenTagsUseCase() {
            return this.provideListenTagsUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public FirebaseApiRepository provideFirebaseProcess() {
            return this.provideFirebaseProcessProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public UserTokenProvider provideTokenProvider() {
            return this.provideKeychainUserTokenStorageProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public UserTokenStorage provideTokenStorage() {
            return this.provideKeychainUserTokenStorageProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public KeychainUserTokenStorage provideKeychainUserTokenStorage() {
            return this.provideKeychainUserTokenStorageProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChatGiftsRepository provideChatGiftsRepository() {
            return this.provideChatGiftsRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ConfirmEmailFeatureToggle provideConfirmEmailFeatureToggle() {
            return this.provideConfirmEmailFeatureToggleProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AnimatedBackgroundFeatureToggle provideAnimatedBackgroundFeatureToggle() {
            return this.provideAnimatedBackgroundFeatureToggleProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AnimatedAvatarOnChatToggle provideAnimatedAvatarOnChatToggle() {
            return this.provideAnimatedAvatarOnChatToggleProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AnimatedAvatarFeatureToggle provideAnimatedAvatarFeatureToggle() {
            return this.provideAnimatedAvatarFeatureToggleProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AvatarGenerationFreeToggle provideAvatarGenerationFreeToggle() {
            return this.provideAvatarGenerationFreeToggleProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public RateAndReviewUsToggle provideRateAndReviewUsToggle() {
            return this.provideRateAndReviewUsToggleProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AnalyticsSender provideAnnalsTrackerAnalyticsSender() {
            return this.provideAnnalsTrackerAnalyticsSenderProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AnalyticsSender providePushNotificationOpenedAnalyticsSender() {
            return this.providePushNotificationOpenedAnalyticsSenderProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AnalyticsSender provideAppsFlyerAnalyticsSender() {
            return this.provideAppsFlyerAnalyticsSenderProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AnalyticsSender provideFirebaseAnalyticsSender() {
            return this.provideFirebaseAnalyticsSenderProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AnnalsTrackerApi provideAnnalsTrackerApi() {
            return this.provideAnnalsTrackerApiProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public PushNotificationOpenedTrackerApi providePushNotificationOpenedTrackerApi() {
            return this.providePushNotificationOpenedTrackerApiProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AnalyticsEngine analyticsEngine() {
            return this.analyticsEngineProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public FeatureToggle provideNeuronsFeatureToggle() {
            return this.provideNeuronsFeatureToggleProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public Authorizer provideAuthorizer() {
            return this.provideAuthorizerProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public SignInWithTokenUseCase provideSignInUseCase() {
            return this.provideSignInUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ConfirmEmailRepository provideConfirmEmailRepository() {
            return this.provideConfirmEmailRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public SendConfirmationEmailUseCase provideSendConfirmationEmailUseCase() {
            return new SendConfirmationEmailUseCase(this.provideConfirmEmailRepositoryProvider.get(), this.provideTagsProvider.get(), this.bindsAppConfigRepositoryProvider.get(), this.provideUserRepositoryProvider.get());
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ShowRateUsUseCase provideShowRateUsUseCase() {
            return this.provideShowRateUsUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public com.ifriend.domain.data.Preferences provideUserSessionSharedPreferences() {
            return this.provideUserSharedPreferencesProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public com.ifriend.domain.data.Preferences provideDevicePreferences() {
            return this.provideDeviceSharedPreferencesProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public com.ifriend.domain.data.Preferences provideUserSharedPreferences() {
            return this.provideDeviceByUserSharedPreferencesProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AppInstallStorage provideAppInstallStorage() {
            return this.appInstallStorageProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public SecurePreferencesService provideSecurePreferences() {
            return this.provideSecurePreferencesProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public OnUserRatedAppUseCase provideOnUserRateUsUseCase() {
            return this.provideOnUserRateUsUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public LongTermNotificationManager provideLongTermNotificationManager() {
            return this.bindLongTermNotificationManagerProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public LongTermNotificationByTypeOfPushHandler provideLongTermNotificationByTypeOfPushHandler() {
            return longTermNotificationByTypeOfPushHandlerImpl();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public Set<LongTermNotificationByPushCreator> provideLongTermNotificationByPushCreator() {
            return ImmutableSet.of(avatarGeneratedLongTermCreator());
        }

        @Override // com.ifriend.base.di.BaseComponent
        public InternetConnection provideInternetConnection() {
            return this.provideInternetConnectionProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public InternetConnectionDialogsManager provideInternetConnectionDialogsManager() {
            return this.provideShowInternetConnectionDialogsUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ValidateCredentialsUseCase provideValidateCredentialsUseCase() {
            return this.provideValidateCredentialsUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ValidateNameUseCase provideValidateNameUseCase() {
            return this.provideValidateNameUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ValidateAgeUseCase provideValidateAgeUseCase() {
            return this.provideValidateAgeUseCaseProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public EmailValidator provideEmailValidator() {
            return this.provideEmailValidatorProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public CoroutineDispatchers provideCoroutineDispatchers() {
            return this.provideCoroutineDispatchersProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public CoroutineScope provideCoroutineScope() {
            return this.provideAppCoroutineScopeProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public FileProvider provideFileProvider() {
            return this.provideFileProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public Cicerone<AppRouter> appCicerone() {
            return this.provideAppCiceroneProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public CiceroneHolder ciceroneHolder() {
            return this.provideCiceroneHolderProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public RouterProvider routerProvider() {
            return this.provideRouterProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AudioRecorderController provideAudioRecorderController() {
            return this.provideAudioRecorderProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AudioRecordingStateProvider provideAudioRecordingStateProvider() {
            return this.provideAudioRecorderProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AppActivityScreenFactory appActivityScreenFactory() {
            return new AppActivityScreenFactoryImpl();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChatScreenFactory chatScreenFactory() {
            return new ChatScreenFactoryImpl();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ImageLoader provideAppImageLoader() {
            return this.provideAppImageLoaderProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChatConfigsMemoryCachedSource provideConfigurationBotsMemoryCachedSource() {
            return this.bindsConfigurationBotsMemoryCachedSourceProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public OnboardingChatConfigsMemoryCachedSource provideOnboardingChatConfigsMemoryCachedSource() {
            return this.bindsOnboardingChatConfigsMemoryCachedSourceProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AppImageLoaderRepository provideAppImageLoaderRepository() {
            return this.provideAppImageLoaderRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public DeepLinksRepository provideDeepLinksRepository() {
            return this.bindsDeepLinksRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AppConfigRepository provideAppConfigRepository() {
            return this.bindsAppConfigRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AppConfigLocalDataSource provideAppConfigLocalDataSource() {
            return this.bindsAppConfigLocalDataSourceProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public UserProfileRepository provideUserConfigRepository() {
            return this.provideUserProfileRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public UserGuideRepository provideFeatureExplanationRepo() {
            return this.bindExplanationRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChatBackgroundRepository provideChatBackgroundRepository() {
            return this.bindsChatBackgroundRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChatsInfoConfigurationRepository provideChatsInfoConfigurationRepository() {
            return this.bindsChatsInfoConfigurationRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public BuyChatMessagesRepository provideBuyChatMessagesRepository() {
            return this.bindsBuyChatMessagesRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChatsInfoRepository provideChatsInfoRepository() {
            return this.bindsChatsInfoRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChatIntroRepository provideChatIntroRepository() {
            return this.bindChatIntroRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public FeatureToggleRepository provideFeatureToggleRepository() {
            return this.bindsFeatureToggleRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public FeatureTogglePayloadsRepository provideFeatureTogglePayloadsRepository() {
            return this.bindsFeatureTogglePayloadsRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChatSubscriptionRepository provideChatSubscriptionRepository() {
            return this.bindsChatSubscriptionRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChatsRepository provideChatsRepository() {
            return this.bindsChatsRepositoryProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public BillingPurchasesHistory provideBillingPurchasesHistory() {
            return this.provideUserProfileRepositoryProvider2.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AppConfigStorage getAppConfigStorage() {
            return this.provideAppConfigStorageProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public MainBotLocalDataSource provideMainBotLocalDataSource() {
            return this.bindsMainBotLocalDataSourceProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AuthLocalDataSource provideAuthLocalDataSource() {
            return this.bindsAuthLocalDataSourceProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public CoreExecuteCatching provideCoreExecuteCatching() {
            return this.bindsCoreExecuteCatchingProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public DispatcherProvider provideDispatcherProvider() {
            return this.bindsDispatcherProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AppIdentityConverter provideAppIdentityConverter() {
            return this.bindsAppIdentityConverterProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AppLoggerInteractor provideAppLoggerInteractor() {
            return this.bindsAppLoggerInteractorProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ResourceProvider provideResourceProvider() {
            return this.bindsResourceProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public TextToSpeechStream provideTextToSpeechStream() {
            return textToSpeechStreamImpl();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public VoiceRecognitionStreaming provideVoiceRecognitionStreaming() {
            return voiceRecognitionStreamingImpl();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public PermissionProvider providePermissionProvider() {
            return this.bindsPermissionProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AppInfoProvider provideAppInfoProvider() {
            return this.bindsAppInfoProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AppLaunchBillingFlow provideAppLaunchBillingFlow() {
            return this.bindsLaunchBillingFlowProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public BillingInteractor provideBillingInteractor() {
            return this.bindsBillingInteractorProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public ChatVideoBackgroundFeatureToggle provideChatVideoBackgroundFeatureToggle() {
            return this.bindsChatVideoBackgroundFeatureToggleProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AnalyticsInteractor provideAnalyticsInteractor() {
            return this.provideAnalyticsInteractorProvider.get();
        }

        @Override // com.ifriend.base.di.BaseComponent
        public AppUpdateManager provideAppUpdateManager() {
            return this.provideAppUpdateManagerProvider.get();
        }

        @Override // com.ifriend.app.di.AppComponent
        public PremiumIconDisabler getPremiumIconDisabler() {
            return AppModule_ProvidePremiumIconDisablerFactory.providePremiumIconDisabler(this.appModule, this.provideGetUserUseCaseProvider.get(), premiumAppIconManager(), this.provideAppCoroutineScopeProvider.get());
        }

        @Override // com.ifriend.app.di.AppComponent
        public void inject(SplashActivity splashActivity) {
            injectSplashActivity(splashActivity);
        }

        @Override // com.ifriend.app.di.AppComponent
        public void inject(AppFirebaseMessagingService appFirebaseMessagingService) {
            injectAppFirebaseMessagingService(appFirebaseMessagingService);
        }

        @Override // com.ifriend.app.di.AppComponent
        public void inject(App app) {
            injectApp(app);
        }

        private SplashActivity injectSplashActivity(SplashActivity splashActivity) {
            BaseActivity_MembersInjector.injectNoInternetPopupDelegate(splashActivity, noInternetPopupDelegate());
            BaseActivity_MembersInjector.injectInternetConnectionDialogsManager(splashActivity, this.provideShowInternetConnectionDialogsUseCaseProvider.get());
            SplashActivity_MembersInjector.injectViewModelFactory(splashActivity, viewModelFactory());
            SplashActivity_MembersInjector.injectPremiumAppIconManager(splashActivity, premiumAppIconManager());
            return splashActivity;
        }

        private AppFirebaseMessagingService injectAppFirebaseMessagingService(AppFirebaseMessagingService appFirebaseMessagingService) {
            AppFirebaseMessagingService_MembersInjector.injectAnalyticsNotificationReceivedUseCase(appFirebaseMessagingService, analyticsNotificationReceivedUseCase());
            AppFirebaseMessagingService_MembersInjector.injectPreferences(appFirebaseMessagingService, this.provideUserSharedPreferencesProvider.get());
            AppFirebaseMessagingService_MembersInjector.injectLongTermNotificationHandler(appFirebaseMessagingService, longTermNotificationByTypeOfPushHandlerImpl());
            AppFirebaseMessagingService_MembersInjector.injectCoroutineScope(appFirebaseMessagingService, this.provideAppCoroutineScopeProvider.get());
            AppFirebaseMessagingService_MembersInjector.injectAvatarsStorage(appFirebaseMessagingService, this.provideAvatarsStorageProvider.get());
            AppFirebaseMessagingService_MembersInjector.injectCoroutineDispatchers(appFirebaseMessagingService, this.provideCoroutineDispatchersProvider.get());
            AppFirebaseMessagingService_MembersInjector.injectAvatarInPushToggle(appFirebaseMessagingService, this.provideAvatarInPushToggleProvider.get());
            AppFirebaseMessagingService_MembersInjector.injectAvatarInRetentionPushToggle(appFirebaseMessagingService, this.provideAvatarInRetentionPushToggleProvider.get());
            AppFirebaseMessagingService_MembersInjector.injectChatsInfoConfigurationRepository(appFirebaseMessagingService, this.bindsChatsInfoConfigurationRepositoryProvider.get());
            return appFirebaseMessagingService;
        }

        private App injectApp(App app) {
            App_MembersInjector.injectAppNotifier(app, this.provideAppNotifierProvider.get());
            App_MembersInjector.injectAvatarInRetentionPushToggle(app, this.provideAvatarInRetentionPushToggleProvider.get());
            App_MembersInjector.injectAvatarInPushToggle(app, this.provideAvatarInPushToggleProvider.get());
            App_MembersInjector.injectAnalyticsEngine(app, this.analyticsEngineProvider.get());
            App_MembersInjector.injectInternetConnection(app, this.provideInternetConnectionProvider.get());
            App_MembersInjector.injectAppsflyerDeepLinksManager(app, appsflyerDeepLinksManager());
            return app;
        }
    }
}
