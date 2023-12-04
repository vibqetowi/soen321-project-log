package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: AccessToken.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 E2\u00020\u0001:\u0003CDEB\u0089\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011B\u000f\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0014\u0010.\u001a\u00020/2\n\u00100\u001a\u000601j\u0002`2H\u0002J\u001a\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u00105\u001a\u000206H\u0016J\u0013\u00107\u001a\u00020!2\b\u00108\u001a\u0004\u0018\u000109H\u0096\u0002J\b\u0010:\u001a\u000206H\u0016J\r\u0010;\u001a\u00020<H\u0000¢\u0006\u0002\b=J\b\u0010>\u001a\u00020\u0003H\u0016J\b\u0010?\u001a\u00020\u0003H\u0002J\u0018\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020\u00132\u0006\u0010B\u001a\u000206H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b \u0010\"R\u0011\u0010#\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0011\u0010%\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010(\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0016¨\u0006F"}, d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "accessToken", "", "applicationId", "userId", "permissions", "", "declinedPermissions", "expiredPermissions", "accessTokenSource", "Lcom/facebook/AccessTokenSource;", "expirationTime", "Ljava/util/Date;", "lastRefreshTime", "dataAccessExpirationTime", "graphDomain", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/AccessTokenSource;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getApplicationId", "()Ljava/lang/String;", "getDataAccessExpirationTime", "()Ljava/util/Date;", "", "getDeclinedPermissions", "()Ljava/util/Set;", "getExpiredPermissions", ClientCookie.EXPIRES_ATTR, "getExpires", "getGraphDomain", "isDataAccessExpired", "", "()Z", "isExpired", "isInstagramToken", "lastRefresh", "getLastRefresh", "getPermissions", "source", "getSource", "()Lcom/facebook/AccessTokenSource;", AccessToken.TOKEN_KEY, "getToken", "getUserId", "appendPermissions", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "convertTokenSourceForGraphDomain", "tokenSource", "describeContents", "", "equals", "other", "", "hashCode", "toJSONObject", "Lorg/json/JSONObject;", "toJSONObject$facebook_core_release", "toString", "tokenToString", "writeToParcel", "dest", "flags", "AccessTokenCreationCallback", "AccessTokenRefreshCallback", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AccessToken implements Parcelable {
    public static final String ACCESS_TOKEN_KEY = "access_token";
    private static final String APPLICATION_ID_KEY = "application_id";
    public static final Parcelable.Creator<AccessToken> CREATOR;
    private static final int CURRENT_JSON_FORMAT = 1;
    public static final Companion Companion = new Companion(null);
    public static final String DATA_ACCESS_EXPIRATION_TIME = "data_access_expiration_time";
    private static final String DECLINED_PERMISSIONS_KEY = "declined_permissions";
    private static final AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE;
    private static final Date DEFAULT_EXPIRATION_TIME;
    public static final String DEFAULT_GRAPH_DOMAIN = "facebook";
    private static final Date DEFAULT_LAST_REFRESH_TIME;
    private static final String EXPIRED_PERMISSIONS_KEY = "expired_permissions";
    private static final String EXPIRES_AT_KEY = "expires_at";
    public static final String EXPIRES_IN_KEY = "expires_in";
    public static final String GRAPH_DOMAIN = "graph_domain";
    private static final String LAST_REFRESH_KEY = "last_refresh";
    private static final Date MAX_DATE;
    private static final String PERMISSIONS_KEY = "permissions";
    private static final String SOURCE_KEY = "source";
    private static final String TOKEN_KEY = "token";
    public static final String USER_ID_KEY = "user_id";
    private static final String VERSION_KEY = "version";
    private final String applicationId;
    private final Date dataAccessExpirationTime;
    private final Set<String> declinedPermissions;
    private final Set<String> expiredPermissions;
    private final Date expires;
    private final String graphDomain;
    private final Date lastRefresh;

    /* renamed from: permissions  reason: collision with root package name */
    private final Set<String> f140permissions;
    private final AccessTokenSource source;
    private final String token;
    private final String userId;

    /* compiled from: AccessToken.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/facebook/AccessToken$AccessTokenCreationCallback;", "", "onError", "", "error", "Lcom/facebook/FacebookException;", "onSuccess", AccessToken.TOKEN_KEY, "Lcom/facebook/AccessToken;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public interface AccessTokenCreationCallback {
        void onError(FacebookException facebookException);

        void onSuccess(AccessToken accessToken);
    }

    /* compiled from: AccessToken.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/facebook/AccessToken$AccessTokenRefreshCallback;", "", "OnTokenRefreshFailed", "", "exception", "Lcom/facebook/FacebookException;", "OnTokenRefreshed", "accessToken", "Lcom/facebook/AccessToken;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public interface AccessTokenRefreshCallback {
        void OnTokenRefreshFailed(FacebookException facebookException);

        void OnTokenRefreshed(AccessToken accessToken);
    }

    /* compiled from: AccessToken.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccessTokenSource.valuesCustom().length];
            iArr[AccessTokenSource.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[AccessTokenSource.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[AccessTokenSource.WEB_VIEW.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessToken(String accessToken, String applicationId, String userId, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        this(accessToken, applicationId, userId, collection, collection2, collection3, accessTokenSource, date, date2, date3, null, 1024, null);
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
    }

    @JvmStatic
    public static final void createFromNativeLinkingIntent(Intent intent, String str, AccessTokenCreationCallback accessTokenCreationCallback) {
        Companion.createFromNativeLinkingIntent(intent, str, accessTokenCreationCallback);
    }

    @JvmStatic
    public static final void expireCurrentAccessToken() {
        Companion.expireCurrentAccessToken();
    }

    @JvmStatic
    public static final AccessToken getCurrentAccessToken() {
        return Companion.getCurrentAccessToken();
    }

    @JvmStatic
    public static final boolean isCurrentAccessTokenActive() {
        return Companion.isCurrentAccessTokenActive();
    }

    @JvmStatic
    public static final boolean isDataAccessActive() {
        return Companion.isDataAccessActive();
    }

    @JvmStatic
    public static final boolean isLoggedInWithInstagram() {
        return Companion.isLoggedInWithInstagram();
    }

    @JvmStatic
    public static final void refreshCurrentAccessTokenAsync() {
        Companion.refreshCurrentAccessTokenAsync();
    }

    @JvmStatic
    public static final void refreshCurrentAccessTokenAsync(AccessTokenRefreshCallback accessTokenRefreshCallback) {
        Companion.refreshCurrentAccessTokenAsync(accessTokenRefreshCallback);
    }

    @JvmStatic
    public static final void setCurrentAccessToken(AccessToken accessToken) {
        Companion.setCurrentAccessToken(accessToken);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Date getExpires() {
        return this.expires;
    }

    public final Set<String> getPermissions() {
        return this.f140permissions;
    }

    public final Set<String> getDeclinedPermissions() {
        return this.declinedPermissions;
    }

    public final Set<String> getExpiredPermissions() {
        return this.expiredPermissions;
    }

    public final String getToken() {
        return this.token;
    }

    public final AccessTokenSource getSource() {
        return this.source;
    }

    public final Date getLastRefresh() {
        return this.lastRefresh;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final Date getDataAccessExpirationTime() {
        return this.dataAccessExpirationTime;
    }

    public final String getGraphDomain() {
        return this.graphDomain;
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, (i & 1024) != 0 ? DEFAULT_GRAPH_DOMAIN : str4);
    }

    public AccessToken(String accessToken, String applicationId, String userId, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Validate validate = Validate.INSTANCE;
        Validate.notEmpty(accessToken, "accessToken");
        Validate validate2 = Validate.INSTANCE;
        Validate.notEmpty(applicationId, "applicationId");
        Validate validate3 = Validate.INSTANCE;
        Validate.notEmpty(userId, "userId");
        this.expires = date == null ? DEFAULT_EXPIRATION_TIME : date;
        Set<String> unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f140permissions = unmodifiableSet;
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.declinedPermissions = unmodifiableSet2;
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.expiredPermissions = unmodifiableSet3;
        this.token = accessToken;
        this.source = convertTokenSourceForGraphDomain(accessTokenSource == null ? DEFAULT_ACCESS_TOKEN_SOURCE : accessTokenSource, str);
        this.lastRefresh = date2 == null ? DEFAULT_LAST_REFRESH_TIME : date2;
        this.applicationId = applicationId;
        this.userId = userId;
        this.dataAccessExpirationTime = (date3 == null || date3.getTime() == 0) ? DEFAULT_EXPIRATION_TIME : date3;
        this.graphDomain = str == null ? DEFAULT_GRAPH_DOMAIN : str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken token:");
        sb.append(tokenToString());
        appendPermissions(sb);
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return sb2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessToken) {
            AccessToken accessToken = (AccessToken) obj;
            if (Intrinsics.areEqual(this.expires, accessToken.expires) && Intrinsics.areEqual(this.f140permissions, accessToken.f140permissions) && Intrinsics.areEqual(this.declinedPermissions, accessToken.declinedPermissions) && Intrinsics.areEqual(this.expiredPermissions, accessToken.expiredPermissions) && Intrinsics.areEqual(this.token, accessToken.token) && this.source == accessToken.source && Intrinsics.areEqual(this.lastRefresh, accessToken.lastRefresh) && Intrinsics.areEqual(this.applicationId, accessToken.applicationId) && Intrinsics.areEqual(this.userId, accessToken.userId) && Intrinsics.areEqual(this.dataAccessExpirationTime, accessToken.dataAccessExpirationTime)) {
                String str = this.graphDomain;
                String str2 = accessToken.graphDomain;
                if (str == null ? str2 == null : Intrinsics.areEqual(str, str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((((527 + this.expires.hashCode()) * 31) + this.f140permissions.hashCode()) * 31) + this.declinedPermissions.hashCode()) * 31) + this.expiredPermissions.hashCode()) * 31) + this.token.hashCode()) * 31) + this.source.hashCode()) * 31) + this.lastRefresh.hashCode()) * 31) + this.applicationId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.dataAccessExpirationTime.hashCode()) * 31;
        String str = this.graphDomain;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isExpired() {
        return new Date().after(this.expires);
    }

    public final boolean isDataAccessExpired() {
        return new Date().after(this.dataAccessExpirationTime);
    }

    public final boolean isInstagramToken() {
        String str = this.graphDomain;
        return str != null && str.equals(FacebookSdk.INSTAGRAM);
    }

    public final JSONObject toJSONObject$facebook_core_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put(TOKEN_KEY, this.token);
        jSONObject.put(EXPIRES_AT_KEY, this.expires.getTime());
        jSONObject.put("permissions", new JSONArray((Collection<?>) this.f140permissions));
        jSONObject.put(DECLINED_PERMISSIONS_KEY, new JSONArray((Collection<?>) this.declinedPermissions));
        jSONObject.put(EXPIRED_PERMISSIONS_KEY, new JSONArray((Collection<?>) this.expiredPermissions));
        jSONObject.put(LAST_REFRESH_KEY, this.lastRefresh.getTime());
        jSONObject.put("source", this.source.name());
        jSONObject.put(APPLICATION_ID_KEY, this.applicationId);
        jSONObject.put("user_id", this.userId);
        jSONObject.put(DATA_ACCESS_EXPIRATION_TIME, this.dataAccessExpirationTime.getTime());
        String str = this.graphDomain;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    private final String tokenToString() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        return FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS) ? this.token : "ACCESS_TOKEN_REMOVED";
    }

    private final void appendPermissions(StringBuilder sb) {
        sb.append(" permissions:");
        sb.append("[");
        sb.append(TextUtils.join(", ", this.f140permissions));
        sb.append("]");
    }

    private final AccessTokenSource convertTokenSourceForGraphDomain(AccessTokenSource accessTokenSource, String str) {
        if (str == null || !str.equals(FacebookSdk.INSTAGRAM)) {
            return accessTokenSource;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[accessTokenSource.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? accessTokenSource : AccessTokenSource.INSTAGRAM_WEB_VIEW;
            }
            return AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB;
        }
        return AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
    }

    public AccessToken(Parcel parcel) {
        AccessTokenSource accessTokenSource;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.expires = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        parcel.readStringList(arrayList2);
        ArrayList arrayList3 = arrayList;
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList3));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f140permissions = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList2);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList3));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.declinedPermissions = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList2);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList3));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.expiredPermissions = unmodifiableSet3;
        String readString = parcel.readString();
        Validate validate = Validate.INSTANCE;
        this.token = Validate.notNullOrEmpty(readString, TOKEN_KEY);
        String readString2 = parcel.readString();
        if (readString2 != null) {
            accessTokenSource = AccessTokenSource.valueOf(readString2);
        } else {
            accessTokenSource = DEFAULT_ACCESS_TOKEN_SOURCE;
        }
        this.source = accessTokenSource;
        this.lastRefresh = new Date(parcel.readLong());
        String readString3 = parcel.readString();
        Validate validate2 = Validate.INSTANCE;
        this.applicationId = Validate.notNullOrEmpty(readString3, "applicationId");
        String readString4 = parcel.readString();
        Validate validate3 = Validate.INSTANCE;
        this.userId = Validate.notNullOrEmpty(readString4, "userId");
        this.dataAccessExpirationTime = new Date(parcel.readLong());
        this.graphDomain = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.expires.getTime());
        dest.writeStringList(new ArrayList(this.f140permissions));
        dest.writeStringList(new ArrayList(this.declinedPermissions));
        dest.writeStringList(new ArrayList(this.expiredPermissions));
        dest.writeString(this.token);
        dest.writeString(this.source.name());
        dest.writeLong(this.lastRefresh.getTime());
        dest.writeString(this.applicationId);
        dest.writeString(this.userId);
        dest.writeLong(this.dataAccessExpirationTime.getTime());
        dest.writeString(this.graphDomain);
    }

    /* compiled from: AccessToken.kt */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0000¢\u0006\u0002\b J<\u0010!\u001a\u0004\u0018\u00010\b2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0004H\u0002J\u0015\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\b,J\u0017\u0010-\u001a\u0004\u0018\u00010\b2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b.J \u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u0010(\u001a\u00020\u00042\u0006\u00103\u001a\u000204H\u0007J\u001f\u00105\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b6J\b\u00107\u001a\u000200H\u0007J\n\u00108\u001a\u0004\u0018\u00010\bH\u0007J'\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040#2\u0006\u0010$\u001a\u00020%2\b\u0010:\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\b;J\b\u0010<\u001a\u00020=H\u0007J\b\u0010>\u001a\u00020=H\u0007J\b\u0010?\u001a\u00020=H\u0007J\b\u0010@\u001a\u000200H\u0007J\u0012\u0010@\u001a\u0002002\b\u0010A\u001a\u0004\u0018\u00010BH\u0007J\u0012\u0010C\u001a\u0002002\b\u0010D\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/facebook/AccessToken$Companion;", "", "()V", "ACCESS_TOKEN_KEY", "", "APPLICATION_ID_KEY", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AccessToken;", "CURRENT_JSON_FORMAT", "", "DATA_ACCESS_EXPIRATION_TIME", "DECLINED_PERMISSIONS_KEY", "DEFAULT_ACCESS_TOKEN_SOURCE", "Lcom/facebook/AccessTokenSource;", "DEFAULT_EXPIRATION_TIME", "Ljava/util/Date;", "DEFAULT_GRAPH_DOMAIN", "DEFAULT_LAST_REFRESH_TIME", "EXPIRED_PERMISSIONS_KEY", "EXPIRES_AT_KEY", "EXPIRES_IN_KEY", "GRAPH_DOMAIN", "LAST_REFRESH_KEY", "MAX_DATE", "PERMISSIONS_KEY", "SOURCE_KEY", "TOKEN_KEY", "USER_ID_KEY", "VERSION_KEY", "createExpired", "current", "createExpired$facebook_core_release", "createFromBundle", "requestedPermissions", "", "bundle", "Landroid/os/Bundle;", "source", "expirationBase", "applicationId", "createFromJSONObject", "jsonObject", "Lorg/json/JSONObject;", "createFromJSONObject$facebook_core_release", "createFromLegacyCache", "createFromLegacyCache$facebook_core_release", "createFromNativeLinkingIntent", "", "intent", "Landroid/content/Intent;", "accessTokenCallback", "Lcom/facebook/AccessToken$AccessTokenCreationCallback;", "createFromRefresh", "createFromRefresh$facebook_core_release", "expireCurrentAccessToken", "getCurrentAccessToken", "getPermissionsFromBundle", "key", "getPermissionsFromBundle$facebook_core_release", "isCurrentAccessTokenActive", "", "isDataAccessActive", "isLoggedInWithInstagram", "refreshCurrentAccessTokenAsync", "callback", "Lcom/facebook/AccessToken$AccessTokenRefreshCallback;", "setCurrentAccessToken", "accessToken", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccessToken getCurrentAccessToken() {
            return AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
        }

        @JvmStatic
        public final void setCurrentAccessToken(AccessToken accessToken) {
            AccessTokenManager.Companion.getInstance().setCurrentAccessToken(accessToken);
        }

        @JvmStatic
        public final boolean isCurrentAccessTokenActive() {
            AccessToken currentAccessToken = AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
            return (currentAccessToken == null || currentAccessToken.isExpired()) ? false : true;
        }

        @JvmStatic
        public final boolean isDataAccessActive() {
            AccessToken currentAccessToken = AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
            return (currentAccessToken == null || currentAccessToken.isDataAccessExpired()) ? false : true;
        }

        @JvmStatic
        public final boolean isLoggedInWithInstagram() {
            AccessToken currentAccessToken = AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
            return (currentAccessToken == null || currentAccessToken.isExpired() || !currentAccessToken.isInstagramToken()) ? false : true;
        }

        @JvmStatic
        public final void expireCurrentAccessToken() {
            AccessToken currentAccessToken = AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
            if (currentAccessToken != null) {
                setCurrentAccessToken(createExpired$facebook_core_release(currentAccessToken));
            }
        }

        @JvmStatic
        public final void refreshCurrentAccessTokenAsync() {
            AccessTokenManager.Companion.getInstance().refreshCurrentAccessToken(null);
        }

        @JvmStatic
        public final void refreshCurrentAccessTokenAsync(AccessTokenRefreshCallback accessTokenRefreshCallback) {
            AccessTokenManager.Companion.getInstance().refreshCurrentAccessToken(accessTokenRefreshCallback);
        }

        @JvmStatic
        public final void createFromNativeLinkingIntent(Intent intent, final String applicationId, final AccessTokenCreationCallback accessTokenCallback) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(accessTokenCallback, "accessTokenCallback");
            if (intent.getExtras() == null) {
                accessTokenCallback.onError(new FacebookException("No extras found on intent"));
                return;
            }
            final Bundle bundle = new Bundle(intent.getExtras());
            String string = bundle.getString("access_token");
            if (string != null) {
                if (!(string.length() == 0)) {
                    String string2 = bundle.getString("user_id");
                    if (string2 != null) {
                        if (!(string2.length() == 0)) {
                            accessTokenCallback.onSuccess(createFromBundle(null, bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), applicationId));
                            return;
                        }
                    }
                    Utility utility = Utility.INSTANCE;
                    Utility.getGraphMeRequestWithCacheAsync(string, new Utility.GraphMeRequestWithCacheCallback() { // from class: com.facebook.AccessToken$Companion$createFromNativeLinkingIntent$1
                        @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                        public void onSuccess(JSONObject jSONObject) {
                            String string3;
                            AccessToken createFromBundle;
                            if (jSONObject == null) {
                                string3 = null;
                            } else {
                                try {
                                    string3 = jSONObject.getString("id");
                                } catch (Exception unused) {
                                    accessTokenCallback.onError(new FacebookException("Unable to generate access token due to missing user id"));
                                    return;
                                }
                            }
                            if (string3 == null) {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            bundle.putString("user_id", string3);
                            AccessToken.AccessTokenCreationCallback accessTokenCreationCallback = accessTokenCallback;
                            createFromBundle = AccessToken.Companion.createFromBundle(null, bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), applicationId);
                            accessTokenCreationCallback.onSuccess(createFromBundle);
                        }

                        @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                        public void onFailure(FacebookException facebookException) {
                            accessTokenCallback.onError(facebookException);
                        }
                    });
                    return;
                }
            }
            accessTokenCallback.onError(new FacebookException("No access token found on intent"));
        }

        @JvmStatic
        public final AccessToken createFromRefresh$facebook_core_release(AccessToken current, Bundle bundle) {
            Intrinsics.checkNotNullParameter(current, "current");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (current.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_WEB && current.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_NATIVE && current.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_SERVICE) {
                throw new FacebookException(Intrinsics.stringPlus("Invalid token source: ", current.getSource()));
            }
            Utility utility = Utility.INSTANCE;
            Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, AccessToken.EXPIRES_IN_KEY, new Date(0L));
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            String string2 = bundle.getString("graph_domain");
            Utility utility2 = Utility.INSTANCE;
            Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
            Utility utility3 = Utility.INSTANCE;
            if (Utility.isNullOrEmpty(string)) {
                return null;
            }
            return new AccessToken(string, current.getApplicationId(), current.getUserId(), current.getPermissions(), current.getDeclinedPermissions(), current.getExpiredPermissions(), current.getSource(), bundleLongAsDate, new Date(), bundleLongAsDate2, string2);
        }

        public final AccessToken createExpired$facebook_core_release(AccessToken current) {
            Intrinsics.checkNotNullParameter(current, "current");
            return new AccessToken(current.getToken(), current.getApplicationId(), current.getUserId(), current.getPermissions(), current.getDeclinedPermissions(), current.getExpiredPermissions(), current.getSource(), new Date(), new Date(), current.getDataAccessExpirationTime(), null, 1024, null);
        }

        @JvmStatic
        public final AccessToken createFromLegacyCache$facebook_core_release(Bundle bundle) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            List<String> permissionsFromBundle$facebook_core_release = getPermissionsFromBundle$facebook_core_release(bundle, LegacyTokenHelper.PERMISSIONS_KEY);
            List<String> permissionsFromBundle$facebook_core_release2 = getPermissionsFromBundle$facebook_core_release(bundle, LegacyTokenHelper.DECLINED_PERMISSIONS_KEY);
            List<String> permissionsFromBundle$facebook_core_release3 = getPermissionsFromBundle$facebook_core_release(bundle, LegacyTokenHelper.EXPIRED_PERMISSIONS_KEY);
            String applicationId = LegacyTokenHelper.Companion.getApplicationId(bundle);
            Utility utility = Utility.INSTANCE;
            if (Utility.isNullOrEmpty(applicationId)) {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                applicationId = FacebookSdk.getApplicationId();
            }
            String str = applicationId;
            String token = LegacyTokenHelper.Companion.getToken(bundle);
            if (token == null) {
                return null;
            }
            Utility utility2 = Utility.INSTANCE;
            JSONObject awaitGetGraphMeRequestWithCache = Utility.awaitGetGraphMeRequestWithCache(token);
            if (awaitGetGraphMeRequestWithCache == null) {
                string = null;
            } else {
                try {
                    string = awaitGetGraphMeRequestWithCache.getString("id");
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (str == null || string == null) {
                return null;
            }
            return new AccessToken(token, str, string, permissionsFromBundle$facebook_core_release, permissionsFromBundle$facebook_core_release2, permissionsFromBundle$facebook_core_release3, LegacyTokenHelper.Companion.getSource(bundle), LegacyTokenHelper.Companion.getExpirationDate(bundle), LegacyTokenHelper.Companion.getLastRefreshDate(bundle), null, null, 1024, null);
        }

        @JvmStatic
        public final List<String> getPermissionsFromBundle$facebook_core_release(Bundle bundle, String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return CollectionsKt.emptyList();
            }
            List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return unmodifiableList;
        }

        @JvmStatic
        public final AccessToken createFromJSONObject$facebook_core_release(JSONObject jsonObject) throws JSONException {
            ArrayList jsonArrayToStringList;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            if (jsonObject.getInt("version") > 1) {
                throw new FacebookException("Unknown AccessToken serialization format.");
            }
            String token = jsonObject.getString(AccessToken.TOKEN_KEY);
            Date date = new Date(jsonObject.getLong(AccessToken.EXPIRES_AT_KEY));
            JSONArray permissionsArray = jsonObject.getJSONArray("permissions");
            JSONArray declinedPermissionsArray = jsonObject.getJSONArray(AccessToken.DECLINED_PERMISSIONS_KEY);
            JSONArray optJSONArray = jsonObject.optJSONArray(AccessToken.EXPIRED_PERMISSIONS_KEY);
            Date date2 = new Date(jsonObject.getLong(AccessToken.LAST_REFRESH_KEY));
            String string = jsonObject.getString("source");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(SOURCE_KEY)");
            AccessTokenSource valueOf = AccessTokenSource.valueOf(string);
            String applicationId = jsonObject.getString(AccessToken.APPLICATION_ID_KEY);
            String userId = jsonObject.getString("user_id");
            Date date3 = new Date(jsonObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME, 0L));
            String optString = jsonObject.optString("graph_domain", null);
            Intrinsics.checkNotNullExpressionValue(token, "token");
            Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
            Intrinsics.checkNotNullExpressionValue(userId, "userId");
            Utility utility = Utility.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(permissionsArray, "permissionsArray");
            List<String> jsonArrayToStringList2 = Utility.jsonArrayToStringList(permissionsArray);
            Utility utility2 = Utility.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(declinedPermissionsArray, "declinedPermissionsArray");
            List<String> jsonArrayToStringList3 = Utility.jsonArrayToStringList(declinedPermissionsArray);
            if (optJSONArray == null) {
                jsonArrayToStringList = new ArrayList();
            } else {
                Utility utility3 = Utility.INSTANCE;
                jsonArrayToStringList = Utility.jsonArrayToStringList(optJSONArray);
            }
            return new AccessToken(token, applicationId, userId, jsonArrayToStringList2, jsonArrayToStringList3, jsonArrayToStringList, valueOf, date, date2, date3, optString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AccessToken createFromBundle(List<String> list, Bundle bundle, AccessTokenSource accessTokenSource, Date date, String str) {
            String string;
            String string2 = bundle.getString("access_token");
            if (string2 == null) {
                return null;
            }
            Utility utility = Utility.INSTANCE;
            Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, AccessToken.EXPIRES_IN_KEY, date);
            if (bundleLongAsDate == null || (string = bundle.getString("user_id")) == null) {
                return null;
            }
            Utility utility2 = Utility.INSTANCE;
            return new AccessToken(string2, str, string, list, null, null, accessTokenSource, bundleLongAsDate, new Date(), Utility.getBundleLongAsDate(bundle, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0L)), null, 1024, null);
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        MAX_DATE = date;
        DEFAULT_EXPIRATION_TIME = date;
        DEFAULT_LAST_REFRESH_TIME = new Date();
        DEFAULT_ACCESS_TOKEN_SOURCE = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
        CREATOR = new Parcelable.Creator<AccessToken>() { // from class: com.facebook.AccessToken$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public AccessToken createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new AccessToken(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public AccessToken[] newArray(int i) {
                return new AccessToken[i];
            }
        };
    }
}
