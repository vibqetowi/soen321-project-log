package com.facebook.appevents.cloudbridge;

import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpHeaders;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.UninitializedPropertyAccessException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001@B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010 \u001a\u00020!2\u001a\u0010\"\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u001b\u0018\u00010#H\u0000¢\u0006\u0002\b$J \u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0007J\n\u0010)\u001a\u0004\u0018\u00010\fH\u0007J=\u0010*\u001a\u00020!2\b\u0010+\u001a\u0004\u0018\u00010\u00052\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u001b0#2\b\b\u0002\u0010-\u001a\u00020\u0005H\u0000¢\u0006\u0004\b.\u0010/J\u0085\u0001\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010\f2\u0014\u00104\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u001b2\b\b\u0002\u00105\u001a\u00020\u00052<\u00106\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020!\u0018\u000107H\u0000¢\u0006\u0002\b;J$\u0010<\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u001b\u0018\u00010#2\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u00020!2\u0006\u0010=\u001a\u00020>H\u0007R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R,\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u001b0\u001aX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006A"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests;", "", "()V", "ACCEPTABLE_HTTP_RESPONSE", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "MAX_CACHED_TRANSFORMED_EVENTS", "MAX_PROCESSED_TRANSFORMED_EVENTS", "MAX_RETRY_COUNT", "RETRY_EVENTS_HTTP_RESPONSE", "TAG", "", "TIMEOUT_INTERVAL", "credentials", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$CloudBridgeCredentials;", "getCredentials$facebook_core_release", "()Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$CloudBridgeCredentials;", "setCredentials$facebook_core_release", "(Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$CloudBridgeCredentials;)V", "currentRetryCount", "getCurrentRetryCount$facebook_core_release", "()I", "setCurrentRetryCount$facebook_core_release", "(I)V", "transformedEvents", "", "", "getTransformedEvents$facebook_core_release", "()Ljava/util/List;", "setTransformedEvents$facebook_core_release", "(Ljava/util/List;)V", "appendEvents", "", "events", "", "appendEvents$facebook_core_release", "configure", "datasetID", "url", "accessKey", "getCredentials", "handleError", "responseCode", "processedEvents", "maxRetryCount", "handleError$facebook_core_release", "(Ljava/lang/Integer;Ljava/util/List;I)V", "makeHttpRequest", "urlStr", "requestMethod", "jsonBodyStr", "requestProperties", "timeOutInterval", "requestCallback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "requestResult", "makeHttpRequest$facebook_core_release", "transformAppEventRequestForCAPIG", "request", "Lcom/facebook/GraphRequest;", "transformGraphRequestAndSendToCAPIGEndPoint", "CloudBridgeCredentials", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEventsConversionsAPITransformerWebRequests {
    public static final int MAX_CACHED_TRANSFORMED_EVENTS = 1000;
    private static final int MAX_PROCESSED_TRANSFORMED_EVENTS = 10;
    public static final int MAX_RETRY_COUNT = 5;
    private static final String TAG = "CAPITransformerWebRequests";
    private static final int TIMEOUT_INTERVAL = 60000;
    public static CloudBridgeCredentials credentials;
    private static int currentRetryCount;
    public static List<Map<String, Object>> transformedEvents;
    public static final AppEventsConversionsAPITransformerWebRequests INSTANCE = new AppEventsConversionsAPITransformerWebRequests();
    private static final HashSet<Integer> ACCEPTABLE_HTTP_RESPONSE = SetsKt.hashSetOf(200, 202);
    private static final HashSet<Integer> RETRY_EVENTS_HTTP_RESPONSE = SetsKt.hashSetOf(503, 504, 429);

    private AppEventsConversionsAPITransformerWebRequests() {
    }

    /* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$CloudBridgeCredentials;", "", "datasetID", "", "cloudBridgeURL", "accessKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessKey", "()Ljava/lang/String;", "getCloudBridgeURL", "getDatasetID", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class CloudBridgeCredentials {
        private final String accessKey;
        private final String cloudBridgeURL;
        private final String datasetID;

        public static /* synthetic */ CloudBridgeCredentials copy$default(CloudBridgeCredentials cloudBridgeCredentials, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cloudBridgeCredentials.datasetID;
            }
            if ((i & 2) != 0) {
                str2 = cloudBridgeCredentials.cloudBridgeURL;
            }
            if ((i & 4) != 0) {
                str3 = cloudBridgeCredentials.accessKey;
            }
            return cloudBridgeCredentials.copy(str, str2, str3);
        }

        public final String component1() {
            return this.datasetID;
        }

        public final String component2() {
            return this.cloudBridgeURL;
        }

        public final String component3() {
            return this.accessKey;
        }

        public final CloudBridgeCredentials copy(String datasetID, String cloudBridgeURL, String accessKey) {
            Intrinsics.checkNotNullParameter(datasetID, "datasetID");
            Intrinsics.checkNotNullParameter(cloudBridgeURL, "cloudBridgeURL");
            Intrinsics.checkNotNullParameter(accessKey, "accessKey");
            return new CloudBridgeCredentials(datasetID, cloudBridgeURL, accessKey);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CloudBridgeCredentials) {
                CloudBridgeCredentials cloudBridgeCredentials = (CloudBridgeCredentials) obj;
                return Intrinsics.areEqual(this.datasetID, cloudBridgeCredentials.datasetID) && Intrinsics.areEqual(this.cloudBridgeURL, cloudBridgeCredentials.cloudBridgeURL) && Intrinsics.areEqual(this.accessKey, cloudBridgeCredentials.accessKey);
            }
            return false;
        }

        public int hashCode() {
            return (((this.datasetID.hashCode() * 31) + this.cloudBridgeURL.hashCode()) * 31) + this.accessKey.hashCode();
        }

        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.datasetID + ", cloudBridgeURL=" + this.cloudBridgeURL + ", accessKey=" + this.accessKey + ')';
        }

        public CloudBridgeCredentials(String datasetID, String cloudBridgeURL, String accessKey) {
            Intrinsics.checkNotNullParameter(datasetID, "datasetID");
            Intrinsics.checkNotNullParameter(cloudBridgeURL, "cloudBridgeURL");
            Intrinsics.checkNotNullParameter(accessKey, "accessKey");
            this.datasetID = datasetID;
            this.cloudBridgeURL = cloudBridgeURL;
            this.accessKey = accessKey;
        }

        public final String getDatasetID() {
            return this.datasetID;
        }

        public final String getCloudBridgeURL() {
            return this.cloudBridgeURL;
        }

        public final String getAccessKey() {
            return this.accessKey;
        }
    }

    public final CloudBridgeCredentials getCredentials$facebook_core_release() {
        CloudBridgeCredentials cloudBridgeCredentials = credentials;
        if (cloudBridgeCredentials != null) {
            return cloudBridgeCredentials;
        }
        Intrinsics.throwUninitializedPropertyAccessException("credentials");
        throw null;
    }

    public final void setCredentials$facebook_core_release(CloudBridgeCredentials cloudBridgeCredentials) {
        Intrinsics.checkNotNullParameter(cloudBridgeCredentials, "<set-?>");
        credentials = cloudBridgeCredentials;
    }

    public final List<Map<String, Object>> getTransformedEvents$facebook_core_release() {
        List<Map<String, Object>> list = transformedEvents;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transformedEvents");
        throw null;
    }

    public final void setTransformedEvents$facebook_core_release(List<Map<String, Object>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        transformedEvents = list;
    }

    public final int getCurrentRetryCount$facebook_core_release() {
        return currentRetryCount;
    }

    public final void setCurrentRetryCount$facebook_core_release(int i) {
        currentRetryCount = i;
    }

    @JvmStatic
    public static final void configure(String datasetID, String url, String accessKey) {
        Intrinsics.checkNotNullParameter(datasetID, "datasetID");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        Logger.Companion companion = Logger.Companion;
        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
        AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = INSTANCE;
        companion.log(loggingBehavior, TAG, " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", datasetID, url, accessKey);
        appEventsConversionsAPITransformerWebRequests.setCredentials$facebook_core_release(new CloudBridgeCredentials(datasetID, url, accessKey));
        appEventsConversionsAPITransformerWebRequests.setTransformedEvents$facebook_core_release(new ArrayList());
    }

    @JvmStatic
    public static final String getCredentials() {
        try {
            CloudBridgeCredentials credentials$facebook_core_release = INSTANCE.getCredentials$facebook_core_release();
            if (credentials$facebook_core_release == null) {
                return null;
            }
            return credentials$facebook_core_release.toString();
        } catch (UninitializedPropertyAccessException unused) {
            return null;
        }
    }

    @JvmStatic
    public static final void transformGraphRequestAndSendToCAPIGEndPoint(final GraphRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Utility utility = Utility.INSTANCE;
        Utility.runOnNonUiThread(new Runnable() { // from class: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AppEventsConversionsAPITransformerWebRequests.m6318transformGraphRequestAndSendToCAPIGEndPoint$lambda0(GraphRequest.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: transformGraphRequestAndSendToCAPIGEndPoint$lambda-0  reason: not valid java name */
    public static final void m6318transformGraphRequestAndSendToCAPIGEndPoint$lambda0(GraphRequest request) {
        Intrinsics.checkNotNullParameter(request, "$request");
        String graphPath = request.getGraphPath();
        List split$default = graphPath == null ? null : StringsKt.split$default((CharSequence) graphPath, new String[]{RemoteSettings.FORWARD_SLASH_STRING}, false, 0, 6, (Object) null);
        if (split$default == null || split$default.size() != 2) {
            Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "\n GraphPathComponents Error when logging: \n%s", request);
            return;
        }
        try {
            AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = INSTANCE;
            String str = appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getCloudBridgeURL() + "/capi/" + appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getDatasetID() + "/events";
            List<Map<String, Object>> transformAppEventRequestForCAPIG = appEventsConversionsAPITransformerWebRequests.transformAppEventRequestForCAPIG(request);
            if (transformAppEventRequestForCAPIG == null) {
                return;
            }
            appEventsConversionsAPITransformerWebRequests.appendEvents$facebook_core_release(transformAppEventRequestForCAPIG);
            int min = Math.min(appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release().size(), 10);
            List slice = CollectionsKt.slice((List) appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release(), new IntRange(0, min - 1));
            appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release().subList(0, min).clear();
            JSONArray jSONArray = new JSONArray((Collection<?>) slice);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getAccessKey());
            JSONObject jSONObject = new JSONObject((Map<?, ?>) linkedHashMap);
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String jSONObject2 = jSONObject.toString(2);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonBodyStr.toString(2)");
            companion.log(loggingBehavior, TAG, "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, request, jSONObject2);
            appEventsConversionsAPITransformerWebRequests.makeHttpRequest$facebook_core_release(str, "POST", jSONObject.toString(), MapsKt.mapOf(TuplesKt.to("Content-Type", HttpHeaders.Values.APPLICATION_JSON)), 60000, new AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1(slice));
        } catch (UninitializedPropertyAccessException e) {
            Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "\n Credentials not initialized Error when logging: \n%s", e);
        }
    }

    private final List<Map<String, Object>> transformAppEventRequestForCAPIG(GraphRequest graphRequest) {
        JSONObject graphObject = graphRequest.getGraphObject();
        if (graphObject != null) {
            Utility utility = Utility.INSTANCE;
            Map<String, ? extends Object> mutableMap = MapsKt.toMutableMap(Utility.convertJSONObjectToHashMap(graphObject));
            Object tag = graphRequest.getTag();
            if (tag == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
            mutableMap.put("custom_events", tag);
            StringBuilder sb = new StringBuilder();
            for (String str : mutableMap.keySet()) {
                sb.append(str);
                sb.append(" : ");
                sb.append(mutableMap.get(str));
                sb.append(System.getProperty("line.separator"));
            }
            Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "\nGraph Request data: \n\n%s \n\n", sb);
            return AppEventsConversionsAPITransformer.INSTANCE.conversionsAPICompatibleEvent$facebook_core_release(mutableMap);
        }
        return null;
    }

    public static /* synthetic */ void handleError$facebook_core_release$default(AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests, Integer num, List list, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 5;
        }
        appEventsConversionsAPITransformerWebRequests.handleError$facebook_core_release(num, list, i);
    }

    public final void handleError$facebook_core_release(Integer num, List<? extends Map<String, ? extends Object>> processedEvents, int i) {
        Intrinsics.checkNotNullParameter(processedEvents, "processedEvents");
        if (CollectionsKt.contains(RETRY_EVENTS_HTTP_RESPONSE, num)) {
            if (currentRetryCount >= i) {
                getTransformedEvents$facebook_core_release().clear();
                currentRetryCount = 0;
                return;
            }
            getTransformedEvents$facebook_core_release().addAll(0, processedEvents);
            currentRetryCount++;
        }
    }

    public final void appendEvents$facebook_core_release(List<? extends Map<String, ? extends Object>> list) {
        if (list != null) {
            getTransformedEvents$facebook_core_release().addAll(list);
        }
        int max = Math.max(0, getTransformedEvents$facebook_core_release().size() - 1000);
        if (max > 0) {
            setTransformedEvents$facebook_core_release(TypeIntrinsics.asMutableList(CollectionsKt.drop(getTransformedEvents$facebook_core_release(), max)));
        }
    }

    public static /* synthetic */ void makeHttpRequest$facebook_core_release$default(AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests, String str, String str2, String str3, Map map, int i, Function2 function2, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            i = 60000;
        }
        appEventsConversionsAPITransformerWebRequests.makeHttpRequest$facebook_core_release(str, str2, str3, map, i, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8 A[Catch: IOException -> 0x010e, UnknownHostException -> 0x0121, TRY_LEAVE, TryCatch #4 {UnknownHostException -> 0x0121, IOException -> 0x010e, blocks: (B:3:0x0012, B:5:0x0023, B:15:0x004e, B:17:0x005a, B:22:0x006a, B:24:0x00a8, B:30:0x00cc, B:35:0x00d3, B:36:0x00d6, B:37:0x00d7, B:39:0x00fa, B:8:0x002b, B:11:0x0032, B:12:0x0038, B:14:0x003e, B:40:0x0106, B:41:0x010d), top: B:53:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa A[Catch: IOException -> 0x010e, UnknownHostException -> 0x0121, TryCatch #4 {UnknownHostException -> 0x0121, IOException -> 0x010e, blocks: (B:3:0x0012, B:5:0x0023, B:15:0x004e, B:17:0x005a, B:22:0x006a, B:24:0x00a8, B:30:0x00cc, B:35:0x00d3, B:36:0x00d6, B:37:0x00d7, B:39:0x00fa, B:8:0x002b, B:11:0x0032, B:12:0x0038, B:14:0x003e, B:40:0x0106, B:41:0x010d), top: B:53:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void makeHttpRequest$facebook_core_release(String urlStr, String requestMethod, String str, Map<String, String> map, int i, Function2<? super String, ? super Integer, Unit> function2) {
        Set<String> keySet;
        boolean z;
        Intrinsics.checkNotNullParameter(urlStr, "urlStr");
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(urlStr).openConnection());
            if (uRLConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestMethod(requestMethod);
            if (map != null && (keySet = map.keySet()) != null) {
                for (String str2 : keySet) {
                    httpURLConnection.setRequestProperty(str2, map.get(str2));
                }
            }
            if (!httpURLConnection.getRequestMethod().equals("POST") && !httpURLConnection.getRequestMethod().equals("PUT")) {
                z = false;
                httpURLConnection.setDoOutput(z);
                httpURLConnection.setConnectTimeout(i);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
                bufferedWriter.write(str);
                bufferedWriter.flush();
                bufferedWriter.close();
                bufferedOutputStream.close();
                StringBuilder sb = new StringBuilder();
                if (ACCEPTABLE_HTTP_RESPONSE.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    Throwable th = null;
                    try {
                        BufferedReader bufferedReader2 = bufferedReader;
                        while (true) {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(bufferedReader, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(bufferedReader, th2);
                            throw th3;
                        }
                    }
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "connResponseSB.toString()");
                Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "\nResponse Received: \n%s\n%s", sb2, Integer.valueOf(httpURLConnection.getResponseCode()));
                if (function2 == null) {
                    function2.invoke(sb2, Integer.valueOf(httpURLConnection.getResponseCode()));
                    return;
                }
                return;
            }
            z = true;
            httpURLConnection.setDoOutput(z);
            httpURLConnection.setConnectTimeout(i);
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream2, "UTF-8"));
            bufferedWriter2.write(str);
            bufferedWriter2.flush();
            bufferedWriter2.close();
            bufferedOutputStream2.close();
            StringBuilder sb3 = new StringBuilder();
            if (ACCEPTABLE_HTTP_RESPONSE.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
            }
            String sb22 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(sb22, "connResponseSB.toString()");
            Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "\nResponse Received: \n%s\n%s", sb22, Integer.valueOf(httpURLConnection.getResponseCode()));
            if (function2 == null) {
            }
        } catch (UnknownHostException e) {
            Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "Connection failed, retrying: \n%s", e.toString());
            if (function2 != null) {
                function2.invoke(null, 503);
            }
        } catch (IOException e2) {
            Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "Send to server failed: \n%s", e2.toString());
        }
    }
}
