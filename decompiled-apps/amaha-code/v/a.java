package v;

import java.util.Arrays;
import v.b;
/* compiled from: ArrayLinkedVariables.java */
/* loaded from: classes.dex */
public final class a implements b.a {

    /* renamed from: b  reason: collision with root package name */
    public final b f34617b;

    /* renamed from: c  reason: collision with root package name */
    public final c f34618c;

    /* renamed from: a  reason: collision with root package name */
    public int f34616a = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f34619d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f34620e = new int[8];
    public int[] f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f34621g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f34622h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f34623i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f34624j = false;

    public a(b bVar, c cVar) {
        this.f34617b = bVar;
        this.f34618c = cVar;
    }

    @Override // v.b.a
    public final float a(b bVar, boolean z10) {
        float j10 = j(bVar.f34625a);
        h(bVar.f34625a, z10);
        b.a aVar = bVar.f34628d;
        int c10 = aVar.c();
        for (int i6 = 0; i6 < c10; i6++) {
            i d10 = aVar.d(i6);
            i(d10, aVar.j(d10) * j10, z10);
        }
        return j10;
    }

    @Override // v.b.a
    public final void b(i iVar, float f) {
        if (f == 0.0f) {
            h(iVar, true);
            return;
        }
        int i6 = this.f34622h;
        b bVar = this.f34617b;
        if (i6 == -1) {
            this.f34622h = 0;
            this.f34621g[0] = f;
            this.f34620e[0] = iVar.f34661v;
            this.f[0] = -1;
            iVar.F++;
            iVar.d(bVar);
            this.f34616a++;
            if (!this.f34624j) {
                int i10 = this.f34623i + 1;
                this.f34623i = i10;
                int[] iArr = this.f34620e;
                if (i10 >= iArr.length) {
                    this.f34624j = true;
                    this.f34623i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i6 != -1 && i12 < this.f34616a; i12++) {
            int i13 = this.f34620e[i6];
            int i14 = iVar.f34661v;
            if (i13 == i14) {
                this.f34621g[i6] = f;
                return;
            }
            if (i13 < i14) {
                i11 = i6;
            }
            i6 = this.f[i6];
        }
        int i15 = this.f34623i;
        int i16 = i15 + 1;
        if (this.f34624j) {
            int[] iArr2 = this.f34620e;
            if (iArr2[i15] != -1) {
                i15 = iArr2.length;
            }
        } else {
            i15 = i16;
        }
        int[] iArr3 = this.f34620e;
        if (i15 >= iArr3.length && this.f34616a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f34620e;
                if (i17 >= iArr4.length) {
                    break;
                } else if (iArr4[i17] == -1) {
                    i15 = i17;
                    break;
                } else {
                    i17++;
                }
            }
        }
        int[] iArr5 = this.f34620e;
        if (i15 >= iArr5.length) {
            i15 = iArr5.length;
            int i18 = this.f34619d * 2;
            this.f34619d = i18;
            this.f34624j = false;
            this.f34623i = i15 - 1;
            this.f34621g = Arrays.copyOf(this.f34621g, i18);
            this.f34620e = Arrays.copyOf(this.f34620e, this.f34619d);
            this.f = Arrays.copyOf(this.f, this.f34619d);
        }
        this.f34620e[i15] = iVar.f34661v;
        this.f34621g[i15] = f;
        if (i11 != -1) {
            int[] iArr6 = this.f;
            iArr6[i15] = iArr6[i11];
            iArr6[i11] = i15;
        } else {
            this.f[i15] = this.f34622h;
            this.f34622h = i15;
        }
        iVar.F++;
        iVar.d(bVar);
        int i19 = this.f34616a + 1;
        this.f34616a = i19;
        if (!this.f34624j) {
            this.f34623i++;
        }
        int[] iArr7 = this.f34620e;
        if (i19 >= iArr7.length) {
            this.f34624j = true;
        }
        if (this.f34623i >= iArr7.length) {
            this.f34624j = true;
            this.f34623i = iArr7.length - 1;
        }
    }

    @Override // v.b.a
    public final int c() {
        return this.f34616a;
    }

    @Override // v.b.a
    public final void clear() {
        int i6 = this.f34622h;
        for (int i10 = 0; i6 != -1 && i10 < this.f34616a; i10++) {
            i iVar = ((i[]) this.f34618c.f34634y)[this.f34620e[i6]];
            if (iVar != null) {
                iVar.f(this.f34617b);
            }
            i6 = this.f[i6];
        }
        this.f34622h = -1;
        this.f34623i = -1;
        this.f34624j = false;
        this.f34616a = 0;
    }

    @Override // v.b.a
    public final i d(int i6) {
        int i10 = this.f34622h;
        for (int i11 = 0; i10 != -1 && i11 < this.f34616a; i11++) {
            if (i11 == i6) {
                return ((i[]) this.f34618c.f34634y)[this.f34620e[i10]];
            }
            i10 = this.f[i10];
        }
        return null;
    }

    @Override // v.b.a
    public final boolean e(i iVar) {
        int i6 = this.f34622h;
        if (i6 == -1) {
            return false;
        }
        for (int i10 = 0; i6 != -1 && i10 < this.f34616a; i10++) {
            if (this.f34620e[i6] == iVar.f34661v) {
                return true;
            }
            i6 = this.f[i6];
        }
        return false;
    }

    @Override // v.b.a
    public final void f() {
        int i6 = this.f34622h;
        for (int i10 = 0; i6 != -1 && i10 < this.f34616a; i10++) {
            float[] fArr = this.f34621g;
            fArr[i6] = fArr[i6] * (-1.0f);
            i6 = this.f[i6];
        }
    }

    @Override // v.b.a
    public final float g(int i6) {
        int i10 = this.f34622h;
        for (int i11 = 0; i10 != -1 && i11 < this.f34616a; i11++) {
            if (i11 == i6) {
                return this.f34621g[i10];
            }
            i10 = this.f[i10];
        }
        return 0.0f;
    }

    @Override // v.b.a
    public final float h(i iVar, boolean z10) {
        int i6 = this.f34622h;
        if (i6 == -1) {
            return 0.0f;
        }
        int i10 = 0;
        int i11 = -1;
        while (i6 != -1 && i10 < this.f34616a) {
            if (this.f34620e[i6] == iVar.f34661v) {
                if (i6 == this.f34622h) {
                    this.f34622h = this.f[i6];
                } else {
                    int[] iArr = this.f;
                    iArr[i11] = iArr[i6];
                }
                if (z10) {
                    iVar.f(this.f34617b);
                }
                iVar.F--;
                this.f34616a--;
                this.f34620e[i6] = -1;
                if (this.f34624j) {
                    this.f34623i = i6;
                }
                return this.f34621g[i6];
            }
            i10++;
            i11 = i6;
            i6 = this.f[i6];
        }
        return 0.0f;
    }

    @Override // v.b.a
    public final void i(i iVar, float f, boolean z10) {
        if (f > -0.001f && f < 0.001f) {
            return;
        }
        int i6 = this.f34622h;
        b bVar = this.f34617b;
        if (i6 == -1) {
            this.f34622h = 0;
            this.f34621g[0] = f;
            this.f34620e[0] = iVar.f34661v;
            this.f[0] = -1;
            iVar.F++;
            iVar.d(bVar);
            this.f34616a++;
            if (!this.f34624j) {
                int i10 = this.f34623i + 1;
                this.f34623i = i10;
                int[] iArr = this.f34620e;
                if (i10 >= iArr.length) {
                    this.f34624j = true;
                    this.f34623i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i6 != -1 && i12 < this.f34616a; i12++) {
            int i13 = this.f34620e[i6];
            int i14 = iVar.f34661v;
            if (i13 == i14) {
                float[] fArr = this.f34621g;
                float f2 = fArr[i6] + f;
                if (f2 > -0.001f && f2 < 0.001f) {
                    f2 = 0.0f;
                }
                fArr[i6] = f2;
                if (f2 == 0.0f) {
                    if (i6 == this.f34622h) {
                        this.f34622h = this.f[i6];
                    } else {
                        int[] iArr2 = this.f;
                        iArr2[i11] = iArr2[i6];
                    }
                    if (z10) {
                        iVar.f(bVar);
                    }
                    if (this.f34624j) {
                        this.f34623i = i6;
                    }
                    iVar.F--;
                    this.f34616a--;
                    return;
                }
                return;
            }
            if (i13 < i14) {
                i11 = i6;
            }
            i6 = this.f[i6];
        }
        int i15 = this.f34623i;
        int i16 = i15 + 1;
        if (this.f34624j) {
            int[] iArr3 = this.f34620e;
            if (iArr3[i15] != -1) {
                i15 = iArr3.length;
            }
        } else {
            i15 = i16;
        }
        int[] iArr4 = this.f34620e;
        if (i15 >= iArr4.length && this.f34616a < iArr4.length) {
            int i17 = 0;
            while (true) {
                int[] iArr5 = this.f34620e;
                if (i17 >= iArr5.length) {
                    break;
                } else if (iArr5[i17] == -1) {
                    i15 = i17;
                    break;
                } else {
                    i17++;
                }
            }
        }
        int[] iArr6 = this.f34620e;
        if (i15 >= iArr6.length) {
            i15 = iArr6.length;
            int i18 = this.f34619d * 2;
            this.f34619d = i18;
            this.f34624j = false;
            this.f34623i = i15 - 1;
            this.f34621g = Arrays.copyOf(this.f34621g, i18);
            this.f34620e = Arrays.copyOf(this.f34620e, this.f34619d);
            this.f = Arrays.copyOf(this.f, this.f34619d);
        }
        this.f34620e[i15] = iVar.f34661v;
        this.f34621g[i15] = f;
        if (i11 != -1) {
            int[] iArr7 = this.f;
            iArr7[i15] = iArr7[i11];
            iArr7[i11] = i15;
        } else {
            this.f[i15] = this.f34622h;
            this.f34622h = i15;
        }
        iVar.F++;
        iVar.d(bVar);
        this.f34616a++;
        if (!this.f34624j) {
            this.f34623i++;
        }
        int i19 = this.f34623i;
        int[] iArr8 = this.f34620e;
        if (i19 >= iArr8.length) {
            this.f34624j = true;
            this.f34623i = iArr8.length - 1;
        }
    }

    @Override // v.b.a
    public final float j(i iVar) {
        int i6 = this.f34622h;
        for (int i10 = 0; i6 != -1 && i10 < this.f34616a; i10++) {
            if (this.f34620e[i6] == iVar.f34661v) {
                return this.f34621g[i6];
            }
            i6 = this.f[i6];
        }
        return 0.0f;
    }

    @Override // v.b.a
    public final void k(float f) {
        int i6 = this.f34622h;
        for (int i10 = 0; i6 != -1 && i10 < this.f34616a; i10++) {
            float[] fArr = this.f34621g;
            fArr[i6] = fArr[i6] / f;
            i6 = this.f[i6];
        }
    }

    public final String toString() {
        int i6 = this.f34622h;
        String str = "";
        for (int i10 = 0; i6 != -1 && i10 < this.f34616a; i10++) {
            StringBuilder c10 = h.c(pl.a.f(str, " -> "));
            c10.append(this.f34621g[i6]);
            c10.append(" : ");
            StringBuilder c11 = h.c(c10.toString());
            c11.append(((i[]) this.f34618c.f34634y)[this.f34620e[i6]]);
            str = c11.toString();
            i6 = this.f[i6];
        }
        return str;
    }
}
