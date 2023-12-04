package com.ifriend.data.repository;

import com.ifriend.data.mappers.PersonalityToBackendValueMapper;
import com.ifriend.data.networking.api.BotApi;
import com.ifriend.data.networking.requests.SetBotPersonalityRequest;
import com.ifriend.domain.models.profile.bot.Personality;
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
@DebugMetadata(c = "com.ifriend.data.repository.BotRepositoryImpl$setPersonality$3", f = "BotRepositoryImpl.kt", i = {}, l = {244}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class BotRepositoryImpl$setPersonality$3 extends SuspendLambda implements Function2<AuthData, Continuation<? super Response<Unit>>, Object> {
    final /* synthetic */ Personality $personality;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BotRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotRepositoryImpl$setPersonality$3(BotRepositoryImpl botRepositoryImpl, Personality personality, Continuation<? super BotRepositoryImpl$setPersonality$3> continuation) {
        super(2, continuation);
        this.this$0 = botRepositoryImpl;
        this.$personality = personality;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotRepositoryImpl$setPersonality$3 botRepositoryImpl$setPersonality$3 = new BotRepositoryImpl$setPersonality$3(this.this$0, this.$personality, continuation);
        botRepositoryImpl$setPersonality$3.L$0 = obj;
        return botRepositoryImpl$setPersonality$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AuthData authData, Continuation<? super Response<Unit>> continuation) {
        return ((BotRepositoryImpl$setPersonality$3) create(authData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BotApi botApi;
        PersonalityToBackendValueMapper personalityToBackendValueMapper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AuthData authData = (AuthData) this.L$0;
            botApi = this.this$0.api;
            String formatted = authData.getToken().formatted();
            String value = authData.getUserId().getValue();
            personalityToBackendValueMapper = this.this$0.fromPersonalityMapper;
            this.label = 1;
            obj = botApi.setBotPersonality(formatted, value, new SetBotPersonalityRequest(personalityToBackendValueMapper.map(this.$personality)), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
