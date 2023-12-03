package sv;
/* compiled from: Settings.kt */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public int f32220a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f32221b = new int[10];

    public final int a() {
        if ((this.f32220a & 128) != 0) {
            return this.f32221b[7];
        }
        return 65535;
    }

    public final void b(u other) {
        kotlin.jvm.internal.i.g(other, "other");
        int i6 = 0;
        while (i6 < 10) {
            int i10 = i6 + 1;
            boolean z10 = true;
            if (((1 << i6) & other.f32220a) == 0) {
                z10 = false;
            }
            if (z10) {
                c(i6, other.f32221b[i6]);
            }
            i6 = i10;
        }
    }

    public final void c(int i6, int i10) {
        if (i6 >= 0) {
            int[] iArr = this.f32221b;
            if (i6 < iArr.length) {
                this.f32220a = (1 << i6) | this.f32220a;
                iArr[i6] = i10;
            }
        }
    }
}
