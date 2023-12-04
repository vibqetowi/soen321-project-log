package com.ifriend.data.networking.api;

import com.ifriend.data.networking.requests.SetBotAgeRequest;
import com.ifriend.data.networking.requests.SetBotEthnicityRequest;
import com.ifriend.data.networking.requests.SetBotGenderRequest;
import com.ifriend.data.networking.requests.SetBotNameRequest;
import com.ifriend.data.networking.requests.SetBotPersonalityRequest;
import com.ifriend.data.networking.requests.SetBotVoiceRequest;
import com.ifriend.data.networking.responses.BotDataResponse;
import com.ifriend.domain.models.profile.bot.BotVoiceConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
/* compiled from: BotApi.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000eH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0011H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J5\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0014H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J5\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0017H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J5\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u001aH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ5\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u001dH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/ifriend/data/networking/api/BotApi;", "", "getBotData", "Lretrofit2/Response;", "Lcom/ifriend/data/networking/responses/BotDataResponse;", "auth", "", "id", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVoiceConfig", "Lcom/ifriend/domain/models/profile/bot/BotVoiceConfig;", "setBotAge", "", "request", "Lcom/ifriend/data/networking/requests/SetBotAgeRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/requests/SetBotAgeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setBotEthnicity", "Lcom/ifriend/data/networking/requests/SetBotEthnicityRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/requests/SetBotEthnicityRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setBotGender", "Lcom/ifriend/data/networking/requests/SetBotGenderRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/requests/SetBotGenderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setBotName", "Lcom/ifriend/data/networking/requests/SetBotNameRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/requests/SetBotNameRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setBotPersonality", "Lcom/ifriend/data/networking/requests/SetBotPersonalityRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/requests/SetBotPersonalityRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setBotVoice", "Lcom/ifriend/data/networking/requests/SetBotVoiceRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/requests/SetBotVoiceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BotApi {
    @GET("ai/users/{id}/preferences")
    Object getBotData(@Header("Authorization") String str, @Path("id") String str2, Continuation<? super Response<BotDataResponse>> continuation);

    @GET("ai/users/{id}/voices/configuration")
    Object getVoiceConfig(@Header("Authorization") String str, @Path("id") String str2, Continuation<? super Response<BotVoiceConfig>> continuation);

    @PATCH("ai/users/{id}/preferences")
    Object setBotAge(@Header("Authorization") String str, @Path("id") String str2, @Body SetBotAgeRequest setBotAgeRequest, Continuation<? super Response<Unit>> continuation);

    @PATCH("ai/users/{id}/preferences")
    Object setBotEthnicity(@Header("Authorization") String str, @Path("id") String str2, @Body SetBotEthnicityRequest setBotEthnicityRequest, Continuation<? super Response<Unit>> continuation);

    @PATCH("ai/users/{id}/preferences")
    Object setBotGender(@Header("Authorization") String str, @Path("id") String str2, @Body SetBotGenderRequest setBotGenderRequest, Continuation<? super Response<Unit>> continuation);

    @PATCH("ai/users/{id}/preferences")
    Object setBotName(@Header("Authorization") String str, @Path("id") String str2, @Body SetBotNameRequest setBotNameRequest, Continuation<? super Response<Unit>> continuation);

    @PATCH("ai/users/{id}/preferences")
    Object setBotPersonality(@Header("Authorization") String str, @Path("id") String str2, @Body SetBotPersonalityRequest setBotPersonalityRequest, Continuation<? super Response<Unit>> continuation);

    @PATCH("ai/users/{id}/preferences")
    Object setBotVoice(@Header("Authorization") String str, @Path("id") String str2, @Body SetBotVoiceRequest setBotVoiceRequest, Continuation<? super Response<Unit>> continuation);
}
