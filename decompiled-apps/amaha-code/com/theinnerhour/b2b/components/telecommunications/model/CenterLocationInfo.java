package com.theinnerhour.b2b.components.telecommunications.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: RegionalOfflineCenterLocationsModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/CenterLocationInfo;", "", "city", "", "(Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class CenterLocationInfo {
    @b("city")
    private final String city;

    public CenterLocationInfo(String str) {
        this.city = str;
    }

    public static /* synthetic */ CenterLocationInfo copy$default(CenterLocationInfo centerLocationInfo, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = centerLocationInfo.city;
        }
        return centerLocationInfo.copy(str);
    }

    public final String component1() {
        return this.city;
    }

    public final CenterLocationInfo copy(String str) {
        return new CenterLocationInfo(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CenterLocationInfo) && i.b(this.city, ((CenterLocationInfo) obj).city)) {
            return true;
        }
        return false;
    }

    public final String getCity() {
        return this.city;
    }

    public int hashCode() {
        String str = this.city;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return g.c(new StringBuilder("CenterLocationInfo(city="), this.city, ')');
    }
}
