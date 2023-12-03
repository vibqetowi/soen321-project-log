package com.theinnerhour.b2b.components.profile.experiment.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import v.g;
/* compiled from: EditProfileModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006%"}, d2 = {"Lcom/theinnerhour/b2b/components/profile/experiment/model/EditProfileModel;", "", SessionManager.KEY_FIRSTNAME, "", SessionManager.KEY_LASTNAME, SessionManager.KEY_EMAIL, SessionManager.KEY_MOBILE, "countryCode", SessionManager.KEY_USERTYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "getEmail", "setEmail", "getFirstName", "setFirstName", "getLastName", "setLastName", "getMobile", "setMobile", "getUserType", "setUserType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class EditProfileModel {
    private String countryCode;
    private String email;
    private String firstName;
    private String lastName;
    private String mobile;
    private String userType;

    public EditProfileModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ EditProfileModel copy$default(EditProfileModel editProfileModel, String str, String str2, String str3, String str4, String str5, String str6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = editProfileModel.firstName;
        }
        if ((i6 & 2) != 0) {
            str2 = editProfileModel.lastName;
        }
        String str7 = str2;
        if ((i6 & 4) != 0) {
            str3 = editProfileModel.email;
        }
        String str8 = str3;
        if ((i6 & 8) != 0) {
            str4 = editProfileModel.mobile;
        }
        String str9 = str4;
        if ((i6 & 16) != 0) {
            str5 = editProfileModel.countryCode;
        }
        String str10 = str5;
        if ((i6 & 32) != 0) {
            str6 = editProfileModel.userType;
        }
        return editProfileModel.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component2() {
        return this.lastName;
    }

    public final String component3() {
        return this.email;
    }

    public final String component4() {
        return this.mobile;
    }

    public final String component5() {
        return this.countryCode;
    }

    public final String component6() {
        return this.userType;
    }

    public final EditProfileModel copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new EditProfileModel(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditProfileModel)) {
            return false;
        }
        EditProfileModel editProfileModel = (EditProfileModel) obj;
        if (i.b(this.firstName, editProfileModel.firstName) && i.b(this.lastName, editProfileModel.lastName) && i.b(this.email, editProfileModel.email) && i.b(this.mobile, editProfileModel.mobile) && i.b(this.countryCode, editProfileModel.countryCode) && i.b(this.userType, editProfileModel.userType)) {
            return true;
        }
        return false;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getUserType() {
        return this.userType;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.firstName;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.lastName;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.email;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.mobile;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str5 = this.countryCode;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str6 = this.userType;
        if (str6 != null) {
            i6 = str6.hashCode();
        }
        return i14 + i6;
    }

    public final void setCountryCode(String str) {
        this.countryCode = str;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public final void setMobile(String str) {
        this.mobile = str;
    }

    public final void setUserType(String str) {
        this.userType = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EditProfileModel(firstName=");
        sb2.append(this.firstName);
        sb2.append(", lastName=");
        sb2.append(this.lastName);
        sb2.append(", email=");
        sb2.append(this.email);
        sb2.append(", mobile=");
        sb2.append(this.mobile);
        sb2.append(", countryCode=");
        sb2.append(this.countryCode);
        sb2.append(", userType=");
        return g.c(sb2, this.userType, ')');
    }

    public EditProfileModel(String str, String str2, String str3, String str4, String str5, String str6) {
        this.firstName = str;
        this.lastName = str2;
        this.email = str3;
        this.mobile = str4;
        this.countryCode = str5;
        this.userType = str6;
    }

    public /* synthetic */ EditProfileModel(String str, String str2, String str3, String str4, String str5, String str6, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : str2, (i6 & 4) != 0 ? null : str3, (i6 & 8) != 0 ? null : str4, (i6 & 16) != 0 ? null : str5, (i6 & 32) != 0 ? null : str6);
    }
}
