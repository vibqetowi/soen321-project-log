package com.ifriend.data.repository.calls;

import com.ifriend.core.remote.datasources.calls.ChatCallsRemoteDataSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatCallsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.calls.ChatCallsRepositoryImpl$finishCall$2", f = "ChatCallsRepositoryImpl.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatCallsRepositoryImpl$finishCall$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $callId;
    final /* synthetic */ String $reason;
    int label;
    final /* synthetic */ ChatCallsRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatCallsRepositoryImpl$finishCall$2(ChatCallsRepositoryImpl chatCallsRepositoryImpl, String str, String str2, Continuation<? super ChatCallsRepositoryImpl$finishCall$2> continuation) {
        super(2, continuation);
        this.this$0 = chatCallsRepositoryImpl;
        this.$callId = str;
        this.$reason = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatCallsRepositoryImpl$finishCall$2(this.this$0, this.$callId, this.$reason, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatCallsRepositoryImpl$finishCall$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatCallsRemoteDataSource chatCallsRemoteDataSource;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatCallsRemoteDataSource = this.this$0.chatCallsRemoteDataSource;
            this.label = 1;
            if (chatCallsRemoteDataSource.finishCall(this.$callId, this.$reason, this) == coroutine_suspended) {
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
