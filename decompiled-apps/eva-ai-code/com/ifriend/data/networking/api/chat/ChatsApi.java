package com.ifriend.data.networking.api.chat;

import com.facebook.internal.NativeProtocol;
import com.ifriend.data.networking.api.chat.models.ChatsRootRemote;
import com.ifriend.data.networking.api.chat.models.request.BuyChatRemoteParams;
import com.ifriend.data.networking.api.chat.models.response.benefits.ChatRootSubscriptionBenefitRemote;
import com.ifriend.data.networking.datasources.chat.models.request.ChatUserConfigureRemoteParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
/* compiled from: ChatsApi.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010\tJ%\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0011H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/ifriend/data/networking/api/chat/ChatsApi;", "", "buyChat", "", "userId", "", "chatId", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/data/networking/api/chat/models/request/BuyChatRemoteParams;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/api/chat/models/request/BuyChatRemoteParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatSubscriptionBenefits", "Lcom/ifriend/data/networking/api/chat/models/response/benefits/ChatRootSubscriptionBenefitRemote;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChats", "Lcom/ifriend/data/networking/api/chat/models/ChatsRootRemote;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setChatUserConfigure", "Lcom/ifriend/data/networking/datasources/chat/models/request/ChatUserConfigureRemoteParams;", "(Ljava/lang/String;Lcom/ifriend/data/networking/datasources/chat/models/request/ChatUserConfigureRemoteParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatsApi {
    @POST("ai/chats/userId/{userId}/botId/{botId}/buy")
    Object buyChat(@Path("userId") String str, @Path("botId") String str2, @Body BuyChatRemoteParams buyChatRemoteParams, Continuation<? super Unit> continuation);

    @GET("ai/chats/{userId}/{chatId}/subscription-benefits")
    Object getChatSubscriptionBenefits(@Path("userId") String str, @Path("chatId") String str2, Continuation<? super ChatRootSubscriptionBenefitRemote> continuation);

    @GET("ai/chats/userId/{userId}")
    Object getChats(@Path("userId") String str, Continuation<? super ChatsRootRemote> continuation);

    @POST("ai/chats/{userId}/configure")
    Object setChatUserConfigure(@Path("userId") String str, @Body ChatUserConfigureRemoteParams chatUserConfigureRemoteParams, Continuation<? super Unit> continuation);
}
