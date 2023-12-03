package jv;

import java.util.Arrays;
import jv.b;
/* compiled from: AbstractSharedFlow.kt */
/* loaded from: classes2.dex */
public abstract class a<S extends b<?>> {

    /* renamed from: u  reason: collision with root package name */
    public S[] f22636u;

    /* renamed from: v  reason: collision with root package name */
    public int f22637v;

    /* renamed from: w  reason: collision with root package name */
    public int f22638w;

    public final S c() {
        S s10;
        synchronized (this) {
            S[] sArr = this.f22636u;
            if (sArr == null) {
                sArr = (S[]) e();
                this.f22636u = sArr;
            } else if (this.f22637v >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                kotlin.jvm.internal.i.f(copyOf, "copyOf(this, newSize)");
                this.f22636u = (S[]) ((b[]) copyOf);
                sArr = (S[]) ((b[]) copyOf);
            }
            int i6 = this.f22638w;
            do {
                s10 = sArr[i6];
                if (s10 == null) {
                    s10 = d();
                    sArr[i6] = s10;
                }
                i6++;
                if (i6 >= sArr.length) {
                    i6 = 0;
                }
            } while (!s10.a(this));
            this.f22638w = i6;
            this.f22637v++;
        }
        return s10;
    }

    public abstract S d();

    public abstract b[] e();

    public final void f(S s10) {
        int i6;
        ls.d[] b10;
        synchronized (this) {
            int i10 = this.f22637v - 1;
            this.f22637v = i10;
            if (i10 == 0) {
                this.f22638w = 0;
            }
            b10 = s10.b(this);
        }
        for (ls.d dVar : b10) {
            if (dVar != null) {
                dVar.resumeWith(hs.k.f19476a);
            }
        }
    }
}
