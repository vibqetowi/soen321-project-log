package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2481a = (AudioAttributes) versionedParcel.l(audioAttributesImplApi21.f2481a, 1);
        audioAttributesImplApi21.f2482b = versionedParcel.j(audioAttributesImplApi21.f2482b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f2481a;
        versionedParcel.o(1);
        versionedParcel.u(audioAttributes);
        versionedParcel.t(audioAttributesImplApi21.f2482b, 2);
    }
}
