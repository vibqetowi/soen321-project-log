package com.ifriend.data.authorization.confirmEmail;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
/* compiled from: ConfirmEmailApi.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u0010H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/ifriend/data/authorization/confirmEmail/ConfirmEmailApi;", "", "confirmEmail", "", "auth", "", "confirmationToken", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resendConfirmEmail", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "id", "request", "Lcom/ifriend/data/authorization/confirmEmail/ResendConfirmEmailRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/authorization/confirmEmail/ResendConfirmEmailRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendConfirmEmail", "Lcom/ifriend/data/authorization/confirmEmail/SendConfirmEmailRequest;", "(Ljava/lang/String;Lcom/ifriend/data/authorization/confirmEmail/SendConfirmEmailRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ConfirmEmailApi {
    @PATCH("notifications/confirmation/electronicmail")
    Object confirmEmail(@Header("Authorization") String str, @Body String str2, Continuation<? super Unit> continuation);

    @POST("reminders/{id}")
    Object resendConfirmEmail(@Header("Authorization") String str, @Path("id") String str2, @Body ResendConfirmEmailRequest resendConfirmEmailRequest, Continuation<? super Response<ResponseBody>> continuation);

    @PATCH("identity")
    Object sendConfirmEmail(@Header("Authorization") String str, @Body SendConfirmEmailRequest sendConfirmEmailRequest, Continuation<? super Response<ResponseBody>> continuation);
}
