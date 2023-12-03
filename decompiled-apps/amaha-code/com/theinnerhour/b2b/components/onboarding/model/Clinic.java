package com.theinnerhour.b2b.components.onboarding.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: MatchingResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/theinnerhour/b2b/components/onboarding/model/Clinic;", "", "id", "", "location", "Lcom/theinnerhour/b2b/components/onboarding/model/Location;", "(Ljava/lang/Integer;Lcom/theinnerhour/b2b/components/onboarding/model/Location;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLocation", "()Lcom/theinnerhour/b2b/components/onboarding/model/Location;", "setLocation", "(Lcom/theinnerhour/b2b/components/onboarding/model/Location;)V", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/theinnerhour/b2b/components/onboarding/model/Location;)Lcom/theinnerhour/b2b/components/onboarding/model/Clinic;", "equals", "", "other", "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class Clinic {
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private Integer f11502id;
    @b("location")
    private Location location;

    public Clinic() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Clinic copy$default(Clinic clinic, Integer num, Location location, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            num = clinic.f11502id;
        }
        if ((i6 & 2) != 0) {
            location = clinic.location;
        }
        return clinic.copy(num, location);
    }

    public final Integer component1() {
        return this.f11502id;
    }

    public final Location component2() {
        return this.location;
    }

    public final Clinic copy(Integer num, Location location) {
        return new Clinic(num, location);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Clinic)) {
            return false;
        }
        Clinic clinic = (Clinic) obj;
        if (i.b(this.f11502id, clinic.f11502id) && i.b(this.location, clinic.location)) {
            return true;
        }
        return false;
    }

    public final Integer getId() {
        return this.f11502id;
    }

    public final Location getLocation() {
        return this.location;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f11502id;
        int i6 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = hashCode * 31;
        Location location = this.location;
        if (location != null) {
            i6 = location.hashCode();
        }
        return i10 + i6;
    }

    public final void setId(Integer num) {
        this.f11502id = num;
    }

    public final void setLocation(Location location) {
        this.location = location;
    }

    public String toString() {
        return "Clinic(id=" + this.f11502id + ", location=" + this.location + ')';
    }

    public Clinic(Integer num, Location location) {
        this.f11502id = num;
        this.location = location;
    }

    public /* synthetic */ Clinic(Integer num, Location location, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : num, (i6 & 2) != 0 ? new Location(null, 1, null) : location);
    }
}
