package com.ifriend.data.repository;

import com.ifriend.data.mappers.BotFromResponseMapper;
import com.ifriend.data.networking.api.BotApi;
import com.ifriend.data.networking.responses.BotDataResponse;
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
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BotRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.BotRepositoryImpl$internalLoadAndEmit$2", f = "BotRepositoryImpl.kt", i = {2}, l = {118, 122, 128, 137}, m = "invokeSuspend", n = {"bot"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class BotRepositoryImpl$internalLoadAndEmit$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AuthData $auth;
    Object L$0;
    int label;
    final /* synthetic */ BotRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotRepositoryImpl$internalLoadAndEmit$2(BotRepositoryImpl botRepositoryImpl, AuthData authData, Continuation<? super BotRepositoryImpl$internalLoadAndEmit$2> continuation) {
        super(2, continuation);
        this.this$0 = botRepositoryImpl;
        this.$auth = authData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotRepositoryImpl$internalLoadAndEmit$2(this.this$0, this.$auth, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotRepositoryImpl$internalLoadAndEmit$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BotApi botApi;
        BotFromResponseMapper botFromResponseMapper;
        Bot map;
        BotApi botApi2;
        Object emitBot;
        Response response;
        Object emitBot2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            botApi = this.this$0.api;
            this.label = 1;
            obj = botApi.getBotData(this.$auth.getToken().formatted(), this.$auth.getUserId().getValue(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            } else if (i != 3) {
                if (i == 4) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                map = (Bot) this.L$0;
                ResultKt.throwOnFailure(obj);
                response = (Response) obj;
                if (response.isSuccessful()) {
                    map.setVoiceConfig((BotVoiceConfig) response.body());
                }
                this.L$0 = null;
                this.label = 4;
                emitBot2 = this.this$0.emitBot(map, this);
                if (emitBot2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        } else {
            ResultKt.throwOnFailure(obj);
        }
        BotDataResponse botDataResponse = (BotDataResponse) ((Response) obj).body();
        if (botDataResponse != null) {
            botFromResponseMapper = this.this$0.botFromResponseMapper;
            map = botFromResponseMapper.map(botDataResponse);
            botApi2 = this.this$0.api;
            this.L$0 = map;
            this.label = 3;
            obj = botApi2.getVoiceConfig(this.$auth.getToken().formatted(), this.$auth.getUserId().getValue(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            response = (Response) obj;
            if (response.isSuccessful()) {
            }
            this.L$0 = null;
            this.label = 4;
            emitBot2 = this.this$0.emitBot(map, this);
            if (emitBot2 == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
        BotRepositoryImpl botRepositoryImpl = this.this$0;
        this.label = 2;
        emitBot = botRepositoryImpl.emitBot(null, this);
        if (emitBot == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
