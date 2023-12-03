package androidx.media;

import android.media.AudioAttributes;
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f2481a;

    /* renamed from: b  reason: collision with root package name */
    public int f2482b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f2481a.equals(((AudioAttributesImplApi21) obj).f2481a);
    }

    public final int hashCode() {
        return this.f2481a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2481a;
    }
}
