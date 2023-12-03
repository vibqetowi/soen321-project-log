package com.theinnerhour.b2b.components.login.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: HelperClasses.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents;", "", "()V", "EmailMainCtaClick", "EmailSecondaryCtaClick", "FacebookCtaClick", "ForgotPassword", "GoogleCtaClick", "PhoneMainCtaClick", "PhoneSecondaryCtaClick", "ResendOTP", "SSOCtaClick", "SwitchFlow", "VerifyOTP", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$EmailMainCtaClick;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$EmailSecondaryCtaClick;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$FacebookCtaClick;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$ForgotPassword;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$GoogleCtaClick;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$PhoneMainCtaClick;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$PhoneSecondaryCtaClick;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$ResendOTP;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$SSOCtaClick;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$SwitchFlow;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$VerifyOTP;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public abstract class ReworkSignupEvents {

    /* compiled from: HelperClasses.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$EmailMainCtaClick;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents;", SessionManager.KEY_EMAIL, "", SessionManager.KEY_PASS, SessionManager.KEY_NAME, "isGoogleOAuthLogin", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getEmail", "()Ljava/lang/String;", "()Z", "getName", "getPassword", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class EmailMainCtaClick extends ReworkSignupEvents {
        private final String email;
        private final boolean isGoogleOAuthLogin;
        private final String name;
        private final String password;

        public EmailMainCtaClick(String str, String str2, String str3, boolean z10) {
            super(null);
            this.email = str;
            this.password = str2;
            this.name = str3;
            this.isGoogleOAuthLogin = z10;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPassword() {
            return this.password;
        }

        public final boolean isGoogleOAuthLogin() {
            return this.isGoogleOAuthLogin;
        }

        public /* synthetic */ EmailMainCtaClick(String str, String str2, String str3, boolean z10, int i6, d dVar) {
            this(str, str2, str3, (i6 & 8) != 0 ? false : z10);
        }
    }

    /* compiled from: HelperClasses.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$EmailSecondaryCtaClick;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents;", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class EmailSecondaryCtaClick extends ReworkSignupEvents {
        public static final EmailSecondaryCtaClick INSTANCE = new EmailSecondaryCtaClick();

        private EmailSecondaryCtaClick() {
            super(null);
        }
    }

    /* compiled from: HelperClasses.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$FacebookCtaClick;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents;", "loginSignupFlow", "Lcom/theinnerhour/b2b/components/login/model/LoginSignupFlow;", "(Lcom/theinnerhour/b2b/components/login/model/LoginSignupFlow;)V", "getLoginSignupFlow", "()Lcom/theinnerhour/b2b/components/login/model/LoginSignupFlow;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class FacebookCtaClick extends ReworkSignupEvents {
        private final LoginSignupFlow loginSignupFlow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FacebookCtaClick(LoginSignupFlow loginSignupFlow) {
            super(null);
            i.g(loginSignupFlow, "loginSignupFlow");
            this.loginSignupFlow = loginSignupFlow;
        }

        public final LoginSignupFlow getLoginSignupFlow() {
            return this.loginSignupFlow;
        }
    }

    /* compiled from: HelperClasses.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$ForgotPassword;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents;", SessionManager.KEY_EMAIL, "", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class ForgotPassword extends ReworkSignupEvents {
        private final String email;

        public ForgotPassword(String str) {
            super(null);
            this.email = str;
        }

        public final String getEmail() {
            return this.email;
        }
    }

    /* compiled from: HelperClasses.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$GoogleCtaClick;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents;", "loginSignupFlow", "Lcom/theinnerhour/b2b/components/login/model/LoginSignupFlow;", "(Lcom/theinnerhour/b2b/components/login/model/LoginSignupFlow;)V", "getLoginSignupFlow", "()Lcom/theinnerhour/b2b/components/login/model/LoginSignupFlow;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class GoogleCtaClick extends ReworkSignupEvents {
        private final LoginSignupFlow loginSignupFlow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoogleCtaClick(LoginSignupFlow loginSignupFlow) {
            super(null);
            i.g(loginSignupFlow, "loginSignupFlow");
            this.loginSignupFlow = loginSignupFlow;
        }

        public final LoginSignupFlow getLoginSignupFlow() {
            return this.loginSignupFlow;
        }
    }

    /* compiled from: HelperClasses.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$PhoneMainCtaClick;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents;", "phone", "", SessionManager.KEY_NAME, "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPhone", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class PhoneMainCtaClick extends ReworkSignupEvents {
        private final String name;
        private final String phone;

        public PhoneMainCtaClick(String str, String str2) {
            super(null);
            this.phone = str;
            this.name = str2;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }
    }

    /* compiled from: HelperClasses.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$PhoneSecondaryCtaClick;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents;", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class PhoneSecondaryCtaClick extends ReworkSignupEvents {
        public static final PhoneSecondaryCtaClick INSTANCE = new PhoneSecondaryCtaClick();

        private PhoneSecondaryCtaClick() {
            super(null);
        }
    }

    /* compiled from: HelperClasses.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$ResendOTP;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents;", "phone", "", SessionManager.KEY_NAME, "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPhone", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class ResendOTP extends ReworkSignupEvents {
        private final String name;
        private final String phone;

        public ResendOTP(String str, String str2) {
            super(null);
            this.phone = str;
            this.name = str2;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }
    }

    /* compiled from: HelperClasses.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$SSOCtaClick;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents;", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class SSOCtaClick extends ReworkSignupEvents {
        public static final SSOCtaClick INSTANCE = new SSOCtaClick();

        private SSOCtaClick() {
            super(null);
        }
    }

    /* compiled from: HelperClasses.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$SwitchFlow;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents;", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class SwitchFlow extends ReworkSignupEvents {
        public static final SwitchFlow INSTANCE = new SwitchFlow();

        private SwitchFlow() {
            super(null);
        }
    }

    /* compiled from: HelperClasses.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents$VerifyOTP;", "Lcom/theinnerhour/b2b/components/login/model/ReworkSignupEvents;", "phone", "", SessionManager.KEY_NAME, "enteredOTP", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEnteredOTP", "()Ljava/lang/String;", "getName", "getPhone", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class VerifyOTP extends ReworkSignupEvents {
        private final String enteredOTP;
        private final String name;
        private final String phone;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerifyOTP(String str, String str2, String enteredOTP) {
            super(null);
            i.g(enteredOTP, "enteredOTP");
            this.phone = str;
            this.name = str2;
            this.enteredOTP = enteredOTP;
        }

        public final String getEnteredOTP() {
            return this.enteredOTP;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }
    }

    private ReworkSignupEvents() {
    }

    public /* synthetic */ ReworkSignupEvents(d dVar) {
        this();
    }
}
