package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel parcel) {
        return androidx.media.AudioAttributesCompatParcelizer.read(parcel);
    }

    public static void write(AudioAttributesCompat obj, VersionedParcel parcel) {
        androidx.media.AudioAttributesCompatParcelizer.write(obj, parcel);
    }
}
