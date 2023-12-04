package com.ifriend.app.di.modules.data;

import android.content.Context;
import androidx.datastore.core.DataStore;
import coil.ImageLoader;
import com.ifriend.app.di.modules.InitialDataLoadersModule;
import com.ifriend.app.di.modules.data.qualifier.AppHttpClientQualifier;
import com.ifriend.app.di.modules.data.qualifier.AppRetrofitClientQualifier;
import com.ifriend.base.di.AppImageLoader;
import com.ifriend.base.di.DeviceSharedPreferences;
import com.ifriend.base.di.UserSessionSharedPreferences;
import com.ifriend.base.di.UserSharedPreferences;
import com.ifriend.common_utils.Logger;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.mappers.BotFromResponseMapper;
import com.ifriend.data.mappers.EthnicityToBackendValueMapper;
import com.ifriend.data.mappers.GenderToBackendString;
import com.ifriend.data.mappers.PersonalityToBackendValueMapper;
import com.ifriend.data.mappers.ToUserMapper;
import com.ifriend.data.networking.api.BotApi;
import com.ifriend.data.networking.api.GenerateBotAvatarApi;
import com.ifriend.data.networking.api.NeuronsApi;
import com.ifriend.data.networking.api.RateUsApi;
import com.ifriend.data.networking.api.ResetPasswordApi;
import com.ifriend.data.networking.api.TagsApi;
import com.ifriend.data.networking.api.UserApi;
import com.ifriend.data.networking.api.chat.ChatMessagesApi;
import com.ifriend.data.networking.api.chatgifts.ChatGiftsApi;
import com.ifriend.data.networking.api.diary.DiaryApiDelegate;
import com.ifriend.data.networking.api.diary.DiaryNoteReplierImpl;
import com.ifriend.data.networking.api.levels.LevelsApiDelegate;
import com.ifriend.data.networking.api.onboarding.OnboardingApiDelegate;
import com.ifriend.data.networking.api.topics.TopicsApi;
import com.ifriend.data.networking.datasources.gifts.ChatGiftsRemoteDataSource;
import com.ifriend.data.networking.files.OkHttpFileProvider;
import com.ifriend.data.repository.BotRepositoryImpl;
import com.ifriend.data.repository.DiaryRepositoryImpl;
import com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl;
import com.ifriend.data.repository.LevelsRepositoryImpl;
import com.ifriend.data.repository.RateUsRepositoryImpl;
import com.ifriend.data.repository.ResetPasswordRepositoryImpl;
import com.ifriend.data.repository.UserRepositoryImpl;
import com.ifriend.data.repository.appimage.AppImageLoaderRepositoryImpl;
import com.ifriend.data.repository.chatgifts.ChatGiftsRepositoryImpl;
import com.ifriend.data.repository.onboarding.OnboardingAnswersRepositoryImpl;
import com.ifriend.data.repository.user.UserProfileRepositoryImpl;
import com.ifriend.data.socket.LiveChatMessagesFlowImpl;
import com.ifriend.data.storages.EventDelayStorageImpl;
import com.ifriend.data.storages.auth.AuthDataStorageImpl;
import com.ifriend.data.storages.avatar.AvatarAnimationEnabledStorageImpl;
import com.ifriend.data.storages.avatar.AvatarGenerationStatusStorageImpl;
import com.ifriend.data.storages.avatar.AvatarInfoStorageImpl;
import com.ifriend.data.storages.avatar.AvatarsStorageImpl;
import com.ifriend.data.storages.bots.MainBotLocalDataSource;
import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.data.storages.config.AppConfigStorage;
import com.ifriend.data.storages.config.AppConfigStorageImpl;
import com.ifriend.data.storages.diary.DiaryDao;
import com.ifriend.data.storages.diary.DiaryDaoImpl;
import com.ifriend.data.storages.diary.ShownDiaryNotesDao;
import com.ifriend.data.storages.diary.ShownDiaryNotesDaoImpl;
import com.ifriend.data.storages.levels.LevelsDao;
import com.ifriend.data.storages.levels.LevelsDaoImpl;
import com.ifriend.data.storages.neurones.NeuronsCostsStorageImpl;
import com.ifriend.data.storages.tags.TagsLocalDataSource;
import com.ifriend.data.storages.tags.TagsStorageImpl;
import com.ifriend.data.toggle.AnimatedAvatarFeatureToggle;
import com.ifriend.data.toggle.AvatarGenerationFreeToggle;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.AppImageLoaderRepository;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.AuthDataStorage;
import com.ifriend.domain.data.BotProvider;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.RateUsRepository;
import com.ifriend.domain.data.ResetPasswordRepository;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.data.TagsStorage;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.UserSubscriptionsBroadcast;
import com.ifriend.domain.data.UserSubscriptionsBroadcastImpl;
import com.ifriend.domain.data.chatgifts.ChatGiftsRepository;
import com.ifriend.domain.data.diary.DiaryRepository;
import com.ifriend.domain.data.files.FileProvider;
import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatusStorage;
import com.ifriend.domain.data.generateAvatar.AvatarInfoStorage;
import com.ifriend.domain.data.generateAvatar.AvatarsStorage;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.data.install.AppInstallStorage;
import com.ifriend.domain.data.install.PreferencesAppInstallStorage;
import com.ifriend.domain.data.levels.LevelsRepository;
import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.domain.newChat.chat.IsChatImageAllowedBroadcast;
import com.ifriend.domain.newChat.chat.IsChatImageAllowedBroadcastImpl;
import com.ifriend.domain.newChat.chat.systems.messages.live.LiveChatMessagesFlow;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.storage.AvatarAnimationEnabledStorage;
import com.ifriend.domain.storage.EventDelayStorage;
import com.ifriend.domain.storage.NeuronsCostsStorage;
import com.ifriend.domain.storage.token.UserTokenStorage;
import com.ifriend.domain.useCases.diary.DiaryNoteReplier;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.keychain.KeychainModule;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
/* compiled from: DataModule.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH'¨\u0006\u000e"}, d2 = {"Lcom/ifriend/app/di/modules/data/DataModule;", "", "()V", "bindAuthDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "authDataStorage", "Lcom/ifriend/data/storages/auth/AuthDataStorageImpl;", "bindAuthDataStorage", "Lcom/ifriend/domain/data/AuthDataStorage;", "bindsChatMessagesFlow", "Lcom/ifriend/domain/newChat/chat/systems/messages/live/LiveChatMessagesFlow;", "flow", "Lcom/ifriend/data/socket/LiveChatMessagesFlowImpl;", "Companion", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module(includes = {ApiModule.class, ConfigModule.class, InitialDataLoadersModule.class, CoreDataModule.class})
/* loaded from: classes6.dex */
public abstract class DataModule {
    public static final Companion Companion = new Companion(null);

    @Singleton
    @Binds
    public abstract AuthDataProvider bindAuthDataProvider(AuthDataStorageImpl authDataStorageImpl);

    @Singleton
    @Binds
    public abstract AuthDataStorage bindAuthDataStorage(AuthDataStorageImpl authDataStorageImpl);

    @Singleton
    @Binds
    public abstract LiveChatMessagesFlow bindsChatMessagesFlow(LiveChatMessagesFlowImpl liveChatMessagesFlowImpl);

    /* compiled from: DataModule.kt */
    @Metadata(d1 = {"\u0000Æ\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0011\u001a\u00020\fH\u0007J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0007J\u0012\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010 \u001a\u00020!H\u0007J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0007Jt\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\b\u0001\u00101\u001a\u00020\u00062\b\b\u0001\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020!2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0007J\u0012\u0010<\u001a\u00020=2\b\b\u0001\u0010>\u001a\u00020?H\u0007J\u0010\u0010@\u001a\u00020A2\u0006\u0010>\u001a\u00020?H\u0007J \u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020HH\u0007J\b\u0010I\u001a\u00020JH\u0007J\u0010\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NH\u0007JH\u0010O\u001a\u00020P2\u0006\u0010M\u001a\u00020N2\u0006\u0010Q\u001a\u00020J2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010$\u001a\u00020%2\u0006\u0010V\u001a\u0002092\u0006\u00106\u001a\u0002072\u0006\u00103\u001a\u000204H\u0007J\u0012\u0010W\u001a\u00020X2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J(\u0010Y\u001a\u00020Z2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010[\u001a\u00020\u000e2\u0006\u00103\u001a\u0002042\u0006\u0010 \u001a\u00020!H\u0007Jr\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010V\u001a\u0002092\u0006\u00106\u001a\u0002072\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u001d2\u0006\u0010a\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020\u00192\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%2\u0006\u00103\u001a\u000204H\u0007J\u0010\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020kH\u0007J\b\u0010l\u001a\u00020mH\u0007J8\u0010n\u001a\u00020o2\u0006\u0010M\u001a\u00020p2\u0006\u0010T\u001a\u00020U2\u0006\u0010q\u001a\u00020m2\u0006\u0010V\u001a\u0002092\u0006\u0010r\u001a\u0002072\u0006\u0010 \u001a\u00020!H\u0007J0\u0010s\u001a\u00020d2\u0006\u00106\u001a\u0002072\u0006\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020y2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0010\u0010z\u001a\u00020{2\u0006\u0010M\u001a\u00020|H\u0007J\u0019\u0010}\u001a\u00020~2\u0006\u0010\u001e\u001a\u00020\u001f2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0007J\u0014\u0010\u0081\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001H\u0007J\u0013\u0010\u0085\u0001\u001a\u00020S2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0014\u0010\u0086\u0001\u001a\u00030\u0087\u00012\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0007JG\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u0007\u0010'\u001a\u00030\u008b\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u008c\u0001\u001a\u00030\u008d\u00012\u0006\u00105\u001a\u00020!2\u0006\u00106\u001a\u0002072\u0006\u00103\u001a\u0002042\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0007J\u0014\u0010\u0090\u0001\u001a\u00030\u0091\u00012\b\b\u0001\u0010>\u001a\u00020?H\u0007J7\u0010\u0092\u0001\u001a\u00030\u0093\u00012\b\u0010\u0094\u0001\u001a\u00030\u0095\u00012\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u000f\u0010\u0096\u0001\u001a\n\u0012\u0005\u0012\u00030\u0098\u00010\u0097\u00012\u0006\u0010G\u001a\u00020HH\u0007JF\u0010\u0099\u0001\u001a\u00020U2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u009a\u0001\u001a\u00030\u0087\u00012\u0007\u0010'\u001a\u00030\u009b\u00012\u0006\u0010+\u001a\u00020,2\b\u0010\u009c\u0001\u001a\u00030\u009d\u00012\u0006\u00105\u001a\u00020!2\u0006\u00106\u001a\u000207H\u0007J\u0011\u0010\u009e\u0001\u001a\u00020k2\u0006\u0010T\u001a\u00020UH\u0007¨\u0006\u009f\u0001"}, d2 = {"Lcom/ifriend/app/di/modules/data/DataModule$Companion;", "", "()V", "appInstallStorage", "Lcom/ifriend/domain/data/install/AppInstallStorage;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "provideAppConfigStorage", "Lcom/ifriend/data/storages/config/AppConfigStorage;", "context", "Landroid/content/Context;", "provideAppImageLoader", "Lcoil/ImageLoader;", "httpClient", "Lokhttp3/OkHttpClient;", "provideAppImageLoaderRepository", "Lcom/ifriend/domain/data/AppImageLoaderRepository;", "imageLoader", "provideAuthDataStorage", "Lcom/ifriend/data/storages/auth/AuthDataStorageImpl;", "tokenStorage", "Lcom/ifriend/domain/storage/token/UserTokenStorage;", "provideAvatarAnimationEnabledStorage", "Lcom/ifriend/domain/storage/AvatarAnimationEnabledStorage;", "provideAvatarGenerationStatusStorage", "Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatusStorage;", "provideAvatarInfoStorage", "Lcom/ifriend/domain/data/generateAvatar/AvatarInfoStorage;", "provideAvatarsStorage", "Lcom/ifriend/domain/data/generateAvatar/AvatarsStorage;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "provideBotProvider", "Lcom/ifriend/domain/data/BotProvider;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "provideBotRepository", "api", "Lcom/ifriend/data/networking/api/BotApi;", "botFromResponseMapper", "Lcom/ifriend/data/mappers/BotFromResponseMapper;", "fromGenderMapper", "Lcom/ifriend/data/mappers/GenderToBackendString;", "fromPersonalityMapper", "Lcom/ifriend/data/mappers/PersonalityToBackendValueMapper;", "fromEthnicityMapper", "Lcom/ifriend/data/mappers/EthnicityToBackendValueMapper;", "userSessionSharedPreferences", "userSharedPreferences", "logger", "Lcom/ifriend/common_utils/Logger;", "coroutineDispatchers", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "source", "Lcom/ifriend/domain/socket/MessagesSource;", "mainBotLocalDataSource", "Lcom/ifriend/data/storages/bots/MainBotLocalDataSource;", "provideChatApi", "Lcom/ifriend/data/networking/api/chat/ChatMessagesApi;", "retrofit", "Lretrofit2/Retrofit;", "provideChatGiftsApi", "Lcom/ifriend/data/networking/api/chatgifts/ChatGiftsApi;", "provideChatGiftsRepository", "Lcom/ifriend/domain/data/chatgifts/ChatGiftsRepository;", "chatGiftsRemoteDataSource", "Lcom/ifriend/data/networking/datasources/gifts/ChatGiftsRemoteDataSource;", "appConfigStorage", "coreExecuteCatching", "Lcom/ifriend/data/common/CoreExecuteCatching;", "provideDiaryDao", "Lcom/ifriend/data/storages/diary/DiaryDao;", "provideDiaryNoteReplier", "Lcom/ifriend/domain/useCases/diary/DiaryNoteReplier;", "apiDelegate", "Lcom/ifriend/data/networking/api/diary/DiaryApiDelegate;", "provideDiaryRepository", "Lcom/ifriend/domain/data/diary/DiaryRepository;", "diaryDao", "shownNotesDao", "Lcom/ifriend/data/storages/diary/ShownDiaryNotesDao;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "messagesSource", "provideEventDelayStorage", "Lcom/ifriend/domain/storage/EventDelayStorage;", "provideFileProvider", "Lcom/ifriend/domain/data/files/FileProvider;", "okHttpClient", "provideGenerateBotAvatarRepository", "Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;", "generateBotAvatarApi", "Lcom/ifriend/data/networking/api/GenerateBotAvatarApi;", "avatarsStorage", "avatarInfoStorage", "avatarGenerationStatusStorage", "neuronsCostsStorage", "Lcom/ifriend/domain/storage/NeuronsCostsStorage;", "animatedAvatarFeatureToggle", "Lcom/ifriend/data/toggle/AnimatedAvatarFeatureToggle;", "avatarAnimationEnabledStorage", "provideIsImageAllowedBroadcast", "Lcom/ifriend/domain/newChat/chat/IsChatImageAllowedBroadcast;", "userSubscriptionsBroadcast", "Lcom/ifriend/domain/data/UserSubscriptionsBroadcast;", "provideLevelsDao", "Lcom/ifriend/data/storages/levels/LevelsDao;", "provideLevelsRepository", "Lcom/ifriend/domain/data/levels/LevelsRepository;", "Lcom/ifriend/data/networking/api/levels/LevelsApiDelegate;", "dao", "scope", "provideNeuronsCostsStorage", "appConfigLocalDataSource", "Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;", "avatarGenerationFreeToggle", "Lcom/ifriend/data/toggle/AvatarGenerationFreeToggle;", "neuronsApi", "Lcom/ifriend/data/networking/api/NeuronsApi;", "provideOnboardingAnswersRepository", "Lcom/ifriend/domain/data/onboarding/OnboardingAnswersRepository;", "Lcom/ifriend/data/networking/api/onboarding/OnboardingApiDelegate;", "provideRateUsRepository", "Lcom/ifriend/domain/data/RateUsRepository;", "rateUsApi", "Lcom/ifriend/data/networking/api/RateUsApi;", "provideResetPasswordRepository", "Lcom/ifriend/domain/data/ResetPasswordRepository;", "resetPasswordApi", "Lcom/ifriend/data/networking/api/ResetPasswordApi;", "provideShownDiaryNotesDao", "provideTagsProvider", "Lcom/ifriend/domain/data/TagsProvider;", KeychainModule.Maps.STORAGE, "Lcom/ifriend/domain/data/TagsStorage;", "provideTagsStorage", "Lcom/ifriend/data/networking/api/TagsApi;", "internalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "tagsLocalDataSource", "Lcom/ifriend/data/storages/tags/TagsLocalDataSource;", "provideTopicsApi", "Lcom/ifriend/data/networking/api/topics/TopicsApi;", "provideUserProfileRepository", "Lcom/ifriend/domain/data/user/UserProfileRepository;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "provideUserRepository", "tagsProvider", "Lcom/ifriend/data/networking/api/UserApi;", "toUserMapper", "Lcom/ifriend/data/mappers/ToUserMapper;", "provideUserSubscriptionsBroadcast", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Provides
        @Singleton
        public final AppInstallStorage appInstallStorage(@DeviceSharedPreferences Preferences preferences) {
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            return new PreferencesAppInstallStorage(preferences);
        }

        @Provides
        @Singleton
        public final AuthDataStorageImpl provideAuthDataStorage(UserTokenStorage tokenStorage, @UserSessionSharedPreferences Preferences preferences) {
            Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            return new AuthDataStorageImpl(tokenStorage, preferences);
        }

        @Provides
        @Singleton
        public final UserProfileRepository provideUserProfileRepository(DispatcherProvider dispatcherProvider, @UserSessionSharedPreferences Preferences preferences, DataStore<androidx.datastore.preferences.core.Preferences> dataStore, CoreExecuteCatching coreExecuteCatching) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Intrinsics.checkNotNullParameter(dataStore, "dataStore");
            Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
            return new UserProfileRepositoryImpl(dispatcherProvider, preferences, dataStore, coreExecuteCatching);
        }

        @Provides
        @Singleton
        public final UserRepository provideUserRepository(AuthDataProvider authDataProvider, TagsProvider tagsProvider, UserApi api, GenderToBackendString fromGenderMapper, ToUserMapper toUserMapper, CoroutineDispatchers coroutineDispatchers, CoroutineScope coroutineScope) {
            Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
            Intrinsics.checkNotNullParameter(tagsProvider, "tagsProvider");
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(fromGenderMapper, "fromGenderMapper");
            Intrinsics.checkNotNullParameter(toUserMapper, "toUserMapper");
            Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            return new UserRepositoryImpl(authDataProvider, tagsProvider, api, fromGenderMapper, toUserMapper, coroutineDispatchers, coroutineScope);
        }

        @Provides
        @Singleton
        public final DiaryRepository provideDiaryRepository(DiaryApiDelegate apiDelegate, DiaryDao diaryDao, ShownDiaryNotesDao shownNotesDao, UserRepository userRepository, BotRepository botRepository, MessagesSource messagesSource, CoroutineScope coroutineScope, Logger logger) {
            Intrinsics.checkNotNullParameter(apiDelegate, "apiDelegate");
            Intrinsics.checkNotNullParameter(diaryDao, "diaryDao");
            Intrinsics.checkNotNullParameter(shownNotesDao, "shownNotesDao");
            Intrinsics.checkNotNullParameter(userRepository, "userRepository");
            Intrinsics.checkNotNullParameter(botRepository, "botRepository");
            Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new DiaryRepositoryImpl(apiDelegate, diaryDao, shownNotesDao, userRepository, botRepository, messagesSource, coroutineScope, logger);
        }

        @Provides
        @Singleton
        public final DiaryNoteReplier provideDiaryNoteReplier(DiaryApiDelegate apiDelegate) {
            Intrinsics.checkNotNullParameter(apiDelegate, "apiDelegate");
            return new DiaryNoteReplierImpl(apiDelegate);
        }

        @Provides
        @Singleton
        public final OnboardingAnswersRepository provideOnboardingAnswersRepository(OnboardingApiDelegate apiDelegate) {
            Intrinsics.checkNotNullParameter(apiDelegate, "apiDelegate");
            return new OnboardingAnswersRepositoryImpl(apiDelegate);
        }

        @Provides
        @Singleton
        public final DiaryDao provideDiaryDao() {
            return new DiaryDaoImpl();
        }

        @Provides
        @Singleton
        public final ShownDiaryNotesDao provideShownDiaryNotesDao(@UserSharedPreferences Preferences preferences) {
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            return new ShownDiaryNotesDaoImpl(preferences);
        }

        @Provides
        @Singleton
        public final BotRepository provideBotRepository(AuthDataProvider authDataProvider, BotApi api, BotFromResponseMapper botFromResponseMapper, GenderToBackendString fromGenderMapper, PersonalityToBackendValueMapper fromPersonalityMapper, EthnicityToBackendValueMapper fromEthnicityMapper, @UserSessionSharedPreferences Preferences userSessionSharedPreferences, @UserSharedPreferences Preferences userSharedPreferences, Logger logger, CoroutineDispatchers coroutineDispatchers, CoroutineScope coroutineScope, MessagesSource source, MainBotLocalDataSource mainBotLocalDataSource) {
            Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(botFromResponseMapper, "botFromResponseMapper");
            Intrinsics.checkNotNullParameter(fromGenderMapper, "fromGenderMapper");
            Intrinsics.checkNotNullParameter(fromPersonalityMapper, "fromPersonalityMapper");
            Intrinsics.checkNotNullParameter(fromEthnicityMapper, "fromEthnicityMapper");
            Intrinsics.checkNotNullParameter(userSessionSharedPreferences, "userSessionSharedPreferences");
            Intrinsics.checkNotNullParameter(userSharedPreferences, "userSharedPreferences");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(mainBotLocalDataSource, "mainBotLocalDataSource");
            return new BotRepositoryImpl(authDataProvider, api, botFromResponseMapper, fromGenderMapper, fromPersonalityMapper, fromEthnicityMapper, userSessionSharedPreferences, userSharedPreferences, logger, coroutineDispatchers, coroutineScope, source, mainBotLocalDataSource);
        }

        @Provides
        @Singleton
        public final BotProvider provideBotProvider(BotRepository botRepository) {
            Intrinsics.checkNotNullParameter(botRepository, "botRepository");
            return botRepository;
        }

        @Provides
        @Singleton
        public final UserSubscriptionsBroadcast provideUserSubscriptionsBroadcast(UserRepository userRepository) {
            Intrinsics.checkNotNullParameter(userRepository, "userRepository");
            return new UserSubscriptionsBroadcastImpl(userRepository);
        }

        @Provides
        @Singleton
        public final IsChatImageAllowedBroadcast provideIsImageAllowedBroadcast(UserSubscriptionsBroadcast userSubscriptionsBroadcast) {
            Intrinsics.checkNotNullParameter(userSubscriptionsBroadcast, "userSubscriptionsBroadcast");
            return new IsChatImageAllowedBroadcastImpl(userSubscriptionsBroadcast);
        }

        @Provides
        @Singleton
        public final TagsStorage provideTagsStorage(TagsApi api, AuthDataProvider authDataProvider, InternalNotificationHandler internalNotificationHandler, CoroutineDispatchers coroutineDispatchers, CoroutineScope coroutineScope, Logger logger, TagsLocalDataSource tagsLocalDataSource) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
            Intrinsics.checkNotNullParameter(internalNotificationHandler, "internalNotificationHandler");
            Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(tagsLocalDataSource, "tagsLocalDataSource");
            return new TagsStorageImpl(api, authDataProvider, internalNotificationHandler, logger, coroutineDispatchers, coroutineScope, tagsLocalDataSource);
        }

        @Provides
        @Singleton
        public final TagsProvider provideTagsProvider(TagsStorage storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return storage;
        }

        @Provides
        @Singleton
        public final AvatarsStorage provideAvatarsStorage(AuthDataProvider authDataProvider, Context context, CoroutineDispatchers dispatchers) {
            Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
            return new AvatarsStorageImpl(authDataProvider, context, dispatchers);
        }

        @Provides
        @Singleton
        public final AvatarGenerationStatusStorage provideAvatarGenerationStatusStorage() {
            return new AvatarGenerationStatusStorageImpl();
        }

        @Provides
        @Singleton
        public final AvatarAnimationEnabledStorage provideAvatarAnimationEnabledStorage(@UserSessionSharedPreferences Preferences preferences) {
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            return new AvatarAnimationEnabledStorageImpl(preferences);
        }

        @Provides
        @Singleton
        public final AvatarInfoStorage provideAvatarInfoStorage(@UserSessionSharedPreferences Preferences preferences) {
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            return new AvatarInfoStorageImpl(preferences);
        }

        @Provides
        @Singleton
        public final NeuronsCostsStorage provideNeuronsCostsStorage(CoroutineScope coroutineScope, AppConfigLocalDataSource appConfigLocalDataSource, AvatarGenerationFreeToggle avatarGenerationFreeToggle, NeuronsApi neuronsApi, AuthDataProvider authDataProvider) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
            Intrinsics.checkNotNullParameter(avatarGenerationFreeToggle, "avatarGenerationFreeToggle");
            Intrinsics.checkNotNullParameter(neuronsApi, "neuronsApi");
            Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
            return new NeuronsCostsStorageImpl(coroutineScope, appConfigLocalDataSource, avatarGenerationFreeToggle, neuronsApi, authDataProvider);
        }

        @Provides
        @Singleton
        public final GenerateBotAvatarRepository provideGenerateBotAvatarRepository(GenerateBotAvatarApi generateBotAvatarApi, AuthDataProvider authDataProvider, MessagesSource messagesSource, CoroutineScope coroutineScope, @UserSessionSharedPreferences Preferences preferences, AvatarsStorage avatarsStorage, AvatarInfoStorage avatarInfoStorage, AvatarGenerationStatusStorage avatarGenerationStatusStorage, NeuronsCostsStorage neuronsCostsStorage, AnimatedAvatarFeatureToggle animatedAvatarFeatureToggle, AvatarAnimationEnabledStorage avatarAnimationEnabledStorage, BotRepository botRepository, Logger logger) {
            Intrinsics.checkNotNullParameter(generateBotAvatarApi, "generateBotAvatarApi");
            Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
            Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Intrinsics.checkNotNullParameter(avatarsStorage, "avatarsStorage");
            Intrinsics.checkNotNullParameter(avatarInfoStorage, "avatarInfoStorage");
            Intrinsics.checkNotNullParameter(avatarGenerationStatusStorage, "avatarGenerationStatusStorage");
            Intrinsics.checkNotNullParameter(neuronsCostsStorage, "neuronsCostsStorage");
            Intrinsics.checkNotNullParameter(animatedAvatarFeatureToggle, "animatedAvatarFeatureToggle");
            Intrinsics.checkNotNullParameter(avatarAnimationEnabledStorage, "avatarAnimationEnabledStorage");
            Intrinsics.checkNotNullParameter(botRepository, "botRepository");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new GenerateBotAvatarRepositoryImpl(generateBotAvatarApi, botRepository, authDataProvider, messagesSource, coroutineScope, preferences, avatarsStorage, avatarInfoStorage, avatarGenerationStatusStorage, neuronsCostsStorage, animatedAvatarFeatureToggle, avatarAnimationEnabledStorage, logger);
        }

        @Provides
        @Singleton
        public final EventDelayStorage provideEventDelayStorage(@UserSessionSharedPreferences Preferences preferences) {
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            return new EventDelayStorageImpl(preferences);
        }

        @Provides
        @Singleton
        public final ResetPasswordRepository provideResetPasswordRepository(ResetPasswordApi resetPasswordApi) {
            Intrinsics.checkNotNullParameter(resetPasswordApi, "resetPasswordApi");
            return new ResetPasswordRepositoryImpl(resetPasswordApi);
        }

        @Provides
        @Singleton
        public final RateUsRepository provideRateUsRepository(AuthDataProvider authDataProvider, RateUsApi rateUsApi) {
            Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
            Intrinsics.checkNotNullParameter(rateUsApi, "rateUsApi");
            return new RateUsRepositoryImpl(authDataProvider, rateUsApi);
        }

        @Provides
        @Singleton
        public final LevelsRepository provideLevelsRepository(LevelsApiDelegate apiDelegate, UserRepository userRepository, LevelsDao dao, MessagesSource messagesSource, CoroutineScope scope, CoroutineDispatchers dispatchers) {
            Intrinsics.checkNotNullParameter(apiDelegate, "apiDelegate");
            Intrinsics.checkNotNullParameter(userRepository, "userRepository");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
            return new LevelsRepositoryImpl(apiDelegate, userRepository, dao, messagesSource, scope, dispatchers);
        }

        @Provides
        @Singleton
        public final LevelsDao provideLevelsDao() {
            return new LevelsDaoImpl();
        }

        @Provides
        @Singleton
        public final TopicsApi provideTopicsApi(@AppRetrofitClientQualifier Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object create = retrofit.create(TopicsApi.class);
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            return (TopicsApi) create;
        }

        @Provides
        @Singleton
        public final ChatGiftsApi provideChatGiftsApi(Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object create = retrofit.create(ChatGiftsApi.class);
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            return (ChatGiftsApi) create;
        }

        @Provides
        @Singleton
        public final ChatMessagesApi provideChatApi(@AppRetrofitClientQualifier Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object create = retrofit.create(ChatMessagesApi.class);
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            return (ChatMessagesApi) create;
        }

        @AppImageLoader
        @Provides
        @Singleton
        public final ImageLoader provideAppImageLoader(Context context, @AppHttpClientQualifier OkHttpClient httpClient) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(httpClient, "httpClient");
            return new ImageLoader.Builder(context).crossfade(true).okHttpClient(httpClient).build();
        }

        @Provides
        @Singleton
        public final AppImageLoaderRepository provideAppImageLoaderRepository(Context context, @AppImageLoader ImageLoader imageLoader) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            return new AppImageLoaderRepositoryImpl(imageLoader, context);
        }

        @Provides
        @Singleton
        public final ChatGiftsRepository provideChatGiftsRepository(ChatGiftsRemoteDataSource chatGiftsRemoteDataSource, AppConfigStorage appConfigStorage, CoreExecuteCatching coreExecuteCatching) {
            Intrinsics.checkNotNullParameter(chatGiftsRemoteDataSource, "chatGiftsRemoteDataSource");
            Intrinsics.checkNotNullParameter(appConfigStorage, "appConfigStorage");
            Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
            return new ChatGiftsRepositoryImpl(chatGiftsRemoteDataSource, appConfigStorage, coreExecuteCatching);
        }

        @Provides
        @Singleton
        public final AppConfigStorage provideAppConfigStorage(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new AppConfigStorageImpl(context);
        }

        @Provides
        @Singleton
        public final FileProvider provideFileProvider(Context context, OkHttpClient okHttpClient, Logger logger, CoroutineDispatchers dispatchers) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
            return new OkHttpFileProvider(context, okHttpClient, logger, dispatchers);
        }
    }
}
