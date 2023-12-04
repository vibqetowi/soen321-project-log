package com.ifriend.core.remote.datasources.calls;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.common.RetryKt;
import com.ifriend.core.remote.datasources.calls.models.response.ChatCallPhrasesRemote;
import com.ifriend.core.remote.datasources.calls.models.response.ChatStartCallRemote;
import com.ifriend.core.remote.services.CallsApiService;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatCallsRemoteDataSource.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ!\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/ifriend/core/remote/datasources/calls/ChatCallsRemoteDataSource;", "", "apiService", "Lcom/ifriend/core/remote/services/CallsApiService;", "authLocalDataSource", "Lcom/ifriend/core/local/api/AuthLocalDataSource;", "(Lcom/ifriend/core/remote/services/CallsApiService;Lcom/ifriend/core/local/api/AuthLocalDataSource;)V", "finishCall", "", "callId", "", "reason", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFinishPhrases", "Lcom/ifriend/core/remote/datasources/calls/models/response/ChatCallPhrasesRemote;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAvailable", "", "sendMessage", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "startCall", "Lcom/ifriend/core/remote/datasources/calls/models/response/ChatStartCallRemote;", "chatId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatCallsRemoteDataSource {
    private final CallsApiService apiService;
    private final AuthLocalDataSource authLocalDataSource;

    @Inject
    public ChatCallsRemoteDataSource(CallsApiService apiService, AuthLocalDataSource authLocalDataSource) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(authLocalDataSource, "authLocalDataSource");
        this.apiService = apiService;
        this.authLocalDataSource = authLocalDataSource;
    }

    public final Object isAvailable(Continuation<? super Boolean> continuation) {
        return RetryKt.oneTimeRetryRemoteRequest(new ChatCallsRemoteDataSource$isAvailable$2(this, null), continuation);
    }

    public final Object getFinishPhrases(Continuation<? super ChatCallPhrasesRemote> continuation) {
        return RetryKt.oneTimeRetryRemoteRequest(new ChatCallsRemoteDataSource$getFinishPhrases$2(this, null), continuation);
    }

    public final Object finishCall(String str, String str2, Continuation<? super Unit> continuation) {
        Object oneTimeRetryRemoteRequest = RetryKt.oneTimeRetryRemoteRequest(new ChatCallsRemoteDataSource$finishCall$2(this, str, str2, null), continuation);
        return oneTimeRetryRemoteRequest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? oneTimeRetryRemoteRequest : Unit.INSTANCE;
    }

    public final Object startCall(String str, Continuation<? super ChatStartCallRemote> continuation) {
        return RetryKt.oneTimeRetryRemoteRequest(new ChatCallsRemoteDataSource$startCall$2(this, str, null), continuation);
    }

    public final Object sendMessage(String str, String str2, Continuation<? super Unit> continuation) {
        Object oneTimeRetryRemoteRequest = RetryKt.oneTimeRetryRemoteRequest(new ChatCallsRemoteDataSource$sendMessage$2(this, str2, str, null), continuation);
        return oneTimeRetryRemoteRequest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? oneTimeRetryRemoteRequest : Unit.INSTANCE;
    }
}
