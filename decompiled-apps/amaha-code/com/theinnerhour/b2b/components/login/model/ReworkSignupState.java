package com.theinnerhour.b2b.components.login.model;

import com.theinnerhour.b2b.utils.Constants;
import hs.f;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: HelperClasses.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\b\b\u0002\u0010\u001c\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000f\u0012\u001a\b\u0002\u0010\u001e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b6\u00107J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\nHÆ\u0003J\t\u0010\u000e\u001a\u00020\nHÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000fHÆ\u0003J\u001b\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010\u0012\u001a\u00020\nHÆ\u0003Jµ\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\n2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000f2\u001a\b\u0002\u0010\u001e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\nHÆ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001J\t\u0010#\u001a\u00020\"HÖ\u0001J\u0013\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b,\u0010+R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b.\u0010+R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b/\u0010+R\u0017\u0010\u0019\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\b\u0019\u00101R\u0017\u0010\u001a\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\b\u001a\u00101R\u0017\u0010\u001b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001b\u00100\u001a\u0004\b\u001b\u00101R\u0017\u0010\u001c\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u00100\u001a\u0004\b\u001c\u00101R%\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000f8\u0006¢\u0006\f\n\u0004\b\u001d\u00102\u001a\u0004\b3\u00104R)\u0010\u001e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\b5\u00104R\u0017\u0010\u001f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u00100\u001a\u0004\b\u001f\u00101¨\u00068"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/ReworkSignupState;", "", "Lcom/theinnerhour/b2b/components/login/model/ExpandedState;", "component1", "", "component2", "component3", "component4", "component5", "component6", "", "component7", "component8", "component9", "component10", "Lhs/f;", "component11", "component12", "component13", "expandedState", "phoneNameInputError", "emailNameInputError", "emailInputError", "passwordInputError", "phoneInputError", "isEnforcePasswordRules", "isPasswordCaseRequirementFulfilled", "isPasswordCharacterRequirementFulfilled", "isShowSocialOptions", "brandingInfo", "signupTextOverride", "isDisableLogin", "copy", "toString", "", "hashCode", "other", "equals", "Lcom/theinnerhour/b2b/components/login/model/ExpandedState;", "getExpandedState", "()Lcom/theinnerhour/b2b/components/login/model/ExpandedState;", "Ljava/lang/String;", "getPhoneNameInputError", "()Ljava/lang/String;", "getEmailNameInputError", "getEmailInputError", "getPasswordInputError", "getPhoneInputError", "Z", "()Z", "Lhs/f;", "getBrandingInfo", "()Lhs/f;", "getSignupTextOverride", "<init>", "(Lcom/theinnerhour/b2b/components/login/model/ExpandedState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLhs/f;Lhs/f;Z)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReworkSignupState {
    private final f<Boolean, String> brandingInfo;
    private final String emailInputError;
    private final String emailNameInputError;
    private final ExpandedState expandedState;
    private final boolean isDisableLogin;
    private final boolean isEnforcePasswordRules;
    private final boolean isPasswordCaseRequirementFulfilled;
    private final boolean isPasswordCharacterRequirementFulfilled;
    private final boolean isShowSocialOptions;
    private final String passwordInputError;
    private final String phoneInputError;
    private final String phoneNameInputError;
    private final f<String, String> signupTextOverride;

    public ReworkSignupState() {
        this(null, null, null, null, null, null, false, false, false, false, null, null, false, 8191, null);
    }

    public final ExpandedState component1() {
        return this.expandedState;
    }

    public final boolean component10() {
        return this.isShowSocialOptions;
    }

    public final f<Boolean, String> component11() {
        return this.brandingInfo;
    }

    public final f<String, String> component12() {
        return this.signupTextOverride;
    }

    public final boolean component13() {
        return this.isDisableLogin;
    }

    public final String component2() {
        return this.phoneNameInputError;
    }

    public final String component3() {
        return this.emailNameInputError;
    }

    public final String component4() {
        return this.emailInputError;
    }

    public final String component5() {
        return this.passwordInputError;
    }

    public final String component6() {
        return this.phoneInputError;
    }

    public final boolean component7() {
        return this.isEnforcePasswordRules;
    }

    public final boolean component8() {
        return this.isPasswordCaseRequirementFulfilled;
    }

    public final boolean component9() {
        return this.isPasswordCharacterRequirementFulfilled;
    }

    public final ReworkSignupState copy(ExpandedState expandedState, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, boolean z13, f<Boolean, String> brandingInfo, f<String, String> fVar, boolean z14) {
        i.g(expandedState, "expandedState");
        i.g(brandingInfo, "brandingInfo");
        return new ReworkSignupState(expandedState, str, str2, str3, str4, str5, z10, z11, z12, z13, brandingInfo, fVar, z14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReworkSignupState)) {
            return false;
        }
        ReworkSignupState reworkSignupState = (ReworkSignupState) obj;
        if (this.expandedState == reworkSignupState.expandedState && i.b(this.phoneNameInputError, reworkSignupState.phoneNameInputError) && i.b(this.emailNameInputError, reworkSignupState.emailNameInputError) && i.b(this.emailInputError, reworkSignupState.emailInputError) && i.b(this.passwordInputError, reworkSignupState.passwordInputError) && i.b(this.phoneInputError, reworkSignupState.phoneInputError) && this.isEnforcePasswordRules == reworkSignupState.isEnforcePasswordRules && this.isPasswordCaseRequirementFulfilled == reworkSignupState.isPasswordCaseRequirementFulfilled && this.isPasswordCharacterRequirementFulfilled == reworkSignupState.isPasswordCharacterRequirementFulfilled && this.isShowSocialOptions == reworkSignupState.isShowSocialOptions && i.b(this.brandingInfo, reworkSignupState.brandingInfo) && i.b(this.signupTextOverride, reworkSignupState.signupTextOverride) && this.isDisableLogin == reworkSignupState.isDisableLogin) {
            return true;
        }
        return false;
    }

    public final f<Boolean, String> getBrandingInfo() {
        return this.brandingInfo;
    }

    public final String getEmailInputError() {
        return this.emailInputError;
    }

    public final String getEmailNameInputError() {
        return this.emailNameInputError;
    }

    public final ExpandedState getExpandedState() {
        return this.expandedState;
    }

    public final String getPasswordInputError() {
        return this.passwordInputError;
    }

    public final String getPhoneInputError() {
        return this.phoneInputError;
    }

    public final String getPhoneNameInputError() {
        return this.phoneNameInputError;
    }

    public final f<String, String> getSignupTextOverride() {
        return this.signupTextOverride;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.expandedState.hashCode() * 31;
        String str = this.phoneNameInputError;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode6 + hashCode) * 31;
        String str2 = this.emailNameInputError;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.emailInputError;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.passwordInputError;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str5 = this.phoneInputError;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        boolean z10 = this.isEnforcePasswordRules;
        int i15 = 1;
        int i16 = z10;
        if (z10 != 0) {
            i16 = 1;
        }
        int i17 = (i14 + i16) * 31;
        boolean z11 = this.isPasswordCaseRequirementFulfilled;
        int i18 = z11;
        if (z11 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        boolean z12 = this.isPasswordCharacterRequirementFulfilled;
        int i20 = z12;
        if (z12 != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        boolean z13 = this.isShowSocialOptions;
        int i22 = z13;
        if (z13 != 0) {
            i22 = 1;
        }
        int hashCode7 = (this.brandingInfo.hashCode() + ((i21 + i22) * 31)) * 31;
        f<String, String> fVar = this.signupTextOverride;
        if (fVar != null) {
            i6 = fVar.hashCode();
        }
        int i23 = (hashCode7 + i6) * 31;
        boolean z14 = this.isDisableLogin;
        if (!z14) {
            i15 = z14 ? 1 : 0;
        }
        return i23 + i15;
    }

    public final boolean isDisableLogin() {
        return this.isDisableLogin;
    }

    public final boolean isEnforcePasswordRules() {
        return this.isEnforcePasswordRules;
    }

    public final boolean isPasswordCaseRequirementFulfilled() {
        return this.isPasswordCaseRequirementFulfilled;
    }

    public final boolean isPasswordCharacterRequirementFulfilled() {
        return this.isPasswordCharacterRequirementFulfilled;
    }

    public final boolean isShowSocialOptions() {
        return this.isShowSocialOptions;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ReworkSignupState(expandedState=");
        sb2.append(this.expandedState);
        sb2.append(", phoneNameInputError=");
        sb2.append(this.phoneNameInputError);
        sb2.append(", emailNameInputError=");
        sb2.append(this.emailNameInputError);
        sb2.append(", emailInputError=");
        sb2.append(this.emailInputError);
        sb2.append(", passwordInputError=");
        sb2.append(this.passwordInputError);
        sb2.append(", phoneInputError=");
        sb2.append(this.phoneInputError);
        sb2.append(", isEnforcePasswordRules=");
        sb2.append(this.isEnforcePasswordRules);
        sb2.append(", isPasswordCaseRequirementFulfilled=");
        sb2.append(this.isPasswordCaseRequirementFulfilled);
        sb2.append(", isPasswordCharacterRequirementFulfilled=");
        sb2.append(this.isPasswordCharacterRequirementFulfilled);
        sb2.append(", isShowSocialOptions=");
        sb2.append(this.isShowSocialOptions);
        sb2.append(", brandingInfo=");
        sb2.append(this.brandingInfo);
        sb2.append(", signupTextOverride=");
        sb2.append(this.signupTextOverride);
        sb2.append(", isDisableLogin=");
        return c.t(sb2, this.isDisableLogin, ')');
    }

    public ReworkSignupState(ExpandedState expandedState, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, boolean z13, f<Boolean, String> brandingInfo, f<String, String> fVar, boolean z14) {
        i.g(expandedState, "expandedState");
        i.g(brandingInfo, "brandingInfo");
        this.expandedState = expandedState;
        this.phoneNameInputError = str;
        this.emailNameInputError = str2;
        this.emailInputError = str3;
        this.passwordInputError = str4;
        this.phoneInputError = str5;
        this.isEnforcePasswordRules = z10;
        this.isPasswordCaseRequirementFulfilled = z11;
        this.isPasswordCharacterRequirementFulfilled = z12;
        this.isShowSocialOptions = z13;
        this.brandingInfo = brandingInfo;
        this.signupTextOverride = fVar;
        this.isDisableLogin = z14;
    }

    public /* synthetic */ ReworkSignupState(ExpandedState expandedState, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, boolean z13, f fVar, f fVar2, boolean z14, int i6, d dVar) {
        this((i6 & 1) != 0 ? ExpandedState.ALL_COLLAPSED : expandedState, (i6 & 2) != 0 ? null : str, (i6 & 4) != 0 ? null : str2, (i6 & 8) != 0 ? null : str3, (i6 & 16) != 0 ? null : str4, (i6 & 32) != 0 ? null : str5, (i6 & 64) != 0 ? false : z10, (i6 & 128) != 0 ? false : z11, (i6 & 256) != 0 ? false : z12, (i6 & 512) != 0 ? true : z13, (i6 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? new f(Boolean.FALSE, null) : fVar, (i6 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) == 0 ? fVar2 : null, (i6 & 4096) == 0 ? z14 : false);
    }
}
