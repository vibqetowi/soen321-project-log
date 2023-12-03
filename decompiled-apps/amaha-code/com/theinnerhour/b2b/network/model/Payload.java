package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: DeeplinkCodeResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0092\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u000b2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\"\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!¨\u0006="}, d2 = {"Lcom/theinnerhour/b2b/network/model/Payload;", "", "couponCode", "", "title", "subtitle", "body", "cta", "color", "bannerImage", "validDeepLink", "", "showInfoPage", "showError", "errorText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getBannerImage", "()Ljava/lang/String;", "setBannerImage", "(Ljava/lang/String;)V", "getBody", "setBody", "getColor", "setColor", "getCouponCode", "setCouponCode", "getCta", "setCta", "getErrorText", "setErrorText", "getShowError", "()Ljava/lang/Boolean;", "setShowError", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getShowInfoPage", "setShowInfoPage", "getSubtitle", "setSubtitle", "getTitle", "setTitle", "getValidDeepLink", "setValidDeepLink", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/theinnerhour/b2b/network/model/Payload;", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class Payload {
    @b("bannerImage")
    private String bannerImage;
    @b("body")
    private String body;
    @b("color")
    private String color;
    @b("couponCode")
    private String couponCode;
    @b("cta")
    private String cta;
    @b("errorText")
    private String errorText;
    @b("showError")
    private Boolean showError;
    @b("showInfoPage")
    private Boolean showInfoPage;
    @b("subtitle")
    private String subtitle;
    @b("title")
    private String title;
    @b("validDeepLink")
    private Boolean validDeepLink;

    public Payload() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ Payload copy$default(Payload payload, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3, String str8, int i6, Object obj) {
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        String str16;
        if ((i6 & 1) != 0) {
            str9 = payload.couponCode;
        } else {
            str9 = str;
        }
        if ((i6 & 2) != 0) {
            str10 = payload.title;
        } else {
            str10 = str2;
        }
        if ((i6 & 4) != 0) {
            str11 = payload.subtitle;
        } else {
            str11 = str3;
        }
        if ((i6 & 8) != 0) {
            str12 = payload.body;
        } else {
            str12 = str4;
        }
        if ((i6 & 16) != 0) {
            str13 = payload.cta;
        } else {
            str13 = str5;
        }
        if ((i6 & 32) != 0) {
            str14 = payload.color;
        } else {
            str14 = str6;
        }
        if ((i6 & 64) != 0) {
            str15 = payload.bannerImage;
        } else {
            str15 = str7;
        }
        if ((i6 & 128) != 0) {
            bool4 = payload.validDeepLink;
        } else {
            bool4 = bool;
        }
        if ((i6 & 256) != 0) {
            bool5 = payload.showInfoPage;
        } else {
            bool5 = bool2;
        }
        if ((i6 & 512) != 0) {
            bool6 = payload.showError;
        } else {
            bool6 = bool3;
        }
        if ((i6 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0) {
            str16 = payload.errorText;
        } else {
            str16 = str8;
        }
        return payload.copy(str9, str10, str11, str12, str13, str14, str15, bool4, bool5, bool6, str16);
    }

    public final String component1() {
        return this.couponCode;
    }

    public final Boolean component10() {
        return this.showError;
    }

    public final String component11() {
        return this.errorText;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.body;
    }

    public final String component5() {
        return this.cta;
    }

    public final String component6() {
        return this.color;
    }

    public final String component7() {
        return this.bannerImage;
    }

    public final Boolean component8() {
        return this.validDeepLink;
    }

    public final Boolean component9() {
        return this.showInfoPage;
    }

    public final Payload copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3, String str8) {
        return new Payload(str, str2, str3, str4, str5, str6, str7, bool, bool2, bool3, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Payload)) {
            return false;
        }
        Payload payload = (Payload) obj;
        if (i.b(this.couponCode, payload.couponCode) && i.b(this.title, payload.title) && i.b(this.subtitle, payload.subtitle) && i.b(this.body, payload.body) && i.b(this.cta, payload.cta) && i.b(this.color, payload.color) && i.b(this.bannerImage, payload.bannerImage) && i.b(this.validDeepLink, payload.validDeepLink) && i.b(this.showInfoPage, payload.showInfoPage) && i.b(this.showError, payload.showError) && i.b(this.errorText, payload.errorText)) {
            return true;
        }
        return false;
    }

    public final String getBannerImage() {
        return this.bannerImage;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getCouponCode() {
        return this.couponCode;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getErrorText() {
        return this.errorText;
    }

    public final Boolean getShowError() {
        return this.showError;
    }

    public final Boolean getShowInfoPage() {
        return this.showInfoPage;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Boolean getValidDeepLink() {
        return this.validDeepLink;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        String str = this.couponCode;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.title;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.subtitle;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.body;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str5 = this.cta;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str6 = this.color;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        String str7 = this.bannerImage;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        Boolean bool = this.validDeepLink;
        if (bool == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        Boolean bool2 = this.showInfoPage;
        if (bool2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = bool2.hashCode();
        }
        int i18 = (i17 + hashCode9) * 31;
        Boolean bool3 = this.showError;
        if (bool3 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = bool3.hashCode();
        }
        int i19 = (i18 + hashCode10) * 31;
        String str8 = this.errorText;
        if (str8 != null) {
            i6 = str8.hashCode();
        }
        return i19 + i6;
    }

    public final void setBannerImage(String str) {
        this.bannerImage = str;
    }

    public final void setBody(String str) {
        this.body = str;
    }

    public final void setColor(String str) {
        this.color = str;
    }

    public final void setCouponCode(String str) {
        this.couponCode = str;
    }

    public final void setCta(String str) {
        this.cta = str;
    }

    public final void setErrorText(String str) {
        this.errorText = str;
    }

    public final void setShowError(Boolean bool) {
        this.showError = bool;
    }

    public final void setShowInfoPage(Boolean bool) {
        this.showInfoPage = bool;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setValidDeepLink(Boolean bool) {
        this.validDeepLink = bool;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Payload(couponCode=");
        sb2.append(this.couponCode);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", body=");
        sb2.append(this.body);
        sb2.append(", cta=");
        sb2.append(this.cta);
        sb2.append(", color=");
        sb2.append(this.color);
        sb2.append(", bannerImage=");
        sb2.append(this.bannerImage);
        sb2.append(", validDeepLink=");
        sb2.append(this.validDeepLink);
        sb2.append(", showInfoPage=");
        sb2.append(this.showInfoPage);
        sb2.append(", showError=");
        sb2.append(this.showError);
        sb2.append(", errorText=");
        return g.c(sb2, this.errorText, ')');
    }

    public Payload(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3, String str8) {
        this.couponCode = str;
        this.title = str2;
        this.subtitle = str3;
        this.body = str4;
        this.cta = str5;
        this.color = str6;
        this.bannerImage = str7;
        this.validDeepLink = bool;
        this.showInfoPage = bool2;
        this.showError = bool3;
        this.errorText = str8;
    }

    public /* synthetic */ Payload(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3, String str8, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : str2, (i6 & 4) != 0 ? null : str3, (i6 & 8) != 0 ? null : str4, (i6 & 16) != 0 ? null : str5, (i6 & 32) != 0 ? null : str6, (i6 & 64) != 0 ? null : str7, (i6 & 128) != 0 ? null : bool, (i6 & 256) != 0 ? null : bool2, (i6 & 512) != 0 ? null : bool3, (i6 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) == 0 ? str8 : null);
    }
}
