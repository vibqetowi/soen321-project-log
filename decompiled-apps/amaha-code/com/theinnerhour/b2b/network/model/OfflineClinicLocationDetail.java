package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
import v.g;
/* compiled from: UpcomingSessionsModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/theinnerhour/b2b/network/model/OfflineClinicLocationDetail;", "Ljava/io/Serializable;", "city", "", "state", "country", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "getCountry", "setCountry", "getState", "setState", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class OfflineClinicLocationDetail implements Serializable {
    @b("city")
    private String city;
    @b("country")
    private String country;
    @b("state")
    private String state;

    public OfflineClinicLocationDetail(String str, String str2, String str3) {
        e.u(str, "city", str2, "state", str3, "country");
        this.city = str;
        this.state = str2;
        this.country = str3;
    }

    public static /* synthetic */ OfflineClinicLocationDetail copy$default(OfflineClinicLocationDetail offlineClinicLocationDetail, String str, String str2, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = offlineClinicLocationDetail.city;
        }
        if ((i6 & 2) != 0) {
            str2 = offlineClinicLocationDetail.state;
        }
        if ((i6 & 4) != 0) {
            str3 = offlineClinicLocationDetail.country;
        }
        return offlineClinicLocationDetail.copy(str, str2, str3);
    }

    public final String component1() {
        return this.city;
    }

    public final String component2() {
        return this.state;
    }

    public final String component3() {
        return this.country;
    }

    public final OfflineClinicLocationDetail copy(String city, String state, String country) {
        i.g(city, "city");
        i.g(state, "state");
        i.g(country, "country");
        return new OfflineClinicLocationDetail(city, state, country);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineClinicLocationDetail)) {
            return false;
        }
        OfflineClinicLocationDetail offlineClinicLocationDetail = (OfflineClinicLocationDetail) obj;
        if (i.b(this.city, offlineClinicLocationDetail.city) && i.b(this.state, offlineClinicLocationDetail.state) && i.b(this.country, offlineClinicLocationDetail.country)) {
            return true;
        }
        return false;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return this.country.hashCode() + a.c(this.state, this.city.hashCode() * 31, 31);
    }

    public final void setCity(String str) {
        i.g(str, "<set-?>");
        this.city = str;
    }

    public final void setCountry(String str) {
        i.g(str, "<set-?>");
        this.country = str;
    }

    public final void setState(String str) {
        i.g(str, "<set-?>");
        this.state = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OfflineClinicLocationDetail(city=");
        sb2.append(this.city);
        sb2.append(", state=");
        sb2.append(this.state);
        sb2.append(", country=");
        return g.c(sb2, this.country, ')');
    }
}
