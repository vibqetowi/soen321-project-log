package o1;

import android.media.VolumeProvider;
import android.os.Build;
/* compiled from: VolumeProviderCompat.java */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public final int f26980a;

    /* renamed from: b  reason: collision with root package name */
    public final int f26981b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26982c;

    /* renamed from: d  reason: collision with root package name */
    public int f26983d;

    /* renamed from: e  reason: collision with root package name */
    public VolumeProvider f26984e;

    /* compiled from: VolumeProviderCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(VolumeProvider volumeProvider, int i6) {
            volumeProvider.setCurrentVolume(i6);
        }
    }

    public u(String str, int i6, int i10, int i11) {
        this.f26980a = i6;
        this.f26981b = i10;
        this.f26983d = i11;
        this.f26982c = str;
    }

    public final VolumeProvider a() {
        if (this.f26984e == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f26984e = new s(this, this.f26980a, this.f26981b, this.f26983d, this.f26982c);
            } else {
                this.f26984e = new t(this, this.f26980a, this.f26981b, this.f26983d);
            }
        }
        return this.f26984e;
    }
}
