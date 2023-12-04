package androidx.camera.view.video;

import android.location.Location;
import androidx.camera.view.video.Metadata;
/* loaded from: classes.dex */
final class AutoValue_Metadata extends Metadata {
    private final Location location;

    private AutoValue_Metadata(Location location) {
        this.location = location;
    }

    @Override // androidx.camera.view.video.Metadata
    public Location getLocation() {
        return this.location;
    }

    public String toString() {
        return "Metadata{location=" + this.location + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Metadata) {
            Location location = this.location;
            Location location2 = ((Metadata) obj).getLocation();
            return location == null ? location2 == null : location.equals(location2);
        }
        return false;
    }

    public int hashCode() {
        Location location = this.location;
        return (location == null ? 0 : location.hashCode()) ^ 1000003;
    }

    /* loaded from: classes.dex */
    static final class Builder extends Metadata.Builder {
        private Location location;

        @Override // androidx.camera.view.video.Metadata.Builder
        public Metadata.Builder setLocation(Location location) {
            this.location = location;
            return this;
        }

        @Override // androidx.camera.view.video.Metadata.Builder
        public Metadata build() {
            return new AutoValue_Metadata(this.location);
        }
    }
}
