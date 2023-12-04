package com.ifriend.data.repository.chat;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.networking.datasources.chat.ChatsRemoteDataSource;
import com.ifriend.domain.data.chat.ChatsRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fJ%\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0011J@\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0012¢\u0006\u0002\b\u0016H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0011\u0010\u0018\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/ifriend/data/repository/chat/ChatsRepositoryImpl;", "Lcom/ifriend/domain/data/chat/ChatsRepository;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "coreExecuteCatching", "chatsRemoteDataSource", "Lcom/ifriend/data/networking/datasources/chat/ChatsRemoteDataSource;", "(Lcom/ifriend/data/common/CoreExecuteCatching;Lcom/ifriend/data/networking/datasources/chat/ChatsRemoteDataSource;)V", "buyChat", "", "chatId", "", "paymentType", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setChatUserConfigure", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsRepositoryImpl implements ChatsRepository, CoreExecuteCatching {
    public static final Companion Companion = new Companion(null);
    private static final String SUBSCRIPTION_BOT_FEATURE = "subscription-bot";
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
    public ChatsRepositoryImpl(CoreExecuteCatching coreExecuteCatching, ChatsRemoteDataSource chatsRemoteDataSource) {
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        Intrinsics.checkNotNullParameter(chatsRemoteDataSource, "chatsRemoteDataSource");
        this.coreExecuteCatching = coreExecuteCatching;
        this.chatsRemoteDataSource = chatsRemoteDataSource;
    }

    /* compiled from: ChatsRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/data/repository/chat/ChatsRepositoryImpl$Companion;", "", "()V", "SUBSCRIPTION_BOT_FEATURE", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.ifriend.domain.data.chat.ChatsRepository
    public Object buyChat(String str, String str2, Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatsRepositoryImpl$buyChat$2(this, str, str2, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.chat.ChatsRepository
    public Object setChatUserConfigure(Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatsRepositoryImpl$setChatUserConfigure$2(this, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }
}
