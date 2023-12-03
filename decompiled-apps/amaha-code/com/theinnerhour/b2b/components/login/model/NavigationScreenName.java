package com.theinnerhour.b2b.components.login.model;

import com.appsflyer.R;
import kotlin.Metadata;
/* compiled from: HelperClasses.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/NavigationScreenName;", "", "navActionID", "", "(Ljava/lang/String;II)V", "getNavActionID", "()I", "SIGNUP_TO_SSO", "SIGNUP_TO_FORGOT_PASSWORD", "SIGNUP_TO_LOGIN", "LOGIN_TO_SSO", "LOGIN_TO_FORGOT_PASSWORD", "LOGIN_TO_SIGNUP", "FORGOT_PASSWORD_TO_LOGIN", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public enum NavigationScreenName {
    SIGNUP_TO_SSO(com.theinnerhour.b2b.R.id.signup_to_sso_action),
    SIGNUP_TO_FORGOT_PASSWORD(com.theinnerhour.b2b.R.id.signup_to_sso_action),
    SIGNUP_TO_LOGIN(com.theinnerhour.b2b.R.id.signup_to_login_action),
    LOGIN_TO_SSO(com.theinnerhour.b2b.R.id.login_to_sso_action),
    LOGIN_TO_FORGOT_PASSWORD(com.theinnerhour.b2b.R.id.login_to_forgot_password_action),
    LOGIN_TO_SIGNUP(com.theinnerhour.b2b.R.id.login_to_signup_action),
    FORGOT_PASSWORD_TO_LOGIN(com.theinnerhour.b2b.R.id.forgot_password_to_login);
    
    private final int navActionID;

    NavigationScreenName(int i6) {
        this.navActionID = i6;
    }

    public final int getNavActionID() {
        return this.navActionID;
    }
}
