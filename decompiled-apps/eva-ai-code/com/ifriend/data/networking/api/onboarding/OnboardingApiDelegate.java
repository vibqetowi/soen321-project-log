package com.ifriend.data.networking.api.onboarding;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.data.networking.api.onboarding.models.OnboardingAnswersResponse;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
/* compiled from: OnboardingApiDelegate.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ!\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0019H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u0019\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u001dH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u0019\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/ifriend/data/networking/api/onboarding/OnboardingApiDelegate;", "", "api", "Lcom/ifriend/data/networking/api/onboarding/OnboardingApi;", "authLocalDataSource", "Lcom/ifriend/core/local/api/AuthLocalDataSource;", "(Lcom/ifriend/data/networking/api/onboarding/OnboardingApi;Lcom/ifriend/core/local/api/AuthLocalDataSource;)V", "getOnboardingAnswers", "Lcom/ifriend/data/networking/api/onboarding/models/OnboardingAnswersResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAiCharacter", "", "aiCharacter", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAiVoice", "aiVoice", "updateAnswer", "answerType", "answer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFavoriteTopic", "favoriteTopic", "updateInterests", "interests", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateJokes", "jokes", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOnboardingAnswers", TtmlNode.TAG_BODY, "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRetentions", "retention", "updateSelectBot", "botId", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingApiDelegate {
    private final OnboardingApi api;
    private final AuthLocalDataSource authLocalDataSource;

    @Inject
    public OnboardingApiDelegate(OnboardingApi api, AuthLocalDataSource authLocalDataSource) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(authLocalDataSource, "authLocalDataSource");
        this.api = api;
        this.authLocalDataSource = authLocalDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getOnboardingAnswers(Continuation<? super OnboardingAnswersResponse> continuation) {
        OnboardingApiDelegate$getOnboardingAnswers$1 onboardingApiDelegate$getOnboardingAnswers$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        OnboardingApiDelegate onboardingApiDelegate;
        String str;
        Response response;
        if (continuation instanceof OnboardingApiDelegate$getOnboardingAnswers$1) {
            onboardingApiDelegate$getOnboardingAnswers$1 = (OnboardingApiDelegate$getOnboardingAnswers$1) continuation;
            if ((onboardingApiDelegate$getOnboardingAnswers$1.label & Integer.MIN_VALUE) != 0) {
                onboardingApiDelegate$getOnboardingAnswers$1.label -= Integer.MIN_VALUE;
                obj = onboardingApiDelegate$getOnboardingAnswers$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = onboardingApiDelegate$getOnboardingAnswers$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthLocalDataSource authLocalDataSource = this.authLocalDataSource;
                    onboardingApiDelegate$getOnboardingAnswers$1.L$0 = this;
                    onboardingApiDelegate$getOnboardingAnswers$1.label = 1;
                    obj = authLocalDataSource.getUserId(onboardingApiDelegate$getOnboardingAnswers$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    onboardingApiDelegate = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        response = (Response) obj;
                        if (!response.isSuccessful()) {
                            throw new IllegalStateException("Failed to get onboarding answers");
                        }
                        OnboardingAnswersResponse onboardingAnswersResponse = (OnboardingAnswersResponse) response.body();
                        if (onboardingAnswersResponse != null) {
                            return onboardingAnswersResponse;
                        }
                        throw new IllegalStateException("Failed to get onboarding answers");
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    onboardingApiDelegate = (OnboardingApiDelegate) onboardingApiDelegate$getOnboardingAnswers$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str == null) {
                    str = "";
                }
                OnboardingApi onboardingApi = onboardingApiDelegate.api;
                onboardingApiDelegate$getOnboardingAnswers$1.L$0 = null;
                onboardingApiDelegate$getOnboardingAnswers$1.label = 2;
                obj = onboardingApi.getOnboardingAnswers(str, onboardingApiDelegate$getOnboardingAnswers$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                response = (Response) obj;
                if (!response.isSuccessful()) {
                }
            }
        }
        onboardingApiDelegate$getOnboardingAnswers$1 = new OnboardingApiDelegate$getOnboardingAnswers$1(this, continuation);
        obj = onboardingApiDelegate$getOnboardingAnswers$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = onboardingApiDelegate$getOnboardingAnswers$1.label;
        if (i != 0) {
        }
        str = (String) obj;
        if (str == null) {
        }
        OnboardingApi onboardingApi2 = onboardingApiDelegate.api;
        onboardingApiDelegate$getOnboardingAnswers$1.L$0 = null;
        onboardingApiDelegate$getOnboardingAnswers$1.label = 2;
        obj = onboardingApi2.getOnboardingAnswers(str, onboardingApiDelegate$getOnboardingAnswers$1);
        if (obj == coroutine_suspended) {
        }
        response = (Response) obj;
        if (!response.isSuccessful()) {
        }
    }

    public final Object updateRetentions(boolean z, Continuation<? super Unit> continuation) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("retention", Boxing.boxBoolean(z));
        Object updateOnboardingAnswers = updateOnboardingAnswers(jsonObject, continuation);
        return updateOnboardingAnswers == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateOnboardingAnswers : Unit.INSTANCE;
    }

    public final Object updateJokes(boolean z, Continuation<? super Unit> continuation) {
        Object updateAnswer = updateAnswer("jokes", String.valueOf(z), continuation);
        return updateAnswer == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateAnswer : Unit.INSTANCE;
    }

    public final Object updateAiVoice(String str, Continuation<? super Unit> continuation) {
        Object updateAnswer = updateAnswer("aiVoice", str, continuation);
        return updateAnswer == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateAnswer : Unit.INSTANCE;
    }

    public final Object updateFavoriteTopic(String str, Continuation<? super Unit> continuation) {
        Object updateAnswer = updateAnswer("favoriteTopic", str, continuation);
        return updateAnswer == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateAnswer : Unit.INSTANCE;
    }

    public final Object updateAiCharacter(String str, Continuation<? super Unit> continuation) {
        Object updateAnswer = updateAnswer("aiCharacter", str, continuation);
        return updateAnswer == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateAnswer : Unit.INSTANCE;
    }

    public final Object updateSelectBot(String str, Continuation<? super Unit> continuation) {
        Object updateAnswer = updateAnswer("selectedBot", str, continuation);
        return updateAnswer == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateAnswer : Unit.INSTANCE;
    }

    public final Object updateInterests(List<String> list, Continuation<? super Unit> continuation) {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (String str : list) {
            jsonArray.add(str);
        }
        Unit unit = Unit.INSTANCE;
        jsonObject.add("interests", jsonArray);
        Object updateOnboardingAnswers = updateOnboardingAnswers(jsonObject, continuation);
        return updateOnboardingAnswers == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateOnboardingAnswers : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateAnswer(String str, String str2, Continuation<? super Unit> continuation) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(str, str2);
        Object updateOnboardingAnswers = updateOnboardingAnswers(jsonObject, continuation);
        return updateOnboardingAnswers == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateOnboardingAnswers : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateOnboardingAnswers(JsonObject jsonObject, Continuation<? super Unit> continuation) {
        OnboardingApiDelegate$updateOnboardingAnswers$1 onboardingApiDelegate$updateOnboardingAnswers$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        OnboardingApiDelegate onboardingApiDelegate;
        String str;
        if (continuation instanceof OnboardingApiDelegate$updateOnboardingAnswers$1) {
            onboardingApiDelegate$updateOnboardingAnswers$1 = (OnboardingApiDelegate$updateOnboardingAnswers$1) continuation;
            if ((onboardingApiDelegate$updateOnboardingAnswers$1.label & Integer.MIN_VALUE) != 0) {
                onboardingApiDelegate$updateOnboardingAnswers$1.label -= Integer.MIN_VALUE;
                obj = onboardingApiDelegate$updateOnboardingAnswers$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = onboardingApiDelegate$updateOnboardingAnswers$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthLocalDataSource authLocalDataSource = this.authLocalDataSource;
                    onboardingApiDelegate$updateOnboardingAnswers$1.L$0 = this;
                    onboardingApiDelegate$updateOnboardingAnswers$1.L$1 = jsonObject;
                    onboardingApiDelegate$updateOnboardingAnswers$1.label = 1;
                    obj = authLocalDataSource.getUserId(onboardingApiDelegate$updateOnboardingAnswers$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    onboardingApiDelegate = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        if (!((Response) obj).isSuccessful()) {
                            throw new IllegalStateException("Failed to update onboarding answers");
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    jsonObject = (JsonObject) onboardingApiDelegate$updateOnboardingAnswers$1.L$1;
                    onboardingApiDelegate = (OnboardingApiDelegate) onboardingApiDelegate$updateOnboardingAnswers$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str == null) {
                    str = "";
                }
                OnboardingApi onboardingApi = onboardingApiDelegate.api;
                onboardingApiDelegate$updateOnboardingAnswers$1.L$0 = null;
                onboardingApiDelegate$updateOnboardingAnswers$1.L$1 = null;
                onboardingApiDelegate$updateOnboardingAnswers$1.label = 2;
                obj = onboardingApi.updateOnboardingAnswers(str, jsonObject, onboardingApiDelegate$updateOnboardingAnswers$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!((Response) obj).isSuccessful()) {
                }
            }
        }
        onboardingApiDelegate$updateOnboardingAnswers$1 = new OnboardingApiDelegate$updateOnboardingAnswers$1(this, continuation);
        obj = onboardingApiDelegate$updateOnboardingAnswers$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = onboardingApiDelegate$updateOnboardingAnswers$1.label;
        if (i != 0) {
        }
        str = (String) obj;
        if (str == null) {
        }
        OnboardingApi onboardingApi2 = onboardingApiDelegate.api;
        onboardingApiDelegate$updateOnboardingAnswers$1.L$0 = null;
        onboardingApiDelegate$updateOnboardingAnswers$1.L$1 = null;
        onboardingApiDelegate$updateOnboardingAnswers$1.label = 2;
        obj = onboardingApi2.updateOnboardingAnswers(str, jsonObject, onboardingApiDelegate$updateOnboardingAnswers$1);
        if (obj == coroutine_suspended) {
        }
        if (!((Response) obj).isSuccessful()) {
        }
    }
}
