package com.theinnerhour.b2b.components.login.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: SocialSignupModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JM\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/SocialSignupModel;", "", Constants.NOTIFICATION_URL, "", "userEnteredEmail", "idToken", "serverAuthCode", "socialEmail", "type", "Lcom/theinnerhour/b2b/components/login/model/LoginSignupFlow;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/theinnerhour/b2b/components/login/model/LoginSignupFlow;)V", "getIdToken", "()Ljava/lang/String;", "getServerAuthCode", "getSocialEmail", "getType", "()Lcom/theinnerhour/b2b/components/login/model/LoginSignupFlow;", "getUrl", "getUserEnteredEmail", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class SocialSignupModel {
    private final String idToken;
    private final String serverAuthCode;
    private final String socialEmail;
    private final LoginSignupFlow type;
    private final String url;
    private final String userEnteredEmail;

    public SocialSignupModel(String url, String str, String str2, String str3, String str4, LoginSignupFlow type) {
        i.g(url, "url");
        i.g(type, "type");
        this.url = url;
        this.userEnteredEmail = str;
        this.idToken = str2;
        this.serverAuthCode = str3;
        this.socialEmail = str4;
        this.type = type;
    }

    public static /* synthetic */ SocialSignupModel copy$default(SocialSignupModel socialSignupModel, String str, String str2, String str3, String str4, String str5, LoginSignupFlow loginSignupFlow, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = socialSignupModel.url;
        }
        if ((i6 & 2) != 0) {
            str2 = socialSignupModel.userEnteredEmail;
        }
        String str6 = str2;
        if ((i6 & 4) != 0) {
            str3 = socialSignupModel.idToken;
        }
        String str7 = str3;
        if ((i6 & 8) != 0) {
            str4 = socialSignupModel.serverAuthCode;
        }
        String str8 = str4;
        if ((i6 & 16) != 0) {
            str5 = socialSignupModel.socialEmail;
        }
        String str9 = str5;
        if ((i6 & 32) != 0) {
            loginSignupFlow = socialSignupModel.type;
        }
        return socialSignupModel.copy(str, str6, str7, str8, str9, loginSignupFlow);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.userEnteredEmail;
    }

    public final String component3() {
        return this.idToken;
    }

    public final String component4() {
        return this.serverAuthCode;
    }

    public final String component5() {
        return this.socialEmail;
    }

    public final LoginSignupFlow component6() {
        return this.type;
    }

    public final SocialSignupModel copy(String url, String str, String str2, String str3, String str4, LoginSignupFlow type) {
        i.g(url, "url");
        i.g(type, "type");
        return new SocialSignupModel(url, str, str2, str3, str4, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialSignupModel)) {
            return false;
        }
        SocialSignupModel socialSignupModel = (SocialSignupModel) obj;
        if (i.b(this.url, socialSignupModel.url) && i.b(this.userEnteredEmail, socialSignupModel.userEnteredEmail) && i.b(this.idToken, socialSignupModel.idToken) && i.b(this.serverAuthCode, socialSignupModel.serverAuthCode) && i.b(this.socialEmail, socialSignupModel.socialEmail) && this.type == socialSignupModel.type) {
            return true;
        }
        return false;
    }

    public final String getIdToken() {
        return this.idToken;
    }

    public final String getServerAuthCode() {
        return this.serverAuthCode;
    }

    public final String getSocialEmail() {
        return this.socialEmail;
    }

    public final LoginSignupFlow getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUserEnteredEmail() {
        return this.userEnteredEmail;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.url.hashCode() * 31;
        String str = this.userEnteredEmail;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        String str2 = this.idToken;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.serverAuthCode;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.socialEmail;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        return this.type.hashCode() + ((i12 + i6) * 31);
    }

    public String toString() {
        return "SocialSignupModel(url=" + this.url + ", userEnteredEmail=" + this.userEnteredEmail + ", idToken=" + this.idToken + ", serverAuthCode=" + this.serverAuthCode + ", socialEmail=" + this.socialEmail + ", type=" + this.type + ')';
    }
}
