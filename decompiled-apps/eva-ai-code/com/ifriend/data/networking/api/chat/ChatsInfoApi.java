package com.ifriend.data.networking.api.chat;

import com.ifriend.data.networking.api.chat.models.UserChatEventRemote;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;
/* compiled from: ChatsInfoApi.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/ifriend/data/networking/api/chat/ChatsInfoApi;", "", "getChatEvents", "", "Lcom/ifriend/data/networking/api/chat/models/UserChatEventRemote;", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatsInfoApi {
    @GET("users/{userId}/events?select=10&omit=0&types=%2Bmessage")
    Object getChatEvents(@Path("userId") String str, Continuation<? super List<UserChatEventRemote>> continuation);
}
