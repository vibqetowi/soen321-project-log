package com.ifriend.data.networking.api;

import com.ifriend.data.networking.requests.SetUserAgeRequest;
import com.ifriend.data.networking.requests.SetUserGenderRequest;
import com.ifriend.data.networking.requests.SetUserNameRequest;
import com.ifriend.data.networking.responses.UserDataResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
/* compiled from: UserApi.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ5\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u000fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/ifriend/data/networking/api/UserApi;", "", "getUserData", "Lretrofit2/Response;", "Lcom/ifriend/data/networking/responses/UserDataResponse;", "auth", "", "id", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUserAge", "", "request", "Lcom/ifriend/data/networking/requests/SetUserAgeRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/requests/SetUserAgeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUserGender", "Lcom/ifriend/data/networking/requests/SetUserGenderRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/requests/SetUserGenderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUserName", "Lcom/ifriend/data/networking/requests/SetUserNameRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/requests/SetUserNameRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UserApi {
    @GET("users/private/{id}")
    Object getUserData(@Header("Authorization") String str, @Path("id") String str2, Continuation<? super Response<UserDataResponse>> continuation);

    @PATCH("users/{id}")
    Object setUserAge(@Header("Authorization") String str, @Path("id") String str2, @Body SetUserAgeRequest setUserAgeRequest, Continuation<? super Response<Unit>> continuation);

    @PATCH("users/{id}")
    Object setUserGender(@Header("Authorization") String str, @Path("id") String str2, @Body SetUserGenderRequest setUserGenderRequest, Continuation<? super Response<Unit>> continuation);

    @PATCH("users/{id}")
    Object setUserName(@Header("Authorization") String str, @Path("id") String str2, @Body SetUserNameRequest setUserNameRequest, Continuation<? super Response<Unit>> continuation);
}
