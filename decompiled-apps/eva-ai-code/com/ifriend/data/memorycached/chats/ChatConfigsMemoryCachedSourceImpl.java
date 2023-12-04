package com.ifriend.data.memorycached.chats;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.data.memorycached.chats.mappers.ChatConfigMapper;
import com.ifriend.data.networking.datasources.chat.ChatConfigurationsRemoteDataSource;
import com.ifriend.data.storages.config.AppConfigStorage;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
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
/* compiled from: ChatConfigsMemoryCachedSourceImpl.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0002\u0010\fJ\u0011\u0010\u0018\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ%\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u001fJ@\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c2'\u0010\u001d\u001a#\b\u0001\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001c0\"\u0012\u0006\u0012\u0004\u0018\u00010#0 ¢\u0006\u0002\b$H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010%J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u001d\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120(H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0011\u0010*\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u000b\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lcom/ifriend/data/memorycached/chats/ChatConfigsMemoryCachedSourceImpl;", "Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "remoteDataSource", "Lcom/ifriend/data/networking/datasources/chat/ChatConfigurationsRemoteDataSource;", "appConfigStorage", "Lcom/ifriend/data/storages/config/AppConfigStorage;", "mapper", "Lcom/ifriend/data/memorycached/chats/mappers/ChatConfigMapper;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "coreExecuteCatching", "(Lcom/ifriend/data/networking/datasources/chat/ChatConfigurationsRemoteDataSource;Lcom/ifriend/data/storages/config/AppConfigStorage;Lcom/ifriend/data/memorycached/chats/mappers/ChatConfigMapper;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/data/common/CoreExecuteCatching;)V", "CACHED_KEY", "", "kotlin.jvm.PlatformType", "cachedSource", "Lcom/ifriend/data/common/InMemoryCachedSource;", "", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig;", "getCachedSource", "()Lcom/ifriend/data/common/InMemoryCachedSource;", "cachedSource$delegate", "Lkotlin/Lazy;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatConfigs", "getChatConfigsFlow", "Lkotlinx/coroutines/flow/Flow;", "getRemoteConfigurations", "refresh", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatConfigsMemoryCachedSourceImpl implements ChatConfigsMemoryCachedSource, CoreExecuteCatching {
    private final String CACHED_KEY;
    private final AppConfigStorage appConfigStorage;
    private final Lazy cachedSource$delegate;
    private final CoreExecuteCatching coreExecuteCatching;
    private final DispatcherProvider dispatcherProvider;
    private final ChatConfigMapper mapper;
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
    public ChatConfigsMemoryCachedSourceImpl(ChatConfigurationsRemoteDataSource remoteDataSource, AppConfigStorage appConfigStorage, ChatConfigMapper mapper, DispatcherProvider dispatcherProvider, CoreExecuteCatching coreExecuteCatching) {
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(appConfigStorage, "appConfigStorage");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        this.remoteDataSource = remoteDataSource;
        this.appConfigStorage = appConfigStorage;
        this.mapper = mapper;
        this.dispatcherProvider = dispatcherProvider;
        this.coreExecuteCatching = coreExecuteCatching;
        this.CACHED_KEY = "ChatConfigsMemoryCachedSourceImpl";
        this.cachedSource$delegate = LazyKt.lazy(new ChatConfigsMemoryCachedSourceImpl$cachedSource$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InMemoryCachedSource<String, List<ChatConfig>> getCachedSource() {
        return (InMemoryCachedSource) this.cachedSource$delegate.getValue();
    }

    @Override // com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource
    public Object getChatConfigsFlow(Continuation<? super Flow<? extends List<ChatConfig>>> continuation) {
        return executeInBackground(new ChatConfigsMemoryCachedSourceImpl$getChatConfigsFlow$2(this, null), continuation);
    }

    @Override // com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource
    public Object getChatConfigs(Continuation<? super List<ChatConfig>> continuation) {
        return executeInBackground(new ChatConfigsMemoryCachedSourceImpl$getChatConfigs$2(this, null), continuation);
    }

    @Override // com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource
    public Object refresh(Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatConfigsMemoryCachedSourceImpl$refresh$2(this, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getRemoteConfigurations(Continuation<? super List<ChatConfig>> continuation) {
        return executeInBackground(new ChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2(this, null), continuation);
    }

    @Override // com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource
    public Object clear(Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatConfigsMemoryCachedSourceImpl$clear$2(this, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }
}
