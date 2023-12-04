package com.ifriend.data.repository.topics;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.data.networking.datasources.topics.ChatTopicsRemoteDataSource;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.topics.ChatTopicsRepository;
import com.ifriend.domain.logic.topics.models.ChatTopic;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
/* compiled from: ChatTopicsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J%\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001aH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u001bJ@\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u00182'\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001c¢\u0006\u0002\b H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010!J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0015\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010#J'\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0%2\u0006\u0010\u0015\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0019\u0010&\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/ifriend/data/repository/topics/ChatTopicsRepositoryImpl;", "Lcom/ifriend/domain/data/topics/ChatTopicsRepository;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "coreExecuteCatching", "remoteDataSource", "Lcom/ifriend/data/networking/datasources/topics/ChatTopicsRemoteDataSource;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "(Lcom/ifriend/data/common/CoreExecuteCatching;Lcom/ifriend/data/networking/datasources/topics/ChatTopicsRemoteDataSource;Lcom/ifriend/domain/data/AuthDataProvider;)V", "cachedSource", "Lcom/ifriend/data/common/InMemoryCachedSource;", "", "", "Lcom/ifriend/domain/logic/topics/models/ChatTopic;", "getCachedSource", "()Lcom/ifriend/data/common/InMemoryCachedSource;", "cachedSource$delegate", "Lkotlin/Lazy;", "activateTopic", "", "topicId", "chatId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopics", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopicsFlow", "Lkotlinx/coroutines/flow/Flow;", "refresh", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatTopicsRepositoryImpl implements ChatTopicsRepository, CoreExecuteCatching {
    private final AuthDataProvider authDataProvider;
    private final Lazy cachedSource$delegate;
    private final CoreExecuteCatching coreExecuteCatching;
    private final ChatTopicsRemoteDataSource remoteDataSource;

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(function2, continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(kFunction, continuation);
    }

    @Inject
    public ChatTopicsRepositoryImpl(CoreExecuteCatching coreExecuteCatching, ChatTopicsRemoteDataSource remoteDataSource, AuthDataProvider authDataProvider) {
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        this.coreExecuteCatching = coreExecuteCatching;
        this.remoteDataSource = remoteDataSource;
        this.authDataProvider = authDataProvider;
        this.cachedSource$delegate = LazyKt.lazy(ChatTopicsRepositoryImpl$cachedSource$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InMemoryCachedSource<String, List<ChatTopic>> getCachedSource() {
        return (InMemoryCachedSource) this.cachedSource$delegate.getValue();
    }

    @Override // com.ifriend.domain.data.topics.ChatTopicsRepository
    public Object getTopicsFlow(String str, Continuation<? super Flow<? extends List<ChatTopic>>> continuation) {
        return getCachedSource().subscribeByKey(str);
    }

    @Override // com.ifriend.domain.data.topics.ChatTopicsRepository
    public Object refresh(String str, Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatTopicsRepositoryImpl$refresh$2(this, str, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getTopics(String str, Continuation<? super List<ChatTopic>> continuation) {
        return executeInBackground(new ChatTopicsRepositoryImpl$getTopics$2(this, str, null), continuation);
    }

    @Override // com.ifriend.domain.data.topics.ChatTopicsRepository
    public Object activateTopic(String str, String str2, Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatTopicsRepositoryImpl$activateTopic$2(this, str, str2, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }
}
