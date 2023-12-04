package com.ifriend.app.di.modules;

import android.content.Context;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.ifriend.base.di.ApiUrlQualifier;
import com.ifriend.base.di.MessagesSourceLifecycleObserver;
import com.ifriend.base.di.UserSessionSharedPreferences;
import com.ifriend.common_utils.Logger;
import com.ifriend.core.MessagesSourceLifecycleController;
import com.ifriend.data.mappers.EthnicityFromBackendValueMapper;
import com.ifriend.data.mappers.GenderFromBackendString;
import com.ifriend.data.mappers.PersonalityFromBackendValueMapper;
import com.ifriend.data.networking.UserAgentHeaderInterceptor;
import com.ifriend.data.networking.api.SocketShardsApi;
import com.ifriend.data.repository.AudioMessageRepositoryImpl;
import com.ifriend.data.repository.DecodedAudioMessagesRepositoryImpl;
import com.ifriend.data.repository.chat.info.ChatNotificationsRepositoryImpl;
import com.ifriend.data.socket.MessagesSocketUrlProvider;
import com.ifriend.data.socket.SocketMessagesSource;
import com.ifriend.data.socket.SocketUrlProvider;
import com.ifriend.data.socket.generator.BotAudioMessageUrlGenerator;
import com.ifriend.data.socket.generator.MediaPlayerPlaybackControllerGenerator;
import com.ifriend.data.socket.generator.UserAudioMessageUrlGenerator;
import com.ifriend.data.socket.mapper.ChatMessageMapHelper;
import com.ifriend.data.socket.mapper.ChatMessageMapHelperImpl;
import com.ifriend.data.socket.mapper.ChatRegenerateMessageFailedMapper;
import com.ifriend.data.socket.mapper.ChatRemovedMessageMapper;
import com.ifriend.data.socket.mapper.ChatSubscriptionMapper;
import com.ifriend.data.socket.mapper.JsonToAddDiaryNotesMapper;
import com.ifriend.data.socket.mapper.JsonToAvatarAnimationGeneratedMapper;
import com.ifriend.data.socket.mapper.JsonToBotDataChangedMapper;
import com.ifriend.data.socket.mapper.JsonToChatMessageMapper;
import com.ifriend.data.socket.mapper.JsonToDailyNeuronsReceivedMapper;
import com.ifriend.data.socket.mapper.JsonToGeneratedAvatarMapper;
import com.ifriend.data.socket.mapper.JsonToLevelInfoUpdateMapper;
import com.ifriend.data.socket.mapper.JsonToNeuronsAddedMapper;
import com.ifriend.data.socket.mapper.JsonToNeuronsSpentMapper;
import com.ifriend.data.socket.mapper.JsonToTagOfUserMapper;
import com.ifriend.data.socket.mapper.SocketMessageToMessagesSourceMessageMapper;
import com.ifriend.data.socket.mapper.chat.JsonToChatCallMessageMapper;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.AudioMessageRepository;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.DecodedAudioMessagesRepository;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.TagsStorage;
import com.ifriend.domain.data.notifications.ChatNotificationsRepository;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.domain.models.TagOfUser;
import com.ifriend.domain.models.avatar.GeneratedAvatars;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.socket.MessagesSourceMessage;
import com.ifriend.domain.storage.token.UserTokenProvider;
import com.ifriend.domain.useCases.socket.ListenTagsUseCase;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import org.json.JSONObject;
/* compiled from: MessagesModule.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'¨\u0006\u000b"}, d2 = {"Lcom/ifriend/app/di/modules/MessagesModule;", "", "bindsChatMessageMapHelper", "Lcom/ifriend/data/socket/mapper/ChatMessageMapHelper;", "helper", "Lcom/ifriend/data/socket/mapper/ChatMessageMapHelperImpl;", "bindsChatNotificationRepository", "Lcom/ifriend/domain/data/notifications/ChatNotificationsRepository;", "repo", "Lcom/ifriend/data/repository/chat/info/ChatNotificationsRepositoryImpl;", "Companion", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface MessagesModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Singleton
    @Binds
    ChatMessageMapHelper bindsChatMessageMapHelper(ChatMessageMapHelperImpl chatMessageMapHelperImpl);

    @Singleton
    @Binds
    ChatNotificationsRepository bindsChatNotificationRepository(ChatNotificationsRepositoryImpl chatNotificationsRepositoryImpl);

    /* compiled from: MessagesModule.kt */
    @Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J8\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0016\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001aH\u0007J.\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010 0\u001a2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0007J\u0016\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010(0\u001aH\u0007J\u0014\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020*0\u001aH\u0007J\u0016\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010,0\u001aH\u0007J\u0016\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010.0\u001aH\u0007J\u0016\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u0001000\u001aH\u0007J \u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0007J\u0018\u00108\u001a\u0002092\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010:\u001a\u00020;H\u0007J0\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007Jô\u0001\u0010A\u001a\u00020\u00182\u0006\u0010B\u001a\u00020C2\u0014\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u0001000\u001a2\u0014\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010F0\u001a2\u0014\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010.0\u001a2\u0014\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010(0\u001a2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020*0\u001a2\u0014\u0010J\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001a2\u0014\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010 0\u001a2\u0014\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a2\u0014\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010,0\u001a2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020UH\u0007J\u0016\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010F0\u001aH\u0007J*\u0010W\u001a\u00020\u00102\b\b\u0001\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u00106\u001a\u0002072\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\\\u001a\u00020]2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006^"}, d2 = {"Lcom/ifriend/app/di/modules/MessagesModule$Companion;", "", "()V", "bindsDecodedAudioMessagesRepository", "Lcom/ifriend/domain/data/DecodedAudioMessagesRepository;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "provicedsAudioMessageRepository", "Lcom/ifriend/domain/data/AudioMessageRepository;", "provideBotAudioMessageUrlGenerator", "Lcom/ifriend/data/socket/generator/BotAudioMessageUrlGenerator;", "context", "Landroid/content/Context;", "provideControllableMessagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "urlProvider", "Lcom/ifriend/data/socket/SocketUrlProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "coroutineDispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "logger", "Lcom/ifriend/common_utils/Logger;", "socketMessageToMessagesSourceMessageMapper", "Lcom/ifriend/data/socket/mapper/SocketMessageToMessagesSourceMessageMapper;", "provideJsonToAddDiaryNotesMapper", "Lcom/ifriend/domain/data/Mapper;", "Lorg/json/JSONObject;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$AddDiaryNotes;", "provideJsonToAvatarAnimationGeneratedMapper", "Lcom/ifriend/domain/socket/MessagesSourceMessage$AvatarAnimationGenerated;", "provideJsonToBotChangedMapper", "Lcom/ifriend/domain/socket/MessagesSourceMessage$BotDataChanged;", "genderMapper", "Lcom/ifriend/data/mappers/GenderFromBackendString;", "ethnicityMapper", "Lcom/ifriend/data/mappers/EthnicityFromBackendValueMapper;", "personalityMapper", "Lcom/ifriend/data/mappers/PersonalityFromBackendValueMapper;", "provideJsonToDailyNeuronsReceivedMapper", "Lcom/ifriend/domain/socket/MessagesSourceMessage$DailyNeuronsReceived;", "provideJsonToGeneratedAvatarMapper", "Lcom/ifriend/domain/models/avatar/GeneratedAvatars;", "provideJsonToLevelInfoUpdateMapper", "Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate;", "provideJsonToNeuronsAddedMapper", "Lcom/ifriend/domain/socket/MessagesSourceMessage$NeuronesPurchased;", "provideJsonToTagOfUserMapper", "Lcom/ifriend/domain/models/TagOfUser;", "provideListenTagsUseCase", "Lcom/ifriend/domain/useCases/socket/ListenTagsUseCase;", "messagesSource", "tagsStorage", "Lcom/ifriend/domain/data/TagsStorage;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "provideMediaPlayerPlaybackControllerGenerator", "Lcom/ifriend/data/socket/generator/MediaPlayerPlaybackControllerGenerator;", "tokenProvider", "Lcom/ifriend/domain/storage/token/UserTokenProvider;", "provideMessagesSourceLifecycleController", "Landroidx/lifecycle/DefaultLifecycleObserver;", "connection", "Lcom/ifriend/domain/infrastucture/InternetConnection;", "scope", "provideSocketMessageToMessagesSourceMapper", "chatItemMessageMapper", "Lcom/ifriend/data/socket/mapper/JsonToChatMessageMapper;", "tagMapper", "neuronsSpentMapper", "Lcom/ifriend/domain/socket/MessagesSourceMessage$NeuronesChanged;", "neuronsAddedMapper", "dailyNeuronsMapper", "generatedAvatarsMapper", "avatarAnimationGeneratedMapper", "botDataChangedMapper", "addDiaryNotesMapper", "levelInfoMapper", "chatRemovedMessageMapper", "Lcom/ifriend/data/socket/mapper/ChatRemovedMessageMapper;", "chatCallMessageMapper", "Lcom/ifriend/data/socket/mapper/chat/JsonToChatCallMessageMapper;", "chatRegenerateMessageFailedMapper", "Lcom/ifriend/data/socket/mapper/ChatRegenerateMessageFailedMapper;", "chatSubscriptionMapper", "Lcom/ifriend/data/socket/mapper/ChatSubscriptionMapper;", "provideSocketMessageToNeuronsChangeMapper", "provideUrlProvider", "url", "", "api", "Lcom/ifriend/data/networking/api/SocketShardsApi;", "provideUserAudioMessageUrlGenerator", "Lcom/ifriend/data/socket/generator/UserAudioMessageUrlGenerator;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @Singleton
        public final DecodedAudioMessagesRepository bindsDecodedAudioMessagesRepository(@UserSessionSharedPreferences Preferences preferences) {
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            return new DecodedAudioMessagesRepositoryImpl(preferences);
        }

        @Provides
        @Singleton
        public final AudioMessageRepository provicedsAudioMessageRepository(@UserSessionSharedPreferences Preferences preferences) {
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            return new AudioMessageRepositoryImpl(preferences);
        }

        @Provides
        @Singleton
        public final SocketUrlProvider provideUrlProvider(@ApiUrlQualifier String url, SocketShardsApi api, AuthDataProvider authDataProvider, Logger logger) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new MessagesSocketUrlProvider(api, url, authDataProvider, logger);
        }

        @Provides
        @Singleton
        public final MessagesSource provideControllableMessagesSource(SocketUrlProvider urlProvider, CoroutineScope coroutineScope, CoroutineDispatchers coroutineDispatchers, Logger logger, Context context, SocketMessageToMessagesSourceMessageMapper socketMessageToMessagesSourceMessageMapper) {
            Intrinsics.checkNotNullParameter(urlProvider, "urlProvider");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(socketMessageToMessagesSourceMessageMapper, "socketMessageToMessagesSourceMessageMapper");
            return new SocketMessagesSource(urlProvider, new OkHttpClient.Builder().connectTimeout(30L, TimeUnit.SECONDS).writeTimeout(30L, TimeUnit.SECONDS).readTimeout(30L, TimeUnit.SECONDS).addInterceptor(new UserAgentHeaderInterceptor(context)).build(), false, coroutineScope, coroutineDispatchers, logger, socketMessageToMessagesSourceMessageMapper, 0, 0, 388, null);
        }

        @Provides
        @Singleton
        public final SocketMessageToMessagesSourceMessageMapper provideSocketMessageToMessagesSourceMapper(JsonToChatMessageMapper chatItemMessageMapper, Mapper<JSONObject, TagOfUser> tagMapper, Mapper<JSONObject, MessagesSourceMessage.NeuronesChanged> neuronsSpentMapper, Mapper<JSONObject, MessagesSourceMessage.NeuronesPurchased> neuronsAddedMapper, Mapper<JSONObject, MessagesSourceMessage.DailyNeuronsReceived> dailyNeuronsMapper, Mapper<JSONObject, GeneratedAvatars> generatedAvatarsMapper, Mapper<JSONObject, MessagesSourceMessage.AvatarAnimationGenerated> avatarAnimationGeneratedMapper, Mapper<JSONObject, MessagesSourceMessage.BotDataChanged> botDataChangedMapper, Mapper<JSONObject, MessagesSourceMessage.AddDiaryNotes> addDiaryNotesMapper, Mapper<JSONObject, MessagesSourceMessage.LevelInfoUpdate> levelInfoMapper, ChatRemovedMessageMapper chatRemovedMessageMapper, JsonToChatCallMessageMapper chatCallMessageMapper, ChatRegenerateMessageFailedMapper chatRegenerateMessageFailedMapper, ChatSubscriptionMapper chatSubscriptionMapper) {
            Intrinsics.checkNotNullParameter(chatItemMessageMapper, "chatItemMessageMapper");
            Intrinsics.checkNotNullParameter(tagMapper, "tagMapper");
            Intrinsics.checkNotNullParameter(neuronsSpentMapper, "neuronsSpentMapper");
            Intrinsics.checkNotNullParameter(neuronsAddedMapper, "neuronsAddedMapper");
            Intrinsics.checkNotNullParameter(dailyNeuronsMapper, "dailyNeuronsMapper");
            Intrinsics.checkNotNullParameter(generatedAvatarsMapper, "generatedAvatarsMapper");
            Intrinsics.checkNotNullParameter(avatarAnimationGeneratedMapper, "avatarAnimationGeneratedMapper");
            Intrinsics.checkNotNullParameter(botDataChangedMapper, "botDataChangedMapper");
            Intrinsics.checkNotNullParameter(addDiaryNotesMapper, "addDiaryNotesMapper");
            Intrinsics.checkNotNullParameter(levelInfoMapper, "levelInfoMapper");
            Intrinsics.checkNotNullParameter(chatRemovedMessageMapper, "chatRemovedMessageMapper");
            Intrinsics.checkNotNullParameter(chatCallMessageMapper, "chatCallMessageMapper");
            Intrinsics.checkNotNullParameter(chatRegenerateMessageFailedMapper, "chatRegenerateMessageFailedMapper");
            Intrinsics.checkNotNullParameter(chatSubscriptionMapper, "chatSubscriptionMapper");
            return new SocketMessageToMessagesSourceMessageMapper(chatItemMessageMapper, chatSubscriptionMapper, chatRemovedMessageMapper, chatRegenerateMessageFailedMapper, tagMapper, neuronsSpentMapper, dailyNeuronsMapper, neuronsAddedMapper, generatedAvatarsMapper, avatarAnimationGeneratedMapper, botDataChangedMapper, addDiaryNotesMapper, levelInfoMapper, chatCallMessageMapper);
        }

        @Provides
        @Singleton
        public final BotAudioMessageUrlGenerator provideBotAudioMessageUrlGenerator(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new BotAudioMessageUrlGenerator(context);
        }

        @Provides
        @Singleton
        public final UserAudioMessageUrlGenerator provideUserAudioMessageUrlGenerator(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new UserAudioMessageUrlGenerator(context);
        }

        @Provides
        @Singleton
        public final MediaPlayerPlaybackControllerGenerator provideMediaPlayerPlaybackControllerGenerator(Context context, UserTokenProvider tokenProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
            return new MediaPlayerPlaybackControllerGenerator(context, tokenProvider);
        }

        @Provides
        @Singleton
        public final Mapper<JSONObject, TagOfUser> provideJsonToTagOfUserMapper() {
            return new JsonToTagOfUserMapper();
        }

        @Provides
        @Singleton
        public final Mapper<JSONObject, MessagesSourceMessage.NeuronesChanged> provideSocketMessageToNeuronsChangeMapper() {
            return new JsonToNeuronsSpentMapper();
        }

        @Provides
        @Singleton
        public final Mapper<JSONObject, MessagesSourceMessage.NeuronesPurchased> provideJsonToNeuronsAddedMapper() {
            return new JsonToNeuronsAddedMapper();
        }

        @Provides
        @Singleton
        public final Mapper<JSONObject, MessagesSourceMessage.DailyNeuronsReceived> provideJsonToDailyNeuronsReceivedMapper() {
            return new JsonToDailyNeuronsReceivedMapper();
        }

        @Provides
        @Singleton
        public final Mapper<JSONObject, MessagesSourceMessage.LevelInfoUpdate> provideJsonToLevelInfoUpdateMapper() {
            return new JsonToLevelInfoUpdateMapper();
        }

        @Provides
        @Singleton
        public final Mapper<JSONObject, MessagesSourceMessage.BotDataChanged> provideJsonToBotChangedMapper(GenderFromBackendString genderMapper, EthnicityFromBackendValueMapper ethnicityMapper, PersonalityFromBackendValueMapper personalityMapper) {
            Intrinsics.checkNotNullParameter(genderMapper, "genderMapper");
            Intrinsics.checkNotNullParameter(ethnicityMapper, "ethnicityMapper");
            Intrinsics.checkNotNullParameter(personalityMapper, "personalityMapper");
            return new JsonToBotDataChangedMapper(genderMapper, ethnicityMapper, personalityMapper);
        }

        @Provides
        @Singleton
        public final Mapper<JSONObject, MessagesSourceMessage.AddDiaryNotes> provideJsonToAddDiaryNotesMapper(Logger logger) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new JsonToAddDiaryNotesMapper(logger);
        }

        @Provides
        @Singleton
        public final Mapper<JSONObject, GeneratedAvatars> provideJsonToGeneratedAvatarMapper() {
            return new JsonToGeneratedAvatarMapper();
        }

        @Provides
        @Singleton
        public final Mapper<JSONObject, MessagesSourceMessage.AvatarAnimationGenerated> provideJsonToAvatarAnimationGeneratedMapper() {
            return new JsonToAvatarAnimationGeneratedMapper();
        }

        @Provides
        @Singleton
        @MessagesSourceLifecycleObserver
        public final DefaultLifecycleObserver provideMessagesSourceLifecycleController(InternetConnection connection, CoroutineScope scope, CoroutineDispatchers coroutineDispatchers, MessagesSource messagesSource, Logger logger) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
            Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new MessagesSourceLifecycleController(connection, scope, coroutineDispatchers, messagesSource, logger);
        }

        @Provides
        @Singleton
        public final ListenTagsUseCase provideListenTagsUseCase(MessagesSource messagesSource, TagsStorage tagsStorage, AuthDataProvider authDataProvider) {
            Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
            Intrinsics.checkNotNullParameter(tagsStorage, "tagsStorage");
            Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
            return new ListenTagsUseCase(messagesSource, tagsStorage, authDataProvider);
        }
    }
}
