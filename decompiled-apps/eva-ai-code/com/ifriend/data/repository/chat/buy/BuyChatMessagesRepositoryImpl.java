package com.ifriend.data.repository.chat.buy;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.networking.datasources.chat.ChatMessagesRemoteDataSource;
import com.ifriend.domain.data.chat.BuyChatMessagesRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: BuyChatMessagesRepositoryImpl.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J)\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0011H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0012J@\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/ifriend/data/repository/chat/buy/BuyChatMessagesRepositoryImpl;", "Lcom/ifriend/domain/data/chat/BuyChatMessagesRepository;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "chatMessagesRemoteDataSource", "Lcom/ifriend/data/networking/datasources/chat/ChatMessagesRemoteDataSource;", "coreExecuteCatching", "(Lcom/ifriend/data/networking/datasources/chat/ChatMessagesRemoteDataSource;Lcom/ifriend/data/common/CoreExecuteCatching;)V", "buyMessage", "", "messageId", "", "senderId", "recipientId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyChatMessagesRepositoryImpl implements BuyChatMessagesRepository, CoreExecuteCatching {
    private final ChatMessagesRemoteDataSource chatMessagesRemoteDataSource;
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
    public BuyChatMessagesRepositoryImpl(ChatMessagesRemoteDataSource chatMessagesRemoteDataSource, CoreExecuteCatching coreExecuteCatching) {
        Intrinsics.checkNotNullParameter(chatMessagesRemoteDataSource, "chatMessagesRemoteDataSource");
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        this.chatMessagesRemoteDataSource = chatMessagesRemoteDataSource;
        this.coreExecuteCatching = coreExecuteCatching;
    }

    @Override // com.ifriend.domain.data.chat.BuyChatMessagesRepository
    public Object buyMessage(String str, String str2, String str3, Continuation<? super Boolean> continuation) {
        return executeInBackground(new BuyChatMessagesRepositoryImpl$buyMessage$2(this, str, str2, str3, null), continuation);
    }
}
