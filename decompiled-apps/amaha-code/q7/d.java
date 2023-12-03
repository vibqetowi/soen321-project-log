package q7;

import android.media.AudioAttributes;
import android.os.Bundle;
import c9.w;
/* compiled from: AudioAttributes.java */
/* loaded from: classes.dex */
public final class d implements com.google.android.exoplayer2.f {

    /* renamed from: z  reason: collision with root package name */
    public static final d f29242z = new d(0, 0, 1, 1);

    /* renamed from: u  reason: collision with root package name */
    public final int f29243u;

    /* renamed from: v  reason: collision with root package name */
    public final int f29244v;

    /* renamed from: w  reason: collision with root package name */
    public final int f29245w;

    /* renamed from: x  reason: collision with root package name */
    public final int f29246x;

    /* renamed from: y  reason: collision with root package name */
    public AudioAttributes f29247y;

    public d(int i6, int i10, int i11, int i12) {
        this.f29243u = i6;
        this.f29244v = i10;
        this.f29245w = i11;
        this.f29246x = i12;
    }

    public static String c(int i6) {
        return Integer.toString(i6, 36);
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(c(0), this.f29243u);
        bundle.putInt(c(1), this.f29244v);
        bundle.putInt(c(2), this.f29245w);
        bundle.putInt(c(3), this.f29246x);
        return bundle;
    }

    public final AudioAttributes b() {
        if (this.f29247y == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f29243u).setFlags(this.f29244v).setUsage(this.f29245w);
            if (w.f5205a >= 29) {
                usage.setAllowedCapturePolicy(this.f29246x);
            }
            this.f29247y = usage.build();
        }
        return this.f29247y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f29243u == dVar.f29243u && this.f29244v == dVar.f29244v && this.f29245w == dVar.f29245w && this.f29246x == dVar.f29246x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((527 + this.f29243u) * 31) + this.f29244v) * 31) + this.f29245w) * 31) + this.f29246x;
    }
}
