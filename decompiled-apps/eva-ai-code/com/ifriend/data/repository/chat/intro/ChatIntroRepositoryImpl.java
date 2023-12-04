package com.ifriend.data.repository.chat.intro;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.data.networking.datasources.chat.ChatConfigurationsRemoteDataSource;
import com.ifriend.data.storages.chat.intro.ChatIntroLocalDataSource;
import com.ifriend.domain.data.chat.ChatIntroRepository;
import com.ifriend.domain.logic.chat.models.ChatIntroSlide;
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
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
/* compiled from: ChatIntroRepositoryImpl.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0002\u0010\bJ%\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0000\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u001aJ@\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0000\u0010\u00172'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001b¢\u0006\u0002\b\u001fH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010 J\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\"\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0019\u0010$\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J!\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010(R-\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/ifriend/data/repository/chat/intro/ChatIntroRepositoryImpl;", "Lcom/ifriend/domain/data/chat/ChatIntroRepository;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "localDataSource", "Lcom/ifriend/data/storages/chat/intro/ChatIntroLocalDataSource;", "remoteDataSource", "Lcom/ifriend/data/networking/datasources/chat/ChatConfigurationsRemoteDataSource;", "coreExecuteCatching", "(Lcom/ifriend/data/storages/chat/intro/ChatIntroLocalDataSource;Lcom/ifriend/data/networking/datasources/chat/ChatConfigurationsRemoteDataSource;Lcom/ifriend/data/common/CoreExecuteCatching;)V", "cachedSource", "Lcom/ifriend/data/common/InMemoryCachedSource;", "", "", "Lcom/ifriend/domain/logic/chat/models/ChatIntroSlide;", "getCachedSource", "()Lcom/ifriend/data/common/InMemoryCachedSource;", "cachedSource$delegate", "Lkotlin/Lazy;", "isIntroLoaded", "", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatIntroSlides", "botId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isChatIntroShown", "setChatIntroShown", "", "isShown", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatIntroRepositoryImpl implements ChatIntroRepository, CoreExecuteCatching {
    private final Lazy cachedSource$delegate;
    private final CoreExecuteCatching coreExecuteCatching;
    private boolean isIntroLoaded;
    private final ChatIntroLocalDataSource localDataSource;
    private final Mutex mutex;
    private final ChatConfigurationsRemoteDataSource remoteDataSource;

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(function2, continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(kFunction, continuation);
    }

    @Inject
    public ChatIntroRepositoryImpl(ChatIntroLocalDataSource localDataSource, ChatConfigurationsRemoteDataSource remoteDataSource, CoreExecuteCatching coreExecuteCatching) {
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteDataSource;
        this.coreExecuteCatching = coreExecuteCatching;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.cachedSource$delegate = LazyKt.lazy(ChatIntroRepositoryImpl$cachedSource$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InMemoryCachedSource<String, List<ChatIntroSlide>> getCachedSource() {
        return (InMemoryCachedSource) this.cachedSource$delegate.getValue();
    }

    @Override // com.ifriend.domain.data.chat.ChatIntroRepository
    public Object getChatIntroSlides(String str, Continuation<? super List<ChatIntroSlide>> continuation) {
        return this.coreExecuteCatching.executeInBackground(new ChatIntroRepositoryImpl$getChatIntroSlides$2(this, str, null), continuation);
    }

    @Override // com.ifriend.domain.data.chat.ChatIntroRepository
    public Object isChatIntroShown(String str, Continuation<? super Boolean> continuation) {
        return this.coreExecuteCatching.executeInBackground(new ChatIntroRepositoryImpl$isChatIntroShown$2(this, str, null), continuation);
    }

    @Override // com.ifriend.domain.data.chat.ChatIntroRepository
    public Object setChatIntroShown(String str, boolean z, Continuation<? super Unit> continuation) {
        Object executeInBackground = this.coreExecuteCatching.executeInBackground(new ChatIntroRepositoryImpl$setChatIntroShown$2(this, str, z, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }
}
