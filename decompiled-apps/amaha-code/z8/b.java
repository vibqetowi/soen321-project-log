package z8;

import com.google.android.exoplayer2.n;
import java.util.Arrays;
import o8.o;
/* compiled from: BaseTrackSelection.java */
/* loaded from: classes.dex */
public abstract class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final o f39268a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39269b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f39270c;

    /* renamed from: d  reason: collision with root package name */
    public final n[] f39271d;

    /* renamed from: e  reason: collision with root package name */
    public int f39272e;

    public b(o oVar, int[] iArr) {
        boolean z10;
        n[] nVarArr;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        oVar.getClass();
        this.f39268a = oVar;
        int length = iArr.length;
        this.f39269b = length;
        this.f39271d = new n[length];
        int i6 = 0;
        while (true) {
            int length2 = iArr.length;
            nVarArr = oVar.f27303v;
            if (i6 >= length2) {
                break;
            }
            this.f39271d[i6] = nVarArr[iArr[i6]];
            i6++;
        }
        Arrays.sort(this.f39271d, new p0.d(9));
        this.f39270c = new int[this.f39269b];
        int i10 = 0;
        while (true) {
            int i11 = this.f39269b;
            if (i10 < i11) {
                int[] iArr2 = this.f39270c;
                n nVar = this.f39271d[i10];
                int i12 = 0;
                while (true) {
                    if (i12 < nVarArr.length) {
                        if (nVar == nVarArr[i12]) {
                            break;
                        }
                        i12++;
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                iArr2[i10] = i12;
                i10++;
            } else {
                long[] jArr = new long[i11];
                return;
            }
        }
    }

    @Override // z8.g
    public final o b() {
        return this.f39268a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f39268a == bVar.f39268a && Arrays.equals(this.f39270c, bVar.f39270c)) {
            return true;
        }
        return false;
    }

    @Override // z8.g
    public final n f(int i6) {
        return this.f39271d[i6];
    }

    @Override // z8.g
    public final int h(int i6) {
        return this.f39270c[i6];
    }

    public final int hashCode() {
        if (this.f39272e == 0) {
            this.f39272e = Arrays.hashCode(this.f39270c) + (System.identityHashCode(this.f39268a) * 31);
        }
        return this.f39272e;
    }

    @Override // z8.d
    public final n i() {
        c();
        return this.f39271d[0];
    }

    @Override // z8.g
    public final int l(int i6) {
        for (int i10 = 0; i10 < this.f39269b; i10++) {
            if (this.f39270c[i10] == i6) {
                return i10;
            }
        }
        return -1;
    }

    @Override // z8.g
    public final int length() {
        return this.f39270c.length;
    }

    @Override // z8.d
    public final /* synthetic */ void a() {
    }

    @Override // z8.d
    public void d() {
    }

    @Override // z8.d
    public void e() {
    }

    @Override // z8.d
    public void g() {
    }

    @Override // z8.d
    public final /* synthetic */ void j() {
    }

    @Override // z8.d
    public final /* synthetic */ void k() {
    }
}
