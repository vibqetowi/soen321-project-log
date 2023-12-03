package q7;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.common.collect.s;
import java.util.Arrays;
/* compiled from: AudioCapabilities.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f29248c = new e(new int[]{2}, 8);

    /* renamed from: d  reason: collision with root package name */
    public static final e f29249d = new e(new int[]{2, 5, 6}, 8);

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f29250e = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: a  reason: collision with root package name */
    public final int[] f29251a;

    /* renamed from: b  reason: collision with root package name */
    public final int f29252b;

    /* compiled from: AudioCapabilities.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static int[] a() {
            int[] iArr;
            boolean isDirectPlaybackSupported;
            s.b bVar = s.f9446v;
            s.a aVar = new s.a();
            for (int i6 : e.f29250e) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i6).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build());
                if (isDirectPlaybackSupported) {
                    aVar.b(Integer.valueOf(i6));
                }
            }
            aVar.b(2);
            return qc.a.G(aVar.c());
        }
    }

    public e(int[] iArr, int i6) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f29251a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f29251a = new int[0];
        }
        this.f29252b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Arrays.equals(this.f29251a, eVar.f29251a) && this.f29252b == eVar.f29252b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f29251a) * 31) + this.f29252b;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f29251a);
        StringBuilder sb2 = new StringBuilder(ri.e.c(arrays, 67));
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(this.f29252b);
        sb2.append(", supportedEncodings=");
        sb2.append(arrays);
        sb2.append("]");
        return sb2.toString();
    }
}
