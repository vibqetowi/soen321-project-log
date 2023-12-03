package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a0  reason: invalid package */
/* loaded from: classes.dex */
public final class a0 {
    public static int a(byte[] bArr, int i6, z zVar) {
        int i10 = i(bArr, i6, zVar);
        int i11 = zVar.f8264b;
        if (i11 >= 0) {
            if (i11 <= bArr.length - i10) {
                if (i11 == 0) {
                    zVar.f8266d = h0.f7869v;
                    return i10;
                }
                zVar.f8266d = h0.J(i10, bArr, i11);
                return i10 + i11;
            }
            throw zzadn.e();
        }
        throw zzadn.c();
    }

    public static int b(byte[] bArr, int i6) {
        return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
    }

    public static int c(m2 m2Var, byte[] bArr, int i6, int i10, int i11, z zVar) {
        e1 d10 = m2Var.d();
        int m10 = m(d10, m2Var, bArr, i6, i10, i11, zVar);
        m2Var.a(d10);
        zVar.f8266d = d10;
        return m10;
    }

    public static int d(m2 m2Var, int i6, byte[] bArr, int i10, int i11, h1 h1Var, z zVar) {
        e1 d10 = m2Var.d();
        int n10 = n(d10, m2Var, bArr, i10, i11, zVar);
        m2Var.a(d10);
        zVar.f8266d = d10;
        h1Var.add(d10);
        while (n10 < i11) {
            int i12 = i(bArr, n10, zVar);
            if (i6 != zVar.f8264b) {
                break;
            }
            e1 d11 = m2Var.d();
            int n11 = n(d11, m2Var, bArr, i12, i11, zVar);
            m2Var.a(d11);
            zVar.f8266d = d11;
            h1Var.add(d11);
            n10 = n11;
        }
        return n10;
    }

    public static int e(byte[] bArr, int i6, h1 h1Var, z zVar) {
        f1 f1Var = (f1) h1Var;
        int i10 = i(bArr, i6, zVar);
        int i11 = zVar.f8264b + i10;
        while (i10 < i11) {
            i10 = i(bArr, i10, zVar);
            f1Var.g(zVar.f8264b);
        }
        if (i10 == i11) {
            return i10;
        }
        throw zzadn.e();
    }

    public static int f(byte[] bArr, int i6, z zVar) {
        int i10 = i(bArr, i6, zVar);
        int i11 = zVar.f8264b;
        if (i11 >= 0) {
            if (i11 == 0) {
                zVar.f8266d = "";
                return i10;
            }
            zVar.f8266d = new String(bArr, i10, i11, i1.f7886a);
            return i10 + i11;
        }
        throw zzadn.c();
    }

    public static int g(byte[] bArr, int i6, z zVar) {
        int i10 = i(bArr, i6, zVar);
        int i11 = zVar.f8264b;
        if (i11 >= 0) {
            if (i11 == 0) {
                zVar.f8266d = "";
                return i10;
            }
            zVar.f8266d = j3.d(i10, bArr, i11);
            return i10 + i11;
        }
        throw zzadn.c();
    }

    public static int h(int i6, byte[] bArr, int i10, int i11, y2 y2Var, z zVar) {
        if ((i6 >>> 3) != 0) {
            int i12 = i6 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                y2Var.c(i6, Integer.valueOf(b(bArr, i10)));
                                return i10 + 4;
                            }
                            throw new zzadn("Protocol message contained an invalid tag (zero).");
                        }
                        int i13 = (i6 & (-8)) | 4;
                        y2 b10 = y2.b();
                        int i14 = 0;
                        while (true) {
                            if (i10 >= i11) {
                                break;
                            }
                            int i15 = i(bArr, i10, zVar);
                            int i16 = zVar.f8264b;
                            if (i16 == i13) {
                                i14 = i16;
                                i10 = i15;
                                break;
                            }
                            i14 = i16;
                            i10 = h(i16, bArr, i15, i11, b10, zVar);
                        }
                        if (i10 <= i11 && i14 == i13) {
                            y2Var.c(i6, b10);
                            return i10;
                        }
                        throw zzadn.d();
                    }
                    int i17 = i(bArr, i10, zVar);
                    int i18 = zVar.f8264b;
                    if (i18 >= 0) {
                        if (i18 <= bArr.length - i17) {
                            if (i18 == 0) {
                                y2Var.c(i6, h0.f7869v);
                            } else {
                                y2Var.c(i6, h0.J(i17, bArr, i18));
                            }
                            return i17 + i18;
                        }
                        throw zzadn.e();
                    }
                    throw zzadn.c();
                }
                y2Var.c(i6, Long.valueOf(o(bArr, i10)));
                return i10 + 8;
            }
            int l2 = l(bArr, i10, zVar);
            y2Var.c(i6, Long.valueOf(zVar.f8265c));
            return l2;
        }
        throw new zzadn("Protocol message contained an invalid tag (zero).");
    }

    public static int i(byte[] bArr, int i6, z zVar) {
        int i10 = i6 + 1;
        byte b10 = bArr[i6];
        if (b10 >= 0) {
            zVar.f8264b = b10;
            return i10;
        }
        return j(b10, bArr, i10, zVar);
    }

    public static int j(int i6, byte[] bArr, int i10, z zVar) {
        int i11 = i6 & 127;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zVar.f8264b = i11 | (b10 << 7);
            return i12;
        }
        int i13 = i11 | ((b10 & Byte.MAX_VALUE) << 7);
        int i14 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zVar.f8264b = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 14);
        int i16 = i14 + 1;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zVar.f8264b = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
        int i18 = i16 + 1;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zVar.f8264b = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] < 0) {
                i18 = i20;
            } else {
                zVar.f8264b = i19;
                return i20;
            }
        }
    }

    public static int k(int i6, byte[] bArr, int i10, int i11, h1 h1Var, z zVar) {
        f1 f1Var = (f1) h1Var;
        int i12 = i(bArr, i10, zVar);
        f1Var.g(zVar.f8264b);
        while (i12 < i11) {
            int i13 = i(bArr, i12, zVar);
            if (i6 != zVar.f8264b) {
                break;
            }
            i12 = i(bArr, i13, zVar);
            f1Var.g(zVar.f8264b);
        }
        return i12;
    }

    public static int l(byte[] bArr, int i6, z zVar) {
        byte b10;
        int i10 = i6 + 1;
        long j10 = bArr[i6];
        if (j10 >= 0) {
            zVar.f8265c = j10;
            return i10;
        }
        int i11 = i10 + 1;
        byte b11 = bArr[i10];
        long j11 = (j10 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b11 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j11 |= (b10 & Byte.MAX_VALUE) << i12;
            b11 = bArr[i11];
            i11 = i13;
        }
        zVar.f8265c = j11;
        return i11;
    }

    public static int m(Object obj, m2 m2Var, byte[] bArr, int i6, int i10, int i11, z zVar) {
        int I = ((e2) m2Var).I(obj, bArr, i6, i10, i11, zVar);
        zVar.f8266d = obj;
        return I;
    }

    public static int n(Object obj, m2 m2Var, byte[] bArr, int i6, int i10, z zVar) {
        int i11 = i6 + 1;
        int i12 = bArr[i6];
        if (i12 < 0) {
            i11 = j(i12, bArr, i11, zVar);
            i12 = zVar.f8264b;
        }
        int i13 = i11;
        if (i12 >= 0 && i12 <= i10 - i13) {
            int i14 = i12 + i13;
            m2Var.i(obj, bArr, i13, i14, zVar);
            zVar.f8266d = obj;
            return i14;
        }
        throw zzadn.e();
    }

    public static long o(byte[] bArr, int i6) {
        return ((bArr[i6 + 7] & 255) << 56) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
    }
}
