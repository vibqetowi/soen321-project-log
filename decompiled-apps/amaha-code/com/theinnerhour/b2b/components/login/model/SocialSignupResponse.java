package com.theinnerhour.b2b.components.login.model;

import android.os.Bundle;
import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import org.json.JSONObject;
/* compiled from: SocialSignupResponse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013JH\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/SocialSignupResponse;", "", "success", "", "response", "Lorg/json/JSONObject;", "error", "", "loginUser", "Landroid/os/Bundle;", "showEmailDialog", "(ZLorg/json/JSONObject;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Boolean;)V", "getError", "()Ljava/lang/String;", "getLoginUser", "()Landroid/os/Bundle;", "getResponse", "()Lorg/json/JSONObject;", "getShowEmailDialog", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(ZLorg/json/JSONObject;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Boolean;)Lcom/theinnerhour/b2b/components/login/model/SocialSignupResponse;", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class SocialSignupResponse {
    private final String error;
    private final Bundle loginUser;
    private final JSONObject response;
    private final Boolean showEmailDialog;
    private final boolean success;

    public SocialSignupResponse(boolean z10, JSONObject jSONObject, String str, Bundle bundle, Boolean bool) {
        this.success = z10;
        this.response = jSONObject;
        this.error = str;
        this.loginUser = bundle;
        this.showEmailDialog = bool;
    }

    public static /* synthetic */ SocialSignupResponse copy$default(SocialSignupResponse socialSignupResponse, boolean z10, JSONObject jSONObject, String str, Bundle bundle, Boolean bool, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z10 = socialSignupResponse.success;
        }
        if ((i6 & 2) != 0) {
            jSONObject = socialSignupResponse.response;
        }
        JSONObject jSONObject2 = jSONObject;
        if ((i6 & 4) != 0) {
            str = socialSignupResponse.error;
        }
        String str2 = str;
        if ((i6 & 8) != 0) {
            bundle = socialSignupResponse.loginUser;
        }
        Bundle bundle2 = bundle;
        if ((i6 & 16) != 0) {
            bool = socialSignupResponse.showEmailDialog;
        }
        return socialSignupResponse.copy(z10, jSONObject2, str2, bundle2, bool);
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

    public final Bundle component4() {
        return this.loginUser;
    }

    public final Boolean component5() {
        return this.showEmailDialog;
    }

    public final SocialSignupResponse copy(boolean z10, JSONObject jSONObject, String str, Bundle bundle, Boolean bool) {
        return new SocialSignupResponse(z10, jSONObject, str, bundle, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialSignupResponse)) {
            return false;
        }
        SocialSignupResponse socialSignupResponse = (SocialSignupResponse) obj;
        if (this.success == socialSignupResponse.success && i.b(this.response, socialSignupResponse.response) && i.b(this.error, socialSignupResponse.error) && i.b(this.loginUser, socialSignupResponse.loginUser) && i.b(this.showEmailDialog, socialSignupResponse.showEmailDialog)) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final Bundle getLoginUser() {
        return this.loginUser;
    }

    public final JSONObject getResponse() {
        return this.response;
    }

    public final Boolean getShowEmailDialog() {
        return this.showEmailDialog;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
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
        Bundle bundle = this.loginUser;
        if (bundle == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bundle.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Boolean bool = this.showEmailDialog;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return i13 + i10;
    }

    public String toString() {
        return "SocialSignupResponse(success=" + this.success + ", response=" + this.response + ", error=" + this.error + ", loginUser=" + this.loginUser + ", showEmailDialog=" + this.showEmailDialog + ')';
    }

    public /* synthetic */ SocialSignupResponse(boolean z10, JSONObject jSONObject, String str, Bundle bundle, Boolean bool, int i6, d dVar) {
        this(z10, jSONObject, (i6 & 4) != 0 ? null : str, (i6 & 8) != 0 ? null : bundle, (i6 & 16) != 0 ? null : bool);
    }
}
