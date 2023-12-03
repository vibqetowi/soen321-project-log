package v;

import java.util.Arrays;
import java.util.Comparator;
import v.b;
/* compiled from: PriorityGoalRow.java */
/* loaded from: classes.dex */
public final class f extends v.b {
    public i[] f;

    /* renamed from: g  reason: collision with root package name */
    public i[] f34654g;

    /* renamed from: h  reason: collision with root package name */
    public int f34655h;

    /* renamed from: i  reason: collision with root package name */
    public final b f34656i;

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<i> {
        @Override // java.util.Comparator
        public final int compare(i iVar, i iVar2) {
            return iVar.f34661v - iVar2.f34661v;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public i f34657a;

        public b() {
        }

        public final String toString() {
            String str = "[ ";
            if (this.f34657a != null) {
                for (int i6 = 0; i6 < 9; i6++) {
                    StringBuilder c10 = h.c(str);
                    c10.append(this.f34657a.B[i6]);
                    c10.append(" ");
                    str = c10.toString();
                }
            }
            StringBuilder d10 = g.d(str, "] ");
            d10.append(this.f34657a);
            return d10.toString();
        }
    }

    public f(c cVar) {
        super(cVar);
        this.f = new i[128];
        this.f34654g = new i[128];
        this.f34655h = 0;
        this.f34656i = new b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
        if (r9 < r8) goto L32;
     */
    @Override // v.b, v.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i a(boolean[] zArr) {
        int i6 = -1;
        for (int i10 = 0; i10 < this.f34655h; i10++) {
            i[] iVarArr = this.f;
            i iVar = iVarArr[i10];
            if (!zArr[iVar.f34661v]) {
                b bVar = this.f34656i;
                bVar.f34657a = iVar;
                boolean z10 = true;
                int i11 = 8;
                if (i6 == -1) {
                    while (i11 >= 0) {
                        float f = bVar.f34657a.B[i11];
                        if (f > 0.0f) {
                            break;
                        } else if (f < 0.0f) {
                            break;
                        } else {
                            i11--;
                        }
                    }
                    z10 = false;
                    if (!z10) {
                    }
                    i6 = i10;
                } else {
                    i iVar2 = iVarArr[i6];
                    while (true) {
                        if (i11 < 0) {
                            break;
                        }
                        float f2 = iVar2.B[i11];
                        float f10 = bVar.f34657a.B[i11];
                        if (f10 == f2) {
                            i11--;
                        }
                    }
                    z10 = false;
                    if (!z10) {
                    }
                    i6 = i10;
                }
            }
        }
        if (i6 == -1) {
            return null;
        }
        return this.f[i6];
    }

    @Override // v.b
    public final boolean e() {
        if (this.f34655h == 0) {
            return true;
        }
        return false;
    }

    @Override // v.b
    public final void i(d dVar, v.b bVar, boolean z10) {
        boolean z11;
        i iVar = bVar.f34625a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f34628d;
        int c10 = aVar.c();
        for (int i6 = 0; i6 < c10; i6++) {
            i d10 = aVar.d(i6);
            float g5 = aVar.g(i6);
            b bVar2 = this.f34656i;
            bVar2.f34657a = d10;
            boolean z12 = d10.f34660u;
            float[] fArr = iVar.B;
            if (z12) {
                boolean z13 = true;
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr2 = bVar2.f34657a.B;
                    float f = (fArr[i10] * g5) + fArr2[i10];
                    fArr2[i10] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        bVar2.f34657a.B[i10] = 0.0f;
                    } else {
                        z13 = false;
                    }
                }
                if (z13) {
                    f.this.k(bVar2.f34657a);
                }
                z11 = false;
            } else {
                for (int i11 = 0; i11 < 9; i11++) {
                    float f2 = fArr[i11];
                    if (f2 != 0.0f) {
                        float f10 = f2 * g5;
                        if (Math.abs(f10) < 1.0E-4f) {
                            f10 = 0.0f;
                        }
                        bVar2.f34657a.B[i11] = f10;
                    } else {
                        bVar2.f34657a.B[i11] = 0.0f;
                    }
                }
                z11 = true;
            }
            if (z11) {
                j(d10);
            }
            this.f34626b = (bVar.f34626b * g5) + this.f34626b;
        }
        k(iVar);
    }

    public final void j(i iVar) {
        int i6;
        int i10 = this.f34655h + 1;
        i[] iVarArr = this.f;
        if (i10 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f = iVarArr2;
            this.f34654g = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f;
        int i11 = this.f34655h;
        iVarArr3[i11] = iVar;
        int i12 = i11 + 1;
        this.f34655h = i12;
        if (i12 > 1 && iVarArr3[i12 - 1].f34661v > iVar.f34661v) {
            int i13 = 0;
            while (true) {
                i6 = this.f34655h;
                if (i13 >= i6) {
                    break;
                }
                this.f34654g[i13] = this.f[i13];
                i13++;
            }
            Arrays.sort(this.f34654g, 0, i6, new a());
            for (int i14 = 0; i14 < this.f34655h; i14++) {
                this.f[i14] = this.f34654g[i14];
            }
        }
        iVar.f34660u = true;
        iVar.d(this);
    }

    public final void k(i iVar) {
        int i6 = 0;
        while (i6 < this.f34655h) {
            if (this.f[i6] == iVar) {
                while (true) {
                    int i10 = this.f34655h;
                    if (i6 < i10 - 1) {
                        i[] iVarArr = this.f;
                        int i11 = i6 + 1;
                        iVarArr[i6] = iVarArr[i11];
                        i6 = i11;
                    } else {
                        this.f34655h = i10 - 1;
                        iVar.f34660u = false;
                        return;
                    }
                }
            } else {
                i6++;
            }
        }
    }

    @Override // v.b
    public final String toString() {
        String str = " goal -> (" + this.f34626b + ") : ";
        for (int i6 = 0; i6 < this.f34655h; i6++) {
            i iVar = this.f[i6];
            b bVar = this.f34656i;
            bVar.f34657a = iVar;
            str = str + bVar + " ";
        }
        return str;
    }
}
