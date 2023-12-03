package com.theinnerhour.b2b.components.login.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import org.json.JSONObject;
import v.g;
/* compiled from: SignupResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003JT\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/SignupResponse;", "", "success", "", "response", "Lorg/json/JSONObject;", "error", "", "loginUser", "otpVerified", "otpError", "(ZLorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getLoginUser", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOtpError", "getOtpVerified", "getResponse", "()Lorg/json/JSONObject;", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZLorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/theinnerhour/b2b/components/login/model/SignupResponse;", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class SignupResponse {
    private final String error;
    private final Boolean loginUser;
    private final String otpError;
    private final Boolean otpVerified;
    private final JSONObject response;
    private final boolean success;

    public SignupResponse(boolean z10, JSONObject jSONObject, String str, Boolean bool, Boolean bool2, String str2) {
        this.success = z10;
        this.response = jSONObject;
        this.error = str;
        this.loginUser = bool;
        this.otpVerified = bool2;
        this.otpError = str2;
    }

    public static /* synthetic */ SignupResponse copy$default(SignupResponse signupResponse, boolean z10, JSONObject jSONObject, String str, Boolean bool, Boolean bool2, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z10 = signupResponse.success;
        }
        if ((i6 & 2) != 0) {
            jSONObject = signupResponse.response;
        }
        JSONObject jSONObject2 = jSONObject;
        if ((i6 & 4) != 0) {
            str = signupResponse.error;
        }
        String str3 = str;
        if ((i6 & 8) != 0) {
            bool = signupResponse.loginUser;
        }
        Boolean bool3 = bool;
        if ((i6 & 16) != 0) {
            bool2 = signupResponse.otpVerified;
        }
        Boolean bool4 = bool2;
        if ((i6 & 32) != 0) {
            str2 = signupResponse.otpError;
        }
        return signupResponse.copy(z10, jSONObject2, str3, bool3, bool4, str2);
    }

    public final boolean component1() {
        return this.success;
    }

    public final JSONObject component2() {
        return this.response;
    }

    public final String component3() {
        return this.error;
    }

    public final Boolean component4() {
        return this.loginUser;
    }

    public final Boolean component5() {
        return this.otpVerified;
    }

    public final String component6() {
        return this.otpError;
    }

    public final SignupResponse copy(boolean z10, JSONObject jSONObject, String str, Boolean bool, Boolean bool2, String str2) {
        return new SignupResponse(z10, jSONObject, str, bool, bool2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignupResponse)) {
            return false;
        }
        SignupResponse signupResponse = (SignupResponse) obj;
        if (this.success == signupResponse.success && i.b(this.response, signupResponse.response) && i.b(this.error, signupResponse.error) && i.b(this.loginUser, signupResponse.loginUser) && i.b(this.otpVerified, signupResponse.otpVerified) && i.b(this.otpError, signupResponse.otpError)) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final Boolean getLoginUser() {
        return this.loginUser;
    }

    public final String getOtpError() {
        return this.otpError;
    }

    public final Boolean getOtpVerified() {
        return this.otpVerified;
    }

    public final JSONObject getResponse() {
        return this.response;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        boolean z10 = this.success;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i6 = r02 * 31;
        JSONObject jSONObject = this.response;
        int i10 = 0;
        if (jSONObject == null) {
            hashCode = 0;
        } else {
            hashCode = jSONObject.hashCode();
        }
        int i11 = (i6 + hashCode) * 31;
        String str = this.error;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Boolean bool = this.loginUser;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Boolean bool2 = this.otpVerified;
        if (bool2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str2 = this.otpError;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i14 + i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SignupResponse(success=");
        sb2.append(this.success);
        sb2.append(", response=");
        sb2.append(this.response);
        sb2.append(", error=");
        sb2.append(this.error);
        sb2.append(", loginUser=");
        sb2.append(this.loginUser);
        sb2.append(", otpVerified=");
        sb2.append(this.otpVerified);
        sb2.append(", otpError=");
        return g.c(sb2, this.otpError, ')');
    }

    public /* synthetic */ SignupResponse(boolean z10, JSONObject jSONObject, String str, Boolean bool, Boolean bool2, String str2, int i6, d dVar) {
        this(z10, jSONObject, (i6 & 4) != 0 ? null : str, (i6 & 8) != 0 ? null : bool, (i6 & 16) != 0 ? null : bool2, (i6 & 32) != 0 ? null : str2);
    }
}
