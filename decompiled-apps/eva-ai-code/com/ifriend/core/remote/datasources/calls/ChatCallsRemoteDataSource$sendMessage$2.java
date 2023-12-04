package com.ifriend.core.remote.datasources.calls;

import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.datasources.calls.models.request.ChatCallSendMessageRemoteParams;
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
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.core.remote.datasources.calls.ChatCallsRemoteDataSource$sendMessage$2", f = "ChatCallsRemoteDataSource.kt", i = {}, l = {41, 40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatCallsRemoteDataSource$sendMessage$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ String $callId;
    final /* synthetic */ String $message;
    Object L$0;
    int label;
    final /* synthetic */ ChatCallsRemoteDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatCallsRemoteDataSource$sendMessage$2(ChatCallsRemoteDataSource chatCallsRemoteDataSource, String str, String str2, Continuation<? super ChatCallsRemoteDataSource$sendMessage$2> continuation) {
        super(1, continuation);
        this.this$0 = chatCallsRemoteDataSource;
        this.$callId = str;
        this.$message = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ChatCallsRemoteDataSource$sendMessage$2(this.this$0, this.$callId, this.$message, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((ChatCallsRemoteDataSource$sendMessage$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CallsApiService callsApiService;
        AuthLocalDataSource authLocalDataSource;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            callsApiService = this.this$0.apiService;
            authLocalDataSource = this.this$0.authLocalDataSource;
            this.L$0 = callsApiService;
            this.label = 1;
            obj = authLocalDataSource.getUserId(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            callsApiService = (CallsApiService) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        this.L$0 = null;
        this.label = 2;
        if (callsApiService.sendMessage(str, this.$callId, new ChatCallSendMessageRemoteParams(this.$message), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
