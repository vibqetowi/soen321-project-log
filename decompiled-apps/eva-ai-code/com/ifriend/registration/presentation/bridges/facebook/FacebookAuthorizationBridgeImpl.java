package com.ifriend.registration.presentation.bridges.facebook;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.ifriend.base.di.Feature;
import com.ifriend.registration.domain.useCase.facebook.FacebookAccountData;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* compiled from: FacebookAuthorizationBridgeImpl.kt */
@Feature
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J$\u0010\u000b\u001a\u00020\b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\b0\rH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J2\u0010\u0013\u001a\u00020\b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\b0\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ifriend/registration/presentation/bridges/facebook/FacebookAuthorizationBridgeImpl;", "Lcom/ifriend/registration/presentation/bridges/facebook/FacebookAuthorizationBridge;", "parser", "Lcom/ifriend/registration/presentation/bridges/facebook/FacebookAuthorizationResponseParser;", "(Lcom/ifriend/registration/presentation/bridges/facebook/FacebookAuthorizationResponseParser;)V", "callbackManager", "Lcom/facebook/CallbackManager;", "clearToken", "", "loginManager", "Lcom/facebook/login/LoginManager;", "handleSuccessLogin", "onSuccessLogin", "Lkotlin/Function2;", "Lcom/ifriend/registration/domain/useCase/facebook/FacebookAccountData;", "Lcom/facebook/AccessToken;", "loginInFacebook", "fragment", "Landroidx/fragment/app/Fragment;", "subscribeOnLogin", "onFailure", "Lkotlin/Function0;", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FacebookAuthorizationBridgeImpl implements FacebookAuthorizationBridge {
    @Deprecated
    public static final String FIELDS = "id,first_name,email,gender,birthday";
    private final CallbackManager callbackManager;
    private final FacebookAuthorizationResponseParser parser;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: permissions  reason: collision with root package name */
    private static final List<String> f146permissions = CollectionsKt.listOf((Object[]) new String[]{"public_profile", "email", AuthenticationTokenClaims.JSON_KEY_USER_BIRTHDAY, AuthenticationTokenClaims.JSON_KEY_USER_GENDER});

    @Inject
    public FacebookAuthorizationBridgeImpl(FacebookAuthorizationResponseParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.parser = parser;
        this.callbackManager = CallbackManager.Factory.create();
    }

    /* compiled from: FacebookAuthorizationBridgeImpl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ifriend/registration/presentation/bridges/facebook/FacebookAuthorizationBridgeImpl$Companion;", "", "()V", "FIELDS", "", "permissions", "", "getPermissions", "()Ljava/util/List;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<String> getPermissions() {
            return FacebookAuthorizationBridgeImpl.f146permissions;
        }
    }

    @Override // com.ifriend.registration.presentation.bridges.facebook.FacebookAuthorizationBridge
    public void subscribeOnLogin(final Function2<? super FacebookAccountData, ? super AccessToken, Unit> onSuccessLogin, final Function0<Unit> onFailure) {
        Intrinsics.checkNotNullParameter(onSuccessLogin, "onSuccessLogin");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        LoginManager.Companion.getInstance().registerCallback(this.callbackManager, new FacebookCallback<LoginResult>() { // from class: com.ifriend.registration.presentation.bridges.facebook.FacebookAuthorizationBridgeImpl$subscribeOnLogin$1
            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                onFailure.invoke();
            }

            @Override // com.facebook.FacebookCallback
            public void onError(FacebookException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                onFailure.invoke();
            }

            @Override // com.facebook.FacebookCallback
            public void onSuccess(LoginResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                this.handleSuccessLogin(onSuccessLogin);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSuccessLogin(final Function2<? super FacebookAccountData, ? super AccessToken, Unit> function2) {
        final AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        boolean z = (currentAccessToken == null || currentAccessToken.isExpired()) ? false : true;
        if (z) {
            GraphRequest newMeRequest = GraphRequest.Companion.newMeRequest(currentAccessToken, new GraphRequest.GraphJSONObjectCallback() { // from class: com.ifriend.registration.presentation.bridges.facebook.FacebookAuthorizationBridgeImpl$handleSuccessLogin$request$1
                @Override // com.facebook.GraphRequest.GraphJSONObjectCallback
                public final void onCompleted(JSONObject jSONObject, GraphResponse graphResponse) {
                    FacebookAuthorizationResponseParser facebookAuthorizationResponseParser;
                    facebookAuthorizationResponseParser = FacebookAuthorizationBridgeImpl.this.parser;
                    FacebookAccountData parseLoginJsonResponseObject = facebookAuthorizationResponseParser.parseLoginJsonResponseObject(jSONObject);
                    if (parseLoginJsonResponseObject == null) {
                        return;
                    }
                    function2.invoke(parseLoginJsonResponseObject, currentAccessToken);
                }
            });
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, FIELDS);
            newMeRequest.setParameters(bundle);
            newMeRequest.executeAsync();
        }
        Log.e("isLoggedIn", String.valueOf(z));
    }

    @Override // com.ifriend.registration.presentation.bridges.facebook.FacebookAuthorizationBridge
    public void loginInFacebook(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        LoginManager companion = LoginManager.Companion.getInstance();
        clearToken(companion);
        companion.logInWithReadPermissions(fragment, this.callbackManager, f146permissions);
    }

    private final void clearToken(LoginManager loginManager) {
        loginManager.logOut();
        AccessToken.Companion.expireCurrentAccessToken();
        AccessToken.Companion.setCurrentAccessToken(null);
    }
}
