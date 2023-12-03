package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f2481a = (AudioAttributes) versionedParcel.l(audioAttributesImplApi26.f2481a, 1);
        audioAttributesImplApi26.f2482b = versionedParcel.j(audioAttributesImplApi26.f2482b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi26.f2481a;
        versionedParcel.o(1);
        versionedParcel.u(audioAttributes);
        versionedParcel.t(audioAttributesImplApi26.f2482b, 2);
    }
}
