package com.google.android.gms.internal.measurement;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class s7 {
    public static final s7 f = new s7(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f8595a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f8596b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f8597c;

    /* renamed from: d  reason: collision with root package name */
    public int f8598d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8599e;

    public s7(int i6, int[] iArr, Object[] objArr, boolean z10) {
        this.f8598d = -1;
        this.f8595a = i6;
        this.f8596b = iArr;
        this.f8597c = objArr;
        this.f8599e = z10;
    }

    public static s7 b() {
        return new s7(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int V;
        int X;
        int V2;
        int i6 = this.f8598d;
        if (i6 == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f8595a; i11++) {
                int i12 = this.f8596b[i11];
                int i13 = i12 >>> 3;
                int i14 = i12 & 7;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 == 5) {
                                    ((Integer) this.f8597c[i11]).intValue();
                                    V2 = e5.V(i13 << 3) + 4;
                                } else {
                                    int i15 = zzkp.f8736u;
                                    throw new IllegalStateException(new zzko());
                                }
                            } else {
                                int q02 = e5.q0(i13);
                                V = q02 + q02;
                                X = ((s7) this.f8597c[i11]).a();
                            }
                        } else {
                            int V3 = e5.V(i13 << 3);
                            int m10 = ((b5) this.f8597c[i11]).m();
                            i10 = e5.V(m10) + m10 + V3 + i10;
                        }
                    } else {
                        ((Long) this.f8597c[i11]).longValue();
                        V2 = e5.V(i13 << 3) + 8;
                    }
                    i10 = V2 + i10;
                } else {
                    long longValue = ((Long) this.f8597c[i11]).longValue();
                    V = e5.V(i13 << 3);
                    X = e5.X(longValue);
                }
                i10 = X + V + i10;
            }
            this.f8598d = i10;
            return i10;
        }
        return i6;
    }

    public final void c(int i6, Object obj) {
        if (this.f8599e) {
            e(this.f8595a + 1);
            int[] iArr = this.f8596b;
            int i10 = this.f8595a;
            iArr[i10] = i6;
            this.f8597c[i10] = obj;
            this.f8595a = i10 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(f5 f5Var) {
        if (this.f8595a != 0) {
            for (int i6 = 0; i6 < this.f8595a; i6++) {
                int i10 = this.f8596b[i6];
                Object obj = this.f8597c[i6];
                int i11 = i10 >>> 3;
                int i12 = i10 & 7;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 5) {
                                    f5Var.i(i11, ((Integer) obj).intValue());
                                } else {
                                    int i13 = zzkp.f8736u;
                                    throw new RuntimeException(new zzko());
                                }
                            } else {
                                f5Var.f8376a.i0(i11, 3);
                                ((s7) obj).d(f5Var);
                                f5Var.f8376a.i0(i11, 4);
                            }
                        } else {
                            f5Var.f(i11, (b5) obj);
                        }
                    } else {
                        f5Var.j(i11, ((Long) obj).longValue());
                    }
                } else {
                    f5Var.n(i11, ((Long) obj).longValue());
                }
            }
        }
    }

    public final void e(int i6) {
        int[] iArr = this.f8596b;
        if (i6 > iArr.length) {
            int i10 = this.f8595a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i6) {
                i6 = i11;
            }
            if (i6 < 8) {
                i6 = 8;
            }
            this.f8596b = Arrays.copyOf(iArr, i6);
            this.f8597c = Arrays.copyOf(this.f8597c, i6);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s7)) {
            return false;
        }
        s7 s7Var = (s7) obj;
        int i6 = this.f8595a;
        if (i6 == s7Var.f8595a) {
            int[] iArr = this.f8596b;
            int[] iArr2 = s7Var.f8596b;
            int i10 = 0;
            while (true) {
                if (i10 < i6) {
                    if (iArr[i10] != iArr2[i10]) {
                        break;
                    }
                    i10++;
                } else {
                    Object[] objArr = this.f8597c;
                    Object[] objArr2 = s7Var.f8597c;
                    int i11 = this.f8595a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f8595a;
        int i10 = (i6 + 527) * 31;
        int[] iArr = this.f8596b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i6; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.f8597c;
        int i15 = this.f8595a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }

    public s7() {
        this(0, new int[8], new Object[8], true);
    }
}
