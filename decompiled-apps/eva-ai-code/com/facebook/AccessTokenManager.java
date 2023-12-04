package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenManager;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.internal.Utility;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: AccessTokenManager.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 !2\u00020\u0001:\u0005!\"#$%B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u001c\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\f\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u0017H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/facebook/AccessTokenManager;", "", "localBroadcastManager", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "accessTokenCache", "Lcom/facebook/AccessTokenCache;", "(Landroidx/localbroadcastmanager/content/LocalBroadcastManager;Lcom/facebook/AccessTokenCache;)V", "value", "Lcom/facebook/AccessToken;", "currentAccessToken", "getCurrentAccessToken", "()Lcom/facebook/AccessToken;", "setCurrentAccessToken", "(Lcom/facebook/AccessToken;)V", "currentAccessTokenField", "lastAttemptedTokenExtendDate", "Ljava/util/Date;", "tokenRefreshInProgress", "Ljava/util/concurrent/atomic/AtomicBoolean;", "currentAccessTokenChanged", "", "extendAccessTokenIfNeeded", "loadCurrentAccessToken", "", "refreshCurrentAccessToken", "callback", "Lcom/facebook/AccessToken$AccessTokenRefreshCallback;", "refreshCurrentAccessTokenImpl", "sendCurrentAccessTokenChangedBroadcastIntent", "oldAccessToken", "saveToCache", "setTokenExpirationBroadcastAlarm", "shouldExtendAccessToken", "Companion", "FacebookRefreshTokenInfo", "InstagramRefreshTokenInfo", "RefreshResult", "RefreshTokenInfo", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AccessTokenManager {
    public static final String ACTION_CURRENT_ACCESS_TOKEN_CHANGED = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_NEW_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN";
    public static final String EXTRA_OLD_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN";
    private static final String ME_PERMISSIONS_GRAPH_PATH = "me/permissions";
    public static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
    public static final String TAG = "AccessTokenManager";
    private static final int TOKEN_EXTEND_RETRY_SECONDS = 3600;
    private static final int TOKEN_EXTEND_THRESHOLD_SECONDS = 86400;
    private static AccessTokenManager instanceField;
    private final AccessTokenCache accessTokenCache;
    private AccessToken currentAccessTokenField;
    private Date lastAttemptedTokenExtendDate;
    private final LocalBroadcastManager localBroadcastManager;
    private final AtomicBoolean tokenRefreshInProgress;

    /* compiled from: AccessTokenManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "", "grantType", "", "getGrantType", "()Ljava/lang/String;", "graphPath", "getGraphPath", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public interface RefreshTokenInfo {
        String getGrantType();

        String getGraphPath();
    }

    @JvmStatic
    public static final AccessTokenManager getInstance() {
        return Companion.getInstance();
    }

    public AccessTokenManager(LocalBroadcastManager localBroadcastManager, AccessTokenCache accessTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(accessTokenCache, "accessTokenCache");
        this.localBroadcastManager = localBroadcastManager;
        this.accessTokenCache = accessTokenCache;
        this.tokenRefreshInProgress = new AtomicBoolean(false);
        this.lastAttemptedTokenExtendDate = new Date(0L);
    }

    public final AccessToken getCurrentAccessToken() {
        return this.currentAccessTokenField;
    }

    public final void setCurrentAccessToken(AccessToken accessToken) {
        setCurrentAccessToken(accessToken, true);
    }

    /* compiled from: AccessTokenManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/facebook/AccessTokenManager$FacebookRefreshTokenInfo;", "Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "()V", "grantType", "", "getGrantType", "()Ljava/lang/String;", "graphPath", "getGraphPath", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class FacebookRefreshTokenInfo implements RefreshTokenInfo {
        private final String graphPath = "oauth/access_token";
        private final String grantType = "fb_extend_sso_token";

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public String getGraphPath() {
            return this.graphPath;
        }

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public String getGrantType() {
            return this.grantType;
        }
    }

    /* compiled from: AccessTokenManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/facebook/AccessTokenManager$InstagramRefreshTokenInfo;", "Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "()V", "grantType", "", "getGrantType", "()Ljava/lang/String;", "graphPath", "getGraphPath", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class InstagramRefreshTokenInfo implements RefreshTokenInfo {
        private final String graphPath = "refresh_access_token";
        private final String grantType = "ig_refresh_token";

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public String getGraphPath() {
            return this.graphPath;
        }

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public String getGrantType() {
            return this.grantType;
        }
    }

    public final boolean loadCurrentAccessToken() {
        AccessToken load = this.accessTokenCache.load();
        if (load != null) {
            setCurrentAccessToken(load, false);
            return true;
        }
        return false;
    }

    public final void currentAccessTokenChanged() {
        sendCurrentAccessTokenChangedBroadcastIntent(getCurrentAccessToken(), getCurrentAccessToken());
    }

    private final void setCurrentAccessToken(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.currentAccessTokenField;
        this.currentAccessTokenField = accessToken;
        this.tokenRefreshInProgress.set(false);
        this.lastAttemptedTokenExtendDate = new Date(0L);
        if (z) {
            if (accessToken != null) {
                this.accessTokenCache.save(accessToken);
            } else {
                this.accessTokenCache.clear();
                Utility utility = Utility.INSTANCE;
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                Utility.clearFacebookCookies(FacebookSdk.getApplicationContext());
            }
        }
        Utility utility2 = Utility.INSTANCE;
        if (Utility.areObjectsEqual(accessToken2, accessToken)) {
            return;
        }
        sendCurrentAccessTokenChangedBroadcastIntent(accessToken2, accessToken);
        setTokenExpirationBroadcastAlarm();
    }

    private final void sendCurrentAccessTokenChangedBroadcastIntent(AccessToken accessToken, AccessToken accessToken2) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Intent intent = new Intent(FacebookSdk.getApplicationContext(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction(ACTION_CURRENT_ACCESS_TOKEN_CHANGED);
        intent.putExtra(EXTRA_OLD_ACCESS_TOKEN, accessToken);
        intent.putExtra(EXTRA_NEW_ACCESS_TOKEN, accessToken2);
        this.localBroadcastManager.sendBroadcast(intent);
    }

    private final void setTokenExpirationBroadcastAlarm() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        AlarmManager alarmManager = (AlarmManager) applicationContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (AccessToken.Companion.isCurrentAccessTokenActive()) {
            if ((currentAccessToken == null ? null : currentAccessToken.getExpires()) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(applicationContext, CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction(ACTION_CURRENT_ACCESS_TOKEN_CHANGED);
            try {
                alarmManager.set(1, currentAccessToken.getExpires().getTime(), PendingIntent.getBroadcast(applicationContext, 0, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
            } catch (Exception unused) {
            }
        }
    }

    public final void extendAccessTokenIfNeeded() {
        if (shouldExtendAccessToken()) {
            refreshCurrentAccessToken(null);
        }
    }

    private final boolean shouldExtendAccessToken() {
        AccessToken currentAccessToken = getCurrentAccessToken();
        if (currentAccessToken == null) {
            return false;
        }
        long time = new Date().getTime();
        return currentAccessToken.getSource().canExtendToken() && time - this.lastAttemptedTokenExtendDate.getTime() > 3600000 && time - currentAccessToken.getLastRefresh().getTime() > 86400000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AccessTokenManager.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/facebook/AccessTokenManager$RefreshResult;", "", "()V", "accessToken", "", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "dataAccessExpirationTime", "", "getDataAccessExpirationTime", "()Ljava/lang/Long;", "setDataAccessExpirationTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "expiresAt", "", "getExpiresAt", "()I", "setExpiresAt", "(I)V", "expiresIn", "getExpiresIn", "setExpiresIn", "graphDomain", "getGraphDomain", "setGraphDomain", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class RefreshResult {
        private String accessToken;
        private Long dataAccessExpirationTime;
        private int expiresAt;
        private int expiresIn;
        private String graphDomain;

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final void setAccessToken(String str) {
            this.accessToken = str;
        }

        public final int getExpiresAt() {
            return this.expiresAt;
        }

        public final void setExpiresAt(int i) {
            this.expiresAt = i;
        }

        public final int getExpiresIn() {
            return this.expiresIn;
        }

        public final void setExpiresIn(int i) {
            this.expiresIn = i;
        }

        public final Long getDataAccessExpirationTime() {
            return this.dataAccessExpirationTime;
        }

        public final void setDataAccessExpirationTime(Long l) {
            this.dataAccessExpirationTime = l;
        }

        public final String getGraphDomain() {
            return this.graphDomain;
        }

        public final void setGraphDomain(String str) {
            this.graphDomain = str;
        }
    }

    public final void refreshCurrentAccessToken(final AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback) {
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            refreshCurrentAccessTokenImpl(accessTokenRefreshCallback);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.AccessTokenManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AccessTokenManager.m6258refreshCurrentAccessToken$lambda0(AccessTokenManager.this, accessTokenRefreshCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: refreshCurrentAccessToken$lambda-0  reason: not valid java name */
    public static final void m6258refreshCurrentAccessToken$lambda0(AccessTokenManager this$0, AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshCurrentAccessTokenImpl(accessTokenRefreshCallback);
    }

    private final void refreshCurrentAccessTokenImpl(final AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback) {
        final AccessToken currentAccessToken = getCurrentAccessToken();
        if (currentAccessToken == null) {
            if (accessTokenRefreshCallback == null) {
                return;
            }
            accessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
        } else if (!this.tokenRefreshInProgress.compareAndSet(false, true)) {
            if (accessTokenRefreshCallback == null) {
                return;
            }
            accessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("Refresh already in progress"));
        } else {
            this.lastAttemptedTokenExtendDate = new Date();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            final HashSet hashSet3 = new HashSet();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final RefreshResult refreshResult = new RefreshResult();
            Companion companion = Companion;
            GraphRequestBatch graphRequestBatch = new GraphRequestBatch(companion.createGrantedPermissionsRequest(currentAccessToken, new GraphRequest.Callback() { // from class: com.facebook.AccessTokenManager$$ExternalSyntheticLambda1
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(GraphResponse graphResponse) {
                    AccessTokenManager.m6259refreshCurrentAccessTokenImpl$lambda1(atomicBoolean, hashSet, hashSet2, hashSet3, graphResponse);
                }
            }), companion.createExtendAccessTokenRequest(currentAccessToken, new GraphRequest.Callback() { // from class: com.facebook.AccessTokenManager$$ExternalSyntheticLambda2
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(GraphResponse graphResponse) {
                    AccessTokenManager.m6260refreshCurrentAccessTokenImpl$lambda2(AccessTokenManager.RefreshResult.this, graphResponse);
                }
            }));
            graphRequestBatch.addCallback(new GraphRequestBatch.Callback() { // from class: com.facebook.AccessTokenManager$$ExternalSyntheticLambda3
                @Override // com.facebook.GraphRequestBatch.Callback
                public final void onBatchCompleted(GraphRequestBatch graphRequestBatch2) {
                    AccessTokenManager.m6261refreshCurrentAccessTokenImpl$lambda3(AccessTokenManager.RefreshResult.this, currentAccessToken, accessTokenRefreshCallback, atomicBoolean, hashSet, hashSet2, hashSet3, this, graphRequestBatch2);
                }
            });
            graphRequestBatch.executeAsync();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: refreshCurrentAccessTokenImpl$lambda-1  reason: not valid java name */
    public static final void m6259refreshCurrentAccessTokenImpl$lambda1(AtomicBoolean permissionsCallSucceeded, Set permissions2, Set declinedPermissions, Set expiredPermissions, GraphResponse response) {
        JSONArray optJSONArray;
        Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
        Intrinsics.checkNotNullParameter(permissions2, "$permissions");
        Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
        Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject jsonObject = response.getJsonObject();
        if (jsonObject == null || (optJSONArray = jsonObject.optJSONArray("data")) == null) {
            return;
        }
        permissionsCallSucceeded.set(true);
        int length = optJSONArray.length();
        if (length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("permission");
                String status = optJSONObject.optString("status");
                Utility utility = Utility.INSTANCE;
                if (!Utility.isNullOrEmpty(optString)) {
                    Utility utility2 = Utility.INSTANCE;
                    if (!Utility.isNullOrEmpty(status)) {
                        Intrinsics.checkNotNullExpressionValue(status, "status");
                        Locale US = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(US, "US");
                        String status2 = status.toLowerCase(US);
                        Intrinsics.checkNotNullExpressionValue(status2, "(this as java.lang.String).toLowerCase(locale)");
                        Intrinsics.checkNotNullExpressionValue(status2, "status");
                        int hashCode = status2.hashCode();
                        if (hashCode == -1309235419) {
                            if (status2.equals("expired")) {
                                expiredPermissions.add(optString);
                            }
                            Log.w(TAG, Intrinsics.stringPlus("Unexpected status: ", status2));
                        } else if (hashCode == 280295099) {
                            if (status2.equals("granted")) {
                                permissions2.add(optString);
                            }
                            Log.w(TAG, Intrinsics.stringPlus("Unexpected status: ", status2));
                        } else {
                            if (hashCode == 568196142 && status2.equals("declined")) {
                                declinedPermissions.add(optString);
                            }
                            Log.w(TAG, Intrinsics.stringPlus("Unexpected status: ", status2));
                        }
                    }
                }
            }
            if (i2 >= length) {
                return;
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: refreshCurrentAccessTokenImpl$lambda-2  reason: not valid java name */
    public static final void m6260refreshCurrentAccessTokenImpl$lambda2(RefreshResult refreshResult, GraphResponse response) {
        Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject jsonObject = response.getJsonObject();
        if (jsonObject == null) {
            return;
        }
        refreshResult.setAccessToken(jsonObject.optString("access_token"));
        refreshResult.setExpiresAt(jsonObject.optInt("expires_at"));
        refreshResult.setExpiresIn(jsonObject.optInt(AccessToken.EXPIRES_IN_KEY));
        refreshResult.setDataAccessExpirationTime(Long.valueOf(jsonObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
        refreshResult.setGraphDomain(jsonObject.optString("graph_domain", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: refreshCurrentAccessTokenImpl$lambda-3  reason: not valid java name */
    public static final void m6261refreshCurrentAccessTokenImpl$lambda3(RefreshResult refreshResult, AccessToken accessToken, AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback, AtomicBoolean permissionsCallSucceeded, Set permissions2, Set declinedPermissions, Set set, AccessTokenManager this$0, GraphRequestBatch it) {
        AccessToken accessToken2;
        Date dataAccessExpirationTime;
        Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
        Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
        Intrinsics.checkNotNullParameter(permissions2, "$permissions");
        Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
        Set expiredPermissions = set;
        Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        String accessToken3 = refreshResult.getAccessToken();
        int expiresAt = refreshResult.getExpiresAt();
        Long dataAccessExpirationTime2 = refreshResult.getDataAccessExpirationTime();
        String graphDomain = refreshResult.getGraphDomain();
        try {
            Companion companion = Companion;
            if (companion.getInstance().getCurrentAccessToken() != null) {
                AccessToken currentAccessToken = companion.getInstance().getCurrentAccessToken();
                if ((currentAccessToken == null ? null : currentAccessToken.getUserId()) == accessToken.getUserId()) {
                    if (permissionsCallSucceeded.get() || accessToken3 != null || expiresAt != 0) {
                        Date expires = accessToken.getExpires();
                        if (refreshResult.getExpiresAt() != 0) {
                            expires = new Date(refreshResult.getExpiresAt() * 1000);
                        } else if (refreshResult.getExpiresIn() != 0) {
                            expires = new Date((refreshResult.getExpiresIn() * 1000) + new Date().getTime());
                        }
                        Date date = expires;
                        if (accessToken3 == null) {
                            accessToken3 = accessToken.getToken();
                        }
                        String str = accessToken3;
                        String applicationId = accessToken.getApplicationId();
                        String userId = accessToken.getUserId();
                        Set<String> permissions3 = permissionsCallSucceeded.get() ? permissions2 : accessToken.getPermissions();
                        Set<String> declinedPermissions2 = permissionsCallSucceeded.get() ? declinedPermissions : accessToken.getDeclinedPermissions();
                        Set expiredPermissions2 = permissionsCallSucceeded.get() ? expiredPermissions : accessToken.getExpiredPermissions();
                        AccessTokenSource source = accessToken.getSource();
                        Date date2 = new Date();
                        if (dataAccessExpirationTime2 != null) {
                            dataAccessExpirationTime = new Date(dataAccessExpirationTime2.longValue() * 1000);
                        } else {
                            dataAccessExpirationTime = accessToken.getDataAccessExpirationTime();
                        }
                        Date date3 = dataAccessExpirationTime;
                        if (graphDomain == null) {
                            graphDomain = accessToken.getGraphDomain();
                        }
                        AccessToken accessToken4 = new AccessToken(str, applicationId, userId, permissions3, declinedPermissions2, expiredPermissions2, source, date, date2, date3, graphDomain);
                        try {
                            companion.getInstance().setCurrentAccessToken(accessToken4);
                            this$0.tokenRefreshInProgress.set(false);
                            if (accessTokenRefreshCallback != null) {
                                accessTokenRefreshCallback.OnTokenRefreshed(accessToken4);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            accessToken2 = accessToken4;
                            this$0.tokenRefreshInProgress.set(false);
                            if (accessTokenRefreshCallback != null && accessToken2 != null) {
                                accessTokenRefreshCallback.OnTokenRefreshed(accessToken2);
                            }
                            throw th;
                        }
                    }
                    if (accessTokenRefreshCallback != null) {
                        accessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("Failed to refresh access token"));
                    }
                    this$0.tokenRefreshInProgress.set(false);
                    return;
                }
            }
            if (accessTokenRefreshCallback != null) {
                accessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
            }
            this$0.tokenRefreshInProgress.set(false);
        } catch (Throwable th2) {
            th = th2;
            accessToken2 = null;
        }
    }

    /* compiled from: AccessTokenManager.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/facebook/AccessTokenManager$Companion;", "", "()V", "ACTION_CURRENT_ACCESS_TOKEN_CHANGED", "", "EXTRA_NEW_ACCESS_TOKEN", "EXTRA_OLD_ACCESS_TOKEN", "ME_PERMISSIONS_GRAPH_PATH", "SHARED_PREFERENCES_NAME", "TAG", "TOKEN_EXTEND_RETRY_SECONDS", "", "TOKEN_EXTEND_THRESHOLD_SECONDS", "instanceField", "Lcom/facebook/AccessTokenManager;", "createExtendAccessTokenRequest", "Lcom/facebook/GraphRequest;", "accessToken", "Lcom/facebook/AccessToken;", "callback", "Lcom/facebook/GraphRequest$Callback;", "createGrantedPermissionsRequest", "getInstance", "getRefreshTokenInfoForToken", "Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccessTokenManager getInstance() {
            AccessTokenManager accessTokenManager;
            AccessTokenManager accessTokenManager2 = AccessTokenManager.instanceField;
            if (accessTokenManager2 == null) {
                synchronized (this) {
                    accessTokenManager = AccessTokenManager.instanceField;
                    if (accessTokenManager == null) {
                        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext());
                        Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
                        AccessTokenManager accessTokenManager3 = new AccessTokenManager(localBroadcastManager, new AccessTokenCache());
                        Companion companion = AccessTokenManager.Companion;
                        AccessTokenManager.instanceField = accessTokenManager3;
                        accessTokenManager = accessTokenManager3;
                    }
                }
                return accessTokenManager;
            }
            return accessTokenManager2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GraphRequest createGrantedPermissionsRequest(AccessToken accessToken, GraphRequest.Callback callback) {
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, "permission,status");
            GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(accessToken, AccessTokenManager.ME_PERMISSIONS_GRAPH_PATH, callback);
            newGraphPathRequest.setParameters(bundle);
            newGraphPathRequest.setHttpMethod(HttpMethod.GET);
            return newGraphPathRequest;
        }

        private final RefreshTokenInfo getRefreshTokenInfoForToken(AccessToken accessToken) {
            String graphDomain = accessToken.getGraphDomain();
            if (graphDomain == null) {
                graphDomain = AccessToken.DEFAULT_GRAPH_DOMAIN;
            }
            return Intrinsics.areEqual(graphDomain, FacebookSdk.INSTAGRAM) ? new InstagramRefreshTokenInfo() : new FacebookRefreshTokenInfo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GraphRequest createExtendAccessTokenRequest(AccessToken accessToken, GraphRequest.Callback callback) {
            RefreshTokenInfo refreshTokenInfoForToken = getRefreshTokenInfoForToken(accessToken);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", refreshTokenInfoForToken.getGrantType());
            bundle.putString("client_id", accessToken.getApplicationId());
            bundle.putString(GraphRequest.FIELDS_PARAM, "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(accessToken, refreshTokenInfoForToken.getGraphPath(), callback);
            newGraphPathRequest.setParameters(bundle);
            newGraphPathRequest.setHttpMethod(HttpMethod.GET);
            return newGraphPathRequest;
        }
    }
}
