package com.ifriend.data.networking.api;

import com.ifriend.data.networking.responses.ConfigurationResponse;
import com.ifriend.data.networking.responses.EmailRegistrationRequest;
import com.ifriend.data.networking.responses.EmailRegistrationResponse;
import com.ifriend.domain.models.authorization.SignInResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
/* compiled from: RegistrationApi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/networking/api/RegistrationApi;", "", "emailRegistration", "Lretrofit2/Response;", "Lcom/ifriend/data/networking/responses/EmailRegistrationResponse;", "request", "Lcom/ifriend/data/networking/responses/EmailRegistrationRequest;", "(Lcom/ifriend/data/networking/responses/EmailRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConfiguration", "Lcom/ifriend/data/networking/responses/ConfigurationResponse;", "auth", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signIn", "Lcom/ifriend/domain/models/authorization/SignInResponse;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface RegistrationApi {
    @PUT("identity")
    Object emailRegistration(@Body EmailRegistrationRequest emailRegistrationRequest, Continuation<? super Response<EmailRegistrationResponse>> continuation);

    @GET("/ai/configuration")
    Object getConfiguration(@Header("Authorization") String str, Continuation<? super Response<ConfigurationResponse>> continuation);

    @GET("identity")
    Object signIn(@Header("Authorization") String str, Continuation<? super Response<SignInResponse>> continuation);
}
