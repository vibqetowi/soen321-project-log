package com.ifriend.data.repository.chat.client;

import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.data.repository.chat.providers.ChatClientProvider;
import com.ifriend.domain.newChat.chat.ChatClient;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
/* compiled from: ChatClientsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/ifriend/domain/newChat/chat/ChatClient;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.chat.client.ChatClientsRepositoryImpl$getChatClient$2", f = "ChatClientsRepositoryImpl.kt", i = {0, 1, 1}, l = {64, 32}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "chat"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes6.dex */
final class ChatClientsRepositoryImpl$getChatClient$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChatClient>, Object> {
    final /* synthetic */ String $chatId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ChatClientsRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatClientsRepositoryImpl$getChatClient$2(ChatClientsRepositoryImpl chatClientsRepositoryImpl, String str, Continuation<? super ChatClientsRepositoryImpl$getChatClient$2> continuation) {
        super(2, continuation);
        this.this$0 = chatClientsRepositoryImpl;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatClientsRepositoryImpl$getChatClient$2(this.this$0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ChatClient> continuation) {
        return ((ChatClientsRepositoryImpl$getChatClient$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        ChatClientsRepositoryImpl chatClientsRepositoryImpl;
        String str;
        Mutex mutex2;
        Throwable th;
        InMemoryCachedSource cachedSource;
        ChatClientProvider chatClientProvider;
        InMemoryCachedSource cachedSource2;
        ChatClient chatClient;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.this$0.mutex;
                ChatClientsRepositoryImpl chatClientsRepositoryImpl2 = this.this$0;
                String str2 = this.$chatId;
                this.L$0 = mutex;
                this.L$1 = chatClientsRepositoryImpl2;
                this.L$2 = str2;
                this.label = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                chatClientsRepositoryImpl = chatClientsRepositoryImpl2;
                str = str2;
            } else if (i != 1) {
                if (i == 2) {
                    chatClient = (ChatClient) this.L$1;
                    mutex2 = (Mutex) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        mutex2.unlock(null);
                        return chatClient;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                str = (String) this.L$2;
                chatClientsRepositoryImpl = (ChatClientsRepositoryImpl) this.L$1;
                ResultKt.throwOnFailure(obj);
                mutex = (Mutex) this.L$0;
            }
            cachedSource = chatClientsRepositoryImpl.getCachedSource();
            ChatClient chatClient2 = (ChatClient) cachedSource.getFromCache(str);
            if (chatClient2 == null) {
                chatClientProvider = chatClientsRepositoryImpl.chatProvider;
                ChatClient chatClient3 = chatClientProvider.getChatClient(str);
                cachedSource2 = chatClientsRepositoryImpl.getCachedSource();
                this.L$0 = mutex;
                this.L$1 = chatClient3;
                this.L$2 = null;
                this.label = 2;
                if (cachedSource2.replace(str, chatClient3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex2 = mutex;
                chatClient = chatClient3;
                mutex2.unlock(null);
                return chatClient;
            }
            mutex.unlock(null);
            return chatClient2;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }
}
