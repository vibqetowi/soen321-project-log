package com.ifriend.data.repository;

import com.ifriend.data.mappers.GenderToBackendString;
import com.ifriend.data.networking.api.BotApi;
import com.ifriend.data.networking.requests.SetBotGenderRequest;
import com.ifriend.data.storages.bots.MainBotLocalDataSource;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.bot.BotVoiceConfig;
import com.ifriend.domain.models.profile.user.AuthData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;
/* compiled from: BotRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/models/profile/user/AuthData;", "auth", "Lretrofit2/Response;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.BotRepositoryImpl$setGender$3", f = "BotRepositoryImpl.kt", i = {0}, l = {201, 206, 211}, m = "invokeSuspend", n = {"auth"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class BotRepositoryImpl$setGender$3 extends SuspendLambda implements Function2<AuthData, Continuation<? super Response<Unit>>, Object> {
    final /* synthetic */ Gender $gender;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ BotRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotRepositoryImpl$setGender$3(BotRepositoryImpl botRepositoryImpl, Gender gender, Continuation<? super BotRepositoryImpl$setGender$3> continuation) {
        super(2, continuation);
        this.this$0 = botRepositoryImpl;
        this.$gender = gender;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotRepositoryImpl$setGender$3 botRepositoryImpl$setGender$3 = new BotRepositoryImpl$setGender$3(this.this$0, this.$gender, continuation);
        botRepositoryImpl$setGender$3.L$0 = obj;
        return botRepositoryImpl$setGender$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AuthData authData, Continuation<? super Response<Unit>> continuation) {
        return ((BotRepositoryImpl$setGender$3) create(authData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AuthData authData;
        BotApi botApi;
        GenderToBackendString genderToBackendString;
        BotApi botApi2;
        BotRepositoryImpl botRepositoryImpl;
        Gender gender;
        Object obj2;
        Response response;
        MainBotLocalDataSource mainBotLocalDataSource;
        Object emitBot;
        Object obj3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            authData = (AuthData) this.L$0;
            botApi = this.this$0.api;
            String formatted = authData.getToken().formatted();
            String value = authData.getUserId().getValue();
            genderToBackendString = this.this$0.fromGenderMapper;
            this.L$0 = authData;
            this.label = 1;
            obj = botApi.setBotGender(formatted, value, new SetBotGenderRequest(genderToBackendString.map(this.$gender)), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    obj3 = this.L$0;
                    ResultKt.throwOnFailure(obj);
                    return obj3;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            botRepositoryImpl = (BotRepositoryImpl) this.L$1;
            obj2 = this.L$0;
            ResultKt.throwOnFailure(obj);
            gender = (Gender) this.L$2;
            response = (Response) obj;
            if (response.isSuccessful()) {
                return obj2;
            }
            mainBotLocalDataSource = botRepositoryImpl.mainBotLocalDataSource;
            Bot bot = mainBotLocalDataSource.getBot();
            Bot copy$default = bot != null ? Bot.copy$default(bot, null, gender, null, null, null, (BotVoiceConfig) response.body(), 29, null) : null;
            this.L$0 = obj2;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
            emitBot = botRepositoryImpl.emitBot(copy$default, this);
            if (emitBot == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj3 = obj2;
            return obj3;
        } else {
            authData = (AuthData) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        BotRepositoryImpl botRepositoryImpl2 = this.this$0;
        Gender gender2 = this.$gender;
        Response response2 = (Response) obj;
        botApi2 = botRepositoryImpl2.api;
        String formatted2 = authData.getToken().formatted();
        String value2 = authData.getUserId().getValue();
        this.L$0 = obj;
        this.L$1 = botRepositoryImpl2;
        this.L$2 = gender2;
        this.label = 2;
        Object voiceConfig = botApi2.getVoiceConfig(formatted2, value2, this);
        if (voiceConfig == coroutine_suspended) {
            return coroutine_suspended;
        }
        botRepositoryImpl = botRepositoryImpl2;
        gender = gender2;
        obj2 = obj;
        obj = voiceConfig;
        response = (Response) obj;
        if (response.isSuccessful()) {
        }
    }
}
