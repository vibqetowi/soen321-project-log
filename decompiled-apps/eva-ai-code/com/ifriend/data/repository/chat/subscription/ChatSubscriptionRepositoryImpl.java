package com.ifriend.data.repository.chat.subscription;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.data.mappers.subscription.ChatSubscriptionBenefitsMapper;
import com.ifriend.data.networking.api.chat.models.response.benefits.ChatSubscriptionBenefitRemote;
import com.ifriend.data.networking.datasources.chat.ChatsRemoteDataSource;
import com.ifriend.domain.data.chat.subscription.ChatSubscriptionRepository;
import com.ifriend.domain.logic.chat.subscription.models.ChatSubscriptionBenefits;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChatSubscriptionRepositoryImpl.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0012\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J%\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0000\u0010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0019J@\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0000\u0010\u00162'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001a¢\u0006\u0002\b\u001eH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\f2\u0006\u0010\"\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010#J%\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0%2\u0006\u0010\"\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0019\u0010&\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#R-\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/ifriend/data/repository/chat/subscription/ChatSubscriptionRepositoryImpl;", "Lcom/ifriend/domain/data/chat/subscription/ChatSubscriptionRepository;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "coreExecuteCatching", "chatsRemoteDataSource", "Lcom/ifriend/data/networking/datasources/chat/ChatsRemoteDataSource;", "chatSubscriptionBenefitsMapper", "Lcom/ifriend/data/mappers/subscription/ChatSubscriptionBenefitsMapper;", "(Lcom/ifriend/data/common/CoreExecuteCatching;Lcom/ifriend/data/networking/datasources/chat/ChatsRemoteDataSource;Lcom/ifriend/data/mappers/subscription/ChatSubscriptionBenefitsMapper;)V", "cachedSource", "Lcom/ifriend/data/common/InMemoryCachedSource;", "", "", "Lcom/ifriend/domain/logic/chat/subscription/models/ChatSubscriptionBenefits;", "getCachedSource", "()Lcom/ifriend/data/common/InMemoryCachedSource;", "cachedSource$delegate", "Lkotlin/Lazy;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBenefitsFromRemote", "Lcom/ifriend/data/networking/api/chat/models/response/benefits/ChatSubscriptionBenefitRemote;", "chatId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscriptionBenefitsFlow", "Lkotlinx/coroutines/flow/Flow;", "refreshSubscriptionBenefits", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionRepositoryImpl implements ChatSubscriptionRepository, CoreExecuteCatching {
    private final Lazy cachedSource$delegate;
    private final ChatSubscriptionBenefitsMapper chatSubscriptionBenefitsMapper;
    private final ChatsRemoteDataSource chatsRemoteDataSource;
    private final CoreExecuteCatching coreExecuteCatching;

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(function2, continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(kFunction, continuation);
    }

    @Inject
    public ChatSubscriptionRepositoryImpl(CoreExecuteCatching coreExecuteCatching, ChatsRemoteDataSource chatsRemoteDataSource, ChatSubscriptionBenefitsMapper chatSubscriptionBenefitsMapper) {
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        Intrinsics.checkNotNullParameter(chatsRemoteDataSource, "chatsRemoteDataSource");
        Intrinsics.checkNotNullParameter(chatSubscriptionBenefitsMapper, "chatSubscriptionBenefitsMapper");
        this.coreExecuteCatching = coreExecuteCatching;
        this.chatsRemoteDataSource = chatsRemoteDataSource;
        this.chatSubscriptionBenefitsMapper = chatSubscriptionBenefitsMapper;
        this.cachedSource$delegate = LazyKt.lazy(new ChatSubscriptionRepositoryImpl$cachedSource$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InMemoryCachedSource<String, List<ChatSubscriptionBenefits>> getCachedSource() {
        return (InMemoryCachedSource) this.cachedSource$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getBenefitsFromRemote(String str, Continuation<? super List<ChatSubscriptionBenefitRemote>> continuation) {
        return executeInBackground(new ChatSubscriptionRepositoryImpl$getBenefitsFromRemote$2(this, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // com.ifriend.domain.data.chat.subscription.ChatSubscriptionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getSubscriptionBenefitsFlow(String str, Continuation<? super Flow<? extends List<ChatSubscriptionBenefits>>> continuation) {
        ChatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1 chatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1;
        int i;
        if (continuation instanceof ChatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1) {
            chatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1 = (ChatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1) continuation;
            if ((chatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1.label & Integer.MIN_VALUE) != 0) {
                chatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1.label -= Integer.MIN_VALUE;
                Object obj = chatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    InMemoryCachedSource<String, List<ChatSubscriptionBenefits>> cachedSource = getCachedSource();
                    InMemoryCachedSource.Strategy strategy = InMemoryCachedSource.Strategy.LOAD_IF_NO_CACHE;
                    chatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1.label = 1;
                    obj = cachedSource.get(str, strategy, chatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return FlowKt.filterNotNull((Flow) obj);
            }
        }
        chatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1 = new ChatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1(this, continuation);
        Object obj2 = chatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1.label;
        if (i != 0) {
        }
        return FlowKt.filterNotNull((Flow) obj2);
    }

    @Override // com.ifriend.domain.data.chat.subscription.ChatSubscriptionRepository
    public Object refreshSubscriptionBenefits(String str, Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatSubscriptionRepositoryImpl$refreshSubscriptionBenefits$2(this, str, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.chat.subscription.ChatSubscriptionRepository
    public Object clear(Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatSubscriptionRepositoryImpl$clear$2(this, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }
}
