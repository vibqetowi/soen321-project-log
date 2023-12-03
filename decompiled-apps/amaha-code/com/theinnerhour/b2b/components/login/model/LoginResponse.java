package com.theinnerhour.b2b.components.login.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import v.g;
/* compiled from: LoginResponse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/LoginResponse;", "", "response", "Lcom/theinnerhour/b2b/components/login/model/EmailLoginResponseModel;", "success", "", "error", "Lcom/theinnerhour/b2b/components/login/model/LoginFailure;", "errorString", "", "(Lcom/theinnerhour/b2b/components/login/model/EmailLoginResponseModel;ZLcom/theinnerhour/b2b/components/login/model/LoginFailure;Ljava/lang/String;)V", "getError", "()Lcom/theinnerhour/b2b/components/login/model/LoginFailure;", "getErrorString", "()Ljava/lang/String;", "getResponse", "()Lcom/theinnerhour/b2b/components/login/model/EmailLoginResponseModel;", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class LoginResponse {
    private final LoginFailure error;
    private final String errorString;
    private final EmailLoginResponseModel response;
    private final boolean success;

    public LoginResponse(EmailLoginResponseModel emailLoginResponseModel, boolean z10, LoginFailure loginFailure, String str) {
        this.response = emailLoginResponseModel;
        this.success = z10;
        this.error = loginFailure;
        this.errorString = str;
    }

    public static /* synthetic */ LoginResponse copy$default(LoginResponse loginResponse, EmailLoginResponseModel emailLoginResponseModel, boolean z10, LoginFailure loginFailure, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            emailLoginResponseModel = loginResponse.response;
        }
        if ((i6 & 2) != 0) {
            z10 = loginResponse.success;
        }
        if ((i6 & 4) != 0) {
            loginFailure = loginResponse.error;
        }
        if ((i6 & 8) != 0) {
            str = loginResponse.errorString;
        }
        return loginResponse.copy(emailLoginResponseModel, z10, loginFailure, str);
    }

    public final EmailLoginResponseModel component1() {
        return this.response;
    }

    public final boolean component2() {
        return this.success;
    }

    public final LoginFailure component3() {
        return this.error;
    }

    public final String component4() {
        return this.errorString;
    }

    public final LoginResponse copy(EmailLoginResponseModel emailLoginResponseModel, boolean z10, LoginFailure loginFailure, String str) {
        return new LoginResponse(emailLoginResponseModel, z10, loginFailure, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginResponse)) {
            return false;
        }
        LoginResponse loginResponse = (LoginResponse) obj;
        if (i.b(this.response, loginResponse.response) && this.success == loginResponse.success && this.error == loginResponse.error && i.b(this.errorString, loginResponse.errorString)) {
            return true;
        }
        return false;
    }

    public final LoginFailure getError() {
        return this.error;
    }

    public final String getErrorString() {
        return this.errorString;
    }

    public final EmailLoginResponseModel getResponse() {
        return this.response;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        EmailLoginResponseModel emailLoginResponseModel = this.response;
        int i6 = 0;
        if (emailLoginResponseModel == null) {
            hashCode = 0;
        } else {
            hashCode = emailLoginResponseModel.hashCode();
        }
        int i10 = hashCode * 31;
        boolean z10 = this.success;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        LoginFailure loginFailure = this.error;
        if (loginFailure == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = loginFailure.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str = this.errorString;
        if (str != null) {
            i6 = str.hashCode();
        }
        return i13 + i6;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LoginResponse(response=");
        sb2.append(this.response);
        sb2.append(", success=");
        sb2.append(this.success);
        sb2.append(", error=");
        sb2.append(this.error);
        sb2.append(", errorString=");
        return g.c(sb2, this.errorString, ')');
    }

    public /* synthetic */ LoginResponse(EmailLoginResponseModel emailLoginResponseModel, boolean z10, LoginFailure loginFailure, String str, int i6, d dVar) {
        this(emailLoginResponseModel, z10, loginFailure, (i6 & 8) != 0 ? null : str);
    }
}
