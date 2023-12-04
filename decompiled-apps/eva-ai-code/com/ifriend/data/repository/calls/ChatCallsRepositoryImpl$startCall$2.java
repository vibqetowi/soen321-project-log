package com.ifriend.data.repository.calls;

import com.ifriend.core.remote.datasources.calls.ChatCallsRemoteDataSource;
import com.ifriend.core.remote.datasources.calls.models.response.ChatStartCallRemote;
import com.ifriend.domain.logic.calls.models.ChatStartCall;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/ifriend/domain/logic/calls/models/ChatStartCall;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.calls.ChatCallsRepositoryImpl$startCall$2", f = "ChatCallsRepositoryImpl.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatCallsRepositoryImpl$startCall$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChatStartCall>, Object> {
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatCallsRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatCallsRepositoryImpl$startCall$2(ChatCallsRepositoryImpl chatCallsRepositoryImpl, String str, Continuation<? super ChatCallsRepositoryImpl$startCall$2> continuation) {
        super(2, continuation);
        this.this$0 = chatCallsRepositoryImpl;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatCallsRepositoryImpl$startCall$2(this.this$0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ChatStartCall> continuation) {
        return ((ChatCallsRepositoryImpl$startCall$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            obj = chatCallsRemoteDataSource.startCall(this.$chatId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        ChatStartCallRemote chatStartCallRemote = (ChatStartCallRemote) obj;
        String callId = chatStartCallRemote.getCallId();
        String startMessage = chatStartCallRemote.getStartMessage();
        if (startMessage == null) {
            startMessage = "";
        }
        return new ChatStartCall(callId, startMessage);
    }
}
