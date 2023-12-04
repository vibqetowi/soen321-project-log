package com.ifriend.data.networking.api;

import com.ifriend.data.networking.requests.GenerateBotAvatarRequest;
import com.ifriend.data.networking.responses.AvatarInfoResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
/* compiled from: GenerateBotAvatarApi.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\tJ+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0010H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ?\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ5\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\tJa\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001d0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010$J5\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/ifriend/data/networking/api/GenerateBotAvatarApi;", "", "applyAvatar", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "auth", "", "userId", "avatarId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyDefaultAvatar", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAvatar", "Lcom/ifriend/data/networking/api/GenerateBotAvatarResponse;", "id", "request", "Lcom/ifriend/data/networking/requests/GenerateBotAvatarRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/requests/GenerateBotAvatarRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppliedAvatarFile", "getAvatarAnimationFile", "root", "getAvatarFile", "size", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAvatarInfo", "Lcom/ifriend/data/networking/responses/AvatarInfoResponse;", "getGeneration", "Lcom/ifriend/data/networking/api/AvatarGenerationResponse;", "getGenerations", "", "isActive", "", "take", "", "skip", "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setActive", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GenerateBotAvatarApi {
    @POST("/avatars/v2/{userId}/apply/{avatarId}")
    Object applyAvatar(@Header("Authorization") String str, @Path("userId") String str2, @Path("avatarId") String str3, Continuation<? super Response<ResponseBody>> continuation);

    @POST("/avatars/v2/{userId}/default")
    Object applyDefaultAvatar(@Header("Authorization") String str, @Path("userId") String str2, Continuation<? super Response<ResponseBody>> continuation);

    @POST("avatars/v2/{id}/generate")
    Object createAvatar(@Header("Authorization") String str, @Path("id") String str2, @Body GenerateBotAvatarRequest generateBotAvatarRequest, Continuation<? super Response<GenerateBotAvatarResponse>> continuation);

    @GET("/avatars/{userId}/file")
    Object getAppliedAvatarFile(@Header("Authorization") String str, @Path("userId") String str2, Continuation<? super Response<ResponseBody>> continuation);

    @GET("{root}")
    Object getAvatarAnimationFile(@Header("Authorization") String str, @Path(encoded = true, value = "root") String str2, Continuation<? super Response<ResponseBody>> continuation);

    @GET("/avatars/{userId}/files/{avatarId}.x{size}")
    Object getAvatarFile(@Header("Authorization") String str, @Path("userId") String str2, @Path("avatarId") String str3, @Path("size") String str4, Continuation<? super Response<ResponseBody>> continuation);

    @GET("/avatars/{userId}/info")
    Object getAvatarInfo(@Header("Authorization") String str, @Path("userId") String str2, Continuation<? super Response<AvatarInfoResponse>> continuation);

    @GET("/avatars/v2/{userId}/generation/{generationId}")
    Object getGeneration(@Header("Authorization") String str, @Path("userId") String str2, @Path("generationId") String str3, Continuation<? super Response<AvatarGenerationResponse>> continuation);

    @GET("/avatars/v2/{userId}/generation")
    Object getGenerations(@Header("Authorization") String str, @Path("userId") String str2, @Query("isActive") Boolean bool, @Query("take") Integer num, @Query("skip") Integer num2, @Query("status") String str3, Continuation<? super Response<List<AvatarGenerationResponse>>> continuation);

    @POST("/avatars/v2/{userId}/generation/{generationId}/active")
    Object setActive(@Header("Authorization") String str, @Path("userId") String str2, @Path("generationId") String str3, Continuation<? super Response<ResponseBody>> continuation);

    /* compiled from: GenerateBotAvatarApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getGenerations$default(GenerateBotAvatarApi generateBotAvatarApi, String str, String str2, Boolean bool, Integer num, Integer num2, String str3, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return generateBotAvatarApi.getGenerations(str, str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str3, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGenerations");
        }
    }
}
