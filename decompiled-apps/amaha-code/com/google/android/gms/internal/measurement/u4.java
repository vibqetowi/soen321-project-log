package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class u4 {
    public static int a(byte[] bArr, int i6, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        int i10 = i(bArr, i6, zVar);
        int i11 = zVar.f8264b;
        if (i11 >= 0) {
            if (i11 <= bArr.length - i10) {
                if (i11 == 0) {
                    zVar.f8266d = b5.f8311v;
                    return i10;
                }
                zVar.f8266d = b5.z(i10, bArr, i11);
                return i10 + i11;
            }
            throw zzkp.d();
        }
        throw zzkp.b();
    }

    public static int b(byte[] bArr, int i6) {
        return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
    }

    public static int c(g7 g7Var, byte[] bArr, int i6, int i10, int i11, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        w5 d10 = g7Var.d();
        int m10 = m(d10, g7Var, bArr, i6, i10, i11, zVar);
        g7Var.a(d10);
        zVar.f8266d = d10;
        return m10;
    }

    public static int d(g7 g7Var, int i6, byte[] bArr, int i10, int i11, b6 b6Var, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        w5 d10 = g7Var.d();
        int n10 = n(d10, g7Var, bArr, i10, i11, zVar);
        g7Var.a(d10);
        zVar.f8266d = d10;
        b6Var.add(d10);
        while (n10 < i11) {
            int i12 = i(bArr, n10, zVar);
            if (i6 != zVar.f8264b) {
                break;
            }
            w5 d11 = g7Var.d();
            int n11 = n(d11, g7Var, bArr, i12, i11, zVar);
            g7Var.a(d11);
            zVar.f8266d = d11;
            b6Var.add(d11);
            n10 = n11;
        }
        return n10;
    }

    public static int e(byte[] bArr, int i6, b6 b6Var, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        x5 x5Var = (x5) b6Var;
        int i10 = i(bArr, i6, zVar);
        int i11 = zVar.f8264b + i10;
        while (i10 < i11) {
            i10 = i(bArr, i10, zVar);
            x5Var.g(zVar.f8264b);
        }
        if (i10 == i11) {
            return i10;
        }
        throw zzkp.d();
    }

    public static int f(byte[] bArr, int i6, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        int i10 = i(bArr, i6, zVar);
        int i11 = zVar.f8264b;
        if (i11 >= 0) {
            if (i11 == 0) {
                zVar.f8266d = "";
                return i10;
            }
            zVar.f8266d = new String(bArr, i10, i11, c6.f8318a);
            return i10 + i11;
        }
        throw zzkp.b();
    }

    public static int g(byte[] bArr, int i6, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = i(bArr, i6, zVar);
        int i11 = zVar.f8264b;
        if (i11 >= 0) {
            if (i11 == 0) {
                zVar.f8266d = "";
                return i10;
            }
            a8 a8Var = c8.f8320a;
            int length = bArr.length;
            if ((i10 | i11 | ((length - i10) - i11)) >= 0) {
                int i12 = i10 + i11;
                char[] cArr = new char[i11];
                int i13 = 0;
                while (i10 < i12) {
                    byte b10 = bArr[i10];
                    if (b10 >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        break;
                    }
                    i10++;
                    cArr[i13] = (char) b10;
                    i13++;
                }
                while (i10 < i12) {
                    int i14 = i10 + 1;
                    byte b11 = bArr[i10];
                    if (b11 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int i15 = i13 + 1;
                        cArr[i13] = (char) b11;
                        i10 = i14;
                        while (true) {
                            i13 = i15;
                            if (i10 >= i12) {
                                break;
                            }
                            byte b12 = bArr[i10];
                            if (b12 >= 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                break;
                            }
                            i10++;
                            i15 = i13 + 1;
                            cArr[i13] = (char) b12;
                        }
                    } else if (b11 < -32) {
                        if (i14 < i12) {
                            int i16 = i14 + 1;
                            int i17 = i13 + 1;
                            byte b13 = bArr[i14];
                            if (b11 >= -62 && !sp.b.q0(b13)) {
                                cArr[i13] = (char) (((b11 & 31) << 6) | (b13 & 63));
                                i10 = i16;
                                i13 = i17;
                            } else {
                                throw zzkp.a();
                            }
                        } else {
                            throw zzkp.a();
                        }
                    } else if (b11 < -16) {
                        if (i14 < i12 - 1) {
                            int i18 = i14 + 1;
                            int i19 = i18 + 1;
                            int i20 = i13 + 1;
                            byte b14 = bArr[i14];
                            byte b15 = bArr[i18];
                            if (!sp.b.q0(b14)) {
                                if (b11 == -32) {
                                    if (b14 >= -96) {
                                        b11 = -32;
                                    }
                                }
                                if (b11 == -19) {
                                    if (b14 < -96) {
                                        b11 = -19;
                                    }
                                }
                                if (!sp.b.q0(b15)) {
                                    cArr[i13] = (char) (((b11 & 15) << 12) | ((b14 & 63) << 6) | (b15 & 63));
                                    i10 = i19;
                                    i13 = i20;
                                }
                            }
                            throw zzkp.a();
                        }
                        throw zzkp.a();
                    } else if (i14 < i12 - 2) {
                        int i21 = i14 + 1;
                        int i22 = i21 + 1;
                        int i23 = i22 + 1;
                        byte b16 = bArr[i14];
                        byte b17 = bArr[i21];
                        byte b18 = bArr[i22];
                        if (!sp.b.q0(b16) && (((b16 + 112) + (b11 << 28)) >> 30) == 0 && !sp.b.q0(b17) && !sp.b.q0(b18)) {
                            int i24 = ((b11 & 7) << 18) | ((b16 & 63) << 12) | ((b17 & 63) << 6) | (b18 & 63);
                            cArr[i13] = (char) ((i24 >>> 10) + 55232);
                            cArr[i13 + 1] = (char) ((i24 & 1023) + 56320);
                            i13 += 2;
                            i10 = i23;
                        } else {
                            throw zzkp.a();
                        }
                    } else {
                        throw zzkp.a();
                    }
                }
                zVar.f8266d = new String(cArr, 0, i13);
                return i12;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        throw zzkp.b();
    }

    public static int h(int i6, byte[] bArr, int i10, int i11, s7 s7Var, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        if ((i6 >>> 3) != 0) {
            int i12 = i6 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                s7Var.c(i6, Integer.valueOf(b(bArr, i10)));
                                return i10 + 4;
                            }
                            throw new zzkp("Protocol message contained an invalid tag (zero).");
                        }
                        int i13 = (i6 & (-8)) | 4;
                        s7 b10 = s7.b();
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
                            s7Var.c(i6, b10);
                            return i10;
                        }
                        throw zzkp.c();
                    }
                    int i17 = i(bArr, i10, zVar);
                    int i18 = zVar.f8264b;
                    if (i18 >= 0) {
                        if (i18 <= bArr.length - i17) {
                            if (i18 == 0) {
                                s7Var.c(i6, b5.f8311v);
                            } else {
                                s7Var.c(i6, b5.z(i17, bArr, i18));
                            }
                            return i17 + i18;
                        }
                        throw zzkp.d();
                    }
                    throw zzkp.b();
                }
                s7Var.c(i6, Long.valueOf(o(bArr, i10)));
                return i10 + 8;
            }
            int l2 = l(bArr, i10, zVar);
            s7Var.c(i6, Long.valueOf(zVar.f8265c));
            return l2;
        }
        throw new zzkp("Protocol message contained an invalid tag (zero).");
    }

    public static int i(byte[] bArr, int i6, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        int i10 = i6 + 1;
        byte b10 = bArr[i6];
        if (b10 >= 0) {
            zVar.f8264b = b10;
            return i10;
        }
        return j(b10, bArr, i10, zVar);
    }

    public static int j(int i6, byte[] bArr, int i10, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
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

    public static int k(int i6, byte[] bArr, int i10, int i11, b6 b6Var, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        x5 x5Var = (x5) b6Var;
        int i12 = i(bArr, i10, zVar);
        x5Var.g(zVar.f8264b);
        while (i12 < i11) {
            int i13 = i(bArr, i12, zVar);
            if (i6 != zVar.f8264b) {
                break;
            }
            i12 = i(bArr, i13, zVar);
            x5Var.g(zVar.f8264b);
        }
        return i12;
    }

    public static int l(byte[] bArr, int i6, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
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

    public static int m(Object obj, g7 g7Var, byte[] bArr, int i6, int i10, int i11, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        int D = ((y6) g7Var).D(obj, bArr, i6, i10, i11, zVar);
        zVar.f8266d = obj;
        return D;
    }

    public static int n(Object obj, g7 g7Var, byte[] bArr, int i6, int i10, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        int i11 = i6 + 1;
        int i12 = bArr[i6];
        if (i12 < 0) {
            i11 = j(i12, bArr, i11, zVar);
            i12 = zVar.f8264b;
        }
        int i13 = i11;
        if (i12 >= 0 && i12 <= i10 - i13) {
            int i14 = i12 + i13;
            g7Var.h(obj, bArr, i13, i14, zVar);
            zVar.f8266d = obj;
            return i14;
        }
        throw zzkp.d();
    }

    public static long o(byte[] bArr, int i6) {
        return ((bArr[i6 + 7] & 255) << 56) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
    }
}
