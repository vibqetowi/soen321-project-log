package com.ifriend.data.repository.calls;

import com.ifriend.core.remote.datasources.calls.ChatCallsRemoteDataSource;
import com.ifriend.core.remote.datasources.calls.models.response.ChatCallPhrasesRemote;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatCallsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.calls.ChatCallsRepositoryImpl$refreshFinishCallPhrases$2", f = "ChatCallsRepositoryImpl.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatCallsRepositoryImpl$refreshFinishCallPhrases$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ChatCallsRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatCallsRepositoryImpl$refreshFinishCallPhrases$2(ChatCallsRepositoryImpl chatCallsRepositoryImpl, Continuation<? super ChatCallsRepositoryImpl$refreshFinishCallPhrases$2> continuation) {
        super(2, continuation);
        this.this$0 = chatCallsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatCallsRepositoryImpl$refreshFinishCallPhrases$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatCallsRepositoryImpl$refreshFinishCallPhrases$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatCallsRemoteDataSource chatCallsRemoteDataSource;
        ChatCallsRepositoryImpl chatCallsRepositoryImpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ChatCallsRepositoryImpl chatCallsRepositoryImpl2 = this.this$0;
            chatCallsRemoteDataSource = chatCallsRepositoryImpl2.chatCallsRemoteDataSource;
            this.L$0 = chatCallsRepositoryImpl2;
            this.label = 1;
            Object finishPhrases = chatCallsRemoteDataSource.getFinishPhrases(this);
            if (finishPhrases == coroutine_suspended) {
                return coroutine_suspended;
            }
            chatCallsRepositoryImpl = chatCallsRepositoryImpl2;
            obj = finishPhrases;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            chatCallsRepositoryImpl = (ChatCallsRepositoryImpl) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ChatCallPhrasesRemote.Messages messages = ((ChatCallPhrasesRemote) obj).getMessages();
        List<String> finalPhrases = messages != null ? messages.getFinalPhrases() : null;
        if (finalPhrases == null) {
            finalPhrases = CollectionsKt.emptyList();
        }
        chatCallsRepositoryImpl.finishPhrases = finalPhrases;
        return Unit.INSTANCE;
    }
}
