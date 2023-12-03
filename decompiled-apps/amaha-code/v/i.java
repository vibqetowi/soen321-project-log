package v;

import java.util.Arrays;
/* compiled from: SolverVariable.java */
/* loaded from: classes.dex */
public final class i implements Comparable<i> {
    public int C;

    /* renamed from: u  reason: collision with root package name */
    public boolean f34660u;

    /* renamed from: y  reason: collision with root package name */
    public float f34664y;

    /* renamed from: v  reason: collision with root package name */
    public int f34661v = -1;

    /* renamed from: w  reason: collision with root package name */
    public int f34662w = -1;

    /* renamed from: x  reason: collision with root package name */
    public int f34663x = 0;

    /* renamed from: z  reason: collision with root package name */
    public boolean f34665z = false;
    public final float[] A = new float[9];
    public final float[] B = new float[9];
    public b[] D = new b[16];
    public int E = 0;
    public int F = 0;

    public i(int i6) {
        this.C = i6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(i iVar) {
        return this.f34661v - iVar.f34661v;
    }

    public final void d(b bVar) {
        int i6 = 0;
        while (true) {
            int i10 = this.E;
            if (i6 < i10) {
                if (this.D[i6] == bVar) {
                    return;
                }
                i6++;
            } else {
                b[] bVarArr = this.D;
                if (i10 >= bVarArr.length) {
                    this.D = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.D;
                int i11 = this.E;
                bVarArr2[i11] = bVar;
                this.E = i11 + 1;
                return;
            }
        }
    }

    public final void f(b bVar) {
        int i6 = this.E;
        int i10 = 0;
        while (i10 < i6) {
            if (this.D[i10] == bVar) {
                while (i10 < i6 - 1) {
                    b[] bVarArr = this.D;
                    int i11 = i10 + 1;
                    bVarArr[i10] = bVarArr[i11];
                    i10 = i11;
                }
                this.E--;
                return;
            }
            i10++;
        }
    }

    public final void h() {
        this.C = 5;
        this.f34663x = 0;
        this.f34661v = -1;
        this.f34662w = -1;
        this.f34664y = 0.0f;
        this.f34665z = false;
        int i6 = this.E;
        for (int i10 = 0; i10 < i6; i10++) {
            this.D[i10] = null;
        }
        this.E = 0;
        this.F = 0;
        this.f34660u = false;
        Arrays.fill(this.B, 0.0f);
    }

    public final void i(d dVar, float f) {
        this.f34664y = f;
        this.f34665z = true;
        int i6 = this.E;
        this.f34662w = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            this.D[i10].h(dVar, this, false);
        }
        this.E = 0;
    }

    public final void j(d dVar, b bVar) {
        int i6 = this.E;
        for (int i10 = 0; i10 < i6; i10++) {
            this.D[i10].i(dVar, bVar, false);
        }
        this.E = 0;
    }

    public final String toString() {
        return "" + this.f34661v;
    }
}
