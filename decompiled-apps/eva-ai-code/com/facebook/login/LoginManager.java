package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.LoginStatusCallback;
import com.facebook.Profile;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginStatusClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: LoginManager.kt */
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 y2\u00020\u0001:\u0006wxyz{|B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J$\u0010\u001e\u001a\u00060\u001fR\u00020\u00002\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010#\u001a\u00020$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&H\u0014J\u0010\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020,H\u0014J\b\u0010-\u001a\u00020$H\u0014JH\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u00010$2\b\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u00020\r2\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020:\u0018\u000109H\u0002J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020$H\u0014JL\u0010>\u001a\u00020/2\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020B2\u0014\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010D2\b\u00105\u001a\u0004\u0018\u00010E2\u0006\u0010F\u001a\u00020\r2\b\u0010=\u001a\u0004\u0018\u00010$H\u0002J\u0016\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u00020I2\u0006\u0010+\u001a\u00020,J\u001e\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u00020I2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&J(\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u00020I2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&2\b\u0010\"\u001a\u0004\u0018\u00010\u0004J\u001e\u0010G\u001a\u00020/2\u0006\u0010J\u001a\u00020K2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&J(\u0010G\u001a\u00020/2\u0006\u0010J\u001a\u00020K2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&2\b\u0010\"\u001a\u0004\u0018\u00010\u0004J \u0010G\u001a\u00020/2\u0006\u0010L\u001a\u00020M2\u0006\u0010 \u001a\u00020!2\u0006\u0010+\u001a\u00020,H\u0002J$\u0010G\u001a\u00020/2\u0006\u0010L\u001a\u00020M2\u0006\u0010 \u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&J.\u0010G\u001a\u00020/2\u0006\u0010L\u001a\u00020M2\u0006\u0010 \u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&2\b\u0010\"\u001a\u0004\u0018\u00010\u0004J\u001e\u0010G\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&J(\u0010G\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&2\b\u0010\"\u001a\u0004\u0018\u00010\u0004J\u0016\u0010G\u001a\u00020/2\u0006\u0010J\u001a\u00020O2\u0006\u0010+\u001a\u00020,J\u001e\u0010G\u001a\u00020/2\u0006\u0010J\u001a\u00020O2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&J(\u0010G\u001a\u00020/2\u0006\u0010J\u001a\u00020O2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&2\b\u0010\"\u001a\u0004\u0018\u00010\u0004J\u0016\u0010P\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\u0006\u0010+\u001a\u00020,J\u001e\u0010Q\u001a\u00020/2\u0006\u0010H\u001a\u00020I2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&J\u001c\u0010Q\u001a\u00020/2\u0006\u0010J\u001a\u00020K2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&J$\u0010Q\u001a\u00020/2\u0006\u0010L\u001a\u00020M2\u0006\u0010 \u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&J$\u0010Q\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\u0006\u0010 \u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&J\u001e\u0010Q\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&H\u0007J\u001e\u0010Q\u001a\u00020/2\u0006\u0010J\u001a\u00020O2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&H\u0002J\u001e\u0010R\u001a\u00020/2\u0006\u0010H\u001a\u00020I2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&J\u001c\u0010R\u001a\u00020/2\u0006\u0010J\u001a\u00020K2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&J$\u0010R\u001a\u00020/2\u0006\u0010L\u001a\u00020M2\u0006\u0010 \u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&J$\u0010R\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\u0006\u0010 \u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&J\u001e\u0010R\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&H\u0007J\u001e\u0010R\u001a\u00020/2\u0006\u0010J\u001a\u00020O2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&H\u0002J\b\u0010S\u001a\u00020/H\u0016J\u001c\u0010T\u001a\u00020/2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u0010U\u001a\u0004\u0018\u00010$H\u0002J\u0016\u0010V\u001a\u00020/2\u0006\u0010H\u001a\u00020I2\u0006\u0010+\u001a\u00020,J\u0018\u0010V\u001a\u00020/2\u0006\u0010J\u001a\u00020O2\u0006\u0010+\u001a\u00020,H\u0002J,\u0010W\u001a\u00020\r2\u0006\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010<2\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u00020:\u0018\u000109H\u0017J\u000e\u0010[\u001a\u00020/2\u0006\u0010H\u001a\u00020IJ\u000e\u0010[\u001a\u00020/2\u0006\u0010J\u001a\u00020NJ\u0010\u0010[\u001a\u00020/2\u0006\u0010J\u001a\u00020OH\u0002J \u0010\\\u001a\u00020/2\b\u0010 \u001a\u0004\u0018\u00010!2\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020:\u0018\u000109J\u0016\u0010]\u001a\u00020/2\u0006\u0010H\u001a\u00020I2\u0006\u0010(\u001a\u00020)J\u0016\u0010]\u001a\u00020/2\u0006\u0010J\u001a\u00020K2\u0006\u0010(\u001a\u00020)J\u001e\u0010]\u001a\u00020/2\u0006\u0010L\u001a\u00020M2\u0006\u0010 \u001a\u00020!2\u0006\u0010(\u001a\u00020)J\u001e\u0010]\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\u0006\u0010 \u001a\u00020!2\u0006\u0010(\u001a\u00020)J\u0018\u0010]\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\u0006\u0010(\u001a\u00020)H\u0007J\u0018\u0010]\u001a\u00020/2\u0006\u0010J\u001a\u00020O2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010^\u001a\u00020\r2\u0006\u0010_\u001a\u00020<H\u0002J\u0016\u0010`\u001a\u00020/2\u0006\u0010?\u001a\u00020@2\u0006\u0010a\u001a\u00020bJ\u001e\u0010`\u001a\u00020/2\u0006\u0010?\u001a\u00020@2\u0006\u0010c\u001a\u00020d2\u0006\u0010a\u001a\u00020bJ \u0010e\u001a\u00020/2\u0006\u0010?\u001a\u00020@2\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020dH\u0002J\u000e\u0010f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010g\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010h\u001a\u00020/2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010i\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\rJ\u000e\u0010j\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010k\u001a\u00020\u00002\u0006\u0010l\u001a\u00020\u0014J\u0010\u0010m\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u000e\u0010n\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\rJ\u000e\u0010o\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\rJ\u0018\u0010p\u001a\u00020/2\u0006\u0010q\u001a\u00020r2\u0006\u0010=\u001a\u00020$H\u0002J\u0018\u0010s\u001a\u00020\r2\u0006\u0010q\u001a\u00020r2\u0006\u0010=\u001a\u00020$H\u0002J\u0010\u0010t\u001a\u00020/2\b\u0010 \u001a\u0004\u0018\u00010!J\u0018\u0010u\u001a\u00020/2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&H\u0002J\u0018\u0010v\u001a\u00020/2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&H\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000e¨\u0006}"}, d2 = {"Lcom/facebook/login/LoginManager;", "", "()V", "<set-?>", "", "authType", "getAuthType", "()Ljava/lang/String;", "Lcom/facebook/login/DefaultAudience;", "defaultAudience", "getDefaultAudience", "()Lcom/facebook/login/DefaultAudience;", "isExpressLoginAllowed", "", "()Z", "isFamilyLogin", "Lcom/facebook/login/LoginBehavior;", "loginBehavior", "getLoginBehavior", "()Lcom/facebook/login/LoginBehavior;", "Lcom/facebook/login/LoginTargetApp;", "loginTargetApp", "getLoginTargetApp", "()Lcom/facebook/login/LoginTargetApp;", "messengerPageId", "resetMessengerState", "sharedPreferences", "Landroid/content/SharedPreferences;", "shouldSkipAccountDeduplication", "getShouldSkipAccountDeduplication", "createLogInActivityResultContract", "Lcom/facebook/login/LoginManager$FacebookLoginActivityResultContract;", "callbackManager", "Lcom/facebook/CallbackManager;", "loggerID", "createLoginRequest", "Lcom/facebook/login/LoginClient$Request;", "permissions", "", "createLoginRequestFromResponse", "response", "Lcom/facebook/GraphResponse;", "createLoginRequestWithConfig", "loginConfig", "Lcom/facebook/login/LoginConfiguration;", "createReauthorizeRequest", "finishLogin", "", "newToken", "Lcom/facebook/AccessToken;", "newIdToken", "Lcom/facebook/AuthenticationToken;", "origRequest", "exception", "Lcom/facebook/FacebookException;", "isCanceled", "callback", "Lcom/facebook/FacebookCallback;", "Lcom/facebook/login/LoginResult;", "getFacebookActivityIntent", "Landroid/content/Intent;", "request", "logCompleteLogin", "context", "Landroid/content/Context;", "result", "Lcom/facebook/login/LoginClient$Result$Code;", "resultExtras", "", "Ljava/lang/Exception;", "wasLoginActivityTried", "logIn", "activity", "Landroid/app/Activity;", "fragment", "Landroid/app/Fragment;", "activityResultRegistryOwner", "Landroidx/activity/result/ActivityResultRegistryOwner;", "Landroidx/fragment/app/Fragment;", "Lcom/facebook/internal/FragmentWrapper;", "logInWithConfiguration", "logInWithPublishPermissions", "logInWithReadPermissions", "logOut", "logStartLogin", "loginRequest", "loginWithConfiguration", "onActivityResult", "resultCode", "", "data", "reauthorizeDataAccess", "registerCallback", "resolveError", "resolveIntent", "intent", "retrieveLoginStatus", "responseCallback", "Lcom/facebook/LoginStatusCallback;", "toastDurationMs", "", "retrieveLoginStatusImpl", "setAuthType", "setDefaultAudience", "setExpressLoginStatus", "setFamilyLogin", "setLoginBehavior", "setLoginTargetApp", "targetApp", "setMessengerPageId", "setResetMessengerState", "setShouldSkipAccountDeduplication", "startLogin", "startActivityDelegate", "Lcom/facebook/login/StartActivityDelegate;", "tryFacebookActivity", "unregisterCallback", "validatePublishPermissions", "validateReadPermissions", "ActivityStartActivityDelegate", "AndroidxActivityResultRegistryOwnerStartActivityDelegate", "Companion", "FacebookLoginActivityResultContract", "FragmentStartActivityDelegate", "LoginLoggerHolder", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class LoginManager {
    public static final Companion Companion;
    private static final String EXPRESS_LOGIN_ALLOWED = "express_login_allowed";
    private static final String MANAGE_PERMISSION_PREFIX = "manage";
    private static final Set<String> OTHER_PUBLISH_PERMISSIONS;
    private static final String PREFERENCE_LOGIN_MANAGER = "com.facebook.loginManager";
    private static final String PUBLISH_PERMISSION_PREFIX = "publish";
    private static final String TAG;
    private static volatile LoginManager instance;
    private boolean isFamilyLogin;
    private String messengerPageId;
    private boolean resetMessengerState;
    private final SharedPreferences sharedPreferences;
    private boolean shouldSkipAccountDeduplication;
    private LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
    private DefaultAudience defaultAudience = DefaultAudience.FRIENDS;
    private String authType = ServerProtocol.DIALOG_REREQUEST_AUTH_TYPE;
    private LoginTargetApp loginTargetApp = LoginTargetApp.FACEBOOK;

    @JvmStatic
    public static final LoginResult computeLoginResult(LoginClient.Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
        return Companion.computeLoginResult(request, accessToken, authenticationToken);
    }

    @JvmStatic
    public static final Map<String, String> getExtraDataFromIntent(Intent intent) {
        return Companion.getExtraDataFromIntent(intent);
    }

    @JvmStatic
    public static LoginManager getInstance() {
        return Companion.getInstance();
    }

    @JvmStatic
    public static final boolean isPublishPermission(String str) {
        return Companion.isPublishPermission(str);
    }

    public final FacebookLoginActivityResultContract createLogInActivityResultContract() {
        return createLogInActivityResultContract$default(this, null, null, 3, null);
    }

    public final FacebookLoginActivityResultContract createLogInActivityResultContract(CallbackManager callbackManager) {
        return createLogInActivityResultContract$default(this, callbackManager, null, 2, null);
    }

    public final boolean onActivityResult(int i, Intent intent) {
        return onActivityResult$default(this, i, intent, null, 4, null);
    }

    public LoginManager() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences;
        if (FacebookSdk.hasCustomTabsPrefetching) {
            CustomTabUtils customTabUtils = CustomTabUtils.INSTANCE;
            if (CustomTabUtils.getChromePackage() != null) {
                CustomTabPrefetchHelper customTabPrefetchHelper = new CustomTabPrefetchHelper();
                FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
                CustomTabsClient.bindCustomTabsService(FacebookSdk.getApplicationContext(), "com.android.chrome", customTabPrefetchHelper);
                FacebookSdk facebookSdk3 = FacebookSdk.INSTANCE;
                Context applicationContext = FacebookSdk.getApplicationContext();
                FacebookSdk facebookSdk4 = FacebookSdk.INSTANCE;
                CustomTabsClient.connectAndInitialize(applicationContext, FacebookSdk.getApplicationContext().getPackageName());
            }
        }
    }

    public final LoginBehavior getLoginBehavior() {
        return this.loginBehavior;
    }

    public final DefaultAudience getDefaultAudience() {
        return this.defaultAudience;
    }

    public final String getAuthType() {
        return this.authType;
    }

    public final LoginTargetApp getLoginTargetApp() {
        return this.loginTargetApp;
    }

    public final boolean isFamilyLogin() {
        return this.isFamilyLogin;
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.shouldSkipAccountDeduplication;
    }

    public final void resolveError(Activity activity, GraphResponse response) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(response, "response");
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestFromResponse(response));
    }

    @Deprecated(message = "")
    public final void resolveError(Fragment fragment, GraphResponse response) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(response, "response");
        resolveError(new FragmentWrapper(fragment), response);
    }

    public final void resolveError(Fragment fragment, CallbackManager callbackManager, GraphResponse response) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(response, "response");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            resolveError(activity, callbackManager, response);
            return;
        }
        throw new FacebookException(Intrinsics.stringPlus("Cannot obtain activity context on the fragment ", fragment));
    }

    public final void resolveError(android.app.Fragment fragment, GraphResponse response) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(response, "response");
        resolveError(new FragmentWrapper(fragment), response);
    }

    private final void resolveError(FragmentWrapper fragmentWrapper, GraphResponse graphResponse) {
        startLogin(new FragmentStartActivityDelegate(fragmentWrapper), createLoginRequestFromResponse(graphResponse));
    }

    public final void resolveError(ActivityResultRegistryOwner activityResultRegistryOwner, CallbackManager callbackManager, GraphResponse response) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(response, "response");
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(activityResultRegistryOwner, callbackManager), createLoginRequestFromResponse(response));
    }

    private final LoginClient.Request createLoginRequestFromResponse(GraphResponse graphResponse) {
        Set<String> permissions2;
        AccessToken accessToken = graphResponse.getRequest().getAccessToken();
        List list = null;
        if (accessToken != null && (permissions2 = accessToken.getPermissions()) != null) {
            list = CollectionsKt.filterNotNull(permissions2);
        }
        return createLoginRequest(list);
    }

    public final void registerCallback(CallbackManager callbackManager, final FacebookCallback<LoginResult> facebookCallback) {
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((CallbackManagerImpl) callbackManager).registerCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new CallbackManagerImpl.Callback() { // from class: com.facebook.login.LoginManager$$ExternalSyntheticLambda0
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i, Intent intent) {
                boolean m6445registerCallback$lambda0;
                m6445registerCallback$lambda0 = LoginManager.m6445registerCallback$lambda0(LoginManager.this, facebookCallback, i, intent);
                return m6445registerCallback$lambda0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerCallback$lambda-0  reason: not valid java name */
    public static final boolean m6445registerCallback$lambda0(LoginManager this$0, FacebookCallback facebookCallback, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.onActivityResult(i, intent, facebookCallback);
    }

    public final void unregisterCallback(CallbackManager callbackManager) {
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((CallbackManagerImpl) callbackManager).unregisterCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean onActivityResult$default(LoginManager loginManager, int i, Intent intent, FacebookCallback facebookCallback, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                facebookCallback = null;
            }
            return loginManager.onActivityResult(i, intent, facebookCallback);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
    }

    public boolean onActivityResult(int i, Intent intent, FacebookCallback<LoginResult> facebookCallback) {
        LoginClient.Result.Code code;
        boolean z;
        AccessToken accessToken;
        AuthenticationToken authenticationToken;
        LoginClient.Request request;
        Map<String, String> map;
        AuthenticationToken authenticationToken2;
        LoginClient.Result.Code code2 = LoginClient.Result.Code.ERROR;
        FacebookAuthorizationException facebookAuthorizationException = null;
        if (intent != null) {
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra(LoginFragment.RESULT_KEY);
            if (result != null) {
                request = result.request;
                LoginClient.Result.Code code3 = result.code;
                if (i != -1) {
                    r5 = i == 0;
                    accessToken = null;
                    authenticationToken2 = null;
                } else if (result.code == LoginClient.Result.Code.SUCCESS) {
                    accessToken = result.token;
                    authenticationToken2 = result.authenticationToken;
                } else {
                    authenticationToken2 = null;
                    facebookAuthorizationException = new FacebookAuthorizationException(result.errorMessage);
                    accessToken = null;
                }
                map = result.loggingExtras;
                z = r5;
                authenticationToken = authenticationToken2;
                code = code3;
            }
            code = code2;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
            z = false;
        } else {
            if (i == 0) {
                code = LoginClient.Result.Code.CANCEL;
                z = true;
                accessToken = null;
                authenticationToken = null;
                request = null;
                map = null;
            }
            code = code2;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
            z = false;
        }
        if (facebookAuthorizationException == null && accessToken == null && !z) {
            facebookAuthorizationException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        FacebookException facebookException = facebookAuthorizationException;
        LoginClient.Request request2 = request;
        logCompleteLogin(null, code, map, facebookException, true, request2);
        finishLogin(accessToken, authenticationToken, request2, facebookException, z, facebookCallback);
        return true;
    }

    public final LoginManager setLoginBehavior(LoginBehavior loginBehavior) {
        Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
        this.loginBehavior = loginBehavior;
        return this;
    }

    public final LoginManager setLoginTargetApp(LoginTargetApp targetApp) {
        Intrinsics.checkNotNullParameter(targetApp, "targetApp");
        this.loginTargetApp = targetApp;
        return this;
    }

    public final LoginManager setDefaultAudience(DefaultAudience defaultAudience) {
        Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
        this.defaultAudience = defaultAudience;
        return this;
    }

    public final LoginManager setAuthType(String authType) {
        Intrinsics.checkNotNullParameter(authType, "authType");
        this.authType = authType;
        return this;
    }

    public final LoginManager setMessengerPageId(String str) {
        this.messengerPageId = str;
        return this;
    }

    public final LoginManager setResetMessengerState(boolean z) {
        this.resetMessengerState = z;
        return this;
    }

    public final LoginManager setFamilyLogin(boolean z) {
        this.isFamilyLogin = z;
        return this;
    }

    public final LoginManager setShouldSkipAccountDeduplication(boolean z) {
        this.shouldSkipAccountDeduplication = z;
        return this;
    }

    public void logOut() {
        AccessToken.Companion.setCurrentAccessToken(null);
        AuthenticationToken.Companion.setCurrentAuthenticationToken(null);
        Profile.Companion.setCurrentProfile(null);
        setExpressLoginStatus(false);
    }

    public final void retrieveLoginStatus(Context context, LoginStatusCallback responseCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        retrieveLoginStatus(context, 5000L, responseCallback);
    }

    public final void retrieveLoginStatus(Context context, long j, LoginStatusCallback responseCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        retrieveLoginStatusImpl(context, responseCallback, j);
    }

    @Deprecated(message = "")
    public final void logInWithReadPermissions(Fragment fragment, Collection<String> permissions2) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(permissions2, "permissions");
        logInWithReadPermissions(new FragmentWrapper(fragment), permissions2);
    }

    public final void logInWithReadPermissions(Fragment fragment, CallbackManager callbackManager, Collection<String> permissions2) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions2, "permissions");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            logInWithReadPermissions(activity, callbackManager, permissions2);
            return;
        }
        throw new FacebookException(Intrinsics.stringPlus("Cannot obtain activity context on the fragment ", fragment));
    }

    public final void logInWithReadPermissions(android.app.Fragment fragment, Collection<String> permissions2) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(permissions2, "permissions");
        logInWithReadPermissions(new FragmentWrapper(fragment), permissions2);
    }

    private final void logInWithReadPermissions(FragmentWrapper fragmentWrapper, Collection<String> collection) {
        validateReadPermissions(collection);
        logIn(fragmentWrapper, new LoginConfiguration(collection, null, 2, null));
    }

    public final void logInWithReadPermissions(Activity activity, Collection<String> collection) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        validateReadPermissions(collection);
        logIn(activity, new LoginConfiguration(collection, null, 2, null));
    }

    public final void logInWithReadPermissions(ActivityResultRegistryOwner activityResultRegistryOwner, CallbackManager callbackManager, Collection<String> permissions2) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions2, "permissions");
        validateReadPermissions(permissions2);
        logIn(activityResultRegistryOwner, callbackManager, new LoginConfiguration(permissions2, null, 2, null));
    }

    public final void logInWithConfiguration(Fragment fragment, LoginConfiguration loginConfig) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        loginWithConfiguration(new FragmentWrapper(fragment), loginConfig);
    }

    private final void loginWithConfiguration(FragmentWrapper fragmentWrapper, LoginConfiguration loginConfiguration) {
        logIn(fragmentWrapper, loginConfiguration);
    }

    public final void loginWithConfiguration(Activity activity, LoginConfiguration loginConfig) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        logIn(activity, loginConfig);
    }

    public final void reauthorizeDataAccess(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        startLogin(new ActivityStartActivityDelegate(activity), createReauthorizeRequest());
    }

    public final void reauthorizeDataAccess(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        reauthorizeDataAccess(new FragmentWrapper(fragment));
    }

    private final void reauthorizeDataAccess(FragmentWrapper fragmentWrapper) {
        startLogin(new FragmentStartActivityDelegate(fragmentWrapper), createReauthorizeRequest());
    }

    @Deprecated(message = "")
    public final void logInWithPublishPermissions(Fragment fragment, Collection<String> permissions2) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(permissions2, "permissions");
        logInWithPublishPermissions(new FragmentWrapper(fragment), permissions2);
    }

    public final void logInWithPublishPermissions(Fragment fragment, CallbackManager callbackManager, Collection<String> permissions2) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions2, "permissions");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            logInWithPublishPermissions(activity, callbackManager, permissions2);
            return;
        }
        throw new FacebookException(Intrinsics.stringPlus("Cannot obtain activity context on the fragment ", fragment));
    }

    public final void logInWithPublishPermissions(android.app.Fragment fragment, Collection<String> permissions2) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(permissions2, "permissions");
        logInWithPublishPermissions(new FragmentWrapper(fragment), permissions2);
    }

    private final void logInWithPublishPermissions(FragmentWrapper fragmentWrapper, Collection<String> collection) {
        validatePublishPermissions(collection);
        loginWithConfiguration(fragmentWrapper, new LoginConfiguration(collection, null, 2, null));
    }

    public final void logInWithPublishPermissions(Activity activity, Collection<String> collection) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        validatePublishPermissions(collection);
        loginWithConfiguration(activity, new LoginConfiguration(collection, null, 2, null));
    }

    public final void logInWithPublishPermissions(ActivityResultRegistryOwner activityResultRegistryOwner, CallbackManager callbackManager, Collection<String> permissions2) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions2, "permissions");
        validatePublishPermissions(permissions2);
        logIn(activityResultRegistryOwner, callbackManager, new LoginConfiguration(permissions2, null, 2, null));
    }

    public final void logIn(Fragment fragment, Collection<String> collection) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), collection);
    }

    public final void logIn(Fragment fragment, Collection<String> collection, String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), collection, str);
    }

    public final void logIn(android.app.Fragment fragment, Collection<String> collection) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), collection);
    }

    public final void logIn(android.app.Fragment fragment, Collection<String> collection, String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), collection, str);
    }

    public final void logIn(FragmentWrapper fragment, Collection<String> collection) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        logIn(fragment, new LoginConfiguration(collection, null, 2, null));
    }

    public final void logIn(FragmentWrapper fragment, Collection<String> collection, String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        LoginClient.Request createLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(collection, null, 2, null));
        if (str != null) {
            createLoginRequestWithConfig.setAuthId(str);
        }
        startLogin(new FragmentStartActivityDelegate(fragment), createLoginRequestWithConfig);
    }

    public final void logIn(Activity activity, Collection<String> collection) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        logIn(activity, new LoginConfiguration(collection, null, 2, null));
    }

    public final void logIn(FragmentWrapper fragment, LoginConfiguration loginConfig) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        startLogin(new FragmentStartActivityDelegate(fragment), createLoginRequestWithConfig(loginConfig));
    }

    public final void logIn(Activity activity, LoginConfiguration loginConfig) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        if (activity instanceof ActivityResultRegistryOwner) {
            Log.w(TAG, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestWithConfig(loginConfig));
    }

    public final void logIn(Activity activity, Collection<String> collection, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LoginClient.Request createLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(collection, null, 2, null));
        if (str != null) {
            createLoginRequestWithConfig.setAuthId(str);
        }
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestWithConfig);
    }

    private final void logIn(ActivityResultRegistryOwner activityResultRegistryOwner, CallbackManager callbackManager, LoginConfiguration loginConfiguration) {
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(activityResultRegistryOwner, callbackManager), createLoginRequestWithConfig(loginConfiguration));
    }

    public final void logIn(ActivityResultRegistryOwner activityResultRegistryOwner, CallbackManager callbackManager, Collection<String> permissions2, String str) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions2, "permissions");
        LoginClient.Request createLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(permissions2, null, 2, null));
        if (str != null) {
            createLoginRequestWithConfig.setAuthId(str);
        }
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(activityResultRegistryOwner, callbackManager), createLoginRequestWithConfig);
    }

    public final void logIn(ActivityResultRegistryOwner activityResultRegistryOwner, CallbackManager callbackManager, Collection<String> permissions2) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions2, "permissions");
        logIn(activityResultRegistryOwner, callbackManager, new LoginConfiguration(permissions2, null, 2, null));
    }

    /* compiled from: LoginManager.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u001d\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/facebook/login/LoginManager$FacebookLoginActivityResultContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Lcom/facebook/CallbackManager$ActivityResultParameters;", "callbackManager", "Lcom/facebook/CallbackManager;", "loggerID", "(Lcom/facebook/login/LoginManager;Lcom/facebook/CallbackManager;Ljava/lang/String;)V", "getCallbackManager", "()Lcom/facebook/CallbackManager;", "setCallbackManager", "(Lcom/facebook/CallbackManager;)V", "getLoggerID", "()Ljava/lang/String;", "setLoggerID", "(Ljava/lang/String;)V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "permissions", "parseResult", "resultCode", "", "intent", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public final class FacebookLoginActivityResultContract extends ActivityResultContract<Collection<? extends String>, CallbackManager.ActivityResultParameters> {
        private CallbackManager callbackManager;
        private String loggerID;

        public FacebookLoginActivityResultContract(LoginManager this$0, CallbackManager callbackManager, String str) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            LoginManager.this = this$0;
            this.callbackManager = callbackManager;
            this.loggerID = str;
        }

        public /* synthetic */ FacebookLoginActivityResultContract(CallbackManager callbackManager, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(LoginManager.this, (i & 1) != 0 ? null : callbackManager, (i & 2) != 0 ? null : str);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ Intent createIntent(Context context, Collection<? extends String> collection) {
            return createIntent2(context, (Collection<String>) collection);
        }

        public final CallbackManager getCallbackManager() {
            return this.callbackManager;
        }

        public final void setCallbackManager(CallbackManager callbackManager) {
            this.callbackManager = callbackManager;
        }

        public final String getLoggerID() {
            return this.loggerID;
        }

        public final void setLoggerID(String str) {
            this.loggerID = str;
        }

        /* renamed from: createIntent  reason: avoid collision after fix types in other method */
        public Intent createIntent2(Context context, Collection<String> permissions2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(permissions2, "permissions");
            LoginClient.Request createLoginRequestWithConfig = LoginManager.this.createLoginRequestWithConfig(new LoginConfiguration(permissions2, null, 2, null));
            String str = this.loggerID;
            if (str != null) {
                createLoginRequestWithConfig.setAuthId(str);
            }
            LoginManager.this.logStartLogin(context, createLoginRequestWithConfig);
            Intent facebookActivityIntent = LoginManager.this.getFacebookActivityIntent(createLoginRequestWithConfig);
            if (LoginManager.this.resolveIntent(facebookActivityIntent)) {
                return facebookActivityIntent;
            }
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            LoginManager.this.logCompleteLogin(context, LoginClient.Result.Code.ERROR, null, facebookException, false, createLoginRequestWithConfig);
            throw facebookException;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public CallbackManager.ActivityResultParameters parseResult(int i, Intent intent) {
            LoginManager.onActivityResult$default(LoginManager.this, i, intent, null, 4, null);
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            CallbackManager callbackManager = this.callbackManager;
            if (callbackManager != null) {
                callbackManager.onActivityResult(requestCode, i, intent);
            }
            return new CallbackManager.ActivityResultParameters(requestCode, i, intent);
        }
    }

    public static /* synthetic */ FacebookLoginActivityResultContract createLogInActivityResultContract$default(LoginManager loginManager, CallbackManager callbackManager, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                callbackManager = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return loginManager.createLogInActivityResultContract(callbackManager, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogInActivityResultContract");
    }

    public final FacebookLoginActivityResultContract createLogInActivityResultContract(CallbackManager callbackManager, String str) {
        return new FacebookLoginActivityResultContract(this, callbackManager, str);
    }

    private final void validateReadPermissions(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (Companion.isPublishPermission(str)) {
                throw new FacebookException("Cannot pass a publish or manage permission (" + str + ") to a request for read authorization");
            }
        }
    }

    private final void validatePublishPermissions(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (!Companion.isPublishPermission(str)) {
                throw new FacebookException("Cannot pass a read permission (" + str + ") to a request for publish authorization");
            }
        }
    }

    protected LoginClient.Request createLoginRequestWithConfig(LoginConfiguration loginConfig) {
        String codeVerifier;
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        CodeChallengeMethod codeChallengeMethod = CodeChallengeMethod.S256;
        try {
            PKCEUtil pKCEUtil = PKCEUtil.INSTANCE;
            codeVerifier = PKCEUtil.generateCodeChallenge(loginConfig.getCodeVerifier(), codeChallengeMethod);
        } catch (FacebookException unused) {
            codeChallengeMethod = CodeChallengeMethod.PLAIN;
            codeVerifier = loginConfig.getCodeVerifier();
        }
        String str = codeVerifier;
        LoginBehavior loginBehavior = this.loginBehavior;
        Set set = CollectionsKt.toSet(loginConfig.getPermissions());
        DefaultAudience defaultAudience = this.defaultAudience;
        String str2 = this.authType;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String applicationId = FacebookSdk.getApplicationId();
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(loginBehavior, set, defaultAudience, str2, applicationId, uuid, this.loginTargetApp, loginConfig.getNonce(), loginConfig.getCodeVerifier(), str, codeChallengeMethod);
        request.setRerequest(AccessToken.Companion.isCurrentAccessTokenActive());
        request.setMessengerPageId(this.messengerPageId);
        request.setResetMessengerState(this.resetMessengerState);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        return request;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public LoginClient.Request createLoginRequest(Collection<String> collection) {
        LoginBehavior loginBehavior = this.loginBehavior;
        Set set = collection == null ? null : CollectionsKt.toSet(collection);
        DefaultAudience defaultAudience = this.defaultAudience;
        String str = this.authType;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String applicationId = FacebookSdk.getApplicationId();
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(loginBehavior, set, defaultAudience, str, applicationId, uuid, this.loginTargetApp, null, null, null, null, 1920, null);
        request.setRerequest(AccessToken.Companion.isCurrentAccessTokenActive());
        request.setMessengerPageId(this.messengerPageId);
        request.setResetMessengerState(this.resetMessengerState);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        return request;
    }

    protected LoginClient.Request createReauthorizeRequest() {
        LoginBehavior loginBehavior = LoginBehavior.DIALOG_ONLY;
        HashSet hashSet = new HashSet();
        DefaultAudience defaultAudience = this.defaultAudience;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String applicationId = FacebookSdk.getApplicationId();
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(loginBehavior, hashSet, defaultAudience, "reauthorize", applicationId, uuid, this.loginTargetApp, null, null, null, null, 1920, null);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        return request;
    }

    private final void startLogin(StartActivityDelegate startActivityDelegate, LoginClient.Request request) throws FacebookException {
        logStartLogin(startActivityDelegate.getActivityContext(), request);
        CallbackManagerImpl.Companion.registerStaticCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new CallbackManagerImpl.Callback() { // from class: com.facebook.login.LoginManager$$ExternalSyntheticLambda2
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i, Intent intent) {
                boolean m6447startLogin$lambda1;
                m6447startLogin$lambda1 = LoginManager.m6447startLogin$lambda1(LoginManager.this, i, intent);
                return m6447startLogin$lambda1;
            }
        });
        if (tryFacebookActivity(startActivityDelegate, request)) {
            return;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        logCompleteLogin(startActivityDelegate.getActivityContext(), LoginClient.Result.Code.ERROR, null, facebookException, false, request);
        throw facebookException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startLogin$lambda-1  reason: not valid java name */
    public static final boolean m6447startLogin$lambda1(LoginManager this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return onActivityResult$default(this$0, i, intent, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logStartLogin(Context context, LoginClient.Request request) {
        LoginLogger logger = LoginLoggerHolder.INSTANCE.getLogger(context);
        if (logger == null || request == null) {
            return;
        }
        logger.logStartLogin(request, request.isFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_START : LoginLogger.EVENT_NAME_LOGIN_START);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logCompleteLogin(Context context, LoginClient.Result.Code code, Map<String, String> map, Exception exc, boolean z, LoginClient.Request request) {
        LoginLogger logger = LoginLoggerHolder.INSTANCE.getLogger(context);
        if (logger == null) {
            return;
        }
        if (request == null) {
            LoginLogger.logUnexpectedError$default(logger, LoginLogger.EVENT_NAME_LOGIN_COMPLETE, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LoginLogger.EVENT_EXTRAS_TRY_LOGIN_ACTIVITY, z ? "1" : "0");
        logger.logCompleteLogin(request.getAuthId(), hashMap, code, map, exc, request.isFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_COMPLETE : LoginLogger.EVENT_NAME_LOGIN_COMPLETE);
    }

    private final boolean tryFacebookActivity(StartActivityDelegate startActivityDelegate, LoginClient.Request request) {
        Intent facebookActivityIntent = getFacebookActivityIntent(request);
        if (resolveIntent(facebookActivityIntent)) {
            try {
                startActivityDelegate.startActivityForResult(facebookActivityIntent, LoginClient.Companion.getLoginRequestCode());
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean resolveIntent(Intent intent) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        return FacebookSdk.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null;
    }

    protected Intent getFacebookActivityIntent(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intent intent = new Intent();
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(request.getLoginBehavior().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra(LoginFragment.REQUEST_KEY, bundle);
        return intent;
    }

    private final void finishLogin(AccessToken accessToken, AuthenticationToken authenticationToken, LoginClient.Request request, FacebookException facebookException, boolean z, FacebookCallback<LoginResult> facebookCallback) {
        if (accessToken != null) {
            AccessToken.Companion.setCurrentAccessToken(accessToken);
            Profile.Companion.fetchProfileForCurrentAccessToken();
        }
        if (authenticationToken != null) {
            AuthenticationToken.Companion.setCurrentAuthenticationToken(authenticationToken);
        }
        if (facebookCallback != null) {
            LoginResult computeLoginResult = (accessToken == null || request == null) ? null : Companion.computeLoginResult(request, accessToken, authenticationToken);
            if (z || (computeLoginResult != null && computeLoginResult.getRecentlyGrantedPermissions().isEmpty())) {
                facebookCallback.onCancel();
            } else if (facebookException != null) {
                facebookCallback.onError(facebookException);
            } else if (accessToken == null || computeLoginResult == null) {
            } else {
                setExpressLoginStatus(true);
                facebookCallback.onSuccess(computeLoginResult);
            }
        }
    }

    private final void retrieveLoginStatusImpl(Context context, final LoginStatusCallback loginStatusCallback, long j) {
        Context context2;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        final String applicationId = FacebookSdk.getApplicationId();
        final String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        if (context == null) {
            FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
            context2 = FacebookSdk.getApplicationContext();
        } else {
            context2 = context;
        }
        final LoginLogger loginLogger = new LoginLogger(context2, applicationId);
        if (!isExpressLoginAllowed()) {
            loginLogger.logLoginStatusFailure(uuid);
            loginStatusCallback.onFailure();
            return;
        }
        LoginStatusClient.Companion companion = LoginStatusClient.Companion;
        FacebookSdk facebookSdk3 = FacebookSdk.INSTANCE;
        LoginStatusClient newInstance$facebook_common_release = companion.newInstance$facebook_common_release(context, applicationId, uuid, FacebookSdk.getGraphApiVersion(), j, null);
        newInstance$facebook_common_release.setCompletedListener(new PlatformServiceClient.CompletedListener() { // from class: com.facebook.login.LoginManager$$ExternalSyntheticLambda1
            @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
            public final void completed(Bundle bundle) {
                LoginManager.m6446retrieveLoginStatusImpl$lambda2(uuid, loginLogger, loginStatusCallback, applicationId, bundle);
            }
        });
        loginLogger.logLoginStatusStart(uuid);
        if (newInstance$facebook_common_release.start()) {
            return;
        }
        loginLogger.logLoginStatusFailure(uuid);
        loginStatusCallback.onFailure();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: retrieveLoginStatusImpl$lambda-2  reason: not valid java name */
    public static final void m6446retrieveLoginStatusImpl$lambda2(String loggerRef, LoginLogger logger, LoginStatusCallback responseCallback, String applicationId, Bundle bundle) {
        Intrinsics.checkNotNullParameter(loggerRef, "$loggerRef");
        Intrinsics.checkNotNullParameter(logger, "$logger");
        Intrinsics.checkNotNullParameter(responseCallback, "$responseCallback");
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        if (bundle != null) {
            String string = bundle.getString(NativeProtocol.STATUS_ERROR_TYPE);
            String string2 = bundle.getString(NativeProtocol.STATUS_ERROR_DESCRIPTION);
            if (string == null) {
                String string3 = bundle.getString(NativeProtocol.EXTRA_ACCESS_TOKEN);
                Utility utility = Utility.INSTANCE;
                Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_EXPIRES_SECONDS_SINCE_EPOCH, new Date(0L));
                ArrayList<String> stringArrayList = bundle.getStringArrayList(NativeProtocol.EXTRA_PERMISSIONS);
                String string4 = bundle.getString(NativeProtocol.RESULT_ARGS_SIGNED_REQUEST);
                String string5 = bundle.getString("graph_domain");
                Utility utility2 = Utility.INSTANCE;
                Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
                String str = string4;
                boolean z = false;
                String userIDFromSignedRequest = !(str == null || str.length() == 0) ? LoginMethodHandler.Companion.getUserIDFromSignedRequest(string4) : null;
                String str2 = string3;
                if (!(str2 == null || str2.length() == 0)) {
                    ArrayList<String> arrayList = stringArrayList;
                    if (!(arrayList == null || arrayList.isEmpty())) {
                        String str3 = userIDFromSignedRequest;
                        if (str3 == null || str3.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            AccessToken accessToken = new AccessToken(string3, applicationId, userIDFromSignedRequest, arrayList, null, null, null, bundleLongAsDate, null, bundleLongAsDate2, string5);
                            AccessToken.Companion.setCurrentAccessToken(accessToken);
                            Profile.Companion.fetchProfileForCurrentAccessToken();
                            logger.logLoginStatusSuccess(loggerRef);
                            responseCallback.onCompleted(accessToken);
                            return;
                        }
                    }
                }
                logger.logLoginStatusFailure(loggerRef);
                responseCallback.onFailure();
                return;
            }
            Companion.handleLoginStatusError(string, string2, loggerRef, logger, responseCallback);
            return;
        }
        logger.logLoginStatusFailure(loggerRef);
        responseCallback.onFailure();
    }

    private final void setExpressLoginStatus(boolean z) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putBoolean(EXPRESS_LOGIN_ALLOWED, z);
        edit.apply();
    }

    private final boolean isExpressLoginAllowed() {
        return this.sharedPreferences.getBoolean(EXPRESS_LOGIN_ALLOWED, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LoginManager.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/login/LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate;", "Lcom/facebook/login/StartActivityDelegate;", "activityResultRegistryOwner", "Landroidx/activity/result/ActivityResultRegistryOwner;", "callbackManager", "Lcom/facebook/CallbackManager;", "(Landroidx/activity/result/ActivityResultRegistryOwner;Lcom/facebook/CallbackManager;)V", "activityContext", "Landroid/app/Activity;", "getActivityContext", "()Landroid/app/Activity;", "startActivityForResult", "", "intent", "Landroid/content/Intent;", "requestCode", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class AndroidxActivityResultRegistryOwnerStartActivityDelegate implements StartActivityDelegate {
        private final ActivityResultRegistryOwner activityResultRegistryOwner;
        private final CallbackManager callbackManager;

        public AndroidxActivityResultRegistryOwnerStartActivityDelegate(ActivityResultRegistryOwner activityResultRegistryOwner, CallbackManager callbackManager) {
            Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
            Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
            this.activityResultRegistryOwner = activityResultRegistryOwner;
            this.callbackManager = callbackManager;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(Intent intent, int i) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            final LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder = new LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder();
            loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.setLauncher(this.activityResultRegistryOwner.getActivityResultRegistry().register("facebook-login", new ActivityResultContract<Intent, Pair<Integer, Intent>>() { // from class: com.facebook.login.LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$1
                @Override // androidx.activity.result.contract.ActivityResultContract
                public Intent createIntent(Context context, Intent input) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(input, "input");
                    return input;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // androidx.activity.result.contract.ActivityResultContract
                public Pair<Integer, Intent> parseResult(int i2, Intent intent2) {
                    Pair<Integer, Intent> create = Pair.create(Integer.valueOf(i2), intent2);
                    Intrinsics.checkNotNullExpressionValue(create, "create(resultCode, intent)");
                    return create;
                }
            }, new ActivityResultCallback() { // from class: com.facebook.login.LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$$ExternalSyntheticLambda0
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    LoginManager.AndroidxActivityResultRegistryOwnerStartActivityDelegate.m6449startActivityForResult$lambda0(LoginManager.AndroidxActivityResultRegistryOwnerStartActivityDelegate.this, loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder, (Pair) obj);
                }
            }));
            ActivityResultLauncher<Intent> launcher = loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.getLauncher();
            if (launcher == null) {
                return;
            }
            launcher.launch(intent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: startActivityForResult$lambda-0  reason: not valid java name */
        public static final void m6449startActivityForResult$lambda0(AndroidxActivityResultRegistryOwnerStartActivityDelegate this$0, LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder launcherHolder, Pair pair) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(launcherHolder, "$launcherHolder");
            CallbackManager callbackManager = this$0.callbackManager;
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            Object obj = pair.first;
            Intrinsics.checkNotNullExpressionValue(obj, "result.first");
            callbackManager.onActivityResult(requestCode, ((Number) obj).intValue(), (Intent) pair.second);
            ActivityResultLauncher<Intent> launcher = launcherHolder.getLauncher();
            if (launcher != null) {
                launcher.unregister();
            }
            launcherHolder.setLauncher(null);
        }

        @Override // com.facebook.login.StartActivityDelegate
        public Activity getActivityContext() {
            ActivityResultRegistryOwner activityResultRegistryOwner = this.activityResultRegistryOwner;
            if (activityResultRegistryOwner instanceof Activity) {
                return (Activity) activityResultRegistryOwner;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LoginManager.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/facebook/login/LoginManager$ActivityStartActivityDelegate;", "Lcom/facebook/login/StartActivityDelegate;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "activityContext", "getActivityContext", "()Landroid/app/Activity;", "startActivityForResult", "", "intent", "Landroid/content/Intent;", "requestCode", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ActivityStartActivityDelegate implements StartActivityDelegate {
        private final Activity activityContext;

        public ActivityStartActivityDelegate(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activityContext = activity;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public Activity getActivityContext() {
            return this.activityContext;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(Intent intent, int i) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            getActivityContext().startActivityForResult(intent, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LoginManager.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/login/LoginManager$FragmentStartActivityDelegate;", "Lcom/facebook/login/StartActivityDelegate;", "fragment", "Lcom/facebook/internal/FragmentWrapper;", "(Lcom/facebook/internal/FragmentWrapper;)V", "activityContext", "Landroid/app/Activity;", "getActivityContext", "()Landroid/app/Activity;", "startActivityForResult", "", "intent", "Landroid/content/Intent;", "requestCode", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class FragmentStartActivityDelegate implements StartActivityDelegate {
        private final Activity activityContext;
        private final FragmentWrapper fragment;

        public FragmentStartActivityDelegate(FragmentWrapper fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.fragment = fragment;
            this.activityContext = fragment.getActivity();
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(Intent intent, int i) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.fragment.startActivityForResult(intent, i);
        }

        @Override // com.facebook.login.StartActivityDelegate
        public Activity getActivityContext() {
            return this.activityContext;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LoginManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/login/LoginManager$LoginLoggerHolder;", "", "()V", "logger", "Lcom/facebook/login/LoginLogger;", "getLogger", "context", "Landroid/content/Context;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class LoginLoggerHolder {
        public static final LoginLoggerHolder INSTANCE = new LoginLoggerHolder();
        private static LoginLogger logger;

        private LoginLoggerHolder() {
        }

        public final synchronized LoginLogger getLogger(Context context) {
            if (context == null) {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                context = FacebookSdk.getApplicationContext();
            }
            if (context == null) {
                return null;
            }
            if (logger == null) {
                FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
                logger = new LoginLogger(context, FacebookSdk.getApplicationId());
            }
            return logger;
        }
    }

    /* compiled from: LoginManager.kt */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J \u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\b\u0010\u001c\u001a\u00020\fH\u0017J2\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006)"}, d2 = {"Lcom/facebook/login/LoginManager$Companion;", "", "()V", "EXPRESS_LOGIN_ALLOWED", "", "MANAGE_PERMISSION_PREFIX", "OTHER_PUBLISH_PERMISSIONS", "", "PREFERENCE_LOGIN_MANAGER", "PUBLISH_PERMISSION_PREFIX", "TAG", "instance", "Lcom/facebook/login/LoginManager;", "otherPublishPermissions", "getOtherPublishPermissions", "()Ljava/util/Set;", "computeLoginResult", "Lcom/facebook/login/LoginResult;", "request", "Lcom/facebook/login/LoginClient$Request;", "newToken", "Lcom/facebook/AccessToken;", "newIdToken", "Lcom/facebook/AuthenticationToken;", "getExtraDataFromIntent", "", "intent", "Landroid/content/Intent;", "getInstance", "handleLoginStatusError", "", "errorType", "errorDescription", "loggerRef", "logger", "Lcom/facebook/login/LoginLogger;", "responseCallback", "Lcom/facebook/LoginStatusCallback;", "isPublishPermission", "", "permission", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public LoginManager getInstance() {
            if (LoginManager.instance == null) {
                synchronized (this) {
                    Companion companion = LoginManager.Companion;
                    LoginManager.instance = new LoginManager();
                    Unit unit = Unit.INSTANCE;
                }
            }
            LoginManager loginManager = LoginManager.instance;
            if (loginManager != null) {
                return loginManager;
            }
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            throw null;
        }

        @JvmStatic
        public final Map<String, String> getExtraDataFromIntent(Intent intent) {
            if (intent == null) {
                return null;
            }
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra(LoginFragment.RESULT_KEY);
            if (result == null) {
                return null;
            }
            return result.extraData;
        }

        @JvmStatic
        public final boolean isPublishPermission(String str) {
            if (str != null) {
                return StringsKt.startsWith$default(str, LoginManager.PUBLISH_PERMISSION_PREFIX, false, 2, (Object) null) || StringsKt.startsWith$default(str, LoginManager.MANAGE_PERMISSION_PREFIX, false, 2, (Object) null) || LoginManager.OTHER_PUBLISH_PERMISSIONS.contains(str);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<String> getOtherPublishPermissions() {
            return SetsKt.setOf((Object[]) new String[]{"ads_management", "create_event", "rsvp_event"});
        }

        @JvmStatic
        public final LoginResult computeLoginResult(LoginClient.Request request, AccessToken newToken, AuthenticationToken authenticationToken) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(newToken, "newToken");
            Set<String> permissions2 = request.getPermissions();
            Set mutableSet = CollectionsKt.toMutableSet(CollectionsKt.filterNotNull(newToken.getPermissions()));
            if (request.isRerequest()) {
                mutableSet.retainAll(permissions2);
            }
            Set mutableSet2 = CollectionsKt.toMutableSet(CollectionsKt.filterNotNull(permissions2));
            mutableSet2.removeAll(mutableSet);
            return new LoginResult(newToken, authenticationToken, mutableSet, mutableSet2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleLoginStatusError(String str, String str2, String str3, LoginLogger loginLogger, LoginStatusCallback loginStatusCallback) {
            FacebookException facebookException = new FacebookException(str + ": " + ((Object) str2));
            loginLogger.logLoginStatusError(str3, facebookException);
            loginStatusCallback.onError(facebookException);
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        OTHER_PUBLISH_PERMISSIONS = companion.getOtherPublishPermissions();
        String cls = LoginManager.class.toString();
        Intrinsics.checkNotNullExpressionValue(cls, "LoginManager::class.java.toString()");
        TAG = cls;
    }
}
