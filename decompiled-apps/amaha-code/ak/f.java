package ak;

import kotlin.jvm.internal.h;
/* compiled from: OnPageChangeListenerHelper.kt */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public int f609a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f610b = -1;

    public abstract int a();

    public final void b(float f, int i6) {
        boolean z10;
        float f2 = i6 + f;
        float a10 = a() - 1;
        if (f2 == a10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f2 = a10 - 1.0E-4f;
        }
        int i10 = (int) f2;
        int i11 = i10 + 1;
        if (i11 <= a10 && i10 >= 0) {
            c(f2 % 1, i10, i11);
            int i12 = this.f609a;
            if (i12 != -1) {
                if (i10 > i12) {
                    xs.e it = h.k0(i12, i10).iterator();
                    while (it.f38001w) {
                        d(it.nextInt());
                    }
                }
                int i13 = this.f610b;
                if (i11 < i13) {
                    d(i13);
                    xs.e it2 = new xs.f(i11 + 1, this.f610b).iterator();
                    while (it2.f38001w) {
                        d(it2.nextInt());
                    }
                }
            }
            this.f609a = i10;
            this.f610b = i11;
        }
    }

    public abstract void c(float f, int i6, int i10);

    public abstract void d(int i6);
}
