package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.e0;
/* compiled from: AbstractConcatenatedTimeline.java */
/* loaded from: classes.dex */
public abstract class a extends e0 {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f6162y = 0;

    /* renamed from: v  reason: collision with root package name */
    public final int f6163v;

    /* renamed from: w  reason: collision with root package name */
    public final o8.l f6164w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f6165x = false;

    public a(o8.l lVar) {
        this.f6164w = lVar;
        this.f6163v = lVar.getLength();
    }

    @Override // com.google.android.exoplayer2.e0
    public final int b(boolean z10) {
        if (this.f6163v == 0) {
            return -1;
        }
        int i6 = 0;
        if (this.f6165x) {
            z10 = false;
        }
        if (z10) {
            i6 = this.f6164w.a();
        }
        do {
            o7.t tVar = (o7.t) this;
            e0[] e0VarArr = tVar.D;
            if (e0VarArr[i6].q()) {
                i6 = s(i6, z10);
            } else {
                return e0VarArr[i6].b(z10) + tVar.C[i6];
            }
        } while (i6 != -1);
        return -1;
    }

    @Override // com.google.android.exoplayer2.e0
    public final int c(Object obj) {
        int intValue;
        int c10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        o7.t tVar = (o7.t) this;
        Integer num = tVar.F.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        if (intValue == -1 || (c10 = tVar.D[intValue].c(obj3)) == -1) {
            return -1;
        }
        return tVar.B[intValue] + c10;
    }

    @Override // com.google.android.exoplayer2.e0
    public final int d(boolean z10) {
        int i6;
        int i10 = this.f6163v;
        if (i10 == 0) {
            return -1;
        }
        if (this.f6165x) {
            z10 = false;
        }
        o8.l lVar = this.f6164w;
        if (z10) {
            i6 = lVar.f();
        } else {
            i6 = i10 - 1;
        }
        do {
            o7.t tVar = (o7.t) this;
            e0[] e0VarArr = tVar.D;
            if (e0VarArr[i6].q()) {
                if (z10) {
                    i6 = lVar.c(i6);
                    continue;
                } else if (i6 > 0) {
                    i6--;
                    continue;
                } else {
                    i6 = -1;
                    continue;
                }
            } else {
                return e0VarArr[i6].d(z10) + tVar.C[i6];
            }
        } while (i6 != -1);
        return -1;
    }

    @Override // com.google.android.exoplayer2.e0
    public final int f(int i6, int i10, boolean z10) {
        int i11 = 0;
        if (this.f6165x) {
            if (i10 == 1) {
                i10 = 2;
            }
            z10 = false;
        }
        o7.t tVar = (o7.t) this;
        int[] iArr = tVar.C;
        int e10 = c9.w.e(iArr, i6 + 1);
        int i12 = iArr[e10];
        e0[] e0VarArr = tVar.D;
        e0 e0Var = e0VarArr[e10];
        int i13 = i6 - i12;
        if (i10 != 2) {
            i11 = i10;
        }
        int f = e0Var.f(i13, i11, z10);
        if (f != -1) {
            return i12 + f;
        }
        int s10 = s(e10, z10);
        while (s10 != -1 && e0VarArr[s10].q()) {
            s10 = s(s10, z10);
        }
        if (s10 != -1) {
            return e0VarArr[s10].b(z10) + iArr[s10];
        } else if (i10 != 2) {
            return -1;
        } else {
            return b(z10);
        }
    }

    @Override // com.google.android.exoplayer2.e0
    public final e0.b g(int i6, e0.b bVar, boolean z10) {
        o7.t tVar = (o7.t) this;
        int[] iArr = tVar.B;
        int e10 = c9.w.e(iArr, i6 + 1);
        int i10 = tVar.C[e10];
        tVar.D[e10].g(i6 - iArr[e10], bVar, z10);
        bVar.f6467w += i10;
        if (z10) {
            Object obj = tVar.E[e10];
            Object obj2 = bVar.f6466v;
            obj2.getClass();
            bVar.f6466v = Pair.create(obj, obj2);
        }
        return bVar;
    }

    @Override // com.google.android.exoplayer2.e0
    public final e0.b h(Object obj, e0.b bVar) {
        int intValue;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        o7.t tVar = (o7.t) this;
        Integer num = tVar.F.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i6 = tVar.C[intValue];
        tVar.D[intValue].h(obj3, bVar);
        bVar.f6467w += i6;
        bVar.f6466v = obj;
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0037 -> B:22:0x0038). Please submit an issue!!! */
    @Override // com.google.android.exoplayer2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(int i6, int i10, boolean z10) {
        int i11;
        int i12 = 0;
        if (this.f6165x) {
            if (i10 == 1) {
                i10 = 2;
            }
            z10 = false;
        }
        o7.t tVar = (o7.t) this;
        int[] iArr = tVar.C;
        int e10 = c9.w.e(iArr, i6 + 1);
        int i13 = iArr[e10];
        e0[] e0VarArr = tVar.D;
        e0 e0Var = e0VarArr[e10];
        int i14 = i6 - i13;
        if (i10 != 2) {
            i12 = i10;
        }
        int l2 = e0Var.l(i14, i12, z10);
        if (l2 != -1) {
            return i13 + l2;
        }
        o8.l lVar = this.f6164w;
        if (z10) {
            i11 = lVar.c(e10);
        } else {
            if (e10 > 0) {
                i11 = e10 - 1;
            }
            i11 = -1;
        }
        while (i11 != -1 && e0VarArr[i11].q()) {
            if (z10) {
                if (i11 <= 0) {
                    i11 = -1;
                    while (i11 != -1) {
                        if (z10) {
                            i11 = lVar.c(i11);
                        }
                    }
                } else {
                    i11--;
                }
            }
        }
        if (i11 != -1) {
            return e0VarArr[i11].d(z10) + iArr[i11];
        } else if (i10 != 2) {
            return -1;
        } else {
            return d(z10);
        }
    }

    @Override // com.google.android.exoplayer2.e0
    public final Object m(int i6) {
        o7.t tVar = (o7.t) this;
        int[] iArr = tVar.B;
        int e10 = c9.w.e(iArr, i6 + 1);
        return Pair.create(tVar.E[e10], tVar.D[e10].m(i6 - iArr[e10]));
    }

    @Override // com.google.android.exoplayer2.e0
    public final e0.c o(int i6, e0.c cVar, long j10) {
        o7.t tVar = (o7.t) this;
        int[] iArr = tVar.C;
        int e10 = c9.w.e(iArr, i6 + 1);
        int i10 = iArr[e10];
        int i11 = tVar.B[e10];
        tVar.D[e10].o(i6 - i10, cVar, j10);
        Object obj = tVar.E[e10];
        if (!e0.c.L.equals(cVar.f6471u)) {
            obj = Pair.create(obj, cVar.f6471u);
        }
        cVar.f6471u = obj;
        cVar.I += i11;
        cVar.J += i11;
        return cVar;
    }

    public final int s(int i6, boolean z10) {
        if (z10) {
            return this.f6164w.d(i6);
        }
        if (i6 < this.f6163v - 1) {
            return i6 + 1;
        }
        return -1;
    }
}
