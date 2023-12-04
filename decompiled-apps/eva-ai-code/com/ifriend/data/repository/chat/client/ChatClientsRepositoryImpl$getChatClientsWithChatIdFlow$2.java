package com.ifriend.data.repository.chat.client;

import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.domain.newChat.chat.ChatClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChatClientsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/Flow;", "", "Lkotlin/Pair;", "", "Lcom/ifriend/domain/newChat/chat/ChatClient;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.chat.client.ChatClientsRepositoryImpl$getChatClientsWithChatIdFlow$2", f = "ChatClientsRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatClientsRepositoryImpl$getChatClientsWithChatIdFlow$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Flow<? extends List<? extends Pair<? extends String, ? extends ChatClient>>>>, Object> {
    int label;
    final /* synthetic */ ChatClientsRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatClientsRepositoryImpl$getChatClientsWithChatIdFlow$2(ChatClientsRepositoryImpl chatClientsRepositoryImpl, Continuation<? super ChatClientsRepositoryImpl$getChatClientsWithChatIdFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = chatClientsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatClientsRepositoryImpl$getChatClientsWithChatIdFlow$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Flow<? extends List<? extends Pair<? extends String, ? extends ChatClient>>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Flow<? extends List<? extends Pair<String, ? extends ChatClient>>>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Flow<? extends List<? extends Pair<String, ? extends ChatClient>>>> continuation) {
        return ((ChatClientsRepositoryImpl$getChatClientsWithChatIdFlow$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InMemoryCachedSource cachedSource;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            cachedSource = this.this$0.getCachedSource();
            return FlowKt.filterNotNull(cachedSource.subscribe());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
