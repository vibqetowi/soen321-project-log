package com.ifriend.data.repository.chat.info;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatsInfoConfigurationRepositoryImpl.kt */
@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u000b\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0011\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0013H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0014J@\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112'\u0010\u0012\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015¢\u0006\u0002\b\u0019H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0011\u0010\u001b\u001a\u00020\u001cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/ifriend/data/repository/chat/info/ChatsInfoConfigurationRepositoryImpl;", "Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "coreExecuteCatching", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "(Lcom/ifriend/data/common/CoreExecuteCatching;Lcom/ifriend/core/tools/api/DispatcherProvider;Landroidx/datastore/core/DataStore;)V", "lastActiveChatId", "com/ifriend/data/repository/chat/info/ChatsInfoConfigurationRepositoryImpl$lastActiveChatId$1", "Lcom/ifriend/data/repository/chat/info/ChatsInfoConfigurationRepositoryImpl$lastActiveChatId$1;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastActiveChatId", "", "setLastActiveChat", "chatId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsInfoConfigurationRepositoryImpl implements ChatsInfoConfigurationRepository, CoreExecuteCatching {
    private final CoreExecuteCatching coreExecuteCatching;
    private final DataStore<Preferences> dataStore;
    private final DispatcherProvider dispatcherProvider;
    private final ChatsInfoConfigurationRepositoryImpl$lastActiveChatId$1 lastActiveChatId;

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(function2, continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(kFunction, continuation);
    }

    @Inject
    public ChatsInfoConfigurationRepositoryImpl(CoreExecuteCatching coreExecuteCatching, DispatcherProvider dispatcherProvider, DataStore<Preferences> dataStore) {
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.coreExecuteCatching = coreExecuteCatching;
        this.dispatcherProvider = dispatcherProvider;
        this.dataStore = dataStore;
        this.lastActiveChatId = new ChatsInfoConfigurationRepositoryImpl$lastActiveChatId$1(this);
    }

    @Override // com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository
    public Object setLastActiveChat(String str, Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatsInfoConfigurationRepositoryImpl$setLastActiveChat$2(this, str, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository
    public Object getLastActiveChatId(Continuation<? super String> continuation) {
        return executeInBackground(new ChatsInfoConfigurationRepositoryImpl$getLastActiveChatId$2(this, null), continuation);
    }

    @Override // com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository
    public Object clear(Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatsInfoConfigurationRepositoryImpl$clear$2(this, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }
}
