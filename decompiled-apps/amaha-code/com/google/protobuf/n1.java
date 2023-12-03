package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Arrays;
/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes.dex */
public final class n1 {
    public static final n1 f = new n1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f10007a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f10008b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f10009c;

    /* renamed from: d  reason: collision with root package name */
    public int f10010d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10011e;

    public n1() {
        this(0, new int[8], new Object[8], true);
    }

    public final void a(int i6) {
        int[] iArr = this.f10008b;
        if (i6 > iArr.length) {
            int i10 = this.f10007a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i6) {
                i6 = i11;
            }
            if (i6 < 8) {
                i6 = 8;
            }
            this.f10008b = Arrays.copyOf(iArr, i6);
            this.f10009c = Arrays.copyOf(this.f10009c, i6);
        }
    }

    public final int b() {
        int f02;
        int i6 = this.f10010d;
        if (i6 != -1) {
            return i6;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f10007a; i11++) {
            int i12 = this.f10008b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 5) {
                                ((Integer) this.f10009c[i11]).intValue();
                                f02 = CodedOutputStream.N(i13);
                            } else {
                                int i15 = InvalidProtocolBufferException.f9872w;
                                throw new IllegalStateException(new InvalidProtocolBufferException.InvalidWireTypeException());
                            }
                        } else {
                            i10 = ((n1) this.f10009c[i11]).b() + (CodedOutputStream.c0(i13) * 2) + i10;
                        }
                    } else {
                        f02 = CodedOutputStream.K(i13, (h) this.f10009c[i11]);
                    }
                } else {
                    ((Long) this.f10009c[i11]).longValue();
                    f02 = CodedOutputStream.P(i13);
                }
            } else {
                f02 = CodedOutputStream.f0(i13, ((Long) this.f10009c[i11]).longValue());
            }
            i10 = f02 + i10;
        }
        this.f10010d = i10;
        return i10;
    }

    public final void c(int i6, Object obj) {
        if (this.f10011e) {
            a(this.f10007a + 1);
            int[] iArr = this.f10008b;
            int i10 = this.f10007a;
            iArr[i10] = i6;
            this.f10009c[i10] = obj;
            this.f10007a = i10 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(k kVar) {
        if (this.f10007a == 0) {
            return;
        }
        kVar.getClass();
        for (int i6 = 0; i6 < this.f10007a; i6++) {
            int i10 = this.f10008b[i6];
            Object obj = this.f10009c[i6];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                kVar.e(i11, ((Integer) obj).intValue());
                            } else {
                                int i13 = InvalidProtocolBufferException.f9872w;
                                throw new RuntimeException(new InvalidProtocolBufferException.InvalidWireTypeException());
                            }
                        } else {
                            CodedOutputStream codedOutputStream = kVar.f9994a;
                            codedOutputStream.z0(i11, 3);
                            ((n1) obj).d(kVar);
                            codedOutputStream.z0(i11, 4);
                        }
                    } else {
                        kVar.b(i11, (h) obj);
                    }
                } else {
                    kVar.f(i11, ((Long) obj).longValue());
                }
            } else {
                kVar.j(i11, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        int i6 = this.f10007a;
        if (i6 == n1Var.f10007a) {
            int[] iArr = this.f10008b;
            int[] iArr2 = n1Var.f10008b;
            int i10 = 0;
            while (true) {
                if (i10 < i6) {
                    if (iArr[i10] != iArr2[i10]) {
                        z10 = false;
                        break;
                    }
                    i10++;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                Object[] objArr = this.f10009c;
                Object[] objArr2 = n1Var.f10009c;
                int i11 = this.f10007a;
                int i12 = 0;
                while (true) {
                    if (i12 < i11) {
                        if (!objArr[i12].equals(objArr2[i12])) {
                            z11 = false;
                            break;
                        }
                        i12++;
                    } else {
                        z11 = true;
                        break;
                    }
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f10007a;
        int i10 = (527 + i6) * 31;
        int[] iArr = this.f10008b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i6; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.f10009c;
        int i15 = this.f10007a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }

    public n1(int i6, int[] iArr, Object[] objArr, boolean z10) {
        this.f10010d = -1;
        this.f10007a = i6;
        this.f10008b = iArr;
        this.f10009c = objArr;
        this.f10011e = z10;
    }
}
