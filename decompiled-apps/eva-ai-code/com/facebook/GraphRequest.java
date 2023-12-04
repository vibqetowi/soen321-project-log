package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Logger;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.cookie.ClientCookie;
import org.json.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: GraphRequest.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 `2\u00020\u0001:\t^_`abcdefBO\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rB\u0019\b\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010F\u001a\u00020GH\u0002J\u0018\u0010H\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u001eH\u0002J\u0006\u0010K\u001a\u00020LJ\u0006\u0010M\u001a\u00020NJ\n\u0010O\u001a\u0004\u0018\u00010\u0005H\u0002J\n\u0010P\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010Q\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u0005H\u0002J\b\u0010R\u001a\u00020\u001eH\u0002J\b\u0010S\u001a\u00020\u001eH\u0002J$\u0010T\u001a\u00020G2\u0006\u0010U\u001a\u00020V2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020Y0XH\u0002J\u000e\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020\u001eJ\b\u0010\\\u001a\u00020\u001eH\u0002J\b\u0010]\u001a\u00020\u0005H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019R\u0016\u00100\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0017R(\u0010\b\u001a\u0004\u0018\u00010\t2\b\u00102\u001a\u0004\u0018\u00010\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0011\u0010;\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b<\u0010\u0017R\u001c\u0010=\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0011\u0010B\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bC\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0017\"\u0004\bE\u0010\u0019¨\u0006g"}, d2 = {"Lcom/facebook/GraphRequest;", "", "accessToken", "Lcom/facebook/AccessToken;", "graphPath", "", "parameters", "Landroid/os/Bundle;", "httpMethod", "Lcom/facebook/HttpMethod;", "callback", "Lcom/facebook/GraphRequest$Callback;", "version", "(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/GraphRequest$Callback;Ljava/lang/String;)V", "overriddenURL", "Ljava/net/URL;", "(Lcom/facebook/AccessToken;Ljava/net/URL;)V", "getAccessToken", "()Lcom/facebook/AccessToken;", "setAccessToken", "(Lcom/facebook/AccessToken;)V", "batchEntryDependsOn", "getBatchEntryDependsOn", "()Ljava/lang/String;", "setBatchEntryDependsOn", "(Ljava/lang/String;)V", "batchEntryName", "getBatchEntryName", "setBatchEntryName", "batchEntryOmitResultOnSuccess", "", "getBatchEntryOmitResultOnSuccess", "()Z", "setBatchEntryOmitResultOnSuccess", "(Z)V", "getCallback", "()Lcom/facebook/GraphRequest$Callback;", "setCallback", "(Lcom/facebook/GraphRequest$Callback;)V", "forceApplicationRequest", "graphObject", "Lorg/json/JSONObject;", "getGraphObject", "()Lorg/json/JSONObject;", "setGraphObject", "(Lorg/json/JSONObject;)V", "getGraphPath", "setGraphPath", "graphPathWithVersion", "getGraphPathWithVersion", "value", "getHttpMethod", "()Lcom/facebook/HttpMethod;", "setHttpMethod", "(Lcom/facebook/HttpMethod;)V", "getParameters", "()Landroid/os/Bundle;", "setParameters", "(Landroid/os/Bundle;)V", "relativeUrlForBatchedRequest", "getRelativeUrlForBatchedRequest", ViewHierarchyConstants.TAG_KEY, "getTag", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "urlForSingleRequest", "getUrlForSingleRequest", "getVersion", "setVersion", "addCommonParameters", "", "appendParametersToBaseUrl", "baseUrl", "isBatch", "executeAndWait", "Lcom/facebook/GraphResponse;", "executeAsync", "Lcom/facebook/GraphRequestAsyncTask;", "getAccessTokenToUseForRequest", "getClientTokenForRequest", "getUrlWithGraphPath", "isApplicationRequest", "isValidGraphRequestForDomain", "serializeToBatch", GraphRequest.BATCH_PARAM, "Lorg/json/JSONArray;", "attachments", "", "Lcom/facebook/GraphRequest$Attachment;", "setForceApplicationRequest", "forceOverride", "shouldForceClientTokenForRequest", "toString", "Attachment", "Callback", "Companion", "GraphJSONArrayCallback", "GraphJSONObjectCallback", "KeyValueSerializer", "OnProgressCallback", "ParcelableResourceWithMimeType", "Serializer", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GraphRequest {
    private static final String ACCEPT_LANGUAGE_HEADER = "Accept-Language";
    public static final String ACCESS_TOKEN_PARAM = "access_token";
    private static final String ATTACHED_FILES_PARAM = "attached_files";
    private static final String ATTACHMENT_FILENAME_PREFIX = "file";
    private static final String BATCH_APP_ID_PARAM = "batch_app_id";
    private static final String BATCH_BODY_PARAM = "body";
    private static final String BATCH_ENTRY_DEPENDS_ON_PARAM = "depends_on";
    private static final String BATCH_ENTRY_NAME_PARAM = "name";
    private static final String BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM = "omit_response_on_success";
    private static final String BATCH_METHOD_PARAM = "method";
    private static final String BATCH_PARAM = "batch";
    private static final String BATCH_RELATIVE_URL_PARAM = "relative_url";
    private static final String CAPTION_PARAM = "caption";
    private static final String CONTENT_ENCODING_HEADER = "Content-Encoding";
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    public static final Companion Companion = new Companion(null);
    private static final String DEBUG_KEY = "__debug__";
    private static final String DEBUG_MESSAGES_KEY = "messages";
    private static final String DEBUG_MESSAGE_KEY = "message";
    private static final String DEBUG_MESSAGE_LINK_KEY = "link";
    private static final String DEBUG_MESSAGE_TYPE_KEY = "type";
    private static final String DEBUG_PARAM = "debug";
    private static final String DEBUG_SEVERITY_INFO = "info";
    private static final String DEBUG_SEVERITY_WARNING = "warning";
    public static final String FIELDS_PARAM = "fields";
    private static final String FORMAT_JSON = "json";
    private static final String FORMAT_PARAM = "format";
    private static final String ISO_8601_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ssZ";
    public static final int MAXIMUM_BATCH_SIZE = 50;
    private static final String ME = "me";
    private static final String MIME_BOUNDARY;
    private static final String MY_FRIENDS = "me/friends";
    private static final String MY_PHOTOS = "me/photos";
    private static final String PICTURE_PARAM = "picture";
    private static final String SDK_ANDROID = "android";
    private static final String SDK_PARAM = "sdk";
    private static final String SEARCH = "search";
    public static final String TAG;
    private static final String USER_AGENT_BASE = "FBAndroidSDK";
    private static final String USER_AGENT_HEADER = "User-Agent";
    private static final String VIDEOS_SUFFIX = "/videos";
    private static String defaultBatchApplicationId;
    private static volatile String userAgent;
    private static final Pattern versionPattern;
    private AccessToken accessToken;
    private String batchEntryDependsOn;
    private String batchEntryName;
    private boolean batchEntryOmitResultOnSuccess;
    private Callback callback;
    private boolean forceApplicationRequest;
    private JSONObject graphObject;
    private String graphPath;
    private HttpMethod httpMethod;
    private String overriddenURL;
    private Bundle parameters;
    private Object tag;
    private String version;

    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/GraphRequest$Callback;", "", "onCompleted", "", "response", "Lcom/facebook/GraphResponse;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Callback {
        void onCompleted(GraphResponse graphResponse);
    }

    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/facebook/GraphRequest$GraphJSONArrayCallback;", "", "onCompleted", "", "objects", "Lorg/json/JSONArray;", "response", "Lcom/facebook/GraphResponse;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public interface GraphJSONArrayCallback {
        void onCompleted(JSONArray jSONArray, GraphResponse graphResponse);
    }

    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/facebook/GraphRequest$GraphJSONObjectCallback;", "", "onCompleted", "", "obj", "Lorg/json/JSONObject;", "response", "Lcom/facebook/GraphResponse;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public interface GraphJSONObjectCallback {
        void onCompleted(JSONObject jSONObject, GraphResponse graphResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/facebook/GraphRequest$KeyValueSerializer;", "", "writeString", "", "key", "", "value", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public interface KeyValueSerializer {
        void writeString(String str, String str2);
    }

    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/facebook/GraphRequest$OnProgressCallback;", "Lcom/facebook/GraphRequest$Callback;", "onProgress", "", "current", "", "max", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public interface OnProgressCallback extends Callback {
        void onProgress(long j, long j2);
    }

    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public GraphRequest(AccessToken accessToken) {
        this(accessToken, null, null, null, null, null, 62, null);
    }

    public GraphRequest(AccessToken accessToken, String str) {
        this(accessToken, str, null, null, null, null, 60, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle) {
        this(accessToken, str, bundle, null, null, null, 56, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod) {
        this(accessToken, str, bundle, httpMethod, null, null, 48, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, Callback callback) {
        this(accessToken, str, bundle, httpMethod, callback, null, 32, null);
    }

    @JvmStatic
    public static final GraphResponse executeAndWait(GraphRequest graphRequest) {
        return Companion.executeAndWait(graphRequest);
    }

    @JvmStatic
    public static final List<GraphResponse> executeBatchAndWait(GraphRequestBatch graphRequestBatch) {
        return Companion.executeBatchAndWait(graphRequestBatch);
    }

    @JvmStatic
    public static final List<GraphResponse> executeBatchAndWait(Collection<GraphRequest> collection) {
        return Companion.executeBatchAndWait(collection);
    }

    @JvmStatic
    public static final List<GraphResponse> executeBatchAndWait(GraphRequest... graphRequestArr) {
        return Companion.executeBatchAndWait(graphRequestArr);
    }

    @JvmStatic
    public static final GraphRequestAsyncTask executeBatchAsync(GraphRequestBatch graphRequestBatch) {
        return Companion.executeBatchAsync(graphRequestBatch);
    }

    @JvmStatic
    public static final GraphRequestAsyncTask executeBatchAsync(Collection<GraphRequest> collection) {
        return Companion.executeBatchAsync(collection);
    }

    @JvmStatic
    public static final GraphRequestAsyncTask executeBatchAsync(GraphRequest... graphRequestArr) {
        return Companion.executeBatchAsync(graphRequestArr);
    }

    @JvmStatic
    public static final List<GraphResponse> executeConnectionAndWait(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        return Companion.executeConnectionAndWait(httpURLConnection, graphRequestBatch);
    }

    @JvmStatic
    public static final List<GraphResponse> executeConnectionAndWait(HttpURLConnection httpURLConnection, Collection<GraphRequest> collection) {
        return Companion.executeConnectionAndWait(httpURLConnection, collection);
    }

    @JvmStatic
    public static final GraphRequestAsyncTask executeConnectionAsync(Handler handler, HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        return Companion.executeConnectionAsync(handler, httpURLConnection, graphRequestBatch);
    }

    @JvmStatic
    public static final GraphRequestAsyncTask executeConnectionAsync(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        return Companion.executeConnectionAsync(httpURLConnection, graphRequestBatch);
    }

    @JvmStatic
    public static final String getDefaultBatchApplicationId() {
        return Companion.getDefaultBatchApplicationId();
    }

    @JvmStatic
    public static final GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accessToken, Context context, Callback callback) {
        return Companion.newCustomAudienceThirdPartyIdRequest(accessToken, context, callback);
    }

    @JvmStatic
    public static final GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accessToken, Context context, String str, Callback callback) {
        return Companion.newCustomAudienceThirdPartyIdRequest(accessToken, context, str, callback);
    }

    @JvmStatic
    public static final GraphRequest newDeleteObjectRequest(AccessToken accessToken, String str, Callback callback) {
        return Companion.newDeleteObjectRequest(accessToken, str, callback);
    }

    @JvmStatic
    public static final GraphRequest newGraphPathRequest(AccessToken accessToken, String str, Callback callback) {
        return Companion.newGraphPathRequest(accessToken, str, callback);
    }

    @JvmStatic
    public static final GraphRequest newMeRequest(AccessToken accessToken, GraphJSONObjectCallback graphJSONObjectCallback) {
        return Companion.newMeRequest(accessToken, graphJSONObjectCallback);
    }

    @JvmStatic
    public static final GraphRequest newMyFriendsRequest(AccessToken accessToken, GraphJSONArrayCallback graphJSONArrayCallback) {
        return Companion.newMyFriendsRequest(accessToken, graphJSONArrayCallback);
    }

    @JvmStatic
    public static final GraphRequest newPlacesSearchRequest(AccessToken accessToken, Location location, int i, int i2, String str, GraphJSONArrayCallback graphJSONArrayCallback) {
        return Companion.newPlacesSearchRequest(accessToken, location, i, i2, str, graphJSONArrayCallback);
    }

    @JvmStatic
    public static final GraphRequest newPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, Callback callback) {
        return Companion.newPostRequest(accessToken, str, jSONObject, callback);
    }

    @JvmStatic
    public static final GraphRequest newPostRequestWithBundle(AccessToken accessToken, String str, Bundle bundle, Callback callback) {
        return Companion.newPostRequestWithBundle(accessToken, str, bundle, callback);
    }

    @JvmStatic
    public static final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, Bitmap bitmap, String str2, Bundle bundle, Callback callback) {
        return Companion.newUploadPhotoRequest(accessToken, str, bitmap, str2, bundle, callback);
    }

    @JvmStatic
    public static final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, Uri uri, String str2, Bundle bundle, Callback callback) throws FileNotFoundException, FacebookException {
        return Companion.newUploadPhotoRequest(accessToken, str, uri, str2, bundle, callback);
    }

    @JvmStatic
    public static final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, File file, String str2, Bundle bundle, Callback callback) throws FileNotFoundException {
        return Companion.newUploadPhotoRequest(accessToken, str, file, str2, bundle, callback);
    }

    @JvmStatic
    public static final void setDefaultBatchApplicationId(String str) {
        Companion.setDefaultBatchApplicationId(str);
    }

    @JvmStatic
    public static final HttpURLConnection toHttpConnection(GraphRequestBatch graphRequestBatch) {
        return Companion.toHttpConnection(graphRequestBatch);
    }

    @JvmStatic
    public static final HttpURLConnection toHttpConnection(Collection<GraphRequest> collection) {
        return Companion.toHttpConnection(collection);
    }

    @JvmStatic
    public static final HttpURLConnection toHttpConnection(GraphRequest... graphRequestArr) {
        return Companion.toHttpConnection(graphRequestArr);
    }

    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    public final void setAccessToken(AccessToken accessToken) {
        this.accessToken = accessToken;
    }

    public final String getGraphPath() {
        return this.graphPath;
    }

    public final void setGraphPath(String str) {
        this.graphPath = str;
    }

    public final JSONObject getGraphObject() {
        return this.graphObject;
    }

    public final void setGraphObject(JSONObject jSONObject) {
        this.graphObject = jSONObject;
    }

    public final String getBatchEntryName() {
        return this.batchEntryName;
    }

    public final void setBatchEntryName(String str) {
        this.batchEntryName = str;
    }

    public final String getBatchEntryDependsOn() {
        return this.batchEntryDependsOn;
    }

    public final void setBatchEntryDependsOn(String str) {
        this.batchEntryDependsOn = str;
    }

    public final boolean getBatchEntryOmitResultOnSuccess() {
        return this.batchEntryOmitResultOnSuccess;
    }

    public final void setBatchEntryOmitResultOnSuccess(boolean z) {
        this.batchEntryOmitResultOnSuccess = z;
    }

    public final Bundle getParameters() {
        return this.parameters;
    }

    public final void setParameters(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.parameters = bundle;
    }

    public final Object getTag() {
        return this.tag;
    }

    public final void setTag(Object obj) {
        this.tag = obj;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public final Callback getCallback() {
        return this.callback;
    }

    public final void setCallback(final Callback callback) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
            if (!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
                this.callback = callback;
                return;
            }
        }
        this.callback = new Callback() { // from class: com.facebook.GraphRequest$$ExternalSyntheticLambda0
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                GraphRequest.m6277_set_callback_$lambda0(GraphRequest.Callback.this, graphResponse);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _set_callback_$lambda-0  reason: not valid java name */
    public static final void m6277_set_callback_$lambda0(Callback callback, GraphResponse response) {
        int length;
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject jSONObject = response.getJSONObject();
        JSONObject optJSONObject = jSONObject == null ? null : jSONObject.optJSONObject(DEBUG_KEY);
        JSONArray optJSONArray = optJSONObject == null ? null : optJSONObject.optJSONArray(DEBUG_MESSAGES_KEY);
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                String optString = optJSONObject2 == null ? null : optJSONObject2.optString("message");
                String optString2 = optJSONObject2 == null ? null : optJSONObject2.optString("type");
                String optString3 = optJSONObject2 == null ? null : optJSONObject2.optString("link");
                if (optString != null && optString2 != null) {
                    LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                    if (Intrinsics.areEqual(optString2, DEBUG_SEVERITY_WARNING)) {
                        loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                    }
                    Utility utility = Utility.INSTANCE;
                    if (!Utility.isNullOrEmpty(optString3)) {
                        optString = ((Object) optString) + " Link: " + ((Object) optString3);
                    }
                    Logger.Companion.log(loggingBehavior, TAG, optString);
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        if (callback == null) {
            return;
        }
        callback.onCompleted(response);
    }

    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public final void setHttpMethod(HttpMethod httpMethod) {
        if (this.overriddenURL != null && httpMethod != HttpMethod.GET) {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (httpMethod == null) {
            httpMethod = HttpMethod.GET;
        }
        this.httpMethod = httpMethod;
    }

    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0007J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020<0@2\u0006\u0010A\u001a\u00020BH\u0007J'\u0010?\u001a\b\u0012\u0004\u0012\u00020<0@2\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020>0C\"\u00020>H\u0007¢\u0006\u0002\u0010DJ\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020<0@2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020>0EH\u0007J\u0010\u0010F\u001a\u00020G2\u0006\u0010A\u001a\u00020BH\u0007J!\u0010F\u001a\u00020G2\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020>0C\"\u00020>H\u0007¢\u0006\u0002\u0010HJ\u0016\u0010F\u001a\u00020G2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020>0EH\u0007J\u001e\u0010I\u001a\b\u0012\u0004\u0012\u00020<0@2\u0006\u0010J\u001a\u0002082\u0006\u0010A\u001a\u00020BH\u0007J$\u0010I\u001a\b\u0012\u0004\u0012\u00020<0@2\u0006\u0010J\u001a\u0002082\f\u0010A\u001a\b\u0012\u0004\u0012\u00020>0EH\u0007J\"\u0010K\u001a\u00020G2\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010J\u001a\u0002082\u0006\u0010A\u001a\u00020BH\u0007J\u0018\u0010K\u001a\u00020G2\u0006\u0010J\u001a\u0002082\u0006\u0010A\u001a\u00020BH\u0007J\u0010\u0010N\u001a\u00020\u00042\u0006\u0010O\u001a\u00020BH\u0002J\n\u0010P\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010Q\u001a\u00020\u00042\b\u0010R\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010S\u001a\u00020T2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010U\u001a\u00020T2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010V\u001a\u00020T2\u0006\u0010W\u001a\u00020\u0004H\u0002J\u0012\u0010X\u001a\u00020T2\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u0002J\u0012\u0010Z\u001a\u00020T2\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u0002J$\u0010[\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\u0006\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J.\u0010[\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\u0006\u0010^\u001a\u00020_2\b\u0010b\u001a\u0004\u0018\u00010\u00042\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J&\u0010c\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010d\u001a\u0004\u0018\u00010\u00042\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J&\u0010e\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J\u001c\u0010f\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010`\u001a\u0004\u0018\u00010gH\u0007J\u001c\u0010h\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010`\u001a\u0004\u0018\u00010iH\u0007J@\u0010j\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010k\u001a\u0004\u0018\u00010l2\u0006\u0010m\u001a\u00020 2\u0006\u0010n\u001a\u00020 2\b\u0010o\u001a\u0004\u0018\u00010\u00042\b\u0010`\u001a\u0004\u0018\u00010iH\u0007J0\u0010p\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\b\u0010q\u001a\u0004\u0018\u00010r2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J0\u0010s\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\b\u0010t\u001a\u0004\u0018\u00010u2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007JB\u0010v\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\u0006\u0010w\u001a\u00020x2\b\u0010y\u001a\u0004\u0018\u00010\u00042\b\u0010z\u001a\u0004\u0018\u00010u2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007JB\u0010v\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\u0006\u0010{\u001a\u00020|2\b\u0010y\u001a\u0004\u0018\u00010\u00042\b\u0010z\u001a\u0004\u0018\u00010u2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007JB\u0010v\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\u0006\u0010}\u001a\u00020~2\b\u0010y\u001a\u0004\u0018\u00010\u00042\b\u0010z\u001a\u0004\u0018\u00010u2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J\u0012\u0010\u007f\u001a\u00020\u00042\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u0002J$\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0006\u0010q\u001a\u00020r2\u0006\u0010W\u001a\u00020\u00042\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0002J.\u0010\u0084\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00012\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0086\u0001\u001a\u00020TH\u0002JB\u0010\u0087\u0001\u001a\u00030\u0081\u00012\u0006\u0010A\u001a\u00020B2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u00012\u0007\u0010\u008a\u0001\u001a\u00020 2\u0006\u00109\u001a\u00020:2\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u008d\u0001\u001a\u00020TH\u0002J'\u0010\u008e\u0001\u001a\u00030\u0081\u00012\u0006\u0010A\u001a\u00020B2\r\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020<0@H\u0001¢\u0006\u0003\b\u0090\u0001J+\u0010\u0091\u0001\u001a\u00030\u0081\u00012\u0015\u0010\u0092\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u0094\u00010\u0093\u00012\b\u0010\u0082\u0001\u001a\u00030\u0095\u0001H\u0002J%\u0010\u0096\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0097\u0001\u001a\u00020u2\b\u0010\u0082\u0001\u001a\u00030\u0095\u00012\u0006\u0010=\u001a\u00020>H\u0002J9\u0010\u0098\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0095\u00012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020>0E2\u0015\u0010\u0092\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u0094\u00010\u0099\u0001H\u0002J \u0010\u009a\u0001\u001a\u00030\u0081\u00012\u0006\u0010A\u001a\u00020B2\u0006\u0010J\u001a\u000208H\u0001¢\u0006\u0003\b\u009b\u0001J\u001b\u0010\u009c\u0001\u001a\u00030\u0081\u00012\u0006\u0010J\u001a\u0002082\u0007\u0010\u008d\u0001\u001a\u00020TH\u0002J\u0014\u0010\u009d\u0001\u001a\u00030\u0081\u00012\b\u0010b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0011\u0010\u009e\u0001\u001a\u0002082\u0006\u0010A\u001a\u00020BH\u0007J#\u0010\u009e\u0001\u001a\u0002082\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020>0C\"\u00020>H\u0007¢\u0006\u0003\u0010\u009f\u0001J\u0017\u0010\u009e\u0001\u001a\u0002082\f\u0010A\u001a\b\u0012\u0004\u0012\u00020>0EH\u0007J\u0018\u0010 \u0001\u001a\u00030\u0081\u00012\u0006\u0010A\u001a\u00020BH\u0001¢\u0006\u0003\b¡\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010)\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b*\u0010\u0002R\u000e\u0010+\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u00048BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0016\u00104\u001a\n 6*\u0004\u0018\u00010505X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006¢\u0001"}, d2 = {"Lcom/facebook/GraphRequest$Companion;", "", "()V", "ACCEPT_LANGUAGE_HEADER", "", "ACCESS_TOKEN_PARAM", "ATTACHED_FILES_PARAM", "ATTACHMENT_FILENAME_PREFIX", "BATCH_APP_ID_PARAM", "BATCH_BODY_PARAM", "BATCH_ENTRY_DEPENDS_ON_PARAM", "BATCH_ENTRY_NAME_PARAM", "BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM", "BATCH_METHOD_PARAM", "BATCH_PARAM", "BATCH_RELATIVE_URL_PARAM", "CAPTION_PARAM", "CONTENT_ENCODING_HEADER", "CONTENT_TYPE_HEADER", "DEBUG_KEY", "DEBUG_MESSAGES_KEY", "DEBUG_MESSAGE_KEY", "DEBUG_MESSAGE_LINK_KEY", "DEBUG_MESSAGE_TYPE_KEY", "DEBUG_PARAM", "DEBUG_SEVERITY_INFO", "DEBUG_SEVERITY_WARNING", "FIELDS_PARAM", "FORMAT_JSON", "FORMAT_PARAM", "ISO_8601_FORMAT_STRING", "MAXIMUM_BATCH_SIZE", "", "ME", "MIME_BOUNDARY", "MY_FRIENDS", "MY_PHOTOS", "PICTURE_PARAM", "SDK_ANDROID", "SDK_PARAM", ViewHierarchyConstants.SEARCH, "TAG", "getTAG$facebook_core_release$annotations", "USER_AGENT_BASE", "USER_AGENT_HEADER", "VIDEOS_SUFFIX", "defaultBatchApplicationId", "mimeContentType", "getMimeContentType", "()Ljava/lang/String;", "userAgent", "getUserAgent", "versionPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "createConnection", "Ljava/net/HttpURLConnection;", "url", "Ljava/net/URL;", "executeAndWait", "Lcom/facebook/GraphResponse;", "request", "Lcom/facebook/GraphRequest;", "executeBatchAndWait", "", "requests", "Lcom/facebook/GraphRequestBatch;", "", "([Lcom/facebook/GraphRequest;)Ljava/util/List;", "", "executeBatchAsync", "Lcom/facebook/GraphRequestAsyncTask;", "([Lcom/facebook/GraphRequest;)Lcom/facebook/GraphRequestAsyncTask;", "executeConnectionAndWait", "connection", "executeConnectionAsync", "callbackHandler", "Landroid/os/Handler;", "getBatchAppId", GraphRequest.BATCH_PARAM, "getDefaultBatchApplicationId", "getDefaultPhotoPathIfNull", "graphPath", "hasOnProgressCallbacks", "", "isGzipCompressible", "isMeRequest", ClientCookie.PATH_ATTR, "isSupportedAttachmentType", "value", "isSupportedParameterType", "newCustomAudienceThirdPartyIdRequest", "accessToken", "Lcom/facebook/AccessToken;", "context", "Landroid/content/Context;", "callback", "Lcom/facebook/GraphRequest$Callback;", "applicationId", "newDeleteObjectRequest", "id", "newGraphPathRequest", "newMeRequest", "Lcom/facebook/GraphRequest$GraphJSONObjectCallback;", "newMyFriendsRequest", "Lcom/facebook/GraphRequest$GraphJSONArrayCallback;", "newPlacesSearchRequest", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "radiusInMeters", "resultsLimit", "searchText", "newPostRequest", "graphObject", "Lorg/json/JSONObject;", "newPostRequestWithBundle", "parameters", "Landroid/os/Bundle;", "newUploadPhotoRequest", "image", "Landroid/graphics/Bitmap;", "caption", NativeProtocol.WEB_DIALOG_PARAMS, "photoUri", "Landroid/net/Uri;", "file", "Ljava/io/File;", "parameterToString", "processGraphObject", "", "serializer", "Lcom/facebook/GraphRequest$KeyValueSerializer;", "processGraphObjectProperty", "key", "passByValue", "processRequest", "logger", "Lcom/facebook/internal/Logger;", "numRequests", "outputStream", "Ljava/io/OutputStream;", "shouldUseGzip", "runCallbacks", "responses", "runCallbacks$facebook_core_release", "serializeAttachments", "attachments", "", "Lcom/facebook/GraphRequest$Attachment;", "Lcom/facebook/GraphRequest$Serializer;", "serializeParameters", "bundle", "serializeRequestsAsJSON", "", "serializeToUrlConnection", "serializeToUrlConnection$facebook_core_release", "setConnectionContentType", "setDefaultBatchApplicationId", "toHttpConnection", "([Lcom/facebook/GraphRequest;)Ljava/net/HttpURLConnection;", "validateFieldsParamForGetRequests", "validateFieldsParamForGetRequests$facebook_core_release", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getDefaultPhotoPathIfNull(String str) {
            return str == null ? GraphRequest.MY_PHOTOS : str;
        }

        public static /* synthetic */ void getTAG$facebook_core_release$annotations() {
        }

        private Companion() {
        }

        @JvmStatic
        public final String getDefaultBatchApplicationId() {
            return GraphRequest.defaultBatchApplicationId;
        }

        @JvmStatic
        public final void setDefaultBatchApplicationId(String str) {
            GraphRequest.defaultBatchApplicationId = str;
        }

        @JvmStatic
        public final GraphRequest newDeleteObjectRequest(AccessToken accessToken, String str, Callback callback) {
            return new GraphRequest(accessToken, str, null, HttpMethod.DELETE, callback, null, 32, null);
        }

        @JvmStatic
        public final GraphRequest newMeRequest(AccessToken accessToken, final GraphJSONObjectCallback graphJSONObjectCallback) {
            return new GraphRequest(accessToken, GraphRequest.ME, null, null, new Callback() { // from class: com.facebook.GraphRequest$Companion$$ExternalSyntheticLambda1
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(GraphResponse graphResponse) {
                    GraphRequest.Companion.m6278newMeRequest$lambda0(GraphRequest.GraphJSONObjectCallback.this, graphResponse);
                }
            }, null, 32, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: newMeRequest$lambda-0  reason: not valid java name */
        public static final void m6278newMeRequest$lambda0(GraphJSONObjectCallback graphJSONObjectCallback, GraphResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (graphJSONObjectCallback == null) {
                return;
            }
            graphJSONObjectCallback.onCompleted(response.getJSONObject(), response);
        }

        @JvmStatic
        public final GraphRequest newPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, Callback callback) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, null, HttpMethod.POST, callback, null, 32, null);
            graphRequest.setGraphObject(jSONObject);
            return graphRequest;
        }

        @JvmStatic
        public final GraphRequest newPostRequestWithBundle(AccessToken accessToken, String str, Bundle bundle, Callback callback) {
            return new GraphRequest(accessToken, str, bundle, HttpMethod.POST, callback, null, 32, null);
        }

        @JvmStatic
        public final GraphRequest newMyFriendsRequest(AccessToken accessToken, final GraphJSONArrayCallback graphJSONArrayCallback) {
            return new GraphRequest(accessToken, GraphRequest.MY_FRIENDS, null, null, new Callback() { // from class: com.facebook.GraphRequest$Companion$newMyFriendsRequest$wrapper$1
                @Override // com.facebook.GraphRequest.Callback
                public void onCompleted(GraphResponse response) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (GraphRequest.GraphJSONArrayCallback.this != null) {
                        JSONObject jSONObject = response.getJSONObject();
                        GraphRequest.GraphJSONArrayCallback.this.onCompleted(jSONObject == null ? null : jSONObject.optJSONArray("data"), response);
                    }
                }
            }, null, 32, null);
        }

        @JvmStatic
        public final GraphRequest newGraphPathRequest(AccessToken accessToken, String str, Callback callback) {
            return new GraphRequest(accessToken, str, null, null, callback, null, 32, null);
        }

        @JvmStatic
        public final GraphRequest newPlacesSearchRequest(AccessToken accessToken, Location location, int i, int i2, String str, final GraphJSONArrayCallback graphJSONArrayCallback) {
            if (location == null) {
                Utility utility = Utility.INSTANCE;
                if (Utility.isNullOrEmpty(str)) {
                    throw new FacebookException("Either location or searchText must be specified.");
                }
            }
            Bundle bundle = new Bundle(5);
            bundle.putString("type", "place");
            bundle.putInt("limit", i2);
            if (location != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.US, "%f,%f", Arrays.copyOf(new Object[]{Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                bundle.putString(TtmlNode.CENTER, format);
                bundle.putInt("distance", i);
            }
            Utility utility2 = Utility.INSTANCE;
            if (!Utility.isNullOrEmpty(str)) {
                bundle.putString("q", str);
            }
            return new GraphRequest(accessToken, "search", bundle, HttpMethod.GET, new Callback() { // from class: com.facebook.GraphRequest$Companion$$ExternalSyntheticLambda2
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(GraphResponse graphResponse) {
                    GraphRequest.Companion.m6279newPlacesSearchRequest$lambda1(GraphRequest.GraphJSONArrayCallback.this, graphResponse);
                }
            }, null, 32, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: newPlacesSearchRequest$lambda-1  reason: not valid java name */
        public static final void m6279newPlacesSearchRequest$lambda1(GraphJSONArrayCallback graphJSONArrayCallback, GraphResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (graphJSONArrayCallback != null) {
                JSONObject jSONObject = response.getJSONObject();
                graphJSONArrayCallback.onCompleted(jSONObject == null ? null : jSONObject.optJSONArray("data"), response);
            }
        }

        @JvmStatic
        public final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, Bitmap image, String str2, Bundle bundle, Callback callback) {
            Intrinsics.checkNotNullParameter(image, "image");
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putParcelable("picture", image);
            if (str2 != null) {
                if (str2.length() > 0) {
                    bundle2.putString("caption", str2);
                }
            }
            return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(str), bundle2, HttpMethod.POST, callback, null, 32, null);
        }

        @JvmStatic
        public final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, File file, String str2, Bundle bundle, Callback callback) throws FileNotFoundException {
            Intrinsics.checkNotNullParameter(file, "file");
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putParcelable("picture", open);
            if (str2 != null) {
                if (str2.length() > 0) {
                    bundle2.putString("caption", str2);
                }
            }
            return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(str), bundle2, HttpMethod.POST, callback, null, 32, null);
        }

        @JvmStatic
        public final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, Uri photoUri, String str2, Bundle bundle, Callback callback) throws FileNotFoundException, FacebookException {
            Intrinsics.checkNotNullParameter(photoUri, "photoUri");
            Utility utility = Utility.INSTANCE;
            if (Utility.isFileUri(photoUri)) {
                return newUploadPhotoRequest(accessToken, str, new File(photoUri.getPath()), str2, bundle, callback);
            }
            Utility utility2 = Utility.INSTANCE;
            if (!Utility.isContentUri(photoUri)) {
                throw new FacebookException("The photo Uri must be either a file:// or content:// Uri");
            }
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putParcelable("picture", photoUri);
            if (str2 != null) {
                if (str2.length() > 0) {
                    bundle2.putString("caption", str2);
                }
            }
            return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(str), bundle2, HttpMethod.POST, callback, null, 32, null);
        }

        @JvmStatic
        public final GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accessToken, Context context, String str, Callback callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (str == null && accessToken != null) {
                str = accessToken.getApplicationId();
            }
            if (str == null) {
                Utility utility = Utility.INSTANCE;
                str = Utility.getMetadataApplicationId(context);
            }
            if (str == null) {
                throw new FacebookException("Facebook App ID cannot be determined");
            }
            String stringPlus = Intrinsics.stringPlus(str, "/custom_audience_third_party_id");
            AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.Companion.getAttributionIdentifiers(context);
            Bundle bundle = new Bundle();
            if (accessToken == null) {
                if (attributionIdentifiers == null) {
                    throw new FacebookException("There is no access token and attribution identifiers could not be retrieved");
                }
                String attributionId = attributionIdentifiers.getAttributionId() != null ? attributionIdentifiers.getAttributionId() : attributionIdentifiers.getAndroidAdvertiserId();
                if (attributionId != null) {
                    bundle.putString("udid", attributionId);
                }
            }
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (FacebookSdk.getLimitEventAndDataUsage(context) || (attributionIdentifiers != null && attributionIdentifiers.isTrackingLimited())) {
                bundle.putString("limit_event_usage", "1");
            }
            return new GraphRequest(accessToken, stringPlus, bundle, HttpMethod.GET, callback, null, 32, null);
        }

        @JvmStatic
        public final GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accessToken, Context context, Callback callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            return newCustomAudienceThirdPartyIdRequest(accessToken, context, null, callback);
        }

        @JvmStatic
        public final HttpURLConnection toHttpConnection(GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return toHttpConnection(ArraysKt.toList(requests));
        }

        @JvmStatic
        public final HttpURLConnection toHttpConnection(Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Validate validate = Validate.INSTANCE;
            Validate.notEmpty(requests, "requests");
            return toHttpConnection(new GraphRequestBatch(requests));
        }

        @JvmStatic
        public final HttpURLConnection toHttpConnection(GraphRequestBatch requests) {
            URL url;
            Intrinsics.checkNotNullParameter(requests, "requests");
            validateFieldsParamForGetRequests$facebook_core_release(requests);
            try {
                if (requests.size() == 1) {
                    url = new URL(requests.get(0).getUrlForSingleRequest());
                } else {
                    ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
                    url = new URL(ServerProtocol.getGraphUrlBase());
                }
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = createConnection(url);
                    serializeToUrlConnection$facebook_core_release(requests, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e) {
                    Utility utility = Utility.INSTANCE;
                    Utility.disconnectQuietly(httpURLConnection);
                    throw new FacebookException("could not construct request body", e);
                } catch (JSONException e2) {
                    Utility utility2 = Utility.INSTANCE;
                    Utility.disconnectQuietly(httpURLConnection);
                    throw new FacebookException("could not construct request body", e2);
                }
            } catch (MalformedURLException e3) {
                throw new FacebookException("could not construct URL for request", e3);
            }
        }

        @JvmStatic
        public final GraphResponse executeAndWait(GraphRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            List<GraphResponse> executeBatchAndWait = executeBatchAndWait(request);
            if (executeBatchAndWait.size() != 1) {
                throw new FacebookException("invalid state: expected a single response");
            }
            return executeBatchAndWait.get(0);
        }

        @JvmStatic
        public final List<GraphResponse> executeBatchAndWait(GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAndWait(ArraysKt.toList(requests));
        }

        @JvmStatic
        public final List<GraphResponse> executeBatchAndWait(Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAndWait(new GraphRequestBatch(requests));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.net.URLConnection] */
        /* JADX WARN: Type inference failed for: r6v0, types: [com.facebook.GraphRequest$Companion] */
        @JvmStatic
        public final List<GraphResponse> executeBatchAndWait(GraphRequestBatch requests) {
            Exception exc;
            ?? r1;
            List<GraphResponse> list;
            Intrinsics.checkNotNullParameter(requests, "requests");
            Validate validate = Validate.INSTANCE;
            Validate.notEmptyAndContainsNoNulls(requests, "requests");
            URLConnection uRLConnection = null;
            try {
                try {
                    exc = null;
                    r1 = toHttpConnection(requests);
                } catch (Exception e) {
                    HttpURLConnection httpURLConnection = null;
                    exc = e;
                    r1 = 0;
                }
                try {
                    if (r1 != 0) {
                        list = executeConnectionAndWait(r1, requests);
                    } else {
                        List<GraphResponse> constructErrorResponses = GraphResponse.Companion.constructErrorResponses(requests.getRequests(), null, new FacebookException(exc));
                        runCallbacks$facebook_core_release(requests, constructErrorResponses);
                        list = constructErrorResponses;
                    }
                    Utility utility = Utility.INSTANCE;
                    r1 = (URLConnection) r1;
                    Utility.disconnectQuietly(r1);
                    return list;
                } catch (Throwable th) {
                    th = th;
                    uRLConnection = r1;
                    Utility utility2 = Utility.INSTANCE;
                    Utility.disconnectQuietly(uRLConnection);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                Utility utility22 = Utility.INSTANCE;
                Utility.disconnectQuietly(uRLConnection);
                throw th;
            }
        }

        @JvmStatic
        public final GraphRequestAsyncTask executeBatchAsync(GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAsync(ArraysKt.toList(requests));
        }

        @JvmStatic
        public final GraphRequestAsyncTask executeBatchAsync(Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAsync(new GraphRequestBatch(requests));
        }

        @JvmStatic
        public final GraphRequestAsyncTask executeBatchAsync(GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Validate validate = Validate.INSTANCE;
            Validate.notEmptyAndContainsNoNulls(requests, "requests");
            GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(requests);
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            graphRequestAsyncTask.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
            return graphRequestAsyncTask;
        }

        @JvmStatic
        public final List<GraphResponse> executeConnectionAndWait(HttpURLConnection connection, Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeConnectionAndWait(connection, new GraphRequestBatch(requests));
        }

        @JvmStatic
        public final List<GraphResponse> executeConnectionAndWait(HttpURLConnection connection, GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            List<GraphResponse> fromHttpConnection$facebook_core_release = GraphResponse.Companion.fromHttpConnection$facebook_core_release(connection, requests);
            Utility utility = Utility.INSTANCE;
            Utility.disconnectQuietly(connection);
            int size = requests.size();
            if (size != fromHttpConnection$facebook_core_release.size()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(fromHttpConnection$facebook_core_release.size()), Integer.valueOf(size)}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                throw new FacebookException(format);
            }
            runCallbacks$facebook_core_release(requests, fromHttpConnection$facebook_core_release);
            AccessTokenManager.Companion.getInstance().extendAccessTokenIfNeeded();
            return fromHttpConnection$facebook_core_release;
        }

        @JvmStatic
        public final GraphRequestAsyncTask executeConnectionAsync(HttpURLConnection connection, GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeConnectionAsync(null, connection, requests);
        }

        @JvmStatic
        public final GraphRequestAsyncTask executeConnectionAsync(Handler handler, HttpURLConnection connection, GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(connection, requests);
            requests.setCallbackHandler(handler);
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            graphRequestAsyncTask.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
            return graphRequestAsyncTask;
        }

        @JvmStatic
        public final void runCallbacks$facebook_core_release(final GraphRequestBatch requests, List<GraphResponse> responses) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(responses, "responses");
            int size = requests.size();
            final ArrayList arrayList = new ArrayList();
            if (size > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    GraphRequest graphRequest = requests.get(i);
                    if (graphRequest.getCallback() != null) {
                        arrayList.add(new Pair(graphRequest.getCallback(), responses.get(i)));
                    }
                    if (i2 >= size) {
                        break;
                    }
                    i = i2;
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: com.facebook.GraphRequest$Companion$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        GraphRequest.Companion.m6280runCallbacks$lambda2(arrayList, requests);
                    }
                };
                Handler callbackHandler = requests.getCallbackHandler();
                if ((callbackHandler == null ? null : Boolean.valueOf(callbackHandler.post(runnable))) == null) {
                    runnable.run();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: runCallbacks$lambda-2  reason: not valid java name */
        public static final void m6280runCallbacks$lambda2(ArrayList callbacks, GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(callbacks, "$callbacks");
            Intrinsics.checkNotNullParameter(requests, "$requests");
            Iterator it = callbacks.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = pair.second;
                Intrinsics.checkNotNullExpressionValue(obj, "pair.second");
                ((Callback) pair.first).onCompleted((GraphResponse) obj);
            }
            for (GraphRequestBatch.Callback callback : requests.getCallbacks()) {
                callback.onBatchCompleted(requests);
            }
        }

        private final HttpURLConnection createConnection(URL url) throws IOException {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            if (uRLConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestProperty("User-Agent", getUserAgent());
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private final boolean hasOnProgressCallbacks(GraphRequestBatch graphRequestBatch) {
            for (GraphRequestBatch.Callback callback : graphRequestBatch.getCallbacks()) {
                if (callback instanceof GraphRequestBatch.OnProgressCallback) {
                    return true;
                }
            }
            Iterator<GraphRequest> it = graphRequestBatch.iterator();
            while (it.hasNext()) {
                if (it.next().getCallback() instanceof OnProgressCallback) {
                    return true;
                }
            }
            return false;
        }

        private final void setConnectionContentType(HttpURLConnection httpURLConnection, boolean z) {
            if (z) {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                return;
            }
            httpURLConnection.setRequestProperty("Content-Type", getMimeContentType());
        }

        private final boolean isGzipCompressible(GraphRequestBatch graphRequestBatch) {
            Iterator<GraphRequest> it = graphRequestBatch.iterator();
            while (it.hasNext()) {
                GraphRequest next = it.next();
                for (String str : next.getParameters().keySet()) {
                    if (isSupportedAttachmentType(next.getParameters().get(str))) {
                        return false;
                    }
                }
            }
            return true;
        }

        @JvmStatic
        public final void validateFieldsParamForGetRequests$facebook_core_release(GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Iterator<GraphRequest> it = requests.iterator();
            while (it.hasNext()) {
                GraphRequest next = it.next();
                if (HttpMethod.GET == next.getHttpMethod()) {
                    Utility utility = Utility.INSTANCE;
                    if (Utility.isNullOrEmpty(next.getParameters().getString(GraphRequest.FIELDS_PARAM))) {
                        Logger.Companion companion = Logger.Companion;
                        LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                        StringBuilder sb = new StringBuilder("GET requests for /");
                        String graphPath = next.getGraphPath();
                        if (graphPath == null) {
                            graphPath = "";
                        }
                        sb.append(graphPath);
                        sb.append(" should contain an explicit \"fields\" parameter.");
                        companion.log(loggingBehavior, 5, "Request", sb.toString());
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void serializeToUrlConnection$facebook_core_release(GraphRequestBatch requests, HttpURLConnection connection) throws IOException, JSONException {
            GZIPOutputStream gZIPOutputStream;
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(connection, "connection");
            Logger logger = new Logger(LoggingBehavior.REQUESTS, "Request");
            int size = requests.size();
            boolean isGzipCompressible = isGzipCompressible(requests);
            BufferedOutputStream bufferedOutputStream = null;
            HttpMethod httpMethod = size == 1 ? requests.get(0).getHttpMethod() : null;
            if (httpMethod == null) {
                httpMethod = HttpMethod.POST;
            }
            connection.setRequestMethod(httpMethod.name());
            setConnectionContentType(connection, isGzipCompressible);
            URL url = connection.getURL();
            logger.append("Request:\n");
            logger.appendKeyValue("Id", requests.getId());
            Intrinsics.checkNotNullExpressionValue(url, "url");
            logger.appendKeyValue("URL", url);
            String requestMethod = connection.getRequestMethod();
            Intrinsics.checkNotNullExpressionValue(requestMethod, "connection.requestMethod");
            logger.appendKeyValue("Method", requestMethod);
            String requestProperty = connection.getRequestProperty("User-Agent");
            Intrinsics.checkNotNullExpressionValue(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            logger.appendKeyValue("User-Agent", requestProperty);
            String requestProperty2 = connection.getRequestProperty("Content-Type");
            Intrinsics.checkNotNullExpressionValue(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            logger.appendKeyValue("Content-Type", requestProperty2);
            connection.setConnectTimeout(requests.getTimeout());
            connection.setReadTimeout(requests.getTimeout());
            if (!(httpMethod == HttpMethod.POST)) {
                logger.log();
                return;
            }
            connection.setDoOutput(true);
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(connection.getOutputStream());
                if (isGzipCompressible) {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream2);
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        throw th;
                    }
                } else {
                    gZIPOutputStream = bufferedOutputStream2;
                }
                try {
                    if (hasOnProgressCallbacks(requests)) {
                        ProgressNoopOutputStream progressNoopOutputStream = new ProgressNoopOutputStream(requests.getCallbackHandler());
                        processRequest(requests, null, size, url, progressNoopOutputStream, isGzipCompressible);
                        gZIPOutputStream = new ProgressOutputStream(gZIPOutputStream, requests, progressNoopOutputStream.getProgressMap(), progressNoopOutputStream.getMaxProgress());
                    }
                    processRequest(requests, logger, size, url, gZIPOutputStream, isGzipCompressible);
                    gZIPOutputStream.close();
                    logger.log();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream = gZIPOutputStream;
                    if (bufferedOutputStream != null) {
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private final void processRequest(GraphRequestBatch graphRequestBatch, Logger logger, int i, URL url, OutputStream outputStream, boolean z) {
            Serializer serializer = new Serializer(outputStream, logger, z);
            if (i == 1) {
                GraphRequest graphRequest = graphRequestBatch.get(0);
                HashMap hashMap = new HashMap();
                for (String key : graphRequest.getParameters().keySet()) {
                    Object obj = graphRequest.getParameters().get(key);
                    if (isSupportedAttachmentType(obj)) {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        hashMap.put(key, new Attachment(graphRequest, obj));
                    }
                }
                if (logger != null) {
                    logger.append("  Parameters:\n");
                }
                serializeParameters(graphRequest.getParameters(), serializer, graphRequest);
                if (logger != null) {
                    logger.append("  Attachments:\n");
                }
                serializeAttachments(hashMap, serializer);
                JSONObject graphObject = graphRequest.getGraphObject();
                if (graphObject != null) {
                    String path = url.getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "url.path");
                    processGraphObject(graphObject, path, serializer);
                    return;
                }
                return;
            }
            String batchAppId = getBatchAppId(graphRequestBatch);
            if (batchAppId.length() == 0) {
                throw new FacebookException("App ID was not specified at the request or Settings.");
            }
            serializer.writeString(GraphRequest.BATCH_APP_ID_PARAM, batchAppId);
            HashMap hashMap2 = new HashMap();
            serializeRequestsAsJSON(serializer, graphRequestBatch, hashMap2);
            if (logger != null) {
                logger.append("  Attachments:\n");
            }
            serializeAttachments(hashMap2, serializer);
        }

        private final boolean isMeRequest(String str) {
            Matcher matcher = GraphRequest.versionPattern.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(str, "matcher.group(1)");
            }
            return StringsKt.startsWith$default(str, "me/", false, 2, (Object) null) || StringsKt.startsWith$default(str, "/me/", false, 2, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void processGraphObject(JSONObject jSONObject, String str, KeyValueSerializer keyValueSerializer) {
            boolean z;
            Iterator<String> keys;
            if (isMeRequest(str)) {
                String str2 = str;
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, CertificateUtil.DELIMITER, 0, false, 6, (Object) null);
                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str2, "?", 0, false, 6, (Object) null);
                if (indexOf$default > 3 && (indexOf$default2 == -1 || indexOf$default < indexOf$default2)) {
                    z = true;
                    keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String key = keys.next();
                        Object value = jSONObject.opt(key);
                        boolean z2 = z && StringsKt.equals(key, "image", true);
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        Intrinsics.checkNotNullExpressionValue(value, "value");
                        processGraphObjectProperty(key, value, keyValueSerializer, z2);
                    }
                }
            }
            z = false;
            keys = jSONObject.keys();
            while (keys.hasNext()) {
            }
        }

        private final void processGraphObjectProperty(String str, Object obj, KeyValueSerializer keyValueSerializer, boolean z) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        Intrinsics.checkNotNullExpressionValue(opt, "jsonObject.opt(propertyName)");
                        processGraphObjectProperty(format, opt, keyValueSerializer, z);
                    }
                } else if (jSONObject.has("id")) {
                    String optString = jSONObject.optString("id");
                    Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(\"id\")");
                    processGraphObjectProperty(str, optString, keyValueSerializer, z);
                } else if (jSONObject.has("url")) {
                    String optString2 = jSONObject.optString("url");
                    Intrinsics.checkNotNullExpressionValue(optString2, "jsonObject.optString(\"url\")");
                    processGraphObjectProperty(str, optString2, keyValueSerializer, z);
                } else if (jSONObject.has(NativeProtocol.OPEN_GRAPH_CREATE_OBJECT_KEY)) {
                    String jSONObject2 = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.toString()");
                    processGraphObjectProperty(str, jSONObject2, keyValueSerializer, z);
                }
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                if (length <= 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String format2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                    Object opt2 = jSONArray.opt(i);
                    Intrinsics.checkNotNullExpressionValue(opt2, "jsonArray.opt(i)");
                    processGraphObjectProperty(format2, opt2, keyValueSerializer, z);
                    if (i2 >= length) {
                        return;
                    }
                    i = i2;
                }
            } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                keyValueSerializer.writeString(str, obj.toString());
            } else if (Date.class.isAssignableFrom(cls)) {
                String format3 = new SimpleDateFormat(GraphRequest.ISO_8601_FORMAT_STRING, Locale.US).format((Date) obj);
                Intrinsics.checkNotNullExpressionValue(format3, "iso8601DateFormat.format(date)");
                keyValueSerializer.writeString(str, format3);
            } else {
                Utility utility = Utility.INSTANCE;
                Utility.logd(GraphRequest.TAG, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
            }
        }

        private final void serializeParameters(Bundle bundle, Serializer serializer, GraphRequest graphRequest) {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (isSupportedParameterType(obj)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    serializer.writeObject(key, obj, graphRequest);
                }
            }
        }

        private final void serializeRequestsAsJSON(Serializer serializer, Collection<GraphRequest> collection, Map<String, Attachment> map) {
            JSONArray jSONArray = new JSONArray();
            for (GraphRequest graphRequest : collection) {
                graphRequest.serializeToBatch(jSONArray, map);
            }
            serializer.writeRequestsAsJson(GraphRequest.BATCH_PARAM, jSONArray, collection);
        }

        private final String getMimeContentType() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.MIME_BOUNDARY}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            return format;
        }

        private final String getUserAgent() {
            if (GraphRequest.userAgent == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{GraphRequest.USER_AGENT_BASE, FacebookSdkVersion.BUILD}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                GraphRequest.userAgent = format;
                InternalSettings internalSettings = InternalSettings.INSTANCE;
                String customUserAgent = InternalSettings.getCustomUserAgent();
                Utility utility = Utility.INSTANCE;
                if (!Utility.isNullOrEmpty(customUserAgent)) {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.userAgent, customUserAgent}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                    GraphRequest.userAgent = format2;
                }
            }
            return GraphRequest.userAgent;
        }

        private final String getBatchAppId(GraphRequestBatch graphRequestBatch) {
            String batchApplicationId = graphRequestBatch.getBatchApplicationId();
            if (batchApplicationId == null || !(!graphRequestBatch.isEmpty())) {
                Iterator<GraphRequest> it = graphRequestBatch.iterator();
                while (it.hasNext()) {
                    AccessToken accessToken = it.next().getAccessToken();
                    if (accessToken != null) {
                        return accessToken.getApplicationId();
                    }
                }
                String str = GraphRequest.defaultBatchApplicationId;
                if (str != null) {
                    if (str.length() > 0) {
                        return str;
                    }
                }
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                return FacebookSdk.getApplicationId();
            }
            return batchApplicationId;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSupportedAttachmentType(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSupportedParameterType(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String parameterToString(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (obj instanceof Date) {
                String format = new SimpleDateFormat(GraphRequest.ISO_8601_FORMAT_STRING, Locale.US).format((Date) obj);
                Intrinsics.checkNotNullExpressionValue(format, "iso8601DateFormat.format(value)");
                return format;
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }

        private final void serializeAttachments(Map<String, Attachment> map, Serializer serializer) {
            for (Map.Entry<String, Attachment> entry : map.entrySet()) {
                if (GraphRequest.Companion.isSupportedAttachmentType(entry.getValue().getValue())) {
                    serializer.writeObject(entry.getKey(), entry.getValue().getValue(), entry.getValue().getRequest());
                }
            }
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("GraphRequest", "GraphRequest::class.java.simpleName");
        TAG = "GraphRequest";
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            int i = 0;
            do {
                i++;
                sb.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i < nextInt);
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "buffer.toString()");
            MIME_BOUNDARY = sb2;
            versionPattern = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
        }
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "buffer.toString()");
        MIME_BOUNDARY = sb22;
        versionPattern = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, Callback callback, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accessToken, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? null : httpMethod, (i & 16) != 0 ? null : callback, (i & 32) != 0 ? null : str2);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, Callback callback, String str2) {
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.graphPath = str;
        this.version = str2;
        setCallback(callback);
        setHttpMethod(httpMethod);
        if (bundle != null) {
            this.parameters = new Bundle(bundle);
        } else {
            this.parameters = new Bundle();
        }
        if (this.version == null) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            this.version = FacebookSdk.getGraphApiVersion();
        }
    }

    public GraphRequest(AccessToken accessToken, URL overriddenURL) {
        Intrinsics.checkNotNullParameter(overriddenURL, "overriddenURL");
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.overriddenURL = overriddenURL.toString();
        setHttpMethod(HttpMethod.GET);
        this.parameters = new Bundle();
    }

    public final void setForceApplicationRequest(boolean z) {
        this.forceApplicationRequest = z;
    }

    public final GraphResponse executeAndWait() {
        return Companion.executeAndWait(this);
    }

    public final GraphRequestAsyncTask executeAsync() {
        return Companion.executeBatchAsync(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.accessToken;
        if (obj == null) {
            obj = AbstractJsonLexerKt.NULL;
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.graphPath);
        sb.append(", graphObject: ");
        sb.append(this.graphObject);
        sb.append(", httpMethod: ");
        sb.append(this.httpMethod);
        sb.append(", parameters: ");
        sb.append(this.parameters);
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }

    private final void addCommonParameters() {
        Bundle bundle = this.parameters;
        if (shouldForceClientTokenForRequest()) {
            bundle.putString("access_token", getClientTokenForRequest());
        } else {
            String accessTokenToUseForRequest = getAccessTokenToUseForRequest();
            if (accessTokenToUseForRequest != null) {
                bundle.putString("access_token", accessTokenToUseForRequest);
            }
        }
        if (!bundle.containsKey("access_token")) {
            Utility utility = Utility.INSTANCE;
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (Utility.isNullOrEmpty(FacebookSdk.getClientToken())) {
                Log.w(TAG, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString(FORMAT_PARAM, FORMAT_JSON);
        FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            bundle.putString(DEBUG_PARAM, DEBUG_SEVERITY_INFO);
            return;
        }
        FacebookSdk facebookSdk3 = FacebookSdk.INSTANCE;
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString(DEBUG_PARAM, DEBUG_SEVERITY_WARNING);
        }
    }

    private final String getAccessTokenToUseForRequest() {
        AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            if (!this.parameters.containsKey("access_token")) {
                String token = accessToken.getToken();
                Logger.Companion.registerAccessToken(token);
                return token;
            }
        } else if (!this.parameters.containsKey("access_token")) {
            return getClientTokenForRequest();
        }
        return this.parameters.getString("access_token");
    }

    private final String getClientTokenForRequest() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String applicationId = FacebookSdk.getApplicationId();
        FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
        String clientToken = FacebookSdk.getClientToken();
        if (applicationId.length() > 0) {
            if (clientToken.length() > 0) {
                return applicationId + '|' + clientToken;
            }
        }
        Utility utility = Utility.INSTANCE;
        Utility.logd(TAG, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    private final String appendParametersToBaseUrl(String str, boolean z) {
        if (z || this.httpMethod != HttpMethod.POST) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (String str2 : this.parameters.keySet()) {
                Object obj = this.parameters.get(str2);
                if (obj == null) {
                    obj = "";
                }
                Companion companion = Companion;
                if (!companion.isSupportedParameterType(obj)) {
                    if (this.httpMethod != HttpMethod.GET) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                        throw new IllegalArgumentException(format);
                    }
                } else {
                    buildUpon.appendQueryParameter(str2, companion.parameterToString(obj).toString());
                }
            }
            String builder = buildUpon.toString();
            Intrinsics.checkNotNullExpressionValue(builder, "uriBuilder.toString()");
            return builder;
        }
        return str;
    }

    public final String getRelativeUrlForBatchedRequest() {
        if (this.overriddenURL != null) {
            throw new FacebookException("Can't override URL for a batch request");
        }
        ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
        String urlWithGraphPath = getUrlWithGraphPath(ServerProtocol.getGraphUrlBase());
        addCommonParameters();
        Uri parse = Uri.parse(appendParametersToBaseUrl(urlWithGraphPath, true));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final String getUrlForSingleRequest() {
        String graphUrlBaseForSubdomain;
        String str = this.overriddenURL;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.graphPath;
        if (this.httpMethod == HttpMethod.POST && str2 != null && StringsKt.endsWith$default(str2, VIDEOS_SUFFIX, false, 2, (Object) null)) {
            ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
            graphUrlBaseForSubdomain = ServerProtocol.getGraphVideoUrlBase();
        } else {
            ServerProtocol serverProtocol2 = ServerProtocol.INSTANCE;
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            graphUrlBaseForSubdomain = ServerProtocol.getGraphUrlBaseForSubdomain(FacebookSdk.getGraphDomain());
        }
        String urlWithGraphPath = getUrlWithGraphPath(graphUrlBaseForSubdomain);
        addCommonParameters();
        return appendParametersToBaseUrl(urlWithGraphPath, false);
    }

    private final String getGraphPathWithVersion() {
        if (versionPattern.matcher(this.graphPath).matches()) {
            return this.graphPath;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.version, this.graphPath}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final String getUrlWithGraphPath(String str) {
        if (!isValidGraphRequestForDomain()) {
            ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
            str = ServerProtocol.getFacebookGraphUrlBase();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, getGraphPathWithVersion()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final boolean shouldForceClientTokenForRequest() {
        String accessTokenToUseForRequest = getAccessTokenToUseForRequest();
        boolean contains$default = accessTokenToUseForRequest == null ? false : StringsKt.contains$default((CharSequence) accessTokenToUseForRequest, (CharSequence) "|", false, 2, (Object) null);
        if (((accessTokenToUseForRequest == null || !StringsKt.startsWith$default(accessTokenToUseForRequest, "IG", false, 2, (Object) null) || contains$default) ? false : true) && isApplicationRequest()) {
            return true;
        }
        return (isValidGraphRequestForDomain() || contains$default) ? false : true;
    }

    private final boolean isValidGraphRequestForDomain() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (Intrinsics.areEqual(FacebookSdk.getGraphDomain(), FacebookSdk.INSTAGRAM_COM)) {
            return !isApplicationRequest();
        }
        return true;
    }

    private final boolean isApplicationRequest() {
        if (this.graphPath == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("^/?");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        sb.append(FacebookSdk.getApplicationId());
        sb.append("/?.*");
        return this.forceApplicationRequest || Pattern.matches(sb.toString(), this.graphPath) || Pattern.matches("^/?app/?.*", this.graphPath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/GraphRequest$Attachment;", "", "request", "Lcom/facebook/GraphRequest;", "value", "(Lcom/facebook/GraphRequest;Ljava/lang/Object;)V", "getRequest", "()Lcom/facebook/GraphRequest;", "getValue", "()Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Attachment {
        private final GraphRequest request;
        private final Object value;

        public Attachment(GraphRequest request, Object obj) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
            this.value = obj;
        }

        public final GraphRequest getRequest() {
            return this.request;
        }

        public final Object getValue() {
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void serializeToBatch(JSONArray jSONArray, Map<String, Attachment> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.batchEntryName;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put(BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM, this.batchEntryOmitResultOnSuccess);
        }
        String str2 = this.batchEntryDependsOn;
        if (str2 != null) {
            jSONObject.put(BATCH_ENTRY_DEPENDS_ON_PARAM, str2);
        }
        String relativeUrlForBatchedRequest = getRelativeUrlForBatchedRequest();
        jSONObject.put(BATCH_RELATIVE_URL_PARAM, relativeUrlForBatchedRequest);
        jSONObject.put("method", this.httpMethod);
        AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            Logger.Companion.registerAccessToken(accessToken.getToken());
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.parameters.keySet()) {
            Object obj = this.parameters.get(str3);
            if (Companion.isSupportedAttachmentType(obj)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new Attachment(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put(ATTACHED_FILES_PARAM, TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.graphObject;
        if (jSONObject2 != null) {
            final ArrayList arrayList2 = new ArrayList();
            Companion.processGraphObject(jSONObject2, relativeUrlForBatchedRequest, new KeyValueSerializer() { // from class: com.facebook.GraphRequest$serializeToBatch$1
                @Override // com.facebook.GraphRequest.KeyValueSerializer
                public void writeString(String key, String value) throws IOException {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ArrayList<String> arrayList3 = arrayList2;
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String format2 = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, "UTF-8")}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                    arrayList3.add(format2);
                }
            });
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ+\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014\"\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dJ$\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u00122\b\u0010 \u001a\u0004\u0018\u00010\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0012J \u0010\"\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0012J \u0010&\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010\u0012J+\u0010)\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014\"\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\"\u0010*\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010\u00152\b\u0010,\u001a\u0004\u0018\u00010-J\u0006\u0010.\u001a\u00020\u0010J$\u0010/\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020-03J\u0018\u00104\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0012H\u0016R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u00060\u000bj\u0002`\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/facebook/GraphRequest$Serializer;", "Lcom/facebook/GraphRequest$KeyValueSerializer;", "outputStream", "Ljava/io/OutputStream;", "logger", "Lcom/facebook/internal/Logger;", "useUrlEncode", "", "(Ljava/io/OutputStream;Lcom/facebook/internal/Logger;Z)V", "firstWrite", "invalidTypeError", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "getInvalidTypeError", "()Ljava/lang/RuntimeException;", "write", "", GraphRequest.FORMAT_PARAM, "", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "writeBitmap", "key", "bitmap", "Landroid/graphics/Bitmap;", "writeBytes", "bytes", "", "writeContentDisposition", "name", "filename", "contentType", "writeContentUri", "contentUri", "Landroid/net/Uri;", "mimeType", "writeFile", "descriptor", "Landroid/os/ParcelFileDescriptor;", "writeLine", "writeObject", "value", "request", "Lcom/facebook/GraphRequest;", "writeRecordBoundary", "writeRequestsAsJson", "requestJsonArray", "Lorg/json/JSONArray;", "requests", "", "writeString", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Serializer implements KeyValueSerializer {
        private boolean firstWrite;
        private final Logger logger;
        private final OutputStream outputStream;
        private final boolean useUrlEncode;

        public Serializer(OutputStream outputStream, Logger logger, boolean z) {
            Intrinsics.checkNotNullParameter(outputStream, "outputStream");
            this.outputStream = outputStream;
            this.logger = logger;
            this.firstWrite = true;
            this.useUrlEncode = z;
        }

        public final void writeObject(String key, Object obj, GraphRequest graphRequest) {
            Intrinsics.checkNotNullParameter(key, "key");
            OutputStream outputStream = this.outputStream;
            if (outputStream instanceof RequestOutputStream) {
                ((RequestOutputStream) outputStream).setCurrentRequest(graphRequest);
            }
            if (GraphRequest.Companion.isSupportedParameterType(obj)) {
                writeString(key, GraphRequest.Companion.parameterToString(obj));
            } else if (obj instanceof Bitmap) {
                writeBitmap(key, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                writeBytes(key, (byte[]) obj);
            } else if (obj instanceof Uri) {
                writeContentUri(key, (Uri) obj, null);
            } else if (obj instanceof ParcelFileDescriptor) {
                writeFile(key, (ParcelFileDescriptor) obj, null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                Parcelable resource = parcelableResourceWithMimeType.getResource();
                String mimeType = parcelableResourceWithMimeType.getMimeType();
                if (resource instanceof ParcelFileDescriptor) {
                    writeFile(key, (ParcelFileDescriptor) resource, mimeType);
                } else if (resource instanceof Uri) {
                    writeContentUri(key, (Uri) resource, mimeType);
                } else {
                    throw getInvalidTypeError();
                }
            } else {
                throw getInvalidTypeError();
            }
        }

        private final RuntimeException getInvalidTypeError() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public final void writeRequestsAsJson(String key, JSONArray requestJsonArray, Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(requestJsonArray, "requestJsonArray");
            Intrinsics.checkNotNullParameter(requests, "requests");
            OutputStream outputStream = this.outputStream;
            if (!(outputStream instanceof RequestOutputStream)) {
                String jSONArray = requestJsonArray.toString();
                Intrinsics.checkNotNullExpressionValue(jSONArray, "requestJsonArray.toString()");
                writeString(key, jSONArray);
                return;
            }
            RequestOutputStream requestOutputStream = (RequestOutputStream) outputStream;
            writeContentDisposition(key, null, null);
            write("[", new Object[0]);
            int i = 0;
            for (GraphRequest graphRequest : requests) {
                int i2 = i + 1;
                JSONObject jSONObject = requestJsonArray.getJSONObject(i);
                requestOutputStream.setCurrentRequest(graphRequest);
                if (i > 0) {
                    write(",%s", jSONObject.toString());
                } else {
                    write("%s", jSONObject.toString());
                }
                i = i2;
            }
            write("]", new Object[0]);
            Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            String stringPlus = Intrinsics.stringPlus("    ", key);
            String jSONArray2 = requestJsonArray.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "requestJsonArray.toString()");
            logger.appendKeyValue(stringPlus, jSONArray2);
        }

        @Override // com.facebook.GraphRequest.KeyValueSerializer
        public void writeString(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            writeContentDisposition(key, null, null);
            writeLine("%s", value);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            logger.appendKeyValue(Intrinsics.stringPlus("    ", key), value);
        }

        public final void writeBitmap(String key, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            writeContentDisposition(key, key, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.outputStream);
            writeLine("", new Object[0]);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            logger.appendKeyValue(Intrinsics.stringPlus("    ", key), "<Image>");
        }

        public final void writeBytes(String key, byte[] bytes) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            writeContentDisposition(key, key, "content/unknown");
            this.outputStream.write(bytes);
            writeLine("", new Object[0]);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            String stringPlus = Intrinsics.stringPlus("    ", key);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            logger.appendKeyValue(stringPlus, format);
        }

        public final void writeContentUri(String key, Uri contentUri, String str) {
            int copyAndCloseInputStream;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            writeContentDisposition(key, key, str);
            if (this.outputStream instanceof ProgressNoopOutputStream) {
                Utility utility = Utility.INSTANCE;
                ((ProgressNoopOutputStream) this.outputStream).addProgress(Utility.getContentSize(contentUri));
                copyAndCloseInputStream = 0;
            } else {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                InputStream openInputStream = FacebookSdk.getApplicationContext().getContentResolver().openInputStream(contentUri);
                Utility utility2 = Utility.INSTANCE;
                copyAndCloseInputStream = Utility.copyAndCloseInputStream(openInputStream, this.outputStream) + 0;
            }
            writeLine("", new Object[0]);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            String stringPlus = Intrinsics.stringPlus("    ", key);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(copyAndCloseInputStream)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            logger.appendKeyValue(stringPlus, format);
        }

        public final void writeFile(String key, ParcelFileDescriptor descriptor, String str) {
            int copyAndCloseInputStream;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            writeContentDisposition(key, key, str);
            OutputStream outputStream = this.outputStream;
            if (outputStream instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) outputStream).addProgress(descriptor.getStatSize());
                copyAndCloseInputStream = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(descriptor);
                Utility utility = Utility.INSTANCE;
                copyAndCloseInputStream = Utility.copyAndCloseInputStream(autoCloseInputStream, this.outputStream) + 0;
            }
            writeLine("", new Object[0]);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            String stringPlus = Intrinsics.stringPlus("    ", key);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(copyAndCloseInputStream)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            logger.appendKeyValue(stringPlus, format);
        }

        public final void writeRecordBoundary() {
            if (!this.useUrlEncode) {
                writeLine("--%s", GraphRequest.MIME_BOUNDARY);
                return;
            }
            OutputStream outputStream = this.outputStream;
            byte[] bytes = "&".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void writeContentDisposition(String str, String str2, String str3) {
            if (!this.useUrlEncode) {
                write("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    write("; filename=\"%s\"", str2);
                }
                writeLine("", new Object[0]);
                if (str3 != null) {
                    writeLine("%s: %s", "Content-Type", str3);
                }
                writeLine("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.outputStream;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            Charset charset = Charsets.UTF_8;
            if (format == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = format.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void write(String format, Object... args) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (!this.useUrlEncode) {
                if (this.firstWrite) {
                    OutputStream outputStream = this.outputStream;
                    byte[] bytes = "--".getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    OutputStream outputStream2 = this.outputStream;
                    String str = GraphRequest.MIME_BOUNDARY;
                    Charset charset = Charsets.UTF_8;
                    if (str == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    byte[] bytes2 = str.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                    outputStream2.write(bytes2);
                    OutputStream outputStream3 = this.outputStream;
                    byte[] bytes3 = HTTP.CRLF.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
                    outputStream3.write(bytes3);
                    this.firstWrite = false;
                }
                OutputStream outputStream4 = this.outputStream;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                Charset charset2 = Charsets.UTF_8;
                if (format2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes4 = format2.getBytes(charset2);
                Intrinsics.checkNotNullExpressionValue(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                return;
            }
            OutputStream outputStream5 = this.outputStream;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            Object[] copyOf2 = Arrays.copyOf(args, args.length);
            String format3 = String.format(locale, format, Arrays.copyOf(copyOf2, copyOf2.length));
            Intrinsics.checkNotNullExpressionValue(format3, "java.lang.String.format(locale, format, *args)");
            String encode = URLEncoder.encode(format3, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
            byte[] bytes5 = encode.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void writeLine(String format, Object... args) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            write(format, Arrays.copyOf(args, args.length));
            if (this.useUrlEncode) {
                return;
            }
            write(HTTP.CRLF, new Object[0]);
        }
    }

    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u0015*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u0002:\u0001\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "RESOURCE", "Landroid/os/Parcelable;", "resource", "mimeType", "", "(Landroid/os/Parcelable;Ljava/lang/String;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getMimeType", "()Ljava/lang/String;", "getResource", "()Landroid/os/Parcelable;", "Landroid/os/Parcelable;", "describeContents", "", "writeToParcel", "", "out", "flags", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        private final String mimeType;
        private final RESOURCE resource;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new Parcelable.Creator<ParcelableResourceWithMimeType<?>>() { // from class: com.facebook.GraphRequest$ParcelableResourceWithMimeType$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public GraphRequest.ParcelableResourceWithMimeType<?> createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new GraphRequest.ParcelableResourceWithMimeType<>(source, (DefaultConstructorMarker) null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public GraphRequest.ParcelableResourceWithMimeType<?>[] newArray(int i) {
                return new GraphRequest.ParcelableResourceWithMimeType[i];
            }
        };

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final RESOURCE getResource() {
            return this.resource;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.mimeType);
            out.writeParcelable(this.resource, i);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.mimeType = str;
            this.resource = resource;
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            this.resource = (RESOURCE) parcel.readParcelable(FacebookSdk.getApplicationContext().getClassLoader());
        }

        /* compiled from: GraphRequest.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
