package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.CustomTab;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.InstagramCustomTab;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.login.LoginClient;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: CustomTabLoginMethodHandler.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0014J\n\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0014J\"\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\t2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,H\u0002J\u0018\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0018H\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/facebook/login/CustomTabLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "chromePackage", "", "getChromePackage", "()Ljava/lang/String;", "currentPackage", "developerDefinedRedirectURI", "getDeveloperDefinedRedirectURI", "expectedChallenge", "nameForLogging", "getNameForLogging", "tokenSource", "Lcom/facebook/AccessTokenSource;", "getTokenSource", "()Lcom/facebook/AccessTokenSource;", "validRedirectURI", "describeContents", "", "getRedirectUrl", "getSSODevice", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCustomTabComplete", "", "url", "request", "Lcom/facebook/login/LoginClient$Request;", "putChallengeParam", "param", "Lorg/json/JSONObject;", "tryAuthorize", "validateChallengeParam", "values", "Landroid/os/Bundle;", "writeToParcel", "dest", "flags", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    private static final int API_EC_DIALOG_CANCEL = 4201;
    private static final int CHALLENGE_LENGTH = 20;
    private static final int CUSTOM_TAB_REQUEST_CODE = 1;
    public static final String OAUTH_DIALOG = "oauth";
    public static boolean calledThroughLoggedOutAppSwitch;
    private String currentPackage;
    private String expectedChallenge;
    private final String nameForLogging;
    private final AccessTokenSource tokenSource;
    private String validRedirectURI;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new Parcelable.Creator<CustomTabLoginMethodHandler>() { // from class: com.facebook.login.CustomTabLoginMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomTabLoginMethodHandler createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new CustomTabLoginMethodHandler(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomTabLoginMethodHandler[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    protected String getSSODevice() {
        return "chrome_custom_tab";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "custom_tab";
        this.tokenSource = AccessTokenSource.CHROME_CUSTOM_TAB;
        Utility utility = Utility.INSTANCE;
        this.expectedChallenge = Utility.generateRandomString(20);
        calledThroughLoggedOutAppSwitch = false;
        CustomTabUtils customTabUtils = CustomTabUtils.INSTANCE;
        this.validRedirectURI = CustomTabUtils.getValidRedirectURI(getDeveloperDefinedRedirectURI());
    }

    @Override // com.facebook.login.LoginMethodHandler
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    private final String getDeveloperDefinedRedirectURI() {
        return super.getRedirectUrl();
    }

    @Override // com.facebook.login.LoginMethodHandler
    protected String getRedirectUrl() {
        return this.validRedirectURI;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int tryAuthorize(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        LoginClient loginClient = getLoginClient();
        if (getRedirectUrl().length() == 0) {
            return 0;
        }
        Bundle addExtraParameters = addExtraParameters(getParameters(request), request);
        if (calledThroughLoggedOutAppSwitch) {
            addExtraParameters.putString(ServerProtocol.DIALOG_PARAM_CCT_OVER_LOGGED_OUT_APP_SWITCH, "1");
        }
        if (FacebookSdk.hasCustomTabsPrefetching) {
            if (request.isInstagramLogin()) {
                CustomTabPrefetchHelper.Companion.mayLaunchUrl(InstagramCustomTab.Companion.getURIForAction(OAUTH_DIALOG, addExtraParameters));
            } else {
                CustomTabPrefetchHelper.Companion.mayLaunchUrl(CustomTab.Companion.getURIForAction(OAUTH_DIALOG, addExtraParameters));
            }
        }
        FragmentActivity activity = loginClient.getActivity();
        if (activity == null) {
            return 0;
        }
        Intent intent = new Intent(activity, CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.EXTRA_ACTION, OAUTH_DIALOG);
        intent.putExtra(CustomTabMainActivity.EXTRA_PARAMS, addExtraParameters);
        intent.putExtra(CustomTabMainActivity.EXTRA_CHROME_PACKAGE, getChromePackage());
        intent.putExtra(CustomTabMainActivity.EXTRA_TARGET_APP, request.getLoginTargetApp().toString());
        Fragment fragment = loginClient.getFragment();
        if (fragment != null) {
            fragment.startActivityForResult(intent, 1);
        }
        return 1;
    }

    private final String getChromePackage() {
        String str = this.currentPackage;
        if (str != null) {
            return str;
        }
        CustomTabUtils customTabUtils = CustomTabUtils.INSTANCE;
        String chromePackage = CustomTabUtils.getChromePackage();
        this.currentPackage = chromePackage;
        return chromePackage;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (intent == null || !intent.getBooleanExtra(CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)) {
            if (i != 1) {
                return super.onActivityResult(i, i2, intent);
            }
            LoginClient.Request pendingRequest = getLoginClient().getPendingRequest();
            if (pendingRequest == null) {
                return false;
            }
            if (i2 == -1) {
                onCustomTabComplete(intent != null ? intent.getStringExtra(CustomTabMainActivity.EXTRA_URL) : null, pendingRequest);
                return true;
            }
            super.onComplete(pendingRequest, null, new FacebookOperationCanceledException());
            return false;
        }
        return super.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onCustomTabComplete(String str, final LoginClient.Request request) {
        int i;
        if (str == null) {
            return;
        }
        if (!StringsKt.startsWith$default(str, Validate.CUSTOM_TAB_REDIRECT_URI_PREFIX, false, 2, (Object) null) && !StringsKt.startsWith$default(str, super.getRedirectUrl(), false, 2, (Object) null)) {
            return;
        }
        Uri parse = Uri.parse(str);
        Utility utility = Utility.INSTANCE;
        final Bundle parseUrlQueryString = Utility.parseUrlQueryString(parse.getQuery());
        Utility utility2 = Utility.INSTANCE;
        parseUrlQueryString.putAll(Utility.parseUrlQueryString(parse.getFragment()));
        if (!validateChallengeParam(parseUrlQueryString)) {
            super.onComplete(request, null, new FacebookException("Invalid state parameter"));
            return;
        }
        String string = parseUrlQueryString.getString("error");
        if (string == null) {
            string = parseUrlQueryString.getString(NativeProtocol.BRIDGE_ARG_ERROR_TYPE);
        }
        String string2 = parseUrlQueryString.getString("error_msg");
        if (string2 == null) {
            string2 = parseUrlQueryString.getString(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE);
        }
        if (string2 == null) {
            string2 = parseUrlQueryString.getString(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION);
        }
        String string3 = parseUrlQueryString.getString(NativeProtocol.BRIDGE_ARG_ERROR_CODE);
        if (string3 != null) {
            try {
                i = Integer.parseInt(string3);
            } catch (NumberFormatException unused) {
                i = -1;
            }
            Utility utility3 = Utility.INSTANCE;
            if (Utility.isNullOrEmpty(string)) {
                Utility utility4 = Utility.INSTANCE;
                if (Utility.isNullOrEmpty(string2) && i == -1) {
                    if (parseUrlQueryString.containsKey("access_token")) {
                        super.onComplete(request, parseUrlQueryString, null);
                        return;
                    }
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.login.CustomTabLoginMethodHandler$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            CustomTabLoginMethodHandler.m6428onCustomTabComplete$lambda0(CustomTabLoginMethodHandler.this, request, parseUrlQueryString);
                        }
                    });
                    return;
                }
            }
            if (string == null && (Intrinsics.areEqual(string, "access_denied") || Intrinsics.areEqual(string, "OAuthAccessDeniedException"))) {
                super.onComplete(request, null, new FacebookOperationCanceledException());
                return;
            } else if (i != API_EC_DIALOG_CANCEL) {
                super.onComplete(request, null, new FacebookOperationCanceledException());
                return;
            } else {
                super.onComplete(request, null, new FacebookServiceException(new FacebookRequestError(i, string, string2), string2));
                return;
            }
        }
        i = -1;
        Utility utility32 = Utility.INSTANCE;
        if (Utility.isNullOrEmpty(string)) {
        }
        if (string == null) {
        }
        if (i != API_EC_DIALOG_CANCEL) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCustomTabComplete$lambda-0  reason: not valid java name */
    public static final void m6428onCustomTabComplete$lambda0(CustomTabLoginMethodHandler this$0, LoginClient.Request request, Bundle values) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(values, "$values");
        try {
            this$0.onComplete(request, this$0.processCodeExchange(request, values), null);
        } catch (FacebookException e) {
            this$0.onComplete(request, null, e);
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void putChallengeParam(JSONObject param) throws JSONException {
        Intrinsics.checkNotNullParameter(param, "param");
        param.put(LoginLogger.EVENT_PARAM_CHALLENGE, this.expectedChallenge);
    }

    private final boolean validateChallengeParam(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return Intrinsics.areEqual(new JSONObject(string).getString(LoginLogger.EVENT_PARAM_CHALLENGE), this.expectedChallenge);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.nameForLogging = "custom_tab";
        this.tokenSource = AccessTokenSource.CHROME_CUSTOM_TAB;
        this.expectedChallenge = source.readString();
        CustomTabUtils customTabUtils = CustomTabUtils.INSTANCE;
        this.validRedirectURI = CustomTabUtils.getValidRedirectURI(getDeveloperDefinedRedirectURI());
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i);
        dest.writeString(this.expectedChallenge);
    }

    /* compiled from: CustomTabLoginMethodHandler.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/login/CustomTabLoginMethodHandler$Companion;", "", "()V", "API_EC_DIALOG_CANCEL", "", "CHALLENGE_LENGTH", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/CustomTabLoginMethodHandler;", "CUSTOM_TAB_REQUEST_CODE", "OAUTH_DIALOG", "", "calledThroughLoggedOutAppSwitch", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
