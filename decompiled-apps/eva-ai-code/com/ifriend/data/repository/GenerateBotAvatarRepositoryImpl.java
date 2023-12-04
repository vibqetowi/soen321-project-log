package com.ifriend.data.repository;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.common_utils.Logger;
import com.ifriend.data.networking.api.AvatarGenerationResponse;
import com.ifriend.data.networking.api.AvatarGenerationStatusResponse;
import com.ifriend.data.networking.api.GenerateBotAvatarApi;
import com.ifriend.data.networking.api.GenerateBotAvatarResponse;
import com.ifriend.data.networking.requests.GenerateBotAvatarRequest;
import com.ifriend.data.networking.responses.AvatarInfoResponse;
import com.ifriend.data.networking.responses.AvatarInfoStatus;
import com.ifriend.data.toggle.AnimatedAvatarFeatureToggle;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatus;
import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatusStorage;
import com.ifriend.domain.data.generateAvatar.AvatarInfo;
import com.ifriend.domain.data.generateAvatar.AvatarInfoStorage;
import com.ifriend.domain.data.generateAvatar.AvatarsStorage;
import com.ifriend.domain.data.generateAvatar.FileFormat;
import com.ifriend.domain.data.generateAvatar.GenerateAvatarException;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.data.generateAvatar.NotEnoughNeuronsToGenerateAvatarException;
import com.ifriend.domain.models.avatar.GeneratedAvatar;
import com.ifriend.domain.models.avatar.GeneratedAvatars;
import com.ifriend.domain.models.avatar.VideoAvatar;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.socket.MessagesSourceMessage;
import com.ifriend.domain.storage.AvatarAnimationEnabledStorage;
import com.ifriend.domain.storage.NeuronsCostsStorage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.ResponseBody;
import retrofit2.Response;
/* compiled from: GenerateBotAvatarRepositoryImpl.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 W2\u00020\u0001:\u0001WBm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cJ\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020+H\u0016J\u0019\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010-J\u001f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001f022\u0006\u00103\u001a\u000204H\u0096@ø\u0001\u0000¢\u0006\u0002\u00105J+\u00106\u001a\u0004\u0018\u00010\u001f2\u0006\u00107\u001a\u0002082\u0006\u0010,\u001a\u00020\"2\u0006\u00109\u001a\u00020\"H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010:J%\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0!0<2\u0006\u00109\u001a\u00020=H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010>J\u0011\u0010?\u001a\u00020)H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u0004\u0018\u00010\"H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010@J!\u0010B\u001a\u00020)2\u0006\u00107\u001a\u0002082\u0006\u0010C\u001a\u00020\"H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010DJ+\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u001f2\u0006\u0010J\u001a\u000204H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010KJ#\u0010L\u001a\u0004\u0018\u00010\"2\u0006\u0010G\u001a\u00020H2\u0006\u0010J\u001a\u000204H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u0004\u0018\u00010HH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010@J\u0011\u0010O\u001a\u00020+H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010@J+\u0010P\u001a\u0004\u0018\u00010\"2\u0006\u00107\u001a\u0002082\u0006\u0010,\u001a\u00020\"2\u0006\u00109\u001a\u00020\"H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010:J\u0011\u0010Q\u001a\u00020)H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010@J\u0011\u0010R\u001a\u00020+H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010@J\u0014\u0010S\u001a\u00020)2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\"H\u0002J\u0011\u0010U\u001a\u00020+H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010@J!\u0010V\u001a\u00020+2\u0006\u00107\u001a\u0002082\u0006\u00100\u001a\u00020\"H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010DR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020)0'X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, d2 = {"Lcom/ifriend/data/repository/GenerateBotAvatarRepositoryImpl;", "Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;", "generateBotAvatarApi", "Lcom/ifriend/data/networking/api/GenerateBotAvatarApi;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "avatarsStorage", "Lcom/ifriend/domain/data/generateAvatar/AvatarsStorage;", "avatarInfoStorage", "Lcom/ifriend/domain/data/generateAvatar/AvatarInfoStorage;", "avatarGenerationStatusStorage", "Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatusStorage;", "neuronsCostsStorage", "Lcom/ifriend/domain/storage/NeuronsCostsStorage;", "animatedAvatarFeatureToggle", "Lcom/ifriend/data/toggle/AnimatedAvatarFeatureToggle;", "avatarAnimationEnabledStorage", "Lcom/ifriend/domain/storage/AvatarAnimationEnabledStorage;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/data/networking/api/GenerateBotAvatarApi;Lcom/ifriend/domain/data/BotRepository;Lcom/ifriend/domain/data/AuthDataProvider;Lcom/ifriend/domain/socket/MessagesSource;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/data/Preferences;Lcom/ifriend/domain/data/generateAvatar/AvatarsStorage;Lcom/ifriend/domain/data/generateAvatar/AvatarInfoStorage;Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatusStorage;Lcom/ifriend/domain/storage/NeuronsCostsStorage;Lcom/ifriend/data/toggle/AnimatedAvatarFeatureToggle;Lcom/ifriend/domain/storage/AvatarAnimationEnabledStorage;Lcom/ifriend/common_utils/Logger;)V", "currentGeneratedAvatar", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/domain/models/avatar/GeneratedAvatar;", "generatedAvatarsIds", "", "", "getGenerationStatusJob", "Lkotlinx/coroutines/Job;", "lastDescription", "statuses", "", "Lcom/ifriend/data/networking/api/AvatarGenerationStatusResponse;", "Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatus;", "applyAvatar", "", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "createAvatar", "description", "getCurrentAvatar", "Lkotlinx/coroutines/flow/StateFlow;", "shouldLoad", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGeneratedAvatar", "authData", "Lcom/ifriend/domain/models/profile/user/AuthData;", "imageSize", "(Lcom/ifriend/domain/models/profile/user/AuthData;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGeneratedAvatars", "Lkotlinx/coroutines/flow/Flow;", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGenerationStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastGenerationDescription", "handleGenerationError", "errorGenerationId", "(Lcom/ifriend/domain/models/profile/user/AuthData;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAvatarAnimation", "Lcom/ifriend/domain/models/avatar/VideoAvatar;", "avatarInfoResponse", "Lcom/ifriend/data/networking/responses/AvatarInfoResponse;", "generatedAvatarWithImage", "forceReload", "(Lcom/ifriend/data/networking/responses/AvatarInfoResponse;Lcom/ifriend/domain/models/avatar/GeneratedAvatar;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAvatarImage", "(Lcom/ifriend/data/networking/responses/AvatarInfoResponse;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAvatarInfo", "loadCurrentAvatar", "loadGeneratedAvatar", "loadRemoteGenerationStatus", "onErrorWatched", "onGenerationError", "generationId", "reloadAvatars", "tryCreateAvatar", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GenerateBotAvatarRepositoryImpl implements GenerateBotAvatarRepository {
    public static final Companion Companion = new Companion(null);
    private static final String GENERATION_ID_ERROR_WATCHED = "generationIdErrorWatched";
    private final AnimatedAvatarFeatureToggle animatedAvatarFeatureToggle;
    private final AuthDataProvider authDataProvider;
    private final AvatarAnimationEnabledStorage avatarAnimationEnabledStorage;
    private final AvatarGenerationStatusStorage avatarGenerationStatusStorage;
    private final AvatarInfoStorage avatarInfoStorage;
    private final AvatarsStorage avatarsStorage;
    private final BotRepository botRepository;
    private final CoroutineScope coroutineScope;
    private MutableStateFlow<GeneratedAvatar> currentGeneratedAvatar;
    private final GenerateBotAvatarApi generateBotAvatarApi;
    private MutableStateFlow<List<String>> generatedAvatarsIds;
    private Job getGenerationStatusJob;
    private MutableStateFlow<String> lastDescription;
    private final Logger logger;
    private final MessagesSource messagesSource;
    private final NeuronsCostsStorage neuronsCostsStorage;
    private final Preferences preferences;
    private final Map<AvatarGenerationStatusResponse, AvatarGenerationStatus> statuses;

    /* compiled from: GenerateBotAvatarRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarInfoStatus.values().length];
            try {
                iArr[AvatarInfoStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarInfoStatus.NO_FACE_DETECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvatarInfoStatus.PROCESSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AvatarInfoStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GenerateBotAvatarRepositoryImpl(GenerateBotAvatarApi generateBotAvatarApi, BotRepository botRepository, AuthDataProvider authDataProvider, MessagesSource messagesSource, CoroutineScope coroutineScope, Preferences preferences, AvatarsStorage avatarsStorage, AvatarInfoStorage avatarInfoStorage, AvatarGenerationStatusStorage avatarGenerationStatusStorage, NeuronsCostsStorage neuronsCostsStorage, AnimatedAvatarFeatureToggle animatedAvatarFeatureToggle, AvatarAnimationEnabledStorage avatarAnimationEnabledStorage, Logger logger) {
        Intrinsics.checkNotNullParameter(generateBotAvatarApi, "generateBotAvatarApi");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
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
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.generateBotAvatarApi = generateBotAvatarApi;
        this.botRepository = botRepository;
        this.authDataProvider = authDataProvider;
        this.messagesSource = messagesSource;
        this.coroutineScope = coroutineScope;
        this.preferences = preferences;
        this.avatarsStorage = avatarsStorage;
        this.avatarInfoStorage = avatarInfoStorage;
        this.avatarGenerationStatusStorage = avatarGenerationStatusStorage;
        this.neuronsCostsStorage = neuronsCostsStorage;
        this.animatedAvatarFeatureToggle = animatedAvatarFeatureToggle;
        this.avatarAnimationEnabledStorage = avatarAnimationEnabledStorage;
        this.logger = logger;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(null), 3, null);
        this.currentGeneratedAvatar = StateFlowKt.MutableStateFlow(GeneratedAvatar.Companion.empty(GeneratedAvatar.Status.NOT_LOADED));
        this.lastDescription = StateFlowKt.MutableStateFlow(null);
        this.generatedAvatarsIds = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.statuses = MapsKt.mapOf(TuplesKt.to(AvatarGenerationStatusResponse.PROCESSING, AvatarGenerationStatus.PROCESSING), TuplesKt.to(AvatarGenerationStatusResponse.SUCCESS, AvatarGenerationStatus.SUCCESS), TuplesKt.to(AvatarGenerationStatusResponse.ERROR, AvatarGenerationStatus.ERROR), TuplesKt.to(null, AvatarGenerationStatus.NO_GENERATION));
    }

    /* compiled from: GenerateBotAvatarRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/data/repository/GenerateBotAvatarRepositoryImpl$Companion;", "", "()V", "GENERATION_ID_ERROR_WATCHED", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: GenerateBotAvatarRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$1", f = "GenerateBotAvatarRepositoryImpl.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<MessagesSourceMessage> allMessages = GenerateBotAvatarRepositoryImpl.this.messagesSource.getAllMessages(true);
                this.label = 1;
                if (new Flow<Object>() { // from class: com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$1$invokeSuspend$$inlined$getMessagesOf$default$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", "com/ifriend/domain/socket/MessagesSourceKt$getMessagesOf$$inlined$filterIsInstance$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$1$invokeSuspend$$inlined$getMessagesOf$default$1$2  reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$1$invokeSuspend$$inlined$getMessagesOf$default$1$2", f = "GenerateBotAvatarRepositoryImpl.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                        /* renamed from: com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$1$invokeSuspend$$inlined$getMessagesOf$default$1$2$1  reason: invalid class name */
                        /* loaded from: classes6.dex */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                        /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        if (obj instanceof MessagesSourceMessage.AvatarsGenerated) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else if (i == 1) {
                                        ResultKt.throwOnFailure(obj2);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }.collect(new C01371(GenerateBotAvatarRepositoryImpl.this), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: GenerateBotAvatarRepositoryImpl.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ifriend/domain/socket/MessagesSourceMessage$AvatarsGenerated;", "emit", "(Lcom/ifriend/domain/socket/MessagesSourceMessage$AvatarsGenerated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01371<T> implements FlowCollector {
            final /* synthetic */ GenerateBotAvatarRepositoryImpl this$0;

            C01371(GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl) {
                this.this$0 = generateBotAvatarRepositoryImpl;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00c6 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x012c  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x016e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:60:0x018e  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x01a8 A[RETURN] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(MessagesSourceMessage.AvatarsGenerated avatarsGenerated, Continuation<? super Unit> continuation) {
                GenerateBotAvatarRepositoryImpl$1$1$emit$1 generateBotAvatarRepositoryImpl$1$1$emit$1;
                C01371<T> c01371;
                AvatarGenerationStatusStorage avatarGenerationStatusStorage;
                AvatarGenerationStatus status;
                C01371<T> c013712;
                MessagesSourceMessage.AvatarsGenerated avatarsGenerated2;
                GeneratedAvatars generatedAvatars;
                C01371<T> c013713;
                AuthData authData;
                AuthData authData2;
                Response response;
                AvatarsStorage avatarsStorage;
                MutableStateFlow mutableStateFlow;
                AvatarGenerationResponse avatarGenerationResponse;
                List<String> emptyList;
                if (continuation instanceof GenerateBotAvatarRepositoryImpl$1$1$emit$1) {
                    generateBotAvatarRepositoryImpl$1$1$emit$1 = (GenerateBotAvatarRepositoryImpl$1$1$emit$1) continuation;
                    if ((generateBotAvatarRepositoryImpl$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                        generateBotAvatarRepositoryImpl$1$1$emit$1.label -= Integer.MIN_VALUE;
                        Object obj = generateBotAvatarRepositoryImpl$1$1$emit$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        switch (generateBotAvatarRepositoryImpl$1$1$emit$1.label) {
                            case 0:
                                ResultKt.throwOnFailure(obj);
                                NeuronsCostsStorage neuronsCostsStorage = this.this$0.neuronsCostsStorage;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.L$0 = this;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.L$1 = avatarsGenerated;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.label = 1;
                                if (neuronsCostsStorage.updateCosts(generateBotAvatarRepositoryImpl$1$1$emit$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                c01371 = this;
                                GeneratedAvatars generatedAvatars2 = avatarsGenerated.getGeneratedAvatars();
                                avatarGenerationStatusStorage = c01371.this$0.avatarGenerationStatusStorage;
                                status = generatedAvatars2.getStatus();
                                generateBotAvatarRepositoryImpl$1$1$emit$1.L$0 = c01371;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.L$1 = avatarsGenerated;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.L$2 = generatedAvatars2;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.label = 2;
                                if (avatarGenerationStatusStorage.setStatus(status, generateBotAvatarRepositoryImpl$1$1$emit$1) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                c013712 = c01371;
                                avatarsGenerated2 = avatarsGenerated;
                                generatedAvatars = generatedAvatars2;
                                if (generatedAvatars.getStatus() != AvatarGenerationStatus.SUCCESS) {
                                    AuthDataProvider authDataProvider = c013712.this$0.authDataProvider;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.L$0 = c013712;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.L$1 = avatarsGenerated2;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.L$2 = generatedAvatars;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.label = 5;
                                    obj = authDataProvider.lastAuthData(generateBotAvatarRepositoryImpl$1$1$emit$1);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    authData2 = (AuthData) obj;
                                    if (authData2 != null) {
                                        return Unit.INSTANCE;
                                    }
                                    GenerateBotAvatarApi generateBotAvatarApi = c013712.this$0.generateBotAvatarApi;
                                    String formatted = authData2.getToken().formatted();
                                    String value = authData2.getUserId().getValue();
                                    String avatarGenerationResultId = generatedAvatars.getAvatarGenerationResultId();
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.L$0 = c013712;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.L$1 = avatarsGenerated2;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.L$2 = null;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.label = 6;
                                    obj = generateBotAvatarApi.getGeneration(formatted, value, avatarGenerationResultId, generateBotAvatarRepositoryImpl$1$1$emit$1);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    response = (Response) obj;
                                    avatarsStorage = c013712.this$0.avatarsStorage;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.L$0 = c013712;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.L$1 = avatarsGenerated2;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.L$2 = response;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.label = 7;
                                    if (avatarsStorage.deleteAllGeneratedAvatars(generateBotAvatarRepositoryImpl$1$1$emit$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    c013712.this$0.lastDescription.setValue(avatarsGenerated2.getGeneratedAvatars().getDescription());
                                    mutableStateFlow = c013712.this$0.generatedAvatarsIds;
                                    avatarGenerationResponse = (AvatarGenerationResponse) response.body();
                                    if (avatarGenerationResponse != null || (emptyList = avatarGenerationResponse.getAvatarIds()) == null) {
                                        emptyList = CollectionsKt.emptyList();
                                    }
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.L$0 = null;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.L$1 = null;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.L$2 = null;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.label = 8;
                                    if (mutableStateFlow.emit(emptyList, generateBotAvatarRepositoryImpl$1$1$emit$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    return Unit.INSTANCE;
                                }
                                if (generatedAvatars.getStatus() == AvatarGenerationStatus.ERROR) {
                                    AuthDataProvider authDataProvider2 = c013712.this$0.authDataProvider;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.L$0 = c013712;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.L$1 = generatedAvatars;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.L$2 = null;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.label = 3;
                                    obj = authDataProvider2.lastAuthData(generateBotAvatarRepositoryImpl$1$1$emit$1);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    c013713 = c013712;
                                    authData = (AuthData) obj;
                                    if (authData != null) {
                                        return Unit.INSTANCE;
                                    }
                                    GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl = c013713.this$0;
                                    String avatarGenerationResultId2 = generatedAvatars.getAvatarGenerationResultId();
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.L$0 = null;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.L$1 = null;
                                    generateBotAvatarRepositoryImpl$1$1$emit$1.label = 4;
                                    if (generateBotAvatarRepositoryImpl.handleGenerationError(authData, avatarGenerationResultId2, generateBotAvatarRepositoryImpl$1$1$emit$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                return Unit.INSTANCE;
                            case 1:
                                avatarsGenerated = (MessagesSourceMessage.AvatarsGenerated) generateBotAvatarRepositoryImpl$1$1$emit$1.L$1;
                                c01371 = (C01371) generateBotAvatarRepositoryImpl$1$1$emit$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                GeneratedAvatars generatedAvatars22 = avatarsGenerated.getGeneratedAvatars();
                                avatarGenerationStatusStorage = c01371.this$0.avatarGenerationStatusStorage;
                                status = generatedAvatars22.getStatus();
                                generateBotAvatarRepositoryImpl$1$1$emit$1.L$0 = c01371;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.L$1 = avatarsGenerated;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.L$2 = generatedAvatars22;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.label = 2;
                                if (avatarGenerationStatusStorage.setStatus(status, generateBotAvatarRepositoryImpl$1$1$emit$1) != coroutine_suspended) {
                                }
                                break;
                            case 2:
                                generatedAvatars = (GeneratedAvatars) generateBotAvatarRepositoryImpl$1$1$emit$1.L$2;
                                avatarsGenerated2 = (MessagesSourceMessage.AvatarsGenerated) generateBotAvatarRepositoryImpl$1$1$emit$1.L$1;
                                c013712 = (C01371) generateBotAvatarRepositoryImpl$1$1$emit$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                if (generatedAvatars.getStatus() != AvatarGenerationStatus.SUCCESS) {
                                }
                                break;
                            case 3:
                                generatedAvatars = (GeneratedAvatars) generateBotAvatarRepositoryImpl$1$1$emit$1.L$1;
                                c013713 = (C01371) generateBotAvatarRepositoryImpl$1$1$emit$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                authData = (AuthData) obj;
                                if (authData != null) {
                                }
                                break;
                            case 4:
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            case 5:
                                generatedAvatars = (GeneratedAvatars) generateBotAvatarRepositoryImpl$1$1$emit$1.L$2;
                                avatarsGenerated2 = (MessagesSourceMessage.AvatarsGenerated) generateBotAvatarRepositoryImpl$1$1$emit$1.L$1;
                                c013712 = (C01371) generateBotAvatarRepositoryImpl$1$1$emit$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                authData2 = (AuthData) obj;
                                if (authData2 != null) {
                                }
                                break;
                            case 6:
                                ResultKt.throwOnFailure(obj);
                                c013712 = (C01371) generateBotAvatarRepositoryImpl$1$1$emit$1.L$0;
                                avatarsGenerated2 = (MessagesSourceMessage.AvatarsGenerated) generateBotAvatarRepositoryImpl$1$1$emit$1.L$1;
                                response = (Response) obj;
                                avatarsStorage = c013712.this$0.avatarsStorage;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.L$0 = c013712;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.L$1 = avatarsGenerated2;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.L$2 = response;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.label = 7;
                                if (avatarsStorage.deleteAllGeneratedAvatars(generateBotAvatarRepositoryImpl$1$1$emit$1) == coroutine_suspended) {
                                }
                                c013712.this$0.lastDescription.setValue(avatarsGenerated2.getGeneratedAvatars().getDescription());
                                mutableStateFlow = c013712.this$0.generatedAvatarsIds;
                                avatarGenerationResponse = (AvatarGenerationResponse) response.body();
                                if (avatarGenerationResponse != null) {
                                    break;
                                }
                                emptyList = CollectionsKt.emptyList();
                                generateBotAvatarRepositoryImpl$1$1$emit$1.L$0 = null;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.L$1 = null;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.L$2 = null;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.label = 8;
                                if (mutableStateFlow.emit(emptyList, generateBotAvatarRepositoryImpl$1$1$emit$1) == coroutine_suspended) {
                                }
                                return Unit.INSTANCE;
                            case 7:
                                response = (Response) generateBotAvatarRepositoryImpl$1$1$emit$1.L$2;
                                avatarsGenerated2 = (MessagesSourceMessage.AvatarsGenerated) generateBotAvatarRepositoryImpl$1$1$emit$1.L$1;
                                c013712 = (C01371) generateBotAvatarRepositoryImpl$1$1$emit$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                c013712.this$0.lastDescription.setValue(avatarsGenerated2.getGeneratedAvatars().getDescription());
                                mutableStateFlow = c013712.this$0.generatedAvatarsIds;
                                avatarGenerationResponse = (AvatarGenerationResponse) response.body();
                                if (avatarGenerationResponse != null) {
                                }
                                emptyList = CollectionsKt.emptyList();
                                generateBotAvatarRepositoryImpl$1$1$emit$1.L$0 = null;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.L$1 = null;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.L$2 = null;
                                generateBotAvatarRepositoryImpl$1$1$emit$1.label = 8;
                                if (mutableStateFlow.emit(emptyList, generateBotAvatarRepositoryImpl$1$1$emit$1) == coroutine_suspended) {
                                }
                                return Unit.INSTANCE;
                            case 8:
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                }
                generateBotAvatarRepositoryImpl$1$1$emit$1 = new GenerateBotAvatarRepositoryImpl$1$1$emit$1(this, continuation);
                Object obj2 = generateBotAvatarRepositoryImpl$1$1$emit$1.result;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (generateBotAvatarRepositoryImpl$1$1$emit$1.label) {
                }
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((MessagesSourceMessage.AvatarsGenerated) obj, (Continuation<? super Unit>) continuation);
            }
        }
    }

    /* compiled from: GenerateBotAvatarRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$2", f = "GenerateBotAvatarRepositoryImpl.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<MessagesSourceMessage> allMessages = GenerateBotAvatarRepositoryImpl.this.messagesSource.getAllMessages(true);
                this.label = 1;
                if (FlowKt.collectLatest(new Flow<Object>() { // from class: com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$2$invokeSuspend$$inlined$getMessagesOf$default$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", "com/ifriend/domain/socket/MessagesSourceKt$getMessagesOf$$inlined$filterIsInstance$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$2$invokeSuspend$$inlined$getMessagesOf$default$1$2  reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$2$invokeSuspend$$inlined$getMessagesOf$default$1$2", f = "GenerateBotAvatarRepositoryImpl.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                        /* renamed from: com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$2$invokeSuspend$$inlined$getMessagesOf$default$1$2$1  reason: invalid class name */
                        /* loaded from: classes6.dex */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                        /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        if (obj instanceof MessagesSourceMessage.AvatarAnimationGenerated) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else if (i == 1) {
                                        ResultKt.throwOnFailure(obj2);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }, new AnonymousClass1(GenerateBotAvatarRepositoryImpl.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: GenerateBotAvatarRepositoryImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$AvatarAnimationGenerated;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$2$1", f = "GenerateBotAvatarRepositoryImpl.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<MessagesSourceMessage.AvatarAnimationGenerated, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GenerateBotAvatarRepositoryImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = generateBotAvatarRepositoryImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MessagesSourceMessage.AvatarAnimationGenerated avatarAnimationGenerated, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(avatarAnimationGenerated, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.loadCurrentAvatar(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    @Override // com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createAvatar(String str, Continuation<? super Unit> continuation) {
        GenerateBotAvatarRepositoryImpl$createAvatar$1 generateBotAvatarRepositoryImpl$createAvatar$1;
        int i;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl;
        AuthData authData;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl2;
        try {
            if (continuation instanceof GenerateBotAvatarRepositoryImpl$createAvatar$1) {
                generateBotAvatarRepositoryImpl$createAvatar$1 = (GenerateBotAvatarRepositoryImpl$createAvatar$1) continuation;
                if ((generateBotAvatarRepositoryImpl$createAvatar$1.label & Integer.MIN_VALUE) != 0) {
                    generateBotAvatarRepositoryImpl$createAvatar$1.label -= Integer.MIN_VALUE;
                    Object obj = generateBotAvatarRepositoryImpl$createAvatar$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = generateBotAvatarRepositoryImpl$createAvatar$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        AuthDataProvider authDataProvider = this.authDataProvider;
                        generateBotAvatarRepositoryImpl$createAvatar$1.L$0 = this;
                        generateBotAvatarRepositoryImpl$createAvatar$1.L$1 = str;
                        generateBotAvatarRepositoryImpl$createAvatar$1.label = 1;
                        obj = authDataProvider.lastAuthData(generateBotAvatarRepositoryImpl$createAvatar$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        generateBotAvatarRepositoryImpl = this;
                    } else if (i != 1) {
                        if (i == 2) {
                            generateBotAvatarRepositoryImpl2 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$createAvatar$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            } catch (GenerateAvatarException e) {
                                e = e;
                                Logger.DefaultImpls.log$default(generateBotAvatarRepositoryImpl2.logger, 6, null, "Error while requesting to generate avatar: " + e.getMessage(), 2, null);
                                throw e;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        str = (String) generateBotAvatarRepositoryImpl$createAvatar$1.L$1;
                        generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$createAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    authData = (AuthData) obj;
                    if (authData != null) {
                        throw GenerateAvatarException.INSTANCE;
                    }
                    if (StringsKt.isBlank(str) && generateBotAvatarRepositoryImpl.lastDescription.getValue() == null) {
                        throw GenerateAvatarException.INSTANCE;
                    }
                    try {
                        generateBotAvatarRepositoryImpl$createAvatar$1.L$0 = generateBotAvatarRepositoryImpl;
                        generateBotAvatarRepositoryImpl$createAvatar$1.L$1 = null;
                        generateBotAvatarRepositoryImpl$createAvatar$1.label = 2;
                        if (generateBotAvatarRepositoryImpl.tryCreateAvatar(authData, str, generateBotAvatarRepositoryImpl$createAvatar$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    } catch (GenerateAvatarException e2) {
                        e = e2;
                        generateBotAvatarRepositoryImpl2 = generateBotAvatarRepositoryImpl;
                        Logger.DefaultImpls.log$default(generateBotAvatarRepositoryImpl2.logger, 6, null, "Error while requesting to generate avatar: " + e.getMessage(), 2, null);
                        throw e;
                    }
                }
            }
            if (i != 0) {
            }
            authData = (AuthData) obj;
            if (authData != null) {
            }
        } catch (NotEnoughNeuronsToGenerateAvatarException e3) {
            throw e3;
        }
        generateBotAvatarRepositoryImpl$createAvatar$1 = new GenerateBotAvatarRepositoryImpl$createAvatar$1(this, continuation);
        Object obj2 = generateBotAvatarRepositoryImpl$createAvatar$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = generateBotAvatarRepositoryImpl$createAvatar$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryCreateAvatar(AuthData authData, String str, Continuation<? super Unit> continuation) {
        GenerateBotAvatarRepositoryImpl$tryCreateAvatar$1 generateBotAvatarRepositoryImpl$tryCreateAvatar$1;
        int i;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl;
        GenerateBotAvatarResponse generateBotAvatarResponse;
        AvatarGenerationStatusResponse avatarGenerationStatusResponse;
        if (continuation instanceof GenerateBotAvatarRepositoryImpl$tryCreateAvatar$1) {
            generateBotAvatarRepositoryImpl$tryCreateAvatar$1 = (GenerateBotAvatarRepositoryImpl$tryCreateAvatar$1) continuation;
            if ((generateBotAvatarRepositoryImpl$tryCreateAvatar$1.label & Integer.MIN_VALUE) != 0) {
                generateBotAvatarRepositoryImpl$tryCreateAvatar$1.label -= Integer.MIN_VALUE;
                Object obj = generateBotAvatarRepositoryImpl$tryCreateAvatar$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = generateBotAvatarRepositoryImpl$tryCreateAvatar$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    GenerateBotAvatarApi generateBotAvatarApi = this.generateBotAvatarApi;
                    String formatted = authData.getToken().formatted();
                    String value = authData.getUserId().getValue();
                    if (!(!StringsKt.isBlank(str))) {
                        str = null;
                    }
                    if (str == null && (str = this.lastDescription.getValue()) == null) {
                        str = "";
                    }
                    GenerateBotAvatarRequest generateBotAvatarRequest = new GenerateBotAvatarRequest(str);
                    generateBotAvatarRepositoryImpl$tryCreateAvatar$1.L$0 = this;
                    generateBotAvatarRepositoryImpl$tryCreateAvatar$1.label = 1;
                    obj = generateBotAvatarApi.createAvatar(formatted, value, generateBotAvatarRequest, generateBotAvatarRepositoryImpl$tryCreateAvatar$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    generateBotAvatarRepositoryImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$tryCreateAvatar$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Response response = (Response) obj;
                GenerateBotAvatarRepositoryImpl$tryCreateAvatar$onGenerationError$1 generateBotAvatarRepositoryImpl$tryCreateAvatar$onGenerationError$1 = new GenerateBotAvatarRepositoryImpl$tryCreateAvatar$onGenerationError$1(generateBotAvatarRepositoryImpl, response);
                generateBotAvatarResponse = (GenerateBotAvatarResponse) response.body();
                if (generateBotAvatarResponse != null || (avatarGenerationStatusResponse = generateBotAvatarResponse.getAvatarGenerationStatusResponse()) == null) {
                    throw new IOException();
                }
                if (avatarGenerationStatusResponse == AvatarGenerationStatusResponse.NO_NEURONS) {
                    throw NotEnoughNeuronsToGenerateAvatarException.INSTANCE;
                }
                AvatarGenerationStatus avatarGenerationStatus = generateBotAvatarRepositoryImpl.statuses.get(avatarGenerationStatusResponse);
                if (avatarGenerationStatus == AvatarGenerationStatus.ERROR || avatarGenerationStatus == null) {
                    generateBotAvatarRepositoryImpl$tryCreateAvatar$onGenerationError$1.invoke();
                    throw new KotlinNothingValueException();
                }
                AvatarGenerationStatusStorage avatarGenerationStatusStorage = generateBotAvatarRepositoryImpl.avatarGenerationStatusStorage;
                generateBotAvatarRepositoryImpl$tryCreateAvatar$1.L$0 = null;
                generateBotAvatarRepositoryImpl$tryCreateAvatar$1.label = 2;
                if (avatarGenerationStatusStorage.setStatus(avatarGenerationStatus, generateBotAvatarRepositoryImpl$tryCreateAvatar$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        generateBotAvatarRepositoryImpl$tryCreateAvatar$1 = new GenerateBotAvatarRepositoryImpl$tryCreateAvatar$1(this, continuation);
        Object obj2 = generateBotAvatarRepositoryImpl$tryCreateAvatar$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = generateBotAvatarRepositoryImpl$tryCreateAvatar$1.label;
        if (i != 0) {
        }
        Response response2 = (Response) obj2;
        GenerateBotAvatarRepositoryImpl$tryCreateAvatar$onGenerationError$1 generateBotAvatarRepositoryImpl$tryCreateAvatar$onGenerationError$12 = new GenerateBotAvatarRepositoryImpl$tryCreateAvatar$onGenerationError$1(generateBotAvatarRepositoryImpl, response2);
        generateBotAvatarResponse = (GenerateBotAvatarResponse) response2.body();
        if (generateBotAvatarResponse != null) {
        }
        throw new IOException();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getCurrentAvatar(boolean z, Continuation<? super StateFlow<GeneratedAvatar>> continuation) {
        GenerateBotAvatarRepositoryImpl$getCurrentAvatar$1 generateBotAvatarRepositoryImpl$getCurrentAvatar$1;
        int i;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl;
        if (continuation instanceof GenerateBotAvatarRepositoryImpl$getCurrentAvatar$1) {
            generateBotAvatarRepositoryImpl$getCurrentAvatar$1 = (GenerateBotAvatarRepositoryImpl$getCurrentAvatar$1) continuation;
            if ((generateBotAvatarRepositoryImpl$getCurrentAvatar$1.label & Integer.MIN_VALUE) != 0) {
                generateBotAvatarRepositoryImpl$getCurrentAvatar$1.label -= Integer.MIN_VALUE;
                Object obj = generateBotAvatarRepositoryImpl$getCurrentAvatar$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = generateBotAvatarRepositoryImpl$getCurrentAvatar$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.currentGeneratedAvatar.getValue().isEmpty() && z) {
                        generateBotAvatarRepositoryImpl$getCurrentAvatar$1.L$0 = this;
                        generateBotAvatarRepositoryImpl$getCurrentAvatar$1.label = 1;
                        if (loadCurrentAvatar(generateBotAvatarRepositoryImpl$getCurrentAvatar$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    generateBotAvatarRepositoryImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$getCurrentAvatar$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return generateBotAvatarRepositoryImpl.currentGeneratedAvatar;
            }
        }
        generateBotAvatarRepositoryImpl$getCurrentAvatar$1 = new GenerateBotAvatarRepositoryImpl$getCurrentAvatar$1(this, continuation);
        Object obj2 = generateBotAvatarRepositoryImpl$getCurrentAvatar$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = generateBotAvatarRepositoryImpl$getCurrentAvatar$1.label;
        if (i != 0) {
        }
        return generateBotAvatarRepositoryImpl.currentGeneratedAvatar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    @Override // com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGeneratedAvatars(final int i, Continuation<? super Flow<? extends List<GeneratedAvatar>>> continuation) {
        GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$1 generateBotAvatarRepositoryImpl$getGeneratedAvatars$1;
        int i2;
        final GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl;
        if (continuation instanceof GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$1) {
            generateBotAvatarRepositoryImpl$getGeneratedAvatars$1 = (GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$1) continuation;
            if ((generateBotAvatarRepositoryImpl$getGeneratedAvatars$1.label & Integer.MIN_VALUE) != 0) {
                generateBotAvatarRepositoryImpl$getGeneratedAvatars$1.label -= Integer.MIN_VALUE;
                Object obj = generateBotAvatarRepositoryImpl$getGeneratedAvatars$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = generateBotAvatarRepositoryImpl$getGeneratedAvatars$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthDataProvider authDataProvider = this.authDataProvider;
                    generateBotAvatarRepositoryImpl$getGeneratedAvatars$1.L$0 = this;
                    generateBotAvatarRepositoryImpl$getGeneratedAvatars$1.I$0 = i;
                    generateBotAvatarRepositoryImpl$getGeneratedAvatars$1.label = 1;
                    obj = authDataProvider.lastAuthData(generateBotAvatarRepositoryImpl$getGeneratedAvatars$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    generateBotAvatarRepositoryImpl = this;
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i = generateBotAvatarRepositoryImpl$getGeneratedAvatars$1.I$0;
                    generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$getGeneratedAvatars$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                final AuthData authData = (AuthData) obj;
                final MutableStateFlow<List<String>> mutableStateFlow = generateBotAvatarRepositoryImpl.generatedAvatarsIds;
                return new Flow<List<? extends GeneratedAvatar>>() { // from class: com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends GeneratedAvatar>> flowCollector, Continuation continuation2) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, generateBotAvatarRepositoryImpl, authData, i), continuation2);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$$inlined$map$1$2  reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ AuthData $authData$inlined;
                        final /* synthetic */ int $imageSize$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ GenerateBotAvatarRepositoryImpl this$0;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$$inlined$map$1$2", f = "GenerateBotAvatarRepositoryImpl.kt", i = {}, l = {230, 223}, m = "emit", n = {}, s = {})
                        /* renamed from: com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$$inlined$map$1$2$1  reason: invalid class name */
                        /* loaded from: classes6.dex */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl, AuthData authData, int i) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = generateBotAvatarRepositoryImpl;
                            this.$authData$inlined = authData;
                            this.$imageSize$inlined = i;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
                        /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
                        /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
                        /* JADX WARN: Removed duplicated region for block: B:31:0x00d6 A[RETURN] */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            Object coroutine_suspended;
                            int i;
                            FlowCollector flowCollector;
                            CoroutineScope coroutineScope;
                            Deferred async$default;
                            ArrayList arrayList;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        flowCollector = this.$this_unsafeFlow;
                                        List<String> list = (List) obj;
                                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                        for (String str : list) {
                                            coroutineScope = this.this$0.coroutineScope;
                                            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$2$1$1(this.$authData$inlined, this.this$0, str, this.$imageSize$inlined, null), 3, null);
                                            arrayList2.add(async$default);
                                        }
                                        anonymousClass1.L$0 = flowCollector;
                                        anonymousClass1.label = 1;
                                        obj2 = AwaitKt.awaitAll(arrayList2, anonymousClass1);
                                        if (obj2 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else if (i != 1) {
                                        if (i != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                        return Unit.INSTANCE;
                                    } else {
                                        flowCollector = (FlowCollector) anonymousClass1.L$0;
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    arrayList = new ArrayList();
                                    for (GeneratedAvatar generatedAvatar : (Iterable) obj2) {
                                        if (generatedAvatar != null) {
                                            arrayList.add(generatedAvatar);
                                        }
                                    }
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.label = 2;
                                    if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            arrayList = new ArrayList();
                            while (r1.hasNext()) {
                            }
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                            if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }
        }
        generateBotAvatarRepositoryImpl$getGeneratedAvatars$1 = new GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$1(this, continuation);
        Object obj2 = generateBotAvatarRepositoryImpl$getGeneratedAvatars$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = generateBotAvatarRepositoryImpl$getGeneratedAvatars$1.label;
        if (i2 != 0) {
        }
        final AuthData authData2 = (AuthData) obj2;
        final Flow mutableStateFlow2 = generateBotAvatarRepositoryImpl.generatedAvatarsIds;
        return new Flow<List<? extends GeneratedAvatar>>() { // from class: com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends GeneratedAvatar>> flowCollector, Continuation continuation2) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, generateBotAvatarRepositoryImpl, authData2, i), continuation2);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ AuthData $authData$inlined;
                final /* synthetic */ int $imageSize$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ GenerateBotAvatarRepositoryImpl this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$$inlined$map$1$2", f = "GenerateBotAvatarRepositoryImpl.kt", i = {}, l = {230, 223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl, AuthData authData, int i) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = generateBotAvatarRepositoryImpl;
                    this.$authData$inlined = authData;
                    this.$imageSize$inlined = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00d6 A[RETURN] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object coroutine_suspended;
                    int i;
                    FlowCollector flowCollector;
                    CoroutineScope coroutineScope;
                    Deferred async$default;
                    ArrayList arrayList;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj22 = anonymousClass1.result;
                            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj22);
                                flowCollector = this.$this_unsafeFlow;
                                List<String> list = (List) obj;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                for (String str : list) {
                                    coroutineScope = this.this$0.coroutineScope;
                                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$2$1$1(this.$authData$inlined, this.this$0, str, this.$imageSize$inlined, null), 3, null);
                                    arrayList2.add(async$default);
                                }
                                anonymousClass1.L$0 = flowCollector;
                                anonymousClass1.label = 1;
                                obj22 = AwaitKt.awaitAll(arrayList2, anonymousClass1);
                                if (obj22 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj22);
                                return Unit.INSTANCE;
                            } else {
                                flowCollector = (FlowCollector) anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj22);
                            }
                            arrayList = new ArrayList();
                            for (GeneratedAvatar generatedAvatar : (Iterable) obj22) {
                                if (generatedAvatar != null) {
                                    arrayList.add(generatedAvatar);
                                }
                            }
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                            if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj222 = anonymousClass1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    arrayList = new ArrayList();
                    while (r1.hasNext()) {
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getGeneratedAvatar(AuthData authData, String str, String str2, Continuation<? super GeneratedAvatar> continuation) {
        GenerateBotAvatarRepositoryImpl$getGeneratedAvatar$1 generateBotAvatarRepositoryImpl$getGeneratedAvatar$1;
        int i;
        String str3;
        AuthData authData2;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl;
        String str4;
        String str5 = str;
        if (continuation instanceof GenerateBotAvatarRepositoryImpl$getGeneratedAvatar$1) {
            generateBotAvatarRepositoryImpl$getGeneratedAvatar$1 = (GenerateBotAvatarRepositoryImpl$getGeneratedAvatar$1) continuation;
            if ((generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.label & Integer.MIN_VALUE) != 0) {
                generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.label -= Integer.MIN_VALUE;
                Object obj = generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AvatarsStorage avatarsStorage = this.avatarsStorage;
                    FileFormat fileFormat = FileFormat.PNG;
                    generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.L$0 = this;
                    generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.L$1 = authData;
                    generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.L$2 = str5;
                    str3 = str2;
                    generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.L$3 = str3;
                    generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.label = 1;
                    obj = avatarsStorage.getGeneratedAvatarUri(fileFormat, str5, generateBotAvatarRepositoryImpl$getGeneratedAvatar$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    authData2 = authData;
                    generateBotAvatarRepositoryImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        str5 = (String) generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        str4 = (String) obj;
                        if (str4 == null) {
                            return null;
                        }
                        return new GeneratedAvatar(str5, str4, null, null, 12, null);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    authData2 = (AuthData) generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.L$1;
                    generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    str3 = (String) generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.L$3;
                    str5 = (String) generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.L$2;
                }
                str4 = (String) obj;
                if (str4 == null) {
                    generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.L$0 = str5;
                    generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.L$1 = null;
                    generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.L$2 = null;
                    generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.L$3 = null;
                    generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.label = 2;
                    obj = generateBotAvatarRepositoryImpl.loadGeneratedAvatar(authData2, str5, str3, generateBotAvatarRepositoryImpl$getGeneratedAvatar$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str4 = (String) obj;
                    if (str4 == null) {
                    }
                }
                return new GeneratedAvatar(str5, str4, null, null, 12, null);
            }
        }
        generateBotAvatarRepositoryImpl$getGeneratedAvatar$1 = new GenerateBotAvatarRepositoryImpl$getGeneratedAvatar$1(this, continuation);
        Object obj2 = generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = generateBotAvatarRepositoryImpl$getGeneratedAvatar$1.label;
        if (i != 0) {
        }
        str4 = (String) obj2;
        if (str4 == null) {
        }
        return new GeneratedAvatar(str5, str4, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadGeneratedAvatar(AuthData authData, String str, String str2, Continuation<? super String> continuation) {
        GenerateBotAvatarRepositoryImpl$loadGeneratedAvatar$1 generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1;
        int i;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl;
        ResponseBody responseBody;
        InputStream byteStream;
        try {
            if (continuation instanceof GenerateBotAvatarRepositoryImpl$loadGeneratedAvatar$1) {
                generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1 = (GenerateBotAvatarRepositoryImpl$loadGeneratedAvatar$1) continuation;
                if ((generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1.label & Integer.MIN_VALUE) != 0) {
                    generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1.label -= Integer.MIN_VALUE;
                    Object obj = generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        GenerateBotAvatarApi generateBotAvatarApi = this.generateBotAvatarApi;
                        String formatted = authData.getToken().formatted();
                        String value = authData.getUserId().getValue();
                        generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1.L$0 = this;
                        generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1.L$1 = str;
                        generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1.label = 1;
                        obj = generateBotAvatarApi.getAvatarFile(formatted, value, str, str2, generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        generateBotAvatarRepositoryImpl = this;
                    } else if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return (String) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        str = (String) generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1.L$1;
                        generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    responseBody = (ResponseBody) ((Response) obj).body();
                    if (responseBody == null && (byteStream = responseBody.byteStream()) != null) {
                        AvatarsStorage avatarsStorage = generateBotAvatarRepositoryImpl.avatarsStorage;
                        FileFormat fileFormat = FileFormat.PNG;
                        generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1.L$0 = null;
                        generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1.L$1 = null;
                        generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1.label = 2;
                        obj = avatarsStorage.saveGeneratedAvatar(fileFormat, str, byteStream, generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return (String) obj;
                    }
                }
            }
            if (i != 0) {
            }
            responseBody = (ResponseBody) ((Response) obj).body();
            return responseBody == null ? null : null;
        } catch (Throwable unused) {
            return null;
        }
        generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1 = new GenerateBotAvatarRepositoryImpl$loadGeneratedAvatar$1(this, continuation);
        Object obj2 = generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = generateBotAvatarRepositoryImpl$loadGeneratedAvatar$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0157  */
    @Override // com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object applyAvatar(String str, Continuation<? super Unit> continuation) {
        GenerateBotAvatarRepositoryImpl$applyAvatar$1 generateBotAvatarRepositoryImpl$applyAvatar$1;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl;
        AvatarsStorage avatarsStorage;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl2;
        MutableStateFlow<GeneratedAvatar> mutableStateFlow;
        String str2;
        String str3;
        GeneratedAvatar generatedAvatar;
        String str4;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl3;
        AuthData authData;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl4;
        if (continuation instanceof GenerateBotAvatarRepositoryImpl$applyAvatar$1) {
            generateBotAvatarRepositoryImpl$applyAvatar$1 = (GenerateBotAvatarRepositoryImpl$applyAvatar$1) continuation;
            if ((generateBotAvatarRepositoryImpl$applyAvatar$1.label & Integer.MIN_VALUE) != 0) {
                generateBotAvatarRepositoryImpl$applyAvatar$1.label -= Integer.MIN_VALUE;
                Object obj = generateBotAvatarRepositoryImpl$applyAvatar$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (generateBotAvatarRepositoryImpl$applyAvatar$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        MutableStateFlow<GeneratedAvatar> mutableStateFlow2 = this.currentGeneratedAvatar;
                        GeneratedAvatar generatedAvatar2 = new GeneratedAvatar(str, null, null, null, 12, null);
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$0 = this;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$1 = str;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.label = 1;
                        if (mutableStateFlow2.emit(generatedAvatar2, generateBotAvatarRepositoryImpl$applyAvatar$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        generateBotAvatarRepositoryImpl = this;
                        avatarsStorage = generateBotAvatarRepositoryImpl.avatarsStorage;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$0 = generateBotAvatarRepositoryImpl;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$1 = str;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.label = 2;
                        if (avatarsStorage.updateUserAvatarByGenerated(str, generateBotAvatarRepositoryImpl$applyAvatar$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        generateBotAvatarRepositoryImpl2 = generateBotAvatarRepositoryImpl;
                        mutableStateFlow = generateBotAvatarRepositoryImpl2.currentGeneratedAvatar;
                        AvatarsStorage avatarsStorage2 = generateBotAvatarRepositoryImpl2.avatarsStorage;
                        FileFormat fileFormat = FileFormat.PNG;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$0 = generateBotAvatarRepositoryImpl2;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$1 = str;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$2 = mutableStateFlow;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$3 = str;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.label = 3;
                        obj = avatarsStorage2.getUserAvatarUri(fileFormat, generateBotAvatarRepositoryImpl$applyAvatar$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str;
                        str3 = str2;
                        generatedAvatar = new GeneratedAvatar(str3, (String) obj, null, null, 12, null);
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$0 = generateBotAvatarRepositoryImpl2;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$1 = str2;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$2 = null;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$3 = null;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.label = 4;
                        if (mutableStateFlow.emit(generatedAvatar, generateBotAvatarRepositoryImpl$applyAvatar$1) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str4 = str2;
                        generateBotAvatarRepositoryImpl3 = generateBotAvatarRepositoryImpl2;
                        AuthDataProvider authDataProvider = generateBotAvatarRepositoryImpl3.authDataProvider;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$0 = generateBotAvatarRepositoryImpl3;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$1 = str4;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.label = 5;
                        obj = authDataProvider.lastAuthData(generateBotAvatarRepositoryImpl$applyAvatar$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        authData = (AuthData) obj;
                        if (authData == null) {
                            return Unit.INSTANCE;
                        }
                        GenerateBotAvatarApi generateBotAvatarApi = generateBotAvatarRepositoryImpl3.generateBotAvatarApi;
                        String formatted = authData.getToken().formatted();
                        String value = authData.getUserId().getValue();
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$0 = generateBotAvatarRepositoryImpl3;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$1 = null;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.label = 6;
                        obj = generateBotAvatarApi.applyAvatar(formatted, value, str4, generateBotAvatarRepositoryImpl$applyAvatar$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        generateBotAvatarRepositoryImpl4 = generateBotAvatarRepositoryImpl3;
                        if (((Response) obj).isSuccessful()) {
                            return Unit.INSTANCE;
                        }
                        AvatarsStorage avatarsStorage3 = generateBotAvatarRepositoryImpl4.avatarsStorage;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$0 = generateBotAvatarRepositoryImpl4;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.label = 7;
                        if (avatarsStorage3.deleteUserAvatar(generateBotAvatarRepositoryImpl$applyAvatar$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$0 = null;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.label = 8;
                        if (generateBotAvatarRepositoryImpl4.loadCurrentAvatar(generateBotAvatarRepositoryImpl$applyAvatar$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        str = (String) generateBotAvatarRepositoryImpl$applyAvatar$1.L$1;
                        generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$applyAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        avatarsStorage = generateBotAvatarRepositoryImpl.avatarsStorage;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$0 = generateBotAvatarRepositoryImpl;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$1 = str;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.label = 2;
                        if (avatarsStorage.updateUserAvatarByGenerated(str, generateBotAvatarRepositoryImpl$applyAvatar$1) == coroutine_suspended) {
                        }
                        generateBotAvatarRepositoryImpl2 = generateBotAvatarRepositoryImpl;
                        mutableStateFlow = generateBotAvatarRepositoryImpl2.currentGeneratedAvatar;
                        AvatarsStorage avatarsStorage22 = generateBotAvatarRepositoryImpl2.avatarsStorage;
                        FileFormat fileFormat2 = FileFormat.PNG;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$0 = generateBotAvatarRepositoryImpl2;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$1 = str;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$2 = mutableStateFlow;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$3 = str;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.label = 3;
                        obj = avatarsStorage22.getUserAvatarUri(fileFormat2, generateBotAvatarRepositoryImpl$applyAvatar$1);
                        if (obj == coroutine_suspended) {
                        }
                        break;
                    case 2:
                        str = (String) generateBotAvatarRepositoryImpl$applyAvatar$1.L$1;
                        generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$applyAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        generateBotAvatarRepositoryImpl2 = generateBotAvatarRepositoryImpl;
                        mutableStateFlow = generateBotAvatarRepositoryImpl2.currentGeneratedAvatar;
                        AvatarsStorage avatarsStorage222 = generateBotAvatarRepositoryImpl2.avatarsStorage;
                        FileFormat fileFormat22 = FileFormat.PNG;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$0 = generateBotAvatarRepositoryImpl2;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$1 = str;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$2 = mutableStateFlow;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$3 = str;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.label = 3;
                        obj = avatarsStorage222.getUserAvatarUri(fileFormat22, generateBotAvatarRepositoryImpl$applyAvatar$1);
                        if (obj == coroutine_suspended) {
                        }
                        break;
                    case 3:
                        mutableStateFlow = (MutableStateFlow) generateBotAvatarRepositoryImpl$applyAvatar$1.L$2;
                        str2 = (String) generateBotAvatarRepositoryImpl$applyAvatar$1.L$1;
                        generateBotAvatarRepositoryImpl2 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$applyAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        str3 = (String) generateBotAvatarRepositoryImpl$applyAvatar$1.L$3;
                        generatedAvatar = new GeneratedAvatar(str3, (String) obj, null, null, 12, null);
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$0 = generateBotAvatarRepositoryImpl2;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$1 = str2;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$2 = null;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$3 = null;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.label = 4;
                        if (mutableStateFlow.emit(generatedAvatar, generateBotAvatarRepositoryImpl$applyAvatar$1) != coroutine_suspended) {
                        }
                        break;
                    case 4:
                        str4 = (String) generateBotAvatarRepositoryImpl$applyAvatar$1.L$1;
                        generateBotAvatarRepositoryImpl3 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$applyAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        AuthDataProvider authDataProvider2 = generateBotAvatarRepositoryImpl3.authDataProvider;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$0 = generateBotAvatarRepositoryImpl3;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$1 = str4;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.label = 5;
                        obj = authDataProvider2.lastAuthData(generateBotAvatarRepositoryImpl$applyAvatar$1);
                        if (obj == coroutine_suspended) {
                        }
                        authData = (AuthData) obj;
                        if (authData == null) {
                        }
                        break;
                    case 5:
                        str4 = (String) generateBotAvatarRepositoryImpl$applyAvatar$1.L$1;
                        generateBotAvatarRepositoryImpl3 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$applyAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        authData = (AuthData) obj;
                        if (authData == null) {
                        }
                        break;
                    case 6:
                        generateBotAvatarRepositoryImpl4 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$applyAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (((Response) obj).isSuccessful()) {
                        }
                        break;
                    case 7:
                        generateBotAvatarRepositoryImpl4 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$applyAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        generateBotAvatarRepositoryImpl$applyAvatar$1.L$0 = null;
                        generateBotAvatarRepositoryImpl$applyAvatar$1.label = 8;
                        if (generateBotAvatarRepositoryImpl4.loadCurrentAvatar(generateBotAvatarRepositoryImpl$applyAvatar$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 8:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        generateBotAvatarRepositoryImpl$applyAvatar$1 = new GenerateBotAvatarRepositoryImpl$applyAvatar$1(this, continuation);
        Object obj2 = generateBotAvatarRepositoryImpl$applyAvatar$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (generateBotAvatarRepositoryImpl$applyAvatar$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0113 A[Catch: Exception -> 0x0293, TRY_LEAVE, TryCatch #0 {Exception -> 0x0293, blocks: (B:28:0x00fb, B:35:0x010e, B:37:0x0113), top: B:100:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0222 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadCurrentAvatar(Continuation<? super Unit> continuation) {
        GenerateBotAvatarRepositoryImpl$loadCurrentAvatar$1 generateBotAvatarRepositoryImpl$loadCurrentAvatar$1;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl;
        MutableStateFlow<GeneratedAvatar> mutableStateFlow;
        GeneratedAvatar empty$default;
        AvatarInfoResponse avatarInfoResponse;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl2;
        String str;
        AvatarInfoResponse avatarInfoResponse2;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl3;
        String str2;
        AvatarInfoStorage avatarInfoStorage;
        String str3;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl4;
        AvatarInfo copy$default;
        AvatarInfoResponse avatarInfoResponse3;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl5;
        String str4;
        GeneratedAvatar generatedAvatar;
        MutableStateFlow<GeneratedAvatar> mutableStateFlow2;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl6;
        AvatarInfoResponse avatarInfoResponse4;
        String str5;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl7;
        GeneratedAvatar value;
        AvatarInfoResponse avatarInfoResponse5;
        VideoAvatar videoAvatar;
        VideoAvatar videoAvatar2;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl8;
        GeneratedAvatar generatedAvatar2;
        AvatarInfoStorage avatarInfoStorage2;
        AvatarInfo copy$default2;
        VideoAvatar videoAvatar3;
        GeneratedAvatar generatedAvatar3;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl9;
        MutableStateFlow<GeneratedAvatar> mutableStateFlow3;
        GeneratedAvatar copy$default3;
        if (continuation instanceof GenerateBotAvatarRepositoryImpl$loadCurrentAvatar$1) {
            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1 = (GenerateBotAvatarRepositoryImpl$loadCurrentAvatar$1) continuation;
            if ((generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label & Integer.MIN_VALUE) != 0) {
                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label -= Integer.MIN_VALUE;
                Object obj = generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        try {
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = this;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 1;
                            obj = loadAvatarInfo(generateBotAvatarRepositoryImpl$loadCurrentAvatar$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            generateBotAvatarRepositoryImpl = this;
                            avatarInfoResponse = (AvatarInfoResponse) obj;
                            if (avatarInfoResponse != null) {
                                return Unit.INSTANCE;
                            }
                            String id = avatarInfoResponse.getId();
                            AvatarInfoStorage avatarInfoStorage3 = generateBotAvatarRepositoryImpl.avatarInfoStorage;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = generateBotAvatarRepositoryImpl;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = avatarInfoResponse;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2 = id;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 3;
                            Object currentInfo = avatarInfoStorage3.getCurrentInfo(generateBotAvatarRepositoryImpl$loadCurrentAvatar$1);
                            if (currentInfo == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            generateBotAvatarRepositoryImpl2 = generateBotAvatarRepositoryImpl;
                            str = id;
                            obj = currentInfo;
                            avatarInfoResponse2 = avatarInfoResponse;
                            generateBotAvatarRepositoryImpl3 = generateBotAvatarRepositoryImpl2;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = generateBotAvatarRepositoryImpl3;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = avatarInfoResponse2;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2 = null;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 4;
                            obj = generateBotAvatarRepositoryImpl3.loadAvatarImage(avatarInfoResponse2, !Intrinsics.areEqual(str, ((AvatarInfo) ((StateFlow) obj).getValue()).getImageId()), generateBotAvatarRepositoryImpl$loadCurrentAvatar$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            str2 = (String) obj;
                            if (str2 == null) {
                                return Unit.INSTANCE;
                            }
                            avatarInfoStorage = generateBotAvatarRepositoryImpl3.avatarInfoStorage;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = generateBotAvatarRepositoryImpl3;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = avatarInfoResponse2;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2 = str2;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$3 = avatarInfoStorage;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 5;
                            Object currentInfo2 = avatarInfoStorage.getCurrentInfo(generateBotAvatarRepositoryImpl$loadCurrentAvatar$1);
                            if (currentInfo2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl10 = generateBotAvatarRepositoryImpl3;
                            str3 = str2;
                            obj = currentInfo2;
                            generateBotAvatarRepositoryImpl4 = generateBotAvatarRepositoryImpl10;
                            copy$default = AvatarInfo.copy$default((AvatarInfo) ((StateFlow) obj).getValue(), avatarInfoResponse2.getId(), null, 2, null);
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = generateBotAvatarRepositoryImpl4;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = avatarInfoResponse2;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2 = str3;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$3 = null;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 6;
                            if (avatarInfoStorage.setCurrentInfo(copy$default, generateBotAvatarRepositoryImpl$loadCurrentAvatar$1) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            avatarInfoResponse3 = avatarInfoResponse2;
                            generateBotAvatarRepositoryImpl5 = generateBotAvatarRepositoryImpl4;
                            str4 = str3;
                            generatedAvatar = new GeneratedAvatar(avatarInfoResponse3.getId(), str4, null, null, 12, null);
                            mutableStateFlow2 = generateBotAvatarRepositoryImpl5.currentGeneratedAvatar;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = generateBotAvatarRepositoryImpl5;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = avatarInfoResponse3;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2 = null;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 7;
                            if (mutableStateFlow2.emit(generatedAvatar, generateBotAvatarRepositoryImpl$loadCurrentAvatar$1) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            generateBotAvatarRepositoryImpl6 = generateBotAvatarRepositoryImpl5;
                            AnimatedAvatarFeatureToggle animatedAvatarFeatureToggle = generateBotAvatarRepositoryImpl6.animatedAvatarFeatureToggle;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = generateBotAvatarRepositoryImpl6;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = avatarInfoResponse3;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 8;
                            obj = animatedAvatarFeatureToggle.isEnabled(generateBotAvatarRepositoryImpl$loadCurrentAvatar$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl11 = generateBotAvatarRepositoryImpl6;
                            avatarInfoResponse4 = avatarInfoResponse3;
                            if (((Boolean) ((StateFlow) obj).getValue()).booleanValue()) {
                                String animationId = avatarInfoResponse4.getAnimationId();
                                AvatarInfoStorage avatarInfoStorage4 = generateBotAvatarRepositoryImpl11.avatarInfoStorage;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = generateBotAvatarRepositoryImpl11;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = avatarInfoResponse4;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2 = animationId;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 9;
                                Object currentInfo3 = avatarInfoStorage4.getCurrentInfo(generateBotAvatarRepositoryImpl$loadCurrentAvatar$1);
                                if (currentInfo3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str5 = animationId;
                                obj = currentInfo3;
                                generateBotAvatarRepositoryImpl7 = generateBotAvatarRepositoryImpl11;
                                value = generateBotAvatarRepositoryImpl7.currentGeneratedAvatar.getValue();
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = generateBotAvatarRepositoryImpl7;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = avatarInfoResponse4;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2 = value;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 10;
                                obj = generateBotAvatarRepositoryImpl7.loadAvatarAnimation(avatarInfoResponse4, value, !Intrinsics.areEqual(str5, ((AvatarInfo) ((StateFlow) obj).getValue()).getAnimationId()), generateBotAvatarRepositoryImpl$loadCurrentAvatar$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                avatarInfoResponse5 = avatarInfoResponse4;
                                videoAvatar = (VideoAvatar) obj;
                                if (videoAvatar == null) {
                                    return Unit.INSTANCE;
                                }
                                AvatarInfoStorage avatarInfoStorage5 = generateBotAvatarRepositoryImpl7.avatarInfoStorage;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = generateBotAvatarRepositoryImpl7;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = avatarInfoResponse5;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2 = value;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$3 = videoAvatar;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$4 = avatarInfoStorage5;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 11;
                                Object currentInfo4 = avatarInfoStorage5.getCurrentInfo(generateBotAvatarRepositoryImpl$loadCurrentAvatar$1);
                                if (currentInfo4 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                videoAvatar2 = videoAvatar;
                                obj = currentInfo4;
                                generateBotAvatarRepositoryImpl8 = generateBotAvatarRepositoryImpl7;
                                generatedAvatar2 = value;
                                avatarInfoStorage2 = avatarInfoStorage5;
                                copy$default2 = AvatarInfo.copy$default((AvatarInfo) ((StateFlow) obj).getValue(), null, avatarInfoResponse5.getAnimationId(), 1, null);
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = generateBotAvatarRepositoryImpl8;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = generatedAvatar2;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2 = videoAvatar2;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$3 = null;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$4 = null;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 12;
                                if (avatarInfoStorage2.setCurrentInfo(copy$default2, generateBotAvatarRepositoryImpl$loadCurrentAvatar$1) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                videoAvatar3 = videoAvatar2;
                                generatedAvatar3 = generatedAvatar2;
                                generateBotAvatarRepositoryImpl9 = generateBotAvatarRepositoryImpl8;
                                mutableStateFlow3 = generateBotAvatarRepositoryImpl9.currentGeneratedAvatar;
                                copy$default3 = GeneratedAvatar.copy$default(generatedAvatar3, null, null, videoAvatar3, null, 11, null);
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = null;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = null;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2 = null;
                                generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 13;
                                if (mutableStateFlow3.emit(copy$default3, generateBotAvatarRepositoryImpl$loadCurrentAvatar$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return Unit.INSTANCE;
                            }
                            return Unit.INSTANCE;
                        } catch (Exception unused) {
                            generateBotAvatarRepositoryImpl = this;
                            mutableStateFlow = generateBotAvatarRepositoryImpl.currentGeneratedAvatar;
                            empty$default = GeneratedAvatar.Companion.empty$default(GeneratedAvatar.Companion, null, 1, null);
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = null;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 2;
                            if (mutableStateFlow.emit(empty$default, generateBotAvatarRepositoryImpl$loadCurrentAvatar$1) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                    case 1:
                        generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            avatarInfoResponse = (AvatarInfoResponse) obj;
                            if (avatarInfoResponse != null) {
                            }
                        } catch (Exception unused2) {
                            mutableStateFlow = generateBotAvatarRepositoryImpl.currentGeneratedAvatar;
                            empty$default = GeneratedAvatar.Companion.empty$default(GeneratedAvatar.Companion, null, 1, null);
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = null;
                            generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 2;
                            if (mutableStateFlow.emit(empty$default, generateBotAvatarRepositoryImpl$loadCurrentAvatar$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        break;
                    case 2:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 3:
                        str = (String) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2;
                        avatarInfoResponse = (AvatarInfoResponse) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1;
                        ResultKt.throwOnFailure(obj);
                        generateBotAvatarRepositoryImpl2 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0;
                        avatarInfoResponse2 = avatarInfoResponse;
                        generateBotAvatarRepositoryImpl3 = generateBotAvatarRepositoryImpl2;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = generateBotAvatarRepositoryImpl3;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = avatarInfoResponse2;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2 = null;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 4;
                        obj = generateBotAvatarRepositoryImpl3.loadAvatarImage(avatarInfoResponse2, !Intrinsics.areEqual(str, ((AvatarInfo) ((StateFlow) obj).getValue()).getImageId()), generateBotAvatarRepositoryImpl$loadCurrentAvatar$1);
                        if (obj == coroutine_suspended) {
                        }
                        str2 = (String) obj;
                        if (str2 == null) {
                        }
                        break;
                    case 4:
                        generateBotAvatarRepositoryImpl3 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        avatarInfoResponse2 = (AvatarInfoResponse) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1;
                        str2 = (String) obj;
                        if (str2 == null) {
                        }
                        break;
                    case 5:
                        avatarInfoStorage = (AvatarInfoStorage) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$3;
                        str3 = (String) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2;
                        avatarInfoResponse2 = (AvatarInfoResponse) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1;
                        generateBotAvatarRepositoryImpl4 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        copy$default = AvatarInfo.copy$default((AvatarInfo) ((StateFlow) obj).getValue(), avatarInfoResponse2.getId(), null, 2, null);
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = generateBotAvatarRepositoryImpl4;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = avatarInfoResponse2;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2 = str3;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$3 = null;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 6;
                        if (avatarInfoStorage.setCurrentInfo(copy$default, generateBotAvatarRepositoryImpl$loadCurrentAvatar$1) != coroutine_suspended) {
                        }
                        break;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        str4 = (String) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2;
                        avatarInfoResponse3 = (AvatarInfoResponse) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1;
                        generateBotAvatarRepositoryImpl5 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0;
                        generatedAvatar = new GeneratedAvatar(avatarInfoResponse3.getId(), str4, null, null, 12, null);
                        mutableStateFlow2 = generateBotAvatarRepositoryImpl5.currentGeneratedAvatar;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = generateBotAvatarRepositoryImpl5;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = avatarInfoResponse3;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2 = null;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 7;
                        if (mutableStateFlow2.emit(generatedAvatar, generateBotAvatarRepositoryImpl$loadCurrentAvatar$1) != coroutine_suspended) {
                        }
                        break;
                    case 7:
                        avatarInfoResponse3 = (AvatarInfoResponse) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1;
                        generateBotAvatarRepositoryImpl6 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        AnimatedAvatarFeatureToggle animatedAvatarFeatureToggle2 = generateBotAvatarRepositoryImpl6.animatedAvatarFeatureToggle;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = generateBotAvatarRepositoryImpl6;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = avatarInfoResponse3;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 8;
                        obj = animatedAvatarFeatureToggle2.isEnabled(generateBotAvatarRepositoryImpl$loadCurrentAvatar$1);
                        if (obj == coroutine_suspended) {
                        }
                        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl112 = generateBotAvatarRepositoryImpl6;
                        avatarInfoResponse4 = avatarInfoResponse3;
                        if (((Boolean) ((StateFlow) obj).getValue()).booleanValue()) {
                        }
                        break;
                    case 8:
                        avatarInfoResponse3 = (AvatarInfoResponse) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1;
                        generateBotAvatarRepositoryImpl6 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl1122 = generateBotAvatarRepositoryImpl6;
                        avatarInfoResponse4 = avatarInfoResponse3;
                        if (((Boolean) ((StateFlow) obj).getValue()).booleanValue()) {
                        }
                        break;
                    case 9:
                        str5 = (String) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2;
                        avatarInfoResponse4 = (AvatarInfoResponse) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1;
                        generateBotAvatarRepositoryImpl7 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        value = generateBotAvatarRepositoryImpl7.currentGeneratedAvatar.getValue();
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = generateBotAvatarRepositoryImpl7;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = avatarInfoResponse4;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2 = value;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 10;
                        obj = generateBotAvatarRepositoryImpl7.loadAvatarAnimation(avatarInfoResponse4, value, !Intrinsics.areEqual(str5, ((AvatarInfo) ((StateFlow) obj).getValue()).getAnimationId()), generateBotAvatarRepositoryImpl$loadCurrentAvatar$1);
                        if (obj == coroutine_suspended) {
                        }
                        avatarInfoResponse5 = avatarInfoResponse4;
                        videoAvatar = (VideoAvatar) obj;
                        if (videoAvatar == null) {
                        }
                        break;
                    case 10:
                        value = (GeneratedAvatar) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2;
                        avatarInfoResponse4 = (AvatarInfoResponse) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1;
                        generateBotAvatarRepositoryImpl7 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        avatarInfoResponse5 = avatarInfoResponse4;
                        videoAvatar = (VideoAvatar) obj;
                        if (videoAvatar == null) {
                        }
                        break;
                    case 11:
                        avatarInfoStorage2 = (AvatarInfoStorage) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$4;
                        videoAvatar2 = (VideoAvatar) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$3;
                        generatedAvatar2 = (GeneratedAvatar) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2;
                        avatarInfoResponse5 = (AvatarInfoResponse) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1;
                        generateBotAvatarRepositoryImpl8 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        copy$default2 = AvatarInfo.copy$default((AvatarInfo) ((StateFlow) obj).getValue(), null, avatarInfoResponse5.getAnimationId(), 1, null);
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = generateBotAvatarRepositoryImpl8;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = generatedAvatar2;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2 = videoAvatar2;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$3 = null;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$4 = null;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 12;
                        if (avatarInfoStorage2.setCurrentInfo(copy$default2, generateBotAvatarRepositoryImpl$loadCurrentAvatar$1) != coroutine_suspended) {
                        }
                        break;
                    case 12:
                        generateBotAvatarRepositoryImpl9 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        videoAvatar3 = (VideoAvatar) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2;
                        generatedAvatar3 = (GeneratedAvatar) generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1;
                        mutableStateFlow3 = generateBotAvatarRepositoryImpl9.currentGeneratedAvatar;
                        copy$default3 = GeneratedAvatar.copy$default(generatedAvatar3, null, null, videoAvatar3, null, 11, null);
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$0 = null;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$1 = null;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.L$2 = null;
                        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label = 13;
                        if (mutableStateFlow3.emit(copy$default3, generateBotAvatarRepositoryImpl$loadCurrentAvatar$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 13:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        generateBotAvatarRepositoryImpl$loadCurrentAvatar$1 = new GenerateBotAvatarRepositoryImpl$loadCurrentAvatar$1(this, continuation);
        Object obj2 = generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (generateBotAvatarRepositoryImpl$loadCurrentAvatar$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadAvatarInfo(Continuation<? super AvatarInfoResponse> continuation) {
        GenerateBotAvatarRepositoryImpl$loadAvatarInfo$1 generateBotAvatarRepositoryImpl$loadAvatarInfo$1;
        int i;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl;
        AuthData authData;
        AuthData authData2;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl2;
        Response response;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl3;
        if (continuation instanceof GenerateBotAvatarRepositoryImpl$loadAvatarInfo$1) {
            generateBotAvatarRepositoryImpl$loadAvatarInfo$1 = (GenerateBotAvatarRepositoryImpl$loadAvatarInfo$1) continuation;
            if ((generateBotAvatarRepositoryImpl$loadAvatarInfo$1.label & Integer.MIN_VALUE) != 0) {
                generateBotAvatarRepositoryImpl$loadAvatarInfo$1.label -= Integer.MIN_VALUE;
                Object obj = generateBotAvatarRepositoryImpl$loadAvatarInfo$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = generateBotAvatarRepositoryImpl$loadAvatarInfo$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthDataProvider authDataProvider = this.authDataProvider;
                    generateBotAvatarRepositoryImpl$loadAvatarInfo$1.L$0 = this;
                    generateBotAvatarRepositoryImpl$loadAvatarInfo$1.label = 1;
                    obj = authDataProvider.lastAuthData(generateBotAvatarRepositoryImpl$loadAvatarInfo$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    generateBotAvatarRepositoryImpl = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ResultKt.throwOnFailure(obj);
                                response = (Response) obj;
                                return response.body();
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        authData2 = (AuthData) generateBotAvatarRepositoryImpl$loadAvatarInfo$1.L$1;
                        generateBotAvatarRepositoryImpl3 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadAvatarInfo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        GenerateBotAvatarApi generateBotAvatarApi = generateBotAvatarRepositoryImpl3.generateBotAvatarApi;
                        String formatted = authData2.getToken().formatted();
                        String value = authData2.getUserId().getValue();
                        generateBotAvatarRepositoryImpl$loadAvatarInfo$1.L$0 = null;
                        generateBotAvatarRepositoryImpl$loadAvatarInfo$1.L$1 = null;
                        generateBotAvatarRepositoryImpl$loadAvatarInfo$1.label = 4;
                        obj = generateBotAvatarApi.getAvatarInfo(formatted, value, generateBotAvatarRepositoryImpl$loadAvatarInfo$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        response = (Response) obj;
                        return response.body();
                    }
                    authData2 = (AuthData) generateBotAvatarRepositoryImpl$loadAvatarInfo$1.L$1;
                    generateBotAvatarRepositoryImpl2 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadAvatarInfo$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    response = (Response) obj;
                    if (response.code() == 204) {
                        Bot currentBot = generateBotAvatarRepositoryImpl2.botRepository.getCurrentBot();
                        if ((currentBot != null ? currentBot.getEthnicity() : null) == null) {
                            throw new Exception();
                        }
                        GenerateBotAvatarApi generateBotAvatarApi2 = generateBotAvatarRepositoryImpl2.generateBotAvatarApi;
                        String formatted2 = authData2.getToken().formatted();
                        String value2 = authData2.getUserId().getValue();
                        generateBotAvatarRepositoryImpl$loadAvatarInfo$1.L$0 = generateBotAvatarRepositoryImpl2;
                        generateBotAvatarRepositoryImpl$loadAvatarInfo$1.L$1 = authData2;
                        generateBotAvatarRepositoryImpl$loadAvatarInfo$1.label = 3;
                        if (generateBotAvatarApi2.applyDefaultAvatar(formatted2, value2, generateBotAvatarRepositoryImpl$loadAvatarInfo$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        generateBotAvatarRepositoryImpl3 = generateBotAvatarRepositoryImpl2;
                        GenerateBotAvatarApi generateBotAvatarApi3 = generateBotAvatarRepositoryImpl3.generateBotAvatarApi;
                        String formatted3 = authData2.getToken().formatted();
                        String value3 = authData2.getUserId().getValue();
                        generateBotAvatarRepositoryImpl$loadAvatarInfo$1.L$0 = null;
                        generateBotAvatarRepositoryImpl$loadAvatarInfo$1.L$1 = null;
                        generateBotAvatarRepositoryImpl$loadAvatarInfo$1.label = 4;
                        obj = generateBotAvatarApi3.getAvatarInfo(formatted3, value3, generateBotAvatarRepositoryImpl$loadAvatarInfo$1);
                        if (obj == coroutine_suspended) {
                        }
                        response = (Response) obj;
                    }
                    return response.body();
                } else {
                    generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadAvatarInfo$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                authData = (AuthData) obj;
                if (authData != null) {
                    return null;
                }
                GenerateBotAvatarApi generateBotAvatarApi4 = generateBotAvatarRepositoryImpl.generateBotAvatarApi;
                String formatted4 = authData.getToken().formatted();
                String value4 = authData.getUserId().getValue();
                generateBotAvatarRepositoryImpl$loadAvatarInfo$1.L$0 = generateBotAvatarRepositoryImpl;
                generateBotAvatarRepositoryImpl$loadAvatarInfo$1.L$1 = authData;
                generateBotAvatarRepositoryImpl$loadAvatarInfo$1.label = 2;
                Object avatarInfo = generateBotAvatarApi4.getAvatarInfo(formatted4, value4, generateBotAvatarRepositoryImpl$loadAvatarInfo$1);
                if (avatarInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl4 = generateBotAvatarRepositoryImpl;
                authData2 = authData;
                obj = avatarInfo;
                generateBotAvatarRepositoryImpl2 = generateBotAvatarRepositoryImpl4;
                response = (Response) obj;
                if (response.code() == 204) {
                }
                return response.body();
            }
        }
        generateBotAvatarRepositoryImpl$loadAvatarInfo$1 = new GenerateBotAvatarRepositoryImpl$loadAvatarInfo$1(this, continuation);
        Object obj2 = generateBotAvatarRepositoryImpl$loadAvatarInfo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = generateBotAvatarRepositoryImpl$loadAvatarInfo$1.label;
        if (i != 0) {
        }
        authData = (AuthData) obj2;
        if (authData != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadAvatarImage(AvatarInfoResponse avatarInfoResponse, boolean z, Continuation<? super String> continuation) {
        GenerateBotAvatarRepositoryImpl$loadAvatarImage$1 generateBotAvatarRepositoryImpl$loadAvatarImage$1;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl;
        String str;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl2;
        AvatarInfoResponse avatarInfoResponse2;
        AuthData authData;
        Ref.ObjectRef objectRef;
        String id;
        AuthData authData2;
        Response response;
        AuthData authData3;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl3;
        String str2;
        Ref.ObjectRef objectRef2;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl4;
        Response response2;
        ResponseBody responseBody;
        InputStream byteStream;
        if (continuation instanceof GenerateBotAvatarRepositoryImpl$loadAvatarImage$1) {
            generateBotAvatarRepositoryImpl$loadAvatarImage$1 = (GenerateBotAvatarRepositoryImpl$loadAvatarImage$1) continuation;
            if ((generateBotAvatarRepositoryImpl$loadAvatarImage$1.label & Integer.MIN_VALUE) != 0) {
                generateBotAvatarRepositoryImpl$loadAvatarImage$1.label -= Integer.MIN_VALUE;
                Object obj = generateBotAvatarRepositoryImpl$loadAvatarImage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                boolean z2 = true;
                String str3 = null;
                switch (generateBotAvatarRepositoryImpl$loadAvatarImage$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        if (!z) {
                            AvatarsStorage avatarsStorage = this.avatarsStorage;
                            FileFormat fileFormat = FileFormat.PNG;
                            generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$0 = this;
                            generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$1 = avatarInfoResponse;
                            generateBotAvatarRepositoryImpl$loadAvatarImage$1.label = 1;
                            obj = avatarsStorage.getUserAvatarUri(fileFormat, generateBotAvatarRepositoryImpl$loadAvatarImage$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            generateBotAvatarRepositoryImpl = this;
                            str = (String) obj;
                            if (str == null) {
                                AuthDataProvider authDataProvider = generateBotAvatarRepositoryImpl.authDataProvider;
                                generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$0 = avatarInfoResponse;
                                generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$1 = generateBotAvatarRepositoryImpl;
                                generateBotAvatarRepositoryImpl$loadAvatarImage$1.label = 2;
                                obj = authDataProvider.lastAuthData(generateBotAvatarRepositoryImpl$loadAvatarImage$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                generateBotAvatarRepositoryImpl2 = generateBotAvatarRepositoryImpl;
                                avatarInfoResponse2 = avatarInfoResponse;
                                authData = (AuthData) obj;
                                if (authData != null) {
                                    return null;
                                }
                                objectRef = new Ref.ObjectRef();
                                id = avatarInfoResponse2.getId();
                                generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$0 = generateBotAvatarRepositoryImpl2;
                                generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$1 = objectRef;
                                generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$2 = authData;
                                generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$3 = id;
                                generateBotAvatarRepositoryImpl$loadAvatarImage$1.label = 3;
                                if (loadAvatarImage$lambda$10$tryLoadAvatar(generateBotAvatarRepositoryImpl2, objectRef, authData, id, generateBotAvatarRepositoryImpl$loadAvatarImage$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                authData2 = authData;
                                response = (Response) objectRef.element;
                                if (response != null || response.code() != 404) {
                                    z2 = false;
                                }
                                if (z2) {
                                    GenerateBotAvatarApi generateBotAvatarApi = generateBotAvatarRepositoryImpl2.generateBotAvatarApi;
                                    String formatted = authData2.getToken().formatted();
                                    String value = authData2.getUserId().getValue();
                                    generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$0 = generateBotAvatarRepositoryImpl2;
                                    generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$1 = objectRef;
                                    generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$2 = authData2;
                                    generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$3 = id;
                                    generateBotAvatarRepositoryImpl$loadAvatarImage$1.label = 4;
                                    if (generateBotAvatarApi.applyDefaultAvatar(formatted, value, generateBotAvatarRepositoryImpl$loadAvatarImage$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    authData3 = authData2;
                                    generateBotAvatarRepositoryImpl3 = generateBotAvatarRepositoryImpl2;
                                    str2 = id;
                                    objectRef2 = objectRef;
                                    generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$0 = generateBotAvatarRepositoryImpl3;
                                    generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$1 = objectRef2;
                                    generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$2 = null;
                                    generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$3 = null;
                                    generateBotAvatarRepositoryImpl$loadAvatarImage$1.label = 5;
                                    if (loadAvatarImage$lambda$10$tryLoadAvatar(generateBotAvatarRepositoryImpl3, objectRef2, authData3, str2, generateBotAvatarRepositoryImpl$loadAvatarImage$1) != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    generateBotAvatarRepositoryImpl4 = generateBotAvatarRepositoryImpl3;
                                    objectRef = objectRef2;
                                    generateBotAvatarRepositoryImpl2 = generateBotAvatarRepositoryImpl4;
                                }
                                response2 = (Response) objectRef.element;
                                if (response2 != null && (responseBody = (ResponseBody) response2.body()) != null && (byteStream = responseBody.byteStream()) != null) {
                                    AvatarsStorage avatarsStorage2 = generateBotAvatarRepositoryImpl2.avatarsStorage;
                                    FileFormat fileFormat2 = FileFormat.PNG;
                                    generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$0 = null;
                                    generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$1 = null;
                                    generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$2 = null;
                                    generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$3 = null;
                                    generateBotAvatarRepositoryImpl$loadAvatarImage$1.label = 6;
                                    obj = avatarsStorage2.saveUserAvatar(fileFormat2, byteStream, generateBotAvatarRepositoryImpl$loadAvatarImage$1);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    str3 = (String) obj;
                                }
                                return str3;
                            }
                            return str;
                        }
                        generateBotAvatarRepositoryImpl = this;
                        str = null;
                        if (str == null) {
                        }
                        break;
                    case 1:
                        avatarInfoResponse = (AvatarInfoResponse) generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$1;
                        generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        str = (String) obj;
                        if (str == null) {
                        }
                        break;
                    case 2:
                        avatarInfoResponse2 = (AvatarInfoResponse) generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        generateBotAvatarRepositoryImpl2 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$1;
                        authData = (AuthData) obj;
                        if (authData != null) {
                        }
                        break;
                    case 3:
                        id = (String) generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$3;
                        authData2 = (AuthData) generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$2;
                        objectRef = (Ref.ObjectRef) generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$1;
                        generateBotAvatarRepositoryImpl2 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        response = (Response) objectRef.element;
                        if (response != null) {
                            break;
                        }
                        z2 = false;
                        if (z2) {
                        }
                        response2 = (Response) objectRef.element;
                        if (response2 != null) {
                            AvatarsStorage avatarsStorage22 = generateBotAvatarRepositoryImpl2.avatarsStorage;
                            FileFormat fileFormat22 = FileFormat.PNG;
                            generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$0 = null;
                            generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$1 = null;
                            generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$2 = null;
                            generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$3 = null;
                            generateBotAvatarRepositoryImpl$loadAvatarImage$1.label = 6;
                            obj = avatarsStorage22.saveUserAvatar(fileFormat22, byteStream, generateBotAvatarRepositoryImpl$loadAvatarImage$1);
                            if (obj == coroutine_suspended) {
                            }
                            str3 = (String) obj;
                            break;
                        }
                        return str3;
                    case 4:
                        id = (String) generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$3;
                        objectRef = (Ref.ObjectRef) generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$1;
                        generateBotAvatarRepositoryImpl3 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        authData3 = (AuthData) generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$2;
                        str2 = id;
                        objectRef2 = objectRef;
                        generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$0 = generateBotAvatarRepositoryImpl3;
                        generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$1 = objectRef2;
                        generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$2 = null;
                        generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$3 = null;
                        generateBotAvatarRepositoryImpl$loadAvatarImage$1.label = 5;
                        if (loadAvatarImage$lambda$10$tryLoadAvatar(generateBotAvatarRepositoryImpl3, objectRef2, authData3, str2, generateBotAvatarRepositoryImpl$loadAvatarImage$1) != coroutine_suspended) {
                        }
                        break;
                    case 5:
                        objectRef2 = (Ref.ObjectRef) generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$1;
                        generateBotAvatarRepositoryImpl4 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadAvatarImage$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        objectRef = objectRef2;
                        generateBotAvatarRepositoryImpl2 = generateBotAvatarRepositoryImpl4;
                        response2 = (Response) objectRef.element;
                        if (response2 != null) {
                        }
                        return str3;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        str3 = (String) obj;
                        return str3;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        generateBotAvatarRepositoryImpl$loadAvatarImage$1 = new GenerateBotAvatarRepositoryImpl$loadAvatarImage$1(this, continuation);
        Object obj2 = generateBotAvatarRepositoryImpl$loadAvatarImage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z22 = true;
        String str32 = null;
        switch (generateBotAvatarRepositoryImpl$loadAvatarImage$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e8 -> B:34:0x00ef). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object loadAvatarImage$lambda$10$tryLoadAvatar(GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl, Ref.ObjectRef<Response<ResponseBody>> objectRef, AuthData authData, String str, Continuation<? super Unit> continuation) {
        GenerateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1 generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1;
        int i;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl2;
        String str2;
        GenerateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1 generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$12;
        Object obj;
        int i2;
        int i3;
        Ref.ObjectRef<Response<ResponseBody>> objectRef2;
        AuthData authData2;
        Ref.ObjectRef<Response<ResponseBody>> objectRef3;
        AuthData authData3;
        String str3;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl3;
        Ref.ObjectRef<Response<ResponseBody>> objectRef4;
        int i4;
        int i5;
        T t;
        Response<ResponseBody> response;
        if (continuation instanceof GenerateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1) {
            generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1 = (GenerateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1) continuation;
            if ((generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.label & Integer.MIN_VALUE) != 0) {
                generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.label -= Integer.MIN_VALUE;
                Object obj2 = generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    generateBotAvatarRepositoryImpl2 = generateBotAvatarRepositoryImpl;
                    str2 = str;
                    generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$12 = generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1;
                    obj = coroutine_suspended;
                    i2 = 0;
                    i3 = 2;
                    objectRef2 = objectRef;
                    authData2 = authData;
                    if (i2 < i3) {
                    }
                    return Unit.INSTANCE;
                } else if (i == 1) {
                    i5 = generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.I$1;
                    i4 = generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.I$0;
                    objectRef4 = (Ref.ObjectRef) generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.L$4;
                    generateBotAvatarRepositoryImpl3 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.L$3;
                    str3 = (String) generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.L$2;
                    authData3 = (AuthData) generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.L$1;
                    objectRef3 = (Ref.ObjectRef) generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    t = obj2;
                    objectRef4.element = t;
                    response = objectRef3.element;
                    if (!(response == null && response.isSuccessful())) {
                    }
                    return Unit.INSTANCE;
                } else if (i == 2) {
                    i5 = generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.I$1;
                    int i6 = generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.I$0;
                    String str4 = (String) generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.L$2;
                    ResultKt.throwOnFailure(obj2);
                    generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$12 = generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1;
                    obj = coroutine_suspended;
                    i3 = i6;
                    generateBotAvatarRepositoryImpl2 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.L$3;
                    authData2 = (AuthData) generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.L$1;
                    objectRef2 = (Ref.ObjectRef) generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.L$0;
                    i2 = i5 + 1;
                    str2 = str4;
                    if (i2 < i3) {
                        GenerateBotAvatarApi generateBotAvatarApi = generateBotAvatarRepositoryImpl2.generateBotAvatarApi;
                        String formatted = authData2.getToken().formatted();
                        String value = authData2.getUserId().getValue();
                        generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$12.L$0 = objectRef2;
                        generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$12.L$1 = authData2;
                        generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$12.L$2 = str2;
                        generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$12.L$3 = generateBotAvatarRepositoryImpl2;
                        generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$12.L$4 = objectRef2;
                        generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$12.I$0 = i3;
                        generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$12.I$1 = i2;
                        generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$12.label = 1;
                        int i7 = i3;
                        Object avatarFile = generateBotAvatarApi.getAvatarFile(formatted, value, str2, "1024", generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$12);
                        if (avatarFile == obj) {
                            return obj;
                        }
                        generateBotAvatarRepositoryImpl3 = generateBotAvatarRepositoryImpl2;
                        objectRef4 = objectRef2;
                        objectRef3 = objectRef4;
                        authData3 = authData2;
                        str3 = str2;
                        t = avatarFile;
                        generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1 = generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$12;
                        coroutine_suspended = obj;
                        i5 = i2;
                        i4 = i7;
                        objectRef4.element = t;
                        response = objectRef3.element;
                        if (!(response == null && response.isSuccessful())) {
                            generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.L$0 = objectRef3;
                            generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.L$1 = authData3;
                            generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.L$2 = str3;
                            generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.L$3 = generateBotAvatarRepositoryImpl3;
                            generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.L$4 = null;
                            generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.I$0 = i4;
                            generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.I$1 = i5;
                            generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.label = 2;
                            if (DelayKt.delay(2000L, generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$12 = generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1;
                            obj = coroutine_suspended;
                            generateBotAvatarRepositoryImpl2 = generateBotAvatarRepositoryImpl3;
                            str4 = str3;
                            authData2 = authData3;
                            objectRef2 = objectRef3;
                            i3 = i4;
                            i2 = i5 + 1;
                            str2 = str4;
                            if (i2 < i3) {
                            }
                        }
                    }
                    return Unit.INSTANCE;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1 = new GenerateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1(continuation);
        Object obj22 = generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = generateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadAvatarAnimation(AvatarInfoResponse avatarInfoResponse, GeneratedAvatar generatedAvatar, boolean z, Continuation<? super VideoAvatar> continuation) {
        GenerateBotAvatarRepositoryImpl$loadAvatarAnimation$1 generateBotAvatarRepositoryImpl$loadAvatarAnimation$1;
        int i;
        AvatarInfoResponse avatarInfoResponse2;
        GeneratedAvatar generatedAvatar2;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl;
        VideoAvatar.Generated generated;
        AvatarInfoResponse avatarInfoResponse3;
        GeneratedAvatar generatedAvatar3;
        String str;
        AuthData authData;
        String str2;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl2;
        GeneratedAvatar generatedAvatar4;
        Ref.ObjectRef objectRef;
        Response response;
        ResponseBody responseBody;
        InputStream byteStream;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl3;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl4;
        VideoAvatar.Generated generated2;
        String str3;
        VideoAvatar.Generated generated3;
        if (continuation instanceof GenerateBotAvatarRepositoryImpl$loadAvatarAnimation$1) {
            generateBotAvatarRepositoryImpl$loadAvatarAnimation$1 = (GenerateBotAvatarRepositoryImpl$loadAvatarAnimation$1) continuation;
            if ((generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.label & Integer.MIN_VALUE) != 0) {
                generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.label -= Integer.MIN_VALUE;
                Object obj = generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (z) {
                        avatarInfoResponse2 = avatarInfoResponse;
                        generatedAvatar2 = generatedAvatar;
                        generateBotAvatarRepositoryImpl = this;
                        generated = null;
                        if (generated == null) {
                            return generated;
                        }
                        AuthDataProvider authDataProvider = generateBotAvatarRepositoryImpl.authDataProvider;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$0 = avatarInfoResponse2;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$1 = generatedAvatar2;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$2 = generateBotAvatarRepositoryImpl;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.label = 2;
                        obj = authDataProvider.lastAuthData(generateBotAvatarRepositoryImpl$loadAvatarAnimation$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        GeneratedAvatar generatedAvatar5 = generatedAvatar2;
                        avatarInfoResponse3 = avatarInfoResponse2;
                        generatedAvatar3 = generatedAvatar5;
                        authData = (AuthData) obj;
                        if (authData != null) {
                        }
                    } else {
                        AvatarsStorage avatarsStorage = this.avatarsStorage;
                        FileFormat fileFormat = FileFormat.MP4;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$0 = this;
                        avatarInfoResponse2 = avatarInfoResponse;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$1 = avatarInfoResponse2;
                        generatedAvatar2 = generatedAvatar;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$2 = generatedAvatar2;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.label = 1;
                        obj = avatarsStorage.getUserAvatarUri(fileFormat, generateBotAvatarRepositoryImpl$loadAvatarAnimation$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        generateBotAvatarRepositoryImpl = this;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$2;
                        generatedAvatar3 = (GeneratedAvatar) generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$1;
                        avatarInfoResponse3 = (AvatarInfoResponse) generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        authData = (AuthData) obj;
                        if (authData != null) {
                            return null;
                        }
                        AvatarInfoStatus animationStatus = avatarInfoResponse3.getAnimationStatus();
                        int i2 = animationStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[animationStatus.ordinal()];
                        if (i2 == -1) {
                            str2 = null;
                        } else if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 == 4) {
                                        return VideoAvatar.NotGenerated.INSTANCE;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                return VideoAvatar.Generating.INSTANCE;
                            }
                            return VideoAvatar.NotGenerated.INSTANCE;
                        } else {
                            str2 = avatarInfoResponse3.getAnimationPath();
                        }
                        if (str2 == null) {
                            return null;
                        }
                        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$0 = generatedAvatar3;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$1 = generateBotAvatarRepositoryImpl;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$2 = objectRef2;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.label = 3;
                        if (loadAvatarAnimation$lambda$15$tryLoadAnimation(generateBotAvatarRepositoryImpl, objectRef2, authData, str2, generateBotAvatarRepositoryImpl$loadAvatarAnimation$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        generateBotAvatarRepositoryImpl2 = generateBotAvatarRepositoryImpl;
                        generatedAvatar4 = generatedAvatar3;
                        objectRef = objectRef2;
                        response = (Response) objectRef.element;
                        if (response != null) {
                            if (Intrinsics.areEqual(generatedAvatar4.getImageAvatarUri(), generateBotAvatarRepositoryImpl2.currentGeneratedAvatar.getValue().getImageAvatarUri())) {
                            }
                            generated2 = null;
                            if (generated2 != null) {
                            }
                        }
                        return null;
                    } else if (i == 3) {
                        objectRef = (Ref.ObjectRef) generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$2;
                        generateBotAvatarRepositoryImpl2 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$1;
                        generatedAvatar4 = (GeneratedAvatar) generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        response = (Response) objectRef.element;
                        if (response != null && (responseBody = (ResponseBody) response.body()) != null && (byteStream = responseBody.byteStream()) != null) {
                            if (Intrinsics.areEqual(generatedAvatar4.getImageAvatarUri(), generateBotAvatarRepositoryImpl2.currentGeneratedAvatar.getValue().getImageAvatarUri())) {
                                AvatarsStorage avatarsStorage2 = generateBotAvatarRepositoryImpl2.avatarsStorage;
                                FileFormat fileFormat2 = FileFormat.MP4;
                                generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$0 = generateBotAvatarRepositoryImpl2;
                                generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$1 = null;
                                generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$2 = null;
                                generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.label = 4;
                                if (avatarsStorage2.saveUserAvatar(fileFormat2, byteStream, generateBotAvatarRepositoryImpl$loadAvatarAnimation$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                generateBotAvatarRepositoryImpl3 = generateBotAvatarRepositoryImpl2;
                                AvatarsStorage avatarsStorage3 = generateBotAvatarRepositoryImpl3.avatarsStorage;
                                FileFormat fileFormat3 = FileFormat.MP4;
                                generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$0 = generateBotAvatarRepositoryImpl3;
                                generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.label = 5;
                                obj = avatarsStorage3.getUserAvatarUri(fileFormat3, generateBotAvatarRepositoryImpl$loadAvatarAnimation$1);
                                if (obj != coroutine_suspended) {
                                }
                            }
                            generated2 = null;
                            if (generated2 != null) {
                            }
                        }
                        return null;
                    } else if (i != 4) {
                        if (i == 5) {
                            generateBotAvatarRepositoryImpl4 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            str3 = (String) obj;
                            generateBotAvatarRepositoryImpl4.avatarAnimationEnabledStorage.setEnabled(true);
                            VideoAvatar videoAvatar = generateBotAvatarRepositoryImpl4.currentGeneratedAvatar.getValue().getVideoAvatar();
                            generated3 = !(videoAvatar instanceof VideoAvatar.Generated) ? (VideoAvatar.Generated) videoAvatar : null;
                            if (!Intrinsics.areEqual(generated3 == null ? generated3.getVideoUri() : null, str3)) {
                                if (str3 == null) {
                                    return null;
                                }
                                generated2 = new VideoAvatar.Generated(str3);
                                if (generated2 != null) {
                                    return generated2;
                                }
                                return null;
                            }
                            generated2 = null;
                            if (generated2 != null) {
                            }
                            return null;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        generateBotAvatarRepositoryImpl3 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        AvatarsStorage avatarsStorage32 = generateBotAvatarRepositoryImpl3.avatarsStorage;
                        FileFormat fileFormat32 = FileFormat.MP4;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$0 = generateBotAvatarRepositoryImpl3;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.label = 5;
                        obj = avatarsStorage32.getUserAvatarUri(fileFormat32, generateBotAvatarRepositoryImpl$loadAvatarAnimation$1);
                        if (obj != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        generateBotAvatarRepositoryImpl4 = generateBotAvatarRepositoryImpl3;
                        str3 = (String) obj;
                        generateBotAvatarRepositoryImpl4.avatarAnimationEnabledStorage.setEnabled(true);
                        VideoAvatar videoAvatar2 = generateBotAvatarRepositoryImpl4.currentGeneratedAvatar.getValue().getVideoAvatar();
                        if (!(videoAvatar2 instanceof VideoAvatar.Generated)) {
                        }
                        if (!Intrinsics.areEqual(generated3 == null ? generated3.getVideoUri() : null, str3)) {
                        }
                        generated2 = null;
                        if (generated2 != null) {
                        }
                        return null;
                    }
                } else {
                    avatarInfoResponse2 = (AvatarInfoResponse) generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$1;
                    GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl5 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    generatedAvatar2 = (GeneratedAvatar) generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.L$2;
                    generateBotAvatarRepositoryImpl = generateBotAvatarRepositoryImpl5;
                }
                str = (String) obj;
                if (str != null) {
                    generated = new VideoAvatar.Generated(str);
                    if (generated == null) {
                    }
                }
                generated = null;
                if (generated == null) {
                }
            }
        }
        generateBotAvatarRepositoryImpl$loadAvatarAnimation$1 = new GenerateBotAvatarRepositoryImpl$loadAvatarAnimation$1(this, continuation);
        Object obj2 = generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = generateBotAvatarRepositoryImpl$loadAvatarAnimation$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        generated = null;
        if (generated == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c8 -> B:34:0x00cd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object loadAvatarAnimation$lambda$15$tryLoadAnimation(GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl, Ref.ObjectRef<Response<ResponseBody>> objectRef, AuthData authData, String str, Continuation<? super Unit> continuation) {
        GenerateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1 generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1;
        int i;
        int i2;
        int i3;
        T t;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl2;
        Ref.ObjectRef<Response<ResponseBody>> objectRef2;
        int i4;
        int i5;
        Ref.ObjectRef<Response<ResponseBody>> objectRef3;
        AuthData authData2;
        String str2;
        Response<ResponseBody> response;
        if (continuation instanceof GenerateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1) {
            generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1 = (GenerateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1) continuation;
            if ((generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.label & Integer.MIN_VALUE) != 0) {
                generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.label -= Integer.MIN_VALUE;
                Object obj = generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    i2 = 3;
                    i3 = 0;
                    if (i3 < i2) {
                    }
                    return Unit.INSTANCE;
                } else if (i == 1) {
                    i5 = generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.I$1;
                    i4 = generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.I$0;
                    objectRef2 = (Ref.ObjectRef) generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$4;
                    generateBotAvatarRepositoryImpl2 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$3;
                    str2 = (String) generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$2;
                    authData2 = (AuthData) generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$1;
                    objectRef3 = (Ref.ObjectRef) generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    t = obj;
                    objectRef2.element = t;
                    response = objectRef3.element;
                    if (!(response == null && response.isSuccessful())) {
                    }
                    return Unit.INSTANCE;
                } else if (i == 2) {
                    i5 = generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.I$1;
                    int i6 = generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.I$0;
                    GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl3 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$3;
                    str = (String) generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$2;
                    AuthData authData3 = (AuthData) generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$1;
                    ResultKt.throwOnFailure(obj);
                    i2 = i6;
                    objectRef = (Ref.ObjectRef) generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$0;
                    AuthData authData4 = authData3;
                    i3 = i5 + 1;
                    generateBotAvatarRepositoryImpl = generateBotAvatarRepositoryImpl3;
                    authData = authData4;
                    if (i3 < i2) {
                        GenerateBotAvatarApi generateBotAvatarApi = generateBotAvatarRepositoryImpl.generateBotAvatarApi;
                        String formatted = authData.getToken().formatted();
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$0 = objectRef;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$1 = authData;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$2 = str;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$3 = generateBotAvatarRepositoryImpl;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$4 = objectRef;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.I$0 = i2;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.I$1 = i3;
                        generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.label = 1;
                        Object avatarAnimationFile = generateBotAvatarApi.getAvatarAnimationFile(formatted, str, generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1);
                        if (avatarAnimationFile == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef3 = objectRef;
                        i4 = i2;
                        t = avatarAnimationFile;
                        authData2 = authData;
                        objectRef2 = objectRef3;
                        String str3 = str;
                        generateBotAvatarRepositoryImpl2 = generateBotAvatarRepositoryImpl;
                        i5 = i3;
                        str2 = str3;
                        objectRef2.element = t;
                        response = objectRef3.element;
                        if (!(response == null && response.isSuccessful())) {
                            generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$0 = objectRef3;
                            generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$1 = authData2;
                            generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$2 = str2;
                            generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$3 = generateBotAvatarRepositoryImpl2;
                            generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.L$4 = null;
                            generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.I$0 = i4;
                            generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.I$1 = i5;
                            generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.label = 2;
                            if (DelayKt.delay(2000L, generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i2 = i4;
                            generateBotAvatarRepositoryImpl3 = generateBotAvatarRepositoryImpl2;
                            str = str2;
                            authData3 = authData2;
                            objectRef = objectRef3;
                            AuthData authData42 = authData3;
                            i3 = i5 + 1;
                            generateBotAvatarRepositoryImpl = generateBotAvatarRepositoryImpl3;
                            authData = authData42;
                            if (i3 < i2) {
                            }
                        }
                    }
                    return Unit.INSTANCE;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1 = new GenerateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1(continuation);
        Object obj2 = generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = generateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.ifriend.domain.data.generateAvatar.AvatarGenerationStatus] */
    @Override // com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGenerationStatus(Continuation<? super AvatarGenerationStatus> continuation) {
        GenerateBotAvatarRepositoryImpl$getGenerationStatus$1 generateBotAvatarRepositoryImpl$getGenerationStatus$1;
        int i;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl;
        Ref.ObjectRef objectRef;
        Job launch$default;
        Ref.ObjectRef objectRef2;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl2;
        if (continuation instanceof GenerateBotAvatarRepositoryImpl$getGenerationStatus$1) {
            generateBotAvatarRepositoryImpl$getGenerationStatus$1 = (GenerateBotAvatarRepositoryImpl$getGenerationStatus$1) continuation;
            if ((generateBotAvatarRepositoryImpl$getGenerationStatus$1.label & Integer.MIN_VALUE) != 0) {
                generateBotAvatarRepositoryImpl$getGenerationStatus$1.label -= Integer.MIN_VALUE;
                Object obj = generateBotAvatarRepositoryImpl$getGenerationStatus$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = generateBotAvatarRepositoryImpl$getGenerationStatus$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Job job = this.getGenerationStatusJob;
                    if (job != null) {
                        generateBotAvatarRepositoryImpl$getGenerationStatus$1.L$0 = this;
                        generateBotAvatarRepositoryImpl$getGenerationStatus$1.label = 1;
                        if (job.join(generateBotAvatarRepositoryImpl$getGenerationStatus$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    generateBotAvatarRepositoryImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        objectRef2 = (Ref.ObjectRef) generateBotAvatarRepositoryImpl$getGenerationStatus$1.L$1;
                        generateBotAvatarRepositoryImpl2 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$getGenerationStatus$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        generateBotAvatarRepositoryImpl = generateBotAvatarRepositoryImpl2;
                        objectRef = objectRef2;
                        generateBotAvatarRepositoryImpl.getGenerationStatusJob = null;
                        return objectRef.element;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$getGenerationStatus$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                objectRef = new Ref.ObjectRef();
                objectRef.element = AvatarGenerationStatus.NO_GENERATION;
                launch$default = BuildersKt__Builders_commonKt.launch$default(generateBotAvatarRepositoryImpl.coroutineScope, null, null, new GenerateBotAvatarRepositoryImpl$getGenerationStatus$2(generateBotAvatarRepositoryImpl, objectRef, null), 3, null);
                generateBotAvatarRepositoryImpl.getGenerationStatusJob = launch$default;
                if (launch$default != null) {
                    generateBotAvatarRepositoryImpl$getGenerationStatus$1.L$0 = generateBotAvatarRepositoryImpl;
                    generateBotAvatarRepositoryImpl$getGenerationStatus$1.L$1 = objectRef;
                    generateBotAvatarRepositoryImpl$getGenerationStatus$1.label = 2;
                    if (launch$default.join(generateBotAvatarRepositoryImpl$getGenerationStatus$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef;
                    generateBotAvatarRepositoryImpl2 = generateBotAvatarRepositoryImpl;
                    generateBotAvatarRepositoryImpl = generateBotAvatarRepositoryImpl2;
                    objectRef = objectRef2;
                }
                generateBotAvatarRepositoryImpl.getGenerationStatusJob = null;
                return objectRef.element;
            }
        }
        generateBotAvatarRepositoryImpl$getGenerationStatus$1 = new GenerateBotAvatarRepositoryImpl$getGenerationStatus$1(this, continuation);
        Object obj2 = generateBotAvatarRepositoryImpl$getGenerationStatus$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = generateBotAvatarRepositoryImpl$getGenerationStatus$1.label;
        if (i != 0) {
        }
        objectRef = new Ref.ObjectRef();
        objectRef.element = AvatarGenerationStatus.NO_GENERATION;
        launch$default = BuildersKt__Builders_commonKt.launch$default(generateBotAvatarRepositoryImpl.coroutineScope, null, null, new GenerateBotAvatarRepositoryImpl$getGenerationStatus$2(generateBotAvatarRepositoryImpl, objectRef, null), 3, null);
        generateBotAvatarRepositoryImpl.getGenerationStatusJob = launch$default;
        if (launch$default != null) {
        }
        generateBotAvatarRepositoryImpl.getGenerationStatusJob = null;
        return objectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[Catch: Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:12:0x002b, B:30:0x008b, B:32:0x0095, B:35:0x009f, B:37:0x00a5, B:41:0x00ac, B:17:0x003b, B:24:0x0050, B:27:0x0055, B:20:0x0042), top: B:44:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[Catch: Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:12:0x002b, B:30:0x008b, B:32:0x0095, B:35:0x009f, B:37:0x00a5, B:41:0x00ac, B:17:0x003b, B:24:0x0050, B:27:0x0055, B:20:0x0042), top: B:44:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f A[Catch: Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:12:0x002b, B:30:0x008b, B:32:0x0095, B:35:0x009f, B:37:0x00a5, B:41:0x00ac, B:17:0x003b, B:24:0x0050, B:27:0x0055, B:20:0x0042), top: B:44:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    @Override // com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getLastGenerationDescription(Continuation<? super String> continuation) {
        GenerateBotAvatarRepositoryImpl$getLastGenerationDescription$1 generateBotAvatarRepositoryImpl$getLastGenerationDescription$1;
        int i;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl;
        AuthData authData;
        AvatarGenerationResponse avatarGenerationResponse;
        try {
            if (continuation instanceof GenerateBotAvatarRepositoryImpl$getLastGenerationDescription$1) {
                generateBotAvatarRepositoryImpl$getLastGenerationDescription$1 = (GenerateBotAvatarRepositoryImpl$getLastGenerationDescription$1) continuation;
                if ((generateBotAvatarRepositoryImpl$getLastGenerationDescription$1.label & Integer.MIN_VALUE) != 0) {
                    generateBotAvatarRepositoryImpl$getLastGenerationDescription$1.label -= Integer.MIN_VALUE;
                    GenerateBotAvatarRepositoryImpl$getLastGenerationDescription$1 generateBotAvatarRepositoryImpl$getLastGenerationDescription$12 = generateBotAvatarRepositoryImpl$getLastGenerationDescription$1;
                    Object obj = generateBotAvatarRepositoryImpl$getLastGenerationDescription$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = generateBotAvatarRepositoryImpl$getLastGenerationDescription$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        AuthDataProvider authDataProvider = this.authDataProvider;
                        generateBotAvatarRepositoryImpl$getLastGenerationDescription$12.L$0 = this;
                        generateBotAvatarRepositoryImpl$getLastGenerationDescription$12.label = 1;
                        obj = authDataProvider.lastAuthData(generateBotAvatarRepositoryImpl$getLastGenerationDescription$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        generateBotAvatarRepositoryImpl = this;
                    } else if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            List list = (List) ((Response) obj).body();
                            avatarGenerationResponse = list == null ? (AvatarGenerationResponse) CollectionsKt.firstOrNull((List<? extends Object>) list) : null;
                            if ((avatarGenerationResponse == null ? avatarGenerationResponse.getStatus() : null) == AvatarGenerationStatusResponse.ERROR && avatarGenerationResponse != null) {
                                return avatarGenerationResponse.getDescription();
                            }
                            return null;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$getLastGenerationDescription$12.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    authData = (AuthData) obj;
                    if (authData != null) {
                        return null;
                    }
                    GenerateBotAvatarApi generateBotAvatarApi = generateBotAvatarRepositoryImpl.generateBotAvatarApi;
                    String formatted = authData.getToken().formatted();
                    String value = authData.getUserId().getValue();
                    Boolean boxBoolean = Boxing.boxBoolean(true);
                    Integer boxInt = Boxing.boxInt(1);
                    Integer boxInt2 = Boxing.boxInt(0);
                    generateBotAvatarRepositoryImpl$getLastGenerationDescription$12.L$0 = null;
                    generateBotAvatarRepositoryImpl$getLastGenerationDescription$12.label = 2;
                    obj = GenerateBotAvatarApi.DefaultImpls.getGenerations$default(generateBotAvatarApi, formatted, value, boxBoolean, boxInt, boxInt2, null, generateBotAvatarRepositoryImpl$getLastGenerationDescription$12, 32, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    List list2 = (List) ((Response) obj).body();
                    if (list2 == null) {
                    }
                    if ((avatarGenerationResponse == null ? avatarGenerationResponse.getStatus() : null) == AvatarGenerationStatusResponse.ERROR) {
                        return null;
                    }
                    return avatarGenerationResponse.getDescription();
                }
            }
            if (i != 0) {
            }
            authData = (AuthData) obj;
            if (authData != null) {
            }
        } catch (Exception unused) {
            return null;
        }
        generateBotAvatarRepositoryImpl$getLastGenerationDescription$1 = new GenerateBotAvatarRepositoryImpl$getLastGenerationDescription$1(this, continuation);
        GenerateBotAvatarRepositoryImpl$getLastGenerationDescription$1 generateBotAvatarRepositoryImpl$getLastGenerationDescription$122 = generateBotAvatarRepositoryImpl$getLastGenerationDescription$1;
        Object obj2 = generateBotAvatarRepositoryImpl$getLastGenerationDescription$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = generateBotAvatarRepositoryImpl$getLastGenerationDescription$122.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|(5:(1:(2:62|(1:(8:65|66|67|38|39|(1:41)(1:48)|42|(2:44|45)(1:47))(2:68|69))(3:70|71|26))(10:10|11|12|13|14|15|(1:17)(1:56)|(1:19)(1:55)|20|(2:22|(1:24)(1:26))(6:27|(1:29)(1:54)|30|(1:53)|34|(1:36)(6:37|38|39|(0)(0)|42|(0)(0)))))(4:73|74|75|76)|60|61|51|52)(4:98|99|100|(1:102)(1:103))|77|78|(3:90|91|92)(5:80|81|82|83|(1:85)(7:86|14|15|(0)(0)|(0)(0)|20|(0)(0)))))|106|6|(0)(0)|77|78|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014b, code lost:
        r14 = null;
        r1 = 1;
        r2 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c A[Catch: Exception -> 0x014b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x014b, blocks: (B:36:0x0081, B:41:0x008c), top: B:94:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de A[Catch: Exception -> 0x0145, TryCatch #6 {Exception -> 0x0145, blocks: (B:47:0x00d4, B:49:0x00de, B:52:0x00e9, B:54:0x00ef, B:56:0x00f3, B:60:0x0105, B:62:0x0109, B:64:0x010f, B:66:0x0116, B:69:0x0120, B:68:0x011c), top: B:102:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9 A[Catch: Exception -> 0x0145, TryCatch #6 {Exception -> 0x0145, blocks: (B:47:0x00d4, B:49:0x00de, B:52:0x00e9, B:54:0x00ef, B:56:0x00f3, B:60:0x0105, B:62:0x0109, B:64:0x010f, B:66:0x0116, B:69:0x0120, B:68:0x011c), top: B:102:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3 A[Catch: Exception -> 0x0145, TryCatch #6 {Exception -> 0x0145, blocks: (B:47:0x00d4, B:49:0x00de, B:52:0x00e9, B:54:0x00ef, B:56:0x00f3, B:60:0x0105, B:62:0x0109, B:64:0x010f, B:66:0x0116, B:69:0x0120, B:68:0x011c), top: B:102:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105 A[Catch: Exception -> 0x0145, TryCatch #6 {Exception -> 0x0145, blocks: (B:47:0x00d4, B:49:0x00de, B:52:0x00e9, B:54:0x00ef, B:56:0x00f3, B:60:0x0105, B:62:0x0109, B:64:0x010f, B:66:0x0116, B:69:0x0120, B:68:0x011c), top: B:102:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0134 A[Catch: Exception -> 0x0146, TryCatch #5 {Exception -> 0x0146, blocks: (B:73:0x0130, B:75:0x0134, B:77:0x013a, B:79:0x0142), top: B:100:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0142 A[Catch: Exception -> 0x0146, TRY_LEAVE, TryCatch #5 {Exception -> 0x0146, blocks: (B:73:0x0130, B:75:0x0134, B:77:0x013a, B:79:0x0142), top: B:100:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadRemoteGenerationStatus(Continuation<? super AvatarGenerationStatus> continuation) {
        GenerateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1 generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1;
        int i;
        String str;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl2;
        int i2;
        AuthData authData;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl3;
        AuthData authData2;
        AvatarGenerationResponse avatarGenerationResponse;
        AvatarGenerationResponse avatarGenerationResponse2;
        List<String> emptyList;
        if (continuation instanceof GenerateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1) {
            GenerateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1 generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$12 = (GenerateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1) continuation;
            if ((generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$12.label & Integer.MIN_VALUE) != 0) {
                generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$12.label -= Integer.MIN_VALUE;
                generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1 = generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$12;
                Object obj = generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        AuthDataProvider authDataProvider = this.authDataProvider;
                        generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.L$0 = this;
                        generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.label = 1;
                        obj = authDataProvider.lastAuthData(generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        generateBotAvatarRepositoryImpl2 = this;
                    } catch (Exception unused) {
                        str = null;
                        generateBotAvatarRepositoryImpl = this;
                    }
                } else {
                    if (i == 1) {
                        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl4 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            generateBotAvatarRepositoryImpl2 = generateBotAvatarRepositoryImpl4;
                        } catch (Exception unused2) {
                            generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1 = generateBotAvatarRepositoryImpl4;
                        }
                    } else if (i != 2) {
                        try {
                            if (i == 3) {
                                GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl5 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.L$0;
                                ResultKt.throwOnFailure(obj);
                            } else if (i == 4) {
                                avatarGenerationResponse = (AvatarGenerationResponse) generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.L$1;
                                generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                str = null;
                                try {
                                    AvatarGenerationStatus avatarGenerationStatus = generateBotAvatarRepositoryImpl.statuses.get(avatarGenerationResponse == null ? avatarGenerationResponse.getStatus() : str);
                                    return avatarGenerationStatus != null ? AvatarGenerationStatus.NO_GENERATION : avatarGenerationStatus;
                                } catch (Exception unused3) {
                                    i2 = 1;
                                    return onGenerationError$default(generateBotAvatarRepositoryImpl, str, i2, str);
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } catch (Exception unused4) {
                        }
                    } else {
                        authData2 = (AuthData) generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.L$1;
                        generateBotAvatarRepositoryImpl3 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            str = null;
                            try {
                                List list = (List) ((Response) obj).body();
                                avatarGenerationResponse2 = list == null ? (AvatarGenerationResponse) CollectionsKt.firstOrNull((List<? extends Object>) list) : str;
                                if ((avatarGenerationResponse2 == 0 ? avatarGenerationResponse2.getStatus() : str) != AvatarGenerationStatusResponse.ERROR) {
                                    String id = avatarGenerationResponse2.getId();
                                    generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.L$0 = generateBotAvatarRepositoryImpl3;
                                    generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.L$1 = str;
                                    generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.label = 3;
                                    obj = generateBotAvatarRepositoryImpl3.handleGenerationError(authData2, id, generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1);
                                    return obj == coroutine_suspended ? coroutine_suspended : obj;
                                }
                                generateBotAvatarRepositoryImpl3.lastDescription.setValue(avatarGenerationResponse2 != 0 ? avatarGenerationResponse2.getDescription() : str);
                                MutableStateFlow<List<String>> mutableStateFlow = generateBotAvatarRepositoryImpl3.generatedAvatarsIds;
                                if (avatarGenerationResponse2 == 0 || (emptyList = avatarGenerationResponse2.getAvatarIds()) == null) {
                                    emptyList = CollectionsKt.emptyList();
                                }
                                generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.L$0 = generateBotAvatarRepositoryImpl3;
                                generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.L$1 = avatarGenerationResponse2;
                                generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.label = 4;
                                if (mutableStateFlow.emit(emptyList, generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                generateBotAvatarRepositoryImpl = generateBotAvatarRepositoryImpl3;
                                avatarGenerationResponse = avatarGenerationResponse2;
                                AvatarGenerationStatus avatarGenerationStatus2 = generateBotAvatarRepositoryImpl.statuses.get(avatarGenerationResponse == null ? avatarGenerationResponse.getStatus() : str);
                                if (avatarGenerationStatus2 != null) {
                                }
                            } catch (Exception unused5) {
                                generateBotAvatarRepositoryImpl = generateBotAvatarRepositoryImpl3;
                                i2 = 1;
                                return onGenerationError$default(generateBotAvatarRepositoryImpl, str, i2, str);
                            }
                        } catch (Exception unused6) {
                            generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1 = generateBotAvatarRepositoryImpl3;
                        }
                    }
                    str = null;
                    generateBotAvatarRepositoryImpl = generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1;
                    i2 = 1;
                    return onGenerationError$default(generateBotAvatarRepositoryImpl, str, i2, str);
                }
                authData = (AuthData) obj;
                if (authData != null) {
                    try {
                        return onGenerationError$default(generateBotAvatarRepositoryImpl2, null, 1, null);
                    } catch (Exception unused7) {
                        generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1 = generateBotAvatarRepositoryImpl2;
                    }
                } else {
                    GenerateBotAvatarApi generateBotAvatarApi = generateBotAvatarRepositoryImpl2.generateBotAvatarApi;
                    String formatted = authData.getToken().formatted();
                    String value = authData.getUserId().getValue();
                    Boolean boxBoolean = Boxing.boxBoolean(true);
                    Integer boxInt = Boxing.boxInt(1);
                    Integer boxInt2 = Boxing.boxInt(0);
                    generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.L$0 = generateBotAvatarRepositoryImpl2;
                    generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.L$1 = authData;
                    generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.label = 2;
                    GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl6 = generateBotAvatarRepositoryImpl2;
                    str = null;
                    try {
                        Object generations$default = GenerateBotAvatarApi.DefaultImpls.getGenerations$default(generateBotAvatarApi, formatted, value, boxBoolean, boxInt, boxInt2, null, generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1, 32, null);
                        if (generations$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        generateBotAvatarRepositoryImpl3 = generateBotAvatarRepositoryImpl6;
                        authData2 = authData;
                        obj = generations$default;
                        List list2 = (List) ((Response) obj).body();
                        if (list2 == null) {
                        }
                        if ((avatarGenerationResponse2 == 0 ? avatarGenerationResponse2.getStatus() : str) != AvatarGenerationStatusResponse.ERROR) {
                        }
                    } catch (Exception unused8) {
                        generateBotAvatarRepositoryImpl = generateBotAvatarRepositoryImpl6;
                        i2 = 1;
                        return onGenerationError$default(generateBotAvatarRepositoryImpl, str, i2, str);
                    }
                }
            }
        }
        generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1 = new GenerateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1(this, continuation);
        Object obj2 = generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = generateBotAvatarRepositoryImpl$loadRemoteGenerationStatus$1.label;
        if (i != 0) {
        }
        authData = (AuthData) obj2;
        if (authData != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleGenerationError(AuthData authData, String str, Continuation<? super AvatarGenerationStatus> continuation) {
        GenerateBotAvatarRepositoryImpl$handleGenerationError$1 generateBotAvatarRepositoryImpl$handleGenerationError$1;
        int i;
        AuthData authData2;
        String str2;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl;
        List list;
        AvatarGenerationResponse avatarGenerationResponse;
        String id;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl2;
        if (continuation instanceof GenerateBotAvatarRepositoryImpl$handleGenerationError$1) {
            generateBotAvatarRepositoryImpl$handleGenerationError$1 = (GenerateBotAvatarRepositoryImpl$handleGenerationError$1) continuation;
            if ((generateBotAvatarRepositoryImpl$handleGenerationError$1.label & Integer.MIN_VALUE) != 0) {
                generateBotAvatarRepositoryImpl$handleGenerationError$1.label -= Integer.MIN_VALUE;
                Object obj = generateBotAvatarRepositoryImpl$handleGenerationError$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = generateBotAvatarRepositoryImpl$handleGenerationError$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    GenerateBotAvatarApi generateBotAvatarApi = this.generateBotAvatarApi;
                    String formatted = authData.getToken().formatted();
                    String value = authData.getUserId().getValue();
                    Integer boxInt = Boxing.boxInt(1);
                    Integer boxInt2 = Boxing.boxInt(0);
                    generateBotAvatarRepositoryImpl$handleGenerationError$1.L$0 = this;
                    authData2 = authData;
                    generateBotAvatarRepositoryImpl$handleGenerationError$1.L$1 = authData2;
                    generateBotAvatarRepositoryImpl$handleGenerationError$1.L$2 = str;
                    generateBotAvatarRepositoryImpl$handleGenerationError$1.label = 1;
                    obj = GenerateBotAvatarApi.DefaultImpls.getGenerations$default(generateBotAvatarApi, formatted, value, null, boxInt, boxInt2, "success", generateBotAvatarRepositoryImpl$handleGenerationError$1, 4, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = str;
                    generateBotAvatarRepositoryImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        str2 = (String) generateBotAvatarRepositoryImpl$handleGenerationError$1.L$1;
                        generateBotAvatarRepositoryImpl2 = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$handleGenerationError$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        return generateBotAvatarRepositoryImpl2.onGenerationError(str2);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str2 = (String) generateBotAvatarRepositoryImpl$handleGenerationError$1.L$2;
                    generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$handleGenerationError$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    authData2 = (AuthData) generateBotAvatarRepositoryImpl$handleGenerationError$1.L$1;
                }
                list = (List) ((Response) obj).body();
                if (list != null || (avatarGenerationResponse = (AvatarGenerationResponse) CollectionsKt.firstOrNull((List<? extends Object>) list)) == null || (id = avatarGenerationResponse.getId()) == null) {
                    if (!Intrinsics.areEqual(generateBotAvatarRepositoryImpl.preferences.getStringWithKey(GENERATION_ID_ERROR_WATCHED), str2)) {
                        return AvatarGenerationStatus.NO_GENERATION;
                    }
                    return generateBotAvatarRepositoryImpl.onGenerationError(str2);
                }
                GenerateBotAvatarApi generateBotAvatarApi2 = generateBotAvatarRepositoryImpl.generateBotAvatarApi;
                String formatted2 = authData2.getToken().formatted();
                String value2 = authData2.getUserId().getValue();
                generateBotAvatarRepositoryImpl$handleGenerationError$1.L$0 = generateBotAvatarRepositoryImpl;
                generateBotAvatarRepositoryImpl$handleGenerationError$1.L$1 = str2;
                generateBotAvatarRepositoryImpl$handleGenerationError$1.L$2 = null;
                generateBotAvatarRepositoryImpl$handleGenerationError$1.label = 2;
                if (generateBotAvatarApi2.setActive(formatted2, value2, id, generateBotAvatarRepositoryImpl$handleGenerationError$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                generateBotAvatarRepositoryImpl2 = generateBotAvatarRepositoryImpl;
                return generateBotAvatarRepositoryImpl2.onGenerationError(str2);
            }
        }
        generateBotAvatarRepositoryImpl$handleGenerationError$1 = new GenerateBotAvatarRepositoryImpl$handleGenerationError$1(this, continuation);
        Object obj2 = generateBotAvatarRepositoryImpl$handleGenerationError$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = generateBotAvatarRepositoryImpl$handleGenerationError$1.label;
        if (i != 0) {
        }
        list = (List) ((Response) obj2).body();
        if (list != null) {
        }
        if (!Intrinsics.areEqual(generateBotAvatarRepositoryImpl.preferences.getStringWithKey(GENERATION_ID_ERROR_WATCHED), str2)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[RETURN] */
    @Override // com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onErrorWatched(Continuation<? super Unit> continuation) {
        GenerateBotAvatarRepositoryImpl$onErrorWatched$1 generateBotAvatarRepositoryImpl$onErrorWatched$1;
        Object coroutine_suspended;
        int i;
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl;
        AvatarGenerationStatusStorage avatarGenerationStatusStorage;
        if (continuation instanceof GenerateBotAvatarRepositoryImpl$onErrorWatched$1) {
            generateBotAvatarRepositoryImpl$onErrorWatched$1 = (GenerateBotAvatarRepositoryImpl$onErrorWatched$1) continuation;
            if ((generateBotAvatarRepositoryImpl$onErrorWatched$1.label & Integer.MIN_VALUE) != 0) {
                generateBotAvatarRepositoryImpl$onErrorWatched$1.label -= Integer.MIN_VALUE;
                Object obj = generateBotAvatarRepositoryImpl$onErrorWatched$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = generateBotAvatarRepositoryImpl$onErrorWatched$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Job job = this.getGenerationStatusJob;
                    if (job != null) {
                        generateBotAvatarRepositoryImpl$onErrorWatched$1.L$0 = this;
                        generateBotAvatarRepositoryImpl$onErrorWatched$1.label = 1;
                        if (job.join(generateBotAvatarRepositoryImpl$onErrorWatched$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    generateBotAvatarRepositoryImpl = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$onErrorWatched$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    generateBotAvatarRepositoryImpl$onErrorWatched$1.L$0 = null;
                    generateBotAvatarRepositoryImpl$onErrorWatched$1.label = 3;
                    if (generateBotAvatarRepositoryImpl.getGenerationStatus(generateBotAvatarRepositoryImpl$onErrorWatched$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                } else {
                    generateBotAvatarRepositoryImpl = (GenerateBotAvatarRepositoryImpl) generateBotAvatarRepositoryImpl$onErrorWatched$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                avatarGenerationStatusStorage = generateBotAvatarRepositoryImpl.avatarGenerationStatusStorage;
                generateBotAvatarRepositoryImpl$onErrorWatched$1.L$0 = generateBotAvatarRepositoryImpl;
                generateBotAvatarRepositoryImpl$onErrorWatched$1.label = 2;
                if (avatarGenerationStatusStorage.clear(generateBotAvatarRepositoryImpl$onErrorWatched$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                generateBotAvatarRepositoryImpl$onErrorWatched$1.L$0 = null;
                generateBotAvatarRepositoryImpl$onErrorWatched$1.label = 3;
                if (generateBotAvatarRepositoryImpl.getGenerationStatus(generateBotAvatarRepositoryImpl$onErrorWatched$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        generateBotAvatarRepositoryImpl$onErrorWatched$1 = new GenerateBotAvatarRepositoryImpl$onErrorWatched$1(this, continuation);
        Object obj2 = generateBotAvatarRepositoryImpl$onErrorWatched$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = generateBotAvatarRepositoryImpl$onErrorWatched$1.label;
        if (i != 0) {
        }
        avatarGenerationStatusStorage = generateBotAvatarRepositoryImpl.avatarGenerationStatusStorage;
        generateBotAvatarRepositoryImpl$onErrorWatched$1.L$0 = generateBotAvatarRepositoryImpl;
        generateBotAvatarRepositoryImpl$onErrorWatched$1.label = 2;
        if (avatarGenerationStatusStorage.clear(generateBotAvatarRepositoryImpl$onErrorWatched$1) == coroutine_suspended) {
        }
        generateBotAvatarRepositoryImpl$onErrorWatched$1.L$0 = null;
        generateBotAvatarRepositoryImpl$onErrorWatched$1.label = 3;
        if (generateBotAvatarRepositoryImpl.getGenerationStatus(generateBotAvatarRepositoryImpl$onErrorWatched$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ AvatarGenerationStatus onGenerationError$default(GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return generateBotAvatarRepositoryImpl.onGenerationError(str);
    }

    private final AvatarGenerationStatus onGenerationError(String str) {
        if (str != null) {
            this.preferences.saveStringWithKey(GENERATION_ID_ERROR_WATCHED, str);
        }
        return AvatarGenerationStatus.ERROR;
    }

    @Override // com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository
    public Object reloadAvatars(Continuation<? super Unit> continuation) {
        Object loadCurrentAvatar = loadCurrentAvatar(continuation);
        return loadCurrentAvatar == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? loadCurrentAvatar : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository
    public void clear() {
        this.currentGeneratedAvatar.setValue(GeneratedAvatar.Companion.empty(GeneratedAvatar.Status.NOT_LOADED));
        this.generatedAvatarsIds.setValue(CollectionsKt.emptyList());
        this.lastDescription.setValue(null);
        Job job = this.getGenerationStatusJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.getGenerationStatusJob = null;
    }
}
