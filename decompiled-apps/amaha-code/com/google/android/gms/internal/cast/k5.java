package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class k5 {

    /* renamed from: a */
    public static final tr.r f7572a;

    static {
        if (i5.f7559e && i5.f7558d) {
            int i6 = i2.f7554a;
        }
        f7572a = new tr.r();
    }

    public static int a(CharSequence charSequence) {
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
                                throw new j5(i10, length2);
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
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i11 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0100, code lost:
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
                    throw new j5(i15 - 1, length);
                } else if (charAt2 >= 55296 && charAt2 <= 57343 && ((i12 = i15 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                    throw new j5(i15, length);
                } else {
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Failed writing ");
                    sb2.append(charAt2);
                    sb2.append(" at index ");
                    sb2.append(i16);
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
                i15++;
            }
            i16 = i11;
            i15++;
        }
        return i16;
    }

    public static /* synthetic */ int c(int i6, byte[] bArr, int i10) {
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
}
