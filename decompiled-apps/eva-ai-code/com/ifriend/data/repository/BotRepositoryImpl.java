package com.ifriend.data.repository;

import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import com.ifriend.common_utils.Constants;
import com.ifriend.common_utils.Logger;
import com.ifriend.data.mappers.BotFromResponseMapper;
import com.ifriend.data.mappers.EthnicityToBackendValueMapper;
import com.ifriend.data.mappers.GenderToBackendString;
import com.ifriend.data.mappers.PersonalityToBackendValueMapper;
import com.ifriend.data.networking.api.BotApi;
import com.ifriend.data.networking.requests.SetBotGenderRequest;
import com.ifriend.data.networking.requests.SetBotPersonalityRequest;
import com.ifriend.data.storages.bots.MainBotLocalDataSource;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.bot.BotVoiceConfig;
import com.ifriend.domain.models.profile.bot.Ethnicity;
import com.ifriend.domain.models.profile.bot.Personality;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.socket.MessagesSourceMessage;
import java.util.concurrent.CancellationException;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import retrofit2.Response;
/* compiled from: BotRepositoryImpl.kt */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJO\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0&2(\u0010'\u001a$\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0*0)\u0012\u0006\u0012\u0004\u0018\u00010+0(H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010,J\u0011\u0010-\u001a\u00020$H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010.J\u001b\u0010/\u001a\u00020$2\b\u00100\u001a\u0004\u0018\u00010\"H\u0082@ø\u0001\u0000¢\u0006\u0002\u00101J\u001b\u00102\u001a\u00020$2\b\u00100\u001a\u0004\u0018\u00010\"H\u0082@ø\u0001\u0000¢\u0006\u0002\u00101J\u0010\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"04H\u0016J\n\u00105\u001a\u0004\u0018\u00010\"H\u0016J\n\u00106\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"04H\u0016J\u001b\u00108\u001a\u00020$2\b\u00109\u001a\u0004\u0018\u00010\u001dH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010:J\u001b\u0010;\u001a\u00020$2\b\u00109\u001a\u0004\u0018\u00010\u001dH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010:J\b\u0010<\u001a\u00020$H\u0002J\u0012\u0010=\u001a\u00020$2\b\u00100\u001a\u0004\u0018\u00010\"H\u0002J\u0019\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020@H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0019\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020DH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010EJ\u0019\u0010F\u001a\u00020$2\u0006\u0010G\u001a\u00020HH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010IJ\u0019\u0010J\u001a\u00020$2\u0006\u0010K\u001a\u00020LH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010MJ\u0019\u0010N\u001a\u00020$2\u0006\u0010O\u001a\u00020PH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010QJ\u0019\u0010R\u001a\u00020$2\u0006\u0010S\u001a\u00020LH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010MJ\u0019\u0010T\u001a\u00020$2\u0006\u0010U\u001a\u00020VH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010WJ\u0019\u0010X\u001a\u00020$2\u0006\u0010G\u001a\u00020HH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010IJ\u0019\u0010Y\u001a\u00020$2\u0006\u0010O\u001a\u00020PH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010QR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Z"}, d2 = {"Lcom/ifriend/data/repository/BotRepositoryImpl;", "Lcom/ifriend/domain/data/BotRepository;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "api", "Lcom/ifriend/data/networking/api/BotApi;", "botFromResponseMapper", "Lcom/ifriend/data/mappers/BotFromResponseMapper;", "fromGenderMapper", "Lcom/ifriend/data/mappers/GenderToBackendString;", "fromPersonalityMapper", "Lcom/ifriend/data/mappers/PersonalityToBackendValueMapper;", "fromEthnicityMapper", "Lcom/ifriend/data/mappers/EthnicityToBackendValueMapper;", "userSessionPreferences", "Lcom/ifriend/domain/data/Preferences;", "userPreferences", "logger", "Lcom/ifriend/common_utils/Logger;", "coroutineDispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "mainBotLocalDataSource", "Lcom/ifriend/data/storages/bots/MainBotLocalDataSource;", "(Lcom/ifriend/domain/data/AuthDataProvider;Lcom/ifriend/data/networking/api/BotApi;Lcom/ifriend/data/mappers/BotFromResponseMapper;Lcom/ifriend/data/mappers/GenderToBackendString;Lcom/ifriend/data/mappers/PersonalityToBackendValueMapper;Lcom/ifriend/data/mappers/EthnicityToBackendValueMapper;Lcom/ifriend/domain/data/Preferences;Lcom/ifriend/domain/data/Preferences;Lcom/ifriend/common_utils/Logger;Lcom/ifriend/domain/CoroutineDispatchers;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/socket/MessagesSource;Lcom/ifriend/data/storages/bots/MainBotLocalDataSource;)V", "lastAuthData", "Lcom/ifriend/domain/models/profile/user/AuthData;", "loadingJob", "Lkotlinx/coroutines/Job;", "serverActualBot", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/domain/models/profile/bot/Bot;", "changeBot", "", "change", "Lkotlin/Function1;", "makeRequest", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitBot", "bot", "(Lcom/ifriend/domain/models/profile/bot/Bot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitLocalBot", "getBot", "Lkotlinx/coroutines/flow/Flow;", "getCurrentBot", "getCurrentServerActualBot", "getServerActualBot", "internalLoadAndEmit", "auth", "(Lcom/ifriend/domain/models/profile/user/AuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAndEmit", "loadIfNeed", "saveToPreferences", "setBirthday", "birthday", "Lcom/ifriend/domain/models/profile/Birthday;", "(Lcom/ifriend/domain/models/profile/Birthday;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setEthnicity", "ethnicity", "Lcom/ifriend/domain/models/profile/bot/Ethnicity;", "(Lcom/ifriend/domain/models/profile/bot/Ethnicity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setGender", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "(Lcom/ifriend/domain/models/profile/Gender;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setName", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPersonality", "personality", "Lcom/ifriend/domain/models/profile/bot/Personality;", "(Lcom/ifriend/domain/models/profile/bot/Personality;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setVoice", "voiceId", "updateBot", "update", "Lcom/ifriend/domain/socket/MessagesSourceMessage$BotDataChanged;", "(Lcom/ifriend/domain/socket/MessagesSourceMessage$BotDataChanged;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateGender", "updatePersonality", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotRepositoryImpl implements BotRepository {
    private final BotApi api;
    private final AuthDataProvider authDataProvider;
    private final BotFromResponseMapper botFromResponseMapper;
    private final CoroutineDispatchers coroutineDispatchers;
    private final CoroutineScope coroutineScope;
    private final EthnicityToBackendValueMapper fromEthnicityMapper;
    private final GenderToBackendString fromGenderMapper;
    private final PersonalityToBackendValueMapper fromPersonalityMapper;
    private AuthData lastAuthData;
    private Job loadingJob;
    private final Logger logger;
    private final MainBotLocalDataSource mainBotLocalDataSource;
    private final MessagesSource messagesSource;
    private final MutableStateFlow<Bot> serverActualBot;
    private final Preferences userPreferences;
    private final Preferences userSessionPreferences;

    public BotRepositoryImpl(AuthDataProvider authDataProvider, BotApi api, BotFromResponseMapper botFromResponseMapper, GenderToBackendString fromGenderMapper, PersonalityToBackendValueMapper fromPersonalityMapper, EthnicityToBackendValueMapper fromEthnicityMapper, Preferences userSessionPreferences, Preferences userPreferences, Logger logger, CoroutineDispatchers coroutineDispatchers, CoroutineScope coroutineScope, MessagesSource messagesSource, MainBotLocalDataSource mainBotLocalDataSource) {
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(botFromResponseMapper, "botFromResponseMapper");
        Intrinsics.checkNotNullParameter(fromGenderMapper, "fromGenderMapper");
        Intrinsics.checkNotNullParameter(fromPersonalityMapper, "fromPersonalityMapper");
        Intrinsics.checkNotNullParameter(fromEthnicityMapper, "fromEthnicityMapper");
        Intrinsics.checkNotNullParameter(userSessionPreferences, "userSessionPreferences");
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
        Intrinsics.checkNotNullParameter(mainBotLocalDataSource, "mainBotLocalDataSource");
        this.authDataProvider = authDataProvider;
        this.api = api;
        this.botFromResponseMapper = botFromResponseMapper;
        this.fromGenderMapper = fromGenderMapper;
        this.fromPersonalityMapper = fromPersonalityMapper;
        this.fromEthnicityMapper = fromEthnicityMapper;
        this.userSessionPreferences = userSessionPreferences;
        this.userPreferences = userPreferences;
        this.logger = logger;
        this.coroutineDispatchers = coroutineDispatchers;
        this.coroutineScope = coroutineScope;
        this.messagesSource = messagesSource;
        this.mainBotLocalDataSource = mainBotLocalDataSource;
        this.serverActualBot = StateFlowKt.MutableStateFlow(null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineDispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineDispatchers.getIO(), null, new AnonymousClass2(null), 2, null);
    }

    /* compiled from: BotRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.repository.BotRepositoryImpl$1", f = "BotRepositoryImpl.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.repository.BotRepositoryImpl$1  reason: invalid class name */
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
                this.label = 1;
                if (BotRepositoryImpl.this.authDataProvider.sessionAuthData().collect(new C01331(BotRepositoryImpl.this), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BotRepositoryImpl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.data.repository.BotRepositoryImpl$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C01331 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ BotRepositoryImpl $tmp0;

            C01331(BotRepositoryImpl botRepositoryImpl) {
                this.$tmp0 = botRepositoryImpl;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(2, this.$tmp0, BotRepositoryImpl.class, "loadAndEmit", "loadAndEmit(Lcom/ifriend/domain/models/profile/user/AuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AuthData authData, Continuation<? super Unit> continuation) {
                Object loadAndEmit = this.$tmp0.loadAndEmit(authData, continuation);
                return loadAndEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? loadAndEmit : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AuthData) obj, (Continuation<? super Unit>) continuation);
            }
        }
    }

    /* compiled from: BotRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.repository.BotRepositoryImpl$2", f = "BotRepositoryImpl.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.repository.BotRepositoryImpl$2  reason: invalid class name */
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
                final Flow<MessagesSourceMessage> allMessages = BotRepositoryImpl.this.messagesSource.getAllMessages(false);
                this.label = 1;
                if (new Flow<Object>() { // from class: com.ifriend.data.repository.BotRepositoryImpl$2$invokeSuspend$$inlined$getMessagesOf$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", "com/ifriend/domain/socket/MessagesSourceKt$getMessagesOf$$inlined$filterIsInstance$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.ifriend.data.repository.BotRepositoryImpl$2$invokeSuspend$$inlined$getMessagesOf$1$2  reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.ifriend.data.repository.BotRepositoryImpl$2$invokeSuspend$$inlined$getMessagesOf$1$2", f = "BotRepositoryImpl.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                        /* renamed from: com.ifriend.data.repository.BotRepositoryImpl$2$invokeSuspend$$inlined$getMessagesOf$1$2$1  reason: invalid class name */
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
                                        if (obj instanceof MessagesSourceMessage.BotDataChanged) {
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
                }.collect(new AnonymousClass1(BotRepositoryImpl.this), this) == coroutine_suspended) {
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
        /* compiled from: BotRepositoryImpl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.data.repository.BotRepositoryImpl$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ BotRepositoryImpl $tmp0;

            AnonymousClass1(BotRepositoryImpl botRepositoryImpl) {
                this.$tmp0 = botRepositoryImpl;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(2, this.$tmp0, BotRepositoryImpl.class, "updateBot", "updateBot(Lcom/ifriend/domain/socket/MessagesSourceMessage$BotDataChanged;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(MessagesSourceMessage.BotDataChanged botDataChanged, Continuation<? super Unit> continuation) {
                Object updateBot = this.$tmp0.updateBot(botDataChanged, continuation);
                return updateBot == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateBot : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((MessagesSourceMessage.BotDataChanged) obj, (Continuation<? super Unit>) continuation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateBot(MessagesSourceMessage.BotDataChanged botDataChanged, Continuation<? super Unit> continuation) {
        BotRepositoryImpl$updateBot$1 botRepositoryImpl$updateBot$1;
        Object coroutine_suspended;
        int i;
        BotRepositoryImpl botRepositoryImpl;
        Bot bot;
        AuthData value;
        BotVoiceConfig voiceConfig;
        BotRepositoryImpl botRepositoryImpl2;
        Object voiceConfig2;
        Bot copy;
        if (continuation instanceof BotRepositoryImpl$updateBot$1) {
            botRepositoryImpl$updateBot$1 = (BotRepositoryImpl$updateBot$1) continuation;
            if ((botRepositoryImpl$updateBot$1.label & Integer.MIN_VALUE) != 0) {
                botRepositoryImpl$updateBot$1.label -= Integer.MIN_VALUE;
                Object obj = botRepositoryImpl$updateBot$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = botRepositoryImpl$updateBot$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        bot = this.mainBotLocalDataSource.getBot();
                    } catch (Exception e) {
                        e = e;
                        botRepositoryImpl = this;
                        botRepositoryImpl.logger.logException(e);
                        return Unit.INSTANCE;
                    }
                    if (bot != null && (value = this.authDataProvider.sessionAuthData().getValue()) != null) {
                        if (bot.getGender() != botDataChanged.getGender()) {
                            BotApi botApi = this.api;
                            String formatted = value.getToken().formatted();
                            String value2 = value.getUserId().getValue();
                            botRepositoryImpl$updateBot$1.L$0 = this;
                            botRepositoryImpl$updateBot$1.L$1 = botDataChanged;
                            botRepositoryImpl$updateBot$1.L$2 = bot;
                            botRepositoryImpl$updateBot$1.label = 1;
                            voiceConfig2 = botApi.getVoiceConfig(formatted, value2, botRepositoryImpl$updateBot$1);
                            if (voiceConfig2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            botRepositoryImpl2 = this;
                        } else {
                            voiceConfig = bot.getVoiceConfig();
                            botRepositoryImpl2 = this;
                            copy = bot.copy(botDataChanged.getName(), botDataChanged.getGender(), botDataChanged.getBirthday(), botDataChanged.getEthnicity(), botDataChanged.getPersonality(), voiceConfig);
                            botRepositoryImpl$updateBot$1.L$0 = botRepositoryImpl2;
                            botRepositoryImpl$updateBot$1.L$1 = null;
                            botRepositoryImpl$updateBot$1.L$2 = null;
                            botRepositoryImpl$updateBot$1.label = 2;
                            if (botRepositoryImpl2.emitBot(copy, botRepositoryImpl$updateBot$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                } else if (i != 1) {
                    if (i == 2) {
                        botRepositoryImpl = (BotRepositoryImpl) botRepositoryImpl$updateBot$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Exception e2) {
                            e = e2;
                            botRepositoryImpl.logger.logException(e);
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    Bot bot2 = (Bot) botRepositoryImpl$updateBot$1.L$2;
                    MessagesSourceMessage.BotDataChanged botDataChanged2 = (MessagesSourceMessage.BotDataChanged) botRepositoryImpl$updateBot$1.L$1;
                    botRepositoryImpl2 = (BotRepositoryImpl) botRepositoryImpl$updateBot$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        bot = bot2;
                        botDataChanged = botDataChanged2;
                        voiceConfig2 = obj;
                    } catch (Exception e3) {
                        e = e3;
                        botRepositoryImpl = botRepositoryImpl2;
                        botRepositoryImpl.logger.logException(e);
                        return Unit.INSTANCE;
                    }
                }
                voiceConfig = (BotVoiceConfig) ((Response) voiceConfig2).body();
                copy = bot.copy(botDataChanged.getName(), botDataChanged.getGender(), botDataChanged.getBirthday(), botDataChanged.getEthnicity(), botDataChanged.getPersonality(), voiceConfig);
                botRepositoryImpl$updateBot$1.L$0 = botRepositoryImpl2;
                botRepositoryImpl$updateBot$1.L$1 = null;
                botRepositoryImpl$updateBot$1.L$2 = null;
                botRepositoryImpl$updateBot$1.label = 2;
                if (botRepositoryImpl2.emitBot(copy, botRepositoryImpl$updateBot$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        botRepositoryImpl$updateBot$1 = new BotRepositoryImpl$updateBot$1(this, continuation);
        Object obj2 = botRepositoryImpl$updateBot$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = botRepositoryImpl$updateBot$1.label;
        if (i != 0) {
        }
        voiceConfig = (BotVoiceConfig) ((Response) voiceConfig2).body();
        copy = bot.copy(botDataChanged.getName(), botDataChanged.getGender(), botDataChanged.getBirthday(), botDataChanged.getEthnicity(), botDataChanged.getPersonality(), voiceConfig);
        botRepositoryImpl$updateBot$1.L$0 = botRepositoryImpl2;
        botRepositoryImpl$updateBot$1.L$1 = null;
        botRepositoryImpl$updateBot$1.L$2 = null;
        botRepositoryImpl$updateBot$1.label = 2;
        if (botRepositoryImpl2.emitBot(copy, botRepositoryImpl$updateBot$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadAndEmit(AuthData authData, Continuation<? super Unit> continuation) {
        BotRepositoryImpl$loadAndEmit$1 botRepositoryImpl$loadAndEmit$1;
        int i;
        BotRepositoryImpl botRepositoryImpl;
        if (continuation instanceof BotRepositoryImpl$loadAndEmit$1) {
            botRepositoryImpl$loadAndEmit$1 = (BotRepositoryImpl$loadAndEmit$1) continuation;
            if ((botRepositoryImpl$loadAndEmit$1.label & Integer.MIN_VALUE) != 0) {
                botRepositoryImpl$loadAndEmit$1.label -= Integer.MIN_VALUE;
                Object obj = botRepositoryImpl$loadAndEmit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = botRepositoryImpl$loadAndEmit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        botRepositoryImpl$loadAndEmit$1.L$0 = this;
                        botRepositoryImpl$loadAndEmit$1.label = 1;
                        if (internalLoadAndEmit(authData, botRepositoryImpl$loadAndEmit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e) {
                        e = e;
                        botRepositoryImpl = this;
                        Logger.DefaultImpls.error$default(botRepositoryImpl.logger, "Error while loading bot: " + e.getMessage(), null, 2, null);
                        return Unit.INSTANCE;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    botRepositoryImpl = (BotRepositoryImpl) botRepositoryImpl$loadAndEmit$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e2) {
                        e = e2;
                        Logger.DefaultImpls.error$default(botRepositoryImpl.logger, "Error while loading bot: " + e.getMessage(), null, 2, null);
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        botRepositoryImpl$loadAndEmit$1 = new BotRepositoryImpl$loadAndEmit$1(this, continuation);
        Object obj2 = botRepositoryImpl$loadAndEmit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = botRepositoryImpl$loadAndEmit$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object internalLoadAndEmit(AuthData authData, Continuation<? super Unit> continuation) {
        Job launch$default;
        if (authData == null) {
            Object emitBot = emitBot(null, continuation);
            return emitBot == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emitBot : Unit.INSTANCE;
        } else if (authData.isEqualWithoutEmail(this.lastAuthData)) {
            return Unit.INSTANCE;
        } else {
            this.lastAuthData = authData;
            Job job = this.loadingJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.loadingJob = null;
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.coroutineDispatchers.getIO(), null, new BotRepositoryImpl$internalLoadAndEmit$2(this, authData, null), 2, null);
            this.loadingJob = launch$default;
            return Unit.INSTANCE;
        }
    }

    private final void saveToPreferences(Bot bot) {
        if (bot == null) {
            return;
        }
        this.userSessionPreferences.saveStringWithKey(Constants.BOT_NAME, bot.getName());
        String stringWithKey = this.userPreferences.getStringWithKey(Constants.BOT_INITIAL_PERSONALITY);
        Personality personality = bot.getPersonality();
        String name = personality != null ? personality.name() : null;
        String str = stringWithKey;
        if (!(str == null || str.length() == 0) || name == null) {
            return;
        }
        this.userPreferences.saveStringWithKey(Constants.BOT_INITIAL_PERSONALITY, name);
    }

    @Override // com.ifriend.domain.data.BotProvider
    public Flow<Bot> getBot() {
        loadIfNeed();
        return this.mainBotLocalDataSource.getBotFlow();
    }

    @Override // com.ifriend.domain.data.BotProvider
    public Flow<Bot> getServerActualBot() {
        loadIfNeed();
        return this.serverActualBot;
    }

    @Override // com.ifriend.domain.data.BotProvider
    public Bot getCurrentBot() {
        loadIfNeed();
        return this.mainBotLocalDataSource.getBot();
    }

    @Override // com.ifriend.domain.data.BotProvider
    public Bot getCurrentServerActualBot() {
        loadIfNeed();
        return this.serverActualBot.getValue();
    }

    private final void loadIfNeed() {
        if (this.mainBotLocalDataSource.getBot() != null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new BotRepositoryImpl$loadIfNeed$1(this, null), 3, null);
    }

    @Override // com.ifriend.domain.data.BotRepository
    public Object setName(String str, Continuation<? super Unit> continuation) {
        Object changeBot = changeBot(new BotRepositoryImpl$setName$2(str), new BotRepositoryImpl$setName$3(this, str, null), continuation);
        return changeBot == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? changeBot : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.BotRepository
    public Object setGender(Gender gender, Continuation<? super Unit> continuation) {
        Object changeBot = changeBot(new BotRepositoryImpl$setGender$2(gender), new BotRepositoryImpl$setGender$3(this, gender, null), continuation);
        return changeBot == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? changeBot : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.BotRepository
    public Object setBirthday(Birthday birthday, Continuation<? super Unit> continuation) {
        Object changeBot = changeBot(new BotRepositoryImpl$setBirthday$2(birthday), new BotRepositoryImpl$setBirthday$3(this, birthday, null), continuation);
        return changeBot == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? changeBot : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.BotRepository
    public Object setPersonality(Personality personality, Continuation<? super Unit> continuation) {
        Object changeBot = changeBot(new BotRepositoryImpl$setPersonality$2(personality), new BotRepositoryImpl$setPersonality$3(this, personality, null), continuation);
        return changeBot == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? changeBot : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    @Override // com.ifriend.domain.data.BotRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateGender(Gender gender, Continuation<? super Unit> continuation) {
        BotRepositoryImpl$updateGender$1 botRepositoryImpl$updateGender$1;
        Object coroutine_suspended;
        int i;
        AuthData value;
        Bot bot;
        BotRepositoryImpl botRepositoryImpl;
        Bot bot2;
        Object voiceConfig;
        Gender gender2;
        Object obj;
        Bot bot3;
        BotRepositoryImpl botRepositoryImpl2;
        Response response;
        Object obj2;
        Gender gender3 = gender;
        if (continuation instanceof BotRepositoryImpl$updateGender$1) {
            botRepositoryImpl$updateGender$1 = (BotRepositoryImpl$updateGender$1) continuation;
            if ((botRepositoryImpl$updateGender$1.label & Integer.MIN_VALUE) != 0) {
                botRepositoryImpl$updateGender$1.label -= Integer.MIN_VALUE;
                Object obj3 = botRepositoryImpl$updateGender$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = botRepositoryImpl$updateGender$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    value = this.authDataProvider.sessionAuthData().getValue();
                    if (value != null && (bot = this.mainBotLocalDataSource.getBot()) != null) {
                        BotApi botApi = this.api;
                        String formatted = value.getToken().formatted();
                        String value2 = value.getUserId().getValue();
                        SetBotGenderRequest setBotGenderRequest = new SetBotGenderRequest(this.fromGenderMapper.map(gender3));
                        botRepositoryImpl$updateGender$1.L$0 = this;
                        botRepositoryImpl$updateGender$1.L$1 = gender3;
                        botRepositoryImpl$updateGender$1.L$2 = value;
                        botRepositoryImpl$updateGender$1.L$3 = bot;
                        botRepositoryImpl$updateGender$1.label = 1;
                        Object botGender = botApi.setBotGender(formatted, value2, setBotGenderRequest, botRepositoryImpl$updateGender$1);
                        if (botGender == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        botRepositoryImpl = this;
                        bot2 = bot;
                        obj3 = botGender;
                    }
                    return Unit.INSTANCE;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3 || i == 4) {
                            Object obj4 = botRepositoryImpl$updateGender$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = botRepositoryImpl$updateGender$1.L$3;
                    ResultKt.throwOnFailure(obj3);
                    gender2 = (Gender) botRepositoryImpl$updateGender$1.L$1;
                    bot3 = (Bot) botRepositoryImpl$updateGender$1.L$2;
                    botRepositoryImpl2 = (BotRepositoryImpl) botRepositoryImpl$updateGender$1.L$0;
                    response = (Response) obj3;
                    Bot bot4 = null;
                    if (!response.isSuccessful()) {
                        Bot bot5 = botRepositoryImpl2.mainBotLocalDataSource.getBot();
                        if (bot5 != null) {
                            obj2 = null;
                            bot4 = Bot.copy$default(bot5, null, gender2, null, null, null, (BotVoiceConfig) response.body(), 29, null);
                        } else {
                            obj2 = null;
                        }
                        botRepositoryImpl$updateGender$1.L$0 = obj;
                        botRepositoryImpl$updateGender$1.L$1 = obj2;
                        botRepositoryImpl$updateGender$1.L$2 = obj2;
                        botRepositoryImpl$updateGender$1.L$3 = obj2;
                        botRepositoryImpl$updateGender$1.label = 3;
                        if (botRepositoryImpl2.emitBot(bot4, botRepositoryImpl$updateGender$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        Bot copy$default = Bot.copy$default(bot3, null, gender2, null, null, null, null, 61, null);
                        botRepositoryImpl$updateGender$1.L$0 = obj;
                        botRepositoryImpl$updateGender$1.L$1 = null;
                        botRepositoryImpl$updateGender$1.L$2 = null;
                        botRepositoryImpl$updateGender$1.L$3 = null;
                        botRepositoryImpl$updateGender$1.label = 4;
                        if (botRepositoryImpl2.emitBot(copy$default, botRepositoryImpl$updateGender$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                } else {
                    value = (AuthData) botRepositoryImpl$updateGender$1.L$2;
                    Gender gender4 = (Gender) botRepositoryImpl$updateGender$1.L$1;
                    botRepositoryImpl = (BotRepositoryImpl) botRepositoryImpl$updateGender$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    bot2 = (Bot) botRepositoryImpl$updateGender$1.L$3;
                    gender3 = gender4;
                }
                Response response2 = (Response) obj3;
                BotApi botApi2 = botRepositoryImpl.api;
                String formatted2 = value.getToken().formatted();
                String value3 = value.getUserId().getValue();
                botRepositoryImpl$updateGender$1.L$0 = botRepositoryImpl;
                botRepositoryImpl$updateGender$1.L$1 = gender3;
                botRepositoryImpl$updateGender$1.L$2 = bot2;
                botRepositoryImpl$updateGender$1.L$3 = obj3;
                botRepositoryImpl$updateGender$1.label = 2;
                voiceConfig = botApi2.getVoiceConfig(formatted2, value3, botRepositoryImpl$updateGender$1);
                if (voiceConfig != coroutine_suspended) {
                    return coroutine_suspended;
                }
                gender2 = gender3;
                obj = obj3;
                obj3 = voiceConfig;
                bot3 = bot2;
                botRepositoryImpl2 = botRepositoryImpl;
                response = (Response) obj3;
                Bot bot42 = null;
                if (!response.isSuccessful()) {
                }
                return Unit.INSTANCE;
            }
        }
        botRepositoryImpl$updateGender$1 = new BotRepositoryImpl$updateGender$1(this, continuation);
        Object obj32 = botRepositoryImpl$updateGender$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = botRepositoryImpl$updateGender$1.label;
        if (i != 0) {
        }
        Response response22 = (Response) obj32;
        BotApi botApi22 = botRepositoryImpl.api;
        String formatted22 = value.getToken().formatted();
        String value32 = value.getUserId().getValue();
        botRepositoryImpl$updateGender$1.L$0 = botRepositoryImpl;
        botRepositoryImpl$updateGender$1.L$1 = gender3;
        botRepositoryImpl$updateGender$1.L$2 = bot2;
        botRepositoryImpl$updateGender$1.L$3 = obj32;
        botRepositoryImpl$updateGender$1.label = 2;
        voiceConfig = botApi22.getVoiceConfig(formatted22, value32, botRepositoryImpl$updateGender$1);
        if (voiceConfig != coroutine_suspended) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb A[RETURN] */
    @Override // com.ifriend.domain.data.BotRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updatePersonality(Personality personality, Continuation<? super Unit> continuation) {
        BotRepositoryImpl$updatePersonality$1 botRepositoryImpl$updatePersonality$1;
        Object coroutine_suspended;
        int i;
        Bot bot;
        Personality personality2;
        Bot bot2;
        BotRepositoryImpl botRepositoryImpl;
        Bot copy$default;
        if (continuation instanceof BotRepositoryImpl$updatePersonality$1) {
            botRepositoryImpl$updatePersonality$1 = (BotRepositoryImpl$updatePersonality$1) continuation;
            if ((botRepositoryImpl$updatePersonality$1.label & Integer.MIN_VALUE) != 0) {
                botRepositoryImpl$updatePersonality$1.label -= Integer.MIN_VALUE;
                Object obj = botRepositoryImpl$updatePersonality$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = botRepositoryImpl$updatePersonality$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthData value = this.authDataProvider.sessionAuthData().getValue();
                    if (value != null && (bot = this.mainBotLocalDataSource.getBot()) != null) {
                        BotApi botApi = this.api;
                        String formatted = value.getToken().formatted();
                        String value2 = value.getUserId().getValue();
                        SetBotPersonalityRequest setBotPersonalityRequest = new SetBotPersonalityRequest(this.fromPersonalityMapper.map(personality));
                        botRepositoryImpl$updatePersonality$1.L$0 = this;
                        botRepositoryImpl$updatePersonality$1.L$1 = personality;
                        botRepositoryImpl$updatePersonality$1.L$2 = bot;
                        botRepositoryImpl$updatePersonality$1.label = 1;
                        if (botApi.setBotPersonality(formatted, value2, setBotPersonalityRequest, botRepositoryImpl$updatePersonality$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        personality2 = personality;
                        bot2 = bot;
                        botRepositoryImpl = this;
                    }
                    return Unit.INSTANCE;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    BotRepositoryImpl botRepositoryImpl2 = (BotRepositoryImpl) botRepositoryImpl$updatePersonality$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    personality2 = (Personality) botRepositoryImpl$updatePersonality$1.L$1;
                    bot2 = (Bot) botRepositoryImpl$updatePersonality$1.L$2;
                    botRepositoryImpl = botRepositoryImpl2;
                }
                copy$default = Bot.copy$default(bot2, null, null, null, null, personality2, null, 47, null);
                botRepositoryImpl$updatePersonality$1.L$0 = null;
                botRepositoryImpl$updatePersonality$1.L$1 = null;
                botRepositoryImpl$updatePersonality$1.L$2 = null;
                botRepositoryImpl$updatePersonality$1.label = 2;
                if (botRepositoryImpl.emitBot(copy$default, botRepositoryImpl$updatePersonality$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        botRepositoryImpl$updatePersonality$1 = new BotRepositoryImpl$updatePersonality$1(this, continuation);
        Object obj2 = botRepositoryImpl$updatePersonality$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = botRepositoryImpl$updatePersonality$1.label;
        if (i != 0) {
        }
        copy$default = Bot.copy$default(bot2, null, null, null, null, personality2, null, 47, null);
        botRepositoryImpl$updatePersonality$1.L$0 = null;
        botRepositoryImpl$updatePersonality$1.L$1 = null;
        botRepositoryImpl$updatePersonality$1.L$2 = null;
        botRepositoryImpl$updatePersonality$1.label = 2;
        if (botRepositoryImpl.emitBot(copy$default, botRepositoryImpl$updatePersonality$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.BotRepository
    public Object setEthnicity(Ethnicity ethnicity, Continuation<? super Unit> continuation) {
        Object changeBot = changeBot(new BotRepositoryImpl$setEthnicity$2(ethnicity), new BotRepositoryImpl$setEthnicity$3(this, ethnicity, null), continuation);
        return changeBot == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? changeBot : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.BotRepository
    public Object setVoice(String str, Continuation<? super Unit> continuation) {
        Object changeBot = changeBot(new BotRepositoryImpl$setVoice$2(str), new BotRepositoryImpl$setVoice$3(this, str, null), continuation);
        return changeBot == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? changeBot : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(5:(1:(1:(3:13|14|15)(2:17|18))(1:19))(1:27)|20|21|14|15) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|(1:(5:(5:(1:(1:(3:13|14|15)(2:17|18))(1:19))(1:27)|20|21|14|15)(7:28|29|30|31|(2:33|(1:35))(2:36|(1:38))|14|15)|24|(1:26)|14|15)(1:41))(3:50|(2:58|(1:60)(1:61))|57)|42|43|(1:45)(5:46|31|(0)(0)|14|15)))|62|6|(0)(0)|42|43|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0104, code lost:
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0105, code lost:
        r13 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6 A[Catch: Exception -> 0x006a, TryCatch #0 {Exception -> 0x006a, blocks: (B:25:0x0065, B:46:0x00de, B:48:0x00e6, B:51:0x00f5), top: B:61:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5 A[Catch: Exception -> 0x006a, TRY_LEAVE, TryCatch #0 {Exception -> 0x006a, blocks: (B:25:0x0065, B:46:0x00de, B:48:0x00e6, B:51:0x00f5), top: B:61:0x0065 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object changeBot(Function1<? super Bot, Bot> function1, Function2<? super AuthData, ? super Continuation<? super Response<Unit>>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        BotRepositoryImpl$changeBot$1 botRepositoryImpl$changeBot$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        AuthData value;
        Bot bot;
        BotRepositoryImpl botRepositoryImpl;
        Function2<? super AuthData, ? super Continuation<? super Response<Unit>>, ? extends Object> function22;
        Bot bot2;
        Bot bot3;
        BotRepositoryImpl botRepositoryImpl2;
        BotRepositoryImpl botRepositoryImpl3;
        Bot bot4;
        Bot bot5;
        if (continuation instanceof BotRepositoryImpl$changeBot$1) {
            botRepositoryImpl$changeBot$1 = (BotRepositoryImpl$changeBot$1) continuation;
            if ((botRepositoryImpl$changeBot$1.label & Integer.MIN_VALUE) != 0) {
                botRepositoryImpl$changeBot$1.label -= Integer.MIN_VALUE;
                obj = botRepositoryImpl$changeBot$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = botRepositoryImpl$changeBot$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    value = this.authDataProvider.sessionAuthData().getValue();
                    if (value != null && (bot = this.mainBotLocalDataSource.getBot()) != null) {
                        Bot invoke = function1.invoke(bot);
                        botRepositoryImpl$changeBot$1.L$0 = this;
                        botRepositoryImpl$changeBot$1.L$1 = function2;
                        botRepositoryImpl$changeBot$1.L$2 = value;
                        botRepositoryImpl$changeBot$1.L$3 = bot;
                        botRepositoryImpl$changeBot$1.L$4 = invoke;
                        botRepositoryImpl$changeBot$1.label = 1;
                        if (emitLocalBot(invoke, botRepositoryImpl$changeBot$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        botRepositoryImpl = this;
                        function22 = function2;
                        bot2 = invoke;
                        bot3 = bot;
                    }
                    return Unit.INSTANCE;
                } else if (i != 1) {
                    if (i == 2) {
                        bot5 = (Bot) botRepositoryImpl$changeBot$1.L$2;
                        bot4 = (Bot) botRepositoryImpl$changeBot$1.L$1;
                        botRepositoryImpl3 = (BotRepositoryImpl) botRepositoryImpl$changeBot$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            if (((Response) obj).isSuccessful()) {
                                botRepositoryImpl$changeBot$1.L$0 = botRepositoryImpl3;
                                botRepositoryImpl$changeBot$1.L$1 = bot4;
                                botRepositoryImpl$changeBot$1.L$2 = null;
                                botRepositoryImpl$changeBot$1.label = 3;
                                if (changeBot$emitOldUser(botRepositoryImpl3, bot4, botRepositoryImpl$changeBot$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                botRepositoryImpl$changeBot$1.L$0 = botRepositoryImpl3;
                                botRepositoryImpl$changeBot$1.L$1 = bot4;
                                botRepositoryImpl$changeBot$1.L$2 = null;
                                botRepositoryImpl$changeBot$1.label = 4;
                                if (botRepositoryImpl3.emitBot(bot5, botRepositoryImpl$changeBot$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            bot3 = bot4;
                            botRepositoryImpl2 = botRepositoryImpl3;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i == 3) {
                        bot3 = (Bot) botRepositoryImpl$changeBot$1.L$1;
                        botRepositoryImpl2 = (BotRepositoryImpl) botRepositoryImpl$changeBot$1.L$0;
                    } else if (i != 4) {
                        if (i == 5) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        bot3 = (Bot) botRepositoryImpl$changeBot$1.L$1;
                        botRepositoryImpl2 = (BotRepositoryImpl) botRepositoryImpl$changeBot$1.L$0;
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                    e.printStackTrace();
                    botRepositoryImpl$changeBot$1.L$0 = null;
                    botRepositoryImpl$changeBot$1.L$1 = null;
                    botRepositoryImpl$changeBot$1.L$2 = null;
                    botRepositoryImpl$changeBot$1.L$3 = null;
                    botRepositoryImpl$changeBot$1.L$4 = null;
                    botRepositoryImpl$changeBot$1.label = 5;
                    if (changeBot$emitOldUser(botRepositoryImpl2, bot3, botRepositoryImpl$changeBot$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                } else {
                    Bot bot6 = (Bot) botRepositoryImpl$changeBot$1.L$3;
                    value = (AuthData) botRepositoryImpl$changeBot$1.L$2;
                    function22 = (Function2) botRepositoryImpl$changeBot$1.L$1;
                    botRepositoryImpl = (BotRepositoryImpl) botRepositoryImpl$changeBot$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    bot2 = (Bot) botRepositoryImpl$changeBot$1.L$4;
                    bot3 = bot6;
                }
                botRepositoryImpl$changeBot$1.L$0 = botRepositoryImpl;
                botRepositoryImpl$changeBot$1.L$1 = bot3;
                botRepositoryImpl$changeBot$1.L$2 = bot2;
                botRepositoryImpl$changeBot$1.L$3 = null;
                botRepositoryImpl$changeBot$1.L$4 = null;
                botRepositoryImpl$changeBot$1.label = 2;
                obj = function22.invoke(value, botRepositoryImpl$changeBot$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                botRepositoryImpl3 = botRepositoryImpl;
                Bot bot7 = bot2;
                bot4 = bot3;
                bot5 = bot7;
                if (((Response) obj).isSuccessful()) {
                }
                return Unit.INSTANCE;
            }
        }
        botRepositoryImpl$changeBot$1 = new BotRepositoryImpl$changeBot$1(this, continuation);
        obj = botRepositoryImpl$changeBot$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = botRepositoryImpl$changeBot$1.label;
        if (i != 0) {
        }
        botRepositoryImpl$changeBot$1.L$0 = botRepositoryImpl;
        botRepositoryImpl$changeBot$1.L$1 = bot3;
        botRepositoryImpl$changeBot$1.L$2 = bot2;
        botRepositoryImpl$changeBot$1.L$3 = null;
        botRepositoryImpl$changeBot$1.L$4 = null;
        botRepositoryImpl$changeBot$1.label = 2;
        obj = function22.invoke(value, botRepositoryImpl$changeBot$1);
        if (obj != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object changeBot$emitOldUser(BotRepositoryImpl botRepositoryImpl, Bot bot, Continuation<? super Unit> continuation) {
        Object emitLocalBot = botRepositoryImpl.emitLocalBot(bot, continuation);
        return emitLocalBot == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emitLocalBot : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitLocalBot(Bot bot, Continuation<? super Unit> continuation) {
        Object update = this.mainBotLocalDataSource.update(bot, continuation);
        return update == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? update : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emitBot(Bot bot, Continuation<? super Unit> continuation) {
        BotRepositoryImpl$emitBot$1 botRepositoryImpl$emitBot$1;
        Object coroutine_suspended;
        int i;
        BotRepositoryImpl botRepositoryImpl;
        MutableStateFlow<Bot> mutableStateFlow;
        if (continuation instanceof BotRepositoryImpl$emitBot$1) {
            botRepositoryImpl$emitBot$1 = (BotRepositoryImpl$emitBot$1) continuation;
            if ((botRepositoryImpl$emitBot$1.label & Integer.MIN_VALUE) != 0) {
                botRepositoryImpl$emitBot$1.label -= Integer.MIN_VALUE;
                Object obj = botRepositoryImpl$emitBot$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = botRepositoryImpl$emitBot$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    saveToPreferences(bot);
                    botRepositoryImpl$emitBot$1.L$0 = this;
                    botRepositoryImpl$emitBot$1.L$1 = bot;
                    botRepositoryImpl$emitBot$1.label = 1;
                    if (emitLocalBot(bot, botRepositoryImpl$emitBot$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    botRepositoryImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    bot = (Bot) botRepositoryImpl$emitBot$1.L$1;
                    botRepositoryImpl = (BotRepositoryImpl) botRepositoryImpl$emitBot$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                mutableStateFlow = botRepositoryImpl.serverActualBot;
                botRepositoryImpl$emitBot$1.L$0 = null;
                botRepositoryImpl$emitBot$1.L$1 = null;
                botRepositoryImpl$emitBot$1.label = 2;
                if (mutableStateFlow.emit(bot, botRepositoryImpl$emitBot$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        botRepositoryImpl$emitBot$1 = new BotRepositoryImpl$emitBot$1(this, continuation);
        Object obj2 = botRepositoryImpl$emitBot$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = botRepositoryImpl$emitBot$1.label;
        if (i != 0) {
        }
        mutableStateFlow = botRepositoryImpl.serverActualBot;
        botRepositoryImpl$emitBot$1.L$0 = null;
        botRepositoryImpl$emitBot$1.L$1 = null;
        botRepositoryImpl$emitBot$1.label = 2;
        if (mutableStateFlow.emit(bot, botRepositoryImpl$emitBot$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // com.ifriend.domain.data.BotRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clear(Continuation<? super Unit> continuation) {
        BotRepositoryImpl$clear$1 botRepositoryImpl$clear$1;
        int i;
        BotRepositoryImpl botRepositoryImpl;
        if (continuation instanceof BotRepositoryImpl$clear$1) {
            botRepositoryImpl$clear$1 = (BotRepositoryImpl$clear$1) continuation;
            if ((botRepositoryImpl$clear$1.label & Integer.MIN_VALUE) != 0) {
                botRepositoryImpl$clear$1.label -= Integer.MIN_VALUE;
                Object obj = botRepositoryImpl$clear$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = botRepositoryImpl$clear$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    botRepositoryImpl$clear$1.L$0 = this;
                    botRepositoryImpl$clear$1.label = 1;
                    if (emitLocalBot(null, botRepositoryImpl$clear$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    botRepositoryImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    botRepositoryImpl = (BotRepositoryImpl) botRepositoryImpl$clear$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                botRepositoryImpl.lastAuthData = null;
                return Unit.INSTANCE;
            }
        }
        botRepositoryImpl$clear$1 = new BotRepositoryImpl$clear$1(this, continuation);
        Object obj2 = botRepositoryImpl$clear$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = botRepositoryImpl$clear$1.label;
        if (i != 0) {
        }
        botRepositoryImpl.lastAuthData = null;
        return Unit.INSTANCE;
    }
}
