package com.ifriend.base.di;

import android.content.Context;
import androidx.lifecycle.DefaultLifecycleObserver;
import coil.ImageLoader;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.gson.Gson;
import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerApi;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.analytics.di.AnnalsTrackerAnalytics;
import com.ifriend.analytics.di.AppsFlyerAnalytics;
import com.ifriend.analytics.di.FirebaseAnalytics;
import com.ifriend.analytics.di.PushNotificationOpenedAnalytics;
import com.ifriend.analytics.pushNotificationOpenedTraker.PushNotificationOpenedTrackerApi;
import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.CiceroneHolder;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.base.navigation.api.cicerone.Cicerone;
import com.ifriend.billing.api.logic.AppLaunchBillingFlow;
import com.ifriend.billing.api.logic.BillingInteractor;
import com.ifriend.chat.api.AppActivityScreenFactory;
import com.ifriend.chat.api.ChatScreenFactory;
import com.ifriend.common_utils.Logger;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.services.CallsApiService;
import com.ifriend.core.remote.services.UserApiService;
import com.ifriend.core.tools.api.AppIdentityConverter;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.data.authorization.RegistrationApiDelegate;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.networking.api.GenerateBotAvatarApi;
import com.ifriend.data.networking.api.RegistrationApi;
import com.ifriend.data.networking.api.SocketShardsApi;
import com.ifriend.data.networking.api.TagsApi;
import com.ifriend.data.networking.api.ValidationApi;
import com.ifriend.data.networking.api.chat.ChatMessagesApi;
import com.ifriend.data.networking.api.chat.ChatsApi;
import com.ifriend.data.networking.api.chat.ChatsInfoApi;
import com.ifriend.data.networking.api.chatgifts.ChatGiftsApi;
import com.ifriend.data.networking.api.topics.TopicsApi;
import com.ifriend.data.socket.SocketUrlProvider;
import com.ifriend.data.socket.generator.BotAudioMessageUrlGenerator;
import com.ifriend.data.socket.generator.MediaPlayerPlaybackControllerGenerator;
import com.ifriend.data.socket.generator.UserAudioMessageUrlGenerator;
import com.ifriend.data.socket.mapper.ChatMessageMapHelper;
import com.ifriend.data.socket.mapper.SocketMessageToMessagesSourceMessageMapper;
import com.ifriend.data.storages.bots.MainBotLocalDataSource;
import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.data.storages.config.AppConfigStorage;
import com.ifriend.data.storages.sharedPreferences.SecurePreferencesService;
import com.ifriend.data.storages.token.KeychainUserTokenStorage;
import com.ifriend.data.toggle.AnimatedAvatarFeatureToggle;
import com.ifriend.data.toggle.AnimatedAvatarOnChatToggle;
import com.ifriend.data.toggle.AnimatedBackgroundFeatureToggle;
import com.ifriend.data.toggle.AvatarGenerationFreeToggle;
import com.ifriend.data.toggle.ConfirmEmailFeatureToggle;
import com.ifriend.data.toggle.NeuronsToggleQualifier;
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
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.RateUsRepository;
import com.ifriend.domain.data.ResetPasswordRepository;
import com.ifriend.domain.data.TagsProvider;
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
import com.ifriend.domain.newChat.chat.IsChatImageAllowedBroadcast;
import com.ifriend.domain.newChat.chat.systems.messages.live.LiveChatMessagesFlow;
import com.ifriend.domain.notifications.LongTermNotificationByPushCreator;
import com.ifriend.domain.notifications.LongTermNotificationByTypeOfPushHandler;
import com.ifriend.domain.notifications.LongTermNotificationManager;
import com.ifriend.domain.rateUs.OnUserRatedAppUseCase;
import com.ifriend.domain.rateUs.RateAppShowingPlanner;
import com.ifriend.domain.rateUs.RateUsStateStorage;
import com.ifriend.domain.rateUs.ShowRateUsUseCase;
import com.ifriend.domain.services.audio.recording.AudioRecorderController;
import com.ifriend.domain.services.audio.recording.AudioRecordingStateProvider;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.socket.notifications.AppNotifier;
import com.ifriend.domain.storage.AvatarAnimationEnabledStorage;
import com.ifriend.domain.storage.EventDelayStorage;
import com.ifriend.domain.storage.NeuronsCostsStorage;
import com.ifriend.domain.storage.token.UserTokenProvider;
import com.ifriend.domain.storage.token.UserTokenStorage;
import com.ifriend.domain.toggle.FeatureToggle;
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
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.internal_notifications.handler.InternalNotificationsQueue;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.logger.api.logic.AppLoggerInteractor;
import com.ifriend.platform.tools.api.AppInfoProvider;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.platform.tools.api.permissions.PermissionProvider;
import com.ifriend.platform.tools.api.speech.TextToSpeechStream;
import com.ifriend.platform.tools.api.speech.voice.VoiceRecognitionStreaming;
import com.ifriend.popup.api.PopupFragmentFactory;
import com.ifriend.popup.api.PopupModelFactory;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Retrofit;
/* compiled from: BaseComponent.kt */
@Metadata(d1 = {"\u0000Ø\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u001eH'J\b\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020\"H'J\b\u0010#\u001a\u00020$H&J\b\u0010%\u001a\u00020&H&J\b\u0010'\u001a\u00020(H&J\b\u0010)\u001a\u00020*H'J\b\u0010+\u001a\u00020,H&J\b\u0010-\u001a\u00020.H&J\b\u0010/\u001a\u000200H&J\b\u00101\u001a\u000202H&J\b\u00103\u001a\u000204H&J\b\u00105\u001a\u000206H&J\b\u00107\u001a\u000208H&J\b\u00109\u001a\u00020\u001eH'J\b\u0010:\u001a\u00020;H&J\b\u0010<\u001a\u00020=H&J\b\u0010>\u001a\u00020?H&J\b\u0010@\u001a\u00020AH&J\b\u0010B\u001a\u00020CH&J\b\u0010D\u001a\u00020EH&J\b\u0010F\u001a\u00020GH&J\b\u0010H\u001a\u00020IH&J\b\u0010J\u001a\u00020KH&J\b\u0010L\u001a\u00020MH&J\b\u0010N\u001a\u00020OH&J\b\u0010P\u001a\u00020QH&J\b\u0010R\u001a\u00020SH&J\b\u0010T\u001a\u00020UH&J\b\u0010V\u001a\u00020WH&J\b\u0010X\u001a\u00020YH&J\b\u0010Z\u001a\u00020[H&J\b\u0010\\\u001a\u00020]H&J\b\u0010^\u001a\u00020_H&J\b\u0010`\u001a\u00020aH&J\b\u0010b\u001a\u00020cH&J\b\u0010d\u001a\u00020eH&J\b\u0010f\u001a\u00020gH&J\b\u0010h\u001a\u00020iH&J\b\u0010j\u001a\u00020kH&J\b\u0010l\u001a\u00020mH&J\b\u0010n\u001a\u00020oH&J\b\u0010p\u001a\u00020qH&J\b\u0010r\u001a\u00020sH&J\b\u0010t\u001a\u00020uH&J\b\u0010v\u001a\u00020wH&J\b\u0010x\u001a\u00020yH&J\b\u0010z\u001a\u00020{H&J\b\u0010|\u001a\u00020}H&J\b\u0010~\u001a\u00020\u007fH&J\n\u0010\u0080\u0001\u001a\u00030\u0081\u0001H&J\n\u0010\u0082\u0001\u001a\u00030\u0083\u0001H&J\n\u0010\u0084\u0001\u001a\u00030\u0085\u0001H&J\n\u0010\u0086\u0001\u001a\u00030\u0087\u0001H&J\n\u0010\u0088\u0001\u001a\u00030\u0089\u0001H&J\n\u0010\u008a\u0001\u001a\u00030\u008b\u0001H&J\n\u0010\u008c\u0001\u001a\u00030\u008d\u0001H&J\n\u0010\u008e\u0001\u001a\u00030\u008f\u0001H&J\n\u0010\u0090\u0001\u001a\u00030\u0091\u0001H&J\n\u0010\u0092\u0001\u001a\u00030\u0093\u0001H&J\n\u0010\u0094\u0001\u001a\u00030\u0095\u0001H&J\n\u0010\u0096\u0001\u001a\u00030\u0097\u0001H&J\n\u0010\u0098\u0001\u001a\u00030\u0099\u0001H&J\n\u0010\u009a\u0001\u001a\u00030\u009b\u0001H'J\n\u0010\u009c\u0001\u001a\u00030\u009d\u0001H&J\n\u0010\u009e\u0001\u001a\u00030\u009f\u0001H&J\n\u0010 \u0001\u001a\u00030¡\u0001H&J\n\u0010¢\u0001\u001a\u00030£\u0001H&J\n\u0010¤\u0001\u001a\u00030¥\u0001H&J\n\u0010¦\u0001\u001a\u00030§\u0001H&J\n\u0010¨\u0001\u001a\u00030©\u0001H&J\n\u0010ª\u0001\u001a\u00030«\u0001H&J\n\u0010¬\u0001\u001a\u00030\u00ad\u0001H&J\n\u0010®\u0001\u001a\u00030¯\u0001H&J\t\u0010°\u0001\u001a\u00020\u001eH'J\n\u0010±\u0001\u001a\u00030²\u0001H&J\n\u0010³\u0001\u001a\u00030´\u0001H&J\n\u0010µ\u0001\u001a\u00030¶\u0001H&J\n\u0010·\u0001\u001a\u00030¸\u0001H&J\n\u0010¹\u0001\u001a\u00030º\u0001H&J\n\u0010»\u0001\u001a\u00030¼\u0001H&J\n\u0010½\u0001\u001a\u00030¾\u0001H&J\n\u0010¿\u0001\u001a\u00030À\u0001H&J\n\u0010Á\u0001\u001a\u00030Â\u0001H&J\n\u0010Ã\u0001\u001a\u00030Ä\u0001H&J\n\u0010Å\u0001\u001a\u00030Æ\u0001H&J\n\u0010Ç\u0001\u001a\u00030È\u0001H&J\n\u0010É\u0001\u001a\u00030Ê\u0001H&J\n\u0010Ë\u0001\u001a\u00030Ì\u0001H&J\n\u0010Í\u0001\u001a\u00030Î\u0001H&J\n\u0010Ï\u0001\u001a\u00030Ð\u0001H&J\n\u0010Ñ\u0001\u001a\u00030Ò\u0001H&J\n\u0010Ó\u0001\u001a\u00030Ô\u0001H&J\n\u0010Õ\u0001\u001a\u00030Ö\u0001H&J\n\u0010×\u0001\u001a\u00030Ø\u0001H&J\n\u0010Ù\u0001\u001a\u00030Ú\u0001H&J\u0017\u0010Û\u0001\u001a\u0010\u0012\u000b\u0012\t0Ý\u0001¢\u0006\u0003\bÞ\u00010Ü\u0001H&J\n\u0010ß\u0001\u001a\u00030à\u0001H&J\n\u0010á\u0001\u001a\u00030â\u0001H&J\n\u0010ã\u0001\u001a\u00030ä\u0001H&J\n\u0010å\u0001\u001a\u00030æ\u0001H&J\n\u0010ç\u0001\u001a\u00030è\u0001H'J\n\u0010é\u0001\u001a\u00030ê\u0001H&J\n\u0010ë\u0001\u001a\u00030ì\u0001H&J\n\u0010í\u0001\u001a\u00030î\u0001H'J\n\u0010ï\u0001\u001a\u00030ð\u0001H&J\n\u0010ñ\u0001\u001a\u00030ò\u0001H&J\n\u0010ó\u0001\u001a\u00030ô\u0001H&J\n\u0010õ\u0001\u001a\u00030ö\u0001H&J\n\u0010÷\u0001\u001a\u00030ø\u0001H&J\t\u0010ù\u0001\u001a\u00020\u001eH'J\n\u0010ú\u0001\u001a\u00030û\u0001H&J\n\u0010ü\u0001\u001a\u00030ý\u0001H&J\n\u0010þ\u0001\u001a\u00030ÿ\u0001H&J\n\u0010\u0080\u0002\u001a\u00030\u0081\u0002H&J\n\u0010\u0082\u0002\u001a\u00030\u0083\u0002H&J\n\u0010\u0084\u0002\u001a\u00030\u0085\u0002H&J\n\u0010\u0086\u0002\u001a\u00030\u0087\u0002H&J\n\u0010\u0088\u0002\u001a\u00030\u0089\u0002H&J\n\u0010\u008a\u0002\u001a\u00030\u008b\u0002H&J\n\u0010\u008c\u0002\u001a\u00030\u008d\u0002H&J\n\u0010\u008e\u0002\u001a\u00030\u008f\u0002H&J\n\u0010\u0090\u0002\u001a\u00030\u0091\u0002H&J\n\u0010\u0092\u0002\u001a\u00030\u0093\u0002H&J\n\u0010\u0094\u0002\u001a\u00030\u0095\u0002H&J\n\u0010\u0096\u0002\u001a\u00030\u0097\u0002H&J\n\u0010\u0098\u0002\u001a\u00030\u0099\u0002H&J\n\u0010\u009a\u0002\u001a\u00030\u009b\u0002H&J\n\u0010\u009c\u0002\u001a\u00030\u009d\u0002H&J\n\u0010\u009e\u0002\u001a\u00030\u009f\u0002H&J\n\u0010 \u0002\u001a\u00030¡\u0002H&J\n\u0010¢\u0002\u001a\u00030£\u0002H&J\n\u0010¤\u0002\u001a\u00030¥\u0002H&J\n\u0010¦\u0002\u001a\u00030§\u0002H&J\n\u0010¨\u0002\u001a\u00030©\u0002H&J\n\u0010ª\u0002\u001a\u00030«\u0002H&J\n\u0010¬\u0002\u001a\u00030\u00ad\u0002H&J\n\u0010®\u0002\u001a\u00030¯\u0002H&J\n\u0010°\u0002\u001a\u00030±\u0002H&J\n\u0010²\u0002\u001a\u00030³\u0002H&J\n\u0010´\u0002\u001a\u00030µ\u0002H&J\n\u0010¶\u0002\u001a\u00030·\u0002H&J\n\u0010¸\u0002\u001a\u00030\u009b\u0001H'J\n\u0010¹\u0002\u001a\u00030\u009b\u0001H'J\n\u0010º\u0002\u001a\u00030»\u0002H&J\n\u0010¼\u0002\u001a\u00030½\u0002H&J\n\u0010¾\u0002\u001a\u00030¿\u0002H&J\n\u0010À\u0002\u001a\u00030Á\u0002H&J\n\u0010Â\u0002\u001a\u00030Ã\u0002H&J\n\u0010Ä\u0002\u001a\u00030Å\u0002H&J\n\u0010Æ\u0002\u001a\u00030Ç\u0002H&¨\u0006È\u0002"}, d2 = {"Lcom/ifriend/base/di/BaseComponent;", "", "analyticsEngine", "Lcom/ifriend/analytics/AnalyticsEngine;", "appActivityScreenFactory", "Lcom/ifriend/chat/api/AppActivityScreenFactory;", "appCicerone", "Lcom/ifriend/base/navigation/api/cicerone/Cicerone;", "Lcom/ifriend/base/navigation/api/AppRouter;", "avatarsStorage", "Lcom/ifriend/domain/data/generateAvatar/AvatarsStorage;", "chatScreenFactory", "Lcom/ifriend/chat/api/ChatScreenFactory;", "ciceroneHolder", "Lcom/ifriend/base/navigation/api/CiceroneHolder;", "getAppConfigStorage", "Lcom/ifriend/data/storages/config/AppConfigStorage;", "popupFragmentFactory", "Lcom/ifriend/popup/api/PopupFragmentFactory;", "popupModelFactory", "Lcom/ifriend/popup/api/PopupModelFactory;", "provideAnalyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "provideAnimatedAvatarFeatureToggle", "Lcom/ifriend/data/toggle/AnimatedAvatarFeatureToggle;", "provideAnimatedAvatarOnChatToggle", "Lcom/ifriend/data/toggle/AnimatedAvatarOnChatToggle;", "provideAnimatedBackgroundFeatureToggle", "Lcom/ifriend/data/toggle/AnimatedBackgroundFeatureToggle;", "provideAnnalsTrackerAnalyticsSender", "Lcom/ifriend/analytics/AnalyticsSender;", "provideAnnalsTrackerApi", "Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerApi;", "provideApiUrl", "", "provideAppConfigLocalDataSource", "Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;", "provideAppConfigRepository", "Lcom/ifriend/domain/data/config/AppConfigRepository;", "provideAppIdentityConverter", "Lcom/ifriend/core/tools/api/AppIdentityConverter;", "provideAppImageLoader", "Lcoil/ImageLoader;", "provideAppImageLoaderRepository", "Lcom/ifriend/domain/data/AppImageLoaderRepository;", "provideAppInfoProvider", "Lcom/ifriend/platform/tools/api/AppInfoProvider;", "provideAppInstallStorage", "Lcom/ifriend/domain/data/install/AppInstallStorage;", "provideAppLaunchBillingFlow", "Lcom/ifriend/billing/api/logic/AppLaunchBillingFlow;", "provideAppLoggerInteractor", "Lcom/ifriend/logger/api/logic/AppLoggerInteractor;", "provideAppNotifier", "Lcom/ifriend/domain/socket/notifications/AppNotifier;", "provideAppUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "provideAppsFlyerAnalyticsSender", "provideAudioMessageRepository", "Lcom/ifriend/domain/data/AudioMessageRepository;", "provideAudioMessageUrlGenerator", "Lcom/ifriend/data/socket/generator/BotAudioMessageUrlGenerator;", "provideAudioRecorderController", "Lcom/ifriend/domain/services/audio/recording/AudioRecorderController;", "provideAudioRecordingStateProvider", "Lcom/ifriend/domain/services/audio/recording/AudioRecordingStateProvider;", "provideAuthDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "provideAuthDataStorage", "Lcom/ifriend/domain/data/AuthDataStorage;", "provideAuthLocalDataSource", "Lcom/ifriend/core/local/api/AuthLocalDataSource;", "provideAuthorizer", "Lcom/ifriend/domain/authorization/Authorizer;", "provideAvatarAnimationEnabledStorage", "Lcom/ifriend/domain/storage/AvatarAnimationEnabledStorage;", "provideAvatarGenerationFreeToggle", "Lcom/ifriend/data/toggle/AvatarGenerationFreeToggle;", "provideAvatarGenerationStatusStorage", "Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatusStorage;", "provideAvatarInfoStorage", "Lcom/ifriend/domain/data/generateAvatar/AvatarInfoStorage;", "provideBillingInteractor", "Lcom/ifriend/billing/api/logic/BillingInteractor;", "provideBillingPurchasesHistory", "Lcom/ifriend/domain/data/purchases/BillingPurchasesHistory;", "provideBotRepository", "Lcom/ifriend/domain/data/BotRepository;", "provideBuyChatMessagesRepository", "Lcom/ifriend/domain/data/chat/BuyChatMessagesRepository;", "provideCallsApiService", "Lcom/ifriend/core/remote/services/CallsApiService;", "provideChangeBotAgeUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotAgeUseCase;", "provideChangeBotEthnicityUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotEthnicityUseCase;", "provideChangeBotGenderUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotGenderUseCase;", "provideChangeBotNameUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotNameUseCase;", "provideChangeBotPersonalityUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotPersonalityUseCase;", "provideChangeBotVoiceUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotVoiceUseCase;", "provideChangeUserAgeUseCase", "Lcom/ifriend/domain/useCases/user/change/ChangeUserAgeUseCase;", "provideChangeUserGenderUseCase", "Lcom/ifriend/domain/useCases/user/change/ChangeUserGenderUseCase;", "provideChangeUserNameUseCase", "Lcom/ifriend/domain/useCases/user/change/ChangeUserNameUseCase;", "provideChatApi", "Lcom/ifriend/data/networking/api/chat/ChatMessagesApi;", "provideChatBackgroundRepository", "Lcom/ifriend/domain/data/chat/ChatBackgroundRepository;", "provideChatGiftsApi", "Lcom/ifriend/data/networking/api/chatgifts/ChatGiftsApi;", "provideChatGiftsRepository", "Lcom/ifriend/domain/data/chatgifts/ChatGiftsRepository;", "provideChatIntroRepository", "Lcom/ifriend/domain/data/chat/ChatIntroRepository;", "provideChatMessageMapHelper", "Lcom/ifriend/data/socket/mapper/ChatMessageMapHelper;", "provideChatNotificationsRepository", "Lcom/ifriend/domain/data/notifications/ChatNotificationsRepository;", "provideChatSubscriptionRepository", "Lcom/ifriend/domain/data/chat/subscription/ChatSubscriptionRepository;", "provideChatVideoBackgroundFeatureToggle", "Lcom/ifriend/domain/featuretoggles/ChatVideoBackgroundFeatureToggle;", "provideChatsApi", "Lcom/ifriend/data/networking/api/chat/ChatsApi;", "provideChatsInfoConfigurationRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;", "provideChatsInfoRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "provideChatsRepository", "Lcom/ifriend/domain/data/chat/ChatsRepository;", "provideConfigurationBotsMemoryCachedSource", "Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;", "provideConfirmEmailFeatureToggle", "Lcom/ifriend/data/toggle/ConfirmEmailFeatureToggle;", "provideConfirmEmailRepository", "Lcom/ifriend/domain/data/authorization/confirmEmail/ConfirmEmailRepository;", "provideContext", "Landroid/content/Context;", "provideCoreExecuteCatching", "Lcom/ifriend/data/common/CoreExecuteCatching;", "provideCoroutineDispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "provideCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "provideDecodedAudioMessagesRepository", "Lcom/ifriend/domain/data/DecodedAudioMessagesRepository;", "provideDeepLinksRepository", "Lcom/ifriend/domain/data/deeplinks/DeepLinksRepository;", "provideDevicePreferences", "Lcom/ifriend/domain/data/Preferences;", "provideDiaryNoteReplier", "Lcom/ifriend/domain/useCases/diary/DiaryNoteReplier;", "provideDiaryNotesService", "Lcom/ifriend/domain/useCases/diary/DiaryNotesService;", "provideDiaryRepository", "Lcom/ifriend/domain/data/diary/DiaryRepository;", "provideDispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "provideEmailValidator", "Lcom/ifriend/domain/validation/EmailValidator;", "provideEventDelayStorage", "Lcom/ifriend/domain/storage/EventDelayStorage;", "provideFeatureExplanationRepo", "Lcom/ifriend/domain/data/guide/UserGuideRepository;", "provideFeatureTogglePayloadsRepository", "Lcom/ifriend/domain/data/experiments/FeatureTogglePayloadsRepository;", "provideFeatureToggleRepository", "Lcom/ifriend/domain/data/experiments/FeatureToggleRepository;", "provideFileProvider", "Lcom/ifriend/domain/data/files/FileProvider;", "provideFirebaseAnalyticsSender", "provideFirebaseProcess", "Lcom/ifriend/domain/data/networking/FirebaseApiRepository;", "provideGenerateBotAvatarApi", "Lcom/ifriend/data/networking/api/GenerateBotAvatarApi;", "provideGenerateBotAvatarRepository", "Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;", "provideGetBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "provideGetDiaryNotesUseCase", "Lcom/ifriend/domain/useCases/diary/GetDiaryNotesListUseCase;", "provideGetUserUseCase", "Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "provideGson", "Lcom/google/gson/Gson;", "provideInAppUpdateRepository", "Lcom/ifriend/domain/data/update/InAppUpdateRepository;", "provideInitialDataLoader", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "provideInternalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "provideInternalNotificationHandlersRegister", "Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;", "provideInternalNotificationsQueue", "Lcom/ifriend/internal_notifications/handler/InternalNotificationsQueue;", "provideInternetConnection", "Lcom/ifriend/domain/infrastucture/InternetConnection;", "provideInternetConnectionDialogsManager", "Lcom/ifriend/domain/infrastucture/InternetConnectionDialogsManager;", "provideIsChatImageAllowedBroadcast", "Lcom/ifriend/domain/newChat/chat/IsChatImageAllowedBroadcast;", "provideKeychainUserTokenStorage", "Lcom/ifriend/data/storages/token/KeychainUserTokenStorage;", "provideLevelsInfoUseCase", "Lcom/ifriend/domain/useCases/levels/GetLevelInfoUseCase;", "provideLevelsRepository", "Lcom/ifriend/domain/data/levels/LevelsRepository;", "provideListenTagsUseCase", "Lcom/ifriend/domain/useCases/socket/ListenTagsUseCase;", "provideLiveChatMessagesFlow", "Lcom/ifriend/domain/newChat/chat/systems/messages/live/LiveChatMessagesFlow;", "provideLogger", "Lcom/ifriend/common_utils/Logger;", "provideLongTermNotificationByPushCreator", "", "Lcom/ifriend/domain/notifications/LongTermNotificationByPushCreator;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideLongTermNotificationByTypeOfPushHandler", "Lcom/ifriend/domain/notifications/LongTermNotificationByTypeOfPushHandler;", "provideLongTermNotificationManager", "Lcom/ifriend/domain/notifications/LongTermNotificationManager;", "provideMainBotLocalDataSource", "Lcom/ifriend/data/storages/bots/MainBotLocalDataSource;", "provideMediaPlayerPlaybackControllerGenerator", "Lcom/ifriend/data/socket/generator/MediaPlayerPlaybackControllerGenerator;", "provideMessageSourceLifecycleController", "Landroidx/lifecycle/DefaultLifecycleObserver;", "provideMessagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "provideNeuronsCostsStorage", "Lcom/ifriend/domain/storage/NeuronsCostsStorage;", "provideNeuronsFeatureToggle", "Lcom/ifriend/domain/toggle/FeatureToggle;", "provideOnDiaryShownUseCase", "Lcom/ifriend/domain/useCases/diary/OnDiaryShownUseCase;", "provideOnUserRateUsUseCase", "Lcom/ifriend/domain/rateUs/OnUserRatedAppUseCase;", "provideOnboardingAnswersRepository", "Lcom/ifriend/domain/data/onboarding/OnboardingAnswersRepository;", "provideOnboardingChatConfigsMemoryCachedSource", "Lcom/ifriend/domain/data/memorycached/OnboardingChatConfigsMemoryCachedSource;", "providePermissionProvider", "Lcom/ifriend/platform/tools/api/permissions/PermissionProvider;", "providePushNotificationOpenedAnalyticsSender", "providePushNotificationOpenedTrackerApi", "Lcom/ifriend/analytics/pushNotificationOpenedTraker/PushNotificationOpenedTrackerApi;", "provideRateAndReviewUsToggle", "Lcom/ifriend/data/toggle/RateAndReviewUsToggle;", "provideRateAppShowingPlanner", "Lcom/ifriend/domain/rateUs/RateAppShowingPlanner;", "provideRateUsRepository", "Lcom/ifriend/domain/data/RateUsRepository;", "provideRateUsStateStorage", "Lcom/ifriend/domain/rateUs/RateUsStateStorage;", "provideRefreshDiaryUseCase", "Lcom/ifriend/domain/useCases/diary/RefreshDiaryUseCase;", "provideRegistrationApi", "Lcom/ifriend/data/networking/api/RegistrationApi;", "provideRegistrationProcess", "Lcom/ifriend/data/authorization/RegistrationApiDelegate;", "provideReplyDiaryNoteUseCase", "Lcom/ifriend/domain/useCases/diary/ReplyDiaryNoteUseCase;", "provideResetPasswordRepository", "Lcom/ifriend/domain/data/ResetPasswordRepository;", "provideResourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "provideRetrofit", "Lretrofit2/Retrofit;", "provideSecurePreferences", "Lcom/ifriend/data/storages/sharedPreferences/SecurePreferencesService;", "provideSendConfirmationEmailUseCase", "Lcom/ifriend/domain/data/authorization/confirmEmail/SendConfirmationEmailUseCase;", "provideShardsApi", "Lcom/ifriend/data/networking/api/SocketShardsApi;", "provideShowRateUsUseCase", "Lcom/ifriend/domain/rateUs/ShowRateUsUseCase;", "provideSignInUseCase", "Lcom/ifriend/domain/authorization/SignInWithTokenUseCase;", "provideSocketMessageToMessagesSourceMessageMapper", "Lcom/ifriend/data/socket/mapper/SocketMessageToMessagesSourceMessageMapper;", "provideTagsApi", "Lcom/ifriend/data/networking/api/TagsApi;", "provideTagsProvider", "Lcom/ifriend/domain/data/TagsProvider;", "provideTextToSpeechStream", "Lcom/ifriend/platform/tools/api/speech/TextToSpeechStream;", "provideTokenProvider", "Lcom/ifriend/domain/storage/token/UserTokenProvider;", "provideTokenStorage", "Lcom/ifriend/domain/storage/token/UserTokenStorage;", "provideTopicsApi", "Lcom/ifriend/data/networking/api/topics/TopicsApi;", "provideUrlProvider", "Lcom/ifriend/data/socket/SocketUrlProvider;", "provideUserApiService", "Lcom/ifriend/core/remote/services/UserApiService;", "provideUserAudioMessageUrlGenerator", "Lcom/ifriend/data/socket/generator/UserAudioMessageUrlGenerator;", "provideUserChatApi", "Lcom/ifriend/data/networking/api/chat/ChatsInfoApi;", "provideUserConfigRepository", "Lcom/ifriend/domain/data/user/UserProfileRepository;", "provideUserOffersRepository", "Lcom/ifriend/domain/data/offers/UserOffersRepository;", "provideUserRepository", "Lcom/ifriend/domain/data/UserRepository;", "provideUserSessionSharedPreferences", "provideUserSharedPreferences", "provideUserSubscriptionsBroadcast", "Lcom/ifriend/domain/data/UserSubscriptionsBroadcast;", "provideValidateAgeUseCase", "Lcom/ifriend/domain/validation/ValidateAgeUseCase;", "provideValidateCredentialsUseCase", "Lcom/ifriend/domain/validation/ValidateCredentialsUseCase;", "provideValidateNameUseCase", "Lcom/ifriend/domain/validation/ValidateNameUseCase;", "provideValidationApi", "Lcom/ifriend/data/networking/api/ValidationApi;", "provideVoiceRecognitionStreaming", "Lcom/ifriend/platform/tools/api/speech/voice/VoiceRecognitionStreaming;", "routerProvider", "Lcom/ifriend/base/navigation/api/RouterProvider;", "di_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BaseComponent {
    AnalyticsEngine analyticsEngine();

    AppActivityScreenFactory appActivityScreenFactory();

    Cicerone<AppRouter> appCicerone();

    AvatarsStorage avatarsStorage();

    ChatScreenFactory chatScreenFactory();

    CiceroneHolder ciceroneHolder();

    AppConfigStorage getAppConfigStorage();

    PopupFragmentFactory popupFragmentFactory();

    PopupModelFactory popupModelFactory();

    AnalyticsInteractor provideAnalyticsInteractor();

    AnimatedAvatarFeatureToggle provideAnimatedAvatarFeatureToggle();

    AnimatedAvatarOnChatToggle provideAnimatedAvatarOnChatToggle();

    AnimatedBackgroundFeatureToggle provideAnimatedBackgroundFeatureToggle();

    @AnnalsTrackerAnalytics
    AnalyticsSender provideAnnalsTrackerAnalyticsSender();

    AnnalsTrackerApi provideAnnalsTrackerApi();

    @ApiUrlQualifier
    String provideApiUrl();

    AppConfigLocalDataSource provideAppConfigLocalDataSource();

    AppConfigRepository provideAppConfigRepository();

    AppIdentityConverter provideAppIdentityConverter();

    @AppImageLoader
    ImageLoader provideAppImageLoader();

    AppImageLoaderRepository provideAppImageLoaderRepository();

    AppInfoProvider provideAppInfoProvider();

    AppInstallStorage provideAppInstallStorage();

    AppLaunchBillingFlow provideAppLaunchBillingFlow();

    AppLoggerInteractor provideAppLoggerInteractor();

    AppNotifier provideAppNotifier();

    AppUpdateManager provideAppUpdateManager();

    @AppsFlyerAnalytics
    AnalyticsSender provideAppsFlyerAnalyticsSender();

    AudioMessageRepository provideAudioMessageRepository();

    BotAudioMessageUrlGenerator provideAudioMessageUrlGenerator();

    AudioRecorderController provideAudioRecorderController();

    AudioRecordingStateProvider provideAudioRecordingStateProvider();

    AuthDataProvider provideAuthDataProvider();

    AuthDataStorage provideAuthDataStorage();

    AuthLocalDataSource provideAuthLocalDataSource();

    Authorizer provideAuthorizer();

    AvatarAnimationEnabledStorage provideAvatarAnimationEnabledStorage();

    AvatarGenerationFreeToggle provideAvatarGenerationFreeToggle();

    AvatarGenerationStatusStorage provideAvatarGenerationStatusStorage();

    AvatarInfoStorage provideAvatarInfoStorage();

    BillingInteractor provideBillingInteractor();

    BillingPurchasesHistory provideBillingPurchasesHistory();

    BotRepository provideBotRepository();

    BuyChatMessagesRepository provideBuyChatMessagesRepository();

    CallsApiService provideCallsApiService();

    ChangeBotAgeUseCase provideChangeBotAgeUseCase();

    ChangeBotEthnicityUseCase provideChangeBotEthnicityUseCase();

    ChangeBotGenderUseCase provideChangeBotGenderUseCase();

    ChangeBotNameUseCase provideChangeBotNameUseCase();

    ChangeBotPersonalityUseCase provideChangeBotPersonalityUseCase();

    ChangeBotVoiceUseCase provideChangeBotVoiceUseCase();

    ChangeUserAgeUseCase provideChangeUserAgeUseCase();

    ChangeUserGenderUseCase provideChangeUserGenderUseCase();

    ChangeUserNameUseCase provideChangeUserNameUseCase();

    ChatMessagesApi provideChatApi();

    ChatBackgroundRepository provideChatBackgroundRepository();

    ChatGiftsApi provideChatGiftsApi();

    ChatGiftsRepository provideChatGiftsRepository();

    ChatIntroRepository provideChatIntroRepository();

    ChatMessageMapHelper provideChatMessageMapHelper();

    ChatNotificationsRepository provideChatNotificationsRepository();

    ChatSubscriptionRepository provideChatSubscriptionRepository();

    ChatVideoBackgroundFeatureToggle provideChatVideoBackgroundFeatureToggle();

    ChatsApi provideChatsApi();

    ChatsInfoConfigurationRepository provideChatsInfoConfigurationRepository();

    ChatsInfoRepository provideChatsInfoRepository();

    ChatsRepository provideChatsRepository();

    ChatConfigsMemoryCachedSource provideConfigurationBotsMemoryCachedSource();

    ConfirmEmailFeatureToggle provideConfirmEmailFeatureToggle();

    ConfirmEmailRepository provideConfirmEmailRepository();

    Context provideContext();

    CoreExecuteCatching provideCoreExecuteCatching();

    CoroutineDispatchers provideCoroutineDispatchers();

    CoroutineScope provideCoroutineScope();

    DecodedAudioMessagesRepository provideDecodedAudioMessagesRepository();

    DeepLinksRepository provideDeepLinksRepository();

    @DeviceSharedPreferences
    Preferences provideDevicePreferences();

    DiaryNoteReplier provideDiaryNoteReplier();

    DiaryNotesService provideDiaryNotesService();

    DiaryRepository provideDiaryRepository();

    DispatcherProvider provideDispatcherProvider();

    EmailValidator provideEmailValidator();

    EventDelayStorage provideEventDelayStorage();

    UserGuideRepository provideFeatureExplanationRepo();

    FeatureTogglePayloadsRepository provideFeatureTogglePayloadsRepository();

    FeatureToggleRepository provideFeatureToggleRepository();

    FileProvider provideFileProvider();

    @FirebaseAnalytics
    AnalyticsSender provideFirebaseAnalyticsSender();

    FirebaseApiRepository provideFirebaseProcess();

    GenerateBotAvatarApi provideGenerateBotAvatarApi();

    GenerateBotAvatarRepository provideGenerateBotAvatarRepository();

    GetBotUseCase provideGetBotUseCase();

    GetDiaryNotesListUseCase provideGetDiaryNotesUseCase();

    GetUserUseCase provideGetUserUseCase();

    Gson provideGson();

    InAppUpdateRepository provideInAppUpdateRepository();

    InitialDataLoader provideInitialDataLoader();

    InternalNotificationHandler provideInternalNotificationHandler();

    InternalNotificationHandlersRegister provideInternalNotificationHandlersRegister();

    InternalNotificationsQueue provideInternalNotificationsQueue();

    InternetConnection provideInternetConnection();

    InternetConnectionDialogsManager provideInternetConnectionDialogsManager();

    IsChatImageAllowedBroadcast provideIsChatImageAllowedBroadcast();

    KeychainUserTokenStorage provideKeychainUserTokenStorage();

    GetLevelInfoUseCase provideLevelsInfoUseCase();

    LevelsRepository provideLevelsRepository();

    ListenTagsUseCase provideListenTagsUseCase();

    LiveChatMessagesFlow provideLiveChatMessagesFlow();

    Logger provideLogger();

    Set<LongTermNotificationByPushCreator> provideLongTermNotificationByPushCreator();

    LongTermNotificationByTypeOfPushHandler provideLongTermNotificationByTypeOfPushHandler();

    LongTermNotificationManager provideLongTermNotificationManager();

    MainBotLocalDataSource provideMainBotLocalDataSource();

    MediaPlayerPlaybackControllerGenerator provideMediaPlayerPlaybackControllerGenerator();

    @MessagesSourceLifecycleObserver
    DefaultLifecycleObserver provideMessageSourceLifecycleController();

    MessagesSource provideMessagesSource();

    NeuronsCostsStorage provideNeuronsCostsStorage();

    @NeuronsToggleQualifier
    FeatureToggle provideNeuronsFeatureToggle();

    OnDiaryShownUseCase provideOnDiaryShownUseCase();

    OnUserRatedAppUseCase provideOnUserRateUsUseCase();

    OnboardingAnswersRepository provideOnboardingAnswersRepository();

    OnboardingChatConfigsMemoryCachedSource provideOnboardingChatConfigsMemoryCachedSource();

    PermissionProvider providePermissionProvider();

    @PushNotificationOpenedAnalytics
    AnalyticsSender providePushNotificationOpenedAnalyticsSender();

    PushNotificationOpenedTrackerApi providePushNotificationOpenedTrackerApi();

    RateAndReviewUsToggle provideRateAndReviewUsToggle();

    RateAppShowingPlanner provideRateAppShowingPlanner();

    RateUsRepository provideRateUsRepository();

    RateUsStateStorage provideRateUsStateStorage();

    RefreshDiaryUseCase provideRefreshDiaryUseCase();

    RegistrationApi provideRegistrationApi();

    RegistrationApiDelegate provideRegistrationProcess();

    ReplyDiaryNoteUseCase provideReplyDiaryNoteUseCase();

    ResetPasswordRepository provideResetPasswordRepository();

    ResourceProvider provideResourceProvider();

    Retrofit provideRetrofit();

    SecurePreferencesService provideSecurePreferences();

    SendConfirmationEmailUseCase provideSendConfirmationEmailUseCase();

    SocketShardsApi provideShardsApi();

    ShowRateUsUseCase provideShowRateUsUseCase();

    SignInWithTokenUseCase provideSignInUseCase();

    SocketMessageToMessagesSourceMessageMapper provideSocketMessageToMessagesSourceMessageMapper();

    TagsApi provideTagsApi();

    TagsProvider provideTagsProvider();

    TextToSpeechStream provideTextToSpeechStream();

    UserTokenProvider provideTokenProvider();

    UserTokenStorage provideTokenStorage();

    TopicsApi provideTopicsApi();

    SocketUrlProvider provideUrlProvider();

    UserApiService provideUserApiService();

    UserAudioMessageUrlGenerator provideUserAudioMessageUrlGenerator();

    ChatsInfoApi provideUserChatApi();

    UserProfileRepository provideUserConfigRepository();

    UserOffersRepository provideUserOffersRepository();

    UserRepository provideUserRepository();

    @UserSessionSharedPreferences
    Preferences provideUserSessionSharedPreferences();

    @UserSharedPreferences
    Preferences provideUserSharedPreferences();

    UserSubscriptionsBroadcast provideUserSubscriptionsBroadcast();

    ValidateAgeUseCase provideValidateAgeUseCase();

    ValidateCredentialsUseCase provideValidateCredentialsUseCase();

    ValidateNameUseCase provideValidateNameUseCase();

    ValidationApi provideValidationApi();

    VoiceRecognitionStreaming provideVoiceRecognitionStreaming();

    RouterProvider routerProvider();
}
