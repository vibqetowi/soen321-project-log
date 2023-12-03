package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2483a = versionedParcel.j(audioAttributesImplBase.f2483a, 1);
        audioAttributesImplBase.f2484b = versionedParcel.j(audioAttributesImplBase.f2484b, 2);
        audioAttributesImplBase.f2485c = versionedParcel.j(audioAttributesImplBase.f2485c, 3);
        audioAttributesImplBase.f2486d = versionedParcel.j(audioAttributesImplBase.f2486d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.t(audioAttributesImplBase.f2483a, 1);
        versionedParcel.t(audioAttributesImplBase.f2484b, 2);
        versionedParcel.t(audioAttributesImplBase.f2485c, 3);
        versionedParcel.t(audioAttributesImplBase.f2486d, 4);
    }
}
