package com.ifriend.chat.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.DELETE;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;
/* compiled from: UserApi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J?\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ5\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/data/UserApi;", "", "deleteUser", "Lretrofit2/Response;", "auth", "", "id", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetAi", "Lokhttp3/ResponseBody;", "userId", "botId", "deleteFrom", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetAllAi", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UserApi {
    @DELETE("users/{id}")
    Object deleteUser(@Header("Authorization") String str, @Path("id") String str2, Continuation<? super Response<Object>> continuation);

    @DELETE("dialogs/messages/{userId}:{botId}/period")
    Object resetAi(@Header("Authorization") String str, @Path("userId") String str2, @Path("botId") String str3, @Query("deleteFrom") String str4, Continuation<? super Response<ResponseBody>> continuation);

    @DELETE("dialogs/messages/{userId}:{botId}/period?deleteAll=true")
    Object resetAllAi(@Header("Authorization") String str, @Path("userId") String str2, @Path("botId") String str3, Continuation<? super Response<ResponseBody>> continuation);
}
