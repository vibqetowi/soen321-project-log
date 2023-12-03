package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
/* compiled from: UpcomingSessionsModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003Jc\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012¨\u00067"}, d2 = {"Lcom/theinnerhour/b2b/network/model/OfflineClinicDetail;", "Ljava/io/Serializable;", "id", "", "addressLine1", "", "addressLine2", "geoLat", "geoLong", "landlineNumber", "mobileNumber", SessionManager.KEY_NAME, "locationDetail", "Lcom/theinnerhour/b2b/network/model/OfflineClinicLocationDetail;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/theinnerhour/b2b/network/model/OfflineClinicLocationDetail;)V", "getAddressLine1", "()Ljava/lang/String;", "setAddressLine1", "(Ljava/lang/String;)V", "getAddressLine2", "setAddressLine2", "getGeoLat", "setGeoLat", "getGeoLong", "setGeoLong", "getId", "()I", "setId", "(I)V", "getLandlineNumber", "setLandlineNumber", "getLocationDetail", "()Lcom/theinnerhour/b2b/network/model/OfflineClinicLocationDetail;", "setLocationDetail", "(Lcom/theinnerhour/b2b/network/model/OfflineClinicLocationDetail;)V", "getMobileNumber", "setMobileNumber", "getName", "setName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class OfflineClinicDetail implements Serializable {
    @b("address_line_1")
    private String addressLine1;
    @b("address_line_2")
    private String addressLine2;
    @b("geo_lat")
    private String geoLat;
    @b("geo_long")
    private String geoLong;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private int f11773id;
    @b("landline_no")
    private String landlineNumber;
    @b("location")
    private OfflineClinicLocationDetail locationDetail;
    @b("mobile_no")
    private String mobileNumber;
    @b(SessionManager.KEY_NAME)
    private String name;

    public OfflineClinicDetail(int i6, String addressLine1, String addressLine2, String geoLat, String geoLong, String landlineNumber, String mobileNumber, String name, OfflineClinicLocationDetail locationDetail) {
        i.g(addressLine1, "addressLine1");
        i.g(addressLine2, "addressLine2");
        i.g(geoLat, "geoLat");
        i.g(geoLong, "geoLong");
        i.g(landlineNumber, "landlineNumber");
        i.g(mobileNumber, "mobileNumber");
        i.g(name, "name");
        i.g(locationDetail, "locationDetail");
        this.f11773id = i6;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.geoLat = geoLat;
        this.geoLong = geoLong;
        this.landlineNumber = landlineNumber;
        this.mobileNumber = mobileNumber;
        this.name = name;
        this.locationDetail = locationDetail;
    }

    public static /* synthetic */ OfflineClinicDetail copy$default(OfflineClinicDetail offlineClinicDetail, int i6, String str, String str2, String str3, String str4, String str5, String str6, String str7, OfflineClinicLocationDetail offlineClinicLocationDetail, int i10, Object obj) {
        int i11;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        OfflineClinicLocationDetail offlineClinicLocationDetail2;
        if ((i10 & 1) != 0) {
            i11 = offlineClinicDetail.f11773id;
        } else {
            i11 = i6;
        }
        if ((i10 & 2) != 0) {
            str8 = offlineClinicDetail.addressLine1;
        } else {
            str8 = str;
        }
        if ((i10 & 4) != 0) {
            str9 = offlineClinicDetail.addressLine2;
        } else {
            str9 = str2;
        }
        if ((i10 & 8) != 0) {
            str10 = offlineClinicDetail.geoLat;
        } else {
            str10 = str3;
        }
        if ((i10 & 16) != 0) {
            str11 = offlineClinicDetail.geoLong;
        } else {
            str11 = str4;
        }
        if ((i10 & 32) != 0) {
            str12 = offlineClinicDetail.landlineNumber;
        } else {
            str12 = str5;
        }
        if ((i10 & 64) != 0) {
            str13 = offlineClinicDetail.mobileNumber;
        } else {
            str13 = str6;
        }
        if ((i10 & 128) != 0) {
            str14 = offlineClinicDetail.name;
        } else {
            str14 = str7;
        }
        if ((i10 & 256) != 0) {
            offlineClinicLocationDetail2 = offlineClinicDetail.locationDetail;
        } else {
            offlineClinicLocationDetail2 = offlineClinicLocationDetail;
        }
        return offlineClinicDetail.copy(i11, str8, str9, str10, str11, str12, str13, str14, offlineClinicLocationDetail2);
    }

    public final int component1() {
        return this.f11773id;
    }

    public final String component2() {
        return this.addressLine1;
    }

    public final String component3() {
        return this.addressLine2;
    }

    public final String component4() {
        return this.geoLat;
    }

    public final String component5() {
        return this.geoLong;
    }

    public final String component6() {
        return this.landlineNumber;
    }

    public final String component7() {
        return this.mobileNumber;
    }

    public final String component8() {
        return this.name;
    }

    public final OfflineClinicLocationDetail component9() {
        return this.locationDetail;
    }

    public final OfflineClinicDetail copy(int i6, String addressLine1, String addressLine2, String geoLat, String geoLong, String landlineNumber, String mobileNumber, String name, OfflineClinicLocationDetail locationDetail) {
        i.g(addressLine1, "addressLine1");
        i.g(addressLine2, "addressLine2");
        i.g(geoLat, "geoLat");
        i.g(geoLong, "geoLong");
        i.g(landlineNumber, "landlineNumber");
        i.g(mobileNumber, "mobileNumber");
        i.g(name, "name");
        i.g(locationDetail, "locationDetail");
        return new OfflineClinicDetail(i6, addressLine1, addressLine2, geoLat, geoLong, landlineNumber, mobileNumber, name, locationDetail);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineClinicDetail)) {
            return false;
        }
        OfflineClinicDetail offlineClinicDetail = (OfflineClinicDetail) obj;
        if (this.f11773id == offlineClinicDetail.f11773id && i.b(this.addressLine1, offlineClinicDetail.addressLine1) && i.b(this.addressLine2, offlineClinicDetail.addressLine2) && i.b(this.geoLat, offlineClinicDetail.geoLat) && i.b(this.geoLong, offlineClinicDetail.geoLong) && i.b(this.landlineNumber, offlineClinicDetail.landlineNumber) && i.b(this.mobileNumber, offlineClinicDetail.mobileNumber) && i.b(this.name, offlineClinicDetail.name) && i.b(this.locationDetail, offlineClinicDetail.locationDetail)) {
            return true;
        }
        return false;
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getGeoLat() {
        return this.geoLat;
    }

    public final String getGeoLong() {
        return this.geoLong;
    }

    public final int getId() {
        return this.f11773id;
    }

    public final String getLandlineNumber() {
        return this.landlineNumber;
    }

    public final OfflineClinicLocationDetail getLocationDetail() {
        return this.locationDetail;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.locationDetail.hashCode() + a.c(this.name, a.c(this.mobileNumber, a.c(this.landlineNumber, a.c(this.geoLong, a.c(this.geoLat, a.c(this.addressLine2, a.c(this.addressLine1, this.f11773id * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setAddressLine1(String str) {
        i.g(str, "<set-?>");
        this.addressLine1 = str;
    }

    public final void setAddressLine2(String str) {
        i.g(str, "<set-?>");
        this.addressLine2 = str;
    }

    public final void setGeoLat(String str) {
        i.g(str, "<set-?>");
        this.geoLat = str;
    }

    public final void setGeoLong(String str) {
        i.g(str, "<set-?>");
        this.geoLong = str;
    }

    public final void setId(int i6) {
        this.f11773id = i6;
    }

    public final void setLandlineNumber(String str) {
        i.g(str, "<set-?>");
        this.landlineNumber = str;
    }

    public final void setLocationDetail(OfflineClinicLocationDetail offlineClinicLocationDetail) {
        i.g(offlineClinicLocationDetail, "<set-?>");
        this.locationDetail = offlineClinicLocationDetail;
    }

    public final void setMobileNumber(String str) {
        i.g(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final void setName(String str) {
        i.g(str, "<set-?>");
        this.name = str;
    }

    public String toString() {
        return "OfflineClinicDetail(id=" + this.f11773id + ", addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", geoLat=" + this.geoLat + ", geoLong=" + this.geoLong + ", landlineNumber=" + this.landlineNumber + ", mobileNumber=" + this.mobileNumber + ", name=" + this.name + ", locationDetail=" + this.locationDetail + ')';
    }
}
