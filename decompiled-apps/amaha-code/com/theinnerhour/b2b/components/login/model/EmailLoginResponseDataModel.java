package com.theinnerhour.b2b.components.login.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: EmailLoginResponseDataModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0019J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jþ\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\u00172\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020KHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\u0018\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b&\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b,\u0010\u001fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001b¨\u0006M"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/EmailLoginResponseDataModel;", "", "usertype", "", "token", "id", "", SessionManager.KEY_UID, SessionManager.KEY_UUID, "image", "organisationId", SessionManager.KEY_FIRSTNAME, SessionManager.KEY_LASTNAME, SessionManager.KEY_MOBILE, "countryCode", SessionManager.KEY_MYTHERAPIST, "myCoupleTherapist", "myPsychiatrist", "timezone", "organisationName", SessionManager.ALIAS, "partnerId", "mobileVerified", "", "isVerified", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAlias", "()Ljava/lang/String;", "getCountryCode", "getFirstName", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getImage", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastName", "getMobile", "getMobileVerified", "getMyCoupleTherapist", "getMyPsychiatrist", "getMyTherapist", "getOrganisationId", "getOrganisationName", "getPartnerId", "getTimezone", "getToken", "getUid", "getUsertype", "getUuid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/theinnerhour/b2b/components/login/model/EmailLoginResponseDataModel;", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class EmailLoginResponseDataModel {
    @b(SessionManager.ALIAS)
    private final String alias;
    @b(SessionManager.KEY_COUNTRY_CODE)
    private final String countryCode;
    @b("firstname")
    private final String firstName;

    /* renamed from: id  reason: collision with root package name */
    private final Long f11373id;
    private final String image;
    @b(SessionManager.KEY_B2B_IS_VERIFIED)
    private final Boolean isVerified;
    @b("lastname")
    private final String lastName;
    private final String mobile;
    @b(SessionManager.KEY_MOBILE_VERIFIED)
    private final Boolean mobileVerified;
    @b(SessionManager.KEY_MYCOUPLESTHERAPIST)
    private final String myCoupleTherapist;
    @b(SessionManager.KEY_MYPSYCHIATRIST)
    private final String myPsychiatrist;
    @b("mytherapist")
    private final String myTherapist;
    @b("organisation_id")
    private final String organisationId;
    @b(SessionManager.KEY_ORGANISATION_NAME)
    private final String organisationName;
    @b(SessionManager.KEY_PARTNER_ID)
    private final Long partnerId;
    @b("timezone")
    private final String timezone;
    @b(SessionManager.KEY_FB_TOKEN)
    private final String token;
    private final String uid;
    private final String usertype;
    private final String uuid;

    public EmailLoginResponseDataModel(String str, String str2, Long l2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Long l10, Boolean bool, Boolean bool2) {
        this.usertype = str;
        this.token = str2;
        this.f11373id = l2;
        this.uid = str3;
        this.uuid = str4;
        this.image = str5;
        this.organisationId = str6;
        this.firstName = str7;
        this.lastName = str8;
        this.mobile = str9;
        this.countryCode = str10;
        this.myTherapist = str11;
        this.myCoupleTherapist = str12;
        this.myPsychiatrist = str13;
        this.timezone = str14;
        this.organisationName = str15;
        this.alias = str16;
        this.partnerId = l10;
        this.mobileVerified = bool;
        this.isVerified = bool2;
    }

    public final String component1() {
        return this.usertype;
    }

    public final String component10() {
        return this.mobile;
    }

    public final String component11() {
        return this.countryCode;
    }

    public final String component12() {
        return this.myTherapist;
    }

    public final String component13() {
        return this.myCoupleTherapist;
    }

    public final String component14() {
        return this.myPsychiatrist;
    }

    public final String component15() {
        return this.timezone;
    }

    public final String component16() {
        return this.organisationName;
    }

    public final String component17() {
        return this.alias;
    }

    public final Long component18() {
        return this.partnerId;
    }

    public final Boolean component19() {
        return this.mobileVerified;
    }

    public final String component2() {
        return this.token;
    }

    public final Boolean component20() {
        return this.isVerified;
    }

    public final Long component3() {
        return this.f11373id;
    }

    public final String component4() {
        return this.uid;
    }

    public final String component5() {
        return this.uuid;
    }

    public final String component6() {
        return this.image;
    }

    public final String component7() {
        return this.organisationId;
    }

    public final String component8() {
        return this.firstName;
    }

    public final String component9() {
        return this.lastName;
    }

    public final EmailLoginResponseDataModel copy(String str, String str2, Long l2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Long l10, Boolean bool, Boolean bool2) {
        return new EmailLoginResponseDataModel(str, str2, l2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, l10, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailLoginResponseDataModel)) {
            return false;
        }
        EmailLoginResponseDataModel emailLoginResponseDataModel = (EmailLoginResponseDataModel) obj;
        if (i.b(this.usertype, emailLoginResponseDataModel.usertype) && i.b(this.token, emailLoginResponseDataModel.token) && i.b(this.f11373id, emailLoginResponseDataModel.f11373id) && i.b(this.uid, emailLoginResponseDataModel.uid) && i.b(this.uuid, emailLoginResponseDataModel.uuid) && i.b(this.image, emailLoginResponseDataModel.image) && i.b(this.organisationId, emailLoginResponseDataModel.organisationId) && i.b(this.firstName, emailLoginResponseDataModel.firstName) && i.b(this.lastName, emailLoginResponseDataModel.lastName) && i.b(this.mobile, emailLoginResponseDataModel.mobile) && i.b(this.countryCode, emailLoginResponseDataModel.countryCode) && i.b(this.myTherapist, emailLoginResponseDataModel.myTherapist) && i.b(this.myCoupleTherapist, emailLoginResponseDataModel.myCoupleTherapist) && i.b(this.myPsychiatrist, emailLoginResponseDataModel.myPsychiatrist) && i.b(this.timezone, emailLoginResponseDataModel.timezone) && i.b(this.organisationName, emailLoginResponseDataModel.organisationName) && i.b(this.alias, emailLoginResponseDataModel.alias) && i.b(this.partnerId, emailLoginResponseDataModel.partnerId) && i.b(this.mobileVerified, emailLoginResponseDataModel.mobileVerified) && i.b(this.isVerified, emailLoginResponseDataModel.isVerified)) {
            return true;
        }
        return false;
    }

    public final String getAlias() {
        return this.alias;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final Long getId() {
        return this.f11373id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final Boolean getMobileVerified() {
        return this.mobileVerified;
    }

    public final String getMyCoupleTherapist() {
        return this.myCoupleTherapist;
    }

    public final String getMyPsychiatrist() {
        return this.myPsychiatrist;
    }

    public final String getMyTherapist() {
        return this.myTherapist;
    }

    public final String getOrganisationId() {
        return this.organisationId;
    }

    public final String getOrganisationName() {
        return this.organisationName;
    }

    public final Long getPartnerId() {
        return this.partnerId;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getUsertype() {
        return this.usertype;
    }

    public final String getUuid() {
        return this.uuid;
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
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        String str = this.usertype;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.token;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Long l2 = this.f11373id;
        if (l2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l2.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str3 = this.uid;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str4 = this.uuid;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str5 = this.image;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        String str6 = this.organisationId;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        String str7 = this.firstName;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        String str8 = this.lastName;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i18 = (i17 + hashCode9) * 31;
        String str9 = this.mobile;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i19 = (i18 + hashCode10) * 31;
        String str10 = this.countryCode;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i20 = (i19 + hashCode11) * 31;
        String str11 = this.myTherapist;
        if (str11 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str11.hashCode();
        }
        int i21 = (i20 + hashCode12) * 31;
        String str12 = this.myCoupleTherapist;
        if (str12 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str12.hashCode();
        }
        int i22 = (i21 + hashCode13) * 31;
        String str13 = this.myPsychiatrist;
        if (str13 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str13.hashCode();
        }
        int i23 = (i22 + hashCode14) * 31;
        String str14 = this.timezone;
        if (str14 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str14.hashCode();
        }
        int i24 = (i23 + hashCode15) * 31;
        String str15 = this.organisationName;
        if (str15 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str15.hashCode();
        }
        int i25 = (i24 + hashCode16) * 31;
        String str16 = this.alias;
        if (str16 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str16.hashCode();
        }
        int i26 = (i25 + hashCode17) * 31;
        Long l10 = this.partnerId;
        if (l10 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = l10.hashCode();
        }
        int i27 = (i26 + hashCode18) * 31;
        Boolean bool = this.mobileVerified;
        if (bool == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = bool.hashCode();
        }
        int i28 = (i27 + hashCode19) * 31;
        Boolean bool2 = this.isVerified;
        if (bool2 != null) {
            i6 = bool2.hashCode();
        }
        return i28 + i6;
    }

    public final Boolean isVerified() {
        return this.isVerified;
    }

    public String toString() {
        return "EmailLoginResponseDataModel(usertype=" + this.usertype + ", token=" + this.token + ", id=" + this.f11373id + ", uid=" + this.uid + ", uuid=" + this.uuid + ", image=" + this.image + ", organisationId=" + this.organisationId + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", mobile=" + this.mobile + ", countryCode=" + this.countryCode + ", myTherapist=" + this.myTherapist + ", myCoupleTherapist=" + this.myCoupleTherapist + ", myPsychiatrist=" + this.myPsychiatrist + ", timezone=" + this.timezone + ", organisationName=" + this.organisationName + ", alias=" + this.alias + ", partnerId=" + this.partnerId + ", mobileVerified=" + this.mobileVerified + ", isVerified=" + this.isVerified + ')';
    }
}
