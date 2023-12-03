package com.theinnerhour.b2b.components.login.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import pl.a;
import v.g;
/* compiled from: SignupModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/SignupModel;", "", "userName", "", SessionManager.KEY_PASS, SessionManager.KEY_NAME, "phone", "otp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getOtp", "getPassword", "getPhone", "getUserName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class SignupModel {
    private final String name;
    private final String otp;
    private final String password;
    private final String phone;
    private final String userName;

    public SignupModel(String str, String str2, String name, String str3, String str4) {
        i.g(name, "name");
        this.userName = str;
        this.password = str2;
        this.name = name;
        this.phone = str3;
        this.otp = str4;
    }

    public static /* synthetic */ SignupModel copy$default(SignupModel signupModel, String str, String str2, String str3, String str4, String str5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = signupModel.userName;
        }
        if ((i6 & 2) != 0) {
            str2 = signupModel.password;
        }
        String str6 = str2;
        if ((i6 & 4) != 0) {
            str3 = signupModel.name;
        }
        String str7 = str3;
        if ((i6 & 8) != 0) {
            str4 = signupModel.phone;
        }
        String str8 = str4;
        if ((i6 & 16) != 0) {
            str5 = signupModel.otp;
        }
        return signupModel.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.userName;
    }

    public final String component2() {
        return this.password;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.phone;
    }

    public final String component5() {
        return this.otp;
    }

    public final SignupModel copy(String str, String str2, String name, String str3, String str4) {
        i.g(name, "name");
        return new SignupModel(str, str2, name, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignupModel)) {
            return false;
        }
        SignupModel signupModel = (SignupModel) obj;
        if (i.b(this.userName, signupModel.userName) && i.b(this.password, signupModel.password) && i.b(this.name, signupModel.name) && i.b(this.phone, signupModel.phone) && i.b(this.otp, signupModel.otp)) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.name;
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
        int c10 = a.c(this.name, (i10 + hashCode2) * 31, 31);
        String str3 = this.phone;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (c10 + hashCode3) * 31;
        String str4 = this.otp;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        return i11 + i6;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SignupModel(userName=");
        sb2.append(this.userName);
        sb2.append(", password=");
        sb2.append(this.password);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", phone=");
        sb2.append(this.phone);
        sb2.append(", otp=");
        return g.c(sb2, this.otp, ')');
    }
}
