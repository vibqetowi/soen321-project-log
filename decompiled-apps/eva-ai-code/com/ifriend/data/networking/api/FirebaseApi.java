package com.ifriend.data.networking.api;

import com.ifriend.data.networking.requests.SubscribeRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
/* compiled from: FirebaseApi.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\tJ5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\fJ5\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/ifriend/data/networking/api/FirebaseApi;", "", "clearBadges", "Lretrofit2/Response;", "", "auth", "", "id", "request", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribe", "Lcom/ifriend/data/networking/requests/SubscribeRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/requests/SubscribeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unsubscribe", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FirebaseApi {
    @PUT("notifications/cloudmessages/badges/{id}")
    Object clearBadges(@Header("Authorization") String str, @Path("id") String str2, @Body String str3, Continuation<? super Response<Unit>> continuation);

    @POST("notifications/addresses/{id}")
    Object subscribe(@Header("Authorization") String str, @Path("id") String str2, @Body SubscribeRequest subscribeRequest, Continuation<? super Response<Unit>> continuation);

    @POST("notifications/addresses/{id}/delete")
    Object unsubscribe(@Header("Authorization") String str, @Path("id") String str2, @Body SubscribeRequest subscribeRequest, Continuation<? super Response<Unit>> continuation);
}
