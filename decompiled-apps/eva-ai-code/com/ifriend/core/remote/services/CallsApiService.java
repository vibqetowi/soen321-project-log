package com.ifriend.core.remote.services;

import com.facebook.internal.NativeProtocol;
import com.ifriend.core.remote.common.models.AvailableRemote;
import com.ifriend.core.remote.datasources.calls.models.request.ChatCallSendMessageRemoteParams;
import com.ifriend.core.remote.datasources.calls.models.request.ChatFinishCallRemoteParams;
import com.ifriend.core.remote.datasources.calls.models.response.ChatCallPhrasesRemote;
import com.ifriend.core.remote.datasources.calls.models.response.ChatStartCallRemote;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
/* compiled from: CallsApiService.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ/\u0010\u0010\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0011H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J%\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/ifriend/core/remote/services/CallsApiService;", "", "finishCall", "", "userId", "", "callId", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/core/remote/datasources/calls/models/request/ChatFinishCallRemoteParams;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/core/remote/datasources/calls/models/request/ChatFinishCallRemoteParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPhrases", "Lcom/ifriend/core/remote/datasources/calls/models/response/ChatCallPhrasesRemote;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAvailable", "Lcom/ifriend/core/remote/common/models/AvailableRemote;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMessage", "Lcom/ifriend/core/remote/datasources/calls/models/request/ChatCallSendMessageRemoteParams;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/core/remote/datasources/calls/models/request/ChatCallSendMessageRemoteParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startCall", "Lcom/ifriend/core/remote/datasources/calls/models/response/ChatStartCallRemote;", "chatId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CallsApiService {
    @POST("ai/call/userId/{userId}/callId/{callId}/finish")
    Object finishCall(@Path("userId") String str, @Path("callId") String str2, @Body ChatFinishCallRemoteParams chatFinishCallRemoteParams, Continuation<? super Unit> continuation);

    @GET("ai/configuration/call")
    Object getPhrases(Continuation<? super ChatCallPhrasesRemote> continuation);

    @GET("ai/call/userId/{userId}/available")
    Object isAvailable(@Path("userId") String str, Continuation<? super AvailableRemote> continuation);

    @POST("ai/call/userId/{userId}/callId/{callId}/message")
    Object sendMessage(@Path("userId") String str, @Path("callId") String str2, @Body ChatCallSendMessageRemoteParams chatCallSendMessageRemoteParams, Continuation<? super Unit> continuation);

    @PUT("ai/call/userId/{userId}/botId/{chatId}/start")
    Object startCall(@Path("userId") String str, @Path("chatId") String str2, Continuation<? super ChatStartCallRemote> continuation);
}
