package com.theinnerhour.b2b.components.login.model;

import hs.f;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: HelperClasses.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n\u0012\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u0017\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nHÆ\u0003J\u001b\u0010\f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\r\u001a\u00020\bHÆ\u0003J\u007f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\b2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n2\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0015\u001a\u00020\bHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b\u0012\u0010%R%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b'\u0010(R)\u0010\u0014\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b\u0015\u0010%¨\u0006,"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/ReworkLoginState;", "", "Lcom/theinnerhour/b2b/components/login/model/ExpandedState;", "component1", "", "component2", "component3", "component4", "", "component5", "Lhs/f;", "component6", "component7", "component8", "expandedState", "phoneInputError", "emailInputError", "passwordInputError", "isShowSocialOptions", "brandingInfo", "loginTextOverride", "isDisableSignup", "copy", "toString", "", "hashCode", "other", "equals", "Lcom/theinnerhour/b2b/components/login/model/ExpandedState;", "getExpandedState", "()Lcom/theinnerhour/b2b/components/login/model/ExpandedState;", "Ljava/lang/String;", "getPhoneInputError", "()Ljava/lang/String;", "getEmailInputError", "getPasswordInputError", "Z", "()Z", "Lhs/f;", "getBrandingInfo", "()Lhs/f;", "getLoginTextOverride", "<init>", "(Lcom/theinnerhour/b2b/components/login/model/ExpandedState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLhs/f;Lhs/f;Z)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReworkLoginState {
    private final f<Boolean, String> brandingInfo;
    private final String emailInputError;
    private final ExpandedState expandedState;
    private final boolean isDisableSignup;
    private final boolean isShowSocialOptions;
    private final f<String, String> loginTextOverride;
    private final String passwordInputError;
    private final String phoneInputError;

    public ReworkLoginState() {
        this(null, null, null, null, false, null, null, false, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReworkLoginState copy$default(ReworkLoginState reworkLoginState, ExpandedState expandedState, String str, String str2, String str3, boolean z10, f fVar, f fVar2, boolean z11, int i6, Object obj) {
        ExpandedState expandedState2;
        String str4;
        String str5;
        String str6;
        boolean z12;
        f<Boolean, String> fVar3;
        f<String, String> fVar4;
        boolean z13;
        if ((i6 & 1) != 0) {
            expandedState2 = reworkLoginState.expandedState;
        } else {
            expandedState2 = expandedState;
        }
        if ((i6 & 2) != 0) {
            str4 = reworkLoginState.phoneInputError;
        } else {
            str4 = str;
        }
        if ((i6 & 4) != 0) {
            str5 = reworkLoginState.emailInputError;
        } else {
            str5 = str2;
        }
        if ((i6 & 8) != 0) {
            str6 = reworkLoginState.passwordInputError;
        } else {
            str6 = str3;
        }
        if ((i6 & 16) != 0) {
            z12 = reworkLoginState.isShowSocialOptions;
        } else {
            z12 = z10;
        }
        if ((i6 & 32) != 0) {
            fVar3 = reworkLoginState.brandingInfo;
        } else {
            fVar3 = fVar;
        }
        if ((i6 & 64) != 0) {
            fVar4 = reworkLoginState.loginTextOverride;
        } else {
            fVar4 = fVar2;
        }
        if ((i6 & 128) != 0) {
            z13 = reworkLoginState.isDisableSignup;
        } else {
            z13 = z11;
        }
        return reworkLoginState.copy(expandedState2, str4, str5, str6, z12, fVar3, fVar4, z13);
    }

    public final ExpandedState component1() {
        return this.expandedState;
    }

    public final String component2() {
        return this.phoneInputError;
    }

    public final String component3() {
        return this.emailInputError;
    }

    public final String component4() {
        return this.passwordInputError;
    }

    public final boolean component5() {
        return this.isShowSocialOptions;
    }

    public final f<Boolean, String> component6() {
        return this.brandingInfo;
    }

    public final f<String, String> component7() {
        return this.loginTextOverride;
    }

    public final boolean component8() {
        return this.isDisableSignup;
    }

    public final ReworkLoginState copy(ExpandedState expandedState, String str, String str2, String str3, boolean z10, f<Boolean, String> brandingInfo, f<String, String> fVar, boolean z11) {
        i.g(expandedState, "expandedState");
        i.g(brandingInfo, "brandingInfo");
        return new ReworkLoginState(expandedState, str, str2, str3, z10, brandingInfo, fVar, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReworkLoginState)) {
            return false;
        }
        ReworkLoginState reworkLoginState = (ReworkLoginState) obj;
        if (this.expandedState == reworkLoginState.expandedState && i.b(this.phoneInputError, reworkLoginState.phoneInputError) && i.b(this.emailInputError, reworkLoginState.emailInputError) && i.b(this.passwordInputError, reworkLoginState.passwordInputError) && this.isShowSocialOptions == reworkLoginState.isShowSocialOptions && i.b(this.brandingInfo, reworkLoginState.brandingInfo) && i.b(this.loginTextOverride, reworkLoginState.loginTextOverride) && this.isDisableSignup == reworkLoginState.isDisableSignup) {
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

    public final ExpandedState getExpandedState() {
        return this.expandedState;
    }

    public final f<String, String> getLoginTextOverride() {
        return this.loginTextOverride;
    }

    public final String getPasswordInputError() {
        return this.passwordInputError;
    }

    public final String getPhoneInputError() {
        return this.phoneInputError;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.expandedState.hashCode() * 31;
        String str = this.phoneInputError;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        String str2 = this.emailInputError;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.passwordInputError;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        boolean z10 = this.isShowSocialOptions;
        int i13 = 1;
        int i14 = z10;
        if (z10 != 0) {
            i14 = 1;
        }
        int hashCode5 = (this.brandingInfo.hashCode() + ((i12 + i14) * 31)) * 31;
        f<String, String> fVar = this.loginTextOverride;
        if (fVar != null) {
            i6 = fVar.hashCode();
        }
        int i15 = (hashCode5 + i6) * 31;
        boolean z11 = this.isDisableSignup;
        if (!z11) {
            i13 = z11 ? 1 : 0;
        }
        return i15 + i13;
    }

    public final boolean isDisableSignup() {
        return this.isDisableSignup;
    }

    public final boolean isShowSocialOptions() {
        return this.isShowSocialOptions;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ReworkLoginState(expandedState=");
        sb2.append(this.expandedState);
        sb2.append(", phoneInputError=");
        sb2.append(this.phoneInputError);
        sb2.append(", emailInputError=");
        sb2.append(this.emailInputError);
        sb2.append(", passwordInputError=");
        sb2.append(this.passwordInputError);
        sb2.append(", isShowSocialOptions=");
        sb2.append(this.isShowSocialOptions);
        sb2.append(", brandingInfo=");
        sb2.append(this.brandingInfo);
        sb2.append(", loginTextOverride=");
        sb2.append(this.loginTextOverride);
        sb2.append(", isDisableSignup=");
        return c.t(sb2, this.isDisableSignup, ')');
    }

    public ReworkLoginState(ExpandedState expandedState, String str, String str2, String str3, boolean z10, f<Boolean, String> brandingInfo, f<String, String> fVar, boolean z11) {
        i.g(expandedState, "expandedState");
        i.g(brandingInfo, "brandingInfo");
        this.expandedState = expandedState;
        this.phoneInputError = str;
        this.emailInputError = str2;
        this.passwordInputError = str3;
        this.isShowSocialOptions = z10;
        this.brandingInfo = brandingInfo;
        this.loginTextOverride = fVar;
        this.isDisableSignup = z11;
    }

    public /* synthetic */ ReworkLoginState(ExpandedState expandedState, String str, String str2, String str3, boolean z10, f fVar, f fVar2, boolean z11, int i6, d dVar) {
        this((i6 & 1) != 0 ? ExpandedState.ALL_COLLAPSED : expandedState, (i6 & 2) != 0 ? null : str, (i6 & 4) != 0 ? null : str2, (i6 & 8) != 0 ? null : str3, (i6 & 16) != 0 ? true : z10, (i6 & 32) != 0 ? new f(Boolean.FALSE, null) : fVar, (i6 & 64) == 0 ? fVar2 : null, (i6 & 128) != 0 ? false : z11);
    }
}
