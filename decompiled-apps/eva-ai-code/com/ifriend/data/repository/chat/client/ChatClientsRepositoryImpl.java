package com.ifriend.data.repository.chat.client;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.data.repository.chat.providers.ChatClientProvider;
import com.ifriend.domain.data.chat.ChatClientsRepository;
import com.ifriend.domain.newChat.chat.ChatClient;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
/* compiled from: ChatClientsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0011\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J%\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001aH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u001bJ@\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u00182'\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001c¢\u0006\u0002\b H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0%0$H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J)\u0010&\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0'0%0$H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/ifriend/data/repository/chat/client/ChatClientsRepositoryImpl;", "Lcom/ifriend/domain/data/chat/ChatClientsRepository;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "chatProvider", "Lcom/ifriend/data/repository/chat/providers/ChatClientProvider;", "coreExecuteCatching", "(Lcom/ifriend/data/repository/chat/providers/ChatClientProvider;Lcom/ifriend/data/common/CoreExecuteCatching;)V", "cachedSource", "Lcom/ifriend/data/common/InMemoryCachedSource;", "", "Lcom/ifriend/domain/newChat/chat/ChatClient;", "getCachedSource", "()Lcom/ifriend/data/common/InMemoryCachedSource;", "cachedSource$delegate", "Lkotlin/Lazy;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "clearAllChatClients", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearChatClient", "chatId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatClient", "getChatClientsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "getChatClientsWithChatIdFlow", "Lkotlin/Pair;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatClientsRepositoryImpl implements ChatClientsRepository, CoreExecuteCatching {
    private final Lazy cachedSource$delegate;
    private final ChatClientProvider chatProvider;
    private final CoreExecuteCatching coreExecuteCatching;
    private final Mutex mutex;

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(function2, continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(kFunction, continuation);
    }

    @Inject
    public ChatClientsRepositoryImpl(ChatClientProvider chatProvider, CoreExecuteCatching coreExecuteCatching) {
        Intrinsics.checkNotNullParameter(chatProvider, "chatProvider");
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        this.chatProvider = chatProvider;
        this.coreExecuteCatching = coreExecuteCatching;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.cachedSource$delegate = LazyKt.lazy(ChatClientsRepositoryImpl$cachedSource$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InMemoryCachedSource<String, ChatClient> getCachedSource() {
        return (InMemoryCachedSource) this.cachedSource$delegate.getValue();
    }

    @Override // com.ifriend.domain.data.chat.ChatClientsRepository
    public Object getChatClient(String str, Continuation<? super ChatClient> continuation) {
        return executeInBackground(new ChatClientsRepositoryImpl$getChatClient$2(this, str, null), continuation);
    }

    @Override // com.ifriend.domain.data.chat.ChatClientsRepository
    public Object clearChatClient(String str, Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatClientsRepositoryImpl$clearChatClient$2(this, str, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.chat.ChatClientsRepository
    public Object clearAllChatClients(Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatClientsRepositoryImpl$clearAllChatClients$2(this, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.chat.ChatClientsRepository
    public Object getChatClientsFlow(Continuation<? super Flow<? extends List<? extends ChatClient>>> continuation) {
        return executeInBackground(new ChatClientsRepositoryImpl$getChatClientsFlow$2(this, null), continuation);
    }

    @Override // com.ifriend.domain.data.chat.ChatClientsRepository
    public Object getChatClientsWithChatIdFlow(Continuation<? super Flow<? extends List<? extends Pair<String, ? extends ChatClient>>>> continuation) {
        return executeInBackground(new ChatClientsRepositoryImpl$getChatClientsWithChatIdFlow$2(this, null), continuation);
    }
}
