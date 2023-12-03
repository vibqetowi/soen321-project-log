package b9;

import c9.w;
import java.util.Arrays;
/* compiled from: DefaultAllocator.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d  reason: collision with root package name */
    public int f4140d;

    /* renamed from: e  reason: collision with root package name */
    public int f4141e;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4137a = true;

    /* renamed from: b  reason: collision with root package name */
    public final int f4138b = 65536;
    public int f = 0;

    /* renamed from: g  reason: collision with root package name */
    public a[] f4142g = new a[100];

    /* renamed from: c  reason: collision with root package name */
    public final a[] f4139c = new a[1];

    public final synchronized void a(a[] aVarArr) {
        int i6 = this.f;
        int length = aVarArr.length + i6;
        a[] aVarArr2 = this.f4142g;
        if (length >= aVarArr2.length) {
            this.f4142g = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i6 + aVarArr.length));
        }
        for (a aVar : aVarArr) {
            a[] aVarArr3 = this.f4142g;
            int i10 = this.f;
            this.f = i10 + 1;
            aVarArr3[i10] = aVar;
        }
        this.f4141e -= aVarArr.length;
        notifyAll();
    }

    public final synchronized void b(int i6) {
        boolean z10;
        if (i6 < this.f4140d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f4140d = i6;
        if (z10) {
            c();
        }
    }

    public final synchronized void c() {
        int i6 = this.f4140d;
        int i10 = this.f4138b;
        int i11 = w.f5205a;
        int max = Math.max(0, (((i6 + i10) - 1) / i10) - this.f4141e);
        int i12 = this.f;
        if (max >= i12) {
            return;
        }
        Arrays.fill(this.f4142g, max, i12, (Object) null);
        this.f = max;
    }
}
