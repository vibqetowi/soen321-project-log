package com.ifriend.data.networking.api.chatgifts;

import com.ifriend.data.networking.api.chatgifts.models.response.ChatGiftsRemote;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
/* compiled from: ChatGiftsApi.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/data/networking/api/chatgifts/ChatGiftsApi;", "", "getGifts", "", "Lcom/ifriend/data/networking/api/chatgifts/models/response/ChatGiftsRemote;", "auth", "", "userId", "chatId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatGiftsApi {
    @GET("ai/gifts/config/{userId}/{botId}")
    Object getGifts(@Header("Authorization") String str, @Path("userId") String str2, @Path("botId") String str3, Continuation<? super List<ChatGiftsRemote>> continuation);
}
