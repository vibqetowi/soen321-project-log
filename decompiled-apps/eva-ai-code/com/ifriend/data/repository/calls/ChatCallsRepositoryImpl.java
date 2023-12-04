package com.ifriend.data.repository.calls;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.ifriend.core.remote.datasources.calls.ChatCallsRemoteDataSource;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.domain.data.calls.ChatCallsRepository;
import com.ifriend.domain.logic.calls.models.ChatStartCall;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatCallsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J%\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\rH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u000eJ@\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000f¢\u0006\u0002\b\u0013H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0014J!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0011\u0010\u001c\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0011\u0010\u001e\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ!\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/ifriend/data/repository/calls/ChatCallsRepositoryImpl;", "Lcom/ifriend/domain/data/calls/ChatCallsRepository;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "coreExecuteCatching", "chatCallsRemoteDataSource", "Lcom/ifriend/core/remote/datasources/calls/ChatCallsRemoteDataSource;", "(Lcom/ifriend/data/common/CoreExecuteCatching;Lcom/ifriend/core/remote/datasources/calls/ChatCallsRemoteDataSource;)V", "finishPhrases", "", "", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishCall", "", "callId", "reason", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFinishPhrases", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAvailableCall", "", "refreshFinishCallPhrases", "sendMessage", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "startCall", "Lcom/ifriend/domain/logic/calls/models/ChatStartCall;", "chatId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatCallsRepositoryImpl implements ChatCallsRepository, CoreExecuteCatching {
    private final ChatCallsRemoteDataSource chatCallsRemoteDataSource;
    private final CoreExecuteCatching coreExecuteCatching;
    private List<String> finishPhrases;

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(function2, continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(kFunction, continuation);
    }

    @Inject
    public ChatCallsRepositoryImpl(CoreExecuteCatching coreExecuteCatching, ChatCallsRemoteDataSource chatCallsRemoteDataSource) {
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        Intrinsics.checkNotNullParameter(chatCallsRemoteDataSource, "chatCallsRemoteDataSource");
        this.coreExecuteCatching = coreExecuteCatching;
        this.chatCallsRemoteDataSource = chatCallsRemoteDataSource;
        this.finishPhrases = CollectionsKt.emptyList();
    }

    @Override // com.ifriend.domain.data.calls.ChatCallsRepository
    public Object startCall(String str, Continuation<? super ChatStartCall> continuation) {
        return executeInBackground(new ChatCallsRepositoryImpl$startCall$2(this, str, null), continuation);
    }

    @Override // com.ifriend.domain.data.calls.ChatCallsRepository
    public Object isAvailableCall(Continuation<? super Boolean> continuation) {
        return executeInBackground(new ChatCallsRepositoryImpl$isAvailableCall$2(this, null), continuation);
    }

    @Override // com.ifriend.domain.data.calls.ChatCallsRepository
    public Object getFinishPhrases(Continuation<? super List<String>> continuation) {
        return this.finishPhrases;
    }

    @Override // com.ifriend.domain.data.calls.ChatCallsRepository
    public Object refreshFinishCallPhrases(Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatCallsRepositoryImpl$refreshFinishCallPhrases$2(this, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.calls.ChatCallsRepository
    public Object finishCall(String str, String str2, Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatCallsRepositoryImpl$finishCall$2(this, str, str2, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.calls.ChatCallsRepository
    public Object sendMessage(String str, String str2, Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatCallsRepositoryImpl$sendMessage$2(this, str, str2, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }
}
