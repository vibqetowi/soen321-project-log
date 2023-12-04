package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.internal.Utility;
import com.facebook.login.LoginClient;
import com.ifriend.keychain.KeychainModule;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: GetTokenLoginMethodHandler.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0016\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/facebook/login/GetTokenLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getTokenClient", "Lcom/facebook/login/GetTokenClient;", "nameForLogging", "", "getNameForLogging", "()Ljava/lang/String;", KeychainModule.AuthPromptOptions.CANCEL, "", "complete", "request", "Lcom/facebook/login/LoginClient$Request;", "result", "Landroid/os/Bundle;", "describeContents", "", "getTokenCompleted", "onComplete", "tryAuthorize", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {
    private GetTokenClient getTokenClient;
    private final String nameForLogging;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new Parcelable.Creator<GetTokenLoginMethodHandler>() { // from class: com.facebook.login.GetTokenLoginMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GetTokenLoginMethodHandler createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new GetTokenLoginMethodHandler(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GetTokenLoginMethodHandler[] newArray(int i) {
            return new GetTokenLoginMethodHandler[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "get_token";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void cancel() {
        GetTokenClient getTokenClient = this.getTokenClient;
        if (getTokenClient == null) {
            return;
        }
        getTokenClient.cancel();
        getTokenClient.setCompletedListener(null);
        this.getTokenClient = null;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int tryAuthorize(final LoginClient.Request request) {
        FragmentActivity fragmentActivity;
        Intrinsics.checkNotNullParameter(request, "request");
        FragmentActivity activity = getLoginClient().getActivity();
        if (activity == null) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            fragmentActivity = FacebookSdk.getApplicationContext();
        } else {
            fragmentActivity = activity;
        }
        GetTokenClient getTokenClient = new GetTokenClient(fragmentActivity, request);
        this.getTokenClient = getTokenClient;
        if (Intrinsics.areEqual((Object) Boolean.valueOf(getTokenClient.start()), (Object) false)) {
            return 0;
        }
        getLoginClient().notifyBackgroundProcessingStart();
        PlatformServiceClient.CompletedListener completedListener = new PlatformServiceClient.CompletedListener() { // from class: com.facebook.login.GetTokenLoginMethodHandler$$ExternalSyntheticLambda0
            @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
            public final void completed(Bundle bundle) {
                GetTokenLoginMethodHandler.m6438tryAuthorize$lambda1(GetTokenLoginMethodHandler.this, request, bundle);
            }
        };
        GetTokenClient getTokenClient2 = this.getTokenClient;
        if (getTokenClient2 == null) {
            return 1;
        }
        getTokenClient2.setCompletedListener(completedListener);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tryAuthorize$lambda-1  reason: not valid java name */
    public static final void m6438tryAuthorize$lambda1(GetTokenLoginMethodHandler this$0, LoginClient.Request request, Bundle bundle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        this$0.getTokenCompleted(request, bundle);
    }

    public final void getTokenCompleted(LoginClient.Request request, Bundle bundle) {
        Intrinsics.checkNotNullParameter(request, "request");
        GetTokenClient getTokenClient = this.getTokenClient;
        if (getTokenClient != null) {
            getTokenClient.setCompletedListener(null);
        }
        this.getTokenClient = null;
        getLoginClient().notifyBackgroundProcessingStop();
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList(NativeProtocol.EXTRA_PERMISSIONS);
            ArrayList<String> emptyList = stringArrayList == null ? CollectionsKt.emptyList() : stringArrayList;
            Set<String> permissions2 = request.getPermissions();
            if (permissions2 == null) {
                permissions2 = SetsKt.emptySet();
            }
            String string = bundle.getString(NativeProtocol.EXTRA_AUTHENTICATION_TOKEN);
            if (permissions2.contains("openid")) {
                String str = string;
                if (str == null || str.length() == 0) {
                    getLoginClient().tryNextHandler();
                    return;
                }
            }
            if (emptyList.containsAll(permissions2)) {
                complete(request, bundle);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str2 : permissions2) {
                if (!emptyList.contains(str2)) {
                    hashSet.add(str2);
                }
            }
            if (!hashSet.isEmpty()) {
                addLoggingExtra(LoginLogger.EVENT_EXTRAS_NEW_PERMISSIONS, TextUtils.join(",", hashSet));
            }
            request.setPermissions(hashSet);
        }
        getLoginClient().tryNextHandler();
    }

    public final void onComplete(LoginClient.Request request, Bundle result) {
        LoginClient.Result createErrorResult$default;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            createErrorResult$default = LoginClient.Result.Companion.createCompositeTokenResult(request, LoginMethodHandler.Companion.createAccessTokenFromNativeLogin(result, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.getApplicationId()), LoginMethodHandler.Companion.createAuthenticationTokenFromNativeLogin(result, request.getNonce()));
        } catch (FacebookException e) {
            createErrorResult$default = LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, getLoginClient().getPendingRequest(), null, e.getMessage(), null, 8, null);
        }
        getLoginClient().completeAndValidate(createErrorResult$default);
    }

    public final void complete(final LoginClient.Request request, final Bundle result) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        String string = result.getString(NativeProtocol.EXTRA_USER_ID);
        if (string == null || string.length() == 0) {
            getLoginClient().notifyBackgroundProcessingStart();
            String string2 = result.getString(NativeProtocol.EXTRA_ACCESS_TOKEN);
            if (string2 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Utility utility = Utility.INSTANCE;
            Utility.getGraphMeRequestWithCacheAsync(string2, new Utility.GraphMeRequestWithCacheCallback() { // from class: com.facebook.login.GetTokenLoginMethodHandler$complete$1
                @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                public void onSuccess(JSONObject jSONObject) {
                    try {
                        result.putString(NativeProtocol.EXTRA_USER_ID, jSONObject == null ? null : jSONObject.getString("id"));
                        this.onComplete(request, result);
                    } catch (JSONException e) {
                        this.getLoginClient().complete(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, this.getLoginClient().getPendingRequest(), "Caught exception", e.getMessage(), null, 8, null));
                    }
                }

                @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                public void onFailure(FacebookException facebookException) {
                    this.getLoginClient().complete(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, this.getLoginClient().getPendingRequest(), "Caught exception", facebookException == null ? null : facebookException.getMessage(), null, 8, null));
                }
            });
            return;
        }
        onComplete(request, result);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.nameForLogging = "get_token";
    }

    /* compiled from: GetTokenLoginMethodHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/login/GetTokenLoginMethodHandler$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/GetTokenLoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
