package com.ifriend.analytics.pushNotificationOpenedTraker;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.UserId;
import com.ifriend.domain.models.profile.user.UserToken;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONObject;
import retrofit2.Response;
/* compiled from: PushNotificationOpenedAnalyticsSender.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0016J/\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/ifriend/analytics/pushNotificationOpenedTraker/PushNotificationOpenedAnalyticsSender;", "Lcom/ifriend/analytics/AnalyticsSender;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "pushNotificationOpenedTrackerApi", "Lcom/ifriend/analytics/pushNotificationOpenedTraker/PushNotificationOpenedTrackerApi;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "coroutineDispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/domain/data/AuthDataProvider;Lcom/ifriend/analytics/pushNotificationOpenedTraker/PushNotificationOpenedTrackerApi;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/common_utils/Logger;)V", "gson", "Lcom/google/gson/Gson;", "sendEvent", "", NotificationCompat.CATEGORY_EVENT, "", FirebaseAnalytics.Param.CONTENT, "", "", "sendEventWithResult", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUserId", "userId", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PushNotificationOpenedAnalyticsSender implements AnalyticsSender {
    private final AuthDataProvider authDataProvider;
    private final CoroutineDispatchers coroutineDispatchers;
    private final CoroutineScope coroutineScope;
    private final Gson gson;
    private final Logger logger;
    private final PushNotificationOpenedTrackerApi pushNotificationOpenedTrackerApi;

    @Override // com.ifriend.analytics.AnalyticsSender
    public void setUserId(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
    }

    public PushNotificationOpenedAnalyticsSender(AuthDataProvider authDataProvider, PushNotificationOpenedTrackerApi pushNotificationOpenedTrackerApi, CoroutineScope coroutineScope, CoroutineDispatchers coroutineDispatchers, Logger logger) {
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        Intrinsics.checkNotNullParameter(pushNotificationOpenedTrackerApi, "pushNotificationOpenedTrackerApi");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.authDataProvider = authDataProvider;
        this.pushNotificationOpenedTrackerApi = pushNotificationOpenedTrackerApi;
        this.coroutineScope = coroutineScope;
        this.coroutineDispatchers = coroutineDispatchers;
        this.logger = logger;
        this.gson = new Gson();
    }

    @Override // com.ifriend.analytics.AnalyticsSender
    public void sendEvent(String event, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(event, "event");
        BuildersKt.launch$default(this.coroutineScope, this.coroutineDispatchers.getIO(), null, new PushNotificationOpenedAnalyticsSender$sendEvent$1(this, event, map, null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb A[RETURN] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v5 */
    @Override // com.ifriend.analytics.AnalyticsSender
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendEventWithResult(String str, Map<String, ? extends Object> map, Continuation<? super Boolean> continuation) {
        PushNotificationOpenedAnalyticsSender$sendEventWithResult$1 pushNotificationOpenedAnalyticsSender$sendEventWithResult$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        String str2;
        PushNotificationOpenedAnalyticsSender pushNotificationOpenedAnalyticsSender;
        UserId userId;
        UserToken token;
        try {
            if (continuation instanceof PushNotificationOpenedAnalyticsSender$sendEventWithResult$1) {
                pushNotificationOpenedAnalyticsSender$sendEventWithResult$1 = (PushNotificationOpenedAnalyticsSender$sendEventWithResult$1) continuation;
                if ((pushNotificationOpenedAnalyticsSender$sendEventWithResult$1.label & Integer.MIN_VALUE) != 0) {
                    pushNotificationOpenedAnalyticsSender$sendEventWithResult$1.label -= Integer.MIN_VALUE;
                    PushNotificationOpenedAnalyticsSender$sendEventWithResult$1 pushNotificationOpenedAnalyticsSender$sendEventWithResult$12 = pushNotificationOpenedAnalyticsSender$sendEventWithResult$1;
                    obj = pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            AuthDataProvider authDataProvider = this.authDataProvider;
                            pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.L$0 = this;
                            pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.L$1 = str;
                            pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.L$2 = map;
                            pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.label = 1;
                            obj = authDataProvider.lastAuthData(pushNotificationOpenedAnalyticsSender$sendEventWithResult$12);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            str2 = str;
                            pushNotificationOpenedAnalyticsSender = this;
                        } catch (Exception e) {
                            e = e;
                            str = this;
                            str.logger.logException(e);
                            return Boxing.boxBoolean(false);
                        }
                    } else if (i != 1) {
                        if (i == 2) {
                            PushNotificationOpenedAnalyticsSender pushNotificationOpenedAnalyticsSender2 = (PushNotificationOpenedAnalyticsSender) pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.L$0;
                            ResultKt.throwOnFailure(obj);
                            return Boxing.boxBoolean(((Response) obj).isSuccessful());
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        map = (Map) pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.L$2;
                        String str3 = (String) pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.L$1;
                        PushNotificationOpenedAnalyticsSender pushNotificationOpenedAnalyticsSender3 = (PushNotificationOpenedAnalyticsSender) pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            str2 = str3;
                            pushNotificationOpenedAnalyticsSender = pushNotificationOpenedAnalyticsSender3;
                        } catch (Exception e2) {
                            e = e2;
                            str = pushNotificationOpenedAnalyticsSender3;
                            str.logger.logException(e);
                            return Boxing.boxBoolean(false);
                        }
                    }
                    AuthData authData = (AuthData) obj;
                    String formatted = (authData != null || (token = authData.getToken()) == null) ? null : token.formatted();
                    String str4 = (authData != null || (userId = authData.getUserId()) == null || (str4 = userId.getValue()) == null) ? "nouser" : "nouser";
                    Map mapOf = MapsKt.mapOf(TuplesKt.to("type", (map != null || (r13 = map.get("type")) == null) ? "Cannot extract type from push body" : "Cannot extract type from push body"), TuplesKt.to("openingTime", String.valueOf(System.currentTimeMillis())));
                    PushNotificationOpenedTrackerApi pushNotificationOpenedTrackerApi = pushNotificationOpenedAnalyticsSender.pushNotificationOpenedTrackerApi;
                    RequestBody.Companion companion = RequestBody.Companion;
                    String jSONObject = new JSONObject(pushNotificationOpenedAnalyticsSender.gson.toJson(mapOf)).toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                    RequestBody create = companion.create(jSONObject, MediaType.Companion.parse("application/json; charset=utf-8"));
                    pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.L$0 = pushNotificationOpenedAnalyticsSender;
                    pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.L$1 = null;
                    pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.L$2 = null;
                    pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.label = 2;
                    obj = pushNotificationOpenedTrackerApi.sendEvent(formatted, str4, str2, create, pushNotificationOpenedAnalyticsSender$sendEventWithResult$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Boxing.boxBoolean(((Response) obj).isSuccessful());
                }
            }
            if (i != 0) {
            }
            AuthData authData2 = (AuthData) obj;
            if (authData2 != null) {
            }
            if (authData2 != null) {
            }
            Map mapOf2 = MapsKt.mapOf(TuplesKt.to("type", (map != null || (r13 = map.get("type")) == null) ? "Cannot extract type from push body" : "Cannot extract type from push body"), TuplesKt.to("openingTime", String.valueOf(System.currentTimeMillis())));
            PushNotificationOpenedTrackerApi pushNotificationOpenedTrackerApi2 = pushNotificationOpenedAnalyticsSender.pushNotificationOpenedTrackerApi;
            RequestBody.Companion companion2 = RequestBody.Companion;
            String jSONObject2 = new JSONObject(pushNotificationOpenedAnalyticsSender.gson.toJson(mapOf2)).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            RequestBody create2 = companion2.create(jSONObject2, MediaType.Companion.parse("application/json; charset=utf-8"));
            pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.L$0 = pushNotificationOpenedAnalyticsSender;
            pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.L$1 = null;
            pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.L$2 = null;
            pushNotificationOpenedAnalyticsSender$sendEventWithResult$12.label = 2;
            obj = pushNotificationOpenedTrackerApi2.sendEvent(formatted, str4, str2, create2, pushNotificationOpenedAnalyticsSender$sendEventWithResult$12);
            if (obj == coroutine_suspended) {
            }
            return Boxing.boxBoolean(((Response) obj).isSuccessful());
        } catch (Exception e3) {
            e = e3;
        }
        pushNotificationOpenedAnalyticsSender$sendEventWithResult$1 = new PushNotificationOpenedAnalyticsSender$sendEventWithResult$1(this, continuation);
        PushNotificationOpenedAnalyticsSender$sendEventWithResult$1 pushNotificationOpenedAnalyticsSender$sendEventWithResult$122 = pushNotificationOpenedAnalyticsSender$sendEventWithResult$1;
        obj = pushNotificationOpenedAnalyticsSender$sendEventWithResult$122.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushNotificationOpenedAnalyticsSender$sendEventWithResult$122.label;
    }
}
