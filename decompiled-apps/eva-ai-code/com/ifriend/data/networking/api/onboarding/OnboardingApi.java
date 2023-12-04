package com.ifriend.data.networking.api.onboarding;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonObject;
import com.ifriend.data.networking.api.onboarding.models.OnboardingAnswersResponse;
import com.ifriend.data.networking.api.onboarding.models.OnboardingChatsRootRemote;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
/* compiled from: OnboardingApi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/networking/api/onboarding/OnboardingApi;", "", "getOnboardingAnswers", "Lretrofit2/Response;", "Lcom/ifriend/data/networking/api/onboarding/models/OnboardingAnswersResponse;", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOnboardingChats", "Lcom/ifriend/data/networking/api/onboarding/models/OnboardingChatsRootRemote;", "updateOnboardingAnswers", "", TtmlNode.TAG_BODY, "Lcom/google/gson/JsonObject;", "(Ljava/lang/String;Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OnboardingApi {
    @GET("ai/users/{user-id}/onboarding-answers")
    Object getOnboardingAnswers(@Path("user-id") String str, Continuation<? super Response<OnboardingAnswersResponse>> continuation);

    @GET("/ai/users/{userid}/onboarding-bots")
    Object getOnboardingChats(@Path("userid") String str, Continuation<? super OnboardingChatsRootRemote> continuation);

    @PATCH("ai/users/{user-id}/onboarding-answers")
    Object updateOnboardingAnswers(@Path("user-id") String str, @Body JsonObject jsonObject, Continuation<? super Response<Unit>> continuation);
}
