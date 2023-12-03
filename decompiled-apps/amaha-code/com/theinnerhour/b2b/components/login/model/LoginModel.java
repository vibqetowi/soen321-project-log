package com.theinnerhour.b2b.components.login.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: LoginModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/LoginModel;", "", "userName", "", SessionManager.KEY_PASS, "phone", "otp", "isGoogleLoginRedirect", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "getOtp", "()Ljava/lang/String;", "getPassword", "getPhone", "getUserName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class LoginModel {
    private final boolean isGoogleLoginRedirect;
    private final String otp;
    private final String password;
    private final String phone;
    private final String userName;

    public LoginModel(String str, String str2, String str3, String str4, boolean z10) {
        this.userName = str;
        this.password = str2;
        this.phone = str3;
        this.otp = str4;
        this.isGoogleLoginRedirect = z10;
    }

    public static /* synthetic */ LoginModel copy$default(LoginModel loginModel, String str, String str2, String str3, String str4, boolean z10, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = loginModel.userName;
        }
        if ((i6 & 2) != 0) {
            str2 = loginModel.password;
        }
        String str5 = str2;
        if ((i6 & 4) != 0) {
            str3 = loginModel.phone;
        }
        String str6 = str3;
        if ((i6 & 8) != 0) {
            str4 = loginModel.otp;
        }
        String str7 = str4;
        if ((i6 & 16) != 0) {
            z10 = loginModel.isGoogleLoginRedirect;
        }
        return loginModel.copy(str, str5, str6, str7, z10);
    }

    public final String component1() {
        return this.userName;
    }

    public final String component2() {
        return this.password;
    }

    public final String component3() {
        return this.phone;
    }

    public final String component4() {
        return this.otp;
    }

    public final boolean component5() {
        return this.isGoogleLoginRedirect;
    }

    public final LoginModel copy(String str, String str2, String str3, String str4, boolean z10) {
        return new LoginModel(str, str2, str3, str4, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginModel)) {
            return false;
        }
        LoginModel loginModel = (LoginModel) obj;
        if (i.b(this.userName, loginModel.userName) && i.b(this.password, loginModel.password) && i.b(this.phone, loginModel.phone) && i.b(this.otp, loginModel.otp) && this.isGoogleLoginRedirect == loginModel.isGoogleLoginRedirect) {
            return true;
        }
        return false;
    }

    public final String getOtp() {
        return this.otp;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getUserName() {
        return this.userName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.userName;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.password;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.phone;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.otp;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        int i13 = (i12 + i6) * 31;
        boolean z10 = this.isGoogleLoginRedirect;
        int i14 = z10;
        if (z10 != 0) {
            i14 = 1;
        }
        return i13 + i14;
    }

    public final boolean isGoogleLoginRedirect() {
        return this.isGoogleLoginRedirect;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LoginModel(userName=");
        sb2.append(this.userName);
        sb2.append(", password=");
        sb2.append(this.password);
        sb2.append(", phone=");
        sb2.append(this.phone);
        sb2.append(", otp=");
        sb2.append(this.otp);
        sb2.append(", isGoogleLoginRedirect=");
        return c.t(sb2, this.isGoogleLoginRedirect, ')');
    }
}
