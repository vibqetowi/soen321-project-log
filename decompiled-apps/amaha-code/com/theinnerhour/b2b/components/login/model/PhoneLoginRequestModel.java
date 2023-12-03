package com.theinnerhour.b2b.components.login.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import pl.a;
import v.g;
/* compiled from: PhoneLoginRequestModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/PhoneLoginRequestModel;", "", SessionManager.KEY_MOBILE, "", "otp", "origin", "timezone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMobile", "()Ljava/lang/String;", "getOrigin", "getOtp", "getTimezone", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class PhoneLoginRequestModel {
    private final String mobile;
    private final String origin;
    private final String otp;
    private final String timezone;

    public PhoneLoginRequestModel(String mobile, String otp, String origin, String timezone) {
        i.g(mobile, "mobile");
        i.g(otp, "otp");
        i.g(origin, "origin");
        i.g(timezone, "timezone");
        this.mobile = mobile;
        this.otp = otp;
        this.origin = origin;
        this.timezone = timezone;
    }

    public static /* synthetic */ PhoneLoginRequestModel copy$default(PhoneLoginRequestModel phoneLoginRequestModel, String str, String str2, String str3, String str4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = phoneLoginRequestModel.mobile;
        }
        if ((i6 & 2) != 0) {
            str2 = phoneLoginRequestModel.otp;
        }
        if ((i6 & 4) != 0) {
            str3 = phoneLoginRequestModel.origin;
        }
        if ((i6 & 8) != 0) {
            str4 = phoneLoginRequestModel.timezone;
        }
        return phoneLoginRequestModel.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.mobile;
    }

    public final String component2() {
        return this.otp;
    }

    public final String component3() {
        return this.origin;
    }

    public final String component4() {
        return this.timezone;
    }

    public final PhoneLoginRequestModel copy(String mobile, String otp, String origin, String timezone) {
        i.g(mobile, "mobile");
        i.g(otp, "otp");
        i.g(origin, "origin");
        i.g(timezone, "timezone");
        return new PhoneLoginRequestModel(mobile, otp, origin, timezone);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneLoginRequestModel)) {
            return false;
        }
        PhoneLoginRequestModel phoneLoginRequestModel = (PhoneLoginRequestModel) obj;
        if (i.b(this.mobile, phoneLoginRequestModel.mobile) && i.b(this.otp, phoneLoginRequestModel.otp) && i.b(this.origin, phoneLoginRequestModel.origin) && i.b(this.timezone, phoneLoginRequestModel.timezone)) {
            return true;
        }
        return false;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final String getOtp() {
        return this.otp;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public int hashCode() {
        return this.timezone.hashCode() + a.c(this.origin, a.c(this.otp, this.mobile.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneLoginRequestModel(mobile=");
        sb2.append(this.mobile);
        sb2.append(", otp=");
        sb2.append(this.otp);
        sb2.append(", origin=");
        sb2.append(this.origin);
        sb2.append(", timezone=");
        return g.c(sb2, this.timezone, ')');
    }

    public /* synthetic */ PhoneLoginRequestModel(String str, String str2, String str3, String str4, int i6, d dVar) {
        this(str, str2, (i6 & 4) != 0 ? "app" : str3, str4);
    }
}
