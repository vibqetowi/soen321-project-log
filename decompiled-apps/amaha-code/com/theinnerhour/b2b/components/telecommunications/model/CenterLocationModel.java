package com.theinnerhour.b2b.components.telecommunications.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: RegionalOfflineCenterLocationsModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/CenterLocationModel;", "", "latitude", "", "longitude", "locationInfo", "Lcom/theinnerhour/b2b/components/telecommunications/model/CenterLocationInfo;", "(Ljava/lang/String;Ljava/lang/String;Lcom/theinnerhour/b2b/components/telecommunications/model/CenterLocationInfo;)V", "getLatitude", "()Ljava/lang/String;", "getLocationInfo", "()Lcom/theinnerhour/b2b/components/telecommunications/model/CenterLocationInfo;", "getLongitude", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class CenterLocationModel {
    @b("geo_lat")
    private final String latitude;
    @b("location")
    private final CenterLocationInfo locationInfo;
    @b("geo_long")
    private final String longitude;

    public CenterLocationModel(String str, String str2, CenterLocationInfo centerLocationInfo) {
        this.latitude = str;
        this.longitude = str2;
        this.locationInfo = centerLocationInfo;
    }

    public static /* synthetic */ CenterLocationModel copy$default(CenterLocationModel centerLocationModel, String str, String str2, CenterLocationInfo centerLocationInfo, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = centerLocationModel.latitude;
        }
        if ((i6 & 2) != 0) {
            str2 = centerLocationModel.longitude;
        }
        if ((i6 & 4) != 0) {
            centerLocationInfo = centerLocationModel.locationInfo;
        }
        return centerLocationModel.copy(str, str2, centerLocationInfo);
    }

    public final String component1() {
        return this.latitude;
    }

    public final String component2() {
        return this.longitude;
    }

    public final CenterLocationInfo component3() {
        return this.locationInfo;
    }

    public final CenterLocationModel copy(String str, String str2, CenterLocationInfo centerLocationInfo) {
        return new CenterLocationModel(str, str2, centerLocationInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CenterLocationModel)) {
            return false;
        }
        CenterLocationModel centerLocationModel = (CenterLocationModel) obj;
        if (i.b(this.latitude, centerLocationModel.latitude) && i.b(this.longitude, centerLocationModel.longitude) && i.b(this.locationInfo, centerLocationModel.locationInfo)) {
            return true;
        }
        return false;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final CenterLocationInfo getLocationInfo() {
        return this.locationInfo;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.latitude;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.longitude;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        CenterLocationInfo centerLocationInfo = this.locationInfo;
        if (centerLocationInfo != null) {
            i6 = centerLocationInfo.hashCode();
        }
        return i11 + i6;
    }

    public String toString() {
        return "CenterLocationModel(latitude=" + this.latitude + ", longitude=" + this.longitude + ", locationInfo=" + this.locationInfo + ')';
    }
}
