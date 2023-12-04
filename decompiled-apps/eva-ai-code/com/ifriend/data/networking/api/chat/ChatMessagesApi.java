package com.ifriend.data.networking.api.chat;

import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareInternalUtility;
import com.ifriend.data.networking.api.chatgifts.models.request.SendChatGiftsRemoteParams;
import com.ifriend.data.networking.datasources.chat.models.request.ApplyFileRequestRemoteParams;
import com.ifriend.data.networking.datasources.chat.models.request.ReadMessageRemoteParams;
import com.ifriend.data.networking.datasources.chat.models.request.RegenerateNewAnswerRemoteParams;
import com.ifriend.data.networking.datasources.chat.models.response.client.BuyChatMessageRemote;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageRemote;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageRemoteParams;
import com.ifriend.data.networking.datasources.chat.models.response.client.InitFirstChatRequest;
import com.ifriend.domain.config.ConfigKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
/* compiled from: ChatMessagesApi.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0002\u0010\nJ/\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J/\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0010JO\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u001aH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u001eH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ9\u0010 \u001a\u00020\u00122\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020!H§@ø\u0001\u0000¢\u0006\u0002\u0010\"J/\u0010#\u001a\u00020\u00122\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u00020\u00062\b\b\u0001\u0010%\u001a\u00020&H§@ø\u0001\u0000¢\u0006\u0002\u0010'J5\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010)\u001a\u00020*H§@ø\u0001\u0000¢\u0006\u0002\u0010+J/\u0010,\u001a\u00020\u00122\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u00020\u00062\b\b\u0001\u0010%\u001a\u00020-H§@ø\u0001\u0000¢\u0006\u0002\u0010.J5\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u000200H§@ø\u0001\u0000¢\u0006\u0002\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lcom/ifriend/data/networking/api/chat/ChatMessagesApi;", "", "applyFile", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "userId", "", ConfigKeys.CLIENT_ID, "request", "Lcom/ifriend/data/networking/datasources/chat/models/request/ApplyFileRequestRemoteParams;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/datasources/chat/models/request/ApplyFileRequestRemoteParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buyMessage", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/BuyChatMessageRemote;", "senderId", "recipientId", "messageId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessages", "", "lowerId", "higherId", "getMessages", "", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemote;", "accept", "omit", "", "select", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initFirstChat", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/InitFirstChatRequest;", "(Ljava/lang/String;Lcom/ifriend/data/networking/datasources/chat/models/response/client/InitFirstChatRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readMessage", "Lcom/ifriend/data/networking/datasources/chat/models/request/ReadMessageRemoteParams;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/datasources/chat/models/request/ReadMessageRemoteParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "regenerateNewAnswer", "chatId", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/data/networking/datasources/chat/models/request/RegenerateNewAnswerRemoteParams;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/datasources/chat/models/request/RegenerateNewAnswerRemoteParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendFile", ShareInternalUtility.STAGING_PARAM, "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendGiftMessage", "Lcom/ifriend/data/networking/api/chatgifts/models/request/SendChatGiftsRemoteParams;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/api/chatgifts/models/request/SendChatGiftsRemoteParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMessage", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemoteParams;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemoteParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatMessagesApi {
    @Headers({"X-Write-Timeout: 180", "Connection: close"})
    @POST("dialogs/messages/sender/{user_id}/recipient/{client_id}")
    Object applyFile(@Path("user_id") String str, @Path("client_id") String str2, @Body ApplyFileRequestRemoteParams applyFileRequestRemoteParams, Continuation<? super Response<ResponseBody>> continuation);

    @POST("dialogs/messages/sender/{sender}/recipient/{recipient}/{messageId}/buy")
    Object buyMessage(@Path("sender") String str, @Path("recipient") String str2, @Path("messageId") String str3, Continuation<? super BuyChatMessageRemote> continuation);

    @DELETE("dialogs/messages/{lowerId}:{higherId}/{messageId}")
    Object deleteMessages(@Path("lowerId") String str, @Path("higherId") String str2, @Path("messageId") String str3, Continuation<? super Unit> continuation);

    @GET("/dialogs/messages/sender/{user_id}/recipient/{client_id}")
    Object getMessages(@Header("Accept") String str, @Path("user_id") String str2, @Path("client_id") String str3, @Query("omit") int i, @Query("select") int i2, Continuation<? super Response<List<ChatMessageRemote>>> continuation);

    @POST("users/{userId}/actions/chat.examined")
    Object initFirstChat(@Path("userId") String str, @Body InitFirstChatRequest initFirstChatRequest, Continuation<? super Response<ResponseBody>> continuation);

    @PATCH("/dialogs/messages/sender/{user_id}/recipient/{client_id}/{message_id}")
    Object readMessage(@Path("user_id") String str, @Path("client_id") String str2, @Path("message_id") String str3, @Body ReadMessageRemoteParams readMessageRemoteParams, Continuation<? super Unit> continuation);

    @POST("/ai/users/{userId}/{chatId}/regenerate-answer")
    Object regenerateNewAnswer(@Path("userId") String str, @Path("chatId") String str2, @Body RegenerateNewAnswerRemoteParams regenerateNewAnswerRemoteParams, Continuation<? super Unit> continuation);

    @Headers({"X-Write-Timeout: 180", "Connection: close"})
    @POST("dialogs/usermedia/{client_id}/{user_id}")
    @Multipart
    Object sendFile(@Path("user_id") String str, @Path("client_id") String str2, @Part MultipartBody.Part part, Continuation<? super Response<Object>> continuation);

    @POST("/dialogs/messages/sender/{userId}/recipient/{chatId}")
    Object sendGiftMessage(@Path("userId") String str, @Path("chatId") String str2, @Body SendChatGiftsRemoteParams sendChatGiftsRemoteParams, Continuation<? super Unit> continuation);

    @POST("/dialogs/messages/sender/{user_id}/recipient/{client_id}")
    Object sendMessage(@Path("user_id") String str, @Path("client_id") String str2, @Body ChatMessageRemoteParams chatMessageRemoteParams, Continuation<? super Response<ResponseBody>> continuation);
}
