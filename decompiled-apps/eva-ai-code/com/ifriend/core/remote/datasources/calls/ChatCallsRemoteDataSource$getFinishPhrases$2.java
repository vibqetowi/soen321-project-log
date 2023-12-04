package com.ifriend.core.remote.datasources.calls;

import com.ifriend.core.remote.datasources.calls.models.response.ChatCallPhrasesRemote;
import com.ifriend.core.remote.services.CallsApiService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatCallsRemoteDataSource.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/core/remote/datasources/calls/models/response/ChatCallPhrasesRemote;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.core.remote.datasources.calls.ChatCallsRemoteDataSource$getFinishPhrases$2", f = "ChatCallsRemoteDataSource.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatCallsRemoteDataSource$getFinishPhrases$2 extends SuspendLambda implements Function1<Continuation<? super ChatCallPhrasesRemote>, Object> {
    int label;
    final /* synthetic */ ChatCallsRemoteDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatCallsRemoteDataSource$getFinishPhrases$2(ChatCallsRemoteDataSource chatCallsRemoteDataSource, Continuation<? super ChatCallsRemoteDataSource$getFinishPhrases$2> continuation) {
        super(1, continuation);
        this.this$0 = chatCallsRemoteDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ChatCallsRemoteDataSource$getFinishPhrases$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ChatCallPhrasesRemote> continuation) {
        return ((ChatCallsRemoteDataSource$getFinishPhrases$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CallsApiService callsApiService;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            callsApiService = this.this$0.apiService;
            this.label = 1;
            obj = callsApiService.getPhrases(this);
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
