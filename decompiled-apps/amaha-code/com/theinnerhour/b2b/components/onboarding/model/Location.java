package com.theinnerhour.b2b.components.onboarding.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: MatchingResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/theinnerhour/b2b/components/onboarding/model/Location;", "", "city", "", "(Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "setCity", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class Location {
    @b("city")
    private String city;

    public Location() {
        this(null, 1, null);
    }

    public static /* synthetic */ Location copy$default(Location location, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = location.city;
        }
        return location.copy(str);
    }

    public final String component1() {
        return this.city;
    }

    public final Location copy(String str) {
        return new Location(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Location) && i.b(this.city, ((Location) obj).city)) {
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

    public final void setCity(String str) {
        this.city = str;
    }

    public String toString() {
        return g.c(new StringBuilder("Location(city="), this.city, ')');
    }

    public Location(String str) {
        this.city = str;
    }

    public /* synthetic */ Location(String str, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : str);
    }
}
