package com.ifriend.chat.presentation.di;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModel;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.common.collect.ImmutableMap;
import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.analytics.di.AnalyticUseCasesModule;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsAudioAiClickPlayUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsAudioAiCompletedUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsAudioAiConvertToTextMessageUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsAudioAiConvertToTextModalUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsAudioAiPauseUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsAudioAiShowModalUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsAudioAiStartPlayingUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsAvatarAiApplyUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsCheckMyInboxClickedUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsEditBotUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsEmailChangedUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsNotificationPermissionChangedUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsOpenSubscriptionScreenUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsRateUsModalUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideAnalyticsReviewUsModalUseCaseFactory;
import com.ifriend.analytics.di.AnalyticUseCasesModule_ProvideChatScreenAnalyticsUseCaseFactory;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickConvertToTextMessageUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickConvertToTextModalUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickPlayUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiCompletedUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiPauseUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiShowModalUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiStartPlayingUseCase;
import com.ifriend.analytics.usecase.avatarAi.AnalyticsAvatarAiApplyUseCase;
import com.ifriend.analytics.usecase.botData.AnalyticsEditBotUseCase;
import com.ifriend.analytics.usecase.chat.ChatScreenAnalyticsUseCase;
import com.ifriend.analytics.usecase.confirmEmail.AnalyticsCheckMyInboxClickedUseCase;
import com.ifriend.analytics.usecase.confirmEmail.AnalyticsEmailChangedUseCase;
import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationPermissionChangedUseCase;
import com.ifriend.analytics.usecase.rateUs.AnalyticsRateUsModalUseCase;
import com.ifriend.analytics.usecase.rateUs.AnalyticsReviewUsModalUseCase;
import com.ifriend.analytics.usecase.screen.AnalyticsOpenSubscriptionScreenUseCase;
import com.ifriend.base.app.activity.FlowFragment_MembersInjector;
import com.ifriend.base.di.BaseComponent;
import com.ifriend.base.navigation.api.CiceroneHolder;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.base.navigation.api.cicerone.Cicerone;
import com.ifriend.billing.api.logic.AppLaunchBillingFlow;
import com.ifriend.billing.api.logic.BillingInteractor;
import com.ifriend.chat.api.ChatScreenFactory;
import com.ifriend.chat.data.UserApi;
import com.ifriend.chat.data.chat.sending.ChatMessagesRepositoryImpl;
import com.ifriend.chat.data.chat.sending.ChatMessagesRepositoryImpl_Factory;
import com.ifriend.chat.data.chat.sending.queue.MessageToSendToQueuedMessageMapper;
import com.ifriend.chat.data.chat.sending.queue.MessageToSendToQueuedMessageMapper_Factory;
import com.ifriend.chat.data.chat.sending.queue.SendingMessagesQueueImpl;
import com.ifriend.chat.data.chat.sending.queue.SendingMessagesQueueImpl_Factory;
import com.ifriend.chat.domain.AuthInteractor;
import com.ifriend.chat.domain.avatarGeneration.OpenGenerateBotAvatarUseCase;
import com.ifriend.chat.domain.billing.ShowRateAppAfterPurchaseUseCase;
import com.ifriend.chat.domain.chat.ShouldReloadMessagesUseCase;
import com.ifriend.chat.domain.chat.reset.ResetAiUseCase;
import com.ifriend.chat.domain.data.ChatProcess;
import com.ifriend.chat.domain.data.ResetAiApiDelegate;
import com.ifriend.chat.domain.firebase.ClearBadgesUseCase;
import com.ifriend.chat.domain.firebase.FirebaseSubscribeUseCase;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.chat.domain.profile.user.DeleteUserUseCase;
import com.ifriend.chat.domain.profile.user.benefits.GetAllPremiumBenefitsUseCase;
import com.ifriend.chat.domain.profile.user.benefits.GetAllPremiumBenefitsUseCase_Factory;
import com.ifriend.chat.new_chat.di.ChatEventsObserverModule;
import com.ifriend.chat.new_chat.di.ChatEventsObserverModule_ProvideChatEventsEmitterFactory;
import com.ifriend.chat.new_chat.di.ChatEventsObserverModule_ProvideChatEventsFlowFactory;
import com.ifriend.chat.new_chat.di.ChatEventsObserverModule_ProvideChatEventsObserverFactory;
import com.ifriend.chat.new_chat.di.ChatScreenModule_Companion_AudioAudioPlayerSettingsFactory;
import com.ifriend.chat.new_chat.di.ChatScreenModule_Companion_AudioPlayerFactory;
import com.ifriend.chat.new_chat.di.SextingRequestModule_Companion_ProvideSextingRequestApiFactory;
import com.ifriend.chat.new_chat.list.ChatListFragment;
import com.ifriend.chat.new_chat.list.ChatListFragment_MembersInjector;
import com.ifriend.chat.new_chat.list.delegate.OnAudioMessageClickDelegate;
import com.ifriend.chat.new_chat.list.delegate.PresentationChatSystemsDelegate;
import com.ifriend.chat.new_chat.list.delegate.providers.PresentationChatSystemsProvider;
import com.ifriend.chat.new_chat.list.imageLoader.ImageLoader;
import com.ifriend.chat.new_chat.list.imageLoader.ImageLoaderImpl;
import com.ifriend.chat.new_chat.list.imageLoader.ImageLoaderImpl_Factory;
import com.ifriend.chat.new_chat.list.mapper.ChatEntityToAudioUiModelMapper;
import com.ifriend.chat.new_chat.list.mapper.ChatEntityToDateUiModelMapper;
import com.ifriend.chat.new_chat.list.mapper.ChatEntityToGiftUiModelMapper;
import com.ifriend.chat.new_chat.list.mapper.ChatEntityToProcessingUiModelMapper;
import com.ifriend.chat.new_chat.list.mapper.ChatEntityToTextUiModelMapper;
import com.ifriend.chat.new_chat.list.mapper.ChatEntityToTopicSeparatorUiModelMapper;
import com.ifriend.chat.new_chat.list.mapper.ChatEntityToUiModelMapper;
import com.ifriend.chat.new_chat.list.mapper.ChatPhotoMessageMapper;
import com.ifriend.chat.new_chat.list.player.AudioMessageChatAnalytics;
import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.chat.new_chat.list.player.AudioPlayerSettings;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.changeVoice.ChangeVoiceSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.changeVoice.ChatAudioMessageFacade;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.decode.DecodingAudioEventsHandlingSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.decode.DecodingAudioInitialStateSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.playback.AudioPlaybackSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.image.ImagesLockerSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.image.ImagesLockerSystem_Factory;
import com.ifriend.chat.new_chat.list.presentationSystems.levels.ExperienceMessageAnimationSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.newMessagesAnimation.LiveMessagesAnimationSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.scroll.ScrollControllingSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.ChatHistory;
import com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.SextingRequestApi;
import com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.SextingRequestor;
import com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.SextingRequestor_Factory;
import com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.ShowSextingRequestSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.ShowSextingRequestSystem_Factory;
import com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.UserPreferencesChatHistory;
import com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.UserPreferencesChatHistory_Factory;
import com.ifriend.chat.new_chat.list.viewModel.analytics.ChatListAnalytics;
import com.ifriend.chat.new_chat.list.viewModel.factory.ChatViewModelFactory;
import com.ifriend.chat.presentation.di.ChatComponent;
import com.ifriend.chat.presentation.di.chat.ChatDomainModule_Companion_ProvideChatCoroutineScopeFactory;
import com.ifriend.chat.presentation.di.chat.ChatDomainModule_Companion_ProvideChatSystemsFactoryFactory;
import com.ifriend.chat.presentation.di.chat.SendingMessagesModule_Companion_ProvideGlobalSendingMessageResultPublisherFactory;
import com.ifriend.chat.presentation.di.chat.SendingMessagesModule_Companion_ProvideQueuedMessageToEntityMapperFactory;
import com.ifriend.chat.presentation.di.onboarding.OnboardingModule_Companion_ProvideInfoOnboardingRepositoryFactory;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.chat.presentation.ui.AppActivity_MembersInjector;
import com.ifriend.chat.presentation.ui.avatarGeneration.GenerateBotAvatarErrorFragment;
import com.ifriend.chat.presentation.ui.avatarGeneration.GenerateBotAvatarErrorFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.avatarGeneration.GenerateBotAvatarErrorViewModel;
import com.ifriend.chat.presentation.ui.avatarGeneration.GenerateBotAvatarErrorViewModel_Factory;
import com.ifriend.chat.presentation.ui.avatarGeneration.GeneratingBotAvatarPlaceholderFragment;
import com.ifriend.chat.presentation.ui.avatarGeneration.GeneratingBotAvatarPlaceholderFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.avatarGeneration.GeneratingBotAvatarPlaceholderViewModel;
import com.ifriend.chat.presentation.ui.avatarGeneration.GeneratingBotAvatarPlaceholderViewModel_Factory;
import com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarFragment;
import com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarViewModel;
import com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarViewModel_Factory;
import com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar.GenerateBotAvatarFragment;
import com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar.GenerateBotAvatarFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar.GenerateBotAvatarViewModel;
import com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar.GenerateBotAvatarViewModel_Factory;
import com.ifriend.chat.presentation.ui.chat.ShowRateAppDialog;
import com.ifriend.chat.presentation.ui.chat.message.ChatAudioMessageFacadeImpl;
import com.ifriend.chat.presentation.ui.chat.message.ChatAudioMessageFacadeImpl_Factory;
import com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageFragment;
import com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageViewModel;
import com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageViewModel_Factory;
import com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment;
import com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.chat.presentation.chat.viewmodel.ChatRootViewModelFactory;
import com.ifriend.chat.presentation.ui.chat.presentation.home.HomeFragment;
import com.ifriend.chat.presentation.ui.chat.presentation.home.HomeFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryFragment;
import com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenFactory;
import com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenFactory_Factory;
import com.ifriend.chat.presentation.ui.diary.fragments.dark.DarkDiaryFragment;
import com.ifriend.chat.presentation.ui.diary.fragments.dark.DarkDiaryFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.diary.fragments.dark.DarkDiaryViewModel;
import com.ifriend.chat.presentation.ui.diary.fragments.dark.DarkDiaryViewModel_Factory;
import com.ifriend.chat.presentation.ui.diary.fragments.light.LightDiaryFragment;
import com.ifriend.chat.presentation.ui.diary.fragments.light.LightDiaryFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.diary.fragments.light.LightDiaryViewModel;
import com.ifriend.chat.presentation.ui.diary.fragments.light.LightDiaryViewModel_Factory;
import com.ifriend.chat.presentation.ui.infoOnboarding.InfoOnboardingFragment;
import com.ifriend.chat.presentation.ui.infoOnboarding.InfoOnboardingFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.infoOnboarding.InfoOnboardingViewModel;
import com.ifriend.chat.presentation.ui.infoOnboarding.InfoOnboardingViewModel_Factory;
import com.ifriend.chat.presentation.ui.infoOnboarding.analytics.InfoOnboardingAnalyticsImpl_Factory;
import com.ifriend.chat.presentation.ui.internalNotifications.NotificationToSnackbarMapper;
import com.ifriend.chat.presentation.ui.internalNotifications.NotificationToSnackbarMapper_Factory;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotAgeFragment;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotAgeFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotAgeViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotAgeViewModel_Factory;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotEthnicityFragment;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotEthnicityFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotEthnicityViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotEthnicityViewModel_Factory;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotGenderFragment;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotGenderFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotGenderViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotGenderViewModel_Factory;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotNameFragment;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotNameFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotNameViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotNameViewModel_Factory;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotPersonalityFragment;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotPersonalityFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotPersonalityViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotPersonalityViewModel_Factory;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileFragment;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileViewModel_Factory;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotVoiceFragment;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotVoiceFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotVoiceViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotVoiceViewModel_Factory;
import com.ifriend.chat.presentation.ui.menu.botProfile.ChangeVoiceScreenFactoryImpl;
import com.ifriend.chat.presentation.ui.menu.botProfile.level.LevelPopupDialog;
import com.ifriend.chat.presentation.ui.menu.botProfile.level.LevelPopupDialog_MembersInjector;
import com.ifriend.chat.presentation.ui.menu.botProfile.level.LevelPopupViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.level.LevelPopupViewModel_Factory;
import com.ifriend.chat.presentation.ui.menu.botProfile.reset.ResetFragment;
import com.ifriend.chat.presentation.ui.menu.botProfile.reset.ResetFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.menu.botProfile.reset.ResetViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.reset.ResetViewModel_Factory;
import com.ifriend.chat.presentation.ui.menu.confirmEmail.ChangeEmailFragment;
import com.ifriend.chat.presentation.ui.menu.confirmEmail.ChangeEmailFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.menu.confirmEmail.ChangeEmailViewModel;
import com.ifriend.chat.presentation.ui.menu.confirmEmail.ChangeEmailViewModel_Factory;
import com.ifriend.chat.presentation.ui.menu.confirmEmail.ConfirmEmailFragment;
import com.ifriend.chat.presentation.ui.menu.confirmEmail.ConfirmEmailFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.menu.userProfile.ChangeAppIconFragment;
import com.ifriend.chat.presentation.ui.menu.userProfile.ChangeAppIconFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.menu.userProfile.ChangeAppIconViewModel;
import com.ifriend.chat.presentation.ui.menu.userProfile.ChangeAppIconViewModel_Factory;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserAgeFragment;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserAgeFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserAgeViewModel;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserAgeViewModel_Factory;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderFragment;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderViewModel;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderViewModel_Factory;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserNameFragment;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserNameFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserNameViewModel;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserNameViewModel_Factory;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileDeleteFragment;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileDeleteFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileDeleteViewModel;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileDeleteViewModel_Factory;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileFragment;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileViewModel;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileViewModel_Factory;
import com.ifriend.chat.presentation.ui.onboarding.OnboardingFragment;
import com.ifriend.chat.presentation.ui.onboarding.OnboardingFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.onboarding.analytics.OnboardingAnalyticsImpl_Factory;
import com.ifriend.chat.presentation.ui.purchase.neurons.BuyNeuronsBottomSheetDialogFragment;
import com.ifriend.chat.presentation.ui.purchase.neurons.BuyNeuronsBottomSheetDialogFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.purchase.premium.BuyPremiumFragment;
import com.ifriend.chat.presentation.ui.purchase.premium.BuyPremiumFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.rateApp.RateAppFragment;
import com.ifriend.chat.presentation.ui.rateApp.RateAppFragment_MembersInjector;
import com.ifriend.chat.presentation.ui.rateApp.RateAppViewModel;
import com.ifriend.chat.presentation.ui.rateApp.RateAppViewModel_Factory;
import com.ifriend.common_utils.Logger;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.datasources.calls.ChatCallsRemoteDataSource;
import com.ifriend.core.remote.datasources.calls.ChatCallsRemoteDataSource_Factory;
import com.ifriend.core.remote.services.CallsApiService;
import com.ifriend.core.remote.services.UserApiService;
import com.ifriend.core.tools.api.AppIdentityConverter;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.networking.api.chat.ChatMessagesApi;
import com.ifriend.data.networking.api.topics.TopicsApi;
import com.ifriend.data.networking.datasources.chat.ChatMessagesRemoteDataSource;
import com.ifriend.data.networking.datasources.chat.ChatMessagesRemoteDataSource_Factory;
import com.ifriend.data.networking.datasources.topics.ChatTopicsRemoteDataSource;
import com.ifriend.data.networking.datasources.topics.ChatTopicsRemoteDataSource_Factory;
import com.ifriend.data.repository.benefits.PremiumBenefitsRepositoryImpl;
import com.ifriend.data.repository.benefits.PremiumBenefitsRepositoryImpl_Factory;
import com.ifriend.data.repository.calls.ChatCallsRepositoryImpl;
import com.ifriend.data.repository.calls.ChatCallsRepositoryImpl_Factory;
import com.ifriend.data.repository.chat.client.ChatClientsRepositoryImpl;
import com.ifriend.data.repository.chat.client.ChatClientsRepositoryImpl_Factory;
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
import com.ifriend.data.repository.chat.providers.ChatClientProvider;
import com.ifriend.data.repository.chat.providers.ChatClientProvider_Factory;
import com.ifriend.data.repository.topics.ChatPremiumTopicsRepositoryImpl;
import com.ifriend.data.repository.topics.ChatPremiumTopicsRepositoryImpl_Factory;
import com.ifriend.data.repository.topics.ChatTopicsRepositoryImpl;
import com.ifriend.data.repository.topics.ChatTopicsRepositoryImpl_Factory;
import com.ifriend.data.repository.user.UserBalanceRepositoryImpl;
import com.ifriend.data.repository.user.UserBalanceRepositoryImpl_Factory;
import com.ifriend.data.socket.generator.BotAudioMessageUrlGenerator;
import com.ifriend.data.socket.generator.MediaPlayerPlaybackControllerGenerator;
import com.ifriend.data.socket.generator.UserAudioMessageUrlGenerator;
import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.data.storages.config.AppConfigStorage;
import com.ifriend.data.toggle.AnimatedAvatarFeatureToggle;
import com.ifriend.data.toggle.ChatGiftsStoreToggle;
import com.ifriend.data.toggle.ConfirmEmailFeatureToggle;
import com.ifriend.data.toggle.DiaryFeatureToggle;
import com.ifriend.data.toggle.DiaryFeatureToggle_Factory;
import com.ifriend.data.toggle.IsRateAppDialogEnabledToggle;
import com.ifriend.data.toggle.RateAndReviewUsToggle;
import com.ifriend.data.toggle.SextingRequestToggle;
import com.ifriend.data.toggle.SextingRequestToggle_Factory;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.authorization.SignInWithTokenUseCase;
import com.ifriend.domain.data.AppImageLoaderRepository;
import com.ifriend.domain.data.AudioMessageRepository;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.AuthDataStorage;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.DecodedAudioMessagesRepository;
import com.ifriend.domain.data.DoubleSuspendMapper;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.RateUsRepository;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.UserSubscriptionsBroadcast;
import com.ifriend.domain.data.authorization.confirmEmail.SendConfirmationEmailUseCase;
import com.ifriend.domain.data.benefits.PremiumBenefitsRepository;
import com.ifriend.domain.data.calls.ChatCallsRepository;
import com.ifriend.domain.data.chat.BuyChatMessagesRepository;
import com.ifriend.domain.data.chat.ChatBackgroundRepository;
import com.ifriend.domain.data.chat.ChatClientsRepository;
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
import com.ifriend.domain.data.generateAvatar.AvatarsStorage;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.data.guide.UserGuideRepository;
import com.ifriend.domain.data.infoonboarding.InfoOnboardingRepository;
import com.ifriend.domain.data.levels.LevelsRepository;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.data.memorycached.OnboardingChatConfigsMemoryCachedSource;
import com.ifriend.domain.data.networking.FirebaseApiRepository;
import com.ifriend.domain.data.notifications.ChatNotificationsRepository;
import com.ifriend.domain.data.offers.UserOffersRepository;
import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import com.ifriend.domain.data.purchases.BillingPurchasesHistory;
import com.ifriend.domain.data.topics.ChatPremiumTopicsRepository;
import com.ifriend.domain.data.topics.ChatTopicsRepository;
import com.ifriend.domain.data.update.InAppUpdateRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.domain.featuretoggles.ChatVideoBackgroundFeatureToggle;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.domain.infrastucture.InternetConnectionDialogsManager;
import com.ifriend.domain.logic.calls.ChatCallsInteractor;
import com.ifriend.domain.logic.calls.ChatCallsInteractor_Factory;
import com.ifriend.domain.logic.chat.ChatBackgroundUseCase;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.ChatClientInteractor_Factory;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor_Factory;
import com.ifriend.domain.logic.chat.buy.BuyChatInteractor;
import com.ifriend.domain.logic.chat.buy.BuyChatInteractor_Factory;
import com.ifriend.domain.logic.chat.buy.BuyChatMessagesInteractor;
import com.ifriend.domain.logic.chat.buy.BuyChatMessagesInteractor_Factory;
import com.ifriend.domain.logic.chat.chats.GetActiveChattingChatsUseCase;
import com.ifriend.domain.logic.chat.chats.GetActiveChattingChatsUseCase_Factory;
import com.ifriend.domain.logic.chat.chats.GetUnavailableChatsUseCase;
import com.ifriend.domain.logic.chat.chats.GetUnavailableChatsUseCase_Factory;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor_Factory;
import com.ifriend.domain.logic.chat.events.ChatEventsInteractor;
import com.ifriend.domain.logic.chat.events.ChatEventsInteractor_Factory;
import com.ifriend.domain.logic.chat.gifts.ChatGiftsUseCase;
import com.ifriend.domain.logic.chat.info.ActivateNewChatUseCase;
import com.ifriend.domain.logic.chat.info.ActivateNewChatUseCase_Factory;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor_Factory;
import com.ifriend.domain.logic.chat.info.IsMultiChatEnabledUseCase;
import com.ifriend.domain.logic.chat.info.IsMultiChatEnabledUseCase_Factory;
import com.ifriend.domain.logic.chat.intro.GetChatIntroSlidesUseCase;
import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor;
import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor_Factory;
import com.ifriend.domain.logic.chat.permissions.CheckChatPermissionsUseCase;
import com.ifriend.domain.logic.chat.refresh.ChatsRefreshConfigurationUseCase;
import com.ifriend.domain.logic.chat.refresh.ChatsRefreshConfigurationUseCase_Factory;
import com.ifriend.domain.logic.chat.regenerate.RegenerateChatMessageUseCase;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor_Factory;
import com.ifriend.domain.logic.experiments.IsChatFeatureAvailableUseCase;
import com.ifriend.domain.logic.experiments.IsChatFeatureAvailableUseCase_Factory;
import com.ifriend.domain.logic.experiments.checker.ChatIdConditionsCheckerUseCase;
import com.ifriend.domain.logic.experiments.checker.ChatIdConditionsCheckerUseCase_Factory;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlideUseCase;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlideUseCase_Factory;
import com.ifriend.domain.logic.logout.LogoutUseCase;
import com.ifriend.domain.logic.logout.LogoutUseCase_Factory;
import com.ifriend.domain.logic.offers.ChatSubscriptionOfferInteractor;
import com.ifriend.domain.logic.onboarding.GetOnboardingConfigurationChatsUseCase;
import com.ifriend.domain.logic.onboarding.GetOnboardingConfigurationChatsUseCase_Factory;
import com.ifriend.domain.logic.store.GetChatsStoreInteractor;
import com.ifriend.domain.logic.store.GetChatsStoreInteractor_Factory;
import com.ifriend.domain.logic.topics.ChatPanelActionsInteractor;
import com.ifriend.domain.logic.topics.ChatPanelActionsInteractor_Factory;
import com.ifriend.domain.logic.updates.UpdatePromptInteractor;
import com.ifriend.domain.logic.updates.UpdatePromptInteractor_Factory;
import com.ifriend.domain.newChat.chat.ChatSystemsFactory;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import com.ifriend.domain.newChat.chat.systems.dateSeparator.DateSeparatorSystem;
import com.ifriend.domain.newChat.chat.systems.messages.live.LiveChatMessagesFlow;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.QueuedMessageToEntityMapper;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisher;
import com.ifriend.domain.notifications.LongTermNotificationManager;
import com.ifriend.domain.onboarding.interactor.OnboardingInteractor;
import com.ifriend.domain.rateUs.OnUserRatedAppUseCase;
import com.ifriend.domain.rateUs.RateAppShowingPlanner;
import com.ifriend.domain.rateUs.RateUsStateStorage;
import com.ifriend.domain.rateUs.ShowRateUsUseCase;
import com.ifriend.domain.services.audio.recording.AudioRecorderController;
import com.ifriend.domain.services.audio.recording.AudioRecordingStateProvider;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.storage.AvatarAnimationEnabledStorage;
import com.ifriend.domain.storage.EventDelayStorage;
import com.ifriend.domain.storage.NeuronsCostsStorage;
import com.ifriend.domain.storage.token.UserTokenProvider;
import com.ifriend.domain.storage.token.UserTokenStorage;
import com.ifriend.domain.toggle.FeatureToggle;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.domain.useCases.AppConfigUseCase_Factory;
import com.ifriend.domain.useCases.bot.BotHaveUpdateUseCase;
import com.ifriend.domain.useCases.bot.BotHaveUpdateUseCase_Factory;
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
import com.ifriend.domain.validation.ValidateAgeUseCase;
import com.ifriend.domain.validation.ValidateNameUseCase;
import com.ifriend.icon_switcher.PremiumAppIconManager;
import com.ifriend.icon_switcher.di.PremiumIconManagerModule;
import com.ifriend.icon_switcher.di.PremiumIconManagerModule_ProvidePremiumAppIconManagerFactory;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.internal_notifications.handler.InternalNotificationsQueue;
import com.ifriend.internal_notifications.notification.InternalNotification;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.logger.api.logic.AppLoggerInteractor;
import com.ifriend.platform.tools.api.AppInfoProvider;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.platform.tools.api.permissions.PermissionProvider;
import com.ifriend.platform.tools.api.speech.TextToSpeechStream;
import com.ifriend.platform.tools.api.speech.voice.VoiceRecognitionStreaming;
import com.ifriend.popup.api.PopupFragmentFactory;
import com.ifriend.popup.api.PopupModelFactory;
import com.ifriend.presentation.analytics.ChatAnalyticsInteractor;
import com.ifriend.presentation.analytics.ChatAnalyticsInteractor_Factory;
import com.ifriend.presentation.analytics.ChatPhotoAnalytics;
import com.ifriend.presentation.analytics.ChatPhotoAnalytics_Factory;
import com.ifriend.presentation.analytics.ChatTopicsAnalytics;
import com.ifriend.presentation.common.exception.mappers.FeatureExceptionMapper;
import com.ifriend.presentation.common.exception.mappers.FeatureExceptionMapper_Factory;
import com.ifriend.presentation.common.mappers.ChatInterestsTypeMapperUi_Factory;
import com.ifriend.presentation.common.mappers.GenderMapper;
import com.ifriend.presentation.common.mappers.GenderMapper_Factory;
import com.ifriend.presentation.common.mappers.PersonalityMapper;
import com.ifriend.presentation.common.mappers.PersonalityMapper_Factory;
import com.ifriend.presentation.common.observers.FlowObserver;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsObserver;
import com.ifriend.presentation.common.observers.exceptions.ExceptionsObserver;
import com.ifriend.presentation.common.observers.purchases.PaymentResultEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import com.ifriend.presentation.common.observers.purchases.PaymentResultObserver;
import com.ifriend.presentation.di.AppEventsObserverModule;
import com.ifriend.presentation.di.AppEventsObserverModule_ProvideAppEventsEmitterFactory;
import com.ifriend.presentation.di.AppEventsObserverModule_ProvideAppEventsFlowFactory;
import com.ifriend.presentation.di.AppEventsObserverModule_ProvideAppEventsObserverFactory;
import com.ifriend.presentation.di.AppEventsObserverModule_ProvidePaymentResultEmitterFactory;
import com.ifriend.presentation.di.AppEventsObserverModule_ProvidePaymentResultFlowFactory;
import com.ifriend.presentation.di.AppEventsObserverModule_ProvidePaymentResultObserverFactory;
import com.ifriend.presentation.di.AppExceptionsObserverModule;
import com.ifriend.presentation.di.AppExceptionsObserverModule_ProvideExceptionsEmitterFactory;
import com.ifriend.presentation.di.AppExceptionsObserverModule_ProvideExceptionsFlowFactory;
import com.ifriend.presentation.di.AppExceptionsObserverModule_ProvideExceptionsObserverFactory;
import com.ifriend.presentation.features.app.delegates.AppChatEventsDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppChatEventsDelegateImpl_Factory;
import com.ifriend.presentation.features.app.delegates.AppChatMessagesDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppChatMessagesDelegateImpl_Factory;
import com.ifriend.presentation.features.app.delegates.AppDeepLinksDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppDeepLinksDelegateImpl_Factory;
import com.ifriend.presentation.features.app.delegates.AppNavigationDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppNavigationDelegateImpl_Factory;
import com.ifriend.presentation.features.app.delegates.AppReloadDataDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppReloadDataDelegateImpl_Factory;
import com.ifriend.presentation.features.app.delegates.AppServicesDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppServicesDelegateImpl_Factory;
import com.ifriend.presentation.features.app.delegates.AppStartFlowDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppStartFlowDelegateImpl_Factory;
import com.ifriend.presentation.features.app.delegates.BillingEventDelegateImpl;
import com.ifriend.presentation.features.app.delegates.BillingEventDelegateImpl_Factory;
import com.ifriend.presentation.features.app.delegates.OnboardingSubmittedDelegateImpl;
import com.ifriend.presentation.features.app.delegates.OnboardingSubmittedDelegateImpl_Factory;
import com.ifriend.presentation.features.app.delegates.PurchaseInfoDelegateImpl;
import com.ifriend.presentation.features.app.delegates.PurchaseInfoDelegateImpl_Factory;
import com.ifriend.presentation.features.app.delegates.StartChatFlowDelegateImpl;
import com.ifriend.presentation.features.app.delegates.StartChatFlowDelegateImpl_Factory;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel_Factory;
import com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegateImpl;
import com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl;
import com.ifriend.presentation.features.chat.common.ChatEvents;
import com.ifriend.presentation.features.chat.common.ChatEventsObserver;
import com.ifriend.presentation.features.chat.configuration.ChatConfigurationDelegate;
import com.ifriend.presentation.features.chat.configuration.ChatConfigurationDelegateImpl_Factory;
import com.ifriend.presentation.features.chat.configuration.ChatConfigurationDelegate_Factory_Impl;
import com.ifriend.presentation.features.chat.deeplinks.ChatHandleDeepLinksDelegateImpl;
import com.ifriend.presentation.features.chat.gifts.analytics.ChatGiftAnalytics;
import com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegateImpl;
import com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsMapper;
import com.ifriend.presentation.features.chat.input.analytics.VoiceRecordingAnalytics;
import com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegateImpl;
import com.ifriend.presentation.features.chat.intro.analytics.ChatIntroAnalyticsInteractor;
import com.ifriend.presentation.features.chat.intro.delegate.ChatIntroDelegateImpl;
import com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegate;
import com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegateImpl_Factory;
import com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegate_Factory_Impl;
import com.ifriend.presentation.features.chat.message.ChatMessageDelegate;
import com.ifriend.presentation.features.chat.message.ChatMessageDelegateImpl_Factory;
import com.ifriend.presentation.features.chat.message.ChatMessageDelegate_Factory_Impl;
import com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegateImpl;
import com.ifriend.presentation.features.chat.notifications.model.ChatNotificationsUiMapper;
import com.ifriend.presentation.features.chat.offers.ChatSubscriptionOfferDelegateImpl;
import com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl;
import com.ifriend.presentation.features.chat.panel.mappers.ChatPremiumTopicMapperUi;
import com.ifriend.presentation.features.chat.panel.mappers.ChatTopicMapperUi;
import com.ifriend.presentation.features.chat.panel.mappers.TopicIconMapperUi;
import com.ifriend.presentation.features.chat.panel.mappers.TopicImageMapperUi;
import com.ifriend.presentation.features.chat.panel.mappers.TopicPopupDataMapperUi;
import com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegate;
import com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegateImpl_Factory;
import com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegate_Factory_Impl;
import com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegateImpl;
import com.ifriend.presentation.features.chat.sextingmessage.SextingMessagePaywallShowingDelegateImpl;
import com.ifriend.presentation.features.chatcall.analytics.ChatCallAnalytics;
import com.ifriend.presentation.features.chatcall.analytics.ChatCallAnalytics_Factory;
import com.ifriend.presentation.features.chatcall.viewmodel.C0208ChatCallViewModelFactory_Factory;
import com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModelFactory;
import com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModelFactory_Factory_Impl;
import com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsConfigurationDelegateImpl;
import com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsConfigurationDelegateImpl_Factory;
import com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsLevelsDelegateImpl;
import com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsLevelsDelegateImpl_Factory;
import com.ifriend.presentation.features.chatsettings.mappers.ChatSettingsActionTagsMapperUi;
import com.ifriend.presentation.features.chatsettings.mappers.ChatSettingsActionTagsMapperUi_Factory;
import com.ifriend.presentation.features.chatsettings.ui.ChatSettingsFragment;
import com.ifriend.presentation.features.chatsettings.ui.ChatSettingsFragment_MembersInjector;
import com.ifriend.presentation.features.chatsettings.viewmodel.C0209ChatSettingsViewModelFactory_Factory;
import com.ifriend.presentation.features.chatsettings.viewmodel.ChatSettingsViewModelFactory;
import com.ifriend.presentation.features.chatsettings.viewmodel.ChatSettingsViewModelFactory_Factory_Impl;
import com.ifriend.presentation.features.chatstore.analytics.ChatsStoreAnalyticsInteractor;
import com.ifriend.presentation.features.chatstore.analytics.ChatsStoreAnalyticsInteractor_Factory;
import com.ifriend.presentation.features.chatstore.mapper.ChatStoreUiMapper;
import com.ifriend.presentation.features.chatstore.mapper.ChatStoreUiMapper_Factory;
import com.ifriend.presentation.features.chatstore.ui.ChatsStoreFragment;
import com.ifriend.presentation.features.chatstore.ui.ChatsStoreFragment_MembersInjector;
import com.ifriend.presentation.features.chatstore.viewmodel.C0210ChatsStoreViewModelFactory_Factory;
import com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModelFactory;
import com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModelFactory_Factory_Impl;
import com.ifriend.presentation.features.email.confirm.EmailConfirmDelegateImpl;
import com.ifriend.presentation.features.email.confirm.EmailConfirmDelegateImpl_Factory;
import com.ifriend.presentation.features.home.analytics.HomeAnalyticsInteractor;
import com.ifriend.presentation.features.home.analytics.HomeAnalyticsInteractor_Factory;
import com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl;
import com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl_Factory;
import com.ifriend.presentation.features.home.delegates.HomeHandleDeepLinksDelegateImpl;
import com.ifriend.presentation.features.home.delegates.HomeHandleDeepLinksDelegateImpl_Factory;
import com.ifriend.presentation.features.home.mappers.ChatUnlockLabelMapperUi;
import com.ifriend.presentation.features.home.mappers.ChatUnlockLabelMapperUi_Factory;
import com.ifriend.presentation.features.home.mappers.HomeActiveChatMapper;
import com.ifriend.presentation.features.home.mappers.HomeActiveChatMapper_Factory;
import com.ifriend.presentation.features.home.mappers.HomeUnavailableChatMapper;
import com.ifriend.presentation.features.home.mappers.HomeUnavailableChatMapper_Factory;
import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
import com.ifriend.presentation.features.home.viewmodel.HomeViewModel_Factory;
import com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModelFactory;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.factory.C0211OnboardingStepViewModelFactory_Factory;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.factory.OnboardingStepViewModelFactory;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.factory.OnboardingStepViewModelFactory_Factory_Impl;
import com.ifriend.presentation.features.profile.actions.ChatProfileActionDelegateImpl;
import com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel;
import com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel_Factory;
import com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl;
import com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl_Factory;
import com.ifriend.presentation.features.profile.header.mappers.ChatAvatarMapper;
import com.ifriend.presentation.features.profile.header.mappers.ChatAvatarMapper_Factory;
import com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegateImpl;
import com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegateImpl_Factory;
import com.ifriend.presentation.features.purchases.benefits.viewmodel.ActivePremiumBenefitsViewModelFactory;
import com.ifriend.presentation.features.purchases.billing.analytics.BillingPurchaseProductAnalytics;
import com.ifriend.presentation.features.purchases.billing.analytics.BillingPurchaseProductAnalytics_Factory;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegateImpl_Factory;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate_Factory_Impl;
import com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.C0212ChatActiveSubscriptionViewModelFactory_Factory;
import com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModelFactory;
import com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModelFactory_Factory_Impl;
import com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.C0213ChatSubscriptionBenefitsViewModelFactory_Factory;
import com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModelFactory;
import com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModelFactory_Factory_Impl;
import com.ifriend.presentation.features.purchases.chatsubscription.common.mappers.SubscriptionBenefitsMapper_Factory;
import com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.C0214ChatFlowSubscriptionViewModelFactory_Factory;
import com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModelFactory;
import com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModelFactory_Factory_Impl;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.mappers.ChatBuySubscriptionOfferUiMapper;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.mappers.ChatBuySubscriptionOfferUiMapper_Factory;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.C0215ChatBuySubscriptionViewModelFactory_Factory;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModelFactory;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModelFactory_Factory_Impl;
import com.ifriend.presentation.features.purchases.common.mapper.SubscriptionBenefitsUiMapper;
import com.ifriend.presentation.features.purchases.common.mapper.SubscriptionBenefitsUiMapper_Factory;
import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiMapper;
import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiMapper_Factory;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModelFactory;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModelFactory_Factory_Impl;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.C0216BuyNeuronsViewModelFactory_Factory;
import com.ifriend.presentation.features.purchases.premium.model.BuyPremiumPlanUiMapper;
import com.ifriend.presentation.features.purchases.premium.model.BuyPremiumPlanUiMapper_Factory;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModelFactory;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModelFactory_Factory_Impl;
import com.ifriend.presentation.features.purchases.premium.viewmodel.C0217BuyPremiumViewModelFactory_Factory;
import com.ifriend.presentation.features.update.analytics.InAppUpdateAnalytics;
import com.ifriend.presentation.features.update.analytics.InAppUpdateAnalytics_Factory;
import com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl;
import com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl_Factory;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.presentation.navigation.navflow.NavHostFlowFragment;
import com.ifriend.presentation.navigation.navflow.NavHostFlowFragment_MembersInjector;
import com.ifriend.presentation.services.ChatMessagesService;
import com.ifriend.presentation.services.ChatMessagesServiceImpl;
import com.ifriend.presentation.services.ChatMessagesServiceImpl_Factory;
import com.ifriend.presentation.services.ChatService;
import com.ifriend.presentation.services.ChatServiceImpl;
import com.ifriend.presentation.services.ChatServiceImpl_Factory;
import com.ifriend.presentation.services.UserBalanceService;
import com.ifriend.presentation.services.UserBalanceServiceImpl;
import com.ifriend.presentation.services.UserBalanceServiceImpl_Factory;
import com.ifriend.ui.base.BaseActivity;
import com.ifriend.ui.base.BaseActivity_MembersInjector;
import com.ifriend.ui.base.BaseFragment_MembersInjector;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.modalMessage.ChooseVoicePopupDelegate;
import com.ifriend.ui.base.modalMessage.GeneratingAnimatedAvatarPopupDelegate;
import com.ifriend.ui.base.modalMessage.NoInternetPopupDelegate;
import com.ifriend.ui.base.modalMessage.RateAppPopupDelegate;
import com.ifriend.ui.base.modalMessage.RequestSextingPopupDelegate;
import com.ifriend.ui.base.modalMessage.RequestSextingPopupDelegate_Factory;
import com.ifriend.ui.internalNotifications.SnackbarDescription;
import com.ifriend.ui.recyclerView.audio.ChatAnalytics;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class DaggerChatComponent {
    private DaggerChatComponent() {
    }

    public static ChatComponent.Builder builder() {
        return new Builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class Builder implements ChatComponent.Builder {
        private BaseActivity activity;
        private BaseComponent baseComponent;
        private Context context;
        private Lifecycle screenLifecycle;

        private Builder() {
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent.Builder
        public Builder coreComponent(BaseComponent baseComponent) {
            this.baseComponent = (BaseComponent) Preconditions.checkNotNull(baseComponent);
            return this;
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent.Builder
        public Builder activity(BaseActivity baseActivity) {
            this.activity = (BaseActivity) Preconditions.checkNotNull(baseActivity);
            return this;
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent.Builder
        public Builder screenLifecycle(Lifecycle lifecycle) {
            this.screenLifecycle = (Lifecycle) Preconditions.checkNotNull(lifecycle);
            return this;
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent.Builder
        public ChatComponent build() {
            Preconditions.checkBuilderRequirement(this.baseComponent, BaseComponent.class);
            Preconditions.checkBuilderRequirement(this.activity, BaseActivity.class);
            Preconditions.checkBuilderRequirement(this.screenLifecycle, Lifecycle.class);
            Preconditions.checkBuilderRequirement(this.context, Context.class);
            return new ChatComponentImpl(new ActivityModule(), new ChatApiModule(), new AuthModule(), new ChatModule(), new PremiumIconManagerModule(), new AnalyticUseCasesModule(), new AppEventsObserverModule(), new ChatEventsObserverModule(), new AppExceptionsObserverModule(), this.baseComponent, this.activity, this.screenLifecycle, this.context);
        }
    }

    /* loaded from: classes6.dex */
    private static final class ChatComponentImpl implements ChatComponent {
        private Provider<ActivateNewChatUseCase> activateNewChatUseCaseProvider;
        private final BaseActivity activity;
        private Provider<BaseActivity> activityProvider;
        private final AnalyticUseCasesModule analyticUseCasesModule;
        private Provider<AnalyticsEngine> analyticsEngineProvider;
        private Provider<AppChatEventsDelegateImpl> appChatEventsDelegateImplProvider;
        private Provider<AppChatMessagesDelegateImpl> appChatMessagesDelegateImplProvider;
        private Provider<AppConfigUseCase> appConfigUseCaseProvider;
        private Provider<AppDeepLinksDelegateImpl> appDeepLinksDelegateImplProvider;
        private Provider<AppNavigationDelegateImpl> appNavigationDelegateImplProvider;
        private Provider<AppReloadDataDelegateImpl> appReloadDataDelegateImplProvider;
        private Provider<AppServicesDelegateImpl> appServicesDelegateImplProvider;
        private Provider<AppStartFlowDelegateImpl> appStartFlowDelegateImplProvider;
        private Provider<AppViewModel> appViewModelProvider;
        private Provider<AudioPlayerSettings> audioAudioPlayerSettingsProvider;
        private Provider<AudioPlayer> audioPlayerProvider;
        private Provider<AvatarsStorage> avatarsStorageProvider;
        private final BaseComponent baseComponent;
        private Provider<BillingEventDelegateImpl> billingEventDelegateImplProvider;
        private BillingPurchaseDelegateImpl_Factory billingPurchaseDelegateImplProvider;
        private Provider<BillingPurchaseProductAnalytics> billingPurchaseProductAnalyticsProvider;
        private Provider<ChatHistory> bindChatHistoryProvider;
        private Provider<Mapper<InternalNotification, SnackbarDescription>> bindNotificationToSnackbarMapperProvider;
        private Provider<PremiumBenefitsRepository> bindsBenefitsRepositoryProvider;
        private Provider<ChatAudioMessageFacade> bindsChatAudioMessageFacadeProvider;
        private Provider<ChatCallsRepository> bindsChatCallsRepositoryProvider;
        private Provider<ChatMessagesService> bindsChatMessagesServiceProvider;
        private Provider<ChatPremiumTopicsRepository> bindsChatPremiumTopicsRepositoryProvider;
        private Provider<ChatService> bindsChatServiceProvider;
        private Provider<ChatTopicsRepository> bindsChatTopicsRepositoryProvider;
        private Provider<ChatClientsRepository> bindsChatsClientRepositoryProvider;
        private Provider<ChatMessagesRepository> bindsMessageSenderProvider;
        private Provider<DoubleSuspendMapper<MessageToSend, String, SendingMessagesQueue.QueuedMessage>> bindsMessageToSendToQueuedMessageMapperProvider;
        private Provider<SendingMessagesQueue> bindsSendingMessagesQueueProvider;
        private Provider<UserBalanceRepository> bindsUserBalanceRepositoryProvider;
        private Provider<UserBalanceService> bindsUserBalanceServiceProvider;
        private Provider<BotAgeViewModel> botAgeViewModelProvider;
        private Provider<BotEthnicityViewModel> botEthnicityViewModelProvider;
        private Provider<BotGenderViewModel> botGenderViewModelProvider;
        private Provider<BotHaveUpdateUseCase> botHaveUpdateUseCaseProvider;
        private Provider<BotNameViewModel> botNameViewModelProvider;
        private Provider<BotPersonalityViewModel> botPersonalityViewModelProvider;
        private Provider<BotProfileViewModel> botProfileViewModelProvider;
        private Provider<BotVoiceViewModel> botVoiceViewModelProvider;
        private Provider<BuyChatInteractor> buyChatInteractorProvider;
        private Provider<BuyChatMessagesInteractor> buyChatMessagesInteractorProvider;
        private Provider<BuyNeuronsProductUiMapper> buyNeuronsProductUiMapperProvider;
        private C0216BuyNeuronsViewModelFactory_Factory buyNeuronsViewModelFactoryProvider;
        private Provider<BuyPremiumPlanUiMapper> buyPremiumPlanUiMapperProvider;
        private C0217BuyPremiumViewModelFactory_Factory buyPremiumViewModelFactoryProvider;
        private Provider<ChangeAppIconViewModel> changeAppIconViewModelProvider;
        private Provider<ChangeEmailViewModel> changeEmailViewModelProvider;
        private C0212ChatActiveSubscriptionViewModelFactory_Factory chatActiveSubscriptionViewModelFactoryProvider;
        private Provider<ChatAnalyticsInteractor> chatAnalyticsInteractorProvider;
        private Provider<ChatAudioContentMessageMapper> chatAudioContentMessageMapperProvider;
        private Provider<ChatAudioMessageFacadeImpl> chatAudioMessageFacadeImplProvider;
        private Provider<ChatBuySubscriptionOfferUiMapper> chatBuySubscriptionOfferUiMapperProvider;
        private C0215ChatBuySubscriptionViewModelFactory_Factory chatBuySubscriptionViewModelFactoryProvider;
        private Provider<ChatCallAnalytics> chatCallAnalyticsProvider;
        private C0208ChatCallViewModelFactory_Factory chatCallViewModelFactoryProvider;
        private Provider<ChatCallsInteractor> chatCallsInteractorProvider;
        private Provider<ChatCallsRemoteDataSource> chatCallsRemoteDataSourceProvider;
        private Provider<ChatCallsRepositoryImpl> chatCallsRepositoryImplProvider;
        private Provider<ChatClientInteractor> chatClientInteractorProvider;
        private Provider<ChatClientProvider> chatClientProvider;
        private Provider<ChatClientsRepositoryImpl> chatClientsRepositoryImplProvider;
        private final ChatComponentImpl chatComponentImpl;
        private ChatConfigurationDelegateImpl_Factory chatConfigurationDelegateImplProvider;
        private Provider<ChatEventsInteractor> chatEventsInteractorProvider;
        private C0214ChatFlowSubscriptionViewModelFactory_Factory chatFlowSubscriptionViewModelFactoryProvider;
        private Provider<ChatGiftContentMessageMapper> chatGiftContentMessageMapperProvider;
        private Provider<ChatHeaderDelegateImpl> chatHeaderDelegateImplProvider;
        private Provider<ChatIdConditionsCheckerUseCase> chatIdConditionsCheckerUseCaseProvider;
        private Provider<ChatImageContentMessageMapper> chatImageContentMessageMapperProvider;
        private Provider<ChatImageUrlMapper> chatImageUrlMapperProvider;
        private ChatMessageAccessDelegateImpl_Factory chatMessageAccessDelegateImplProvider;
        private Provider<ChatMessageAccessInteractor> chatMessageAccessInteractorProvider;
        private Provider<ChatMessageContentMapper> chatMessageContentMapperProvider;
        private ChatMessageDelegateImpl_Factory chatMessageDelegateImplProvider;
        private Provider<ChatMessageInfoMapper> chatMessageInfoMapperProvider;
        private Provider<ChatMessageMapper> chatMessageMapperProvider;
        private Provider<ChatMessagesRemoteDataSource> chatMessagesRemoteDataSourceProvider;
        private Provider<ChatMessagesRepositoryImpl> chatMessagesRepositoryImplProvider;
        private Provider<ChatMessagesServiceImpl> chatMessagesServiceImplProvider;
        private Provider<ChatPanelActionsInteractor> chatPanelActionsInteractorProvider;
        private Provider<ChatPhotoAnalytics> chatPhotoAnalyticsProvider;
        private ChatPhotoDelegateImpl_Factory chatPhotoDelegateImplProvider;
        private Provider<ChatPremiumTopicsRepositoryImpl> chatPremiumTopicsRepositoryImplProvider;
        private Provider<ChatScreenFactory> chatScreenFactoryProvider;
        private Provider<ChatServiceImpl> chatServiceImplProvider;
        private Provider<ChatSettingsActionTagsMapperUi> chatSettingsActionTagsMapperUiProvider;
        private Provider<ChatSettingsConfigurationDelegateImpl> chatSettingsConfigurationDelegateImplProvider;
        private Provider<ChatSettingsLevelsDelegateImpl> chatSettingsLevelsDelegateImplProvider;
        private C0209ChatSettingsViewModelFactory_Factory chatSettingsViewModelFactoryProvider;
        private Provider<ChatStoreUiMapper> chatStoreUiMapperProvider;
        private C0213ChatSubscriptionBenefitsViewModelFactory_Factory chatSubscriptionBenefitsViewModelFactoryProvider;
        private Provider<ChatSubscriptionInteractor> chatSubscriptionInteractorProvider;
        private Provider<ChatTopicsRemoteDataSource> chatTopicsRemoteDataSourceProvider;
        private Provider<ChatTopicsRepositoryImpl> chatTopicsRepositoryImplProvider;
        private Provider<ChatUnlockLabelMapperUi> chatUnlockLabelMapperUiProvider;
        private Provider<ChatUserImageContentMessageMapper> chatUserImageContentMessageMapperProvider;
        private Provider<ChatsConfigurationInteractor> chatsConfigurationInteractorProvider;
        private Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
        private Provider<ChatsRefreshConfigurationUseCase> chatsRefreshConfigurationUseCaseProvider;
        private Provider<ChatsStoreAnalyticsInteractor> chatsStoreAnalyticsInteractorProvider;
        private C0210ChatsStoreViewModelFactory_Factory chatsStoreViewModelFactoryProvider;
        private Provider<ConfirmEmailViewModel> confirmEmailViewModelProvider;
        private Provider<Context> contextProvider;
        private Provider<DarkDiaryViewModel> darkDiaryViewModelProvider;
        private Provider<DiaryFeatureToggle> diaryFeatureToggleProvider;
        private Provider<DiaryScreenFactory> diaryScreenFactoryProvider;
        private Provider<EmailConfirmDelegateImpl> emailConfirmDelegateImplProvider;
        private Provider<ChatsStoreViewModelFactory.Factory> factoryProvider;
        private Provider<ChatCallViewModelFactory.Factory> factoryProvider10;
        private Provider<OnboardingStepViewModelFactory.Factory> factoryProvider11;
        private Provider<ChatFlowSubscriptionViewModelFactory.Factory> factoryProvider12;
        private Provider<ChatBuySubscriptionViewModelFactory.Factory> factoryProvider13;
        private Provider<ChatSubscriptionBenefitsViewModelFactory.Factory> factoryProvider14;
        private Provider<ChatActiveSubscriptionViewModelFactory.Factory> factoryProvider15;
        private Provider<ChatSettingsViewModelFactory.Factory> factoryProvider2;
        private Provider<BillingPurchaseDelegate.Factory> factoryProvider3;
        private Provider<ChatMessageAccessDelegate.Factory> factoryProvider4;
        private Provider<ChatPhotoDelegate.Factory> factoryProvider5;
        private Provider<ChatConfigurationDelegate.Factory> factoryProvider6;
        private Provider<ChatMessageDelegate.Factory> factoryProvider7;
        private Provider<BuyNeuronsViewModelFactory.Factory> factoryProvider8;
        private Provider<BuyPremiumViewModelFactory.Factory> factoryProvider9;
        private Provider<FeatureExceptionMapper> featureExceptionMapperProvider;
        private Provider<GenderMapper> genderMapperProvider;
        private Provider<GenerateBotAvatarErrorViewModel> generateBotAvatarErrorViewModelProvider;
        private Provider<GenerateBotAvatarViewModel> generateBotAvatarViewModelProvider;
        private Provider<GeneratedChatAvatarInteractor> generatedChatAvatarInteractorProvider;
        private Provider<GeneratingBotAvatarPlaceholderViewModel> generatingBotAvatarPlaceholderViewModelProvider;
        private Provider<GetActiveChattingChatsUseCase> getActiveChattingChatsUseCaseProvider;
        private Provider<GetAllPremiumBenefitsUseCase> getAllPremiumBenefitsUseCaseProvider;
        private Provider<AppConfigStorage> getAppConfigStorageProvider;
        private Provider<GetChatsStoreInteractor> getChatsStoreInteractorProvider;
        private Provider<GetOnboardingConfigurationChatsUseCase> getOnboardingConfigurationChatsUseCaseProvider;
        private Provider<GetUnavailableChatsUseCase> getUnavailableChatsUseCaseProvider;
        private Provider<HomeActiveChatMapper> homeActiveChatMapperProvider;
        private Provider<HomeAnalyticsInteractor> homeAnalyticsInteractorProvider;
        private Provider<HomeChatsDelegateImpl> homeChatsDelegateImplProvider;
        private Provider<HomeHandleDeepLinksDelegateImpl> homeHandleDeepLinksDelegateImplProvider;
        private Provider<HomeUnavailableChatMapper> homeUnavailableChatMapperProvider;
        private Provider<HomeViewModel> homeViewModelProvider;
        private Provider<ImageLoaderImpl> imageLoaderImplProvider;
        private Provider<ImageLoader> imageLoaderProvider;
        private Provider<ImagesLockerSystem> imagesLockerSystemProvider;
        private Provider<InAppUpdateAnalytics> inAppUpdateAnalyticsProvider;
        private Provider<InAppUpdateDelegateImpl> inAppUpdateDelegateImplProvider;
        private Provider<InfoOnboardingSlideUseCase> infoOnboardingSlideUseCaseProvider;
        private Provider<InfoOnboardingViewModel> infoOnboardingViewModelProvider;
        private Provider<IsChatFeatureAvailableUseCase> isChatFeatureAvailableUseCaseProvider;
        private Provider<IsMultiChatEnabledUseCase> isMultiChatEnabledUseCaseProvider;
        private Provider<LevelPopupViewModel> levelPopupViewModelProvider;
        private Provider<LightDiaryViewModel> lightDiaryViewModelProvider;
        private Provider<LogoutUseCase> logoutUseCaseProvider;
        private Provider<MessageToSendToQueuedMessageMapper> messageToSendToQueuedMessageMapperProvider;
        private Provider<NotificationToSnackbarMapper> notificationToSnackbarMapperProvider;
        private C0211OnboardingStepViewModelFactory_Factory onboardingStepViewModelFactoryProvider;
        private Provider<OnboardingSubmittedDelegateImpl> onboardingSubmittedDelegateImplProvider;
        private Provider<PersonalityMapper> personalityMapperProvider;
        private Provider<PopupFragmentFactory> popupFragmentFactoryProvider;
        private Provider<PremiumBenefitsRepositoryImpl> premiumBenefitsRepositoryImplProvider;
        private Provider<PreviewSendImageViewModel> previewSendImageViewModelProvider;
        private Provider<ProfileMenuDelegateImpl> profileMenuDelegateImplProvider;
        private Provider<AnalyticsAudioAiClickPlayUseCase> provideAnalyticsAudioAiClickPlayUseCaseProvider;
        private Provider<AnalyticsAudioAiCompletedUseCase> provideAnalyticsAudioAiCompletedUseCaseProvider;
        private Provider<AnalyticsAudioAiClickConvertToTextMessageUseCase> provideAnalyticsAudioAiConvertToTextMessageUseCaseProvider;
        private Provider<AnalyticsAudioAiClickConvertToTextModalUseCase> provideAnalyticsAudioAiConvertToTextModalUseCaseProvider;
        private Provider<AnalyticsAudioAiPauseUseCase> provideAnalyticsAudioAiPauseUseCaseProvider;
        private Provider<AnalyticsAudioAiStartPlayingUseCase> provideAnalyticsAudioAiStartPlayingUseCaseProvider;
        private Provider<AnalyticsAvatarAiApplyUseCase> provideAnalyticsAvatarAiApplyUseCaseProvider;
        private Provider<AnalyticsEditBotUseCase> provideAnalyticsEditBotUseCaseProvider;
        private Provider<AnalyticsEmailChangedUseCase> provideAnalyticsEmailChangedUseCaseProvider;
        private Provider<AnalyticsInteractor> provideAnalyticsInteractorProvider;
        private Provider<AnalyticsOpenSubscriptionScreenUseCase> provideAnalyticsOpenSubscriptionScreenUseCaseProvider;
        private Provider<AnalyticsRateUsModalUseCase> provideAnalyticsRateUsModalUseCaseProvider;
        private Provider<AnalyticsReviewUsModalUseCase> provideAnalyticsReviewUsModalUseCaseProvider;
        private Provider<AnimatedAvatarFeatureToggle> provideAnimatedAvatarFeatureToggleProvider;
        private Provider<AnalyticsSender> provideAnnalsTrackerAnalyticsSenderProvider;
        private Provider<AppCompatActivity> provideAppCompatActivityProvider;
        private Provider<AppConfigLocalDataSource> provideAppConfigLocalDataSourceProvider;
        private Provider<AppConfigRepository> provideAppConfigRepositoryProvider;
        private Provider<AppEventsEmitter> provideAppEventsEmitterProvider;
        private Provider<FlowObserver<AppEvents>> provideAppEventsFlowProvider;
        private Provider<AppEventsObserver> provideAppEventsObserverProvider;
        private Provider<AppFlowCoordinator> provideAppFlowCoordinatorProvider;
        private Provider<AppIdentityConverter> provideAppIdentityConverterProvider;
        private Provider<AppImageLoaderRepository> provideAppImageLoaderRepositoryProvider;
        private Provider<AppInfoProvider> provideAppInfoProvider;
        private Provider<AppLoggerInteractor> provideAppLoggerInteractorProvider;
        private Provider<AppUpdateManager> provideAppUpdateManagerProvider;
        private Provider<AnalyticsSender> provideAppsFlyerAnalyticsSenderProvider;
        private Provider<AudioMessageRepository> provideAudioMessageRepositoryProvider;
        private Provider<BotAudioMessageUrlGenerator> provideAudioMessageUrlGeneratorProvider;
        private Provider<AuthDataProvider> provideAuthDataProvider;
        private Provider<AuthDataStorage> provideAuthDataStorageProvider;
        private Provider<AuthInteractor> provideAuthInteractorProvider;
        private Provider<AuthLocalDataSource> provideAuthLocalDataSourceProvider;
        private Provider<AvatarAnimationEnabledStorage> provideAvatarAnimationEnabledStorageProvider;
        private Provider<BillingInteractor> provideBillingInteractorProvider;
        private Provider<BillingPurchasesHistory> provideBillingPurchasesHistoryProvider;
        private Provider<BotRepository> provideBotRepositoryProvider;
        private Provider<BuyChatMessagesRepository> provideBuyChatMessagesRepositoryProvider;
        private Provider<CallsApiService> provideCallsApiServiceProvider;
        private Provider<ChangeBotAgeUseCase> provideChangeBotAgeUseCaseProvider;
        private Provider<ChangeBotEthnicityUseCase> provideChangeBotEthnicityUseCaseProvider;
        private Provider<ChangeBotGenderUseCase> provideChangeBotGenderUseCaseProvider;
        private Provider<ChangeBotNameUseCase> provideChangeBotNameUseCaseProvider;
        private Provider<ChangeBotPersonalityUseCase> provideChangeBotPersonalityUseCaseProvider;
        private Provider<ChangeBotVoiceUseCase> provideChangeBotVoiceUseCaseProvider;
        private Provider<ChangeUserAgeUseCase> provideChangeUserAgeUseCaseProvider;
        private Provider<ChangeUserGenderUseCase> provideChangeUserGenderUseCaseProvider;
        private Provider<ChangeUserNameUseCase> provideChangeUserNameUseCaseProvider;
        private Provider<ChatAnalytics> provideChatAnalyticsProvider;
        private Provider<ChatMessagesApi> provideChatApiProvider;
        private Provider<CoroutineScope> provideChatCoroutineScopeProvider;
        private Provider<FlowObserverEmitter<ChatEvents>> provideChatEventsEmitterProvider;
        private Provider<FlowObserver<ChatEvents>> provideChatEventsFlowProvider;
        private Provider<ChatEventsObserver> provideChatEventsObserverProvider;
        private Provider<ChatGiftsRepository> provideChatGiftsRepositoryProvider;
        private Provider<ChatNotificationsRepository> provideChatNotificationsRepositoryProvider;
        private Provider<ChatProcess> provideChatProcessProvider;
        private Provider<ChatSubscriptionRepository> provideChatSubscriptionRepositoryProvider;
        private Provider<ChatSystemsFactory> provideChatSystemsFactoryProvider;
        private Provider<ChatsInfoConfigurationRepository> provideChatsInfoConfigurationRepositoryProvider;
        private Provider<ChatsInfoRepository> provideChatsInfoRepositoryProvider;
        private Provider<ChatsRepository> provideChatsRepositoryProvider;
        private Provider<ClearBadgesUseCase> provideClearBadgesUseCaseProvider;
        private Provider<ChatConfigsMemoryCachedSource> provideConfigurationBotsMemoryCachedSourceProvider;
        private Provider<ConfirmEmailFeatureToggle> provideConfirmEmailFeatureToggleProvider;
        private Provider<Context> provideContextProvider;
        private Provider<CoreExecuteCatching> provideCoreExecuteCatchingProvider;
        private Provider<CoroutineDispatchers> provideCoroutineDispatchersProvider;
        private Provider<CoroutineScope> provideCoroutineScopeProvider;
        private Provider<DeepLinksRepository> provideDeepLinksRepositoryProvider;
        private Provider<DeleteUserUseCase> provideDeleteUserUseCaseProvider;
        private Provider<DiaryNotesService> provideDiaryNotesServiceProvider;
        private Provider<DiaryRepository> provideDiaryRepositoryProvider;
        private Provider<DispatcherProvider> provideDispatcherProvider;
        private Provider<EventDelayStorage> provideEventDelayStorageProvider;
        private Provider<FlowObserverEmitter<Throwable>> provideExceptionsEmitterProvider;
        private Provider<FlowObserver<Throwable>> provideExceptionsFlowProvider;
        private Provider<ExceptionsObserver> provideExceptionsObserverProvider;
        private Provider<UserGuideRepository> provideFeatureExplanationRepoProvider;
        private Provider<FeatureTogglePayloadsRepository> provideFeatureTogglePayloadsRepositoryProvider;
        private Provider<FeatureToggleRepository> provideFeatureToggleRepositoryProvider;
        private Provider<AnalyticsSender> provideFirebaseAnalyticsSenderProvider;
        private Provider<FirebaseApiRepository> provideFirebaseProcessProvider;
        private Provider<FirebaseSubscribeUseCase> provideFirebaseSubscribeUseCaseProvider;
        private Provider<GenerateBotAvatarRepository> provideGenerateBotAvatarRepositoryProvider;
        private Provider<GenerateBotAvatarScreenFactory> provideGenerateBotAvatarRouteFactoryProvider;
        private Provider<GetBotUseCase> provideGetBotUseCaseProvider;
        private Provider<GetDiaryNotesListUseCase> provideGetDiaryNotesUseCaseProvider;
        private Provider<GetUserUseCase> provideGetUserUseCaseProvider;
        private Provider<GlobalSendingMessageResultPublisher> provideGlobalSendingMessageResultPublisherProvider;
        private Provider<InAppUpdateRepository> provideInAppUpdateRepositoryProvider;
        private Provider<InfoOnboardingRepository> provideInfoOnboardingRepositoryProvider;
        private Provider<InternalNotificationHandler> provideInternalNotificationHandlerProvider;
        private Provider<InternalNotificationsQueue> provideInternalNotificationsQueueProvider;
        private Provider<GetLevelInfoUseCase> provideLevelsInfoUseCaseProvider;
        private Provider<LevelsRepository> provideLevelsRepositoryProvider;
        private Provider<LiveChatMessagesFlow> provideLiveChatMessagesFlowProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<LongTermNotificationManager> provideLongTermNotificationManagerProvider;
        private Provider<MediaPlayerPlaybackControllerGenerator> provideMediaPlayerPlaybackControllerGeneratorProvider;
        private Provider<MessagesSource> provideMessagesSourceProvider;
        private Provider<NeuronsCostsStorage> provideNeuronsCostsStorageProvider;
        private Provider<FeatureToggle> provideNeuronsFeatureToggleProvider;
        private Provider<OnDiaryShownUseCase> provideOnDiaryShownUseCaseProvider;
        private Provider<OnUserRatedAppUseCase> provideOnUserRateUsUseCaseProvider;
        private Provider<OnboardingAnswersRepository> provideOnboardingAnswersRepositoryProvider;
        private Provider<OnboardingChatConfigsMemoryCachedSource> provideOnboardingChatConfigsMemoryCachedSourceProvider;
        private Provider<OpenGenerateBotAvatarUseCase> provideOpenGenerateBotAvatarUseCaseProvider;
        private Provider<PaymentResultEmitter> providePaymentResultEmitterProvider;
        private Provider<PaymentResultFlow> providePaymentResultFlowProvider;
        private Provider<PaymentResultObserver> providePaymentResultObserverProvider;
        private Provider<PermissionProvider> providePermissionProvider;
        private Provider<PremiumAppIconManager> providePremiumAppIconManagerProvider;
        private Provider<QueuedMessageToEntityMapper> provideQueuedMessageToEntityMapperProvider;
        private Provider<RateAndReviewUsToggle> provideRateAndReviewUsToggleProvider;
        private Provider<RateAppShowingPlanner> provideRateAppShowingPlannerProvider;
        private Provider<RateUsRepository> provideRateUsRepositoryProvider;
        private Provider<RateUsStateStorage> provideRateUsStateStorageProvider;
        private Provider<RefreshDiaryUseCase> provideRefreshDiaryUseCaseProvider;
        private Provider<ReplyDiaryNoteUseCase> provideReplyDiaryNoteUseCaseProvider;
        private Provider<ResetAiApiDelegate> provideResetAiApiDelegateProvider;
        private Provider<ResetAiUseCase> provideResetAiUseCaseProvider;
        private Provider<ResourceProvider> provideResourceProvider;
        private Provider<Resources> provideResourcesProvider;
        private Provider<Retrofit> provideRetrofitProvider;
        private Provider<SendConfirmationEmailUseCase> provideSendConfirmationEmailUseCaseProvider;
        private Provider<SextingRequestApi> provideSextingRequestApiProvider;
        private Provider<ShouldReloadMessagesUseCase> provideShouldReloadMessagesUseCaseProvider;
        private Provider<ShowRateAppAfterPurchaseUseCase> provideShowRateAppAfterPurchaseUseCaseProvider;
        private Provider<ShowRateUsUseCase> provideShowRateUsUseCaseProvider;
        private Provider<SignInWithTokenUseCase> provideSignInUseCaseProvider;
        private Provider<TagsProvider> provideTagsProvider;
        private Provider<TextToSpeechStream> provideTextToSpeechStreamProvider;
        private Provider<UserTokenProvider> provideTokenProvider;
        private Provider<UserTokenStorage> provideTokenStorageProvider;
        private Provider<TopicsApi> provideTopicsApiProvider;
        private Provider<UserApi> provideUserApiProvider;
        private Provider<UserApiService> provideUserApiServiceProvider;
        private Provider<UserAudioMessageUrlGenerator> provideUserAudioMessageUrlGeneratorProvider;
        private Provider<UserProfileRepository> provideUserConfigRepositoryProvider;
        private Provider<UserOffersRepository> provideUserOffersRepositoryProvider;
        private Provider<UserRepository> provideUserRepositoryProvider;
        private Provider<Preferences> provideUserSessionSharedPreferencesProvider;
        private Provider<Preferences> provideUserSharedPreferencesProvider;
        private Provider<UserSubscriptionsBroadcast> provideUserSubscriptionsBroadcastProvider;
        private Provider<ValidateAgeUseCase> provideValidateAgeUseCaseProvider;
        private Provider<ValidateNameUseCase> provideValidateNameUseCaseProvider;
        private Provider<VoiceRecognitionStreaming> provideVoiceRecognitionStreamingProvider;
        private Provider<PurchaseInfoDelegateImpl> purchaseInfoDelegateImplProvider;
        private Provider<RateAppViewModel> rateAppViewModelProvider;
        private Provider<RequestSextingPopupDelegate> requestSextingPopupDelegateProvider;
        private Provider<ResetViewModel> resetViewModelProvider;
        private Provider<RouterProvider> routerProvider;
        private Provider<Lifecycle> screenLifecycleProvider;
        private Provider<SelectGeneratedAvatarViewModel> selectGeneratedAvatarViewModelProvider;
        private Provider<SendingMessagesQueueImpl> sendingMessagesQueueImplProvider;
        private Provider<SextingRequestToggle> sextingRequestToggleProvider;
        private Provider<SextingRequestor> sextingRequestorProvider;
        private Provider<ShowSextingRequestSystem> showSextingRequestSystemProvider;
        private Provider<StartChatFlowDelegateImpl> startChatFlowDelegateImplProvider;
        private Provider<UpdatePromptInteractor> updatePromptInteractorProvider;
        private Provider<UserAgeViewModel> userAgeViewModelProvider;
        private Provider<UserBalanceRepositoryImpl> userBalanceRepositoryImplProvider;
        private Provider<UserBalanceServiceImpl> userBalanceServiceImplProvider;
        private Provider<UserGenderViewModel> userGenderViewModelProvider;
        private Provider<UserNameViewModel> userNameViewModelProvider;
        private Provider<UserPreferencesChatHistory> userPreferencesChatHistoryProvider;
        private Provider<UserProfileDeleteViewModel> userProfileDeleteViewModelProvider;
        private Provider<UserProfileViewModel> userProfileViewModelProvider;

        private ChatComponentImpl(ActivityModule activityModule, ChatApiModule chatApiModule, AuthModule authModule, ChatModule chatModule, PremiumIconManagerModule premiumIconManagerModule, AnalyticUseCasesModule analyticUseCasesModule, AppEventsObserverModule appEventsObserverModule, ChatEventsObserverModule chatEventsObserverModule, AppExceptionsObserverModule appExceptionsObserverModule, BaseComponent baseComponent, BaseActivity baseActivity, Lifecycle lifecycle, Context context) {
            this.chatComponentImpl = this;
            this.baseComponent = baseComponent;
            this.analyticUseCasesModule = analyticUseCasesModule;
            this.activity = baseActivity;
            initialize(activityModule, chatApiModule, authModule, chatModule, premiumIconManagerModule, analyticUseCasesModule, appEventsObserverModule, chatEventsObserverModule, appExceptionsObserverModule, baseComponent, baseActivity, lifecycle, context);
            initialize2(activityModule, chatApiModule, authModule, chatModule, premiumIconManagerModule, analyticUseCasesModule, appEventsObserverModule, chatEventsObserverModule, appExceptionsObserverModule, baseComponent, baseActivity, lifecycle, context);
            initialize3(activityModule, chatApiModule, authModule, chatModule, premiumIconManagerModule, analyticUseCasesModule, appEventsObserverModule, chatEventsObserverModule, appExceptionsObserverModule, baseComponent, baseActivity, lifecycle, context);
            initialize4(activityModule, chatApiModule, authModule, chatModule, premiumIconManagerModule, analyticUseCasesModule, appEventsObserverModule, chatEventsObserverModule, appExceptionsObserverModule, baseComponent, baseActivity, lifecycle, context);
        }

        private NoInternetPopupDelegate noInternetPopupDelegate() {
            return new NoInternetPopupDelegate((PopupFragmentFactory) Preconditions.checkNotNullFromComponent(this.baseComponent.popupFragmentFactory()), (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
        }

        private Map<Class<? extends ViewModel>, Provider<ViewModel>> mapOfClassOfAndProviderOfViewModel() {
            return ImmutableMap.builderWithExpectedSize(28).put(AppViewModel.class, this.appViewModelProvider).put(HomeViewModel.class, this.homeViewModelProvider).put(BotProfileViewModel.class, this.botProfileViewModelProvider).put(LevelPopupViewModel.class, this.levelPopupViewModelProvider).put(BotNameViewModel.class, this.botNameViewModelProvider).put(BotAgeViewModel.class, this.botAgeViewModelProvider).put(BotGenderViewModel.class, this.botGenderViewModelProvider).put(BotEthnicityViewModel.class, this.botEthnicityViewModelProvider).put(BotPersonalityViewModel.class, this.botPersonalityViewModelProvider).put(BotVoiceViewModel.class, this.botVoiceViewModelProvider).put(ResetViewModel.class, this.resetViewModelProvider).put(UserProfileViewModel.class, this.userProfileViewModelProvider).put(UserNameViewModel.class, this.userNameViewModelProvider).put(UserGenderViewModel.class, this.userGenderViewModelProvider).put(UserAgeViewModel.class, this.userAgeViewModelProvider).put(ChangeAppIconViewModel.class, this.changeAppIconViewModelProvider).put(UserProfileDeleteViewModel.class, this.userProfileDeleteViewModelProvider).put(PreviewSendImageViewModel.class, this.previewSendImageViewModelProvider).put(ConfirmEmailViewModel.class, this.confirmEmailViewModelProvider).put(ChangeEmailViewModel.class, this.changeEmailViewModelProvider).put(GenerateBotAvatarViewModel.class, this.generateBotAvatarViewModelProvider).put(GeneratingBotAvatarPlaceholderViewModel.class, this.generatingBotAvatarPlaceholderViewModelProvider).put(SelectGeneratedAvatarViewModel.class, this.selectGeneratedAvatarViewModelProvider).put(GenerateBotAvatarErrorViewModel.class, this.generateBotAvatarErrorViewModelProvider).put(RateAppViewModel.class, this.rateAppViewModelProvider).put(LightDiaryViewModel.class, this.lightDiaryViewModelProvider).put(DarkDiaryViewModel.class, this.darkDiaryViewModelProvider).put(InfoOnboardingViewModel.class, this.infoOnboardingViewModelProvider).build();
        }

        private ViewModelFactory viewModelFactory() {
            return new ViewModelFactory(mapOfClassOfAndProviderOfViewModel());
        }

        private ChatGiftsStoreToggle chatGiftsStoreToggle() {
            return new ChatGiftsStoreToggle((AppConfigLocalDataSource) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppConfigLocalDataSource()), (CoroutineScope) Preconditions.checkNotNullFromComponent(this.baseComponent.provideCoroutineScope()));
        }

        private ChatClientInteractor chatClientInteractor() {
            return new ChatClientInteractor(this.bindsChatsClientRepositoryProvider.get());
        }

        private ChatGiftsUseCase chatGiftsUseCase() {
            return new ChatGiftsUseCase((UserRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserRepository()), (ChatGiftsRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatGiftsRepository()), this.bindsUserBalanceRepositoryProvider.get(), chatClientInteractor());
        }

        private ChatGiftAnalytics chatGiftAnalytics() {
            return new ChatGiftAnalytics((AnalyticsInteractor) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAnalyticsInteractor()));
        }

        private CheckChatPermissionsUseCase checkChatPermissionsUseCase() {
            return new CheckChatPermissionsUseCase((ChatsInfoRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatsInfoRepository()));
        }

        private ChatGiftsDelegateImpl chatGiftsDelegateImpl() {
            return new ChatGiftsDelegateImpl(chatGiftsStoreToggle(), chatGiftsUseCase(), new ChatGiftsMapper(), chatGiftAnalytics(), this.provideAppEventsEmitterProvider.get(), checkChatPermissionsUseCase(), (BotRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideBotRepository()));
        }

        private IsMultiChatEnabledUseCase isMultiChatEnabledUseCase() {
            return new IsMultiChatEnabledUseCase((BotRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideBotRepository()));
        }

        private GetActiveChattingChatsUseCase getActiveChattingChatsUseCase() {
            return new GetActiveChattingChatsUseCase((ChatsInfoRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatsInfoRepository()));
        }

        private ChatsRefreshConfigurationUseCase chatsRefreshConfigurationUseCase() {
            return new ChatsRefreshConfigurationUseCase((ChatConfigsMemoryCachedSource) Preconditions.checkNotNullFromComponent(this.baseComponent.provideConfigurationBotsMemoryCachedSource()), (ChatsInfoRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatsInfoRepository()), (UserRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserRepository()), (ChatSubscriptionRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatSubscriptionRepository()));
        }

        private ActivateNewChatUseCase activateNewChatUseCase() {
            return new ActivateNewChatUseCase((ChatsInfoRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatsInfoRepository()), chatsRefreshConfigurationUseCase());
        }

        private ChatsInfoInteractor chatsInfoInteractor() {
            return new ChatsInfoInteractor((ChatsInfoRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatsInfoRepository()), this.bindsChatsClientRepositoryProvider.get(), (UserRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserRepository()), (ChatsInfoConfigurationRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatsInfoConfigurationRepository()), isMultiChatEnabledUseCase(), getActiveChattingChatsUseCase(), activateNewChatUseCase());
        }

        private ChatHandleDeepLinksDelegateImpl chatHandleDeepLinksDelegateImpl() {
            return new ChatHandleDeepLinksDelegateImpl((DeepLinksRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDeepLinksRepository()), this.provideAppEventsEmitterProvider.get(), chatsInfoInteractor());
        }

        private AnalyticsNotificationPermissionChangedUseCase analyticsNotificationPermissionChangedUseCase() {
            return AnalyticUseCasesModule_ProvideAnalyticsNotificationPermissionChangedUseCaseFactory.provideAnalyticsNotificationPermissionChangedUseCase(this.analyticUseCasesModule, (AnalyticsSender) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAnnalsTrackerAnalyticsSender()));
        }

        private RateAppPopupDelegate rateAppPopupDelegate() {
            return new RateAppPopupDelegate(this.activity, (PopupFragmentFactory) Preconditions.checkNotNullFromComponent(this.baseComponent.popupFragmentFactory()), (PopupModelFactory) Preconditions.checkNotNullFromComponent(this.baseComponent.popupModelFactory()), (ShowRateUsUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideShowRateUsUseCase()));
        }

        private AnalyticsRateUsModalUseCase analyticsRateUsModalUseCase() {
            return AnalyticUseCasesModule_ProvideAnalyticsRateUsModalUseCaseFactory.provideAnalyticsRateUsModalUseCase(this.analyticUseCasesModule, (AnalyticsSender) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAnnalsTrackerAnalyticsSender()));
        }

        private BuyChatMessagesInteractor buyChatMessagesInteractor() {
            return new BuyChatMessagesInteractor((BuyChatMessagesRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideBuyChatMessagesRepository()));
        }

        private ChatMessageAccessInteractor chatMessageAccessInteractor() {
            return new ChatMessageAccessInteractor((UserRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserRepository()), chatsInfoInteractor(), this.bindsUserBalanceRepositoryProvider.get(), (AppImageLoaderRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppImageLoaderRepository()), chatClientInteractor(), buyChatMessagesInteractor());
        }

        private ChatNotificationsUiMapper chatNotificationsUiMapper() {
            return new ChatNotificationsUiMapper((ResourceProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideResourceProvider()), chatMessageAccessInteractor());
        }

        private ChatScreenAnalyticsUseCase chatScreenAnalyticsUseCase() {
            return AnalyticUseCasesModule_ProvideChatScreenAnalyticsUseCaseFactory.provideChatScreenAnalyticsUseCase(this.analyticUseCasesModule, (AppIdentityConverter) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppIdentityConverter()), (AnalyticsSender) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAnnalsTrackerAnalyticsSender()));
        }

        private GeneratedChatAvatarInteractor generatedChatAvatarInteractor() {
            return new GeneratedChatAvatarInteractor((BotRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideBotRepository()), (AvatarAnimationEnabledStorage) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAvatarAnimationEnabledStorage()), chatsInfoInteractor(), (GenerateBotAvatarRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideGenerateBotAvatarRepository()), (FeatureToggleRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideFeatureToggleRepository()));
        }

        private ChatNotificationsDelegateImpl chatNotificationsDelegateImpl() {
            return new ChatNotificationsDelegateImpl((ChatNotificationsRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatNotificationsRepository()), chatNotificationsUiMapper(), chatScreenAnalyticsUseCase(), (DispatcherProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDispatcherProvider()), generatedChatAvatarInteractor());
        }

        private AppConfigUseCase appConfigUseCase() {
            return new AppConfigUseCase((AppConfigRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppConfigRepository()));
        }

        private EmailConfirmDelegateImpl emailConfirmDelegateImpl() {
            return new EmailConfirmDelegateImpl((ConfirmEmailFeatureToggle) Preconditions.checkNotNullFromComponent(this.baseComponent.provideConfirmEmailFeatureToggle()), appConfigUseCase(), (UserRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserRepository()), (TagsProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideTagsProvider()));
        }

        private ProfileMenuDelegateImpl profileMenuDelegateImpl() {
            return new ProfileMenuDelegateImpl((FeatureToggle) Preconditions.checkNotNullFromComponent(this.baseComponent.provideNeuronsFeatureToggle()), this.bindsUserBalanceRepositoryProvider.get(), (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()), (UserRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserRepository()), chatsInfoInteractor(), emailConfirmDelegateImpl());
        }

        private ChatBackgroundUseCase chatBackgroundUseCase() {
            return new ChatBackgroundUseCase((ChatBackgroundRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatBackgroundRepository()), chatsInfoInteractor(), (ChatVideoBackgroundFeatureToggle) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatVideoBackgroundFeatureToggle()), (BotRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideBotRepository()));
        }

        private ChatsConfigurationInteractor chatsConfigurationInteractor() {
            return new ChatsConfigurationInteractor((ChatsInfoRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatsInfoRepository()), (ChatConfigsMemoryCachedSource) Preconditions.checkNotNullFromComponent(this.baseComponent.provideConfigurationBotsMemoryCachedSource()));
        }

        private ChatBackgroundDelegateImpl chatBackgroundDelegateImpl() {
            return new ChatBackgroundDelegateImpl(chatBackgroundUseCase(), (LiveChatMessagesFlow) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLiveChatMessagesFlow()), (DiaryNoteReplier) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDiaryNoteReplier()), (UserRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserRepository()), checkChatPermissionsUseCase(), chatsConfigurationInteractor());
        }

        private BotHaveUpdateUseCase botHaveUpdateUseCase() {
            return new BotHaveUpdateUseCase((LongTermNotificationManager) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLongTermNotificationManager()), (CoroutineDispatchers) Preconditions.checkNotNullFromComponent(this.baseComponent.provideCoroutineDispatchers()));
        }

        private ChatHeaderDelegateImpl chatHeaderDelegateImpl() {
            return new ChatHeaderDelegateImpl(this.provideResourcesProvider.get(), (GetLevelInfoUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLevelsInfoUseCase()), botHaveUpdateUseCase(), chatsInfoInteractor(), this.bindsUserBalanceRepositoryProvider.get(), emailConfirmDelegateImpl(), (FeatureToggleRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideFeatureToggleRepository()), (GenerateBotAvatarRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideGenerateBotAvatarRepository()), new ChatAvatarMapper(), generatedChatAvatarInteractor());
        }

        private ChatSubscriptionInteractor chatSubscriptionInteractor() {
            return new ChatSubscriptionInteractor((ChatsInfoRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatsInfoRepository()), chatClientInteractor(), (ChatSubscriptionRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatSubscriptionRepository()));
        }

        private ChatPaidActionsDelegateImpl chatPaidActionsDelegateImpl() {
            return new ChatPaidActionsDelegateImpl(chatsInfoInteractor(), (DispatcherProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDispatcherProvider()), this.provideExceptionsEmitterProvider.get(), chatSubscriptionInteractor(), this.provideAppEventsEmitterProvider.get());
        }

        private ChatProfileActionDelegateImpl chatProfileActionDelegateImpl() {
            return new ChatProfileActionDelegateImpl(botHaveUpdateUseCase(), chatScreenAnalyticsUseCase());
        }

        private GetChatIntroSlidesUseCase getChatIntroSlidesUseCase() {
            return new GetChatIntroSlidesUseCase((ChatIntroRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatIntroRepository()));
        }

        private ChatIntroAnalyticsInteractor chatIntroAnalyticsInteractor() {
            return new ChatIntroAnalyticsInteractor((AppIdentityConverter) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppIdentityConverter()));
        }

        private ChatIntroDelegateImpl chatIntroDelegateImpl() {
            return new ChatIntroDelegateImpl(chatsConfigurationInteractor(), getChatIntroSlidesUseCase(), chatIntroAnalyticsInteractor());
        }

        private ChatIdConditionsCheckerUseCase chatIdConditionsCheckerUseCase() {
            return new ChatIdConditionsCheckerUseCase((ChatsInfoRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatsInfoRepository()), (FeatureTogglePayloadsRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideFeatureTogglePayloadsRepository()), (AnalyticsInteractor) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAnalyticsInteractor()));
        }

        private IsChatFeatureAvailableUseCase isChatFeatureAvailableUseCase() {
            return new IsChatFeatureAvailableUseCase((FeatureToggleRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideFeatureToggleRepository()), chatIdConditionsCheckerUseCase());
        }

        private ChatPanelActionsInteractor chatPanelActionsInteractor() {
            return new ChatPanelActionsInteractor(this.bindsChatTopicsRepositoryProvider.get(), this.bindsChatPremiumTopicsRepositoryProvider.get(), (DiaryNotesService) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDiaryNotesService()), (GetLevelInfoUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLevelsInfoUseCase()), isChatFeatureAvailableUseCase());
        }

        private ChatTopicMapperUi chatTopicMapperUi() {
            return new ChatTopicMapperUi(new TopicIconMapperUi());
        }

        private ChatPremiumTopicMapperUi chatPremiumTopicMapperUi() {
            return new ChatPremiumTopicMapperUi(new TopicIconMapperUi());
        }

        private TopicPopupDataMapperUi topicPopupDataMapperUi() {
            return new TopicPopupDataMapperUi(new TopicImageMapperUi());
        }

        private ChatTopicsAnalytics chatTopicsAnalytics() {
            return new ChatTopicsAnalytics((AnalyticsEngine) Preconditions.checkNotNullFromComponent(this.baseComponent.analyticsEngine()));
        }

        private ChatEventsInteractor chatEventsInteractor() {
            return new ChatEventsInteractor((MessagesSource) Preconditions.checkNotNullFromComponent(this.baseComponent.provideMessagesSource()));
        }

        private ChatCallsInteractor chatCallsInteractor() {
            return new ChatCallsInteractor(this.bindsChatCallsRepositoryProvider.get(), isChatFeatureAvailableUseCase());
        }

        private ChatCallAnalytics chatCallAnalytics() {
            return new ChatCallAnalytics((AnalyticsInteractor) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAnalyticsInteractor()));
        }

        private ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl() {
            return new ChatPanelActionsDelegateImpl(chatPanelActionsInteractor(), (DispatcherProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDispatcherProvider()), chatTopicMapperUi(), chatPremiumTopicMapperUi(), topicPopupDataMapperUi(), this.provideExceptionsEmitterProvider.get(), (AppIdentityConverter) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppIdentityConverter()), chatTopicsAnalytics(), (BotRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideBotRepository()), chatsInfoInteractor(), (InternalNotificationHandler) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandler()), chatEventsInteractor(), chatCallsInteractor(), this.provideAppEventsEmitterProvider.get(), this.providePaymentResultFlowProvider.get(), chatCallAnalytics());
        }

        private SextingMessagePaywallShowingDelegateImpl sextingMessagePaywallShowingDelegateImpl() {
            return new SextingMessagePaywallShowingDelegateImpl(chatClientInteractor(), this.provideAppEventsEmitterProvider.get(), chatMessageAccessInteractor());
        }

        private VoiceRecordingAnalytics voiceRecordingAnalytics() {
            return new VoiceRecordingAnalytics((AnalyticsInteractor) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAnalyticsInteractor()), (AppIdentityConverter) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppIdentityConverter()));
        }

        private ChatInputDelegateImpl chatInputDelegateImpl() {
            return new ChatInputDelegateImpl((ResourceProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideResourceProvider()), chatsInfoInteractor(), (AudioRecorderController) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAudioRecorderController()), (AudioRecordingStateProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAudioRecordingStateProvider()), (DispatcherProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDispatcherProvider()), this.provideExceptionsEmitterProvider.get(), chatClientInteractor(), voiceRecordingAnalytics());
        }

        private ChatSubscriptionOfferInteractor chatSubscriptionOfferInteractor() {
            return new ChatSubscriptionOfferInteractor((UserOffersRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserOffersRepository()), (UserRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserRepository()));
        }

        private ChatSubscriptionOfferDelegateImpl chatSubscriptionOfferDelegateImpl() {
            return new ChatSubscriptionOfferDelegateImpl(chatSubscriptionOfferInteractor(), this.provideAppEventsEmitterProvider.get());
        }

        private ChatRootViewModelFactory chatRootViewModelFactory() {
            return new ChatRootViewModelFactory(chatGiftsDelegateImpl(), chatHandleDeepLinksDelegateImpl(), chatsInfoInteractor(), (OnUserRatedAppUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideOnUserRateUsUseCase()), this.provideFirebaseSubscribeUseCaseProvider.get(), this.provideClearBadgesUseCaseProvider.get(), (Preferences) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserSessionSharedPreferences()), analyticsNotificationPermissionChangedUseCase(), (SendConfirmationEmailUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideSendConfirmationEmailUseCase()), rateAppPopupDelegate(), analyticsRateUsModalUseCase(), (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()), chatNotificationsDelegateImpl(), this.provideAppEventsEmitterProvider.get(), profileMenuDelegateImpl(), chatBackgroundDelegateImpl(), chatHeaderDelegateImpl(), chatScreenAnalyticsUseCase(), this.factoryProvider5.get(), this.provideChatEventsFlowProvider.get(), chatPaidActionsDelegateImpl(), chatProfileActionDelegateImpl(), chatIntroDelegateImpl(), chatPanelActionsDelegateImpl(), sextingMessagePaywallShowingDelegateImpl(), chatInputDelegateImpl(), voiceRecordingAnalytics(), chatClientInteractor(), (DispatcherProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDispatcherProvider()), (AnalyticsInteractor) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAnalyticsInteractor()), this.factoryProvider6.get(), chatSubscriptionOfferDelegateImpl(), this.factoryProvider7.get());
        }

        private IsRateAppDialogEnabledToggle isRateAppDialogEnabledToggle() {
            return new IsRateAppDialogEnabledToggle((AppConfigLocalDataSource) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppConfigLocalDataSource()), (CoroutineScope) Preconditions.checkNotNullFromComponent(this.baseComponent.provideCoroutineScope()));
        }

        private ShowRateAppDialog showRateAppDialog() {
            return new ShowRateAppDialog((RateAndReviewUsToggle) Preconditions.checkNotNullFromComponent(this.baseComponent.provideRateAndReviewUsToggle()), isRateAppDialogEnabledToggle(), (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()), rateAppPopupDelegate());
        }

        private ChooseVoicePopupDelegate chooseVoicePopupDelegate() {
            return new ChooseVoicePopupDelegate(this.activity, (PopupFragmentFactory) Preconditions.checkNotNullFromComponent(this.baseComponent.popupFragmentFactory()), (PopupModelFactory) Preconditions.checkNotNullFromComponent(this.baseComponent.popupModelFactory()));
        }

        private AudioMessageChatAnalytics audioMessageChatAnalytics() {
            return new AudioMessageChatAnalytics(this.provideChatAnalyticsProvider.get(), (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
        }

        private AnalyticsAudioAiClickConvertToTextMessageUseCase analyticsAudioAiClickConvertToTextMessageUseCase() {
            return AnalyticUseCasesModule_ProvideAnalyticsAudioAiConvertToTextMessageUseCaseFactory.provideAnalyticsAudioAiConvertToTextMessageUseCase(this.analyticUseCasesModule, (AnalyticsSender) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAnnalsTrackerAnalyticsSender()));
        }

        private OnAudioMessageClickDelegate onAudioMessageClickDelegate() {
            return new OnAudioMessageClickDelegate((CoroutineDispatchers) Preconditions.checkNotNullFromComponent(this.baseComponent.provideCoroutineDispatchers()), new ChangeVoiceScreenFactoryImpl(), (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()), analyticsAudioAiClickConvertToTextMessageUseCase(), chatClientInteractor());
        }

        private AudioPlaybackSystem audioPlaybackSystem() {
            return new AudioPlaybackSystem(this.audioPlayerProvider.get(), this.provideChatCoroutineScopeProvider.get());
        }

        private AnalyticsAudioAiShowModalUseCase analyticsAudioAiShowModalUseCase() {
            return AnalyticUseCasesModule_ProvideAnalyticsAudioAiShowModalUseCaseFactory.provideAnalyticsAudioAiShowModalUseCase(this.analyticUseCasesModule, (AnalyticsSender) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAnnalsTrackerAnalyticsSender()));
        }

        private ChangeVoiceSystem changeVoiceSystem() {
            return new ChangeVoiceSystem(this.audioPlayerProvider.get(), this.bindsChatAudioMessageFacadeProvider.get(), analyticsAudioAiShowModalUseCase(), chooseVoicePopupDelegate(), new ChangeVoiceScreenFactoryImpl(), (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()), (GetBotUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideGetBotUseCase()));
        }

        private DecodingAudioInitialStateSystem decodingAudioInitialStateSystem() {
            return new DecodingAudioInitialStateSystem((DecodedAudioMessagesRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDecodedAudioMessagesRepository()));
        }

        private DecodingAudioEventsHandlingSystem decodingAudioEventsHandlingSystem() {
            return new DecodingAudioEventsHandlingSystem((DecodedAudioMessagesRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDecodedAudioMessagesRepository()), this.provideChatCoroutineScopeProvider.get());
        }

        private ExperienceMessageAnimationSystem experienceMessageAnimationSystem() {
            return new ExperienceMessageAnimationSystem((MessagesSource) Preconditions.checkNotNullFromComponent(this.baseComponent.provideMessagesSource()), (CoroutineScope) Preconditions.checkNotNullFromComponent(this.baseComponent.provideCoroutineScope()));
        }

        private PresentationChatSystemsProvider presentationChatSystemsProvider() {
            return new PresentationChatSystemsProvider((MessagesSource) Preconditions.checkNotNullFromComponent(this.baseComponent.provideMessagesSource()), (CoroutineScope) Preconditions.checkNotNullFromComponent(this.baseComponent.provideCoroutineScope()), (AppIdentityConverter) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppIdentityConverter()));
        }

        private PresentationChatSystemsDelegate presentationChatSystemsDelegate() {
            return new PresentationChatSystemsDelegate(new LiveMessagesAnimationSystem(), new ScrollControllingSystem(), audioPlaybackSystem(), changeVoiceSystem(), decodingAudioInitialStateSystem(), decodingAudioEventsHandlingSystem(), this.showSextingRequestSystemProvider.get(), this.imagesLockerSystemProvider.get(), new DateSeparatorSystem(), experienceMessageAnimationSystem(), chatClientInteractor(), presentationChatSystemsProvider());
        }

        private ChatEntityToTextUiModelMapper chatEntityToTextUiModelMapper() {
            return new ChatEntityToTextUiModelMapper((ResourceProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideResourceProvider()), chatMessageAccessInteractor());
        }

        private ChatEntityToDateUiModelMapper chatEntityToDateUiModelMapper() {
            return new ChatEntityToDateUiModelMapper((Context) Preconditions.checkNotNullFromComponent(this.baseComponent.provideContext()));
        }

        private ChatEntityToProcessingUiModelMapper chatEntityToProcessingUiModelMapper() {
            return new ChatEntityToProcessingUiModelMapper((Context) Preconditions.checkNotNullFromComponent(this.baseComponent.provideContext()));
        }

        private ChatPhotoMessageMapper chatPhotoMessageMapper() {
            return new ChatPhotoMessageMapper(chatMessageAccessInteractor());
        }

        private ChatEntityToUiModelMapper chatEntityToUiModelMapper() {
            return new ChatEntityToUiModelMapper(new ChatEntityToAudioUiModelMapper(), new ChatEntityToGiftUiModelMapper(), chatEntityToTextUiModelMapper(), chatEntityToDateUiModelMapper(), chatEntityToProcessingUiModelMapper(), new ChatEntityToTopicSeparatorUiModelMapper(), chatPhotoMessageMapper(), chatMessageAccessInteractor());
        }

        private RegenerateChatMessageUseCase regenerateChatMessageUseCase() {
            return new RegenerateChatMessageUseCase(chatClientInteractor(), this.bindsMessageSenderProvider.get(), (DispatcherProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDispatcherProvider()));
        }

        private MessageRegenerationDelegateImpl messageRegenerationDelegateImpl() {
            return new MessageRegenerationDelegateImpl(regenerateChatMessageUseCase(), this.provideExceptionsEmitterProvider.get(), this.provideAppEventsEmitterProvider.get(), this.providePaymentResultFlowProvider.get(), (DispatcherProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDispatcherProvider()), chatEventsInteractor());
        }

        private ChatListAnalytics chatListAnalytics() {
            return new ChatListAnalytics((AnalyticsInteractor) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAnalyticsInteractor()));
        }

        private ChatViewModelFactory chatViewModelFactory() {
            return new ChatViewModelFactory(onAudioMessageClickDelegate(), presentationChatSystemsDelegate(), chatEntityToUiModelMapper(), chatClientInteractor(), (GetBotUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideGetBotUseCase()), this.provideChatEventsEmitterProvider.get(), chatsInfoInteractor(), (FeatureToggleRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideFeatureToggleRepository()), messageRegenerationDelegateImpl(), (DispatcherProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDispatcherProvider()), (GetUserUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideGetUserUseCase()), chatListAnalytics());
        }

        private GeneratingAnimatedAvatarPopupDelegate generatingAnimatedAvatarPopupDelegate() {
            return new GeneratingAnimatedAvatarPopupDelegate(this.activity, (PopupFragmentFactory) Preconditions.checkNotNullFromComponent(this.baseComponent.popupFragmentFactory()), (PopupModelFactory) Preconditions.checkNotNullFromComponent(this.baseComponent.popupModelFactory()));
        }

        private AnalyticsCheckMyInboxClickedUseCase analyticsCheckMyInboxClickedUseCase() {
            return AnalyticUseCasesModule_ProvideAnalyticsCheckMyInboxClickedUseCaseFactory.provideAnalyticsCheckMyInboxClickedUseCase(this.analyticUseCasesModule, (AnalyticsSender) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAnnalsTrackerAnalyticsSender()));
        }

        private GetAllPremiumBenefitsUseCase getAllPremiumBenefitsUseCase() {
            return new GetAllPremiumBenefitsUseCase(this.bindsBenefitsRepositoryProvider.get(), (BotRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideBotRepository()));
        }

        private OnboardingInteractor onboardingInteractor() {
            return new OnboardingInteractor((UserRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserRepository()), (BotRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideBotRepository()), (OnboardingAnswersRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideOnboardingAnswersRepository()));
        }

        private void initialize(ActivityModule activityModule, ChatApiModule chatApiModule, AuthModule authModule, ChatModule chatModule, PremiumIconManagerModule premiumIconManagerModule, AnalyticUseCasesModule analyticUseCasesModule, AppEventsObserverModule appEventsObserverModule, ChatEventsObserverModule chatEventsObserverModule, AppExceptionsObserverModule appExceptionsObserverModule, BaseComponent baseComponent, BaseActivity baseActivity, Lifecycle lifecycle, Context context) {
            this.routerProvider = new RouterProviderProvider(baseComponent);
            this.chatScreenFactoryProvider = new ChatScreenFactoryProvider(baseComponent);
            this.provideInternalNotificationHandlerProvider = new ProvideInternalNotificationHandlerProvider(baseComponent);
            this.provideGenerateBotAvatarRouteFactoryProvider = DoubleCheck.provider(GenerateAvatarModule_Companion_ProvideGenerateBotAvatarRouteFactoryFactory.create());
            this.provideAppConfigLocalDataSourceProvider = new ProvideAppConfigLocalDataSourceProvider(baseComponent);
            ProvideCoroutineScopeProvider provideCoroutineScopeProvider = new ProvideCoroutineScopeProvider(baseComponent);
            this.provideCoroutineScopeProvider = provideCoroutineScopeProvider;
            DiaryFeatureToggle_Factory create = DiaryFeatureToggle_Factory.create(this.provideAppConfigLocalDataSourceProvider, provideCoroutineScopeProvider);
            this.diaryFeatureToggleProvider = create;
            DiaryScreenFactory_Factory create2 = DiaryScreenFactory_Factory.create(create);
            this.diaryScreenFactoryProvider = create2;
            this.provideAppFlowCoordinatorProvider = DoubleCheck.provider(ActivityModule_ProvideAppFlowCoordinatorFactory.create(activityModule, this.routerProvider, this.chatScreenFactoryProvider, this.provideInternalNotificationHandlerProvider, this.provideGenerateBotAvatarRouteFactoryProvider, create2));
            this.provideChatsInfoRepositoryProvider = new ProvideChatsInfoRepositoryProvider(baseComponent);
            this.provideConfigurationBotsMemoryCachedSourceProvider = new ProvideConfigurationBotsMemoryCachedSourceProvider(baseComponent);
            ProvideFeatureExplanationRepoProvider provideFeatureExplanationRepoProvider = new ProvideFeatureExplanationRepoProvider(baseComponent);
            this.provideFeatureExplanationRepoProvider = provideFeatureExplanationRepoProvider;
            this.getChatsStoreInteractorProvider = GetChatsStoreInteractor_Factory.create(this.provideChatsInfoRepositoryProvider, this.provideConfigurationBotsMemoryCachedSourceProvider, provideFeatureExplanationRepoProvider);
            ProvideResourceProviderProvider provideResourceProviderProvider = new ProvideResourceProviderProvider(baseComponent);
            this.provideResourceProvider = provideResourceProviderProvider;
            this.chatStoreUiMapperProvider = ChatStoreUiMapper_Factory.create(provideResourceProviderProvider);
            this.provideUserApiServiceProvider = new ProvideUserApiServiceProvider(baseComponent);
            this.provideCoreExecuteCatchingProvider = new ProvideCoreExecuteCatchingProvider(baseComponent);
            ProvideAuthLocalDataSourceProvider provideAuthLocalDataSourceProvider = new ProvideAuthLocalDataSourceProvider(baseComponent);
            this.provideAuthLocalDataSourceProvider = provideAuthLocalDataSourceProvider;
            UserBalanceRepositoryImpl_Factory create3 = UserBalanceRepositoryImpl_Factory.create(this.provideUserApiServiceProvider, this.provideCoreExecuteCatchingProvider, provideAuthLocalDataSourceProvider);
            this.userBalanceRepositoryImplProvider = create3;
            this.bindsUserBalanceRepositoryProvider = DoubleCheck.provider(create3);
            Provider<AppEventsObserver> provider = DoubleCheck.provider(AppEventsObserverModule_ProvideAppEventsObserverFactory.create(appEventsObserverModule, this.provideCoroutineScopeProvider));
            this.provideAppEventsObserverProvider = provider;
            this.provideAppEventsEmitterProvider = DoubleCheck.provider(AppEventsObserverModule_ProvideAppEventsEmitterFactory.create(appEventsObserverModule, provider));
            Provider<ExceptionsObserver> provider2 = DoubleCheck.provider(AppExceptionsObserverModule_ProvideExceptionsObserverFactory.create(appExceptionsObserverModule));
            this.provideExceptionsObserverProvider = provider2;
            this.provideExceptionsEmitterProvider = DoubleCheck.provider(AppExceptionsObserverModule_ProvideExceptionsEmitterFactory.create(appExceptionsObserverModule, provider2));
            Provider<PaymentResultObserver> provider3 = DoubleCheck.provider(AppEventsObserverModule_ProvidePaymentResultObserverFactory.create(appEventsObserverModule, this.provideCoroutineScopeProvider));
            this.providePaymentResultObserverProvider = provider3;
            this.providePaymentResultFlowProvider = DoubleCheck.provider(AppEventsObserverModule_ProvidePaymentResultFlowFactory.create(appEventsObserverModule, provider3));
            this.provideUserRepositoryProvider = new ProvideUserRepositoryProvider(baseComponent);
            ProvideChatSubscriptionRepositoryProvider provideChatSubscriptionRepositoryProvider = new ProvideChatSubscriptionRepositoryProvider(baseComponent);
            this.provideChatSubscriptionRepositoryProvider = provideChatSubscriptionRepositoryProvider;
            ChatsRefreshConfigurationUseCase_Factory create4 = ChatsRefreshConfigurationUseCase_Factory.create(this.provideConfigurationBotsMemoryCachedSourceProvider, this.provideChatsInfoRepositoryProvider, this.provideUserRepositoryProvider, provideChatSubscriptionRepositoryProvider);
            this.chatsRefreshConfigurationUseCaseProvider = create4;
            this.activateNewChatUseCaseProvider = ActivateNewChatUseCase_Factory.create(this.provideChatsInfoRepositoryProvider, create4);
            ProvideChatsRepositoryProvider provideChatsRepositoryProvider = new ProvideChatsRepositoryProvider(baseComponent);
            this.provideChatsRepositoryProvider = provideChatsRepositoryProvider;
            this.buyChatInteractorProvider = BuyChatInteractor_Factory.create(this.activateNewChatUseCaseProvider, this.provideChatsInfoRepositoryProvider, this.bindsUserBalanceRepositoryProvider, provideChatsRepositoryProvider);
            ProvideAppIdentityConverterProvider provideAppIdentityConverterProvider = new ProvideAppIdentityConverterProvider(baseComponent);
            this.provideAppIdentityConverterProvider = provideAppIdentityConverterProvider;
            ChatsStoreAnalyticsInteractor_Factory create5 = ChatsStoreAnalyticsInteractor_Factory.create(provideAppIdentityConverterProvider);
            this.chatsStoreAnalyticsInteractorProvider = create5;
            C0210ChatsStoreViewModelFactory_Factory create6 = C0210ChatsStoreViewModelFactory_Factory.create(this.getChatsStoreInteractorProvider, this.chatStoreUiMapperProvider, this.bindsUserBalanceRepositoryProvider, this.provideAppEventsEmitterProvider, this.provideExceptionsEmitterProvider, this.providePaymentResultFlowProvider, this.buyChatInteractorProvider, this.provideResourceProvider, create5);
            this.chatsStoreViewModelFactoryProvider = create6;
            this.factoryProvider = ChatsStoreViewModelFactory_Factory_Impl.create(create6);
            ProvideLevelsInfoUseCaseProvider provideLevelsInfoUseCaseProvider = new ProvideLevelsInfoUseCaseProvider(baseComponent);
            this.provideLevelsInfoUseCaseProvider = provideLevelsInfoUseCaseProvider;
            this.chatSettingsLevelsDelegateImplProvider = ChatSettingsLevelsDelegateImpl_Factory.create(provideLevelsInfoUseCaseProvider, this.provideExceptionsEmitterProvider);
            this.chatsConfigurationInteractorProvider = ChatsConfigurationInteractor_Factory.create(this.provideChatsInfoRepositoryProvider, this.provideConfigurationBotsMemoryCachedSourceProvider);
            this.genderMapperProvider = GenderMapper_Factory.create(this.provideResourceProvider);
            PersonalityMapper_Factory create7 = PersonalityMapper_Factory.create(this.provideResourceProvider);
            this.personalityMapperProvider = create7;
            this.chatSettingsActionTagsMapperUiProvider = ChatSettingsActionTagsMapperUi_Factory.create(this.genderMapperProvider, create7);
            ProvideLoggerProvider provideLoggerProvider = new ProvideLoggerProvider(baseComponent);
            this.provideLoggerProvider = provideLoggerProvider;
            this.provideChatCoroutineScopeProvider = DoubleCheck.provider(ChatDomainModule_Companion_ProvideChatCoroutineScopeFactory.create(provideLoggerProvider));
            this.provideUserSubscriptionsBroadcastProvider = new ProvideUserSubscriptionsBroadcastProvider(baseComponent);
            this.provideMessagesSourceProvider = new ProvideMessagesSourceProvider(baseComponent);
            ProvideAuthDataProviderProvider provideAuthDataProviderProvider = new ProvideAuthDataProviderProvider(baseComponent);
            this.provideAuthDataProvider = provideAuthDataProviderProvider;
            MessageToSendToQueuedMessageMapper_Factory create8 = MessageToSendToQueuedMessageMapper_Factory.create(provideAuthDataProviderProvider);
            this.messageToSendToQueuedMessageMapperProvider = create8;
            Provider<DoubleSuspendMapper<MessageToSend, String, SendingMessagesQueue.QueuedMessage>> provider4 = DoubleCheck.provider(create8);
            this.bindsMessageToSendToQueuedMessageMapperProvider = provider4;
            SendingMessagesQueueImpl_Factory create9 = SendingMessagesQueueImpl_Factory.create(provider4);
            this.sendingMessagesQueueImplProvider = create9;
            this.bindsSendingMessagesQueueProvider = DoubleCheck.provider(create9);
            this.provideQueuedMessageToEntityMapperProvider = DoubleCheck.provider(SendingMessagesModule_Companion_ProvideQueuedMessageToEntityMapperFactory.create(this.provideAuthDataProvider));
            this.provideLiveChatMessagesFlowProvider = new ProvideLiveChatMessagesFlowProvider(baseComponent);
            this.provideGlobalSendingMessageResultPublisherProvider = DoubleCheck.provider(SendingMessagesModule_Companion_ProvideGlobalSendingMessageResultPublisherFactory.create());
            this.provideShowRateUsUseCaseProvider = new ProvideShowRateUsUseCaseProvider(baseComponent);
            this.provideCoroutineDispatchersProvider = new ProvideCoroutineDispatchersProvider(baseComponent);
            ProvideChatApiProvider provideChatApiProvider = new ProvideChatApiProvider(baseComponent);
            this.provideChatApiProvider = provideChatApiProvider;
            this.chatMessagesRemoteDataSourceProvider = ChatMessagesRemoteDataSource_Factory.create(provideChatApiProvider, this.provideAuthLocalDataSourceProvider);
            this.chatMessageInfoMapperProvider = ChatMessageInfoMapper_Factory.create(this.provideAuthLocalDataSourceProvider);
            this.provideAudioMessageUrlGeneratorProvider = new ProvideAudioMessageUrlGeneratorProvider(baseComponent);
            ProvideUserAudioMessageUrlGeneratorProvider provideUserAudioMessageUrlGeneratorProvider = new ProvideUserAudioMessageUrlGeneratorProvider(baseComponent);
            this.provideUserAudioMessageUrlGeneratorProvider = provideUserAudioMessageUrlGeneratorProvider;
            this.chatAudioContentMessageMapperProvider = ChatAudioContentMessageMapper_Factory.create(this.provideAudioMessageUrlGeneratorProvider, provideUserAudioMessageUrlGeneratorProvider);
            GetAppConfigStorageProvider getAppConfigStorageProvider = new GetAppConfigStorageProvider(baseComponent);
            this.getAppConfigStorageProvider = getAppConfigStorageProvider;
            ChatImageUrlMapper_Factory create10 = ChatImageUrlMapper_Factory.create(getAppConfigStorageProvider, this.provideAuthDataProvider);
            this.chatImageUrlMapperProvider = create10;
            this.chatImageContentMessageMapperProvider = ChatImageContentMessageMapper_Factory.create(create10, this.getAppConfigStorageProvider);
            this.chatUserImageContentMessageMapperProvider = ChatUserImageContentMessageMapper_Factory.create(this.chatImageUrlMapperProvider);
            this.chatGiftContentMessageMapperProvider = ChatGiftContentMessageMapper_Factory.create(this.chatImageUrlMapperProvider);
            ChatMessageContentMapper_Factory create11 = ChatMessageContentMapper_Factory.create(this.chatAudioContentMessageMapperProvider, this.chatImageContentMessageMapperProvider, this.chatUserImageContentMessageMapperProvider, ChatTextContentMessageMapper_Factory.create(), this.chatGiftContentMessageMapperProvider);
            this.chatMessageContentMapperProvider = create11;
            this.chatMessageMapperProvider = ChatMessageMapper_Factory.create(this.chatMessageInfoMapperProvider, create11);
            ProvideDispatcherProviderProvider provideDispatcherProviderProvider = new ProvideDispatcherProviderProvider(baseComponent);
            this.provideDispatcherProvider = provideDispatcherProviderProvider;
            ChatMessagesRepositoryImpl_Factory create12 = ChatMessagesRepositoryImpl_Factory.create(this.chatMessagesRemoteDataSourceProvider, this.provideLoggerProvider, this.provideAuthDataProvider, this.chatMessageMapperProvider, this.bindsSendingMessagesQueueProvider, this.provideGlobalSendingMessageResultPublisherProvider, this.provideMessagesSourceProvider, this.provideCoroutineScopeProvider, provideDispatcherProviderProvider, this.provideCoreExecuteCatchingProvider);
            this.chatMessagesRepositoryImplProvider = create12;
            Provider<ChatMessagesRepository> provider5 = DoubleCheck.provider(create12);
            this.bindsMessageSenderProvider = provider5;
            Provider<ChatSystemsFactory> provider6 = DoubleCheck.provider(ChatDomainModule_Companion_ProvideChatSystemsFactoryFactory.create(this.provideChatCoroutineScopeProvider, this.provideUserSubscriptionsBroadcastProvider, this.provideMessagesSourceProvider, this.bindsSendingMessagesQueueProvider, this.provideQueuedMessageToEntityMapperProvider, this.provideLiveChatMessagesFlowProvider, this.provideGlobalSendingMessageResultPublisherProvider, this.provideShowRateUsUseCaseProvider, this.provideInternalNotificationHandlerProvider, this.provideCoroutineDispatchersProvider, provider5));
            this.provideChatSystemsFactoryProvider = provider6;
            ChatClientProvider_Factory create13 = ChatClientProvider_Factory.create(this.provideCoroutineScopeProvider, provider6, this.provideLoggerProvider);
            this.chatClientProvider = create13;
            ChatClientsRepositoryImpl_Factory create14 = ChatClientsRepositoryImpl_Factory.create(create13, this.provideCoreExecuteCatchingProvider);
            this.chatClientsRepositoryImplProvider = create14;
            Provider<ChatClientsRepository> provider7 = DoubleCheck.provider(create14);
            this.bindsChatsClientRepositoryProvider = provider7;
            ChatClientInteractor_Factory create15 = ChatClientInteractor_Factory.create(provider7);
            this.chatClientInteractorProvider = create15;
            this.chatSubscriptionInteractorProvider = ChatSubscriptionInteractor_Factory.create(this.provideChatsInfoRepositoryProvider, create15, this.provideChatSubscriptionRepositoryProvider);
            ChatSettingsConfigurationDelegateImpl_Factory create16 = ChatSettingsConfigurationDelegateImpl_Factory.create(this.chatsConfigurationInteractorProvider, this.chatSettingsActionTagsMapperUiProvider, ChatInterestsTypeMapperUi_Factory.create(), this.provideExceptionsEmitterProvider, this.provideResourceProvider, this.chatSubscriptionInteractorProvider, this.provideDispatcherProvider);
            this.chatSettingsConfigurationDelegateImplProvider = create16;
            C0209ChatSettingsViewModelFactory_Factory create17 = C0209ChatSettingsViewModelFactory_Factory.create(this.provideResourceProvider, this.chatSettingsLevelsDelegateImplProvider, create16, this.provideAppEventsEmitterProvider);
            this.chatSettingsViewModelFactoryProvider = create17;
            this.factoryProvider2 = ChatSettingsViewModelFactory_Factory_Impl.create(create17);
            Factory create18 = InstanceFactory.create(baseActivity);
            this.activityProvider = create18;
            Provider<AppCompatActivity> provider8 = DoubleCheck.provider(ActivityModule_ProvideAppCompatActivityFactory.create(activityModule, create18));
            this.provideAppCompatActivityProvider = provider8;
            Provider<Resources> provider9 = DoubleCheck.provider(ActivityModule_ProvideResourcesFactory.create(activityModule, provider8));
            this.provideResourcesProvider = provider9;
            NotificationToSnackbarMapper_Factory create19 = NotificationToSnackbarMapper_Factory.create(provider9, this.routerProvider, this.provideGenerateBotAvatarRouteFactoryProvider);
            this.notificationToSnackbarMapperProvider = create19;
            this.bindNotificationToSnackbarMapperProvider = DoubleCheck.provider(create19);
            this.provideChatsInfoConfigurationRepositoryProvider = new ProvideChatsInfoConfigurationRepositoryProvider(baseComponent);
            this.featureExceptionMapperProvider = FeatureExceptionMapper_Factory.create(this.provideResourceProvider);
            this.provideBotRepositoryProvider = new ProvideBotRepositoryProvider(baseComponent);
            this.provideAuthDataStorageProvider = new ProvideAuthDataStorageProvider(baseComponent);
            this.provideTokenStorageProvider = new ProvideTokenStorageProvider(baseComponent);
            this.avatarsStorageProvider = new AvatarsStorageProvider(baseComponent);
            this.provideLongTermNotificationManagerProvider = new ProvideLongTermNotificationManagerProvider(baseComponent);
            this.provideInternalNotificationsQueueProvider = new ProvideInternalNotificationsQueueProvider(baseComponent);
            this.provideGenerateBotAvatarRepositoryProvider = new ProvideGenerateBotAvatarRepositoryProvider(baseComponent);
            this.provideDiaryRepositoryProvider = new ProvideDiaryRepositoryProvider(baseComponent);
            this.provideLevelsRepositoryProvider = new ProvideLevelsRepositoryProvider(baseComponent);
            this.provideChatGiftsRepositoryProvider = new ProvideChatGiftsRepositoryProvider(baseComponent);
            this.provideUserConfigRepositoryProvider = new ProvideUserConfigRepositoryProvider(baseComponent);
            this.provideOnboardingChatConfigsMemoryCachedSourceProvider = new ProvideOnboardingChatConfigsMemoryCachedSourceProvider(baseComponent);
        }

        private void initialize2(ActivityModule activityModule, ChatApiModule chatApiModule, AuthModule authModule, ChatModule chatModule, PremiumIconManagerModule premiumIconManagerModule, AnalyticUseCasesModule analyticUseCasesModule, AppEventsObserverModule appEventsObserverModule, ChatEventsObserverModule chatEventsObserverModule, AppExceptionsObserverModule appExceptionsObserverModule, BaseComponent baseComponent, BaseActivity baseActivity, Lifecycle lifecycle, Context context) {
            ProvideFirebaseProcessProvider provideFirebaseProcessProvider = new ProvideFirebaseProcessProvider(baseComponent);
            this.provideFirebaseProcessProvider = provideFirebaseProcessProvider;
            this.logoutUseCaseProvider = LogoutUseCase_Factory.create(this.provideUserRepositoryProvider, this.provideBotRepositoryProvider, this.provideAuthDataStorageProvider, this.provideTokenStorageProvider, this.provideMessagesSourceProvider, this.avatarsStorageProvider, this.provideLongTermNotificationManagerProvider, this.provideInternalNotificationsQueueProvider, this.provideGenerateBotAvatarRepositoryProvider, this.provideDiaryRepositoryProvider, this.provideLevelsRepositoryProvider, this.provideChatGiftsRepositoryProvider, this.provideConfigurationBotsMemoryCachedSourceProvider, this.provideChatsInfoRepositoryProvider, this.provideChatsInfoConfigurationRepositoryProvider, this.provideUserConfigRepositoryProvider, this.provideOnboardingChatConfigsMemoryCachedSourceProvider, provideFirebaseProcessProvider, this.provideChatSubscriptionRepositoryProvider);
            ProvideAnalyticsInteractorProvider provideAnalyticsInteractorProvider = new ProvideAnalyticsInteractorProvider(baseComponent);
            this.provideAnalyticsInteractorProvider = provideAnalyticsInteractorProvider;
            UserBalanceServiceImpl_Factory create = UserBalanceServiceImpl_Factory.create(this.provideCoroutineScopeProvider, this.provideMessagesSourceProvider, this.provideDispatcherProvider, provideAnalyticsInteractorProvider, this.provideUserRepositoryProvider, this.bindsUserBalanceRepositoryProvider);
            this.userBalanceServiceImplProvider = create;
            this.bindsUserBalanceServiceProvider = DoubleCheck.provider(create);
            this.provideChatNotificationsRepositoryProvider = new ProvideChatNotificationsRepositoryProvider(baseComponent);
            this.isMultiChatEnabledUseCaseProvider = IsMultiChatEnabledUseCase_Factory.create(this.provideBotRepositoryProvider);
            GetActiveChattingChatsUseCase_Factory create2 = GetActiveChattingChatsUseCase_Factory.create(this.provideChatsInfoRepositoryProvider);
            this.getActiveChattingChatsUseCaseProvider = create2;
            this.chatsInfoInteractorProvider = ChatsInfoInteractor_Factory.create(this.provideChatsInfoRepositoryProvider, this.bindsChatsClientRepositoryProvider, this.provideUserRepositoryProvider, this.provideChatsInfoConfigurationRepositoryProvider, this.isMultiChatEnabledUseCaseProvider, create2, this.activateNewChatUseCaseProvider);
            ChatEventsInteractor_Factory create3 = ChatEventsInteractor_Factory.create(this.provideMessagesSourceProvider);
            this.chatEventsInteractorProvider = create3;
            ChatMessagesServiceImpl_Factory create4 = ChatMessagesServiceImpl_Factory.create(this.provideMessagesSourceProvider, this.provideUserRepositoryProvider, this.provideUserConfigRepositoryProvider, this.provideDispatcherProvider, this.provideCoroutineScopeProvider, this.chatClientInteractorProvider, this.provideChatNotificationsRepositoryProvider, this.activateNewChatUseCaseProvider, this.chatsInfoInteractorProvider, create3);
            this.chatMessagesServiceImplProvider = create4;
            this.bindsChatMessagesServiceProvider = DoubleCheck.provider(create4);
            ChatServiceImpl_Factory create5 = ChatServiceImpl_Factory.create(this.provideCoroutineScopeProvider, this.provideDispatcherProvider, this.chatEventsInteractorProvider, this.chatsRefreshConfigurationUseCaseProvider);
            this.chatServiceImplProvider = create5;
            Provider<ChatService> provider = DoubleCheck.provider(create5);
            this.bindsChatServiceProvider = provider;
            this.appServicesDelegateImplProvider = AppServicesDelegateImpl_Factory.create(this.bindsUserBalanceServiceProvider, this.bindsChatMessagesServiceProvider, provider);
            this.appChatMessagesDelegateImplProvider = AppChatMessagesDelegateImpl_Factory.create(this.provideUserRepositoryProvider, this.chatsInfoInteractorProvider, this.chatClientInteractorProvider, this.provideDispatcherProvider, this.provideUserConfigRepositoryProvider);
            this.provideBillingInteractorProvider = new ProvideBillingInteractorProvider(baseComponent);
            this.provideRateUsStateStorageProvider = new ProvideRateUsStateStorageProvider(baseComponent);
            this.provideRateAndReviewUsToggleProvider = new ProvideRateAndReviewUsToggleProvider(baseComponent);
            this.provideBillingPurchasesHistoryProvider = new ProvideBillingPurchasesHistoryProvider(baseComponent);
            ProvideRateAppShowingPlannerProvider provideRateAppShowingPlannerProvider = new ProvideRateAppShowingPlannerProvider(baseComponent);
            this.provideRateAppShowingPlannerProvider = provideRateAppShowingPlannerProvider;
            Provider<ShowRateAppAfterPurchaseUseCase> provider2 = DoubleCheck.provider(ChatModule_ProvideShowRateAppAfterPurchaseUseCaseFactory.create(chatModule, this.provideRateUsStateStorageProvider, this.provideRateAndReviewUsToggleProvider, this.provideBillingPurchasesHistoryProvider, provideRateAppShowingPlannerProvider));
            this.provideShowRateAppAfterPurchaseUseCaseProvider = provider2;
            this.billingEventDelegateImplProvider = BillingEventDelegateImpl_Factory.create(this.provideUserRepositoryProvider, this.provideExceptionsEmitterProvider, this.provideAppEventsEmitterProvider, this.provideBillingInteractorProvider, provider2, this.provideDispatcherProvider, this.provideBillingPurchasesHistoryProvider, this.chatsInfoInteractorProvider);
            this.appStartFlowDelegateImplProvider = AppStartFlowDelegateImpl_Factory.create(this.provideUserRepositoryProvider, this.provideUserConfigRepositoryProvider, this.provideAppEventsEmitterProvider);
            ProvideDeepLinksRepositoryProvider provideDeepLinksRepositoryProvider = new ProvideDeepLinksRepositoryProvider(baseComponent);
            this.provideDeepLinksRepositoryProvider = provideDeepLinksRepositoryProvider;
            this.appDeepLinksDelegateImplProvider = AppDeepLinksDelegateImpl_Factory.create(provideDeepLinksRepositoryProvider);
            ProvideSignInUseCaseProvider provideSignInUseCaseProvider = new ProvideSignInUseCaseProvider(baseComponent);
            this.provideSignInUseCaseProvider = provideSignInUseCaseProvider;
            this.provideAuthInteractorProvider = DoubleCheck.provider(AuthModule_ProvideAuthInteractorFactory.create(authModule, provideSignInUseCaseProvider, this.provideAuthDataProvider));
            this.provideShouldReloadMessagesUseCaseProvider = DoubleCheck.provider(ChatModule_ProvideShouldReloadMessagesUseCaseFactory.create(chatModule, this.provideMessagesSourceProvider));
            ProvideGetUserUseCaseProvider provideGetUserUseCaseProvider = new ProvideGetUserUseCaseProvider(baseComponent);
            this.provideGetUserUseCaseProvider = provideGetUserUseCaseProvider;
            this.appReloadDataDelegateImplProvider = AppReloadDataDelegateImpl_Factory.create(this.provideAuthInteractorProvider, this.logoutUseCaseProvider, this.provideShouldReloadMessagesUseCaseProvider, this.provideUserRepositoryProvider, this.provideUserConfigRepositoryProvider, provideGetUserUseCaseProvider, this.provideAppEventsEmitterProvider);
            this.provideUserSharedPreferencesProvider = new ProvideUserSharedPreferencesProvider(baseComponent);
            ProvideContextProvider provideContextProvider = new ProvideContextProvider(baseComponent);
            this.provideContextProvider = provideContextProvider;
            Provider<InfoOnboardingRepository> provider3 = DoubleCheck.provider(OnboardingModule_Companion_ProvideInfoOnboardingRepositoryFactory.create(this.provideUserSharedPreferencesProvider, provideContextProvider, this.provideLoggerProvider, this.provideDispatcherProvider));
            this.provideInfoOnboardingRepositoryProvider = provider3;
            this.infoOnboardingSlideUseCaseProvider = InfoOnboardingSlideUseCase_Factory.create(provider3);
            ProvideOnboardingAnswersRepositoryProvider provideOnboardingAnswersRepositoryProvider = new ProvideOnboardingAnswersRepositoryProvider(baseComponent);
            this.provideOnboardingAnswersRepositoryProvider = provideOnboardingAnswersRepositoryProvider;
            this.startChatFlowDelegateImplProvider = StartChatFlowDelegateImpl_Factory.create(this.chatsInfoInteractorProvider, this.infoOnboardingSlideUseCaseProvider, this.provideChatsInfoConfigurationRepositoryProvider, provideOnboardingAnswersRepositoryProvider, this.chatsConfigurationInteractorProvider);
            this.appChatEventsDelegateImplProvider = AppChatEventsDelegateImpl_Factory.create(this.chatsRefreshConfigurationUseCaseProvider, this.provideAnalyticsInteractorProvider);
            ProvideUserOffersRepositoryProvider provideUserOffersRepositoryProvider = new ProvideUserOffersRepositoryProvider(baseComponent);
            this.provideUserOffersRepositoryProvider = provideUserOffersRepositoryProvider;
            this.onboardingSubmittedDelegateImplProvider = OnboardingSubmittedDelegateImpl_Factory.create(this.provideAppEventsEmitterProvider, this.provideUserConfigRepositoryProvider, provideUserOffersRepositoryProvider);
            this.appNavigationDelegateImplProvider = AppNavigationDelegateImpl_Factory.create(this.provideExceptionsEmitterProvider, this.chatsInfoInteractorProvider);
            ProvideAppConfigRepositoryProvider provideAppConfigRepositoryProvider = new ProvideAppConfigRepositoryProvider(baseComponent);
            this.provideAppConfigRepositoryProvider = provideAppConfigRepositoryProvider;
            AppConfigUseCase_Factory create6 = AppConfigUseCase_Factory.create(provideAppConfigRepositoryProvider);
            this.appConfigUseCaseProvider = create6;
            this.purchaseInfoDelegateImplProvider = PurchaseInfoDelegateImpl_Factory.create(create6);
            this.provideAppEventsFlowProvider = DoubleCheck.provider(AppEventsObserverModule_ProvideAppEventsFlowFactory.create(appEventsObserverModule, this.provideAppEventsObserverProvider));
            this.provideExceptionsFlowProvider = DoubleCheck.provider(AppExceptionsObserverModule_ProvideExceptionsFlowFactory.create(appExceptionsObserverModule, this.provideExceptionsObserverProvider));
            this.provideAppUpdateManagerProvider = new ProvideAppUpdateManagerProvider(baseComponent);
            ProvideInAppUpdateRepositoryProvider provideInAppUpdateRepositoryProvider = new ProvideInAppUpdateRepositoryProvider(baseComponent);
            this.provideInAppUpdateRepositoryProvider = provideInAppUpdateRepositoryProvider;
            this.updatePromptInteractorProvider = UpdatePromptInteractor_Factory.create(provideInAppUpdateRepositoryProvider, this.provideAppConfigRepositoryProvider);
            InAppUpdateAnalytics_Factory create7 = InAppUpdateAnalytics_Factory.create(this.provideAnalyticsInteractorProvider);
            this.inAppUpdateAnalyticsProvider = create7;
            InAppUpdateDelegateImpl_Factory create8 = InAppUpdateDelegateImpl_Factory.create(this.provideAppUpdateManagerProvider, this.updatePromptInteractorProvider, create7);
            this.inAppUpdateDelegateImplProvider = create8;
            this.appViewModelProvider = AppViewModel_Factory.create(this.provideChatsInfoConfigurationRepositoryProvider, this.featureExceptionMapperProvider, this.logoutUseCaseProvider, this.provideAppIdentityConverterProvider, this.provideDispatcherProvider, this.appServicesDelegateImplProvider, this.appChatMessagesDelegateImplProvider, this.billingEventDelegateImplProvider, this.appStartFlowDelegateImplProvider, this.appDeepLinksDelegateImplProvider, this.appReloadDataDelegateImplProvider, this.startChatFlowDelegateImplProvider, this.appChatEventsDelegateImplProvider, this.onboardingSubmittedDelegateImplProvider, this.appNavigationDelegateImplProvider, this.purchaseInfoDelegateImplProvider, this.provideAppEventsFlowProvider, this.provideExceptionsFlowProvider, create8);
            this.provideAppImageLoaderRepositoryProvider = new ProvideAppImageLoaderRepositoryProvider(baseComponent);
            ProvideBuyChatMessagesRepositoryProvider provideBuyChatMessagesRepositoryProvider = new ProvideBuyChatMessagesRepositoryProvider(baseComponent);
            this.provideBuyChatMessagesRepositoryProvider = provideBuyChatMessagesRepositoryProvider;
            BuyChatMessagesInteractor_Factory create9 = BuyChatMessagesInteractor_Factory.create(provideBuyChatMessagesRepositoryProvider);
            this.buyChatMessagesInteractorProvider = create9;
            ChatMessageAccessInteractor_Factory create10 = ChatMessageAccessInteractor_Factory.create(this.provideUserRepositoryProvider, this.chatsInfoInteractorProvider, this.bindsUserBalanceRepositoryProvider, this.provideAppImageLoaderRepositoryProvider, this.chatClientInteractorProvider, create9);
            this.chatMessageAccessInteractorProvider = create10;
            this.homeActiveChatMapperProvider = HomeActiveChatMapper_Factory.create(this.provideResourceProvider, create10);
            this.homeUnavailableChatMapperProvider = HomeUnavailableChatMapper_Factory.create(this.provideResourceProvider);
            this.getUnavailableChatsUseCaseProvider = GetUnavailableChatsUseCase_Factory.create(this.provideChatsInfoRepositoryProvider, this.isMultiChatEnabledUseCaseProvider);
            this.chatUnlockLabelMapperUiProvider = ChatUnlockLabelMapperUi_Factory.create(this.provideResourceProvider);
            this.provideAvatarAnimationEnabledStorageProvider = new ProvideAvatarAnimationEnabledStorageProvider(baseComponent);
            ProvideFeatureToggleRepositoryProvider provideFeatureToggleRepositoryProvider = new ProvideFeatureToggleRepositoryProvider(baseComponent);
            this.provideFeatureToggleRepositoryProvider = provideFeatureToggleRepositoryProvider;
            GeneratedChatAvatarInteractor_Factory create11 = GeneratedChatAvatarInteractor_Factory.create(this.provideBotRepositoryProvider, this.provideAvatarAnimationEnabledStorageProvider, this.chatsInfoInteractorProvider, this.provideGenerateBotAvatarRepositoryProvider, provideFeatureToggleRepositoryProvider);
            this.generatedChatAvatarInteractorProvider = create11;
            this.homeChatsDelegateImplProvider = HomeChatsDelegateImpl_Factory.create(this.homeActiveChatMapperProvider, this.homeUnavailableChatMapperProvider, this.chatsInfoInteractorProvider, this.chatClientInteractorProvider, this.provideDispatcherProvider, this.getUnavailableChatsUseCaseProvider, this.chatUnlockLabelMapperUiProvider, create11);
            this.homeHandleDeepLinksDelegateImplProvider = HomeHandleDeepLinksDelegateImpl_Factory.create(this.provideDeepLinksRepositoryProvider, this.chatsInfoInteractorProvider, this.provideAppEventsEmitterProvider);
            this.provideNeuronsFeatureToggleProvider = new ProvideNeuronsFeatureToggleProvider(baseComponent);
            this.provideConfirmEmailFeatureToggleProvider = new ProvideConfirmEmailFeatureToggleProvider(baseComponent);
            ProvideTagsProviderProvider provideTagsProviderProvider = new ProvideTagsProviderProvider(baseComponent);
            this.provideTagsProvider = provideTagsProviderProvider;
            EmailConfirmDelegateImpl_Factory create12 = EmailConfirmDelegateImpl_Factory.create(this.provideConfirmEmailFeatureToggleProvider, this.appConfigUseCaseProvider, this.provideUserRepositoryProvider, provideTagsProviderProvider);
            this.emailConfirmDelegateImplProvider = create12;
            this.profileMenuDelegateImplProvider = ProfileMenuDelegateImpl_Factory.create(this.provideNeuronsFeatureToggleProvider, this.bindsUserBalanceRepositoryProvider, this.provideLoggerProvider, this.provideUserRepositoryProvider, this.chatsInfoInteractorProvider, create12);
            HomeAnalyticsInteractor_Factory create13 = HomeAnalyticsInteractor_Factory.create(this.provideAppIdentityConverterProvider);
            this.homeAnalyticsInteractorProvider = create13;
            this.homeViewModelProvider = HomeViewModel_Factory.create(this.homeChatsDelegateImplProvider, this.bindsUserBalanceRepositoryProvider, this.homeHandleDeepLinksDelegateImplProvider, this.profileMenuDelegateImplProvider, this.provideAppEventsEmitterProvider, create13, this.provideFeatureToggleRepositoryProvider, this.appConfigUseCaseProvider);
            this.provideGetBotUseCaseProvider = new ProvideGetBotUseCaseProvider(baseComponent);
            this.provideAnimatedAvatarFeatureToggleProvider = new ProvideAnimatedAvatarFeatureToggleProvider(baseComponent);
            this.provideOpenGenerateBotAvatarUseCaseProvider = DoubleCheck.provider(GenerateAvatarModule_Companion_ProvideOpenGenerateBotAvatarUseCaseFactory.create(this.provideGenerateBotAvatarRepositoryProvider, this.routerProvider, this.provideGenerateBotAvatarRouteFactoryProvider, this.provideLoggerProvider));
            ProvideMediaPlayerPlaybackControllerGeneratorProvider provideMediaPlayerPlaybackControllerGeneratorProvider = new ProvideMediaPlayerPlaybackControllerGeneratorProvider(baseComponent);
            this.provideMediaPlayerPlaybackControllerGeneratorProvider = provideMediaPlayerPlaybackControllerGeneratorProvider;
            this.botProfileViewModelProvider = BotProfileViewModel_Factory.create(this.provideLoggerProvider, this.provideGetBotUseCaseProvider, this.provideGetUserUseCaseProvider, this.routerProvider, this.provideAvatarAnimationEnabledStorageProvider, this.provideFeatureToggleRepositoryProvider, this.provideAnimatedAvatarFeatureToggleProvider, this.provideGenerateBotAvatarRepositoryProvider, this.provideOpenGenerateBotAvatarUseCaseProvider, provideMediaPlayerPlaybackControllerGeneratorProvider, this.provideLevelsInfoUseCaseProvider, this.provideContextProvider, this.provideCoroutineDispatchersProvider);
            this.levelPopupViewModelProvider = LevelPopupViewModel_Factory.create(this.provideCoroutineDispatchersProvider, this.avatarsStorageProvider, this.provideGetBotUseCaseProvider);
            this.provideChangeBotNameUseCaseProvider = new ProvideChangeBotNameUseCaseProvider(baseComponent);
            ProvideValidateNameUseCaseProvider provideValidateNameUseCaseProvider = new ProvideValidateNameUseCaseProvider(baseComponent);
            this.provideValidateNameUseCaseProvider = provideValidateNameUseCaseProvider;
            this.botNameViewModelProvider = BotNameViewModel_Factory.create(this.provideGetBotUseCaseProvider, this.provideChangeBotNameUseCaseProvider, provideValidateNameUseCaseProvider, this.routerProvider);
            this.provideChangeBotAgeUseCaseProvider = new ProvideChangeBotAgeUseCaseProvider(baseComponent);
            ProvideAnnalsTrackerAnalyticsSenderProvider provideAnnalsTrackerAnalyticsSenderProvider = new ProvideAnnalsTrackerAnalyticsSenderProvider(baseComponent);
            this.provideAnnalsTrackerAnalyticsSenderProvider = provideAnnalsTrackerAnalyticsSenderProvider;
            this.provideAnalyticsEditBotUseCaseProvider = AnalyticUseCasesModule_ProvideAnalyticsEditBotUseCaseFactory.create(analyticUseCasesModule, provideAnnalsTrackerAnalyticsSenderProvider);
            ProvideValidateAgeUseCaseProvider provideValidateAgeUseCaseProvider = new ProvideValidateAgeUseCaseProvider(baseComponent);
            this.provideValidateAgeUseCaseProvider = provideValidateAgeUseCaseProvider;
            this.botAgeViewModelProvider = BotAgeViewModel_Factory.create(this.provideGetBotUseCaseProvider, this.provideChangeBotAgeUseCaseProvider, this.provideAnalyticsEditBotUseCaseProvider, provideValidateAgeUseCaseProvider, this.routerProvider);
            ProvideChangeBotGenderUseCaseProvider provideChangeBotGenderUseCaseProvider = new ProvideChangeBotGenderUseCaseProvider(baseComponent);
            this.provideChangeBotGenderUseCaseProvider = provideChangeBotGenderUseCaseProvider;
            this.botGenderViewModelProvider = BotGenderViewModel_Factory.create(this.provideGetBotUseCaseProvider, provideChangeBotGenderUseCaseProvider, this.provideAnalyticsEditBotUseCaseProvider, this.provideInternalNotificationHandlerProvider, this.routerProvider, this.provideAppEventsEmitterProvider, this.provideBotRepositoryProvider);
            ProvideChangeBotEthnicityUseCaseProvider provideChangeBotEthnicityUseCaseProvider = new ProvideChangeBotEthnicityUseCaseProvider(baseComponent);
            this.provideChangeBotEthnicityUseCaseProvider = provideChangeBotEthnicityUseCaseProvider;
            this.botEthnicityViewModelProvider = BotEthnicityViewModel_Factory.create(this.provideGetBotUseCaseProvider, provideChangeBotEthnicityUseCaseProvider, this.provideAnalyticsEditBotUseCaseProvider, this.routerProvider);
            ProvideChangeBotPersonalityUseCaseProvider provideChangeBotPersonalityUseCaseProvider = new ProvideChangeBotPersonalityUseCaseProvider(baseComponent);
            this.provideChangeBotPersonalityUseCaseProvider = provideChangeBotPersonalityUseCaseProvider;
            this.botPersonalityViewModelProvider = BotPersonalityViewModel_Factory.create(this.provideGetBotUseCaseProvider, provideChangeBotPersonalityUseCaseProvider, this.provideAnalyticsEditBotUseCaseProvider, this.routerProvider, this.provideAppEventsEmitterProvider);
            this.provideChangeBotVoiceUseCaseProvider = new ProvideChangeBotVoiceUseCaseProvider(baseComponent);
            this.provideTokenProvider = new ProvideTokenProviderProvider(baseComponent);
            this.contextProvider = InstanceFactory.create(context);
            this.audioAudioPlayerSettingsProvider = DoubleCheck.provider(ChatScreenModule_Companion_AudioAudioPlayerSettingsFactory.create(this.provideUserRepositoryProvider));
            Factory create14 = InstanceFactory.create(lifecycle);
            this.screenLifecycleProvider = create14;
            Provider<AudioPlayer> provider4 = DoubleCheck.provider(ChatScreenModule_Companion_AudioPlayerFactory.create(this.contextProvider, this.audioAudioPlayerSettingsProvider, create14, this.provideCoroutineDispatchersProvider, this.provideLoggerProvider));
            this.audioPlayerProvider = provider4;
            this.botVoiceViewModelProvider = BotVoiceViewModel_Factory.create(this.provideGetBotUseCaseProvider, this.provideChangeBotVoiceUseCaseProvider, this.provideAnalyticsEditBotUseCaseProvider, this.provideUserRepositoryProvider, this.provideTokenProvider, provider4, this.routerProvider, this.provideAppEventsEmitterProvider);
            this.provideRetrofitProvider = new ProvideRetrofitProvider(baseComponent);
        }

        private void initialize3(ActivityModule activityModule, ChatApiModule chatApiModule, AuthModule authModule, ChatModule chatModule, PremiumIconManagerModule premiumIconManagerModule, AnalyticUseCasesModule analyticUseCasesModule, AppEventsObserverModule appEventsObserverModule, ChatEventsObserverModule chatEventsObserverModule, AppExceptionsObserverModule appExceptionsObserverModule, BaseComponent baseComponent, BaseActivity baseActivity, Lifecycle lifecycle, Context context) {
            Provider<UserApi> provider = DoubleCheck.provider(ChatApiModule_ProvideUserApiFactory.create(chatApiModule, this.provideRetrofitProvider));
            this.provideUserApiProvider = provider;
            Provider<ResetAiApiDelegate> provider2 = DoubleCheck.provider(ChatApiModule_ProvideResetAiApiDelegateFactory.create(chatApiModule, provider));
            this.provideResetAiApiDelegateProvider = provider2;
            Provider<ResetAiUseCase> provider3 = DoubleCheck.provider(ChatModule_ProvideResetAiUseCaseFactory.create(chatModule, provider2, this.provideUserRepositoryProvider, this.provideBotRepositoryProvider, this.chatClientInteractorProvider, this.provideInternalNotificationHandlerProvider));
            this.provideResetAiUseCaseProvider = provider3;
            this.resetViewModelProvider = ResetViewModel_Factory.create(this.provideGetBotUseCaseProvider, provider3, this.provideLoggerProvider, this.provideAppEventsEmitterProvider, this.provideCoroutineDispatchersProvider);
            this.provideAppLoggerInteractorProvider = new ProvideAppLoggerInteractorProvider(baseComponent);
            BillingPurchaseProductAnalytics_Factory create = BillingPurchaseProductAnalytics_Factory.create(this.provideAnalyticsInteractorProvider);
            this.billingPurchaseProductAnalyticsProvider = create;
            BillingPurchaseDelegateImpl_Factory create2 = BillingPurchaseDelegateImpl_Factory.create(this.provideAppLoggerInteractorProvider, this.provideBillingInteractorProvider, this.buyChatMessagesInteractorProvider, this.chatEventsInteractorProvider, this.bindsUserBalanceRepositoryProvider, create, this.provideUserConfigRepositoryProvider, this.chatsInfoInteractorProvider, this.provideTagsProvider, this.provideUserRepositoryProvider);
            this.billingPurchaseDelegateImplProvider = create2;
            Provider<BillingPurchaseDelegate.Factory> create3 = BillingPurchaseDelegate_Factory_Impl.create(create2);
            this.factoryProvider3 = create3;
            this.userProfileViewModelProvider = UserProfileViewModel_Factory.create(this.provideGetUserUseCaseProvider, this.appConfigUseCaseProvider, this.routerProvider, this.provideAppEventsEmitterProvider, create3);
            ProvideChangeUserNameUseCaseProvider provideChangeUserNameUseCaseProvider = new ProvideChangeUserNameUseCaseProvider(baseComponent);
            this.provideChangeUserNameUseCaseProvider = provideChangeUserNameUseCaseProvider;
            this.userNameViewModelProvider = UserNameViewModel_Factory.create(this.provideGetUserUseCaseProvider, provideChangeUserNameUseCaseProvider, this.provideValidateNameUseCaseProvider, this.routerProvider);
            ProvideChangeUserGenderUseCaseProvider provideChangeUserGenderUseCaseProvider = new ProvideChangeUserGenderUseCaseProvider(baseComponent);
            this.provideChangeUserGenderUseCaseProvider = provideChangeUserGenderUseCaseProvider;
            this.userGenderViewModelProvider = UserGenderViewModel_Factory.create(this.provideGetUserUseCaseProvider, provideChangeUserGenderUseCaseProvider, this.routerProvider, this.provideCoroutineScopeProvider);
            ProvideChangeUserAgeUseCaseProvider provideChangeUserAgeUseCaseProvider = new ProvideChangeUserAgeUseCaseProvider(baseComponent);
            this.provideChangeUserAgeUseCaseProvider = provideChangeUserAgeUseCaseProvider;
            this.userAgeViewModelProvider = UserAgeViewModel_Factory.create(this.provideGetUserUseCaseProvider, provideChangeUserAgeUseCaseProvider, this.routerProvider, this.appConfigUseCaseProvider);
            PremiumIconManagerModule_ProvidePremiumAppIconManagerFactory create4 = PremiumIconManagerModule_ProvidePremiumAppIconManagerFactory.create(premiumIconManagerModule, this.provideContextProvider);
            this.providePremiumAppIconManagerProvider = create4;
            this.changeAppIconViewModelProvider = ChangeAppIconViewModel_Factory.create(create4, this.routerProvider);
            Provider<ChatProcess> provider4 = DoubleCheck.provider(ChatApiModule_ProvideChatProcessFactory.create(chatApiModule, this.provideUserApiProvider, this.provideTokenProvider));
            this.provideChatProcessProvider = provider4;
            Provider<DeleteUserUseCase> provider5 = DoubleCheck.provider(ChatModule_ProvideDeleteUserUseCaseFactory.create(chatModule, this.provideUserRepositoryProvider, provider4));
            this.provideDeleteUserUseCaseProvider = provider5;
            this.userProfileDeleteViewModelProvider = UserProfileDeleteViewModel_Factory.create(provider5, this.providePremiumAppIconManagerProvider, this.provideGetBotUseCaseProvider, this.routerProvider, this.provideAppEventsEmitterProvider, this.provideCoroutineDispatchersProvider);
            this.previewSendImageViewModelProvider = PreviewSendImageViewModel_Factory.create(this.provideInternalNotificationHandlerProvider, this.provideCoroutineScopeProvider, this.provideCoroutineDispatchersProvider, this.provideLoggerProvider, this.chatClientInteractorProvider);
            this.provideSendConfirmationEmailUseCaseProvider = new ProvideSendConfirmationEmailUseCaseProvider(baseComponent);
            ProvideEventDelayStorageProvider provideEventDelayStorageProvider = new ProvideEventDelayStorageProvider(baseComponent);
            this.provideEventDelayStorageProvider = provideEventDelayStorageProvider;
            this.confirmEmailViewModelProvider = ConfirmEmailViewModel_Factory.create(this.provideSendConfirmationEmailUseCaseProvider, this.provideAuthDataProvider, this.appConfigUseCaseProvider, provideEventDelayStorageProvider, this.provideResourceProvider);
            AnalyticUseCasesModule_ProvideAnalyticsEmailChangedUseCaseFactory create5 = AnalyticUseCasesModule_ProvideAnalyticsEmailChangedUseCaseFactory.create(analyticUseCasesModule, this.provideAnnalsTrackerAnalyticsSenderProvider);
            this.provideAnalyticsEmailChangedUseCaseProvider = create5;
            this.changeEmailViewModelProvider = ChangeEmailViewModel_Factory.create(this.provideSendConfirmationEmailUseCaseProvider, this.provideCoroutineScopeProvider, create5, this.provideCoroutineDispatchersProvider);
            ProvideNeuronsCostsStorageProvider provideNeuronsCostsStorageProvider = new ProvideNeuronsCostsStorageProvider(baseComponent);
            this.provideNeuronsCostsStorageProvider = provideNeuronsCostsStorageProvider;
            this.generateBotAvatarViewModelProvider = GenerateBotAvatarViewModel_Factory.create(this.provideGenerateBotAvatarRepositoryProvider, this.provideBotRepositoryProvider, this.appConfigUseCaseProvider, provideNeuronsCostsStorageProvider, this.provideGenerateBotAvatarRouteFactoryProvider, this.routerProvider, this.provideLoggerProvider, this.provideAppEventsEmitterProvider, this.providePaymentResultFlowProvider, this.provideCoroutineDispatchersProvider);
            this.generatingBotAvatarPlaceholderViewModelProvider = GeneratingBotAvatarPlaceholderViewModel_Factory.create(this.provideBotRepositoryProvider, this.provideAppEventsEmitterProvider, this.provideCoroutineDispatchersProvider);
            AnalyticUseCasesModule_ProvideAnalyticsAvatarAiApplyUseCaseFactory create6 = AnalyticUseCasesModule_ProvideAnalyticsAvatarAiApplyUseCaseFactory.create(analyticUseCasesModule, this.provideAnnalsTrackerAnalyticsSenderProvider);
            this.provideAnalyticsAvatarAiApplyUseCaseProvider = create6;
            this.selectGeneratedAvatarViewModelProvider = SelectGeneratedAvatarViewModel_Factory.create(this.provideGenerateBotAvatarRepositoryProvider, this.provideNeuronsCostsStorageProvider, this.provideCoroutineScopeProvider, this.routerProvider, this.provideLoggerProvider, this.provideGenerateBotAvatarRouteFactoryProvider, create6, this.provideLongTermNotificationManagerProvider, this.provideAppEventsEmitterProvider, this.providePaymentResultFlowProvider, this.provideCoroutineDispatchersProvider);
            this.generateBotAvatarErrorViewModelProvider = GenerateBotAvatarErrorViewModel_Factory.create(this.provideCoroutineScopeProvider, this.provideGenerateBotAvatarRepositoryProvider, this.provideGenerateBotAvatarRouteFactoryProvider, this.provideLoggerProvider, this.routerProvider, this.provideCoroutineDispatchersProvider);
            this.provideRateUsRepositoryProvider = new ProvideRateUsRepositoryProvider(baseComponent);
            this.provideAnalyticsRateUsModalUseCaseProvider = AnalyticUseCasesModule_ProvideAnalyticsRateUsModalUseCaseFactory.create(analyticUseCasesModule, this.provideAnnalsTrackerAnalyticsSenderProvider);
            this.provideAnalyticsReviewUsModalUseCaseProvider = AnalyticUseCasesModule_ProvideAnalyticsReviewUsModalUseCaseFactory.create(analyticUseCasesModule, this.provideAnnalsTrackerAnalyticsSenderProvider);
            ProvideOnUserRateUsUseCaseProvider provideOnUserRateUsUseCaseProvider = new ProvideOnUserRateUsUseCaseProvider(baseComponent);
            this.provideOnUserRateUsUseCaseProvider = provideOnUserRateUsUseCaseProvider;
            this.rateAppViewModelProvider = RateAppViewModel_Factory.create(this.provideBotRepositoryProvider, this.provideRateUsRepositoryProvider, this.provideAnalyticsRateUsModalUseCaseProvider, this.provideAnalyticsReviewUsModalUseCaseProvider, this.provideInternalNotificationHandlerProvider, this.provideCoroutineScopeProvider, this.provideShowRateUsUseCaseProvider, provideOnUserRateUsUseCaseProvider, this.provideCoroutineDispatchersProvider);
            this.provideGetDiaryNotesUseCaseProvider = new ProvideGetDiaryNotesUseCaseProvider(baseComponent);
            this.provideReplyDiaryNoteUseCaseProvider = new ProvideReplyDiaryNoteUseCaseProvider(baseComponent);
            this.provideRefreshDiaryUseCaseProvider = new ProvideRefreshDiaryUseCaseProvider(baseComponent);
            ProvideOnDiaryShownUseCaseProvider provideOnDiaryShownUseCaseProvider = new ProvideOnDiaryShownUseCaseProvider(baseComponent);
            this.provideOnDiaryShownUseCaseProvider = provideOnDiaryShownUseCaseProvider;
            this.lightDiaryViewModelProvider = LightDiaryViewModel_Factory.create(this.provideCoroutineDispatchersProvider, this.provideAppEventsEmitterProvider, this.providePaymentResultFlowProvider, this.routerProvider, this.provideBotRepositoryProvider, this.provideGetDiaryNotesUseCaseProvider, this.provideReplyDiaryNoteUseCaseProvider, this.provideRefreshDiaryUseCaseProvider, provideOnDiaryShownUseCaseProvider, this.provideLoggerProvider);
            this.darkDiaryViewModelProvider = DarkDiaryViewModel_Factory.create(this.provideCoroutineDispatchersProvider, this.routerProvider, this.provideBotRepositoryProvider, this.provideGetDiaryNotesUseCaseProvider, this.provideReplyDiaryNoteUseCaseProvider, this.provideRefreshDiaryUseCaseProvider, this.provideOnDiaryShownUseCaseProvider, this.provideLoggerProvider, this.provideAppEventsEmitterProvider, this.providePaymentResultFlowProvider);
            this.infoOnboardingViewModelProvider = InfoOnboardingViewModel_Factory.create(this.provideCoroutineDispatchersProvider, this.infoOnboardingSlideUseCaseProvider, this.routerProvider, InfoOnboardingAnalyticsImpl_Factory.create());
            ProvideUserSessionSharedPreferencesProvider provideUserSessionSharedPreferencesProvider = new ProvideUserSessionSharedPreferencesProvider(baseComponent);
            this.provideUserSessionSharedPreferencesProvider = provideUserSessionSharedPreferencesProvider;
            this.provideFirebaseSubscribeUseCaseProvider = DoubleCheck.provider(ChatModule_ProvideFirebaseSubscribeUseCaseFactory.create(chatModule, this.provideFirebaseProcessProvider, provideUserSessionSharedPreferencesProvider, this.provideUserRepositoryProvider, this.appConfigUseCaseProvider, this.provideCoroutineScopeProvider));
            this.provideClearBadgesUseCaseProvider = DoubleCheck.provider(ChatModule_ProvideClearBadgesUseCaseFactory.create(chatModule, this.provideFirebaseProcessProvider, this.provideUserRepositoryProvider));
            AnalyticsEngineProvider analyticsEngineProvider = new AnalyticsEngineProvider(baseComponent);
            this.analyticsEngineProvider = analyticsEngineProvider;
            this.chatPhotoAnalyticsProvider = ChatPhotoAnalytics_Factory.create(analyticsEngineProvider);
            ChatMessageAccessDelegateImpl_Factory create7 = ChatMessageAccessDelegateImpl_Factory.create(this.provideExceptionsEmitterProvider, this.chatClientInteractorProvider, this.chatMessageAccessInteractorProvider, this.providePaymentResultFlowProvider, this.provideAppEventsEmitterProvider);
            this.chatMessageAccessDelegateImplProvider = create7;
            Provider<ChatMessageAccessDelegate.Factory> create8 = ChatMessageAccessDelegate_Factory_Impl.create(create7);
            this.factoryProvider4 = create8;
            ChatPhotoDelegateImpl_Factory create9 = ChatPhotoDelegateImpl_Factory.create(this.provideExceptionsEmitterProvider, this.chatPhotoAnalyticsProvider, this.chatClientInteractorProvider, create8);
            this.chatPhotoDelegateImplProvider = create9;
            this.factoryProvider5 = ChatPhotoDelegate_Factory_Impl.create(create9);
            Provider<ChatEventsObserver> provider6 = DoubleCheck.provider(ChatEventsObserverModule_ProvideChatEventsObserverFactory.create(chatEventsObserverModule));
            this.provideChatEventsObserverProvider = provider6;
            this.provideChatEventsFlowProvider = DoubleCheck.provider(ChatEventsObserverModule_ProvideChatEventsFlowFactory.create(chatEventsObserverModule, provider6));
            ProvideTopicsApiProvider provideTopicsApiProvider = new ProvideTopicsApiProvider(baseComponent);
            this.provideTopicsApiProvider = provideTopicsApiProvider;
            ChatTopicsRemoteDataSource_Factory create10 = ChatTopicsRemoteDataSource_Factory.create(provideTopicsApiProvider);
            this.chatTopicsRemoteDataSourceProvider = create10;
            ChatTopicsRepositoryImpl_Factory create11 = ChatTopicsRepositoryImpl_Factory.create(this.provideCoreExecuteCatchingProvider, create10, this.provideAuthDataProvider);
            this.chatTopicsRepositoryImplProvider = create11;
            this.bindsChatTopicsRepositoryProvider = DoubleCheck.provider(create11);
            ChatPremiumTopicsRepositoryImpl_Factory create12 = ChatPremiumTopicsRepositoryImpl_Factory.create(this.provideCoreExecuteCatchingProvider, this.chatTopicsRemoteDataSourceProvider, this.provideAuthLocalDataSourceProvider);
            this.chatPremiumTopicsRepositoryImplProvider = create12;
            this.bindsChatPremiumTopicsRepositoryProvider = DoubleCheck.provider(create12);
            ProvideCallsApiServiceProvider provideCallsApiServiceProvider = new ProvideCallsApiServiceProvider(baseComponent);
            this.provideCallsApiServiceProvider = provideCallsApiServiceProvider;
            ChatCallsRemoteDataSource_Factory create13 = ChatCallsRemoteDataSource_Factory.create(provideCallsApiServiceProvider, this.provideAuthLocalDataSourceProvider);
            this.chatCallsRemoteDataSourceProvider = create13;
            ChatCallsRepositoryImpl_Factory create14 = ChatCallsRepositoryImpl_Factory.create(this.provideCoreExecuteCatchingProvider, create13);
            this.chatCallsRepositoryImplProvider = create14;
            this.bindsChatCallsRepositoryProvider = DoubleCheck.provider(create14);
            ChatConfigurationDelegateImpl_Factory create15 = ChatConfigurationDelegateImpl_Factory.create(this.chatsConfigurationInteractorProvider, this.chatSubscriptionInteractorProvider, this.provideExceptionsEmitterProvider, this.provideResourceProvider, this.provideDispatcherProvider);
            this.chatConfigurationDelegateImplProvider = create15;
            this.factoryProvider6 = ChatConfigurationDelegate_Factory_Impl.create(create15);
            ChatMessageDelegateImpl_Factory create16 = ChatMessageDelegateImpl_Factory.create(this.factoryProvider4, this.chatClientInteractorProvider, this.provideExceptionsEmitterProvider);
            this.chatMessageDelegateImplProvider = create16;
            this.factoryProvider7 = ChatMessageDelegate_Factory_Impl.create(create16);
            this.provideAnalyticsAudioAiPauseUseCaseProvider = AnalyticUseCasesModule_ProvideAnalyticsAudioAiPauseUseCaseFactory.create(analyticUseCasesModule, this.provideAnnalsTrackerAnalyticsSenderProvider);
            this.provideAnalyticsAudioAiClickPlayUseCaseProvider = AnalyticUseCasesModule_ProvideAnalyticsAudioAiClickPlayUseCaseFactory.create(analyticUseCasesModule, this.provideAnnalsTrackerAnalyticsSenderProvider);
            this.provideAnalyticsAudioAiStartPlayingUseCaseProvider = AnalyticUseCasesModule_ProvideAnalyticsAudioAiStartPlayingUseCaseFactory.create(analyticUseCasesModule, this.provideAnnalsTrackerAnalyticsSenderProvider);
            this.provideAnalyticsAudioAiCompletedUseCaseProvider = AnalyticUseCasesModule_ProvideAnalyticsAudioAiCompletedUseCaseFactory.create(analyticUseCasesModule, this.provideAnnalsTrackerAnalyticsSenderProvider);
            this.provideAnalyticsAudioAiConvertToTextModalUseCaseProvider = AnalyticUseCasesModule_ProvideAnalyticsAudioAiConvertToTextModalUseCaseFactory.create(analyticUseCasesModule, this.provideAnnalsTrackerAnalyticsSenderProvider);
            AnalyticUseCasesModule_ProvideAnalyticsAudioAiConvertToTextMessageUseCaseFactory create17 = AnalyticUseCasesModule_ProvideAnalyticsAudioAiConvertToTextMessageUseCaseFactory.create(analyticUseCasesModule, this.provideAnnalsTrackerAnalyticsSenderProvider);
            this.provideAnalyticsAudioAiConvertToTextMessageUseCaseProvider = create17;
            this.provideChatAnalyticsProvider = DoubleCheck.provider(ChatModule_ProvideChatAnalyticsFactory.create(chatModule, this.provideAnalyticsAudioAiPauseUseCaseProvider, this.provideAnalyticsAudioAiClickPlayUseCaseProvider, this.provideAnalyticsAudioAiStartPlayingUseCaseProvider, this.provideAnalyticsAudioAiCompletedUseCaseProvider, this.provideAnalyticsAudioAiConvertToTextModalUseCaseProvider, create17));
            ImageLoaderImpl_Factory create18 = ImageLoaderImpl_Factory.create(this.provideAuthDataProvider);
            this.imageLoaderImplProvider = create18;
            this.imageLoaderProvider = DoubleCheck.provider(create18);
            ProvideAudioMessageRepositoryProvider provideAudioMessageRepositoryProvider = new ProvideAudioMessageRepositoryProvider(baseComponent);
            this.provideAudioMessageRepositoryProvider = provideAudioMessageRepositoryProvider;
            ChatAudioMessageFacadeImpl_Factory create19 = ChatAudioMessageFacadeImpl_Factory.create(provideAudioMessageRepositoryProvider);
            this.chatAudioMessageFacadeImplProvider = create19;
            this.bindsChatAudioMessageFacadeProvider = DoubleCheck.provider(create19);
            PopupFragmentFactoryProvider popupFragmentFactoryProvider = new PopupFragmentFactoryProvider(baseComponent);
            this.popupFragmentFactoryProvider = popupFragmentFactoryProvider;
            this.requestSextingPopupDelegateProvider = RequestSextingPopupDelegate_Factory.create(this.activityProvider, popupFragmentFactoryProvider);
            this.sextingRequestToggleProvider = SextingRequestToggle_Factory.create(this.provideAppConfigLocalDataSourceProvider, this.provideCoroutineScopeProvider);
            Provider<SextingRequestApi> provider7 = DoubleCheck.provider(SextingRequestModule_Companion_ProvideSextingRequestApiFactory.create(this.provideRetrofitProvider));
            this.provideSextingRequestApiProvider = provider7;
            this.sextingRequestorProvider = SextingRequestor_Factory.create(provider7, this.provideAuthDataProvider, this.provideLoggerProvider);
            UserPreferencesChatHistory_Factory create20 = UserPreferencesChatHistory_Factory.create(this.provideUserSharedPreferencesProvider);
            this.userPreferencesChatHistoryProvider = create20;
            Provider<ChatHistory> provider8 = DoubleCheck.provider(create20);
            this.bindChatHistoryProvider = provider8;
            this.showSextingRequestSystemProvider = DoubleCheck.provider(ShowSextingRequestSystem_Factory.create(this.requestSextingPopupDelegateProvider, this.provideUserSharedPreferencesProvider, this.provideCoroutineDispatchersProvider, this.provideChatCoroutineScopeProvider, this.appConfigUseCaseProvider, this.sextingRequestToggleProvider, this.sextingRequestorProvider, provider8, this.provideGlobalSendingMessageResultPublisherProvider));
            this.imagesLockerSystemProvider = DoubleCheck.provider(ImagesLockerSystem_Factory.create(this.provideUserRepositoryProvider));
            this.provideChatEventsEmitterProvider = DoubleCheck.provider(ChatEventsObserverModule_ProvideChatEventsEmitterFactory.create(chatEventsObserverModule, this.provideChatEventsObserverProvider));
            this.providePaymentResultEmitterProvider = DoubleCheck.provider(AppEventsObserverModule_ProvidePaymentResultEmitterFactory.create(appEventsObserverModule, this.providePaymentResultObserverProvider));
            this.provideFirebaseAnalyticsSenderProvider = new ProvideFirebaseAnalyticsSenderProvider(baseComponent);
            ProvideAppsFlyerAnalyticsSenderProvider provideAppsFlyerAnalyticsSenderProvider = new ProvideAppsFlyerAnalyticsSenderProvider(baseComponent);
            this.provideAppsFlyerAnalyticsSenderProvider = provideAppsFlyerAnalyticsSenderProvider;
            this.provideAnalyticsOpenSubscriptionScreenUseCaseProvider = AnalyticUseCasesModule_ProvideAnalyticsOpenSubscriptionScreenUseCaseFactory.create(analyticUseCasesModule, this.provideAppIdentityConverterProvider, this.provideFirebaseAnalyticsSenderProvider, provideAppsFlyerAnalyticsSenderProvider);
            BuyNeuronsProductUiMapper_Factory create21 = BuyNeuronsProductUiMapper_Factory.create(this.provideResourceProvider);
            this.buyNeuronsProductUiMapperProvider = create21;
            C0216BuyNeuronsViewModelFactory_Factory create22 = C0216BuyNeuronsViewModelFactory_Factory.create(this.providePaymentResultEmitterProvider, this.provideChatsInfoConfigurationRepositoryProvider, this.provideAnalyticsOpenSubscriptionScreenUseCaseProvider, create21, this.provideAppEventsEmitterProvider, this.provideExceptionsEmitterProvider, this.factoryProvider3, this.provideResourceProvider);
            this.buyNeuronsViewModelFactoryProvider = create22;
            this.factoryProvider8 = BuyNeuronsViewModelFactory_Factory_Impl.create(create22);
            PremiumBenefitsRepositoryImpl_Factory create23 = PremiumBenefitsRepositoryImpl_Factory.create(this.provideAppConfigLocalDataSourceProvider, this.provideResourceProvider);
            this.premiumBenefitsRepositoryImplProvider = create23;
            this.bindsBenefitsRepositoryProvider = DoubleCheck.provider(create23);
        }

        private void initialize4(ActivityModule activityModule, ChatApiModule chatApiModule, AuthModule authModule, ChatModule chatModule, PremiumIconManagerModule premiumIconManagerModule, AnalyticUseCasesModule analyticUseCasesModule, AppEventsObserverModule appEventsObserverModule, ChatEventsObserverModule chatEventsObserverModule, AppExceptionsObserverModule appExceptionsObserverModule, BaseComponent baseComponent, BaseActivity baseActivity, Lifecycle lifecycle, Context context) {
            this.getAllPremiumBenefitsUseCaseProvider = GetAllPremiumBenefitsUseCase_Factory.create(this.bindsBenefitsRepositoryProvider, this.provideBotRepositoryProvider);
            BuyPremiumPlanUiMapper_Factory create = BuyPremiumPlanUiMapper_Factory.create(this.provideResourceProvider);
            this.buyPremiumPlanUiMapperProvider = create;
            C0217BuyPremiumViewModelFactory_Factory create2 = C0217BuyPremiumViewModelFactory_Factory.create(this.getAllPremiumBenefitsUseCaseProvider, this.provideChatsInfoConfigurationRepositoryProvider, this.provideAnalyticsOpenSubscriptionScreenUseCaseProvider, create, this.providePaymentResultEmitterProvider, this.provideAppEventsEmitterProvider, this.provideAnalyticsInteractorProvider, this.provideExceptionsEmitterProvider, this.factoryProvider3, this.provideGetUserUseCaseProvider, this.provideDispatcherProvider, SubscriptionBenefitsUiMapper_Factory.create(), this.provideResourceProvider);
            this.buyPremiumViewModelFactoryProvider = create2;
            this.factoryProvider9 = BuyPremiumViewModelFactory_Factory_Impl.create(create2);
            ProvideFeatureTogglePayloadsRepositoryProvider provideFeatureTogglePayloadsRepositoryProvider = new ProvideFeatureTogglePayloadsRepositoryProvider(baseComponent);
            this.provideFeatureTogglePayloadsRepositoryProvider = provideFeatureTogglePayloadsRepositoryProvider;
            ChatIdConditionsCheckerUseCase_Factory create3 = ChatIdConditionsCheckerUseCase_Factory.create(this.provideChatsInfoRepositoryProvider, provideFeatureTogglePayloadsRepositoryProvider, this.provideAnalyticsInteractorProvider);
            this.chatIdConditionsCheckerUseCaseProvider = create3;
            IsChatFeatureAvailableUseCase_Factory create4 = IsChatFeatureAvailableUseCase_Factory.create(this.provideFeatureToggleRepositoryProvider, create3);
            this.isChatFeatureAvailableUseCaseProvider = create4;
            this.chatCallsInteractorProvider = ChatCallsInteractor_Factory.create(this.bindsChatCallsRepositoryProvider, create4);
            this.provideTextToSpeechStreamProvider = new ProvideTextToSpeechStreamProvider(baseComponent);
            this.provideVoiceRecognitionStreamingProvider = new ProvideVoiceRecognitionStreamingProvider(baseComponent);
            this.providePermissionProvider = new ProvidePermissionProviderProvider(baseComponent);
            ChatCallAnalytics_Factory create5 = ChatCallAnalytics_Factory.create(this.provideAnalyticsInteractorProvider);
            this.chatCallAnalyticsProvider = create5;
            C0208ChatCallViewModelFactory_Factory create6 = C0208ChatCallViewModelFactory_Factory.create(this.chatsInfoInteractorProvider, this.provideResourceProvider, this.chatCallsInteractorProvider, this.provideExceptionsEmitterProvider, this.provideDispatcherProvider, this.provideTextToSpeechStreamProvider, this.provideVoiceRecognitionStreamingProvider, this.chatEventsInteractorProvider, this.providePermissionProvider, create5, this.provideAnalyticsInteractorProvider, this.generatedChatAvatarInteractorProvider);
            this.chatCallViewModelFactoryProvider = create6;
            this.factoryProvider10 = ChatCallViewModelFactory_Factory_Impl.create(create6);
            this.getOnboardingConfigurationChatsUseCaseProvider = GetOnboardingConfigurationChatsUseCase_Factory.create(this.provideConfigurationBotsMemoryCachedSourceProvider, this.provideOnboardingChatConfigsMemoryCachedSourceProvider);
            C0211OnboardingStepViewModelFactory_Factory create7 = C0211OnboardingStepViewModelFactory_Factory.create(this.provideResourceProvider, this.provideDispatcherProvider, this.provideGetBotUseCaseProvider, this.provideChangeBotAgeUseCaseProvider, this.provideChangeBotGenderUseCaseProvider, this.provideChangeBotNameUseCaseProvider, this.provideChangeUserAgeUseCaseProvider, this.provideChangeUserGenderUseCaseProvider, this.provideChangeUserNameUseCaseProvider, OnboardingAnalyticsImpl_Factory.create(), this.provideOnboardingAnswersRepositoryProvider, this.provideBotRepositoryProvider, this.provideUserRepositoryProvider, ChatInterestsTypeMapperUi_Factory.create(), this.getOnboardingConfigurationChatsUseCaseProvider, this.isMultiChatEnabledUseCaseProvider, this.provideConfigurationBotsMemoryCachedSourceProvider);
            this.onboardingStepViewModelFactoryProvider = create7;
            this.factoryProvider11 = OnboardingStepViewModelFactory_Factory_Impl.create(create7);
            C0214ChatFlowSubscriptionViewModelFactory_Factory create8 = C0214ChatFlowSubscriptionViewModelFactory_Factory.create(this.chatsInfoInteractorProvider, this.provideExceptionsEmitterProvider, this.chatsConfigurationInteractorProvider);
            this.chatFlowSubscriptionViewModelFactoryProvider = create8;
            this.factoryProvider12 = ChatFlowSubscriptionViewModelFactory_Factory_Impl.create(create8);
            BotHaveUpdateUseCase_Factory create9 = BotHaveUpdateUseCase_Factory.create(this.provideLongTermNotificationManagerProvider, this.provideCoroutineDispatchersProvider);
            this.botHaveUpdateUseCaseProvider = create9;
            this.chatHeaderDelegateImplProvider = ChatHeaderDelegateImpl_Factory.create(this.provideResourcesProvider, this.provideLevelsInfoUseCaseProvider, create9, this.chatsInfoInteractorProvider, this.bindsUserBalanceRepositoryProvider, this.emailConfirmDelegateImplProvider, this.provideFeatureToggleRepositoryProvider, this.provideGenerateBotAvatarRepositoryProvider, ChatAvatarMapper_Factory.create(), this.generatedChatAvatarInteractorProvider);
            ProvideDiaryNotesServiceProvider provideDiaryNotesServiceProvider = new ProvideDiaryNotesServiceProvider(baseComponent);
            this.provideDiaryNotesServiceProvider = provideDiaryNotesServiceProvider;
            this.chatPanelActionsInteractorProvider = ChatPanelActionsInteractor_Factory.create(this.bindsChatTopicsRepositoryProvider, this.bindsChatPremiumTopicsRepositoryProvider, provideDiaryNotesServiceProvider, this.provideLevelsInfoUseCaseProvider, this.isChatFeatureAvailableUseCaseProvider);
            this.chatBuySubscriptionOfferUiMapperProvider = ChatBuySubscriptionOfferUiMapper_Factory.create(this.provideResourceProvider);
            this.provideAppInfoProvider = new ProvideAppInfoProviderProvider(baseComponent);
            ChatAnalyticsInteractor_Factory create10 = ChatAnalyticsInteractor_Factory.create(this.provideAppIdentityConverterProvider);
            this.chatAnalyticsInteractorProvider = create10;
            C0215ChatBuySubscriptionViewModelFactory_Factory create11 = C0215ChatBuySubscriptionViewModelFactory_Factory.create(this.chatHeaderDelegateImplProvider, this.chatsConfigurationInteractorProvider, this.chatPanelActionsInteractorProvider, this.factoryProvider3, this.provideExceptionsEmitterProvider, this.provideAppEventsEmitterProvider, this.provideResourceProvider, this.provideAnalyticsInteractorProvider, this.chatBuySubscriptionOfferUiMapperProvider, this.provideAppInfoProvider, this.chatsRefreshConfigurationUseCaseProvider, this.chatsInfoInteractorProvider, this.providePaymentResultEmitterProvider, create10);
            this.chatBuySubscriptionViewModelFactoryProvider = create11;
            this.factoryProvider13 = ChatBuySubscriptionViewModelFactory_Factory_Impl.create(create11);
            C0213ChatSubscriptionBenefitsViewModelFactory_Factory create12 = C0213ChatSubscriptionBenefitsViewModelFactory_Factory.create(this.provideResourceProvider, this.chatsConfigurationInteractorProvider, SubscriptionBenefitsMapper_Factory.create(), this.chatSubscriptionInteractorProvider, this.provideExceptionsEmitterProvider, this.chatsInfoInteractorProvider);
            this.chatSubscriptionBenefitsViewModelFactoryProvider = create12;
            this.factoryProvider14 = ChatSubscriptionBenefitsViewModelFactory_Factory_Impl.create(create12);
            C0212ChatActiveSubscriptionViewModelFactory_Factory create13 = C0212ChatActiveSubscriptionViewModelFactory_Factory.create(this.provideResourceProvider, this.chatsConfigurationInteractorProvider, SubscriptionBenefitsMapper_Factory.create(), this.provideAppEventsEmitterProvider, this.provideGetUserUseCaseProvider, this.provideAppInfoProvider, this.provideExceptionsEmitterProvider, this.chatsInfoInteractorProvider, this.chatSubscriptionInteractorProvider);
            this.chatActiveSubscriptionViewModelFactoryProvider = create13;
            this.factoryProvider15 = ChatActiveSubscriptionViewModelFactory_Factory_Impl.create(create13);
        }

        @Override // com.ifriend.ui.base.di.ActivityComponent
        public void inject(BaseActivity baseActivity) {
            injectBaseActivity(baseActivity);
        }

        @Override // com.ifriend.presentation.features.app.di.AppPresentationProvider
        public void inject(ChatsStoreFragment chatsStoreFragment) {
            injectChatsStoreFragment(chatsStoreFragment);
        }

        @Override // com.ifriend.presentation.features.app.di.AppPresentationProvider
        public void inject(ChatSettingsFragment chatSettingsFragment) {
            injectChatSettingsFragment(chatSettingsFragment);
        }

        @Override // com.ifriend.presentation.features.app.di.AppPresentationProvider
        public void inject(NavHostFlowFragment navHostFlowFragment) {
            injectNavHostFlowFragment(navHostFlowFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(AppActivity appActivity) {
            injectAppActivity(appActivity);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(ChatFragment chatFragment) {
            injectChatFragment(chatFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(ChatListFragment chatListFragment) {
            injectChatListFragment(chatListFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(BotProfileFragment botProfileFragment) {
            injectBotProfileFragment(botProfileFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(BotNameFragment botNameFragment) {
            injectBotNameFragment(botNameFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(BotAgeFragment botAgeFragment) {
            injectBotAgeFragment(botAgeFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(LevelPopupDialog levelPopupDialog) {
            injectLevelPopupDialog(levelPopupDialog);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(BotGenderFragment botGenderFragment) {
            injectBotGenderFragment(botGenderFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(BotEthnicityFragment botEthnicityFragment) {
            injectBotEthnicityFragment(botEthnicityFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(BotPersonalityFragment botPersonalityFragment) {
            injectBotPersonalityFragment(botPersonalityFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(BotVoiceFragment botVoiceFragment) {
            injectBotVoiceFragment(botVoiceFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(ResetFragment resetFragment) {
            injectResetFragment(resetFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(UserProfileFragment userProfileFragment) {
            injectUserProfileFragment(userProfileFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(UserAgeFragment userAgeFragment) {
            injectUserAgeFragment(userAgeFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(UserGenderFragment userGenderFragment) {
            injectUserGenderFragment(userGenderFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(UserNameFragment userNameFragment) {
            injectUserNameFragment(userNameFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(ChangeAppIconFragment changeAppIconFragment) {
            injectChangeAppIconFragment(changeAppIconFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(UserProfileDeleteFragment userProfileDeleteFragment) {
            injectUserProfileDeleteFragment(userProfileDeleteFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(PreviewSendImageFragment previewSendImageFragment) {
            injectPreviewSendImageFragment(previewSendImageFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(ConfirmEmailFragment confirmEmailFragment) {
            injectConfirmEmailFragment(confirmEmailFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(ChangeEmailFragment changeEmailFragment) {
            injectChangeEmailFragment(changeEmailFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(GenerateBotAvatarFragment generateBotAvatarFragment) {
            injectGenerateBotAvatarFragment(generateBotAvatarFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(GeneratingBotAvatarPlaceholderFragment generatingBotAvatarPlaceholderFragment) {
            injectGeneratingBotAvatarPlaceholderFragment(generatingBotAvatarPlaceholderFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(GenerateBotAvatarErrorFragment generateBotAvatarErrorFragment) {
            injectGenerateBotAvatarErrorFragment(generateBotAvatarErrorFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(SelectGeneratedAvatarFragment selectGeneratedAvatarFragment) {
            injectSelectGeneratedAvatarFragment(selectGeneratedAvatarFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(RateAppFragment rateAppFragment) {
            injectRateAppFragment(rateAppFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(BaseDiaryFragment baseDiaryFragment) {
            injectBaseDiaryFragment(baseDiaryFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(LightDiaryFragment lightDiaryFragment) {
            injectLightDiaryFragment(lightDiaryFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(DarkDiaryFragment darkDiaryFragment) {
            injectDarkDiaryFragment(darkDiaryFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(OnboardingFragment onboardingFragment) {
            injectOnboardingFragment(onboardingFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(InfoOnboardingFragment infoOnboardingFragment) {
            injectInfoOnboardingFragment(infoOnboardingFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(HomeFragment homeFragment) {
            injectHomeFragment(homeFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(BuyNeuronsBottomSheetDialogFragment buyNeuronsBottomSheetDialogFragment) {
            injectBuyNeuronsBottomSheetDialogFragment(buyNeuronsBottomSheetDialogFragment);
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public void inject(BuyPremiumFragment buyPremiumFragment) {
            injectBuyPremiumFragment(buyPremiumFragment);
        }

        @Override // com.ifriend.presentation.features.app.di.AppPresentationProvider
        public AppLaunchBillingFlow provideAppLaunchBillingFlow() {
            return (AppLaunchBillingFlow) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppLaunchBillingFlow());
        }

        @Override // com.ifriend.presentation.features.app.di.AppViewModelProvider
        public ChatCallViewModelFactory.Factory provideChatCallViewModelFactory() {
            return this.factoryProvider10.get();
        }

        @Override // com.ifriend.presentation.features.app.di.AppViewModelProvider
        public ActivePremiumBenefitsViewModelFactory provideActivePremiumBenefitsViewModelFactory() {
            return new ActivePremiumBenefitsViewModelFactory(getAllPremiumBenefitsUseCase(), new SubscriptionBenefitsUiMapper(), (DispatcherProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDispatcherProvider()));
        }

        @Override // com.ifriend.presentation.features.app.di.AppViewModelProvider
        public OnboardingFlowViewModelFactory provideOnboardingFlowViewModelFactory() {
            return new OnboardingFlowViewModelFactory(onboardingInteractor(), this.provideAppEventsEmitterProvider.get());
        }

        @Override // com.ifriend.presentation.features.app.di.AppViewModelProvider
        public OnboardingStepViewModelFactory.Factory provideOnboardingStepViewModelFactory() {
            return this.factoryProvider11.get();
        }

        @Override // com.ifriend.presentation.features.app.di.AppViewModelProvider
        public ChatFlowSubscriptionViewModelFactory.Factory provideChatFlowSubscriptionViewModelFactory() {
            return this.factoryProvider12.get();
        }

        @Override // com.ifriend.presentation.features.app.di.AppViewModelProvider
        public ChatBuySubscriptionViewModelFactory.Factory provideChatSubscriptionViewModelFactory() {
            return this.factoryProvider13.get();
        }

        @Override // com.ifriend.presentation.features.app.di.AppViewModelProvider
        public ChatSubscriptionBenefitsViewModelFactory.Factory provideChatSubscriptionBenefitsViewModelFactory() {
            return this.factoryProvider14.get();
        }

        @Override // com.ifriend.presentation.features.app.di.AppViewModelProvider
        public ChatActiveSubscriptionViewModelFactory.Factory provideChatActiveSubscriptionViewModelFactory() {
            return this.factoryProvider15.get();
        }

        @Override // com.ifriend.chat.presentation.di.ChatComponent
        public MessagesSource getMessagesSource() {
            return (MessagesSource) Preconditions.checkNotNullFromComponent(this.baseComponent.provideMessagesSource());
        }

        private BaseActivity injectBaseActivity(BaseActivity baseActivity) {
            BaseActivity_MembersInjector.injectNoInternetPopupDelegate(baseActivity, noInternetPopupDelegate());
            BaseActivity_MembersInjector.injectInternetConnectionDialogsManager(baseActivity, (InternetConnectionDialogsManager) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnectionDialogsManager()));
            return baseActivity;
        }

        private ChatsStoreFragment injectChatsStoreFragment(ChatsStoreFragment chatsStoreFragment) {
            ChatsStoreFragment_MembersInjector.injectImageLoader(chatsStoreFragment, (coil.ImageLoader) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppImageLoader()));
            ChatsStoreFragment_MembersInjector.injectFlowCoordinator(chatsStoreFragment, this.provideAppFlowCoordinatorProvider.get());
            ChatsStoreFragment_MembersInjector.injectViewModelFactory(chatsStoreFragment, this.factoryProvider.get());
            return chatsStoreFragment;
        }

        private ChatSettingsFragment injectChatSettingsFragment(ChatSettingsFragment chatSettingsFragment) {
            ChatSettingsFragment_MembersInjector.injectViewModelFactory(chatSettingsFragment, this.factoryProvider2.get());
            ChatSettingsFragment_MembersInjector.injectImageLoader(chatSettingsFragment, (coil.ImageLoader) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppImageLoader()));
            ChatSettingsFragment_MembersInjector.injectFlowCoordinator(chatSettingsFragment, this.provideAppFlowCoordinatorProvider.get());
            return chatSettingsFragment;
        }

        private NavHostFlowFragment injectNavHostFlowFragment(NavHostFlowFragment navHostFlowFragment) {
            NavHostFlowFragment_MembersInjector.injectFlowCoordinator(navHostFlowFragment, this.provideAppFlowCoordinatorProvider.get());
            NavHostFlowFragment_MembersInjector.injectImageLoader(navHostFlowFragment, (coil.ImageLoader) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppImageLoader()));
            return navHostFlowFragment;
        }

        private AppActivity injectAppActivity(AppActivity appActivity) {
            BaseActivity_MembersInjector.injectNoInternetPopupDelegate(appActivity, noInternetPopupDelegate());
            BaseActivity_MembersInjector.injectInternetConnectionDialogsManager(appActivity, (InternetConnectionDialogsManager) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnectionDialogsManager()));
            AppActivity_MembersInjector.injectAppCicerone(appActivity, (Cicerone) Preconditions.checkNotNullFromComponent(this.baseComponent.appCicerone()));
            AppActivity_MembersInjector.injectAppFlowCoordinator(appActivity, this.provideAppFlowCoordinatorProvider.get());
            AppActivity_MembersInjector.injectNotificationsMapper(appActivity, this.bindNotificationToSnackbarMapperProvider.get());
            AppActivity_MembersInjector.injectMessagesSourceLifecycleController(appActivity, (DefaultLifecycleObserver) Preconditions.checkNotNullFromComponent(this.baseComponent.provideMessageSourceLifecycleController()));
            AppActivity_MembersInjector.injectNotificationHandlersRegister(appActivity, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            AppActivity_MembersInjector.injectViewModelFactory(appActivity, viewModelFactory());
            AppActivity_MembersInjector.injectChatScreenFactory(appActivity, (ChatScreenFactory) Preconditions.checkNotNullFromComponent(this.baseComponent.chatScreenFactory()));
            AppActivity_MembersInjector.injectListenTagsUseCase(appActivity, (ListenTagsUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideListenTagsUseCase()));
            AppActivity_MembersInjector.injectCoroutineDispatchers(appActivity, (CoroutineDispatchers) Preconditions.checkNotNullFromComponent(this.baseComponent.provideCoroutineDispatchers()));
            return appActivity;
        }

        private ChatFragment injectChatFragment(ChatFragment chatFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(chatFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(chatFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(chatFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(chatFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            FlowFragment_MembersInjector.injectCiceroneHolder(chatFragment, (CiceroneHolder) Preconditions.checkNotNullFromComponent(this.baseComponent.ciceroneHolder()));
            ChatFragment_MembersInjector.injectImageLoader(chatFragment, (coil.ImageLoader) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppImageLoader()));
            ChatFragment_MembersInjector.injectFlowCoordinator(chatFragment, this.provideAppFlowCoordinatorProvider.get());
            ChatFragment_MembersInjector.injectViewModelFactory(chatFragment, chatRootViewModelFactory());
            ChatFragment_MembersInjector.injectShowRateAppDialog(chatFragment, showRateAppDialog());
            ChatFragment_MembersInjector.injectChooseVoicePopupDelegate(chatFragment, chooseVoicePopupDelegate());
            return chatFragment;
        }

        private ChatListFragment injectChatListFragment(ChatListFragment chatListFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(chatListFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(chatListFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(chatListFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(chatListFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            ChatListFragment_MembersInjector.injectAudioPlayer(chatListFragment, this.audioPlayerProvider.get());
            ChatListFragment_MembersInjector.injectAudioAnalytics(chatListFragment, audioMessageChatAnalytics());
            ChatListFragment_MembersInjector.injectImageLoader(chatListFragment, this.imageLoaderProvider.get());
            ChatListFragment_MembersInjector.injectViewModelFactory(chatListFragment, chatViewModelFactory());
            return chatListFragment;
        }

        private BotProfileFragment injectBotProfileFragment(BotProfileFragment botProfileFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(botProfileFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(botProfileFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(botProfileFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(botProfileFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            BotProfileFragment_MembersInjector.injectNotificationHandlersRegister(botProfileFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BotProfileFragment_MembersInjector.injectViewModelFactory(botProfileFragment, viewModelFactory());
            BotProfileFragment_MembersInjector.injectGeneratingAnimatedAvatarPopupDelegate(botProfileFragment, generatingAnimatedAvatarPopupDelegate());
            return botProfileFragment;
        }

        private BotNameFragment injectBotNameFragment(BotNameFragment botNameFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(botNameFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(botNameFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(botNameFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(botNameFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            BotNameFragment_MembersInjector.injectViewModelFactory(botNameFragment, viewModelFactory());
            return botNameFragment;
        }

        private BotAgeFragment injectBotAgeFragment(BotAgeFragment botAgeFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(botAgeFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(botAgeFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(botAgeFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(botAgeFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            BotAgeFragment_MembersInjector.injectViewModelFactory(botAgeFragment, viewModelFactory());
            return botAgeFragment;
        }

        private LevelPopupDialog injectLevelPopupDialog(LevelPopupDialog levelPopupDialog) {
            LevelPopupDialog_MembersInjector.injectViewModelFactory(levelPopupDialog, viewModelFactory());
            return levelPopupDialog;
        }

        private BotGenderFragment injectBotGenderFragment(BotGenderFragment botGenderFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(botGenderFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(botGenderFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(botGenderFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(botGenderFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            BotGenderFragment_MembersInjector.injectViewModelFactory(botGenderFragment, viewModelFactory());
            return botGenderFragment;
        }

        private BotEthnicityFragment injectBotEthnicityFragment(BotEthnicityFragment botEthnicityFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(botEthnicityFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(botEthnicityFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(botEthnicityFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(botEthnicityFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            BotEthnicityFragment_MembersInjector.injectViewModelFactory(botEthnicityFragment, viewModelFactory());
            return botEthnicityFragment;
        }

        private BotPersonalityFragment injectBotPersonalityFragment(BotPersonalityFragment botPersonalityFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(botPersonalityFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(botPersonalityFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(botPersonalityFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(botPersonalityFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            BotPersonalityFragment_MembersInjector.injectViewModelFactory(botPersonalityFragment, viewModelFactory());
            return botPersonalityFragment;
        }

        private BotVoiceFragment injectBotVoiceFragment(BotVoiceFragment botVoiceFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(botVoiceFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(botVoiceFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(botVoiceFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(botVoiceFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            BotVoiceFragment_MembersInjector.injectViewModelFactory(botVoiceFragment, viewModelFactory());
            return botVoiceFragment;
        }

        private ResetFragment injectResetFragment(ResetFragment resetFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(resetFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(resetFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(resetFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(resetFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            ResetFragment_MembersInjector.injectViewModelFactory(resetFragment, viewModelFactory());
            ResetFragment_MembersInjector.injectChatScreenFactory(resetFragment, (ChatScreenFactory) Preconditions.checkNotNullFromComponent(this.baseComponent.chatScreenFactory()));
            ResetFragment_MembersInjector.injectAppFlowCoordinator(resetFragment, this.provideAppFlowCoordinatorProvider.get());
            return resetFragment;
        }

        private UserProfileFragment injectUserProfileFragment(UserProfileFragment userProfileFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(userProfileFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(userProfileFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(userProfileFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(userProfileFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            UserProfileFragment_MembersInjector.injectViewModelFactory(userProfileFragment, viewModelFactory());
            return userProfileFragment;
        }

        private UserAgeFragment injectUserAgeFragment(UserAgeFragment userAgeFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(userAgeFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(userAgeFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(userAgeFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(userAgeFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            UserAgeFragment_MembersInjector.injectViewModelFactory(userAgeFragment, viewModelFactory());
            return userAgeFragment;
        }

        private UserGenderFragment injectUserGenderFragment(UserGenderFragment userGenderFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(userGenderFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(userGenderFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(userGenderFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(userGenderFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            UserGenderFragment_MembersInjector.injectViewModelFactory(userGenderFragment, viewModelFactory());
            return userGenderFragment;
        }

        private UserNameFragment injectUserNameFragment(UserNameFragment userNameFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(userNameFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(userNameFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(userNameFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(userNameFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            UserNameFragment_MembersInjector.injectViewModelFactory(userNameFragment, viewModelFactory());
            return userNameFragment;
        }

        private ChangeAppIconFragment injectChangeAppIconFragment(ChangeAppIconFragment changeAppIconFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(changeAppIconFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(changeAppIconFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(changeAppIconFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(changeAppIconFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            ChangeAppIconFragment_MembersInjector.injectViewModelFactory(changeAppIconFragment, viewModelFactory());
            return changeAppIconFragment;
        }

        private UserProfileDeleteFragment injectUserProfileDeleteFragment(UserProfileDeleteFragment userProfileDeleteFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(userProfileDeleteFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(userProfileDeleteFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(userProfileDeleteFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(userProfileDeleteFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            UserProfileDeleteFragment_MembersInjector.injectViewModelFactory(userProfileDeleteFragment, viewModelFactory());
            return userProfileDeleteFragment;
        }

        private PreviewSendImageFragment injectPreviewSendImageFragment(PreviewSendImageFragment previewSendImageFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(previewSendImageFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(previewSendImageFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(previewSendImageFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(previewSendImageFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            PreviewSendImageFragment_MembersInjector.injectViewModelFactory(previewSendImageFragment, viewModelFactory());
            return previewSendImageFragment;
        }

        private ConfirmEmailFragment injectConfirmEmailFragment(ConfirmEmailFragment confirmEmailFragment) {
            ConfirmEmailFragment_MembersInjector.injectAnalyticsCheckMyInboxClickedUseCase(confirmEmailFragment, analyticsCheckMyInboxClickedUseCase());
            ConfirmEmailFragment_MembersInjector.injectViewModelFactory(confirmEmailFragment, viewModelFactory());
            ConfirmEmailFragment_MembersInjector.injectAppFlowCoordinator(confirmEmailFragment, this.provideAppFlowCoordinatorProvider.get());
            return confirmEmailFragment;
        }

        private ChangeEmailFragment injectChangeEmailFragment(ChangeEmailFragment changeEmailFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(changeEmailFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(changeEmailFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(changeEmailFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(changeEmailFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            ChangeEmailFragment_MembersInjector.injectViewModelFactory(changeEmailFragment, viewModelFactory());
            return changeEmailFragment;
        }

        private GenerateBotAvatarFragment injectGenerateBotAvatarFragment(GenerateBotAvatarFragment generateBotAvatarFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(generateBotAvatarFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(generateBotAvatarFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(generateBotAvatarFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(generateBotAvatarFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            GenerateBotAvatarFragment_MembersInjector.injectViewModelFactory(generateBotAvatarFragment, viewModelFactory());
            return generateBotAvatarFragment;
        }

        private GeneratingBotAvatarPlaceholderFragment injectGeneratingBotAvatarPlaceholderFragment(GeneratingBotAvatarPlaceholderFragment generatingBotAvatarPlaceholderFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(generatingBotAvatarPlaceholderFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(generatingBotAvatarPlaceholderFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(generatingBotAvatarPlaceholderFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(generatingBotAvatarPlaceholderFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            GeneratingBotAvatarPlaceholderFragment_MembersInjector.injectInternalNotificationsRegister(generatingBotAvatarPlaceholderFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            GeneratingBotAvatarPlaceholderFragment_MembersInjector.injectGenerateBotAvatarScreenFactory(generatingBotAvatarPlaceholderFragment, this.provideGenerateBotAvatarRouteFactoryProvider.get());
            GeneratingBotAvatarPlaceholderFragment_MembersInjector.injectViewModelFactory(generatingBotAvatarPlaceholderFragment, viewModelFactory());
            return generatingBotAvatarPlaceholderFragment;
        }

        private GenerateBotAvatarErrorFragment injectGenerateBotAvatarErrorFragment(GenerateBotAvatarErrorFragment generateBotAvatarErrorFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(generateBotAvatarErrorFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(generateBotAvatarErrorFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(generateBotAvatarErrorFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(generateBotAvatarErrorFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            GenerateBotAvatarErrorFragment_MembersInjector.injectViewModelFactory(generateBotAvatarErrorFragment, viewModelFactory());
            return generateBotAvatarErrorFragment;
        }

        private SelectGeneratedAvatarFragment injectSelectGeneratedAvatarFragment(SelectGeneratedAvatarFragment selectGeneratedAvatarFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(selectGeneratedAvatarFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(selectGeneratedAvatarFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(selectGeneratedAvatarFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(selectGeneratedAvatarFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            SelectGeneratedAvatarFragment_MembersInjector.injectViewModelFactory(selectGeneratedAvatarFragment, viewModelFactory());
            SelectGeneratedAvatarFragment_MembersInjector.injectGenerateBotAvatarScreenFactory(selectGeneratedAvatarFragment, this.provideGenerateBotAvatarRouteFactoryProvider.get());
            return selectGeneratedAvatarFragment;
        }

        private RateAppFragment injectRateAppFragment(RateAppFragment rateAppFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(rateAppFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(rateAppFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(rateAppFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(rateAppFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            RateAppFragment_MembersInjector.injectViewModelFactory(rateAppFragment, viewModelFactory());
            return rateAppFragment;
        }

        private BaseDiaryFragment injectBaseDiaryFragment(BaseDiaryFragment baseDiaryFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(baseDiaryFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(baseDiaryFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(baseDiaryFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(baseDiaryFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            return baseDiaryFragment;
        }

        private LightDiaryFragment injectLightDiaryFragment(LightDiaryFragment lightDiaryFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(lightDiaryFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(lightDiaryFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(lightDiaryFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(lightDiaryFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            LightDiaryFragment_MembersInjector.injectViewModelFactory(lightDiaryFragment, viewModelFactory());
            return lightDiaryFragment;
        }

        private DarkDiaryFragment injectDarkDiaryFragment(DarkDiaryFragment darkDiaryFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(darkDiaryFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(darkDiaryFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(darkDiaryFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(darkDiaryFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            DarkDiaryFragment_MembersInjector.injectViewModelFactory(darkDiaryFragment, viewModelFactory());
            return darkDiaryFragment;
        }

        private OnboardingFragment injectOnboardingFragment(OnboardingFragment onboardingFragment) {
            OnboardingFragment_MembersInjector.injectFactory(onboardingFragment, provideOnboardingFlowViewModelFactory());
            OnboardingFragment_MembersInjector.injectImageLoader(onboardingFragment, (coil.ImageLoader) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppImageLoader()));
            return onboardingFragment;
        }

        private InfoOnboardingFragment injectInfoOnboardingFragment(InfoOnboardingFragment infoOnboardingFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(infoOnboardingFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(infoOnboardingFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(infoOnboardingFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(infoOnboardingFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            InfoOnboardingFragment_MembersInjector.injectViewModelFactory(infoOnboardingFragment, viewModelFactory());
            return infoOnboardingFragment;
        }

        private HomeFragment injectHomeFragment(HomeFragment homeFragment) {
            BaseFragment_MembersInjector.injectInternetConnection(homeFragment, (InternetConnection) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternetConnection()));
            BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(homeFragment, (InternalNotificationHandlersRegister) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationHandlersRegister()));
            BaseFragment_MembersInjector.injectLogger(homeFragment, (Logger) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLogger()));
            BaseFragment_MembersInjector.injectRouterProvider(homeFragment, (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider()));
            HomeFragment_MembersInjector.injectViewModelFactory(homeFragment, viewModelFactory());
            HomeFragment_MembersInjector.injectFlowCoordinator(homeFragment, this.provideAppFlowCoordinatorProvider.get());
            HomeFragment_MembersInjector.injectImageLoader(homeFragment, (coil.ImageLoader) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppImageLoader()));
            return homeFragment;
        }

        private BuyNeuronsBottomSheetDialogFragment injectBuyNeuronsBottomSheetDialogFragment(BuyNeuronsBottomSheetDialogFragment buyNeuronsBottomSheetDialogFragment) {
            BuyNeuronsBottomSheetDialogFragment_MembersInjector.injectViewModelFactory(buyNeuronsBottomSheetDialogFragment, this.factoryProvider8.get());
            BuyNeuronsBottomSheetDialogFragment_MembersInjector.injectAppLaunchBillingFlow(buyNeuronsBottomSheetDialogFragment, (AppLaunchBillingFlow) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppLaunchBillingFlow()));
            return buyNeuronsBottomSheetDialogFragment;
        }

        private BuyPremiumFragment injectBuyPremiumFragment(BuyPremiumFragment buyPremiumFragment) {
            BuyPremiumFragment_MembersInjector.injectFactory(buyPremiumFragment, this.factoryProvider9.get());
            BuyPremiumFragment_MembersInjector.injectFlowCoordinator(buyPremiumFragment, this.provideAppFlowCoordinatorProvider.get());
            BuyPremiumFragment_MembersInjector.injectAppLaunchBillingFlow(buyPremiumFragment, (AppLaunchBillingFlow) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppLaunchBillingFlow()));
            return buyPremiumFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class RouterProviderProvider implements Provider<RouterProvider> {
            private final BaseComponent baseComponent;

            RouterProviderProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public RouterProvider get() {
                return (RouterProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.routerProvider());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ChatScreenFactoryProvider implements Provider<ChatScreenFactory> {
            private final BaseComponent baseComponent;

            ChatScreenFactoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChatScreenFactory get() {
                return (ChatScreenFactory) Preconditions.checkNotNullFromComponent(this.baseComponent.chatScreenFactory());
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
        public static final class ProvideAppConfigLocalDataSourceProvider implements Provider<AppConfigLocalDataSource> {
            private final BaseComponent baseComponent;

            ProvideAppConfigLocalDataSourceProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AppConfigLocalDataSource get() {
                return (AppConfigLocalDataSource) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppConfigLocalDataSource());
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
        public static final class ProvideChatsInfoRepositoryProvider implements Provider<ChatsInfoRepository> {
            private final BaseComponent baseComponent;

            ProvideChatsInfoRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChatsInfoRepository get() {
                return (ChatsInfoRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatsInfoRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideConfigurationBotsMemoryCachedSourceProvider implements Provider<ChatConfigsMemoryCachedSource> {
            private final BaseComponent baseComponent;

            ProvideConfigurationBotsMemoryCachedSourceProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChatConfigsMemoryCachedSource get() {
                return (ChatConfigsMemoryCachedSource) Preconditions.checkNotNullFromComponent(this.baseComponent.provideConfigurationBotsMemoryCachedSource());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideFeatureExplanationRepoProvider implements Provider<UserGuideRepository> {
            private final BaseComponent baseComponent;

            ProvideFeatureExplanationRepoProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public UserGuideRepository get() {
                return (UserGuideRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideFeatureExplanationRepo());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideResourceProviderProvider implements Provider<ResourceProvider> {
            private final BaseComponent baseComponent;

            ProvideResourceProviderProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ResourceProvider get() {
                return (ResourceProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideResourceProvider());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideUserApiServiceProvider implements Provider<UserApiService> {
            private final BaseComponent baseComponent;

            ProvideUserApiServiceProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public UserApiService get() {
                return (UserApiService) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserApiService());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideCoreExecuteCatchingProvider implements Provider<CoreExecuteCatching> {
            private final BaseComponent baseComponent;

            ProvideCoreExecuteCatchingProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public CoreExecuteCatching get() {
                return (CoreExecuteCatching) Preconditions.checkNotNullFromComponent(this.baseComponent.provideCoreExecuteCatching());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideAuthLocalDataSourceProvider implements Provider<AuthLocalDataSource> {
            private final BaseComponent baseComponent;

            ProvideAuthLocalDataSourceProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AuthLocalDataSource get() {
                return (AuthLocalDataSource) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAuthLocalDataSource());
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
        public static final class ProvideChatSubscriptionRepositoryProvider implements Provider<ChatSubscriptionRepository> {
            private final BaseComponent baseComponent;

            ProvideChatSubscriptionRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChatSubscriptionRepository get() {
                return (ChatSubscriptionRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatSubscriptionRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideChatsRepositoryProvider implements Provider<ChatsRepository> {
            private final BaseComponent baseComponent;

            ProvideChatsRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChatsRepository get() {
                return (ChatsRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatsRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideAppIdentityConverterProvider implements Provider<AppIdentityConverter> {
            private final BaseComponent baseComponent;

            ProvideAppIdentityConverterProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AppIdentityConverter get() {
                return (AppIdentityConverter) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppIdentityConverter());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideLevelsInfoUseCaseProvider implements Provider<GetLevelInfoUseCase> {
            private final BaseComponent baseComponent;

            ProvideLevelsInfoUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public GetLevelInfoUseCase get() {
                return (GetLevelInfoUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLevelsInfoUseCase());
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
        public static final class ProvideUserSubscriptionsBroadcastProvider implements Provider<UserSubscriptionsBroadcast> {
            private final BaseComponent baseComponent;

            ProvideUserSubscriptionsBroadcastProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public UserSubscriptionsBroadcast get() {
                return (UserSubscriptionsBroadcast) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserSubscriptionsBroadcast());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideMessagesSourceProvider implements Provider<MessagesSource> {
            private final BaseComponent baseComponent;

            ProvideMessagesSourceProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public MessagesSource get() {
                return (MessagesSource) Preconditions.checkNotNullFromComponent(this.baseComponent.provideMessagesSource());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideAuthDataProviderProvider implements Provider<AuthDataProvider> {
            private final BaseComponent baseComponent;

            ProvideAuthDataProviderProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AuthDataProvider get() {
                return (AuthDataProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAuthDataProvider());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideLiveChatMessagesFlowProvider implements Provider<LiveChatMessagesFlow> {
            private final BaseComponent baseComponent;

            ProvideLiveChatMessagesFlowProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public LiveChatMessagesFlow get() {
                return (LiveChatMessagesFlow) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLiveChatMessagesFlow());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideShowRateUsUseCaseProvider implements Provider<ShowRateUsUseCase> {
            private final BaseComponent baseComponent;

            ProvideShowRateUsUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ShowRateUsUseCase get() {
                return (ShowRateUsUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideShowRateUsUseCase());
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
        public static final class ProvideChatApiProvider implements Provider<ChatMessagesApi> {
            private final BaseComponent baseComponent;

            ProvideChatApiProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChatMessagesApi get() {
                return (ChatMessagesApi) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatApi());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideAudioMessageUrlGeneratorProvider implements Provider<BotAudioMessageUrlGenerator> {
            private final BaseComponent baseComponent;

            ProvideAudioMessageUrlGeneratorProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public BotAudioMessageUrlGenerator get() {
                return (BotAudioMessageUrlGenerator) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAudioMessageUrlGenerator());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideUserAudioMessageUrlGeneratorProvider implements Provider<UserAudioMessageUrlGenerator> {
            private final BaseComponent baseComponent;

            ProvideUserAudioMessageUrlGeneratorProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public UserAudioMessageUrlGenerator get() {
                return (UserAudioMessageUrlGenerator) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserAudioMessageUrlGenerator());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class GetAppConfigStorageProvider implements Provider<AppConfigStorage> {
            private final BaseComponent baseComponent;

            GetAppConfigStorageProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AppConfigStorage get() {
                return (AppConfigStorage) Preconditions.checkNotNullFromComponent(this.baseComponent.getAppConfigStorage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideDispatcherProviderProvider implements Provider<DispatcherProvider> {
            private final BaseComponent baseComponent;

            ProvideDispatcherProviderProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public DispatcherProvider get() {
                return (DispatcherProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDispatcherProvider());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideChatsInfoConfigurationRepositoryProvider implements Provider<ChatsInfoConfigurationRepository> {
            private final BaseComponent baseComponent;

            ProvideChatsInfoConfigurationRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChatsInfoConfigurationRepository get() {
                return (ChatsInfoConfigurationRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatsInfoConfigurationRepository());
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
        public static final class ProvideAuthDataStorageProvider implements Provider<AuthDataStorage> {
            private final BaseComponent baseComponent;

            ProvideAuthDataStorageProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AuthDataStorage get() {
                return (AuthDataStorage) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAuthDataStorage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideTokenStorageProvider implements Provider<UserTokenStorage> {
            private final BaseComponent baseComponent;

            ProvideTokenStorageProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public UserTokenStorage get() {
                return (UserTokenStorage) Preconditions.checkNotNullFromComponent(this.baseComponent.provideTokenStorage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class AvatarsStorageProvider implements Provider<AvatarsStorage> {
            private final BaseComponent baseComponent;

            AvatarsStorageProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AvatarsStorage get() {
                return (AvatarsStorage) Preconditions.checkNotNullFromComponent(this.baseComponent.avatarsStorage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideLongTermNotificationManagerProvider implements Provider<LongTermNotificationManager> {
            private final BaseComponent baseComponent;

            ProvideLongTermNotificationManagerProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public LongTermNotificationManager get() {
                return (LongTermNotificationManager) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLongTermNotificationManager());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideInternalNotificationsQueueProvider implements Provider<InternalNotificationsQueue> {
            private final BaseComponent baseComponent;

            ProvideInternalNotificationsQueueProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public InternalNotificationsQueue get() {
                return (InternalNotificationsQueue) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInternalNotificationsQueue());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideGenerateBotAvatarRepositoryProvider implements Provider<GenerateBotAvatarRepository> {
            private final BaseComponent baseComponent;

            ProvideGenerateBotAvatarRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public GenerateBotAvatarRepository get() {
                return (GenerateBotAvatarRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideGenerateBotAvatarRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideDiaryRepositoryProvider implements Provider<DiaryRepository> {
            private final BaseComponent baseComponent;

            ProvideDiaryRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public DiaryRepository get() {
                return (DiaryRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDiaryRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideLevelsRepositoryProvider implements Provider<LevelsRepository> {
            private final BaseComponent baseComponent;

            ProvideLevelsRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public LevelsRepository get() {
                return (LevelsRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideLevelsRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideChatGiftsRepositoryProvider implements Provider<ChatGiftsRepository> {
            private final BaseComponent baseComponent;

            ProvideChatGiftsRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChatGiftsRepository get() {
                return (ChatGiftsRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatGiftsRepository());
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
        public static final class ProvideOnboardingChatConfigsMemoryCachedSourceProvider implements Provider<OnboardingChatConfigsMemoryCachedSource> {
            private final BaseComponent baseComponent;

            ProvideOnboardingChatConfigsMemoryCachedSourceProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public OnboardingChatConfigsMemoryCachedSource get() {
                return (OnboardingChatConfigsMemoryCachedSource) Preconditions.checkNotNullFromComponent(this.baseComponent.provideOnboardingChatConfigsMemoryCachedSource());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideFirebaseProcessProvider implements Provider<FirebaseApiRepository> {
            private final BaseComponent baseComponent;

            ProvideFirebaseProcessProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public FirebaseApiRepository get() {
                return (FirebaseApiRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideFirebaseProcess());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideAnalyticsInteractorProvider implements Provider<AnalyticsInteractor> {
            private final BaseComponent baseComponent;

            ProvideAnalyticsInteractorProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AnalyticsInteractor get() {
                return (AnalyticsInteractor) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAnalyticsInteractor());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideChatNotificationsRepositoryProvider implements Provider<ChatNotificationsRepository> {
            private final BaseComponent baseComponent;

            ProvideChatNotificationsRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChatNotificationsRepository get() {
                return (ChatNotificationsRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChatNotificationsRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideBillingInteractorProvider implements Provider<BillingInteractor> {
            private final BaseComponent baseComponent;

            ProvideBillingInteractorProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public BillingInteractor get() {
                return (BillingInteractor) Preconditions.checkNotNullFromComponent(this.baseComponent.provideBillingInteractor());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideRateUsStateStorageProvider implements Provider<RateUsStateStorage> {
            private final BaseComponent baseComponent;

            ProvideRateUsStateStorageProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public RateUsStateStorage get() {
                return (RateUsStateStorage) Preconditions.checkNotNullFromComponent(this.baseComponent.provideRateUsStateStorage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideRateAndReviewUsToggleProvider implements Provider<RateAndReviewUsToggle> {
            private final BaseComponent baseComponent;

            ProvideRateAndReviewUsToggleProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public RateAndReviewUsToggle get() {
                return (RateAndReviewUsToggle) Preconditions.checkNotNullFromComponent(this.baseComponent.provideRateAndReviewUsToggle());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideBillingPurchasesHistoryProvider implements Provider<BillingPurchasesHistory> {
            private final BaseComponent baseComponent;

            ProvideBillingPurchasesHistoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public BillingPurchasesHistory get() {
                return (BillingPurchasesHistory) Preconditions.checkNotNullFromComponent(this.baseComponent.provideBillingPurchasesHistory());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideRateAppShowingPlannerProvider implements Provider<RateAppShowingPlanner> {
            private final BaseComponent baseComponent;

            ProvideRateAppShowingPlannerProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public RateAppShowingPlanner get() {
                return (RateAppShowingPlanner) Preconditions.checkNotNullFromComponent(this.baseComponent.provideRateAppShowingPlanner());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideDeepLinksRepositoryProvider implements Provider<DeepLinksRepository> {
            private final BaseComponent baseComponent;

            ProvideDeepLinksRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public DeepLinksRepository get() {
                return (DeepLinksRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDeepLinksRepository());
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
        public static final class ProvideGetUserUseCaseProvider implements Provider<GetUserUseCase> {
            private final BaseComponent baseComponent;

            ProvideGetUserUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public GetUserUseCase get() {
                return (GetUserUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideGetUserUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideUserSharedPreferencesProvider implements Provider<Preferences> {
            private final BaseComponent baseComponent;

            ProvideUserSharedPreferencesProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public Preferences get() {
                return (Preferences) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserSharedPreferences());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideContextProvider implements Provider<Context> {
            private final BaseComponent baseComponent;

            ProvideContextProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public Context get() {
                return (Context) Preconditions.checkNotNullFromComponent(this.baseComponent.provideContext());
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
        public static final class ProvideUserOffersRepositoryProvider implements Provider<UserOffersRepository> {
            private final BaseComponent baseComponent;

            ProvideUserOffersRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public UserOffersRepository get() {
                return (UserOffersRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideUserOffersRepository());
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

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideAppUpdateManagerProvider implements Provider<AppUpdateManager> {
            private final BaseComponent baseComponent;

            ProvideAppUpdateManagerProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AppUpdateManager get() {
                return (AppUpdateManager) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppUpdateManager());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideInAppUpdateRepositoryProvider implements Provider<InAppUpdateRepository> {
            private final BaseComponent baseComponent;

            ProvideInAppUpdateRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public InAppUpdateRepository get() {
                return (InAppUpdateRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideInAppUpdateRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideAppImageLoaderRepositoryProvider implements Provider<AppImageLoaderRepository> {
            private final BaseComponent baseComponent;

            ProvideAppImageLoaderRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AppImageLoaderRepository get() {
                return (AppImageLoaderRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppImageLoaderRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideBuyChatMessagesRepositoryProvider implements Provider<BuyChatMessagesRepository> {
            private final BaseComponent baseComponent;

            ProvideBuyChatMessagesRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public BuyChatMessagesRepository get() {
                return (BuyChatMessagesRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideBuyChatMessagesRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideAvatarAnimationEnabledStorageProvider implements Provider<AvatarAnimationEnabledStorage> {
            private final BaseComponent baseComponent;

            ProvideAvatarAnimationEnabledStorageProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AvatarAnimationEnabledStorage get() {
                return (AvatarAnimationEnabledStorage) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAvatarAnimationEnabledStorage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideFeatureToggleRepositoryProvider implements Provider<FeatureToggleRepository> {
            private final BaseComponent baseComponent;

            ProvideFeatureToggleRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public FeatureToggleRepository get() {
                return (FeatureToggleRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideFeatureToggleRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideNeuronsFeatureToggleProvider implements Provider<FeatureToggle> {
            private final BaseComponent baseComponent;

            ProvideNeuronsFeatureToggleProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public FeatureToggle get() {
                return (FeatureToggle) Preconditions.checkNotNullFromComponent(this.baseComponent.provideNeuronsFeatureToggle());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideConfirmEmailFeatureToggleProvider implements Provider<ConfirmEmailFeatureToggle> {
            private final BaseComponent baseComponent;

            ProvideConfirmEmailFeatureToggleProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ConfirmEmailFeatureToggle get() {
                return (ConfirmEmailFeatureToggle) Preconditions.checkNotNullFromComponent(this.baseComponent.provideConfirmEmailFeatureToggle());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideTagsProviderProvider implements Provider<TagsProvider> {
            private final BaseComponent baseComponent;

            ProvideTagsProviderProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public TagsProvider get() {
                return (TagsProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideTagsProvider());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideGetBotUseCaseProvider implements Provider<GetBotUseCase> {
            private final BaseComponent baseComponent;

            ProvideGetBotUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public GetBotUseCase get() {
                return (GetBotUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideGetBotUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideAnimatedAvatarFeatureToggleProvider implements Provider<AnimatedAvatarFeatureToggle> {
            private final BaseComponent baseComponent;

            ProvideAnimatedAvatarFeatureToggleProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AnimatedAvatarFeatureToggle get() {
                return (AnimatedAvatarFeatureToggle) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAnimatedAvatarFeatureToggle());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideMediaPlayerPlaybackControllerGeneratorProvider implements Provider<MediaPlayerPlaybackControllerGenerator> {
            private final BaseComponent baseComponent;

            ProvideMediaPlayerPlaybackControllerGeneratorProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public MediaPlayerPlaybackControllerGenerator get() {
                return (MediaPlayerPlaybackControllerGenerator) Preconditions.checkNotNullFromComponent(this.baseComponent.provideMediaPlayerPlaybackControllerGenerator());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideChangeBotNameUseCaseProvider implements Provider<ChangeBotNameUseCase> {
            private final BaseComponent baseComponent;

            ProvideChangeBotNameUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChangeBotNameUseCase get() {
                return (ChangeBotNameUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChangeBotNameUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideValidateNameUseCaseProvider implements Provider<ValidateNameUseCase> {
            private final BaseComponent baseComponent;

            ProvideValidateNameUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ValidateNameUseCase get() {
                return (ValidateNameUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideValidateNameUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideChangeBotAgeUseCaseProvider implements Provider<ChangeBotAgeUseCase> {
            private final BaseComponent baseComponent;

            ProvideChangeBotAgeUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChangeBotAgeUseCase get() {
                return (ChangeBotAgeUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChangeBotAgeUseCase());
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
        public static final class ProvideValidateAgeUseCaseProvider implements Provider<ValidateAgeUseCase> {
            private final BaseComponent baseComponent;

            ProvideValidateAgeUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ValidateAgeUseCase get() {
                return (ValidateAgeUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideValidateAgeUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideChangeBotGenderUseCaseProvider implements Provider<ChangeBotGenderUseCase> {
            private final BaseComponent baseComponent;

            ProvideChangeBotGenderUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChangeBotGenderUseCase get() {
                return (ChangeBotGenderUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChangeBotGenderUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideChangeBotEthnicityUseCaseProvider implements Provider<ChangeBotEthnicityUseCase> {
            private final BaseComponent baseComponent;

            ProvideChangeBotEthnicityUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChangeBotEthnicityUseCase get() {
                return (ChangeBotEthnicityUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChangeBotEthnicityUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideChangeBotPersonalityUseCaseProvider implements Provider<ChangeBotPersonalityUseCase> {
            private final BaseComponent baseComponent;

            ProvideChangeBotPersonalityUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChangeBotPersonalityUseCase get() {
                return (ChangeBotPersonalityUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChangeBotPersonalityUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideChangeBotVoiceUseCaseProvider implements Provider<ChangeBotVoiceUseCase> {
            private final BaseComponent baseComponent;

            ProvideChangeBotVoiceUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChangeBotVoiceUseCase get() {
                return (ChangeBotVoiceUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChangeBotVoiceUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideTokenProviderProvider implements Provider<UserTokenProvider> {
            private final BaseComponent baseComponent;

            ProvideTokenProviderProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public UserTokenProvider get() {
                return (UserTokenProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideTokenProvider());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideRetrofitProvider implements Provider<Retrofit> {
            private final BaseComponent baseComponent;

            ProvideRetrofitProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            @Override // javax.inject.Provider
            public Retrofit get() {
                return (Retrofit) Preconditions.checkNotNullFromComponent(this.baseComponent.provideRetrofit());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideAppLoggerInteractorProvider implements Provider<AppLoggerInteractor> {
            private final BaseComponent baseComponent;

            ProvideAppLoggerInteractorProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AppLoggerInteractor get() {
                return (AppLoggerInteractor) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppLoggerInteractor());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideChangeUserNameUseCaseProvider implements Provider<ChangeUserNameUseCase> {
            private final BaseComponent baseComponent;

            ProvideChangeUserNameUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChangeUserNameUseCase get() {
                return (ChangeUserNameUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChangeUserNameUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideChangeUserGenderUseCaseProvider implements Provider<ChangeUserGenderUseCase> {
            private final BaseComponent baseComponent;

            ProvideChangeUserGenderUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChangeUserGenderUseCase get() {
                return (ChangeUserGenderUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChangeUserGenderUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideChangeUserAgeUseCaseProvider implements Provider<ChangeUserAgeUseCase> {
            private final BaseComponent baseComponent;

            ProvideChangeUserAgeUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ChangeUserAgeUseCase get() {
                return (ChangeUserAgeUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideChangeUserAgeUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideSendConfirmationEmailUseCaseProvider implements Provider<SendConfirmationEmailUseCase> {
            private final BaseComponent baseComponent;

            ProvideSendConfirmationEmailUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public SendConfirmationEmailUseCase get() {
                return (SendConfirmationEmailUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideSendConfirmationEmailUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideEventDelayStorageProvider implements Provider<EventDelayStorage> {
            private final BaseComponent baseComponent;

            ProvideEventDelayStorageProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public EventDelayStorage get() {
                return (EventDelayStorage) Preconditions.checkNotNullFromComponent(this.baseComponent.provideEventDelayStorage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideNeuronsCostsStorageProvider implements Provider<NeuronsCostsStorage> {
            private final BaseComponent baseComponent;

            ProvideNeuronsCostsStorageProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public NeuronsCostsStorage get() {
                return (NeuronsCostsStorage) Preconditions.checkNotNullFromComponent(this.baseComponent.provideNeuronsCostsStorage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideRateUsRepositoryProvider implements Provider<RateUsRepository> {
            private final BaseComponent baseComponent;

            ProvideRateUsRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public RateUsRepository get() {
                return (RateUsRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideRateUsRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideOnUserRateUsUseCaseProvider implements Provider<OnUserRatedAppUseCase> {
            private final BaseComponent baseComponent;

            ProvideOnUserRateUsUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public OnUserRatedAppUseCase get() {
                return (OnUserRatedAppUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideOnUserRateUsUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideGetDiaryNotesUseCaseProvider implements Provider<GetDiaryNotesListUseCase> {
            private final BaseComponent baseComponent;

            ProvideGetDiaryNotesUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public GetDiaryNotesListUseCase get() {
                return (GetDiaryNotesListUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideGetDiaryNotesUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideReplyDiaryNoteUseCaseProvider implements Provider<ReplyDiaryNoteUseCase> {
            private final BaseComponent baseComponent;

            ProvideReplyDiaryNoteUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public ReplyDiaryNoteUseCase get() {
                return (ReplyDiaryNoteUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideReplyDiaryNoteUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideRefreshDiaryUseCaseProvider implements Provider<RefreshDiaryUseCase> {
            private final BaseComponent baseComponent;

            ProvideRefreshDiaryUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public RefreshDiaryUseCase get() {
                return (RefreshDiaryUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideRefreshDiaryUseCase());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideOnDiaryShownUseCaseProvider implements Provider<OnDiaryShownUseCase> {
            private final BaseComponent baseComponent;

            ProvideOnDiaryShownUseCaseProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public OnDiaryShownUseCase get() {
                return (OnDiaryShownUseCase) Preconditions.checkNotNullFromComponent(this.baseComponent.provideOnDiaryShownUseCase());
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
        public static final class AnalyticsEngineProvider implements Provider<AnalyticsEngine> {
            private final BaseComponent baseComponent;

            AnalyticsEngineProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AnalyticsEngine get() {
                return (AnalyticsEngine) Preconditions.checkNotNullFromComponent(this.baseComponent.analyticsEngine());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideTopicsApiProvider implements Provider<TopicsApi> {
            private final BaseComponent baseComponent;

            ProvideTopicsApiProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public TopicsApi get() {
                return (TopicsApi) Preconditions.checkNotNullFromComponent(this.baseComponent.provideTopicsApi());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideCallsApiServiceProvider implements Provider<CallsApiService> {
            private final BaseComponent baseComponent;

            ProvideCallsApiServiceProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public CallsApiService get() {
                return (CallsApiService) Preconditions.checkNotNullFromComponent(this.baseComponent.provideCallsApiService());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideAudioMessageRepositoryProvider implements Provider<AudioMessageRepository> {
            private final BaseComponent baseComponent;

            ProvideAudioMessageRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AudioMessageRepository get() {
                return (AudioMessageRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAudioMessageRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class PopupFragmentFactoryProvider implements Provider<PopupFragmentFactory> {
            private final BaseComponent baseComponent;

            PopupFragmentFactoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public PopupFragmentFactory get() {
                return (PopupFragmentFactory) Preconditions.checkNotNullFromComponent(this.baseComponent.popupFragmentFactory());
            }
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
        public static final class ProvideFeatureTogglePayloadsRepositoryProvider implements Provider<FeatureTogglePayloadsRepository> {
            private final BaseComponent baseComponent;

            ProvideFeatureTogglePayloadsRepositoryProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public FeatureTogglePayloadsRepository get() {
                return (FeatureTogglePayloadsRepository) Preconditions.checkNotNullFromComponent(this.baseComponent.provideFeatureTogglePayloadsRepository());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideTextToSpeechStreamProvider implements Provider<TextToSpeechStream> {
            private final BaseComponent baseComponent;

            ProvideTextToSpeechStreamProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public TextToSpeechStream get() {
                return (TextToSpeechStream) Preconditions.checkNotNullFromComponent(this.baseComponent.provideTextToSpeechStream());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideVoiceRecognitionStreamingProvider implements Provider<VoiceRecognitionStreaming> {
            private final BaseComponent baseComponent;

            ProvideVoiceRecognitionStreamingProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public VoiceRecognitionStreaming get() {
                return (VoiceRecognitionStreaming) Preconditions.checkNotNullFromComponent(this.baseComponent.provideVoiceRecognitionStreaming());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvidePermissionProviderProvider implements Provider<PermissionProvider> {
            private final BaseComponent baseComponent;

            ProvidePermissionProviderProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public PermissionProvider get() {
                return (PermissionProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.providePermissionProvider());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideDiaryNotesServiceProvider implements Provider<DiaryNotesService> {
            private final BaseComponent baseComponent;

            ProvideDiaryNotesServiceProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public DiaryNotesService get() {
                return (DiaryNotesService) Preconditions.checkNotNullFromComponent(this.baseComponent.provideDiaryNotesService());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ProvideAppInfoProviderProvider implements Provider<AppInfoProvider> {
            private final BaseComponent baseComponent;

            ProvideAppInfoProviderProvider(BaseComponent baseComponent) {
                this.baseComponent = baseComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public AppInfoProvider get() {
                return (AppInfoProvider) Preconditions.checkNotNullFromComponent(this.baseComponent.provideAppInfoProvider());
            }
        }
    }
}
