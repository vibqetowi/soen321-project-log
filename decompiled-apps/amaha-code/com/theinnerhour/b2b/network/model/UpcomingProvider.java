package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
import v.g;
/* compiled from: UpcomingSessionsModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003JY\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u0006HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u00060"}, d2 = {"Lcom/theinnerhour/b2b/network/model/UpcomingProvider;", "Ljava/io/Serializable;", "firebaseid", "", "firstname", "id", "", "image", "lastname", SessionManager.KEY_MOBILE, "timezone", SessionManager.KEY_UUID, "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirebaseid", "()Ljava/lang/String;", "setFirebaseid", "(Ljava/lang/String;)V", "getFirstname", "setFirstname", "getId", "()I", "setId", "(I)V", "getImage", "setImage", "getLastname", "setLastname", "getMobile", "setMobile", "getTimezone", "setTimezone", "getUuid", "setUuid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class UpcomingProvider implements Serializable {
    @b("firebaseid")
    private String firebaseid;
    @b("firstname")
    private String firstname;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private int f11782id;
    @b("image")
    private String image;
    @b("lastname")
    private String lastname;
    @b(SessionManager.KEY_MOBILE)
    private String mobile;
    @b("timezone")
    private String timezone;
    @b(SessionManager.KEY_UUID)
    private String uuid;

    public UpcomingProvider(String firebaseid, String firstname, int i6, String image, String lastname, String mobile, String timezone, String uuid) {
        i.g(firebaseid, "firebaseid");
        i.g(firstname, "firstname");
        i.g(image, "image");
        i.g(lastname, "lastname");
        i.g(mobile, "mobile");
        i.g(timezone, "timezone");
        i.g(uuid, "uuid");
        this.firebaseid = firebaseid;
        this.firstname = firstname;
        this.f11782id = i6;
        this.image = image;
        this.lastname = lastname;
        this.mobile = mobile;
        this.timezone = timezone;
        this.uuid = uuid;
    }

    public static /* synthetic */ UpcomingProvider copy$default(UpcomingProvider upcomingProvider, String str, String str2, int i6, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        String str8;
        String str9;
        int i11;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        if ((i10 & 1) != 0) {
            str8 = upcomingProvider.firebaseid;
        } else {
            str8 = str;
        }
        if ((i10 & 2) != 0) {
            str9 = upcomingProvider.firstname;
        } else {
            str9 = str2;
        }
        if ((i10 & 4) != 0) {
            i11 = upcomingProvider.f11782id;
        } else {
            i11 = i6;
        }
        if ((i10 & 8) != 0) {
            str10 = upcomingProvider.image;
        } else {
            str10 = str3;
        }
        if ((i10 & 16) != 0) {
            str11 = upcomingProvider.lastname;
        } else {
            str11 = str4;
        }
        if ((i10 & 32) != 0) {
            str12 = upcomingProvider.mobile;
        } else {
            str12 = str5;
        }
        if ((i10 & 64) != 0) {
            str13 = upcomingProvider.timezone;
        } else {
            str13 = str6;
        }
        if ((i10 & 128) != 0) {
            str14 = upcomingProvider.uuid;
        } else {
            str14 = str7;
        }
        return upcomingProvider.copy(str8, str9, i11, str10, str11, str12, str13, str14);
    }

    public final String component1() {
        return this.firebaseid;
    }

    public final String component2() {
        return this.firstname;
    }

    public final int component3() {
        return this.f11782id;
    }

    public final String component4() {
        return this.image;
    }

    public final String component5() {
        return this.lastname;
    }

    public final String component6() {
        return this.mobile;
    }

    public final String component7() {
        return this.timezone;
    }

    public final String component8() {
        return this.uuid;
    }

    public final UpcomingProvider copy(String firebaseid, String firstname, int i6, String image, String lastname, String mobile, String timezone, String uuid) {
        i.g(firebaseid, "firebaseid");
        i.g(firstname, "firstname");
        i.g(image, "image");
        i.g(lastname, "lastname");
        i.g(mobile, "mobile");
        i.g(timezone, "timezone");
        i.g(uuid, "uuid");
        return new UpcomingProvider(firebaseid, firstname, i6, image, lastname, mobile, timezone, uuid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpcomingProvider)) {
            return false;
        }
        UpcomingProvider upcomingProvider = (UpcomingProvider) obj;
        if (i.b(this.firebaseid, upcomingProvider.firebaseid) && i.b(this.firstname, upcomingProvider.firstname) && this.f11782id == upcomingProvider.f11782id && i.b(this.image, upcomingProvider.image) && i.b(this.lastname, upcomingProvider.lastname) && i.b(this.mobile, upcomingProvider.mobile) && i.b(this.timezone, upcomingProvider.timezone) && i.b(this.uuid, upcomingProvider.uuid)) {
            return true;
        }
        return false;
    }

    public final String getFirebaseid() {
        return this.firebaseid;
    }

    public final String getFirstname() {
        return this.firstname;
    }

    public final int getId() {
        return this.f11782id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getLastname() {
        return this.lastname;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        String str = this.firstname;
        return this.uuid.hashCode() + a.c(this.timezone, a.c(this.mobile, a.c(this.lastname, a.c(this.image, (a.c(str, this.firebaseid.hashCode() * 31, 31) + this.f11782id) * 31, 31), 31), 31), 31);
    }

    public final void setFirebaseid(String str) {
        i.g(str, "<set-?>");
        this.firebaseid = str;
    }

    public final void setFirstname(String str) {
        i.g(str, "<set-?>");
        this.firstname = str;
    }

    public final void setId(int i6) {
        this.f11782id = i6;
    }

    public final void setImage(String str) {
        i.g(str, "<set-?>");
        this.image = str;
    }

    public final void setLastname(String str) {
        i.g(str, "<set-?>");
        this.lastname = str;
    }

    public final void setMobile(String str) {
        i.g(str, "<set-?>");
        this.mobile = str;
    }

    public final void setTimezone(String str) {
        i.g(str, "<set-?>");
        this.timezone = str;
    }

    public final void setUuid(String str) {
        i.g(str, "<set-?>");
        this.uuid = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UpcomingProvider(firebaseid=");
        sb2.append(this.firebaseid);
        sb2.append(", firstname=");
        sb2.append(this.firstname);
        sb2.append(", id=");
        sb2.append(this.f11782id);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", lastname=");
        sb2.append(this.lastname);
        sb2.append(", mobile=");
        sb2.append(this.mobile);
        sb2.append(", timezone=");
        sb2.append(this.timezone);
        sb2.append(", uuid=");
        return g.c(sb2, this.uuid, ')');
    }
}
