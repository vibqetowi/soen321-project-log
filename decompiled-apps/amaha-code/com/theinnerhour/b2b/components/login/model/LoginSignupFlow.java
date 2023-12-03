package com.theinnerhour.b2b.components.login.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.Metadata;
/* compiled from: HelperClasses.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/LoginSignupFlow;", "", "analyticsString", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsString", "()Ljava/lang/String;", "SIGN_UP_PHONE", "SIGN_IN_PHONE", "SIGN_UP_EMAIL", "SIGN_IN_EMAIL", "SIGN_UP_FACEBOOK", "SIGN_IN_FACEBOOK", "SIGN_UP_GOOGLE", "SIGN_IN_GOOGLE", "SSO", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public enum LoginSignupFlow {
    SIGN_UP_PHONE("phone"),
    SIGN_IN_PHONE("phone"),
    SIGN_UP_EMAIL(SessionManager.KEY_EMAIL),
    SIGN_IN_EMAIL(SessionManager.KEY_EMAIL),
    SIGN_UP_FACEBOOK("facebook"),
    SIGN_IN_FACEBOOK("facebook"),
    SIGN_UP_GOOGLE("google"),
    SIGN_IN_GOOGLE("google"),
    SSO("sso");
    
    private final String analyticsString;

    LoginSignupFlow(String str) {
        this.analyticsString = str;
    }

    public final String getAnalyticsString() {
        return this.analyticsString;
    }
}
