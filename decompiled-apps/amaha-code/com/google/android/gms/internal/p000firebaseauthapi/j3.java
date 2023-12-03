package com.google.android.gms.internal.p000firebaseauthapi;

import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j3  reason: invalid package */
/* loaded from: classes.dex */
public final class j3 {

    /* renamed from: a  reason: collision with root package name */
    public static final h3 f7911a;

    static {
        if (f3.f7842e && f3.f7841d) {
            int i6 = y.f8247a;
        }
        f7911a = new h3();
    }

    public static /* bridge */ /* synthetic */ int a(int i6, byte[] bArr, int i10) {
        byte b10 = bArr[i6 - 1];
        int i11 = i10 - i6;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    byte b11 = bArr[i6];
                    byte b12 = bArr[i6 + 1];
                    if (b10 <= -12 && b11 <= -65 && b12 <= -65) {
                        return ((b11 << 8) ^ b10) ^ (b12 << 16);
                    }
                } else {
                    throw new AssertionError();
                }
            } else {
                byte b13 = bArr[i6];
                if (b10 <= -12 && b13 <= -65) {
                    return b10 ^ (b13 << 8);
                }
            }
        } else if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(CharSequence charSequence, byte[] bArr, int i6, int i10) {
        int i11;
        int i12;
        int i13;
        char charAt;
        int length = charSequence.length();
        int i14 = i10 + i6;
        int i15 = 0;
        while (i15 < length && (i13 = i15 + i6) < i14 && (charAt = charSequence.charAt(i15)) < 128) {
            bArr[i13] = (byte) charAt;
            i15++;
        }
        int i16 = i6 + i15;
        while (i15 < length) {
            char charAt2 = charSequence.charAt(i15);
            if (charAt2 < 128 && i16 < i14) {
                i11 = i16 + 1;
                bArr[i16] = (byte) charAt2;
            } else {
                if (charAt2 < 2048 && i16 <= i14 - 2) {
                    int i17 = i16 + 1;
                    bArr[i16] = (byte) ((charAt2 >>> 6) | 960);
                    i16 = i17 + 1;
                    bArr[i17] = (byte) ((charAt2 & '?') | 128);
                } else if ((charAt2 < 55296 || charAt2 > 57343) && i16 <= i14 - 3) {
                    int i18 = i16 + 1;
                    bArr[i16] = (byte) ((charAt2 >>> '\f') | 480);
                    int i19 = i18 + 1;
                    bArr[i18] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i11 = i19 + 1;
                    bArr[i19] = (byte) ((charAt2 & '?') | 128);
                } else if (i16 <= i14 - 4) {
                    int i20 = i15 + 1;
                    if (i20 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i20);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i21 = i16 + 1;
                            bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                            int i22 = i21 + 1;
                            bArr[i21] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i23 = i22 + 1;
                            bArr[i22] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i16 = i23 + 1;
                            bArr[i23] = (byte) ((codePoint & 63) | 128);
                            i15 = i20;
                        } else {
                            i15 = i20;
                        }
                    }
                    throw new i3(i15 - 1, length);
                } else if (charAt2 >= 55296 && charAt2 <= 57343 && ((i12 = i15 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                    throw new i3(i15, length);
                } else {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i16);
                }
                i15++;
            }
            i16 = i11;
            i15++;
        }
        return i16;
    }

    public static int c(CharSequence charSequence) {
        int length = charSequence.length();
        int i6 = 0;
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = charSequence.length();
                while (i10 < length2) {
                    char charAt2 = charSequence.charAt(i10);
                    if (charAt2 < 2048) {
                        i6 += (127 - charAt2) >>> 31;
                    } else {
                        i6 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i10) >= 65536) {
                                i10++;
                            } else {
                                throw new i3(i10, length2);
                            }
                        }
                    }
                    i10++;
                }
                i11 += i6;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    public static String d(int i6, byte[] bArr, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        int length = bArr.length;
        if ((i6 | i10 | ((length - i6) - i10)) >= 0) {
            int i11 = i6 + i10;
            char[] cArr = new char[i10];
            int i12 = 0;
            while (i6 < i11) {
                byte b10 = bArr[i6];
                if (b10 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    break;
                }
                i6++;
                cArr[i12] = (char) b10;
                i12++;
            }
            while (i6 < i11) {
                int i13 = i6 + 1;
                byte b11 = bArr[i6];
                if (b11 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int i14 = i12 + 1;
                    cArr[i12] = (char) b11;
                    i6 = i13;
                    while (true) {
                        i12 = i14;
                        if (i6 >= i11) {
                            break;
                        }
                        byte b12 = bArr[i6];
                        if (b12 >= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            break;
                        }
                        i6++;
                        i14 = i12 + 1;
                        cArr[i12] = (char) b12;
                    }
                } else if (b11 < -32) {
                    if (i13 < i11) {
                        int i15 = i13 + 1;
                        int i16 = i12 + 1;
                        byte b13 = bArr[i13];
                        if (b11 >= -62 && !r.T(b13)) {
                            cArr[i12] = (char) (((b11 & 31) << 6) | (b13 & 63));
                            i6 = i15;
                            i12 = i16;
                        } else {
                            throw zzadn.b();
                        }
                    } else {
                        throw zzadn.b();
                    }
                } else if (b11 < -16) {
                    if (i13 < i11 - 1) {
                        int i17 = i13 + 1;
                        int i18 = i17 + 1;
                        int i19 = i12 + 1;
                        byte b14 = bArr[i13];
                        byte b15 = bArr[i17];
                        if (!r.T(b14)) {
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
                            if (!r.T(b15)) {
                                cArr[i12] = (char) (((b11 & 15) << 12) | ((b14 & 63) << 6) | (b15 & 63));
                                i6 = i18;
                                i12 = i19;
                            }
                        }
                        throw zzadn.b();
                    }
                    throw zzadn.b();
                } else if (i13 < i11 - 2) {
                    int i20 = i13 + 1;
                    int i21 = i20 + 1;
                    int i22 = i21 + 1;
                    byte b16 = bArr[i13];
                    byte b17 = bArr[i20];
                    byte b18 = bArr[i21];
                    if (!r.T(b16) && (((b16 + 112) + (b11 << 28)) >> 30) == 0 && !r.T(b17) && !r.T(b18)) {
                        int i23 = ((b11 & 7) << 18) | ((b16 & 63) << 12) | ((b17 & 63) << 6) | (b18 & 63);
                        cArr[i12] = (char) ((i23 >>> 10) + 55232);
                        cArr[i12 + 1] = (char) ((i23 & 1023) + 56320);
                        i12 += 2;
                        i6 = i22;
                    } else {
                        throw zzadn.b();
                    }
                } else {
                    throw zzadn.b();
                }
            }
            return new String(cArr, 0, i12);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i6), Integer.valueOf(i10)));
    }

    public static boolean e(int i6, byte[] bArr, int i10) {
        f7911a.getClass();
        return g3.a(i6, bArr, i10);
    }
}
