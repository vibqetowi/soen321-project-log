package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.y2  reason: invalid package */
/* loaded from: classes.dex */
public final class y2 {
    public static final y2 f = new y2(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f8252a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f8253b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f8254c;

    /* renamed from: d  reason: collision with root package name */
    public int f8255d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8256e;

    public y2(int i6, int[] iArr, Object[] objArr, boolean z10) {
        this.f8255d = -1;
        this.f8252a = i6;
        this.f8253b = iArr;
        this.f8254c = objArr;
        this.f8256e = z10;
    }

    public static y2 b() {
        return new y2(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int L;
        int M;
        int L2;
        int i6 = this.f8255d;
        if (i6 == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f8252a; i11++) {
                int i12 = this.f8253b[i11];
                int i13 = i12 >>> 3;
                int i14 = i12 & 7;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 == 5) {
                                    ((Integer) this.f8254c[i11]).intValue();
                                    L2 = n0.L(i13 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzadn.a());
                                }
                            } else {
                                int K = n0.K(i13);
                                L = K + K;
                                M = ((y2) this.f8254c[i11]).a();
                            }
                        } else {
                            int L3 = n0.L(i13 << 3);
                            int m10 = ((h0) this.f8254c[i11]).m();
                            i10 = n0.L(m10) + m10 + L3 + i10;
                        }
                    } else {
                        ((Long) this.f8254c[i11]).longValue();
                        L2 = n0.L(i13 << 3) + 8;
                    }
                    i10 = L2 + i10;
                } else {
                    long longValue = ((Long) this.f8254c[i11]).longValue();
                    L = n0.L(i13 << 3);
                    M = n0.M(longValue);
                }
                i10 = M + L + i10;
            }
            this.f8255d = i10;
            return i10;
        }
        return i6;
    }

    public final void c(int i6, Object obj) {
        if (this.f8256e) {
            e(this.f8252a + 1);
            int[] iArr = this.f8253b;
            int i10 = this.f8252a;
            iArr[i10] = i6;
            this.f8254c[i10] = obj;
            this.f8252a = i10 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(o0 o0Var) {
        if (this.f8252a != 0) {
            for (int i6 = 0; i6 < this.f8252a; i6++) {
                int i10 = this.f8253b[i6];
                Object obj = this.f8254c[i6];
                int i11 = i10 >>> 3;
                int i12 = i10 & 7;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 5) {
                                    o0Var.i(i11, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzadn.a());
                                }
                            } else {
                                o0Var.f8021a.a0(i11, 3);
                                ((y2) obj).d(o0Var);
                                o0Var.f8021a.a0(i11, 4);
                            }
                        } else {
                            o0Var.f(i11, (h0) obj);
                        }
                    } else {
                        o0Var.j(i11, ((Long) obj).longValue());
                    }
                } else {
                    o0Var.n(i11, ((Long) obj).longValue());
                }
            }
        }
    }

    public final void e(int i6) {
        int[] iArr = this.f8253b;
        if (i6 > iArr.length) {
            int i10 = this.f8252a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i6) {
                i6 = i11;
            }
            if (i6 < 8) {
                i6 = 8;
            }
            this.f8253b = Arrays.copyOf(iArr, i6);
            this.f8254c = Arrays.copyOf(this.f8254c, i6);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        int i6 = this.f8252a;
        if (i6 == y2Var.f8252a) {
            int[] iArr = this.f8253b;
            int[] iArr2 = y2Var.f8253b;
            int i10 = 0;
            while (true) {
                if (i10 < i6) {
                    if (iArr[i10] != iArr2[i10]) {
                        break;
                    }
                    i10++;
                } else {
                    Object[] objArr = this.f8254c;
                    Object[] objArr2 = y2Var.f8254c;
                    int i11 = this.f8252a;
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
        int i6 = this.f8252a;
        int i10 = (i6 + 527) * 31;
        int[] iArr = this.f8253b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i6; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.f8254c;
        int i15 = this.f8252a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }

    public y2() {
        this(0, new int[8], new Object[8], true);
    }
}
